(ns alexa-to-aurora.utils

  (:require [clojure.java.io :as io]
            [clojure.string :as str]
            [clojure.core.async :as a]
            [datomic.api :as d]

            [clojurewerkz.elastisch.rest :as esr]
            [clojurewerkz.elastisch.rest.index :as esi]
            [clj-time.core :as t]
            [clj-time.local :as lt]

            [alexa-to-aurora.config]
            [alexa-to-aurora.elastic-search-mappings :as esm]
            )
  )

;;---- log --------------

;;(def log-file-path (atom ""))

(def log-file-path "c:\\tmp\\alexa-to-aurora-log.txt")
(def log-time-stamp (atom (t/now)))

(defn open-log
  ([path] (open-log path true))
  ([path append?]
   (spit log-file-path (str \newline "Begin: " path \newline \return) :append append?)
   )
  )

(defn elapsed []
  (t/in-seconds (t/interval @log-time-stamp (t/now)))
  )

(defn format-text [txt]
  (str \newline \return (elapsed) " secs " txt)
  )

(defn log
  [& txt]
  (let [t (format-text txt)]
    (try
      (spit log-file-path t :append true)
      (catch Exception e (println "Exception:" (.getMessage e)))))
    )
(defn logpr
  [& txt]
  (log txt)
  (println (format-text txt))
  )


;;-- Source data

(defn read-data [cfg prefix table]
  (let [filename (str (:data-folder cfg) "\\" prefix "-" table ".clj")]
    (if (.exists (io/as-file filename))
      (do
        (read-string (slurp filename))
        )
      (do
        ;;(log "no file: " filename)
        []
        ))
    ))

(defn read-data-ex [cfg prefix table]
  (let [filename (str (:data-folder cfg) "\\" prefix "-" table ".clj")]
    (if (.exists (io/as-file filename))
      (do
        { :table table :data (read-string (slurp filename))}
        )
      (do
        ;;(log "no file: " filename)
        { :table table :data [] }
        ))
    ))

(defn remove-nils
  "remove columns with nil values and id column from row data map"
  [row]
  (into {}(filter #(not(nil? (second %))) row)))

(defn remove-idcol
  "remove columns with nil values and id column from row data map"
  [row]
  (into {}(filter #(not(or (nil? (second %)) (= :Id (first %)))) row)))

(defn list-tables-from-selects
  [selects]
  (map #(str/replace % #":et-" "") (keys selects)))



;;---- Datomic ----

(defn db-conn
  [cfg]
  (d/connect (:datomic-uri cfg)))

(defn get-entity-types
  [cfg]
  (d/q '[:find ?n
         :where
         [?e :alexa.entity-type ?t]
         [?t :db/ident ?n]] (d/db (db-conn cfg))))

(defn parseName
  [raw]
  (str/replace (first raw) ":et-" "" ))

(defn table-names
  []
  (let [entity-types (get-entity-types)]
    (map parseName entity-types)))

(defn to-et
  "construct entity-type string from table name"
  [table]
  (keyword(str "et-" table)))

(defn to-field
  "construct column ident from table/column"
  [table field]
  (keyword(str table '/ field)))

(defn transact-batch
  "Submit txes in batches of size batch-size, default is 100"
  ([conn txes] (transact-batch conn txes 100))
  ([conn txes batch-size]
   (doseq [batch (partition-all batch-size txes)]
     @(d/transact-async conn batch))
   :ok))


(defn transact-pipeline-push-handler
  "push fact batch transactions onto the tx-chan until done, then close the channel"
  [conn tx-chan batches submit-count]

  (let [okay (atom true)
        ]
    (doseq [batch batches
            ]
      (when @okay
        (swap! submit-count inc)
        ;;(logpr "put: " @submit-count)

        (a/>!! tx-chan {:future (d/transact-async conn batch)
                        :data batch
                        })
        )))
  (a/close! tx-chan)
  ;;(logpr "end put " @submit-count " batches")
  )


(defn transact-pipeline-take-handler
  "pull transactions from tx-chan and deref. retry on exception"
  [conn tx-chan max-retries take-count]

  (let [tx-results (atom [])
        ]
    (loop [entry (a/<!! tx-chan)
           ]
      (when (not (nil? entry))
        ;;(logpr "take: " @take-count)
        (try
          (swap! tx-results conj {:future @(:future entry)})
          (swap! take-count inc)

          (catch Exception e
            ;; append retry information
            (swap! tx-results conj {:error (.getMessage e)})
            (logpr "Take Error: " (.getMessage e) (pr-str entry))

            ;; retry the transaction
            (let [succeeded (atom false)
                  batch (:data entry)
                  ]
              (loop [retry 0]
                (try
                  ;; try it again
                  (swap! tx-results conj {:future @(d/transact-async conn batch)})
                  (reset! succeeded true)

                  (catch Exception e
                    (logpr "Exception(retry) " (.getMessage e))
                    ;; failed again
                    (when (>= retry max-retries)
                      ;; retries exhausted
                      ;; add error information to results
                      (swap! tx-results conj {:entry entry
                                              :error (.getMessage e)})
                      )))

                (when (not @succeeded)
                  (if (>= retry max-retries)
                    ;; close the channel to shut things down
                    (a/close! tx-chan)
                    ;; keep trying
                    (recur (inc retry))
                    ))
                )
              )
            )
          )
        (recur (a/<!! tx-chan))
        )
      )
    ;;(logpr "end take " @take-count " batches")
    @tx-results
    )
  )

;; change to return channel with results
;; return both successful and failed batches
;; let caller determine transaction ids if wanted.
;; keep retry channel - only put if retry channel is empty
;; if it fails, rollback changes

(defn transact-pipeline-async
  "Submit txes in batches of size batch-size.  Returns results of all transactions."
  ([conn txes] (transact-pipeline-async conn txes 100 10 10))
  ([conn txes batch-size chan-count max-retries]

   ;;(logpr "start pipeline-async ")

   (let [batches (partition-all batch-size txes)
         tx-chan (a/chan chan-count)
         submit-count (atom 0)
         deref-count (atom 0)
         ]
     ;;(log "transact-pipeline: " (pr-str(first txes)))

     ;; Puts
     (a/thread
      (transact-pipeline-push-handler conn tx-chan batches submit-count)
      )

     ;; Takes
     (a/thread
      (transact-pipeline-take-handler conn tx-chan max-retries deref-count))
     ))
  )

(defn get-transaction-ids[results]
  nil
  )


(defn transact-pipeline-sync
  "Submit txes in batches of size batch-size
  pipeline channel has N elements
  and will retry N times before giving up"
  ([conn txes] (transact-pipeline-sync conn txes 100 10 10))
  ([conn txes batch-size chan-count max-retries]

   ;;(logpr "start pipeline-sync ")

   (when (not (empty? txes))
     (let [tx-chan (transact-pipeline-async conn txes batch-size chan-count max-retries)
           results (a/<!! tx-chan)
           ]
       ;;(logpr "Done: "(type results))
       )
     )
   )
  )


;;--- Elastic Search -------------

(defn open-elastic-search
  [cfg delete-index?]
  (let [index (:es-index-name cfg)
        es-conn (esr/connect (:es-uri cfg))
        ]
    (when delete-index?
      (esi/delete es-conn index)
      )
    (when (not (esi/exists? es-conn index))
      (let [mappings esm/elastic-search-mappings
            ]
        (esi/create es-conn index :mappings mappings)
        )
      )
    es-conn)
  )


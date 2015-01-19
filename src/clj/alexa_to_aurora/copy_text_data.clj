(ns alexa-to-aurora.copy-text-data

  (:require [clojure.java.io :as io]
            [clojure.string :as str]

            [datomic.api :as d]

            [clojurewerkz.elastisch.rest :as esr]
            [clojurewerkz.elastisch.rest.index :as esi]
            [clojurewerkz.elastisch.rest.document :as esd]
            [clojurewerkz.elastisch.query         :as esq]
            [clojurewerkz.elastisch.rest.response :as esrsp]
            [clojurewerkz.elastisch.rest.bulk :as esb]

            [alexa-to-aurora.utils :refer :all]
            [alexa-to-aurora.sql-select-text-fields :as sstf]
            )
  )

;; each row is { :Id <sqlid> :field1 <text> :field2 <text> }
;; want to insert each text item into ES and end up with:
;; [[:db/add :<table>Id <sqlId> :ElasticSearch/Key <esid>]]
;; which can be handed to transact-batch

(defn insert-text-into-es
  "Insert specified text into ES. Returns the ES id or throws
  exception on error."
  [es-conn index table text]

  ;;(println "insert-text: " index " " table " " text)
  (let [esresult (esd/create es-conn index table text)
        ]
    (if (:created esresult)
      ;; insert succeeded
      (:_id esresult)
      ;; insert failed
      (throw (Exception. (pr-str esresult)))
      )
    )
  )

(defn insert-row-into-es
  [cfg es-conn table row]
  (let [sqlid (:Id row)
        index (:es-index-name cfg)
        esid (insert-text-into-es es-conn index table (remove-idcol row))
        ]
    [sqlid esid]
    )
  )


(defn create-tx
  [table idpair]
  (let [eid [(keyword table "Id") (first idpair)]
        tx [:db/add eid :ElasticSearch/Key (second idpair)]
        ]
    tx
    )
  )

(defn insert-text-data
  [cfg table rows]
  (let [idpairs (map (fn [row] (insert-row-into-es cfg table row)) rows)
        txes (map (fn [idpair] (create-tx table idpair)) idpairs)
        ]
    (transact-pipeline-sync (db-conn cfg) txes))
  )

(defn bulk-insert-text-data
  "insert text data for all rows in table at once"
  [cfg es-conn table raw-rows]

  (let [rows (map #(remove-idcol %) raw-rows)
        operations (esb/bulk-index rows)
        index (:es-index-name cfg)
        response (esb/bulk-with-index-and-type es-conn index table operations)

        ;; get the es ids from the bulk response
        esids (map #(get-in % [:create :_id]) (:items response))

        ;; get the sql ids of the records in db to which the es ids should be linked
        sqlids (map #(:Id %) raw-rows)

        ;; make pairs of es-sql ids
        idpairs (map #(vector %1 %2) sqlids esids)

        ;; make transactions with the sql id as a lookup ref
        txes (map (fn [idpair] (create-tx table idpair)) idpairs)

        esid-count (count esids)
        sqlid-count (count sqlids)
        ]
;;    (println idpairs)
    (if (= esid-count sqlid-count)
      ;;TRUE count agrees - create facts
      (transact-pipeline-sync (db-conn cfg) txes)
      ;;FALSE count does not agree - could use better error reporting here.
      (throw (Exception. (str "Not all documents inserted into ES: es=" esid-count " sql=" sqlid-count))
             )
      )
    )
  )

(defn copy-text-data
  "for each table select all rows and insert into Elastic Search"
  [cfg]
  (open-log "copy-text-log.txt")

  (let [selects sstf/sql-select-text-fields
        es-conn (open-elastic-search cfg true)
        tables (list-tables-from-selects selects)
        ]
    (doseq [table tables
            ]
      (log "Copying: " table)
      (let [rawrows (read-data cfg "text-fields" table)
            rows (map #(remove-nils %) rawrows)
            ]
        (when (not (empty? rows))
          (bulk-insert-text-data cfg es-conn table rows))
        )
      )
    )
  )

(comment
  (copy-text-data (alexa-to-aurora.config/build-config-map))
  )

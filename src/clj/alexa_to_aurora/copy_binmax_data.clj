(ns alexa-to-aurora.copy-binmax-data

  (:require [clojure.java.io :as io]
            [clojure.string :as str]
            [datomic.api :as d]

            [clojurewerkz.elastisch.rest :as esr]
            [clojurewerkz.elastisch.rest.index :as esi]
            [clojurewerkz.elastisch.rest.document :as esd]
            [clojurewerkz.elastisch.query         :as esq]
            [clojurewerkz.elastisch.rest.response :as esrsp]

            [alexa-to-aurora.utils :refer :all]
            [alexa-to-aurora.sql-select-binmax-data :as sbd]
            )
  )

(defn process-content [cfg field]
  "The content field has the filename containing the binary data"
  (let [filename (str (:data-folder cfg) "\\" (:filename field))]
    ;;(println "read bin: " filename)
    (slurp filename)
  ))


(defn format-columns
  [cfg row]
  (into {}
        (map
         (fn [[k v]]
           [k (if (= k :Content) (process-content cfg v) v)])
         row
         )))

;; //[:db/add [:table/Id rowId] :ES/Key elastic-search-id]]
(defn set-search-key
  [cfg table sqlid esid]
  (let [eid (vector (keyword table "Id") sqlid)
        tx (vector :db/add eid :ElasticSearch/Key esid)
        txes  (vector tx)]
    @(d/transact (db-conn cfg) txes))
  )

(defn create-and-link-es-doc
  "Create doc in ES and link to DB entity"
  [cfg es-conn table rows]
  (doseq [row rows]
    (let [sqlid (:Id row)
          data (remove-idcol(format-columns cfg row))]
      ;;(log "writing: " data)
      (let [index (:es-index-name cfg)
            esresult (esd/create es-conn index table data)]
        (if (:created esresult)
          (set-search-key cfg table sqlid (:_id esresult))
          (log "Failed to create document: " table " / " row)
          )
        ))))


(defn copy-binmax-data
  "for each table select all rows and insert into Elastic Search"
  [cfg]
  (open-log "copy-binmax-log.txt")

  (let [selects sbd/sql-select-binmax-data
        tables (list-tables-from-selects selects)
        es-conn (open-elastic-search cfg false)
        ]
    (doseq [table tables]
      (log table)
      (let [rawrows (read-data cfg "binmax-data" table)
            rows (map #(remove-nils %) rawrows)
            ]
        (when (not (empty? rows))
          (create-and-link-es-doc cfg es-conn table rows))
        ))))

(comment
  (copy-binmax-data (alexa-to-aurora.config/build-config-map))
  )



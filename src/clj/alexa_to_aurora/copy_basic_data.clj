(ns alexa-to-aurora.copy-basic-data

  (:require [clojure.java.io :as io]
            [clojure.string :as str]
            [clojure.core.async :as a]
            [clojure.pprint :as pp]
            [datomic.api :as d]
            [clj-time.local :as lt]
            [alexa-to-aurora.utils :refer :all]
            [alexa-to-aurora.sql-select-basic-data :as sbd]
            [alexa-to-aurora.config :as cfg]
            ))

(defn format-columns
  "row has [column value] - we need {:table/column value} also need to remove all null values, which are simply omitted in datomic"
  [table row]
  (into {}
        (map (fn [[k v]] [(keyword (str table '/ (name k))) v])
             (remove-nils row)
             )))

(defn format-row
  "add the temp id and entity-type to each row's data"
  [row table]
  (let [tableId (to-et table)]
    (when (= table "DataFile") (log ">: " row))
    (into (format-columns table (eval row))
          {:db/id (d/tempid :db.part/user) :alexa.entity-type tableId}
          )))

(defn format-table-data [table-data]
  (let [table (:table table-data)
        rowData (:data table-data)
        ]
    (map #(format-row % table) rowData))
  )

(defn copy-basic-data
  "for each table select all rows and insert into Datomic"
  [cfg]
  (open-log "copy-basic-data-log.txt")
  (let [
        selects sbd/sql-select-basic-data
        tables (list-tables-from-selects selects)

        ;; ( {:table table :data [ <file contents> ]})
        tables-data (map #(read-data-ex cfg "basic-data" %) tables)

        all-txes (mapcat #(format-table-data %)
                         (filter #(not (empty? (:data %))) tables-data))

        conn (db-conn cfg)
        ]
    (transact-pipeline-sync conn all-txes)
    )
  )



(comment
  (open-log "copy-basic-data-log.txt" true)
  (println "txids: "(copy-basic-data (cfg/build-config-map)))

  )

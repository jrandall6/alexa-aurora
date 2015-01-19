(ns alexa-to-aurora.copy-fk-refs

  (:require [clojure.java.io :as io]
            [clojure.string :as str]

            [datomic.api :as d]

            [alexa-to-aurora.utils :refer :all]
            [alexa-to-aurora.sql-select-foreign-keys :as ssfk]
            [alexa-to-aurora.foreign-key-ref-args-by-table :as fkra]
            ))

(defn build-tx
  "Build a transaction to create fk ref fact"
  [row table ref-col fktbl fkcol]
  ;; //[db:add [:table/Id (:Id row)] :table/refcol [:fktable/Id (:fkcol row)]]
  (let [fkId ((keyword fkcol) row)]
    (if (not (nil? fkId))
      [ :db/add
        ;; lookup ref of left id
        [ (keyword (str table "/Id")) (:Id row) ]
        (keyword ref-col)
        ;; lookup ref of right id
        [ (keyword (str fktbl "/Id")) fkId ]
        ]
      []
      )
    )
  )

(defn build-row-txes
  "Build txes for single row - may be multiple FKs in row"
  [row table table-join-args]
   (map #(apply build-tx row table %) table-join-args)
  )

(defn format-table-data [table-data join-args]
  (let [table (:table table-data)
        raw-row-data (:data table-data)
        table-join-args ((to-et table) join-args)
        row-data (mapv #(into {} (filter (fn [[k v]] (not (nil? v))) %)) raw-row-data)
        ]
    (mapcat #(build-row-txes % table table-join-args) row-data)
    )
  )

(defn copy-fk-refs
  [cfg]
  (open-log "copy-fk-refs-log.txt")
  (let [selects ssfk/sql-select-foreign-keys
        tables (list-tables-from-selects selects)
        join-args fkra/foreign-key-ref-args-by-table
        ]
    (when (not (empty? tables))
      (let [
            tables-data (map #(read-data-ex cfg "foreign-keys" %) tables)
            ]
        (when (not (empty? tables-data))
          (let
            [
             all-txes (mapcat #(format-table-data % join-args)
                              (filter #(not (empty? (:data %))) tables-data))
             ]
            (transact-pipeline-sync (db-conn cfg) all-txes)
            )
          )
        )
      )
    )
  )

(comment
  (open-log "copy-basic-data-log.txt" true)
  (copy-fk-refs (alexa-to-aurora.config/build-config-map))
  )


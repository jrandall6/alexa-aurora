(ns alexa-to-aurora.copy-join-refs

  (:require [clojure.java.io :as io]
            [clojure.string :as str]

            [datomic.api :as d]

            [alexa-to-aurora.utils :refer :all]
            [alexa-to-aurora.sql-select-join-tables :as ssjt]
            [alexa-to-aurora.join-table-ref-args-by-table :as jtra]
            ))

(defn build-tx
  "Build a transaction to create join ref fact"
  [row t1 fk1 jt fk2 t2]
  ;; //[db:add [:table/Id (:Id row)] :table/refcol [:fktable/Id (:fkcol row)]]
  (let [fk1v ((keyword fk1) row)
        fk2v ((keyword fk2) row)]
    (if (and (not(nil? fk1v)) (not(nil? fk2v)))
      (vector :db/add
              (vector (keyword (str t1 "/Id")) fk1v)
              (keyword (str t1 '/ t2))
              (vector (keyword (str t2 "/Id")) fk2v))
      nil
      )))


(defn build-row-txes
  "Build txes for single row - may be multiple FKs in row"
  [table-join-args row]
  (map #(apply build-tx row %) table-join-args)
  )

(defn copy-join-refs
  [cfg]
  (open-log "copy-join-refs-log.txt")
  (let
    [conn (db-conn cfg)
     selects ssjt/sql-select-join-tables
     join-args jtra/join-table-ref-args-by-table]
    (doseq
      [table (list-tables-from-selects selects)]
      (log table)
      (doseq
        [joinTable (map #(nth % 2) ((to-et table) join-args))]
        (let
          [rows (read-data cfg "join-tables" joinTable)
           table-join-args ((to-et table) join-args)]
          (if (not (or (empty? table-join-args) (empty? rows)))
            (let
              [row-txes (mapcat #(build-row-txes table-join-args %) rows)
               table-txes (filter #(not(nil? %)) row-txes)]
              (transact-pipeline-sync conn table-txes))
            ))))))

;;(copy-join-refs (alexa-to-aurora.config/build-config-map))

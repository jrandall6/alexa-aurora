(ns alexa-to-aurora.create-schema

  (:require [clojure.java.io :as io]
            [datomic.api :as d]
            [clojure.core.async :as a]
            [clojure.string :as str]
            [alexa-to-aurora.utils :refer :all]
            [alexa-to-aurora.schema :as sch]
            [alexa-to-aurora.entity-type-attrs :as eta]
            ))

(defn add-es-key
  [conn]
  ;; add Elastic Search key field
  (let [attr [{:db/id (d/tempid :db.part/db)
               :db/ident :ElasticSearch/Key
               :db/valueType :db.type/string
               :db/cardinality :db.cardinality/one
               :db/doc "Key from Elastic Search create"
               :db.install/_attribute :db.part/db}]]
    @(d/transact conn attr)))

(defn create-schema [cfg]
  (open-log "create-schema-log.txt")
  (let [uri (:datomic-uri cfg)
        ]
    (when (empty? uri) (throw (Exception. "Datomic uri is required.")))
    (log "deleting db" uri)
    (d/delete-database uri)

    (log "creating db" uri)
    (d/create-database uri)

    (let [conn (d/connect uri)
          entity-type-tx (read-string eta/entity-type-attrs)
          ]
      (log "create entity-types")
      @(d/transact conn entity-type-tx)

      (log "creating schema")
      (let [txes (mapcat #(read-string %) sch/schema)
            ]
        ;;(println txes)
        (transact-pipeline-sync conn txes)
        )

      (log "create ES key attribute")
      (add-es-key conn)
      )
    (d/connect uri))
  )

(comment
  (create-schema (alexa-to-aurora.config/build-config-map))
  )

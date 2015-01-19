(ns alexa-to-aurora.core

  (:require
   [clojure.java.io :as io]
   [clojure.string :as str]
   [datomic.api :as d]

   [alexa-to-aurora.config :as config]
   [alexa-to-aurora.utils :refer :all]
   [alexa-to-aurora.create-schema :as cre]
   [alexa-to-aurora.copy-basic-data :as cbd]
   [alexa-to-aurora.copy-text-data :as ctd]
   [alexa-to-aurora.copy-binmax-data :as cmx]
   [alexa-to-aurora.copy-fk-refs :as cfk]
   [alexa-to-aurora.copy-join-refs :as cjn]
   [alexa-to-aurora.copy-joinref-refs :as cjr]
   )
  (:gen-class)
  )


(defn lower-case? [s]
  (= s (str/lower-case s)))

(defn validate
  "validate the args and that the services are running"
  [progress cfg]
  (let [es-index (:es-index-name cfg)
        dat-uri (:datomic-uri cfg)]
    (if (not (lower-case? es-index))
      (throw (Exception. "ES index name must be lower case")))

    ;; validate datomic connection
    (progress "Open Datomic DB: " dat-uri)
    (d/create-database dat-uri)

    ;; validate elastic search connection
    (progress "Open Elastic Search: " (:es-uri cfg) " " es-index)
    (open-elastic-search cfg false)

    ""
    )
  )

(defn convert-db [progress & args]
  (let
    [cfg (into (config/build-config-map) args)]
    (try
      (validate progress cfg)
      (progress "Start convert-db: " cfg)
      (progress "create schema")
      (cre/create-schema cfg)

      (progress "copy basic data")
      (cbd/copy-basic-data cfg)

      (progress "copy text data")
      (ctd/copy-text-data cfg)
      (progress "copy binmax data")
      (cmx/copy-binmax-data cfg)

      (progress "copy fk refs")
      (cfk/copy-fk-refs cfg)
      (progress "copy join refs")
      (cjn/copy-join-refs cfg)
      (progress "copy joinref refs")
      (cjr/copy-joinref-refs cfg)

      (progress "Done.")
      (System/exit 0)
      (catch Exception e (progress "Failed: "(.getMessage e))))
    ))

(defn -main [& args]
  (if args
    (convert-db logpr (config/build-config-map (first args)))
    (convert-db logpr)
    )
  )


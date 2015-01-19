(ns alexa-to-aurora.config
  (:require
            [clojure.string :as str])
  )

;;these values should be shown to the user
;; as configuration parameters
(defn build-config-map
  ([] (build-config-map "small"))
  ([dbname]
   {
    :datomic-uri (str "datomic:dev://localhost:4334/" dbname)

    :data-folder (str "c:\\tmp\\data\\" dbname)

    :es-uri "http://localhost:9200"
    :es-index-name (str/lower-case dbname)
    }
   )
  )


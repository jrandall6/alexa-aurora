(defproject alexa-to-aurora "0.1.0-SNAPSHOT"

  :description "Create Aurora Datomic DB from Alexa SQL DB"

  :url "http://www.allgress.com"

  :license {:name "Allgress EULA"
            :url "http://www.allgress.com"}

  :jvm-opts ^:replace ["-Xmx4g" "-server" "-d64"]

;;bin/transactor -XX:+UseG1GC -XX:MaxGCPauseMillis=50 dev.properties

;;  :java-opts ^:replace ["-server" "-Xmx2g" "-Xms2g"
;;                        #_"-Ddatomic.objectCacheMax=256m"
;;                        #_"-Ddatomic.memcachedServers=localhost:11211"]


  :dependencies [
                 [clj-time "0.7.0"]

                 [org.apache.httpcomponents/httpclient "4.3.3"]
                 [clojurewerkz/elastisch "2.0.0-rc1" ]

                 [org.clojure/clojure "1.6.0"]
                 [org.clojure/core.async "0.1.301.0-deb34a-alpha"]

                 [org.elasticsearch/elasticsearch "1.1.1"]
                 [com.datomic/datomic-pro "0.9.4755"]

                 [org.clojure/core.async "0.1.267.0-0d7780-alpha"]
                 ]

  :source-paths ["src/clj"]

  :main alexa-to-aurora.core

  :profiles {:uberjar
             {:aot [
                    alexa-to-aurora.elastic-search-mappings
                    alexa-to-aurora.entity-type-attrs
                    alexa-to-aurora.foreign-key-ref-args-by-table
                    alexa-to-aurora.join-table-ref-args-by-table
                    alexa-to-aurora.schema
                    alexa-to-aurora.schema-add-id-index
                    alexa-to-aurora.schema-add-id-unique
                    alexa-to-aurora.sql-select-basic-data
                    alexa-to-aurora.sql-select-binmax-data
                    alexa-to-aurora.sql-select-foreign-keys
                    alexa-to-aurora.sql-select-join-tables
                    alexa-to-aurora.sql-select-joinref-tables
                    alexa-to-aurora.sql-select-text-fields
                    alexa-to-aurora.config
                    alexa-to-aurora.copy-basic-data
                    alexa-to-aurora.copy-binmax-data
                    alexa-to-aurora.copy-fk-refs
                    alexa-to-aurora.copy-join-refs
                    alexa-to-aurora.copy-joinref-refs
                    alexa-to-aurora.copy-text-data
                    alexa-to-aurora.core
                    alexa-to-aurora.create-schema
                    alexa-to-aurora.utils
                    ]}}

  :jar-name "alexa-to-aurora.jar"
  :uberjar-name "alexa-to-aurora-uber.jar"
  )

(ns alexa-to-aurora.restore-attachment

  (:require [clojure.java.io :as io]
            [clojure.string :as str]
            [datomic.api :as d]
            [alexa-to-aurora.config :refer :all]
            [alexa-to-aurora.utils :refer :all]
            [clojurewerkz.elastisch.rest :as esr]
            [clojurewerkz.elastisch.rest.index :as esi]
            [clojurewerkz.elastisch.rest.document :as esd]
            [clojurewerkz.elastisch.query         :as esq]
            [clojurewerkz.elastisch.rest.response :as esrsp]
            )
  (:import (java.io FileWriter))
  )

(comment
(open-log "restore-attachment.txt")

(defn write-file
  [filename data]
   (with-open [w (clojure.java.io/output-stream filename)]
     (.write w data)))

(defn restore-by-id
  [esid cfg]
  (let [data (:_source(esd/get (:es-index-name cfg) "DataFile" esid))
        decode (b64/decode (.getBytes(:Content data)))
        filename (str "c:\\tmp\\"(:Filename data))
        ]
    (log data)
    (write-file filename decode)
    ))


  (keys(restore-by-id "6BFoqN1cQtmS1nTrxZj6vQ" cfg))

  )

(ns alexa-to-aurora.sql-select-binmax-data
  (:require [datomic.api :as d])
 )

(def sql-select-binmax-data
{
:et-DataFile "(korma.core/select 'DataFile (korma.core/fields :Content :Id :Filename :Extension :Length))"
})

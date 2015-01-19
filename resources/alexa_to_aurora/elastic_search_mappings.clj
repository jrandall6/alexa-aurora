(ns alexa-to-aurora.elastic-search-mappings
  (:require [datomic.api :as d])
 )

(def elastic-search-mappings
{
  :Analysis { :properties {
   :Description { :type "string" :analyzer "snowball"}
   :Name { :type "string" :store "yes"}
}}
  :Asset { :properties {
   :Description { :type "string" :analyzer "snowball"}
   :DomainName { :type "string"}
   :ExternalKey { :type "string"}
   :Hostname { :type "string"}
   :MAC_Address { :type "string"}
   :NetBIOSName { :type "string"}
   :Url { :type "string"}
}}
  :AssetGroup { :properties {
   :Description { :type "string" :analyzer "snowball"}
   :Name { :type "string" :store "yes"}
}}
  :AssetVulnerabilityAddendum { :properties {
   :Text { :type "string" :analyzer "snowball"}
   :Title { :type "string" :store "yes"}
}}
  :Incident { :properties {
   :Description { :type "string" :analyzer "snowball"}
   :Name { :type "string" :store "yes"}
   :ReportedBy { :type "string"}
}}
  :IncidentFieldData { :properties {
   :Data { :type "string" :analyzer "snowball"}
}}
  :Note { :properties {
   :Body { :type "string" :analyzer "snowball"}
   :Subject { :type "string" :analyzer "snowball"}
}}
  :PolicySectionText { :properties {
   :Comments { :type "string" :analyzer "snowball"}
   :Text { :type "string" :analyzer "snowball"}
}}
  :Project { :properties {
   :Description { :type "string" :analyzer "snowball"}
   :Name { :type "string" :store "yes"}
}}
  :StandardComponent { :properties {
   :Description { :type "string" :analyzer "snowball"}
   :Name { :type "string" :store "yes"}
   :Number { :type "string" :analyzer "snowball"}
   :Objectives { :type "string" :analyzer "snowball"}
   :Procedures { :type "string" :analyzer "snowball"}
   :References { :type "string" :analyzer "snowball"}
   :Remediation { :type "string" :analyzer "snowball"}
   :UCFControlNumber { :type "string"}
}}
  :Task { :properties {
   :AssignTo { :type "string"}
   :Description { :type "string" :analyzer "snowball"}
   :Name { :type "string" :store "yes"}
   :Objectives { :type "string" :analyzer "snowball"}
   :Procedures { :type "string" :analyzer "snowball"}
   :References { :type "string" :analyzer "snowball"}
   :SentTo { :type "string"}
}}
  :TaskResult { :properties {
   :Comments { :type "string" :analyzer "snowball"}
   :CompensatingControls { :type "string" :analyzer "snowball"}
}}
  :TaskResultEffort { :properties {
   :Comments { :type "string" :analyzer "snowball"}
}}
  :TaskResultExpense { :properties {
   :Comments { :type "string" :analyzer "snowball"}
}}
  :TaskResultOutcome { :properties {
   :Comments { :type "string" :analyzer "snowball"}
   :CompensatingControls { :type "string" :analyzer "snowball"}
}}
  :TaskResultOutcomeApproval { :properties {
   :Comments { :type "string" :analyzer "snowball"}
}}
  :Vulnerability { :properties {
   :Compliance { :type "string" :analyzer "snowball"}
   :Consequence { :type "string" :analyzer "snowball"}
   :Description { :type "string" :analyzer "snowball"}
   :Diagnosis { :type "string" :analyzer "snowball"}
   :Information { :type "string" :analyzer "snowball"}
   :Name { :type "string" :store "yes"}
   :Solution { :type "string" :analyzer "snowball"}
   :UCFControlNumber { :type "string"}
   :UserComments { :type "string" :analyzer "snowball"}
}}
  :DataFile { :properties {
   :Content { :type "attachment"}
   :Extension { :type "string"}
   :Filename { :type "string"}
}}
})

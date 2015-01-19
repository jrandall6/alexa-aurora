(ns alexa-to-aurora.sql-select-joinref-tables
  (:require [datomic.api :as d])
 )

(def sql-select-joinref-tables
{
:et-AssetVulnerabilityReference "(korma.core/select 'AssetVulnerabilityReference (korma.core/join Reference (= :Reference.Id :ReferenceId)) (korma.core/fields :AssetVulnerabilityReference.AssetVulnerabilityId :Reference.DataFileId))"
:et-EventHistoryReference "(korma.core/select 'EventHistoryReference (korma.core/join Reference (= :Reference.Id :ReferenceId)) (korma.core/fields :EventHistoryReference.EventHistoryId :Reference.DataFileId))"
:et-ExplanationReference "(korma.core/select 'ExplanationReference (korma.core/join Reference (= :Reference.Id :ReferenceId)) (korma.core/fields :ExplanationReference.ExplanationId :Reference.DataFileId))"
:et-IncidentReference "(korma.core/select 'IncidentReference (korma.core/join Reference (= :Reference.Id :ReferenceId)) (korma.core/fields :IncidentReference.IncidentId :Reference.DataFileId))"
:et-ProcedureReference "(korma.core/select 'ProcedureReference (korma.core/join Reference (= :Reference.Id :ReferenceId)) (korma.core/fields :ProcedureReference.ProcedureId :Reference.DataFileId))"
:et-ProjectReference "(korma.core/select 'ProjectReference (korma.core/join Reference (= :Reference.Id :ReferenceId)) (korma.core/fields :ProjectReference.ProjectId :Reference.DataFileId))"
:et-StandardComponentReference "(korma.core/select 'StandardComponentReference (korma.core/join Reference (= :Reference.Id :ReferenceId)) (korma.core/fields :StandardComponentReference.StandardComponentId :Reference.DataFileId))"
:et-TaskPerformanceReference "(korma.core/select 'TaskPerformanceReference (korma.core/join Reference (= :Reference.Id :ReferenceId)) (korma.core/fields :TaskPerformanceReference.TaskPerformanceId :Reference.DataFileId))"
:et-TaskResultOutcomeApprovalReference "(korma.core/select 'TaskResultOutcomeApprovalReference (korma.core/join Reference (= :Reference.Id :ReferenceId)) (korma.core/fields :TaskResultOutcomeApprovalReference.TaskResultOutcomeApprovalId :Reference.DataFileId))"
:et-TaskResultOutcomeReference "(korma.core/select 'TaskResultOutcomeReference (korma.core/join Reference (= :Reference.Id :ReferenceId)) (korma.core/fields :TaskResultOutcomeReference.TaskResultOutcomeId :Reference.DataFileId))"
:et-TaskResultReference "(korma.core/select 'TaskResultReference (korma.core/join Reference (= :Reference.Id :ReferenceId)) (korma.core/fields :TaskResultReference.TaskResultId :Reference.DataFileId))"
})

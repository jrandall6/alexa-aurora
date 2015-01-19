(ns alexa-to-aurora.sql-select-text-fields
  (:require [datomic.api :as d])
 )

(def sql-select-text-fields
{
:et-Analysis "(korma.core/select 'Analysis (korma.core/fields :Description :Id :Name))"
:et-Asset "(korma.core/select 'Asset (korma.core/fields :Description :DomainName :ExternalKey :Hostname :Id :KeyField :MAC_Address :NetBIOSName :Url))"
:et-AssetGroup "(korma.core/select 'AssetGroup (korma.core/fields :Description :ExternalKey :Id :Name))"
:et-AssetVulnerabilityAddendum "(korma.core/select 'AssetVulnerabilityAddendum (korma.core/fields :Id :Text :Title))"
:et-Incident "(korma.core/select 'Incident (korma.core/fields :Description :Id :Name :NotifyEmail :ReportedBy))"
:et-IncidentFieldData "(korma.core/select 'IncidentFieldData (korma.core/fields :Data :Id))"
:et-Note "(korma.core/select 'Note (korma.core/fields :Body :Format :Id :Subject :Type))"
:et-PolicySectionText "(korma.core/select 'PolicySectionText (korma.core/fields :Comments :Id :Text))"
:et-Project "(korma.core/select 'Project (korma.core/fields :Description :Id :Name :SortKey))"
:et-StandardComponent "(korma.core/select 'StandardComponent (korma.core/fields :Abbreviation :AltKey :Description :Id :Name :Number :Objectives :Procedures :References :Remediation :SortKey :UCFControlNumber :Version))"
:et-Task "(korma.core/select 'Task (korma.core/fields :AssignTo :Description :ExternalKey :Id :Name :Objectives :Procedures :References :Response :SentTo :SortKey))"
:et-TaskResult "(korma.core/select 'TaskResult (korma.core/fields :Comments :CompensatingControls :Id))"
:et-TaskResultEffort "(korma.core/select 'TaskResultEffort (korma.core/fields :Comments :Id))"
:et-TaskResultExpense "(korma.core/select 'TaskResultExpense (korma.core/fields :Comments :Id))"
:et-TaskResultOutcome "(korma.core/select 'TaskResultOutcome (korma.core/fields :Comments :CompensatingControls :Id))"
:et-TaskResultOutcomeApproval "(korma.core/select 'TaskResultOutcomeApproval (korma.core/fields :Comments :Id))"
:et-Vulnerability "(korma.core/select 'Vulnerability (korma.core/fields :Compliance :Consequence :Description :Diagnosis :Id :Information :Name :Solution :UCFControlNumber :UserComments))"
})

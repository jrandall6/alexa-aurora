(ns alexa-to-aurora.entity-type-attrs
  (:require [datomic.api :as d])
 )

(def entity-type-attrs
"[{:db/id #db/id[:db.part/db]
:db/ident :alexa.entity-type
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"AlexaDB ETable value\"
:db.install/_attribute :db.part/db}

{:db/id #db/id[:db.part/db]
:db/ident :et-Address}

{:db/id #db/id[:db.part/db]
:db/ident :et-Address_History}

{:db/id #db/id[:db.part/db]
:db/ident :et-Analysis}

{:db/id #db/id[:db.part/db]
:db/ident :et-AnalysisAnalysis}

{:db/id #db/id[:db.part/db]
:db/ident :et-AnalysisAssetLikelihood}

{:db/id #db/id[:db.part/db]
:db/ident :et-AnalysisAssetVulnSeverity}

{:db/id #db/id[:db.part/db]
:db/ident :et-AnalysisBasis}

{:db/id #db/id[:db.part/db]
:db/ident :et-AnalysisComponentScore}

{:db/id #db/id[:db.part/db]
:db/ident :et-AnalysisExpense}

{:db/id #db/id[:db.part/db]
:db/ident :et-AnalysisMethod}

{:db/id #db/id[:db.part/db]
:db/ident :et-AnalysisType}

{:db/id #db/id[:db.part/db]
:db/ident :et-ApprovalStatus}

{:db/id #db/id[:db.part/db]
:db/ident :et-Asset}

{:db/id #db/id[:db.part/db]
:db/ident :et-Asset_History}

{:db/id #db/id[:db.part/db]
:db/ident :et-AssetExposure}

{:db/id #db/id[:db.part/db]
:db/ident :et-AssetExposureMitigationStatus}

{:db/id #db/id[:db.part/db]
:db/ident :et-AssetFilter}

{:db/id #db/id[:db.part/db]
:db/ident :et-AssetGroup}

{:db/id #db/id[:db.part/db]
:db/ident :et-AssetGroupBusinessMetric}

{:db/id #db/id[:db.part/db]
:db/ident :et-AssetGroupType}

{:db/id #db/id[:db.part/db]
:db/ident :et-AssetImpact}

{:db/id #db/id[:db.part/db]
:db/ident :et-AssetClass}

{:db/id #db/id[:db.part/db]
:db/ident :et-AssetType}

{:db/id #db/id[:db.part/db]
:db/ident :et-AssetVulnerability}

{:db/id #db/id[:db.part/db]
:db/ident :et-AssetVulnerabilityAddendum}

{:db/id #db/id[:db.part/db]
:db/ident :et-AssetVulnerabilityMitigationStatus}

{:db/id #db/id[:db.part/db]
:db/ident :et-AssetVulnerabilityTechnicalScan}

{:db/id #db/id[:db.part/db]
:db/ident :et-Attribute}

{:db/id #db/id[:db.part/db]
:db/ident :et-AttributeValue}

{:db/id #db/id[:db.part/db]
:db/ident :et-AttributeValueScope}

{:db/id #db/id[:db.part/db]
:db/ident :et-AttributeValueType}

{:db/id #db/id[:db.part/db]
:db/ident :et-AuditPlan}

{:db/id #db/id[:db.part/db]
:db/ident :et-BusinessMetric}

{:db/id #db/id[:db.part/db]
:db/ident :et-BusinessUnit}

{:db/id #db/id[:db.part/db]
:db/ident :et-BusinessUnitBusinessMetric}

{:db/id #db/id[:db.part/db]
:db/ident :et-BusinessUnitBusinessUnit}

{:db/id #db/id[:db.part/db]
:db/ident :et-BusinessUnitRelationshipType}

{:db/id #db/id[:db.part/db]
:db/ident :et-ContentType}

{:db/id #db/id[:db.part/db]
:db/ident :et-Country}

{:db/id #db/id[:db.part/db]
:db/ident :et-Currency}

{:db/id #db/id[:db.part/db]
:db/ident :et-CurrencyExchange}

{:db/id #db/id[:db.part/db]
:db/ident :et-DataClass}

{:db/id #db/id[:db.part/db]
:db/ident :et-DataFile}

{:db/id #db/id[:db.part/db]
:db/ident :et-DataFinding}

{:db/id #db/id[:db.part/db]
:db/ident :et-DataFindingAddendum}

{:db/id #db/id[:db.part/db]
:db/ident :et-DataFindingRule}

{:db/id #db/id[:db.part/db]
:db/ident :et-DataFindingMitigationStatus}

{:db/id #db/id[:db.part/db]
:db/ident :et-DataFindingSourceType}

{:db/id #db/id[:db.part/db]
:db/ident :et-DataFindingTechnicalScan}

{:db/id #db/id[:db.part/db]
:db/ident :et-DataLocation}

{:db/id #db/id[:db.part/db]
:db/ident :et-DataLocationType}

{:db/id #db/id[:db.part/db]
:db/ident :et-DataType}

{:db/id #db/id[:db.part/db]
:db/ident :et-DetectionStatus}

{:db/id #db/id[:db.part/db]
:db/ident :et-DetectionType}

{:db/id #db/id[:db.part/db]
:db/ident :et-EffortCategory}

{:db/id #db/id[:db.part/db]
:db/ident :et-EntityType}

{:db/id #db/id[:db.part/db]
:db/ident :et-EventHistory}

{:db/id #db/id[:db.part/db]
:db/ident :et-EventModule}

{:db/id #db/id[:db.part/db]
:db/ident :et-EventType}

{:db/id #db/id[:db.part/db]
:db/ident :et-ExpenseCategory}

{:db/id #db/id[:db.part/db]
:db/ident :et-Explanation}

{:db/id #db/id[:db.part/db]
:db/ident :et-ExplanationCategory}

{:db/id #db/id[:db.part/db]
:db/ident :et-Exposure}

{:db/id #db/id[:db.part/db]
:db/ident :et-ExposureCategory}

{:db/id #db/id[:db.part/db]
:db/ident :et-GlobalSettings}

{:db/id #db/id[:db.part/db]
:db/ident :et-Impact}

{:db/id #db/id[:db.part/db]
:db/ident :et-ImpactType}

{:db/id #db/id[:db.part/db]
:db/ident :et-ImportData}

{:db/id #db/id[:db.part/db]
:db/ident :et-ImporterSettings}

{:db/id #db/id[:db.part/db]
:db/ident :et-Incident}

{:db/id #db/id[:db.part/db]
:db/ident :et-IncidentField}

{:db/id #db/id[:db.part/db]
:db/ident :et-IncidentFieldData}

{:db/id #db/id[:db.part/db]
:db/ident :et-IncidentImpact}

{:db/id #db/id[:db.part/db]
:db/ident :et-IncidentIncidentStatus}

{:db/id #db/id[:db.part/db]
:db/ident :et-IncidentObject}

{:db/id #db/id[:db.part/db]
:db/ident :et-IncidentStatus}

{:db/id #db/id[:db.part/db]
:db/ident :et-IncidentTask}

{:db/id #db/id[:db.part/db]
:db/ident :et-IncidentType}

{:db/id #db/id[:db.part/db]
:db/ident :et-Job}

{:db/id #db/id[:db.part/db]
:db/ident :et-JobRun}

{:db/id #db/id[:db.part/db]
:db/ident :et-LDAPAction}

{:db/id #db/id[:db.part/db]
:db/ident :et-LDAPConfig}

{:db/id #db/id[:db.part/db]
:db/ident :et-LDAPType}

{:db/id #db/id[:db.part/db]
:db/ident :et-Likelihood}

{:db/id #db/id[:db.part/db]
:db/ident :et-Manufacturer}

{:db/id #db/id[:db.part/db]
:db/ident :et-MitigationStatus}

{:db/id #db/id[:db.part/db]
:db/ident :et-Network}

{:db/id #db/id[:db.part/db]
:db/ident :et-Note}

{:db/id #db/id[:db.part/db]
:db/ident :et-Notification}

{:db/id #db/id[:db.part/db]
:db/ident :et-NotificationRule}

{:db/id #db/id[:db.part/db]
:db/ident :et-NotificationRuleSet}

{:db/id #db/id[:db.part/db]
:db/ident :et-NotificationType}

{:db/id #db/id[:db.part/db]
:db/ident :et-OperatingSystem}

{:db/id #db/id[:db.part/db]
:db/ident :et-OperatingSystemType}

{:db/id #db/id[:db.part/db]
:db/ident :et-Outcome}

{:db/id #db/id[:db.part/db]
:db/ident :et-Person}

{:db/id #db/id[:db.part/db]
:db/ident :et-Person_History}

{:db/id #db/id[:db.part/db]
:db/ident :et-PersonLDAPEvent}

{:db/id #db/id[:db.part/db]
:db/ident :et-PersonPasswordHistory}

{:db/id #db/id[:db.part/db]
:db/ident :et-PersonPerson}

{:db/id #db/id[:db.part/db]
:db/ident :et-PersonRelationshipType}

{:db/id #db/id[:db.part/db]
:db/ident :et-Performer}

{:db/id #db/id[:db.part/db]
:db/ident :et-PhysicalAsset}

{:db/id #db/id[:db.part/db]
:db/ident :et-Policy}

{:db/id #db/id[:db.part/db]
:db/ident :et-PolicyAcceptance}

{:db/id #db/id[:db.part/db]
:db/ident :et-PolicyExceptionRequest}

{:db/id #db/id[:db.part/db]
:db/ident :et-PolicyExceptionRequestStatus}

{:db/id #db/id[:db.part/db]
:db/ident :et-PolicyPublishEvent}

{:db/id #db/id[:db.part/db]
:db/ident :et-PolicyReference}

{:db/id #db/id[:db.part/db]
:db/ident :et-PolicySection}

{:db/id #db/id[:db.part/db]
:db/ident :et-PolicySectionPolicySection}

{:db/id #db/id[:db.part/db]
:db/ident :et-PolicySectionReference}

{:db/id #db/id[:db.part/db]
:db/ident :et-PolicySectionRole}

{:db/id #db/id[:db.part/db]
:db/ident :et-PolicySectionStandardComponent}

{:db/id #db/id[:db.part/db]
:db/ident :et-PolicySectionText}

{:db/id #db/id[:db.part/db]
:db/ident :et-PolicyStandardComponent}

{:db/id #db/id[:db.part/db]
:db/ident :et-PolicyStatus}

{:db/id #db/id[:db.part/db]
:db/ident :et-PolicyTask}

{:db/id #db/id[:db.part/db]
:db/ident :et-PolicyTaskEvent}

{:db/id #db/id[:db.part/db]
:db/ident :et-PolicyTaskOutcome}

{:db/id #db/id[:db.part/db]
:db/ident :et-PolicyTaskStatus}

{:db/id #db/id[:db.part/db]
:db/ident :et-PolicyTaskType}

{:db/id #db/id[:db.part/db]
:db/ident :et-PolicyTemplate}

{:db/id #db/id[:db.part/db]
:db/ident :et-PolicyType}

{:db/id #db/id[:db.part/db]
:db/ident :et-Priority}

{:db/id #db/id[:db.part/db]
:db/ident :et-Procedure}

{:db/id #db/id[:db.part/db]
:db/ident :et-Project}

{:db/id #db/id[:db.part/db]
:db/ident :et-ProjectNotification}

{:db/id #db/id[:db.part/db]
:db/ident :et-ProjectType}

{:db/id #db/id[:db.part/db]
:db/ident :et-Protocol}

{:db/id #db/id[:db.part/db]
:db/ident :et-Recurrence}

{:db/id #db/id[:db.part/db]
:db/ident :et-Reference}

{:db/id #db/id[:db.part/db]
:db/ident :et-ReferenceType}

{:db/id #db/id[:db.part/db]
:db/ident :et-Report}

{:db/id #db/id[:db.part/db]
:db/ident :et-ReportConfig}

{:db/id #db/id[:db.part/db]
:db/ident :et-ResourceCost}

{:db/id #db/id[:db.part/db]
:db/ident :et-RiskLevel}

{:db/id #db/id[:db.part/db]
:db/ident :et-Role}

{:db/id #db/id[:db.part/db]
:db/ident :et-RoleModule}

{:db/id #db/id[:db.part/db]
:db/ident :et-Service}

{:db/id #db/id[:db.part/db]
:db/ident :et-Severity}

{:db/id #db/id[:db.part/db]
:db/ident :et-Software}

{:db/id #db/id[:db.part/db]
:db/ident :et-StandardComponent}

{:db/id #db/id[:db.part/db]
:db/ident :et-StandardComponentCoverageLink}

{:db/id #db/id[:db.part/db]
:db/ident :et-StandardComponentTask}

{:db/id #db/id[:db.part/db]
:db/ident :et-StandardComponentVendorProduct}

{:db/id #db/id[:db.part/db]
:db/ident :et-StandardComponentVulnerability}

{:db/id #db/id[:db.part/db]
:db/ident :et-StandardComponentWeight}

{:db/id #db/id[:db.part/db]
:db/ident :et-Standard}

{:db/id #db/id[:db.part/db]
:db/ident :et-Subnet}

{:db/id #db/id[:db.part/db]
:db/ident :et-SubnetExposure}

{:db/id #db/id[:db.part/db]
:db/ident :et-Survey}

{:db/id #db/id[:db.part/db]
:db/ident :et-SurveySection}

{:db/id #db/id[:db.part/db]
:db/ident :et-SurveySectionChoice}

{:db/id #db/id[:db.part/db]
:db/ident :et-Task}

{:db/id #db/id[:db.part/db]
:db/ident :et-TaskPerformance}

{:db/id #db/id[:db.part/db]
:db/ident :et-TaskPerformanceEvent}

{:db/id #db/id[:db.part/db]
:db/ident :et-TaskPerformancePerformer}

{:db/id #db/id[:db.part/db]
:db/ident :et-TaskPerformanceNote}

{:db/id #db/id[:db.part/db]
:db/ident :et-TaskPerformanceNotification}

{:db/id #db/id[:db.part/db]
:db/ident :et-TaskPerformanceObject}

{:db/id #db/id[:db.part/db]
:db/ident :et-TaskPerformanceStatus}

{:db/id #db/id[:db.part/db]
:db/ident :et-TaskResult}

{:db/id #db/id[:db.part/db]
:db/ident :et-TaskResultEffort}

{:db/id #db/id[:db.part/db]
:db/ident :et-TaskResultExpense}

{:db/id #db/id[:db.part/db]
:db/ident :et-TaskResultLineage}

{:db/id #db/id[:db.part/db]
:db/ident :et-TaskResultObject}

{:db/id #db/id[:db.part/db]
:db/ident :et-TaskResultOutcome}

{:db/id #db/id[:db.part/db]
:db/ident :et-TaskResultOutcomeApproval}

{:db/id #db/id[:db.part/db]
:db/ident :et-TaskResultOutcomeNotification}

{:db/id #db/id[:db.part/db]
:db/ident :et-TaskResultScore}

{:db/id #db/id[:db.part/db]
:db/ident :et-TaskResultScoreSet}

{:db/id #db/id[:db.part/db]
:db/ident :et-TaskResultStatus}

{:db/id #db/id[:db.part/db]
:db/ident :et-TaskResultType}

{:db/id #db/id[:db.part/db]
:db/ident :et-TaskType}

{:db/id #db/id[:db.part/db]
:db/ident :et-TechnicalScan}

{:db/id #db/id[:db.part/db]
:db/ident :et-TechnicalScanType}

{:db/id #db/id[:db.part/db]
:db/ident :et-TimeZone}

{:db/id #db/id[:db.part/db]
:db/ident :et-Vendor}

{:db/id #db/id[:db.part/db]
:db/ident :et-VendorProduct}

{:db/id #db/id[:db.part/db]
:db/ident :et-Vulnerability}

{:db/id #db/id[:db.part/db]
:db/ident :et-Vulnerability_History}

{:db/id #db/id[:db.part/db]
:db/ident :et-VulnerabilityReference}

{:db/id #db/id[:db.part/db]
:db/ident :et-VulnerabilityRule}

{:db/id #db/id[:db.part/db]
:db/ident :et-VulnerabilityRuleSet}

{:db/id #db/id[:db.part/db]
:db/ident :et-VulnerabilityType}
]")

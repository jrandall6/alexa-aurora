(ns alexa-to-aurora.schema-add-id-unique
 )

(def schema-add-id-unique
[
"[{:db/ident :Address/Id
 :db/unique :db.unique/identity
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :Address_History/Id
 :db/unique :db.unique/identity
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :Analysis/Id
 :db/unique :db.unique/identity
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :AnalysisAnalysis/Id
 :db/unique :db.unique/identity
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :AnalysisAssetLikelihood/Id
 :db/unique :db.unique/identity
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :AnalysisAssetVulnSeverity/Id
 :db/unique :db.unique/identity
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :AnalysisBasis/Id
 :db/unique :db.unique/identity
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :AnalysisComponentScore/Id
 :db/unique :db.unique/identity
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :AnalysisExpense/Id
 :db/unique :db.unique/identity
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :AnalysisMethod/Id
 :db/unique :db.unique/identity
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :AnalysisType/Id
 :db/unique :db.unique/identity
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :ApprovalStatus/Id
 :db/unique :db.unique/identity
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :Asset/Id
 :db/unique :db.unique/identity
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :Asset_History/Id
 :db/unique :db.unique/identity
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :AssetExposure/Id
 :db/unique :db.unique/identity
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :AssetExposureMitigationStatus/Id
 :db/unique :db.unique/identity
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :AssetFilter/Id
 :db/unique :db.unique/identity
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :AssetGroup/Id
 :db/unique :db.unique/identity
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :AssetGroupBusinessMetric/Id
 :db/unique :db.unique/identity
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :AssetGroupType/Id
 :db/unique :db.unique/identity
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :AssetImpact/Id
 :db/unique :db.unique/identity
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :AssetClass/Id
 :db/unique :db.unique/identity
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :AssetType/Id
 :db/unique :db.unique/identity
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :AssetVulnerability/Id
 :db/unique :db.unique/identity
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :AssetVulnerabilityAddendum/Id
 :db/unique :db.unique/identity
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :AssetVulnerabilityMitigationStatus/Id
 :db/unique :db.unique/identity
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :AssetVulnerabilityTechnicalScan/Id
 :db/unique :db.unique/identity
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :Attribute/Id
 :db/unique :db.unique/identity
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :AttributeValue/Id
 :db/unique :db.unique/identity
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :AttributeValueScope/Id
 :db/unique :db.unique/identity
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :AttributeValueType/Id
 :db/unique :db.unique/identity
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :AuditPlan/Id
 :db/unique :db.unique/identity
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :BusinessMetric/Id
 :db/unique :db.unique/identity
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :BusinessUnit/Id
 :db/unique :db.unique/identity
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :BusinessUnitBusinessMetric/Id
 :db/unique :db.unique/identity
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :BusinessUnitBusinessUnit/Id
 :db/unique :db.unique/identity
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :BusinessUnitRelationshipType/Id
 :db/unique :db.unique/identity
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :ContentType/Id
 :db/unique :db.unique/identity
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :Country/Id
 :db/unique :db.unique/identity
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :Currency/Id
 :db/unique :db.unique/identity
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :CurrencyExchange/Id
 :db/unique :db.unique/identity
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :DataClass/Id
 :db/unique :db.unique/identity
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :DataFile/Id
 :db/unique :db.unique/identity
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :DataFinding/Id
 :db/unique :db.unique/identity
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :DataFindingAddendum/Id
 :db/unique :db.unique/identity
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :DataFindingRule/Id
 :db/unique :db.unique/identity
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :DataFindingMitigationStatus/Id
 :db/unique :db.unique/identity
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :DataFindingSourceType/Id
 :db/unique :db.unique/identity
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :DataFindingTechnicalScan/Id
 :db/unique :db.unique/identity
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :DataLocation/Id
 :db/unique :db.unique/identity
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :DataLocationType/Id
 :db/unique :db.unique/identity
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :DataType/Id
 :db/unique :db.unique/identity
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :DetectionStatus/Id
 :db/unique :db.unique/identity
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :DetectionType/Id
 :db/unique :db.unique/identity
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :EffortCategory/Id
 :db/unique :db.unique/identity
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :EntityType/Id
 :db/unique :db.unique/identity
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :EventHistory/Id
 :db/unique :db.unique/identity
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :EventModule/Id
 :db/unique :db.unique/identity
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :EventType/Id
 :db/unique :db.unique/identity
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :ExpenseCategory/Id
 :db/unique :db.unique/identity
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :Explanation/Id
 :db/unique :db.unique/identity
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :ExplanationCategory/Id
 :db/unique :db.unique/identity
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :Exposure/Id
 :db/unique :db.unique/identity
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :ExposureCategory/Id
 :db/unique :db.unique/identity
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :GlobalSettings/Id
 :db/unique :db.unique/identity
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :Impact/Id
 :db/unique :db.unique/identity
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :ImpactType/Id
 :db/unique :db.unique/identity
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :ImportData/Id
 :db/unique :db.unique/identity
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :ImporterSettings/Id
 :db/unique :db.unique/identity
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :Incident/Id
 :db/unique :db.unique/identity
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :IncidentField/Id
 :db/unique :db.unique/identity
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :IncidentFieldData/Id
 :db/unique :db.unique/identity
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :IncidentImpact/Id
 :db/unique :db.unique/identity
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :IncidentIncidentStatus/Id
 :db/unique :db.unique/identity
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :IncidentObject/Id
 :db/unique :db.unique/identity
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :IncidentStatus/Id
 :db/unique :db.unique/identity
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :IncidentTask/Id
 :db/unique :db.unique/identity
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :IncidentType/Id
 :db/unique :db.unique/identity
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :Job/Id
 :db/unique :db.unique/identity
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :JobRun/Id
 :db/unique :db.unique/identity
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :LDAPAction/Id
 :db/unique :db.unique/identity
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :LDAPConfig/Id
 :db/unique :db.unique/identity
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :LDAPType/Id
 :db/unique :db.unique/identity
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :Likelihood/Id
 :db/unique :db.unique/identity
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :Manufacturer/Id
 :db/unique :db.unique/identity
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :MitigationStatus/Id
 :db/unique :db.unique/identity
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :Network/Id
 :db/unique :db.unique/identity
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :Note/Id
 :db/unique :db.unique/identity
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :Notification/Id
 :db/unique :db.unique/identity
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :NotificationRule/Id
 :db/unique :db.unique/identity
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :NotificationRuleSet/Id
 :db/unique :db.unique/identity
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :NotificationType/Id
 :db/unique :db.unique/identity
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :OperatingSystem/Id
 :db/unique :db.unique/identity
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :OperatingSystemType/Id
 :db/unique :db.unique/identity
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :Outcome/Id
 :db/unique :db.unique/identity
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :Person/Id
 :db/unique :db.unique/identity
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :Person_History/Id
 :db/unique :db.unique/identity
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :PersonLDAPEvent/Id
 :db/unique :db.unique/identity
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :PersonPasswordHistory/Id
 :db/unique :db.unique/identity
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :PersonPerson/Id
 :db/unique :db.unique/identity
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :PersonRelationshipType/Id
 :db/unique :db.unique/identity
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :Performer/Id
 :db/unique :db.unique/identity
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :PhysicalAsset/Id
 :db/unique :db.unique/identity
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :Policy/Id
 :db/unique :db.unique/identity
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :PolicyAcceptance/Id
 :db/unique :db.unique/identity
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :PolicyExceptionRequest/Id
 :db/unique :db.unique/identity
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :PolicyExceptionRequestStatus/Id
 :db/unique :db.unique/identity
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :PolicyPublishEvent/Id
 :db/unique :db.unique/identity
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :PolicyReference/Id
 :db/unique :db.unique/identity
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :PolicySection/Id
 :db/unique :db.unique/identity
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :PolicySectionPolicySection/Id
 :db/unique :db.unique/identity
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :PolicySectionReference/Id
 :db/unique :db.unique/identity
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :PolicySectionRole/Id
 :db/unique :db.unique/identity
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :PolicySectionStandardComponent/Id
 :db/unique :db.unique/identity
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :PolicySectionText/Id
 :db/unique :db.unique/identity
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :PolicyStandardComponent/Id
 :db/unique :db.unique/identity
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :PolicyStatus/Id
 :db/unique :db.unique/identity
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :PolicyTask/Id
 :db/unique :db.unique/identity
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :PolicyTaskEvent/Id
 :db/unique :db.unique/identity
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :PolicyTaskOutcome/Id
 :db/unique :db.unique/identity
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :PolicyTaskStatus/Id
 :db/unique :db.unique/identity
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :PolicyTaskType/Id
 :db/unique :db.unique/identity
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :PolicyTemplate/Id
 :db/unique :db.unique/identity
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :PolicyType/Id
 :db/unique :db.unique/identity
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :Priority/Id
 :db/unique :db.unique/identity
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :Procedure/Id
 :db/unique :db.unique/identity
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :Project/Id
 :db/unique :db.unique/identity
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :ProjectNotification/Id
 :db/unique :db.unique/identity
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :ProjectType/Id
 :db/unique :db.unique/identity
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :Protocol/Id
 :db/unique :db.unique/identity
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :Recurrence/Id
 :db/unique :db.unique/identity
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :Reference/Id
 :db/unique :db.unique/identity
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :ReferenceType/Id
 :db/unique :db.unique/identity
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :Report/Id
 :db/unique :db.unique/identity
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :ReportConfig/Id
 :db/unique :db.unique/identity
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :ResourceCost/Id
 :db/unique :db.unique/identity
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :RiskLevel/Id
 :db/unique :db.unique/identity
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :Role/Id
 :db/unique :db.unique/identity
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :RoleModule/Id
 :db/unique :db.unique/identity
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :Service/Id
 :db/unique :db.unique/identity
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :Severity/Id
 :db/unique :db.unique/identity
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :Software/Id
 :db/unique :db.unique/identity
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :StandardComponent/Id
 :db/unique :db.unique/identity
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :StandardComponentCoverageLink/Id
 :db/unique :db.unique/identity
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :StandardComponentTask/Id
 :db/unique :db.unique/identity
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :StandardComponentVendorProduct/Id
 :db/unique :db.unique/identity
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :StandardComponentVulnerability/Id
 :db/unique :db.unique/identity
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :StandardComponentWeight/Id
 :db/unique :db.unique/identity
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :Standard/Id
 :db/unique :db.unique/identity
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :Subnet/Id
 :db/unique :db.unique/identity
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :SubnetExposure/Id
 :db/unique :db.unique/identity
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :Survey/Id
 :db/unique :db.unique/identity
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :SurveySection/Id
 :db/unique :db.unique/identity
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :SurveySectionChoice/Id
 :db/unique :db.unique/identity
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :Task/Id
 :db/unique :db.unique/identity
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :TaskPerformance/Id
 :db/unique :db.unique/identity
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :TaskPerformanceEvent/Id
 :db/unique :db.unique/identity
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :TaskPerformancePerformer/Id
 :db/unique :db.unique/identity
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :TaskPerformanceNote/Id
 :db/unique :db.unique/identity
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :TaskPerformanceNotification/Id
 :db/unique :db.unique/identity
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :TaskPerformanceObject/Id
 :db/unique :db.unique/identity
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :TaskPerformanceStatus/Id
 :db/unique :db.unique/identity
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :TaskResult/Id
 :db/unique :db.unique/identity
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :TaskResultEffort/Id
 :db/unique :db.unique/identity
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :TaskResultExpense/Id
 :db/unique :db.unique/identity
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :TaskResultLineage/Id
 :db/unique :db.unique/identity
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :TaskResultObject/Id
 :db/unique :db.unique/identity
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :TaskResultOutcome/Id
 :db/unique :db.unique/identity
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :TaskResultOutcomeApproval/Id
 :db/unique :db.unique/identity
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :TaskResultOutcomeNotification/Id
 :db/unique :db.unique/identity
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :TaskResultScore/Id
 :db/unique :db.unique/identity
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :TaskResultScoreSet/Id
 :db/unique :db.unique/identity
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :TaskResultStatus/Id
 :db/unique :db.unique/identity
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :TaskResultType/Id
 :db/unique :db.unique/identity
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :TaskType/Id
 :db/unique :db.unique/identity
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :TechnicalScan/Id
 :db/unique :db.unique/identity
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :TechnicalScanType/Id
 :db/unique :db.unique/identity
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :TimeZone/Id
 :db/unique :db.unique/identity
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :Vendor/Id
 :db/unique :db.unique/identity
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :VendorProduct/Id
 :db/unique :db.unique/identity
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :Vulnerability/Id
 :db/unique :db.unique/identity
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :Vulnerability_History/Id
 :db/unique :db.unique/identity
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :VulnerabilityReference/Id
 :db/unique :db.unique/identity
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :VulnerabilityRule/Id
 :db/unique :db.unique/identity
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :VulnerabilityRuleSet/Id
 :db/unique :db.unique/identity
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :VulnerabilityType/Id
 :db/unique :db.unique/identity
 :db.alter/_attribute :db.part/db}
]"
])

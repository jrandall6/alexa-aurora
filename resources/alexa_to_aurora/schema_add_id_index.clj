(ns alexa-to-aurora.schema-add-id-index
 )

(def schema-add-id-index
[
"[{:db/ident :Address/Id
 :db/index true
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :Address_History/Id
 :db/index true
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :Analysis/Id
 :db/index true
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :AnalysisAnalysis/Id
 :db/index true
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :AnalysisAssetLikelihood/Id
 :db/index true
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :AnalysisAssetVulnSeverity/Id
 :db/index true
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :AnalysisBasis/Id
 :db/index true
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :AnalysisComponentScore/Id
 :db/index true
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :AnalysisExpense/Id
 :db/index true
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :AnalysisMethod/Id
 :db/index true
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :AnalysisType/Id
 :db/index true
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :ApprovalStatus/Id
 :db/index true
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :Asset/Id
 :db/index true
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :Asset_History/Id
 :db/index true
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :AssetExposure/Id
 :db/index true
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :AssetExposureMitigationStatus/Id
 :db/index true
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :AssetFilter/Id
 :db/index true
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :AssetGroup/Id
 :db/index true
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :AssetGroupBusinessMetric/Id
 :db/index true
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :AssetGroupType/Id
 :db/index true
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :AssetImpact/Id
 :db/index true
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :AssetClass/Id
 :db/index true
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :AssetType/Id
 :db/index true
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :AssetVulnerability/Id
 :db/index true
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :AssetVulnerabilityAddendum/Id
 :db/index true
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :AssetVulnerabilityMitigationStatus/Id
 :db/index true
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :AssetVulnerabilityTechnicalScan/Id
 :db/index true
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :Attribute/Id
 :db/index true
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :AttributeValue/Id
 :db/index true
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :AttributeValueScope/Id
 :db/index true
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :AttributeValueType/Id
 :db/index true
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :AuditPlan/Id
 :db/index true
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :BusinessMetric/Id
 :db/index true
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :BusinessUnit/Id
 :db/index true
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :BusinessUnitBusinessMetric/Id
 :db/index true
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :BusinessUnitBusinessUnit/Id
 :db/index true
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :BusinessUnitRelationshipType/Id
 :db/index true
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :ContentType/Id
 :db/index true
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :Country/Id
 :db/index true
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :Currency/Id
 :db/index true
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :CurrencyExchange/Id
 :db/index true
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :DataClass/Id
 :db/index true
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :DataFile/Id
 :db/index true
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :DataFinding/Id
 :db/index true
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :DataFindingAddendum/Id
 :db/index true
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :DataFindingRule/Id
 :db/index true
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :DataFindingMitigationStatus/Id
 :db/index true
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :DataFindingSourceType/Id
 :db/index true
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :DataFindingTechnicalScan/Id
 :db/index true
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :DataLocation/Id
 :db/index true
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :DataLocationType/Id
 :db/index true
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :DataType/Id
 :db/index true
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :DetectionStatus/Id
 :db/index true
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :DetectionType/Id
 :db/index true
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :EffortCategory/Id
 :db/index true
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :EntityType/Id
 :db/index true
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :EventHistory/Id
 :db/index true
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :EventModule/Id
 :db/index true
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :EventType/Id
 :db/index true
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :ExpenseCategory/Id
 :db/index true
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :Explanation/Id
 :db/index true
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :ExplanationCategory/Id
 :db/index true
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :Exposure/Id
 :db/index true
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :ExposureCategory/Id
 :db/index true
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :GlobalSettings/Id
 :db/index true
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :Impact/Id
 :db/index true
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :ImpactType/Id
 :db/index true
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :ImportData/Id
 :db/index true
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :ImporterSettings/Id
 :db/index true
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :Incident/Id
 :db/index true
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :IncidentField/Id
 :db/index true
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :IncidentFieldData/Id
 :db/index true
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :IncidentImpact/Id
 :db/index true
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :IncidentIncidentStatus/Id
 :db/index true
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :IncidentObject/Id
 :db/index true
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :IncidentStatus/Id
 :db/index true
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :IncidentTask/Id
 :db/index true
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :IncidentType/Id
 :db/index true
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :Job/Id
 :db/index true
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :JobRun/Id
 :db/index true
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :LDAPAction/Id
 :db/index true
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :LDAPConfig/Id
 :db/index true
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :LDAPType/Id
 :db/index true
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :Likelihood/Id
 :db/index true
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :Manufacturer/Id
 :db/index true
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :MitigationStatus/Id
 :db/index true
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :Network/Id
 :db/index true
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :Note/Id
 :db/index true
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :Notification/Id
 :db/index true
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :NotificationRule/Id
 :db/index true
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :NotificationRuleSet/Id
 :db/index true
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :NotificationType/Id
 :db/index true
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :OperatingSystem/Id
 :db/index true
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :OperatingSystemType/Id
 :db/index true
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :Outcome/Id
 :db/index true
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :Person/Id
 :db/index true
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :Person_History/Id
 :db/index true
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :PersonLDAPEvent/Id
 :db/index true
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :PersonPasswordHistory/Id
 :db/index true
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :PersonPerson/Id
 :db/index true
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :PersonRelationshipType/Id
 :db/index true
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :Performer/Id
 :db/index true
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :PhysicalAsset/Id
 :db/index true
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :Policy/Id
 :db/index true
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :PolicyAcceptance/Id
 :db/index true
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :PolicyExceptionRequest/Id
 :db/index true
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :PolicyExceptionRequestStatus/Id
 :db/index true
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :PolicyPublishEvent/Id
 :db/index true
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :PolicyReference/Id
 :db/index true
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :PolicySection/Id
 :db/index true
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :PolicySectionPolicySection/Id
 :db/index true
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :PolicySectionReference/Id
 :db/index true
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :PolicySectionRole/Id
 :db/index true
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :PolicySectionStandardComponent/Id
 :db/index true
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :PolicySectionText/Id
 :db/index true
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :PolicyStandardComponent/Id
 :db/index true
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :PolicyStatus/Id
 :db/index true
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :PolicyTask/Id
 :db/index true
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :PolicyTaskEvent/Id
 :db/index true
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :PolicyTaskOutcome/Id
 :db/index true
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :PolicyTaskStatus/Id
 :db/index true
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :PolicyTaskType/Id
 :db/index true
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :PolicyTemplate/Id
 :db/index true
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :PolicyType/Id
 :db/index true
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :Priority/Id
 :db/index true
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :Procedure/Id
 :db/index true
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :Project/Id
 :db/index true
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :ProjectNotification/Id
 :db/index true
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :ProjectType/Id
 :db/index true
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :Protocol/Id
 :db/index true
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :Recurrence/Id
 :db/index true
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :Reference/Id
 :db/index true
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :ReferenceType/Id
 :db/index true
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :Report/Id
 :db/index true
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :ReportConfig/Id
 :db/index true
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :ResourceCost/Id
 :db/index true
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :RiskLevel/Id
 :db/index true
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :Role/Id
 :db/index true
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :RoleModule/Id
 :db/index true
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :Service/Id
 :db/index true
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :Severity/Id
 :db/index true
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :Software/Id
 :db/index true
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :StandardComponent/Id
 :db/index true
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :StandardComponentCoverageLink/Id
 :db/index true
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :StandardComponentTask/Id
 :db/index true
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :StandardComponentVendorProduct/Id
 :db/index true
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :StandardComponentVulnerability/Id
 :db/index true
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :StandardComponentWeight/Id
 :db/index true
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :Standard/Id
 :db/index true
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :Subnet/Id
 :db/index true
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :SubnetExposure/Id
 :db/index true
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :Survey/Id
 :db/index true
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :SurveySection/Id
 :db/index true
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :SurveySectionChoice/Id
 :db/index true
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :Task/Id
 :db/index true
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :TaskPerformance/Id
 :db/index true
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :TaskPerformanceEvent/Id
 :db/index true
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :TaskPerformancePerformer/Id
 :db/index true
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :TaskPerformanceNote/Id
 :db/index true
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :TaskPerformanceNotification/Id
 :db/index true
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :TaskPerformanceObject/Id
 :db/index true
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :TaskPerformanceStatus/Id
 :db/index true
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :TaskResult/Id
 :db/index true
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :TaskResultEffort/Id
 :db/index true
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :TaskResultExpense/Id
 :db/index true
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :TaskResultLineage/Id
 :db/index true
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :TaskResultObject/Id
 :db/index true
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :TaskResultOutcome/Id
 :db/index true
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :TaskResultOutcomeApproval/Id
 :db/index true
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :TaskResultOutcomeNotification/Id
 :db/index true
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :TaskResultScore/Id
 :db/index true
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :TaskResultScoreSet/Id
 :db/index true
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :TaskResultStatus/Id
 :db/index true
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :TaskResultType/Id
 :db/index true
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :TaskType/Id
 :db/index true
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :TechnicalScan/Id
 :db/index true
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :TechnicalScanType/Id
 :db/index true
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :TimeZone/Id
 :db/index true
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :Vendor/Id
 :db/index true
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :VendorProduct/Id
 :db/index true
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :Vulnerability/Id
 :db/index true
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :Vulnerability_History/Id
 :db/index true
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :VulnerabilityReference/Id
 :db/index true
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :VulnerabilityRule/Id
 :db/index true
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :VulnerabilityRuleSet/Id
 :db/index true
 :db.alter/_attribute :db.part/db}
]"
"[{:db/ident :VulnerabilityType/Id
 :db/index true
 :db.alter/_attribute :db.part/db}
]"
])

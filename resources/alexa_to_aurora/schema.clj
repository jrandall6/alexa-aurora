(ns alexa-to-aurora.schema
 )

(def schema
[
"[;;\"Address\",\"AddressLine1\",\"[nvarchar](128)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Address/AddressLine1
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"Address.AddressLine1\"
:alexa.entity-type :et-Address
:db.install/_attribute :db.part/db}

;;\"Address\",\"AddressLine2\",\"[nvarchar](128)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Address/AddressLine2
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"Address.AddressLine2\"
:alexa.entity-type :et-Address
:db.install/_attribute :db.part/db}

;;\"Address\",\"City\",\"[nvarchar](128)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Address/City
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"Address.City\"
:alexa.entity-type :et-Address
:db.install/_attribute :db.part/db}

;;\"Address\",\"ContactName\",\"[nvarchar](256)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Address/ContactName
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"Address.ContactName\"
:alexa.entity-type :et-Address
:db.install/_attribute :db.part/db}

;;\"Address\",\"CountryId\",\"bigint\",\"NOT NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :Address/Country
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(Address CountryId Country Country)\"
:alexa.entity-type :et-Address
:db.install/_attribute :db.part/db}

;;\"Address\",\"CreatedOn\",\"datetime\",\"NOT NULL\",\"[DF_Address_CreatedOn]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Address/CreatedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"Address.CreatedOn\"
:alexa.entity-type :et-Address
:db.install/_attribute :db.part/db}

;;\"Address\",\"DeletedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Address/DeletedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"Address.DeletedOn\"
:alexa.entity-type :et-Address
:db.install/_attribute :db.part/db}

;;\"Address\",\"Id\",\"bigint\",\"NOT NULL\",\"\",\"IDENTITY\",\"PRIMARY KEY\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Address/Id
:db/valueType :db.type/long
:db/cardinality :db.cardinality/one
:db/index true
:db/unique :db.unique/value
:db/doc \"Address.Id\"
:alexa.entity-type :et-Address
:db.install/_attribute :db.part/db}

;;\"Address\",\"ModifiedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Address/ModifiedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"Address.ModifiedOn\"
:alexa.entity-type :et-Address
:db.install/_attribute :db.part/db}

;;\"Address\",\"PostalCode\",\"[nvarchar](50)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Address/PostalCode
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"Address.PostalCode\"
:alexa.entity-type :et-Address
:db.install/_attribute :db.part/db}

;;\"Address\",\"State\",\"[nvarchar](50)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Address/State
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"Address.State\"
:alexa.entity-type :et-Address
:db.install/_attribute :db.part/db}

;;\"Address\",\"TimeZoneId\",\"bigint\",\"NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :Address/TimeZone
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(Address TimeZoneId TimeZone TimeZone)\"
:alexa.entity-type :et-Address
:db.install/_attribute :db.part/db}

]"
"[;;\"Address_History\",\"AddressId\",\"bigint\",\"NOT NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :Address_History/Address
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(Address_History AddressId Address Address)\"
:alexa.entity-type :et-Address_History
:db.install/_attribute :db.part/db}

;;\"Address_History\",\"AddressLine1\",\"[nvarchar](128)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Address_History/AddressLine1
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"Address_History.AddressLine1\"
:alexa.entity-type :et-Address_History
:db.install/_attribute :db.part/db}

;;\"Address_History\",\"AddressLine2\",\"[nvarchar](128)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Address_History/AddressLine2
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"Address_History.AddressLine2\"
:alexa.entity-type :et-Address_History
:db.install/_attribute :db.part/db}

;;\"Address_History\",\"City\",\"[nvarchar](128)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Address_History/City
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"Address_History.City\"
:alexa.entity-type :et-Address_History
:db.install/_attribute :db.part/db}

;;\"Address_History\",\"ContactName\",\"[nvarchar](256)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Address_History/ContactName
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"Address_History.ContactName\"
:alexa.entity-type :et-Address_History
:db.install/_attribute :db.part/db}

;;\"Address_History\",\"CountryId\",\"bigint\",\"NOT NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Address_History/CountryId
:db/valueType :db.type/long
:db/cardinality :db.cardinality/one
:db/doc \"Address_History.CountryId\"
:alexa.entity-type :et-Address_History
:db.install/_attribute :db.part/db}

;;\"Address_History\",\"CreatedOn\",\"datetime\",\"NOT NULL\",\"[DF_Address_History_CreatedOn]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Address_History/CreatedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"Address_History.CreatedOn\"
:alexa.entity-type :et-Address_History
:db.install/_attribute :db.part/db}

;;\"Address_History\",\"DeletedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Address_History/DeletedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"Address_History.DeletedOn\"
:alexa.entity-type :et-Address_History
:db.install/_attribute :db.part/db}

;;\"Address_History\",\"Id\",\"bigint\",\"NOT NULL\",\"\",\"IDENTITY\",\"PRIMARY KEY\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Address_History/Id
:db/valueType :db.type/long
:db/cardinality :db.cardinality/one
:db/index true
:db/unique :db.unique/value
:db/doc \"Address_History.Id\"
:alexa.entity-type :et-Address_History
:db.install/_attribute :db.part/db}

;;\"Address_History\",\"LoginPersonId\",\"bigint\",\"NOT NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :Address_History/LoginPerson
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(Address_History LoginPersonId Person LoginPerson)\"
:alexa.entity-type :et-Address_History
:db.install/_attribute :db.part/db}

;;\"Address_History\",\"ModifiedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Address_History/ModifiedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"Address_History.ModifiedOn\"
:alexa.entity-type :et-Address_History
:db.install/_attribute :db.part/db}

;;\"Address_History\",\"PostalCode\",\"[nvarchar](50)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Address_History/PostalCode
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"Address_History.PostalCode\"
:alexa.entity-type :et-Address_History
:db.install/_attribute :db.part/db}

;;\"Address_History\",\"State\",\"[nvarchar](50)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Address_History/State
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"Address_History.State\"
:alexa.entity-type :et-Address_History
:db.install/_attribute :db.part/db}

;;\"Address_History\",\"TimeZoneId\",\"bigint\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Address_History/TimeZoneId
:db/valueType :db.type/long
:db/cardinality :db.cardinality/one
:db/doc \"Address_History.TimeZoneId\"
:alexa.entity-type :et-Address_History
:db.install/_attribute :db.part/db}

]"
"[;;\"Analysis\",\"AnalysisBasisId\",\"bigint\",\"NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :Analysis/AnalysisBasis
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(Analysis AnalysisBasisId AnalysisBasis AnalysisBasis)\"
:alexa.entity-type :et-Analysis
:db.install/_attribute :db.part/db}

;;\"Analysis\",\"AnalysisMethodId\",\"bigint\",\"NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :Analysis/AnalysisMethod
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(Analysis AnalysisMethodId AnalysisMethod AnalysisMethod)\"
:alexa.entity-type :et-Analysis
:db.install/_attribute :db.part/db}

;;\"Analysis\",\"AnalysisTypeId\",\"bigint\",\"NOT NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :Analysis/AnalysisType
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(Analysis AnalysisTypeId AnalysisType AnalysisType)\"
:alexa.entity-type :et-Analysis
:db.install/_attribute :db.part/db}

;;\"Analysis\",\"AssetFilterData\",\"[varbinary](MAX)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Analysis/AssetFilterData
:db/valueType :db.type/uri
:db/cardinality :db.cardinality/one
:db/doc \"Analysis.AssetFilterData\"
:alexa.entity-type :et-Analysis
:db.install/_attribute :db.part/db}

;;\"Analysis\",\"CreatedBy_PersonId\",\"bigint\",\"NOT NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :Analysis/CreatedBy_Person
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(Analysis CreatedBy_PersonId Person CreatedBy_Person)\"
:alexa.entity-type :et-Analysis
:db.install/_attribute :db.part/db}

;;\"Analysis\",\"CreatedOn\",\"datetime\",\"NOT NULL\",\"[DF_Analysis_CreatedOn]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Analysis/CreatedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"Analysis.CreatedOn\"
:alexa.entity-type :et-Analysis
:db.install/_attribute :db.part/db}

;;\"Analysis\",\"DeletedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Analysis/DeletedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"Analysis.DeletedOn\"
:alexa.entity-type :et-Analysis
:db.install/_attribute :db.part/db}

;;\"Analysis\",\"Description\",\"[nvarchar](1024)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Analysis/Description
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"Analysis.Description\"
:alexa.entity-type :et-Analysis
:db.install/_attribute :db.part/db}

;;\"Analysis\",\"EffectiveDate\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Analysis/EffectiveDate
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"Analysis.EffectiveDate\"
:alexa.entity-type :et-Analysis
:db.install/_attribute :db.part/db}

;;\"Analysis\",\"ExcludeGroupResults\",\"bit\",\"NULL\",\"[DF_Analysis_ExcludeGroupResults]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Analysis/ExcludeGroupResults
:db/valueType :db.type/boolean
:db/cardinality :db.cardinality/one
:db/doc \"Analysis.ExcludeGroupResults\"
:alexa.entity-type :et-Analysis
:db.install/_attribute :db.part/db}

;;\"Analysis\",\"Id\",\"bigint\",\"NOT NULL\",\"\",\"IDENTITY\",\"PRIMARY KEY\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Analysis/Id
:db/valueType :db.type/long
:db/cardinality :db.cardinality/one
:db/index true
:db/unique :db.unique/value
:db/doc \"Analysis.Id\"
:alexa.entity-type :et-Analysis
:db.install/_attribute :db.part/db}

;;\"Analysis\",\"IncludeAssessmentScores\",\"bit\",\"NULL\",\"[DF_Analysis_IncludeAssessmentResults]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Analysis/IncludeAssessmentScores
:db/valueType :db.type/boolean
:db/cardinality :db.cardinality/one
:db/doc \"Analysis.IncludeAssessmentScores\"
:alexa.entity-type :et-Analysis
:db.install/_attribute :db.part/db}

;;\"Analysis\",\"IncludeExposures\",\"bit\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Analysis/IncludeExposures
:db/valueType :db.type/boolean
:db/cardinality :db.cardinality/one
:db/doc \"Analysis.IncludeExposures\"
:alexa.entity-type :et-Analysis
:db.install/_attribute :db.part/db}

;;\"Analysis\",\"IncludeThreats\",\"bit\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Analysis/IncludeThreats
:db/valueType :db.type/boolean
:db/cardinality :db.cardinality/one
:db/doc \"Analysis.IncludeThreats\"
:alexa.entity-type :et-Analysis
:db.install/_attribute :db.part/db}

;;\"Analysis\",\"IncludeVulnerabilities\",\"bit\",\"NULL\",\"[DF_Analysis_IncludeTechScanResults]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Analysis/IncludeVulnerabilities
:db/valueType :db.type/boolean
:db/cardinality :db.cardinality/one
:db/doc \"Analysis.IncludeVulnerabilities\"
:alexa.entity-type :et-Analysis
:db.install/_attribute :db.part/db}

;;\"Analysis\",\"ModifiedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Analysis/ModifiedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"Analysis.ModifiedOn\"
:alexa.entity-type :et-Analysis
:db.install/_attribute :db.part/db}

;;\"Analysis\",\"Name\",\"[nvarchar](256)\",\"NOT NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Analysis/Name
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"Analysis.Name\"
:alexa.entity-type :et-Analysis
:db.install/_attribute :db.part/db}

{:db/id #db/id[:db.part/db]
:db/ident :Analysis/Asset
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/many
:db/doc \"(Analysis AnalysisId AnalysisAsset AssetId Asset)\"
:alexa.entity-type :et-Analysis
:db.install/_attribute :db.part/db}

{:db/id #db/id[:db.part/db]
:db/ident :Analysis/AssetFilter
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/many
:db/doc \"(Analysis AnalysisId AnalysisAssetFilter AssetFilterId AssetFilter)\"
:alexa.entity-type :et-Analysis
:db.install/_attribute :db.part/db}

{:db/id #db/id[:db.part/db]
:db/ident :Analysis/AssetGroup
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/many
:db/doc \"(Analysis AnalysisId AnalysisAssetGroup AssetGroupId AssetGroup)\"
:alexa.entity-type :et-Analysis
:db.install/_attribute :db.part/db}

{:db/id #db/id[:db.part/db]
:db/ident :Analysis/ExposureCategory
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/many
:db/doc \"(Analysis AnalysisId AnalysisExposureCategory ExposureCategoryId ExposureCategory)\"
:alexa.entity-type :et-Analysis
:db.install/_attribute :db.part/db}

{:db/id #db/id[:db.part/db]
:db/ident :Analysis/Project
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/many
:db/doc \"(Analysis AnalysisId AnalysisProject ProjectId Project)\"
:alexa.entity-type :et-Analysis
:db.install/_attribute :db.part/db}

{:db/id #db/id[:db.part/db]
:db/ident :Analysis/TechnicalScan
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/many
:db/doc \"(Analysis AnalysisId AnalysisTechnicalScan TechnicalScanId TechnicalScan)\"
:alexa.entity-type :et-Analysis
:db.install/_attribute :db.part/db}

]"
"[;;\"AnalysisAnalysis\",\"AnalysisId\",\"bigint\",\"NOT NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :AnalysisAnalysis/Analysis
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(AnalysisAnalysis AnalysisId Analysis Analysis)\"
:alexa.entity-type :et-AnalysisAnalysis
:db.install/_attribute :db.part/db}

;;\"AnalysisAnalysis\",\"BasisAnalysisId\",\"bigint\",\"NOT NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :AnalysisAnalysis/BasisAnalysis
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(AnalysisAnalysis BasisAnalysisId Analysis BasisAnalysis)\"
:alexa.entity-type :et-AnalysisAnalysis
:db.install/_attribute :db.part/db}

;;\"AnalysisAnalysis\",\"CreatedOn\",\"datetime\",\"NOT NULL\",\"[DF_AnalysisAnalysis_CreatedOn]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :AnalysisAnalysis/CreatedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"AnalysisAnalysis.CreatedOn\"
:alexa.entity-type :et-AnalysisAnalysis
:db.install/_attribute :db.part/db}

;;\"AnalysisAnalysis\",\"DeletedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :AnalysisAnalysis/DeletedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"AnalysisAnalysis.DeletedOn\"
:alexa.entity-type :et-AnalysisAnalysis
:db.install/_attribute :db.part/db}

;;\"AnalysisAnalysis\",\"DisplayIndex\",\"int\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :AnalysisAnalysis/DisplayIndex
:db/valueType :db.type/long
:db/cardinality :db.cardinality/one
:db/doc \"AnalysisAnalysis.DisplayIndex\"
:alexa.entity-type :et-AnalysisAnalysis
:db.install/_attribute :db.part/db}

;;\"AnalysisAnalysis\",\"Id\",\"bigint\",\"NOT NULL\",\"\",\"IDENTITY\",\"PRIMARY KEY\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :AnalysisAnalysis/Id
:db/valueType :db.type/long
:db/cardinality :db.cardinality/one
:db/index true
:db/unique :db.unique/value
:db/doc \"AnalysisAnalysis.Id\"
:alexa.entity-type :et-AnalysisAnalysis
:db.install/_attribute :db.part/db}

;;\"AnalysisAnalysis\",\"ModifiedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :AnalysisAnalysis/ModifiedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"AnalysisAnalysis.ModifiedOn\"
:alexa.entity-type :et-AnalysisAnalysis
:db.install/_attribute :db.part/db}

]"
"[;;\"AnalysisAssetLikelihood\",\"AnalysisId\",\"bigint\",\"NOT NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :AnalysisAssetLikelihood/Analysis
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(AnalysisAssetLikelihood AnalysisId Analysis Analysis)\"
:alexa.entity-type :et-AnalysisAssetLikelihood
:db.install/_attribute :db.part/db}

;;\"AnalysisAssetLikelihood\",\"AssetId\",\"bigint\",\"NOT NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :AnalysisAssetLikelihood/Asset
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(AnalysisAssetLikelihood AssetId Asset Asset)\"
:alexa.entity-type :et-AnalysisAssetLikelihood
:db.install/_attribute :db.part/db}

;;\"AnalysisAssetLikelihood\",\"BasisValue\",\"float\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :AnalysisAssetLikelihood/BasisValue
:db/valueType :db.type/float
:db/cardinality :db.cardinality/one
:db/doc \"AnalysisAssetLikelihood.BasisValue\"
:alexa.entity-type :et-AnalysisAssetLikelihood
:db.install/_attribute :db.part/db}

;;\"AnalysisAssetLikelihood\",\"Comments\",\"[nvarchar](256)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :AnalysisAssetLikelihood/Comments
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"AnalysisAssetLikelihood.Comments\"
:alexa.entity-type :et-AnalysisAssetLikelihood
:db.install/_attribute :db.part/db}

;;\"AnalysisAssetLikelihood\",\"CreatedOn\",\"datetime\",\"NOT NULL\",\"[DF_AnalysisAssetLikelihood_CreatedOn]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :AnalysisAssetLikelihood/CreatedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"AnalysisAssetLikelihood.CreatedOn\"
:alexa.entity-type :et-AnalysisAssetLikelihood
:db.install/_attribute :db.part/db}

;;\"AnalysisAssetLikelihood\",\"DeletedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :AnalysisAssetLikelihood/DeletedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"AnalysisAssetLikelihood.DeletedOn\"
:alexa.entity-type :et-AnalysisAssetLikelihood
:db.install/_attribute :db.part/db}

;;\"AnalysisAssetLikelihood\",\"ExposureId\",\"bigint\",\"NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :AnalysisAssetLikelihood/Exposure
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(AnalysisAssetLikelihood ExposureId Exposure Exposure)\"
:alexa.entity-type :et-AnalysisAssetLikelihood
:db.install/_attribute :db.part/db}

;;\"AnalysisAssetLikelihood\",\"Id\",\"bigint\",\"NOT NULL\",\"\",\"IDENTITY\",\"PRIMARY KEY\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :AnalysisAssetLikelihood/Id
:db/valueType :db.type/long
:db/cardinality :db.cardinality/one
:db/index true
:db/unique :db.unique/value
:db/doc \"AnalysisAssetLikelihood.Id\"
:alexa.entity-type :et-AnalysisAssetLikelihood
:db.install/_attribute :db.part/db}

;;\"AnalysisAssetLikelihood\",\"ImpactId\",\"bigint\",\"NOT NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :AnalysisAssetLikelihood/Impact
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(AnalysisAssetLikelihood ImpactId Impact Impact)\"
:alexa.entity-type :et-AnalysisAssetLikelihood
:db.install/_attribute :db.part/db}

;;\"AnalysisAssetLikelihood\",\"LikelihoodId\",\"bigint\",\"NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :AnalysisAssetLikelihood/Likelihood
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(AnalysisAssetLikelihood LikelihoodId Likelihood Likelihood)\"
:alexa.entity-type :et-AnalysisAssetLikelihood
:db.install/_attribute :db.part/db}

;;\"AnalysisAssetLikelihood\",\"Manual_BasisValue\",\"float\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :AnalysisAssetLikelihood/Manual_BasisValue
:db/valueType :db.type/float
:db/cardinality :db.cardinality/one
:db/doc \"AnalysisAssetLikelihood.Manual_BasisValue\"
:alexa.entity-type :et-AnalysisAssetLikelihood
:db.install/_attribute :db.part/db}

;;\"AnalysisAssetLikelihood\",\"Manual_EnteredOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :AnalysisAssetLikelihood/Manual_EnteredOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"AnalysisAssetLikelihood.Manual_EnteredOn\"
:alexa.entity-type :et-AnalysisAssetLikelihood
:db.install/_attribute :db.part/db}

;;\"AnalysisAssetLikelihood\",\"Manual_LikelihoodId\",\"bigint\",\"NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :AnalysisAssetLikelihood/Manual_Likelihood
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(AnalysisAssetLikelihood Manual_LikelihoodId Likelihood Manual_Likelihood)\"
:alexa.entity-type :et-AnalysisAssetLikelihood
:db.install/_attribute :db.part/db}

;;\"AnalysisAssetLikelihood\",\"Manual_PersonId\",\"bigint\",\"NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :AnalysisAssetLikelihood/Manual_Person
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(AnalysisAssetLikelihood Manual_PersonId Person Manual_Person)\"
:alexa.entity-type :et-AnalysisAssetLikelihood
:db.install/_attribute :db.part/db}

;;\"AnalysisAssetLikelihood\",\"ModifiedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :AnalysisAssetLikelihood/ModifiedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"AnalysisAssetLikelihood.ModifiedOn\"
:alexa.entity-type :et-AnalysisAssetLikelihood
:db.install/_attribute :db.part/db}

;;\"AnalysisAssetLikelihood\",\"ProjectId\",\"bigint\",\"NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :AnalysisAssetLikelihood/Project
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(AnalysisAssetLikelihood ProjectId Project Project)\"
:alexa.entity-type :et-AnalysisAssetLikelihood
:db.install/_attribute :db.part/db}

;;\"AnalysisAssetLikelihood\",\"RiskBasisValue\",\"float\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :AnalysisAssetLikelihood/RiskBasisValue
:db/valueType :db.type/float
:db/cardinality :db.cardinality/one
:db/doc \"AnalysisAssetLikelihood.RiskBasisValue\"
:alexa.entity-type :et-AnalysisAssetLikelihood
:db.install/_attribute :db.part/db}

;;\"AnalysisAssetLikelihood\",\"RiskLevelId\",\"bigint\",\"NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :AnalysisAssetLikelihood/RiskLevel
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(AnalysisAssetLikelihood RiskLevelId RiskLevel RiskLevel)\"
:alexa.entity-type :et-AnalysisAssetLikelihood
:db.install/_attribute :db.part/db}

;;\"AnalysisAssetLikelihood\",\"ScoreCount\",\"int\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :AnalysisAssetLikelihood/ScoreCount
:db/valueType :db.type/long
:db/cardinality :db.cardinality/one
:db/doc \"AnalysisAssetLikelihood.ScoreCount\"
:alexa.entity-type :et-AnalysisAssetLikelihood
:db.install/_attribute :db.part/db}

;;\"AnalysisAssetLikelihood\",\"TechnicalScanId\",\"bigint\",\"NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :AnalysisAssetLikelihood/TechnicalScan
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(AnalysisAssetLikelihood TechnicalScanId TechnicalScan TechnicalScan)\"
:alexa.entity-type :et-AnalysisAssetLikelihood
:db.install/_attribute :db.part/db}

;;\"AnalysisAssetLikelihood\",\"VulnerabilityCount\",\"int\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :AnalysisAssetLikelihood/VulnerabilityCount
:db/valueType :db.type/long
:db/cardinality :db.cardinality/one
:db/doc \"AnalysisAssetLikelihood.VulnerabilityCount\"
:alexa.entity-type :et-AnalysisAssetLikelihood
:db.install/_attribute :db.part/db}

]"
"[;;\"AnalysisAssetVulnSeverity\",\"AnalysisId\",\"bigint\",\"NOT NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :AnalysisAssetVulnSeverity/Analysis
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(AnalysisAssetVulnSeverity AnalysisId Analysis Analysis)\"
:alexa.entity-type :et-AnalysisAssetVulnSeverity
:db.install/_attribute :db.part/db}

;;\"AnalysisAssetVulnSeverity\",\"AssetCount\",\"int\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :AnalysisAssetVulnSeverity/AssetCount
:db/valueType :db.type/long
:db/cardinality :db.cardinality/one
:db/doc \"AnalysisAssetVulnSeverity.AssetCount\"
:alexa.entity-type :et-AnalysisAssetVulnSeverity
:db.install/_attribute :db.part/db}

;;\"AnalysisAssetVulnSeverity\",\"AssetTypeId\",\"bigint\",\"NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :AnalysisAssetVulnSeverity/AssetType
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(AnalysisAssetVulnSeverity AssetTypeId AssetType AssetType)\"
:alexa.entity-type :et-AnalysisAssetVulnSeverity
:db.install/_attribute :db.part/db}

;;\"AnalysisAssetVulnSeverity\",\"Comments\",\"[nvarchar](1024)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :AnalysisAssetVulnSeverity/Comments
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"AnalysisAssetVulnSeverity.Comments\"
:alexa.entity-type :et-AnalysisAssetVulnSeverity
:db.install/_attribute :db.part/db}

;;\"AnalysisAssetVulnSeverity\",\"CreatedOn\",\"datetime\",\"NOT NULL\",\"[DF_AnalysisAssetVulnSeverity_CreatedOn]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :AnalysisAssetVulnSeverity/CreatedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"AnalysisAssetVulnSeverity.CreatedOn\"
:alexa.entity-type :et-AnalysisAssetVulnSeverity
:db.install/_attribute :db.part/db}

;;\"AnalysisAssetVulnSeverity\",\"DeletedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :AnalysisAssetVulnSeverity/DeletedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"AnalysisAssetVulnSeverity.DeletedOn\"
:alexa.entity-type :et-AnalysisAssetVulnSeverity
:db.install/_attribute :db.part/db}

;;\"AnalysisAssetVulnSeverity\",\"Id\",\"bigint\",\"NOT NULL\",\"\",\"IDENTITY\",\"PRIMARY KEY\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :AnalysisAssetVulnSeverity/Id
:db/valueType :db.type/long
:db/cardinality :db.cardinality/one
:db/index true
:db/unique :db.unique/value
:db/doc \"AnalysisAssetVulnSeverity.Id\"
:alexa.entity-type :et-AnalysisAssetVulnSeverity
:db.install/_attribute :db.part/db}

;;\"AnalysisAssetVulnSeverity\",\"ModifiedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :AnalysisAssetVulnSeverity/ModifiedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"AnalysisAssetVulnSeverity.ModifiedOn\"
:alexa.entity-type :et-AnalysisAssetVulnSeverity
:db.install/_attribute :db.part/db}

;;\"AnalysisAssetVulnSeverity\",\"NetworkId\",\"bigint\",\"NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :AnalysisAssetVulnSeverity/Network
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(AnalysisAssetVulnSeverity NetworkId Network Network)\"
:alexa.entity-type :et-AnalysisAssetVulnSeverity
:db.install/_attribute :db.part/db}

;;\"AnalysisAssetVulnSeverity\",\"OperatingSystemId\",\"bigint\",\"NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :AnalysisAssetVulnSeverity/OperatingSystem
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(AnalysisAssetVulnSeverity OperatingSystemId OperatingSystem OperatingSystem)\"
:alexa.entity-type :et-AnalysisAssetVulnSeverity
:db.install/_attribute :db.part/db}

;;\"AnalysisAssetVulnSeverity\",\"SeverityId\",\"bigint\",\"NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :AnalysisAssetVulnSeverity/Severity
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(AnalysisAssetVulnSeverity SeverityId Severity Severity)\"
:alexa.entity-type :et-AnalysisAssetVulnSeverity
:db.install/_attribute :db.part/db}

]"
"[;;\"AnalysisBasis\",\"AnalysisTypeId\",\"bigint\",\"NOT NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :AnalysisBasis/AnalysisType
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(AnalysisBasis AnalysisTypeId AnalysisType AnalysisType)\"
:alexa.entity-type :et-AnalysisBasis
:db.install/_attribute :db.part/db}

;;\"AnalysisBasis\",\"CreatedOn\",\"datetime\",\"NOT NULL\",\"[DF_AnalysisBasis_CreatedOn]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :AnalysisBasis/CreatedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"AnalysisBasis.CreatedOn\"
:alexa.entity-type :et-AnalysisBasis
:db.install/_attribute :db.part/db}

;;\"AnalysisBasis\",\"DeletedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :AnalysisBasis/DeletedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"AnalysisBasis.DeletedOn\"
:alexa.entity-type :et-AnalysisBasis
:db.install/_attribute :db.part/db}

;;\"AnalysisBasis\",\"Description\",\"[nvarchar](1024)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :AnalysisBasis/Description
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"AnalysisBasis.Description\"
:alexa.entity-type :et-AnalysisBasis
:db.install/_attribute :db.part/db}

;;\"AnalysisBasis\",\"Id\",\"bigint\",\"NOT NULL\",\"\",\"IDENTITY\",\"PRIMARY KEY\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :AnalysisBasis/Id
:db/valueType :db.type/long
:db/cardinality :db.cardinality/one
:db/index true
:db/unique :db.unique/value
:db/doc \"AnalysisBasis.Id\"
:alexa.entity-type :et-AnalysisBasis
:db.install/_attribute :db.part/db}

;;\"AnalysisBasis\",\"ModifiedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :AnalysisBasis/ModifiedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"AnalysisBasis.ModifiedOn\"
:alexa.entity-type :et-AnalysisBasis
:db.install/_attribute :db.part/db}

;;\"AnalysisBasis\",\"Name\",\"[nvarchar](256)\",\"NOT NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :AnalysisBasis/Name
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"AnalysisBasis.Name\"
:alexa.entity-type :et-AnalysisBasis
:db.install/_attribute :db.part/db}

]"
"[;;\"AnalysisComponentScore\",\"AnalysisId\",\"bigint\",\"NOT NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :AnalysisComponentScore/Analysis
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(AnalysisComponentScore AnalysisId Analysis Analysis)\"
:alexa.entity-type :et-AnalysisComponentScore
:db.install/_attribute :db.part/db}

;;\"AnalysisComponentScore\",\"BusinessUnitId\",\"bigint\",\"NOT NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :AnalysisComponentScore/BusinessUnit
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(AnalysisComponentScore BusinessUnitId BusinessUnit BusinessUnit)\"
:alexa.entity-type :et-AnalysisComponentScore
:db.install/_attribute :db.part/db}

;;\"AnalysisComponentScore\",\"Comments\",\"[nvarchar](1024)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :AnalysisComponentScore/Comments
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"AnalysisComponentScore.Comments\"
:alexa.entity-type :et-AnalysisComponentScore
:db.install/_attribute :db.part/db}

;;\"AnalysisComponentScore\",\"CreatedOn\",\"datetime\",\"NOT NULL\",\"[DF_AnalysisComponentScore_CreatedOn]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :AnalysisComponentScore/CreatedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"AnalysisComponentScore.CreatedOn\"
:alexa.entity-type :et-AnalysisComponentScore
:db.install/_attribute :db.part/db}

;;\"AnalysisComponentScore\",\"DeletedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :AnalysisComponentScore/DeletedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"AnalysisComponentScore.DeletedOn\"
:alexa.entity-type :et-AnalysisComponentScore
:db.install/_attribute :db.part/db}

;;\"AnalysisComponentScore\",\"Id\",\"bigint\",\"NOT NULL\",\"\",\"IDENTITY\",\"PRIMARY KEY\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :AnalysisComponentScore/Id
:db/valueType :db.type/long
:db/cardinality :db.cardinality/one
:db/index true
:db/unique :db.unique/value
:db/doc \"AnalysisComponentScore.Id\"
:alexa.entity-type :et-AnalysisComponentScore
:db.install/_attribute :db.part/db}

;;\"AnalysisComponentScore\",\"ModifiedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :AnalysisComponentScore/ModifiedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"AnalysisComponentScore.ModifiedOn\"
:alexa.entity-type :et-AnalysisComponentScore
:db.install/_attribute :db.part/db}

;;\"AnalysisComponentScore\",\"Score\",\"float\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :AnalysisComponentScore/Score
:db/valueType :db.type/float
:db/cardinality :db.cardinality/one
:db/doc \"AnalysisComponentScore.Score\"
:alexa.entity-type :et-AnalysisComponentScore
:db.install/_attribute :db.part/db}

;;\"AnalysisComponentScore\",\"StandardComponentId\",\"bigint\",\"NOT NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :AnalysisComponentScore/StandardComponent
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(AnalysisComponentScore StandardComponentId StandardComponent StandardComponent)\"
:alexa.entity-type :et-AnalysisComponentScore
:db.install/_attribute :db.part/db}

]"
"[;;\"AnalysisExpense\",\"Amount\",\"money\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :AnalysisExpense/Amount
:db/valueType :db.type/bigdec
:db/cardinality :db.cardinality/one
:db/doc \"AnalysisExpense.Amount\"
:alexa.entity-type :et-AnalysisExpense
:db.install/_attribute :db.part/db}

;;\"AnalysisExpense\",\"AnalysisId\",\"bigint\",\"NOT NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :AnalysisExpense/Analysis
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(AnalysisExpense AnalysisId Analysis Analysis)\"
:alexa.entity-type :et-AnalysisExpense
:db.install/_attribute :db.part/db}

;;\"AnalysisExpense\",\"Comments\",\"[nvarchar](1024)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :AnalysisExpense/Comments
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"AnalysisExpense.Comments\"
:alexa.entity-type :et-AnalysisExpense
:db.install/_attribute :db.part/db}

;;\"AnalysisExpense\",\"CreatedOn\",\"datetime\",\"NOT NULL\",\"[DF_AnalysisExpense_CreatedOn]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :AnalysisExpense/CreatedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"AnalysisExpense.CreatedOn\"
:alexa.entity-type :et-AnalysisExpense
:db.install/_attribute :db.part/db}

;;\"AnalysisExpense\",\"CurrencyId\",\"bigint\",\"NOT NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :AnalysisExpense/Currency
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(AnalysisExpense CurrencyId Currency Currency)\"
:alexa.entity-type :et-AnalysisExpense
:db.install/_attribute :db.part/db}

;;\"AnalysisExpense\",\"DeletedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :AnalysisExpense/DeletedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"AnalysisExpense.DeletedOn\"
:alexa.entity-type :et-AnalysisExpense
:db.install/_attribute :db.part/db}

;;\"AnalysisExpense\",\"ExpenseCategoryId\",\"bigint\",\"NOT NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :AnalysisExpense/ExpenseCategory
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(AnalysisExpense ExpenseCategoryId ExpenseCategory ExpenseCategory)\"
:alexa.entity-type :et-AnalysisExpense
:db.install/_attribute :db.part/db}

;;\"AnalysisExpense\",\"Id\",\"bigint\",\"NOT NULL\",\"\",\"IDENTITY\",\"PRIMARY KEY\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :AnalysisExpense/Id
:db/valueType :db.type/long
:db/cardinality :db.cardinality/one
:db/index true
:db/unique :db.unique/value
:db/doc \"AnalysisExpense.Id\"
:alexa.entity-type :et-AnalysisExpense
:db.install/_attribute :db.part/db}

;;\"AnalysisExpense\",\"ModifiedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :AnalysisExpense/ModifiedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"AnalysisExpense.ModifiedOn\"
:alexa.entity-type :et-AnalysisExpense
:db.install/_attribute :db.part/db}

]"
"[;;\"AnalysisMethod\",\"AnalysisTypeId\",\"bigint\",\"NOT NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :AnalysisMethod/AnalysisType
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(AnalysisMethod AnalysisTypeId AnalysisType AnalysisType)\"
:alexa.entity-type :et-AnalysisMethod
:db.install/_attribute :db.part/db}

;;\"AnalysisMethod\",\"CreatedOn\",\"datetime\",\"NOT NULL\",\"[DF_AnalysisMethod_CreatedOn]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :AnalysisMethod/CreatedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"AnalysisMethod.CreatedOn\"
:alexa.entity-type :et-AnalysisMethod
:db.install/_attribute :db.part/db}

;;\"AnalysisMethod\",\"DeletedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :AnalysisMethod/DeletedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"AnalysisMethod.DeletedOn\"
:alexa.entity-type :et-AnalysisMethod
:db.install/_attribute :db.part/db}

;;\"AnalysisMethod\",\"Description\",\"[nvarchar](1024)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :AnalysisMethod/Description
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"AnalysisMethod.Description\"
:alexa.entity-type :et-AnalysisMethod
:db.install/_attribute :db.part/db}

;;\"AnalysisMethod\",\"Id\",\"bigint\",\"NOT NULL\",\"\",\"IDENTITY\",\"PRIMARY KEY\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :AnalysisMethod/Id
:db/valueType :db.type/long
:db/cardinality :db.cardinality/one
:db/index true
:db/unique :db.unique/value
:db/doc \"AnalysisMethod.Id\"
:alexa.entity-type :et-AnalysisMethod
:db.install/_attribute :db.part/db}

;;\"AnalysisMethod\",\"ModifiedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :AnalysisMethod/ModifiedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"AnalysisMethod.ModifiedOn\"
:alexa.entity-type :et-AnalysisMethod
:db.install/_attribute :db.part/db}

;;\"AnalysisMethod\",\"Name\",\"[nvarchar](256)\",\"NOT NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :AnalysisMethod/Name
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"AnalysisMethod.Name\"
:alexa.entity-type :et-AnalysisMethod
:db.install/_attribute :db.part/db}

]"
"[;;\"AnalysisType\",\"CreatedOn\",\"datetime\",\"NOT NULL\",\"[DF_AnalysisType_CreatedOn]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :AnalysisType/CreatedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"AnalysisType.CreatedOn\"
:alexa.entity-type :et-AnalysisType
:db.install/_attribute :db.part/db}

;;\"AnalysisType\",\"DeletedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :AnalysisType/DeletedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"AnalysisType.DeletedOn\"
:alexa.entity-type :et-AnalysisType
:db.install/_attribute :db.part/db}

;;\"AnalysisType\",\"Description\",\"[nvarchar](1024)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :AnalysisType/Description
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"AnalysisType.Description\"
:alexa.entity-type :et-AnalysisType
:db.install/_attribute :db.part/db}

;;\"AnalysisType\",\"Id\",\"bigint\",\"NOT NULL\",\"\",\"IDENTITY\",\"PRIMARY KEY\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :AnalysisType/Id
:db/valueType :db.type/long
:db/cardinality :db.cardinality/one
:db/index true
:db/unique :db.unique/value
:db/doc \"AnalysisType.Id\"
:alexa.entity-type :et-AnalysisType
:db.install/_attribute :db.part/db}

;;\"AnalysisType\",\"ModifiedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :AnalysisType/ModifiedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"AnalysisType.ModifiedOn\"
:alexa.entity-type :et-AnalysisType
:db.install/_attribute :db.part/db}

;;\"AnalysisType\",\"Name\",\"[nvarchar](256)\",\"NOT NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :AnalysisType/Name
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"AnalysisType.Name\"
:alexa.entity-type :et-AnalysisType
:db.install/_attribute :db.part/db}

]"
"[;;\"ApprovalStatus\",\"BackColorName\",\"[nvarchar](50)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :ApprovalStatus/BackColorName
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"ApprovalStatus.BackColorName\"
:alexa.entity-type :et-ApprovalStatus
:db.install/_attribute :db.part/db}

;;\"ApprovalStatus\",\"CreatedOn\",\"datetime\",\"NOT NULL\",\"[DF_ApprovalStatus_CreatedOn]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :ApprovalStatus/CreatedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"ApprovalStatus.CreatedOn\"
:alexa.entity-type :et-ApprovalStatus
:db.install/_attribute :db.part/db}

;;\"ApprovalStatus\",\"DeletedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :ApprovalStatus/DeletedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"ApprovalStatus.DeletedOn\"
:alexa.entity-type :et-ApprovalStatus
:db.install/_attribute :db.part/db}

;;\"ApprovalStatus\",\"Description\",\"[nvarchar](1024)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :ApprovalStatus/Description
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"ApprovalStatus.Description\"
:alexa.entity-type :et-ApprovalStatus
:db.install/_attribute :db.part/db}

;;\"ApprovalStatus\",\"FixedEntry\",\"bit\",\"NULL\",\"[DF_ApprovalStatus_FixedEntry]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :ApprovalStatus/FixedEntry
:db/valueType :db.type/boolean
:db/cardinality :db.cardinality/one
:db/doc \"ApprovalStatus.FixedEntry\"
:alexa.entity-type :et-ApprovalStatus
:db.install/_attribute :db.part/db}

;;\"ApprovalStatus\",\"ForeColorName\",\"[nvarchar](50)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :ApprovalStatus/ForeColorName
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"ApprovalStatus.ForeColorName\"
:alexa.entity-type :et-ApprovalStatus
:db.install/_attribute :db.part/db}

;;\"ApprovalStatus\",\"Id\",\"bigint\",\"NOT NULL\",\"\",\"IDENTITY\",\"PRIMARY KEY\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :ApprovalStatus/Id
:db/valueType :db.type/long
:db/cardinality :db.cardinality/one
:db/index true
:db/unique :db.unique/value
:db/doc \"ApprovalStatus.Id\"
:alexa.entity-type :et-ApprovalStatus
:db.install/_attribute :db.part/db}

;;\"ApprovalStatus\",\"ModifiedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :ApprovalStatus/ModifiedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"ApprovalStatus.ModifiedOn\"
:alexa.entity-type :et-ApprovalStatus
:db.install/_attribute :db.part/db}

;;\"ApprovalStatus\",\"Name\",\"[nvarchar](256)\",\"NOT NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :ApprovalStatus/Name
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"ApprovalStatus.Name\"
:alexa.entity-type :et-ApprovalStatus
:db.install/_attribute :db.part/db}

]"
"[;;\"Asset\",\"AssetClassId\",\"bigint\",\"NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :Asset/AssetClass
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(Asset AssetClassId AssetClass AssetClass)\"
:alexa.entity-type :et-Asset
:db.install/_attribute :db.part/db}

;;\"Asset\",\"AssetOrigin\",\"int\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Asset/AssetOrigin
:db/valueType :db.type/long
:db/cardinality :db.cardinality/one
:db/doc \"Asset.AssetOrigin\"
:alexa.entity-type :et-Asset
:db.install/_attribute :db.part/db}

;;\"Asset\",\"AssetTypeId\",\"bigint\",\"NOT NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :Asset/AssetType
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(Asset AssetTypeId AssetType AssetType)\"
:alexa.entity-type :et-Asset
:db.install/_attribute :db.part/db}

;;\"Asset\",\"CreatedOn\",\"datetime\",\"NOT NULL\",\"[DF_Asset_CreatedOn]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Asset/CreatedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"Asset.CreatedOn\"
:alexa.entity-type :et-Asset
:db.install/_attribute :db.part/db}

;;\"Asset\",\"Custodian_PersonId\",\"bigint\",\"NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :Asset/Custodian_Person
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(Asset Custodian_PersonId Person Custodian_Person)\"
:alexa.entity-type :et-Asset
:db.install/_attribute :db.part/db}

;;\"Asset\",\"DeletedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Asset/DeletedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"Asset.DeletedOn\"
:alexa.entity-type :et-Asset
:db.install/_attribute :db.part/db}

;;\"Asset\",\"Description\",\"[nvarchar](1024)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Asset/Description
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"Asset.Description\"
:alexa.entity-type :et-Asset
:db.install/_attribute :db.part/db}

;;\"Asset\",\"DomainName\",\"[nvarchar](256)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Asset/DomainName
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"Asset.DomainName\"
:alexa.entity-type :et-Asset
:db.install/_attribute :db.part/db}

;;\"Asset\",\"ExternalKey\",\"[nvarchar](50)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Asset/ExternalKey
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"Asset.ExternalKey\"
:alexa.entity-type :et-Asset
:db.install/_attribute :db.part/db}

;;\"Asset\",\"Hostname\",\"[nvarchar](256)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Asset/Hostname
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"Asset.Hostname\"
:alexa.entity-type :et-Asset
:db.install/_attribute :db.part/db}

;;\"Asset\",\"Id\",\"bigint\",\"NOT NULL\",\"\",\"IDENTITY\",\"PRIMARY KEY\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Asset/Id
:db/valueType :db.type/long
:db/cardinality :db.cardinality/one
:db/index true
:db/unique :db.unique/value
:db/doc \"Asset.Id\"
:alexa.entity-type :et-Asset
:db.install/_attribute :db.part/db}

;;\"Asset\",\"ImpactId\",\"bigint\",\"NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :Asset/Impact
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(Asset ImpactId Impact Impact)\"
:alexa.entity-type :et-Asset
:db.install/_attribute :db.part/db}

;;\"Asset\",\"IP_UInt128\",\"[binary](16)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Asset/IP_UInt128
:db/valueType :db.type/bigint
:db/cardinality :db.cardinality/one
:db/doc \"Asset.IP_UInt128\"
:alexa.entity-type :et-Asset
:db.install/_attribute :db.part/db}

;;\"Asset\",\"IPv6\",\"bit\",\"NULL\",\"[DF_Asset_IPv6]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Asset/IPv6
:db/valueType :db.type/boolean
:db/cardinality :db.cardinality/one
:db/doc \"Asset.IPv6\"
:alexa.entity-type :et-Asset
:db.install/_attribute :db.part/db}

;;\"Asset\",\"KeyField\",\"[nvarchar](50)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Asset/KeyField
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"Asset.KeyField\"
:alexa.entity-type :et-Asset
:db.install/_attribute :db.part/db}

;;\"Asset\",\"MAC_Address\",\"[nvarchar](50)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Asset/MAC_Address
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"Asset.MAC_Address\"
:alexa.entity-type :et-Asset
:db.install/_attribute :db.part/db}

;;\"Asset\",\"ModifiedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Asset/ModifiedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"Asset.ModifiedOn\"
:alexa.entity-type :et-Asset
:db.install/_attribute :db.part/db}

;;\"Asset\",\"NetBIOSName\",\"[nvarchar](20)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Asset/NetBIOSName
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"Asset.NetBIOSName\"
:alexa.entity-type :et-Asset
:db.install/_attribute :db.part/db}

;;\"Asset\",\"NetworkId\",\"bigint\",\"NOT NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :Asset/Network
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(Asset NetworkId Network Network)\"
:alexa.entity-type :et-Asset
:db.install/_attribute :db.part/db}

;;\"Asset\",\"OperatingSystemId\",\"bigint\",\"NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :Asset/OperatingSystem
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(Asset OperatingSystemId OperatingSystem OperatingSystem)\"
:alexa.entity-type :et-Asset
:db.install/_attribute :db.part/db}

;;\"Asset\",\"Owner_PersonId\",\"bigint\",\"NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :Asset/Owner_Person
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(Asset Owner_PersonId Person Owner_Person)\"
:alexa.entity-type :et-Asset
:db.install/_attribute :db.part/db}

;;\"Asset\",\"PhysicalAssetId\",\"bigint\",\"NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :Asset/PhysicalAsset
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(Asset PhysicalAssetId PhysicalAsset PhysicalAsset)\"
:alexa.entity-type :et-Asset
:db.install/_attribute :db.part/db}

;;\"Asset\",\"Url\",\"[nvarchar](350)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Asset/Url
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"Asset.Url\"
:alexa.entity-type :et-Asset
:db.install/_attribute :db.part/db}

{:db/id #db/id[:db.part/db]
:db/ident :Asset/Analysis
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/many
:db/doc \"(Asset AssetId AnalysisAsset AnalysisId Analysis)\"
:alexa.entity-type :et-Asset
:db.install/_attribute :db.part/db}

{:db/id #db/id[:db.part/db]
:db/ident :Asset/AssetGroup
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/many
:db/doc \"(Asset AssetId AssetGroupAsset AssetGroupId AssetGroup)\"
:alexa.entity-type :et-Asset
:db.install/_attribute :db.part/db}

{:db/id #db/id[:db.part/db]
:db/ident :Asset/Software
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/many
:db/doc \"(Asset AssetId AssetSoftware SoftwareId Software)\"
:alexa.entity-type :et-Asset
:db.install/_attribute :db.part/db}

{:db/id #db/id[:db.part/db]
:db/ident :Asset/DataType
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/many
:db/doc \"(Asset AssetId AssetDataType DataTypeId DataType)\"
:alexa.entity-type :et-Asset
:db.install/_attribute :db.part/db}

{:db/id #db/id[:db.part/db]
:db/ident :Asset/AttributeValue
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/many
:db/doc \"(Asset AssetId AssetAttributeValue AttributeValueId AttributeValue)\"
:alexa.entity-type :et-Asset
:db.install/_attribute :db.part/db}

{:db/id #db/id[:db.part/db]
:db/ident :Asset/Incident
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/many
:db/doc \"(Asset AssetId IncidentAsset IncidentId Incident)\"
:alexa.entity-type :et-Asset
:db.install/_attribute :db.part/db}

{:db/id #db/id[:db.part/db]
:db/ident :Asset/Standard
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/many
:db/doc \"(Asset AssetId StandardAsset StandardId Standard)\"
:alexa.entity-type :et-Asset
:db.install/_attribute :db.part/db}

]"
"[;;\"Asset_History\",\"AssetClassId\",\"bigint\",\"NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :Asset_History/AssetClass
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(Asset_History AssetClassId AssetClass AssetClass)\"
:alexa.entity-type :et-Asset_History
:db.install/_attribute :db.part/db}

;;\"Asset_History\",\"AssetId\",\"bigint\",\"NOT NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :Asset_History/Asset
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(Asset_History AssetId Asset Asset)\"
:alexa.entity-type :et-Asset_History
:db.install/_attribute :db.part/db}

;;\"Asset_History\",\"AssetTypeId\",\"bigint\",\"NOT NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :Asset_History/AssetType
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(Asset_History AssetTypeId AssetType AssetType)\"
:alexa.entity-type :et-Asset_History
:db.install/_attribute :db.part/db}

;;\"Asset_History\",\"ChangedBy_PersonId\",\"bigint\",\"NOT NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :Asset_History/ChangedBy_Person
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(Asset_History ChangedBy_PersonId Person ChangedBy_Person)\"
:alexa.entity-type :et-Asset_History
:db.install/_attribute :db.part/db}

;;\"Asset_History\",\"CreatedOn\",\"datetime\",\"NOT NULL\",\"[DF_Asset_History_CreatedOn]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Asset_History/CreatedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"Asset_History.CreatedOn\"
:alexa.entity-type :et-Asset_History
:db.install/_attribute :db.part/db}

;;\"Asset_History\",\"Custodian_PersonId\",\"bigint\",\"NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :Asset_History/Custodian_Person
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(Asset_History Custodian_PersonId Person Custodian_Person)\"
:alexa.entity-type :et-Asset_History
:db.install/_attribute :db.part/db}

;;\"Asset_History\",\"DeletedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Asset_History/DeletedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"Asset_History.DeletedOn\"
:alexa.entity-type :et-Asset_History
:db.install/_attribute :db.part/db}

;;\"Asset_History\",\"Id\",\"bigint\",\"NOT NULL\",\"\",\"IDENTITY\",\"PRIMARY KEY\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Asset_History/Id
:db/valueType :db.type/long
:db/cardinality :db.cardinality/one
:db/index true
:db/unique :db.unique/value
:db/doc \"Asset_History.Id\"
:alexa.entity-type :et-Asset_History
:db.install/_attribute :db.part/db}

;;\"Asset_History\",\"ImpactId\",\"bigint\",\"NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :Asset_History/Impact
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(Asset_History ImpactId Impact Impact)\"
:alexa.entity-type :et-Asset_History
:db.install/_attribute :db.part/db}

;;\"Asset_History\",\"ModifiedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Asset_History/ModifiedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"Asset_History.ModifiedOn\"
:alexa.entity-type :et-Asset_History
:db.install/_attribute :db.part/db}

;;\"Asset_History\",\"NetworkId\",\"bigint\",\"NOT NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :Asset_History/Network
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(Asset_History NetworkId Network Network)\"
:alexa.entity-type :et-Asset_History
:db.install/_attribute :db.part/db}

;;\"Asset_History\",\"Owner_PersonId\",\"bigint\",\"NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :Asset_History/Owner_Person
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(Asset_History Owner_PersonId Person Owner_Person)\"
:alexa.entity-type :et-Asset_History
:db.install/_attribute :db.part/db}

]"
"[;;\"AssetExposure\",\"AssetId\",\"bigint\",\"NOT NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :AssetExposure/Asset
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(AssetExposure AssetId Asset Asset)\"
:alexa.entity-type :et-AssetExposure
:db.install/_attribute :db.part/db}

;;\"AssetExposure\",\"CreatedOn\",\"datetime\",\"NOT NULL\",\"[DF_AssetExposure_CreatedOn]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :AssetExposure/CreatedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"AssetExposure.CreatedOn\"
:alexa.entity-type :et-AssetExposure
:db.install/_attribute :db.part/db}

;;\"AssetExposure\",\"DeletedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :AssetExposure/DeletedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"AssetExposure.DeletedOn\"
:alexa.entity-type :et-AssetExposure
:db.install/_attribute :db.part/db}

;;\"AssetExposure\",\"ExposureId\",\"bigint\",\"NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :AssetExposure/Exposure
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(AssetExposure ExposureId Exposure Exposure)\"
:alexa.entity-type :et-AssetExposure
:db.install/_attribute :db.part/db}

;;\"AssetExposure\",\"ExposureValue\",\"float\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :AssetExposure/ExposureValue
:db/valueType :db.type/float
:db/cardinality :db.cardinality/one
:db/doc \"AssetExposure.ExposureValue\"
:alexa.entity-type :et-AssetExposure
:db.install/_attribute :db.part/db}

;;\"AssetExposure\",\"Id\",\"bigint\",\"NOT NULL\",\"\",\"IDENTITY\",\"PRIMARY KEY\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :AssetExposure/Id
:db/valueType :db.type/long
:db/cardinality :db.cardinality/one
:db/index true
:db/unique :db.unique/value
:db/doc \"AssetExposure.Id\"
:alexa.entity-type :et-AssetExposure
:db.install/_attribute :db.part/db}

;;\"AssetExposure\",\"ModifiedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :AssetExposure/ModifiedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"AssetExposure.ModifiedOn\"
:alexa.entity-type :et-AssetExposure
:db.install/_attribute :db.part/db}

;;\"AssetExposure\",\"Port\",\"int\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :AssetExposure/Port
:db/valueType :db.type/long
:db/cardinality :db.cardinality/one
:db/doc \"AssetExposure.Port\"
:alexa.entity-type :et-AssetExposure
:db.install/_attribute :db.part/db}

;;\"AssetExposure\",\"ProtocolId\",\"bigint\",\"NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :AssetExposure/Protocol
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(AssetExposure ProtocolId Protocol Protocol)\"
:alexa.entity-type :et-AssetExposure
:db.install/_attribute :db.part/db}

;;\"AssetExposure\",\"ServiceId\",\"bigint\",\"NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :AssetExposure/Service
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(AssetExposure ServiceId Service Service)\"
:alexa.entity-type :et-AssetExposure
:db.install/_attribute :db.part/db}

;;\"AssetExposure\",\"VulnerabilityId\",\"bigint\",\"NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :AssetExposure/Vulnerability
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(AssetExposure VulnerabilityId Vulnerability Vulnerability)\"
:alexa.entity-type :et-AssetExposure
:db.install/_attribute :db.part/db}

{:db/id #db/id[:db.part/db]
:db/ident :AssetExposure/TechnicalScan
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/many
:db/doc \"(AssetExposure AssetExposureId AssetExposureTechnicalScan TechnicalScanId TechnicalScan)\"
:alexa.entity-type :et-AssetExposure
:db.install/_attribute :db.part/db}

]"
"[;;\"AssetExposureMitigationStatus\",\"AssetExposureId\",\"bigint\",\"NOT NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :AssetExposureMitigationStatus/AssetExposure
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(AssetExposureMitigationStatus AssetExposureId AssetExposure AssetExposure)\"
:alexa.entity-type :et-AssetExposureMitigationStatus
:db.install/_attribute :db.part/db}

;;\"AssetExposureMitigationStatus\",\"Comments\",\"[nvarchar](1024)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :AssetExposureMitigationStatus/Comments
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"AssetExposureMitigationStatus.Comments\"
:alexa.entity-type :et-AssetExposureMitigationStatus
:db.install/_attribute :db.part/db}

;;\"AssetExposureMitigationStatus\",\"CreatedOn\",\"datetime\",\"NOT NULL\",\"[DF_AssetExposureMitigationStatus_CreatedOn]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :AssetExposureMitigationStatus/CreatedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"AssetExposureMitigationStatus.CreatedOn\"
:alexa.entity-type :et-AssetExposureMitigationStatus
:db.install/_attribute :db.part/db}

;;\"AssetExposureMitigationStatus\",\"DeletedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :AssetExposureMitigationStatus/DeletedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"AssetExposureMitigationStatus.DeletedOn\"
:alexa.entity-type :et-AssetExposureMitigationStatus
:db.install/_attribute :db.part/db}

;;\"AssetExposureMitigationStatus\",\"ExpiresOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :AssetExposureMitigationStatus/ExpiresOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"AssetExposureMitigationStatus.ExpiresOn\"
:alexa.entity-type :et-AssetExposureMitigationStatus
:db.install/_attribute :db.part/db}

;;\"AssetExposureMitigationStatus\",\"ExplanationId\",\"bigint\",\"NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :AssetExposureMitigationStatus/Explanation
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(AssetExposureMitigationStatus ExplanationId Explanation Explanation)\"
:alexa.entity-type :et-AssetExposureMitigationStatus
:db.install/_attribute :db.part/db}

;;\"AssetExposureMitigationStatus\",\"Id\",\"bigint\",\"NOT NULL\",\"\",\"IDENTITY\",\"PRIMARY KEY\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :AssetExposureMitigationStatus/Id
:db/valueType :db.type/long
:db/cardinality :db.cardinality/one
:db/index true
:db/unique :db.unique/value
:db/doc \"AssetExposureMitigationStatus.Id\"
:alexa.entity-type :et-AssetExposureMitigationStatus
:db.install/_attribute :db.part/db}

;;\"AssetExposureMitigationStatus\",\"MitigationStatusId\",\"bigint\",\"NOT NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :AssetExposureMitigationStatus/MitigationStatus
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(AssetExposureMitigationStatus MitigationStatusId MitigationStatus MitigationStatus)\"
:alexa.entity-type :et-AssetExposureMitigationStatus
:db.install/_attribute :db.part/db}

;;\"AssetExposureMitigationStatus\",\"ModifiedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :AssetExposureMitigationStatus/ModifiedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"AssetExposureMitigationStatus.ModifiedOn\"
:alexa.entity-type :et-AssetExposureMitigationStatus
:db.install/_attribute :db.part/db}

;;\"AssetExposureMitigationStatus\",\"PersonId\",\"bigint\",\"NOT NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :AssetExposureMitigationStatus/Person
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(AssetExposureMitigationStatus PersonId Person Person)\"
:alexa.entity-type :et-AssetExposureMitigationStatus
:db.install/_attribute :db.part/db}

{:db/id #db/id[:db.part/db]
:db/ident :AssetExposureMitigationStatus/Task
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/many
:db/doc \"(AssetExposureMitigationStatus AssetExposureMitigationStatusId AssetExposureMitigationStatusTask TaskId Task)\"
:alexa.entity-type :et-AssetExposureMitigationStatus
:db.install/_attribute :db.part/db}

]"
"[;;\"AssetFilter\",\"AssetKey\",\"[nvarchar](256)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :AssetFilter/AssetKey
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"AssetFilter.AssetKey\"
:alexa.entity-type :et-AssetFilter
:db.install/_attribute :db.part/db}

;;\"AssetFilter\",\"CreatedOn\",\"datetime\",\"NOT NULL\",\"[DF_AssetFilter_CreatedOn]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :AssetFilter/CreatedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"AssetFilter.CreatedOn\"
:alexa.entity-type :et-AssetFilter
:db.install/_attribute :db.part/db}

;;\"AssetFilter\",\"CustodianPersonId\",\"bigint\",\"NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :AssetFilter/CustodianPerson
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(AssetFilter CustodianPersonId Person CustodianPerson)\"
:alexa.entity-type :et-AssetFilter
:db.install/_attribute :db.part/db}

;;\"AssetFilter\",\"DeletedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :AssetFilter/DeletedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"AssetFilter.DeletedOn\"
:alexa.entity-type :et-AssetFilter
:db.install/_attribute :db.part/db}

;;\"AssetFilter\",\"DomainName\",\"[nvarchar](256)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :AssetFilter/DomainName
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"AssetFilter.DomainName\"
:alexa.entity-type :et-AssetFilter
:db.install/_attribute :db.part/db}

;;\"AssetFilter\",\"Hostname\",\"[nvarchar](256)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :AssetFilter/Hostname
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"AssetFilter.Hostname\"
:alexa.entity-type :et-AssetFilter
:db.install/_attribute :db.part/db}

;;\"AssetFilter\",\"Id\",\"bigint\",\"NOT NULL\",\"\",\"IDENTITY\",\"PRIMARY KEY\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :AssetFilter/Id
:db/valueType :db.type/long
:db/cardinality :db.cardinality/one
:db/index true
:db/unique :db.unique/value
:db/doc \"AssetFilter.Id\"
:alexa.entity-type :et-AssetFilter
:db.install/_attribute :db.part/db}

;;\"AssetFilter\",\"IncludeDeleted\",\"bit\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :AssetFilter/IncludeDeleted
:db/valueType :db.type/boolean
:db/cardinality :db.cardinality/one
:db/doc \"AssetFilter.IncludeDeleted\"
:alexa.entity-type :et-AssetFilter
:db.install/_attribute :db.part/db}

;;\"AssetFilter\",\"IPAddress\",\"[nvarchar](50)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :AssetFilter/IPAddress
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"AssetFilter.IPAddress\"
:alexa.entity-type :et-AssetFilter
:db.install/_attribute :db.part/db}

;;\"AssetFilter\",\"ModifiedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :AssetFilter/ModifiedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"AssetFilter.ModifiedOn\"
:alexa.entity-type :et-AssetFilter
:db.install/_attribute :db.part/db}

;;\"AssetFilter\",\"NetworkId\",\"bigint\",\"NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :AssetFilter/Network
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(AssetFilter NetworkId Network Network)\"
:alexa.entity-type :et-AssetFilter
:db.install/_attribute :db.part/db}

;;\"AssetFilter\",\"OwnerPersonId\",\"bigint\",\"NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :AssetFilter/OwnerPerson
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(AssetFilter OwnerPersonId Person OwnerPerson)\"
:alexa.entity-type :et-AssetFilter
:db.install/_attribute :db.part/db}

;;\"AssetFilter\",\"RemainingOnly\",\"bit\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :AssetFilter/RemainingOnly
:db/valueType :db.type/boolean
:db/cardinality :db.cardinality/one
:db/doc \"AssetFilter.RemainingOnly\"
:alexa.entity-type :et-AssetFilter
:db.install/_attribute :db.part/db}

;;\"AssetFilter\",\"SubnetId\",\"bigint\",\"NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :AssetFilter/Subnet
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(AssetFilter SubnetId Subnet Subnet)\"
:alexa.entity-type :et-AssetFilter
:db.install/_attribute :db.part/db}

{:db/id #db/id[:db.part/db]
:db/ident :AssetFilter/Analysis
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/many
:db/doc \"(AssetFilter AssetFilterId AnalysisAssetFilter AnalysisId Analysis)\"
:alexa.entity-type :et-AssetFilter
:db.install/_attribute :db.part/db}

{:db/id #db/id[:db.part/db]
:db/ident :AssetFilter/AssetClass
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/many
:db/doc \"(AssetFilter AssetFilterId AssetFilterAssetClass AssetClassId AssetClass)\"
:alexa.entity-type :et-AssetFilter
:db.install/_attribute :db.part/db}

{:db/id #db/id[:db.part/db]
:db/ident :AssetFilter/AssetType
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/many
:db/doc \"(AssetFilter AssetFilterId AssetFilterAssetType AssetTypeId AssetType)\"
:alexa.entity-type :et-AssetFilter
:db.install/_attribute :db.part/db}

{:db/id #db/id[:db.part/db]
:db/ident :AssetFilter/Impact
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/many
:db/doc \"(AssetFilter AssetFilterId AssetFilterImpact ImpactId Impact)\"
:alexa.entity-type :et-AssetFilter
:db.install/_attribute :db.part/db}

{:db/id #db/id[:db.part/db]
:db/ident :AssetFilter/OperatingSystem
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/many
:db/doc \"(AssetFilter AssetFilterId AssetFilterOperatingSystem OperatingSystemId OperatingSystem)\"
:alexa.entity-type :et-AssetFilter
:db.install/_attribute :db.part/db}

{:db/id #db/id[:db.part/db]
:db/ident :AssetFilter/Standard
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/many
:db/doc \"(AssetFilter AssetFilterId AssetFilterStandard StandardId Standard)\"
:alexa.entity-type :et-AssetFilter
:db.install/_attribute :db.part/db}

]"
"[;;\"AssetGroup\",\"AssetFilterData\",\"[varbinary](MAX)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :AssetGroup/AssetFilterData
:db/valueType :db.type/uri
:db/cardinality :db.cardinality/one
:db/doc \"AssetGroup.AssetFilterData\"
:alexa.entity-type :et-AssetGroup
:db.install/_attribute :db.part/db}

;;\"AssetGroup\",\"AssetGroupTypeId\",\"bigint\",\"NOT NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :AssetGroup/AssetGroupType
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(AssetGroup AssetGroupTypeId AssetGroupType AssetGroupType)\"
:alexa.entity-type :et-AssetGroup
:db.install/_attribute :db.part/db}

;;\"AssetGroup\",\"CreatedOn\",\"datetime\",\"NOT NULL\",\"[DF_AssetGroup_CreatedOn]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :AssetGroup/CreatedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"AssetGroup.CreatedOn\"
:alexa.entity-type :et-AssetGroup
:db.install/_attribute :db.part/db}

;;\"AssetGroup\",\"DeletedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :AssetGroup/DeletedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"AssetGroup.DeletedOn\"
:alexa.entity-type :et-AssetGroup
:db.install/_attribute :db.part/db}

;;\"AssetGroup\",\"Description\",\"[nvarchar](1024)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :AssetGroup/Description
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"AssetGroup.Description\"
:alexa.entity-type :et-AssetGroup
:db.install/_attribute :db.part/db}

;;\"AssetGroup\",\"ExternalKey\",\"[nvarchar](100)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :AssetGroup/ExternalKey
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"AssetGroup.ExternalKey\"
:alexa.entity-type :et-AssetGroup
:db.install/_attribute :db.part/db}

;;\"AssetGroup\",\"Id\",\"bigint\",\"NOT NULL\",\"\",\"IDENTITY\",\"PRIMARY KEY\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :AssetGroup/Id
:db/valueType :db.type/long
:db/cardinality :db.cardinality/one
:db/index true
:db/unique :db.unique/value
:db/doc \"AssetGroup.Id\"
:alexa.entity-type :et-AssetGroup
:db.install/_attribute :db.part/db}

;;\"AssetGroup\",\"ModifiedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :AssetGroup/ModifiedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"AssetGroup.ModifiedOn\"
:alexa.entity-type :et-AssetGroup
:db.install/_attribute :db.part/db}

;;\"AssetGroup\",\"Name\",\"[nvarchar](256)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :AssetGroup/Name
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"AssetGroup.Name\"
:alexa.entity-type :et-AssetGroup
:db.install/_attribute :db.part/db}

;;\"AssetGroup\",\"NetworkId\",\"bigint\",\"NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :AssetGroup/Network
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(AssetGroup NetworkId Network Network)\"
:alexa.entity-type :et-AssetGroup
:db.install/_attribute :db.part/db}

;;\"AssetGroup\",\"SubnetId\",\"bigint\",\"NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :AssetGroup/Subnet
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(AssetGroup SubnetId Subnet Subnet)\"
:alexa.entity-type :et-AssetGroup
:db.install/_attribute :db.part/db}

{:db/id #db/id[:db.part/db]
:db/ident :AssetGroup/Analysis
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/many
:db/doc \"(AssetGroup AssetGroupId AnalysisAssetGroup AnalysisId Analysis)\"
:alexa.entity-type :et-AssetGroup
:db.install/_attribute :db.part/db}

{:db/id #db/id[:db.part/db]
:db/ident :AssetGroup/Asset
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/many
:db/doc \"(AssetGroup AssetGroupId AssetGroupAsset AssetId Asset)\"
:alexa.entity-type :et-AssetGroup
:db.install/_attribute :db.part/db}

{:db/id #db/id[:db.part/db]
:db/ident :AssetGroup/AttributeValue
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/many
:db/doc \"(AssetGroup AssetGroupId AssetGroupAttributeValue AttributeValueId AttributeValue)\"
:alexa.entity-type :et-AssetGroup
:db.install/_attribute :db.part/db}

{:db/id #db/id[:db.part/db]
:db/ident :AssetGroup/BusinessUnit
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/many
:db/doc \"(AssetGroup AssetGroupId AssetGroupBusinessUnit BusinessUnitId BusinessUnit)\"
:alexa.entity-type :et-AssetGroup
:db.install/_attribute :db.part/db}

{:db/id #db/id[:db.part/db]
:db/ident :AssetGroup/DataType
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/many
:db/doc \"(AssetGroup AssetGroupId AssetGroupDataType DataTypeId DataType)\"
:alexa.entity-type :et-AssetGroup
:db.install/_attribute :db.part/db}

{:db/id #db/id[:db.part/db]
:db/ident :AssetGroup/Person
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/many
:db/doc \"(AssetGroup AssetGroupId AssetGroupPerson PersonId Person)\"
:alexa.entity-type :et-AssetGroup
:db.install/_attribute :db.part/db}

{:db/id #db/id[:db.part/db]
:db/ident :AssetGroup/Incident
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/many
:db/doc \"(AssetGroup AssetGroupId IncidentAssetGroup IncidentId Incident)\"
:alexa.entity-type :et-AssetGroup
:db.install/_attribute :db.part/db}

]"
"[;;\"AssetGroupBusinessMetric\",\"Amount\",\"float\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :AssetGroupBusinessMetric/Amount
:db/valueType :db.type/float
:db/cardinality :db.cardinality/one
:db/doc \"AssetGroupBusinessMetric.Amount\"
:alexa.entity-type :et-AssetGroupBusinessMetric
:db.install/_attribute :db.part/db}

;;\"AssetGroupBusinessMetric\",\"AssetGroupId\",\"bigint\",\"NOT NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :AssetGroupBusinessMetric/AssetGroup
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(AssetGroupBusinessMetric AssetGroupId AssetGroup AssetGroup)\"
:alexa.entity-type :et-AssetGroupBusinessMetric
:db.install/_attribute :db.part/db}

;;\"AssetGroupBusinessMetric\",\"BusinessMetricId\",\"bigint\",\"NOT NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :AssetGroupBusinessMetric/BusinessMetric
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(AssetGroupBusinessMetric BusinessMetricId BusinessMetric BusinessMetric)\"
:alexa.entity-type :et-AssetGroupBusinessMetric
:db.install/_attribute :db.part/db}

;;\"AssetGroupBusinessMetric\",\"CreatedOn\",\"datetime\",\"NOT NULL\",\"[DF_AssetGroupBusinessMetric_CreatedOn]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :AssetGroupBusinessMetric/CreatedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"AssetGroupBusinessMetric.CreatedOn\"
:alexa.entity-type :et-AssetGroupBusinessMetric
:db.install/_attribute :db.part/db}

;;\"AssetGroupBusinessMetric\",\"DeletedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :AssetGroupBusinessMetric/DeletedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"AssetGroupBusinessMetric.DeletedOn\"
:alexa.entity-type :et-AssetGroupBusinessMetric
:db.install/_attribute :db.part/db}

;;\"AssetGroupBusinessMetric\",\"EffectiveDate\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :AssetGroupBusinessMetric/EffectiveDate
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"AssetGroupBusinessMetric.EffectiveDate\"
:alexa.entity-type :et-AssetGroupBusinessMetric
:db.install/_attribute :db.part/db}

;;\"AssetGroupBusinessMetric\",\"Id\",\"bigint\",\"NOT NULL\",\"\",\"IDENTITY\",\"PRIMARY KEY\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :AssetGroupBusinessMetric/Id
:db/valueType :db.type/long
:db/cardinality :db.cardinality/one
:db/index true
:db/unique :db.unique/value
:db/doc \"AssetGroupBusinessMetric.Id\"
:alexa.entity-type :et-AssetGroupBusinessMetric
:db.install/_attribute :db.part/db}

;;\"AssetGroupBusinessMetric\",\"ModifiedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :AssetGroupBusinessMetric/ModifiedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"AssetGroupBusinessMetric.ModifiedOn\"
:alexa.entity-type :et-AssetGroupBusinessMetric
:db.install/_attribute :db.part/db}

]"
"[;;\"AssetGroupType\",\"CreatedOn\",\"datetime\",\"NOT NULL\",\"[DF_AssetGroupType_CreatedOn]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :AssetGroupType/CreatedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"AssetGroupType.CreatedOn\"
:alexa.entity-type :et-AssetGroupType
:db.install/_attribute :db.part/db}

;;\"AssetGroupType\",\"DeletedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :AssetGroupType/DeletedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"AssetGroupType.DeletedOn\"
:alexa.entity-type :et-AssetGroupType
:db.install/_attribute :db.part/db}

;;\"AssetGroupType\",\"Description\",\"[nvarchar](1024)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :AssetGroupType/Description
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"AssetGroupType.Description\"
:alexa.entity-type :et-AssetGroupType
:db.install/_attribute :db.part/db}

;;\"AssetGroupType\",\"Id\",\"bigint\",\"NOT NULL\",\"\",\"IDENTITY\",\"PRIMARY KEY\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :AssetGroupType/Id
:db/valueType :db.type/long
:db/cardinality :db.cardinality/one
:db/index true
:db/unique :db.unique/value
:db/doc \"AssetGroupType.Id\"
:alexa.entity-type :et-AssetGroupType
:db.install/_attribute :db.part/db}

;;\"AssetGroupType\",\"ModifiedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :AssetGroupType/ModifiedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"AssetGroupType.ModifiedOn\"
:alexa.entity-type :et-AssetGroupType
:db.install/_attribute :db.part/db}

;;\"AssetGroupType\",\"Name\",\"[nvarchar](256)\",\"NOT NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :AssetGroupType/Name
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"AssetGroupType.Name\"
:alexa.entity-type :et-AssetGroupType
:db.install/_attribute :db.part/db}

]"
"[;;\"AssetImpact\",\"AssetId\",\"bigint\",\"NOT NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :AssetImpact/Asset
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(AssetImpact AssetId Asset Asset)\"
:alexa.entity-type :et-AssetImpact
:db.install/_attribute :db.part/db}

;;\"AssetImpact\",\"CreatedOn\",\"datetime\",\"NOT NULL\",\"[DF_AssetImpact_CreatedOn]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :AssetImpact/CreatedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"AssetImpact.CreatedOn\"
:alexa.entity-type :et-AssetImpact
:db.install/_attribute :db.part/db}

;;\"AssetImpact\",\"DeletedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :AssetImpact/DeletedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"AssetImpact.DeletedOn\"
:alexa.entity-type :et-AssetImpact
:db.install/_attribute :db.part/db}

;;\"AssetImpact\",\"Id\",\"bigint\",\"NOT NULL\",\"\",\"IDENTITY\",\"PRIMARY KEY\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :AssetImpact/Id
:db/valueType :db.type/long
:db/cardinality :db.cardinality/one
:db/index true
:db/unique :db.unique/value
:db/doc \"AssetImpact.Id\"
:alexa.entity-type :et-AssetImpact
:db.install/_attribute :db.part/db}

;;\"AssetImpact\",\"ImpactId\",\"bigint\",\"NOT NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :AssetImpact/Impact
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(AssetImpact ImpactId Impact Impact)\"
:alexa.entity-type :et-AssetImpact
:db.install/_attribute :db.part/db}

;;\"AssetImpact\",\"ImpactTypeId\",\"bigint\",\"NOT NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :AssetImpact/ImpactType
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(AssetImpact ImpactTypeId ImpactType ImpactType)\"
:alexa.entity-type :et-AssetImpact
:db.install/_attribute :db.part/db}

;;\"AssetImpact\",\"ModifiedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :AssetImpact/ModifiedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"AssetImpact.ModifiedOn\"
:alexa.entity-type :et-AssetImpact
:db.install/_attribute :db.part/db}

]"
"[;;\"AssetClass\",\"BackColorName\",\"[nvarchar](50)\",\"NULL\",\"[DF_AssetClass_BackColorName]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :AssetClass/BackColorName
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"AssetClass.BackColorName\"
:alexa.entity-type :et-AssetClass
:db.install/_attribute :db.part/db}

;;\"AssetClass\",\"CreatedOn\",\"datetime\",\"NOT NULL\",\"[DF_AssetClass_CreatedOn]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :AssetClass/CreatedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"AssetClass.CreatedOn\"
:alexa.entity-type :et-AssetClass
:db.install/_attribute :db.part/db}

;;\"AssetClass\",\"DeletedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :AssetClass/DeletedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"AssetClass.DeletedOn\"
:alexa.entity-type :et-AssetClass
:db.install/_attribute :db.part/db}

;;\"AssetClass\",\"Description\",\"[nvarchar](1024)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :AssetClass/Description
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"AssetClass.Description\"
:alexa.entity-type :et-AssetClass
:db.install/_attribute :db.part/db}

;;\"AssetClass\",\"ForeColorName\",\"[nvarchar](50)\",\"NULL\",\"[DF_AssetClass_ForeColorName]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :AssetClass/ForeColorName
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"AssetClass.ForeColorName\"
:alexa.entity-type :et-AssetClass
:db.install/_attribute :db.part/db}

;;\"AssetClass\",\"Id\",\"bigint\",\"NOT NULL\",\"\",\"IDENTITY\",\"PRIMARY KEY\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :AssetClass/Id
:db/valueType :db.type/long
:db/cardinality :db.cardinality/one
:db/index true
:db/unique :db.unique/value
:db/doc \"AssetClass.Id\"
:alexa.entity-type :et-AssetClass
:db.install/_attribute :db.part/db}

;;\"AssetClass\",\"ImpactId\",\"bigint\",\"NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :AssetClass/Impact
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(AssetClass ImpactId Impact Impact)\"
:alexa.entity-type :et-AssetClass
:db.install/_attribute :db.part/db}

;;\"AssetClass\",\"Importance\",\"float\",\"NULL\",\"[DF_AssetClass_Number]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :AssetClass/Importance
:db/valueType :db.type/float
:db/cardinality :db.cardinality/one
:db/doc \"AssetClass.Importance\"
:alexa.entity-type :et-AssetClass
:db.install/_attribute :db.part/db}

;;\"AssetClass\",\"ModifiedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :AssetClass/ModifiedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"AssetClass.ModifiedOn\"
:alexa.entity-type :et-AssetClass
:db.install/_attribute :db.part/db}

;;\"AssetClass\",\"Name\",\"[nvarchar](256)\",\"NOT NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :AssetClass/Name
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"AssetClass.Name\"
:alexa.entity-type :et-AssetClass
:db.install/_attribute :db.part/db}

{:db/id #db/id[:db.part/db]
:db/ident :AssetClass/AssetFilter
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/many
:db/doc \"(AssetClass AssetClassId AssetFilterAssetClass AssetFilterId AssetFilter)\"
:alexa.entity-type :et-AssetClass
:db.install/_attribute :db.part/db}

]"
"[;;\"AssetType\",\"Abbreviation\",\"[nvarchar](20)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :AssetType/Abbreviation
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"AssetType.Abbreviation\"
:alexa.entity-type :et-AssetType
:db.install/_attribute :db.part/db}

;;\"AssetType\",\"CreatedOn\",\"datetime\",\"NOT NULL\",\"[DF_AssetType_CreatedOn]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :AssetType/CreatedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"AssetType.CreatedOn\"
:alexa.entity-type :et-AssetType
:db.install/_attribute :db.part/db}

;;\"AssetType\",\"DeletedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :AssetType/DeletedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"AssetType.DeletedOn\"
:alexa.entity-type :et-AssetType
:db.install/_attribute :db.part/db}

;;\"AssetType\",\"Description\",\"[nvarchar](1024)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :AssetType/Description
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"AssetType.Description\"
:alexa.entity-type :et-AssetType
:db.install/_attribute :db.part/db}

;;\"AssetType\",\"Id\",\"bigint\",\"NOT NULL\",\"\",\"IDENTITY\",\"PRIMARY KEY\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :AssetType/Id
:db/valueType :db.type/long
:db/cardinality :db.cardinality/one
:db/index true
:db/unique :db.unique/value
:db/doc \"AssetType.Id\"
:alexa.entity-type :et-AssetType
:db.install/_attribute :db.part/db}

;;\"AssetType\",\"ModifiedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :AssetType/ModifiedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"AssetType.ModifiedOn\"
:alexa.entity-type :et-AssetType
:db.install/_attribute :db.part/db}

;;\"AssetType\",\"Name\",\"[nvarchar](256)\",\"NOT NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :AssetType/Name
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"AssetType.Name\"
:alexa.entity-type :et-AssetType
:db.install/_attribute :db.part/db}

{:db/id #db/id[:db.part/db]
:db/ident :AssetType/AssetFilter
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/many
:db/doc \"(AssetType AssetTypeId AssetFilterAssetType AssetFilterId AssetFilter)\"
:alexa.entity-type :et-AssetType
:db.install/_attribute :db.part/db}

{:db/id #db/id[:db.part/db]
:db/ident :AssetType/Role
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/many
:db/doc \"(AssetType AssetTypeId AssetTypeRole RoleId Role)\"
:alexa.entity-type :et-AssetType
:db.install/_attribute :db.part/db}

]"
"[;;\"AssetVulnerability\",\"AssetId\",\"bigint\",\"NOT NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :AssetVulnerability/Asset
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(AssetVulnerability AssetId Asset Asset)\"
:alexa.entity-type :et-AssetVulnerability
:db.install/_attribute :db.part/db}

;;\"AssetVulnerability\",\"CreatedOn\",\"datetime\",\"NOT NULL\",\"[DF_AssetVulnerability_CreatedOn]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :AssetVulnerability/CreatedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"AssetVulnerability.CreatedOn\"
:alexa.entity-type :et-AssetVulnerability
:db.install/_attribute :db.part/db}

;;\"AssetVulnerability\",\"DeletedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :AssetVulnerability/DeletedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"AssetVulnerability.DeletedOn\"
:alexa.entity-type :et-AssetVulnerability
:db.install/_attribute :db.part/db}

;;\"AssetVulnerability\",\"Id\",\"bigint\",\"NOT NULL\",\"\",\"IDENTITY\",\"PRIMARY KEY\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :AssetVulnerability/Id
:db/valueType :db.type/long
:db/cardinality :db.cardinality/one
:db/index true
:db/unique :db.unique/value
:db/doc \"AssetVulnerability.Id\"
:alexa.entity-type :et-AssetVulnerability
:db.install/_attribute :db.part/db}

;;\"AssetVulnerability\",\"ModifiedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :AssetVulnerability/ModifiedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"AssetVulnerability.ModifiedOn\"
:alexa.entity-type :et-AssetVulnerability
:db.install/_attribute :db.part/db}

;;\"AssetVulnerability\",\"Port\",\"int\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :AssetVulnerability/Port
:db/valueType :db.type/long
:db/cardinality :db.cardinality/one
:db/doc \"AssetVulnerability.Port\"
:alexa.entity-type :et-AssetVulnerability
:db.install/_attribute :db.part/db}

;;\"AssetVulnerability\",\"ProtocolId\",\"bigint\",\"NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :AssetVulnerability/Protocol
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(AssetVulnerability ProtocolId Protocol Protocol)\"
:alexa.entity-type :et-AssetVulnerability
:db.install/_attribute :db.part/db}

;;\"AssetVulnerability\",\"ServiceId\",\"bigint\",\"NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :AssetVulnerability/Service
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(AssetVulnerability ServiceId Service Service)\"
:alexa.entity-type :et-AssetVulnerability
:db.install/_attribute :db.part/db}

;;\"AssetVulnerability\",\"VulnerabilityId\",\"bigint\",\"NOT NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :AssetVulnerability/Vulnerability
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(AssetVulnerability VulnerabilityId Vulnerability Vulnerability)\"
:alexa.entity-type :et-AssetVulnerability
:db.install/_attribute :db.part/db}

{:db/id #db/id[:db.part/db]
:db/ident :AssetVulnerability/DataFile
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/many
:db/doc \"(AssetVulnerability AssetVulnerabilityId AssetVulnerabilityReference ReferenceId Reference)\"
:alexa.entity-type :et-AssetVulnerability
:db.install/_attribute :db.part/db}

]"
"[;;\"AssetVulnerabilityAddendum\",\"AssetVulnerabilityId\",\"bigint\",\"NOT NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :AssetVulnerabilityAddendum/AssetVulnerability
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(AssetVulnerabilityAddendum AssetVulnerabilityId AssetVulnerability AssetVulnerability)\"
:alexa.entity-type :et-AssetVulnerabilityAddendum
:db.install/_attribute :db.part/db}

;;\"AssetVulnerabilityAddendum\",\"CreatedOn\",\"datetime\",\"NOT NULL\",\"[DF_AssetVulnerabilityAddendum_CreatedOn]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :AssetVulnerabilityAddendum/CreatedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"AssetVulnerabilityAddendum.CreatedOn\"
:alexa.entity-type :et-AssetVulnerabilityAddendum
:db.install/_attribute :db.part/db}

;;\"AssetVulnerabilityAddendum\",\"DeletedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :AssetVulnerabilityAddendum/DeletedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"AssetVulnerabilityAddendum.DeletedOn\"
:alexa.entity-type :et-AssetVulnerabilityAddendum
:db.install/_attribute :db.part/db}

;;\"AssetVulnerabilityAddendum\",\"Id\",\"bigint\",\"NOT NULL\",\"\",\"IDENTITY\",\"PRIMARY KEY\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :AssetVulnerabilityAddendum/Id
:db/valueType :db.type/long
:db/cardinality :db.cardinality/one
:db/index true
:db/unique :db.unique/value
:db/doc \"AssetVulnerabilityAddendum.Id\"
:alexa.entity-type :et-AssetVulnerabilityAddendum
:db.install/_attribute :db.part/db}

;;\"AssetVulnerabilityAddendum\",\"ModifiedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :AssetVulnerabilityAddendum/ModifiedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"AssetVulnerabilityAddendum.ModifiedOn\"
:alexa.entity-type :et-AssetVulnerabilityAddendum
:db.install/_attribute :db.part/db}

;;\"AssetVulnerabilityAddendum\",\"TechnicalScanId\",\"bigint\",\"NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :AssetVulnerabilityAddendum/TechnicalScan
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(AssetVulnerabilityAddendum TechnicalScanId TechnicalScan TechnicalScan)\"
:alexa.entity-type :et-AssetVulnerabilityAddendum
:db.install/_attribute :db.part/db}

;;\"AssetVulnerabilityAddendum\",\"Text\",\"[nvarchar](MAX)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :AssetVulnerabilityAddendum/Text
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"AssetVulnerabilityAddendum.Text\"
:alexa.entity-type :et-AssetVulnerabilityAddendum
:db.install/_attribute :db.part/db}

;;\"AssetVulnerabilityAddendum\",\"Title\",\"[nvarchar](50)\",\"NOT NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :AssetVulnerabilityAddendum/Title
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"AssetVulnerabilityAddendum.Title\"
:alexa.entity-type :et-AssetVulnerabilityAddendum
:db.install/_attribute :db.part/db}

]"
"[;;\"AssetVulnerabilityMitigationStatus\",\"AssetVulnerabilityId\",\"bigint\",\"NOT NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :AssetVulnerabilityMitigationStatus/AssetVulnerability
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(AssetVulnerabilityMitigationStatus AssetVulnerabilityId AssetVulnerability AssetVulnerability)\"
:alexa.entity-type :et-AssetVulnerabilityMitigationStatus
:db.install/_attribute :db.part/db}

;;\"AssetVulnerabilityMitigationStatus\",\"Comments\",\"[nvarchar](1024)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :AssetVulnerabilityMitigationStatus/Comments
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"AssetVulnerabilityMitigationStatus.Comments\"
:alexa.entity-type :et-AssetVulnerabilityMitigationStatus
:db.install/_attribute :db.part/db}

;;\"AssetVulnerabilityMitigationStatus\",\"CreatedOn\",\"datetime\",\"NOT NULL\",\"[DF_AssetVulnerabilityMitigationStatus_CreatedOn]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :AssetVulnerabilityMitigationStatus/CreatedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"AssetVulnerabilityMitigationStatus.CreatedOn\"
:alexa.entity-type :et-AssetVulnerabilityMitigationStatus
:db.install/_attribute :db.part/db}

;;\"AssetVulnerabilityMitigationStatus\",\"DeletedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :AssetVulnerabilityMitigationStatus/DeletedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"AssetVulnerabilityMitigationStatus.DeletedOn\"
:alexa.entity-type :et-AssetVulnerabilityMitigationStatus
:db.install/_attribute :db.part/db}

;;\"AssetVulnerabilityMitigationStatus\",\"ExpiresOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :AssetVulnerabilityMitigationStatus/ExpiresOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"AssetVulnerabilityMitigationStatus.ExpiresOn\"
:alexa.entity-type :et-AssetVulnerabilityMitigationStatus
:db.install/_attribute :db.part/db}

;;\"AssetVulnerabilityMitigationStatus\",\"ExplanationId\",\"bigint\",\"NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :AssetVulnerabilityMitigationStatus/Explanation
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(AssetVulnerabilityMitigationStatus ExplanationId Explanation Explanation)\"
:alexa.entity-type :et-AssetVulnerabilityMitigationStatus
:db.install/_attribute :db.part/db}

;;\"AssetVulnerabilityMitigationStatus\",\"Id\",\"bigint\",\"NOT NULL\",\"\",\"IDENTITY\",\"PRIMARY KEY\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :AssetVulnerabilityMitigationStatus/Id
:db/valueType :db.type/long
:db/cardinality :db.cardinality/one
:db/index true
:db/unique :db.unique/value
:db/doc \"AssetVulnerabilityMitigationStatus.Id\"
:alexa.entity-type :et-AssetVulnerabilityMitigationStatus
:db.install/_attribute :db.part/db}

;;\"AssetVulnerabilityMitigationStatus\",\"MitigationStatusId\",\"bigint\",\"NOT NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :AssetVulnerabilityMitigationStatus/MitigationStatus
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(AssetVulnerabilityMitigationStatus MitigationStatusId MitigationStatus MitigationStatus)\"
:alexa.entity-type :et-AssetVulnerabilityMitigationStatus
:db.install/_attribute :db.part/db}

;;\"AssetVulnerabilityMitigationStatus\",\"ModifiedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :AssetVulnerabilityMitigationStatus/ModifiedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"AssetVulnerabilityMitigationStatus.ModifiedOn\"
:alexa.entity-type :et-AssetVulnerabilityMitigationStatus
:db.install/_attribute :db.part/db}

;;\"AssetVulnerabilityMitigationStatus\",\"PersonId\",\"bigint\",\"NOT NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :AssetVulnerabilityMitigationStatus/Person
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(AssetVulnerabilityMitigationStatus PersonId Person Person)\"
:alexa.entity-type :et-AssetVulnerabilityMitigationStatus
:db.install/_attribute :db.part/db}

{:db/id #db/id[:db.part/db]
:db/ident :AssetVulnerabilityMitigationStatus/Task
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/many
:db/doc \"(AssetVulnerabilityMitigationStatus AssetVulnerabilityMitigationStatusId AssetVulnerabilityMitigationStatusTask TaskId Task)\"
:alexa.entity-type :et-AssetVulnerabilityMitigationStatus
:db.install/_attribute :db.part/db}

]"
"[;;\"AssetVulnerabilityTechnicalScan\",\"AssetVulnerabilityId\",\"bigint\",\"NOT NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :AssetVulnerabilityTechnicalScan/AssetVulnerability
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(AssetVulnerabilityTechnicalScan AssetVulnerabilityId AssetVulnerability AssetVulnerability)\"
:alexa.entity-type :et-AssetVulnerabilityTechnicalScan
:db.install/_attribute :db.part/db}

;;\"AssetVulnerabilityTechnicalScan\",\"CreatedOn\",\"datetime\",\"NOT NULL\",\"[DF_AssetVulnerabilityTechnicalScan_CreatedOn]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :AssetVulnerabilityTechnicalScan/CreatedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"AssetVulnerabilityTechnicalScan.CreatedOn\"
:alexa.entity-type :et-AssetVulnerabilityTechnicalScan
:db.install/_attribute :db.part/db}

;;\"AssetVulnerabilityTechnicalScan\",\"DeletedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :AssetVulnerabilityTechnicalScan/DeletedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"AssetVulnerabilityTechnicalScan.DeletedOn\"
:alexa.entity-type :et-AssetVulnerabilityTechnicalScan
:db.install/_attribute :db.part/db}

;;\"AssetVulnerabilityTechnicalScan\",\"DetectionStatusId\",\"bigint\",\"NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :AssetVulnerabilityTechnicalScan/DetectionStatus
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(AssetVulnerabilityTechnicalScan DetectionStatusId DetectionStatus DetectionStatus)\"
:alexa.entity-type :et-AssetVulnerabilityTechnicalScan
:db.install/_attribute :db.part/db}

;;\"AssetVulnerabilityTechnicalScan\",\"DetectionTypeId\",\"bigint\",\"NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :AssetVulnerabilityTechnicalScan/DetectionType
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(AssetVulnerabilityTechnicalScan DetectionTypeId DetectionType DetectionType)\"
:alexa.entity-type :et-AssetVulnerabilityTechnicalScan
:db.install/_attribute :db.part/db}

;;\"AssetVulnerabilityTechnicalScan\",\"Id\",\"bigint\",\"NOT NULL\",\"\",\"IDENTITY\",\"PRIMARY KEY\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :AssetVulnerabilityTechnicalScan/Id
:db/valueType :db.type/long
:db/cardinality :db.cardinality/one
:db/index true
:db/unique :db.unique/value
:db/doc \"AssetVulnerabilityTechnicalScan.Id\"
:alexa.entity-type :et-AssetVulnerabilityTechnicalScan
:db.install/_attribute :db.part/db}

;;\"AssetVulnerabilityTechnicalScan\",\"ModifiedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :AssetVulnerabilityTechnicalScan/ModifiedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"AssetVulnerabilityTechnicalScan.ModifiedOn\"
:alexa.entity-type :et-AssetVulnerabilityTechnicalScan
:db.install/_attribute :db.part/db}

;;\"AssetVulnerabilityTechnicalScan\",\"TechnicalScanId\",\"bigint\",\"NOT NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :AssetVulnerabilityTechnicalScan/TechnicalScan
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(AssetVulnerabilityTechnicalScan TechnicalScanId TechnicalScan TechnicalScan)\"
:alexa.entity-type :et-AssetVulnerabilityTechnicalScan
:db.install/_attribute :db.part/db}

]"
"[;;\"Attribute\",\"AttributeType\",\"int\",\"NOT NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Attribute/AttributeType
:db/valueType :db.type/long
:db/cardinality :db.cardinality/one
:db/doc \"Attribute.AttributeType\"
:alexa.entity-type :et-Attribute
:db.install/_attribute :db.part/db}

;;\"Attribute\",\"AttributeValueScopeId\",\"bigint\",\"NOT NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :Attribute/AttributeValueScope
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(Attribute AttributeValueScopeId AttributeValueScope AttributeValueScope)\"
:alexa.entity-type :et-Attribute
:db.install/_attribute :db.part/db}

;;\"Attribute\",\"AttributeValueTypeId\",\"bigint\",\"NOT NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :Attribute/AttributeValueType
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(Attribute AttributeValueTypeId AttributeValueType AttributeValueType)\"
:alexa.entity-type :et-Attribute
:db.install/_attribute :db.part/db}

;;\"Attribute\",\"CreatedOn\",\"datetime\",\"NOT NULL\",\"[DF_Attribute_CreatedOn]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Attribute/CreatedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"Attribute.CreatedOn\"
:alexa.entity-type :et-Attribute
:db.install/_attribute :db.part/db}

;;\"Attribute\",\"DeletedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Attribute/DeletedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"Attribute.DeletedOn\"
:alexa.entity-type :et-Attribute
:db.install/_attribute :db.part/db}

;;\"Attribute\",\"Description\",\"[nvarchar](1024)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Attribute/Description
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"Attribute.Description\"
:alexa.entity-type :et-Attribute
:db.install/_attribute :db.part/db}

;;\"Attribute\",\"Id\",\"bigint\",\"NOT NULL\",\"\",\"IDENTITY\",\"PRIMARY KEY\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Attribute/Id
:db/valueType :db.type/long
:db/cardinality :db.cardinality/one
:db/index true
:db/unique :db.unique/value
:db/doc \"Attribute.Id\"
:alexa.entity-type :et-Attribute
:db.install/_attribute :db.part/db}

;;\"Attribute\",\"ModifiedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Attribute/ModifiedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"Attribute.ModifiedOn\"
:alexa.entity-type :et-Attribute
:db.install/_attribute :db.part/db}

;;\"Attribute\",\"Name\",\"[nvarchar](256)\",\"NOT NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Attribute/Name
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"Attribute.Name\"
:alexa.entity-type :et-Attribute
:db.install/_attribute :db.part/db}

]"
"[;;\"AttributeValue\",\"AttributeId\",\"bigint\",\"NOT NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :AttributeValue/Attribute
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(AttributeValue AttributeId Attribute Attribute)\"
:alexa.entity-type :et-AttributeValue
:db.install/_attribute :db.part/db}

;;\"AttributeValue\",\"CreatedOn\",\"datetime\",\"NOT NULL\",\"[DF_AttributeValue_CreatedOn]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :AttributeValue/CreatedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"AttributeValue.CreatedOn\"
:alexa.entity-type :et-AttributeValue
:db.install/_attribute :db.part/db}

;;\"AttributeValue\",\"CurrencyValue\",\"[numeric](18,2)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :AttributeValue/CurrencyValue
:db/valueType :db.type/bigdec
:db/cardinality :db.cardinality/one
:db/doc \"AttributeValue.CurrencyValue\"
:alexa.entity-type :et-AttributeValue
:db.install/_attribute :db.part/db}

;;\"AttributeValue\",\"DateValue\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :AttributeValue/DateValue
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"AttributeValue.DateValue\"
:alexa.entity-type :et-AttributeValue
:db.install/_attribute :db.part/db}

;;\"AttributeValue\",\"DeletedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :AttributeValue/DeletedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"AttributeValue.DeletedOn\"
:alexa.entity-type :et-AttributeValue
:db.install/_attribute :db.part/db}

;;\"AttributeValue\",\"DoubleValue\",\"float\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :AttributeValue/DoubleValue
:db/valueType :db.type/float
:db/cardinality :db.cardinality/one
:db/doc \"AttributeValue.DoubleValue\"
:alexa.entity-type :et-AttributeValue
:db.install/_attribute :db.part/db}

;;\"AttributeValue\",\"Id\",\"bigint\",\"NOT NULL\",\"\",\"IDENTITY\",\"PRIMARY KEY\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :AttributeValue/Id
:db/valueType :db.type/long
:db/cardinality :db.cardinality/one
:db/index true
:db/unique :db.unique/value
:db/doc \"AttributeValue.Id\"
:alexa.entity-type :et-AttributeValue
:db.install/_attribute :db.part/db}

;;\"AttributeValue\",\"IntValue\",\"int\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :AttributeValue/IntValue
:db/valueType :db.type/long
:db/cardinality :db.cardinality/one
:db/doc \"AttributeValue.IntValue\"
:alexa.entity-type :et-AttributeValue
:db.install/_attribute :db.part/db}

;;\"AttributeValue\",\"ModifiedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :AttributeValue/ModifiedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"AttributeValue.ModifiedOn\"
:alexa.entity-type :et-AttributeValue
:db.install/_attribute :db.part/db}

;;\"AttributeValue\",\"StringValue\",\"[nvarchar](256)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :AttributeValue/StringValue
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"AttributeValue.StringValue\"
:alexa.entity-type :et-AttributeValue
:db.install/_attribute :db.part/db}

{:db/id #db/id[:db.part/db]
:db/ident :AttributeValue/AssetGroup
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/many
:db/doc \"(AttributeValue AttributeValueId AssetGroupAttributeValue AssetGroupId AssetGroup)\"
:alexa.entity-type :et-AttributeValue
:db.install/_attribute :db.part/db}

{:db/id #db/id[:db.part/db]
:db/ident :AttributeValue/Asset
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/many
:db/doc \"(AttributeValue AttributeValueId AssetAttributeValue AssetId Asset)\"
:alexa.entity-type :et-AttributeValue
:db.install/_attribute :db.part/db}

{:db/id #db/id[:db.part/db]
:db/ident :AttributeValue/BusinessUnit
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/many
:db/doc \"(AttributeValue AttributeValueId BusinessUnitAttributeValue BusinessUnitId BusinessUnit)\"
:alexa.entity-type :et-AttributeValue
:db.install/_attribute :db.part/db}

{:db/id #db/id[:db.part/db]
:db/ident :AttributeValue/Incident
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/many
:db/doc \"(AttributeValue AttributeValueId IncidentAttributeValue IncidentId Incident)\"
:alexa.entity-type :et-AttributeValue
:db.install/_attribute :db.part/db}

{:db/id #db/id[:db.part/db]
:db/ident :AttributeValue/Project
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/many
:db/doc \"(AttributeValue AttributeValueId ProjectAttributeValue ProjectId Project)\"
:alexa.entity-type :et-AttributeValue
:db.install/_attribute :db.part/db}

{:db/id #db/id[:db.part/db]
:db/ident :AttributeValue/Standard
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/many
:db/doc \"(AttributeValue AttributeValueId StandardAttributeValue StandardId Standard)\"
:alexa.entity-type :et-AttributeValue
:db.install/_attribute :db.part/db}

]"
"[;;\"AttributeValueScope\",\"CreatedOn\",\"datetime\",\"NOT NULL\",\"[DF_AttributeValueScope_CreatedOn]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :AttributeValueScope/CreatedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"AttributeValueScope.CreatedOn\"
:alexa.entity-type :et-AttributeValueScope
:db.install/_attribute :db.part/db}

;;\"AttributeValueScope\",\"DeletedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :AttributeValueScope/DeletedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"AttributeValueScope.DeletedOn\"
:alexa.entity-type :et-AttributeValueScope
:db.install/_attribute :db.part/db}

;;\"AttributeValueScope\",\"Description\",\"[nvarchar](1024)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :AttributeValueScope/Description
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"AttributeValueScope.Description\"
:alexa.entity-type :et-AttributeValueScope
:db.install/_attribute :db.part/db}

;;\"AttributeValueScope\",\"Id\",\"bigint\",\"NOT NULL\",\"\",\"IDENTITY\",\"PRIMARY KEY\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :AttributeValueScope/Id
:db/valueType :db.type/long
:db/cardinality :db.cardinality/one
:db/index true
:db/unique :db.unique/value
:db/doc \"AttributeValueScope.Id\"
:alexa.entity-type :et-AttributeValueScope
:db.install/_attribute :db.part/db}

;;\"AttributeValueScope\",\"ModifiedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :AttributeValueScope/ModifiedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"AttributeValueScope.ModifiedOn\"
:alexa.entity-type :et-AttributeValueScope
:db.install/_attribute :db.part/db}

;;\"AttributeValueScope\",\"Name\",\"[nvarchar](256)\",\"NOT NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :AttributeValueScope/Name
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"AttributeValueScope.Name\"
:alexa.entity-type :et-AttributeValueScope
:db.install/_attribute :db.part/db}

]"
"[;;\"AttributeValueType\",\"CreatedOn\",\"datetime\",\"NOT NULL\",\"[DF_AttributeValueType_CreatedOn]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :AttributeValueType/CreatedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"AttributeValueType.CreatedOn\"
:alexa.entity-type :et-AttributeValueType
:db.install/_attribute :db.part/db}

;;\"AttributeValueType\",\"DeletedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :AttributeValueType/DeletedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"AttributeValueType.DeletedOn\"
:alexa.entity-type :et-AttributeValueType
:db.install/_attribute :db.part/db}

;;\"AttributeValueType\",\"Description\",\"[nvarchar](1024)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :AttributeValueType/Description
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"AttributeValueType.Description\"
:alexa.entity-type :et-AttributeValueType
:db.install/_attribute :db.part/db}

;;\"AttributeValueType\",\"Id\",\"bigint\",\"NOT NULL\",\"\",\"IDENTITY\",\"PRIMARY KEY\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :AttributeValueType/Id
:db/valueType :db.type/long
:db/cardinality :db.cardinality/one
:db/index true
:db/unique :db.unique/value
:db/doc \"AttributeValueType.Id\"
:alexa.entity-type :et-AttributeValueType
:db.install/_attribute :db.part/db}

;;\"AttributeValueType\",\"ModifiedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :AttributeValueType/ModifiedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"AttributeValueType.ModifiedOn\"
:alexa.entity-type :et-AttributeValueType
:db.install/_attribute :db.part/db}

;;\"AttributeValueType\",\"Name\",\"[nvarchar](256)\",\"NOT NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :AttributeValueType/Name
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"AttributeValueType.Name\"
:alexa.entity-type :et-AttributeValueType
:db.install/_attribute :db.part/db}

]"
"[;;\"AuditPlan\",\"Author_PersonId\",\"bigint\",\"NOT NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :AuditPlan/Author_Person
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(AuditPlan Author_PersonId Person Author_Person)\"
:alexa.entity-type :et-AuditPlan
:db.install/_attribute :db.part/db}

;;\"AuditPlan\",\"CreatedOn\",\"datetime\",\"NOT NULL\",\"[DF_AuditDesign_CreatedOn]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :AuditPlan/CreatedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"AuditPlan.CreatedOn\"
:alexa.entity-type :et-AuditPlan
:db.install/_attribute :db.part/db}

;;\"AuditPlan\",\"DeletedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :AuditPlan/DeletedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"AuditPlan.DeletedOn\"
:alexa.entity-type :et-AuditPlan
:db.install/_attribute :db.part/db}

;;\"AuditPlan\",\"Description\",\"[nvarchar](1024)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :AuditPlan/Description
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"AuditPlan.Description\"
:alexa.entity-type :et-AuditPlan
:db.install/_attribute :db.part/db}

;;\"AuditPlan\",\"Id\",\"bigint\",\"NOT NULL\",\"\",\"IDENTITY\",\"PRIMARY KEY\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :AuditPlan/Id
:db/valueType :db.type/long
:db/cardinality :db.cardinality/one
:db/index true
:db/unique :db.unique/value
:db/doc \"AuditPlan.Id\"
:alexa.entity-type :et-AuditPlan
:db.install/_attribute :db.part/db}

;;\"AuditPlan\",\"ModifiedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :AuditPlan/ModifiedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"AuditPlan.ModifiedOn\"
:alexa.entity-type :et-AuditPlan
:db.install/_attribute :db.part/db}

;;\"AuditPlan\",\"Name\",\"[nvarchar](256)\",\"NOT NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :AuditPlan/Name
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"AuditPlan.Name\"
:alexa.entity-type :et-AuditPlan
:db.install/_attribute :db.part/db}

{:db/id #db/id[:db.part/db]
:db/ident :AuditPlan/Project
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/many
:db/doc \"(AuditPlan AuditPlanId AuditPlanProject ProjectId Project)\"
:alexa.entity-type :et-AuditPlan
:db.install/_attribute :db.part/db}

{:db/id #db/id[:db.part/db]
:db/ident :AuditPlan/Role
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/many
:db/doc \"(AuditPlan AuditPlanId AuditPlanRole RoleId Role)\"
:alexa.entity-type :et-AuditPlan
:db.install/_attribute :db.part/db}

{:db/id #db/id[:db.part/db]
:db/ident :AuditPlan/StandardComponent
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/many
:db/doc \"(AuditPlan AuditPlanId AuditPlanStandardComponent StandardComponentId StandardComponent)\"
:alexa.entity-type :et-AuditPlan
:db.install/_attribute :db.part/db}

]"
"[;;\"BusinessMetric\",\"AttributeValueTypeId\",\"bigint\",\"NOT NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :BusinessMetric/AttributeValueType
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(BusinessMetric AttributeValueTypeId AttributeValueType AttributeValueType)\"
:alexa.entity-type :et-BusinessMetric
:db.install/_attribute :db.part/db}

;;\"BusinessMetric\",\"CreatedBy_PersonId\",\"bigint\",\"NOT NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :BusinessMetric/CreatedBy_Person
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(BusinessMetric CreatedBy_PersonId Person CreatedBy_Person)\"
:alexa.entity-type :et-BusinessMetric
:db.install/_attribute :db.part/db}

;;\"BusinessMetric\",\"CreatedOn\",\"datetime\",\"NOT NULL\",\"[DF_BusinessMetric_CreatedOn]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :BusinessMetric/CreatedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"BusinessMetric.CreatedOn\"
:alexa.entity-type :et-BusinessMetric
:db.install/_attribute :db.part/db}

;;\"BusinessMetric\",\"CurrencyId\",\"bigint\",\"NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :BusinessMetric/Currency
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(BusinessMetric CurrencyId Currency Currency)\"
:alexa.entity-type :et-BusinessMetric
:db.install/_attribute :db.part/db}

;;\"BusinessMetric\",\"DeletedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :BusinessMetric/DeletedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"BusinessMetric.DeletedOn\"
:alexa.entity-type :et-BusinessMetric
:db.install/_attribute :db.part/db}

;;\"BusinessMetric\",\"Description\",\"[nvarchar](1024)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :BusinessMetric/Description
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"BusinessMetric.Description\"
:alexa.entity-type :et-BusinessMetric
:db.install/_attribute :db.part/db}

;;\"BusinessMetric\",\"EntityTypeId\",\"bigint\",\"NOT NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :BusinessMetric/EntityType
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(BusinessMetric EntityTypeId EntityType EntityType)\"
:alexa.entity-type :et-BusinessMetric
:db.install/_attribute :db.part/db}

;;\"BusinessMetric\",\"Id\",\"bigint\",\"NOT NULL\",\"\",\"IDENTITY\",\"PRIMARY KEY\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :BusinessMetric/Id
:db/valueType :db.type/long
:db/cardinality :db.cardinality/one
:db/index true
:db/unique :db.unique/value
:db/doc \"BusinessMetric.Id\"
:alexa.entity-type :et-BusinessMetric
:db.install/_attribute :db.part/db}

;;\"BusinessMetric\",\"ModifiedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :BusinessMetric/ModifiedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"BusinessMetric.ModifiedOn\"
:alexa.entity-type :et-BusinessMetric
:db.install/_attribute :db.part/db}

;;\"BusinessMetric\",\"Name\",\"[nvarchar](256)\",\"NOT NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :BusinessMetric/Name
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"BusinessMetric.Name\"
:alexa.entity-type :et-BusinessMetric
:db.install/_attribute :db.part/db}

;;\"BusinessMetric\",\"RecurrenceId\",\"bigint\",\"NOT NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :BusinessMetric/Recurrence
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(BusinessMetric RecurrenceId Recurrence Recurrence)\"
:alexa.entity-type :et-BusinessMetric
:db.install/_attribute :db.part/db}

]"
"[;;\"BusinessUnit\",\"Abbreviation\",\"[nvarchar](20)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :BusinessUnit/Abbreviation
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"BusinessUnit.Abbreviation\"
:alexa.entity-type :et-BusinessUnit
:db.install/_attribute :db.part/db}

;;\"BusinessUnit\",\"AddressId\",\"bigint\",\"NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :BusinessUnit/Address
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(BusinessUnit AddressId Address Address)\"
:alexa.entity-type :et-BusinessUnit
:db.install/_attribute :db.part/db}

;;\"BusinessUnit\",\"CreatedOn\",\"datetime\",\"NOT NULL\",\"[DF_BusinessUnit_CreatedOn]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :BusinessUnit/CreatedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"BusinessUnit.CreatedOn\"
:alexa.entity-type :et-BusinessUnit
:db.install/_attribute :db.part/db}

;;\"BusinessUnit\",\"DefaultCurrencyId\",\"bigint\",\"NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :BusinessUnit/DefaultCurrency
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(BusinessUnit DefaultCurrencyId Currency DefaultCurrency)\"
:alexa.entity-type :et-BusinessUnit
:db.install/_attribute :db.part/db}

;;\"BusinessUnit\",\"DeletedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :BusinessUnit/DeletedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"BusinessUnit.DeletedOn\"
:alexa.entity-type :et-BusinessUnit
:db.install/_attribute :db.part/db}

;;\"BusinessUnit\",\"Description\",\"[nvarchar](1024)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :BusinessUnit/Description
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"BusinessUnit.Description\"
:alexa.entity-type :et-BusinessUnit
:db.install/_attribute :db.part/db}

;;\"BusinessUnit\",\"Id\",\"bigint\",\"NOT NULL\",\"\",\"IDENTITY\",\"PRIMARY KEY\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :BusinessUnit/Id
:db/valueType :db.type/long
:db/cardinality :db.cardinality/one
:db/index true
:db/unique :db.unique/value
:db/doc \"BusinessUnit.Id\"
:alexa.entity-type :et-BusinessUnit
:db.install/_attribute :db.part/db}

;;\"BusinessUnit\",\"ModifiedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :BusinessUnit/ModifiedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"BusinessUnit.ModifiedOn\"
:alexa.entity-type :et-BusinessUnit
:db.install/_attribute :db.part/db}

;;\"BusinessUnit\",\"Name\",\"[nvarchar](256)\",\"NOT NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :BusinessUnit/Name
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"BusinessUnit.Name\"
:alexa.entity-type :et-BusinessUnit
:db.install/_attribute :db.part/db}

{:db/id #db/id[:db.part/db]
:db/ident :BusinessUnit/AssetGroup
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/many
:db/doc \"(BusinessUnit BusinessUnitId AssetGroupBusinessUnit AssetGroupId AssetGroup)\"
:alexa.entity-type :et-BusinessUnit
:db.install/_attribute :db.part/db}

{:db/id #db/id[:db.part/db]
:db/ident :BusinessUnit/AttributeValue
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/many
:db/doc \"(BusinessUnit BusinessUnitId BusinessUnitAttributeValue AttributeValueId AttributeValue)\"
:alexa.entity-type :et-BusinessUnit
:db.install/_attribute :db.part/db}

{:db/id #db/id[:db.part/db]
:db/ident :BusinessUnit/Incident
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/many
:db/doc \"(BusinessUnit BusinessUnitId IncidentBusinessUnit IncidentId Incident)\"
:alexa.entity-type :et-BusinessUnit
:db.install/_attribute :db.part/db}

{:db/id #db/id[:db.part/db]
:db/ident :BusinessUnit/Policy
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/many
:db/doc \"(BusinessUnit BusinessUnitId PolicyBusinessUnit PolicyId Policy)\"
:alexa.entity-type :et-BusinessUnit
:db.install/_attribute :db.part/db}

{:db/id #db/id[:db.part/db]
:db/ident :BusinessUnit/Project
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/many
:db/doc \"(BusinessUnit BusinessUnitId ProjectBusinessUnit ProjectId Project)\"
:alexa.entity-type :et-BusinessUnit
:db.install/_attribute :db.part/db}

]"
"[;;\"BusinessUnitBusinessMetric\",\"Amount\",\"float\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :BusinessUnitBusinessMetric/Amount
:db/valueType :db.type/float
:db/cardinality :db.cardinality/one
:db/doc \"BusinessUnitBusinessMetric.Amount\"
:alexa.entity-type :et-BusinessUnitBusinessMetric
:db.install/_attribute :db.part/db}

;;\"BusinessUnitBusinessMetric\",\"BusinessMetricId\",\"bigint\",\"NOT NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :BusinessUnitBusinessMetric/BusinessMetric
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(BusinessUnitBusinessMetric BusinessMetricId BusinessMetric BusinessMetric)\"
:alexa.entity-type :et-BusinessUnitBusinessMetric
:db.install/_attribute :db.part/db}

;;\"BusinessUnitBusinessMetric\",\"BusinessUnitId\",\"bigint\",\"NOT NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :BusinessUnitBusinessMetric/BusinessUnit
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(BusinessUnitBusinessMetric BusinessUnitId BusinessUnit BusinessUnit)\"
:alexa.entity-type :et-BusinessUnitBusinessMetric
:db.install/_attribute :db.part/db}

;;\"BusinessUnitBusinessMetric\",\"CreatedOn\",\"datetime\",\"NOT NULL\",\"[DF_BusinessUnitBusinessMetric_CreatedOn]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :BusinessUnitBusinessMetric/CreatedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"BusinessUnitBusinessMetric.CreatedOn\"
:alexa.entity-type :et-BusinessUnitBusinessMetric
:db.install/_attribute :db.part/db}

;;\"BusinessUnitBusinessMetric\",\"DeletedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :BusinessUnitBusinessMetric/DeletedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"BusinessUnitBusinessMetric.DeletedOn\"
:alexa.entity-type :et-BusinessUnitBusinessMetric
:db.install/_attribute :db.part/db}

;;\"BusinessUnitBusinessMetric\",\"EffectiveDate\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :BusinessUnitBusinessMetric/EffectiveDate
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"BusinessUnitBusinessMetric.EffectiveDate\"
:alexa.entity-type :et-BusinessUnitBusinessMetric
:db.install/_attribute :db.part/db}

;;\"BusinessUnitBusinessMetric\",\"Id\",\"bigint\",\"NOT NULL\",\"\",\"IDENTITY\",\"PRIMARY KEY\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :BusinessUnitBusinessMetric/Id
:db/valueType :db.type/long
:db/cardinality :db.cardinality/one
:db/index true
:db/unique :db.unique/value
:db/doc \"BusinessUnitBusinessMetric.Id\"
:alexa.entity-type :et-BusinessUnitBusinessMetric
:db.install/_attribute :db.part/db}

;;\"BusinessUnitBusinessMetric\",\"ModifiedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :BusinessUnitBusinessMetric/ModifiedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"BusinessUnitBusinessMetric.ModifiedOn\"
:alexa.entity-type :et-BusinessUnitBusinessMetric
:db.install/_attribute :db.part/db}

]"
"[;;\"BusinessUnitBusinessUnit\",\"BusinessUnitAId\",\"bigint\",\"NOT NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :BusinessUnitBusinessUnit/BusinessUnitA
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(BusinessUnitBusinessUnit BusinessUnitAId BusinessUnit BusinessUnitA)\"
:alexa.entity-type :et-BusinessUnitBusinessUnit
:db.install/_attribute :db.part/db}

;;\"BusinessUnitBusinessUnit\",\"BusinessUnitBId\",\"bigint\",\"NOT NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :BusinessUnitBusinessUnit/BusinessUnitB
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(BusinessUnitBusinessUnit BusinessUnitBId BusinessUnit BusinessUnitB)\"
:alexa.entity-type :et-BusinessUnitBusinessUnit
:db.install/_attribute :db.part/db}

;;\"BusinessUnitBusinessUnit\",\"BusinessUnitRelationshipTypeId\",\"bigint\",\"NOT NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :BusinessUnitBusinessUnit/BusinessUnitRelationshipType
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(BusinessUnitBusinessUnit BusinessUnitRelationshipTypeId BusinessUnitRelationshipType BusinessUnitRelationshipType)\"
:alexa.entity-type :et-BusinessUnitBusinessUnit
:db.install/_attribute :db.part/db}

;;\"BusinessUnitBusinessUnit\",\"CreatedOn\",\"datetime\",\"NOT NULL\",\"[DF_BusinessUnitBusinessUnit_CreatedOn]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :BusinessUnitBusinessUnit/CreatedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"BusinessUnitBusinessUnit.CreatedOn\"
:alexa.entity-type :et-BusinessUnitBusinessUnit
:db.install/_attribute :db.part/db}

;;\"BusinessUnitBusinessUnit\",\"DeletedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :BusinessUnitBusinessUnit/DeletedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"BusinessUnitBusinessUnit.DeletedOn\"
:alexa.entity-type :et-BusinessUnitBusinessUnit
:db.install/_attribute :db.part/db}

;;\"BusinessUnitBusinessUnit\",\"Id\",\"bigint\",\"NOT NULL\",\"\",\"IDENTITY\",\"PRIMARY KEY\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :BusinessUnitBusinessUnit/Id
:db/valueType :db.type/long
:db/cardinality :db.cardinality/one
:db/index true
:db/unique :db.unique/value
:db/doc \"BusinessUnitBusinessUnit.Id\"
:alexa.entity-type :et-BusinessUnitBusinessUnit
:db.install/_attribute :db.part/db}

;;\"BusinessUnitBusinessUnit\",\"ModifiedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :BusinessUnitBusinessUnit/ModifiedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"BusinessUnitBusinessUnit.ModifiedOn\"
:alexa.entity-type :et-BusinessUnitBusinessUnit
:db.install/_attribute :db.part/db}

]"
"[;;\"BusinessUnitRelationshipType\",\"CreatedOn\",\"datetime\",\"NOT NULL\",\"[DF_BusinessUnitRelationshipType_CreatedOn]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :BusinessUnitRelationshipType/CreatedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"BusinessUnitRelationshipType.CreatedOn\"
:alexa.entity-type :et-BusinessUnitRelationshipType
:db.install/_attribute :db.part/db}

;;\"BusinessUnitRelationshipType\",\"DeletedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :BusinessUnitRelationshipType/DeletedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"BusinessUnitRelationshipType.DeletedOn\"
:alexa.entity-type :et-BusinessUnitRelationshipType
:db.install/_attribute :db.part/db}

;;\"BusinessUnitRelationshipType\",\"Description\",\"[nvarchar](1024)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :BusinessUnitRelationshipType/Description
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"BusinessUnitRelationshipType.Description\"
:alexa.entity-type :et-BusinessUnitRelationshipType
:db.install/_attribute :db.part/db}

;;\"BusinessUnitRelationshipType\",\"Id\",\"bigint\",\"NOT NULL\",\"\",\"IDENTITY\",\"PRIMARY KEY\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :BusinessUnitRelationshipType/Id
:db/valueType :db.type/long
:db/cardinality :db.cardinality/one
:db/index true
:db/unique :db.unique/value
:db/doc \"BusinessUnitRelationshipType.Id\"
:alexa.entity-type :et-BusinessUnitRelationshipType
:db.install/_attribute :db.part/db}

;;\"BusinessUnitRelationshipType\",\"ModifiedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :BusinessUnitRelationshipType/ModifiedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"BusinessUnitRelationshipType.ModifiedOn\"
:alexa.entity-type :et-BusinessUnitRelationshipType
:db.install/_attribute :db.part/db}

;;\"BusinessUnitRelationshipType\",\"Name\",\"[nvarchar](256)\",\"NOT NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :BusinessUnitRelationshipType/Name
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"BusinessUnitRelationshipType.Name\"
:alexa.entity-type :et-BusinessUnitRelationshipType
:db.install/_attribute :db.part/db}

]"
"[;;\"ContentType\",\"CreatedOn\",\"datetime\",\"NOT NULL\",\"[DF_ContentType_CreatedOn]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :ContentType/CreatedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"ContentType.CreatedOn\"
:alexa.entity-type :et-ContentType
:db.install/_attribute :db.part/db}

;;\"ContentType\",\"DeletedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :ContentType/DeletedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"ContentType.DeletedOn\"
:alexa.entity-type :et-ContentType
:db.install/_attribute :db.part/db}

;;\"ContentType\",\"Description\",\"[nvarchar](1024)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :ContentType/Description
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"ContentType.Description\"
:alexa.entity-type :et-ContentType
:db.install/_attribute :db.part/db}

;;\"ContentType\",\"Id\",\"bigint\",\"NOT NULL\",\"\",\"IDENTITY\",\"PRIMARY KEY\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :ContentType/Id
:db/valueType :db.type/long
:db/cardinality :db.cardinality/one
:db/index true
:db/unique :db.unique/value
:db/doc \"ContentType.Id\"
:alexa.entity-type :et-ContentType
:db.install/_attribute :db.part/db}

;;\"ContentType\",\"ModifiedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :ContentType/ModifiedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"ContentType.ModifiedOn\"
:alexa.entity-type :et-ContentType
:db.install/_attribute :db.part/db}

;;\"ContentType\",\"Name\",\"[nvarchar](256)\",\"NOT NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :ContentType/Name
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"ContentType.Name\"
:alexa.entity-type :et-ContentType
:db.install/_attribute :db.part/db}

]"
"[;;\"Country\",\"CountryCode\",\"[nvarchar](50)\",\"NOT NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Country/CountryCode
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"Country.CountryCode\"
:alexa.entity-type :et-Country
:db.install/_attribute :db.part/db}

;;\"Country\",\"CreatedOn\",\"datetime\",\"NOT NULL\",\"[DF_Country_CreatedOn]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Country/CreatedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"Country.CreatedOn\"
:alexa.entity-type :et-Country
:db.install/_attribute :db.part/db}

;;\"Country\",\"DeletedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Country/DeletedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"Country.DeletedOn\"
:alexa.entity-type :et-Country
:db.install/_attribute :db.part/db}

;;\"Country\",\"Id\",\"bigint\",\"NOT NULL\",\"\",\"IDENTITY\",\"PRIMARY KEY\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Country/Id
:db/valueType :db.type/long
:db/cardinality :db.cardinality/one
:db/index true
:db/unique :db.unique/value
:db/doc \"Country.Id\"
:alexa.entity-type :et-Country
:db.install/_attribute :db.part/db}

;;\"Country\",\"ModifiedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Country/ModifiedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"Country.ModifiedOn\"
:alexa.entity-type :et-Country
:db.install/_attribute :db.part/db}

;;\"Country\",\"Name\",\"[nvarchar](256)\",\"NOT NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Country/Name
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"Country.Name\"
:alexa.entity-type :et-Country
:db.install/_attribute :db.part/db}

]"
"[;;\"Currency\",\"CreatedOn\",\"datetime\",\"NOT NULL\",\"[DF_Currency_CreatedOn]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Currency/CreatedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"Currency.CreatedOn\"
:alexa.entity-type :et-Currency
:db.install/_attribute :db.part/db}

;;\"Currency\",\"DeletedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Currency/DeletedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"Currency.DeletedOn\"
:alexa.entity-type :et-Currency
:db.install/_attribute :db.part/db}

;;\"Currency\",\"Id\",\"bigint\",\"NOT NULL\",\"\",\"IDENTITY\",\"PRIMARY KEY\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Currency/Id
:db/valueType :db.type/long
:db/cardinality :db.cardinality/one
:db/index true
:db/unique :db.unique/value
:db/doc \"Currency.Id\"
:alexa.entity-type :et-Currency
:db.install/_attribute :db.part/db}

;;\"Currency\",\"ModifiedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Currency/ModifiedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"Currency.ModifiedOn\"
:alexa.entity-type :et-Currency
:db.install/_attribute :db.part/db}

;;\"Currency\",\"Name\",\"[nvarchar](256)\",\"NOT NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Currency/Name
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"Currency.Name\"
:alexa.entity-type :et-Currency
:db.install/_attribute :db.part/db}

;;\"Currency\",\"Symbol\",\"[nvarchar](50)\",\"NOT NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Currency/Symbol
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"Currency.Symbol\"
:alexa.entity-type :et-Currency
:db.install/_attribute :db.part/db}

]"
"[;;\"CurrencyExchange\",\"CreatedOn\",\"datetime\",\"NOT NULL\",\"[DF_CurrencyExchange_CreatedOn]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :CurrencyExchange/CreatedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"CurrencyExchange.CreatedOn\"
:alexa.entity-type :et-CurrencyExchange
:db.install/_attribute :db.part/db}

;;\"CurrencyExchange\",\"CurrencyId\",\"bigint\",\"NOT NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :CurrencyExchange/Currency
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(CurrencyExchange CurrencyId Currency Currency)\"
:alexa.entity-type :et-CurrencyExchange
:db.install/_attribute :db.part/db}

;;\"CurrencyExchange\",\"DeletedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :CurrencyExchange/DeletedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"CurrencyExchange.DeletedOn\"
:alexa.entity-type :et-CurrencyExchange
:db.install/_attribute :db.part/db}

;;\"CurrencyExchange\",\"EffectiveDate\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :CurrencyExchange/EffectiveDate
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"CurrencyExchange.EffectiveDate\"
:alexa.entity-type :et-CurrencyExchange
:db.install/_attribute :db.part/db}

;;\"CurrencyExchange\",\"ExchangeRate\",\"float\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :CurrencyExchange/ExchangeRate
:db/valueType :db.type/float
:db/cardinality :db.cardinality/one
:db/doc \"CurrencyExchange.ExchangeRate\"
:alexa.entity-type :et-CurrencyExchange
:db.install/_attribute :db.part/db}

;;\"CurrencyExchange\",\"Id\",\"bigint\",\"NOT NULL\",\"\",\"IDENTITY\",\"PRIMARY KEY\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :CurrencyExchange/Id
:db/valueType :db.type/long
:db/cardinality :db.cardinality/one
:db/index true
:db/unique :db.unique/value
:db/doc \"CurrencyExchange.Id\"
:alexa.entity-type :et-CurrencyExchange
:db.install/_attribute :db.part/db}

;;\"CurrencyExchange\",\"ModifiedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :CurrencyExchange/ModifiedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"CurrencyExchange.ModifiedOn\"
:alexa.entity-type :et-CurrencyExchange
:db.install/_attribute :db.part/db}

]"
"[;;\"DataClass\",\"BackColorName\",\"[nvarchar](50)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :DataClass/BackColorName
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"DataClass.BackColorName\"
:alexa.entity-type :et-DataClass
:db.install/_attribute :db.part/db}

;;\"DataClass\",\"CreatedOn\",\"datetime\",\"NOT NULL\",\"[DF_DataClass_CreatedOn]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :DataClass/CreatedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"DataClass.CreatedOn\"
:alexa.entity-type :et-DataClass
:db.install/_attribute :db.part/db}

;;\"DataClass\",\"DeletedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :DataClass/DeletedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"DataClass.DeletedOn\"
:alexa.entity-type :et-DataClass
:db.install/_attribute :db.part/db}

;;\"DataClass\",\"Description\",\"[nvarchar](1024)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :DataClass/Description
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"DataClass.Description\"
:alexa.entity-type :et-DataClass
:db.install/_attribute :db.part/db}

;;\"DataClass\",\"ForeColorName\",\"[nvarchar](50)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :DataClass/ForeColorName
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"DataClass.ForeColorName\"
:alexa.entity-type :et-DataClass
:db.install/_attribute :db.part/db}

;;\"DataClass\",\"Id\",\"bigint\",\"NOT NULL\",\"\",\"IDENTITY\",\"PRIMARY KEY\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :DataClass/Id
:db/valueType :db.type/long
:db/cardinality :db.cardinality/one
:db/index true
:db/unique :db.unique/value
:db/doc \"DataClass.Id\"
:alexa.entity-type :et-DataClass
:db.install/_attribute :db.part/db}

;;\"DataClass\",\"ModifiedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :DataClass/ModifiedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"DataClass.ModifiedOn\"
:alexa.entity-type :et-DataClass
:db.install/_attribute :db.part/db}

;;\"DataClass\",\"Name\",\"[nvarchar](256)\",\"NOT NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :DataClass/Name
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"DataClass.Name\"
:alexa.entity-type :et-DataClass
:db.install/_attribute :db.part/db}

]"
"[;;\"DataFile\",\"Content\",\"[varbinary](MAX)\",\"NOT NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :DataFile/Content
:db/valueType :db.type/uri
:db/cardinality :db.cardinality/one
:db/doc \"DataFile.Content\"
:alexa.entity-type :et-DataFile
:db.install/_attribute :db.part/db}

;;\"DataFile\",\"CreatedOn\",\"datetime\",\"NOT NULL\",\"[DF_DataFile_CreatedOn]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :DataFile/CreatedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"DataFile.CreatedOn\"
:alexa.entity-type :et-DataFile
:db.install/_attribute :db.part/db}

;;\"DataFile\",\"DeletedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :DataFile/DeletedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"DataFile.DeletedOn\"
:alexa.entity-type :et-DataFile
:db.install/_attribute :db.part/db}

;;\"DataFile\",\"Extension\",\"[nvarchar](50)\",\"NOT NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :DataFile/Extension
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"DataFile.Extension\"
:alexa.entity-type :et-DataFile
:db.install/_attribute :db.part/db}

;;\"DataFile\",\"Filename\",\"[nvarchar](512)\",\"NOT NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :DataFile/Filename
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"DataFile.Filename\"
:alexa.entity-type :et-DataFile
:db.install/_attribute :db.part/db}

;;\"DataFile\",\"FromHost\",\"[nvarchar](512)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :DataFile/FromHost
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"DataFile.FromHost\"
:alexa.entity-type :et-DataFile
:db.install/_attribute :db.part/db}

;;\"DataFile\",\"Id\",\"bigint\",\"NOT NULL\",\"\",\"IDENTITY\",\"PRIMARY KEY\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :DataFile/Id
:db/valueType :db.type/long
:db/cardinality :db.cardinality/one
:db/index true
:db/unique :db.unique/value
:db/doc \"DataFile.Id\"
:alexa.entity-type :et-DataFile
:db.install/_attribute :db.part/db}

;;\"DataFile\",\"Length\",\"bigint\",\"NOT NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :DataFile/Length
:db/valueType :db.type/long
:db/cardinality :db.cardinality/one
:db/doc \"DataFile.Length\"
:alexa.entity-type :et-DataFile
:db.install/_attribute :db.part/db}

;;\"DataFile\",\"ModifiedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :DataFile/ModifiedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"DataFile.ModifiedOn\"
:alexa.entity-type :et-DataFile
:db.install/_attribute :db.part/db}

;;\"DataFile\",\"OriginalPath\",\"[nvarchar](2048)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :DataFile/OriginalPath
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"DataFile.OriginalPath\"
:alexa.entity-type :et-DataFile
:db.install/_attribute :db.part/db}

]"
"[;;\"DataFinding\",\"ContentTypeId\",\"bigint\",\"NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :DataFinding/ContentType
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(DataFinding ContentTypeId ContentType ContentType)\"
:alexa.entity-type :et-DataFinding
:db.install/_attribute :db.part/db}

;;\"DataFinding\",\"CreatedOn\",\"datetime\",\"NOT NULL\",\"[DF_DataFinding_CreatedOn]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :DataFinding/CreatedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"DataFinding.CreatedOn\"
:alexa.entity-type :et-DataFinding
:db.install/_attribute :db.part/db}

;;\"DataFinding\",\"DataFindingRuleId\",\"bigint\",\"NOT NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :DataFinding/DataFindingRule
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(DataFinding DataFindingRuleId DataFindingRule DataFindingRule)\"
:alexa.entity-type :et-DataFinding
:db.install/_attribute :db.part/db}

;;\"DataFinding\",\"DataFindingSourceTypeId\",\"bigint\",\"NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :DataFinding/DataFindingSourceType
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(DataFinding DataFindingSourceTypeId DataFindingSourceType DataFindingSourceType)\"
:alexa.entity-type :et-DataFinding
:db.install/_attribute :db.part/db}

;;\"DataFinding\",\"DataLocationId\",\"bigint\",\"NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :DataFinding/DataLocation
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(DataFinding DataLocationId DataLocation DataLocation)\"
:alexa.entity-type :et-DataFinding
:db.install/_attribute :db.part/db}

;;\"DataFinding\",\"DeletedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :DataFinding/DeletedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"DataFinding.DeletedOn\"
:alexa.entity-type :et-DataFinding
:db.install/_attribute :db.part/db}

;;\"DataFinding\",\"FoundOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :DataFinding/FoundOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"DataFinding.FoundOn\"
:alexa.entity-type :et-DataFinding
:db.install/_attribute :db.part/db}

;;\"DataFinding\",\"Id\",\"bigint\",\"NOT NULL\",\"\",\"IDENTITY\",\"PRIMARY KEY\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :DataFinding/Id
:db/valueType :db.type/long
:db/cardinality :db.cardinality/one
:db/index true
:db/unique :db.unique/value
:db/doc \"DataFinding.Id\"
:alexa.entity-type :et-DataFinding
:db.install/_attribute :db.part/db}

;;\"DataFinding\",\"ModifiedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :DataFinding/ModifiedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"DataFinding.ModifiedOn\"
:alexa.entity-type :et-DataFinding
:db.install/_attribute :db.part/db}

;;\"DataFinding\",\"Path\",\"[nvarchar](1024)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :DataFinding/Path
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"DataFinding.Path\"
:alexa.entity-type :et-DataFinding
:db.install/_attribute :db.part/db}

;;\"DataFinding\",\"SeverityId\",\"bigint\",\"NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :DataFinding/Severity
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(DataFinding SeverityId Severity Severity)\"
:alexa.entity-type :et-DataFinding
:db.install/_attribute :db.part/db}

{:db/id #db/id[:db.part/db]
:db/ident :DataFinding/Incident
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/many
:db/doc \"(DataFinding DataFindingId IncidentDataFinding IncidentId Incident)\"
:alexa.entity-type :et-DataFinding
:db.install/_attribute :db.part/db}

]"
"[;;\"DataFindingAddendum\",\"CreatedOn\",\"datetime\",\"NOT NULL\",\"[DF_DataFindingAddendum_CreatedOn]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :DataFindingAddendum/CreatedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"DataFindingAddendum.CreatedOn\"
:alexa.entity-type :et-DataFindingAddendum
:db.install/_attribute :db.part/db}

;;\"DataFindingAddendum\",\"DataFindingId\",\"bigint\",\"NOT NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :DataFindingAddendum/DataFinding
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(DataFindingAddendum DataFindingId DataFinding DataFinding)\"
:alexa.entity-type :et-DataFindingAddendum
:db.install/_attribute :db.part/db}

;;\"DataFindingAddendum\",\"DeletedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :DataFindingAddendum/DeletedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"DataFindingAddendum.DeletedOn\"
:alexa.entity-type :et-DataFindingAddendum
:db.install/_attribute :db.part/db}

;;\"DataFindingAddendum\",\"Id\",\"bigint\",\"NOT NULL\",\"\",\"IDENTITY\",\"PRIMARY KEY\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :DataFindingAddendum/Id
:db/valueType :db.type/long
:db/cardinality :db.cardinality/one
:db/index true
:db/unique :db.unique/value
:db/doc \"DataFindingAddendum.Id\"
:alexa.entity-type :et-DataFindingAddendum
:db.install/_attribute :db.part/db}

;;\"DataFindingAddendum\",\"ModifiedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :DataFindingAddendum/ModifiedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"DataFindingAddendum.ModifiedOn\"
:alexa.entity-type :et-DataFindingAddendum
:db.install/_attribute :db.part/db}

;;\"DataFindingAddendum\",\"Text\",\"[nvarchar](MAX)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :DataFindingAddendum/Text
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"DataFindingAddendum.Text\"
:alexa.entity-type :et-DataFindingAddendum
:db.install/_attribute :db.part/db}

;;\"DataFindingAddendum\",\"Title\",\"[nvarchar](256)\",\"NOT NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :DataFindingAddendum/Title
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"DataFindingAddendum.Title\"
:alexa.entity-type :et-DataFindingAddendum
:db.install/_attribute :db.part/db}

]"
"[;;\"DataFindingRule\",\"CreatedOn\",\"datetime\",\"NOT NULL\",\"[DF_DataFindingRule_CreatedOn]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :DataFindingRule/CreatedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"DataFindingRule.CreatedOn\"
:alexa.entity-type :et-DataFindingRule
:db.install/_attribute :db.part/db}

;;\"DataFindingRule\",\"DeletedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :DataFindingRule/DeletedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"DataFindingRule.DeletedOn\"
:alexa.entity-type :et-DataFindingRule
:db.install/_attribute :db.part/db}

;;\"DataFindingRule\",\"Description\",\"[nvarchar](1024)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :DataFindingRule/Description
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"DataFindingRule.Description\"
:alexa.entity-type :et-DataFindingRule
:db.install/_attribute :db.part/db}

;;\"DataFindingRule\",\"Id\",\"bigint\",\"NOT NULL\",\"\",\"IDENTITY\",\"PRIMARY KEY\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :DataFindingRule/Id
:db/valueType :db.type/long
:db/cardinality :db.cardinality/one
:db/index true
:db/unique :db.unique/value
:db/doc \"DataFindingRule.Id\"
:alexa.entity-type :et-DataFindingRule
:db.install/_attribute :db.part/db}

;;\"DataFindingRule\",\"ModifiedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :DataFindingRule/ModifiedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"DataFindingRule.ModifiedOn\"
:alexa.entity-type :et-DataFindingRule
:db.install/_attribute :db.part/db}

;;\"DataFindingRule\",\"Name\",\"[nvarchar](256)\",\"NOT NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :DataFindingRule/Name
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"DataFindingRule.Name\"
:alexa.entity-type :et-DataFindingRule
:db.install/_attribute :db.part/db}

{:db/id #db/id[:db.part/db]
:db/ident :DataFindingRule/DataType
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/many
:db/doc \"(DataFindingRule DataFindingRuleId DataFindingRuleDataType DataTypeId DataType)\"
:alexa.entity-type :et-DataFindingRule
:db.install/_attribute :db.part/db}

]"
"[;;\"DataFindingMitigationStatus\",\"CreatedOn\",\"datetime\",\"NOT NULL\",\"[DF_DataFindingMitigationStatus_CreatedOn]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :DataFindingMitigationStatus/CreatedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"DataFindingMitigationStatus.CreatedOn\"
:alexa.entity-type :et-DataFindingMitigationStatus
:db.install/_attribute :db.part/db}

;;\"DataFindingMitigationStatus\",\"DataFindingId\",\"bigint\",\"NOT NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :DataFindingMitigationStatus/DataFinding
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(DataFindingMitigationStatus DataFindingId DataFinding DataFinding)\"
:alexa.entity-type :et-DataFindingMitigationStatus
:db.install/_attribute :db.part/db}

;;\"DataFindingMitigationStatus\",\"DeletedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :DataFindingMitigationStatus/DeletedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"DataFindingMitigationStatus.DeletedOn\"
:alexa.entity-type :et-DataFindingMitigationStatus
:db.install/_attribute :db.part/db}

;;\"DataFindingMitigationStatus\",\"Id\",\"bigint\",\"NOT NULL\",\"\",\"IDENTITY\",\"PRIMARY KEY\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :DataFindingMitigationStatus/Id
:db/valueType :db.type/long
:db/cardinality :db.cardinality/one
:db/index true
:db/unique :db.unique/value
:db/doc \"DataFindingMitigationStatus.Id\"
:alexa.entity-type :et-DataFindingMitigationStatus
:db.install/_attribute :db.part/db}

;;\"DataFindingMitigationStatus\",\"MitigationStatusId\",\"bigint\",\"NOT NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :DataFindingMitigationStatus/MitigationStatus
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(DataFindingMitigationStatus MitigationStatusId MitigationStatus MitigationStatus)\"
:alexa.entity-type :et-DataFindingMitigationStatus
:db.install/_attribute :db.part/db}

;;\"DataFindingMitigationStatus\",\"ModifiedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :DataFindingMitigationStatus/ModifiedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"DataFindingMitigationStatus.ModifiedOn\"
:alexa.entity-type :et-DataFindingMitigationStatus
:db.install/_attribute :db.part/db}

{:db/id #db/id[:db.part/db]
:db/ident :DataFindingMitigationStatus/Task
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/many
:db/doc \"(DataFindingMitigationStatus DataFindingMitigationStatusId DataFindingMitigationStatusTask TaskId Task)\"
:alexa.entity-type :et-DataFindingMitigationStatus
:db.install/_attribute :db.part/db}

]"
"[;;\"DataFindingSourceType\",\"CreatedOn\",\"datetime\",\"NOT NULL\",\"[DF_DataFindingSourceType_CreatedOn]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :DataFindingSourceType/CreatedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"DataFindingSourceType.CreatedOn\"
:alexa.entity-type :et-DataFindingSourceType
:db.install/_attribute :db.part/db}

;;\"DataFindingSourceType\",\"DeletedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :DataFindingSourceType/DeletedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"DataFindingSourceType.DeletedOn\"
:alexa.entity-type :et-DataFindingSourceType
:db.install/_attribute :db.part/db}

;;\"DataFindingSourceType\",\"Description\",\"[nvarchar](1024)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :DataFindingSourceType/Description
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"DataFindingSourceType.Description\"
:alexa.entity-type :et-DataFindingSourceType
:db.install/_attribute :db.part/db}

;;\"DataFindingSourceType\",\"Id\",\"bigint\",\"NOT NULL\",\"\",\"IDENTITY\",\"PRIMARY KEY\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :DataFindingSourceType/Id
:db/valueType :db.type/long
:db/cardinality :db.cardinality/one
:db/index true
:db/unique :db.unique/value
:db/doc \"DataFindingSourceType.Id\"
:alexa.entity-type :et-DataFindingSourceType
:db.install/_attribute :db.part/db}

;;\"DataFindingSourceType\",\"ModifiedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :DataFindingSourceType/ModifiedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"DataFindingSourceType.ModifiedOn\"
:alexa.entity-type :et-DataFindingSourceType
:db.install/_attribute :db.part/db}

;;\"DataFindingSourceType\",\"Name\",\"[nvarchar](256)\",\"NOT NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :DataFindingSourceType/Name
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"DataFindingSourceType.Name\"
:alexa.entity-type :et-DataFindingSourceType
:db.install/_attribute :db.part/db}

]"
"[;;\"DataFindingTechnicalScan\",\"CreatedOn\",\"datetime\",\"NOT NULL\",\"[DF_DataFindingTechnicalScan_CreatedOn]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :DataFindingTechnicalScan/CreatedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"DataFindingTechnicalScan.CreatedOn\"
:alexa.entity-type :et-DataFindingTechnicalScan
:db.install/_attribute :db.part/db}

;;\"DataFindingTechnicalScan\",\"DataFindingId\",\"bigint\",\"NOT NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :DataFindingTechnicalScan/DataFinding
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(DataFindingTechnicalScan DataFindingId DataFinding DataFinding)\"
:alexa.entity-type :et-DataFindingTechnicalScan
:db.install/_attribute :db.part/db}

;;\"DataFindingTechnicalScan\",\"DeletedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :DataFindingTechnicalScan/DeletedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"DataFindingTechnicalScan.DeletedOn\"
:alexa.entity-type :et-DataFindingTechnicalScan
:db.install/_attribute :db.part/db}

;;\"DataFindingTechnicalScan\",\"DetectionStatusId\",\"bigint\",\"NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :DataFindingTechnicalScan/DetectionStatus
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(DataFindingTechnicalScan DetectionStatusId DetectionStatus DetectionStatus)\"
:alexa.entity-type :et-DataFindingTechnicalScan
:db.install/_attribute :db.part/db}

;;\"DataFindingTechnicalScan\",\"DetectionTypeId\",\"bigint\",\"NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :DataFindingTechnicalScan/DetectionType
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(DataFindingTechnicalScan DetectionTypeId DetectionType DetectionType)\"
:alexa.entity-type :et-DataFindingTechnicalScan
:db.install/_attribute :db.part/db}

;;\"DataFindingTechnicalScan\",\"Id\",\"bigint\",\"NOT NULL\",\"\",\"IDENTITY\",\"PRIMARY KEY\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :DataFindingTechnicalScan/Id
:db/valueType :db.type/long
:db/cardinality :db.cardinality/one
:db/index true
:db/unique :db.unique/value
:db/doc \"DataFindingTechnicalScan.Id\"
:alexa.entity-type :et-DataFindingTechnicalScan
:db.install/_attribute :db.part/db}

;;\"DataFindingTechnicalScan\",\"MatchCount\",\"int\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :DataFindingTechnicalScan/MatchCount
:db/valueType :db.type/long
:db/cardinality :db.cardinality/one
:db/doc \"DataFindingTechnicalScan.MatchCount\"
:alexa.entity-type :et-DataFindingTechnicalScan
:db.install/_attribute :db.part/db}

;;\"DataFindingTechnicalScan\",\"ModifiedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :DataFindingTechnicalScan/ModifiedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"DataFindingTechnicalScan.ModifiedOn\"
:alexa.entity-type :et-DataFindingTechnicalScan
:db.install/_attribute :db.part/db}

;;\"DataFindingTechnicalScan\",\"TechnicalScanId\",\"bigint\",\"NOT NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :DataFindingTechnicalScan/TechnicalScan
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(DataFindingTechnicalScan TechnicalScanId TechnicalScan TechnicalScan)\"
:alexa.entity-type :et-DataFindingTechnicalScan
:db.install/_attribute :db.part/db}

]"
"[;;\"DataLocation\",\"AssetId\",\"bigint\",\"NOT NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :DataLocation/Asset
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(DataLocation AssetId Asset Asset)\"
:alexa.entity-type :et-DataLocation
:db.install/_attribute :db.part/db}

;;\"DataLocation\",\"CreatedOn\",\"datetime\",\"NOT NULL\",\"[DF_DataLocation_CreatedOn]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :DataLocation/CreatedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"DataLocation.CreatedOn\"
:alexa.entity-type :et-DataLocation
:db.install/_attribute :db.part/db}

;;\"DataLocation\",\"DataLocationTypeId\",\"bigint\",\"NOT NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :DataLocation/DataLocationType
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(DataLocation DataLocationTypeId DataLocationType DataLocationType)\"
:alexa.entity-type :et-DataLocation
:db.install/_attribute :db.part/db}

;;\"DataLocation\",\"DeletedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :DataLocation/DeletedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"DataLocation.DeletedOn\"
:alexa.entity-type :et-DataLocation
:db.install/_attribute :db.part/db}

;;\"DataLocation\",\"Description\",\"[nvarchar](1024)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :DataLocation/Description
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"DataLocation.Description\"
:alexa.entity-type :et-DataLocation
:db.install/_attribute :db.part/db}

;;\"DataLocation\",\"Id\",\"bigint\",\"NOT NULL\",\"\",\"IDENTITY\",\"PRIMARY KEY\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :DataLocation/Id
:db/valueType :db.type/long
:db/cardinality :db.cardinality/one
:db/index true
:db/unique :db.unique/value
:db/doc \"DataLocation.Id\"
:alexa.entity-type :et-DataLocation
:db.install/_attribute :db.part/db}

;;\"DataLocation\",\"ModifiedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :DataLocation/ModifiedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"DataLocation.ModifiedOn\"
:alexa.entity-type :et-DataLocation
:db.install/_attribute :db.part/db}

;;\"DataLocation\",\"Name\",\"[nvarchar](256)\",\"NOT NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :DataLocation/Name
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"DataLocation.Name\"
:alexa.entity-type :et-DataLocation
:db.install/_attribute :db.part/db}

;;\"DataLocation\",\"Path\",\"[nvarchar](1024)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :DataLocation/Path
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"DataLocation.Path\"
:alexa.entity-type :et-DataLocation
:db.install/_attribute :db.part/db}

{:db/id #db/id[:db.part/db]
:db/ident :DataLocation/Person
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/many
:db/doc \"(DataLocation DataLocationId DataLocationPerson PersonId Person)\"
:alexa.entity-type :et-DataLocation
:db.install/_attribute :db.part/db}

]"
"[;;\"DataLocationType\",\"CreatedOn\",\"datetime\",\"NOT NULL\",\"[DF_DataLocationType_CreatedOn]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :DataLocationType/CreatedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"DataLocationType.CreatedOn\"
:alexa.entity-type :et-DataLocationType
:db.install/_attribute :db.part/db}

;;\"DataLocationType\",\"DeletedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :DataLocationType/DeletedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"DataLocationType.DeletedOn\"
:alexa.entity-type :et-DataLocationType
:db.install/_attribute :db.part/db}

;;\"DataLocationType\",\"Description\",\"[nvarchar](1024)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :DataLocationType/Description
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"DataLocationType.Description\"
:alexa.entity-type :et-DataLocationType
:db.install/_attribute :db.part/db}

;;\"DataLocationType\",\"Id\",\"bigint\",\"NOT NULL\",\"\",\"IDENTITY\",\"PRIMARY KEY\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :DataLocationType/Id
:db/valueType :db.type/long
:db/cardinality :db.cardinality/one
:db/index true
:db/unique :db.unique/value
:db/doc \"DataLocationType.Id\"
:alexa.entity-type :et-DataLocationType
:db.install/_attribute :db.part/db}

;;\"DataLocationType\",\"ModifiedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :DataLocationType/ModifiedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"DataLocationType.ModifiedOn\"
:alexa.entity-type :et-DataLocationType
:db.install/_attribute :db.part/db}

;;\"DataLocationType\",\"Name\",\"[nvarchar](256)\",\"NOT NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :DataLocationType/Name
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"DataLocationType.Name\"
:alexa.entity-type :et-DataLocationType
:db.install/_attribute :db.part/db}

]"
"[;;\"DataType\",\"BackColorName\",\"[nvarchar](50)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :DataType/BackColorName
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"DataType.BackColorName\"
:alexa.entity-type :et-DataType
:db.install/_attribute :db.part/db}

;;\"DataType\",\"CreatedOn\",\"datetime\",\"NOT NULL\",\"[DF_DataType_CreatedOn_1]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :DataType/CreatedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"DataType.CreatedOn\"
:alexa.entity-type :et-DataType
:db.install/_attribute :db.part/db}

;;\"DataType\",\"DataClassId\",\"bigint\",\"NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :DataType/DataClass
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(DataType DataClassId DataClass DataClass)\"
:alexa.entity-type :et-DataType
:db.install/_attribute :db.part/db}

;;\"DataType\",\"DeletedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :DataType/DeletedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"DataType.DeletedOn\"
:alexa.entity-type :et-DataType
:db.install/_attribute :db.part/db}

;;\"DataType\",\"Description\",\"[nvarchar](1024)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :DataType/Description
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"DataType.Description\"
:alexa.entity-type :et-DataType
:db.install/_attribute :db.part/db}

;;\"DataType\",\"ForeColorName\",\"[nvarchar](50)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :DataType/ForeColorName
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"DataType.ForeColorName\"
:alexa.entity-type :et-DataType
:db.install/_attribute :db.part/db}

;;\"DataType\",\"Id\",\"bigint\",\"NOT NULL\",\"\",\"IDENTITY\",\"PRIMARY KEY\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :DataType/Id
:db/valueType :db.type/long
:db/cardinality :db.cardinality/one
:db/index true
:db/unique :db.unique/value
:db/doc \"DataType.Id\"
:alexa.entity-type :et-DataType
:db.install/_attribute :db.part/db}

;;\"DataType\",\"ModifiedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :DataType/ModifiedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"DataType.ModifiedOn\"
:alexa.entity-type :et-DataType
:db.install/_attribute :db.part/db}

;;\"DataType\",\"Name\",\"[nvarchar](256)\",\"NOT NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :DataType/Name
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"DataType.Name\"
:alexa.entity-type :et-DataType
:db.install/_attribute :db.part/db}

{:db/id #db/id[:db.part/db]
:db/ident :DataType/AssetGroup
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/many
:db/doc \"(DataType DataTypeId AssetGroupDataType AssetGroupId AssetGroup)\"
:alexa.entity-type :et-DataType
:db.install/_attribute :db.part/db}

{:db/id #db/id[:db.part/db]
:db/ident :DataType/Asset
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/many
:db/doc \"(DataType DataTypeId AssetDataType AssetId Asset)\"
:alexa.entity-type :et-DataType
:db.install/_attribute :db.part/db}

{:db/id #db/id[:db.part/db]
:db/ident :DataType/DataFindingRule
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/many
:db/doc \"(DataType DataTypeId DataFindingRuleDataType DataFindingRuleId DataFindingRule)\"
:alexa.entity-type :et-DataType
:db.install/_attribute :db.part/db}

{:db/id #db/id[:db.part/db]
:db/ident :DataType/Software
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/many
:db/doc \"(DataType DataTypeId SoftwareDataType SoftwareId Software)\"
:alexa.entity-type :et-DataType
:db.install/_attribute :db.part/db}

{:db/id #db/id[:db.part/db]
:db/ident :DataType/Standard
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/many
:db/doc \"(DataType DataTypeId StandardDataType StandardId Standard)\"
:alexa.entity-type :et-DataType
:db.install/_attribute :db.part/db}

]"
"[;;\"DetectionStatus\",\"CreatedOn\",\"datetime\",\"NOT NULL\",\"[DF_DetectionStatus_CreatedOn]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :DetectionStatus/CreatedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"DetectionStatus.CreatedOn\"
:alexa.entity-type :et-DetectionStatus
:db.install/_attribute :db.part/db}

;;\"DetectionStatus\",\"DeletedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :DetectionStatus/DeletedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"DetectionStatus.DeletedOn\"
:alexa.entity-type :et-DetectionStatus
:db.install/_attribute :db.part/db}

;;\"DetectionStatus\",\"Description\",\"[nvarchar](1024)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :DetectionStatus/Description
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"DetectionStatus.Description\"
:alexa.entity-type :et-DetectionStatus
:db.install/_attribute :db.part/db}

;;\"DetectionStatus\",\"Id\",\"bigint\",\"NOT NULL\",\"\",\"IDENTITY\",\"PRIMARY KEY\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :DetectionStatus/Id
:db/valueType :db.type/long
:db/cardinality :db.cardinality/one
:db/index true
:db/unique :db.unique/value
:db/doc \"DetectionStatus.Id\"
:alexa.entity-type :et-DetectionStatus
:db.install/_attribute :db.part/db}

;;\"DetectionStatus\",\"ModifiedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :DetectionStatus/ModifiedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"DetectionStatus.ModifiedOn\"
:alexa.entity-type :et-DetectionStatus
:db.install/_attribute :db.part/db}

;;\"DetectionStatus\",\"Name\",\"[nvarchar](256)\",\"NOT NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :DetectionStatus/Name
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"DetectionStatus.Name\"
:alexa.entity-type :et-DetectionStatus
:db.install/_attribute :db.part/db}

]"
"[;;\"DetectionType\",\"CreatedOn\",\"datetime\",\"NOT NULL\",\"[DF_DetectionType_CreatedOn]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :DetectionType/CreatedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"DetectionType.CreatedOn\"
:alexa.entity-type :et-DetectionType
:db.install/_attribute :db.part/db}

;;\"DetectionType\",\"DeletedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :DetectionType/DeletedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"DetectionType.DeletedOn\"
:alexa.entity-type :et-DetectionType
:db.install/_attribute :db.part/db}

;;\"DetectionType\",\"Description\",\"[nvarchar](1024)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :DetectionType/Description
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"DetectionType.Description\"
:alexa.entity-type :et-DetectionType
:db.install/_attribute :db.part/db}

;;\"DetectionType\",\"Id\",\"bigint\",\"NOT NULL\",\"\",\"IDENTITY\",\"PRIMARY KEY\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :DetectionType/Id
:db/valueType :db.type/long
:db/cardinality :db.cardinality/one
:db/index true
:db/unique :db.unique/value
:db/doc \"DetectionType.Id\"
:alexa.entity-type :et-DetectionType
:db.install/_attribute :db.part/db}

;;\"DetectionType\",\"ModifiedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :DetectionType/ModifiedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"DetectionType.ModifiedOn\"
:alexa.entity-type :et-DetectionType
:db.install/_attribute :db.part/db}

;;\"DetectionType\",\"Name\",\"[nvarchar](256)\",\"NOT NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :DetectionType/Name
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"DetectionType.Name\"
:alexa.entity-type :et-DetectionType
:db.install/_attribute :db.part/db}

]"
"[;;\"EffortCategory\",\"CreatedOn\",\"datetime\",\"NOT NULL\",\"[DF_EffortCategory_CreatedOn]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :EffortCategory/CreatedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"EffortCategory.CreatedOn\"
:alexa.entity-type :et-EffortCategory
:db.install/_attribute :db.part/db}

;;\"EffortCategory\",\"DeletedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :EffortCategory/DeletedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"EffortCategory.DeletedOn\"
:alexa.entity-type :et-EffortCategory
:db.install/_attribute :db.part/db}

;;\"EffortCategory\",\"Description\",\"[nvarchar](1024)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :EffortCategory/Description
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"EffortCategory.Description\"
:alexa.entity-type :et-EffortCategory
:db.install/_attribute :db.part/db}

;;\"EffortCategory\",\"Id\",\"bigint\",\"NOT NULL\",\"\",\"IDENTITY\",\"PRIMARY KEY\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :EffortCategory/Id
:db/valueType :db.type/long
:db/cardinality :db.cardinality/one
:db/index true
:db/unique :db.unique/value
:db/doc \"EffortCategory.Id\"
:alexa.entity-type :et-EffortCategory
:db.install/_attribute :db.part/db}

;;\"EffortCategory\",\"ModifiedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :EffortCategory/ModifiedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"EffortCategory.ModifiedOn\"
:alexa.entity-type :et-EffortCategory
:db.install/_attribute :db.part/db}

;;\"EffortCategory\",\"Name\",\"[nvarchar](256)\",\"NOT NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :EffortCategory/Name
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"EffortCategory.Name\"
:alexa.entity-type :et-EffortCategory
:db.install/_attribute :db.part/db}

]"
"[;;\"EntityType\",\"CreatedOn\",\"datetime\",\"NOT NULL\",\"[DF_EntityType_CreatedOn]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :EntityType/CreatedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"EntityType.CreatedOn\"
:alexa.entity-type :et-EntityType
:db.install/_attribute :db.part/db}

;;\"EntityType\",\"DeletedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :EntityType/DeletedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"EntityType.DeletedOn\"
:alexa.entity-type :et-EntityType
:db.install/_attribute :db.part/db}

;;\"EntityType\",\"Description\",\"[nvarchar](1024)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :EntityType/Description
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"EntityType.Description\"
:alexa.entity-type :et-EntityType
:db.install/_attribute :db.part/db}

;;\"EntityType\",\"Id\",\"bigint\",\"NOT NULL\",\"\",\"IDENTITY\",\"PRIMARY KEY\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :EntityType/Id
:db/valueType :db.type/long
:db/cardinality :db.cardinality/one
:db/index true
:db/unique :db.unique/value
:db/doc \"EntityType.Id\"
:alexa.entity-type :et-EntityType
:db.install/_attribute :db.part/db}

;;\"EntityType\",\"ModifiedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :EntityType/ModifiedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"EntityType.ModifiedOn\"
:alexa.entity-type :et-EntityType
:db.install/_attribute :db.part/db}

;;\"EntityType\",\"Name\",\"[nvarchar](256)\",\"NOT NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :EntityType/Name
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"EntityType.Name\"
:alexa.entity-type :et-EntityType
:db.install/_attribute :db.part/db}

]"
"[;;\"EventHistory\",\"CreatedOn\",\"datetime\",\"NOT NULL\",\"[DF_EventHistory_CreatedOn]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :EventHistory/CreatedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"EventHistory.CreatedOn\"
:alexa.entity-type :et-EventHistory
:db.install/_attribute :db.part/db}

;;\"EventHistory\",\"DeletedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :EventHistory/DeletedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"EventHistory.DeletedOn\"
:alexa.entity-type :et-EventHistory
:db.install/_attribute :db.part/db}

;;\"EventHistory\",\"Details\",\"[nvarchar](MAX)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :EventHistory/Details
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"EventHistory.Details\"
:alexa.entity-type :et-EventHistory
:db.install/_attribute :db.part/db}

;;\"EventHistory\",\"EventModuleId\",\"bigint\",\"NOT NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :EventHistory/EventModule
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(EventHistory EventModuleId EventModule EventModule)\"
:alexa.entity-type :et-EventHistory
:db.install/_attribute :db.part/db}

;;\"EventHistory\",\"EventTypeId\",\"bigint\",\"NOT NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :EventHistory/EventType
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(EventHistory EventTypeId EventType EventType)\"
:alexa.entity-type :et-EventHistory
:db.install/_attribute :db.part/db}

;;\"EventHistory\",\"Id\",\"bigint\",\"NOT NULL\",\"\",\"IDENTITY\",\"PRIMARY KEY\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :EventHistory/Id
:db/valueType :db.type/long
:db/cardinality :db.cardinality/one
:db/index true
:db/unique :db.unique/value
:db/doc \"EventHistory.Id\"
:alexa.entity-type :et-EventHistory
:db.install/_attribute :db.part/db}

;;\"EventHistory\",\"LoginPersonId\",\"bigint\",\"NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :EventHistory/LoginPerson
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(EventHistory LoginPersonId Person LoginPerson)\"
:alexa.entity-type :et-EventHistory
:db.install/_attribute :db.part/db}

;;\"EventHistory\",\"ModifiedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :EventHistory/ModifiedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"EventHistory.ModifiedOn\"
:alexa.entity-type :et-EventHistory
:db.install/_attribute :db.part/db}

;;\"EventHistory\",\"Title\",\"[nvarchar](256)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :EventHistory/Title
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"EventHistory.Title\"
:alexa.entity-type :et-EventHistory
:db.install/_attribute :db.part/db}

{:db/id #db/id[:db.part/db]
:db/ident :EventHistory/DataFile
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/many
:db/doc \"(EventHistory EventHistoryId EventHistoryReference ReferenceId Reference)\"
:alexa.entity-type :et-EventHistory
:db.install/_attribute :db.part/db}

]"
"[;;\"EventModule\",\"CreatedOn\",\"datetime\",\"NOT NULL\",\"[DF_EventModule_CreatedOn]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :EventModule/CreatedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"EventModule.CreatedOn\"
:alexa.entity-type :et-EventModule
:db.install/_attribute :db.part/db}

;;\"EventModule\",\"DeletedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :EventModule/DeletedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"EventModule.DeletedOn\"
:alexa.entity-type :et-EventModule
:db.install/_attribute :db.part/db}

;;\"EventModule\",\"Description\",\"[nvarchar](1024)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :EventModule/Description
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"EventModule.Description\"
:alexa.entity-type :et-EventModule
:db.install/_attribute :db.part/db}

;;\"EventModule\",\"Id\",\"bigint\",\"NOT NULL\",\"\",\"IDENTITY\",\"PRIMARY KEY\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :EventModule/Id
:db/valueType :db.type/long
:db/cardinality :db.cardinality/one
:db/index true
:db/unique :db.unique/value
:db/doc \"EventModule.Id\"
:alexa.entity-type :et-EventModule
:db.install/_attribute :db.part/db}

;;\"EventModule\",\"ModifiedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :EventModule/ModifiedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"EventModule.ModifiedOn\"
:alexa.entity-type :et-EventModule
:db.install/_attribute :db.part/db}

;;\"EventModule\",\"Name\",\"[nvarchar](256)\",\"NOT NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :EventModule/Name
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"EventModule.Name\"
:alexa.entity-type :et-EventModule
:db.install/_attribute :db.part/db}

]"
"[;;\"EventType\",\"CreatedOn\",\"datetime\",\"NOT NULL\",\"[DF_EventType_CreatedOn]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :EventType/CreatedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"EventType.CreatedOn\"
:alexa.entity-type :et-EventType
:db.install/_attribute :db.part/db}

;;\"EventType\",\"DeletedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :EventType/DeletedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"EventType.DeletedOn\"
:alexa.entity-type :et-EventType
:db.install/_attribute :db.part/db}

;;\"EventType\",\"Description\",\"[nvarchar](1024)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :EventType/Description
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"EventType.Description\"
:alexa.entity-type :et-EventType
:db.install/_attribute :db.part/db}

;;\"EventType\",\"Id\",\"bigint\",\"NOT NULL\",\"\",\"IDENTITY\",\"PRIMARY KEY\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :EventType/Id
:db/valueType :db.type/long
:db/cardinality :db.cardinality/one
:db/index true
:db/unique :db.unique/value
:db/doc \"EventType.Id\"
:alexa.entity-type :et-EventType
:db.install/_attribute :db.part/db}

;;\"EventType\",\"ModifiedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :EventType/ModifiedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"EventType.ModifiedOn\"
:alexa.entity-type :et-EventType
:db.install/_attribute :db.part/db}

;;\"EventType\",\"Name\",\"[nvarchar](256)\",\"NOT NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :EventType/Name
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"EventType.Name\"
:alexa.entity-type :et-EventType
:db.install/_attribute :db.part/db}

]"
"[;;\"ExpenseCategory\",\"CreatedOn\",\"datetime\",\"NOT NULL\",\"[DF_ExpenseCategory_CreatedOn]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :ExpenseCategory/CreatedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"ExpenseCategory.CreatedOn\"
:alexa.entity-type :et-ExpenseCategory
:db.install/_attribute :db.part/db}

;;\"ExpenseCategory\",\"DeletedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :ExpenseCategory/DeletedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"ExpenseCategory.DeletedOn\"
:alexa.entity-type :et-ExpenseCategory
:db.install/_attribute :db.part/db}

;;\"ExpenseCategory\",\"Description\",\"[nvarchar](1024)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :ExpenseCategory/Description
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"ExpenseCategory.Description\"
:alexa.entity-type :et-ExpenseCategory
:db.install/_attribute :db.part/db}

;;\"ExpenseCategory\",\"Id\",\"bigint\",\"NOT NULL\",\"\",\"IDENTITY\",\"PRIMARY KEY\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :ExpenseCategory/Id
:db/valueType :db.type/long
:db/cardinality :db.cardinality/one
:db/index true
:db/unique :db.unique/value
:db/doc \"ExpenseCategory.Id\"
:alexa.entity-type :et-ExpenseCategory
:db.install/_attribute :db.part/db}

;;\"ExpenseCategory\",\"ModifiedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :ExpenseCategory/ModifiedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"ExpenseCategory.ModifiedOn\"
:alexa.entity-type :et-ExpenseCategory
:db.install/_attribute :db.part/db}

;;\"ExpenseCategory\",\"Name\",\"[nvarchar](256)\",\"NOT NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :ExpenseCategory/Name
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"ExpenseCategory.Name\"
:alexa.entity-type :et-ExpenseCategory
:db.install/_attribute :db.part/db}

]"
"[;;\"Explanation\",\"CreatedBy_PersonId\",\"bigint\",\"NOT NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :Explanation/CreatedBy_Person
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(Explanation CreatedBy_PersonId Person CreatedBy_Person)\"
:alexa.entity-type :et-Explanation
:db.install/_attribute :db.part/db}

;;\"Explanation\",\"CreatedOn\",\"datetime\",\"NOT NULL\",\"[DF_Explanation_CreatedOn]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Explanation/CreatedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"Explanation.CreatedOn\"
:alexa.entity-type :et-Explanation
:db.install/_attribute :db.part/db}

;;\"Explanation\",\"DeletedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Explanation/DeletedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"Explanation.DeletedOn\"
:alexa.entity-type :et-Explanation
:db.install/_attribute :db.part/db}

;;\"Explanation\",\"Details\",\"[nvarchar](MAX)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Explanation/Details
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"Explanation.Details\"
:alexa.entity-type :et-Explanation
:db.install/_attribute :db.part/db}

;;\"Explanation\",\"ExplanationCategoryId\",\"bigint\",\"NOT NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :Explanation/ExplanationCategory
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(Explanation ExplanationCategoryId ExplanationCategory ExplanationCategory)\"
:alexa.entity-type :et-Explanation
:db.install/_attribute :db.part/db}

;;\"Explanation\",\"Id\",\"bigint\",\"NOT NULL\",\"\",\"IDENTITY\",\"PRIMARY KEY\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Explanation/Id
:db/valueType :db.type/long
:db/cardinality :db.cardinality/one
:db/index true
:db/unique :db.unique/value
:db/doc \"Explanation.Id\"
:alexa.entity-type :et-Explanation
:db.install/_attribute :db.part/db}

;;\"Explanation\",\"ModifiedBy_PersonId\",\"bigint\",\"NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :Explanation/ModifiedBy_Person
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(Explanation ModifiedBy_PersonId Person ModifiedBy_Person)\"
:alexa.entity-type :et-Explanation
:db.install/_attribute :db.part/db}

;;\"Explanation\",\"ModifiedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Explanation/ModifiedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"Explanation.ModifiedOn\"
:alexa.entity-type :et-Explanation
:db.install/_attribute :db.part/db}

;;\"Explanation\",\"Title\",\"[nvarchar](256)\",\"NOT NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Explanation/Title
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"Explanation.Title\"
:alexa.entity-type :et-Explanation
:db.install/_attribute :db.part/db}

{:db/id #db/id[:db.part/db]
:db/ident :Explanation/DataFile
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/many
:db/doc \"(Explanation ExplanationId ExplanationReference ReferenceId Reference)\"
:alexa.entity-type :et-Explanation
:db.install/_attribute :db.part/db}

]"
"[;;\"ExplanationCategory\",\"CreatedOn\",\"datetime\",\"NOT NULL\",\"[DF_ExplanationCategory_CreatedOn]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :ExplanationCategory/CreatedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"ExplanationCategory.CreatedOn\"
:alexa.entity-type :et-ExplanationCategory
:db.install/_attribute :db.part/db}

;;\"ExplanationCategory\",\"DeletedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :ExplanationCategory/DeletedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"ExplanationCategory.DeletedOn\"
:alexa.entity-type :et-ExplanationCategory
:db.install/_attribute :db.part/db}

;;\"ExplanationCategory\",\"Description\",\"[nvarchar](1024)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :ExplanationCategory/Description
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"ExplanationCategory.Description\"
:alexa.entity-type :et-ExplanationCategory
:db.install/_attribute :db.part/db}

;;\"ExplanationCategory\",\"Id\",\"bigint\",\"NOT NULL\",\"\",\"IDENTITY\",\"PRIMARY KEY\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :ExplanationCategory/Id
:db/valueType :db.type/long
:db/cardinality :db.cardinality/one
:db/index true
:db/unique :db.unique/value
:db/doc \"ExplanationCategory.Id\"
:alexa.entity-type :et-ExplanationCategory
:db.install/_attribute :db.part/db}

;;\"ExplanationCategory\",\"ModifiedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :ExplanationCategory/ModifiedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"ExplanationCategory.ModifiedOn\"
:alexa.entity-type :et-ExplanationCategory
:db.install/_attribute :db.part/db}

;;\"ExplanationCategory\",\"Name\",\"[nvarchar](256)\",\"NOT NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :ExplanationCategory/Name
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"ExplanationCategory.Name\"
:alexa.entity-type :et-ExplanationCategory
:db.install/_attribute :db.part/db}

]"
"[;;\"Exposure\",\"BackColorName\",\"[nvarchar](50)\",\"NULL\",\"[DF_Exposure_BackColorName]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Exposure/BackColorName
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"Exposure.BackColorName\"
:alexa.entity-type :et-Exposure
:db.install/_attribute :db.part/db}

;;\"Exposure\",\"CreatedOn\",\"datetime\",\"NOT NULL\",\"[DF_Exposure_CreatedOn]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Exposure/CreatedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"Exposure.CreatedOn\"
:alexa.entity-type :et-Exposure
:db.install/_attribute :db.part/db}

;;\"Exposure\",\"DeletedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Exposure/DeletedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"Exposure.DeletedOn\"
:alexa.entity-type :et-Exposure
:db.install/_attribute :db.part/db}

;;\"Exposure\",\"Description\",\"[nvarchar](1024)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Exposure/Description
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"Exposure.Description\"
:alexa.entity-type :et-Exposure
:db.install/_attribute :db.part/db}

;;\"Exposure\",\"ForeColorName\",\"[nvarchar](50)\",\"NULL\",\"[DF_Exposure_ForeColorName]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Exposure/ForeColorName
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"Exposure.ForeColorName\"
:alexa.entity-type :et-Exposure
:db.install/_attribute :db.part/db}

;;\"Exposure\",\"Id\",\"bigint\",\"NOT NULL\",\"\",\"IDENTITY\",\"PRIMARY KEY\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Exposure/Id
:db/valueType :db.type/long
:db/cardinality :db.cardinality/one
:db/index true
:db/unique :db.unique/value
:db/doc \"Exposure.Id\"
:alexa.entity-type :et-Exposure
:db.install/_attribute :db.part/db}

;;\"Exposure\",\"ModifiedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Exposure/ModifiedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"Exposure.ModifiedOn\"
:alexa.entity-type :et-Exposure
:db.install/_attribute :db.part/db}

;;\"Exposure\",\"Name\",\"[nvarchar](256)\",\"NOT NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Exposure/Name
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"Exposure.Name\"
:alexa.entity-type :et-Exposure
:db.install/_attribute :db.part/db}

;;\"Exposure\",\"Number\",\"int\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Exposure/Number
:db/valueType :db.type/long
:db/cardinality :db.cardinality/one
:db/doc \"Exposure.Number\"
:alexa.entity-type :et-Exposure
:db.install/_attribute :db.part/db}

;;\"Exposure\",\"Probability\",\"float\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Exposure/Probability
:db/valueType :db.type/float
:db/cardinality :db.cardinality/one
:db/doc \"Exposure.Probability\"
:alexa.entity-type :et-Exposure
:db.install/_attribute :db.part/db}

]"
"[;;\"ExposureCategory\",\"CreatedOn\",\"datetime\",\"NOT NULL\",\"[DF_ExposureCategory_CreatedOn]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :ExposureCategory/CreatedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"ExposureCategory.CreatedOn\"
:alexa.entity-type :et-ExposureCategory
:db.install/_attribute :db.part/db}

;;\"ExposureCategory\",\"DeletedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :ExposureCategory/DeletedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"ExposureCategory.DeletedOn\"
:alexa.entity-type :et-ExposureCategory
:db.install/_attribute :db.part/db}

;;\"ExposureCategory\",\"Description\",\"[nvarchar](1024)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :ExposureCategory/Description
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"ExposureCategory.Description\"
:alexa.entity-type :et-ExposureCategory
:db.install/_attribute :db.part/db}

;;\"ExposureCategory\",\"Id\",\"bigint\",\"NOT NULL\",\"\",\"IDENTITY\",\"PRIMARY KEY\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :ExposureCategory/Id
:db/valueType :db.type/long
:db/cardinality :db.cardinality/one
:db/index true
:db/unique :db.unique/value
:db/doc \"ExposureCategory.Id\"
:alexa.entity-type :et-ExposureCategory
:db.install/_attribute :db.part/db}

;;\"ExposureCategory\",\"ModifiedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :ExposureCategory/ModifiedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"ExposureCategory.ModifiedOn\"
:alexa.entity-type :et-ExposureCategory
:db.install/_attribute :db.part/db}

;;\"ExposureCategory\",\"Name\",\"[nvarchar](256)\",\"NOT NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :ExposureCategory/Name
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"ExposureCategory.Name\"
:alexa.entity-type :et-ExposureCategory
:db.install/_attribute :db.part/db}

{:db/id #db/id[:db.part/db]
:db/ident :ExposureCategory/Analysis
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/many
:db/doc \"(ExposureCategory ExposureCategoryId AnalysisExposureCategory AnalysisId Analysis)\"
:alexa.entity-type :et-ExposureCategory
:db.install/_attribute :db.part/db}

]"
"[;;\"GlobalSettings\",\"CreatedOn\",\"datetime\",\"NOT NULL\",\"[DF_GlobalSettings_CreatedOn]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :GlobalSettings/CreatedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"GlobalSettings.CreatedOn\"
:alexa.entity-type :et-GlobalSettings
:db.install/_attribute :db.part/db}

;;\"GlobalSettings\",\"DeletedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :GlobalSettings/DeletedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"GlobalSettings.DeletedOn\"
:alexa.entity-type :et-GlobalSettings
:db.install/_attribute :db.part/db}

;;\"GlobalSettings\",\"Id\",\"bigint\",\"NOT NULL\",\"\",\"IDENTITY\",\"PRIMARY KEY\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :GlobalSettings/Id
:db/valueType :db.type/long
:db/cardinality :db.cardinality/one
:db/index true
:db/unique :db.unique/value
:db/doc \"GlobalSettings.Id\"
:alexa.entity-type :et-GlobalSettings
:db.install/_attribute :db.part/db}

;;\"GlobalSettings\",\"ModifiedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :GlobalSettings/ModifiedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"GlobalSettings.ModifiedOn\"
:alexa.entity-type :et-GlobalSettings
:db.install/_attribute :db.part/db}

;;\"GlobalSettings\",\"Name\",\"[nvarchar](256)\",\"NOT NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :GlobalSettings/Name
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"GlobalSettings.Name\"
:alexa.entity-type :et-GlobalSettings
:db.install/_attribute :db.part/db}

;;\"GlobalSettings\",\"Value\",\"[nvarchar](MAX)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :GlobalSettings/Value
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"GlobalSettings.Value\"
:alexa.entity-type :et-GlobalSettings
:db.install/_attribute :db.part/db}

]"
"[;;\"Impact\",\"Amount\",\"money\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Impact/Amount
:db/valueType :db.type/bigdec
:db/cardinality :db.cardinality/one
:db/doc \"Impact.Amount\"
:alexa.entity-type :et-Impact
:db.install/_attribute :db.part/db}

;;\"Impact\",\"BackColorName\",\"[nvarchar](50)\",\"NULL\",\"[DF_Impact_BackColorName]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Impact/BackColorName
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"Impact.BackColorName\"
:alexa.entity-type :et-Impact
:db.install/_attribute :db.part/db}

;;\"Impact\",\"CreatedOn\",\"datetime\",\"NOT NULL\",\"[DF_Impact_CreatedOn]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Impact/CreatedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"Impact.CreatedOn\"
:alexa.entity-type :et-Impact
:db.install/_attribute :db.part/db}

;;\"Impact\",\"DeletedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Impact/DeletedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"Impact.DeletedOn\"
:alexa.entity-type :et-Impact
:db.install/_attribute :db.part/db}

;;\"Impact\",\"Description\",\"[nvarchar](1024)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Impact/Description
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"Impact.Description\"
:alexa.entity-type :et-Impact
:db.install/_attribute :db.part/db}

;;\"Impact\",\"ForeColorName\",\"[nvarchar](50)\",\"NULL\",\"[DF_Impact_ForeColorName]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Impact/ForeColorName
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"Impact.ForeColorName\"
:alexa.entity-type :et-Impact
:db.install/_attribute :db.part/db}

;;\"Impact\",\"Id\",\"bigint\",\"NOT NULL\",\"\",\"IDENTITY\",\"PRIMARY KEY\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Impact/Id
:db/valueType :db.type/long
:db/cardinality :db.cardinality/one
:db/index true
:db/unique :db.unique/value
:db/doc \"Impact.Id\"
:alexa.entity-type :et-Impact
:db.install/_attribute :db.part/db}

;;\"Impact\",\"ModifiedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Impact/ModifiedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"Impact.ModifiedOn\"
:alexa.entity-type :et-Impact
:db.install/_attribute :db.part/db}

;;\"Impact\",\"Name\",\"[nvarchar](256)\",\"NOT NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Impact/Name
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"Impact.Name\"
:alexa.entity-type :et-Impact
:db.install/_attribute :db.part/db}

;;\"Impact\",\"Value\",\"float\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Impact/Value
:db/valueType :db.type/float
:db/cardinality :db.cardinality/one
:db/doc \"Impact.Value\"
:alexa.entity-type :et-Impact
:db.install/_attribute :db.part/db}

{:db/id #db/id[:db.part/db]
:db/ident :Impact/AssetFilter
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/many
:db/doc \"(Impact ImpactId AssetFilterImpact AssetFilterId AssetFilter)\"
:alexa.entity-type :et-Impact
:db.install/_attribute :db.part/db}

]"
"[;;\"ImpactType\",\"CreatedOn\",\"datetime\",\"NOT NULL\",\"[DF_ImpactType_CreatedOn]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :ImpactType/CreatedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"ImpactType.CreatedOn\"
:alexa.entity-type :et-ImpactType
:db.install/_attribute :db.part/db}

;;\"ImpactType\",\"DeletedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :ImpactType/DeletedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"ImpactType.DeletedOn\"
:alexa.entity-type :et-ImpactType
:db.install/_attribute :db.part/db}

;;\"ImpactType\",\"Description\",\"[nvarchar](1024)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :ImpactType/Description
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"ImpactType.Description\"
:alexa.entity-type :et-ImpactType
:db.install/_attribute :db.part/db}

;;\"ImpactType\",\"Id\",\"bigint\",\"NOT NULL\",\"\",\"IDENTITY\",\"PRIMARY KEY\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :ImpactType/Id
:db/valueType :db.type/long
:db/cardinality :db.cardinality/one
:db/index true
:db/unique :db.unique/value
:db/doc \"ImpactType.Id\"
:alexa.entity-type :et-ImpactType
:db.install/_attribute :db.part/db}

;;\"ImpactType\",\"ModifiedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :ImpactType/ModifiedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"ImpactType.ModifiedOn\"
:alexa.entity-type :et-ImpactType
:db.install/_attribute :db.part/db}

;;\"ImpactType\",\"Name\",\"[nvarchar](256)\",\"NOT NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :ImpactType/Name
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"ImpactType.Name\"
:alexa.entity-type :et-ImpactType
:db.install/_attribute :db.part/db}

]"
"[;;\"ImportData\",\"Args\",\"[varbinary](MAX)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :ImportData/Args
:db/valueType :db.type/uri
:db/cardinality :db.cardinality/one
:db/doc \"ImportData.Args\"
:alexa.entity-type :et-ImportData
:db.install/_attribute :db.part/db}

;;\"ImportData\",\"CreatedOn\",\"datetime\",\"NOT NULL\",\"[DF_ImportData_CreatedOn]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :ImportData/CreatedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"ImportData.CreatedOn\"
:alexa.entity-type :et-ImportData
:db.install/_attribute :db.part/db}

;;\"ImportData\",\"Data\",\"[varbinary](MAX)\",\"NOT NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :ImportData/Data
:db/valueType :db.type/uri
:db/cardinality :db.cardinality/one
:db/doc \"ImportData.Data\"
:alexa.entity-type :et-ImportData
:db.install/_attribute :db.part/db}

;;\"ImportData\",\"DeletedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :ImportData/DeletedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"ImportData.DeletedOn\"
:alexa.entity-type :et-ImportData
:db.install/_attribute :db.part/db}

;;\"ImportData\",\"DocType\",\"[nvarchar](50)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :ImportData/DocType
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"ImportData.DocType\"
:alexa.entity-type :et-ImportData
:db.install/_attribute :db.part/db}

;;\"ImportData\",\"Guid\",\"[nvarchar](50)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :ImportData/Guid
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"ImportData.Guid\"
:alexa.entity-type :et-ImportData
:db.install/_attribute :db.part/db}

;;\"ImportData\",\"Id\",\"bigint\",\"NOT NULL\",\"\",\"IDENTITY\",\"PRIMARY KEY\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :ImportData/Id
:db/valueType :db.type/long
:db/cardinality :db.cardinality/one
:db/index true
:db/unique :db.unique/value
:db/doc \"ImportData.Id\"
:alexa.entity-type :et-ImportData
:db.install/_attribute :db.part/db}

;;\"ImportData\",\"ModifiedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :ImportData/ModifiedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"ImportData.ModifiedOn\"
:alexa.entity-type :et-ImportData
:db.install/_attribute :db.part/db}

;;\"ImportData\",\"Name\",\"[nvarchar](256)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :ImportData/Name
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"ImportData.Name\"
:alexa.entity-type :et-ImportData
:db.install/_attribute :db.part/db}

;;\"ImportData\",\"Timestamp\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :ImportData/Timestamp
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"ImportData.Timestamp\"
:alexa.entity-type :et-ImportData
:db.install/_attribute :db.part/db}

;;\"ImportData\",\"Version\",\"[nvarchar](50)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :ImportData/Version
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"ImportData.Version\"
:alexa.entity-type :et-ImportData
:db.install/_attribute :db.part/db}

]"
"[;;\"ImporterSettings\",\"CreatedBy_PersonId\",\"bigint\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :ImporterSettings/CreatedBy_PersonId
:db/valueType :db.type/long
:db/cardinality :db.cardinality/one
:db/doc \"ImporterSettings.CreatedBy_PersonId\"
:alexa.entity-type :et-ImporterSettings
:db.install/_attribute :db.part/db}

;;\"ImporterSettings\",\"CreatedOn\",\"datetime\",\"NOT NULL\",\"[DF_ImporterSettings_CreatedOn]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :ImporterSettings/CreatedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"ImporterSettings.CreatedOn\"
:alexa.entity-type :et-ImporterSettings
:db.install/_attribute :db.part/db}

;;\"ImporterSettings\",\"Data\",\"[varbinary](MAX)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :ImporterSettings/Data
:db/valueType :db.type/uri
:db/cardinality :db.cardinality/one
:db/doc \"ImporterSettings.Data\"
:alexa.entity-type :et-ImporterSettings
:db.install/_attribute :db.part/db}

;;\"ImporterSettings\",\"DeletedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :ImporterSettings/DeletedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"ImporterSettings.DeletedOn\"
:alexa.entity-type :et-ImporterSettings
:db.install/_attribute :db.part/db}

;;\"ImporterSettings\",\"Id\",\"bigint\",\"NOT NULL\",\"\",\"IDENTITY\",\"PRIMARY KEY\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :ImporterSettings/Id
:db/valueType :db.type/long
:db/cardinality :db.cardinality/one
:db/index true
:db/unique :db.unique/value
:db/doc \"ImporterSettings.Id\"
:alexa.entity-type :et-ImporterSettings
:db.install/_attribute :db.part/db}

;;\"ImporterSettings\",\"ImporterKey\",\"[nvarchar](128)\",\"NOT NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :ImporterSettings/ImporterKey
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"ImporterSettings.ImporterKey\"
:alexa.entity-type :et-ImporterSettings
:db.install/_attribute :db.part/db}

;;\"ImporterSettings\",\"MapTypeKey\",\"[nvarchar](50)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :ImporterSettings/MapTypeKey
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"ImporterSettings.MapTypeKey\"
:alexa.entity-type :et-ImporterSettings
:db.install/_attribute :db.part/db}

;;\"ImporterSettings\",\"ModifiedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :ImporterSettings/ModifiedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"ImporterSettings.ModifiedOn\"
:alexa.entity-type :et-ImporterSettings
:db.install/_attribute :db.part/db}

;;\"ImporterSettings\",\"Name\",\"[nvarchar](256)\",\"NOT NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :ImporterSettings/Name
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"ImporterSettings.Name\"
:alexa.entity-type :et-ImporterSettings
:db.install/_attribute :db.part/db}

]"
"[;;\"Incident\",\"CreatedOn\",\"datetime\",\"NOT NULL\",\"[DF_Incident_CreatedOn]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Incident/CreatedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"Incident.CreatedOn\"
:alexa.entity-type :et-Incident
:db.install/_attribute :db.part/db}

;;\"Incident\",\"DeletedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Incident/DeletedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"Incident.DeletedOn\"
:alexa.entity-type :et-Incident
:db.install/_attribute :db.part/db}

;;\"Incident\",\"Description\",\"[nvarchar](MAX)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Incident/Description
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"Incident.Description\"
:alexa.entity-type :et-Incident
:db.install/_attribute :db.part/db}

;;\"Incident\",\"Id\",\"bigint\",\"NOT NULL\",\"\",\"IDENTITY\",\"PRIMARY KEY\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Incident/Id
:db/valueType :db.type/long
:db/cardinality :db.cardinality/one
:db/index true
:db/unique :db.unique/value
:db/doc \"Incident.Id\"
:alexa.entity-type :et-Incident
:db.install/_attribute :db.part/db}

;;\"Incident\",\"IncidentStatusId\",\"bigint\",\"NOT NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :Incident/IncidentStatus
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(Incident IncidentStatusId IncidentStatus IncidentStatus)\"
:alexa.entity-type :et-Incident
:db.install/_attribute :db.part/db}

;;\"Incident\",\"IncidentTypeId\",\"bigint\",\"NOT NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :Incident/IncidentType
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(Incident IncidentTypeId IncidentType IncidentType)\"
:alexa.entity-type :et-Incident
:db.install/_attribute :db.part/db}

;;\"Incident\",\"ModifiedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Incident/ModifiedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"Incident.ModifiedOn\"
:alexa.entity-type :et-Incident
:db.install/_attribute :db.part/db}

;;\"Incident\",\"Name\",\"[nvarchar](256)\",\"NOT NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Incident/Name
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"Incident.Name\"
:alexa.entity-type :et-Incident
:db.install/_attribute :db.part/db}

;;\"Incident\",\"NotifyEmail\",\"[nvarchar](256)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Incident/NotifyEmail
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"Incident.NotifyEmail\"
:alexa.entity-type :et-Incident
:db.install/_attribute :db.part/db}

;;\"Incident\",\"NotifyRequested\",\"bit\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Incident/NotifyRequested
:db/valueType :db.type/boolean
:db/cardinality :db.cardinality/one
:db/doc \"Incident.NotifyRequested\"
:alexa.entity-type :et-Incident
:db.install/_attribute :db.part/db}

;;\"Incident\",\"OccurredOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Incident/OccurredOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"Incident.OccurredOn\"
:alexa.entity-type :et-Incident
:db.install/_attribute :db.part/db}

;;\"Incident\",\"ReportedBy\",\"[nvarchar](512)\",\"NOT NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Incident/ReportedBy
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"Incident.ReportedBy\"
:alexa.entity-type :et-Incident
:db.install/_attribute :db.part/db}

;;\"Incident\",\"ReportedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Incident/ReportedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"Incident.ReportedOn\"
:alexa.entity-type :et-Incident
:db.install/_attribute :db.part/db}

{:db/id #db/id[:db.part/db]
:db/ident :Incident/Asset
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/many
:db/doc \"(Incident IncidentId IncidentAsset AssetId Asset)\"
:alexa.entity-type :et-Incident
:db.install/_attribute :db.part/db}

{:db/id #db/id[:db.part/db]
:db/ident :Incident/AssetGroup
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/many
:db/doc \"(Incident IncidentId IncidentAssetGroup AssetGroupId AssetGroup)\"
:alexa.entity-type :et-Incident
:db.install/_attribute :db.part/db}

{:db/id #db/id[:db.part/db]
:db/ident :Incident/AttributeValue
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/many
:db/doc \"(Incident IncidentId IncidentAttributeValue AttributeValueId AttributeValue)\"
:alexa.entity-type :et-Incident
:db.install/_attribute :db.part/db}

{:db/id #db/id[:db.part/db]
:db/ident :Incident/BusinessUnit
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/many
:db/doc \"(Incident IncidentId IncidentBusinessUnit BusinessUnitId BusinessUnit)\"
:alexa.entity-type :et-Incident
:db.install/_attribute :db.part/db}

{:db/id #db/id[:db.part/db]
:db/ident :Incident/DataFinding
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/many
:db/doc \"(Incident IncidentId IncidentDataFinding DataFindingId DataFinding)\"
:alexa.entity-type :et-Incident
:db.install/_attribute :db.part/db}

{:db/id #db/id[:db.part/db]
:db/ident :Incident/DomainComponent
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/many
:db/doc \"(Incident IncidentId IncidentDomain DomainComponentId DomainComponent)\"
:alexa.entity-type :et-Incident
:db.install/_attribute :db.part/db}

{:db/id #db/id[:db.part/db]
:db/ident :Incident/DataFile
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/many
:db/doc \"(Incident IncidentId IncidentReference ReferenceId Reference)\"
:alexa.entity-type :et-Incident
:db.install/_attribute :db.part/db}

{:db/id #db/id[:db.part/db]
:db/ident :Incident/Standard
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/many
:db/doc \"(Incident IncidentId IncidentStandard StandardId Standard)\"
:alexa.entity-type :et-Incident
:db.install/_attribute :db.part/db}

{:db/id #db/id[:db.part/db]
:db/ident :Incident/Project
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/many
:db/doc \"(Incident IncidentId ProjectIncident ProjectId Project)\"
:alexa.entity-type :et-Incident
:db.install/_attribute :db.part/db}

]"
"[;;\"IncidentField\",\"CreatedOn\",\"datetime\",\"NOT NULL\",\"[DF_IncidentField_CreatedOn]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :IncidentField/CreatedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"IncidentField.CreatedOn\"
:alexa.entity-type :et-IncidentField
:db.install/_attribute :db.part/db}

;;\"IncidentField\",\"DeletedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :IncidentField/DeletedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"IncidentField.DeletedOn\"
:alexa.entity-type :et-IncidentField
:db.install/_attribute :db.part/db}

;;\"IncidentField\",\"Description\",\"[nvarchar](1024)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :IncidentField/Description
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"IncidentField.Description\"
:alexa.entity-type :et-IncidentField
:db.install/_attribute :db.part/db}

;;\"IncidentField\",\"Id\",\"bigint\",\"NOT NULL\",\"\",\"IDENTITY\",\"PRIMARY KEY\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :IncidentField/Id
:db/valueType :db.type/long
:db/cardinality :db.cardinality/one
:db/index true
:db/unique :db.unique/value
:db/doc \"IncidentField.Id\"
:alexa.entity-type :et-IncidentField
:db.install/_attribute :db.part/db}

;;\"IncidentField\",\"IncidentTypeId\",\"bigint\",\"NOT NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :IncidentField/IncidentType
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(IncidentField IncidentTypeId IncidentType IncidentType)\"
:alexa.entity-type :et-IncidentField
:db.install/_attribute :db.part/db}

;;\"IncidentField\",\"IsRequired\",\"bit\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :IncidentField/IsRequired
:db/valueType :db.type/boolean
:db/cardinality :db.cardinality/one
:db/doc \"IncidentField.IsRequired\"
:alexa.entity-type :et-IncidentField
:db.install/_attribute :db.part/db}

;;\"IncidentField\",\"ModifiedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :IncidentField/ModifiedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"IncidentField.ModifiedOn\"
:alexa.entity-type :et-IncidentField
:db.install/_attribute :db.part/db}

;;\"IncidentField\",\"Name\",\"[nvarchar](256)\",\"NOT NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :IncidentField/Name
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"IncidentField.Name\"
:alexa.entity-type :et-IncidentField
:db.install/_attribute :db.part/db}

]"
"[;;\"IncidentFieldData\",\"CreatedOn\",\"datetime\",\"NOT NULL\",\"[DF_IncidentFieldData_CreatedOn]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :IncidentFieldData/CreatedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"IncidentFieldData.CreatedOn\"
:alexa.entity-type :et-IncidentFieldData
:db.install/_attribute :db.part/db}

;;\"IncidentFieldData\",\"Data\",\"[nvarchar](MAX)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :IncidentFieldData/Data
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"IncidentFieldData.Data\"
:alexa.entity-type :et-IncidentFieldData
:db.install/_attribute :db.part/db}

;;\"IncidentFieldData\",\"DeletedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :IncidentFieldData/DeletedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"IncidentFieldData.DeletedOn\"
:alexa.entity-type :et-IncidentFieldData
:db.install/_attribute :db.part/db}

;;\"IncidentFieldData\",\"Id\",\"bigint\",\"NOT NULL\",\"\",\"IDENTITY\",\"PRIMARY KEY\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :IncidentFieldData/Id
:db/valueType :db.type/long
:db/cardinality :db.cardinality/one
:db/index true
:db/unique :db.unique/value
:db/doc \"IncidentFieldData.Id\"
:alexa.entity-type :et-IncidentFieldData
:db.install/_attribute :db.part/db}

;;\"IncidentFieldData\",\"IncidentFieldId\",\"bigint\",\"NOT NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :IncidentFieldData/IncidentField
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(IncidentFieldData IncidentFieldId IncidentField IncidentField)\"
:alexa.entity-type :et-IncidentFieldData
:db.install/_attribute :db.part/db}

;;\"IncidentFieldData\",\"IncidentId\",\"bigint\",\"NOT NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :IncidentFieldData/Incident
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(IncidentFieldData IncidentId Incident Incident)\"
:alexa.entity-type :et-IncidentFieldData
:db.install/_attribute :db.part/db}

;;\"IncidentFieldData\",\"ModifiedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :IncidentFieldData/ModifiedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"IncidentFieldData.ModifiedOn\"
:alexa.entity-type :et-IncidentFieldData
:db.install/_attribute :db.part/db}

]"
"[;;\"IncidentImpact\",\"CreatedOn\",\"datetime\",\"NOT NULL\",\"[DF_IncidentImpact_CreatedOn]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :IncidentImpact/CreatedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"IncidentImpact.CreatedOn\"
:alexa.entity-type :et-IncidentImpact
:db.install/_attribute :db.part/db}

;;\"IncidentImpact\",\"DeletedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :IncidentImpact/DeletedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"IncidentImpact.DeletedOn\"
:alexa.entity-type :et-IncidentImpact
:db.install/_attribute :db.part/db}

;;\"IncidentImpact\",\"Id\",\"bigint\",\"NOT NULL\",\"\",\"IDENTITY\",\"PRIMARY KEY\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :IncidentImpact/Id
:db/valueType :db.type/long
:db/cardinality :db.cardinality/one
:db/index true
:db/unique :db.unique/value
:db/doc \"IncidentImpact.Id\"
:alexa.entity-type :et-IncidentImpact
:db.install/_attribute :db.part/db}

;;\"IncidentImpact\",\"ImpactId\",\"bigint\",\"NOT NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :IncidentImpact/Impact
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(IncidentImpact ImpactId Impact Impact)\"
:alexa.entity-type :et-IncidentImpact
:db.install/_attribute :db.part/db}

;;\"IncidentImpact\",\"ImpactTypeId\",\"bigint\",\"NOT NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :IncidentImpact/ImpactType
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(IncidentImpact ImpactTypeId ImpactType ImpactType)\"
:alexa.entity-type :et-IncidentImpact
:db.install/_attribute :db.part/db}

;;\"IncidentImpact\",\"IncidentId\",\"bigint\",\"NOT NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :IncidentImpact/Incident
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(IncidentImpact IncidentId Incident Incident)\"
:alexa.entity-type :et-IncidentImpact
:db.install/_attribute :db.part/db}

;;\"IncidentImpact\",\"ModifiedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :IncidentImpact/ModifiedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"IncidentImpact.ModifiedOn\"
:alexa.entity-type :et-IncidentImpact
:db.install/_attribute :db.part/db}

]"
"[;;\"IncidentIncidentStatus\",\"Comments\",\"[nvarchar](MAX)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :IncidentIncidentStatus/Comments
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"IncidentIncidentStatus.Comments\"
:alexa.entity-type :et-IncidentIncidentStatus
:db.install/_attribute :db.part/db}

;;\"IncidentIncidentStatus\",\"CreatedOn\",\"datetime\",\"NOT NULL\",\"[DF_IncidentIncidentStatus_CreatedOn]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :IncidentIncidentStatus/CreatedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"IncidentIncidentStatus.CreatedOn\"
:alexa.entity-type :et-IncidentIncidentStatus
:db.install/_attribute :db.part/db}

;;\"IncidentIncidentStatus\",\"DeletedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :IncidentIncidentStatus/DeletedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"IncidentIncidentStatus.DeletedOn\"
:alexa.entity-type :et-IncidentIncidentStatus
:db.install/_attribute :db.part/db}

;;\"IncidentIncidentStatus\",\"Id\",\"bigint\",\"NOT NULL\",\"\",\"IDENTITY\",\"PRIMARY KEY\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :IncidentIncidentStatus/Id
:db/valueType :db.type/long
:db/cardinality :db.cardinality/one
:db/index true
:db/unique :db.unique/value
:db/doc \"IncidentIncidentStatus.Id\"
:alexa.entity-type :et-IncidentIncidentStatus
:db.install/_attribute :db.part/db}

;;\"IncidentIncidentStatus\",\"IncidentId\",\"bigint\",\"NOT NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :IncidentIncidentStatus/Incident
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(IncidentIncidentStatus IncidentId Incident Incident)\"
:alexa.entity-type :et-IncidentIncidentStatus
:db.install/_attribute :db.part/db}

;;\"IncidentIncidentStatus\",\"IncidentStatusId\",\"bigint\",\"NOT NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :IncidentIncidentStatus/IncidentStatus
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(IncidentIncidentStatus IncidentStatusId IncidentStatus IncidentStatus)\"
:alexa.entity-type :et-IncidentIncidentStatus
:db.install/_attribute :db.part/db}

;;\"IncidentIncidentStatus\",\"ModifiedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :IncidentIncidentStatus/ModifiedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"IncidentIncidentStatus.ModifiedOn\"
:alexa.entity-type :et-IncidentIncidentStatus
:db.install/_attribute :db.part/db}

;;\"IncidentIncidentStatus\",\"PersonId\",\"bigint\",\"NOT NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :IncidentIncidentStatus/Person
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(IncidentIncidentStatus PersonId Person Person)\"
:alexa.entity-type :et-IncidentIncidentStatus
:db.install/_attribute :db.part/db}

]"
"[;;\"IncidentObject\",\"AssetGroupId\",\"bigint\",\"NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :IncidentObject/AssetGroup
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(IncidentObject AssetGroupId AssetGroup AssetGroup)\"
:alexa.entity-type :et-IncidentObject
:db.install/_attribute :db.part/db}

;;\"IncidentObject\",\"AssetId\",\"bigint\",\"NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :IncidentObject/Asset
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(IncidentObject AssetId Asset Asset)\"
:alexa.entity-type :et-IncidentObject
:db.install/_attribute :db.part/db}

;;\"IncidentObject\",\"CreatedOn\",\"datetime\",\"NOT NULL\",\"[DF_IncidentObject_CreatedOn]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :IncidentObject/CreatedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"IncidentObject.CreatedOn\"
:alexa.entity-type :et-IncidentObject
:db.install/_attribute :db.part/db}

;;\"IncidentObject\",\"DeletedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :IncidentObject/DeletedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"IncidentObject.DeletedOn\"
:alexa.entity-type :et-IncidentObject
:db.install/_attribute :db.part/db}

;;\"IncidentObject\",\"Id\",\"bigint\",\"NOT NULL\",\"\",\"IDENTITY\",\"PRIMARY KEY\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :IncidentObject/Id
:db/valueType :db.type/long
:db/cardinality :db.cardinality/one
:db/index true
:db/unique :db.unique/value
:db/doc \"IncidentObject.Id\"
:alexa.entity-type :et-IncidentObject
:db.install/_attribute :db.part/db}

;;\"IncidentObject\",\"IncidentId\",\"bigint\",\"NOT NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :IncidentObject/Incident
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(IncidentObject IncidentId Incident Incident)\"
:alexa.entity-type :et-IncidentObject
:db.install/_attribute :db.part/db}

;;\"IncidentObject\",\"ModifiedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :IncidentObject/ModifiedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"IncidentObject.ModifiedOn\"
:alexa.entity-type :et-IncidentObject
:db.install/_attribute :db.part/db}

;;\"IncidentObject\",\"PersonId\",\"bigint\",\"NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :IncidentObject/Person
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(IncidentObject PersonId Person Person)\"
:alexa.entity-type :et-IncidentObject
:db.install/_attribute :db.part/db}

;;\"IncidentObject\",\"ProcedureId\",\"bigint\",\"NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :IncidentObject/Procedure
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(IncidentObject ProcedureId Procedure Procedure)\"
:alexa.entity-type :et-IncidentObject
:db.install/_attribute :db.part/db}

]"
"[;;\"IncidentStatus\",\"CreatedOn\",\"datetime\",\"NOT NULL\",\"[DF_IncidentStatus_CreatedOn]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :IncidentStatus/CreatedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"IncidentStatus.CreatedOn\"
:alexa.entity-type :et-IncidentStatus
:db.install/_attribute :db.part/db}

;;\"IncidentStatus\",\"DeletedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :IncidentStatus/DeletedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"IncidentStatus.DeletedOn\"
:alexa.entity-type :et-IncidentStatus
:db.install/_attribute :db.part/db}

;;\"IncidentStatus\",\"Description\",\"[nvarchar](1024)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :IncidentStatus/Description
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"IncidentStatus.Description\"
:alexa.entity-type :et-IncidentStatus
:db.install/_attribute :db.part/db}

;;\"IncidentStatus\",\"Id\",\"bigint\",\"NOT NULL\",\"\",\"IDENTITY\",\"PRIMARY KEY\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :IncidentStatus/Id
:db/valueType :db.type/long
:db/cardinality :db.cardinality/one
:db/index true
:db/unique :db.unique/value
:db/doc \"IncidentStatus.Id\"
:alexa.entity-type :et-IncidentStatus
:db.install/_attribute :db.part/db}

;;\"IncidentStatus\",\"ModifiedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :IncidentStatus/ModifiedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"IncidentStatus.ModifiedOn\"
:alexa.entity-type :et-IncidentStatus
:db.install/_attribute :db.part/db}

;;\"IncidentStatus\",\"Name\",\"[nvarchar](256)\",\"NOT NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :IncidentStatus/Name
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"IncidentStatus.Name\"
:alexa.entity-type :et-IncidentStatus
:db.install/_attribute :db.part/db}

]"
"[;;\"IncidentTask\",\"CreatedOn\",\"datetime\",\"NOT NULL\",\"[DF_IncidentTask_CreatedOn]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :IncidentTask/CreatedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"IncidentTask.CreatedOn\"
:alexa.entity-type :et-IncidentTask
:db.install/_attribute :db.part/db}

;;\"IncidentTask\",\"DeletedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :IncidentTask/DeletedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"IncidentTask.DeletedOn\"
:alexa.entity-type :et-IncidentTask
:db.install/_attribute :db.part/db}

;;\"IncidentTask\",\"Id\",\"bigint\",\"NOT NULL\",\"\",\"IDENTITY\",\"PRIMARY KEY\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :IncidentTask/Id
:db/valueType :db.type/long
:db/cardinality :db.cardinality/one
:db/index true
:db/unique :db.unique/value
:db/doc \"IncidentTask.Id\"
:alexa.entity-type :et-IncidentTask
:db.install/_attribute :db.part/db}

;;\"IncidentTask\",\"IncidentId\",\"bigint\",\"NOT NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :IncidentTask/Incident
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(IncidentTask IncidentId Incident Incident)\"
:alexa.entity-type :et-IncidentTask
:db.install/_attribute :db.part/db}

;;\"IncidentTask\",\"ModifiedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :IncidentTask/ModifiedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"IncidentTask.ModifiedOn\"
:alexa.entity-type :et-IncidentTask
:db.install/_attribute :db.part/db}

;;\"IncidentTask\",\"TaskId\",\"bigint\",\"NOT NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :IncidentTask/Task
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(IncidentTask TaskId Task Task)\"
:alexa.entity-type :et-IncidentTask
:db.install/_attribute :db.part/db}

;;\"IncidentTask\",\"TaskResultId\",\"bigint\",\"NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :IncidentTask/TaskResult
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(IncidentTask TaskResultId TaskResult TaskResult)\"
:alexa.entity-type :et-IncidentTask
:db.install/_attribute :db.part/db}

]"
"[;;\"IncidentType\",\"CreatedOn\",\"datetime\",\"NOT NULL\",\"[DF_IncidentType_CreatedOn]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :IncidentType/CreatedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"IncidentType.CreatedOn\"
:alexa.entity-type :et-IncidentType
:db.install/_attribute :db.part/db}

;;\"IncidentType\",\"DeletedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :IncidentType/DeletedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"IncidentType.DeletedOn\"
:alexa.entity-type :et-IncidentType
:db.install/_attribute :db.part/db}

;;\"IncidentType\",\"Description\",\"[nvarchar](1024)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :IncidentType/Description
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"IncidentType.Description\"
:alexa.entity-type :et-IncidentType
:db.install/_attribute :db.part/db}

;;\"IncidentType\",\"Id\",\"bigint\",\"NOT NULL\",\"\",\"IDENTITY\",\"PRIMARY KEY\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :IncidentType/Id
:db/valueType :db.type/long
:db/cardinality :db.cardinality/one
:db/index true
:db/unique :db.unique/value
:db/doc \"IncidentType.Id\"
:alexa.entity-type :et-IncidentType
:db.install/_attribute :db.part/db}

;;\"IncidentType\",\"ModifiedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :IncidentType/ModifiedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"IncidentType.ModifiedOn\"
:alexa.entity-type :et-IncidentType
:db.install/_attribute :db.part/db}

;;\"IncidentType\",\"Name\",\"[nvarchar](256)\",\"NOT NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :IncidentType/Name
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"IncidentType.Name\"
:alexa.entity-type :et-IncidentType
:db.install/_attribute :db.part/db}

]"
"[;;\"Job\",\"Configuration\",\"[varbinary](MAX)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Job/Configuration
:db/valueType :db.type/uri
:db/cardinality :db.cardinality/one
:db/doc \"Job.Configuration\"
:alexa.entity-type :et-Job
:db.install/_attribute :db.part/db}

;;\"Job\",\"CreatedOn\",\"datetime\",\"NOT NULL\",\"[DF_Job_CreatedOn]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Job/CreatedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"Job.CreatedOn\"
:alexa.entity-type :et-Job
:db.install/_attribute :db.part/db}

;;\"Job\",\"DeletedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Job/DeletedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"Job.DeletedOn\"
:alexa.entity-type :et-Job
:db.install/_attribute :db.part/db}

;;\"Job\",\"Description\",\"[nvarchar](1024)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Job/Description
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"Job.Description\"
:alexa.entity-type :et-Job
:db.install/_attribute :db.part/db}

;;\"Job\",\"Id\",\"bigint\",\"NOT NULL\",\"\",\"IDENTITY\",\"PRIMARY KEY\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Job/Id
:db/valueType :db.type/long
:db/cardinality :db.cardinality/one
:db/index true
:db/unique :db.unique/value
:db/doc \"Job.Id\"
:alexa.entity-type :et-Job
:db.install/_attribute :db.part/db}

;;\"Job\",\"ModifiedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Job/ModifiedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"Job.ModifiedOn\"
:alexa.entity-type :et-Job
:db.install/_attribute :db.part/db}

;;\"Job\",\"Name\",\"[nvarchar](256)\",\"NOT NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Job/Name
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"Job.Name\"
:alexa.entity-type :et-Job
:db.install/_attribute :db.part/db}

;;\"Job\",\"NextRunOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Job/NextRunOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"Job.NextRunOn\"
:alexa.entity-type :et-Job
:db.install/_attribute :db.part/db}

;;\"Job\",\"Schedule\",\"[varbinary](MAX)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Job/Schedule
:db/valueType :db.type/uri
:db/cardinality :db.cardinality/one
:db/doc \"Job.Schedule\"
:alexa.entity-type :et-Job
:db.install/_attribute :db.part/db}

;;\"Job\",\"Status\",\"int\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Job/Status
:db/valueType :db.type/long
:db/cardinality :db.cardinality/one
:db/doc \"Job.Status\"
:alexa.entity-type :et-Job
:db.install/_attribute :db.part/db}

]"
"[;;\"JobRun\",\"CreatedOn\",\"datetime\",\"NOT NULL\",\"[DF_JobRun_CreatedOn]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :JobRun/CreatedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"JobRun.CreatedOn\"
:alexa.entity-type :et-JobRun
:db.install/_attribute :db.part/db}

;;\"JobRun\",\"DeletedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :JobRun/DeletedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"JobRun.DeletedOn\"
:alexa.entity-type :et-JobRun
:db.install/_attribute :db.part/db}

;;\"JobRun\",\"EndedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :JobRun/EndedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"JobRun.EndedOn\"
:alexa.entity-type :et-JobRun
:db.install/_attribute :db.part/db}

;;\"JobRun\",\"EventHistoryId\",\"bigint\",\"NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :JobRun/EventHistory
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(JobRun EventHistoryId EventHistory EventHistory)\"
:alexa.entity-type :et-JobRun
:db.install/_attribute :db.part/db}

;;\"JobRun\",\"Id\",\"bigint\",\"NOT NULL\",\"\",\"IDENTITY\",\"PRIMARY KEY\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :JobRun/Id
:db/valueType :db.type/long
:db/cardinality :db.cardinality/one
:db/index true
:db/unique :db.unique/value
:db/doc \"JobRun.Id\"
:alexa.entity-type :et-JobRun
:db.install/_attribute :db.part/db}

;;\"JobRun\",\"JobId\",\"bigint\",\"NOT NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :JobRun/Job
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(JobRun JobId Job Job)\"
:alexa.entity-type :et-JobRun
:db.install/_attribute :db.part/db}

;;\"JobRun\",\"Message\",\"[nvarchar](MAX)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :JobRun/Message
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"JobRun.Message\"
:alexa.entity-type :et-JobRun
:db.install/_attribute :db.part/db}

;;\"JobRun\",\"ModifiedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :JobRun/ModifiedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"JobRun.ModifiedOn\"
:alexa.entity-type :et-JobRun
:db.install/_attribute :db.part/db}

;;\"JobRun\",\"StartedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :JobRun/StartedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"JobRun.StartedOn\"
:alexa.entity-type :et-JobRun
:db.install/_attribute :db.part/db}

;;\"JobRun\",\"Status\",\"int\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :JobRun/Status
:db/valueType :db.type/long
:db/cardinality :db.cardinality/one
:db/doc \"JobRun.Status\"
:alexa.entity-type :et-JobRun
:db.install/_attribute :db.part/db}

]"
"[;;\"LDAPAction\",\"CreatedOn\",\"datetime\",\"NOT NULL\",\"[DF_LDAPAction_CreatedOn]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :LDAPAction/CreatedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"LDAPAction.CreatedOn\"
:alexa.entity-type :et-LDAPAction
:db.install/_attribute :db.part/db}

;;\"LDAPAction\",\"DeletedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :LDAPAction/DeletedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"LDAPAction.DeletedOn\"
:alexa.entity-type :et-LDAPAction
:db.install/_attribute :db.part/db}

;;\"LDAPAction\",\"Description\",\"[nvarchar](1024)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :LDAPAction/Description
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"LDAPAction.Description\"
:alexa.entity-type :et-LDAPAction
:db.install/_attribute :db.part/db}

;;\"LDAPAction\",\"Id\",\"bigint\",\"NOT NULL\",\"\",\"IDENTITY\",\"PRIMARY KEY\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :LDAPAction/Id
:db/valueType :db.type/long
:db/cardinality :db.cardinality/one
:db/index true
:db/unique :db.unique/value
:db/doc \"LDAPAction.Id\"
:alexa.entity-type :et-LDAPAction
:db.install/_attribute :db.part/db}

;;\"LDAPAction\",\"ModifiedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :LDAPAction/ModifiedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"LDAPAction.ModifiedOn\"
:alexa.entity-type :et-LDAPAction
:db.install/_attribute :db.part/db}

;;\"LDAPAction\",\"Name\",\"[nvarchar](256)\",\"NOT NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :LDAPAction/Name
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"LDAPAction.Name\"
:alexa.entity-type :et-LDAPAction
:db.install/_attribute :db.part/db}

]"
"[;;\"LDAPConfig\",\"BaseDN\",\"[nvarchar](512)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :LDAPConfig/BaseDN
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"LDAPConfig.BaseDN\"
:alexa.entity-type :et-LDAPConfig
:db.install/_attribute :db.part/db}

;;\"LDAPConfig\",\"CreatedOn\",\"datetime\",\"NOT NULL\",\"[DF_LDAPConfig_CreatedOn]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :LDAPConfig/CreatedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"LDAPConfig.CreatedOn\"
:alexa.entity-type :et-LDAPConfig
:db.install/_attribute :db.part/db}

;;\"LDAPConfig\",\"DeletedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :LDAPConfig/DeletedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"LDAPConfig.DeletedOn\"
:alexa.entity-type :et-LDAPConfig
:db.install/_attribute :db.part/db}

;;\"LDAPConfig\",\"Domain\",\"[nvarchar](256)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :LDAPConfig/Domain
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"LDAPConfig.Domain\"
:alexa.entity-type :et-LDAPConfig
:db.install/_attribute :db.part/db}

;;\"LDAPConfig\",\"Id\",\"bigint\",\"NOT NULL\",\"\",\"IDENTITY\",\"PRIMARY KEY\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :LDAPConfig/Id
:db/valueType :db.type/long
:db/cardinality :db.cardinality/one
:db/index true
:db/unique :db.unique/value
:db/doc \"LDAPConfig.Id\"
:alexa.entity-type :et-LDAPConfig
:db.install/_attribute :db.part/db}

;;\"LDAPConfig\",\"LDAPTypeId\",\"bigint\",\"NOT NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :LDAPConfig/LDAPType
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(LDAPConfig LDAPTypeId LDAPType LDAPType)\"
:alexa.entity-type :et-LDAPConfig
:db.install/_attribute :db.part/db}

;;\"LDAPConfig\",\"MappingData\",\"[nvarchar](MAX)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :LDAPConfig/MappingData
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"LDAPConfig.MappingData\"
:alexa.entity-type :et-LDAPConfig
:db.install/_attribute :db.part/db}

;;\"LDAPConfig\",\"ModifiedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :LDAPConfig/ModifiedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"LDAPConfig.ModifiedOn\"
:alexa.entity-type :et-LDAPConfig
:db.install/_attribute :db.part/db}

;;\"LDAPConfig\",\"Password\",\"[varbinary](1024)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :LDAPConfig/Password
:db/valueType :db.type/bigint
:db/cardinality :db.cardinality/one
:db/doc \"LDAPConfig.Password\"
:alexa.entity-type :et-LDAPConfig
:db.install/_attribute :db.part/db}

;;\"LDAPConfig\",\"ServerName\",\"[nvarchar](256)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :LDAPConfig/ServerName
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"LDAPConfig.ServerName\"
:alexa.entity-type :et-LDAPConfig
:db.install/_attribute :db.part/db}

;;\"LDAPConfig\",\"Username\",\"[nvarchar](256)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :LDAPConfig/Username
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"LDAPConfig.Username\"
:alexa.entity-type :et-LDAPConfig
:db.install/_attribute :db.part/db}

]"
"[;;\"LDAPType\",\"CreatedOn\",\"datetime\",\"NOT NULL\",\"[DF_LDAPType_CreatedOn]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :LDAPType/CreatedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"LDAPType.CreatedOn\"
:alexa.entity-type :et-LDAPType
:db.install/_attribute :db.part/db}

;;\"LDAPType\",\"DeletedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :LDAPType/DeletedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"LDAPType.DeletedOn\"
:alexa.entity-type :et-LDAPType
:db.install/_attribute :db.part/db}

;;\"LDAPType\",\"Description\",\"[nvarchar](1024)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :LDAPType/Description
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"LDAPType.Description\"
:alexa.entity-type :et-LDAPType
:db.install/_attribute :db.part/db}

;;\"LDAPType\",\"Id\",\"bigint\",\"NOT NULL\",\"\",\"IDENTITY\",\"PRIMARY KEY\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :LDAPType/Id
:db/valueType :db.type/long
:db/cardinality :db.cardinality/one
:db/index true
:db/unique :db.unique/value
:db/doc \"LDAPType.Id\"
:alexa.entity-type :et-LDAPType
:db.install/_attribute :db.part/db}

;;\"LDAPType\",\"ModifiedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :LDAPType/ModifiedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"LDAPType.ModifiedOn\"
:alexa.entity-type :et-LDAPType
:db.install/_attribute :db.part/db}

;;\"LDAPType\",\"Name\",\"[nvarchar](256)\",\"NOT NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :LDAPType/Name
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"LDAPType.Name\"
:alexa.entity-type :et-LDAPType
:db.install/_attribute :db.part/db}

]"
"[;;\"Likelihood\",\"BackColorName\",\"[nvarchar](50)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Likelihood/BackColorName
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"Likelihood.BackColorName\"
:alexa.entity-type :et-Likelihood
:db.install/_attribute :db.part/db}

;;\"Likelihood\",\"CreatedOn\",\"datetime\",\"NOT NULL\",\"[DF_Likelihood_CreatedOn]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Likelihood/CreatedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"Likelihood.CreatedOn\"
:alexa.entity-type :et-Likelihood
:db.install/_attribute :db.part/db}

;;\"Likelihood\",\"DeletedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Likelihood/DeletedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"Likelihood.DeletedOn\"
:alexa.entity-type :et-Likelihood
:db.install/_attribute :db.part/db}

;;\"Likelihood\",\"Description\",\"[nvarchar](1024)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Likelihood/Description
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"Likelihood.Description\"
:alexa.entity-type :et-Likelihood
:db.install/_attribute :db.part/db}

;;\"Likelihood\",\"ForeColorName\",\"[nvarchar](50)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Likelihood/ForeColorName
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"Likelihood.ForeColorName\"
:alexa.entity-type :et-Likelihood
:db.install/_attribute :db.part/db}

;;\"Likelihood\",\"Id\",\"bigint\",\"NOT NULL\",\"\",\"IDENTITY\",\"PRIMARY KEY\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Likelihood/Id
:db/valueType :db.type/long
:db/cardinality :db.cardinality/one
:db/index true
:db/unique :db.unique/value
:db/doc \"Likelihood.Id\"
:alexa.entity-type :et-Likelihood
:db.install/_attribute :db.part/db}

;;\"Likelihood\",\"ModifiedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Likelihood/ModifiedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"Likelihood.ModifiedOn\"
:alexa.entity-type :et-Likelihood
:db.install/_attribute :db.part/db}

;;\"Likelihood\",\"Name\",\"[nvarchar](256)\",\"NOT NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Likelihood/Name
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"Likelihood.Name\"
:alexa.entity-type :et-Likelihood
:db.install/_attribute :db.part/db}

;;\"Likelihood\",\"UpperThreshold\",\"float\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Likelihood/UpperThreshold
:db/valueType :db.type/float
:db/cardinality :db.cardinality/one
:db/doc \"Likelihood.UpperThreshold\"
:alexa.entity-type :et-Likelihood
:db.install/_attribute :db.part/db}

;;\"Likelihood\",\"Value\",\"float\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Likelihood/Value
:db/valueType :db.type/float
:db/cardinality :db.cardinality/one
:db/doc \"Likelihood.Value\"
:alexa.entity-type :et-Likelihood
:db.install/_attribute :db.part/db}

]"
"[;;\"Manufacturer\",\"AddressId\",\"bigint\",\"NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :Manufacturer/Address
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(Manufacturer AddressId Address Address)\"
:alexa.entity-type :et-Manufacturer
:db.install/_attribute :db.part/db}

;;\"Manufacturer\",\"CreatedOn\",\"datetime\",\"NOT NULL\",\"[DF_Manufacturer_CreatedOn]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Manufacturer/CreatedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"Manufacturer.CreatedOn\"
:alexa.entity-type :et-Manufacturer
:db.install/_attribute :db.part/db}

;;\"Manufacturer\",\"DeletedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Manufacturer/DeletedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"Manufacturer.DeletedOn\"
:alexa.entity-type :et-Manufacturer
:db.install/_attribute :db.part/db}

;;\"Manufacturer\",\"Description\",\"[nvarchar](1024)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Manufacturer/Description
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"Manufacturer.Description\"
:alexa.entity-type :et-Manufacturer
:db.install/_attribute :db.part/db}

;;\"Manufacturer\",\"Id\",\"bigint\",\"NOT NULL\",\"\",\"IDENTITY\",\"PRIMARY KEY\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Manufacturer/Id
:db/valueType :db.type/long
:db/cardinality :db.cardinality/one
:db/index true
:db/unique :db.unique/value
:db/doc \"Manufacturer.Id\"
:alexa.entity-type :et-Manufacturer
:db.install/_attribute :db.part/db}

;;\"Manufacturer\",\"ModifiedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Manufacturer/ModifiedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"Manufacturer.ModifiedOn\"
:alexa.entity-type :et-Manufacturer
:db.install/_attribute :db.part/db}

;;\"Manufacturer\",\"Name\",\"[nvarchar](256)\",\"NOT NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Manufacturer/Name
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"Manufacturer.Name\"
:alexa.entity-type :et-Manufacturer
:db.install/_attribute :db.part/db}

]"
"[;;\"MitigationStatus\",\"CreatedOn\",\"datetime\",\"NOT NULL\",\"[DF_MitigationStatus_CreatedOn]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :MitigationStatus/CreatedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"MitigationStatus.CreatedOn\"
:alexa.entity-type :et-MitigationStatus
:db.install/_attribute :db.part/db}

;;\"MitigationStatus\",\"DeletedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :MitigationStatus/DeletedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"MitigationStatus.DeletedOn\"
:alexa.entity-type :et-MitigationStatus
:db.install/_attribute :db.part/db}

;;\"MitigationStatus\",\"Description\",\"[nvarchar](1024)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :MitigationStatus/Description
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"MitigationStatus.Description\"
:alexa.entity-type :et-MitigationStatus
:db.install/_attribute :db.part/db}

;;\"MitigationStatus\",\"Id\",\"bigint\",\"NOT NULL\",\"\",\"IDENTITY\",\"PRIMARY KEY\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :MitigationStatus/Id
:db/valueType :db.type/long
:db/cardinality :db.cardinality/one
:db/index true
:db/unique :db.unique/value
:db/doc \"MitigationStatus.Id\"
:alexa.entity-type :et-MitigationStatus
:db.install/_attribute :db.part/db}

;;\"MitigationStatus\",\"ModifiedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :MitigationStatus/ModifiedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"MitigationStatus.ModifiedOn\"
:alexa.entity-type :et-MitigationStatus
:db.install/_attribute :db.part/db}

;;\"MitigationStatus\",\"Name\",\"[nvarchar](256)\",\"NOT NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :MitigationStatus/Name
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"MitigationStatus.Name\"
:alexa.entity-type :et-MitigationStatus
:db.install/_attribute :db.part/db}

]"
"[;;\"Network\",\"Abbreviation\",\"[nvarchar](50)\",\"NOT NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Network/Abbreviation
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"Network.Abbreviation\"
:alexa.entity-type :et-Network
:db.install/_attribute :db.part/db}

;;\"Network\",\"CreatedOn\",\"datetime\",\"NOT NULL\",\"[DF_Network_CreatedOn]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Network/CreatedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"Network.CreatedOn\"
:alexa.entity-type :et-Network
:db.install/_attribute :db.part/db}

;;\"Network\",\"DeletedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Network/DeletedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"Network.DeletedOn\"
:alexa.entity-type :et-Network
:db.install/_attribute :db.part/db}

;;\"Network\",\"Description\",\"[nvarchar](1024)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Network/Description
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"Network.Description\"
:alexa.entity-type :et-Network
:db.install/_attribute :db.part/db}

;;\"Network\",\"Id\",\"bigint\",\"NOT NULL\",\"\",\"IDENTITY\",\"PRIMARY KEY\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Network/Id
:db/valueType :db.type/long
:db/cardinality :db.cardinality/one
:db/index true
:db/unique :db.unique/value
:db/doc \"Network.Id\"
:alexa.entity-type :et-Network
:db.install/_attribute :db.part/db}

;;\"Network\",\"ModifiedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Network/ModifiedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"Network.ModifiedOn\"
:alexa.entity-type :et-Network
:db.install/_attribute :db.part/db}

;;\"Network\",\"Name\",\"[nvarchar](256)\",\"NOT NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Network/Name
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"Network.Name\"
:alexa.entity-type :et-Network
:db.install/_attribute :db.part/db}

{:db/id #db/id[:db.part/db]
:db/ident :Network/Role
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/many
:db/doc \"(Network NetworkId NetworkRole RoleId Role)\"
:alexa.entity-type :et-Network
:db.install/_attribute :db.part/db}

]"
"[;;\"Note\",\"Body\",\"[nvarchar](MAX)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Note/Body
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"Note.Body\"
:alexa.entity-type :et-Note
:db.install/_attribute :db.part/db}

;;\"Note\",\"CreatedOn\",\"datetime\",\"NOT NULL\",\"[DF_Note_CreatedOn]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Note/CreatedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"Note.CreatedOn\"
:alexa.entity-type :et-Note
:db.install/_attribute :db.part/db}

;;\"Note\",\"DeletedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Note/DeletedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"Note.DeletedOn\"
:alexa.entity-type :et-Note
:db.install/_attribute :db.part/db}

;;\"Note\",\"Format\",\"[nvarchar](50)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Note/Format
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"Note.Format\"
:alexa.entity-type :et-Note
:db.install/_attribute :db.part/db}

;;\"Note\",\"From_PersonId\",\"bigint\",\"NOT NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :Note/From_Person
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(Note From_PersonId Person From_Person)\"
:alexa.entity-type :et-Note
:db.install/_attribute :db.part/db}

;;\"Note\",\"Id\",\"bigint\",\"NOT NULL\",\"\",\"IDENTITY\",\"PRIMARY KEY\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Note/Id
:db/valueType :db.type/long
:db/cardinality :db.cardinality/one
:db/index true
:db/unique :db.unique/value
:db/doc \"Note.Id\"
:alexa.entity-type :et-Note
:db.install/_attribute :db.part/db}

;;\"Note\",\"ModifiedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Note/ModifiedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"Note.ModifiedOn\"
:alexa.entity-type :et-Note
:db.install/_attribute :db.part/db}

;;\"Note\",\"ResponseTo_NoteId\",\"bigint\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Note/ResponseTo_NoteId
:db/valueType :db.type/long
:db/cardinality :db.cardinality/one
:db/doc \"Note.ResponseTo_NoteId\"
:alexa.entity-type :et-Note
:db.install/_attribute :db.part/db}

;;\"Note\",\"Subject\",\"[nvarchar](256)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Note/Subject
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"Note.Subject\"
:alexa.entity-type :et-Note
:db.install/_attribute :db.part/db}

;;\"Note\",\"To_PersonId\",\"bigint\",\"NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :Note/To_Person
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(Note To_PersonId Person To_Person)\"
:alexa.entity-type :et-Note
:db.install/_attribute :db.part/db}

;;\"Note\",\"Type\",\"[nvarchar](50)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Note/Type
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"Note.Type\"
:alexa.entity-type :et-Note
:db.install/_attribute :db.part/db}

]"
"[;;\"Notification\",\"BodyText\",\"[nvarchar](MAX)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Notification/BodyText
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"Notification.BodyText\"
:alexa.entity-type :et-Notification
:db.install/_attribute :db.part/db}

;;\"Notification\",\"CreatedOn\",\"datetime\",\"NOT NULL\",\"[DF_Notification_CreatedOn]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Notification/CreatedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"Notification.CreatedOn\"
:alexa.entity-type :et-Notification
:db.install/_attribute :db.part/db}

;;\"Notification\",\"DeletedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Notification/DeletedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"Notification.DeletedOn\"
:alexa.entity-type :et-Notification
:db.install/_attribute :db.part/db}

;;\"Notification\",\"Failed\",\"bit\",\"NULL\",\"[DF_Notification_Failed]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Notification/Failed
:db/valueType :db.type/boolean
:db/cardinality :db.cardinality/one
:db/doc \"Notification.Failed\"
:alexa.entity-type :et-Notification
:db.install/_attribute :db.part/db}

;;\"Notification\",\"FailureMessage\",\"[nvarchar](MAX)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Notification/FailureMessage
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"Notification.FailureMessage\"
:alexa.entity-type :et-Notification
:db.install/_attribute :db.part/db}

;;\"Notification\",\"From_PersonId\",\"bigint\",\"NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :Notification/From_Person
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(Notification From_PersonId Person From_Person)\"
:alexa.entity-type :et-Notification
:db.install/_attribute :db.part/db}

;;\"Notification\",\"Id\",\"bigint\",\"NOT NULL\",\"\",\"IDENTITY\",\"PRIMARY KEY\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Notification/Id
:db/valueType :db.type/long
:db/cardinality :db.cardinality/one
:db/index true
:db/unique :db.unique/value
:db/doc \"Notification.Id\"
:alexa.entity-type :et-Notification
:db.install/_attribute :db.part/db}

;;\"Notification\",\"MailBatchNumber\",\"bigint\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Notification/MailBatchNumber
:db/valueType :db.type/long
:db/cardinality :db.cardinality/one
:db/doc \"Notification.MailBatchNumber\"
:alexa.entity-type :et-Notification
:db.install/_attribute :db.part/db}

;;\"Notification\",\"ModifiedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Notification/ModifiedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"Notification.ModifiedOn\"
:alexa.entity-type :et-Notification
:db.install/_attribute :db.part/db}

;;\"Notification\",\"NotificationTypeId\",\"bigint\",\"NOT NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :Notification/NotificationType
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(Notification NotificationTypeId NotificationType NotificationType)\"
:alexa.entity-type :et-Notification
:db.install/_attribute :db.part/db}

;;\"Notification\",\"SentOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Notification/SentOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"Notification.SentOn\"
:alexa.entity-type :et-Notification
:db.install/_attribute :db.part/db}

;;\"Notification\",\"SentTo\",\"[nvarchar](MAX)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Notification/SentTo
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"Notification.SentTo\"
:alexa.entity-type :et-Notification
:db.install/_attribute :db.part/db}

;;\"Notification\",\"SubjectLine\",\"[nvarchar](256)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Notification/SubjectLine
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"Notification.SubjectLine\"
:alexa.entity-type :et-Notification
:db.install/_attribute :db.part/db}

;;\"Notification\",\"To_Email\",\"[nvarchar](MAX)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Notification/To_Email
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"Notification.To_Email\"
:alexa.entity-type :et-Notification
:db.install/_attribute :db.part/db}

;;\"Notification\",\"To_PersonId\",\"bigint\",\"NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :Notification/To_Person
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(Notification To_PersonId Person To_Person)\"
:alexa.entity-type :et-Notification
:db.install/_attribute :db.part/db}

{:db/id #db/id[:db.part/db]
:db/ident :Notification/PolicyTask
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/many
:db/doc \"(Notification NotificationId PolicyTaskNotification PolicyTaskId PolicyTask)\"
:alexa.entity-type :et-Notification
:db.install/_attribute :db.part/db}

{:db/id #db/id[:db.part/db]
:db/ident :Notification/Task
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/many
:db/doc \"(Notification NotificationId TaskNotification TaskId Task)\"
:alexa.entity-type :et-Notification
:db.install/_attribute :db.part/db}

]"
"[;;\"NotificationRule\",\"Active\",\"bit\",\"NULL\",\"[DF_NotificationRule_Active]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :NotificationRule/Active
:db/valueType :db.type/boolean
:db/cardinality :db.cardinality/one
:db/doc \"NotificationRule.Active\"
:alexa.entity-type :et-NotificationRule
:db.install/_attribute :db.part/db}

;;\"NotificationRule\",\"CreatedOn\",\"datetime\",\"NOT NULL\",\"[DF_NotificationRule_CreatedOn]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :NotificationRule/CreatedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"NotificationRule.CreatedOn\"
:alexa.entity-type :et-NotificationRule
:db.install/_attribute :db.part/db}

;;\"NotificationRule\",\"DeletedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :NotificationRule/DeletedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"NotificationRule.DeletedOn\"
:alexa.entity-type :et-NotificationRule
:db.install/_attribute :db.part/db}

;;\"NotificationRule\",\"Description\",\"[nvarchar](1024)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :NotificationRule/Description
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"NotificationRule.Description\"
:alexa.entity-type :et-NotificationRule
:db.install/_attribute :db.part/db}

;;\"NotificationRule\",\"Id\",\"bigint\",\"NOT NULL\",\"\",\"IDENTITY\",\"PRIMARY KEY\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :NotificationRule/Id
:db/valueType :db.type/long
:db/cardinality :db.cardinality/one
:db/index true
:db/unique :db.unique/value
:db/doc \"NotificationRule.Id\"
:alexa.entity-type :et-NotificationRule
:db.install/_attribute :db.part/db}

;;\"NotificationRule\",\"ModifiedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :NotificationRule/ModifiedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"NotificationRule.ModifiedOn\"
:alexa.entity-type :et-NotificationRule
:db.install/_attribute :db.part/db}

;;\"NotificationRule\",\"Name\",\"[nvarchar](256)\",\"NOT NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :NotificationRule/Name
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"NotificationRule.Name\"
:alexa.entity-type :et-NotificationRule
:db.install/_attribute :db.part/db}

;;\"NotificationRule\",\"NotificationRuleSetId\",\"bigint\",\"NOT NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :NotificationRule/NotificationRuleSet
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(NotificationRule NotificationRuleSetId NotificationRuleSet NotificationRuleSet)\"
:alexa.entity-type :et-NotificationRule
:db.install/_attribute :db.part/db}

;;\"NotificationRule\",\"NotificationTypeId\",\"bigint\",\"NOT NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :NotificationRule/NotificationType
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(NotificationRule NotificationTypeId NotificationType NotificationType)\"
:alexa.entity-type :et-NotificationRule
:db.install/_attribute :db.part/db}

;;\"NotificationRule\",\"Notify_Email\",\"[nvarchar](MAX)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :NotificationRule/Notify_Email
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"NotificationRule.Notify_Email\"
:alexa.entity-type :et-NotificationRule
:db.install/_attribute :db.part/db}

;;\"NotificationRule\",\"On_Condition\",\"[nvarchar](50)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :NotificationRule/On_Condition
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"NotificationRule.On_Condition\"
:alexa.entity-type :et-NotificationRule
:db.install/_attribute :db.part/db}

;;\"NotificationRule\",\"On_DaysFromDate\",\"int\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :NotificationRule/On_DaysFromDate
:db/valueType :db.type/long
:db/cardinality :db.cardinality/one
:db/doc \"NotificationRule.On_DaysFromDate\"
:alexa.entity-type :et-NotificationRule
:db.install/_attribute :db.part/db}

;;\"NotificationRule\",\"On_OutcomeId\",\"bigint\",\"NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :NotificationRule/On_Outcome
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(NotificationRule On_OutcomeId Outcome On_Outcome)\"
:alexa.entity-type :et-NotificationRule
:db.install/_attribute :db.part/db}

;;\"NotificationRule\",\"On_TaskResultScoreId\",\"bigint\",\"NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :NotificationRule/On_TaskResultScore
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(NotificationRule On_TaskResultScoreId TaskResultScore On_TaskResultScore)\"
:alexa.entity-type :et-NotificationRule
:db.install/_attribute :db.part/db}

;;\"NotificationRule\",\"On_TaskResultStatusId\",\"bigint\",\"NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :NotificationRule/On_TaskResultStatus
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(NotificationRule On_TaskResultStatusId TaskResultStatus On_TaskResultStatus)\"
:alexa.entity-type :et-NotificationRule
:db.install/_attribute :db.part/db}

;;\"NotificationRule\",\"On_TaskResultTypeId\",\"bigint\",\"NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :NotificationRule/On_TaskResultType
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(NotificationRule On_TaskResultTypeId TaskResultType On_TaskResultType)\"
:alexa.entity-type :et-NotificationRule
:db.install/_attribute :db.part/db}

;;\"NotificationRule\",\"SendToApprover\",\"bit\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :NotificationRule/SendToApprover
:db/valueType :db.type/boolean
:db/cardinality :db.cardinality/one
:db/doc \"NotificationRule.SendToApprover\"
:alexa.entity-type :et-NotificationRule
:db.install/_attribute :db.part/db}

;;\"NotificationRule\",\"SendToPerformer\",\"bit\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :NotificationRule/SendToPerformer
:db/valueType :db.type/boolean
:db/cardinality :db.cardinality/one
:db/doc \"NotificationRule.SendToPerformer\"
:alexa.entity-type :et-NotificationRule
:db.install/_attribute :db.part/db}

;;\"NotificationRule\",\"SendToProjectCreator\",\"bit\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :NotificationRule/SendToProjectCreator
:db/valueType :db.type/boolean
:db/cardinality :db.cardinality/one
:db/doc \"NotificationRule.SendToProjectCreator\"
:alexa.entity-type :et-NotificationRule
:db.install/_attribute :db.part/db}

;;\"NotificationRule\",\"SendToReviewer\",\"bit\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :NotificationRule/SendToReviewer
:db/valueType :db.type/boolean
:db/cardinality :db.cardinality/one
:db/doc \"NotificationRule.SendToReviewer\"
:alexa.entity-type :et-NotificationRule
:db.install/_attribute :db.part/db}

;;\"NotificationRule\",\"Task_BusinessUnitId\",\"bigint\",\"NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :NotificationRule/Task_BusinessUnit
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(NotificationRule Task_BusinessUnitId BusinessUnit Task_BusinessUnit)\"
:alexa.entity-type :et-NotificationRule
:db.install/_attribute :db.part/db}

;;\"NotificationRule\",\"Task_PriorityId\",\"bigint\",\"NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :NotificationRule/Task_Priority
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(NotificationRule Task_PriorityId Priority Task_Priority)\"
:alexa.entity-type :et-NotificationRule
:db.install/_attribute :db.part/db}

{:db/id #db/id[:db.part/db]
:db/ident :NotificationRule/Person
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/many
:db/doc \"(NotificationRule NotificationRuleId NotificationRulePerson PersonId Person)\"
:alexa.entity-type :et-NotificationRule
:db.install/_attribute :db.part/db}

{:db/id #db/id[:db.part/db]
:db/ident :NotificationRule/Role
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/many
:db/doc \"(NotificationRule NotificationRuleId NotificationRuleRole RoleId Role)\"
:alexa.entity-type :et-NotificationRule
:db.install/_attribute :db.part/db}

]"
"[;;\"NotificationRuleSet\",\"CreatedOn\",\"datetime\",\"NOT NULL\",\"[DF_NotificationRuleSet_CreatedOn]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :NotificationRuleSet/CreatedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"NotificationRuleSet.CreatedOn\"
:alexa.entity-type :et-NotificationRuleSet
:db.install/_attribute :db.part/db}

;;\"NotificationRuleSet\",\"DeletedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :NotificationRuleSet/DeletedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"NotificationRuleSet.DeletedOn\"
:alexa.entity-type :et-NotificationRuleSet
:db.install/_attribute :db.part/db}

;;\"NotificationRuleSet\",\"Description\",\"[nvarchar](1024)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :NotificationRuleSet/Description
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"NotificationRuleSet.Description\"
:alexa.entity-type :et-NotificationRuleSet
:db.install/_attribute :db.part/db}

;;\"NotificationRuleSet\",\"Id\",\"bigint\",\"NOT NULL\",\"\",\"IDENTITY\",\"PRIMARY KEY\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :NotificationRuleSet/Id
:db/valueType :db.type/long
:db/cardinality :db.cardinality/one
:db/index true
:db/unique :db.unique/value
:db/doc \"NotificationRuleSet.Id\"
:alexa.entity-type :et-NotificationRuleSet
:db.install/_attribute :db.part/db}

;;\"NotificationRuleSet\",\"ModifiedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :NotificationRuleSet/ModifiedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"NotificationRuleSet.ModifiedOn\"
:alexa.entity-type :et-NotificationRuleSet
:db.install/_attribute :db.part/db}

;;\"NotificationRuleSet\",\"Name\",\"[nvarchar](256)\",\"NOT NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :NotificationRuleSet/Name
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"NotificationRuleSet.Name\"
:alexa.entity-type :et-NotificationRuleSet
:db.install/_attribute :db.part/db}

]"
"[;;\"NotificationType\",\"CreatedOn\",\"datetime\",\"NOT NULL\",\"[DF_NotificationType_CreatedOn]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :NotificationType/CreatedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"NotificationType.CreatedOn\"
:alexa.entity-type :et-NotificationType
:db.install/_attribute :db.part/db}

;;\"NotificationType\",\"DeletedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :NotificationType/DeletedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"NotificationType.DeletedOn\"
:alexa.entity-type :et-NotificationType
:db.install/_attribute :db.part/db}

;;\"NotificationType\",\"Description\",\"[nvarchar](1024)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :NotificationType/Description
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"NotificationType.Description\"
:alexa.entity-type :et-NotificationType
:db.install/_attribute :db.part/db}

;;\"NotificationType\",\"EmailPriority\",\"[nvarchar](50)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :NotificationType/EmailPriority
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"NotificationType.EmailPriority\"
:alexa.entity-type :et-NotificationType
:db.install/_attribute :db.part/db}

;;\"NotificationType\",\"EmailTemplate\",\"[nvarchar](MAX)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :NotificationType/EmailTemplate
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"NotificationType.EmailTemplate\"
:alexa.entity-type :et-NotificationType
:db.install/_attribute :db.part/db}

;;\"NotificationType\",\"Id\",\"bigint\",\"NOT NULL\",\"\",\"IDENTITY\",\"PRIMARY KEY\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :NotificationType/Id
:db/valueType :db.type/long
:db/cardinality :db.cardinality/one
:db/index true
:db/unique :db.unique/value
:db/doc \"NotificationType.Id\"
:alexa.entity-type :et-NotificationType
:db.install/_attribute :db.part/db}

;;\"NotificationType\",\"ModifiedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :NotificationType/ModifiedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"NotificationType.ModifiedOn\"
:alexa.entity-type :et-NotificationType
:db.install/_attribute :db.part/db}

;;\"NotificationType\",\"Name\",\"[nvarchar](256)\",\"NOT NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :NotificationType/Name
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"NotificationType.Name\"
:alexa.entity-type :et-NotificationType
:db.install/_attribute :db.part/db}

;;\"NotificationType\",\"SubjectPrefix\",\"[nvarchar](100)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :NotificationType/SubjectPrefix
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"NotificationType.SubjectPrefix\"
:alexa.entity-type :et-NotificationType
:db.install/_attribute :db.part/db}

]"
"[;;\"OperatingSystem\",\"Alias_OperatingSystemId\",\"bigint\",\"NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :OperatingSystem/Alias_OperatingSystem
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(OperatingSystem Alias_OperatingSystemId OperatingSystem Alias_OperatingSystem)\"
:alexa.entity-type :et-OperatingSystem
:db.install/_attribute :db.part/db}

;;\"OperatingSystem\",\"Build\",\"[nvarchar](50)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :OperatingSystem/Build
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"OperatingSystem.Build\"
:alexa.entity-type :et-OperatingSystem
:db.install/_attribute :db.part/db}

;;\"OperatingSystem\",\"CreatedOn\",\"datetime\",\"NOT NULL\",\"[DF_OperatingSystem_CreatedOn]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :OperatingSystem/CreatedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"OperatingSystem.CreatedOn\"
:alexa.entity-type :et-OperatingSystem
:db.install/_attribute :db.part/db}

;;\"OperatingSystem\",\"DefaultAssetClassId\",\"bigint\",\"NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :OperatingSystem/DefaultAssetClass
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(OperatingSystem DefaultAssetClassId AssetClass DefaultAssetClass)\"
:alexa.entity-type :et-OperatingSystem
:db.install/_attribute :db.part/db}

;;\"OperatingSystem\",\"DefaultAssetTypeId\",\"bigint\",\"NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :OperatingSystem/DefaultAssetType
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(OperatingSystem DefaultAssetTypeId AssetType DefaultAssetType)\"
:alexa.entity-type :et-OperatingSystem
:db.install/_attribute :db.part/db}

;;\"OperatingSystem\",\"DefaultImpactId\",\"bigint\",\"NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :OperatingSystem/DefaultImpact
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(OperatingSystem DefaultImpactId Impact DefaultImpact)\"
:alexa.entity-type :et-OperatingSystem
:db.install/_attribute :db.part/db}

;;\"OperatingSystem\",\"DeletedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :OperatingSystem/DeletedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"OperatingSystem.DeletedOn\"
:alexa.entity-type :et-OperatingSystem
:db.install/_attribute :db.part/db}

;;\"OperatingSystem\",\"Family\",\"[nvarchar](100)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :OperatingSystem/Family
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"OperatingSystem.Family\"
:alexa.entity-type :et-OperatingSystem
:db.install/_attribute :db.part/db}

;;\"OperatingSystem\",\"Flavor\",\"[nvarchar](100)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :OperatingSystem/Flavor
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"OperatingSystem.Flavor\"
:alexa.entity-type :et-OperatingSystem
:db.install/_attribute :db.part/db}

;;\"OperatingSystem\",\"Id\",\"bigint\",\"NOT NULL\",\"\",\"IDENTITY\",\"PRIMARY KEY\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :OperatingSystem/Id
:db/valueType :db.type/long
:db/cardinality :db.cardinality/one
:db/index true
:db/unique :db.unique/value
:db/doc \"OperatingSystem.Id\"
:alexa.entity-type :et-OperatingSystem
:db.install/_attribute :db.part/db}

;;\"OperatingSystem\",\"ModifiedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :OperatingSystem/ModifiedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"OperatingSystem.ModifiedOn\"
:alexa.entity-type :et-OperatingSystem
:db.install/_attribute :db.part/db}

;;\"OperatingSystem\",\"Name\",\"[nvarchar](256)\",\"NOT NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :OperatingSystem/Name
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"OperatingSystem.Name\"
:alexa.entity-type :et-OperatingSystem
:db.install/_attribute :db.part/db}

;;\"OperatingSystem\",\"OperatingSystemTypeId\",\"bigint\",\"NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :OperatingSystem/OperatingSystemType
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(OperatingSystem OperatingSystemTypeId OperatingSystemType OperatingSystemType)\"
:alexa.entity-type :et-OperatingSystem
:db.install/_attribute :db.part/db}

;;\"OperatingSystem\",\"OriginalName\",\"[nvarchar](256)\",\"NOT NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :OperatingSystem/OriginalName
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"OperatingSystem.OriginalName\"
:alexa.entity-type :et-OperatingSystem
:db.install/_attribute :db.part/db}

;;\"OperatingSystem\",\"ServicePack\",\"[nvarchar](50)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :OperatingSystem/ServicePack
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"OperatingSystem.ServicePack\"
:alexa.entity-type :et-OperatingSystem
:db.install/_attribute :db.part/db}

;;\"OperatingSystem\",\"Version\",\"[nvarchar](50)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :OperatingSystem/Version
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"OperatingSystem.Version\"
:alexa.entity-type :et-OperatingSystem
:db.install/_attribute :db.part/db}

{:db/id #db/id[:db.part/db]
:db/ident :OperatingSystem/AssetFilter
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/many
:db/doc \"(OperatingSystem OperatingSystemId AssetFilterOperatingSystem AssetFilterId AssetFilter)\"
:alexa.entity-type :et-OperatingSystem
:db.install/_attribute :db.part/db}

]"
"[;;\"OperatingSystemType\",\"CreatedOn\",\"datetime\",\"NOT NULL\",\"[DF_AssetOperatingSystemType_CreatedOn]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :OperatingSystemType/CreatedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"OperatingSystemType.CreatedOn\"
:alexa.entity-type :et-OperatingSystemType
:db.install/_attribute :db.part/db}

;;\"OperatingSystemType\",\"DeletedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :OperatingSystemType/DeletedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"OperatingSystemType.DeletedOn\"
:alexa.entity-type :et-OperatingSystemType
:db.install/_attribute :db.part/db}

;;\"OperatingSystemType\",\"Description\",\"[nvarchar](1024)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :OperatingSystemType/Description
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"OperatingSystemType.Description\"
:alexa.entity-type :et-OperatingSystemType
:db.install/_attribute :db.part/db}

;;\"OperatingSystemType\",\"Id\",\"bigint\",\"NOT NULL\",\"\",\"IDENTITY\",\"PRIMARY KEY\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :OperatingSystemType/Id
:db/valueType :db.type/long
:db/cardinality :db.cardinality/one
:db/index true
:db/unique :db.unique/value
:db/doc \"OperatingSystemType.Id\"
:alexa.entity-type :et-OperatingSystemType
:db.install/_attribute :db.part/db}

;;\"OperatingSystemType\",\"ModifiedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :OperatingSystemType/ModifiedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"OperatingSystemType.ModifiedOn\"
:alexa.entity-type :et-OperatingSystemType
:db.install/_attribute :db.part/db}

;;\"OperatingSystemType\",\"Name\",\"[nvarchar](256)\",\"NOT NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :OperatingSystemType/Name
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"OperatingSystemType.Name\"
:alexa.entity-type :et-OperatingSystemType
:db.install/_attribute :db.part/db}

]"
"[;;\"Outcome\",\"ApprovalRequired\",\"bit\",\"NULL\",\"[DF_Outcome_ApprovalRequired]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Outcome/ApprovalRequired
:db/valueType :db.type/boolean
:db/cardinality :db.cardinality/one
:db/doc \"Outcome.ApprovalRequired\"
:alexa.entity-type :et-Outcome
:db.install/_attribute :db.part/db}

;;\"Outcome\",\"BackColorName\",\"[nvarchar](50)\",\"NULL\",\"[DF_Override_BackColorName]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Outcome/BackColorName
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"Outcome.BackColorName\"
:alexa.entity-type :et-Outcome
:db.install/_attribute :db.part/db}

;;\"Outcome\",\"CommentsRequired\",\"bit\",\"NULL\",\"[DF_Outcome_CommentsRequired]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Outcome/CommentsRequired
:db/valueType :db.type/boolean
:db/cardinality :db.cardinality/one
:db/doc \"Outcome.CommentsRequired\"
:alexa.entity-type :et-Outcome
:db.install/_attribute :db.part/db}

;;\"Outcome\",\"CreatedOn\",\"datetime\",\"NOT NULL\",\"[DF_Override_CreatedOn]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Outcome/CreatedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"Outcome.CreatedOn\"
:alexa.entity-type :et-Outcome
:db.install/_attribute :db.part/db}

;;\"Outcome\",\"DeletedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Outcome/DeletedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"Outcome.DeletedOn\"
:alexa.entity-type :et-Outcome
:db.install/_attribute :db.part/db}

;;\"Outcome\",\"Description\",\"[nvarchar](1024)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Outcome/Description
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"Outcome.Description\"
:alexa.entity-type :et-Outcome
:db.install/_attribute :db.part/db}

;;\"Outcome\",\"FixedEntry\",\"bit\",\"NULL\",\"[DF_Outcome_FixedEntry]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Outcome/FixedEntry
:db/valueType :db.type/boolean
:db/cardinality :db.cardinality/one
:db/doc \"Outcome.FixedEntry\"
:alexa.entity-type :et-Outcome
:db.install/_attribute :db.part/db}

;;\"Outcome\",\"ForeColorName\",\"[nvarchar](50)\",\"NULL\",\"[DF_Override_ForeColorName]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Outcome/ForeColorName
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"Outcome.ForeColorName\"
:alexa.entity-type :et-Outcome
:db.install/_attribute :db.part/db}

;;\"Outcome\",\"Id\",\"bigint\",\"NOT NULL\",\"\",\"IDENTITY\",\"PRIMARY KEY\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Outcome/Id
:db/valueType :db.type/long
:db/cardinality :db.cardinality/one
:db/index true
:db/unique :db.unique/value
:db/doc \"Outcome.Id\"
:alexa.entity-type :et-Outcome
:db.install/_attribute :db.part/db}

;;\"Outcome\",\"ModifiedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Outcome/ModifiedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"Outcome.ModifiedOn\"
:alexa.entity-type :et-Outcome
:db.install/_attribute :db.part/db}

;;\"Outcome\",\"Name\",\"[nvarchar](256)\",\"NOT NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Outcome/Name
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"Outcome.Name\"
:alexa.entity-type :et-Outcome
:db.install/_attribute :db.part/db}

;;\"Outcome\",\"ProjectTypeId\",\"bigint\",\"NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :Outcome/ProjectType
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(Outcome ProjectTypeId ProjectType ProjectType)\"
:alexa.entity-type :et-Outcome
:db.install/_attribute :db.part/db}

]"
"[;;\"Person\",\"AddressId\",\"bigint\",\"NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :Person/Address
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(Person AddressId Address Address)\"
:alexa.entity-type :et-Person
:db.install/_attribute :db.part/db}

;;\"Person\",\"CellPhone\",\"[nvarchar](50)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Person/CellPhone
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"Person.CellPhone\"
:alexa.entity-type :et-Person
:db.install/_attribute :db.part/db}

;;\"Person\",\"CreatedOn\",\"datetime\",\"NOT NULL\",\"[DF_Person_CreatedOn]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Person/CreatedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"Person.CreatedOn\"
:alexa.entity-type :et-Person
:db.install/_attribute :db.part/db}

;;\"Person\",\"DeletedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Person/DeletedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"Person.DeletedOn\"
:alexa.entity-type :et-Person
:db.install/_attribute :db.part/db}

;;\"Person\",\"DisableASLMLogin\",\"bit\",\"NULL\",\"[DF_Person_DisableLogin]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Person/DisableASLMLogin
:db/valueType :db.type/boolean
:db/cardinality :db.cardinality/one
:db/doc \"Person.DisableASLMLogin\"
:alexa.entity-type :et-Person
:db.install/_attribute :db.part/db}

;;\"Person\",\"DisableLDAPLogin\",\"bit\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Person/DisableLDAPLogin
:db/valueType :db.type/boolean
:db/cardinality :db.cardinality/one
:db/doc \"Person.DisableLDAPLogin\"
:alexa.entity-type :et-Person
:db.install/_attribute :db.part/db}

;;\"Person\",\"DisableWebLogin\",\"bit\",\"NULL\",\"[DF_Person_DisableWebLogin]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Person/DisableWebLogin
:db/valueType :db.type/boolean
:db/cardinality :db.cardinality/one
:db/doc \"Person.DisableWebLogin\"
:alexa.entity-type :et-Person
:db.install/_attribute :db.part/db}

;;\"Person\",\"Email\",\"[nvarchar](256)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Person/Email
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"Person.Email\"
:alexa.entity-type :et-Person
:db.install/_attribute :db.part/db}

;;\"Person\",\"ExpiresOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Person/ExpiresOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"Person.ExpiresOn\"
:alexa.entity-type :et-Person
:db.install/_attribute :db.part/db}

;;\"Person\",\"FirstName\",\"[nvarchar](50)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Person/FirstName
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"Person.FirstName\"
:alexa.entity-type :et-Person
:db.install/_attribute :db.part/db}

;;\"Person\",\"ForcePasswordReset\",\"bit\",\"NULL\",\"[DF_Person_ForcePasswordReset]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Person/ForcePasswordReset
:db/valueType :db.type/boolean
:db/cardinality :db.cardinality/one
:db/doc \"Person.ForcePasswordReset\"
:alexa.entity-type :et-Person
:db.install/_attribute :db.part/db}

;;\"Person\",\"Id\",\"bigint\",\"NOT NULL\",\"\",\"IDENTITY\",\"PRIMARY KEY\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Person/Id
:db/valueType :db.type/long
:db/cardinality :db.cardinality/one
:db/index true
:db/unique :db.unique/value
:db/doc \"Person.Id\"
:alexa.entity-type :et-Person
:db.install/_attribute :db.part/db}

;;\"Person\",\"IsGlobalUser\",\"bit\",\"NULL\",\"[DF_Person_IsGlobalUser]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Person/IsGlobalUser
:db/valueType :db.type/boolean
:db/cardinality :db.cardinality/one
:db/doc \"Person.IsGlobalUser\"
:alexa.entity-type :et-Person
:db.install/_attribute :db.part/db}

;;\"Person\",\"IsRestrictedUser\",\"bit\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Person/IsRestrictedUser
:db/valueType :db.type/boolean
:db/cardinality :db.cardinality/one
:db/doc \"Person.IsRestrictedUser\"
:alexa.entity-type :et-Person
:db.install/_attribute :db.part/db}

;;\"Person\",\"IsSuperuser\",\"bit\",\"NULL\",\"[DF_Person_IsSuperuser]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Person/IsSuperuser
:db/valueType :db.type/boolean
:db/cardinality :db.cardinality/one
:db/doc \"Person.IsSuperuser\"
:alexa.entity-type :et-Person
:db.install/_attribute :db.part/db}

;;\"Person\",\"IsSystemUser\",\"bit\",\"NULL\",\"[DF_Person_IsSystemAccount]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Person/IsSystemUser
:db/valueType :db.type/boolean
:db/cardinality :db.cardinality/one
:db/doc \"Person.IsSystemUser\"
:alexa.entity-type :et-Person
:db.install/_attribute :db.part/db}

;;\"Person\",\"LastLoginFrom\",\"[nvarchar](256)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Person/LastLoginFrom
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"Person.LastLoginFrom\"
:alexa.entity-type :et-Person
:db.install/_attribute :db.part/db}

;;\"Person\",\"LastLoginOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Person/LastLoginOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"Person.LastLoginOn\"
:alexa.entity-type :et-Person
:db.install/_attribute :db.part/db}

;;\"Person\",\"LastLogoutOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Person/LastLogoutOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"Person.LastLogoutOn\"
:alexa.entity-type :et-Person
:db.install/_attribute :db.part/db}

;;\"Person\",\"LastName\",\"[nvarchar](50)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Person/LastName
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"Person.LastName\"
:alexa.entity-type :et-Person
:db.install/_attribute :db.part/db}

;;\"Person\",\"LDAPConfigId\",\"bigint\",\"NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :Person/LDAPConfig
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(Person LDAPConfigId LDAPConfig LDAPConfig)\"
:alexa.entity-type :et-Person
:db.install/_attribute :db.part/db}

;;\"Person\",\"LDAPGUID\",\"uniqueidentifier\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Person/LDAPGUID
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"Person.LDAPGUID\"
:alexa.entity-type :et-Person
:db.install/_attribute :db.part/db}

;;\"Person\",\"MiddleName\",\"[nvarchar](50)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Person/MiddleName
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"Person.MiddleName\"
:alexa.entity-type :et-Person
:db.install/_attribute :db.part/db}

;;\"Person\",\"ModifiedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Person/ModifiedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"Person.ModifiedOn\"
:alexa.entity-type :et-Person
:db.install/_attribute :db.part/db}

;;\"Person\",\"Password\",\"[varbinary](100)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Person/Password
:db/valueType :db.type/bigint
:db/cardinality :db.cardinality/one
:db/doc \"Person.Password\"
:alexa.entity-type :et-Person
:db.install/_attribute :db.part/db}

;;\"Person\",\"PasswordLastSetOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Person/PasswordLastSetOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"Person.PasswordLastSetOn\"
:alexa.entity-type :et-Person
:db.install/_attribute :db.part/db}

;;\"Person\",\"Suffix\",\"[nvarchar](50)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Person/Suffix
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"Person.Suffix\"
:alexa.entity-type :et-Person
:db.install/_attribute :db.part/db}

;;\"Person\",\"Title\",\"[nvarchar](50)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Person/Title
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"Person.Title\"
:alexa.entity-type :et-Person
:db.install/_attribute :db.part/db}

;;\"Person\",\"Username\",\"[nvarchar](50)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Person/Username
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"Person.Username\"
:alexa.entity-type :et-Person
:db.install/_attribute :db.part/db}

;;\"Person\",\"WorkPhone\",\"[nvarchar](50)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Person/WorkPhone
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"Person.WorkPhone\"
:alexa.entity-type :et-Person
:db.install/_attribute :db.part/db}

{:db/id #db/id[:db.part/db]
:db/ident :Person/AssetGroup
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/many
:db/doc \"(Person PersonId AssetGroupPerson AssetGroupId AssetGroup)\"
:alexa.entity-type :et-Person
:db.install/_attribute :db.part/db}

{:db/id #db/id[:db.part/db]
:db/ident :Person/DataLocation
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/many
:db/doc \"(Person PersonId DataLocationPerson DataLocationId DataLocation)\"
:alexa.entity-type :et-Person
:db.install/_attribute :db.part/db}

{:db/id #db/id[:db.part/db]
:db/ident :Person/NotificationRule
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/many
:db/doc \"(Person PersonId NotificationRulePerson NotificationRuleId NotificationRule)\"
:alexa.entity-type :et-Person
:db.install/_attribute :db.part/db}

{:db/id #db/id[:db.part/db]
:db/ident :Person/StandardComponent
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/many
:db/doc \"(Person PersonId StandardComponentPerson StandardComponentId StandardComponent)\"
:alexa.entity-type :et-Person
:db.install/_attribute :db.part/db}

]"
"[;;\"Person_History\",\"AddressId\",\"bigint\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Person_History/AddressId
:db/valueType :db.type/long
:db/cardinality :db.cardinality/one
:db/doc \"Person_History.AddressId\"
:alexa.entity-type :et-Person_History
:db.install/_attribute :db.part/db}

;;\"Person_History\",\"CellPhone\",\"[nvarchar](50)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Person_History/CellPhone
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"Person_History.CellPhone\"
:alexa.entity-type :et-Person_History
:db.install/_attribute :db.part/db}

;;\"Person_History\",\"CreatedOn\",\"datetime\",\"NOT NULL\",\"[DF_Person_History_CreatedOn]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Person_History/CreatedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"Person_History.CreatedOn\"
:alexa.entity-type :et-Person_History
:db.install/_attribute :db.part/db}

;;\"Person_History\",\"DeletedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Person_History/DeletedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"Person_History.DeletedOn\"
:alexa.entity-type :et-Person_History
:db.install/_attribute :db.part/db}

;;\"Person_History\",\"DisableASLMLogin\",\"bit\",\"NULL\",\"[DF_Person_History_DisableASLMLogin]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Person_History/DisableASLMLogin
:db/valueType :db.type/boolean
:db/cardinality :db.cardinality/one
:db/doc \"Person_History.DisableASLMLogin\"
:alexa.entity-type :et-Person_History
:db.install/_attribute :db.part/db}

;;\"Person_History\",\"DisableLDAPLogin\",\"bit\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Person_History/DisableLDAPLogin
:db/valueType :db.type/boolean
:db/cardinality :db.cardinality/one
:db/doc \"Person_History.DisableLDAPLogin\"
:alexa.entity-type :et-Person_History
:db.install/_attribute :db.part/db}

;;\"Person_History\",\"DisableWebLogin\",\"bit\",\"NULL\",\"[DF_Person_History_DisableWebLogin]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Person_History/DisableWebLogin
:db/valueType :db.type/boolean
:db/cardinality :db.cardinality/one
:db/doc \"Person_History.DisableWebLogin\"
:alexa.entity-type :et-Person_History
:db.install/_attribute :db.part/db}

;;\"Person_History\",\"Email\",\"[nvarchar](256)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Person_History/Email
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"Person_History.Email\"
:alexa.entity-type :et-Person_History
:db.install/_attribute :db.part/db}

;;\"Person_History\",\"ExpiresOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Person_History/ExpiresOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"Person_History.ExpiresOn\"
:alexa.entity-type :et-Person_History
:db.install/_attribute :db.part/db}

;;\"Person_History\",\"FirstName\",\"[nvarchar](50)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Person_History/FirstName
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"Person_History.FirstName\"
:alexa.entity-type :et-Person_History
:db.install/_attribute :db.part/db}

;;\"Person_History\",\"ForcePasswordReset\",\"bit\",\"NULL\",\"[DF_Person_History_ForcePasswordReset]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Person_History/ForcePasswordReset
:db/valueType :db.type/boolean
:db/cardinality :db.cardinality/one
:db/doc \"Person_History.ForcePasswordReset\"
:alexa.entity-type :et-Person_History
:db.install/_attribute :db.part/db}

;;\"Person_History\",\"Id\",\"bigint\",\"NOT NULL\",\"\",\"IDENTITY\",\"PRIMARY KEY\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Person_History/Id
:db/valueType :db.type/long
:db/cardinality :db.cardinality/one
:db/index true
:db/unique :db.unique/value
:db/doc \"Person_History.Id\"
:alexa.entity-type :et-Person_History
:db.install/_attribute :db.part/db}

;;\"Person_History\",\"IsGlobalUser\",\"bit\",\"NULL\",\"[DF_Person_History_IsGlobalUser]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Person_History/IsGlobalUser
:db/valueType :db.type/boolean
:db/cardinality :db.cardinality/one
:db/doc \"Person_History.IsGlobalUser\"
:alexa.entity-type :et-Person_History
:db.install/_attribute :db.part/db}

;;\"Person_History\",\"IsRestrictedUser\",\"bit\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Person_History/IsRestrictedUser
:db/valueType :db.type/boolean
:db/cardinality :db.cardinality/one
:db/doc \"Person_History.IsRestrictedUser\"
:alexa.entity-type :et-Person_History
:db.install/_attribute :db.part/db}

;;\"Person_History\",\"IsSuperuser\",\"bit\",\"NULL\",\"[DF_Person_History_IsSuperuser]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Person_History/IsSuperuser
:db/valueType :db.type/boolean
:db/cardinality :db.cardinality/one
:db/doc \"Person_History.IsSuperuser\"
:alexa.entity-type :et-Person_History
:db.install/_attribute :db.part/db}

;;\"Person_History\",\"IsSystemUser\",\"bit\",\"NULL\",\"[DF_Person_History_IsSystemUser]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Person_History/IsSystemUser
:db/valueType :db.type/boolean
:db/cardinality :db.cardinality/one
:db/doc \"Person_History.IsSystemUser\"
:alexa.entity-type :et-Person_History
:db.install/_attribute :db.part/db}

;;\"Person_History\",\"LastLoginFrom\",\"[nvarchar](256)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Person_History/LastLoginFrom
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"Person_History.LastLoginFrom\"
:alexa.entity-type :et-Person_History
:db.install/_attribute :db.part/db}

;;\"Person_History\",\"LastLoginOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Person_History/LastLoginOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"Person_History.LastLoginOn\"
:alexa.entity-type :et-Person_History
:db.install/_attribute :db.part/db}

;;\"Person_History\",\"LastLogoutOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Person_History/LastLogoutOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"Person_History.LastLogoutOn\"
:alexa.entity-type :et-Person_History
:db.install/_attribute :db.part/db}

;;\"Person_History\",\"LastName\",\"[nvarchar](50)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Person_History/LastName
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"Person_History.LastName\"
:alexa.entity-type :et-Person_History
:db.install/_attribute :db.part/db}

;;\"Person_History\",\"LDAPConfigId\",\"bigint\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Person_History/LDAPConfigId
:db/valueType :db.type/long
:db/cardinality :db.cardinality/one
:db/doc \"Person_History.LDAPConfigId\"
:alexa.entity-type :et-Person_History
:db.install/_attribute :db.part/db}

;;\"Person_History\",\"LDAPGUID\",\"uniqueidentifier\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Person_History/LDAPGUID
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"Person_History.LDAPGUID\"
:alexa.entity-type :et-Person_History
:db.install/_attribute :db.part/db}

;;\"Person_History\",\"LoginPersonId\",\"bigint\",\"NOT NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :Person_History/LoginPerson
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(Person_History LoginPersonId Person LoginPerson)\"
:alexa.entity-type :et-Person_History
:db.install/_attribute :db.part/db}

;;\"Person_History\",\"MiddleName\",\"[nvarchar](50)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Person_History/MiddleName
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"Person_History.MiddleName\"
:alexa.entity-type :et-Person_History
:db.install/_attribute :db.part/db}

;;\"Person_History\",\"ModifiedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Person_History/ModifiedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"Person_History.ModifiedOn\"
:alexa.entity-type :et-Person_History
:db.install/_attribute :db.part/db}

;;\"Person_History\",\"Password\",\"[varbinary](100)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Person_History/Password
:db/valueType :db.type/bigint
:db/cardinality :db.cardinality/one
:db/doc \"Person_History.Password\"
:alexa.entity-type :et-Person_History
:db.install/_attribute :db.part/db}

;;\"Person_History\",\"PasswordLastSetOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Person_History/PasswordLastSetOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"Person_History.PasswordLastSetOn\"
:alexa.entity-type :et-Person_History
:db.install/_attribute :db.part/db}

;;\"Person_History\",\"PersonId\",\"bigint\",\"NOT NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :Person_History/Person
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(Person_History PersonId Person Person)\"
:alexa.entity-type :et-Person_History
:db.install/_attribute :db.part/db}

;;\"Person_History\",\"Suffix\",\"[nvarchar](50)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Person_History/Suffix
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"Person_History.Suffix\"
:alexa.entity-type :et-Person_History
:db.install/_attribute :db.part/db}

;;\"Person_History\",\"Title\",\"[nvarchar](50)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Person_History/Title
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"Person_History.Title\"
:alexa.entity-type :et-Person_History
:db.install/_attribute :db.part/db}

;;\"Person_History\",\"Username\",\"[nvarchar](50)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Person_History/Username
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"Person_History.Username\"
:alexa.entity-type :et-Person_History
:db.install/_attribute :db.part/db}

;;\"Person_History\",\"WorkPhone\",\"[nvarchar](50)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Person_History/WorkPhone
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"Person_History.WorkPhone\"
:alexa.entity-type :et-Person_History
:db.install/_attribute :db.part/db}

]"
"[;;\"PersonLDAPEvent\",\"BusinessUnitId\",\"bigint\",\"NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :PersonLDAPEvent/BusinessUnit
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(PersonLDAPEvent BusinessUnitId BusinessUnit BusinessUnit)\"
:alexa.entity-type :et-PersonLDAPEvent
:db.install/_attribute :db.part/db}

;;\"PersonLDAPEvent\",\"Completed\",\"bit\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :PersonLDAPEvent/Completed
:db/valueType :db.type/boolean
:db/cardinality :db.cardinality/one
:db/doc \"PersonLDAPEvent.Completed\"
:alexa.entity-type :et-PersonLDAPEvent
:db.install/_attribute :db.part/db}

;;\"PersonLDAPEvent\",\"CreatedOn\",\"datetime\",\"NOT NULL\",\"[DF_PersonLDAPEvent_CreatedOn]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :PersonLDAPEvent/CreatedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"PersonLDAPEvent.CreatedOn\"
:alexa.entity-type :et-PersonLDAPEvent
:db.install/_attribute :db.part/db}

;;\"PersonLDAPEvent\",\"DeletedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :PersonLDAPEvent/DeletedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"PersonLDAPEvent.DeletedOn\"
:alexa.entity-type :et-PersonLDAPEvent
:db.install/_attribute :db.part/db}

;;\"PersonLDAPEvent\",\"Description\",\"[nvarchar](256)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :PersonLDAPEvent/Description
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"PersonLDAPEvent.Description\"
:alexa.entity-type :et-PersonLDAPEvent
:db.install/_attribute :db.part/db}

;;\"PersonLDAPEvent\",\"Id\",\"bigint\",\"NOT NULL\",\"\",\"IDENTITY\",\"PRIMARY KEY\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :PersonLDAPEvent/Id
:db/valueType :db.type/long
:db/cardinality :db.cardinality/one
:db/index true
:db/unique :db.unique/value
:db/doc \"PersonLDAPEvent.Id\"
:alexa.entity-type :et-PersonLDAPEvent
:db.install/_attribute :db.part/db}

;;\"PersonLDAPEvent\",\"LDAPActionId\",\"bigint\",\"NOT NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :PersonLDAPEvent/LDAPAction
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(PersonLDAPEvent LDAPActionId LDAPAction LDAPAction)\"
:alexa.entity-type :et-PersonLDAPEvent
:db.install/_attribute :db.part/db}

;;\"PersonLDAPEvent\",\"LDAPConfigId\",\"bigint\",\"NOT NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :PersonLDAPEvent/LDAPConfig
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(PersonLDAPEvent LDAPConfigId LDAPConfig LDAPConfig)\"
:alexa.entity-type :et-PersonLDAPEvent
:db.install/_attribute :db.part/db}

;;\"PersonLDAPEvent\",\"Message\",\"[nvarchar](1024)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :PersonLDAPEvent/Message
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"PersonLDAPEvent.Message\"
:alexa.entity-type :et-PersonLDAPEvent
:db.install/_attribute :db.part/db}

;;\"PersonLDAPEvent\",\"ModifiedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :PersonLDAPEvent/ModifiedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"PersonLDAPEvent.ModifiedOn\"
:alexa.entity-type :et-PersonLDAPEvent
:db.install/_attribute :db.part/db}

;;\"PersonLDAPEvent\",\"PersonId\",\"bigint\",\"NOT NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :PersonLDAPEvent/PersonId
:db/valueType :db.type/long
:db/cardinality :db.cardinality/one
:db/doc \"PersonLDAPEvent.PersonId\"
:alexa.entity-type :et-PersonLDAPEvent
:db.install/_attribute :db.part/db}

;;\"PersonLDAPEvent\",\"RoleId\",\"bigint\",\"NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :PersonLDAPEvent/Role
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(PersonLDAPEvent RoleId Role Role)\"
:alexa.entity-type :et-PersonLDAPEvent
:db.install/_attribute :db.part/db}

]"
"[;;\"PersonPasswordHistory\",\"CreatedOn\",\"datetime\",\"NOT NULL\",\"[DF_PersonPasswordHistory_CreatedOn]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :PersonPasswordHistory/CreatedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"PersonPasswordHistory.CreatedOn\"
:alexa.entity-type :et-PersonPasswordHistory
:db.install/_attribute :db.part/db}

;;\"PersonPasswordHistory\",\"DeletedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :PersonPasswordHistory/DeletedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"PersonPasswordHistory.DeletedOn\"
:alexa.entity-type :et-PersonPasswordHistory
:db.install/_attribute :db.part/db}

;;\"PersonPasswordHistory\",\"Id\",\"bigint\",\"NOT NULL\",\"\",\"IDENTITY\",\"PRIMARY KEY\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :PersonPasswordHistory/Id
:db/valueType :db.type/long
:db/cardinality :db.cardinality/one
:db/index true
:db/unique :db.unique/value
:db/doc \"PersonPasswordHistory.Id\"
:alexa.entity-type :et-PersonPasswordHistory
:db.install/_attribute :db.part/db}

;;\"PersonPasswordHistory\",\"ModifiedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :PersonPasswordHistory/ModifiedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"PersonPasswordHistory.ModifiedOn\"
:alexa.entity-type :et-PersonPasswordHistory
:db.install/_attribute :db.part/db}

;;\"PersonPasswordHistory\",\"Password\",\"[varbinary](100)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :PersonPasswordHistory/Password
:db/valueType :db.type/bigint
:db/cardinality :db.cardinality/one
:db/doc \"PersonPasswordHistory.Password\"
:alexa.entity-type :et-PersonPasswordHistory
:db.install/_attribute :db.part/db}

;;\"PersonPasswordHistory\",\"PersonId\",\"bigint\",\"NOT NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :PersonPasswordHistory/Person
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(PersonPasswordHistory PersonId Person Person)\"
:alexa.entity-type :et-PersonPasswordHistory
:db.install/_attribute :db.part/db}

;;\"PersonPasswordHistory\",\"Username\",\"[nvarchar](50)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :PersonPasswordHistory/Username
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"PersonPasswordHistory.Username\"
:alexa.entity-type :et-PersonPasswordHistory
:db.install/_attribute :db.part/db}

]"
"[;;\"PersonPerson\",\"CreatedOn\",\"datetime\",\"NOT NULL\",\"[DF_PersonPerson_CreatedOn]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :PersonPerson/CreatedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"PersonPerson.CreatedOn\"
:alexa.entity-type :et-PersonPerson
:db.install/_attribute :db.part/db}

;;\"PersonPerson\",\"DeletedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :PersonPerson/DeletedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"PersonPerson.DeletedOn\"
:alexa.entity-type :et-PersonPerson
:db.install/_attribute :db.part/db}

;;\"PersonPerson\",\"Id\",\"bigint\",\"NOT NULL\",\"\",\"IDENTITY\",\"PRIMARY KEY\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :PersonPerson/Id
:db/valueType :db.type/long
:db/cardinality :db.cardinality/one
:db/index true
:db/unique :db.unique/value
:db/doc \"PersonPerson.Id\"
:alexa.entity-type :et-PersonPerson
:db.install/_attribute :db.part/db}

;;\"PersonPerson\",\"ModifiedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :PersonPerson/ModifiedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"PersonPerson.ModifiedOn\"
:alexa.entity-type :et-PersonPerson
:db.install/_attribute :db.part/db}

;;\"PersonPerson\",\"PersonAId\",\"bigint\",\"NOT NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :PersonPerson/PersonA
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(PersonPerson PersonAId Person PersonA)\"
:alexa.entity-type :et-PersonPerson
:db.install/_attribute :db.part/db}

;;\"PersonPerson\",\"PersonBId\",\"bigint\",\"NOT NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :PersonPerson/PersonB
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(PersonPerson PersonBId Person PersonB)\"
:alexa.entity-type :et-PersonPerson
:db.install/_attribute :db.part/db}

;;\"PersonPerson\",\"PersonRelationshipTypeId\",\"bigint\",\"NOT NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :PersonPerson/PersonRelationshipType
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(PersonPerson PersonRelationshipTypeId PersonRelationshipType PersonRelationshipType)\"
:alexa.entity-type :et-PersonPerson
:db.install/_attribute :db.part/db}

]"
"[;;\"PersonRelationshipType\",\"CreatedOn\",\"datetime\",\"NOT NULL\",\"[DF_PersonRelationshipType_CreatedOn]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :PersonRelationshipType/CreatedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"PersonRelationshipType.CreatedOn\"
:alexa.entity-type :et-PersonRelationshipType
:db.install/_attribute :db.part/db}

;;\"PersonRelationshipType\",\"DeletedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :PersonRelationshipType/DeletedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"PersonRelationshipType.DeletedOn\"
:alexa.entity-type :et-PersonRelationshipType
:db.install/_attribute :db.part/db}

;;\"PersonRelationshipType\",\"Description\",\"[nvarchar](1024)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :PersonRelationshipType/Description
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"PersonRelationshipType.Description\"
:alexa.entity-type :et-PersonRelationshipType
:db.install/_attribute :db.part/db}

;;\"PersonRelationshipType\",\"Id\",\"bigint\",\"NOT NULL\",\"\",\"IDENTITY\",\"PRIMARY KEY\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :PersonRelationshipType/Id
:db/valueType :db.type/long
:db/cardinality :db.cardinality/one
:db/index true
:db/unique :db.unique/value
:db/doc \"PersonRelationshipType.Id\"
:alexa.entity-type :et-PersonRelationshipType
:db.install/_attribute :db.part/db}

;;\"PersonRelationshipType\",\"ModifiedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :PersonRelationshipType/ModifiedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"PersonRelationshipType.ModifiedOn\"
:alexa.entity-type :et-PersonRelationshipType
:db.install/_attribute :db.part/db}

;;\"PersonRelationshipType\",\"Name\",\"[nvarchar](256)\",\"NOT NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :PersonRelationshipType/Name
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"PersonRelationshipType.Name\"
:alexa.entity-type :et-PersonRelationshipType
:db.install/_attribute :db.part/db}

]"
"[;;\"Performer\",\"BusinessUnitId\",\"bigint\",\"NOT NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :Performer/BusinessUnit
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(Performer BusinessUnitId BusinessUnit BusinessUnit)\"
:alexa.entity-type :et-Performer
:db.install/_attribute :db.part/db}

;;\"Performer\",\"CreatedOn\",\"datetime\",\"NOT NULL\",\"[DF_PersonBusinessUnitRole_CreatedOn]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Performer/CreatedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"Performer.CreatedOn\"
:alexa.entity-type :et-Performer
:db.install/_attribute :db.part/db}

;;\"Performer\",\"DeletedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Performer/DeletedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"Performer.DeletedOn\"
:alexa.entity-type :et-Performer
:db.install/_attribute :db.part/db}

;;\"Performer\",\"Id\",\"bigint\",\"NOT NULL\",\"\",\"IDENTITY\",\"PRIMARY KEY\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Performer/Id
:db/valueType :db.type/long
:db/cardinality :db.cardinality/one
:db/index true
:db/unique :db.unique/value
:db/doc \"Performer.Id\"
:alexa.entity-type :et-Performer
:db.install/_attribute :db.part/db}

;;\"Performer\",\"ModifiedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Performer/ModifiedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"Performer.ModifiedOn\"
:alexa.entity-type :et-Performer
:db.install/_attribute :db.part/db}

;;\"Performer\",\"PersonId\",\"bigint\",\"NOT NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :Performer/Person
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(Performer PersonId Person Person)\"
:alexa.entity-type :et-Performer
:db.install/_attribute :db.part/db}

;;\"Performer\",\"RoleId\",\"bigint\",\"NOT NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :Performer/Role
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(Performer RoleId Role Role)\"
:alexa.entity-type :et-Performer
:db.install/_attribute :db.part/db}

]"
"[;;\"PhysicalAsset\",\"AddressId\",\"bigint\",\"NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :PhysicalAsset/Address
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(PhysicalAsset AddressId Address Address)\"
:alexa.entity-type :et-PhysicalAsset
:db.install/_attribute :db.part/db}

;;\"PhysicalAsset\",\"ContractEndOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :PhysicalAsset/ContractEndOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"PhysicalAsset.ContractEndOn\"
:alexa.entity-type :et-PhysicalAsset
:db.install/_attribute :db.part/db}

;;\"PhysicalAsset\",\"ContractNumber\",\"[nvarchar](50)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :PhysicalAsset/ContractNumber
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"PhysicalAsset.ContractNumber\"
:alexa.entity-type :et-PhysicalAsset
:db.install/_attribute :db.part/db}

;;\"PhysicalAsset\",\"ContractStartOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :PhysicalAsset/ContractStartOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"PhysicalAsset.ContractStartOn\"
:alexa.entity-type :et-PhysicalAsset
:db.install/_attribute :db.part/db}

;;\"PhysicalAsset\",\"CreatedOn\",\"datetime\",\"NOT NULL\",\"[DF_PhysicalAsset_CreatedOn]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :PhysicalAsset/CreatedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"PhysicalAsset.CreatedOn\"
:alexa.entity-type :et-PhysicalAsset
:db.install/_attribute :db.part/db}

;;\"PhysicalAsset\",\"DeletedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :PhysicalAsset/DeletedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"PhysicalAsset.DeletedOn\"
:alexa.entity-type :et-PhysicalAsset
:db.install/_attribute :db.part/db}

;;\"PhysicalAsset\",\"EndOfLifeOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :PhysicalAsset/EndOfLifeOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"PhysicalAsset.EndOfLifeOn\"
:alexa.entity-type :et-PhysicalAsset
:db.install/_attribute :db.part/db}

;;\"PhysicalAsset\",\"ExternalKey\",\"[nvarchar](50)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :PhysicalAsset/ExternalKey
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"PhysicalAsset.ExternalKey\"
:alexa.entity-type :et-PhysicalAsset
:db.install/_attribute :db.part/db}

;;\"PhysicalAsset\",\"Id\",\"bigint\",\"NOT NULL\",\"\",\"IDENTITY\",\"PRIMARY KEY\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :PhysicalAsset/Id
:db/valueType :db.type/long
:db/cardinality :db.cardinality/one
:db/index true
:db/unique :db.unique/value
:db/doc \"PhysicalAsset.Id\"
:alexa.entity-type :et-PhysicalAsset
:db.install/_attribute :db.part/db}

;;\"PhysicalAsset\",\"InstalledOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :PhysicalAsset/InstalledOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"PhysicalAsset.InstalledOn\"
:alexa.entity-type :et-PhysicalAsset
:db.install/_attribute :db.part/db}

;;\"PhysicalAsset\",\"Location\",\"[nvarchar](256)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :PhysicalAsset/Location
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"PhysicalAsset.Location\"
:alexa.entity-type :et-PhysicalAsset
:db.install/_attribute :db.part/db}

;;\"PhysicalAsset\",\"ManufacturerId\",\"bigint\",\"NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :PhysicalAsset/Manufacturer
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(PhysicalAsset ManufacturerId Manufacturer Manufacturer)\"
:alexa.entity-type :et-PhysicalAsset
:db.install/_attribute :db.part/db}

;;\"PhysicalAsset\",\"ModifiedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :PhysicalAsset/ModifiedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"PhysicalAsset.ModifiedOn\"
:alexa.entity-type :et-PhysicalAsset
:db.install/_attribute :db.part/db}

;;\"PhysicalAsset\",\"PartNumber\",\"[nvarchar](50)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :PhysicalAsset/PartNumber
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"PhysicalAsset.PartNumber\"
:alexa.entity-type :et-PhysicalAsset
:db.install/_attribute :db.part/db}

;;\"PhysicalAsset\",\"PurchasedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :PhysicalAsset/PurchasedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"PhysicalAsset.PurchasedOn\"
:alexa.entity-type :et-PhysicalAsset
:db.install/_attribute :db.part/db}

;;\"PhysicalAsset\",\"SerialNumber\",\"[nvarchar](50)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :PhysicalAsset/SerialNumber
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"PhysicalAsset.SerialNumber\"
:alexa.entity-type :et-PhysicalAsset
:db.install/_attribute :db.part/db}

;;\"PhysicalAsset\",\"ServiceTag\",\"[nvarchar](50)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :PhysicalAsset/ServiceTag
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"PhysicalAsset.ServiceTag\"
:alexa.entity-type :et-PhysicalAsset
:db.install/_attribute :db.part/db}

]"
"[;;\"Policy\",\"AddDotZero\",\"bit\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Policy/AddDotZero
:db/valueType :db.type/boolean
:db/cardinality :db.cardinality/one
:db/doc \"Policy.AddDotZero\"
:alexa.entity-type :et-Policy
:db.install/_attribute :db.part/db}

;;\"Policy\",\"AllowExceptionRequest\",\"bit\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Policy/AllowExceptionRequest
:db/valueType :db.type/boolean
:db/cardinality :db.cardinality/one
:db/doc \"Policy.AllowExceptionRequest\"
:alexa.entity-type :et-Policy
:db.install/_attribute :db.part/db}

;;\"Policy\",\"AllowPDFDownload\",\"bit\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Policy/AllowPDFDownload
:db/valueType :db.type/boolean
:db/cardinality :db.cardinality/one
:db/doc \"Policy.AllowPDFDownload\"
:alexa.entity-type :et-Policy
:db.install/_attribute :db.part/db}

;;\"Policy\",\"Comments\",\"[nvarchar](MAX)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Policy/Comments
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"Policy.Comments\"
:alexa.entity-type :et-Policy
:db.install/_attribute :db.part/db}

;;\"Policy\",\"CreatedOn\",\"datetime\",\"NOT NULL\",\"[DF_Policy_CreatedOn]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Policy/CreatedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"Policy.CreatedOn\"
:alexa.entity-type :et-Policy
:db.install/_attribute :db.part/db}

;;\"Policy\",\"DeletedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Policy/DeletedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"Policy.DeletedOn\"
:alexa.entity-type :et-Policy
:db.install/_attribute :db.part/db}

;;\"Policy\",\"Description\",\"[nvarchar](1024)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Policy/Description
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"Policy.Description\"
:alexa.entity-type :et-Policy
:db.install/_attribute :db.part/db}

;;\"Policy\",\"Guid\",\"[nvarchar](50)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Policy/Guid
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"Policy.Guid\"
:alexa.entity-type :et-Policy
:db.install/_attribute :db.part/db}

;;\"Policy\",\"Id\",\"bigint\",\"NOT NULL\",\"\",\"IDENTITY\",\"PRIMARY KEY\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Policy/Id
:db/valueType :db.type/long
:db/cardinality :db.cardinality/one
:db/index true
:db/unique :db.unique/value
:db/doc \"Policy.Id\"
:alexa.entity-type :et-Policy
:db.install/_attribute :db.part/db}

;;\"Policy\",\"InvitationOnly\",\"bit\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Policy/InvitationOnly
:db/valueType :db.type/boolean
:db/cardinality :db.cardinality/one
:db/doc \"Policy.InvitationOnly\"
:alexa.entity-type :et-Policy
:db.install/_attribute :db.part/db}

;;\"Policy\",\"Issues\",\"[nvarchar](MAX)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Policy/Issues
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"Policy.Issues\"
:alexa.entity-type :et-Policy
:db.install/_attribute :db.part/db}

;;\"Policy\",\"Keywords\",\"[nvarchar](1024)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Policy/Keywords
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"Policy.Keywords\"
:alexa.entity-type :et-Policy
:db.install/_attribute :db.part/db}

;;\"Policy\",\"ModifiedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Policy/ModifiedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"Policy.ModifiedOn\"
:alexa.entity-type :et-Policy
:db.install/_attribute :db.part/db}

;;\"Policy\",\"Name\",\"[nvarchar](256)\",\"NOT NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Policy/Name
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"Policy.Name\"
:alexa.entity-type :et-Policy
:db.install/_attribute :db.part/db}

;;\"Policy\",\"NextReviewOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Policy/NextReviewOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"Policy.NextReviewOn\"
:alexa.entity-type :et-Policy
:db.install/_attribute :db.part/db}

;;\"Policy\",\"NumberFormat\",\"[nvarchar](50)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Policy/NumberFormat
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"Policy.NumberFormat\"
:alexa.entity-type :et-Policy
:db.install/_attribute :db.part/db}

;;\"Policy\",\"Owner_PersonId\",\"bigint\",\"NOT NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :Policy/Owner_Person
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(Policy Owner_PersonId Person Owner_Person)\"
:alexa.entity-type :et-Policy
:db.install/_attribute :db.part/db}

;;\"Policy\",\"PolicyStatusId\",\"bigint\",\"NOT NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :Policy/PolicyStatus
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(Policy PolicyStatusId PolicyStatus PolicyStatus)\"
:alexa.entity-type :et-Policy
:db.install/_attribute :db.part/db}

;;\"Policy\",\"PolicyTemplateId\",\"bigint\",\"NOT NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :Policy/PolicyTemplate
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(Policy PolicyTemplateId PolicyTemplate PolicyTemplate)\"
:alexa.entity-type :et-Policy
:db.install/_attribute :db.part/db}

;;\"Policy\",\"PolicyTypeId\",\"bigint\",\"NOT NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :Policy/PolicyType
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(Policy PolicyTypeId PolicyType PolicyType)\"
:alexa.entity-type :et-Policy
:db.install/_attribute :db.part/db}

;;\"Policy\",\"Prefix\",\"[nvarchar](50)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Policy/Prefix
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"Policy.Prefix\"
:alexa.entity-type :et-Policy
:db.install/_attribute :db.part/db}

;;\"Policy\",\"RequireAcceptance\",\"bit\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Policy/RequireAcceptance
:db/valueType :db.type/boolean
:db/cardinality :db.cardinality/one
:db/doc \"Policy.RequireAcceptance\"
:alexa.entity-type :et-Policy
:db.install/_attribute :db.part/db}

;;\"Policy\",\"Version\",\"[nvarchar](50)\",\"NOT NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Policy/Version
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"Policy.Version\"
:alexa.entity-type :et-Policy
:db.install/_attribute :db.part/db}

{:db/id #db/id[:db.part/db]
:db/ident :Policy/BusinessUnit
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/many
:db/doc \"(Policy PolicyId PolicyBusinessUnit BusinessUnitId BusinessUnit)\"
:alexa.entity-type :et-Policy
:db.install/_attribute :db.part/db}

]"
"[;;\"PolicyAcceptance\",\"AcceptedBy_PersonId\",\"bigint\",\"NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :PolicyAcceptance/AcceptedBy_Person
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(PolicyAcceptance AcceptedBy_PersonId Person AcceptedBy_Person)\"
:alexa.entity-type :et-PolicyAcceptance
:db.install/_attribute :db.part/db}

;;\"PolicyAcceptance\",\"Comments\",\"[nvarchar](MAX)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :PolicyAcceptance/Comments
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"PolicyAcceptance.Comments\"
:alexa.entity-type :et-PolicyAcceptance
:db.install/_attribute :db.part/db}

;;\"PolicyAcceptance\",\"CreatedOn\",\"datetime\",\"NOT NULL\",\"[DF_PolicyAcceptance_CreatedOn]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :PolicyAcceptance/CreatedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"PolicyAcceptance.CreatedOn\"
:alexa.entity-type :et-PolicyAcceptance
:db.install/_attribute :db.part/db}

;;\"PolicyAcceptance\",\"DeletedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :PolicyAcceptance/DeletedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"PolicyAcceptance.DeletedOn\"
:alexa.entity-type :et-PolicyAcceptance
:db.install/_attribute :db.part/db}

;;\"PolicyAcceptance\",\"EnteredOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :PolicyAcceptance/EnteredOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"PolicyAcceptance.EnteredOn\"
:alexa.entity-type :et-PolicyAcceptance
:db.install/_attribute :db.part/db}

;;\"PolicyAcceptance\",\"Id\",\"bigint\",\"NOT NULL\",\"\",\"IDENTITY\",\"PRIMARY KEY\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :PolicyAcceptance/Id
:db/valueType :db.type/long
:db/cardinality :db.cardinality/one
:db/index true
:db/unique :db.unique/value
:db/doc \"PolicyAcceptance.Id\"
:alexa.entity-type :et-PolicyAcceptance
:db.install/_attribute :db.part/db}

;;\"PolicyAcceptance\",\"ModifiedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :PolicyAcceptance/ModifiedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"PolicyAcceptance.ModifiedOn\"
:alexa.entity-type :et-PolicyAcceptance
:db.install/_attribute :db.part/db}

;;\"PolicyAcceptance\",\"PolicyExceptionRequestId\",\"bigint\",\"NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :PolicyAcceptance/PolicyExceptionRequest
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(PolicyAcceptance PolicyExceptionRequestId PolicyExceptionRequest PolicyExceptionRequest)\"
:alexa.entity-type :et-PolicyAcceptance
:db.install/_attribute :db.part/db}

;;\"PolicyAcceptance\",\"PolicyId\",\"bigint\",\"NOT NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :PolicyAcceptance/Policy
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(PolicyAcceptance PolicyId Policy Policy)\"
:alexa.entity-type :et-PolicyAcceptance
:db.install/_attribute :db.part/db}

]"
"[;;\"PolicyExceptionRequest\",\"Comments\",\"[nvarchar](MAX)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :PolicyExceptionRequest/Comments
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"PolicyExceptionRequest.Comments\"
:alexa.entity-type :et-PolicyExceptionRequest
:db.install/_attribute :db.part/db}

;;\"PolicyExceptionRequest\",\"CompensatingControls\",\"[nvarchar](MAX)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :PolicyExceptionRequest/CompensatingControls
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"PolicyExceptionRequest.CompensatingControls\"
:alexa.entity-type :et-PolicyExceptionRequest
:db.install/_attribute :db.part/db}

;;\"PolicyExceptionRequest\",\"CreatedOn\",\"datetime\",\"NOT NULL\",\"[DF_PolicyExceptionRequest_CreatedOn]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :PolicyExceptionRequest/CreatedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"PolicyExceptionRequest.CreatedOn\"
:alexa.entity-type :et-PolicyExceptionRequest
:db.install/_attribute :db.part/db}

;;\"PolicyExceptionRequest\",\"DeletedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :PolicyExceptionRequest/DeletedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"PolicyExceptionRequest.DeletedOn\"
:alexa.entity-type :et-PolicyExceptionRequest
:db.install/_attribute :db.part/db}

;;\"PolicyExceptionRequest\",\"ExpiresOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :PolicyExceptionRequest/ExpiresOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"PolicyExceptionRequest.ExpiresOn\"
:alexa.entity-type :et-PolicyExceptionRequest
:db.install/_attribute :db.part/db}

;;\"PolicyExceptionRequest\",\"Explanation\",\"[nvarchar](MAX)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :PolicyExceptionRequest/Explanation
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"PolicyExceptionRequest.Explanation\"
:alexa.entity-type :et-PolicyExceptionRequest
:db.install/_attribute :db.part/db}

;;\"PolicyExceptionRequest\",\"Id\",\"bigint\",\"NOT NULL\",\"\",\"IDENTITY\",\"PRIMARY KEY\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :PolicyExceptionRequest/Id
:db/valueType :db.type/long
:db/cardinality :db.cardinality/one
:db/index true
:db/unique :db.unique/value
:db/doc \"PolicyExceptionRequest.Id\"
:alexa.entity-type :et-PolicyExceptionRequest
:db.install/_attribute :db.part/db}

;;\"PolicyExceptionRequest\",\"ModifiedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :PolicyExceptionRequest/ModifiedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"PolicyExceptionRequest.ModifiedOn\"
:alexa.entity-type :et-PolicyExceptionRequest
:db.install/_attribute :db.part/db}

;;\"PolicyExceptionRequest\",\"PolicyExceptionRequestStatusId\",\"bigint\",\"NOT NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :PolicyExceptionRequest/PolicyExceptionRequestStatus
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(PolicyExceptionRequest PolicyExceptionRequestStatusId PolicyExceptionRequestStatus PolicyExceptionRequestStatus)\"
:alexa.entity-type :et-PolicyExceptionRequest
:db.install/_attribute :db.part/db}

;;\"PolicyExceptionRequest\",\"PolicyId\",\"bigint\",\"NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :PolicyExceptionRequest/Policy
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(PolicyExceptionRequest PolicyId Policy Policy)\"
:alexa.entity-type :et-PolicyExceptionRequest
:db.install/_attribute :db.part/db}

;;\"PolicyExceptionRequest\",\"SubmittedBy_PersonId\",\"bigint\",\"NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :PolicyExceptionRequest/SubmittedBy_Person
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(PolicyExceptionRequest SubmittedBy_PersonId Person SubmittedBy_Person)\"
:alexa.entity-type :et-PolicyExceptionRequest
:db.install/_attribute :db.part/db}

;;\"PolicyExceptionRequest\",\"SubmittedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :PolicyExceptionRequest/SubmittedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"PolicyExceptionRequest.SubmittedOn\"
:alexa.entity-type :et-PolicyExceptionRequest
:db.install/_attribute :db.part/db}

]"
"[;;\"PolicyExceptionRequestStatus\",\"BackColorName\",\"[nvarchar](50)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :PolicyExceptionRequestStatus/BackColorName
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"PolicyExceptionRequestStatus.BackColorName\"
:alexa.entity-type :et-PolicyExceptionRequestStatus
:db.install/_attribute :db.part/db}

;;\"PolicyExceptionRequestStatus\",\"CreatedOn\",\"datetime\",\"NOT NULL\",\"[DF_PolicyExceptionRequestStatus_CreatedOn]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :PolicyExceptionRequestStatus/CreatedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"PolicyExceptionRequestStatus.CreatedOn\"
:alexa.entity-type :et-PolicyExceptionRequestStatus
:db.install/_attribute :db.part/db}

;;\"PolicyExceptionRequestStatus\",\"DeletedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :PolicyExceptionRequestStatus/DeletedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"PolicyExceptionRequestStatus.DeletedOn\"
:alexa.entity-type :et-PolicyExceptionRequestStatus
:db.install/_attribute :db.part/db}

;;\"PolicyExceptionRequestStatus\",\"Description\",\"[nvarchar](1024)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :PolicyExceptionRequestStatus/Description
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"PolicyExceptionRequestStatus.Description\"
:alexa.entity-type :et-PolicyExceptionRequestStatus
:db.install/_attribute :db.part/db}

;;\"PolicyExceptionRequestStatus\",\"ForeColorName\",\"[nvarchar](50)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :PolicyExceptionRequestStatus/ForeColorName
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"PolicyExceptionRequestStatus.ForeColorName\"
:alexa.entity-type :et-PolicyExceptionRequestStatus
:db.install/_attribute :db.part/db}

;;\"PolicyExceptionRequestStatus\",\"Id\",\"bigint\",\"NOT NULL\",\"\",\"IDENTITY\",\"PRIMARY KEY\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :PolicyExceptionRequestStatus/Id
:db/valueType :db.type/long
:db/cardinality :db.cardinality/one
:db/index true
:db/unique :db.unique/value
:db/doc \"PolicyExceptionRequestStatus.Id\"
:alexa.entity-type :et-PolicyExceptionRequestStatus
:db.install/_attribute :db.part/db}

;;\"PolicyExceptionRequestStatus\",\"ModifiedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :PolicyExceptionRequestStatus/ModifiedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"PolicyExceptionRequestStatus.ModifiedOn\"
:alexa.entity-type :et-PolicyExceptionRequestStatus
:db.install/_attribute :db.part/db}

;;\"PolicyExceptionRequestStatus\",\"Name\",\"[nvarchar](256)\",\"NOT NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :PolicyExceptionRequestStatus/Name
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"PolicyExceptionRequestStatus.Name\"
:alexa.entity-type :et-PolicyExceptionRequestStatus
:db.install/_attribute :db.part/db}

]"
"[;;\"PolicyPublishEvent\",\"Comments\",\"[nvarchar](MAX)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :PolicyPublishEvent/Comments
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"PolicyPublishEvent.Comments\"
:alexa.entity-type :et-PolicyPublishEvent
:db.install/_attribute :db.part/db}

;;\"PolicyPublishEvent\",\"CreatedOn\",\"datetime\",\"NOT NULL\",\"[DF_PolicyPublishEvent_CreatedOn]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :PolicyPublishEvent/CreatedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"PolicyPublishEvent.CreatedOn\"
:alexa.entity-type :et-PolicyPublishEvent
:db.install/_attribute :db.part/db}

;;\"PolicyPublishEvent\",\"DeletedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :PolicyPublishEvent/DeletedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"PolicyPublishEvent.DeletedOn\"
:alexa.entity-type :et-PolicyPublishEvent
:db.install/_attribute :db.part/db}

;;\"PolicyPublishEvent\",\"Id\",\"bigint\",\"NOT NULL\",\"\",\"IDENTITY\",\"PRIMARY KEY\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :PolicyPublishEvent/Id
:db/valueType :db.type/long
:db/cardinality :db.cardinality/one
:db/index true
:db/unique :db.unique/value
:db/doc \"PolicyPublishEvent.Id\"
:alexa.entity-type :et-PolicyPublishEvent
:db.install/_attribute :db.part/db}

;;\"PolicyPublishEvent\",\"IsPublic\",\"bit\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :PolicyPublishEvent/IsPublic
:db/valueType :db.type/boolean
:db/cardinality :db.cardinality/one
:db/doc \"PolicyPublishEvent.IsPublic\"
:alexa.entity-type :et-PolicyPublishEvent
:db.install/_attribute :db.part/db}

;;\"PolicyPublishEvent\",\"ModifiedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :PolicyPublishEvent/ModifiedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"PolicyPublishEvent.ModifiedOn\"
:alexa.entity-type :et-PolicyPublishEvent
:db.install/_attribute :db.part/db}

;;\"PolicyPublishEvent\",\"PDF_DataFileId\",\"bigint\",\"NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :PolicyPublishEvent/PDF_DataFile
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(PolicyPublishEvent PDF_DataFileId DataFile PDF_DataFile)\"
:alexa.entity-type :et-PolicyPublishEvent
:db.install/_attribute :db.part/db}

;;\"PolicyPublishEvent\",\"PersonId\",\"bigint\",\"NOT NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :PolicyPublishEvent/Person
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(PolicyPublishEvent PersonId Person Person)\"
:alexa.entity-type :et-PolicyPublishEvent
:db.install/_attribute :db.part/db}

;;\"PolicyPublishEvent\",\"PolicyHtml\",\"[nvarchar](MAX)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :PolicyPublishEvent/PolicyHtml
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"PolicyPublishEvent.PolicyHtml\"
:alexa.entity-type :et-PolicyPublishEvent
:db.install/_attribute :db.part/db}

;;\"PolicyPublishEvent\",\"PolicyId\",\"bigint\",\"NOT NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :PolicyPublishEvent/Policy
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(PolicyPublishEvent PolicyId Policy Policy)\"
:alexa.entity-type :et-PolicyPublishEvent
:db.install/_attribute :db.part/db}

;;\"PolicyPublishEvent\",\"PolicyStatusId\",\"bigint\",\"NOT NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :PolicyPublishEvent/PolicyStatus
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(PolicyPublishEvent PolicyStatusId PolicyStatus PolicyStatus)\"
:alexa.entity-type :et-PolicyPublishEvent
:db.install/_attribute :db.part/db}

;;\"PolicyPublishEvent\",\"PublishedPolicyName\",\"[nvarchar](256)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :PolicyPublishEvent/PublishedPolicyName
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"PolicyPublishEvent.PublishedPolicyName\"
:alexa.entity-type :et-PolicyPublishEvent
:db.install/_attribute :db.part/db}

;;\"PolicyPublishEvent\",\"Recipients\",\"[varbinary](MAX)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :PolicyPublishEvent/Recipients
:db/valueType :db.type/uri
:db/cardinality :db.cardinality/one
:db/doc \"PolicyPublishEvent.Recipients\"
:alexa.entity-type :et-PolicyPublishEvent
:db.install/_attribute :db.part/db}

]"
"[;;\"PolicyReference\",\"Comments\",\"[nvarchar](1024)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :PolicyReference/Comments
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"PolicyReference.Comments\"
:alexa.entity-type :et-PolicyReference
:db.install/_attribute :db.part/db}

;;\"PolicyReference\",\"CreatedOn\",\"datetime\",\"NOT NULL\",\"[DF_PolicyReference_CreatedOn]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :PolicyReference/CreatedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"PolicyReference.CreatedOn\"
:alexa.entity-type :et-PolicyReference
:db.install/_attribute :db.part/db}

;;\"PolicyReference\",\"DeletedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :PolicyReference/DeletedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"PolicyReference.DeletedOn\"
:alexa.entity-type :et-PolicyReference
:db.install/_attribute :db.part/db}

;;\"PolicyReference\",\"Id\",\"bigint\",\"NOT NULL\",\"\",\"IDENTITY\",\"PRIMARY KEY\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :PolicyReference/Id
:db/valueType :db.type/long
:db/cardinality :db.cardinality/one
:db/index true
:db/unique :db.unique/value
:db/doc \"PolicyReference.Id\"
:alexa.entity-type :et-PolicyReference
:db.install/_attribute :db.part/db}

;;\"PolicyReference\",\"ModifiedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :PolicyReference/ModifiedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"PolicyReference.ModifiedOn\"
:alexa.entity-type :et-PolicyReference
:db.install/_attribute :db.part/db}

;;\"PolicyReference\",\"PolicyId\",\"bigint\",\"NOT NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :PolicyReference/Policy
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(PolicyReference PolicyId Policy Policy)\"
:alexa.entity-type :et-PolicyReference
:db.install/_attribute :db.part/db}

;;\"PolicyReference\",\"ReferenceId\",\"bigint\",\"NOT NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :PolicyReference/Reference
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(PolicyReference ReferenceId Reference Reference)\"
:alexa.entity-type :et-PolicyReference
:db.install/_attribute :db.part/db}

]"
"[;;\"PolicySection\",\"AutoNumber\",\"bit\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :PolicySection/AutoNumber
:db/valueType :db.type/boolean
:db/cardinality :db.cardinality/one
:db/doc \"PolicySection.AutoNumber\"
:alexa.entity-type :et-PolicySection
:db.install/_attribute :db.part/db}

;;\"PolicySection\",\"CreatedOn\",\"datetime\",\"NOT NULL\",\"[DF_PolicySection_CreatedOn]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :PolicySection/CreatedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"PolicySection.CreatedOn\"
:alexa.entity-type :et-PolicySection
:db.install/_attribute :db.part/db}

;;\"PolicySection\",\"DeletedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :PolicySection/DeletedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"PolicySection.DeletedOn\"
:alexa.entity-type :et-PolicySection
:db.install/_attribute :db.part/db}

;;\"PolicySection\",\"Description\",\"[nvarchar](MAX)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :PolicySection/Description
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"PolicySection.Description\"
:alexa.entity-type :et-PolicySection
:db.install/_attribute :db.part/db}

;;\"PolicySection\",\"EditedBy_PersonId\",\"bigint\",\"NOT NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :PolicySection/EditedBy_Person
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(PolicySection EditedBy_PersonId Person EditedBy_Person)\"
:alexa.entity-type :et-PolicySection
:db.install/_attribute :db.part/db}

;;\"PolicySection\",\"Guid\",\"[nvarchar](50)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :PolicySection/Guid
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"PolicySection.Guid\"
:alexa.entity-type :et-PolicySection
:db.install/_attribute :db.part/db}

;;\"PolicySection\",\"HideNumber\",\"bit\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :PolicySection/HideNumber
:db/valueType :db.type/boolean
:db/cardinality :db.cardinality/one
:db/doc \"PolicySection.HideNumber\"
:alexa.entity-type :et-PolicySection
:db.install/_attribute :db.part/db}

;;\"PolicySection\",\"Id\",\"bigint\",\"NOT NULL\",\"\",\"IDENTITY\",\"PRIMARY KEY\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :PolicySection/Id
:db/valueType :db.type/long
:db/cardinality :db.cardinality/one
:db/index true
:db/unique :db.unique/value
:db/doc \"PolicySection.Id\"
:alexa.entity-type :et-PolicySection
:db.install/_attribute :db.part/db}

;;\"PolicySection\",\"Keywords\",\"[nvarchar](1024)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :PolicySection/Keywords
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"PolicySection.Keywords\"
:alexa.entity-type :et-PolicySection
:db.install/_attribute :db.part/db}

;;\"PolicySection\",\"ModifiedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :PolicySection/ModifiedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"PolicySection.ModifiedOn\"
:alexa.entity-type :et-PolicySection
:db.install/_attribute :db.part/db}

;;\"PolicySection\",\"Name\",\"[nvarchar](256)\",\"NOT NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :PolicySection/Name
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"PolicySection.Name\"
:alexa.entity-type :et-PolicySection
:db.install/_attribute :db.part/db}

;;\"PolicySection\",\"Number\",\"[nvarchar](50)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :PolicySection/Number
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"PolicySection.Number\"
:alexa.entity-type :et-PolicySection
:db.install/_attribute :db.part/db}

;;\"PolicySection\",\"ParentId\",\"bigint\",\"NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :PolicySection/Parent
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(PolicySection ParentId PolicySection Parent)\"
:alexa.entity-type :et-PolicySection
:db.install/_attribute :db.part/db}

;;\"PolicySection\",\"PolicyId\",\"bigint\",\"NOT NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :PolicySection/Policy
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(PolicySection PolicyId Policy Policy)\"
:alexa.entity-type :et-PolicySection
:db.install/_attribute :db.part/db}

;;\"PolicySection\",\"SortKey\",\"[nvarchar](50)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :PolicySection/SortKey
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"PolicySection.SortKey\"
:alexa.entity-type :et-PolicySection
:db.install/_attribute :db.part/db}

;;\"PolicySection\",\"UCFControlNumber\",\"[nvarchar](1024)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :PolicySection/UCFControlNumber
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"PolicySection.UCFControlNumber\"
:alexa.entity-type :et-PolicySection
:db.install/_attribute :db.part/db}

]"
"[;;\"PolicySectionPolicySection\",\"Comments\",\"[nvarchar](1024)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :PolicySectionPolicySection/Comments
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"PolicySectionPolicySection.Comments\"
:alexa.entity-type :et-PolicySectionPolicySection
:db.install/_attribute :db.part/db}

;;\"PolicySectionPolicySection\",\"CreatedOn\",\"datetime\",\"NOT NULL\",\"[DF_PolicySectionPolicySection_CreatedOn]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :PolicySectionPolicySection/CreatedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"PolicySectionPolicySection.CreatedOn\"
:alexa.entity-type :et-PolicySectionPolicySection
:db.install/_attribute :db.part/db}

;;\"PolicySectionPolicySection\",\"DeletedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :PolicySectionPolicySection/DeletedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"PolicySectionPolicySection.DeletedOn\"
:alexa.entity-type :et-PolicySectionPolicySection
:db.install/_attribute :db.part/db}

;;\"PolicySectionPolicySection\",\"Id\",\"bigint\",\"NOT NULL\",\"\",\"IDENTITY\",\"PRIMARY KEY\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :PolicySectionPolicySection/Id
:db/valueType :db.type/long
:db/cardinality :db.cardinality/one
:db/index true
:db/unique :db.unique/value
:db/doc \"PolicySectionPolicySection.Id\"
:alexa.entity-type :et-PolicySectionPolicySection
:db.install/_attribute :db.part/db}

;;\"PolicySectionPolicySection\",\"ModifiedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :PolicySectionPolicySection/ModifiedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"PolicySectionPolicySection.ModifiedOn\"
:alexa.entity-type :et-PolicySectionPolicySection
:db.install/_attribute :db.part/db}

;;\"PolicySectionPolicySection\",\"PolicySectionId\",\"bigint\",\"NOT NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :PolicySectionPolicySection/PolicySection
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(PolicySectionPolicySection PolicySectionId PolicySection PolicySection)\"
:alexa.entity-type :et-PolicySectionPolicySection
:db.install/_attribute :db.part/db}

;;\"PolicySectionPolicySection\",\"Related_PolicySectionId\",\"bigint\",\"NOT NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :PolicySectionPolicySection/Related_PolicySection
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(PolicySectionPolicySection Related_PolicySectionId PolicySection Related_PolicySection)\"
:alexa.entity-type :et-PolicySectionPolicySection
:db.install/_attribute :db.part/db}

]"
"[;;\"PolicySectionReference\",\"Comments\",\"[nvarchar](1024)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :PolicySectionReference/Comments
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"PolicySectionReference.Comments\"
:alexa.entity-type :et-PolicySectionReference
:db.install/_attribute :db.part/db}

;;\"PolicySectionReference\",\"CreatedOn\",\"datetime\",\"NOT NULL\",\"[DF_PolicySectionReference_CreatedOn]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :PolicySectionReference/CreatedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"PolicySectionReference.CreatedOn\"
:alexa.entity-type :et-PolicySectionReference
:db.install/_attribute :db.part/db}

;;\"PolicySectionReference\",\"DeletedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :PolicySectionReference/DeletedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"PolicySectionReference.DeletedOn\"
:alexa.entity-type :et-PolicySectionReference
:db.install/_attribute :db.part/db}

;;\"PolicySectionReference\",\"Id\",\"bigint\",\"NOT NULL\",\"\",\"IDENTITY\",\"PRIMARY KEY\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :PolicySectionReference/Id
:db/valueType :db.type/long
:db/cardinality :db.cardinality/one
:db/index true
:db/unique :db.unique/value
:db/doc \"PolicySectionReference.Id\"
:alexa.entity-type :et-PolicySectionReference
:db.install/_attribute :db.part/db}

;;\"PolicySectionReference\",\"ModifiedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :PolicySectionReference/ModifiedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"PolicySectionReference.ModifiedOn\"
:alexa.entity-type :et-PolicySectionReference
:db.install/_attribute :db.part/db}

;;\"PolicySectionReference\",\"PolicySectionId\",\"bigint\",\"NOT NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :PolicySectionReference/PolicySection
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(PolicySectionReference PolicySectionId PolicySection PolicySection)\"
:alexa.entity-type :et-PolicySectionReference
:db.install/_attribute :db.part/db}

;;\"PolicySectionReference\",\"ReferenceId\",\"bigint\",\"NOT NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :PolicySectionReference/Reference
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(PolicySectionReference ReferenceId Reference Reference)\"
:alexa.entity-type :et-PolicySectionReference
:db.install/_attribute :db.part/db}

]"
"[;;\"PolicySectionRole\",\"CreatedOn\",\"datetime\",\"NOT NULL\",\"[DF_PolicySectionRole_CreatedOn]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :PolicySectionRole/CreatedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"PolicySectionRole.CreatedOn\"
:alexa.entity-type :et-PolicySectionRole
:db.install/_attribute :db.part/db}

;;\"PolicySectionRole\",\"DeletedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :PolicySectionRole/DeletedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"PolicySectionRole.DeletedOn\"
:alexa.entity-type :et-PolicySectionRole
:db.install/_attribute :db.part/db}

;;\"PolicySectionRole\",\"Id\",\"bigint\",\"NOT NULL\",\"\",\"IDENTITY\",\"PRIMARY KEY\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :PolicySectionRole/Id
:db/valueType :db.type/long
:db/cardinality :db.cardinality/one
:db/index true
:db/unique :db.unique/value
:db/doc \"PolicySectionRole.Id\"
:alexa.entity-type :et-PolicySectionRole
:db.install/_attribute :db.part/db}

;;\"PolicySectionRole\",\"ModifiedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :PolicySectionRole/ModifiedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"PolicySectionRole.ModifiedOn\"
:alexa.entity-type :et-PolicySectionRole
:db.install/_attribute :db.part/db}

;;\"PolicySectionRole\",\"PolicySectionId\",\"bigint\",\"NOT NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :PolicySectionRole/PolicySection
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(PolicySectionRole PolicySectionId PolicySection PolicySection)\"
:alexa.entity-type :et-PolicySectionRole
:db.install/_attribute :db.part/db}

;;\"PolicySectionRole\",\"PolicyTaskTypeId\",\"bigint\",\"NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :PolicySectionRole/PolicyTaskType
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(PolicySectionRole PolicyTaskTypeId PolicyTaskType PolicyTaskType)\"
:alexa.entity-type :et-PolicySectionRole
:db.install/_attribute :db.part/db}

;;\"PolicySectionRole\",\"RoleId\",\"bigint\",\"NOT NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :PolicySectionRole/Role
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(PolicySectionRole RoleId Role Role)\"
:alexa.entity-type :et-PolicySectionRole
:db.install/_attribute :db.part/db}

]"
"[;;\"PolicySectionStandardComponent\",\"Comments\",\"[nvarchar](1024)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :PolicySectionStandardComponent/Comments
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"PolicySectionStandardComponent.Comments\"
:alexa.entity-type :et-PolicySectionStandardComponent
:db.install/_attribute :db.part/db}

;;\"PolicySectionStandardComponent\",\"CreatedOn\",\"datetime\",\"NOT NULL\",\"[DF_PolicySectionStandardComponent_CreatedOn]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :PolicySectionStandardComponent/CreatedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"PolicySectionStandardComponent.CreatedOn\"
:alexa.entity-type :et-PolicySectionStandardComponent
:db.install/_attribute :db.part/db}

;;\"PolicySectionStandardComponent\",\"DeletedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :PolicySectionStandardComponent/DeletedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"PolicySectionStandardComponent.DeletedOn\"
:alexa.entity-type :et-PolicySectionStandardComponent
:db.install/_attribute :db.part/db}

;;\"PolicySectionStandardComponent\",\"Id\",\"bigint\",\"NOT NULL\",\"\",\"IDENTITY\",\"PRIMARY KEY\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :PolicySectionStandardComponent/Id
:db/valueType :db.type/long
:db/cardinality :db.cardinality/one
:db/index true
:db/unique :db.unique/value
:db/doc \"PolicySectionStandardComponent.Id\"
:alexa.entity-type :et-PolicySectionStandardComponent
:db.install/_attribute :db.part/db}

;;\"PolicySectionStandardComponent\",\"ModifiedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :PolicySectionStandardComponent/ModifiedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"PolicySectionStandardComponent.ModifiedOn\"
:alexa.entity-type :et-PolicySectionStandardComponent
:db.install/_attribute :db.part/db}

;;\"PolicySectionStandardComponent\",\"PolicySectionId\",\"bigint\",\"NOT NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :PolicySectionStandardComponent/PolicySection
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(PolicySectionStandardComponent PolicySectionId PolicySection PolicySection)\"
:alexa.entity-type :et-PolicySectionStandardComponent
:db.install/_attribute :db.part/db}

;;\"PolicySectionStandardComponent\",\"StandardComponentId\",\"bigint\",\"NOT NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :PolicySectionStandardComponent/StandardComponent
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(PolicySectionStandardComponent StandardComponentId StandardComponent StandardComponent)\"
:alexa.entity-type :et-PolicySectionStandardComponent
:db.install/_attribute :db.part/db}

]"
"[;;\"PolicySectionText\",\"Comments\",\"[nvarchar](MAX)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :PolicySectionText/Comments
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"PolicySectionText.Comments\"
:alexa.entity-type :et-PolicySectionText
:db.install/_attribute :db.part/db}

;;\"PolicySectionText\",\"CreatedOn\",\"datetime\",\"NOT NULL\",\"[DF_PolicySectionText_CreatedOn]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :PolicySectionText/CreatedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"PolicySectionText.CreatedOn\"
:alexa.entity-type :et-PolicySectionText
:db.install/_attribute :db.part/db}

;;\"PolicySectionText\",\"DeletedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :PolicySectionText/DeletedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"PolicySectionText.DeletedOn\"
:alexa.entity-type :et-PolicySectionText
:db.install/_attribute :db.part/db}

;;\"PolicySectionText\",\"EnteredBy_PersonId\",\"bigint\",\"NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :PolicySectionText/EnteredBy_Person
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(PolicySectionText EnteredBy_PersonId Person EnteredBy_Person)\"
:alexa.entity-type :et-PolicySectionText
:db.install/_attribute :db.part/db}

;;\"PolicySectionText\",\"EnteredOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :PolicySectionText/EnteredOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"PolicySectionText.EnteredOn\"
:alexa.entity-type :et-PolicySectionText
:db.install/_attribute :db.part/db}

;;\"PolicySectionText\",\"Id\",\"bigint\",\"NOT NULL\",\"\",\"IDENTITY\",\"PRIMARY KEY\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :PolicySectionText/Id
:db/valueType :db.type/long
:db/cardinality :db.cardinality/one
:db/index true
:db/unique :db.unique/value
:db/doc \"PolicySectionText.Id\"
:alexa.entity-type :et-PolicySectionText
:db.install/_attribute :db.part/db}

;;\"PolicySectionText\",\"ModifiedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :PolicySectionText/ModifiedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"PolicySectionText.ModifiedOn\"
:alexa.entity-type :et-PolicySectionText
:db.install/_attribute :db.part/db}

;;\"PolicySectionText\",\"PolicySectionId\",\"bigint\",\"NOT NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :PolicySectionText/PolicySection
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(PolicySectionText PolicySectionId PolicySection PolicySection)\"
:alexa.entity-type :et-PolicySectionText
:db.install/_attribute :db.part/db}

;;\"PolicySectionText\",\"Text\",\"[nvarchar](MAX)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :PolicySectionText/Text
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"PolicySectionText.Text\"
:alexa.entity-type :et-PolicySectionText
:db.install/_attribute :db.part/db}

]"
"[;;\"PolicyStandardComponent\",\"Comments\",\"[nvarchar](1024)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :PolicyStandardComponent/Comments
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"PolicyStandardComponent.Comments\"
:alexa.entity-type :et-PolicyStandardComponent
:db.install/_attribute :db.part/db}

;;\"PolicyStandardComponent\",\"CreatedOn\",\"datetime\",\"NOT NULL\",\"[DF_PolicyStandardComponent_CreatedOn]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :PolicyStandardComponent/CreatedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"PolicyStandardComponent.CreatedOn\"
:alexa.entity-type :et-PolicyStandardComponent
:db.install/_attribute :db.part/db}

;;\"PolicyStandardComponent\",\"DeletedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :PolicyStandardComponent/DeletedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"PolicyStandardComponent.DeletedOn\"
:alexa.entity-type :et-PolicyStandardComponent
:db.install/_attribute :db.part/db}

;;\"PolicyStandardComponent\",\"Id\",\"bigint\",\"NOT NULL\",\"\",\"IDENTITY\",\"PRIMARY KEY\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :PolicyStandardComponent/Id
:db/valueType :db.type/long
:db/cardinality :db.cardinality/one
:db/index true
:db/unique :db.unique/value
:db/doc \"PolicyStandardComponent.Id\"
:alexa.entity-type :et-PolicyStandardComponent
:db.install/_attribute :db.part/db}

;;\"PolicyStandardComponent\",\"ModifiedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :PolicyStandardComponent/ModifiedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"PolicyStandardComponent.ModifiedOn\"
:alexa.entity-type :et-PolicyStandardComponent
:db.install/_attribute :db.part/db}

;;\"PolicyStandardComponent\",\"PolicyId\",\"bigint\",\"NOT NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :PolicyStandardComponent/Policy
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(PolicyStandardComponent PolicyId Policy Policy)\"
:alexa.entity-type :et-PolicyStandardComponent
:db.install/_attribute :db.part/db}

;;\"PolicyStandardComponent\",\"StandardComponentId\",\"bigint\",\"NOT NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :PolicyStandardComponent/StandardComponent
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(PolicyStandardComponent StandardComponentId StandardComponent StandardComponent)\"
:alexa.entity-type :et-PolicyStandardComponent
:db.install/_attribute :db.part/db}

]"
"[;;\"PolicyStatus\",\"BackColorName\",\"[nvarchar](50)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :PolicyStatus/BackColorName
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"PolicyStatus.BackColorName\"
:alexa.entity-type :et-PolicyStatus
:db.install/_attribute :db.part/db}

;;\"PolicyStatus\",\"CreatedOn\",\"datetime\",\"NOT NULL\",\"[DF_PolicyStatus_CreatedOn]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :PolicyStatus/CreatedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"PolicyStatus.CreatedOn\"
:alexa.entity-type :et-PolicyStatus
:db.install/_attribute :db.part/db}

;;\"PolicyStatus\",\"DeletedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :PolicyStatus/DeletedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"PolicyStatus.DeletedOn\"
:alexa.entity-type :et-PolicyStatus
:db.install/_attribute :db.part/db}

;;\"PolicyStatus\",\"Description\",\"[nvarchar](1024)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :PolicyStatus/Description
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"PolicyStatus.Description\"
:alexa.entity-type :et-PolicyStatus
:db.install/_attribute :db.part/db}

;;\"PolicyStatus\",\"ForeColorName\",\"[nvarchar](50)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :PolicyStatus/ForeColorName
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"PolicyStatus.ForeColorName\"
:alexa.entity-type :et-PolicyStatus
:db.install/_attribute :db.part/db}

;;\"PolicyStatus\",\"Id\",\"bigint\",\"NOT NULL\",\"\",\"IDENTITY\",\"PRIMARY KEY\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :PolicyStatus/Id
:db/valueType :db.type/long
:db/cardinality :db.cardinality/one
:db/index true
:db/unique :db.unique/value
:db/doc \"PolicyStatus.Id\"
:alexa.entity-type :et-PolicyStatus
:db.install/_attribute :db.part/db}

;;\"PolicyStatus\",\"ModifiedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :PolicyStatus/ModifiedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"PolicyStatus.ModifiedOn\"
:alexa.entity-type :et-PolicyStatus
:db.install/_attribute :db.part/db}

;;\"PolicyStatus\",\"Name\",\"[nvarchar](256)\",\"NOT NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :PolicyStatus/Name
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"PolicyStatus.Name\"
:alexa.entity-type :et-PolicyStatus
:db.install/_attribute :db.part/db}

]"
"[;;\"PolicyTask\",\"AssignedTo_PersonId\",\"bigint\",\"NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :PolicyTask/AssignedTo_Person
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(PolicyTask AssignedTo_PersonId Person AssignedTo_Person)\"
:alexa.entity-type :et-PolicyTask
:db.install/_attribute :db.part/db}

;;\"PolicyTask\",\"CreatedOn\",\"datetime\",\"NOT NULL\",\"[DF_PolicyTask_CreatedOn]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :PolicyTask/CreatedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"PolicyTask.CreatedOn\"
:alexa.entity-type :et-PolicyTask
:db.install/_attribute :db.part/db}

;;\"PolicyTask\",\"DeletedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :PolicyTask/DeletedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"PolicyTask.DeletedOn\"
:alexa.entity-type :et-PolicyTask
:db.install/_attribute :db.part/db}

;;\"PolicyTask\",\"DueOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :PolicyTask/DueOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"PolicyTask.DueOn\"
:alexa.entity-type :et-PolicyTask
:db.install/_attribute :db.part/db}

;;\"PolicyTask\",\"Guid\",\"[nvarchar](50)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :PolicyTask/Guid
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"PolicyTask.Guid\"
:alexa.entity-type :et-PolicyTask
:db.install/_attribute :db.part/db}

;;\"PolicyTask\",\"Id\",\"bigint\",\"NOT NULL\",\"\",\"IDENTITY\",\"PRIMARY KEY\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :PolicyTask/Id
:db/valueType :db.type/long
:db/cardinality :db.cardinality/one
:db/index true
:db/unique :db.unique/value
:db/doc \"PolicyTask.Id\"
:alexa.entity-type :et-PolicyTask
:db.install/_attribute :db.part/db}

;;\"PolicyTask\",\"ModifiedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :PolicyTask/ModifiedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"PolicyTask.ModifiedOn\"
:alexa.entity-type :et-PolicyTask
:db.install/_attribute :db.part/db}

;;\"PolicyTask\",\"PolicyId\",\"bigint\",\"NOT NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :PolicyTask/Policy
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(PolicyTask PolicyId Policy Policy)\"
:alexa.entity-type :et-PolicyTask
:db.install/_attribute :db.part/db}

;;\"PolicyTask\",\"PolicySectionId\",\"bigint\",\"NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :PolicyTask/PolicySection
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(PolicyTask PolicySectionId PolicySection PolicySection)\"
:alexa.entity-type :et-PolicyTask
:db.install/_attribute :db.part/db}

;;\"PolicyTask\",\"PolicySectionTextId\",\"bigint\",\"NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :PolicyTask/PolicySectionText
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(PolicyTask PolicySectionTextId PolicySectionText PolicySectionText)\"
:alexa.entity-type :et-PolicyTask
:db.install/_attribute :db.part/db}

;;\"PolicyTask\",\"PolicyTaskTypeId\",\"bigint\",\"NOT NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :PolicyTask/PolicyTaskType
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(PolicyTask PolicyTaskTypeId PolicyTaskType PolicyTaskType)\"
:alexa.entity-type :et-PolicyTask
:db.install/_attribute :db.part/db}

;;\"PolicyTask\",\"Round\",\"[nvarchar](50)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :PolicyTask/Round
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"PolicyTask.Round\"
:alexa.entity-type :et-PolicyTask
:db.install/_attribute :db.part/db}

{:db/id #db/id[:db.part/db]
:db/ident :PolicyTask/Notification
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/many
:db/doc \"(PolicyTask PolicyTaskId PolicyTaskNotification NotificationId Notification)\"
:alexa.entity-type :et-PolicyTask
:db.install/_attribute :db.part/db}

]"
"[;;\"PolicyTaskEvent\",\"Actor_PersonId\",\"bigint\",\"NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :PolicyTaskEvent/Actor_Person
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(PolicyTaskEvent Actor_PersonId Person Actor_Person)\"
:alexa.entity-type :et-PolicyTaskEvent
:db.install/_attribute :db.part/db}

;;\"PolicyTaskEvent\",\"Comments\",\"[nvarchar](MAX)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :PolicyTaskEvent/Comments
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"PolicyTaskEvent.Comments\"
:alexa.entity-type :et-PolicyTaskEvent
:db.install/_attribute :db.part/db}

;;\"PolicyTaskEvent\",\"CreatedOn\",\"datetime\",\"NOT NULL\",\"[DF_PolicyTaskEvent_CreatedOn]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :PolicyTaskEvent/CreatedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"PolicyTaskEvent.CreatedOn\"
:alexa.entity-type :et-PolicyTaskEvent
:db.install/_attribute :db.part/db}

;;\"PolicyTaskEvent\",\"DeletedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :PolicyTaskEvent/DeletedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"PolicyTaskEvent.DeletedOn\"
:alexa.entity-type :et-PolicyTaskEvent
:db.install/_attribute :db.part/db}

;;\"PolicyTaskEvent\",\"Id\",\"bigint\",\"NOT NULL\",\"\",\"IDENTITY\",\"PRIMARY KEY\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :PolicyTaskEvent/Id
:db/valueType :db.type/long
:db/cardinality :db.cardinality/one
:db/index true
:db/unique :db.unique/value
:db/doc \"PolicyTaskEvent.Id\"
:alexa.entity-type :et-PolicyTaskEvent
:db.install/_attribute :db.part/db}

;;\"PolicyTaskEvent\",\"ModifiedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :PolicyTaskEvent/ModifiedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"PolicyTaskEvent.ModifiedOn\"
:alexa.entity-type :et-PolicyTaskEvent
:db.install/_attribute :db.part/db}

;;\"PolicyTaskEvent\",\"PolicySectionTextId\",\"bigint\",\"NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :PolicyTaskEvent/PolicySectionText
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(PolicyTaskEvent PolicySectionTextId PolicySectionText PolicySectionText)\"
:alexa.entity-type :et-PolicyTaskEvent
:db.install/_attribute :db.part/db}

;;\"PolicyTaskEvent\",\"PolicyTaskId\",\"bigint\",\"NOT NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :PolicyTaskEvent/PolicyTask
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(PolicyTaskEvent PolicyTaskId PolicyTask PolicyTask)\"
:alexa.entity-type :et-PolicyTaskEvent
:db.install/_attribute :db.part/db}

;;\"PolicyTaskEvent\",\"PolicyTaskOutcomeId\",\"bigint\",\"NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :PolicyTaskEvent/PolicyTaskOutcome
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(PolicyTaskEvent PolicyTaskOutcomeId PolicyTaskOutcome PolicyTaskOutcome)\"
:alexa.entity-type :et-PolicyTaskEvent
:db.install/_attribute :db.part/db}

;;\"PolicyTaskEvent\",\"PolicyTaskStatusId\",\"bigint\",\"NOT NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :PolicyTaskEvent/PolicyTaskStatus
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(PolicyTaskEvent PolicyTaskStatusId PolicyTaskStatus PolicyTaskStatus)\"
:alexa.entity-type :et-PolicyTaskEvent
:db.install/_attribute :db.part/db}

]"
"[;;\"PolicyTaskOutcome\",\"BackColorName\",\"[nvarchar](50)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :PolicyTaskOutcome/BackColorName
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"PolicyTaskOutcome.BackColorName\"
:alexa.entity-type :et-PolicyTaskOutcome
:db.install/_attribute :db.part/db}

;;\"PolicyTaskOutcome\",\"CommentsRequired\",\"bit\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :PolicyTaskOutcome/CommentsRequired
:db/valueType :db.type/boolean
:db/cardinality :db.cardinality/one
:db/doc \"PolicyTaskOutcome.CommentsRequired\"
:alexa.entity-type :et-PolicyTaskOutcome
:db.install/_attribute :db.part/db}

;;\"PolicyTaskOutcome\",\"CreatedOn\",\"datetime\",\"NOT NULL\",\"[DF_PolicyTaskOutcome_CreatedOn]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :PolicyTaskOutcome/CreatedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"PolicyTaskOutcome.CreatedOn\"
:alexa.entity-type :et-PolicyTaskOutcome
:db.install/_attribute :db.part/db}

;;\"PolicyTaskOutcome\",\"DeletedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :PolicyTaskOutcome/DeletedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"PolicyTaskOutcome.DeletedOn\"
:alexa.entity-type :et-PolicyTaskOutcome
:db.install/_attribute :db.part/db}

;;\"PolicyTaskOutcome\",\"Description\",\"[nvarchar](1024)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :PolicyTaskOutcome/Description
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"PolicyTaskOutcome.Description\"
:alexa.entity-type :et-PolicyTaskOutcome
:db.install/_attribute :db.part/db}

;;\"PolicyTaskOutcome\",\"ForeColorName\",\"[nvarchar](50)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :PolicyTaskOutcome/ForeColorName
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"PolicyTaskOutcome.ForeColorName\"
:alexa.entity-type :et-PolicyTaskOutcome
:db.install/_attribute :db.part/db}

;;\"PolicyTaskOutcome\",\"Id\",\"bigint\",\"NOT NULL\",\"\",\"IDENTITY\",\"PRIMARY KEY\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :PolicyTaskOutcome/Id
:db/valueType :db.type/long
:db/cardinality :db.cardinality/one
:db/index true
:db/unique :db.unique/value
:db/doc \"PolicyTaskOutcome.Id\"
:alexa.entity-type :et-PolicyTaskOutcome
:db.install/_attribute :db.part/db}

;;\"PolicyTaskOutcome\",\"ModifiedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :PolicyTaskOutcome/ModifiedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"PolicyTaskOutcome.ModifiedOn\"
:alexa.entity-type :et-PolicyTaskOutcome
:db.install/_attribute :db.part/db}

;;\"PolicyTaskOutcome\",\"Name\",\"[nvarchar](256)\",\"NOT NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :PolicyTaskOutcome/Name
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"PolicyTaskOutcome.Name\"
:alexa.entity-type :et-PolicyTaskOutcome
:db.install/_attribute :db.part/db}

;;\"PolicyTaskOutcome\",\"PolicyTaskTypeId\",\"bigint\",\"NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :PolicyTaskOutcome/PolicyTaskType
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(PolicyTaskOutcome PolicyTaskTypeId PolicyTaskType PolicyTaskType)\"
:alexa.entity-type :et-PolicyTaskOutcome
:db.install/_attribute :db.part/db}

]"
"[;;\"PolicyTaskStatus\",\"BackColorName\",\"[nvarchar](50)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :PolicyTaskStatus/BackColorName
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"PolicyTaskStatus.BackColorName\"
:alexa.entity-type :et-PolicyTaskStatus
:db.install/_attribute :db.part/db}

;;\"PolicyTaskStatus\",\"CreatedOn\",\"datetime\",\"NOT NULL\",\"[DF_PolicyTaskStatus_CreatedOn]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :PolicyTaskStatus/CreatedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"PolicyTaskStatus.CreatedOn\"
:alexa.entity-type :et-PolicyTaskStatus
:db.install/_attribute :db.part/db}

;;\"PolicyTaskStatus\",\"DeletedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :PolicyTaskStatus/DeletedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"PolicyTaskStatus.DeletedOn\"
:alexa.entity-type :et-PolicyTaskStatus
:db.install/_attribute :db.part/db}

;;\"PolicyTaskStatus\",\"Description\",\"[nvarchar](1024)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :PolicyTaskStatus/Description
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"PolicyTaskStatus.Description\"
:alexa.entity-type :et-PolicyTaskStatus
:db.install/_attribute :db.part/db}

;;\"PolicyTaskStatus\",\"ForeColorName\",\"[nvarchar](50)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :PolicyTaskStatus/ForeColorName
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"PolicyTaskStatus.ForeColorName\"
:alexa.entity-type :et-PolicyTaskStatus
:db.install/_attribute :db.part/db}

;;\"PolicyTaskStatus\",\"Id\",\"bigint\",\"NOT NULL\",\"\",\"IDENTITY\",\"PRIMARY KEY\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :PolicyTaskStatus/Id
:db/valueType :db.type/long
:db/cardinality :db.cardinality/one
:db/index true
:db/unique :db.unique/value
:db/doc \"PolicyTaskStatus.Id\"
:alexa.entity-type :et-PolicyTaskStatus
:db.install/_attribute :db.part/db}

;;\"PolicyTaskStatus\",\"ModifiedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :PolicyTaskStatus/ModifiedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"PolicyTaskStatus.ModifiedOn\"
:alexa.entity-type :et-PolicyTaskStatus
:db.install/_attribute :db.part/db}

;;\"PolicyTaskStatus\",\"Name\",\"[nvarchar](256)\",\"NOT NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :PolicyTaskStatus/Name
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"PolicyTaskStatus.Name\"
:alexa.entity-type :et-PolicyTaskStatus
:db.install/_attribute :db.part/db}

]"
"[;;\"PolicyTaskType\",\"CreatedOn\",\"datetime\",\"NOT NULL\",\"[DF_PolicyTaskType_CreatedOn]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :PolicyTaskType/CreatedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"PolicyTaskType.CreatedOn\"
:alexa.entity-type :et-PolicyTaskType
:db.install/_attribute :db.part/db}

;;\"PolicyTaskType\",\"DeletedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :PolicyTaskType/DeletedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"PolicyTaskType.DeletedOn\"
:alexa.entity-type :et-PolicyTaskType
:db.install/_attribute :db.part/db}

;;\"PolicyTaskType\",\"Description\",\"[nvarchar](1024)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :PolicyTaskType/Description
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"PolicyTaskType.Description\"
:alexa.entity-type :et-PolicyTaskType
:db.install/_attribute :db.part/db}

;;\"PolicyTaskType\",\"Id\",\"bigint\",\"NOT NULL\",\"\",\"IDENTITY\",\"PRIMARY KEY\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :PolicyTaskType/Id
:db/valueType :db.type/long
:db/cardinality :db.cardinality/one
:db/index true
:db/unique :db.unique/value
:db/doc \"PolicyTaskType.Id\"
:alexa.entity-type :et-PolicyTaskType
:db.install/_attribute :db.part/db}

;;\"PolicyTaskType\",\"ModifiedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :PolicyTaskType/ModifiedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"PolicyTaskType.ModifiedOn\"
:alexa.entity-type :et-PolicyTaskType
:db.install/_attribute :db.part/db}

;;\"PolicyTaskType\",\"Name\",\"[nvarchar](256)\",\"NOT NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :PolicyTaskType/Name
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"PolicyTaskType.Name\"
:alexa.entity-type :et-PolicyTaskType
:db.install/_attribute :db.part/db}

]"
"[;;\"PolicyTemplate\",\"CreatedBy_PersonId\",\"bigint\",\"NOT NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :PolicyTemplate/CreatedBy_Person
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(PolicyTemplate CreatedBy_PersonId Person CreatedBy_Person)\"
:alexa.entity-type :et-PolicyTemplate
:db.install/_attribute :db.part/db}

;;\"PolicyTemplate\",\"CreatedOn\",\"datetime\",\"NOT NULL\",\"[DF_PolicyTemplate_CreatedOn]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :PolicyTemplate/CreatedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"PolicyTemplate.CreatedOn\"
:alexa.entity-type :et-PolicyTemplate
:db.install/_attribute :db.part/db}

;;\"PolicyTemplate\",\"Data\",\"[varbinary](MAX)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :PolicyTemplate/Data
:db/valueType :db.type/uri
:db/cardinality :db.cardinality/one
:db/doc \"PolicyTemplate.Data\"
:alexa.entity-type :et-PolicyTemplate
:db.install/_attribute :db.part/db}

;;\"PolicyTemplate\",\"DeletedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :PolicyTemplate/DeletedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"PolicyTemplate.DeletedOn\"
:alexa.entity-type :et-PolicyTemplate
:db.install/_attribute :db.part/db}

;;\"PolicyTemplate\",\"Description\",\"[nvarchar](1024)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :PolicyTemplate/Description
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"PolicyTemplate.Description\"
:alexa.entity-type :et-PolicyTemplate
:db.install/_attribute :db.part/db}

;;\"PolicyTemplate\",\"FooterHTML\",\"[nvarchar](MAX)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :PolicyTemplate/FooterHTML
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"PolicyTemplate.FooterHTML\"
:alexa.entity-type :et-PolicyTemplate
:db.install/_attribute :db.part/db}

;;\"PolicyTemplate\",\"HeaderHTML\",\"[nvarchar](MAX)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :PolicyTemplate/HeaderHTML
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"PolicyTemplate.HeaderHTML\"
:alexa.entity-type :et-PolicyTemplate
:db.install/_attribute :db.part/db}

;;\"PolicyTemplate\",\"Id\",\"bigint\",\"NOT NULL\",\"\",\"IDENTITY\",\"PRIMARY KEY\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :PolicyTemplate/Id
:db/valueType :db.type/long
:db/cardinality :db.cardinality/one
:db/index true
:db/unique :db.unique/value
:db/doc \"PolicyTemplate.Id\"
:alexa.entity-type :et-PolicyTemplate
:db.install/_attribute :db.part/db}

;;\"PolicyTemplate\",\"ModifiedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :PolicyTemplate/ModifiedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"PolicyTemplate.ModifiedOn\"
:alexa.entity-type :et-PolicyTemplate
:db.install/_attribute :db.part/db}

;;\"PolicyTemplate\",\"Name\",\"[nvarchar](256)\",\"NOT NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :PolicyTemplate/Name
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"PolicyTemplate.Name\"
:alexa.entity-type :et-PolicyTemplate
:db.install/_attribute :db.part/db}

]"
"[;;\"PolicyType\",\"CreatedOn\",\"datetime\",\"NOT NULL\",\"[DF_PolicyType_CreatedOn]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :PolicyType/CreatedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"PolicyType.CreatedOn\"
:alexa.entity-type :et-PolicyType
:db.install/_attribute :db.part/db}

;;\"PolicyType\",\"DeletedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :PolicyType/DeletedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"PolicyType.DeletedOn\"
:alexa.entity-type :et-PolicyType
:db.install/_attribute :db.part/db}

;;\"PolicyType\",\"Description\",\"[nvarchar](1024)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :PolicyType/Description
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"PolicyType.Description\"
:alexa.entity-type :et-PolicyType
:db.install/_attribute :db.part/db}

;;\"PolicyType\",\"Id\",\"bigint\",\"NOT NULL\",\"\",\"IDENTITY\",\"PRIMARY KEY\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :PolicyType/Id
:db/valueType :db.type/long
:db/cardinality :db.cardinality/one
:db/index true
:db/unique :db.unique/value
:db/doc \"PolicyType.Id\"
:alexa.entity-type :et-PolicyType
:db.install/_attribute :db.part/db}

;;\"PolicyType\",\"ModifiedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :PolicyType/ModifiedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"PolicyType.ModifiedOn\"
:alexa.entity-type :et-PolicyType
:db.install/_attribute :db.part/db}

;;\"PolicyType\",\"Name\",\"[nvarchar](256)\",\"NOT NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :PolicyType/Name
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"PolicyType.Name\"
:alexa.entity-type :et-PolicyType
:db.install/_attribute :db.part/db}

]"
"[;;\"Priority\",\"BackColorName\",\"[nvarchar](50)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Priority/BackColorName
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"Priority.BackColorName\"
:alexa.entity-type :et-Priority
:db.install/_attribute :db.part/db}

;;\"Priority\",\"CreatedOn\",\"datetime\",\"NOT NULL\",\"[DF_Priority_CreatedOn]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Priority/CreatedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"Priority.CreatedOn\"
:alexa.entity-type :et-Priority
:db.install/_attribute :db.part/db}

;;\"Priority\",\"DeletedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Priority/DeletedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"Priority.DeletedOn\"
:alexa.entity-type :et-Priority
:db.install/_attribute :db.part/db}

;;\"Priority\",\"Description\",\"[nvarchar](1024)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Priority/Description
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"Priority.Description\"
:alexa.entity-type :et-Priority
:db.install/_attribute :db.part/db}

;;\"Priority\",\"FixedEntry\",\"bit\",\"NULL\",\"[DF_Priority_FixedEntry]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Priority/FixedEntry
:db/valueType :db.type/boolean
:db/cardinality :db.cardinality/one
:db/doc \"Priority.FixedEntry\"
:alexa.entity-type :et-Priority
:db.install/_attribute :db.part/db}

;;\"Priority\",\"ForeColorName\",\"[nvarchar](50)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Priority/ForeColorName
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"Priority.ForeColorName\"
:alexa.entity-type :et-Priority
:db.install/_attribute :db.part/db}

;;\"Priority\",\"Id\",\"bigint\",\"NOT NULL\",\"\",\"IDENTITY\",\"PRIMARY KEY\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Priority/Id
:db/valueType :db.type/long
:db/cardinality :db.cardinality/one
:db/index true
:db/unique :db.unique/value
:db/doc \"Priority.Id\"
:alexa.entity-type :et-Priority
:db.install/_attribute :db.part/db}

;;\"Priority\",\"ModifiedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Priority/ModifiedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"Priority.ModifiedOn\"
:alexa.entity-type :et-Priority
:db.install/_attribute :db.part/db}

;;\"Priority\",\"Name\",\"[nvarchar](256)\",\"NOT NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Priority/Name
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"Priority.Name\"
:alexa.entity-type :et-Priority
:db.install/_attribute :db.part/db}

]"
"[;;\"Procedure\",\"BusinessUnitId\",\"bigint\",\"NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :Procedure/BusinessUnit
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(Procedure BusinessUnitId BusinessUnit BusinessUnit)\"
:alexa.entity-type :et-Procedure
:db.install/_attribute :db.part/db}

;;\"Procedure\",\"CreatedOn\",\"datetime\",\"NOT NULL\",\"[DF_Procedure_CreatedOn]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Procedure/CreatedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"Procedure.CreatedOn\"
:alexa.entity-type :et-Procedure
:db.install/_attribute :db.part/db}

;;\"Procedure\",\"DeletedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Procedure/DeletedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"Procedure.DeletedOn\"
:alexa.entity-type :et-Procedure
:db.install/_attribute :db.part/db}

;;\"Procedure\",\"Description\",\"[nvarchar](1024)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Procedure/Description
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"Procedure.Description\"
:alexa.entity-type :et-Procedure
:db.install/_attribute :db.part/db}

;;\"Procedure\",\"Id\",\"bigint\",\"NOT NULL\",\"\",\"IDENTITY\",\"PRIMARY KEY\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Procedure/Id
:db/valueType :db.type/long
:db/cardinality :db.cardinality/one
:db/index true
:db/unique :db.unique/value
:db/doc \"Procedure.Id\"
:alexa.entity-type :et-Procedure
:db.install/_attribute :db.part/db}

;;\"Procedure\",\"ModifiedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Procedure/ModifiedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"Procedure.ModifiedOn\"
:alexa.entity-type :et-Procedure
:db.install/_attribute :db.part/db}

;;\"Procedure\",\"Name\",\"[nvarchar](256)\",\"NOT NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Procedure/Name
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"Procedure.Name\"
:alexa.entity-type :et-Procedure
:db.install/_attribute :db.part/db}

{:db/id #db/id[:db.part/db]
:db/ident :Procedure/DataFile
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/many
:db/doc \"(Procedure ProcedureId ProcedureReference ReferenceId Reference)\"
:alexa.entity-type :et-Procedure
:db.install/_attribute :db.part/db}

]"
"[;;\"Project\",\"CreatedBy_PersonId\",\"bigint\",\"NOT NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :Project/CreatedBy_Person
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(Project CreatedBy_PersonId Person CreatedBy_Person)\"
:alexa.entity-type :et-Project
:db.install/_attribute :db.part/db}

;;\"Project\",\"CreatedOn\",\"datetime\",\"NOT NULL\",\"[DF_AuditProject_CreatedOn]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Project/CreatedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"Project.CreatedOn\"
:alexa.entity-type :et-Project
:db.install/_attribute :db.part/db}

;;\"Project\",\"DeletedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Project/DeletedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"Project.DeletedOn\"
:alexa.entity-type :et-Project
:db.install/_attribute :db.part/db}

;;\"Project\",\"Description\",\"[nvarchar](1024)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Project/Description
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"Project.Description\"
:alexa.entity-type :et-Project
:db.install/_attribute :db.part/db}

;;\"Project\",\"ExpiresOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Project/ExpiresOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"Project.ExpiresOn\"
:alexa.entity-type :et-Project
:db.install/_attribute :db.part/db}

;;\"Project\",\"Id\",\"bigint\",\"NOT NULL\",\"\",\"IDENTITY\",\"PRIMARY KEY\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Project/Id
:db/valueType :db.type/long
:db/cardinality :db.cardinality/one
:db/index true
:db/unique :db.unique/value
:db/doc \"Project.Id\"
:alexa.entity-type :et-Project
:db.install/_attribute :db.part/db}

;;\"Project\",\"IsHistorical\",\"bit\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Project/IsHistorical
:db/valueType :db.type/boolean
:db/cardinality :db.cardinality/one
:db/doc \"Project.IsHistorical\"
:alexa.entity-type :et-Project
:db.install/_attribute :db.part/db}

;;\"Project\",\"ModifiedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Project/ModifiedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"Project.ModifiedOn\"
:alexa.entity-type :et-Project
:db.install/_attribute :db.part/db}

;;\"Project\",\"Name\",\"[nvarchar](256)\",\"NOT NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Project/Name
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"Project.Name\"
:alexa.entity-type :et-Project
:db.install/_attribute :db.part/db}

;;\"Project\",\"ProjectStartDate\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Project/ProjectStartDate
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"Project.ProjectStartDate\"
:alexa.entity-type :et-Project
:db.install/_attribute :db.part/db}

;;\"Project\",\"ProjectTypeId\",\"bigint\",\"NOT NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :Project/ProjectType
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(Project ProjectTypeId ProjectType ProjectType)\"
:alexa.entity-type :et-Project
:db.install/_attribute :db.part/db}

;;\"Project\",\"SortKey\",\"[nvarchar](100)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Project/SortKey
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"Project.SortKey\"
:alexa.entity-type :et-Project
:db.install/_attribute :db.part/db}

;;\"Project\",\"TaskDueDate\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Project/TaskDueDate
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"Project.TaskDueDate\"
:alexa.entity-type :et-Project
:db.install/_attribute :db.part/db}

;;\"Project\",\"TaskNotificationRuleSetId\",\"bigint\",\"NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :Project/TaskNotificationRuleSet
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(Project TaskNotificationRuleSetId NotificationRuleSet TaskNotificationRuleSet)\"
:alexa.entity-type :et-Project
:db.install/_attribute :db.part/db}

;;\"Project\",\"TaskPriorityId\",\"bigint\",\"NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :Project/TaskPriority
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(Project TaskPriorityId Priority TaskPriority)\"
:alexa.entity-type :et-Project
:db.install/_attribute :db.part/db}

{:db/id #db/id[:db.part/db]
:db/ident :Project/Analysis
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/many
:db/doc \"(Project ProjectId AnalysisProject AnalysisId Analysis)\"
:alexa.entity-type :et-Project
:db.install/_attribute :db.part/db}

{:db/id #db/id[:db.part/db]
:db/ident :Project/AuditPlan
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/many
:db/doc \"(Project ProjectId AuditPlanProject AuditPlanId AuditPlan)\"
:alexa.entity-type :et-Project
:db.install/_attribute :db.part/db}

{:db/id #db/id[:db.part/db]
:db/ident :Project/AttributeValue
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/many
:db/doc \"(Project ProjectId ProjectAttributeValue AttributeValueId AttributeValue)\"
:alexa.entity-type :et-Project
:db.install/_attribute :db.part/db}

{:db/id #db/id[:db.part/db]
:db/ident :Project/BusinessUnit
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/many
:db/doc \"(Project ProjectId ProjectBusinessUnit BusinessUnitId BusinessUnit)\"
:alexa.entity-type :et-Project
:db.install/_attribute :db.part/db}

{:db/id #db/id[:db.part/db]
:db/ident :Project/Incident
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/many
:db/doc \"(Project ProjectId ProjectIncident IncidentId Incident)\"
:alexa.entity-type :et-Project
:db.install/_attribute :db.part/db}

{:db/id #db/id[:db.part/db]
:db/ident :Project/DataFile
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/many
:db/doc \"(Project ProjectId ProjectReference ReferenceId Reference)\"
:alexa.entity-type :et-Project
:db.install/_attribute :db.part/db}

{:db/id #db/id[:db.part/db]
:db/ident :Project/Role
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/many
:db/doc \"(Project ProjectId ProjectRole RoleId Role)\"
:alexa.entity-type :et-Project
:db.install/_attribute :db.part/db}

]"
"[;;\"ProjectNotification\",\"CreatedOn\",\"datetime\",\"NOT NULL\",\"[DF_ProjectNotification_CreatedOn]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :ProjectNotification/CreatedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"ProjectNotification.CreatedOn\"
:alexa.entity-type :et-ProjectNotification
:db.install/_attribute :db.part/db}

;;\"ProjectNotification\",\"DeletedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :ProjectNotification/DeletedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"ProjectNotification.DeletedOn\"
:alexa.entity-type :et-ProjectNotification
:db.install/_attribute :db.part/db}

;;\"ProjectNotification\",\"Id\",\"bigint\",\"NOT NULL\",\"\",\"IDENTITY\",\"PRIMARY KEY\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :ProjectNotification/Id
:db/valueType :db.type/long
:db/cardinality :db.cardinality/one
:db/index true
:db/unique :db.unique/value
:db/doc \"ProjectNotification.Id\"
:alexa.entity-type :et-ProjectNotification
:db.install/_attribute :db.part/db}

;;\"ProjectNotification\",\"ModifiedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :ProjectNotification/ModifiedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"ProjectNotification.ModifiedOn\"
:alexa.entity-type :et-ProjectNotification
:db.install/_attribute :db.part/db}

;;\"ProjectNotification\",\"NotificationId\",\"bigint\",\"NOT NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :ProjectNotification/Notification
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(ProjectNotification NotificationId Notification Notification)\"
:alexa.entity-type :et-ProjectNotification
:db.install/_attribute :db.part/db}

;;\"ProjectNotification\",\"NotificationRuleId\",\"bigint\",\"NOT NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :ProjectNotification/NotificationRule
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(ProjectNotification NotificationRuleId NotificationRule NotificationRule)\"
:alexa.entity-type :et-ProjectNotification
:db.install/_attribute :db.part/db}

;;\"ProjectNotification\",\"ProjectId\",\"bigint\",\"NOT NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :ProjectNotification/Project
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(ProjectNotification ProjectId Project Project)\"
:alexa.entity-type :et-ProjectNotification
:db.install/_attribute :db.part/db}

]"
"[;;\"ProjectType\",\"CreatedOn\",\"datetime\",\"NOT NULL\",\"[DF_ProjectType_CreatedOn]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :ProjectType/CreatedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"ProjectType.CreatedOn\"
:alexa.entity-type :et-ProjectType
:db.install/_attribute :db.part/db}

;;\"ProjectType\",\"DeletedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :ProjectType/DeletedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"ProjectType.DeletedOn\"
:alexa.entity-type :et-ProjectType
:db.install/_attribute :db.part/db}

;;\"ProjectType\",\"Description\",\"[nvarchar](1024)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :ProjectType/Description
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"ProjectType.Description\"
:alexa.entity-type :et-ProjectType
:db.install/_attribute :db.part/db}

;;\"ProjectType\",\"Id\",\"bigint\",\"NOT NULL\",\"\",\"IDENTITY\",\"PRIMARY KEY\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :ProjectType/Id
:db/valueType :db.type/long
:db/cardinality :db.cardinality/one
:db/index true
:db/unique :db.unique/value
:db/doc \"ProjectType.Id\"
:alexa.entity-type :et-ProjectType
:db.install/_attribute :db.part/db}

;;\"ProjectType\",\"ModifiedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :ProjectType/ModifiedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"ProjectType.ModifiedOn\"
:alexa.entity-type :et-ProjectType
:db.install/_attribute :db.part/db}

;;\"ProjectType\",\"Name\",\"[nvarchar](256)\",\"NOT NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :ProjectType/Name
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"ProjectType.Name\"
:alexa.entity-type :et-ProjectType
:db.install/_attribute :db.part/db}

]"
"[;;\"Protocol\",\"CreatedOn\",\"datetime\",\"NOT NULL\",\"[DF_Protocol_CreatedOn]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Protocol/CreatedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"Protocol.CreatedOn\"
:alexa.entity-type :et-Protocol
:db.install/_attribute :db.part/db}

;;\"Protocol\",\"DeletedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Protocol/DeletedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"Protocol.DeletedOn\"
:alexa.entity-type :et-Protocol
:db.install/_attribute :db.part/db}

;;\"Protocol\",\"Description\",\"[nvarchar](1024)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Protocol/Description
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"Protocol.Description\"
:alexa.entity-type :et-Protocol
:db.install/_attribute :db.part/db}

;;\"Protocol\",\"Id\",\"bigint\",\"NOT NULL\",\"\",\"IDENTITY\",\"PRIMARY KEY\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Protocol/Id
:db/valueType :db.type/long
:db/cardinality :db.cardinality/one
:db/index true
:db/unique :db.unique/value
:db/doc \"Protocol.Id\"
:alexa.entity-type :et-Protocol
:db.install/_attribute :db.part/db}

;;\"Protocol\",\"ModifiedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Protocol/ModifiedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"Protocol.ModifiedOn\"
:alexa.entity-type :et-Protocol
:db.install/_attribute :db.part/db}

;;\"Protocol\",\"Name\",\"[nvarchar](256)\",\"NOT NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Protocol/Name
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"Protocol.Name\"
:alexa.entity-type :et-Protocol
:db.install/_attribute :db.part/db}

]"
"[;;\"Recurrence\",\"CreatedOn\",\"datetime\",\"NOT NULL\",\"[DF_Recurrence_CreatedOn]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Recurrence/CreatedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"Recurrence.CreatedOn\"
:alexa.entity-type :et-Recurrence
:db.install/_attribute :db.part/db}

;;\"Recurrence\",\"DeletedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Recurrence/DeletedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"Recurrence.DeletedOn\"
:alexa.entity-type :et-Recurrence
:db.install/_attribute :db.part/db}

;;\"Recurrence\",\"Description\",\"[nvarchar](1024)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Recurrence/Description
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"Recurrence.Description\"
:alexa.entity-type :et-Recurrence
:db.install/_attribute :db.part/db}

;;\"Recurrence\",\"Id\",\"bigint\",\"NOT NULL\",\"\",\"IDENTITY\",\"PRIMARY KEY\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Recurrence/Id
:db/valueType :db.type/long
:db/cardinality :db.cardinality/one
:db/index true
:db/unique :db.unique/value
:db/doc \"Recurrence.Id\"
:alexa.entity-type :et-Recurrence
:db.install/_attribute :db.part/db}

;;\"Recurrence\",\"ModifiedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Recurrence/ModifiedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"Recurrence.ModifiedOn\"
:alexa.entity-type :et-Recurrence
:db.install/_attribute :db.part/db}

;;\"Recurrence\",\"Name\",\"[nvarchar](256)\",\"NOT NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Recurrence/Name
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"Recurrence.Name\"
:alexa.entity-type :et-Recurrence
:db.install/_attribute :db.part/db}

]"
"[;;\"Reference\",\"CreatedOn\",\"datetime\",\"NOT NULL\",\"[DF_ExternalReference_CreatedOn]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Reference/CreatedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"Reference.CreatedOn\"
:alexa.entity-type :et-Reference
:db.install/_attribute :db.part/db}

;;\"Reference\",\"DataFileId\",\"bigint\",\"NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :Reference/DataFile
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(Reference DataFileId DataFile DataFile)\"
:alexa.entity-type :et-Reference
:db.install/_attribute :db.part/db}

;;\"Reference\",\"DeletedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Reference/DeletedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"Reference.DeletedOn\"
:alexa.entity-type :et-Reference
:db.install/_attribute :db.part/db}

;;\"Reference\",\"Description\",\"[nvarchar](1024)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Reference/Description
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"Reference.Description\"
:alexa.entity-type :et-Reference
:db.install/_attribute :db.part/db}

;;\"Reference\",\"Id\",\"bigint\",\"NOT NULL\",\"\",\"IDENTITY\",\"PRIMARY KEY\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Reference/Id
:db/valueType :db.type/long
:db/cardinality :db.cardinality/one
:db/index true
:db/unique :db.unique/value
:db/doc \"Reference.Id\"
:alexa.entity-type :et-Reference
:db.install/_attribute :db.part/db}

;;\"Reference\",\"ModifiedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Reference/ModifiedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"Reference.ModifiedOn\"
:alexa.entity-type :et-Reference
:db.install/_attribute :db.part/db}

;;\"Reference\",\"Name\",\"[nvarchar](256)\",\"NOT NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Reference/Name
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"Reference.Name\"
:alexa.entity-type :et-Reference
:db.install/_attribute :db.part/db}

;;\"Reference\",\"ReferenceTypeId\",\"bigint\",\"NOT NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :Reference/ReferenceType
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(Reference ReferenceTypeId ReferenceType ReferenceType)\"
:alexa.entity-type :et-Reference
:db.install/_attribute :db.part/db}

;;\"Reference\",\"URL\",\"[nvarchar](2048)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Reference/URL
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"Reference.URL\"
:alexa.entity-type :et-Reference
:db.install/_attribute :db.part/db}

;;\"Reference\",\"URLTemplate\",\"[nvarchar](2048)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Reference/URLTemplate
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"Reference.URLTemplate\"
:alexa.entity-type :et-Reference
:db.install/_attribute :db.part/db}

{:db/id #db/id[:db.part/db]
:db/ident :Reference/AssetVulnerability
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/many
:db/doc \"(Reference ReferenceId AssetVulnerabilityReference AssetVulnerabilityId AssetVulnerability)\"
:alexa.entity-type :et-Reference
:db.install/_attribute :db.part/db}

{:db/id #db/id[:db.part/db]
:db/ident :Reference/EventHistory
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/many
:db/doc \"(Reference ReferenceId EventHistoryReference EventHistoryId EventHistory)\"
:alexa.entity-type :et-Reference
:db.install/_attribute :db.part/db}

{:db/id #db/id[:db.part/db]
:db/ident :Reference/Explanation
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/many
:db/doc \"(Reference ReferenceId ExplanationReference ExplanationId Explanation)\"
:alexa.entity-type :et-Reference
:db.install/_attribute :db.part/db}

{:db/id #db/id[:db.part/db]
:db/ident :Reference/Incident
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/many
:db/doc \"(Reference ReferenceId IncidentReference IncidentId Incident)\"
:alexa.entity-type :et-Reference
:db.install/_attribute :db.part/db}

{:db/id #db/id[:db.part/db]
:db/ident :Reference/Procedure
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/many
:db/doc \"(Reference ReferenceId ProcedureReference ProcedureId Procedure)\"
:alexa.entity-type :et-Reference
:db.install/_attribute :db.part/db}

{:db/id #db/id[:db.part/db]
:db/ident :Reference/Project
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/many
:db/doc \"(Reference ReferenceId ProjectReference ProjectId Project)\"
:alexa.entity-type :et-Reference
:db.install/_attribute :db.part/db}

{:db/id #db/id[:db.part/db]
:db/ident :Reference/StandardComponent
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/many
:db/doc \"(Reference ReferenceId StandardComponentReference StandardComponentId StandardComponent)\"
:alexa.entity-type :et-Reference
:db.install/_attribute :db.part/db}

{:db/id #db/id[:db.part/db]
:db/ident :Reference/TaskPerformance
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/many
:db/doc \"(Reference ReferenceId TaskPerformanceReference TaskPerformanceId TaskPerformance)\"
:alexa.entity-type :et-Reference
:db.install/_attribute :db.part/db}

{:db/id #db/id[:db.part/db]
:db/ident :Reference/TaskResultOutcomeApproval
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/many
:db/doc \"(Reference ReferenceId TaskResultOutcomeApprovalReference TaskResultOutcomeApprovalId TaskResultOutcomeApproval)\"
:alexa.entity-type :et-Reference
:db.install/_attribute :db.part/db}

{:db/id #db/id[:db.part/db]
:db/ident :Reference/TaskResultOutcome
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/many
:db/doc \"(Reference ReferenceId TaskResultOutcomeReference TaskResultOutcomeId TaskResultOutcome)\"
:alexa.entity-type :et-Reference
:db.install/_attribute :db.part/db}

{:db/id #db/id[:db.part/db]
:db/ident :Reference/TaskResult
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/many
:db/doc \"(Reference ReferenceId TaskResultReference TaskResultId TaskResult)\"
:alexa.entity-type :et-Reference
:db.install/_attribute :db.part/db}

]"
"[;;\"ReferenceType\",\"CreatedOn\",\"datetime\",\"NOT NULL\",\"[DF_ReferenceType_CreatedOn]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :ReferenceType/CreatedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"ReferenceType.CreatedOn\"
:alexa.entity-type :et-ReferenceType
:db.install/_attribute :db.part/db}

;;\"ReferenceType\",\"DeletedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :ReferenceType/DeletedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"ReferenceType.DeletedOn\"
:alexa.entity-type :et-ReferenceType
:db.install/_attribute :db.part/db}

;;\"ReferenceType\",\"Description\",\"[nvarchar](1024)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :ReferenceType/Description
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"ReferenceType.Description\"
:alexa.entity-type :et-ReferenceType
:db.install/_attribute :db.part/db}

;;\"ReferenceType\",\"Id\",\"bigint\",\"NOT NULL\",\"\",\"IDENTITY\",\"PRIMARY KEY\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :ReferenceType/Id
:db/valueType :db.type/long
:db/cardinality :db.cardinality/one
:db/index true
:db/unique :db.unique/value
:db/doc \"ReferenceType.Id\"
:alexa.entity-type :et-ReferenceType
:db.install/_attribute :db.part/db}

;;\"ReferenceType\",\"ModifiedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :ReferenceType/ModifiedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"ReferenceType.ModifiedOn\"
:alexa.entity-type :et-ReferenceType
:db.install/_attribute :db.part/db}

;;\"ReferenceType\",\"Name\",\"[nvarchar](256)\",\"NOT NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :ReferenceType/Name
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"ReferenceType.Name\"
:alexa.entity-type :et-ReferenceType
:db.install/_attribute :db.part/db}

]"
"[;;\"Report\",\"CreatedBy_PersonId\",\"bigint\",\"NOT NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :Report/CreatedBy_Person
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(Report CreatedBy_PersonId Person CreatedBy_Person)\"
:alexa.entity-type :et-Report
:db.install/_attribute :db.part/db}

;;\"Report\",\"CreatedOn\",\"datetime\",\"NOT NULL\",\"[DF_Report_CreatedOn]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Report/CreatedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"Report.CreatedOn\"
:alexa.entity-type :et-Report
:db.install/_attribute :db.part/db}

;;\"Report\",\"Data\",\"[nvarchar](MAX)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Report/Data
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"Report.Data\"
:alexa.entity-type :et-Report
:db.install/_attribute :db.part/db}

;;\"Report\",\"DeletedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Report/DeletedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"Report.DeletedOn\"
:alexa.entity-type :et-Report
:db.install/_attribute :db.part/db}

;;\"Report\",\"Id\",\"bigint\",\"NOT NULL\",\"\",\"IDENTITY\",\"PRIMARY KEY\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Report/Id
:db/valueType :db.type/long
:db/cardinality :db.cardinality/one
:db/index true
:db/unique :db.unique/value
:db/doc \"Report.Id\"
:alexa.entity-type :et-Report
:db.install/_attribute :db.part/db}

;;\"Report\",\"ModifiedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Report/ModifiedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"Report.ModifiedOn\"
:alexa.entity-type :et-Report
:db.install/_attribute :db.part/db}

;;\"Report\",\"Name\",\"[nvarchar](256)\",\"NOT NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Report/Name
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"Report.Name\"
:alexa.entity-type :et-Report
:db.install/_attribute :db.part/db}

;;\"Report\",\"ReferenceId\",\"bigint\",\"NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :Report/Reference
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(Report ReferenceId Reference Reference)\"
:alexa.entity-type :et-Report
:db.install/_attribute :db.part/db}

;;\"Report\",\"ReportConfigId\",\"bigint\",\"NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :Report/ReportConfig
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(Report ReportConfigId ReportConfig ReportConfig)\"
:alexa.entity-type :et-Report
:db.install/_attribute :db.part/db}

;;\"Report\",\"Title\",\"[nvarchar](256)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Report/Title
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"Report.Title\"
:alexa.entity-type :et-Report
:db.install/_attribute :db.part/db}

]"
"[;;\"ReportConfig\",\"Category\",\"int\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :ReportConfig/Category
:db/valueType :db.type/long
:db/cardinality :db.cardinality/one
:db/doc \"ReportConfig.Category\"
:alexa.entity-type :et-ReportConfig
:db.install/_attribute :db.part/db}

;;\"ReportConfig\",\"CreatedBy_PersonId\",\"bigint\",\"NOT NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :ReportConfig/CreatedBy_Person
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(ReportConfig CreatedBy_PersonId Person CreatedBy_Person)\"
:alexa.entity-type :et-ReportConfig
:db.install/_attribute :db.part/db}

;;\"ReportConfig\",\"CreatedOn\",\"datetime\",\"NOT NULL\",\"[DF_ReportConfig_CreatedOn]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :ReportConfig/CreatedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"ReportConfig.CreatedOn\"
:alexa.entity-type :et-ReportConfig
:db.install/_attribute :db.part/db}

;;\"ReportConfig\",\"Data\",\"[nvarchar](MAX)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :ReportConfig/Data
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"ReportConfig.Data\"
:alexa.entity-type :et-ReportConfig
:db.install/_attribute :db.part/db}

;;\"ReportConfig\",\"DeletedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :ReportConfig/DeletedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"ReportConfig.DeletedOn\"
:alexa.entity-type :et-ReportConfig
:db.install/_attribute :db.part/db}

;;\"ReportConfig\",\"Description\",\"[nvarchar](1024)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :ReportConfig/Description
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"ReportConfig.Description\"
:alexa.entity-type :et-ReportConfig
:db.install/_attribute :db.part/db}

;;\"ReportConfig\",\"Id\",\"bigint\",\"NOT NULL\",\"\",\"IDENTITY\",\"PRIMARY KEY\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :ReportConfig/Id
:db/valueType :db.type/long
:db/cardinality :db.cardinality/one
:db/index true
:db/unique :db.unique/value
:db/doc \"ReportConfig.Id\"
:alexa.entity-type :et-ReportConfig
:db.install/_attribute :db.part/db}

;;\"ReportConfig\",\"ModifiedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :ReportConfig/ModifiedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"ReportConfig.ModifiedOn\"
:alexa.entity-type :et-ReportConfig
:db.install/_attribute :db.part/db}

;;\"ReportConfig\",\"Name\",\"[nvarchar](256)\",\"NOT NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :ReportConfig/Name
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"ReportConfig.Name\"
:alexa.entity-type :et-ReportConfig
:db.install/_attribute :db.part/db}

]"
"[;;\"ResourceCost\",\"BusinessUnitId\",\"bigint\",\"NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :ResourceCost/BusinessUnit
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(ResourceCost BusinessUnitId BusinessUnit BusinessUnit)\"
:alexa.entity-type :et-ResourceCost
:db.install/_attribute :db.part/db}

;;\"ResourceCost\",\"CreatedOn\",\"datetime\",\"NOT NULL\",\"[DF_ResourceCost_CreatedOn]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :ResourceCost/CreatedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"ResourceCost.CreatedOn\"
:alexa.entity-type :et-ResourceCost
:db.install/_attribute :db.part/db}

;;\"ResourceCost\",\"CurrencyId\",\"bigint\",\"NOT NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :ResourceCost/Currency
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(ResourceCost CurrencyId Currency Currency)\"
:alexa.entity-type :et-ResourceCost
:db.install/_attribute :db.part/db}

;;\"ResourceCost\",\"DeletedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :ResourceCost/DeletedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"ResourceCost.DeletedOn\"
:alexa.entity-type :et-ResourceCost
:db.install/_attribute :db.part/db}

;;\"ResourceCost\",\"EffectiveDate\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :ResourceCost/EffectiveDate
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"ResourceCost.EffectiveDate\"
:alexa.entity-type :et-ResourceCost
:db.install/_attribute :db.part/db}

;;\"ResourceCost\",\"Id\",\"bigint\",\"NOT NULL\",\"\",\"\",\"PRIMARY KEY\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :ResourceCost/Id
:db/valueType :db.type/long
:db/cardinality :db.cardinality/one
:db/index true
:db/unique :db.unique/value
:db/doc \"ResourceCost.Id\"
:alexa.entity-type :et-ResourceCost
:db.install/_attribute :db.part/db}

;;\"ResourceCost\",\"ModifiedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :ResourceCost/ModifiedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"ResourceCost.ModifiedOn\"
:alexa.entity-type :et-ResourceCost
:db.install/_attribute :db.part/db}

;;\"ResourceCost\",\"PerDiemCost\",\"money\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :ResourceCost/PerDiemCost
:db/valueType :db.type/bigdec
:db/cardinality :db.cardinality/one
:db/doc \"ResourceCost.PerDiemCost\"
:alexa.entity-type :et-ResourceCost
:db.install/_attribute :db.part/db}

;;\"ResourceCost\",\"PersonId\",\"bigint\",\"NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :ResourceCost/Person
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(ResourceCost PersonId Person Person)\"
:alexa.entity-type :et-ResourceCost
:db.install/_attribute :db.part/db}

;;\"ResourceCost\",\"RoleId\",\"bigint\",\"NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :ResourceCost/Role
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(ResourceCost RoleId Role Role)\"
:alexa.entity-type :et-ResourceCost
:db.install/_attribute :db.part/db}

]"
"[;;\"RiskLevel\",\"BackColorName\",\"[nvarchar](50)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :RiskLevel/BackColorName
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"RiskLevel.BackColorName\"
:alexa.entity-type :et-RiskLevel
:db.install/_attribute :db.part/db}

;;\"RiskLevel\",\"CreatedOn\",\"datetime\",\"NOT NULL\",\"[DF_RiskLevel_CreatedOn]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :RiskLevel/CreatedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"RiskLevel.CreatedOn\"
:alexa.entity-type :et-RiskLevel
:db.install/_attribute :db.part/db}

;;\"RiskLevel\",\"DeletedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :RiskLevel/DeletedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"RiskLevel.DeletedOn\"
:alexa.entity-type :et-RiskLevel
:db.install/_attribute :db.part/db}

;;\"RiskLevel\",\"Description\",\"[nvarchar](1024)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :RiskLevel/Description
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"RiskLevel.Description\"
:alexa.entity-type :et-RiskLevel
:db.install/_attribute :db.part/db}

;;\"RiskLevel\",\"ForeColorName\",\"[nvarchar](50)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :RiskLevel/ForeColorName
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"RiskLevel.ForeColorName\"
:alexa.entity-type :et-RiskLevel
:db.install/_attribute :db.part/db}

;;\"RiskLevel\",\"Id\",\"bigint\",\"NOT NULL\",\"\",\"IDENTITY\",\"PRIMARY KEY\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :RiskLevel/Id
:db/valueType :db.type/long
:db/cardinality :db.cardinality/one
:db/index true
:db/unique :db.unique/value
:db/doc \"RiskLevel.Id\"
:alexa.entity-type :et-RiskLevel
:db.install/_attribute :db.part/db}

;;\"RiskLevel\",\"ModifiedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :RiskLevel/ModifiedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"RiskLevel.ModifiedOn\"
:alexa.entity-type :et-RiskLevel
:db.install/_attribute :db.part/db}

;;\"RiskLevel\",\"Name\",\"[nvarchar](256)\",\"NOT NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :RiskLevel/Name
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"RiskLevel.Name\"
:alexa.entity-type :et-RiskLevel
:db.install/_attribute :db.part/db}

;;\"RiskLevel\",\"UpperThreshold\",\"float\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :RiskLevel/UpperThreshold
:db/valueType :db.type/float
:db/cardinality :db.cardinality/one
:db/doc \"RiskLevel.UpperThreshold\"
:alexa.entity-type :et-RiskLevel
:db.install/_attribute :db.part/db}

]"
"[;;\"Role\",\"Abbreviation\",\"[nvarchar](50)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Role/Abbreviation
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"Role.Abbreviation\"
:alexa.entity-type :et-Role
:db.install/_attribute :db.part/db}

;;\"Role\",\"CreatedOn\",\"datetime\",\"NOT NULL\",\"[DF_Role_CreatedOn]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Role/CreatedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"Role.CreatedOn\"
:alexa.entity-type :et-Role
:db.install/_attribute :db.part/db}

;;\"Role\",\"DeletedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Role/DeletedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"Role.DeletedOn\"
:alexa.entity-type :et-Role
:db.install/_attribute :db.part/db}

;;\"Role\",\"Description\",\"[nvarchar](1024)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Role/Description
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"Role.Description\"
:alexa.entity-type :et-Role
:db.install/_attribute :db.part/db}

;;\"Role\",\"FilterByAssetType\",\"bit\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Role/FilterByAssetType
:db/valueType :db.type/boolean
:db/cardinality :db.cardinality/one
:db/doc \"Role.FilterByAssetType\"
:alexa.entity-type :et-Role
:db.install/_attribute :db.part/db}

;;\"Role\",\"FilterByNetwork\",\"bit\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Role/FilterByNetwork
:db/valueType :db.type/boolean
:db/cardinality :db.cardinality/one
:db/doc \"Role.FilterByNetwork\"
:alexa.entity-type :et-Role
:db.install/_attribute :db.part/db}

;;\"Role\",\"Flags\",\"bigint\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Role/Flags
:db/valueType :db.type/long
:db/cardinality :db.cardinality/one
:db/doc \"Role.Flags\"
:alexa.entity-type :et-Role
:db.install/_attribute :db.part/db}

;;\"Role\",\"Id\",\"bigint\",\"NOT NULL\",\"\",\"IDENTITY\",\"PRIMARY KEY\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Role/Id
:db/valueType :db.type/long
:db/cardinality :db.cardinality/one
:db/index true
:db/unique :db.unique/value
:db/doc \"Role.Id\"
:alexa.entity-type :et-Role
:db.install/_attribute :db.part/db}

;;\"Role\",\"ModifiedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Role/ModifiedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"Role.ModifiedOn\"
:alexa.entity-type :et-Role
:db.install/_attribute :db.part/db}

;;\"Role\",\"Name\",\"[nvarchar](256)\",\"NOT NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Role/Name
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"Role.Name\"
:alexa.entity-type :et-Role
:db.install/_attribute :db.part/db}

{:db/id #db/id[:db.part/db]
:db/ident :Role/AssetType
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/many
:db/doc \"(Role RoleId AssetTypeRole AssetTypeId AssetType)\"
:alexa.entity-type :et-Role
:db.install/_attribute :db.part/db}

{:db/id #db/id[:db.part/db]
:db/ident :Role/AuditPlan
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/many
:db/doc \"(Role RoleId AuditPlanRole AuditPlanId AuditPlan)\"
:alexa.entity-type :et-Role
:db.install/_attribute :db.part/db}

{:db/id #db/id[:db.part/db]
:db/ident :Role/Network
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/many
:db/doc \"(Role RoleId NetworkRole NetworkId Network)\"
:alexa.entity-type :et-Role
:db.install/_attribute :db.part/db}

{:db/id #db/id[:db.part/db]
:db/ident :Role/NotificationRule
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/many
:db/doc \"(Role RoleId NotificationRuleRole NotificationRuleId NotificationRule)\"
:alexa.entity-type :et-Role
:db.install/_attribute :db.part/db}

{:db/id #db/id[:db.part/db]
:db/ident :Role/Project
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/many
:db/doc \"(Role RoleId ProjectRole ProjectId Project)\"
:alexa.entity-type :et-Role
:db.install/_attribute :db.part/db}

{:db/id #db/id[:db.part/db]
:db/ident :Role/SurveySection
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/many
:db/doc \"(Role RoleId SurveySectionRole SurveySectionId SurveySection)\"
:alexa.entity-type :et-Role
:db.install/_attribute :db.part/db}

]"
"[;;\"RoleModule\",\"CreatedOn\",\"datetime\",\"NOT NULL\",\"[DF_RoleModule_CreatedOn]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :RoleModule/CreatedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"RoleModule.CreatedOn\"
:alexa.entity-type :et-RoleModule
:db.install/_attribute :db.part/db}

;;\"RoleModule\",\"DeletedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :RoleModule/DeletedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"RoleModule.DeletedOn\"
:alexa.entity-type :et-RoleModule
:db.install/_attribute :db.part/db}

;;\"RoleModule\",\"Id\",\"bigint\",\"NOT NULL\",\"\",\"IDENTITY\",\"PRIMARY KEY\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :RoleModule/Id
:db/valueType :db.type/long
:db/cardinality :db.cardinality/one
:db/index true
:db/unique :db.unique/value
:db/doc \"RoleModule.Id\"
:alexa.entity-type :et-RoleModule
:db.install/_attribute :db.part/db}

;;\"RoleModule\",\"ModifiedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :RoleModule/ModifiedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"RoleModule.ModifiedOn\"
:alexa.entity-type :et-RoleModule
:db.install/_attribute :db.part/db}

;;\"RoleModule\",\"ModuleNumber\",\"int\",\"NULL\",\"[DF_RoleModule_ModuleNumber]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :RoleModule/ModuleNumber
:db/valueType :db.type/long
:db/cardinality :db.cardinality/one
:db/doc \"RoleModule.ModuleNumber\"
:alexa.entity-type :et-RoleModule
:db.install/_attribute :db.part/db}

;;\"RoleModule\",\"ReadAccess\",\"bit\",\"NULL\",\"[DF_RoleModule_ReadAccess]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :RoleModule/ReadAccess
:db/valueType :db.type/boolean
:db/cardinality :db.cardinality/one
:db/doc \"RoleModule.ReadAccess\"
:alexa.entity-type :et-RoleModule
:db.install/_attribute :db.part/db}

;;\"RoleModule\",\"RoleId\",\"bigint\",\"NOT NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :RoleModule/Role
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(RoleModule RoleId Role Role)\"
:alexa.entity-type :et-RoleModule
:db.install/_attribute :db.part/db}

;;\"RoleModule\",\"WriteAccess\",\"bit\",\"NULL\",\"[DF_RoleModule_WriteAccess]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :RoleModule/WriteAccess
:db/valueType :db.type/boolean
:db/cardinality :db.cardinality/one
:db/doc \"RoleModule.WriteAccess\"
:alexa.entity-type :et-RoleModule
:db.install/_attribute :db.part/db}

]"
"[;;\"Service\",\"CreatedOn\",\"datetime\",\"NOT NULL\",\"[DF_Service_CreatedOn]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Service/CreatedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"Service.CreatedOn\"
:alexa.entity-type :et-Service
:db.install/_attribute :db.part/db}

;;\"Service\",\"DeletedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Service/DeletedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"Service.DeletedOn\"
:alexa.entity-type :et-Service
:db.install/_attribute :db.part/db}

;;\"Service\",\"Description\",\"[nvarchar](1024)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Service/Description
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"Service.Description\"
:alexa.entity-type :et-Service
:db.install/_attribute :db.part/db}

;;\"Service\",\"Id\",\"bigint\",\"NOT NULL\",\"\",\"IDENTITY\",\"PRIMARY KEY\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Service/Id
:db/valueType :db.type/long
:db/cardinality :db.cardinality/one
:db/index true
:db/unique :db.unique/value
:db/doc \"Service.Id\"
:alexa.entity-type :et-Service
:db.install/_attribute :db.part/db}

;;\"Service\",\"ModifiedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Service/ModifiedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"Service.ModifiedOn\"
:alexa.entity-type :et-Service
:db.install/_attribute :db.part/db}

;;\"Service\",\"Name\",\"[nvarchar](256)\",\"NOT NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Service/Name
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"Service.Name\"
:alexa.entity-type :et-Service
:db.install/_attribute :db.part/db}

]"
"[;;\"Severity\",\"BackColorName\",\"[nvarchar](50)\",\"NULL\",\"[DF_Severity_BackColorName]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Severity/BackColorName
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"Severity.BackColorName\"
:alexa.entity-type :et-Severity
:db.install/_attribute :db.part/db}

;;\"Severity\",\"CreatedOn\",\"datetime\",\"NOT NULL\",\"[DF_Severity_CreatedOn]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Severity/CreatedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"Severity.CreatedOn\"
:alexa.entity-type :et-Severity
:db.install/_attribute :db.part/db}

;;\"Severity\",\"DeletedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Severity/DeletedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"Severity.DeletedOn\"
:alexa.entity-type :et-Severity
:db.install/_attribute :db.part/db}

;;\"Severity\",\"Description\",\"[nvarchar](1024)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Severity/Description
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"Severity.Description\"
:alexa.entity-type :et-Severity
:db.install/_attribute :db.part/db}

;;\"Severity\",\"ForeColorName\",\"[nvarchar](50)\",\"NULL\",\"[DF_Severity_ForeColorName]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Severity/ForeColorName
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"Severity.ForeColorName\"
:alexa.entity-type :et-Severity
:db.install/_attribute :db.part/db}

;;\"Severity\",\"Id\",\"bigint\",\"NOT NULL\",\"\",\"IDENTITY\",\"PRIMARY KEY\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Severity/Id
:db/valueType :db.type/long
:db/cardinality :db.cardinality/one
:db/index true
:db/unique :db.unique/value
:db/doc \"Severity.Id\"
:alexa.entity-type :et-Severity
:db.install/_attribute :db.part/db}

;;\"Severity\",\"ModifiedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Severity/ModifiedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"Severity.ModifiedOn\"
:alexa.entity-type :et-Severity
:db.install/_attribute :db.part/db}

;;\"Severity\",\"Name\",\"[nvarchar](256)\",\"NOT NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Severity/Name
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"Severity.Name\"
:alexa.entity-type :et-Severity
:db.install/_attribute :db.part/db}

;;\"Severity\",\"Number\",\"int\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Severity/Number
:db/valueType :db.type/long
:db/cardinality :db.cardinality/one
:db/doc \"Severity.Number\"
:alexa.entity-type :et-Severity
:db.install/_attribute :db.part/db}

;;\"Severity\",\"Probability\",\"float\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Severity/Probability
:db/valueType :db.type/float
:db/cardinality :db.cardinality/one
:db/doc \"Severity.Probability\"
:alexa.entity-type :et-Severity
:db.install/_attribute :db.part/db}

]"
"[;;\"Software\",\"CreatedOn\",\"datetime\",\"NOT NULL\",\"[DF_Software_CreatedOn]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Software/CreatedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"Software.CreatedOn\"
:alexa.entity-type :et-Software
:db.install/_attribute :db.part/db}

;;\"Software\",\"DeletedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Software/DeletedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"Software.DeletedOn\"
:alexa.entity-type :et-Software
:db.install/_attribute :db.part/db}

;;\"Software\",\"Description\",\"[nvarchar](1024)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Software/Description
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"Software.Description\"
:alexa.entity-type :et-Software
:db.install/_attribute :db.part/db}

;;\"Software\",\"Id\",\"bigint\",\"NOT NULL\",\"\",\"IDENTITY\",\"PRIMARY KEY\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Software/Id
:db/valueType :db.type/long
:db/cardinality :db.cardinality/one
:db/index true
:db/unique :db.unique/value
:db/doc \"Software.Id\"
:alexa.entity-type :et-Software
:db.install/_attribute :db.part/db}

;;\"Software\",\"ModifiedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Software/ModifiedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"Software.ModifiedOn\"
:alexa.entity-type :et-Software
:db.install/_attribute :db.part/db}

;;\"Software\",\"Name\",\"[nvarchar](256)\",\"NOT NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Software/Name
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"Software.Name\"
:alexa.entity-type :et-Software
:db.install/_attribute :db.part/db}

{:db/id #db/id[:db.part/db]
:db/ident :Software/Asset
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/many
:db/doc \"(Software SoftwareId AssetSoftware AssetId Asset)\"
:alexa.entity-type :et-Software
:db.install/_attribute :db.part/db}

{:db/id #db/id[:db.part/db]
:db/ident :Software/DataType
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/many
:db/doc \"(Software SoftwareId SoftwareDataType DataTypeId DataType)\"
:alexa.entity-type :et-Software
:db.install/_attribute :db.part/db}

]"
"[;;\"StandardComponent\",\"Abbreviation\",\"[nvarchar](50)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :StandardComponent/Abbreviation
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"StandardComponent.Abbreviation\"
:alexa.entity-type :et-StandardComponent
:db.install/_attribute :db.part/db}

;;\"StandardComponent\",\"AltKey\",\"[nvarchar](50)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :StandardComponent/AltKey
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"StandardComponent.AltKey\"
:alexa.entity-type :et-StandardComponent
:db.install/_attribute :db.part/db}

;;\"StandardComponent\",\"AutoNumber\",\"bit\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :StandardComponent/AutoNumber
:db/valueType :db.type/boolean
:db/cardinality :db.cardinality/one
:db/doc \"StandardComponent.AutoNumber\"
:alexa.entity-type :et-StandardComponent
:db.install/_attribute :db.part/db}

;;\"StandardComponent\",\"CreatedOn\",\"datetime\",\"NOT NULL\",\"[DF_StandardComponent_CreatedOn]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :StandardComponent/CreatedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"StandardComponent.CreatedOn\"
:alexa.entity-type :et-StandardComponent
:db.install/_attribute :db.part/db}

;;\"StandardComponent\",\"DeletedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :StandardComponent/DeletedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"StandardComponent.DeletedOn\"
:alexa.entity-type :et-StandardComponent
:db.install/_attribute :db.part/db}

;;\"StandardComponent\",\"Description\",\"[nvarchar](MAX)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :StandardComponent/Description
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"StandardComponent.Description\"
:alexa.entity-type :et-StandardComponent
:db.install/_attribute :db.part/db}

;;\"StandardComponent\",\"DomainComponentId\",\"bigint\",\"NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :StandardComponent/DomainComponent
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(StandardComponent DomainComponentId StandardComponent DomainComponent)\"
:alexa.entity-type :et-StandardComponent
:db.install/_attribute :db.part/db}

;;\"StandardComponent\",\"EditedBy_PersonId\",\"bigint\",\"NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :StandardComponent/EditedBy_Person
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(StandardComponent EditedBy_PersonId Person EditedBy_Person)\"
:alexa.entity-type :et-StandardComponent
:db.install/_attribute :db.part/db}

;;\"StandardComponent\",\"EffectiveDate\",\"datetime\",\"NULL\",\"[DF_StandardComponent_EffectiveDate]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :StandardComponent/EffectiveDate
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"StandardComponent.EffectiveDate\"
:alexa.entity-type :et-StandardComponent
:db.install/_attribute :db.part/db}

;;\"StandardComponent\",\"Flags\",\"bigint\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :StandardComponent/Flags
:db/valueType :db.type/long
:db/cardinality :db.cardinality/one
:db/doc \"StandardComponent.Flags\"
:alexa.entity-type :et-StandardComponent
:db.install/_attribute :db.part/db}

;;\"StandardComponent\",\"HideNumber\",\"bit\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :StandardComponent/HideNumber
:db/valueType :db.type/boolean
:db/cardinality :db.cardinality/one
:db/doc \"StandardComponent.HideNumber\"
:alexa.entity-type :et-StandardComponent
:db.install/_attribute :db.part/db}

;;\"StandardComponent\",\"Id\",\"bigint\",\"NOT NULL\",\"\",\"IDENTITY\",\"PRIMARY KEY\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :StandardComponent/Id
:db/valueType :db.type/long
:db/cardinality :db.cardinality/one
:db/index true
:db/unique :db.unique/value
:db/doc \"StandardComponent.Id\"
:alexa.entity-type :et-StandardComponent
:db.install/_attribute :db.part/db}

;;\"StandardComponent\",\"IsDomain\",\"bit\",\"NULL\",\"[DF_StandardComponent_IsDomain]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :StandardComponent/IsDomain
:db/valueType :db.type/boolean
:db/cardinality :db.cardinality/one
:db/doc \"StandardComponent.IsDomain\"
:alexa.entity-type :et-StandardComponent
:db.install/_attribute :db.part/db}

;;\"StandardComponent\",\"IsTask\",\"bit\",\"NULL\",\"[DF_StandardComponent_NonTask]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :StandardComponent/IsTask
:db/valueType :db.type/boolean
:db/cardinality :db.cardinality/one
:db/doc \"StandardComponent.IsTask\"
:alexa.entity-type :et-StandardComponent
:db.install/_attribute :db.part/db}

;;\"StandardComponent\",\"ModifiedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :StandardComponent/ModifiedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"StandardComponent.ModifiedOn\"
:alexa.entity-type :et-StandardComponent
:db.install/_attribute :db.part/db}

;;\"StandardComponent\",\"Name\",\"[nvarchar](256)\",\"NOT NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :StandardComponent/Name
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"StandardComponent.Name\"
:alexa.entity-type :et-StandardComponent
:db.install/_attribute :db.part/db}

;;\"StandardComponent\",\"Number\",\"[nvarchar](100)\",\"NOT NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :StandardComponent/Number
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"StandardComponent.Number\"
:alexa.entity-type :et-StandardComponent
:db.install/_attribute :db.part/db}

;;\"StandardComponent\",\"Objectives\",\"[nvarchar](MAX)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :StandardComponent/Objectives
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"StandardComponent.Objectives\"
:alexa.entity-type :et-StandardComponent
:db.install/_attribute :db.part/db}

;;\"StandardComponent\",\"ParentId\",\"bigint\",\"NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :StandardComponent/Parent
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(StandardComponent ParentId StandardComponent Parent)\"
:alexa.entity-type :et-StandardComponent
:db.install/_attribute :db.part/db}

;;\"StandardComponent\",\"Procedures\",\"[nvarchar](MAX)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :StandardComponent/Procedures
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"StandardComponent.Procedures\"
:alexa.entity-type :et-StandardComponent
:db.install/_attribute :db.part/db}

;;\"StandardComponent\",\"References\",\"[nvarchar](MAX)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :StandardComponent/References
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"StandardComponent.References\"
:alexa.entity-type :et-StandardComponent
:db.install/_attribute :db.part/db}

;;\"StandardComponent\",\"Remediation\",\"[nvarchar](MAX)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :StandardComponent/Remediation
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"StandardComponent.Remediation\"
:alexa.entity-type :et-StandardComponent
:db.install/_attribute :db.part/db}

;;\"StandardComponent\",\"SortKey\",\"[nvarchar](100)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :StandardComponent/SortKey
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"StandardComponent.SortKey\"
:alexa.entity-type :et-StandardComponent
:db.install/_attribute :db.part/db}

;;\"StandardComponent\",\"StandardComponentWeightId\",\"bigint\",\"NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :StandardComponent/StandardComponentWeight
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(StandardComponent StandardComponentWeightId StandardComponentWeight StandardComponentWeight)\"
:alexa.entity-type :et-StandardComponent
:db.install/_attribute :db.part/db}

;;\"StandardComponent\",\"StandardId\",\"bigint\",\"NOT NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :StandardComponent/Standard
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(StandardComponent StandardId Standard Standard)\"
:alexa.entity-type :et-StandardComponent
:db.install/_attribute :db.part/db}

;;\"StandardComponent\",\"UCFControlNumber\",\"[nvarchar](256)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :StandardComponent/UCFControlNumber
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"StandardComponent.UCFControlNumber\"
:alexa.entity-type :et-StandardComponent
:db.install/_attribute :db.part/db}

;;\"StandardComponent\",\"Version\",\"[nvarchar](50)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :StandardComponent/Version
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"StandardComponent.Version\"
:alexa.entity-type :et-StandardComponent
:db.install/_attribute :db.part/db}

{:db/id #db/id[:db.part/db]
:db/ident :StandardComponent/AuditPlan
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/many
:db/doc \"(StandardComponent StandardComponentId AuditPlanStandardComponent AuditPlanId AuditPlan)\"
:alexa.entity-type :et-StandardComponent
:db.install/_attribute :db.part/db}

{:db/id #db/id[:db.part/db]
:db/ident :StandardComponent/Person
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/many
:db/doc \"(StandardComponent StandardComponentId StandardComponentPerson PersonId Person)\"
:alexa.entity-type :et-StandardComponent
:db.install/_attribute :db.part/db}

{:db/id #db/id[:db.part/db]
:db/ident :StandardComponent/DataFile
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/many
:db/doc \"(StandardComponent StandardComponentId StandardComponentReference ReferenceId Reference)\"
:alexa.entity-type :et-StandardComponent
:db.install/_attribute :db.part/db}

{:db/id #db/id[:db.part/db]
:db/ident :StandardComponent/SurveySection
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/many
:db/doc \"(StandardComponent StandardComponentId SurveySectionStandardComponent SurveySectionId SurveySection)\"
:alexa.entity-type :et-StandardComponent
:db.install/_attribute :db.part/db}

]"
"[;;\"StandardComponentCoverageLink\",\"Comments\",\"[nvarchar](1024)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :StandardComponentCoverageLink/Comments
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"StandardComponentCoverageLink.Comments\"
:alexa.entity-type :et-StandardComponentCoverageLink
:db.install/_attribute :db.part/db}

;;\"StandardComponentCoverageLink\",\"Coverage\",\"float\",\"NULL\",\"[DF_StandardComponentCoverageLink_Coverage]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :StandardComponentCoverageLink/Coverage
:db/valueType :db.type/float
:db/cardinality :db.cardinality/one
:db/doc \"StandardComponentCoverageLink.Coverage\"
:alexa.entity-type :et-StandardComponentCoverageLink
:db.install/_attribute :db.part/db}

;;\"StandardComponentCoverageLink\",\"CoveredStandardComponentId\",\"bigint\",\"NOT NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :StandardComponentCoverageLink/CoveredStandardComponent
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(StandardComponentCoverageLink CoveredStandardComponentId StandardComponent CoveredStandardComponent)\"
:alexa.entity-type :et-StandardComponentCoverageLink
:db.install/_attribute :db.part/db}

;;\"StandardComponentCoverageLink\",\"CreatedBy_PersonId\",\"bigint\",\"NOT NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :StandardComponentCoverageLink/CreatedBy_Person
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(StandardComponentCoverageLink CreatedBy_PersonId Person CreatedBy_Person)\"
:alexa.entity-type :et-StandardComponentCoverageLink
:db.install/_attribute :db.part/db}

;;\"StandardComponentCoverageLink\",\"CreatedOn\",\"datetime\",\"NOT NULL\",\"[DF_StandardComponentCoverageLink_CreatedOn]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :StandardComponentCoverageLink/CreatedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"StandardComponentCoverageLink.CreatedOn\"
:alexa.entity-type :et-StandardComponentCoverageLink
:db.install/_attribute :db.part/db}

;;\"StandardComponentCoverageLink\",\"DeletedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :StandardComponentCoverageLink/DeletedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"StandardComponentCoverageLink.DeletedOn\"
:alexa.entity-type :et-StandardComponentCoverageLink
:db.install/_attribute :db.part/db}

;;\"StandardComponentCoverageLink\",\"EventHistoryId\",\"bigint\",\"NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :StandardComponentCoverageLink/EventHistory
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(StandardComponentCoverageLink EventHistoryId EventHistory EventHistory)\"
:alexa.entity-type :et-StandardComponentCoverageLink
:db.install/_attribute :db.part/db}

;;\"StandardComponentCoverageLink\",\"Id\",\"bigint\",\"NOT NULL\",\"\",\"IDENTITY\",\"PRIMARY KEY\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :StandardComponentCoverageLink/Id
:db/valueType :db.type/long
:db/cardinality :db.cardinality/one
:db/index true
:db/unique :db.unique/value
:db/doc \"StandardComponentCoverageLink.Id\"
:alexa.entity-type :et-StandardComponentCoverageLink
:db.install/_attribute :db.part/db}

;;\"StandardComponentCoverageLink\",\"Manual\",\"bit\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :StandardComponentCoverageLink/Manual
:db/valueType :db.type/boolean
:db/cardinality :db.cardinality/one
:db/doc \"StandardComponentCoverageLink.Manual\"
:alexa.entity-type :et-StandardComponentCoverageLink
:db.install/_attribute :db.part/db}

;;\"StandardComponentCoverageLink\",\"ModifiedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :StandardComponentCoverageLink/ModifiedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"StandardComponentCoverageLink.ModifiedOn\"
:alexa.entity-type :et-StandardComponentCoverageLink
:db.install/_attribute :db.part/db}

;;\"StandardComponentCoverageLink\",\"StandardComponentId\",\"bigint\",\"NOT NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :StandardComponentCoverageLink/StandardComponent
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(StandardComponentCoverageLink StandardComponentId StandardComponent StandardComponent)\"
:alexa.entity-type :et-StandardComponentCoverageLink
:db.install/_attribute :db.part/db}

]"
"[;;\"StandardComponentTask\",\"CreatedOn\",\"datetime\",\"NOT NULL\",\"[DF_StandardComponentTask_CreatedOn]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :StandardComponentTask/CreatedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"StandardComponentTask.CreatedOn\"
:alexa.entity-type :et-StandardComponentTask
:db.install/_attribute :db.part/db}

;;\"StandardComponentTask\",\"DeletedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :StandardComponentTask/DeletedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"StandardComponentTask.DeletedOn\"
:alexa.entity-type :et-StandardComponentTask
:db.install/_attribute :db.part/db}

;;\"StandardComponentTask\",\"Domain_StandardComponentId\",\"bigint\",\"NOT NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :StandardComponentTask/Domain_StandardComponent
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(StandardComponentTask Domain_StandardComponentId StandardComponent Domain_StandardComponent)\"
:alexa.entity-type :et-StandardComponentTask
:db.install/_attribute :db.part/db}

;;\"StandardComponentTask\",\"Id\",\"bigint\",\"NOT NULL\",\"\",\"IDENTITY\",\"PRIMARY KEY\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :StandardComponentTask/Id
:db/valueType :db.type/long
:db/cardinality :db.cardinality/one
:db/index true
:db/unique :db.unique/value
:db/doc \"StandardComponentTask.Id\"
:alexa.entity-type :et-StandardComponentTask
:db.install/_attribute :db.part/db}

;;\"StandardComponentTask\",\"ModifiedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :StandardComponentTask/ModifiedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"StandardComponentTask.ModifiedOn\"
:alexa.entity-type :et-StandardComponentTask
:db.install/_attribute :db.part/db}

;;\"StandardComponentTask\",\"StandardComponentId\",\"bigint\",\"NOT NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :StandardComponentTask/StandardComponent
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(StandardComponentTask StandardComponentId StandardComponent StandardComponent)\"
:alexa.entity-type :et-StandardComponentTask
:db.install/_attribute :db.part/db}

;;\"StandardComponentTask\",\"SurveySectionId\",\"bigint\",\"NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :StandardComponentTask/SurveySection
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(StandardComponentTask SurveySectionId SurveySection SurveySection)\"
:alexa.entity-type :et-StandardComponentTask
:db.install/_attribute :db.part/db}

;;\"StandardComponentTask\",\"TaskId\",\"bigint\",\"NOT NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :StandardComponentTask/Task
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(StandardComponentTask TaskId Task Task)\"
:alexa.entity-type :et-StandardComponentTask
:db.install/_attribute :db.part/db}

;;\"StandardComponentTask\",\"TaskResultScoreSetId\",\"bigint\",\"NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :StandardComponentTask/TaskResultScoreSet
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(StandardComponentTask TaskResultScoreSetId TaskResultScoreSet TaskResultScoreSet)\"
:alexa.entity-type :et-StandardComponentTask
:db.install/_attribute :db.part/db}

]"
"[;;\"StandardComponentVendorProduct\",\"Comments\",\"[nvarchar](1024)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :StandardComponentVendorProduct/Comments
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"StandardComponentVendorProduct.Comments\"
:alexa.entity-type :et-StandardComponentVendorProduct
:db.install/_attribute :db.part/db}

;;\"StandardComponentVendorProduct\",\"Coverage\",\"float\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :StandardComponentVendorProduct/Coverage
:db/valueType :db.type/float
:db/cardinality :db.cardinality/one
:db/doc \"StandardComponentVendorProduct.Coverage\"
:alexa.entity-type :et-StandardComponentVendorProduct
:db.install/_attribute :db.part/db}

;;\"StandardComponentVendorProduct\",\"CreatedBy_PersonId\",\"bigint\",\"NOT NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :StandardComponentVendorProduct/CreatedBy_Person
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(StandardComponentVendorProduct CreatedBy_PersonId Person CreatedBy_Person)\"
:alexa.entity-type :et-StandardComponentVendorProduct
:db.install/_attribute :db.part/db}

;;\"StandardComponentVendorProduct\",\"CreatedOn\",\"datetime\",\"NOT NULL\",\"[DF_StandardComponentVendorProduct_CreatedOn]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :StandardComponentVendorProduct/CreatedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"StandardComponentVendorProduct.CreatedOn\"
:alexa.entity-type :et-StandardComponentVendorProduct
:db.install/_attribute :db.part/db}

;;\"StandardComponentVendorProduct\",\"DeletedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :StandardComponentVendorProduct/DeletedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"StandardComponentVendorProduct.DeletedOn\"
:alexa.entity-type :et-StandardComponentVendorProduct
:db.install/_attribute :db.part/db}

;;\"StandardComponentVendorProduct\",\"EventHistoryId\",\"bigint\",\"NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :StandardComponentVendorProduct/EventHistory
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(StandardComponentVendorProduct EventHistoryId EventHistory EventHistory)\"
:alexa.entity-type :et-StandardComponentVendorProduct
:db.install/_attribute :db.part/db}

;;\"StandardComponentVendorProduct\",\"Id\",\"bigint\",\"NOT NULL\",\"\",\"IDENTITY\",\"PRIMARY KEY\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :StandardComponentVendorProduct/Id
:db/valueType :db.type/long
:db/cardinality :db.cardinality/one
:db/index true
:db/unique :db.unique/value
:db/doc \"StandardComponentVendorProduct.Id\"
:alexa.entity-type :et-StandardComponentVendorProduct
:db.install/_attribute :db.part/db}

;;\"StandardComponentVendorProduct\",\"Manual\",\"bit\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :StandardComponentVendorProduct/Manual
:db/valueType :db.type/boolean
:db/cardinality :db.cardinality/one
:db/doc \"StandardComponentVendorProduct.Manual\"
:alexa.entity-type :et-StandardComponentVendorProduct
:db.install/_attribute :db.part/db}

;;\"StandardComponentVendorProduct\",\"ModifiedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :StandardComponentVendorProduct/ModifiedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"StandardComponentVendorProduct.ModifiedOn\"
:alexa.entity-type :et-StandardComponentVendorProduct
:db.install/_attribute :db.part/db}

;;\"StandardComponentVendorProduct\",\"StandardComponentId\",\"bigint\",\"NOT NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :StandardComponentVendorProduct/StandardComponent
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(StandardComponentVendorProduct StandardComponentId StandardComponent StandardComponent)\"
:alexa.entity-type :et-StandardComponentVendorProduct
:db.install/_attribute :db.part/db}

;;\"StandardComponentVendorProduct\",\"VendorProductId\",\"bigint\",\"NOT NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :StandardComponentVendorProduct/VendorProduct
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(StandardComponentVendorProduct VendorProductId VendorProduct VendorProduct)\"
:alexa.entity-type :et-StandardComponentVendorProduct
:db.install/_attribute :db.part/db}

]"
"[;;\"StandardComponentVulnerability\",\"Comments\",\"[nvarchar](1024)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :StandardComponentVulnerability/Comments
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"StandardComponentVulnerability.Comments\"
:alexa.entity-type :et-StandardComponentVulnerability
:db.install/_attribute :db.part/db}

;;\"StandardComponentVulnerability\",\"Coverage\",\"float\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :StandardComponentVulnerability/Coverage
:db/valueType :db.type/float
:db/cardinality :db.cardinality/one
:db/doc \"StandardComponentVulnerability.Coverage\"
:alexa.entity-type :et-StandardComponentVulnerability
:db.install/_attribute :db.part/db}

;;\"StandardComponentVulnerability\",\"CreatedBy_PersonId\",\"bigint\",\"NOT NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :StandardComponentVulnerability/CreatedBy_Person
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(StandardComponentVulnerability CreatedBy_PersonId Person CreatedBy_Person)\"
:alexa.entity-type :et-StandardComponentVulnerability
:db.install/_attribute :db.part/db}

;;\"StandardComponentVulnerability\",\"CreatedOn\",\"datetime\",\"NOT NULL\",\"[DF_StandardComponentVulnerability_CreatedOn]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :StandardComponentVulnerability/CreatedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"StandardComponentVulnerability.CreatedOn\"
:alexa.entity-type :et-StandardComponentVulnerability
:db.install/_attribute :db.part/db}

;;\"StandardComponentVulnerability\",\"DeletedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :StandardComponentVulnerability/DeletedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"StandardComponentVulnerability.DeletedOn\"
:alexa.entity-type :et-StandardComponentVulnerability
:db.install/_attribute :db.part/db}

;;\"StandardComponentVulnerability\",\"EventHistoryId\",\"bigint\",\"NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :StandardComponentVulnerability/EventHistory
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(StandardComponentVulnerability EventHistoryId EventHistory EventHistory)\"
:alexa.entity-type :et-StandardComponentVulnerability
:db.install/_attribute :db.part/db}

;;\"StandardComponentVulnerability\",\"Id\",\"bigint\",\"NOT NULL\",\"\",\"IDENTITY\",\"PRIMARY KEY\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :StandardComponentVulnerability/Id
:db/valueType :db.type/long
:db/cardinality :db.cardinality/one
:db/index true
:db/unique :db.unique/value
:db/doc \"StandardComponentVulnerability.Id\"
:alexa.entity-type :et-StandardComponentVulnerability
:db.install/_attribute :db.part/db}

;;\"StandardComponentVulnerability\",\"Manual\",\"bit\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :StandardComponentVulnerability/Manual
:db/valueType :db.type/boolean
:db/cardinality :db.cardinality/one
:db/doc \"StandardComponentVulnerability.Manual\"
:alexa.entity-type :et-StandardComponentVulnerability
:db.install/_attribute :db.part/db}

;;\"StandardComponentVulnerability\",\"ModifiedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :StandardComponentVulnerability/ModifiedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"StandardComponentVulnerability.ModifiedOn\"
:alexa.entity-type :et-StandardComponentVulnerability
:db.install/_attribute :db.part/db}

;;\"StandardComponentVulnerability\",\"StandardComponentId\",\"bigint\",\"NOT NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :StandardComponentVulnerability/StandardComponent
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(StandardComponentVulnerability StandardComponentId StandardComponent StandardComponent)\"
:alexa.entity-type :et-StandardComponentVulnerability
:db.install/_attribute :db.part/db}

;;\"StandardComponentVulnerability\",\"VulnerabilityId\",\"bigint\",\"NOT NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :StandardComponentVulnerability/Vulnerability
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(StandardComponentVulnerability VulnerabilityId Vulnerability Vulnerability)\"
:alexa.entity-type :et-StandardComponentVulnerability
:db.install/_attribute :db.part/db}

]"
"[;;\"StandardComponentWeight\",\"CreatedOn\",\"datetime\",\"NOT NULL\",\"[DF_StandardComponentWeight_CreatedOn]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :StandardComponentWeight/CreatedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"StandardComponentWeight.CreatedOn\"
:alexa.entity-type :et-StandardComponentWeight
:db.install/_attribute :db.part/db}

;;\"StandardComponentWeight\",\"DeletedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :StandardComponentWeight/DeletedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"StandardComponentWeight.DeletedOn\"
:alexa.entity-type :et-StandardComponentWeight
:db.install/_attribute :db.part/db}

;;\"StandardComponentWeight\",\"Description\",\"[nvarchar](1024)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :StandardComponentWeight/Description
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"StandardComponentWeight.Description\"
:alexa.entity-type :et-StandardComponentWeight
:db.install/_attribute :db.part/db}

;;\"StandardComponentWeight\",\"Id\",\"bigint\",\"NOT NULL\",\"\",\"IDENTITY\",\"PRIMARY KEY\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :StandardComponentWeight/Id
:db/valueType :db.type/long
:db/cardinality :db.cardinality/one
:db/index true
:db/unique :db.unique/value
:db/doc \"StandardComponentWeight.Id\"
:alexa.entity-type :et-StandardComponentWeight
:db.install/_attribute :db.part/db}

;;\"StandardComponentWeight\",\"ModifiedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :StandardComponentWeight/ModifiedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"StandardComponentWeight.ModifiedOn\"
:alexa.entity-type :et-StandardComponentWeight
:db.install/_attribute :db.part/db}

;;\"StandardComponentWeight\",\"Name\",\"[nvarchar](256)\",\"NOT NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :StandardComponentWeight/Name
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"StandardComponentWeight.Name\"
:alexa.entity-type :et-StandardComponentWeight
:db.install/_attribute :db.part/db}

;;\"StandardComponentWeight\",\"Value\",\"float\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :StandardComponentWeight/Value
:db/valueType :db.type/float
:db/cardinality :db.cardinality/one
:db/doc \"StandardComponentWeight.Value\"
:alexa.entity-type :et-StandardComponentWeight
:db.install/_attribute :db.part/db}

]"
"[;;\"Standard\",\"Abbreviation\",\"[nvarchar](50)\",\"NOT NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Standard/Abbreviation
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"Standard.Abbreviation\"
:alexa.entity-type :et-Standard
:db.install/_attribute :db.part/db}

;;\"Standard\",\"AutoNumber\",\"bit\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Standard/AutoNumber
:db/valueType :db.type/boolean
:db/cardinality :db.cardinality/one
:db/doc \"Standard.AutoNumber\"
:alexa.entity-type :et-Standard
:db.install/_attribute :db.part/db}

;;\"Standard\",\"CreatedOn\",\"datetime\",\"NOT NULL\",\"[DF_Standard_CreatedOn]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Standard/CreatedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"Standard.CreatedOn\"
:alexa.entity-type :et-Standard
:db.install/_attribute :db.part/db}

;;\"Standard\",\"DeletedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Standard/DeletedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"Standard.DeletedOn\"
:alexa.entity-type :et-Standard
:db.install/_attribute :db.part/db}

;;\"Standard\",\"Description\",\"[nvarchar](1024)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Standard/Description
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"Standard.Description\"
:alexa.entity-type :et-Standard
:db.install/_attribute :db.part/db}

;;\"Standard\",\"DescriptionTitle\",\"[nvarchar](256)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Standard/DescriptionTitle
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"Standard.DescriptionTitle\"
:alexa.entity-type :et-Standard
:db.install/_attribute :db.part/db}

;;\"Standard\",\"Id\",\"bigint\",\"NOT NULL\",\"\",\"IDENTITY\",\"PRIMARY KEY\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Standard/Id
:db/valueType :db.type/long
:db/cardinality :db.cardinality/one
:db/index true
:db/unique :db.unique/value
:db/doc \"Standard.Id\"
:alexa.entity-type :et-Standard
:db.install/_attribute :db.part/db}

;;\"Standard\",\"IssuerName\",\"[nvarchar](256)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Standard/IssuerName
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"Standard.IssuerName\"
:alexa.entity-type :et-Standard
:db.install/_attribute :db.part/db}

;;\"Standard\",\"ModifiedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Standard/ModifiedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"Standard.ModifiedOn\"
:alexa.entity-type :et-Standard
:db.install/_attribute :db.part/db}

;;\"Standard\",\"Name\",\"[nvarchar](256)\",\"NOT NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Standard/Name
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"Standard.Name\"
:alexa.entity-type :et-Standard
:db.install/_attribute :db.part/db}

;;\"Standard\",\"ObjectivesTitle\",\"[nvarchar](256)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Standard/ObjectivesTitle
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"Standard.ObjectivesTitle\"
:alexa.entity-type :et-Standard
:db.install/_attribute :db.part/db}

;;\"Standard\",\"Originator\",\"[nvarchar](256)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Standard/Originator
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"Standard.Originator\"
:alexa.entity-type :et-Standard
:db.install/_attribute :db.part/db}

;;\"Standard\",\"ParentCategory\",\"[nvarchar](256)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Standard/ParentCategory
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"Standard.ParentCategory\"
:alexa.entity-type :et-Standard
:db.install/_attribute :db.part/db}

;;\"Standard\",\"ProceduresTitle\",\"[nvarchar](256)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Standard/ProceduresTitle
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"Standard.ProceduresTitle\"
:alexa.entity-type :et-Standard
:db.install/_attribute :db.part/db}

;;\"Standard\",\"ReferencesTitle\",\"[nvarchar](256)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Standard/ReferencesTitle
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"Standard.ReferencesTitle\"
:alexa.entity-type :et-Standard
:db.install/_attribute :db.part/db}

;;\"Standard\",\"RemediationTitle\",\"[nvarchar](256)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Standard/RemediationTitle
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"Standard.RemediationTitle\"
:alexa.entity-type :et-Standard
:db.install/_attribute :db.part/db}

;;\"Standard\",\"ShowAssetColumn\",\"bit\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Standard/ShowAssetColumn
:db/valueType :db.type/boolean
:db/cardinality :db.cardinality/one
:db/doc \"Standard.ShowAssetColumn\"
:alexa.entity-type :et-Standard
:db.install/_attribute :db.part/db}

{:db/id #db/id[:db.part/db]
:db/ident :Standard/AssetFilter
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/many
:db/doc \"(Standard StandardId AssetFilterStandard AssetFilterId AssetFilter)\"
:alexa.entity-type :et-Standard
:db.install/_attribute :db.part/db}

{:db/id #db/id[:db.part/db]
:db/ident :Standard/Incident
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/many
:db/doc \"(Standard StandardId IncidentStandard IncidentId Incident)\"
:alexa.entity-type :et-Standard
:db.install/_attribute :db.part/db}

{:db/id #db/id[:db.part/db]
:db/ident :Standard/Asset
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/many
:db/doc \"(Standard StandardId StandardAsset AssetId Asset)\"
:alexa.entity-type :et-Standard
:db.install/_attribute :db.part/db}

{:db/id #db/id[:db.part/db]
:db/ident :Standard/AttributeValue
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/many
:db/doc \"(Standard StandardId StandardAttributeValue AttributeValueId AttributeValue)\"
:alexa.entity-type :et-Standard
:db.install/_attribute :db.part/db}

{:db/id #db/id[:db.part/db]
:db/ident :Standard/DataType
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/many
:db/doc \"(Standard StandardId StandardDataType DataTypeId DataType)\"
:alexa.entity-type :et-Standard
:db.install/_attribute :db.part/db}

{:db/id #db/id[:db.part/db]
:db/ident :Standard/Subnet
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/many
:db/doc \"(Standard StandardId SubnetStandard SubnetId Subnet)\"
:alexa.entity-type :et-Standard
:db.install/_attribute :db.part/db}

]"
"[;;\"Subnet\",\"AddressRange\",\"[nvarchar](256)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Subnet/AddressRange
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"Subnet.AddressRange\"
:alexa.entity-type :et-Subnet
:db.install/_attribute :db.part/db}

;;\"Subnet\",\"CreatedOn\",\"datetime\",\"NOT NULL\",\"[DF_NetworkSegment_CreatedOn]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Subnet/CreatedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"Subnet.CreatedOn\"
:alexa.entity-type :et-Subnet
:db.install/_attribute :db.part/db}

;;\"Subnet\",\"DeletedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Subnet/DeletedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"Subnet.DeletedOn\"
:alexa.entity-type :et-Subnet
:db.install/_attribute :db.part/db}

;;\"Subnet\",\"Description\",\"[nvarchar](1024)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Subnet/Description
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"Subnet.Description\"
:alexa.entity-type :et-Subnet
:db.install/_attribute :db.part/db}

;;\"Subnet\",\"FirstInRange\",\"[varbinary](16)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Subnet/FirstInRange
:db/valueType :db.type/bigint
:db/cardinality :db.cardinality/one
:db/doc \"Subnet.FirstInRange\"
:alexa.entity-type :et-Subnet
:db.install/_attribute :db.part/db}

;;\"Subnet\",\"Id\",\"bigint\",\"NOT NULL\",\"\",\"IDENTITY\",\"PRIMARY KEY\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Subnet/Id
:db/valueType :db.type/long
:db/cardinality :db.cardinality/one
:db/index true
:db/unique :db.unique/value
:db/doc \"Subnet.Id\"
:alexa.entity-type :et-Subnet
:db.install/_attribute :db.part/db}

;;\"Subnet\",\"LastInRange\",\"[varbinary](16)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Subnet/LastInRange
:db/valueType :db.type/bigint
:db/cardinality :db.cardinality/one
:db/doc \"Subnet.LastInRange\"
:alexa.entity-type :et-Subnet
:db.install/_attribute :db.part/db}

;;\"Subnet\",\"ModifiedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Subnet/ModifiedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"Subnet.ModifiedOn\"
:alexa.entity-type :et-Subnet
:db.install/_attribute :db.part/db}

;;\"Subnet\",\"Name\",\"[nvarchar](256)\",\"NOT NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Subnet/Name
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"Subnet.Name\"
:alexa.entity-type :et-Subnet
:db.install/_attribute :db.part/db}

;;\"Subnet\",\"NetworkId\",\"bigint\",\"NOT NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :Subnet/Network
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(Subnet NetworkId Network Network)\"
:alexa.entity-type :et-Subnet
:db.install/_attribute :db.part/db}

{:db/id #db/id[:db.part/db]
:db/ident :Subnet/Standard
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/many
:db/doc \"(Subnet SubnetId SubnetStandard StandardId Standard)\"
:alexa.entity-type :et-Subnet
:db.install/_attribute :db.part/db}

]"
"[;;\"SubnetExposure\",\"CreatedOn\",\"datetime\",\"NOT NULL\",\"[DF_SubnetExposure_CreatedOn]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :SubnetExposure/CreatedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"SubnetExposure.CreatedOn\"
:alexa.entity-type :et-SubnetExposure
:db.install/_attribute :db.part/db}

;;\"SubnetExposure\",\"DeletedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :SubnetExposure/DeletedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"SubnetExposure.DeletedOn\"
:alexa.entity-type :et-SubnetExposure
:db.install/_attribute :db.part/db}

;;\"SubnetExposure\",\"ExposureCategoryId\",\"bigint\",\"NOT NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :SubnetExposure/ExposureCategory
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(SubnetExposure ExposureCategoryId ExposureCategory ExposureCategory)\"
:alexa.entity-type :et-SubnetExposure
:db.install/_attribute :db.part/db}

;;\"SubnetExposure\",\"ExposureId\",\"bigint\",\"NOT NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :SubnetExposure/Exposure
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(SubnetExposure ExposureId Exposure Exposure)\"
:alexa.entity-type :et-SubnetExposure
:db.install/_attribute :db.part/db}

;;\"SubnetExposure\",\"Id\",\"bigint\",\"NOT NULL\",\"\",\"IDENTITY\",\"PRIMARY KEY\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :SubnetExposure/Id
:db/valueType :db.type/long
:db/cardinality :db.cardinality/one
:db/index true
:db/unique :db.unique/value
:db/doc \"SubnetExposure.Id\"
:alexa.entity-type :et-SubnetExposure
:db.install/_attribute :db.part/db}

;;\"SubnetExposure\",\"ModifiedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :SubnetExposure/ModifiedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"SubnetExposure.ModifiedOn\"
:alexa.entity-type :et-SubnetExposure
:db.install/_attribute :db.part/db}

;;\"SubnetExposure\",\"SubnetId\",\"bigint\",\"NOT NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :SubnetExposure/Subnet
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(SubnetExposure SubnetId Subnet Subnet)\"
:alexa.entity-type :et-SubnetExposure
:db.install/_attribute :db.part/db}

]"
"[;;\"Survey\",\"CreatedBy_PersonId\",\"bigint\",\"NOT NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :Survey/CreatedBy_Person
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(Survey CreatedBy_PersonId Person CreatedBy_Person)\"
:alexa.entity-type :et-Survey
:db.install/_attribute :db.part/db}

;;\"Survey\",\"CreatedOn\",\"datetime\",\"NOT NULL\",\"[DF_Survey_CreatedOn]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Survey/CreatedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"Survey.CreatedOn\"
:alexa.entity-type :et-Survey
:db.install/_attribute :db.part/db}

;;\"Survey\",\"DeletedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Survey/DeletedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"Survey.DeletedOn\"
:alexa.entity-type :et-Survey
:db.install/_attribute :db.part/db}

;;\"Survey\",\"Description\",\"[nvarchar](1024)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Survey/Description
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"Survey.Description\"
:alexa.entity-type :et-Survey
:db.install/_attribute :db.part/db}

;;\"Survey\",\"EnableAttachAssets\",\"bit\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Survey/EnableAttachAssets
:db/valueType :db.type/boolean
:db/cardinality :db.cardinality/one
:db/doc \"Survey.EnableAttachAssets\"
:alexa.entity-type :et-Survey
:db.install/_attribute :db.part/db}

;;\"Survey\",\"EnableAttachDocuments\",\"bit\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Survey/EnableAttachDocuments
:db/valueType :db.type/boolean
:db/cardinality :db.cardinality/one
:db/doc \"Survey.EnableAttachDocuments\"
:alexa.entity-type :et-Survey
:db.install/_attribute :db.part/db}

;;\"Survey\",\"Id\",\"bigint\",\"NOT NULL\",\"\",\"IDENTITY\",\"PRIMARY KEY\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Survey/Id
:db/valueType :db.type/long
:db/cardinality :db.cardinality/one
:db/index true
:db/unique :db.unique/value
:db/doc \"Survey.Id\"
:alexa.entity-type :et-Survey
:db.install/_attribute :db.part/db}

;;\"Survey\",\"ModifiedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Survey/ModifiedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"Survey.ModifiedOn\"
:alexa.entity-type :et-Survey
:db.install/_attribute :db.part/db}

;;\"Survey\",\"Name\",\"[nvarchar](256)\",\"NOT NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Survey/Name
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"Survey.Name\"
:alexa.entity-type :et-Survey
:db.install/_attribute :db.part/db}

;;\"Survey\",\"RequireComments\",\"bit\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Survey/RequireComments
:db/valueType :db.type/boolean
:db/cardinality :db.cardinality/one
:db/doc \"Survey.RequireComments\"
:alexa.entity-type :et-Survey
:db.install/_attribute :db.part/db}

]"
"[;;\"SurveySection\",\"CreatedOn\",\"datetime\",\"NOT NULL\",\"[DF_SurveySection_CreatedOn]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :SurveySection/CreatedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"SurveySection.CreatedOn\"
:alexa.entity-type :et-SurveySection
:db.install/_attribute :db.part/db}

;;\"SurveySection\",\"DeletedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :SurveySection/DeletedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"SurveySection.DeletedOn\"
:alexa.entity-type :et-SurveySection
:db.install/_attribute :db.part/db}

;;\"SurveySection\",\"Id\",\"bigint\",\"NOT NULL\",\"\",\"IDENTITY\",\"PRIMARY KEY\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :SurveySection/Id
:db/valueType :db.type/long
:db/cardinality :db.cardinality/one
:db/index true
:db/unique :db.unique/value
:db/doc \"SurveySection.Id\"
:alexa.entity-type :et-SurveySection
:db.install/_attribute :db.part/db}

;;\"SurveySection\",\"ModifiedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :SurveySection/ModifiedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"SurveySection.ModifiedOn\"
:alexa.entity-type :et-SurveySection
:db.install/_attribute :db.part/db}

;;\"SurveySection\",\"Question\",\"[nvarchar](256)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :SurveySection/Question
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"SurveySection.Question\"
:alexa.entity-type :et-SurveySection
:db.install/_attribute :db.part/db}

;;\"SurveySection\",\"SortKey\",\"[nvarchar](50)\",\"NOT NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :SurveySection/SortKey
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"SurveySection.SortKey\"
:alexa.entity-type :et-SurveySection
:db.install/_attribute :db.part/db}

;;\"SurveySection\",\"SurveyId\",\"bigint\",\"NOT NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :SurveySection/Survey
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(SurveySection SurveyId Survey Survey)\"
:alexa.entity-type :et-SurveySection
:db.install/_attribute :db.part/db}

;;\"SurveySection\",\"Title\",\"[nvarchar](256)\",\"NOT NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :SurveySection/Title
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"SurveySection.Title\"
:alexa.entity-type :et-SurveySection
:db.install/_attribute :db.part/db}

;;\"SurveySection\",\"Type\",\"int\",\"NOT NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :SurveySection/Type
:db/valueType :db.type/long
:db/cardinality :db.cardinality/one
:db/doc \"SurveySection.Type\"
:alexa.entity-type :et-SurveySection
:db.install/_attribute :db.part/db}

{:db/id #db/id[:db.part/db]
:db/ident :SurveySection/Role
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/many
:db/doc \"(SurveySection SurveySectionId SurveySectionRole RoleId Role)\"
:alexa.entity-type :et-SurveySection
:db.install/_attribute :db.part/db}

{:db/id #db/id[:db.part/db]
:db/ident :SurveySection/StandardComponent
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/many
:db/doc \"(SurveySection SurveySectionId SurveySectionStandardComponent StandardComponentId StandardComponent)\"
:alexa.entity-type :et-SurveySection
:db.install/_attribute :db.part/db}

]"
"[;;\"SurveySectionChoice\",\"Choice\",\"[nvarchar](50)\",\"NOT NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :SurveySectionChoice/Choice
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"SurveySectionChoice.Choice\"
:alexa.entity-type :et-SurveySectionChoice
:db.install/_attribute :db.part/db}

;;\"SurveySectionChoice\",\"CreatedOn\",\"datetime\",\"NOT NULL\",\"[DF_SurveySectionChoice_CreatedOn]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :SurveySectionChoice/CreatedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"SurveySectionChoice.CreatedOn\"
:alexa.entity-type :et-SurveySectionChoice
:db.install/_attribute :db.part/db}

;;\"SurveySectionChoice\",\"DeletedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :SurveySectionChoice/DeletedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"SurveySectionChoice.DeletedOn\"
:alexa.entity-type :et-SurveySectionChoice
:db.install/_attribute :db.part/db}

;;\"SurveySectionChoice\",\"Id\",\"bigint\",\"NOT NULL\",\"\",\"IDENTITY\",\"PRIMARY KEY\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :SurveySectionChoice/Id
:db/valueType :db.type/long
:db/cardinality :db.cardinality/one
:db/index true
:db/unique :db.unique/value
:db/doc \"SurveySectionChoice.Id\"
:alexa.entity-type :et-SurveySectionChoice
:db.install/_attribute :db.part/db}

;;\"SurveySectionChoice\",\"ModifiedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :SurveySectionChoice/ModifiedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"SurveySectionChoice.ModifiedOn\"
:alexa.entity-type :et-SurveySectionChoice
:db.install/_attribute :db.part/db}

;;\"SurveySectionChoice\",\"SurveySectionId\",\"bigint\",\"NOT NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :SurveySectionChoice/SurveySection
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(SurveySectionChoice SurveySectionId SurveySection SurveySection)\"
:alexa.entity-type :et-SurveySectionChoice
:db.install/_attribute :db.part/db}

;;\"SurveySectionChoice\",\"ToSurveySectionId\",\"bigint\",\"NOT NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :SurveySectionChoice/ToSurveySection
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(SurveySectionChoice ToSurveySectionId SurveySection ToSurveySection)\"
:alexa.entity-type :et-SurveySectionChoice
:db.install/_attribute :db.part/db}

]"
"[;;\"Task\",\"AssignTo\",\"[nvarchar](256)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Task/AssignTo
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"Task.AssignTo\"
:alexa.entity-type :et-Task
:db.install/_attribute :db.part/db}

;;\"Task\",\"ConfigGUID\",\"uniqueidentifier\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Task/ConfigGUID
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"Task.ConfigGUID\"
:alexa.entity-type :et-Task
:db.install/_attribute :db.part/db}

;;\"Task\",\"CreatedOn\",\"datetime\",\"NOT NULL\",\"[DF_AuditTask_CreatedOn]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Task/CreatedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"Task.CreatedOn\"
:alexa.entity-type :et-Task
:db.install/_attribute :db.part/db}

;;\"Task\",\"Data\",\"[varbinary](MAX)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Task/Data
:db/valueType :db.type/uri
:db/cardinality :db.cardinality/one
:db/doc \"Task.Data\"
:alexa.entity-type :et-Task
:db.install/_attribute :db.part/db}

;;\"Task\",\"DeletedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Task/DeletedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"Task.DeletedOn\"
:alexa.entity-type :et-Task
:db.install/_attribute :db.part/db}

;;\"Task\",\"Description\",\"[nvarchar](MAX)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Task/Description
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"Task.Description\"
:alexa.entity-type :et-Task
:db.install/_attribute :db.part/db}

;;\"Task\",\"ExternalKey\",\"[nvarchar](100)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Task/ExternalKey
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"Task.ExternalKey\"
:alexa.entity-type :et-Task
:db.install/_attribute :db.part/db}

;;\"Task\",\"Id\",\"bigint\",\"NOT NULL\",\"\",\"IDENTITY\",\"PRIMARY KEY\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Task/Id
:db/valueType :db.type/long
:db/cardinality :db.cardinality/one
:db/index true
:db/unique :db.unique/value
:db/doc \"Task.Id\"
:alexa.entity-type :et-Task
:db.install/_attribute :db.part/db}

;;\"Task\",\"IsCanceled\",\"bit\",\"NULL\",\"[DF_Task_IsCanceled]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Task/IsCanceled
:db/valueType :db.type/boolean
:db/cardinality :db.cardinality/one
:db/doc \"Task.IsCanceled\"
:alexa.entity-type :et-Task
:db.install/_attribute :db.part/db}

;;\"Task\",\"ModifiedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Task/ModifiedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"Task.ModifiedOn\"
:alexa.entity-type :et-Task
:db.install/_attribute :db.part/db}

;;\"Task\",\"Name\",\"[nvarchar](256)\",\"NOT NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Task/Name
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"Task.Name\"
:alexa.entity-type :et-Task
:db.install/_attribute :db.part/db}

;;\"Task\",\"Objectives\",\"[nvarchar](MAX)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Task/Objectives
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"Task.Objectives\"
:alexa.entity-type :et-Task
:db.install/_attribute :db.part/db}

;;\"Task\",\"Procedures\",\"[nvarchar](MAX)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Task/Procedures
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"Task.Procedures\"
:alexa.entity-type :et-Task
:db.install/_attribute :db.part/db}

;;\"Task\",\"ProjectId\",\"bigint\",\"NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :Task/Project
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(Task ProjectId Project Project)\"
:alexa.entity-type :et-Task
:db.install/_attribute :db.part/db}

;;\"Task\",\"References\",\"[nvarchar](MAX)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Task/References
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"Task.References\"
:alexa.entity-type :et-Task
:db.install/_attribute :db.part/db}

;;\"Task\",\"Response\",\"[nvarchar](MAX)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Task/Response
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"Task.Response\"
:alexa.entity-type :et-Task
:db.install/_attribute :db.part/db}

;;\"Task\",\"SentOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Task/SentOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"Task.SentOn\"
:alexa.entity-type :et-Task
:db.install/_attribute :db.part/db}

;;\"Task\",\"SentStatus\",\"int\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Task/SentStatus
:db/valueType :db.type/long
:db/cardinality :db.cardinality/one
:db/doc \"Task.SentStatus\"
:alexa.entity-type :et-Task
:db.install/_attribute :db.part/db}

;;\"Task\",\"SentTo\",\"[nvarchar](256)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Task/SentTo
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"Task.SentTo\"
:alexa.entity-type :et-Task
:db.install/_attribute :db.part/db}

;;\"Task\",\"SortKey\",\"[nvarchar](100)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Task/SortKey
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"Task.SortKey\"
:alexa.entity-type :et-Task
:db.install/_attribute :db.part/db}

;;\"Task\",\"TaskGUID\",\"uniqueidentifier\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Task/TaskGUID
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"Task.TaskGUID\"
:alexa.entity-type :et-Task
:db.install/_attribute :db.part/db}

;;\"Task\",\"TaskTypeId\",\"bigint\",\"NOT NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :Task/TaskType
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(Task TaskTypeId TaskType TaskType)\"
:alexa.entity-type :et-Task
:db.install/_attribute :db.part/db}

{:db/id #db/id[:db.part/db]
:db/ident :Task/AssetExposureMitigationStatus
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/many
:db/doc \"(Task TaskId AssetExposureMitigationStatusTask AssetExposureMitigationStatusId AssetExposureMitigationStatus)\"
:alexa.entity-type :et-Task
:db.install/_attribute :db.part/db}

{:db/id #db/id[:db.part/db]
:db/ident :Task/AssetVulnerabilityMitigationStatus
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/many
:db/doc \"(Task TaskId AssetVulnerabilityMitigationStatusTask AssetVulnerabilityMitigationStatusId AssetVulnerabilityMitigationStatus)\"
:alexa.entity-type :et-Task
:db.install/_attribute :db.part/db}

{:db/id #db/id[:db.part/db]
:db/ident :Task/DataFindingMitigationStatus
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/many
:db/doc \"(Task TaskId DataFindingMitigationStatusTask DataFindingMitigationStatusId DataFindingMitigationStatus)\"
:alexa.entity-type :et-Task
:db.install/_attribute :db.part/db}

{:db/id #db/id[:db.part/db]
:db/ident :Task/Notification
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/many
:db/doc \"(Task TaskId TaskNotification NotificationId Notification)\"
:alexa.entity-type :et-Task
:db.install/_attribute :db.part/db}

{:db/id #db/id[:db.part/db]
:db/ident :Task/TaskResultOutcome
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/many
:db/doc \"(Task TaskId TaskResultOutcomeTask TaskResultOutcomeId TaskResultOutcome)\"
:alexa.entity-type :et-Task
:db.install/_attribute :db.part/db}

]"
"[;;\"TaskPerformance\",\"Comments\",\"[nvarchar](MAX)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :TaskPerformance/Comments
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"TaskPerformance.Comments\"
:alexa.entity-type :et-TaskPerformance
:db.install/_attribute :db.part/db}

;;\"TaskPerformance\",\"CreatedOn\",\"datetime\",\"NOT NULL\",\"[DF_AuditTaskPerson_CreatedOn_1]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :TaskPerformance/CreatedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"TaskPerformance.CreatedOn\"
:alexa.entity-type :et-TaskPerformance
:db.install/_attribute :db.part/db}

;;\"TaskPerformance\",\"DeletedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :TaskPerformance/DeletedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"TaskPerformance.DeletedOn\"
:alexa.entity-type :et-TaskPerformance
:db.install/_attribute :db.part/db}

;;\"TaskPerformance\",\"DueOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :TaskPerformance/DueOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"TaskPerformance.DueOn\"
:alexa.entity-type :et-TaskPerformance
:db.install/_attribute :db.part/db}

;;\"TaskPerformance\",\"Id\",\"bigint\",\"NOT NULL\",\"\",\"IDENTITY\",\"PRIMARY KEY\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :TaskPerformance/Id
:db/valueType :db.type/long
:db/cardinality :db.cardinality/one
:db/index true
:db/unique :db.unique/value
:db/doc \"TaskPerformance.Id\"
:alexa.entity-type :et-TaskPerformance
:db.install/_attribute :db.part/db}

;;\"TaskPerformance\",\"ModifiedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :TaskPerformance/ModifiedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"TaskPerformance.ModifiedOn\"
:alexa.entity-type :et-TaskPerformance
:db.install/_attribute :db.part/db}

;;\"TaskPerformance\",\"NotificationRuleSetId\",\"bigint\",\"NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :TaskPerformance/NotificationRuleSet
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(TaskPerformance NotificationRuleSetId NotificationRuleSet NotificationRuleSet)\"
:alexa.entity-type :et-TaskPerformance
:db.install/_attribute :db.part/db}

;;\"TaskPerformance\",\"PerformerId\",\"bigint\",\"NOT NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :TaskPerformance/Performer
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(TaskPerformance PerformerId Performer Performer)\"
:alexa.entity-type :et-TaskPerformance
:db.install/_attribute :db.part/db}

;;\"TaskPerformance\",\"PriorityId\",\"bigint\",\"NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :TaskPerformance/Priority
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(TaskPerformance PriorityId Priority Priority)\"
:alexa.entity-type :et-TaskPerformance
:db.install/_attribute :db.part/db}

;;\"TaskPerformance\",\"TaskId\",\"bigint\",\"NOT NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :TaskPerformance/Task
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(TaskPerformance TaskId Task Task)\"
:alexa.entity-type :et-TaskPerformance
:db.install/_attribute :db.part/db}

;;\"TaskPerformance\",\"TaskPerformanceStatusId\",\"bigint\",\"NOT NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :TaskPerformance/TaskPerformanceStatus
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(TaskPerformance TaskPerformanceStatusId TaskPerformanceStatus TaskPerformanceStatus)\"
:alexa.entity-type :et-TaskPerformance
:db.install/_attribute :db.part/db}

{:db/id #db/id[:db.part/db]
:db/ident :TaskPerformance/DataFile
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/many
:db/doc \"(TaskPerformance TaskPerformanceId TaskPerformanceReference ReferenceId Reference)\"
:alexa.entity-type :et-TaskPerformance
:db.install/_attribute :db.part/db}

]"
"[;;\"TaskPerformanceEvent\",\"AssignedPerformerId\",\"bigint\",\"NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :TaskPerformanceEvent/AssignedPerformer
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(TaskPerformanceEvent AssignedPerformerId Performer AssignedPerformer)\"
:alexa.entity-type :et-TaskPerformanceEvent
:db.install/_attribute :db.part/db}

;;\"TaskPerformanceEvent\",\"CreatedOn\",\"datetime\",\"NOT NULL\",\"[DF_TaskPerformanceEvent_CreatedOn]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :TaskPerformanceEvent/CreatedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"TaskPerformanceEvent.CreatedOn\"
:alexa.entity-type :et-TaskPerformanceEvent
:db.install/_attribute :db.part/db}

;;\"TaskPerformanceEvent\",\"DeletedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :TaskPerformanceEvent/DeletedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"TaskPerformanceEvent.DeletedOn\"
:alexa.entity-type :et-TaskPerformanceEvent
:db.install/_attribute :db.part/db}

;;\"TaskPerformanceEvent\",\"Description\",\"[nvarchar](1024)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :TaskPerformanceEvent/Description
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"TaskPerformanceEvent.Description\"
:alexa.entity-type :et-TaskPerformanceEvent
:db.install/_attribute :db.part/db}

;;\"TaskPerformanceEvent\",\"Id\",\"bigint\",\"NOT NULL\",\"\",\"IDENTITY\",\"PRIMARY KEY\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :TaskPerformanceEvent/Id
:db/valueType :db.type/long
:db/cardinality :db.cardinality/one
:db/index true
:db/unique :db.unique/value
:db/doc \"TaskPerformanceEvent.Id\"
:alexa.entity-type :et-TaskPerformanceEvent
:db.install/_attribute :db.part/db}

;;\"TaskPerformanceEvent\",\"LoginPersonId\",\"bigint\",\"NOT NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :TaskPerformanceEvent/LoginPerson
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(TaskPerformanceEvent LoginPersonId Person LoginPerson)\"
:alexa.entity-type :et-TaskPerformanceEvent
:db.install/_attribute :db.part/db}

;;\"TaskPerformanceEvent\",\"ModifiedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :TaskPerformanceEvent/ModifiedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"TaskPerformanceEvent.ModifiedOn\"
:alexa.entity-type :et-TaskPerformanceEvent
:db.install/_attribute :db.part/db}

;;\"TaskPerformanceEvent\",\"PolicySectionTextId\",\"bigint\",\"NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :TaskPerformanceEvent/PolicySectionText
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(TaskPerformanceEvent PolicySectionTextId PolicySectionText PolicySectionText)\"
:alexa.entity-type :et-TaskPerformanceEvent
:db.install/_attribute :db.part/db}

;;\"TaskPerformanceEvent\",\"PrevAssignedPerformerId\",\"bigint\",\"NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :TaskPerformanceEvent/PrevAssignedPerformer
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(TaskPerformanceEvent PrevAssignedPerformerId Performer PrevAssignedPerformer)\"
:alexa.entity-type :et-TaskPerformanceEvent
:db.install/_attribute :db.part/db}

;;\"TaskPerformanceEvent\",\"TaskPerformanceId\",\"bigint\",\"NOT NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :TaskPerformanceEvent/TaskPerformance
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(TaskPerformanceEvent TaskPerformanceId TaskPerformance TaskPerformance)\"
:alexa.entity-type :et-TaskPerformanceEvent
:db.install/_attribute :db.part/db}

;;\"TaskPerformanceEvent\",\"TaskPerformanceNoteId\",\"bigint\",\"NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :TaskPerformanceEvent/TaskPerformanceNote
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(TaskPerformanceEvent TaskPerformanceNoteId TaskPerformanceNote TaskPerformanceNote)\"
:alexa.entity-type :et-TaskPerformanceEvent
:db.install/_attribute :db.part/db}

;;\"TaskPerformanceEvent\",\"TaskPerformanceNotificationId\",\"bigint\",\"NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :TaskPerformanceEvent/TaskPerformanceNotification
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(TaskPerformanceEvent TaskPerformanceNotificationId TaskPerformanceNotification TaskPerformanceNotification)\"
:alexa.entity-type :et-TaskPerformanceEvent
:db.install/_attribute :db.part/db}

;;\"TaskPerformanceEvent\",\"TaskPerformanceStatusId\",\"bigint\",\"NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :TaskPerformanceEvent/TaskPerformanceStatus
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(TaskPerformanceEvent TaskPerformanceStatusId TaskPerformanceStatus TaskPerformanceStatus)\"
:alexa.entity-type :et-TaskPerformanceEvent
:db.install/_attribute :db.part/db}

;;\"TaskPerformanceEvent\",\"TaskResultId\",\"bigint\",\"NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :TaskPerformanceEvent/TaskResult
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(TaskPerformanceEvent TaskResultId TaskResult TaskResult)\"
:alexa.entity-type :et-TaskPerformanceEvent
:db.install/_attribute :db.part/db}

;;\"TaskPerformanceEvent\",\"TaskResultOutcomeApprovalId\",\"bigint\",\"NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :TaskPerformanceEvent/TaskResultOutcomeApproval
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(TaskPerformanceEvent TaskResultOutcomeApprovalId TaskResultOutcomeApproval TaskResultOutcomeApproval)\"
:alexa.entity-type :et-TaskPerformanceEvent
:db.install/_attribute :db.part/db}

;;\"TaskPerformanceEvent\",\"TaskResultOutcomeId\",\"bigint\",\"NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :TaskPerformanceEvent/TaskResultOutcome
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(TaskPerformanceEvent TaskResultOutcomeId TaskResultOutcome TaskResultOutcome)\"
:alexa.entity-type :et-TaskPerformanceEvent
:db.install/_attribute :db.part/db}

;;\"TaskPerformanceEvent\",\"TaskResultStatusId\",\"bigint\",\"NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :TaskPerformanceEvent/TaskResultStatus
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(TaskPerformanceEvent TaskResultStatusId TaskResultStatus TaskResultStatus)\"
:alexa.entity-type :et-TaskPerformanceEvent
:db.install/_attribute :db.part/db}

]"
"[;;\"TaskPerformancePerformer\",\"CreatedOn\",\"datetime\",\"NOT NULL\",\"[DF_TaskPerformancePerformer_CreatedOn]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :TaskPerformancePerformer/CreatedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"TaskPerformancePerformer.CreatedOn\"
:alexa.entity-type :et-TaskPerformancePerformer
:db.install/_attribute :db.part/db}

;;\"TaskPerformancePerformer\",\"DeletedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :TaskPerformancePerformer/DeletedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"TaskPerformancePerformer.DeletedOn\"
:alexa.entity-type :et-TaskPerformancePerformer
:db.install/_attribute :db.part/db}

;;\"TaskPerformancePerformer\",\"Id\",\"bigint\",\"NOT NULL\",\"\",\"IDENTITY\",\"PRIMARY KEY\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :TaskPerformancePerformer/Id
:db/valueType :db.type/long
:db/cardinality :db.cardinality/one
:db/index true
:db/unique :db.unique/value
:db/doc \"TaskPerformancePerformer.Id\"
:alexa.entity-type :et-TaskPerformancePerformer
:db.install/_attribute :db.part/db}

;;\"TaskPerformancePerformer\",\"ModifiedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :TaskPerformancePerformer/ModifiedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"TaskPerformancePerformer.ModifiedOn\"
:alexa.entity-type :et-TaskPerformancePerformer
:db.install/_attribute :db.part/db}

;;\"TaskPerformancePerformer\",\"PerformerId\",\"bigint\",\"NOT NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :TaskPerformancePerformer/Performer
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(TaskPerformancePerformer PerformerId Performer Performer)\"
:alexa.entity-type :et-TaskPerformancePerformer
:db.install/_attribute :db.part/db}

;;\"TaskPerformancePerformer\",\"TaskPerformanceId\",\"bigint\",\"NOT NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :TaskPerformancePerformer/TaskPerformance
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(TaskPerformancePerformer TaskPerformanceId TaskPerformance TaskPerformance)\"
:alexa.entity-type :et-TaskPerformancePerformer
:db.install/_attribute :db.part/db}

;;\"TaskPerformancePerformer\",\"TaskRole\",\"int\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :TaskPerformancePerformer/TaskRole
:db/valueType :db.type/long
:db/cardinality :db.cardinality/one
:db/doc \"TaskPerformancePerformer.TaskRole\"
:alexa.entity-type :et-TaskPerformancePerformer
:db.install/_attribute :db.part/db}

]"
"[;;\"TaskPerformanceNote\",\"CreatedOn\",\"datetime\",\"NOT NULL\",\"[DF_TaskPerformanceNote_CreatedOn]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :TaskPerformanceNote/CreatedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"TaskPerformanceNote.CreatedOn\"
:alexa.entity-type :et-TaskPerformanceNote
:db.install/_attribute :db.part/db}

;;\"TaskPerformanceNote\",\"DeletedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :TaskPerformanceNote/DeletedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"TaskPerformanceNote.DeletedOn\"
:alexa.entity-type :et-TaskPerformanceNote
:db.install/_attribute :db.part/db}

;;\"TaskPerformanceNote\",\"Id\",\"bigint\",\"NOT NULL\",\"\",\"IDENTITY\",\"PRIMARY KEY\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :TaskPerformanceNote/Id
:db/valueType :db.type/long
:db/cardinality :db.cardinality/one
:db/index true
:db/unique :db.unique/value
:db/doc \"TaskPerformanceNote.Id\"
:alexa.entity-type :et-TaskPerformanceNote
:db.install/_attribute :db.part/db}

;;\"TaskPerformanceNote\",\"ModifiedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :TaskPerformanceNote/ModifiedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"TaskPerformanceNote.ModifiedOn\"
:alexa.entity-type :et-TaskPerformanceNote
:db.install/_attribute :db.part/db}

;;\"TaskPerformanceNote\",\"NoteId\",\"bigint\",\"NOT NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :TaskPerformanceNote/Note
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(TaskPerformanceNote NoteId Note Note)\"
:alexa.entity-type :et-TaskPerformanceNote
:db.install/_attribute :db.part/db}

;;\"TaskPerformanceNote\",\"TaskPerformanceId\",\"bigint\",\"NOT NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :TaskPerformanceNote/TaskPerformance
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(TaskPerformanceNote TaskPerformanceId TaskPerformance TaskPerformance)\"
:alexa.entity-type :et-TaskPerformanceNote
:db.install/_attribute :db.part/db}

]"
"[;;\"TaskPerformanceNotification\",\"CreatedOn\",\"datetime\",\"NOT NULL\",\"[DF_TaskPersonNotification_CreatedOn]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :TaskPerformanceNotification/CreatedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"TaskPerformanceNotification.CreatedOn\"
:alexa.entity-type :et-TaskPerformanceNotification
:db.install/_attribute :db.part/db}

;;\"TaskPerformanceNotification\",\"DeletedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :TaskPerformanceNotification/DeletedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"TaskPerformanceNotification.DeletedOn\"
:alexa.entity-type :et-TaskPerformanceNotification
:db.install/_attribute :db.part/db}

;;\"TaskPerformanceNotification\",\"Id\",\"bigint\",\"NOT NULL\",\"\",\"IDENTITY\",\"PRIMARY KEY\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :TaskPerformanceNotification/Id
:db/valueType :db.type/long
:db/cardinality :db.cardinality/one
:db/index true
:db/unique :db.unique/value
:db/doc \"TaskPerformanceNotification.Id\"
:alexa.entity-type :et-TaskPerformanceNotification
:db.install/_attribute :db.part/db}

;;\"TaskPerformanceNotification\",\"ModifiedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :TaskPerformanceNotification/ModifiedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"TaskPerformanceNotification.ModifiedOn\"
:alexa.entity-type :et-TaskPerformanceNotification
:db.install/_attribute :db.part/db}

;;\"TaskPerformanceNotification\",\"NotificationId\",\"bigint\",\"NOT NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :TaskPerformanceNotification/Notification
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(TaskPerformanceNotification NotificationId Notification Notification)\"
:alexa.entity-type :et-TaskPerformanceNotification
:db.install/_attribute :db.part/db}

;;\"TaskPerformanceNotification\",\"NotificationRuleId\",\"bigint\",\"NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :TaskPerformanceNotification/NotificationRule
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(TaskPerformanceNotification NotificationRuleId NotificationRule NotificationRule)\"
:alexa.entity-type :et-TaskPerformanceNotification
:db.install/_attribute :db.part/db}

;;\"TaskPerformanceNotification\",\"TaskPerformanceId\",\"bigint\",\"NOT NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :TaskPerformanceNotification/TaskPerformance
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(TaskPerformanceNotification TaskPerformanceId TaskPerformance TaskPerformance)\"
:alexa.entity-type :et-TaskPerformanceNotification
:db.install/_attribute :db.part/db}

]"
"[;;\"TaskPerformanceObject\",\"AssetGroupId\",\"bigint\",\"NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :TaskPerformanceObject/AssetGroup
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(TaskPerformanceObject AssetGroupId AssetGroup AssetGroup)\"
:alexa.entity-type :et-TaskPerformanceObject
:db.install/_attribute :db.part/db}

;;\"TaskPerformanceObject\",\"AssetId\",\"bigint\",\"NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :TaskPerformanceObject/Asset
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(TaskPerformanceObject AssetId Asset Asset)\"
:alexa.entity-type :et-TaskPerformanceObject
:db.install/_attribute :db.part/db}

;;\"TaskPerformanceObject\",\"CreatedOn\",\"datetime\",\"NOT NULL\",\"[DF_TaskPerformanceObject_CreatedOn]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :TaskPerformanceObject/CreatedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"TaskPerformanceObject.CreatedOn\"
:alexa.entity-type :et-TaskPerformanceObject
:db.install/_attribute :db.part/db}

;;\"TaskPerformanceObject\",\"DeletedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :TaskPerformanceObject/DeletedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"TaskPerformanceObject.DeletedOn\"
:alexa.entity-type :et-TaskPerformanceObject
:db.install/_attribute :db.part/db}

;;\"TaskPerformanceObject\",\"Id\",\"bigint\",\"NOT NULL\",\"\",\"IDENTITY\",\"PRIMARY KEY\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :TaskPerformanceObject/Id
:db/valueType :db.type/long
:db/cardinality :db.cardinality/one
:db/index true
:db/unique :db.unique/value
:db/doc \"TaskPerformanceObject.Id\"
:alexa.entity-type :et-TaskPerformanceObject
:db.install/_attribute :db.part/db}

;;\"TaskPerformanceObject\",\"ModifiedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :TaskPerformanceObject/ModifiedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"TaskPerformanceObject.ModifiedOn\"
:alexa.entity-type :et-TaskPerformanceObject
:db.install/_attribute :db.part/db}

;;\"TaskPerformanceObject\",\"PersonId\",\"bigint\",\"NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :TaskPerformanceObject/Person
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(TaskPerformanceObject PersonId Person Person)\"
:alexa.entity-type :et-TaskPerformanceObject
:db.install/_attribute :db.part/db}

;;\"TaskPerformanceObject\",\"ProcedureId\",\"bigint\",\"NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :TaskPerformanceObject/Procedure
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(TaskPerformanceObject ProcedureId Procedure Procedure)\"
:alexa.entity-type :et-TaskPerformanceObject
:db.install/_attribute :db.part/db}

;;\"TaskPerformanceObject\",\"TaskPerformanceId\",\"bigint\",\"NOT NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :TaskPerformanceObject/TaskPerformance
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(TaskPerformanceObject TaskPerformanceId TaskPerformance TaskPerformance)\"
:alexa.entity-type :et-TaskPerformanceObject
:db.install/_attribute :db.part/db}

]"
"[;;\"TaskPerformanceStatus\",\"BackColorName\",\"[nvarchar](50)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :TaskPerformanceStatus/BackColorName
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"TaskPerformanceStatus.BackColorName\"
:alexa.entity-type :et-TaskPerformanceStatus
:db.install/_attribute :db.part/db}

;;\"TaskPerformanceStatus\",\"CreatedOn\",\"datetime\",\"NOT NULL\",\"[DF_TaskPerformanceStatus_CreatedOn]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :TaskPerformanceStatus/CreatedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"TaskPerformanceStatus.CreatedOn\"
:alexa.entity-type :et-TaskPerformanceStatus
:db.install/_attribute :db.part/db}

;;\"TaskPerformanceStatus\",\"DeletedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :TaskPerformanceStatus/DeletedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"TaskPerformanceStatus.DeletedOn\"
:alexa.entity-type :et-TaskPerformanceStatus
:db.install/_attribute :db.part/db}

;;\"TaskPerformanceStatus\",\"Description\",\"[nvarchar](1024)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :TaskPerformanceStatus/Description
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"TaskPerformanceStatus.Description\"
:alexa.entity-type :et-TaskPerformanceStatus
:db.install/_attribute :db.part/db}

;;\"TaskPerformanceStatus\",\"ForeColorName\",\"[nvarchar](50)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :TaskPerformanceStatus/ForeColorName
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"TaskPerformanceStatus.ForeColorName\"
:alexa.entity-type :et-TaskPerformanceStatus
:db.install/_attribute :db.part/db}

;;\"TaskPerformanceStatus\",\"Id\",\"bigint\",\"NOT NULL\",\"\",\"IDENTITY\",\"PRIMARY KEY\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :TaskPerformanceStatus/Id
:db/valueType :db.type/long
:db/cardinality :db.cardinality/one
:db/index true
:db/unique :db.unique/value
:db/doc \"TaskPerformanceStatus.Id\"
:alexa.entity-type :et-TaskPerformanceStatus
:db.install/_attribute :db.part/db}

;;\"TaskPerformanceStatus\",\"ModifiedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :TaskPerformanceStatus/ModifiedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"TaskPerformanceStatus.ModifiedOn\"
:alexa.entity-type :et-TaskPerformanceStatus
:db.install/_attribute :db.part/db}

;;\"TaskPerformanceStatus\",\"Name\",\"[nvarchar](256)\",\"NOT NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :TaskPerformanceStatus/Name
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"TaskPerformanceStatus.Name\"
:alexa.entity-type :et-TaskPerformanceStatus
:db.install/_attribute :db.part/db}

]"
"[;;\"TaskResult\",\"Comments\",\"[nvarchar](MAX)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :TaskResult/Comments
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"TaskResult.Comments\"
:alexa.entity-type :et-TaskResult
:db.install/_attribute :db.part/db}

;;\"TaskResult\",\"CompensatingControls\",\"[nvarchar](MAX)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :TaskResult/CompensatingControls
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"TaskResult.CompensatingControls\"
:alexa.entity-type :et-TaskResult
:db.install/_attribute :db.part/db}

;;\"TaskResult\",\"CreatedOn\",\"datetime\",\"NOT NULL\",\"[DF_AuditTaskResult_CreatedOn]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :TaskResult/CreatedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"TaskResult.CreatedOn\"
:alexa.entity-type :et-TaskResult
:db.install/_attribute :db.part/db}

;;\"TaskResult\",\"DeletedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :TaskResult/DeletedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"TaskResult.DeletedOn\"
:alexa.entity-type :et-TaskResult
:db.install/_attribute :db.part/db}

;;\"TaskResult\",\"EnteredOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :TaskResult/EnteredOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"TaskResult.EnteredOn\"
:alexa.entity-type :et-TaskResult
:db.install/_attribute :db.part/db}

;;\"TaskResult\",\"ExpiresOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :TaskResult/ExpiresOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"TaskResult.ExpiresOn\"
:alexa.entity-type :et-TaskResult
:db.install/_attribute :db.part/db}

;;\"TaskResult\",\"Id\",\"bigint\",\"NOT NULL\",\"\",\"IDENTITY\",\"PRIMARY KEY\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :TaskResult/Id
:db/valueType :db.type/long
:db/cardinality :db.cardinality/one
:db/index true
:db/unique :db.unique/value
:db/doc \"TaskResult.Id\"
:alexa.entity-type :et-TaskResult
:db.install/_attribute :db.part/db}

;;\"TaskResult\",\"ModifiedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :TaskResult/ModifiedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"TaskResult.ModifiedOn\"
:alexa.entity-type :et-TaskResult
:db.install/_attribute :db.part/db}

;;\"TaskResult\",\"PerformerId\",\"bigint\",\"NOT NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :TaskResult/Performer
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(TaskResult PerformerId Performer Performer)\"
:alexa.entity-type :et-TaskResult
:db.install/_attribute :db.part/db}

;;\"TaskResult\",\"TaskId\",\"bigint\",\"NOT NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :TaskResult/Task
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(TaskResult TaskId Task Task)\"
:alexa.entity-type :et-TaskResult
:db.install/_attribute :db.part/db}

;;\"TaskResult\",\"TaskPerformanceId\",\"bigint\",\"NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :TaskResult/TaskPerformance
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(TaskResult TaskPerformanceId TaskPerformance TaskPerformance)\"
:alexa.entity-type :et-TaskResult
:db.install/_attribute :db.part/db}

;;\"TaskResult\",\"TaskResultScoreId\",\"bigint\",\"NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :TaskResult/TaskResultScore
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(TaskResult TaskResultScoreId TaskResultScore TaskResultScore)\"
:alexa.entity-type :et-TaskResult
:db.install/_attribute :db.part/db}

;;\"TaskResult\",\"TaskResultStatusId\",\"bigint\",\"NOT NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :TaskResult/TaskResultStatus
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(TaskResult TaskResultStatusId TaskResultStatus TaskResultStatus)\"
:alexa.entity-type :et-TaskResult
:db.install/_attribute :db.part/db}

;;\"TaskResult\",\"TaskResultTypeId\",\"bigint\",\"NOT NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :TaskResult/TaskResultType
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(TaskResult TaskResultTypeId TaskResultType TaskResultType)\"
:alexa.entity-type :et-TaskResult
:db.install/_attribute :db.part/db}

{:db/id #db/id[:db.part/db]
:db/ident :TaskResult/DataFile
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/many
:db/doc \"(TaskResult TaskResultId TaskResultReference ReferenceId Reference)\"
:alexa.entity-type :et-TaskResult
:db.install/_attribute :db.part/db}

{:db/id #db/id[:db.part/db]
:db/ident :TaskResult/TechnicalScan
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/many
:db/doc \"(TaskResult TaskResultId TaskResultTechnicalScan TechnicalScanId TechnicalScan)\"
:alexa.entity-type :et-TaskResult
:db.install/_attribute :db.part/db}

]"
"[;;\"TaskResultEffort\",\"Comments\",\"[nvarchar](MAX)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :TaskResultEffort/Comments
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"TaskResultEffort.Comments\"
:alexa.entity-type :et-TaskResultEffort
:db.install/_attribute :db.part/db}

;;\"TaskResultEffort\",\"CreatedOn\",\"datetime\",\"NOT NULL\",\"[DF_Effort_CreatedOn]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :TaskResultEffort/CreatedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"TaskResultEffort.CreatedOn\"
:alexa.entity-type :et-TaskResultEffort
:db.install/_attribute :db.part/db}

;;\"TaskResultEffort\",\"DeletedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :TaskResultEffort/DeletedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"TaskResultEffort.DeletedOn\"
:alexa.entity-type :et-TaskResultEffort
:db.install/_attribute :db.part/db}

;;\"TaskResultEffort\",\"EffortCategoryId\",\"bigint\",\"NOT NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :TaskResultEffort/EffortCategory
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(TaskResultEffort EffortCategoryId EffortCategory EffortCategory)\"
:alexa.entity-type :et-TaskResultEffort
:db.install/_attribute :db.part/db}

;;\"TaskResultEffort\",\"Hours\",\"float\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :TaskResultEffort/Hours
:db/valueType :db.type/float
:db/cardinality :db.cardinality/one
:db/doc \"TaskResultEffort.Hours\"
:alexa.entity-type :et-TaskResultEffort
:db.install/_attribute :db.part/db}

;;\"TaskResultEffort\",\"Id\",\"bigint\",\"NOT NULL\",\"\",\"IDENTITY\",\"PRIMARY KEY\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :TaskResultEffort/Id
:db/valueType :db.type/long
:db/cardinality :db.cardinality/one
:db/index true
:db/unique :db.unique/value
:db/doc \"TaskResultEffort.Id\"
:alexa.entity-type :et-TaskResultEffort
:db.install/_attribute :db.part/db}

;;\"TaskResultEffort\",\"ModifiedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :TaskResultEffort/ModifiedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"TaskResultEffort.ModifiedOn\"
:alexa.entity-type :et-TaskResultEffort
:db.install/_attribute :db.part/db}

;;\"TaskResultEffort\",\"TaskResultId\",\"bigint\",\"NOT NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :TaskResultEffort/TaskResult
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(TaskResultEffort TaskResultId TaskResult TaskResult)\"
:alexa.entity-type :et-TaskResultEffort
:db.install/_attribute :db.part/db}

]"
"[;;\"TaskResultExpense\",\"Amount\",\"money\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :TaskResultExpense/Amount
:db/valueType :db.type/bigdec
:db/cardinality :db.cardinality/one
:db/doc \"TaskResultExpense.Amount\"
:alexa.entity-type :et-TaskResultExpense
:db.install/_attribute :db.part/db}

;;\"TaskResultExpense\",\"Comments\",\"[nvarchar](MAX)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :TaskResultExpense/Comments
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"TaskResultExpense.Comments\"
:alexa.entity-type :et-TaskResultExpense
:db.install/_attribute :db.part/db}

;;\"TaskResultExpense\",\"CreatedOn\",\"datetime\",\"NOT NULL\",\"[DF_Expense_CreatedOn]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :TaskResultExpense/CreatedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"TaskResultExpense.CreatedOn\"
:alexa.entity-type :et-TaskResultExpense
:db.install/_attribute :db.part/db}

;;\"TaskResultExpense\",\"CurrencyId\",\"bigint\",\"NOT NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :TaskResultExpense/Currency
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(TaskResultExpense CurrencyId Currency Currency)\"
:alexa.entity-type :et-TaskResultExpense
:db.install/_attribute :db.part/db}

;;\"TaskResultExpense\",\"DeletedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :TaskResultExpense/DeletedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"TaskResultExpense.DeletedOn\"
:alexa.entity-type :et-TaskResultExpense
:db.install/_attribute :db.part/db}

;;\"TaskResultExpense\",\"ExpenseCategoryId\",\"bigint\",\"NOT NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :TaskResultExpense/ExpenseCategory
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(TaskResultExpense ExpenseCategoryId ExpenseCategory ExpenseCategory)\"
:alexa.entity-type :et-TaskResultExpense
:db.install/_attribute :db.part/db}

;;\"TaskResultExpense\",\"Id\",\"bigint\",\"NOT NULL\",\"\",\"IDENTITY\",\"PRIMARY KEY\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :TaskResultExpense/Id
:db/valueType :db.type/long
:db/cardinality :db.cardinality/one
:db/index true
:db/unique :db.unique/value
:db/doc \"TaskResultExpense.Id\"
:alexa.entity-type :et-TaskResultExpense
:db.install/_attribute :db.part/db}

;;\"TaskResultExpense\",\"ModifiedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :TaskResultExpense/ModifiedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"TaskResultExpense.ModifiedOn\"
:alexa.entity-type :et-TaskResultExpense
:db.install/_attribute :db.part/db}

;;\"TaskResultExpense\",\"TaskResultId\",\"bigint\",\"NOT NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :TaskResultExpense/TaskResult
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(TaskResultExpense TaskResultId TaskResult TaskResult)\"
:alexa.entity-type :et-TaskResultExpense
:db.install/_attribute :db.part/db}

]"
"[;;\"TaskResultLineage\",\"CreatedOn\",\"datetime\",\"NOT NULL\",\"[DF_TaskResultLineage_CreatedOn]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :TaskResultLineage/CreatedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"TaskResultLineage.CreatedOn\"
:alexa.entity-type :et-TaskResultLineage
:db.install/_attribute :db.part/db}

;;\"TaskResultLineage\",\"DeletedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :TaskResultLineage/DeletedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"TaskResultLineage.DeletedOn\"
:alexa.entity-type :et-TaskResultLineage
:db.install/_attribute :db.part/db}

;;\"TaskResultLineage\",\"Id\",\"bigint\",\"NOT NULL\",\"\",\"IDENTITY\",\"PRIMARY KEY\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :TaskResultLineage/Id
:db/valueType :db.type/long
:db/cardinality :db.cardinality/one
:db/index true
:db/unique :db.unique/value
:db/doc \"TaskResultLineage.Id\"
:alexa.entity-type :et-TaskResultLineage
:db.install/_attribute :db.part/db}

;;\"TaskResultLineage\",\"ModifiedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :TaskResultLineage/ModifiedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"TaskResultLineage.ModifiedOn\"
:alexa.entity-type :et-TaskResultLineage
:db.install/_attribute :db.part/db}

;;\"TaskResultLineage\",\"NewTaskResultId\",\"bigint\",\"NOT NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :TaskResultLineage/NewTaskResult
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(TaskResultLineage NewTaskResultId TaskResult NewTaskResult)\"
:alexa.entity-type :et-TaskResultLineage
:db.install/_attribute :db.part/db}

;;\"TaskResultLineage\",\"OldTaskResultId\",\"bigint\",\"NOT NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :TaskResultLineage/OldTaskResult
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(TaskResultLineage OldTaskResultId TaskResult OldTaskResult)\"
:alexa.entity-type :et-TaskResultLineage
:db.install/_attribute :db.part/db}

;;\"TaskResultLineage\",\"TaskPerformanceId\",\"bigint\",\"NOT NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :TaskResultLineage/TaskPerformance
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(TaskResultLineage TaskPerformanceId TaskPerformance TaskPerformance)\"
:alexa.entity-type :et-TaskResultLineage
:db.install/_attribute :db.part/db}

]"
"[;;\"TaskResultObject\",\"AssetGroupId\",\"bigint\",\"NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :TaskResultObject/AssetGroup
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(TaskResultObject AssetGroupId AssetGroup AssetGroup)\"
:alexa.entity-type :et-TaskResultObject
:db.install/_attribute :db.part/db}

;;\"TaskResultObject\",\"AssetId\",\"bigint\",\"NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :TaskResultObject/Asset
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(TaskResultObject AssetId Asset Asset)\"
:alexa.entity-type :et-TaskResultObject
:db.install/_attribute :db.part/db}

;;\"TaskResultObject\",\"CreatedOn\",\"datetime\",\"NOT NULL\",\"[DF_TaskResultObject_CreatedOn]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :TaskResultObject/CreatedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"TaskResultObject.CreatedOn\"
:alexa.entity-type :et-TaskResultObject
:db.install/_attribute :db.part/db}

;;\"TaskResultObject\",\"DeletedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :TaskResultObject/DeletedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"TaskResultObject.DeletedOn\"
:alexa.entity-type :et-TaskResultObject
:db.install/_attribute :db.part/db}

;;\"TaskResultObject\",\"Id\",\"bigint\",\"NOT NULL\",\"\",\"IDENTITY\",\"PRIMARY KEY\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :TaskResultObject/Id
:db/valueType :db.type/long
:db/cardinality :db.cardinality/one
:db/index true
:db/unique :db.unique/value
:db/doc \"TaskResultObject.Id\"
:alexa.entity-type :et-TaskResultObject
:db.install/_attribute :db.part/db}

;;\"TaskResultObject\",\"ModifiedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :TaskResultObject/ModifiedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"TaskResultObject.ModifiedOn\"
:alexa.entity-type :et-TaskResultObject
:db.install/_attribute :db.part/db}

;;\"TaskResultObject\",\"PersonId\",\"bigint\",\"NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :TaskResultObject/Person
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(TaskResultObject PersonId Person Person)\"
:alexa.entity-type :et-TaskResultObject
:db.install/_attribute :db.part/db}

;;\"TaskResultObject\",\"ProcedureId\",\"bigint\",\"NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :TaskResultObject/Procedure
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(TaskResultObject ProcedureId Procedure Procedure)\"
:alexa.entity-type :et-TaskResultObject
:db.install/_attribute :db.part/db}

;;\"TaskResultObject\",\"TaskResultId\",\"bigint\",\"NOT NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :TaskResultObject/TaskResult
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(TaskResultObject TaskResultId TaskResult TaskResult)\"
:alexa.entity-type :et-TaskResultObject
:db.install/_attribute :db.part/db}

]"
"[;;\"TaskResultOutcome\",\"Approver_PersonId\",\"bigint\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :TaskResultOutcome/Approver_PersonId
:db/valueType :db.type/long
:db/cardinality :db.cardinality/one
:db/doc \"TaskResultOutcome.Approver_PersonId\"
:alexa.entity-type :et-TaskResultOutcome
:db.install/_attribute :db.part/db}

;;\"TaskResultOutcome\",\"Comments\",\"[nvarchar](MAX)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :TaskResultOutcome/Comments
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"TaskResultOutcome.Comments\"
:alexa.entity-type :et-TaskResultOutcome
:db.install/_attribute :db.part/db}

;;\"TaskResultOutcome\",\"CompensatingControls\",\"[nvarchar](MAX)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :TaskResultOutcome/CompensatingControls
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"TaskResultOutcome.CompensatingControls\"
:alexa.entity-type :et-TaskResultOutcome
:db.install/_attribute :db.part/db}

;;\"TaskResultOutcome\",\"CreatedOn\",\"datetime\",\"NOT NULL\",\"[DF_TaskResultOutcome_CreatedOn]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :TaskResultOutcome/CreatedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"TaskResultOutcome.CreatedOn\"
:alexa.entity-type :et-TaskResultOutcome
:db.install/_attribute :db.part/db}

;;\"TaskResultOutcome\",\"DeletedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :TaskResultOutcome/DeletedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"TaskResultOutcome.DeletedOn\"
:alexa.entity-type :et-TaskResultOutcome
:db.install/_attribute :db.part/db}

;;\"TaskResultOutcome\",\"ExpiresOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :TaskResultOutcome/ExpiresOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"TaskResultOutcome.ExpiresOn\"
:alexa.entity-type :et-TaskResultOutcome
:db.install/_attribute :db.part/db}

;;\"TaskResultOutcome\",\"Id\",\"bigint\",\"NOT NULL\",\"\",\"IDENTITY\",\"PRIMARY KEY\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :TaskResultOutcome/Id
:db/valueType :db.type/long
:db/cardinality :db.cardinality/one
:db/index true
:db/unique :db.unique/value
:db/doc \"TaskResultOutcome.Id\"
:alexa.entity-type :et-TaskResultOutcome
:db.install/_attribute :db.part/db}

;;\"TaskResultOutcome\",\"ModifiedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :TaskResultOutcome/ModifiedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"TaskResultOutcome.ModifiedOn\"
:alexa.entity-type :et-TaskResultOutcome
:db.install/_attribute :db.part/db}

;;\"TaskResultOutcome\",\"OutcomeId\",\"bigint\",\"NOT NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :TaskResultOutcome/Outcome
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(TaskResultOutcome OutcomeId Outcome Outcome)\"
:alexa.entity-type :et-TaskResultOutcome
:db.install/_attribute :db.part/db}

;;\"TaskResultOutcome\",\"Reviewer_PersonId\",\"bigint\",\"NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :TaskResultOutcome/Reviewer_Person
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(TaskResultOutcome Reviewer_PersonId Person Reviewer_Person)\"
:alexa.entity-type :et-TaskResultOutcome
:db.install/_attribute :db.part/db}

;;\"TaskResultOutcome\",\"SpecifiedReviewer_PersonId\",\"bigint\",\"NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :TaskResultOutcome/SpecifiedReviewer_Person
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(TaskResultOutcome SpecifiedReviewer_PersonId Person SpecifiedReviewer_Person)\"
:alexa.entity-type :et-TaskResultOutcome
:db.install/_attribute :db.part/db}

;;\"TaskResultOutcome\",\"TaskResultId\",\"bigint\",\"NOT NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :TaskResultOutcome/TaskResult
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(TaskResultOutcome TaskResultId TaskResult TaskResult)\"
:alexa.entity-type :et-TaskResultOutcome
:db.install/_attribute :db.part/db}

{:db/id #db/id[:db.part/db]
:db/ident :TaskResultOutcome/Task
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/many
:db/doc \"(TaskResultOutcome TaskResultOutcomeId TaskResultOutcomeTask TaskId Task)\"
:alexa.entity-type :et-TaskResultOutcome
:db.install/_attribute :db.part/db}

{:db/id #db/id[:db.part/db]
:db/ident :TaskResultOutcome/DataFile
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/many
:db/doc \"(TaskResultOutcome TaskResultOutcomeId TaskResultOutcomeReference ReferenceId Reference)\"
:alexa.entity-type :et-TaskResultOutcome
:db.install/_attribute :db.part/db}

]"
"[;;\"TaskResultOutcomeApproval\",\"ApprovalStatusId\",\"bigint\",\"NOT NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :TaskResultOutcomeApproval/ApprovalStatus
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(TaskResultOutcomeApproval ApprovalStatusId ApprovalStatus ApprovalStatus)\"
:alexa.entity-type :et-TaskResultOutcomeApproval
:db.install/_attribute :db.part/db}

;;\"TaskResultOutcomeApproval\",\"Approver_PersonId\",\"bigint\",\"NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :TaskResultOutcomeApproval/Approver_Person
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(TaskResultOutcomeApproval Approver_PersonId Person Approver_Person)\"
:alexa.entity-type :et-TaskResultOutcomeApproval
:db.install/_attribute :db.part/db}

;;\"TaskResultOutcomeApproval\",\"Comments\",\"[nvarchar](MAX)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :TaskResultOutcomeApproval/Comments
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"TaskResultOutcomeApproval.Comments\"
:alexa.entity-type :et-TaskResultOutcomeApproval
:db.install/_attribute :db.part/db}

;;\"TaskResultOutcomeApproval\",\"CreatedOn\",\"datetime\",\"NOT NULL\",\"[DF_TaskResultOverrideApproval_CreatedOn]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :TaskResultOutcomeApproval/CreatedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"TaskResultOutcomeApproval.CreatedOn\"
:alexa.entity-type :et-TaskResultOutcomeApproval
:db.install/_attribute :db.part/db}

;;\"TaskResultOutcomeApproval\",\"Deadline\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :TaskResultOutcomeApproval/Deadline
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"TaskResultOutcomeApproval.Deadline\"
:alexa.entity-type :et-TaskResultOutcomeApproval
:db.install/_attribute :db.part/db}

;;\"TaskResultOutcomeApproval\",\"DeletedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :TaskResultOutcomeApproval/DeletedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"TaskResultOutcomeApproval.DeletedOn\"
:alexa.entity-type :et-TaskResultOutcomeApproval
:db.install/_attribute :db.part/db}

;;\"TaskResultOutcomeApproval\",\"Id\",\"bigint\",\"NOT NULL\",\"\",\"IDENTITY\",\"PRIMARY KEY\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :TaskResultOutcomeApproval/Id
:db/valueType :db.type/long
:db/cardinality :db.cardinality/one
:db/index true
:db/unique :db.unique/value
:db/doc \"TaskResultOutcomeApproval.Id\"
:alexa.entity-type :et-TaskResultOutcomeApproval
:db.install/_attribute :db.part/db}

;;\"TaskResultOutcomeApproval\",\"ModifiedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :TaskResultOutcomeApproval/ModifiedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"TaskResultOutcomeApproval.ModifiedOn\"
:alexa.entity-type :et-TaskResultOutcomeApproval
:db.install/_attribute :db.part/db}

;;\"TaskResultOutcomeApproval\",\"SpecifiedApprover_PersonId\",\"bigint\",\"NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :TaskResultOutcomeApproval/SpecifiedApprover_Person
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(TaskResultOutcomeApproval SpecifiedApprover_PersonId Person SpecifiedApprover_Person)\"
:alexa.entity-type :et-TaskResultOutcomeApproval
:db.install/_attribute :db.part/db}

;;\"TaskResultOutcomeApproval\",\"TaskResultOutcomeId\",\"bigint\",\"NOT NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :TaskResultOutcomeApproval/TaskResultOutcome
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(TaskResultOutcomeApproval TaskResultOutcomeId TaskResultOutcome TaskResultOutcome)\"
:alexa.entity-type :et-TaskResultOutcomeApproval
:db.install/_attribute :db.part/db}

{:db/id #db/id[:db.part/db]
:db/ident :TaskResultOutcomeApproval/DataFile
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/many
:db/doc \"(TaskResultOutcomeApproval TaskResultOutcomeApprovalId TaskResultOutcomeApprovalReference ReferenceId Reference)\"
:alexa.entity-type :et-TaskResultOutcomeApproval
:db.install/_attribute :db.part/db}

]"
"[;;\"TaskResultOutcomeNotification\",\"CreatedOn\",\"datetime\",\"NOT NULL\",\"[DF_TaskResultOutcomeNotification_CreatedOn]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :TaskResultOutcomeNotification/CreatedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"TaskResultOutcomeNotification.CreatedOn\"
:alexa.entity-type :et-TaskResultOutcomeNotification
:db.install/_attribute :db.part/db}

;;\"TaskResultOutcomeNotification\",\"DeletedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :TaskResultOutcomeNotification/DeletedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"TaskResultOutcomeNotification.DeletedOn\"
:alexa.entity-type :et-TaskResultOutcomeNotification
:db.install/_attribute :db.part/db}

;;\"TaskResultOutcomeNotification\",\"Id\",\"bigint\",\"NOT NULL\",\"\",\"IDENTITY\",\"PRIMARY KEY\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :TaskResultOutcomeNotification/Id
:db/valueType :db.type/long
:db/cardinality :db.cardinality/one
:db/index true
:db/unique :db.unique/value
:db/doc \"TaskResultOutcomeNotification.Id\"
:alexa.entity-type :et-TaskResultOutcomeNotification
:db.install/_attribute :db.part/db}

;;\"TaskResultOutcomeNotification\",\"ModifiedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :TaskResultOutcomeNotification/ModifiedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"TaskResultOutcomeNotification.ModifiedOn\"
:alexa.entity-type :et-TaskResultOutcomeNotification
:db.install/_attribute :db.part/db}

;;\"TaskResultOutcomeNotification\",\"NotificationId\",\"bigint\",\"NOT NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :TaskResultOutcomeNotification/Notification
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(TaskResultOutcomeNotification NotificationId Notification Notification)\"
:alexa.entity-type :et-TaskResultOutcomeNotification
:db.install/_attribute :db.part/db}

;;\"TaskResultOutcomeNotification\",\"NotificationRuleId\",\"bigint\",\"NOT NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :TaskResultOutcomeNotification/NotificationRule
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(TaskResultOutcomeNotification NotificationRuleId NotificationRule NotificationRule)\"
:alexa.entity-type :et-TaskResultOutcomeNotification
:db.install/_attribute :db.part/db}

;;\"TaskResultOutcomeNotification\",\"TaskResultOutcomeId\",\"bigint\",\"NOT NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :TaskResultOutcomeNotification/TaskResultOutcome
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(TaskResultOutcomeNotification TaskResultOutcomeId TaskResultOutcome TaskResultOutcome)\"
:alexa.entity-type :et-TaskResultOutcomeNotification
:db.install/_attribute :db.part/db}

]"
"[;;\"TaskResultScore\",\"Abbreviation\",\"[nvarchar](50)\",\"NOT NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :TaskResultScore/Abbreviation
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"TaskResultScore.Abbreviation\"
:alexa.entity-type :et-TaskResultScore
:db.install/_attribute :db.part/db}

;;\"TaskResultScore\",\"BackColorName\",\"[nvarchar](50)\",\"NULL\",\"[DF_AuditResult_BackColorName]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :TaskResultScore/BackColorName
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"TaskResultScore.BackColorName\"
:alexa.entity-type :et-TaskResultScore
:db.install/_attribute :db.part/db}

;;\"TaskResultScore\",\"CreatedOn\",\"datetime\",\"NOT NULL\",\"[DF_AuditResult_CreatedOn]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :TaskResultScore/CreatedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"TaskResultScore.CreatedOn\"
:alexa.entity-type :et-TaskResultScore
:db.install/_attribute :db.part/db}

;;\"TaskResultScore\",\"DeletedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :TaskResultScore/DeletedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"TaskResultScore.DeletedOn\"
:alexa.entity-type :et-TaskResultScore
:db.install/_attribute :db.part/db}

;;\"TaskResultScore\",\"Description\",\"[nvarchar](1024)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :TaskResultScore/Description
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"TaskResultScore.Description\"
:alexa.entity-type :et-TaskResultScore
:db.install/_attribute :db.part/db}

;;\"TaskResultScore\",\"ForeColorName\",\"[nvarchar](50)\",\"NULL\",\"[DF_AuditResult_ForeColorName]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :TaskResultScore/ForeColorName
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"TaskResultScore.ForeColorName\"
:alexa.entity-type :et-TaskResultScore
:db.install/_attribute :db.part/db}

;;\"TaskResultScore\",\"Id\",\"bigint\",\"NOT NULL\",\"\",\"IDENTITY\",\"PRIMARY KEY\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :TaskResultScore/Id
:db/valueType :db.type/long
:db/cardinality :db.cardinality/one
:db/index true
:db/unique :db.unique/value
:db/doc \"TaskResultScore.Id\"
:alexa.entity-type :et-TaskResultScore
:db.install/_attribute :db.part/db}

;;\"TaskResultScore\",\"ModifiedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :TaskResultScore/ModifiedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"TaskResultScore.ModifiedOn\"
:alexa.entity-type :et-TaskResultScore
:db.install/_attribute :db.part/db}

;;\"TaskResultScore\",\"Name\",\"[nvarchar](256)\",\"NOT NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :TaskResultScore/Name
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"TaskResultScore.Name\"
:alexa.entity-type :et-TaskResultScore
:db.install/_attribute :db.part/db}

;;\"TaskResultScore\",\"NormalizedScore\",\"float\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :TaskResultScore/NormalizedScore
:db/valueType :db.type/float
:db/cardinality :db.cardinality/one
:db/doc \"TaskResultScore.NormalizedScore\"
:alexa.entity-type :et-TaskResultScore
:db.install/_attribute :db.part/db}

;;\"TaskResultScore\",\"Probability\",\"float\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :TaskResultScore/Probability
:db/valueType :db.type/float
:db/cardinality :db.cardinality/one
:db/doc \"TaskResultScore.Probability\"
:alexa.entity-type :et-TaskResultScore
:db.install/_attribute :db.part/db}

;;\"TaskResultScore\",\"Score\",\"float\",\"NOT NULL\",\"[DF_AuditResult_Score]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :TaskResultScore/Score
:db/valueType :db.type/float
:db/cardinality :db.cardinality/one
:db/doc \"TaskResultScore.Score\"
:alexa.entity-type :et-TaskResultScore
:db.install/_attribute :db.part/db}

;;\"TaskResultScore\",\"TaskResultScoreSetId\",\"bigint\",\"NOT NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :TaskResultScore/TaskResultScoreSet
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(TaskResultScore TaskResultScoreSetId TaskResultScoreSet TaskResultScoreSet)\"
:alexa.entity-type :et-TaskResultScore
:db.install/_attribute :db.part/db}

]"
"[;;\"TaskResultScoreSet\",\"CreatedOn\",\"datetime\",\"NOT NULL\",\"[DF_AuditResultSet_CreatedOn]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :TaskResultScoreSet/CreatedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"TaskResultScoreSet.CreatedOn\"
:alexa.entity-type :et-TaskResultScoreSet
:db.install/_attribute :db.part/db}

;;\"TaskResultScoreSet\",\"DeletedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :TaskResultScoreSet/DeletedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"TaskResultScoreSet.DeletedOn\"
:alexa.entity-type :et-TaskResultScoreSet
:db.install/_attribute :db.part/db}

;;\"TaskResultScoreSet\",\"Description\",\"[nvarchar](1024)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :TaskResultScoreSet/Description
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"TaskResultScoreSet.Description\"
:alexa.entity-type :et-TaskResultScoreSet
:db.install/_attribute :db.part/db}

;;\"TaskResultScoreSet\",\"Id\",\"bigint\",\"NOT NULL\",\"\",\"IDENTITY\",\"PRIMARY KEY\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :TaskResultScoreSet/Id
:db/valueType :db.type/long
:db/cardinality :db.cardinality/one
:db/index true
:db/unique :db.unique/value
:db/doc \"TaskResultScoreSet.Id\"
:alexa.entity-type :et-TaskResultScoreSet
:db.install/_attribute :db.part/db}

;;\"TaskResultScoreSet\",\"ModifiedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :TaskResultScoreSet/ModifiedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"TaskResultScoreSet.ModifiedOn\"
:alexa.entity-type :et-TaskResultScoreSet
:db.install/_attribute :db.part/db}

;;\"TaskResultScoreSet\",\"Name\",\"[nvarchar](256)\",\"NOT NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :TaskResultScoreSet/Name
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"TaskResultScoreSet.Name\"
:alexa.entity-type :et-TaskResultScoreSet
:db.install/_attribute :db.part/db}

;;\"TaskResultScoreSet\",\"StandardId\",\"bigint\",\"NOT NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :TaskResultScoreSet/Standard
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(TaskResultScoreSet StandardId Standard Standard)\"
:alexa.entity-type :et-TaskResultScoreSet
:db.install/_attribute :db.part/db}

]"
"[;;\"TaskResultStatus\",\"CreatedOn\",\"datetime\",\"NOT NULL\",\"[DF_TaskResultStatus_CreatedOn]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :TaskResultStatus/CreatedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"TaskResultStatus.CreatedOn\"
:alexa.entity-type :et-TaskResultStatus
:db.install/_attribute :db.part/db}

;;\"TaskResultStatus\",\"DeletedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :TaskResultStatus/DeletedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"TaskResultStatus.DeletedOn\"
:alexa.entity-type :et-TaskResultStatus
:db.install/_attribute :db.part/db}

;;\"TaskResultStatus\",\"Description\",\"[nvarchar](1024)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :TaskResultStatus/Description
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"TaskResultStatus.Description\"
:alexa.entity-type :et-TaskResultStatus
:db.install/_attribute :db.part/db}

;;\"TaskResultStatus\",\"Id\",\"bigint\",\"NOT NULL\",\"\",\"IDENTITY\",\"PRIMARY KEY\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :TaskResultStatus/Id
:db/valueType :db.type/long
:db/cardinality :db.cardinality/one
:db/index true
:db/unique :db.unique/value
:db/doc \"TaskResultStatus.Id\"
:alexa.entity-type :et-TaskResultStatus
:db.install/_attribute :db.part/db}

;;\"TaskResultStatus\",\"ModifiedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :TaskResultStatus/ModifiedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"TaskResultStatus.ModifiedOn\"
:alexa.entity-type :et-TaskResultStatus
:db.install/_attribute :db.part/db}

;;\"TaskResultStatus\",\"Name\",\"[nvarchar](256)\",\"NOT NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :TaskResultStatus/Name
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"TaskResultStatus.Name\"
:alexa.entity-type :et-TaskResultStatus
:db.install/_attribute :db.part/db}

]"
"[;;\"TaskResultType\",\"CreatedOn\",\"datetime\",\"NOT NULL\",\"[DF_TaskResultType_CreatedOn]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :TaskResultType/CreatedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"TaskResultType.CreatedOn\"
:alexa.entity-type :et-TaskResultType
:db.install/_attribute :db.part/db}

;;\"TaskResultType\",\"DeletedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :TaskResultType/DeletedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"TaskResultType.DeletedOn\"
:alexa.entity-type :et-TaskResultType
:db.install/_attribute :db.part/db}

;;\"TaskResultType\",\"Description\",\"[nvarchar](1024)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :TaskResultType/Description
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"TaskResultType.Description\"
:alexa.entity-type :et-TaskResultType
:db.install/_attribute :db.part/db}

;;\"TaskResultType\",\"Id\",\"bigint\",\"NOT NULL\",\"\",\"IDENTITY\",\"PRIMARY KEY\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :TaskResultType/Id
:db/valueType :db.type/long
:db/cardinality :db.cardinality/one
:db/index true
:db/unique :db.unique/value
:db/doc \"TaskResultType.Id\"
:alexa.entity-type :et-TaskResultType
:db.install/_attribute :db.part/db}

;;\"TaskResultType\",\"ModifiedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :TaskResultType/ModifiedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"TaskResultType.ModifiedOn\"
:alexa.entity-type :et-TaskResultType
:db.install/_attribute :db.part/db}

;;\"TaskResultType\",\"Name\",\"[nvarchar](256)\",\"NOT NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :TaskResultType/Name
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"TaskResultType.Name\"
:alexa.entity-type :et-TaskResultType
:db.install/_attribute :db.part/db}

]"
"[;;\"TaskType\",\"CreatedOn\",\"datetime\",\"NOT NULL\",\"[DF_TaskType_CreatedOn]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :TaskType/CreatedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"TaskType.CreatedOn\"
:alexa.entity-type :et-TaskType
:db.install/_attribute :db.part/db}

;;\"TaskType\",\"DeletedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :TaskType/DeletedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"TaskType.DeletedOn\"
:alexa.entity-type :et-TaskType
:db.install/_attribute :db.part/db}

;;\"TaskType\",\"Description\",\"[nvarchar](1024)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :TaskType/Description
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"TaskType.Description\"
:alexa.entity-type :et-TaskType
:db.install/_attribute :db.part/db}

;;\"TaskType\",\"Id\",\"bigint\",\"NOT NULL\",\"\",\"IDENTITY\",\"PRIMARY KEY\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :TaskType/Id
:db/valueType :db.type/long
:db/cardinality :db.cardinality/one
:db/index true
:db/unique :db.unique/value
:db/doc \"TaskType.Id\"
:alexa.entity-type :et-TaskType
:db.install/_attribute :db.part/db}

;;\"TaskType\",\"ModifiedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :TaskType/ModifiedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"TaskType.ModifiedOn\"
:alexa.entity-type :et-TaskType
:db.install/_attribute :db.part/db}

;;\"TaskType\",\"Name\",\"[nvarchar](256)\",\"NOT NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :TaskType/Name
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"TaskType.Name\"
:alexa.entity-type :et-TaskType
:db.install/_attribute :db.part/db}

]"
"[;;\"TechnicalScan\",\"CreatedOn\",\"datetime\",\"NOT NULL\",\"[DF_TechnicalScan_CreatedOn]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :TechnicalScan/CreatedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"TechnicalScan.CreatedOn\"
:alexa.entity-type :et-TechnicalScan
:db.install/_attribute :db.part/db}

;;\"TechnicalScan\",\"DeletedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :TechnicalScan/DeletedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"TechnicalScan.DeletedOn\"
:alexa.entity-type :et-TechnicalScan
:db.install/_attribute :db.part/db}

;;\"TechnicalScan\",\"Description\",\"[nvarchar](1024)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :TechnicalScan/Description
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"TechnicalScan.Description\"
:alexa.entity-type :et-TechnicalScan
:db.install/_attribute :db.part/db}

;;\"TechnicalScan\",\"Id\",\"bigint\",\"NOT NULL\",\"\",\"IDENTITY\",\"PRIMARY KEY\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :TechnicalScan/Id
:db/valueType :db.type/long
:db/cardinality :db.cardinality/one
:db/index true
:db/unique :db.unique/value
:db/doc \"TechnicalScan.Id\"
:alexa.entity-type :et-TechnicalScan
:db.install/_attribute :db.part/db}

;;\"TechnicalScan\",\"ModifiedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :TechnicalScan/ModifiedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"TechnicalScan.ModifiedOn\"
:alexa.entity-type :et-TechnicalScan
:db.install/_attribute :db.part/db}

;;\"TechnicalScan\",\"Name\",\"[nvarchar](256)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :TechnicalScan/Name
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"TechnicalScan.Name\"
:alexa.entity-type :et-TechnicalScan
:db.install/_attribute :db.part/db}

;;\"TechnicalScan\",\"ReferenceId\",\"bigint\",\"NOT NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :TechnicalScan/Reference
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(TechnicalScan ReferenceId Reference Reference)\"
:alexa.entity-type :et-TechnicalScan
:db.install/_attribute :db.part/db}

;;\"TechnicalScan\",\"ScanDate\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :TechnicalScan/ScanDate
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"TechnicalScan.ScanDate\"
:alexa.entity-type :et-TechnicalScan
:db.install/_attribute :db.part/db}

;;\"TechnicalScan\",\"TechnicalScanTypeId\",\"bigint\",\"NOT NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :TechnicalScan/TechnicalScanType
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(TechnicalScan TechnicalScanTypeId TechnicalScanType TechnicalScanType)\"
:alexa.entity-type :et-TechnicalScan
:db.install/_attribute :db.part/db}

{:db/id #db/id[:db.part/db]
:db/ident :TechnicalScan/Analysis
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/many
:db/doc \"(TechnicalScan TechnicalScanId AnalysisTechnicalScan AnalysisId Analysis)\"
:alexa.entity-type :et-TechnicalScan
:db.install/_attribute :db.part/db}

{:db/id #db/id[:db.part/db]
:db/ident :TechnicalScan/AssetExposure
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/many
:db/doc \"(TechnicalScan TechnicalScanId AssetExposureTechnicalScan AssetExposureId AssetExposure)\"
:alexa.entity-type :et-TechnicalScan
:db.install/_attribute :db.part/db}

{:db/id #db/id[:db.part/db]
:db/ident :TechnicalScan/TaskResult
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/many
:db/doc \"(TechnicalScan TechnicalScanId TaskResultTechnicalScan TaskResultId TaskResult)\"
:alexa.entity-type :et-TechnicalScan
:db.install/_attribute :db.part/db}

]"
"[;;\"TechnicalScanType\",\"CreatedOn\",\"datetime\",\"NOT NULL\",\"[DF_TechnicalScanType_CreatedOn]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :TechnicalScanType/CreatedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"TechnicalScanType.CreatedOn\"
:alexa.entity-type :et-TechnicalScanType
:db.install/_attribute :db.part/db}

;;\"TechnicalScanType\",\"DeletedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :TechnicalScanType/DeletedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"TechnicalScanType.DeletedOn\"
:alexa.entity-type :et-TechnicalScanType
:db.install/_attribute :db.part/db}

;;\"TechnicalScanType\",\"Description\",\"[nvarchar](1024)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :TechnicalScanType/Description
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"TechnicalScanType.Description\"
:alexa.entity-type :et-TechnicalScanType
:db.install/_attribute :db.part/db}

;;\"TechnicalScanType\",\"Id\",\"bigint\",\"NOT NULL\",\"\",\"IDENTITY\",\"PRIMARY KEY\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :TechnicalScanType/Id
:db/valueType :db.type/long
:db/cardinality :db.cardinality/one
:db/index true
:db/unique :db.unique/value
:db/doc \"TechnicalScanType.Id\"
:alexa.entity-type :et-TechnicalScanType
:db.install/_attribute :db.part/db}

;;\"TechnicalScanType\",\"ModifiedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :TechnicalScanType/ModifiedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"TechnicalScanType.ModifiedOn\"
:alexa.entity-type :et-TechnicalScanType
:db.install/_attribute :db.part/db}

;;\"TechnicalScanType\",\"Name\",\"[nvarchar](256)\",\"NOT NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :TechnicalScanType/Name
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"TechnicalScanType.Name\"
:alexa.entity-type :et-TechnicalScanType
:db.install/_attribute :db.part/db}

]"
"[;;\"TimeZone\",\"CreatedOn\",\"datetime\",\"NOT NULL\",\"[DF_TimeZone_CreatedOn]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :TimeZone/CreatedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"TimeZone.CreatedOn\"
:alexa.entity-type :et-TimeZone
:db.install/_attribute :db.part/db}

;;\"TimeZone\",\"DeletedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :TimeZone/DeletedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"TimeZone.DeletedOn\"
:alexa.entity-type :et-TimeZone
:db.install/_attribute :db.part/db}

;;\"TimeZone\",\"Description\",\"[nvarchar](1024)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :TimeZone/Description
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"TimeZone.Description\"
:alexa.entity-type :et-TimeZone
:db.install/_attribute :db.part/db}

;;\"TimeZone\",\"GMTOffsetMinutes\",\"int\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :TimeZone/GMTOffsetMinutes
:db/valueType :db.type/long
:db/cardinality :db.cardinality/one
:db/doc \"TimeZone.GMTOffsetMinutes\"
:alexa.entity-type :et-TimeZone
:db.install/_attribute :db.part/db}

;;\"TimeZone\",\"Id\",\"bigint\",\"NOT NULL\",\"\",\"IDENTITY\",\"PRIMARY KEY\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :TimeZone/Id
:db/valueType :db.type/long
:db/cardinality :db.cardinality/one
:db/index true
:db/unique :db.unique/value
:db/doc \"TimeZone.Id\"
:alexa.entity-type :et-TimeZone
:db.install/_attribute :db.part/db}

;;\"TimeZone\",\"ModifiedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :TimeZone/ModifiedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"TimeZone.ModifiedOn\"
:alexa.entity-type :et-TimeZone
:db.install/_attribute :db.part/db}

;;\"TimeZone\",\"Name\",\"[nvarchar](256)\",\"NOT NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :TimeZone/Name
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"TimeZone.Name\"
:alexa.entity-type :et-TimeZone
:db.install/_attribute :db.part/db}

]"
"[;;\"Vendor\",\"Abbreviation\",\"[nvarchar](50)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Vendor/Abbreviation
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"Vendor.Abbreviation\"
:alexa.entity-type :et-Vendor
:db.install/_attribute :db.part/db}

;;\"Vendor\",\"AddressId\",\"bigint\",\"NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :Vendor/Address
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(Vendor AddressId Address Address)\"
:alexa.entity-type :et-Vendor
:db.install/_attribute :db.part/db}

;;\"Vendor\",\"CreatedOn\",\"datetime\",\"NOT NULL\",\"[DF_Vendor_CreatedOn]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Vendor/CreatedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"Vendor.CreatedOn\"
:alexa.entity-type :et-Vendor
:db.install/_attribute :db.part/db}

;;\"Vendor\",\"DeletedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Vendor/DeletedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"Vendor.DeletedOn\"
:alexa.entity-type :et-Vendor
:db.install/_attribute :db.part/db}

;;\"Vendor\",\"Description\",\"[nvarchar](1024)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Vendor/Description
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"Vendor.Description\"
:alexa.entity-type :et-Vendor
:db.install/_attribute :db.part/db}

;;\"Vendor\",\"Id\",\"bigint\",\"NOT NULL\",\"\",\"IDENTITY\",\"PRIMARY KEY\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Vendor/Id
:db/valueType :db.type/long
:db/cardinality :db.cardinality/one
:db/index true
:db/unique :db.unique/value
:db/doc \"Vendor.Id\"
:alexa.entity-type :et-Vendor
:db.install/_attribute :db.part/db}

;;\"Vendor\",\"Logo\",\"[varbinary](MAX)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Vendor/Logo
:db/valueType :db.type/uri
:db/cardinality :db.cardinality/one
:db/doc \"Vendor.Logo\"
:alexa.entity-type :et-Vendor
:db.install/_attribute :db.part/db}

;;\"Vendor\",\"ModifiedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Vendor/ModifiedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"Vendor.ModifiedOn\"
:alexa.entity-type :et-Vendor
:db.install/_attribute :db.part/db}

;;\"Vendor\",\"Name\",\"[nvarchar](256)\",\"NOT NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Vendor/Name
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"Vendor.Name\"
:alexa.entity-type :et-Vendor
:db.install/_attribute :db.part/db}

]"
"[;;\"VendorProduct\",\"CreatedOn\",\"datetime\",\"NOT NULL\",\"[DF_VendorProduct_CreatedOn]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :VendorProduct/CreatedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"VendorProduct.CreatedOn\"
:alexa.entity-type :et-VendorProduct
:db.install/_attribute :db.part/db}

;;\"VendorProduct\",\"CurrencyId\",\"bigint\",\"NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :VendorProduct/Currency
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(VendorProduct CurrencyId Currency Currency)\"
:alexa.entity-type :et-VendorProduct
:db.install/_attribute :db.part/db}

;;\"VendorProduct\",\"DeletedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :VendorProduct/DeletedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"VendorProduct.DeletedOn\"
:alexa.entity-type :et-VendorProduct
:db.install/_attribute :db.part/db}

;;\"VendorProduct\",\"Deployment\",\"[nvarchar](1024)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :VendorProduct/Deployment
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"VendorProduct.Deployment\"
:alexa.entity-type :et-VendorProduct
:db.install/_attribute :db.part/db}

;;\"VendorProduct\",\"Description\",\"[nvarchar](1024)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :VendorProduct/Description
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"VendorProduct.Description\"
:alexa.entity-type :et-VendorProduct
:db.install/_attribute :db.part/db}

;;\"VendorProduct\",\"Id\",\"bigint\",\"NOT NULL\",\"\",\"IDENTITY\",\"PRIMARY KEY\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :VendorProduct/Id
:db/valueType :db.type/long
:db/cardinality :db.cardinality/one
:db/index true
:db/unique :db.unique/value
:db/doc \"VendorProduct.Id\"
:alexa.entity-type :et-VendorProduct
:db.install/_attribute :db.part/db}

;;\"VendorProduct\",\"ModifiedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :VendorProduct/ModifiedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"VendorProduct.ModifiedOn\"
:alexa.entity-type :et-VendorProduct
:db.install/_attribute :db.part/db}

;;\"VendorProduct\",\"Name\",\"[nvarchar](256)\",\"NOT NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :VendorProduct/Name
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"VendorProduct.Name\"
:alexa.entity-type :et-VendorProduct
:db.install/_attribute :db.part/db}

;;\"VendorProduct\",\"Number\",\"[nvarchar](100)\",\"NOT NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :VendorProduct/Number
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"VendorProduct.Number\"
:alexa.entity-type :et-VendorProduct
:db.install/_attribute :db.part/db}

;;\"VendorProduct\",\"Picture\",\"[varbinary](MAX)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :VendorProduct/Picture
:db/valueType :db.type/uri
:db/cardinality :db.cardinality/one
:db/doc \"VendorProduct.Picture\"
:alexa.entity-type :et-VendorProduct
:db.install/_attribute :db.part/db}

;;\"VendorProduct\",\"Price\",\"money\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :VendorProduct/Price
:db/valueType :db.type/bigdec
:db/cardinality :db.cardinality/one
:db/doc \"VendorProduct.Price\"
:alexa.entity-type :et-VendorProduct
:db.install/_attribute :db.part/db}

;;\"VendorProduct\",\"VendorId\",\"bigint\",\"NOT NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :VendorProduct/Vendor
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(VendorProduct VendorId Vendor Vendor)\"
:alexa.entity-type :et-VendorProduct
:db.install/_attribute :db.part/db}

]"
"[;;\"Vulnerability\",\"Compliance\",\"[nvarchar](MAX)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Vulnerability/Compliance
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"Vulnerability.Compliance\"
:alexa.entity-type :et-Vulnerability
:db.install/_attribute :db.part/db}

;;\"Vulnerability\",\"Consequence\",\"[nvarchar](MAX)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Vulnerability/Consequence
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"Vulnerability.Consequence\"
:alexa.entity-type :et-Vulnerability
:db.install/_attribute :db.part/db}

;;\"Vulnerability\",\"CreatedOn\",\"datetime\",\"NOT NULL\",\"[DF_Vulnerability_CreatedOn]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Vulnerability/CreatedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"Vulnerability.CreatedOn\"
:alexa.entity-type :et-Vulnerability
:db.install/_attribute :db.part/db}

;;\"Vulnerability\",\"DeletedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Vulnerability/DeletedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"Vulnerability.DeletedOn\"
:alexa.entity-type :et-Vulnerability
:db.install/_attribute :db.part/db}

;;\"Vulnerability\",\"Description\",\"[nvarchar](MAX)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Vulnerability/Description
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"Vulnerability.Description\"
:alexa.entity-type :et-Vulnerability
:db.install/_attribute :db.part/db}

;;\"Vulnerability\",\"Diagnosis\",\"[nvarchar](MAX)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Vulnerability/Diagnosis
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"Vulnerability.Diagnosis\"
:alexa.entity-type :et-Vulnerability
:db.install/_attribute :db.part/db}

;;\"Vulnerability\",\"Id\",\"bigint\",\"NOT NULL\",\"\",\"IDENTITY\",\"PRIMARY KEY\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Vulnerability/Id
:db/valueType :db.type/long
:db/cardinality :db.cardinality/one
:db/index true
:db/unique :db.unique/value
:db/doc \"Vulnerability.Id\"
:alexa.entity-type :et-Vulnerability
:db.install/_attribute :db.part/db}

;;\"Vulnerability\",\"Information\",\"[nvarchar](MAX)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Vulnerability/Information
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"Vulnerability.Information\"
:alexa.entity-type :et-Vulnerability
:db.install/_attribute :db.part/db}

;;\"Vulnerability\",\"IsIgnored\",\"bit\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Vulnerability/IsIgnored
:db/valueType :db.type/boolean
:db/cardinality :db.cardinality/one
:db/doc \"Vulnerability.IsIgnored\"
:alexa.entity-type :et-Vulnerability
:db.install/_attribute :db.part/db}

;;\"Vulnerability\",\"LastUpdatedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Vulnerability/LastUpdatedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"Vulnerability.LastUpdatedOn\"
:alexa.entity-type :et-Vulnerability
:db.install/_attribute :db.part/db}

;;\"Vulnerability\",\"ManualSeverity\",\"bit\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Vulnerability/ManualSeverity
:db/valueType :db.type/boolean
:db/cardinality :db.cardinality/one
:db/doc \"Vulnerability.ManualSeverity\"
:alexa.entity-type :et-Vulnerability
:db.install/_attribute :db.part/db}

;;\"Vulnerability\",\"ModifiedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Vulnerability/ModifiedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"Vulnerability.ModifiedOn\"
:alexa.entity-type :et-Vulnerability
:db.install/_attribute :db.part/db}

;;\"Vulnerability\",\"Name\",\"[nvarchar](256)\",\"NOT NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Vulnerability/Name
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"Vulnerability.Name\"
:alexa.entity-type :et-Vulnerability
:db.install/_attribute :db.part/db}

;;\"Vulnerability\",\"PatchAvailable\",\"bit\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Vulnerability/PatchAvailable
:db/valueType :db.type/boolean
:db/cardinality :db.cardinality/one
:db/doc \"Vulnerability.PatchAvailable\"
:alexa.entity-type :et-Vulnerability
:db.install/_attribute :db.part/db}

;;\"Vulnerability\",\"PatchReleasedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Vulnerability/PatchReleasedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"Vulnerability.PatchReleasedOn\"
:alexa.entity-type :et-Vulnerability
:db.install/_attribute :db.part/db}

;;\"Vulnerability\",\"ReleasedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Vulnerability/ReleasedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"Vulnerability.ReleasedOn\"
:alexa.entity-type :et-Vulnerability
:db.install/_attribute :db.part/db}

;;\"Vulnerability\",\"SeverityId\",\"bigint\",\"NOT NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :Vulnerability/Severity
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(Vulnerability SeverityId Severity Severity)\"
:alexa.entity-type :et-Vulnerability
:db.install/_attribute :db.part/db}

;;\"Vulnerability\",\"Solution\",\"[nvarchar](MAX)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Vulnerability/Solution
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"Vulnerability.Solution\"
:alexa.entity-type :et-Vulnerability
:db.install/_attribute :db.part/db}

;;\"Vulnerability\",\"UCFControlNumber\",\"[nvarchar](256)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Vulnerability/UCFControlNumber
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"Vulnerability.UCFControlNumber\"
:alexa.entity-type :et-Vulnerability
:db.install/_attribute :db.part/db}

;;\"Vulnerability\",\"UserComments\",\"[nvarchar](MAX)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Vulnerability/UserComments
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"Vulnerability.UserComments\"
:alexa.entity-type :et-Vulnerability
:db.install/_attribute :db.part/db}

;;\"Vulnerability\",\"VulnerabilityTypeId\",\"bigint\",\"NOT NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :Vulnerability/VulnerabilityType
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(Vulnerability VulnerabilityTypeId VulnerabilityType VulnerabilityType)\"
:alexa.entity-type :et-Vulnerability
:db.install/_attribute :db.part/db}

]"
"[;;\"Vulnerability_History\",\"ChangedBy_PersonId\",\"bigint\",\"NOT NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :Vulnerability_History/ChangedBy_Person
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(Vulnerability_History ChangedBy_PersonId Person ChangedBy_Person)\"
:alexa.entity-type :et-Vulnerability_History
:db.install/_attribute :db.part/db}

;;\"Vulnerability_History\",\"Comments\",\"[nvarchar](1024)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Vulnerability_History/Comments
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"Vulnerability_History.Comments\"
:alexa.entity-type :et-Vulnerability_History
:db.install/_attribute :db.part/db}

;;\"Vulnerability_History\",\"CreatedOn\",\"datetime\",\"NOT NULL\",\"[DF_Vulnerability_History_CreatedOn]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Vulnerability_History/CreatedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"Vulnerability_History.CreatedOn\"
:alexa.entity-type :et-Vulnerability_History
:db.install/_attribute :db.part/db}

;;\"Vulnerability_History\",\"DeletedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Vulnerability_History/DeletedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"Vulnerability_History.DeletedOn\"
:alexa.entity-type :et-Vulnerability_History
:db.install/_attribute :db.part/db}

;;\"Vulnerability_History\",\"Id\",\"bigint\",\"NOT NULL\",\"\",\"IDENTITY\",\"PRIMARY KEY\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Vulnerability_History/Id
:db/valueType :db.type/long
:db/cardinality :db.cardinality/one
:db/index true
:db/unique :db.unique/value
:db/doc \"Vulnerability_History.Id\"
:alexa.entity-type :et-Vulnerability_History
:db.install/_attribute :db.part/db}

;;\"Vulnerability_History\",\"IsIgnored\",\"bit\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Vulnerability_History/IsIgnored
:db/valueType :db.type/boolean
:db/cardinality :db.cardinality/one
:db/doc \"Vulnerability_History.IsIgnored\"
:alexa.entity-type :et-Vulnerability_History
:db.install/_attribute :db.part/db}

;;\"Vulnerability_History\",\"ModifiedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Vulnerability_History/ModifiedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"Vulnerability_History.ModifiedOn\"
:alexa.entity-type :et-Vulnerability_History
:db.install/_attribute :db.part/db}

;;\"Vulnerability_History\",\"SeverityId\",\"bigint\",\"NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :Vulnerability_History/Severity
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(Vulnerability_History SeverityId Severity Severity)\"
:alexa.entity-type :et-Vulnerability_History
:db.install/_attribute :db.part/db}

;;\"Vulnerability_History\",\"UserComments\",\"[nvarchar](MAX)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :Vulnerability_History/UserComments
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"Vulnerability_History.UserComments\"
:alexa.entity-type :et-Vulnerability_History
:db.install/_attribute :db.part/db}

;;\"Vulnerability_History\",\"VulnerabilityId\",\"bigint\",\"NOT NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :Vulnerability_History/Vulnerability
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(Vulnerability_History VulnerabilityId Vulnerability Vulnerability)\"
:alexa.entity-type :et-Vulnerability_History
:db.install/_attribute :db.part/db}

;;\"Vulnerability_History\",\"VulnerabilityTypeId\",\"bigint\",\"NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :Vulnerability_History/VulnerabilityType
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(Vulnerability_History VulnerabilityTypeId VulnerabilityType VulnerabilityType)\"
:alexa.entity-type :et-Vulnerability_History
:db.install/_attribute :db.part/db}

]"
"[;;\"VulnerabilityReference\",\"CreatedOn\",\"datetime\",\"NOT NULL\",\"[DF_VulnerabilityReference_CreatedOn]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :VulnerabilityReference/CreatedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"VulnerabilityReference.CreatedOn\"
:alexa.entity-type :et-VulnerabilityReference
:db.install/_attribute :db.part/db}

;;\"VulnerabilityReference\",\"CVSS_BaseScore\",\"float\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :VulnerabilityReference/CVSS_BaseScore
:db/valueType :db.type/float
:db/cardinality :db.cardinality/one
:db/doc \"VulnerabilityReference.CVSS_BaseScore\"
:alexa.entity-type :et-VulnerabilityReference
:db.install/_attribute :db.part/db}

;;\"VulnerabilityReference\",\"CVSS_BaseVector\",\"[nvarchar](256)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :VulnerabilityReference/CVSS_BaseVector
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"VulnerabilityReference.CVSS_BaseVector\"
:alexa.entity-type :et-VulnerabilityReference
:db.install/_attribute :db.part/db}

;;\"VulnerabilityReference\",\"CVSS_EnvironmentalScore\",\"float\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :VulnerabilityReference/CVSS_EnvironmentalScore
:db/valueType :db.type/float
:db/cardinality :db.cardinality/one
:db/doc \"VulnerabilityReference.CVSS_EnvironmentalScore\"
:alexa.entity-type :et-VulnerabilityReference
:db.install/_attribute :db.part/db}

;;\"VulnerabilityReference\",\"CVSS_EnvironmentalVector\",\"[nvarchar](256)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :VulnerabilityReference/CVSS_EnvironmentalVector
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"VulnerabilityReference.CVSS_EnvironmentalVector\"
:alexa.entity-type :et-VulnerabilityReference
:db.install/_attribute :db.part/db}

;;\"VulnerabilityReference\",\"CVSS_TemporalScore\",\"float\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :VulnerabilityReference/CVSS_TemporalScore
:db/valueType :db.type/float
:db/cardinality :db.cardinality/one
:db/doc \"VulnerabilityReference.CVSS_TemporalScore\"
:alexa.entity-type :et-VulnerabilityReference
:db.install/_attribute :db.part/db}

;;\"VulnerabilityReference\",\"CVSS_TemporalVector\",\"[nvarchar](256)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :VulnerabilityReference/CVSS_TemporalVector
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"VulnerabilityReference.CVSS_TemporalVector\"
:alexa.entity-type :et-VulnerabilityReference
:db.install/_attribute :db.part/db}

;;\"VulnerabilityReference\",\"DeletedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :VulnerabilityReference/DeletedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"VulnerabilityReference.DeletedOn\"
:alexa.entity-type :et-VulnerabilityReference
:db.install/_attribute :db.part/db}

;;\"VulnerabilityReference\",\"ExploitSubscore\",\"float\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :VulnerabilityReference/ExploitSubscore
:db/valueType :db.type/float
:db/cardinality :db.cardinality/one
:db/doc \"VulnerabilityReference.ExploitSubscore\"
:alexa.entity-type :et-VulnerabilityReference
:db.install/_attribute :db.part/db}

;;\"VulnerabilityReference\",\"Id\",\"bigint\",\"NOT NULL\",\"\",\"IDENTITY\",\"PRIMARY KEY\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :VulnerabilityReference/Id
:db/valueType :db.type/long
:db/cardinality :db.cardinality/one
:db/index true
:db/unique :db.unique/value
:db/doc \"VulnerabilityReference.Id\"
:alexa.entity-type :et-VulnerabilityReference
:db.install/_attribute :db.part/db}

;;\"VulnerabilityReference\",\"ImpactSubscore\",\"float\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :VulnerabilityReference/ImpactSubscore
:db/valueType :db.type/float
:db/cardinality :db.cardinality/one
:db/doc \"VulnerabilityReference.ImpactSubscore\"
:alexa.entity-type :et-VulnerabilityReference
:db.install/_attribute :db.part/db}

;;\"VulnerabilityReference\",\"IsPrimaryReferenceKey\",\"bit\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :VulnerabilityReference/IsPrimaryReferenceKey
:db/valueType :db.type/boolean
:db/cardinality :db.cardinality/one
:db/doc \"VulnerabilityReference.IsPrimaryReferenceKey\"
:alexa.entity-type :et-VulnerabilityReference
:db.install/_attribute :db.part/db}

;;\"VulnerabilityReference\",\"ModifiedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :VulnerabilityReference/ModifiedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"VulnerabilityReference.ModifiedOn\"
:alexa.entity-type :et-VulnerabilityReference
:db.install/_attribute :db.part/db}

;;\"VulnerabilityReference\",\"ReferenceId\",\"bigint\",\"NOT NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :VulnerabilityReference/Reference
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(VulnerabilityReference ReferenceId Reference Reference)\"
:alexa.entity-type :et-VulnerabilityReference
:db.install/_attribute :db.part/db}

;;\"VulnerabilityReference\",\"ReferenceKey\",\"[nvarchar](256)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :VulnerabilityReference/ReferenceKey
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"VulnerabilityReference.ReferenceKey\"
:alexa.entity-type :et-VulnerabilityReference
:db.install/_attribute :db.part/db}

;;\"VulnerabilityReference\",\"VulnerabilityId\",\"bigint\",\"NOT NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :VulnerabilityReference/Vulnerability
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(VulnerabilityReference VulnerabilityId Vulnerability Vulnerability)\"
:alexa.entity-type :et-VulnerabilityReference
:db.install/_attribute :db.part/db}

]"
"[;;\"VulnerabilityRule\",\"CreatedOn\",\"datetime\",\"NOT NULL\",\"[DF_VulnerabilityRule_CreatedOn]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :VulnerabilityRule/CreatedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"VulnerabilityRule.CreatedOn\"
:alexa.entity-type :et-VulnerabilityRule
:db.install/_attribute :db.part/db}

;;\"VulnerabilityRule\",\"Data\",\"[varbinary](MAX)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :VulnerabilityRule/Data
:db/valueType :db.type/uri
:db/cardinality :db.cardinality/one
:db/doc \"VulnerabilityRule.Data\"
:alexa.entity-type :et-VulnerabilityRule
:db.install/_attribute :db.part/db}

;;\"VulnerabilityRule\",\"DeletedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :VulnerabilityRule/DeletedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"VulnerabilityRule.DeletedOn\"
:alexa.entity-type :et-VulnerabilityRule
:db.install/_attribute :db.part/db}

;;\"VulnerabilityRule\",\"Description\",\"[nvarchar](1024)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :VulnerabilityRule/Description
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"VulnerabilityRule.Description\"
:alexa.entity-type :et-VulnerabilityRule
:db.install/_attribute :db.part/db}

;;\"VulnerabilityRule\",\"Id\",\"bigint\",\"NOT NULL\",\"\",\"IDENTITY\",\"PRIMARY KEY\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :VulnerabilityRule/Id
:db/valueType :db.type/long
:db/cardinality :db.cardinality/one
:db/index true
:db/unique :db.unique/value
:db/doc \"VulnerabilityRule.Id\"
:alexa.entity-type :et-VulnerabilityRule
:db.install/_attribute :db.part/db}

;;\"VulnerabilityRule\",\"ModifiedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :VulnerabilityRule/ModifiedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"VulnerabilityRule.ModifiedOn\"
:alexa.entity-type :et-VulnerabilityRule
:db.install/_attribute :db.part/db}

;;\"VulnerabilityRule\",\"Name\",\"[nvarchar](256)\",\"NOT NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :VulnerabilityRule/Name
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"VulnerabilityRule.Name\"
:alexa.entity-type :et-VulnerabilityRule
:db.install/_attribute :db.part/db}

;;\"VulnerabilityRule\",\"VulnerabilityRuleSetId\",\"bigint\",\"NOT NULL\",\"\",\"\",\"\",\"FOREIGN KEY\"
{:db/id #db/id[:db.part/db]
:db/ident :VulnerabilityRule/VulnerabilityRuleSet
:db/valueType :db.type/ref
:db/cardinality :db.cardinality/one
:db/doc \"(VulnerabilityRule VulnerabilityRuleSetId VulnerabilityRuleSet VulnerabilityRuleSet)\"
:alexa.entity-type :et-VulnerabilityRule
:db.install/_attribute :db.part/db}

]"
"[;;\"VulnerabilityRuleSet\",\"CreatedOn\",\"datetime\",\"NOT NULL\",\"[DF_VulnerabilityRuleSet_CreatedOn]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :VulnerabilityRuleSet/CreatedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"VulnerabilityRuleSet.CreatedOn\"
:alexa.entity-type :et-VulnerabilityRuleSet
:db.install/_attribute :db.part/db}

;;\"VulnerabilityRuleSet\",\"DeletedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :VulnerabilityRuleSet/DeletedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"VulnerabilityRuleSet.DeletedOn\"
:alexa.entity-type :et-VulnerabilityRuleSet
:db.install/_attribute :db.part/db}

;;\"VulnerabilityRuleSet\",\"Description\",\"[nvarchar](1024)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :VulnerabilityRuleSet/Description
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"VulnerabilityRuleSet.Description\"
:alexa.entity-type :et-VulnerabilityRuleSet
:db.install/_attribute :db.part/db}

;;\"VulnerabilityRuleSet\",\"Id\",\"bigint\",\"NOT NULL\",\"\",\"IDENTITY\",\"PRIMARY KEY\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :VulnerabilityRuleSet/Id
:db/valueType :db.type/long
:db/cardinality :db.cardinality/one
:db/index true
:db/unique :db.unique/value
:db/doc \"VulnerabilityRuleSet.Id\"
:alexa.entity-type :et-VulnerabilityRuleSet
:db.install/_attribute :db.part/db}

;;\"VulnerabilityRuleSet\",\"ModifiedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :VulnerabilityRuleSet/ModifiedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"VulnerabilityRuleSet.ModifiedOn\"
:alexa.entity-type :et-VulnerabilityRuleSet
:db.install/_attribute :db.part/db}

;;\"VulnerabilityRuleSet\",\"Name\",\"[nvarchar](256)\",\"NOT NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :VulnerabilityRuleSet/Name
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"VulnerabilityRuleSet.Name\"
:alexa.entity-type :et-VulnerabilityRuleSet
:db.install/_attribute :db.part/db}

]"
"[;;\"VulnerabilityType\",\"CreatedOn\",\"datetime\",\"NOT NULL\",\"[DF_VulnerabilityType_CreatedOn]\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :VulnerabilityType/CreatedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"VulnerabilityType.CreatedOn\"
:alexa.entity-type :et-VulnerabilityType
:db.install/_attribute :db.part/db}

;;\"VulnerabilityType\",\"DeletedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :VulnerabilityType/DeletedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"VulnerabilityType.DeletedOn\"
:alexa.entity-type :et-VulnerabilityType
:db.install/_attribute :db.part/db}

;;\"VulnerabilityType\",\"Description\",\"[nvarchar](1024)\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :VulnerabilityType/Description
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"VulnerabilityType.Description\"
:alexa.entity-type :et-VulnerabilityType
:db.install/_attribute :db.part/db}

;;\"VulnerabilityType\",\"Id\",\"bigint\",\"NOT NULL\",\"\",\"IDENTITY\",\"PRIMARY KEY\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :VulnerabilityType/Id
:db/valueType :db.type/long
:db/cardinality :db.cardinality/one
:db/index true
:db/unique :db.unique/value
:db/doc \"VulnerabilityType.Id\"
:alexa.entity-type :et-VulnerabilityType
:db.install/_attribute :db.part/db}

;;\"VulnerabilityType\",\"ModifiedOn\",\"datetime\",\"NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :VulnerabilityType/ModifiedOn
:db/valueType :db.type/instant
:db/cardinality :db.cardinality/one
:db/doc \"VulnerabilityType.ModifiedOn\"
:alexa.entity-type :et-VulnerabilityType
:db.install/_attribute :db.part/db}

;;\"VulnerabilityType\",\"Name\",\"[nvarchar](256)\",\"NOT NULL\",\"\",\"\",\"\",\"\"
{:db/id #db/id[:db.part/db]
:db/ident :VulnerabilityType/Name
:db/valueType :db.type/string
:db/cardinality :db.cardinality/one
:db/doc \"VulnerabilityType.Name\"
:alexa.entity-type :et-VulnerabilityType
:db.install/_attribute :db.part/db}

]"
])

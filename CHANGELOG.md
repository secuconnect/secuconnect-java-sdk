# Change Log
All notable changes to this project will be documented in this file.

The format is based on [Keep a Changelog](http://keepachangelog.com/)
and this project adheres to [Semantic Versioning](http://semver.org/).

## [Unreleased] - YYYY-MM-DD

### Security

### Deprecated

### Added

### Changed

### Fixed

### Removed


## [2.0.0] - 2020-03-30

### Security
- Dependency updates

### Added
- Model "CreditCardDescriptor" to create payment container for credit card
- Model "Address" has a new property "additional_address_data" 
- Model "PaymentContainersDTO" has a new property "customer_id"
- Model "PaymentTransactionsProductModel" has a new property "account_owner"

### Changed
- ApiClient: Date functions moved
- Model "PaymentContainersDTO" property "_private" changed to interface "OneOfPaymentContainersDTOModelPrivate"
- Model "PaymentContainersProductModel" property "_private" and "_public" changed to interface "OneOfPaymentContainersDTOModelPrivate"
- Model "PaymentContractsRequestIdResult" property "contract" changed to "ProductInstanceUID"
- DocumentUploadsApi: changed model from "File" to "FileToUpload"
- LoyaltyMerchantcardsApi: changed model from "VirtualTerminalData" to "VirtualTerminalDataModel"
- PaymentTransactionsApi: changed model from "List<PaymentTransactionsProductModel>" to "PaymentTransactionsCancelList"
- several api classes: changed model from "Object" to some more concrete model like "ResultBoolean", "CustomersWithoutMerchantcardAndDuplicatedCustomers" or "PaymentCancelResult"

### Removed
- GeneralMerchantsApi: updateMerchant()
- PaymentSecupayCreditcardsApi: paymentSecupayCreditcardsCancelById()
- PaymentSecupayDebitsApi: paymentSecupayDebitsCancelById()
- PaymentSecupayInvoicesApi: paymentSecupayInvoicesCancelById()
- PaymentSecupayPrepaysApi: paymentSecupayPrepaysCancelById()
- PaymentTransactionsApi: paymentTransactionsGet()
- PaymentTransactionsApi: paymentTransactionsGetById()
- PaymentTransactionsApi: paymentTransactionsIdCancelPost()
- PaymentTransactionsApi: paymentTransactionsIdShippingUrlGet()
- Model "PaymentContainersDTOPrivate"
- Model "VirtualTerminalData"
- Model "SecupaySubTransactionProductModel" properties removed: "amount", "transaction_status", "status", "currency"


## [1.9.0] - 2020-03-05

### Security
- Dependency updates


## [1.8.1] - 2019-12-23

### Fixed
- PaymentTransactionsProductModel was invalid
- LoyaltyCardsApi fixed some response parameters


## [1.8.0] - 2019-12-20

### Fixed
- Smart.Transaction action to prepare a transaction
- Smart.Transaction Receipt decoration parameter was missing
- Payment.SecupayPayout fixed request model

### Changed
- Smart.Devices added & fixed some parameters

### Added
- Payment.SecupayTransactions added subscription object
- Payment.Transaction added additional parameters
- Payment.Contracts added additional parameters


## [1.7.0] - 2019-11-29

### Added

- General.Contracts endpoint


## [1.6.2] - 2019-11-08

### Fixed

- The class Authenticator does not got all options from the `Configuration.getDefaultApiClient()`


## [1.6.1] - 2019-11-04

### Fixed

- Missing change in class Authenticator for the new method "setAuthHost"


## [1.6.0] - 2019-11-04

### Security

- dependency updates

### Added

- ApiClient method setAuthHost(String authHost) to change the URL of the oauth service
- ApiClient method setTimeout(int timeout) to change the timeout settings of the httpClient


## [1.5.0] - 2019-08-16

### Deprecated

- PaymentTransactionsApi: method paymentTransactionsGet replaced by getAll
- PaymentTransactionsApi: method paymentTransactionsGetById replaced by getOne
- PaymentTransactionsApi: method paymentTransactionsIdCancelPost replaced by cancel
- PaymentTransactionsApi: method paymentTransactionsIdShippingUrlGet replaced by getShippingUrl
- model SecupayTransactionProductModelRedirectUrl replaced by SecupayRedirectUrl

### Added

- PaymentSecupayPayoutApi
- PaymentSecupaySofortApi
- PrepaidContractsProductApi
- PrepaidSalesProductApi
- SmartDevicesApi method updatePin
- SmartRoutingsApi
- SmartTransactionsApi method prepare

#### Fields added in model

- BankAccountDescriptor
- GeneralMerchantsProductModel
- PaymentInformation
- PaymentTransactionsProductModel
- SecupaySubTransactionProductModel
- SmartTransactionsBasket
- SmartTransactionsBasketProduct
- SmartTransactionsDTO
- SmartTransactionsProductModel

### Changed

- Dates are now defined as String instead of DateTime
- PaymentTransactionsApi: response type fixed in paymentTransactionsIdCancelPost methods
- BankAccountDescriptor
- updated dependencies

### Removed

- removed LoyaltyMerchantcardsApi methods for getRawMerchantCardId
- removed model PaymentTransactionsProductModelMerchant
- removed model SecupayTransactionProductModelTransferAccount
- unused fields removed in LoyaltyCustomersProductModel
- unused fields removed in PaymentContractsDTO
- unused fields removed in PaymentContractsDTOClone
- unused fields removed in PaymentContractsProductModel
- unused fields removed in PrepaidItemsProductModel


## [1.4.0] - 2019-06-11

### Changed

- removed dependency "javax.annotation-api"
- removed dependency "hazelcast"
- removed dependency "cache-api"




[1.3.1]:https://github.com/secuconnect/secuconnect-java-sdk/releases/tag/v0.1.0
[1.4.0]:https://github.com/secuconnect/secuconnect-java-sdk/compare/1.3.1...1.4.0
[1.5.0]:https://github.com/secuconnect/secuconnect-java-sdk/compare/1.4.0...1.5.0
[1.6.0]:https://github.com/secuconnect/secuconnect-java-sdk/compare/1.5.0...1.6.0
[1.6.1]:https://github.com/secuconnect/secuconnect-java-sdk/compare/1.6.0...1.6.1
[1.6.2]:https://github.com/secuconnect/secuconnect-java-sdk/compare/1.6.1...1.6.2
[1.7.0]:https://github.com/secuconnect/secuconnect-java-sdk/compare/1.6.2...1.7.0
[1.8.0]:https://github.com/secuconnect/secuconnect-java-sdk/compare/1.7.0...1.8.0
[1.8.1]:https://github.com/secuconnect/secuconnect-java-sdk/compare/1.8.0...1.8.1
[1.9.0]:https://github.com/secuconnect/secuconnect-java-sdk/compare/1.8.1...1.9.0
[2.0.0]:https://github.com/secuconnect/secuconnect-java-sdk/compare/1.9.0...2.0.0

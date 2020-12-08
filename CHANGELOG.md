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

## [2.4.0] - 2020-12-09

### Security

- Update dependencies to the latest versions.

### Added

- `Api.PaymentTransactionsApi.getPaymentTransactionsOldFormat()`
- `Model.SmartTransactionsDTO` element `communications`
- `Model.SmartTransactionsProductModel` element `communications`

### Fixed

- `Model.GeneralMerchantsProductModel` element `idOld` is an instance of `Integer` instead of `String`
- `Model.GeneralMerchantsProductModel` element `legal_details` is a List of `GeneralMerchantsLegalDetails`
- `Model.GeneralMerchantsProductModel` element `urls` is a List of `GeneralMerchantsUrls`


## [2.3.0] - 2020-09-14

### Added

- `Api.PaymentContainersApi.mandate()`
- `ApiPaymentContainersApi..uploadMandate()`
- `Model.MandateDTO`
- `Model.MandateProductModel`
- `Model.SmartTransactionsPrepare` element `device_source`
- `Model.UploadMandateDTO`
- `Model.UploadMandateProductModel`

### Fixed

- `Model.SmartTransactionsDTO` element `device_source` is an instance of `ProductInstanceUID` instead of `String`


## [2.2.0] - 2020-09-07

### Security
- Update dependencies to the latest versions.

### Added
- `Api.LoyaltyCardgroupsApi.getCardgroupsByMerchantId()`
- `Api.PaymentTransactionsApi.addTransaction()`
- `Api.SmartTransactionsApi.setDelivery()`
- `Model.GeneralStoresProductModel` element `acceptance_point`
- `Model.OneOfSmartTransactionsDeliveryOptionsModel`
- `Model.PaymentContractsProductModel` element `pay_in_account`
- `Model.SecupayTransactionProductDTO` element `payment_methods`
- `Model.SecupayTransactionProductModel` element `payment_id`
- `Model.SmartDevicesDTO` element `device` and `tid`
- `Model.SmartDevicesProductModel` element `tid` and `refresh`
- `Model.SmartTransactionsCollectionModel`
- `Model.SmartTransactionsDTO` element `delivery_options`
- `Model.SmartTransactionsProductModel` element `delivery_options` and `intend`
- `Model.SmartTransactionsSetDeliveryModel`
- `Model.SmartTransactionsShippingModel`
- `Model.SmartTransactionsTimeSlot`

### Fixed

- `Api.SmartRoutingsApi` `removeRouting` does not return a List, it's only returns one item.

### Removed
- `Api.LoyaltySalesApi`
- `Api.LoyaltyStoregroupsApi`
- `Api.SmartDevicesApi.createPrepaidTid()`
- `Api.SmartDevicesApi.createVirtualDevice()`
- `Api.SmartDevicesApi.getSecubaseConfig()`
- `Model.GeneralMerchantsCheckoutOptions`
- `Model.GeneralMerchantsCheckoutOptionsCollection`
- `Model.GeneralMerchantsCheckoutOptionsCollectionSmartDevices`
- `Model.GeneralMerchantsDTO` element `checkout_options`
- `Model.GeneralMerchantsProductModel` element `checkout_options`
- `Model.LoyaltyDTOMerchant`
- `Model.LoyaltyDTOStore`
- `Model.LoyaltyStoregroupsDTO`
- `Model.LoyaltyStoregroupsDTOStoresAddressComponents`
- `Model.LoyaltyStoregroupsList`
- `Model.LoyaltyStoregroupsProductModel`
- `Model.SmartDevicesDTO` element `terminal`
- `Model.SmartDevicesDTOSecubaseConfig`
- `Model.SmartDevicesSecubaseConfig`
- `Model.SmartDevicesSecubaseConfigLogging`
- `Model.SmartDevicesSecubaseConfigLoggingFileNet`
- `Model.SmartTransactionsBasket` element `texts`
- `Model.SmartTransactionsBasketText`
- `Model.SmartTransactionsPickupOptions`
- `Model.SmartTransactionsDTO` elements `order_option`, `pickup_options`
- `Model.SmartTransactionsProductModel` elements `order_option`, `pickup_options` and `shipment_details`
- `Model.GeneralMerchantsCheckoutOptionsShipping`
- `Model.SmartTransactionsShipmentDetails`
- `Model.SmartDevicesDTOPrepaidTid`
- `Model.Store` element `name_raw`


## [2.1.0] - 2020-05-12

### Added

- `Api.LoyaltyMerchantcardsApi` added call `cardBalanceReceipt`
- `Api.LoyaltyTransactionsApi` was added
- `Api.ServicesUploadidentsProductApi` was added
- `Model.GeneralStoresProductModel` added element `store_name`
- `Model.LoyaltyMerchantcardsProductWithReceiptModel` added elements `trans_id` and `amount`
- `Model.PaymentContainerMandate` added element `creditor_id`
- `Model.PaymentTransactionCancelDTO` added element `container_id`
- `Model.SecupayTransactionProductModel` added element `mandate`

### Fixed

- `Api.LoyaltyCustomersApi` fixed response declaration from `List<Object>` to `List<String>`
- `Api.PaymentTransactionsApi` changed model from `PaymentTransactionsCancelList` to `List<PaymentTransactionsProductModel>`
- `Model.GeneralStoresProductModel` fixed type declaration of element `geometry`
- `Model.SecupayTransactionProductModelUsedPaymentInstrument` fixed response declaration from `BankAccountDescriptor` to `OneOfPaymentContainersDTOModelPrivate`


## [2.0.0] - 2020-03-30

### Security
- Dependency updates

### Added
- Model `CreditCardDescriptor` to create payment container for credit card
- Model `Address` has a new property `additional_address_data` 
- Model `PaymentContainersDTO` has a new property `customer_id`
- Model `PaymentTransactionsProductModel` has a new property `account_owner`

### Changed
- `ApiClient` Date functions moved
- Model `PaymentContainersDTO` property `_private` changed to interface `OneOfPaymentContainersDTOModelPrivate`
- Model `PaymentContainersProductModel` property `_private` and `_public` changed to interface `OneOfPaymentContainersDTOModelPrivate`
- Model `PaymentContractsRequestIdResult` property `contract` changed to `ProductInstanceUID`
- `SmartTransactionsApi` the method `startTransaction` has now also a body parameter
- `DocumentUploadsApi` changed model from `File` to `FileToUpload`
- `LoyaltyMerchantcardsApi` changed model from `VirtualTerminalData` to `VirtualTerminalDataModel`
- `PaymentTransactionsApi` changed model from `List<PaymentTransactionsProductModel>` to `PaymentTransactionsCancelList`
- several api classes changed model from `Object` to some more concrete model like `ResultBoolean`, `CustomersWithoutMerchantcardAndDuplicatedCustomers` or `PaymentCancelResult`

### Removed
- `GeneralMerchantsApi.updateMerchant()`
- `PaymentSecupayCreditcardsApi.paymentSecupayCreditcardsCancelById()`
- `PaymentSecupayDebitsApi.paymentSecupayDebitsCancelById()`
- `PaymentSecupayInvoicesApi.paymentSecupayInvoicesCancelById()`
- `PaymentSecupayPrepaysApi.paymentSecupayPrepaysCancelById()`
- `PaymentTransactionsApi.paymentTransactionsGet()`
- `PaymentTransactionsApi.paymentTransactionsGetById()`
- `PaymentTransactionsApi.paymentTransactionsIdCancelPost()`
- `PaymentTransactionsApi.paymentTransactionsIdShippingUrlGet()`
- Model `PaymentContainersDTOPrivate`
- Model `VirtualTerminalData`
- Model `SecupaySubTransactionProductModel` properties removed `amount`, `transaction_status`, `status`, `currency`


## [1.9.0] - 2020-03-05

### Security
- Dependency updates


## [1.8.1] - 2019-12-23

### Fixed
- `PaymentTransactionsProductModel` was invalid
- `LoyaltyCardsApi` fixed some response parameters


## [1.8.0] - 2019-12-20

### Fixed
- `Smart.Transaction` action to prepare a transaction
- `Smart.Transaction` Receipt decoration parameter was missing
- `Payment.SecupayPayout` fixed request model

### Changed
- `Smart.Devices` added & fixed some parameters

### Added
- `Payment.SecupayTransactions` added subscription object
- `Payment.Transaction` added additional parameters
- `Payment.Contracts` added additional parameters


## [1.7.0] - 2019-11-29

### Added

- `General.Contracts` endpoint


## [1.6.2] - 2019-11-08

### Fixed

- The class `Authenticator` does not got all options from the `Configuration.getDefaultApiClient()`


## [1.6.1] - 2019-11-04

### Fixed

- Missing change in class `Authenticator` for the new method `setAuthHost`


## [1.6.0] - 2019-11-04

### Security

- dependency updates

### Added

- `ApiClient` method `setAuthHost(String authHost)` to change the URL of the oauth service
- `ApiClient` method `setTimeout(int timeout)` to change the timeout settings of the httpClient


## [1.5.0] - 2019-08-16

### Deprecated

- `PaymentTransactionsApi` method `paymentTransactionsGet` replaced by `getAll`
- `PaymentTransactionsApi` method `paymentTransactionsGetById` replaced by `getOne`
- `PaymentTransactionsApi` method `paymentTransactionsIdCancelPost` replaced by `cancel`
- `PaymentTransactionsApi` method `paymentTransactionsIdShippingUrlGet` replaced by `getShippingUrl`
- model `SecupayTransactionProductModelRedirectUrl` replaced by `SecupayRedirectUrl`

### Added

- `PaymentSecupayPayoutApi`
- `PaymentSecupaySofortApi`
- `PrepaidContractsProductApi`
- `PrepaidSalesProductApi`
- `SmartDevicesApi` method `updatePin`
- `SmartRoutingsApi`
- `SmartTransactionsApi` method `prepare`

#### Fields added in model

- `BankAccountDescriptor`
- `GeneralMerchantsProductModel`
- `PaymentInformation`
- `PaymentTransactionsProductModel`
- `SecupaySubTransactionProductModel`
- `SmartTransactionsBasket`
- `SmartTransactionsBasketProduct`
- `SmartTransactionsDTO`
- `SmartTransactionsProductModel`

### Changed

- Dates are now defined as `String` instead of `DateTime`
- `PaymentTransactionsApi` response type fixed in `paymentTransactionsIdCancelPost` methods
- `BankAccountDescriptor`
- updated dependencies

### Removed

- removed `LoyaltyMerchantcardsApi` methods for `getRawMerchantCardId`
- removed model `PaymentTransactionsProductModelMerchant`
- removed model `SecupayTransactionProductModelTransferAccount`
- unused fields removed in `LoyaltyCustomersProductModel`
- unused fields removed in `PaymentContractsDTO`
- unused fields removed in `PaymentContractsDTOClone`
- unused fields removed in `PaymentContractsProductModel`
- unused fields removed in `PrepaidItemsProductModel`


## [1.4.0] - 2019-06-11

### Changed

- removed dependency `javax.annotation-api`
- removed dependency `hazelcast`
- removed dependency `cache-api`




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
[2.1.0]:https://github.com/secuconnect/secuconnect-java-sdk/compare/2.0.0...2.1.0
[2.2.0]:https://github.com/secuconnect/secuconnect-java-sdk/compare/2.1.0...2.2.0
[2.3.0]:https://github.com/secuconnect/secuconnect-java-sdk/compare/2.2.0...2.3.0
[2.4.0]:https://github.com/secuconnect/secuconnect-java-sdk/compare/2.3.0...2.4.0

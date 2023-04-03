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

## [3.14.0] - 2023-04-03
[3.14.0]:https://github.com/secuconnect/secuconnect-java-sdk/compare/3.13.0...3.14.0

### Added
- `Api.PrepaidReportsApi`
- `Model.Aggregate`
- `Model.AggregationResult`
- `Model.AggregationTimeResult`
- `Model.ApplePayDescriptorHeader`
- `Model.PaymentContractsDTORequestIdAdditionalData`
- `Model.PaymentContractsDTORequestIdAdditionalDataCreateCard`
- `Model.PaymentTransactionsCheckStatus`
- `Model.PrepaidReportsList`
- `Model.PrepaidReportsProductModel`
- `Model.PrepaidSalesList`
- `Model.SecupayPayoutListItem`
- `Model.SecupayPayoutWithoutCustomerDTO`

### Changed
- `Api.CardprocessingInvoicesApi`
- `Api.CardprocessingTransactionsApi`
- `Api.GeneralContractsApi`
- `Api.GeneralMerchantsApi`
- `Api.GeneralStoresApi`
- `Api.LoyaltyCardgroupsApi`
- `Api.LoyaltyCardsApi`
- `Api.LoyaltyCustomersApi`
- `Api.LoyaltyMerchantcardsApi`
- `Api.LoyaltyTransactionsApi`
- `Api.PaymentContainersApi`
- `Api.PaymentContractsApi`
- `Api.PaymentCustomersApi`
- `Api.PaymentInvoicesApi`
- `Api.PaymentPayoutsApi`
- `Api.PaymentPlansApi`
- `Api.PaymentSecupayPayoutApi`
- `Api.PaymentSubscriptionsApi`
- `Api.PaymentTransactionsApi`
- `Api.PrepaidItemsApi`
- `Api.PrepaidSalesApi`
- `Api.ServicesIdentrequestsApi`
- `Api.ServicesIdentresultsApi`
- `Api.SmartDevicesApi`
- `Api.SmartRoutingsApi`
- `Api.SmartTemplatesApi`
- `Api.SmartTransactionsApi`
- `Model.AddressComponents`
- `Model.ApplePayDescriptor`
- `Model.BillingCyclesItem`
- `Model.CardprocessingInvoicesList`
- `Model.CardprocessingInvoicesProductModel`
- `Model.CardprocessingTransactionsList`
- `Model.CardprocessingTransactionsProductModel`
- `Model.GeneralContractsList`
- `Model.GeneralContractsProductModel`
- `Model.GeneralMerchantsList`
- `Model.GeneralMerchantsProductModel`
- `Model.GeneralMerchantsPublicDataModel`
- `Model.GeneralMerchantsUser`
- `Model.GeneralStoresDTO`
- `Model.GeneralStoresList`
- `Model.GeneralStoresProductModel`
- `Model.GeoAddress`
- `Model.IdentresultPerson`
- `Model.LoyaltyCardgroupsList`
- `Model.LoyaltyCardgroupsProductModel`
- `Model.LoyaltyCardsList`
- `Model.LoyaltyCardsProductModel`
- `Model.LoyaltyCustomersList`
- `Model.LoyaltyCustomersProductModel`
- `Model.LoyaltyMerchantcardsCardBalanceReceipt`
- `Model.LoyaltyMerchantcardsList`
- `Model.LoyaltyMerchantcardsProductModel`
- `Model.LoyaltyMerchantcardsProductWithReceiptModel`
- `Model.LoyaltyTransactionsList`
- `Model.LoyaltyTransactionsProductModel`
- `Model.OneOfPaymentContainersDTOModelPrivate`
- `Model.OneOfSmartTransactionsDeliveryOptionsModel`
- `Model.PaymentContainersDTO`
- `Model.PaymentContainersList`
- `Model.PaymentContainersProductModel`
- `Model.PaymentContext`
- `Model.PaymentContractsDTOClone`
- `Model.PaymentContractsDTORequestId`
- `Model.PaymentContractsList`
- `Model.PaymentContractsProductModel`
- `Model.PaymentCustomersList`
- `Model.PaymentCustomersProductModel`
- `Model.PaymentInvoicesList`
- `Model.PaymentInvoicesProductModel`
- `Model.PaymentPayoutsList`
- `Model.PaymentPayoutsProductModel`
- `Model.PaymentPlansDTO`
- `Model.PaymentPlansList`
- `Model.PaymentPlansProductModel`
- `Model.PaymentSubscriptionsList`
- `Model.PaymentSubscriptionsProductModel`
- `Model.PaymentSubscriptionsProductModelBillingCycles`
- `Model.PaymentTransactionCancelDTO`
- `Model.PaymentTransactionsList`
- `Model.PaymentTransactionsProductModel`
- `Model.PaymentTransactionsProductModelDetails`
- `Model.PrepaidItemsBaseProductModel`
- `Model.PrepaidItemsList`
- `Model.PrepaidItemsProductModel`
- `Model.PrepaidSalesProductModel`
- `Model.ReceiptValue`
- `Model.SecupayBasketItem`
- `Model.SecupayPayoutDTO`
- `Model.SecupayPayoutProductModel`
- `Model.SecupayTransactionCancelDTO`
- `Model.SecupayTransactionProductDTO`
- `Model.SecupayTransactionProductModel`
- `Model.SecupayTransactionUpdateBasketDTO`
- `Model.ServicesIdentrequestsList`
- `Model.ServicesIdentrequestsProductDTO`
- `Model.ServicesIdentrequestsProductModel`
- `Model.ServicesIdentresultsList`
- `Model.ServicesIdentresultsProductModel`
- `Model.SmartDeviceProductsPrepaid`
- `Model.SmartDevicesList`
- `Model.SmartDevicesProductModel`
- `Model.SmartRoutingsList`
- `Model.SmartRoutingsProductModel`
- `Model.SmartTemplatesComponentModel`
- `Model.SmartTemplatesElementModel`
- `Model.SmartTemplatesList`
- `Model.SmartTemplatesProductModel`
- `Model.SmartTransactionPaymentContainerDTO`
- `Model.SmartTransactionsApplicationContextIframeOpts`
- `Model.SmartTransactionsBasket`
- `Model.SmartTransactionsBasketProduct`
- `Model.SmartTransactionsDTO`
- `Model.SmartTransactionsList`
- `Model.SmartTransactionsPreTransactionModel`
- `Model.SmartTransactionsProductModel`
- `Model.SmartTransactionsReceiptValue`
- `Model.SmartTransactionsSubBasketProduct`
- `Model.UploadidentsProductDTO`
- `Model.VirtualTerminalDataModel`

### Removed
- `Model.ACC_Object`
- `Model.MRC_Object`
- `Model.PCO_Object`
- `Model.PIG_Object`



## [3.13.0] - 2022-11-15
[3.13.0]:https://github.com/secuconnect/secuconnect-java-sdk/compare/3.12.0...3.13.0

### Added
- `Api.CardprocessingInvoicesApi`
- `Api.CardprocessingTransactionsApi`
- `Api.GeneralContractsApi.getAvailablePaymentMethodsForTransaction()`
- `Api.PaymentInvoicesApi`
- `Api.PaymentPayoutsApi`
- `Model.ACC_Object`
- `Model.CardprocessingInvoicesList`
- `Model.CardprocessingInvoicesProductModel`
- `Model.CardprocessingTransactionsList`
- `Model.CardprocessingTransactionsProductModel`
- `Model.DocumentLink`
- `Model.ParentObj` element `ref_type_raw` and `hierarchy`
- `Model.PaymentInvoicesList`
- `Model.PaymentInvoicesProductModel`
- `Model.PaymentPayoutsProductModel`completion_date
- `Model.PaymentPayoutsList`
- `Model.PaymentTransactionsProductModel` element `related_transactions`, `subscription`, `completion_date`, `incoming_payment_purpose`, `incoming_payment_iban`, `incoming_payment_bic`, `order_id`
- `Model.SecupayPayoutProductModel` element `payment_id`
- `Model.SmartDeviceProductsCollect`
- `Model.SmartDeviceProductsEasycredit`
- `Model.SmartDeviceProductsEnabledWithTid`
- `Model.SmartDeviceProductsLoyalty`
- `Model.SmartDeviceProductsVtm`
- `Model.SmartDeviceProductsWebterminalConfig`
- `Model.SmartDeviceProductsWebterminalConfigAllowedActions`
- `Model.SmartDeviceProductsPrepaid` element `endofday`, `password` and `simulate`
- `Model.SmartDevicesProductModel` element `updated` and `connection_type`
- `Model.SmartDevicesProducts` element `support`, `bonroll`, `bvb` and `easycredit`

### Changed
- `Model.IdentificationProcess` element `identificatontime` renamed to `identificationtime`
- `Model.SmartDeviceProductsPrepaid` extends now from `Model.SmartDeviceProductsEnabledWithTid`
- `Model.SmartDevicesProducts` element `collect` from `Model.SmartDeviceProductsEnabled` to `Model.SmartDeviceProductsCollect`
- `Model.SmartDevicesProducts` element `loyalty` from `Model.SmartDeviceProductsEnabled` to `Model.SmartDeviceProductsLoyalty`
- `Model.SmartDevicesProducts` element `smart` and `cashreg` from `Model.SmartDeviceProductsEnabled` to `Model.SmartDeviceProductsEnabledWithTid`
- `Model.SmartDevicesProducts` element `vtm` from `Model.SmartDeviceProductsEnabled` to `Model.SmartDeviceProductsVtm`

### Removed
- `Model.ParentObj` element `relation_type`
- `Model.SmartDeviceProductsPrepaid` element `simulate_force`
- `Model.SmartDevicesProducts` element `showcase`
- .swagger-codegen/VERSION


## [3.12.0] - 2022-09-30
[3.12.0]:https://github.com/secuconnect/secuconnect-java-sdk/compare/3.11.0...3.12.0

### Added
- `Model.SmartTemplatesElementModel` element `order`
- `Model.SmartTemplatesComponentModel` element `order`
- `Model.SmartTemplatesElementModel` element `name`
- `Model.SmartTemplatesElementModel` element `property`
- `Model.SmartTemplatesElementModel` element `elements`
- `Model.PaymentInstructions` element `interest`
- `Model.PaymentInstructions` element `total_value`
- `Model.PaymentInstructions` element `number_of_installments`
- `Model.PaymentInstructions` element `installment`
- `Model.PaymentInstructions` element `last_installment`


### Removed
- `Model.SmartTemplatesElementModel` element `id`
- `Model.SmartTemplatesElementModel` element `accordion_elements`
- `Model.SmartTemplatesElementModel` element `form_elements`
- `Model.SmartTemplatesComponentModel` element `id`
- `Model.SmartTemplatesAccordionModel`
- `Model.SmartTemplatesFormModel`

## [3.11.0] - 2022-07-15
[3.11.0]:https://github.com/secuconnect/secuconnect-java-sdk/compare/3.10.1...3.11.0

### Added
- `Api.GeneralContractsApi.terminate()`
- `Model.PaymentContext` element `accrual`
- `Model.Contact` element `name`
- `Model.LoyaltyCustomersDTO` element `consent_for_communication`
- `Model.MRC_Object`
- `Model.PCO_Object`
- `Model.PIG_Object`
- `Model.PrepaidItemsBaseProductModel`
- `Model.PrepaidItemsProductModel` element `enabled`

### Changed
- renamed class `PrepaidContractsProductApi` to `PrepaidContractsApi` to unify the namings
- renamed class `PrepaidSalesProductApi` to `PrepaidSalesApi` to unify the namings
- renamed class `ServicesUploadidentsProductApi` to `ServicesUploadidentsApi` to unify the namings
- `Model.PrepaidItemsProductModel` extends `PrepaidItemsBaseProductModel`


## [3.10.1] - 2022-06-21
[3.10.1]:https://github.com/secuconnect/secuconnect-java-sdk/compare/3.10.0...3.10.1

### Fixed
- rebuild last release because of invalid pom.xml (which was "simplified" during the build)


## [3.10.0] - 2022-06-20
[3.10.0]:https://github.com/secuconnect/secuconnect-java-sdk/compare/3.9.1...3.10.0

### Security
- Update dependencies to the latest versions.

### Deprecated
- `Model.LoyaltyMerchantcardsDTOCreateMerchantcards` element `assign` and `contract` 


### Added
- `Model.ApplePayDescriptor`
- `Model.GooglePayDescriptor`
- `Model.LoyaltyMerchantcardsDTOCustomer`
- `Model.LoyaltyMerchantcardsDTOCreateMerchantcards` element `customer`
- `Model.PaymentContainersProductModel` element `merchant`
- `Model.PayPalDescriptor`
- `Model.SmartTransactionPaymentContainerDTO`
- `Model.SmartTransactionPaymentCustomerDTO`

### Changed
- `Model.LoyaltyMerchantcardsDTOCardsAmount` renamed to `Model.LoyaltyMerchantcardsDTOCreateMerchantcards`
- `Model.SmartTransactionsDTO` element `customer` from `Model.PaymentCustomersProductModel` to `Model.SmartTransactionPaymentCustomerDTO`
- `Model.SmartTransactionsDTO` element `container` from `Model.ProductInstanceUID` to `Model.SmartTransactionPaymentContainerDTO`
- `Model.SmartTransactionsDTO` element `shipping_address` from `Model.PaymentCustomersProductModel` to `Model.SmartTransactionPaymentCustomerDTO`
- `Model.SmartTransactionsPrepare` element `customer` from `Model.ProductInstanceUID` to `Model.SmartTransactionPaymentCustomerDTO`
- `Model.SmartTransactionsPrepare` element `container` from `Model.ProductInstanceUID` to `Model.SmartTransactionPaymentContainerDTO`

### Fixed
- `Model.LoyaltyTransactionsProductModel` element `last_changee` renamed to `last_change`
- typos in descriptions

### Removed
- `Model.GeneralMerchantsDTO`
- `Model.LoyaltyCustomersContactDTO`
- `Model.PaymentTransactionsCancelList`
- `Model.ResultAlwaysTrue`
- `Model.ResultTrueOrFalse`
- `Model.SmartTransactionsPrepare` element `device_source`, `is_demo`, `is_paypal_basic`, `mode` and `method` 
- `Model.SmartTransactionPreparePayloadDataModel`


## [3.9.1] - 2022-03-28
[3.9.1]:https://github.com/secuconnect/secuconnect-java-sdk/compare/3.9.0...3.9.1

### Fixed
- `Api.PaymentTransactionsApi.updateShippingInformation()` missing body parameter


## [3.9.0] - 2022-02-28
[3.9.0]:https://github.com/secuconnect/secuconnect-java-sdk/compare/3.8.0...3.9.0

### Security
- Update dependencies to the latest versions.

### Added
- `Api.PaymentTransactionsApi.increaseAmount()`
- `Model.PaymentTransactionsIncreaseAmountDTO`
- `Model.SmartTransactionsProductModel` element `subscription`
- `Model.SmartTransactionsBasketProduct` element `plan_id`
- `Model.SmartTransactionsBasketProduct` element `start_at`
- `Model.SmartTransactionsApplicationContextReturnUrls` element `url_push`


## [3.8.0] - 2022-01-25
[3.8.0]:https://github.com/secuconnect/secuconnect-java-sdk/compare/3.7.1...3.8.0

### Security
- Update dependencies to the latest versions.

### Added
- `Api.PaymentTransactionsApi.getCrowdFundingData()`
- `Api.PaymentTransactionsApi.updateShippingInformation()`
- `Api.PublicWebsiteApi.availableCountries()`
- `Model.AvailableCountry`
- `Model.CrowdFundingDataDetails`
- `Model.CrowdFundingDataOpenAmount`
- `Model.CrowdFundingDataOpenAmountInsideCancelPeriod`
- `Model.CrowdFundingDataOpenAmountOutsideCancellationPeriod`
- `Model.PaymentContext` element `creditcard_schemes`
- `Model.PaymentCrowdFundingData`
- `Model.PaymentMethodBreakdown`
- `Model.SecupayTransactionSetShippingInformationDTO` element `shipped_at` and `order_id`
- `Model.SmartTemplatesElementModel` element `form_elements`
- `Model.SmartTemplatesFormElementModel`
- `Model.SmartTransactionsApplicationContext` element `language`

### Fixed
- Some broken tests


## [3.7.1] - 2021-12-13
[3.7.1]:https://github.com/secuconnect/secuconnect-java-sdk/compare/3.7.0...3.7.1

### Added
- Using the Apache Maven registry from GitHub.


## [3.7.0] - 2021-12-13
[3.7.0]:https://github.com/secuconnect/secuconnect-java-sdk/compare/3.6.0...3.7.0

### Security
- Update dependencies to the latest versions.


## [3.6.0] - 2021-09-30
[3.6.0]:https://github.com/secuconnect/secuconnect-java-sdk/compare/3.5.0...3.6.0

### Added
- `Api.ServicesIdentrequestsApi`
- `Api.ServicesIdentresultsApi`
- `Model.ContactData`
- `Model.IdentDocument`
- `Model.IdentDocumentData`
- `Model.IdentificationCustomData`
- `Model.IdentificationProcess`
- `Model.IdentrequestPerson`
- `Model.IdentrequestPersonDTO`
- `Model.IdentrequestRedirectUrls`
- `Model.IdentresultPerson`
- `Model.ServicesIdentrequestsList`
- `Model.ServicesIdentrequestsProductDTO`
- `Model.ServicesIdentrequestsProductModel`
- `Model.ServicesIdentresultsList`
- `Model.ServicesIdentresultsProductModel`
- `Model.UserAddressData`
- `Model.UserData`
- `Model.ValueField`
- `Model.PaymentContractsDTORequestId` element `identrequest`
- `Model.PaymentContractsDTORequestId` element `signed_contract`


## [3.5.0] - 2021-09-13
[3.5.0]:https://github.com/secuconnect/secuconnect-java-sdk/compare/3.4.2...3.5.0

### Security
- Update dependencies to the latest versions.

### Changed
- `Api.PaymentPlansApi.paymentPlansApiInterfacePatchPlans()` was renamed to `paymentPlansPatch()`
- `Api.PaymentPlansApi.paymentPlansApiInterfaceUpdatePlans()` was renamed to `paymentPlansPut()`

### Removed
- `Api.GeneralStoresApi.assignGoogleKey()`
- `Api.LoyaltyCustomersApi.checkForDuplicates()`
- `Api.LoyaltyCustomersApi.removeCustomer()`
- `Api.LoyaltyMerchantcardsApi.addMerchantCard()`
- `Api.LoyaltyMerchantcardsApi.removeMerchantCard()`
- `Api.PaymentContractsApi.paymentContractsIdDelete()`
- `Api.PaymentContractsApi.paymentContractsIdPut()`
- `Api.PaymentContractsApi.paymentContractsPost()`
- `Model.CustomersWithoutMerchantcardAndDuplicatedCustomers`
- `Model.LoyaltyCustomersRemoved`
- `Model.PaymentContractsDTO`


## [3.4.2] - 2021-08-13
[3.4.2]:https://github.com/secuconnect/secuconnect-java-sdk/compare/3.4.1...3.4.2

### Added
- `Api.GeneralContractsApi.updateBankAccount()`
- `Api.PaymentContractsApi.updateBankAccount()`


## [3.4.1] - 2021-07-12
[3.4.1]:https://github.com/secuconnect/secuconnect-java-sdk/compare/3.4.0...3.4.1

### Added
- `Model.GeneralContractsProductModel` element `approved`
- `Model.PaymentContractsProductModel` element `approved`


## [3.4.0] - 2021-06-04
[3.4.0]:https://github.com/secuconnect/secuconnect-java-sdk/compare/3.3.0...3.4.0

### Security

- Update dependencies to the latest versions.

### Added

- `Api.GeneralContractsApi.revokeAccrualCall()`
- `Api.PaymentContractsApi.revokeAccrualCall()`
- `Model.GeneralContractsProductModel` element `id_old`


## [3.3.0] - 2021-05-03
[3.3.0]:https://github.com/secuconnect/secuconnect-java-sdk/compare/3.2.0...3.3.0

### Security

- Update dependencies to the latest versions.

### Added

- `Api.GeneralMerchantsApi.getPublicData()`
- `Api.SmartTemplatesApi`
- `Model.BackgroundImageOption`
- `Model.GeneralContractsProductModel` element `payment_link_options`
- `Model.GeneralMerchantsPublicDataCompany`
- `Model.GeneralMerchantsPublicDataModel`
- `Model.PaymentContext`
- `Model.PaymentInstructions`
- `Model.PaymentLinkOptions`
- `Model.SmartTemplatesAccordionItemModel`
- `Model.SmartTemplatesComponentModel`
- `Model.SmartTemplatesElementModel`
- `Model.SmartTemplatesList`
- `Model.SmartTemplatesProductModel`
- `Model.SmartTransactionsDTO` element `payment_context`
- `Model.SmartTransactionsPaymentLinks` element `paypal` and `sofort`
- `Model.SmartTransactionsProductModel` element `payment_instructions` and `payment_context`

### Fixed

- `JSON.createGson()` to convert `OneOfSmartTransactionsDeliveryOptionsModel` and `PaymentInstructions` correctly


## [3.2.0] - 2021-03-15
[3.2.0]:https://github.com/secuconnect/secuconnect-java-sdk/compare/3.1.0...3.2.0

### Added

- `Api.PaymentPlansApi`
- `Api.PaymentSubscriptionsApi`
- `Model.BillingCyclesItem`
- `Model.PaymentPlanInterval`
- `Model.PaymentPlansDTO`
- `Model.PaymentPlansList`
- `Model.PaymentPlansProductModel`
- `Model.PaymentSubscriptionsList`
- `Model.PaymentSubscriptionsProductModel`
- `Model.PaymentSubscriptionsProductModelBillingCycles`
- `Model.SmartTransactionsContainer`
- `Model.SecupayBaseBasketItem` element `plan_id` and `start_at`
- `Model.SecupayTransactionCaptureDTO` element `shipping_information`
- `Model.SmartTransactionsApplicationContext` element `checkout_template`

### Changed

- `Api.GeneralContractsApi` method `getAvailablePaymentMethods` returns `List<String>`
- `Model.PaymentCancelResult` element `result` is an instance of `PaymentCancelResultDetails`
- `Model.SecupayTransactionUpdateBasketDTO` element `contract` is an instance of `PaymentContractsProductModel`
- `Model.SecupayTransactionCancelDTO` element `contract` is an instance of `PaymentContractsProductModel`
- `Model.SecupayTransactionCaptureDTO` element `contract` is an instance of `PaymentContractsProductModel`
- `Model.SmartTransactionsProductModel` element `container` is an instance of `SmartTransactionsContainer`

### Fixed

- `Model.GeoAddress` element `address_components` is a List of `AddressComponents`


## [3.1.0] - 2020-12-29
[3.1.0]:https://github.com/secuconnect/secuconnect-java-sdk/compare/3.0.0...3.1.0

### Security

- Update dependencies to the latest versions.

### Added

- `Api.PaymentContainersApi.mandate()`
- `Api.PaymentContainersApi.uploadMandate()`
- `Model.MandateDTO`
- `Model.MandateProductModel`
- `Model.SmartTransactionsPrepare` element `device_source`
- `Model.SmartTransactionsShippingModel` element `type`
- `Model.SmartTransactionsCollectionModel` element `code`
- `Model.UploadMandateDTO`
- `Model.UploadMandateProductModel`
- `Api.PaymentTransactionsApi.getPaymentTransactionsOldFormat()`
- `Model.SmartTransactionsDTO` element `application_context`
- `Model.SmartTransactionsDTO` element `communications`
- `Model.SmartTransactionsProductModel` element `application_context`
- `Model.SmartTransactionsProductModel` element `communications`
- `Model.SmartTransactionsProductModel` element `payment_links`
- `Model.SmartTransactionsProductModel` element `prepaid_sales`
- `Model.PaymentContractsDTORequestId` element `payout_purpose`

### Fixed

- `Api.SmartRoutingsApi.removeRouting()` does not return a List, it's only returns one item.
- `Model.SmartTransactionsDTO` element `device_source` is an instance of `ProductInstanceUID` instead of `String`
- `Model.GeneralMerchantsProductModel` element `id_old` is an instance of `Integer` instead of `String`
- `Model.GeneralMerchantsProductModel` element `legal_details` is a List of `GeneralMerchantsLegalDetails`
- `Model.GeneralMerchantsProductModel` element `urls` is a List of `GeneralMerchantsUrls`
- `Model.SmartTransactionsCollectionModel`
- `Model.SmartTransactionsShippingModel`
- `Model.SmartTransactionsSetDeliveryModel` element `delivery_options`

### Removed

- `Model.SmartTransactionsBaseDeliveryOptionsModel`
- `Model.SmartTransactionsBaseDeliveryOptionsModelType`
- `Model.SmartTransactionsDTO` element `status`, `receipt` and `receipt_number`
- `Model.SmartTransactionsCheckoutLinks` element `url_success`, `url_failure`, `url_abort` and `url_error` (moved to `application_context.return_urls`)


## [3.0.0] - 2020-08-20
[3.0.0]:https://github.com/secuconnect/secuconnect-java-sdk/compare/2.1.0...3.0.0

### Security
- Update all dependencies to the latest versions.

### Deprecated
- Stomp integration will be refactored in a future version.

### Added
- The access token will be refreshed automatically when the API answers with the HTTP 401 status code.
- It is now possible to handle multiple client credentials or dev environments at the same time.
- `Api.LoyaltyCardgroupsApi.getCardgroupsByMerchantId()`
- `Api.PaymentTransactionsApi.addTransaction()`
- `Api.SmartTransactionsApi.setDelivery()`

### Changed
- Require TLS 1.2
- Require Java 1.8 (or newer)
- Change package name from `io.secuconnect.client` to `com.secuconnect.client`
- ApiClient was refactored
- Cache handling was refactored
- "okhttp" was replaced by "okhttp3"

### Fixed
- Multithreaded Maven deployment results in failing tests

### Removed
- `Api.LoyaltySalesApi`
- `Api.LoyaltyStoregroupsApi`
- `Api.SmartDevicesApi.createPrepaidTid()`
- `Api.SmartDevicesApi.createVirtualDevice()`
- `Api.SmartDevicesApi.createVirtualDevice()`
- `Model.GeneralMerchantsCheckoutOptions`
- `Model.GeneralMerchantsCheckoutOptionsCollection`
- `Model.GeneralMerchantsCheckoutOptionsCollectionSmartDevices`
- `Model.LoyaltyDTOStore`
- `Model.LoyaltyStoregroupsDTOStoresAddressComponents`
- `Model.LoyaltyStoregroupsList`
- `Model.LoyaltyStoregroupsProductModel`
- `Model.SmartDevicesDTOSecubaseConfig`
- `Model.SmartDevicesSecubaseConfig`
- `Model.SmartDevicesSecubaseConfigLogging`
- `Model.SmartDevicesSecubaseConfigLoggingFileNet`
- `Model.GeneralMerchantsCheckoutOptionsShipping`
- `Model.SmartTransactionsBasketText`
- `Model.LoyaltyStoregroupsDTO`
- `Model.SmartTransactionsDTO.order_option`
- `Model.SmartTransactionsDTO.pickup_options`
- `Model.SmartTransactionsPickupOptions`
- `Model.SmartTransactionsProductModel.order_option` replaced by `delivery_options`
- `Model.SmartTransactionsProductModel.pickup_options` replaced by `delivery_options`
- `Model.SmartTransactionsProductModel.shipment_details` replaced by `delivery_options`
- `Model.LoyaltyDTOMerchant`
- `Model.SmartTransactionsShipmentDetails`
- `Model.SmartDevicesDTOPrepaidTid`


## [2.5.0] - 2021-03-15
[2.5.0]:https://github.com/secuconnect/secuconnect-java-sdk/compare/2.4.0...2.5.0

### Added
- `Api.PaymentPlansApi`
- `Api.PaymentSubscriptionsApi`
- `Model.BillingCyclesItem`
- `Model.PaymentPlanInterval`
- `Model.PaymentPlansDTO`
- `Model.PaymentPlansList`
- `Model.PaymentPlansProductModel`
- `Model.PaymentSubscriptionsList`
- `Model.PaymentSubscriptionsProductModel`
- `Model.PaymentSubscriptionsProductModelBillingCycles`
- `Model.SmartTransactionsContainer`
- `Model.SecupayBaseBasketItem` element `plan_id` and `start_at`
- `Model.SecupayTransactionCaptureDTO` element `shipping_information`
- `Model.SmartTransactionsApplicationContext` element `checkout_template`

### Changed
- `Api.GeneralContractsApi` method `getAvailablePaymentMethods` returns `List<String>`
- `Model.PaymentCancelResult` element `result` is an instance of `PaymentCancelResultDetails`
- `Model.SecupayTransactionUpdateBasketDTO` element `contract` is an instance of `PaymentContractsProductModel`
- `Model.SecupayTransactionCancelDTO` element `contract` is an instance of `PaymentContractsProductModel`
- `Model.SecupayTransactionCaptureDTO` element `contract` is an instance of `PaymentContractsProductModel`
- `Model.SmartTransactionsProductModel` element `container` is an instance of `SmartTransactionsContainer`

### Fixed
- `Model.GeoAddress` element `address_components` is a List of `AddressComponents`


## [2.4.0] - 2020-12-29
[2.4.0]:https://github.com/secuconnect/secuconnect-java-sdk/compare/2.3.0...2.4.0

### Security

- Update dependencies to the latest versions.

### Added

- `Api.PaymentTransactionsApi.getPaymentTransactionsOldFormat()`
- `Model.SmartTransactionsDTO` element `application_context`
- `Model.SmartTransactionsDTO` element `communications`
- `Model.SmartTransactionsProductModel` element `application_context`
- `Model.SmartTransactionsProductModel` element `communications`
- `Model.SmartTransactionsProductModel` element `payment_links`
- `Model.SmartTransactionsProductModel` element `prepaid_sales`
- `Model.PaymentContractsDTORequestId` element `payout_purpose`

### Fixed

- `Model.GeneralMerchantsProductModel` element `id_old` is an instance of `Integer` instead of `String`
- `Model.GeneralMerchantsProductModel` element `legal_details` is a List of `GeneralMerchantsLegalDetails`
- `Model.GeneralMerchantsProductModel` element `urls` is a List of `GeneralMerchantsUrls`
- `Model.SmartTransactionsCollectionModel`
- `Model.SmartTransactionsShippingModel`
- `Model.SmartTransactionsSetDeliveryModel` element `delivery_options`

### Removed

- `Model.SmartTransactionsBaseDeliveryOptionsModel`
- `Model.SmartTransactionsBaseDeliveryOptionsModelType`
- `Model.SmartTransactionsDTO` element `status`, `receipt` and `receipt_number`
- `Model.SmartTransactionsCheckoutLinks` element `url_success`, `url_failure`, `url_abort` and `url_error` (moved to `application_context.return_urls`)


## [2.3.0] - 2020-09-14
[2.2.0]:https://github.com/secuconnect/secuconnect-java-sdk/compare/2.2.0...2.3.0

### Added

- `Api.PaymentContainersApi.mandate()`
- `Api.PaymentContainersApi.uploadMandate()`
- `Model.MandateDTO`
- `Model.MandateProductModel`
- `Model.SmartTransactionsPrepare` element `device_source`
- `Model.UploadMandateDTO`
- `Model.UploadMandateProductModel`

### Fixed

- `Model.SmartTransactionsDTO` element `device_source` is an instance of `ProductInstanceUID` instead of `String`


## [2.2.0] - 2020-09-07
[2.2.0]:https://github.com/secuconnect/secuconnect-java-sdk/compare/2.1.0...2.2.0

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
[2.1.0]:https://github.com/secuconnect/secuconnect-java-sdk/compare/2.0.0...2.1.0

### Added

- `Api.LoyaltyMerchantcardsApi`: added call `cardBalanceReceipt`
- `Api.LoyaltyTransactionsApi` was added
- `Api.ServicesUploadidentsProductApi` was added
- `Model.GeneralStoresProductModel`: added element `store_name`
- `Model.LoyaltyMerchantcardsProductWithReceiptModel`: added elements `trans_id` and `amount`
- `Model.PaymentContainerMandate`: added element `creditor_id`
- `Model.PaymentTransactionCancelDTO`: added element `container_id`
- `Model.SecupayTransactionProductModel`: added element `mandate`

### Fixed

- `Api.LoyaltyCustomersApi`: fixed response declaration from `List<Object>` to `List<String>`
- `Api.PaymentTransactionsApi`: changed model from `PaymentTransactionsCancelList` to `List<PaymentTransactionsProductModel>`
- `Model.GeneralStoresProductModel`: fixed type declaration of element `geometry`
- `Model.SecupayTransactionProductModelUsedPaymentInstrument`: fixed response declaration from `BankAccountDescriptor` to `OneOfPaymentContainersDTOModelPrivate`


## [2.0.0] - 2020-03-30
[2.0.0]:https://github.com/secuconnect/secuconnect-java-sdk/compare/1.9.0...2.0.0

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
- SmartTransactionsApi: the method "startTransaction" has now also a body parameter
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
[1.9.0]:https://github.com/secuconnect/secuconnect-java-sdk/compare/1.8.1...1.9.0

### Security
- Dependency updates


## [1.8.1] - 2019-12-23
[1.8.1]:https://github.com/secuconnect/secuconnect-java-sdk/compare/1.8.0...1.8.1

### Fixed
- PaymentTransactionsProductModel was invalid
- LoyaltyCardsApi fixed some response parameters


## [1.8.0] - 2019-12-20
[1.8.0]:https://github.com/secuconnect/secuconnect-java-sdk/compare/1.7.0...1.8.0

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
[1.7.0]:https://github.com/secuconnect/secuconnect-java-sdk/compare/1.6.2...1.7.0

### Added

- General.Contracts endpoint


## [1.6.2] - 2019-11-08
[1.6.2]:https://github.com/secuconnect/secuconnect-java-sdk/compare/1.6.1...1.6.2

### Fixed

- The class Authenticator does not got all options from the `Configuration.getDefaultApiClient()`


## [1.6.1] - 2019-11-04
[1.6.1]:https://github.com/secuconnect/secuconnect-java-sdk/compare/1.6.0...1.6.1

### Fixed

- Missing change in class Authenticator for the new method "setAuthHost"


## [1.6.0] - 2019-11-04
[1.6.0]:https://github.com/secuconnect/secuconnect-java-sdk/compare/1.5.0...1.6.0

### Security

- dependency updates

### Added

- ApiClient method setAuthHost(String authHost) to change the URL of the oauth service
- ApiClient method setTimeout(int timeout) to change the timeout settings of the httpClient


## [1.5.0] - 2019-08-16
[1.5.0]:https://github.com/secuconnect/secuconnect-java-sdk/compare/1.4.0...1.5.0

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
[1.4.0]:https://github.com/secuconnect/secuconnect-java-sdk/compare/1.3.1...1.4.0

### Changed

- removed dependency "javax.annotation-api"
- removed dependency "hazelcast"
- removed dependency "cache-api"

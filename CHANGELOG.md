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


## [3.29.0] - 2024-04-09
[3.29.0]:https://github.com/secuconnect/secuconnect-java-sdk/compare/3.28.0...3.29.0

- *removed element*: `age` and `days_until_birthday` were removed from `LoyaltyCustomersDTO` as they are ignored by the API.

### Changed
- `ApiClient`
- `Environment`
- `ExceptionBody`
- `Api.LoyaltyMerchantcardsApi`
- `Model.GeneralContractsTransferBalanceModel`
- `Model.LoyaltyCustomersDTO`
- `Model.LoyaltyMerchantcardsCardBalanceReceipt`
- `Model.LoyaltyMerchantcardsDTO`
- `Model.LoyaltyMerchantcardsDTOCardBalanceReceipt`
- `Model.LoyaltyMerchantcardsDTOCheckPasscode`
- `Model.LoyaltyMerchantcardsDTOCreateMerchantcards`
- `Model.LoyaltyMerchantcardsDTOCsc`
- `Model.LoyaltyMerchantcardsDTOCustomer`
- `Model.LoyaltyMerchantcardsDTOLock`
- `Model.LoyaltyMerchantcardsDTONewPasscode`
- `Model.LoyaltyMerchantcardsDTOPaymentContainer`
- `Model.LoyaltyMerchantcardsDTOResetPasscode`
- `Model.LoyaltyMerchantcardsDTOTransaction`
- `Model.LoyaltyMerchantcardsDTOValidateMerchantCard`
- `Model.LoyaltyMerchantcardsList`
- `Model.LoyaltyMerchantcardsProductModel`
- `Model.LoyaltyMerchantcardsProductWithReceiptModel`
- `Model.LoyaltyMerchantcardsValidateMerchantCard`
- `Model.VirtualTerminalDataModel`

### Removed
- `Model.GeneralContractsTransferBalanceModelBalances`


## [3.29.0] - 2024-03-20
[3.29.0]:https://github.com/secuconnect/secuconnect-java-sdk/compare/3.28.0...3.29.0

- **Important note:** As of end of April 2024 you cannot create Payment Containers with type `credit_card` anymore.
  Your application needs to create these Payment Containers implicitly with `POST /Smart/Transactions/{id}/prepare/{method}`.
  If your application uses the deprecated way, you are demanded to revise your integration.
  With the sole exception of bank account details for payouts (outgoing bank transfers), we recommend to use the implicit creation as described above everywhere in your application.
- *fixed endpoint*: changed request parameter `general_contract_id` from `ProductInstanceID` to `string` in `GeneralContractsApi.getTransferBalance()`
- *renamed endpoint*: from `LoyaltyCardgroupsApi` to `LoyaltyCardGroupsApi`
- *changed param type*: from `SmartTransactionsPrepare` to `SmartTransactionsStart` (which extends the `SmartTransactionsPrepare`) in `SmartTransactionsApi.startTransaction()`
- *new element* `vlh` added to  `SmartDevicesProducts`

### Added
- `Model.SmartDeviceProductsVlh`
- `Model.SmartTransactionsStart`

### Changed
- `ApiClient`
- `Environment`
- `ExceptionBody`
- `Api.GeneralContractsApi`
- `Api.LoyaltyCardgroupsApi`
- `Api.LoyaltyTransactionsApi`
- `Api.PaymentContainersApi`
- `Api.SmartTransactionsApi`
- `Model.LoyaltyCardgroupsDTO`
- `Model.LoyaltyCardgroupsDTOCheckPasscodeEnabled`
- `Model.LoyaltyCardgroupsList`
- `Model.LoyaltyCardgroupsProductModel`
- `Model.LoyaltyCardgroupsUpdateDTO`
- `Model.LoyaltyTransactionsDTOCard`
- `Model.LoyaltyTransactionsDTOCardgroup`
- `Model.LoyaltyTransactionsDTOMerchant`
- `Model.LoyaltyTransactionsDTOMerchantcard`
- `Model.LoyaltyTransactionsDTORelatedTransactions`
- `Model.LoyaltyTransactionsDTOStore`
- `Model.LoyaltyTransactionsList`
- `Model.LoyaltyTransactionsProductModel`
- `Model.PaymentContainersDTO`
- `Model.SmartDevicesProducts`
- `Model.SmartTransactionPaymentContainerDTO`


## [3.28.0] - 2024-03-15
[3.28.0]:https://github.com/secuconnect/secuconnect-java-sdk/compare/3.27.0...3.28.0

- *removed endpoint*: `LoyaltyCardgroupsApi.getCardgroupsByMerchantId()`
- *changed param type*: The param `body` changed from `LoyaltyCardgroupsDTO` to `LoyaltyCardgroupsUpdateDTO` in `LoyaltyCardgroupsApi.updateCardGroup()`
- *changed name*: renamed`ServicesIdentrequestsApi` to `ServicesIdentRequestsApi`
- *changed name*: renamed`ServicesIdentresultsApi` to `ServicesIdentResultsApi`
- *changed name*: renamed`ServicesUploadidentsApi` to `ServicesUploadIdentsApi`
- *new endpoint*: `SmartDevicesApi.getDevicePinConfig()`
- *new endpoint*: `SmartDevicesApi.updateDevicePin()`
- *changed element type*: `pin` changed from `int` to `string` in `CardPin`
- *removed element*: `display_name_raw` and `stock_warn_limit` in `LoyaltyCardgroupsDTO`
- *changed element type*: `merchant` changed from `LoyaltyCardgroupsDTOMerchant` to `string` in `LoyaltyCardgroupsDTO`
- *changed element type*: `merchant` changed from `LoyaltyCardgroupsDTOMerchant` to `GeneralMerchantsProductModel` in `LoyaltyCardgroupsProductModel`
- *changed element type*: `stock_warn_limit` changed from `string` to `int` in `LoyaltyCardgroupsProductModel`
- *new element*: `balance_limit`, `balance_expiry`, `cancel_selected` and `description` in `LoyaltyCardgroupsProductModel`

### Security
- Dependency updates

### Added
- `Model.GetSmartDevicePinConfig`
- `Model.GetSmartDevicePinConfigMerchant`
- `Model.GetSmartDevicePinConfigSmartDevice`
- `Model.GetSmartDevicePinConfigStore`
- `Model.LoyaltyCardgroupsUpdateDTO`
- `Model.UpdateSmartDevicePin`

### Changed
- `ApiClient`
- `Environment`
- `ExceptionBody`
- `Api.LoyaltyCardgroupsApi`
- `Api.LoyaltyCardsApi`
- `Api.LoyaltyCustomersApi`
- `Api.LoyaltyMerchantcardsApi`
- `Api.ServicesIdentrequestsApi`
- `Api.ServicesIdentresultsApi`
- `Api.ServicesUploadidentsApi`
- `Api.SmartDevicesApi`
- `Model.CardPin`
- `Model.IdentDocument`
- `Model.IdentificationProcess`
- `Model.IdentrequestPerson`
- `Model.IdentrequestRedirectUrls`
- `Model.IdentresultPerson`
- `Model.LoyaltyCardgroupsDTO`
- `Model.LoyaltyCardgroupsDTOCheckPasscodeEnabled`
- `Model.LoyaltyCardgroupsProductModel`
- `Model.LoyaltyCardsDTOAccount`
- `Model.LoyaltyCardsList`
- `Model.LoyaltyCardsProductModel`
- `Model.LoyaltyCustomersDTO`
- `Model.LoyaltyCustomersList`
- `Model.LoyaltyCustomersPaymentContainerModel`
- `Model.LoyaltyCustomersProductModel`
- `Model.ProductExceptionPayload`
- `Model.ResultBoolean`
- `Model.ServicesIdentrequestsProductModel`
- `Model.ServicesIdentresultsProductModel`

### Removed
- `Model.LoyaltyCardgroupsDTOMerchant`


## [3.27.0] - 2024-01-31
[3.27.0]:https://github.com/secuconnect/secuconnect-java-sdk/compare/3.26.0...3.27.0

- *changed response type*: `PaymentTransactionsApi.capture()` changed from `PaymentTransactionsProductModel[] ` to `PaymentTransactionsProductModel`
- *new method*: `ApiClient.setTimeouts()` to set individual timeouts per request 
- *bug fix*: `ApiClient.setDebugging(true)` does not throw an `UnsupportedOperationException` anymore

### Security
- Dependency updates

### Changed
- `/ApiCallback`
- `/ApiClient`
- `/ApiException`
- `/ApiResponse`
- `/Environment`
- `/ExceptionBody`
- `/JSON`
- `/Pair`
- `Api.PaymentTransactionsApi`
- `Model.PaymentContractsDTORequestIdAdditionalDataCreateCard`


## [3.26.0] - 2023-12-18
[3.26.0]:https://github.com/secuconnect/secuconnect-java-sdk/compare/3.25.0...3.26.0

- *new endpoint*: `capture` in `PaymentTransactionsApi`
- *new element*: `documents` in `PaymentTransactionsProductModel`

### Security
- Dependency updates

### Added
- `Model.PaymentTransactionsCaptureDTO`
- `Model.PaymentTransactionsProductModelDocuments`

### Changed
- `Api.PaymentTransactionsApi`
- `Model.PaymentTransactionsProductModel`
- `Model.SmartTransactionsBasketProduct`


## [3.25.0] - 2023-11-06
[3.25.0]:https://github.com/secuconnect/secuconnect-java-sdk/compare/3.24.0...3.25.0

- *new examples*: `GeneralContractsFindResponse`, `GeneralContractsResourceResponse`, `GeneralContractsGetTransferBalancesResponse`, `GeneralContractsGetAvailablePaymentMethodsRequest`, `GeneralContractsGetAvailablePaymentMethodsResponse`, `GeneralContractsGetIframeOptionsResponse`, `GeneralContractsSetPaymentLinkOptionsRequest` and `GeneralContractsGetCurrenciesResponse` in `GeneralContractsApi`
- *new examples*: `GeneralStoresFindResponse`, `GeneralStoresCreateRequest`, `GeneralStoresResourceResponse` and `GeneralStoresUpdateRequest` in `GeneralStoresApi`
- *removed endpoint*: `GeneralStoresApi->checkIn()`
- *new element*: `application_context.shop_details` in `SmartTransactionsProductModel`
- *new element*: `transmitted_to_bank` in `PaymentTransactionsProductModel`

### Added
- `Model.SmartTransactionsApplicationContextShopDetails`

### Changed
- `Api.GeneralContractsApi`
- `Api.GeneralStoresApi`
- `Model.DayTime`
- `Model.GeneralStoresDTO`
- `Model.GeneralStoresList`
- `Model.GeneralStoresProductModel`
- `Model.PaymentTransactionsProductModel`
- `Model.SmartTransactionsApplicationContext`

### Removed
- `Model.GeneralStoresDTOType`


## [3.24.0] - 2023-10-17
[3.24.0]:https://github.com/secuconnect/secuconnect-java-sdk/compare/3.23.0...3.24.0

- *changed element type*: `legal_details` changed from `GeneralMerchantsLegalDetails` to `GeneralMerchantsLegalDetailsDTO` in `GeneralMerchantsPublicDataDTO`
- *renamed element*: `merchant_urls` renamed to `urls` in `GeneralMerchantsPublicDataDTO`
- *changed element type*: `cycle_executions` changed from `BillingCyclesItem` to `CycleExecutions` in `PaymentSubscriptionsProductModelBillingCycles`
- *changed default value*: `status` changed from `"active"` to `null` in `PaymentPlansProductModel` and `PaymentPlansDTO`

### Security
- dependency updates

### Added
- `Model.CycleExecutions`
- `Model.GeneralMerchantsLegalDetailsDTO`

### Changed
- `Api.GeneralMerchantsApi`
- `Api.PaymentPlansApi`
- `Api.PaymentSubscriptionsApi`
- `Model.AddressComponents`
- `Model.BillingCyclesItem`
- `Model.GeneralMerchantsLegalDetails`
- `Model.GeneralMerchantsList`
- `Model.GeneralMerchantsProductModel`
- `Model.GeneralMerchantsPublicDataCompany`
- `Model.GeneralMerchantsPublicDataDTO`
- `Model.GeneralMerchantsUrls`
- `Model.GeneralMerchantsUser`
- `Model.GeneralMerchantsUserEmail`
- `Model.MerchantCategoryDataModel`
- `Model.PaymentPlanInterval`
- `Model.PaymentPlansDTO`
- `Model.PaymentPlansProductModel`
- `Model.PaymentSubscriptionsProductModel`
- `Model.PaymentSubscriptionsProductModelBillingCycles`


## [3.23.0] - 2023-09-26
[3.23.0]:https://github.com/secuconnect/secuconnect-java-sdk/compare/3.22.0...3.23.0

- *new element*: `currency` in `PaymentInvoicesProductModel`
- *new element*: `contract` in `PaymentTransactionsProductModel`
- *changed element*: `result` allows now boolean values too in `PaymentCrowdFundingData`

### Changed
- `Api.PaymentPayoutsApi`
- `Api.PaymentSecupayPayoutApi`
- `Model.DocumentLink`
- `Model.PaymentInvoicesList`
- `Model.PaymentInvoicesProductModel`
- `Model.PaymentPayoutsProductModel`
- `Model.PaymentTransactionsProductModel`
- `Model.SecupayPayoutDTO`
- `Model.SecupayPayoutListItem`
- `Model.SecupayPayoutProductModel`
- `Model.SecupayPayoutWithoutCustomerDTO`
- `Model.SecupayTransactionListItem`


## [3.22.0] - 2023-09-20
[3.22.0]:https://github.com/secuconnect/secuconnect-java-sdk/compare/3.21.0...3.22.0

- documentation updates
- *new element*: `apiv2_products` in `GetAvailablePaymentMethodsDTO`
- *new element*: `deposited_amount`, `deducted_amount` and `result` in `PaymentCrowdFundingData`
- *new element*: `description` and `description_raw` in `PaymentTransactionsProductModel
- *fixed endpoint*: wrong endpoint url in `GeneralMerchantsApi.getMerchantCategories()`
- *changed response type*: `GeneralContractsApi.getAvailableCurrencies()` changed from `AvailableCurrencies` to `string[]`
- *changed response type*: `PaymentContractsApi.paymentContractsIdPaymentMethodsGet()` changed from `StringList` to `string[]`
- *removed element*: `total_amount` and `total_count` in `CrowdFundingDataDetails`
- *removed model*: `AvailableCurrencies`
- *removed model*: `StringList`

### Changed
- `Api.CardprocessingInvoicesApi`
- `Api.CardprocessingTransactionsApi`
- `Api.DocumentUploadsApi`
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
- `Api.PaymentMandatesApi`
- `Api.PaymentPayoutsApi`
- `Api.PaymentPlansApi`
- `Api.PaymentSecupayCreditcardsApi`
- `Api.PaymentSecupayDebitsApi`
- `Api.PaymentSecupayInvoicesApi`
- `Api.PaymentSecupayPayoutApi`
- `Api.PaymentSecupayPrepaysApi`
- `Api.PaymentSecupaySofortApi`
- `Api.PaymentSubscriptionsApi`
- `Api.PaymentTransactionsApi`
- `Api.PrepaidContractsApi`
- `Api.PrepaidItemsApi`
- `Api.PrepaidReportsApi`
- `Api.PrepaidSalesApi`
- `Api.PublicWebsiteApi`
- `Api.ServicesIdentrequestsApi`
- `Api.ServicesIdentresultsApi`
- `Api.ServicesUploadidentsApi`
- `Api.SmartDevicesApi`
- `Api.SmartRoutingsApi`
- `Api.SmartTemplatesApi`
- `Api.SmartTransactionsApi`
- `Model.BankAccountDescriptor`
- `Model.Contact`
- `Model.CreditCardDescriptor`
- `Model.CrowdFundingDataDetails`
- `Model.CrowdFundingDataOpenAmount`
- `Model.CrowdFundingDataOpenAmountInsideCancelPeriod`
- `Model.CrowdFundingDataOpenAmountOutsideCancellationPeriod`
- `Model.GeoAddress`
- `Model.GetAvailablePaymentMethodsDTO`
- `Model.InvitedBy`
- `Model.LoyaltyMerchantcardsProductModel`
- `Model.MandateDTO`
- `Model.MandateProductModel`
- `Model.OneOfPaymentContainersDTOModelPrivate`
- `Model.OneOfSmartTransactionsDeliveryOptionsModel`
- `Model.PayPalDescriptor`
- `Model.PaymentCancelResultDetails`
- `Model.PaymentContainerMandate`
- `Model.PaymentContainersDTO`
- `Model.PaymentContainersDTOCustomer`
- `Model.PaymentContainersList`
- `Model.PaymentContainersProductModel`
- `Model.PaymentContext`
- `Model.PaymentContractsDTOClone`
- `Model.PaymentContractsDTOIFrameOpts`
- `Model.PaymentContractsDTORequestId`
- `Model.PaymentContractsProductModel`
- `Model.PaymentCrowdFundingData`
- `Model.PaymentCustomersDTO`
- `Model.PaymentCustomersList`
- `Model.PaymentCustomersProductModel`
- `Model.PaymentInformation`
- `Model.PaymentInstructions`
- `Model.PaymentMethodBreakdown`
- `Model.PaymentTransactionCancelDTO`
- `Model.PaymentTransactionsCheckStatus`
- `Model.PaymentTransactionsIncreaseAmountDTO`
- `Model.PaymentTransactionsProductModel`
- `Model.PaymentTransactionsShippingUrl`
- `Model.ProductExceptionPayload`
- `Model.ProductInstanceID`
- `Model.SecupayBaseBasketItem`
- `Model.SecupayBasketItem`
- `Model.SecupayRedirectUrl`
- `Model.SecupayTransactionProductDTO`
- `Model.SecupayTransactionProductDTOExperience`
- `Model.SecupayTransactionProductDTOSubscription`
- `Model.SecupayTransactionProductModel`
- `Model.SecupayTransactionProductModelUsedPaymentInstrument`
- `Model.SecupayTransactionSetShippingInformationDTO`
- `Model.SmartTransactionPaymentContainerDTO`
- `Model.SmartTransactionPaymentCustomerDTO`
- `Model.SmartTransactionsApplicationContext`
- `Model.SmartTransactionsApplicationContextIframeOpts`
- `Model.SmartTransactionsApplicationContextLocks`
- `Model.SmartTransactionsApplicationContextReturnUrls`
- `Model.SmartTransactionsBaseProduct`
- `Model.SmartTransactionsBasket`
- `Model.SmartTransactionsBasketInfo`
- `Model.SmartTransactionsBasketProduct`
- `Model.SmartTransactionsBasketProductGroup`
- `Model.SmartTransactionsBonusProducts`
- `Model.SmartTransactionsCheckin`
- `Model.SmartTransactionsCheckoutLinks`
- `Model.SmartTransactionsCollectionModel`
- `Model.SmartTransactionsCommunication`
- `Model.SmartTransactionsContainer`
- `Model.SmartTransactionsDTO`
- `Model.SmartTransactionsIdent`
- `Model.SmartTransactionsMerchant`
- `Model.SmartTransactionsPaymentLinks`
- `Model.SmartTransactionsPreTransactionModel`
- `Model.SmartTransactionsPrepaidSalesDetails`
- `Model.SmartTransactionsPrepare`
- `Model.SmartTransactionsPrepareCallbackUrls`
- `Model.SmartTransactionsProductModel`
- `Model.SmartTransactionsReceipt`
- `Model.SmartTransactionsReceiptValue`
- `Model.SmartTransactionsShippingModel`
- `Model.SmartTransactionsSubBasketProduct`
- `Model.SmartTransactionsTimeSlot`
- `Model.UploadMandateDTO`
- `Model.UploadMandateProductModel`

### Removed
- `Model.AvailableCurrencies`
- `Model.StringList`


## [3.21.0] - 2023-08-30
[3.21.0]:https://github.com/secuconnect/secuconnect-java-sdk/compare/3.20.0...3.21.0

- *new element*: `payment_config` in `IframeOptions`

### Added
- `Model.ApplepayPaymentConfig`
- `Model.GooglepayPaymentConfig`
- `Model.IframeOptionsPaymentConfig`

### Changed
- `Model.IframeOptions`


## [3.20.0] - 2023-08-29
[3.20.0]:https://github.com/secuconnect/secuconnect-java-sdk/compare/3.19.0...3.20.0

- *new element*: `project_name` in `GeneralAccountsAssignModelAssignment`
- *new endpoint*: `GeneralMerchantsApi->getMerchantCategories()`
- *new endpoint*: `PaymentTransactionsApi->getPaymentInstructionsForPaymentTransaction()`
- *new endpoint*: `PaymentTransactionsApi->getPaymentInstructionsForSmartTransaction()`
- *new endpoint*: `PaymentReportsApi->createReport()`
- *new endpoint*: `PaymentSalesApi->confirm()`
- *changed response object*: from `SecupayPayoutProductModel` to `SecupayPayoutWithoutCustomerResponse` in `PaymentSecupaypayoutApi`
- *changed element*: from `Payout_list` to `payout_list` in `SecupayPayoutDTO`
- *new element*: `trans_id` in `SecupayPayoutListItem`

### Added
- `Model.MerchantCategoryDataModel`
- `Model.PaymentTransactionsInstructionsModel`
- `Model.PrepaidReportsDTO`
- `Model.SecupayPayoutWithoutCustomerResponse`

### Changed
- `Api.GeneralMerchantsApi`
- `Api.PaymentSecupayPayoutApi`
- `Api.PaymentTransactionsApi`
- `Api.PrepaidReportsApi`
- `Api.PrepaidSalesApi`
- `Model.SecupayPayoutListItem`
- `Model.SecupayPayoutWithoutCustomerDTO`


## [3.19.0] - 2023-07-27
[3.19.0]:https://github.com/secuconnect/secuconnect-java-sdk/compare/3.18.0...3.19.0

- *fixed endpoint*: `SmartDevicesApi->getRouting()` used a wrong url 

### Changed
- `Api.SmartDevicesApi`


## [3.18.0] - 2023-07-19
[3.18.0]:https://github.com/secuconnect/secuconnect-java-sdk/compare/3.17.0...3.18.0

- *new element*: `description` in `GeneralContractsProductModel`
- *new element*: `notes`, `invoice_reference`, `tid`, `merchant_category` and `account_statement_text` in `PaymentContractsDTORequestId`

### Changed
- `Api.CardprocessingInvoicesApi`
- `Api.CardprocessingTransactionsApi`
- `Api.DocumentUploadsApi`
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
- `Api.PaymentMandatesApi`
- `Api.PaymentPayoutsApi`
- `Api.PaymentPlansApi`
- `Api.PaymentSecupayCreditcardsApi`
- `Api.PaymentSecupayDebitsApi`
- `Api.PaymentSecupayInvoicesApi`
- `Api.PaymentSecupayPayoutApi`
- `Api.PaymentSecupayPrepaysApi`
- `Api.PaymentSecupaySofortApi`
- `Api.PaymentSubscriptionsApi`
- `Api.PaymentTransactionsApi`
- `Api.PrepaidContractsApi`
- `Api.PrepaidItemsApi`
- `Api.PrepaidReportsApi`
- `Api.PrepaidSalesApi`
- `Api.PublicWebsiteApi`
- `Api.ServicesIdentrequestsApi`
- `Api.ServicesIdentresultsApi`
- `Api.ServicesUploadidentsApi`
- `Api.SmartDevicesApi`
- `Api.SmartRoutingsApi`
- `Api.SmartTemplatesApi`
- `Api.SmartTransactionsApi`
- `Model.Address`
- `Model.AddressComponents`
- `Model.Aggregate`
- `Model.AggregationResult`
- `Model.AggregationTimeResult`
- `Model.ApplePayDescriptor`
- `Model.ApplePayDescriptorHeader`
- `Model.AssignedBy`
- `Model.AvailableCountry`
- `Model.AvailableCurrencies`
- `Model.BackgroundImageOption`
- `Model.BankAccountDescriptor`
- `Model.BaseProductModel`
- `Model.BillingCyclesItem`
- `Model.CardPin`
- `Model.CardprocessingInvoicesList`
- `Model.CardprocessingInvoicesProductModel`
- `Model.CardprocessingTransactionsList`
- `Model.CardprocessingTransactionsProductModel`
- `Model.CheckoutConfiguration`
- `Model.CheckoutConfigurationNotifications`
- `Model.Contact`
- `Model.ContactData`
- `Model.CreatedField`
- `Model.CreditCardDescriptor`
- `Model.CrowdFundingDataDetails`
- `Model.CrowdFundingDataOpenAmount`
- `Model.CrowdFundingDataOpenAmountInsideCancelPeriod`
- `Model.CrowdFundingDataOpenAmountOutsideCancellationPeriod`
- `Model.DayTime`
- `Model.DocumentLink`
- `Model.DocumentUploadsBaseProductModel`
- `Model.DocumentUploadsDTOContent`
- `Model.DocumentUploadsProductModel`
- `Model.DocumentUploadsProductModelWithContent`
- `Model.FileToUpload`
- `Model.GeneralContractsDTO`
- `Model.GeneralContractsList`
- `Model.GeneralContractsProductModel`
- `Model.GeneralContractsTransferBalanceModel`
- `Model.GeneralContractsTransferBalanceModelBalances`
- `Model.GeneralMerchantsLegalDetails`
- `Model.GeneralMerchantsList`
- `Model.GeneralMerchantsProductModel`
- `Model.GeneralMerchantsPublicDataCompany`
- `Model.GeneralMerchantsPublicDataDTO`
- `Model.GeneralMerchantsPublicDataModel`
- `Model.GeneralMerchantsUrls`
- `Model.GeneralMerchantsUser`
- `Model.GeneralMerchantsUserEmail`
- `Model.GeneralStoresDTO`
- `Model.GeneralStoresDTOReason`
- `Model.GeneralStoresDTOType`
- `Model.GeneralStoresList`
- `Model.GeneralStoresProductModel`
- `Model.GeoAddress`
- `Model.GeoAddressGeometry`
- `Model.GetAvailablePaymentMethodsDTO`
- `Model.GooglePayDescriptor`
- `Model.GooglePayDescriptorIntermediateSigningKey`
- `Model.IdentDocument`
- `Model.IdentDocumentData`
- `Model.IdentificationCustomData`
- `Model.IdentificationProcess`
- `Model.IdentrequestPerson`
- `Model.IdentrequestPersonDTO`
- `Model.IdentrequestRedirectUrls`
- `Model.IdentresultPerson`
- `Model.IframeOptions`
- `Model.InvitedBy`
- `Model.ItemGroup`
- `Model.ListResponse`
- `Model.LoyaltyCardgroupsDTO`
- `Model.LoyaltyCardgroupsDTOCheckPasscodeEnabled`
- `Model.LoyaltyCardgroupsDTOMerchant`
- `Model.LoyaltyCardgroupsList`
- `Model.LoyaltyCardgroupsProductModel`
- `Model.LoyaltyCardsDTOAccount`
- `Model.LoyaltyCardsList`
- `Model.LoyaltyCardsProductModel`
- `Model.LoyaltyCustomersDTO`
- `Model.LoyaltyCustomersList`
- `Model.LoyaltyCustomersPaymentContainerModel`
- `Model.LoyaltyCustomersProductModel`
- `Model.LoyaltyMerchantcardsCardBalanceReceipt`
- `Model.LoyaltyMerchantcardsDTO`
- `Model.LoyaltyMerchantcardsDTOCardBalanceReceipt`
- `Model.LoyaltyMerchantcardsDTOCheckPasscode`
- `Model.LoyaltyMerchantcardsDTOCreateMerchantcards`
- `Model.LoyaltyMerchantcardsDTOCsc`
- `Model.LoyaltyMerchantcardsDTOCustomer`
- `Model.LoyaltyMerchantcardsDTOLock`
- `Model.LoyaltyMerchantcardsDTONewPasscode`
- `Model.LoyaltyMerchantcardsDTOPaymentContainer`
- `Model.LoyaltyMerchantcardsDTOResetPasscode`
- `Model.LoyaltyMerchantcardsDTOTransaction`
- `Model.LoyaltyMerchantcardsDTOValidateMerchantCard`
- `Model.LoyaltyMerchantcardsList`
- `Model.LoyaltyMerchantcardsProductModel`
- `Model.LoyaltyMerchantcardsProductWithReceiptModel`
- `Model.LoyaltyMerchantcardsValidateMerchantCard`
- `Model.LoyaltyTransactionsDTOCard`
- `Model.LoyaltyTransactionsDTOCardgroup`
- `Model.LoyaltyTransactionsDTOMerchant`
- `Model.LoyaltyTransactionsDTOMerchantcard`
- `Model.LoyaltyTransactionsDTORelatedTransactions`
- `Model.LoyaltyTransactionsDTOStore`
- `Model.LoyaltyTransactionsList`
- `Model.LoyaltyTransactionsProductModel`
- `Model.MandateDTO`
- `Model.MandateProductModel`
- `Model.OneOfPaymentContainersDTOModelPrivate`
- `Model.OneOfSmartTransactionsDeliveryOptionsModel`
- `Model.OpenHours`
- `Model.ParentModel`
- `Model.ParentObj`
- `Model.PayPalDescriptor`
- `Model.PaymentCancelResult`
- `Model.PaymentCancelResultDetails`
- `Model.PaymentContainerMandate`
- `Model.PaymentContainersDTO`
- `Model.PaymentContainersDTOCustomer`
- `Model.PaymentContainersList`
- `Model.PaymentContainersProductModel`
- `Model.PaymentContext`
- `Model.PaymentContractsDTOClone`
- `Model.PaymentContractsDTOIFrameOpts`
- `Model.PaymentContractsDTORequestId`
- `Model.PaymentContractsDTORequestIdAdditionalData`
- `Model.PaymentContractsDTORequestIdAdditionalDataCreateCard`
- `Model.PaymentContractsList`
- `Model.PaymentContractsProductModel`
- `Model.PaymentContractsRequestIdResult`
- `Model.PaymentCrowdFundingData`
- `Model.PaymentCustomersDTO`
- `Model.PaymentCustomersList`
- `Model.PaymentCustomersProductModel`
- `Model.PaymentInformation`
- `Model.PaymentInstructions`
- `Model.PaymentInvoicesList`
- `Model.PaymentInvoicesProductModel`
- `Model.PaymentLinkOptions`
- `Model.PaymentMandatesDTO`
- `Model.PaymentMandatesList`
- `Model.PaymentMandatesProductModel`
- `Model.PaymentMethodBreakdown`
- `Model.PaymentPayoutsList`
- `Model.PaymentPayoutsProductModel`
- `Model.PaymentPlanInterval`
- `Model.PaymentPlansDTO`
- `Model.PaymentPlansList`
- `Model.PaymentPlansProductModel`
- `Model.PaymentSubscriptionsList`
- `Model.PaymentSubscriptionsProductModel`
- `Model.PaymentSubscriptionsProductModelBillingCycles`
- `Model.PaymentTransactionCancelDTO`
- `Model.PaymentTransactionsCheckStatus`
- `Model.PaymentTransactionsIncreaseAmountDTO`
- `Model.PaymentTransactionsList`
- `Model.PaymentTransactionsProductModel`
- `Model.PaymentTransactionsProductModelCustomer`
- `Model.PaymentTransactionsProductModelDetails`
- `Model.PaymentTransactionsShippingUrl`
- `Model.PrepaidItemsBaseProductModel`
- `Model.PrepaidItemsList`
- `Model.PrepaidItemsProductModel`
- `Model.PrepaidMappingZvt`
- `Model.PrepaidMappingZvtItem`
- `Model.PrepaidReportsList`
- `Model.PrepaidReportsProductModel`
- `Model.PrepaidSalesItem`
- `Model.PrepaidSalesList`
- `Model.PrepaidSalesProductDTO`
- `Model.PrepaidSalesProductModel`
- `Model.PrepaidSalesSmartDevice`
- `Model.PrepaidZvtDTO`
- `Model.ProductExceptionPayload`
- `Model.ProductInstanceID`
- `Model.ProductInstanceUID`
- `Model.ReceiptType`
- `Model.ReceiptTypeValue`
- `Model.ReceiptValue`
- `Model.ResultBoolean`
- `Model.SecupayBaseBasketItem`
- `Model.SecupayBasketItem`
- `Model.SecupayPayoutDTO`
- `Model.SecupayPayoutDTOOptData`
- `Model.SecupayPayoutListItem`
- `Model.SecupayPayoutProductModel`
- `Model.SecupayPayoutWithoutCustomerDTO`
- `Model.SecupayRedirectUrl`
- `Model.SecupaySubTransactionProductModel`
- `Model.SecupayTransactionCancelDTO`
- `Model.SecupayTransactionCaptureDTO`
- `Model.SecupayTransactionDTOExternalInvoicePdf`
- `Model.SecupayTransactionExternalInvoicePdf`
- `Model.SecupayTransactionExternalInvoicePdfDocument`
- `Model.SecupayTransactionListItem`
- `Model.SecupayTransactionProductDTO`
- `Model.SecupayTransactionProductDTOExperience`
- `Model.SecupayTransactionProductDTOOptData`
- `Model.SecupayTransactionProductDTOSubscription`
- `Model.SecupayTransactionProductModel`
- `Model.SecupayTransactionProductModelUsedPaymentInstrument`
- `Model.SecupayTransactionReverseAccrualDTO`
- `Model.SecupayTransactionSetShippingInformationDTO`
- `Model.SecupayTransactionUpdateBasketDTO`
- `Model.ServicesIdentrequestsList`
- `Model.ServicesIdentrequestsProductDTO`
- `Model.ServicesIdentrequestsProductModel`
- `Model.ServicesIdentresultsList`
- `Model.ServicesIdentresultsProductModel`
- `Model.SmartDeviceProductsCollect`
- `Model.SmartDeviceProductsEasycredit`
- `Model.SmartDeviceProductsEnabled`
- `Model.SmartDeviceProductsEnabledWithTid`
- `Model.SmartDeviceProductsLoyalty`
- `Model.SmartDeviceProductsPrepaid`
- `Model.SmartDeviceProductsVtm`
- `Model.SmartDeviceProductsWebterminalConfig`
- `Model.SmartDeviceProductsWebterminalConfigAllowedActions`
- `Model.SmartDeviceUserPin`
- `Model.SmartDevicesDTO`
- `Model.SmartDevicesDevice`
- `Model.SmartDevicesList`
- `Model.SmartDevicesProductModel`
- `Model.SmartDevicesProducts`
- `Model.SmartRoutingPriority`
- `Model.SmartRoutingsAssign`
- `Model.SmartRoutingsDTO`
- `Model.SmartRoutingsList`
- `Model.SmartRoutingsProductModel`
- `Model.SmartTemplatesComponentModel`
- `Model.SmartTemplatesElementModel`
- `Model.SmartTemplatesList`
- `Model.SmartTemplatesProductModel`
- `Model.SmartTransactionPaymentContainerDTO`
- `Model.SmartTransactionPaymentCustomerDTO`
- `Model.SmartTransactionsApplicationContext`
- `Model.SmartTransactionsApplicationContextIframeOpts`
- `Model.SmartTransactionsApplicationContextLocks`
- `Model.SmartTransactionsApplicationContextReturnUrls`
- `Model.SmartTransactionsBaseProduct`
- `Model.SmartTransactionsBasket`
- `Model.SmartTransactionsBasketInfo`
- `Model.SmartTransactionsBasketProduct`
- `Model.SmartTransactionsBasketProductGroup`
- `Model.SmartTransactionsBonusProducts`
- `Model.SmartTransactionsCheckin`
- `Model.SmartTransactionsCheckoutLinks`
- `Model.SmartTransactionsCollectionModel`
- `Model.SmartTransactionsCommunication`
- `Model.SmartTransactionsContainer`
- `Model.SmartTransactionsDTO`
- `Model.SmartTransactionsIdent`
- `Model.SmartTransactionsList`
- `Model.SmartTransactionsMerchant`
- `Model.SmartTransactionsPaymentLinks`
- `Model.SmartTransactionsPreTransactionModel`
- `Model.SmartTransactionsPrepaidSalesDetails`
- `Model.SmartTransactionsPrepare`
- `Model.SmartTransactionsPrepareCallbackUrls`
- `Model.SmartTransactionsProductModel`
- `Model.SmartTransactionsReceipt`
- `Model.SmartTransactionsReceiptValue`
- `Model.SmartTransactionsSetDeliveryModel`
- `Model.SmartTransactionsShippingModel`
- `Model.SmartTransactionsSubBasketProduct`
- `Model.SmartTransactionsTimeSlot`
- `Model.Store`
- `Model.StringList`
- `Model.ThirdPartyConfigurationDTO`
- `Model.ThirdPartyConfigurationProductModel`
- `Model.ThirdPartyEnvironment`
- `Model.ThirdPartyEnvironmentDTO`
- `Model.ThirdPartyEnvironmentSettings`
- `Model.ThirdPartyEnvironmentSettingsDTO`
- `Model.UpdatedField`
- `Model.UploadMandateDTO`
- `Model.UploadMandateProductModel`
- `Model.UploadidentsProductDTO`
- `Model.UploadidentsProductModel`
- `Model.UserAddressData`
- `Model.UserData`
- `Model.ValueField`
- `Model.VirtualTerminalDataModel`


## [3.17.0] - 2023-07-19
[3.17.0]:https://github.com/secuconnect/secuconnect-java-sdk/compare/3.16.1...3.17.0

- *new endpoint*: `DocumentUploadsApi->download()`
- *new endpoint*: `DocumentUploadsApi->getOne()`
- *new endpoint*: `GeneralMerchantsApi->updatePublicData()`

### Added
- `Model.DocumentUploadsProductModelWithContent`
- `Model.GeneralMerchantsPublicDataDTO`

### Changed
- `Api.DocumentUploadsApi`
- `Api.GeneralMerchantsApi`
- `Model.DocumentUploadsDTOContent`
- `Model.DocumentUploadsProductModel`


## [3.16.1] - 2023-07-13
[3.16.1]:https://github.com/secuconnect/secuconnect-java-sdk/compare/3.16.0...3.16.1

### Added
- `Model.GooglePayDescriptorIntermediateSigningKey`

### Changed
- `Model.BankAccountDescriptor`
- `Model.GooglePayDescriptor`
- `Model.OneOfPaymentContainersDTOModelPrivate`


## [3.16.0] - 2023-06-06
[3.16.0]:https://github.com/secuconnect/secuconnect-java-sdk/compare/3.15.0...3.16.0

- *new endpoint*: `GeneralContractsApi->addPaymentLinkConfiguration()`
- *new endpoint*: `GeneralContractsApi->addThirdPartyConfiguration()`
- *new endpoint*: `GeneralContractsApi->getAvailableCurrencies()`
- *new endpoint*: `GeneralContractsApi->getIframeOptions()`
- *new endpoint*: `GeneralContractsApi->getThirdPartyConfiguration()`
- *new endpoint*: `GeneralContractsApi->patchContract()`
- *new endpoint*: `GeneralContractsApi->patchThirdPartyConfiguration()`
- *new endpoint*: `GeneralContractsApi->removeThirdPartyConfiguration()`
- *new endpoint*: `GeneralContractsApi->updateContract()`
- *new endpoint*: `GeneralContractsApi->updateThirdPartyConfiguration()`
- *new endpoint*: `PaymentMandatesApi`
- *new element*: `paypal_configuration`, `easycredit_configuration` and `checkout_configuration` in `GeneralContractsProductModel`
- *changed element type*: `merchant` changed from `ProductInstanceUID` to `GeneralMerchantsProductModel` in `GeneralContractsProductModel`

### Security
- dependency updates

### Added
- `Api.PaymentMandatesApi`
- `Model.AvailableCurrencies`
- `Model.CheckoutConfiguration`
- `Model.CheckoutConfigurationNotifications`
- `Model.GeneralContractsDTO`
- `Model.IframeOptions`
- `Model.PaymentMandatesDTO`
- `Model.PaymentMandatesList`
- `Model.PaymentMandatesProductModel`
- `Model.ThirdPartyConfigurationDTO`
- `Model.ThirdPartyConfigurationProductModel`
- `Model.ThirdPartyEnvironment`
- `Model.ThirdPartyEnvironmentDTO`
- `Model.ThirdPartyEnvironmentSettings`
- `Model.ThirdPartyEnvironmentSettingsDTO`

### Changed
- `Api.GeneralContractsApi`
- `Api.PaymentContractsApi`
- `Model.GeneralContractsProductModel`
- `Model.PaymentLinkOptions`


## [3.15.0] - 2023-06-01
[3.15.0]:https://github.com/secuconnect/secuconnect-java-sdk/compare/3.14.0...3.15.0

- *new endpoint*: `GeneralContractsApi->getTransferBalance()`
- *new endpoint*: `PaymentTransactionsApi->assignTransferBalance()`
- *new element*: `acceptance_points` and `two_fa` in `GeneralMerchantsProductModel`
- *new element*: `forename`, `surname`, `project_name` and `email` in `GeneralMerchantsUser`
- *new element*: `identcase` and `assignment` in `ServicesIdentrequestsProductModel`
- *renamed element*: `provider` to `provider_id` in `IdentrequestPerson`
- *renamed element*: `redirect_url` to `redirect_urls` in `ServicesIdentrequestsProductDTO` and `ServicesIdentrequestsProductModel`
- *changed element type*: `provider` and `type` changed from enum to `string` in `ServicesIdentrequestsProductDTO` and `ServicesIdentrequestsProductModel`
- *changed element type*: `contract` changed from `ProductInstanceUID` to `BaseProductModel`  in `ServicesIdentrequestsProductModel`
- *removed element*: `object` and `id` in `GeneralMerchantsUser`
- *removed parent class*: `Contact` from `IdentrequestPersonDTO`

### Added
- `Model.GeneralContractsTransferBalanceModel`
- `Model.GeneralContractsTransferBalanceModelBalances`
- `Model.GeneralMerchantsUserEmail`
- `Model.ListResponse`

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
- `Api.PaymentSubscriptionsApi`
- `Api.PaymentTransactionsApi`
- `Api.PrepaidItemsApi`
- `Api.PrepaidReportsApi`
- `Api.PrepaidSalesApi`
- `Api.ServicesIdentrequestsApi`
- `Api.ServicesIdentresultsApi`
- `Api.SmartDevicesApi`
- `Api.SmartRoutingsApi`
- `Api.SmartTemplatesApi`
- `Api.SmartTransactionsApi`
- `Model.Address`
- `Model.AddressComponents`
- `Model.Aggregate`
- `Model.AggregationResult`
- `Model.AggregationTimeResult`
- `Model.ApplePayDescriptor`
- `Model.ApplePayDescriptorHeader`
- `Model.AssignedBy`
- `Model.AvailableCountry`
- `Model.BackgroundImageOption`
- `Model.BankAccountDescriptor`
- `Model.BaseProductModel`
- `Model.BillingCyclesItem`
- `Model.CardPin`
- `Model.CardprocessingInvoicesList`
- `Model.CardprocessingInvoicesProductModel`
- `Model.CardprocessingTransactionsList`
- `Model.CardprocessingTransactionsProductModel`
- `Model.Contact`
- `Model.ContactData`
- `Model.CreatedField`
- `Model.CreditCardDescriptor`
- `Model.CrowdFundingDataDetails`
- `Model.CrowdFundingDataOpenAmount`
- `Model.CrowdFundingDataOpenAmountInsideCancelPeriod`
- `Model.CrowdFundingDataOpenAmountOutsideCancellationPeriod`
- `Model.DayTime`
- `Model.DocumentLink`
- `Model.DocumentUploadsBaseProductModel`
- `Model.DocumentUploadsDTOContent`
- `Model.DocumentUploadsProductModel`
- `Model.FileToUpload`
- `Model.GeneralContractsList`
- `Model.GeneralContractsProductModel`
- `Model.GeneralMerchantsLegalDetails`
- `Model.GeneralMerchantsList`
- `Model.GeneralMerchantsProductModel`
- `Model.GeneralMerchantsPublicDataCompany`
- `Model.GeneralMerchantsPublicDataModel`
- `Model.GeneralMerchantsUrls`
- `Model.GeneralMerchantsUser`
- `Model.GeneralStoresDTO`
- `Model.GeneralStoresDTOReason`
- `Model.GeneralStoresDTOType`
- `Model.GeneralStoresList`
- `Model.GeneralStoresProductModel`
- `Model.GeoAddress`
- `Model.GeoAddressGeometry`
- `Model.GetAvailablePaymentMethodsDTO`
- `Model.GooglePayDescriptor`
- `Model.IdentDocument`
- `Model.IdentDocumentData`
- `Model.IdentificationCustomData`
- `Model.IdentificationProcess`
- `Model.IdentrequestPerson`
- `Model.IdentrequestPersonDTO`
- `Model.IdentrequestRedirectUrls`
- `Model.IdentresultPerson`
- `Model.InvitedBy`
- `Model.ItemGroup`
- `Model.LoyaltyCardgroupsDTO`
- `Model.LoyaltyCardgroupsDTOCheckPasscodeEnabled`
- `Model.LoyaltyCardgroupsDTOMerchant`
- `Model.LoyaltyCardgroupsList`
- `Model.LoyaltyCardgroupsProductModel`
- `Model.LoyaltyCardsDTOAccount`
- `Model.LoyaltyCardsList`
- `Model.LoyaltyCardsProductModel`
- `Model.LoyaltyCustomersDTO`
- `Model.LoyaltyCustomersList`
- `Model.LoyaltyCustomersPaymentContainerModel`
- `Model.LoyaltyCustomersProductModel`
- `Model.LoyaltyMerchantcardsCardBalanceReceipt`
- `Model.LoyaltyMerchantcardsDTO`
- `Model.LoyaltyMerchantcardsDTOCardBalanceReceipt`
- `Model.LoyaltyMerchantcardsDTOCheckPasscode`
- `Model.LoyaltyMerchantcardsDTOCreateMerchantcards`
- `Model.LoyaltyMerchantcardsDTOCsc`
- `Model.LoyaltyMerchantcardsDTOCustomer`
- `Model.LoyaltyMerchantcardsDTOLock`
- `Model.LoyaltyMerchantcardsDTONewPasscode`
- `Model.LoyaltyMerchantcardsDTOPaymentContainer`
- `Model.LoyaltyMerchantcardsDTOResetPasscode`
- `Model.LoyaltyMerchantcardsDTOTransaction`
- `Model.LoyaltyMerchantcardsDTOValidateMerchantCard`
- `Model.LoyaltyMerchantcardsList`
- `Model.LoyaltyMerchantcardsProductModel`
- `Model.LoyaltyMerchantcardsProductWithReceiptModel`
- `Model.LoyaltyMerchantcardsValidateMerchantCard`
- `Model.LoyaltyTransactionsDTOCard`
- `Model.LoyaltyTransactionsDTOCardgroup`
- `Model.LoyaltyTransactionsDTOMerchant`
- `Model.LoyaltyTransactionsDTOMerchantcard`
- `Model.LoyaltyTransactionsDTORelatedTransactions`
- `Model.LoyaltyTransactionsDTOStore`
- `Model.LoyaltyTransactionsList`
- `Model.LoyaltyTransactionsProductModel`
- `Model.MandateDTO`
- `Model.MandateProductModel`
- `Model.OpenHours`
- `Model.ParentModel`
- `Model.ParentObj`
- `Model.PayPalDescriptor`
- `Model.PaymentCancelResult`
- `Model.PaymentCancelResultDetails`
- `Model.PaymentContainerMandate`
- `Model.PaymentContainersDTO`
- `Model.PaymentContainersDTOCustomer`
- `Model.PaymentContainersList`
- `Model.PaymentContainersProductModel`
- `Model.PaymentContext`
- `Model.PaymentContractsDTOClone`
- `Model.PaymentContractsDTOIFrameOpts`
- `Model.PaymentContractsDTORequestId`
- `Model.PaymentContractsDTORequestIdAdditionalData`
- `Model.PaymentContractsDTORequestIdAdditionalDataCreateCard`
- `Model.PaymentContractsList`
- `Model.PaymentContractsProductModel`
- `Model.PaymentContractsRequestIdResult`
- `Model.PaymentCrowdFundingData`
- `Model.PaymentCustomersDTO`
- `Model.PaymentCustomersList`
- `Model.PaymentCustomersProductModel`
- `Model.PaymentInformation`
- `Model.PaymentInstructions`
- `Model.PaymentInvoicesList`
- `Model.PaymentInvoicesProductModel`
- `Model.PaymentLinkOptions`
- `Model.PaymentMethodBreakdown`
- `Model.PaymentPayoutsList`
- `Model.PaymentPayoutsProductModel`
- `Model.PaymentPlanInterval`
- `Model.PaymentPlansDTO`
- `Model.PaymentPlansList`
- `Model.PaymentPlansProductModel`
- `Model.PaymentSubscriptionsList`
- `Model.PaymentSubscriptionsProductModel`
- `Model.PaymentSubscriptionsProductModelBillingCycles`
- `Model.PaymentTransactionCancelDTO`
- `Model.PaymentTransactionsCheckStatus`
- `Model.PaymentTransactionsIncreaseAmountDTO`
- `Model.PaymentTransactionsList`
- `Model.PaymentTransactionsProductModel`
- `Model.PaymentTransactionsProductModelCustomer`
- `Model.PaymentTransactionsProductModelDetails`
- `Model.PaymentTransactionsShippingUrl`
- `Model.PrepaidItemsBaseProductModel`
- `Model.PrepaidItemsList`
- `Model.PrepaidItemsProductModel`
- `Model.PrepaidMappingZvt`
- `Model.PrepaidMappingZvtItem`
- `Model.PrepaidReportsList`
- `Model.PrepaidReportsProductModel`
- `Model.PrepaidSalesItem`
- `Model.PrepaidSalesList`
- `Model.PrepaidSalesProductDTO`
- `Model.PrepaidSalesProductModel`
- `Model.PrepaidSalesSmartDevice`
- `Model.PrepaidZvtDTO`
- `Model.ProductExceptionPayload`
- `Model.ProductInstanceID`
- `Model.ProductInstanceUID`
- `Model.ReceiptType`
- `Model.ReceiptTypeValue`
- `Model.ReceiptValue`
- `Model.ResultBoolean`
- `Model.SecupayBaseBasketItem`
- `Model.SecupayBasketItem`
- `Model.SecupayPayoutDTO`
- `Model.SecupayPayoutDTOOptData`
- `Model.SecupayPayoutListItem`
- `Model.SecupayPayoutProductModel`
- `Model.SecupayPayoutWithoutCustomerDTO`
- `Model.SecupayRedirectUrl`
- `Model.SecupaySubTransactionProductModel`
- `Model.SecupayTransactionCancelDTO`
- `Model.SecupayTransactionCaptureDTO`
- `Model.SecupayTransactionDTOExternalInvoicePdf`
- `Model.SecupayTransactionExternalInvoicePdf`
- `Model.SecupayTransactionExternalInvoicePdfDocument`
- `Model.SecupayTransactionListItem`
- `Model.SecupayTransactionProductDTO`
- `Model.SecupayTransactionProductDTOExperience`
- `Model.SecupayTransactionProductDTOOptData`
- `Model.SecupayTransactionProductDTOSubscription`
- `Model.SecupayTransactionProductModel`
- `Model.SecupayTransactionProductModelUsedPaymentInstrument`
- `Model.SecupayTransactionReverseAccrualDTO`
- `Model.SecupayTransactionSetShippingInformationDTO`
- `Model.SecupayTransactionUpdateBasketDTO`
- `Model.ServicesIdentrequestsList`
- `Model.ServicesIdentrequestsProductDTO`
- `Model.ServicesIdentrequestsProductModel`
- `Model.ServicesIdentresultsList`
- `Model.ServicesIdentresultsProductModel`
- `Model.SmartDeviceProductsCollect`
- `Model.SmartDeviceProductsEasycredit`
- `Model.SmartDeviceProductsEnabled`
- `Model.SmartDeviceProductsEnabledWithTid`
- `Model.SmartDeviceProductsLoyalty`
- `Model.SmartDeviceProductsPrepaid`
- `Model.SmartDeviceProductsVtm`
- `Model.SmartDeviceProductsWebterminalConfig`
- `Model.SmartDeviceProductsWebterminalConfigAllowedActions`
- `Model.SmartDeviceUserPin`
- `Model.SmartDevicesDTO`
- `Model.SmartDevicesDevice`
- `Model.SmartDevicesList`
- `Model.SmartDevicesProductModel`
- `Model.SmartDevicesProducts`
- `Model.SmartRoutingPriority`
- `Model.SmartRoutingsAssign`
- `Model.SmartRoutingsDTO`
- `Model.SmartRoutingsList`
- `Model.SmartRoutingsProductModel`
- `Model.SmartTemplatesComponentModel`
- `Model.SmartTemplatesElementModel`
- `Model.SmartTemplatesList`
- `Model.SmartTemplatesProductModel`
- `Model.SmartTransactionPaymentContainerDTO`
- `Model.SmartTransactionPaymentCustomerDTO`
- `Model.SmartTransactionsApplicationContext`
- `Model.SmartTransactionsApplicationContextIframeOpts`
- `Model.SmartTransactionsApplicationContextLocks`
- `Model.SmartTransactionsApplicationContextReturnUrls`
- `Model.SmartTransactionsBaseProduct`
- `Model.SmartTransactionsBasket`
- `Model.SmartTransactionsBasketInfo`
- `Model.SmartTransactionsBasketProduct`
- `Model.SmartTransactionsBasketProductGroup`
- `Model.SmartTransactionsBonusProducts`
- `Model.SmartTransactionsCheckin`
- `Model.SmartTransactionsCheckoutLinks`
- `Model.SmartTransactionsCollectionModel`
- `Model.SmartTransactionsCommunication`
- `Model.SmartTransactionsContainer`
- `Model.SmartTransactionsDTO`
- `Model.SmartTransactionsIdent`
- `Model.SmartTransactionsList`
- `Model.SmartTransactionsMerchant`
- `Model.SmartTransactionsPaymentLinks`
- `Model.SmartTransactionsPreTransactionModel`
- `Model.SmartTransactionsPrepaidSalesDetails`
- `Model.SmartTransactionsPrepare`
- `Model.SmartTransactionsPrepareCallbackUrls`
- `Model.SmartTransactionsProductModel`
- `Model.SmartTransactionsReceipt`
- `Model.SmartTransactionsReceiptValue`
- `Model.SmartTransactionsSetDeliveryModel`
- `Model.SmartTransactionsShippingModel`
- `Model.SmartTransactionsSubBasketProduct`
- `Model.SmartTransactionsTimeSlot`
- `Model.Store`
- `Model.UpdatedField`
- `Model.UploadMandateDTO`
- `Model.UploadMandateProductModel`
- `Model.UploadidentsProductDTO`
- `Model.UploadidentsProductModel`
- `Model.UserAddressData`
- `Model.UserData`
- `Model.ValueField`
- `Model.VirtualTerminalDataModel`


## [3.14.0] - 2023-04-03
[3.14.0]:https://github.com/secuconnect/secuconnect-java-sdk/compare/3.13.0...3.14.0

### Security
- Update dependencies to the latest versions. (Java compatibility: 11+)

### Added
- `Api.PaymentSecupayPayoutApi.paymentSecupaypayoutWithoutCustomerPost()`
- `Api.PaymentTransactionsApi.checkStatus()`
- `Api.PrepaidReportsApi`
- `Api.PrepaidSalesApi.getAll() and getOne()`
- `Api.SmartTransactionsApi.abortTransaction() and updatePaymentContainer()`
- `Model.Aggregate`
- `Model.AggregationResult`
- `Model.AggregationTimeResult`
- `Model.ApplePayDescriptorHeader`
- `Model.PaymentContainersDTO` element `merchant_id`
- `Model.PaymentContractsDTOClone` element `contract_id`
- `Model.PaymentContractsDTORequestId` element `contract_id`, `payment_data`, `url_push` and`additional_data`
- `Model.PaymentContractsDTORequestIdAdditionalData`
- `Model.PaymentContractsDTORequestIdAdditionalDataCreateCard`
- `Model.PaymentPlansDTO` element `merchant_id`
- `Model.PaymentPlansProductModel` element `product_type`
- `Model.PaymentSubscriptionsProductModel` element `demo`
- `Model.PaymentTransactionCancelDTO` element `reduce_amount_by`
- `Model.PaymentTransactionsCheckStatus`
- `Model.PrepaidReportsList`
- `Model.PrepaidReportsProductModel`
- `Model.PrepaidSalesList`
- `Model.PrepaidSalesProductModel` element `type`, `vtc_id` and `password`
- `Model.SecupayPayoutListItem`
- `Model.SecupayPayoutWithoutCustomerDTO`
- `Model.SecupayTransactionCancelDTO` element `reduce_amount_by`
- `Model.SmartTransactionPaymentContainerDTO` element `merchant_id`

#### element `scroll_id`, `result`, `meta`, `type`, `sum`, `lookup` and aggregation result elements (`l`, `k`, `ks`, `c`, `s`, `t`) added
- `Model.CardprocessingInvoicesList`
- `Model.CardprocessingInvoicesProductModel`
- `Model.CardprocessingTransactionsList`
- `Model.CardprocessingTransactionsProductModel`
- `Model.GeneralContractsList`
- `Model.GeneralContractsProductModel`
- `Model.GeneralMerchantsList`
- `Model.GeneralMerchantsProductModel`
- `Model.GeneralStoresList`
- `Model.GeneralStoresProductModel`
- `Model.LoyaltyCardgroupsList`
- `Model.LoyaltyCardgroupsProductModel`
- `Model.LoyaltyCardsList`
- `Model.LoyaltyCardsProductModel`
- `Model.LoyaltyCustomersList`
- `Model.LoyaltyCustomersProductModel`
- `Model.LoyaltyMerchantcardsList`
- `Model.LoyaltyMerchantcardsProductModel`
- `Model.LoyaltyTransactionsList`
- `Model.LoyaltyTransactionsProductModel`
- `Model.PaymentContainersList`
- `Model.PaymentContainersProductModel`
- `Model.PaymentContractsList`
- `Model.PaymentContractsProductModel`
- `Model.PaymentCustomersList`
- `Model.PaymentCustomersProductModel`
- `Model.PaymentInvoicesList`
- `Model.PaymentInvoicesProductModel`
- `Model.PaymentPayoutsList`
- `Model.PaymentPayoutsProductModel`
- `Model.PaymentPlansList`
- `Model.PaymentPlansProductModel`
- `Model.PaymentSubscriptionsList`
- `Model.PaymentSubscriptionsProductModel`
- `Model.PaymentTransactionsList`
- `Model.PaymentTransactionsProductModel`
- `Model.PrepaidItemsList`
- `Model.PrepaidItemsProductModel`
- `Model.ServicesIdentrequestsList`
- `Model.ServicesIdentrequestsProductModel`
- `Model.ServicesIdentresultsList`
- `Model.ServicesIdentresultsProductModel`
- `Model.SmartDevicesList`
- `Model.SmartDevicesProductModel`
- `Model.SmartRoutingsList`
- `Model.SmartRoutingsProductModel`
- `Model.SmartTemplatesList`
- `Model.SmartTemplatesProductModel`
- `Model.SmartTransactionsList`
- `Model.SmartTransactionsProductModel`

### Changed
- `Model.ApplePayDescriptor` element `header` from `object` to `ApplePayDescriptorHeader`
- `Model.PaymentPlansDTO` and `Model.PaymentPlansProductModel` default value of `status` is now `"active"` instead of `null`
- `Model.ServicesIdentrequestsProductDTO`
- `Model.ServicesIdentrequestsProductModel`

### Fixed
- `Model.PaymentTransactionsProductModelDetails` renamed element `status_text_simple` to `status_simple_text`

### Removed
- `Api.PaymentContainersApi.paymentContainersIdAssignSecondaryIdDelete() and paymentContainersIdAssignSecondaryIdPost()`
- `Model.PaymentContainersProductModel` element `assign`
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
- `.swagger-codegen/VERSION`


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

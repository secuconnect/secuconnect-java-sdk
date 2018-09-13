
# PaymentTransactionsProductModel

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**object** | **String** | Object of payment transaction |  [optional]
**id** | **String** | Id of payment transaction |  [optional]
**merchant** | [**PaymentTransactionsProductModelMerchant**](PaymentTransactionsProductModelMerchant.md) |  |  [optional]
**transId** | **Integer** | Transaction identifier |  [optional]
**productId** | **Integer** | Product identifier |  [optional]
**product** | **String** | Product type |  [optional]
**productRaw** | **String** | the name of the payment product |  [optional]
**zahlungsmittelId** | **Integer** | The internal id of the stored payment instrument. |  [optional]
**contractId** | **Integer** | Contract identifier |  [optional]
**amount** | **Integer** | Total amount of payment in cents (or the smallest cash unit of the relevant currency) |  [optional]
**currency** | **String** | ISO 4217 code of currency, eg EUR for Euro. |  [optional]
**created** | [**DateTime**](DateTime.md) | Created at date |  [optional]
**updated** | [**DateTime**](DateTime.md) | Updated at date |  [optional]
**status** | **Integer** | WTF?? |  [optional]
**statusText** | **String** | Transaction status |  [optional]
**details** | [**PaymentTransactionsProductModelDetails**](PaymentTransactionsProductModelDetails.md) |  |  [optional]
**customer** | [**PaymentTransactionsProductModelCustomer**](PaymentTransactionsProductModelCustomer.md) |  |  [optional]




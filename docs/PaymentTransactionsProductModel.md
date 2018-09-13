
# PaymentTransactionsProductModel

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**object** | **String** | Object of payment transaction | 
**id** | **String** | Id of payment transaction | 
**merchant** | [**PaymentTransactionsProductModelMerchant**](PaymentTransactionsProductModelMerchant.md) |  | 
**transId** | **Integer** | Transaction identifier | 
**productId** | **Integer** | Product identifier | 
**product** | **String** | Product type | 
**productRaw** | **String** | the name of the payment product | 
**zahlungsmittelId** | **Integer** | The internal id of the stored payment instrument. | 
**contractId** | **Integer** | Contract identifier | 
**amount** | **Integer** | Total amount of payment in cents (or the smallest cash unit of the relevant currency) | 
**currency** | **String** | ISO 4217 code of currency, eg EUR for Euro. | 
**created** | [**DateTime**](DateTime.md) | Created at date | 
**updated** | [**DateTime**](DateTime.md) | Updated at date | 
**status** | **Integer** | WTF?? | 
**statusText** | **String** | Transaction status | 
**details** | [**PaymentTransactionsProductModelDetails**](PaymentTransactionsProductModelDetails.md) |  | 
**customer** | [**PaymentTransactionsProductModelCustomer**](PaymentTransactionsProductModelCustomer.md) |  | 




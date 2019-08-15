
# SecupayPayoutProductModel

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**object** | **String** | Product name | 
**id** | **String** | ID of instance | 
**transId** | **Integer** | ID of transaction | 
**status** | **String** | Transaction status | 
**amount** | **Integer** | Total amount of transaction lit&#39;s items | 
**currency** | **String** | ISO 4217 code of currency, eg EUR for Euro. | 
**purpose** | **String** | The purpose of the payment. This is the later assignment of the payment is for example on the account statement of the buyer. | 
**orderId** | **String** | Specifying an order number. Depending on the contract setting, this must be unique for each payment. | 
**transactionStatus** | **String** | Transaction status (number) | 
**transactionList** | [**List&lt;SecupayTransactionListItem&gt;**](SecupayTransactionListItem.md) | A list of transaction items | 
**transferPurpose** | **String** | The purpose the payer needs to use for his transfer | 
**transferAccount** | [**PaymentInformation**](PaymentInformation.md) | The bank account the payer needs to use for his transfer | 




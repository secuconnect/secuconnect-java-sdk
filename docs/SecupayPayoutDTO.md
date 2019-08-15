
# SecupayPayoutDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**demo** | **Boolean** | demo env value | 
**redirectUrl** | [**SecupayRedirectUrl**](SecupayRedirectUrl.md) | A list of redirect urls used for the payment checkout page | 
**contract** | **String** | Contract ID | 
**customer** | **String** | Payment customer ID | 
**optData** | [**SecupayPayoutDTOOptData**](SecupayPayoutDTOOptData.md) |  | 
**amount** | **Integer** | Total amount of transaction lit&#39;s items | 
**currency** | **String** | ISO 4217 code of currency, eg EUR for Euro. | 
**purpose** | **String** | The purpose of the payment. This is the later assignment of the payment is for example on the account statement of the buyer. | 
**orderId** | **String** | Specifying an order number. Depending on the contract setting, this must be unique for each payment. | 
**transactionList** | [**List&lt;SecupayTransactionListItem&gt;**](SecupayTransactionListItem.md) | A list of transaction items | 




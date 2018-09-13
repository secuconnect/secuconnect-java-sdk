
# SecupayTransactionProductDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**amount** | **Integer** | Total amount of payment in cents (or the smallest cash unit of the relevant currency) | 
**currency** | **String** | ISO 4217 code of currency, eg EUR for Euro. | 
**purpose** | **String** | The purpose of the payment. This is the later assignment of the payment is for example on the account statement of the buyer. | 
**orderId** | **String** | Specifying an order number. Depending on the contract setting, this must be unique for each payment. | 
**basket** | [**List&lt;SecupayBasketItem&gt;**](SecupayBasketItem.md) | A list of items that are being purchased. | 
**accrual** | **Boolean** | Indicates whether the payment is locked for pay-out (TRUE) or not (FALSE). Standard value here is FALSE. | 
**paymentAction** | **String** | Specifies whether a pre-authorization (\&quot;authorization\&quot;) or instant payment (\&quot;sale\&quot;) is to be performed. Standard value here is \&quot;sale\&quot;. The collection of the pre-authorized payment is made with the \&quot;capture\&quot; command. | 
**customer** | [**PaymentCustomersProductModel**](PaymentCustomersProductModel.md) | The customer object | 
**redirectUrl** | [**SecupayTransactionProductDTORedirectUrl**](SecupayTransactionProductDTORedirectUrl.md) |  | 
**contract** | **String** | Contract id | 
**container** | **String** | Container id | 
**optData** | [**SecupayTransactionProductDTOOptData**](SecupayTransactionProductDTOOptData.md) |  | 
**subscription** | [**SecupayTransactionProductDTOSubscription**](SecupayTransactionProductDTOSubscription.md) |  | 
**demo** | **Boolean** | Demo | 
**experience** | [**SecupayTransactionProductDTOExperience**](SecupayTransactionProductDTOExperience.md) |  | 




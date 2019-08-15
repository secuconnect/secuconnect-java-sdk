
# SecupayTransactionProductModel

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**object** | **String** | Product name | 
**id** | **String** | ID of instance | 
**transId** | **Integer** | Transaction identifier | 
**status** | **String** | Transaction status | 
**amount** | **Integer** | Total amount of payment in cents (or the smallest cash unit of the relevant currency) | 
**currency** | **String** | ISO 4217 code of currency, eg EUR for Euro. | 
**purpose** | **String** | The purpose of the payment. This is the later assignment of the payment is for example on the account statement of the buyer. | 
**orderId** | **String** | Specifying an order number. Depending on the contract setting, this must be unique for each payment. | 
**basket** | [**List&lt;SecupayBasketItem&gt;**](SecupayBasketItem.md) | A list of items that are being purchased. | 
**transactionStatus** | **String** | Transaction status (number) | 
**accrual** | **Boolean** | Indicates whether the payment is locked for pay-out (TRUE) or not (FALSE). Standard value here is FALSE. | 
**paymentAction** | **String** | Specifies whether a pre-authorization (\&quot;authorization\&quot;) or instant payment ( \&quot;sale\&quot;) is to be performed. Standard value here is \&quot;sale\&quot;. The collection of the pre-authorized payment is made with the \&quot;capture\&quot; command. | 
**transferPurpose** | **String** | The purpose the payer needs to use for his transfer | 
**transferAccount** | [**PaymentInformation**](PaymentInformation.md) | The bank account the payer needs to use for his transfer | 
**customer** | [**PaymentCustomersProductModel**](PaymentCustomersProductModel.md) | The customer object | 
**usedPaymentInstrument** | [**SecupayTransactionProductModelUsedPaymentInstrument**](SecupayTransactionProductModelUsedPaymentInstrument.md) |  | 
**redirectUrl** | [**SecupayRedirectUrl**](SecupayRedirectUrl.md) | A list of redirect urls used for the payment checkout page | 
**iframeUrl** | **String** | The url of the payment checkout iframe | 
**container** | [**PaymentContainersProductModel**](PaymentContainersProductModel.md) | The container object | 
**subTransactions** | [**List&lt;SecupaySubTransactionProductModel&gt;**](SecupaySubTransactionProductModel.md) | A list of sub-transactions (for mixed basket) | 




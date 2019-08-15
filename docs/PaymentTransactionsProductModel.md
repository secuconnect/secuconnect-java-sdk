
# PaymentTransactionsProductModel

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**object** | **String** | Object of payment transaction | 
**id** | **String** | Id of payment transaction | 
**merchant** | [**GeneralMerchantsProductModel**](GeneralMerchantsProductModel.md) | Merchant information | 
**store** | [**GeneralStoresProductModel**](GeneralStoresProductModel.md) | Merchants store information | 
**transId** | **Integer** | Transaction identifier | 
**productId** | **Integer** | Product identifier | 
**product** | **String** | Product type | 
**productRaw** | **String** | the name of the payment product | 
**zahlungsmittelId** | **Integer** | The internal id of the stored payment instrument. | 
**contractId** | **Integer** | Contract identifier | 
**amount** | **Integer** | Total amount of payment in cents (or the smallest cash unit of the relevant currency) | 
**currency** | **String** | ISO 4217 code of currency, eg EUR for Euro. | 
**created** | **String** | Created at date | 
**updated** | **String** | Updated at date | 
**status** | **Integer** | Transaction status ID | 
**statusText** | **String** | Transaction status description | 
**incomingPaymentDate** | **String** | Date when the payment was received | 
**details** | [**PaymentTransactionsProductModelDetails**](PaymentTransactionsProductModelDetails.md) |  | 
**customer** | [**PaymentTransactionsProductModelCustomer**](PaymentTransactionsProductModelCustomer.md) |  | 
**tid** | **String** | Terminal-ID | 
**paymentData** | **String** | Data of the used payment instrument | 
**storeName** | **String** | Store name | 
**payoutDate** | **String** | Date when the payout was created | 
**invoiceNumber** | **String** | Invoice number (from merchant) | 
**transactionHash** | **String** | Payment-ID | 
**referenceId** | **String** | Reference ID | 
**accrual** | **Boolean** | Accrual Flag | 





# PaymentContractsDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**merchant** | **String** | Contracts Merchant | 
**internalReference** | **String** | The internal user id | 
**contractId** | **String** | Contracts id | 
**demo** | **String** | Is this a demo contract | 
**debitProductId** | **String** | Contract debit product id | 
**prepayProductId** | **String** | Contracts prepay product id | 
**invoiceProductId** | **String** | Contracts invoice product id | 
**creditcardProductId** | **String** | Contracts credit card product id | 
**urlPush** | **String** | An URL where your service listen for push notifications of the secuconnect service | 
**allowTransactions** | **Boolean** | Should allow transactions? | 
**allowCloning** | **Boolean** | Should allow cloning? | 
**uniqueOrderId** | **Boolean** | Bool, default FALSE. If TRUE, an error message will be thrown if you try to create a new payment transaction with the same order_id of an previous transaction. | 
**scoring** | **Boolean** | Bool, default TRUE. If FALSE, the customer scoring is disabled for your payment contract | 
**sepaMandateInform** | **String** | Enum [on_transaction, on_container, never], default “never” Option to send automatically an information to the customer when a new SEPA-mandate was created. | 




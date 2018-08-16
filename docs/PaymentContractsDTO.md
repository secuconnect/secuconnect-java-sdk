
# PaymentContractsDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**merchant** | **String** | Contracts Merchant |  [optional]
**internalReference** | **String** | The internal user id |  [optional]
**contractId** | **String** | Contracts id |  [optional]
**demo** | **String** | Is this a demo contract |  [optional]
**debitProductId** | **String** | Contract debit product id |  [optional]
**prepayProductId** | **String** | Contracts prepay product id |  [optional]
**invoiceProductId** | **String** | Contracts invoice product id |  [optional]
**creditcardProductId** | **String** | Contracts credit card product id |  [optional]
**urlPush** | **String** | An URL where your service listen for push notifications of the secuconnect service |  [optional]
**allowTransactions** | **Boolean** | Should allow transactions? |  [optional]
**allowCloning** | **Boolean** | Should allow cloning? |  [optional]
**uniqueOrderId** | **Boolean** | Bool, default FALSE. If TRUE, an error message will be thrown if you try to create a new payment transaction with the same order_id of an previous transaction. |  [optional]
**scoring** | **Boolean** | Bool, default TRUE. If FALSE, the customer scoring is disabled for your payment contract |  [optional]
**sepaMandateInform** | **String** | Enum [on_transaction, on_container, never], default “never” Option to send automatically an information to the customer when a new SEPA-mandate was created. |  [optional]




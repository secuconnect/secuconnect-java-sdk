
# PaymentContractsDTOClone

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**project** | **String** | Name of the project (must be unique) | 
**paymentData** | [**PaymentInformation**](PaymentInformation.md) | Merchants bank account for the payout | 
**payinAccount** | **Boolean** | Pay in account | 
**allowTransactions** | **Boolean** | DEPRECATED: Should allow transactions for this sub-contract? | 
**urlPush** | **String** | The default URL where your service listen for push notifications of the secuconnect service | 
**debitProductId** | **String** | DEPRECATED: Contract debit product id | 
**prepayProductId** | **String** | DEPRECATED: Contracts prepay product id | 
**invoiceProductId** | **String** | DEPRECATED: Contracts invoice product id | 
**creditcardProductId** | **String** | DEPRECATED: Contracts credit card product id | 




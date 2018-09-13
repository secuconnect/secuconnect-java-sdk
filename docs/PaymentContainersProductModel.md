
# PaymentContainersProductModel

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**object** | **String** | Object of payment container |  [optional]
**id** | **String** | Id of payment container |  [optional]
**contract** | [**PaymentContractsProductModel**](PaymentContractsProductModel.md) | Payment container contract |  [optional]
**customer** | [**PaymentCustomersProductModel**](PaymentCustomersProductModel.md) | Payment container customer |  [optional]
**assign** | [**ProductInstanceUID**](ProductInstanceUID.md) | Assign to |  [optional]
**type** | **String** | Type of payment container |  [optional]
**_public** | [**BankAccountDescriptor**](BankAccountDescriptor.md) | Public payment instrument data |  [optional]
**_private** | [**BankAccountDescriptor**](BankAccountDescriptor.md) | Private payment instrument data |  [optional]
**created** | [**DateTime**](DateTime.md) | Creation date |  [optional]
**updated** | [**DateTime**](DateTime.md) | Last update date |  [optional]
**mandate** | [**PaymentContainerMandate**](PaymentContainerMandate.md) | Payment container mandate |  [optional]




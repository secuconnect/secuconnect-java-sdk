
# SmartTransactionsSubBasketProduct

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** | Product id | 
**parent** | **Integer** | Parent | 
**itemType** | **String** | Category of item | 
**desc** | **String** | Description of the sub-basket product | 
**articleNumber** | **String** | Article number | 
**serialNumber** | **String** | The serialnumber of the scanned posa card | 
**ean** | **String** | international article number | 
**quantity** | **Integer** | Quantity | 
**priceOne** | **Integer** | Price one | 
**sum** | **Integer** |  | 
**tax** | **Integer** | Tax | 
**referenceId** | **String** | The reference_id must be unique, it&#39;s Referring to the reference_id of SmartTransactionsBasketProduct [example: SmartTransactionsBasketProduct-&gt;reference_id is 1000 then all SmartTransactionsSubBasketProduct must have unique reference_id like 1000.1, 1000.2 etc.] | 
**contractId** | **String** | contract id | 
**group** | [**List&lt;SmartTransactionsBasketProductGroup&gt;**](SmartTransactionsBasketProductGroup.md) | Group | 




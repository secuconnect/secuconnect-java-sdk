
# SmartTransactionsBasketProduct

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** | Product id | 
**parent** | **Integer** | Parent | 
**itemType** | **String** | Category of item | 
**desc** | **String** | Desc | 
**articleNumber** | **String** | Article number | 
**serialNumber** | **String** | The serialnumber of the scanned posa card | 
**ean** | **String** | international article number | 
**quantity** | **Integer** | Quantity | 
**priceOne** | **Integer** | Price one | 
**sum** | **Integer** | it is the value of the sum of the product with all items in sub_basket | 
**tax** | **Integer** | Tax | 
**referenceId** | **String** | The reference_id must be unique, it&#39;s a Reference for to the reference_id of SmartTransactionsSubBasketProduct [example: SmartTransactionsBasketProduct-&gt;reference_id is 1000 then all SmartTransactionsSubBasketProduct must have unique reference_id like 1000.1, 1000.2 etc.] | 
**contractId** | **String** | contract id | 
**group** | [**List&lt;SmartTransactionsBasketProductGroup&gt;**](SmartTransactionsBasketProductGroup.md) | Group | 
**subBasket** | [**List&lt;SmartTransactionsSubBasketProduct&gt;**](SmartTransactionsSubBasketProduct.md) | sub basket Product | 




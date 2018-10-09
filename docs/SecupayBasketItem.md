
# SecupayBasketItem

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**itemType** | **String** | Category of item | 
**articleNumber** | **String** | Article number of item | 
**quantity** | **Integer** | Quantity of articles in item | 
**name** | **String** | Descriptive name of item | 
**model** | **String** | Model of item | 
**ean** | **String** | EAN, European Article Number | 
**tax** | **String** | Applicable tax in percentages | 
**total** | **Integer** | Total price | 
**price** | **Integer** | Price of single article, if item is of article category | 
**apikey** | **String** | Special param for stakeholder payments | 
**transactionHash** | **String** | Special param for payout payments | 
**contractId** | **String** | Contract id - Special param for stakeholder payments | 
**referenceId** | **String** | Reference id - must be unique for the entire basket | 
**subBasket** | [**List&lt;SecupayBasketItem&gt;**](SecupayBasketItem.md) | Mixed-Basket: All basket items for one merchant. | 




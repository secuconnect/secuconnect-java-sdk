
# SmartTransactionsProductModel

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**object** | **String** | Object of smart transaction | 
**id** | **String** | Id of smart transaction | 
**status** | **String** | Status of smart transaction | 
**merchant** | [**ProductInstanceUID**](ProductInstanceUID.md) | Merchant | 
**contract** | [**ProductInstanceUID**](ProductInstanceUID.md) | Contract | 
**marketplaceContract** | [**ProductInstanceUID**](ProductInstanceUID.md) | Marketplace contract | 
**customer** | [**LoyaltyCustomersProductModel**](LoyaltyCustomersProductModel.md) | Customer | 
**checkin** | [**SmartTransactionsCheckin**](SmartTransactionsCheckin.md) | Check in | 
**merchantRef** | **String** | Merchant ref | 
**transactionRef** | **String** | Transaction ref | 
**store** | [**ProductInstanceUID**](ProductInstanceUID.md) | Store | 
**deviceSource** | [**ProductInstanceUID**](ProductInstanceUID.md) | Device source | 
**deviceDestination** | [**ProductInstanceUID**](ProductInstanceUID.md) | Device destination | 
**created** | [**DateTime**](DateTime.md) | Created at date | 
**updated** | [**DateTime**](DateTime.md) | Updated at date | 
**receiptNumber** | **Integer** | Receipt number | 
**receipt** | **String** | Receipt | 
**receiptMerchant** | **String** | Receipt merchant | 
**receiptMerchantPrint** | **Boolean** | Receipt merchant print | 
**basketInfo** | [**SmartTransactionsBasketInfo**](SmartTransactionsBasketInfo.md) | Basket info | 
**basket** | [**SmartTransactionsBasket**](SmartTransactionsBasket.md) | Basket | 
**idents** | [**List&lt;SmartTransactionsIdent&gt;**](SmartTransactionsIdent.md) | Idents | 
**taxRate** | **Integer** | Tax rate | 
**taxAmount** | **Integer** | Tax amount | 
**cashier** | **String** | Cashier | 
**market** | **String** | Market | 
**orderOption** | **String** | Order option | 
**pickupOptions** | [**SmartTransactionsPickupOptions**](SmartTransactionsPickupOptions.md) | Pickup options | 
**product** | **String** | Product | 
**transId** | **Integer** | Transaction id | 
**paymentMethod** | **String** | Payment method | 
**transactions** | [**ProductInstanceUID**](ProductInstanceUID.md) | Transactions | 
**lastVisitedPage** | **String** | Last visited page | 





# SmartTransactionsProductModel

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**object** | **String** | Object of smart transaction | 
**id** | **String** | Id of smart transaction | 
**status** | **String** | Status of smart transaction | 
**merchant** | [**SmartTransactionsMerchant**](SmartTransactionsMerchant.md) | Merchant | 
**contract** | [**ProductInstanceUID**](ProductInstanceUID.md) | Contract | 
**providerContract** | [**ProductInstanceUID**](ProductInstanceUID.md) | Provider contract | 
**customer** | [**PaymentCustomersProductModel**](PaymentCustomersProductModel.md) | Customer | 
**shippingAddress** | [**PaymentCustomersProductModel**](PaymentCustomersProductModel.md) | Customers delivery address | 
**container** | [**ProductInstanceUID**](ProductInstanceUID.md) | Payment Container | 
**checkin** | [**SmartTransactionsCheckin**](SmartTransactionsCheckin.md) | Check in | 
**merchantRef** | **String** | Merchant reference | 
**transactionRef** | **String** | Transaction reference | 
**store** | [**ProductInstanceUID**](ProductInstanceUID.md) | Store | 
**deviceSource** | [**ProductInstanceUID**](ProductInstanceUID.md) | Device source | 
**deviceDestination** | [**ProductInstanceUID**](ProductInstanceUID.md) | Device destination | 
**created** | **String** | Created at date | 
**updated** | **String** | Updated at date | 
**receiptNumber** | **Integer** | Receipt number | 
**receipt** | [**List&lt;SmartTransactionsReceipt&gt;**](SmartTransactionsReceipt.md) | Receipt | 
**receiptMerchant** | [**List&lt;SmartTransactionsReceipt&gt;**](SmartTransactionsReceipt.md) | Receipt merchant | 
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
**shipmentDetails** | [**SmartTransactionsShipmentDetails**](SmartTransactionsShipmentDetails.md) | Shipment details | 
**product** | **String** | Product | 
**transId** | **Integer** | Transaction id | 
**paymentMethod** | **String** | Payment method | 
**transactions** | [**List&lt;PaymentTransactionsProductModel&gt;**](PaymentTransactionsProductModel.md) | Payment Transactions | 
**lastVisitedPage** | **String** | Last visited page | 
**isDemo** | **Boolean** | Demo payment | 
**checkoutLinks** | [**SmartTransactionsCheckoutLinks**](SmartTransactionsCheckoutLinks.md) | Checkout Links | 




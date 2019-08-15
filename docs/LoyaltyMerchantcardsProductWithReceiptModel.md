
# LoyaltyMerchantcardsProductWithReceiptModel

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**object** | **String** | Object of loyalty merchant card | 
**id** | **String** | Id of loyalty merchant card | 
**card** | [**LoyaltyCardsProductModel**](LoyaltyCardsProductModel.md) | Id of loyalty store group | 
**merchant** | [**ProductInstanceUID**](ProductInstanceUID.md) | Current merchant id | 
**createdForMerchant** | [**ProductInstanceUID**](ProductInstanceUID.md) | Merchant id, that loyalty merchant card object was created for | 
**createdForStore** | [**ProductInstanceUID**](ProductInstanceUID.md) | Store id, that loyalty merchant card object was created for | 
**customer** | [**LoyaltyCustomersProductModel**](LoyaltyCustomersProductModel.md) | Loyalty merchant card customer | 
**cardgroup** | [**LoyaltyCardgroupsProductModel**](LoyaltyCardgroupsProductModel.md) | Loyalty merchant card card group | 
**paymentContainer** | [**LoyaltyMerchantcardsDTOPaymentContainer**](LoyaltyMerchantcardsDTOPaymentContainer.md) | Loyalty merchant card payment container | 
**balance** | **Integer** | Loyalty merchant card balance | 
**points** | **Integer** | Loyalty merchant card points | 
**bonusBalance** | **Integer** | Loyalty merchant card bonus balance | 
**cashBalance** | **Integer** | Loyalty merchant card cash balance | 
**stockStatus** | **String** | Loyalty merchant card stock status | 
**lockStatus** | **String** | Loyalty merchant card lock status | 
**lastUsage** | **String** | Loyalty merchant card last usage | 
**lastCharge** | **String** | Loyalty merchant card last charge | 
**isBaseCard** | **Boolean** | Information whether loyalty merchant card is base card | 
**passcode** | **Integer** | Loyalty merchant card passcode | 
**receiptHeader** | [**List&lt;ReceiptType&gt;**](ReceiptType.md) | Receipt header | 
**receipt** | [**List&lt;ReceiptTypeValue&gt;**](ReceiptTypeValue.md) | Receipt | 




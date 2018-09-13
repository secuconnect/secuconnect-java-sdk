# LoyaltySalesApi

All URIs are relative to *https://connect-testing.secupay-ag.de/api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCardgroupsByMerchantId**](LoyaltySalesApi.md#getCardgroupsByMerchantId) | **GET** /Loyalty/Sales/{generalMerchantId}/CardGroupsByMerchantID | GET Loyalty/Sales/{generalMerchantId}/CardGroupsByMerchantID
[**getVirtualTerminalIdByStoreId**](LoyaltySalesApi.md#getVirtualTerminalIdByStoreId) | **GET** /Loyalty/Sales/{generalStoresId}/VirtualTerminalIdForStore | GET Loyalty/Sales/{generalStoresId}/VirtualTerminalIdForStore


<a name="getCardgroupsByMerchantId"></a>
# **getCardgroupsByMerchantId**
> List&lt;LoyaltyCardgroupsProductModel&gt; getCardgroupsByMerchantId(generalMerchantId)

GET Loyalty/Sales/{generalMerchantId}/CardGroupsByMerchantID

Get cardgroups by merchant id

### Example
```java
// Import classes:
//import io.secuconnect.client.ApiClient;
//import io.secuconnect.client.ApiException;
//import io.secuconnect.client.Configuration;
//import io.secuconnect.client.auth.*;
//import io.secuconnect.client.api.LoyaltySalesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_token
OAuth oauth_token = (OAuth) defaultClient.getAuthentication("oauth_token");
oauth_token.setAccessToken("YOUR ACCESS TOKEN");

LoyaltySalesApi apiInstance = new LoyaltySalesApi();
String generalMerchantId = "generalMerchantId_example"; // String | Search by provided id
try {
    List<LoyaltyCardgroupsProductModel> result = apiInstance.getCardgroupsByMerchantId(generalMerchantId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LoyaltySalesApi#getCardgroupsByMerchantId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **generalMerchantId** | **String**| Search by provided id | [required]

### Return type

[**List&lt;LoyaltyCardgroupsProductModel&gt;**](LoyaltyCardgroupsProductModel.md)

### Authorization

[oauth_token](../README.md#oauth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getVirtualTerminalIdByStoreId"></a>
# **getVirtualTerminalIdByStoreId**
> Object getVirtualTerminalIdByStoreId(generalStoresId)

GET Loyalty/Sales/{generalStoresId}/VirtualTerminalIdForStore

Get DECODED virtual terminal id by DECODED store id

### Example
```java
// Import classes:
//import io.secuconnect.client.ApiClient;
//import io.secuconnect.client.ApiException;
//import io.secuconnect.client.Configuration;
//import io.secuconnect.client.auth.*;
//import io.secuconnect.client.api.LoyaltySalesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_token
OAuth oauth_token = (OAuth) defaultClient.getAuthentication("oauth_token");
oauth_token.setAccessToken("YOUR ACCESS TOKEN");

LoyaltySalesApi apiInstance = new LoyaltySalesApi();
String generalStoresId = "generalStoresId_example"; // String | DECODED store id
try {
    Object result = apiInstance.getVirtualTerminalIdByStoreId(generalStoresId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LoyaltySalesApi#getVirtualTerminalIdByStoreId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **generalStoresId** | **String**| DECODED store id | [required]

### Return type

**Object**

### Authorization

[oauth_token](../README.md#oauth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


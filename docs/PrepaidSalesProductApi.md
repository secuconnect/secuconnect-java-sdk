# PrepaidSalesProductApi

All URIs are relative to *https://connect-testing.secupay-ag.de/api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addSale**](PrepaidSalesProductApi.md#addSale) | **POST** /Prepaid/Sales | POST Prepaid/Sales


<a name="addSale"></a>
# **addSale**
> PrepaidSalesProductModel addSale(body)

POST Prepaid/Sales

Create new prepaid transaction

### Example
```java
// Import classes:
//import io.secuconnect.client.ApiClient;
//import io.secuconnect.client.ApiException;
//import io.secuconnect.client.Configuration;
//import io.secuconnect.client.auth.*;
//import io.secuconnect.client.api.PrepaidSalesProductApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_token
OAuth oauth_token = (OAuth) defaultClient.getAuthentication("oauth_token");
oauth_token.setAccessToken("YOUR ACCESS TOKEN");

PrepaidSalesProductApi apiInstance = new PrepaidSalesProductApi();
PrepaidSalesProductDTO body = new PrepaidSalesProductDTO(); // PrepaidSalesProductDTO | Prepaid transaction input properties
try {
    PrepaidSalesProductModel result = apiInstance.addSale(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrepaidSalesProductApi#addSale");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PrepaidSalesProductDTO**](PrepaidSalesProductDTO.md)| Prepaid transaction input properties |

### Return type

[**PrepaidSalesProductModel**](PrepaidSalesProductModel.md)

### Authorization

[oauth_token](../README.md#oauth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


# PaymentSecupayPayoutApi

All URIs are relative to *https://connect-testing.secupay-ag.de/api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getSecupaypayout**](PaymentSecupayPayoutApi.md#getSecupaypayout) | **GET** /Payment/Secupaypayout/{paymentPayoutId} | GET Payment/Secupaypayout/{paymentPayoutId}
[**paymentSecupaypayoutPost**](PaymentSecupayPayoutApi.md#paymentSecupaypayoutPost) | **POST** /Payment/Secupaypayout | POST Payment/Secupaypayout


<a name="getSecupaypayout"></a>
# **getSecupaypayout**
> SecupayPayoutProductModel getSecupaypayout(paymentPayoutId)

GET Payment/Secupaypayout/{paymentPayoutId}

Get the details of a payment transaction

### Example
```java
// Import classes:
//import io.secuconnect.client.ApiClient;
//import io.secuconnect.client.ApiException;
//import io.secuconnect.client.Configuration;
//import io.secuconnect.client.auth.*;
//import io.secuconnect.client.api.PaymentSecupayPayoutApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_token
OAuth oauth_token = (OAuth) defaultClient.getAuthentication("oauth_token");
oauth_token.setAccessToken("YOUR ACCESS TOKEN");

PaymentSecupayPayoutApi apiInstance = new PaymentSecupayPayoutApi();
String paymentPayoutId = "paymentPayoutId_example"; // String | Payment payout id
try {
    SecupayPayoutProductModel result = apiInstance.getSecupaypayout(paymentPayoutId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentSecupayPayoutApi#getSecupaypayout");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **paymentPayoutId** | **String**| Payment payout id | [required]

### Return type

[**SecupayPayoutProductModel**](SecupayPayoutProductModel.md)

### Authorization

[oauth_token](../README.md#oauth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="paymentSecupaypayoutPost"></a>
# **paymentSecupaypayoutPost**
> SecupayPayoutProductModel paymentSecupaypayoutPost(body)

POST Payment/Secupaypayout

Start a payout transaction

### Example
```java
// Import classes:
//import io.secuconnect.client.ApiClient;
//import io.secuconnect.client.ApiException;
//import io.secuconnect.client.Configuration;
//import io.secuconnect.client.auth.*;
//import io.secuconnect.client.api.PaymentSecupayPayoutApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_token
OAuth oauth_token = (OAuth) defaultClient.getAuthentication("oauth_token");
oauth_token.setAccessToken("YOUR ACCESS TOKEN");

PaymentSecupayPayoutApi apiInstance = new PaymentSecupayPayoutApi();
SecupayPayoutDTO body = new SecupayPayoutDTO(); // SecupayPayoutDTO | Payout payment transaction input properties
try {
    SecupayPayoutProductModel result = apiInstance.paymentSecupaypayoutPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentSecupayPayoutApi#paymentSecupaypayoutPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SecupayPayoutDTO**](SecupayPayoutDTO.md)| Payout payment transaction input properties |

### Return type

[**SecupayPayoutProductModel**](SecupayPayoutProductModel.md)

### Authorization

[oauth_token](../README.md#oauth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


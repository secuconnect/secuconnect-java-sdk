# PaymentSecupayPrepaysApi

All URIs are relative to *https://connect-testing.secupay-ag.de/api/v2/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**paymentSecupayPrepaysCancelById**](PaymentSecupayPrepaysApi.md#paymentSecupayPrepaysCancelById) | **POST** Payment/Secupayprepays/{hash}/cancel | POST Payment/Secupayprepays/{id}/cancel
[**paymentSecupayPrepaysGetById**](PaymentSecupayPrepaysApi.md#paymentSecupayPrepaysGetById) | **GET** Payment/Secupayprepays/{hash} | GET Payment/Secupayprepays/{id}
[**paymentSecupayprepaysPost**](PaymentSecupayPrepaysApi.md#paymentSecupayprepaysPost) | **POST** Payment/Secupayprepays | POST Payment/Secupayprepays


<a name="paymentSecupayPrepaysCancelById"></a>
# **paymentSecupayPrepaysCancelById**
> Object paymentSecupayPrepaysCancelById(hash)

POST Payment/Secupayprepays/{id}/cancel

Function to cancel the transaction

### Example
```java
// Import classes:
//import io.secuconnect.client.ApiClient;
//import io.secuconnect.client.ApiException;
//import io.secuconnect.client.Configuration;
//import io.secuconnect.client.auth.*;
//import io.secuconnect.client.api.PaymentSecupayPrepaysApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_token
OAuth oauth_token = (OAuth) defaultClient.getAuthentication("oauth_token");
oauth_token.setAccessToken("YOUR ACCESS TOKEN");

PaymentSecupayPrepaysApi apiInstance = new PaymentSecupayPrepaysApi();
String hash = "hash_example"; // String | Transaction hash
try {
    Object result = apiInstance.paymentSecupayPrepaysCancelById(hash);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentSecupayPrepaysApi#paymentSecupayPrepaysCancelById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **hash** | **String**| Transaction hash |

### Return type

**Object**

### Authorization

[oauth_token](../README.md#oauth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="paymentSecupayPrepaysGetById"></a>
# **paymentSecupayPrepaysGetById**
> SecupayTransactionProductModel paymentSecupayPrepaysGetById(hash)

GET Payment/Secupayprepays/{id}

Get the details of a payment transaction

### Example
```java
// Import classes:
//import io.secuconnect.client.ApiClient;
//import io.secuconnect.client.ApiException;
//import io.secuconnect.client.Configuration;
//import io.secuconnect.client.auth.*;
//import io.secuconnect.client.api.PaymentSecupayPrepaysApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_token
OAuth oauth_token = (OAuth) defaultClient.getAuthentication("oauth_token");
oauth_token.setAccessToken("YOUR ACCESS TOKEN");

PaymentSecupayPrepaysApi apiInstance = new PaymentSecupayPrepaysApi();
String hash = "hash_example"; // String | Payment transaction ID
try {
    SecupayTransactionProductModel result = apiInstance.paymentSecupayPrepaysGetById(hash);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentSecupayPrepaysApi#paymentSecupayPrepaysGetById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **hash** | **String**| Payment transaction ID |

### Return type

[**SecupayTransactionProductModel**](SecupayTransactionProductModel.md)

### Authorization

[oauth_token](../README.md#oauth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="paymentSecupayprepaysPost"></a>
# **paymentSecupayprepaysPost**
> SecupayTransactionProductModel paymentSecupayprepaysPost(body)

POST Payment/Secupayprepays

Start a prepay payment transaction

### Example
```java
// Import classes:
//import io.secuconnect.client.ApiClient;
//import io.secuconnect.client.ApiException;
//import io.secuconnect.client.Configuration;
//import io.secuconnect.client.auth.*;
//import io.secuconnect.client.api.PaymentSecupayPrepaysApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_token
OAuth oauth_token = (OAuth) defaultClient.getAuthentication("oauth_token");
oauth_token.setAccessToken("YOUR ACCESS TOKEN");

PaymentSecupayPrepaysApi apiInstance = new PaymentSecupayPrepaysApi();
SecupayTransactionProductDTO body = new SecupayTransactionProductDTO(); // SecupayTransactionProductDTO | Prepay payment transaction input properties
try {
    SecupayTransactionProductModel result = apiInstance.paymentSecupayprepaysPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentSecupayPrepaysApi#paymentSecupayprepaysPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SecupayTransactionProductDTO**](SecupayTransactionProductDTO.md)| Prepay payment transaction input properties | [optional]

### Return type

[**SecupayTransactionProductModel**](SecupayTransactionProductModel.md)

### Authorization

[oauth_token](../README.md#oauth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


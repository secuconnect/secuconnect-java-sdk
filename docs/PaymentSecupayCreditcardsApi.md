# PaymentSecupayCreditcardsApi

All URIs are relative to *https://connect-testing.secupay-ag.de/api/v2/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**paymentSecupayCreditcardsCancelById**](PaymentSecupayCreditcardsApi.md#paymentSecupayCreditcardsCancelById) | **POST** Payment/Secupaycreditcards/{hash}/cancel | POST Payment/Secupaycreditcards/{id}/cancel
[**paymentSecupayCreditcardsGetById**](PaymentSecupayCreditcardsApi.md#paymentSecupayCreditcardsGetById) | **GET** Payment/Secupaycreditcards/{hash} | GET Payment/Secupaycreditcards/{id}
[**paymentSecupaycreditcardsPost**](PaymentSecupayCreditcardsApi.md#paymentSecupaycreditcardsPost) | **POST** Payment/Secupaycreditcards | POST Payment/Secupaycreditcards


<a name="paymentSecupayCreditcardsCancelById"></a>
# **paymentSecupayCreditcardsCancelById**
> Object paymentSecupayCreditcardsCancelById(hash)

POST Payment/Secupaycreditcards/{id}/cancel

Function to cancel the transaction

### Example
```java
// Import classes:
//import io.secuconnect.client.ApiClient;
//import io.secuconnect.client.ApiException;
//import io.secuconnect.client.Configuration;
//import io.secuconnect.client.auth.*;
//import io.secuconnect.client.api.PaymentSecupayCreditcardsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_token
OAuth oauth_token = (OAuth) defaultClient.getAuthentication("oauth_token");
oauth_token.setAccessToken("YOUR ACCESS TOKEN");

PaymentSecupayCreditcardsApi apiInstance = new PaymentSecupayCreditcardsApi();
String hash = "hash_example"; // String | Transaction hash
try {
    Object result = apiInstance.paymentSecupayCreditcardsCancelById(hash);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentSecupayCreditcardsApi#paymentSecupayCreditcardsCancelById");
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

<a name="paymentSecupayCreditcardsGetById"></a>
# **paymentSecupayCreditcardsGetById**
> SecupayTransactionProductModel paymentSecupayCreditcardsGetById(hash)

GET Payment/Secupaycreditcards/{id}

Get the details of a payment transaction

### Example
```java
// Import classes:
//import io.secuconnect.client.ApiClient;
//import io.secuconnect.client.ApiException;
//import io.secuconnect.client.Configuration;
//import io.secuconnect.client.auth.*;
//import io.secuconnect.client.api.PaymentSecupayCreditcardsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_token
OAuth oauth_token = (OAuth) defaultClient.getAuthentication("oauth_token");
oauth_token.setAccessToken("YOUR ACCESS TOKEN");

PaymentSecupayCreditcardsApi apiInstance = new PaymentSecupayCreditcardsApi();
String hash = "hash_example"; // String | Payment transaction ID
try {
    SecupayTransactionProductModel result = apiInstance.paymentSecupayCreditcardsGetById(hash);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentSecupayCreditcardsApi#paymentSecupayCreditcardsGetById");
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

<a name="paymentSecupaycreditcardsPost"></a>
# **paymentSecupaycreditcardsPost**
> SecupayTransactionProductModel paymentSecupaycreditcardsPost(body)

POST Payment/Secupaycreditcards

Start a credit card payment transaction

### Example
```java
// Import classes:
//import io.secuconnect.client.ApiClient;
//import io.secuconnect.client.ApiException;
//import io.secuconnect.client.Configuration;
//import io.secuconnect.client.auth.*;
//import io.secuconnect.client.api.PaymentSecupayCreditcardsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_token
OAuth oauth_token = (OAuth) defaultClient.getAuthentication("oauth_token");
oauth_token.setAccessToken("YOUR ACCESS TOKEN");

PaymentSecupayCreditcardsApi apiInstance = new PaymentSecupayCreditcardsApi();
SecupayTransactionProductDTO body = new SecupayTransactionProductDTO(); // SecupayTransactionProductDTO | Credit card payment transaction input properties
try {
    SecupayTransactionProductModel result = apiInstance.paymentSecupaycreditcardsPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentSecupayCreditcardsApi#paymentSecupaycreditcardsPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SecupayTransactionProductDTO**](SecupayTransactionProductDTO.md)| Credit card payment transaction input properties | [optional]

### Return type

[**SecupayTransactionProductModel**](SecupayTransactionProductModel.md)

### Authorization

[oauth_token](../README.md#oauth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


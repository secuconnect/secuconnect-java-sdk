# PaymentSecupayDebitsApi

All URIs are relative to *https://connect-testing.secupay-ag.de/api/v2/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**paymentSecupayDebitsCancelById**](PaymentSecupayDebitsApi.md#paymentSecupayDebitsCancelById) | **POST** Payment/Secupaydebits/{hash}/cancel | POST Payment/Secupaydebits/{id}/cancel
[**paymentSecupayDebitsGetById**](PaymentSecupayDebitsApi.md#paymentSecupayDebitsGetById) | **GET** Payment/Secupaydebits/{hash} | GET Payment/Secupaydebits/{id}
[**paymentSecupaydebitsPost**](PaymentSecupayDebitsApi.md#paymentSecupaydebitsPost) | **POST** Payment/Secupaydebits | POST Payment/Secupaydebits


<a name="paymentSecupayDebitsCancelById"></a>
# **paymentSecupayDebitsCancelById**
> Object paymentSecupayDebitsCancelById(hash)

POST Payment/Secupaydebits/{id}/cancel

Function to cancel the transaction

### Example
```java
// Import classes:
//import io.secuconnect.client.ApiClient;
//import io.secuconnect.client.ApiException;
//import io.secuconnect.client.Configuration;
//import io.secuconnect.client.auth.*;
//import io.secuconnect.client.api.PaymentSecupayDebitsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_token
OAuth oauth_token = (OAuth) defaultClient.getAuthentication("oauth_token");
oauth_token.setAccessToken("YOUR ACCESS TOKEN");

PaymentSecupayDebitsApi apiInstance = new PaymentSecupayDebitsApi();
String hash = "hash_example"; // String | Transaction hash
try {
    Object result = apiInstance.paymentSecupayDebitsCancelById(hash);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentSecupayDebitsApi#paymentSecupayDebitsCancelById");
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

<a name="paymentSecupayDebitsGetById"></a>
# **paymentSecupayDebitsGetById**
> SecupayTransactionProductModel paymentSecupayDebitsGetById(hash)

GET Payment/Secupaydebits/{id}

Get the details of a payment transaction

### Example
```java
// Import classes:
//import io.secuconnect.client.ApiClient;
//import io.secuconnect.client.ApiException;
//import io.secuconnect.client.Configuration;
//import io.secuconnect.client.auth.*;
//import io.secuconnect.client.api.PaymentSecupayDebitsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_token
OAuth oauth_token = (OAuth) defaultClient.getAuthentication("oauth_token");
oauth_token.setAccessToken("YOUR ACCESS TOKEN");

PaymentSecupayDebitsApi apiInstance = new PaymentSecupayDebitsApi();
String hash = "hash_example"; // String | Payment transaction ID
try {
    SecupayTransactionProductModel result = apiInstance.paymentSecupayDebitsGetById(hash);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentSecupayDebitsApi#paymentSecupayDebitsGetById");
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

<a name="paymentSecupaydebitsPost"></a>
# **paymentSecupaydebitsPost**
> SecupayTransactionProductModel paymentSecupaydebitsPost(body)

POST Payment/Secupaydebits

Start a debit payment transaction

### Example
```java
// Import classes:
//import io.secuconnect.client.ApiClient;
//import io.secuconnect.client.ApiException;
//import io.secuconnect.client.Configuration;
//import io.secuconnect.client.auth.*;
//import io.secuconnect.client.api.PaymentSecupayDebitsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_token
OAuth oauth_token = (OAuth) defaultClient.getAuthentication("oauth_token");
oauth_token.setAccessToken("YOUR ACCESS TOKEN");

PaymentSecupayDebitsApi apiInstance = new PaymentSecupayDebitsApi();
SecupayTransactionProductDTO body = new SecupayTransactionProductDTO(); // SecupayTransactionProductDTO | Debit payment transaction input properties
try {
    SecupayTransactionProductModel result = apiInstance.paymentSecupaydebitsPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentSecupayDebitsApi#paymentSecupaydebitsPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SecupayTransactionProductDTO**](SecupayTransactionProductDTO.md)| Debit payment transaction input properties | [optional]

### Return type

[**SecupayTransactionProductModel**](SecupayTransactionProductModel.md)

### Authorization

[oauth_token](../README.md#oauth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


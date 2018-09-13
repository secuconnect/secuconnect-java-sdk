# PaymentSecupayInvoicesApi

All URIs are relative to *https://connect-testing.secupay-ag.de/api/v2/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**paymentSecupayInvoicesCancelById**](PaymentSecupayInvoicesApi.md#paymentSecupayInvoicesCancelById) | **POST** Payment/Secupayinvoices/{hash}/cancel | POST Payment/Secupayinvoices/{id}/cancel
[**paymentSecupayInvoicesGetById**](PaymentSecupayInvoicesApi.md#paymentSecupayInvoicesGetById) | **GET** Payment/Secupayinvoices/{hash} | GET Payment/Secupayinvoices/{id}
[**paymentSecupayinvoicesPost**](PaymentSecupayInvoicesApi.md#paymentSecupayinvoicesPost) | **POST** Payment/Secupayinvoices | POST Payment/Secupayinvoices


<a name="paymentSecupayInvoicesCancelById"></a>
# **paymentSecupayInvoicesCancelById**
> Object paymentSecupayInvoicesCancelById(hash)

POST Payment/Secupayinvoices/{id}/cancel

Function to cancel the transaction

### Example
```java
// Import classes:
//import io.secuconnect.client.ApiClient;
//import io.secuconnect.client.ApiException;
//import io.secuconnect.client.Configuration;
//import io.secuconnect.client.auth.*;
//import io.secuconnect.client.api.PaymentSecupayInvoicesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_token
OAuth oauth_token = (OAuth) defaultClient.getAuthentication("oauth_token");
oauth_token.setAccessToken("YOUR ACCESS TOKEN");

PaymentSecupayInvoicesApi apiInstance = new PaymentSecupayInvoicesApi();
String hash = "hash_example"; // String | Transaction hash
try {
    Object result = apiInstance.paymentSecupayInvoicesCancelById(hash);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentSecupayInvoicesApi#paymentSecupayInvoicesCancelById");
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

<a name="paymentSecupayInvoicesGetById"></a>
# **paymentSecupayInvoicesGetById**
> SecupayTransactionProductModel paymentSecupayInvoicesGetById(hash)

GET Payment/Secupayinvoices/{id}

Get the details of a payment transaction

### Example
```java
// Import classes:
//import io.secuconnect.client.ApiClient;
//import io.secuconnect.client.ApiException;
//import io.secuconnect.client.Configuration;
//import io.secuconnect.client.auth.*;
//import io.secuconnect.client.api.PaymentSecupayInvoicesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_token
OAuth oauth_token = (OAuth) defaultClient.getAuthentication("oauth_token");
oauth_token.setAccessToken("YOUR ACCESS TOKEN");

PaymentSecupayInvoicesApi apiInstance = new PaymentSecupayInvoicesApi();
String hash = "hash_example"; // String | Payment transaction ID
try {
    SecupayTransactionProductModel result = apiInstance.paymentSecupayInvoicesGetById(hash);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentSecupayInvoicesApi#paymentSecupayInvoicesGetById");
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

<a name="paymentSecupayinvoicesPost"></a>
# **paymentSecupayinvoicesPost**
> SecupayTransactionProductModel paymentSecupayinvoicesPost(body)

POST Payment/Secupayinvoices

Start a invoice payment transaction

### Example
```java
// Import classes:
//import io.secuconnect.client.ApiClient;
//import io.secuconnect.client.ApiException;
//import io.secuconnect.client.Configuration;
//import io.secuconnect.client.auth.*;
//import io.secuconnect.client.api.PaymentSecupayInvoicesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_token
OAuth oauth_token = (OAuth) defaultClient.getAuthentication("oauth_token");
oauth_token.setAccessToken("YOUR ACCESS TOKEN");

PaymentSecupayInvoicesApi apiInstance = new PaymentSecupayInvoicesApi();
SecupayTransactionProductDTO body = new SecupayTransactionProductDTO(); // SecupayTransactionProductDTO | Invoice payment transaction input properties
try {
    SecupayTransactionProductModel result = apiInstance.paymentSecupayinvoicesPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentSecupayInvoicesApi#paymentSecupayinvoicesPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SecupayTransactionProductDTO**](SecupayTransactionProductDTO.md)| Invoice payment transaction input properties | [optional]

### Return type

[**SecupayTransactionProductModel**](SecupayTransactionProductModel.md)

### Authorization

[oauth_token](../README.md#oauth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


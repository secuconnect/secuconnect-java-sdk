# PaymentSecupayPrepaysApi

All URIs are relative to *https://connect-testing.secupay-ag.de/api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**assignExternalInvoicePdf**](PaymentSecupayPrepaysApi.md#assignExternalInvoicePdf) | **POST** /Payment/{paymentMethod}/{paymentId}/assignExternalInvoicePdf/{documentId} | POST Payment/{paymentMethod}/{paymentId}/assignExternalInvoicePdf/{documentId}
[**cancelPaymentTransactionById**](PaymentSecupayPrepaysApi.md#cancelPaymentTransactionById) | **POST** /Payment/{paymentMethod}/{paymentId}/cancel | POST Payment/{paymentMethod}/{paymentId}/cancel
[**capturePaymentTransactionById**](PaymentSecupayPrepaysApi.md#capturePaymentTransactionById) | **POST** /Payment/{paymentMethod}/{paymentId}/capture | POST Payment/{paymentMethod}/{paymentId}/capture
[**paymentSecupayPrepaysCancelById**](PaymentSecupayPrepaysApi.md#paymentSecupayPrepaysCancelById) | **POST** /Payment/Secupayprepays/{paymentPrepayId}/cancel | POST Payment/Secupayprepays/{paymentPrepayId}/cancel
[**paymentSecupayPrepaysGetById**](PaymentSecupayPrepaysApi.md#paymentSecupayPrepaysGetById) | **GET** /Payment/Secupayprepays/{paymentPrepayId} | GET Payment/Secupayprepays/{paymentPrepayId}
[**paymentSecupayprepaysPost**](PaymentSecupayPrepaysApi.md#paymentSecupayprepaysPost) | **POST** /Payment/Secupayprepays | POST Payment/Secupayprepays
[**reverseAccrualByPaymentId**](PaymentSecupayPrepaysApi.md#reverseAccrualByPaymentId) | **PUT** /Payment/{paymentMethod}/{paymentId}/accrual | PUT Payment/{paymentMethod}/{paymentId}/accrual
[**setShippingInformationByPaymentId**](PaymentSecupayPrepaysApi.md#setShippingInformationByPaymentId) | **PUT** /Payment/{paymentMethod}/{paymentId}/shippingInformation | PUT Payment/{paymentMethod}/{paymentId}/shippingInformation
[**updateBasketByPaymentId**](PaymentSecupayPrepaysApi.md#updateBasketByPaymentId) | **PUT** /Payment/{paymentMethod}/{paymentId}/basket | PUT Payment/{paymentMethod}/{paymentId}/basket


<a name="assignExternalInvoicePdf"></a>
# **assignExternalInvoicePdf**
> SecupayTransactionExternalInvoicePdf assignExternalInvoicePdf(paymentMethod, paymentId, documentId, body)

POST Payment/{paymentMethod}/{paymentId}/assignExternalInvoicePdf/{documentId}

Assign external invoice pdf

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
String paymentMethod = "paymentMethod_example"; // String | Payment method (secupaydebits, secupayprepays, secupayinvoices, ...)
String paymentId = "paymentId_example"; // String | Payment id
String documentId = "documentId_example"; // String | Document id
SecupayTransactionDTOExternalInvoicePdf body = new SecupayTransactionDTOExternalInvoicePdf(); // SecupayTransactionDTOExternalInvoicePdf | Request body for assigning external invoice pdf
try {
    SecupayTransactionExternalInvoicePdf result = apiInstance.assignExternalInvoicePdf(paymentMethod, paymentId, documentId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentSecupayPrepaysApi#assignExternalInvoicePdf");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **paymentMethod** | **String**| Payment method (secupaydebits, secupayprepays, secupayinvoices, ...) | [required]
 **paymentId** | **String**| Payment id | [required]
 **documentId** | **String**| Document id | [required]
 **body** | [**SecupayTransactionDTOExternalInvoicePdf**](SecupayTransactionDTOExternalInvoicePdf.md)| Request body for assigning external invoice pdf | [required]

### Return type

[**SecupayTransactionExternalInvoicePdf**](SecupayTransactionExternalInvoicePdf.md)

### Authorization

[oauth_token](../README.md#oauth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="cancelPaymentTransactionById"></a>
# **cancelPaymentTransactionById**
> Object cancelPaymentTransactionById(paymentMethod, paymentId, body)

POST Payment/{paymentMethod}/{paymentId}/cancel

Function to cancel the payment transaction

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
String paymentMethod = "paymentMethod_example"; // String | Payment method (secupaydebits, secupayprepays, secupayinvoices, ...)
String paymentId = "paymentId_example"; // String | Payment id
SecupayTransactionCancelDTO body = new SecupayTransactionCancelDTO(); // SecupayTransactionCancelDTO | Cancel payment transaction input properties
try {
    Object result = apiInstance.cancelPaymentTransactionById(paymentMethod, paymentId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentSecupayPrepaysApi#cancelPaymentTransactionById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **paymentMethod** | **String**| Payment method (secupaydebits, secupayprepays, secupayinvoices, ...) | [required]
 **paymentId** | **String**| Payment id | [required]
 **body** | [**SecupayTransactionCancelDTO**](SecupayTransactionCancelDTO.md)| Cancel payment transaction input properties |

### Return type

**Object**

### Authorization

[oauth_token](../README.md#oauth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="capturePaymentTransactionById"></a>
# **capturePaymentTransactionById**
> SecupayTransactionProductModel capturePaymentTransactionById(paymentMethod, paymentId, body)

POST Payment/{paymentMethod}/{paymentId}/capture

Function to cancel the payment transaction

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
String paymentMethod = "paymentMethod_example"; // String | Payment method (secupaydebits, secupayprepays, secupayinvoices, ...)
String paymentId = "paymentId_example"; // String | Payment id
SecupayTransactionCaptureDTO body = new SecupayTransactionCaptureDTO(); // SecupayTransactionCaptureDTO | Capture payment transaction input properties
try {
    SecupayTransactionProductModel result = apiInstance.capturePaymentTransactionById(paymentMethod, paymentId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentSecupayPrepaysApi#capturePaymentTransactionById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **paymentMethod** | **String**| Payment method (secupaydebits, secupayprepays, secupayinvoices, ...) | [required]
 **paymentId** | **String**| Payment id | [required]
 **body** | [**SecupayTransactionCaptureDTO**](SecupayTransactionCaptureDTO.md)| Capture payment transaction input properties |

### Return type

[**SecupayTransactionProductModel**](SecupayTransactionProductModel.md)

### Authorization

[oauth_token](../README.md#oauth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="paymentSecupayPrepaysCancelById"></a>
# **paymentSecupayPrepaysCancelById**
> Object paymentSecupayPrepaysCancelById(paymentPrepayId)

POST Payment/Secupayprepays/{paymentPrepayId}/cancel

DEPRECATED: use cancelPaymentTransactionById

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
String paymentPrepayId = "paymentPrepayId_example"; // String | Payment prepay id
try {
    Object result = apiInstance.paymentSecupayPrepaysCancelById(paymentPrepayId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentSecupayPrepaysApi#paymentSecupayPrepaysCancelById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **paymentPrepayId** | **String**| Payment prepay id | [required]

### Return type

**Object**

### Authorization

[oauth_token](../README.md#oauth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="paymentSecupayPrepaysGetById"></a>
# **paymentSecupayPrepaysGetById**
> SecupayTransactionProductModel paymentSecupayPrepaysGetById(paymentPrepayId)

GET Payment/Secupayprepays/{paymentPrepayId}

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
String paymentPrepayId = "paymentPrepayId_example"; // String | Payment prepay id
try {
    SecupayTransactionProductModel result = apiInstance.paymentSecupayPrepaysGetById(paymentPrepayId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentSecupayPrepaysApi#paymentSecupayPrepaysGetById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **paymentPrepayId** | **String**| Payment prepay id | [required]

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
 **body** | [**SecupayTransactionProductDTO**](SecupayTransactionProductDTO.md)| Prepay payment transaction input properties |

### Return type

[**SecupayTransactionProductModel**](SecupayTransactionProductModel.md)

### Authorization

[oauth_token](../README.md#oauth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="reverseAccrualByPaymentId"></a>
# **reverseAccrualByPaymentId**
> SecupayTransactionProductModel reverseAccrualByPaymentId(paymentMethod, paymentId, body)

PUT Payment/{paymentMethod}/{paymentId}/accrual

Update the accrual flag of an existing payment transaction

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
String paymentMethod = "paymentMethod_example"; // String | Payment method (secupaydebits, secupayprepays, secupayinvoices, ...)
String paymentId = "paymentId_example"; // String | Payment id
SecupayTransactionReverseAccrualDTO body = new SecupayTransactionReverseAccrualDTO(); // SecupayTransactionReverseAccrualDTO | Reverse accrual input properties
try {
    SecupayTransactionProductModel result = apiInstance.reverseAccrualByPaymentId(paymentMethod, paymentId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentSecupayPrepaysApi#reverseAccrualByPaymentId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **paymentMethod** | **String**| Payment method (secupaydebits, secupayprepays, secupayinvoices, ...) | [required]
 **paymentId** | **String**| Payment id | [required]
 **body** | [**SecupayTransactionReverseAccrualDTO**](SecupayTransactionReverseAccrualDTO.md)| Reverse accrual input properties | [required]

### Return type

[**SecupayTransactionProductModel**](SecupayTransactionProductModel.md)

### Authorization

[oauth_token](../README.md#oauth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="setShippingInformationByPaymentId"></a>
# **setShippingInformationByPaymentId**
> SecupayTransactionProductModel setShippingInformationByPaymentId(paymentMethod, paymentId, body)

PUT Payment/{paymentMethod}/{paymentId}/shippingInformation

Update the accrual flag of an existing payment transaction

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
String paymentMethod = "paymentMethod_example"; // String | Payment method (secupaydebits, secupayprepays, secupayinvoices, ...)
String paymentId = "paymentId_example"; // String | Payment id
SecupayTransactionSetShippingInformationDTO body = new SecupayTransactionSetShippingInformationDTO(); // SecupayTransactionSetShippingInformationDTO | Shipping information properties
try {
    SecupayTransactionProductModel result = apiInstance.setShippingInformationByPaymentId(paymentMethod, paymentId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentSecupayPrepaysApi#setShippingInformationByPaymentId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **paymentMethod** | **String**| Payment method (secupaydebits, secupayprepays, secupayinvoices, ...) | [required]
 **paymentId** | **String**| Payment id | [required]
 **body** | [**SecupayTransactionSetShippingInformationDTO**](SecupayTransactionSetShippingInformationDTO.md)| Shipping information properties | [required]

### Return type

[**SecupayTransactionProductModel**](SecupayTransactionProductModel.md)

### Authorization

[oauth_token](../README.md#oauth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="updateBasketByPaymentId"></a>
# **updateBasketByPaymentId**
> SecupayTransactionProductModel updateBasketByPaymentId(paymentMethod, paymentId, body)

PUT Payment/{paymentMethod}/{paymentId}/basket

Update a basket of an existing payment transaction

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
String paymentMethod = "paymentMethod_example"; // String | Payment method (secupaydebits, secupayprepays, secupayinvoices, ...)
String paymentId = "paymentId_example"; // String | Payment id
SecupayTransactionUpdateBasketDTO body = new SecupayTransactionUpdateBasketDTO(); // SecupayTransactionUpdateBasketDTO | Update basket input properties
try {
    SecupayTransactionProductModel result = apiInstance.updateBasketByPaymentId(paymentMethod, paymentId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentSecupayPrepaysApi#updateBasketByPaymentId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **paymentMethod** | **String**| Payment method (secupaydebits, secupayprepays, secupayinvoices, ...) | [required]
 **paymentId** | **String**| Payment id | [required]
 **body** | [**SecupayTransactionUpdateBasketDTO**](SecupayTransactionUpdateBasketDTO.md)| Update basket input properties | [required]

### Return type

[**SecupayTransactionProductModel**](SecupayTransactionProductModel.md)

### Authorization

[oauth_token](../README.md#oauth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


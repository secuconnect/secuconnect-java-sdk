# PaymentContractsApi

All URIs are relative to *https://connect-testing.secupay-ag.de/api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**paymentContractsGet**](PaymentContractsApi.md#paymentContractsGet) | **GET** /Payment/Contracts | GET Payment/Contracts
[**paymentContractsGetById**](PaymentContractsApi.md#paymentContractsGetById) | **GET** /Payment/Contracts/{paymentContractId} | GET Payment/Contracts/{paymentContractId}
[**paymentContractsIdClonePost**](PaymentContractsApi.md#paymentContractsIdClonePost) | **POST** /Payment/Contracts/{paymentContractId}/clone | POST Payment/Contracts/{paymentContractId}/clone
[**paymentContractsIdDelete**](PaymentContractsApi.md#paymentContractsIdDelete) | **DELETE** /Payment/Contracts/{paymentContractId} | DELETE Payment/Contracts/{paymentContractId}
[**paymentContractsIdPaymentMethodsGet**](PaymentContractsApi.md#paymentContractsIdPaymentMethodsGet) | **GET** /Payment/Contracts/{paymentContractId}/PaymentMethods | GET Payment/Contracts/{paymentContractId}/PaymentMethods
[**paymentContractsIdPut**](PaymentContractsApi.md#paymentContractsIdPut) | **PUT** /Payment/Contracts/{paymentContractId} | PUT Payment/Contracts/{paymentContractId}
[**paymentContractsIdRequestIdPost**](PaymentContractsApi.md#paymentContractsIdRequestIdPost) | **POST** /Payment/Contracts/{paymentContractId}/requestId | POST Payment/Contracts/{paymentContractId}/requestId
[**paymentContractsPost**](PaymentContractsApi.md#paymentContractsPost) | **POST** /Payment/Contracts | POST Payment/Contracts


<a name="paymentContractsGet"></a>
# **paymentContractsGet**
> PaymentContractsList paymentContractsGet(count, offset, fields, q, sort)

GET Payment/Contracts

Get a list of payment contracts

### Example
```java
// Import classes:
//import io.secuconnect.client.ApiClient;
//import io.secuconnect.client.ApiException;
//import io.secuconnect.client.Configuration;
//import io.secuconnect.client.auth.*;
//import io.secuconnect.client.api.PaymentContractsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_token
OAuth oauth_token = (OAuth) defaultClient.getAuthentication("oauth_token");
oauth_token.setAccessToken("YOUR ACCESS TOKEN");

PaymentContractsApi apiInstance = new PaymentContractsApi();
Integer count = 56; // Integer | The number of items to return.
Integer offset = 56; // Integer | The position within the whole result set to start returning items (First element is at 0).
String fields = "fields_example"; // String | List of fields to include in the result. Nested properties can be accessed with this notation: prop1.prop2  Example: prop3,prop1.prop2
String q = "q_example"; // String | A query string to restrict the returned items to given conditions. The query string must consist of any combination of single expressions in the form property:condition.  *                  A condition may contain:  *                      - wildcard \"*\" for any number of characters  *                      - wildcard \"?\" for one character  *                      - ranges in the form [value TO value]  *  *                  Single expressions may combined by 'AND', 'OR', 'NOT' operators and parenthesis '(', ')' for grouping.  *                  Property names can be nested like \"prop1.prop2\".  *                  Example: (NOT customer.name:meier*) AND (customer.age:[30 TO 40] OR customer.age:[50 TO 60])  *                  
String sort = "sort_example"; // String | String with comma separated pairs of field:order (e.g. contact.surname:asc,contact.comapnyname:desc). Result set will be sorted by included fields, in ascending 'asc', or descending 'dsc' order.
try {
    PaymentContractsList result = apiInstance.paymentContractsGet(count, offset, fields, q, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentContractsApi#paymentContractsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **count** | **Integer**| The number of items to return. |
 **offset** | **Integer**| The position within the whole result set to start returning items (First element is at 0). |
 **fields** | **String**| List of fields to include in the result. Nested properties can be accessed with this notation: prop1.prop2  Example: prop3,prop1.prop2 |
 **q** | **String**| A query string to restrict the returned items to given conditions. The query string must consist of any combination of single expressions in the form property:condition.  *                  A condition may contain:  *                      - wildcard \&quot;*\&quot; for any number of characters  *                      - wildcard \&quot;?\&quot; for one character  *                      - ranges in the form [value TO value]  *  *                  Single expressions may combined by &#39;AND&#39;, &#39;OR&#39;, &#39;NOT&#39; operators and parenthesis &#39;(&#39;, &#39;)&#39; for grouping.  *                  Property names can be nested like \&quot;prop1.prop2\&quot;.  *                  Example: (NOT customer.name:meier*) AND (customer.age:[30 TO 40] OR customer.age:[50 TO 60])  *                   |
 **sort** | **String**| String with comma separated pairs of field:order (e.g. contact.surname:asc,contact.comapnyname:desc). Result set will be sorted by included fields, in ascending &#39;asc&#39;, or descending &#39;dsc&#39; order. |

### Return type

[**PaymentContractsList**](PaymentContractsList.md)

### Authorization

[oauth_token](../README.md#oauth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="paymentContractsGetById"></a>
# **paymentContractsGetById**
> PaymentContractsProductModel paymentContractsGetById(paymentContractId)

GET Payment/Contracts/{paymentContractId}

Get all payment contracts

### Example
```java
// Import classes:
//import io.secuconnect.client.ApiClient;
//import io.secuconnect.client.ApiException;
//import io.secuconnect.client.Configuration;
//import io.secuconnect.client.auth.*;
//import io.secuconnect.client.api.PaymentContractsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_token
OAuth oauth_token = (OAuth) defaultClient.getAuthentication("oauth_token");
oauth_token.setAccessToken("YOUR ACCESS TOKEN");

PaymentContractsApi apiInstance = new PaymentContractsApi();
String paymentContractId = "paymentContractId_example"; // String | Search one by provided id
try {
    PaymentContractsProductModel result = apiInstance.paymentContractsGetById(paymentContractId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentContractsApi#paymentContractsGetById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **paymentContractId** | **String**| Search one by provided id | [required]

### Return type

[**PaymentContractsProductModel**](PaymentContractsProductModel.md)

### Authorization

[oauth_token](../README.md#oauth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="paymentContractsIdClonePost"></a>
# **paymentContractsIdClonePost**
> PaymentContractsProductModel paymentContractsIdClonePost(paymentContractId)

POST Payment/Contracts/{paymentContractId}/clone

Clone an existing payment contract

### Example
```java
// Import classes:
//import io.secuconnect.client.ApiClient;
//import io.secuconnect.client.ApiException;
//import io.secuconnect.client.Configuration;
//import io.secuconnect.client.auth.*;
//import io.secuconnect.client.api.PaymentContractsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_token
OAuth oauth_token = (OAuth) defaultClient.getAuthentication("oauth_token");
oauth_token.setAccessToken("YOUR ACCESS TOKEN");

PaymentContractsApi apiInstance = new PaymentContractsApi();
String paymentContractId = "paymentContractId_example"; // String | Contract identifier
try {
    PaymentContractsProductModel result = apiInstance.paymentContractsIdClonePost(paymentContractId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentContractsApi#paymentContractsIdClonePost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **paymentContractId** | **String**| Contract identifier | [required]

### Return type

[**PaymentContractsProductModel**](PaymentContractsProductModel.md)

### Authorization

[oauth_token](../README.md#oauth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="paymentContractsIdDelete"></a>
# **paymentContractsIdDelete**
> List&lt;PaymentContractsProductModel&gt; paymentContractsIdDelete(paymentContractId)

DELETE Payment/Contracts/{paymentContractId}

Delete payment contract

### Example
```java
// Import classes:
//import io.secuconnect.client.ApiClient;
//import io.secuconnect.client.ApiException;
//import io.secuconnect.client.Configuration;
//import io.secuconnect.client.auth.*;
//import io.secuconnect.client.api.PaymentContractsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_token
OAuth oauth_token = (OAuth) defaultClient.getAuthentication("oauth_token");
oauth_token.setAccessToken("YOUR ACCESS TOKEN");

PaymentContractsApi apiInstance = new PaymentContractsApi();
String paymentContractId = "paymentContractId_example"; // String | Payment contract id
try {
    List<PaymentContractsProductModel> result = apiInstance.paymentContractsIdDelete(paymentContractId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentContractsApi#paymentContractsIdDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **paymentContractId** | **String**| Payment contract id | [required]

### Return type

[**List&lt;PaymentContractsProductModel&gt;**](PaymentContractsProductModel.md)

### Authorization

[oauth_token](../README.md#oauth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="paymentContractsIdPaymentMethodsGet"></a>
# **paymentContractsIdPaymentMethodsGet**
> List&lt;String&gt; paymentContractsIdPaymentMethodsGet(paymentContractId)

GET Payment/Contracts/{paymentContractId}/PaymentMethods

Get available payment methods for given contract

### Example
```java
// Import classes:
//import io.secuconnect.client.ApiClient;
//import io.secuconnect.client.ApiException;
//import io.secuconnect.client.Configuration;
//import io.secuconnect.client.auth.*;
//import io.secuconnect.client.api.PaymentContractsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_token
OAuth oauth_token = (OAuth) defaultClient.getAuthentication("oauth_token");
oauth_token.setAccessToken("YOUR ACCESS TOKEN");

PaymentContractsApi apiInstance = new PaymentContractsApi();
String paymentContractId = "paymentContractId_example"; // String | Contract identifier
try {
    List<String> result = apiInstance.paymentContractsIdPaymentMethodsGet(paymentContractId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentContractsApi#paymentContractsIdPaymentMethodsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **paymentContractId** | **String**| Contract identifier | [required]

### Return type

**List&lt;String&gt;**

### Authorization

[oauth_token](../README.md#oauth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="paymentContractsIdPut"></a>
# **paymentContractsIdPut**
> PaymentContractsProductModel paymentContractsIdPut(paymentContractId, body)

PUT Payment/Contracts/{paymentContractId}

Update payment contract

### Example
```java
// Import classes:
//import io.secuconnect.client.ApiClient;
//import io.secuconnect.client.ApiException;
//import io.secuconnect.client.Configuration;
//import io.secuconnect.client.auth.*;
//import io.secuconnect.client.api.PaymentContractsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_token
OAuth oauth_token = (OAuth) defaultClient.getAuthentication("oauth_token");
oauth_token.setAccessToken("YOUR ACCESS TOKEN");

PaymentContractsApi apiInstance = new PaymentContractsApi();
String paymentContractId = "paymentContractId_example"; // String | Payment contract id
PaymentContractsDTO body = new PaymentContractsDTO(); // PaymentContractsDTO | Payment contract properties
try {
    PaymentContractsProductModel result = apiInstance.paymentContractsIdPut(paymentContractId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentContractsApi#paymentContractsIdPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **paymentContractId** | **String**| Payment contract id | [required]
 **body** | [**PaymentContractsDTO**](PaymentContractsDTO.md)| Payment contract properties | [required]

### Return type

[**PaymentContractsProductModel**](PaymentContractsProductModel.md)

### Authorization

[oauth_token](../README.md#oauth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="paymentContractsIdRequestIdPost"></a>
# **paymentContractsIdRequestIdPost**
> PaymentContractsRequestIdResult paymentContractsIdRequestIdPost(paymentContractId)

POST Payment/Contracts/{paymentContractId}/requestId

This method clones your payment contract, so that you can use this to separate the merchants of your marketplace. (Needs to be activated))

### Example
```java
// Import classes:
//import io.secuconnect.client.ApiClient;
//import io.secuconnect.client.ApiException;
//import io.secuconnect.client.Configuration;
//import io.secuconnect.client.auth.*;
//import io.secuconnect.client.api.PaymentContractsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_token
OAuth oauth_token = (OAuth) defaultClient.getAuthentication("oauth_token");
oauth_token.setAccessToken("YOUR ACCESS TOKEN");

PaymentContractsApi apiInstance = new PaymentContractsApi();
String paymentContractId = "paymentContractId_example"; // String | Contract identifier
try {
    PaymentContractsRequestIdResult result = apiInstance.paymentContractsIdRequestIdPost(paymentContractId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentContractsApi#paymentContractsIdRequestIdPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **paymentContractId** | **String**| Contract identifier | [required]

### Return type

[**PaymentContractsRequestIdResult**](PaymentContractsRequestIdResult.md)

### Authorization

[oauth_token](../README.md#oauth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="paymentContractsPost"></a>
# **paymentContractsPost**
> PaymentContractsProductModel paymentContractsPost(body)

POST Payment/Contracts

Add new contract

### Example
```java
// Import classes:
//import io.secuconnect.client.ApiClient;
//import io.secuconnect.client.ApiException;
//import io.secuconnect.client.Configuration;
//import io.secuconnect.client.auth.*;
//import io.secuconnect.client.api.PaymentContractsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_token
OAuth oauth_token = (OAuth) defaultClient.getAuthentication("oauth_token");
oauth_token.setAccessToken("YOUR ACCESS TOKEN");

PaymentContractsApi apiInstance = new PaymentContractsApi();
PaymentContractsDTO body = new PaymentContractsDTO(); // PaymentContractsDTO | Payment contracts properties
try {
    PaymentContractsProductModel result = apiInstance.paymentContractsPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentContractsApi#paymentContractsPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PaymentContractsDTO**](PaymentContractsDTO.md)| Payment contracts properties | [required]

### Return type

[**PaymentContractsProductModel**](PaymentContractsProductModel.md)

### Authorization

[oauth_token](../README.md#oauth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


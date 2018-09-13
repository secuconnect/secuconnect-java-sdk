# PaymentCustomersApi

All URIs are relative to *https://connect-testing.secupay-ag.de/api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**paymentCustomersGet**](PaymentCustomersApi.md#paymentCustomersGet) | **GET** /Payment/Customers | GET Payment/Customers
[**paymentCustomersGetById**](PaymentCustomersApi.md#paymentCustomersGetById) | **GET** /Payment/Customers/{paymentCustomerId} | GET Payment/Customers/{paymentCustomerId}
[**paymentCustomersIdDelete**](PaymentCustomersApi.md#paymentCustomersIdDelete) | **DELETE** /Payment/Customers/{paymentCustomerId} | DELETE Payment/Customers/{paymentCustomerId}
[**paymentCustomersIdPut**](PaymentCustomersApi.md#paymentCustomersIdPut) | **PUT** /Payment/Customers/{paymentCustomerId} | PUT Payment/Customers/{paymentCustomerId}
[**paymentCustomersPost**](PaymentCustomersApi.md#paymentCustomersPost) | **POST** /Payment/Customers | POST Payment/Customers


<a name="paymentCustomersGet"></a>
# **paymentCustomersGet**
> PaymentCustomersList paymentCustomersGet(count, offset, fields, q, sort)

GET Payment/Customers

Get a list of payment customers

### Example
```java
// Import classes:
//import io.secuconnect.client.ApiClient;
//import io.secuconnect.client.ApiException;
//import io.secuconnect.client.Configuration;
//import io.secuconnect.client.auth.*;
//import io.secuconnect.client.api.PaymentCustomersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_token
OAuth oauth_token = (OAuth) defaultClient.getAuthentication("oauth_token");
oauth_token.setAccessToken("YOUR ACCESS TOKEN");

PaymentCustomersApi apiInstance = new PaymentCustomersApi();
Integer count = 56; // Integer | The number of items to return.
Integer offset = 56; // Integer | The position within the whole result set to start returning items (First element is at 0).
String fields = "fields_example"; // String | List of fields to include in the result. Nested properties can be accessed with this notation: prop1.prop2  Example: prop3,prop1.prop2
String q = "q_example"; // String | A query string to restrict the returned items to given conditions. The query string must consist of any combination of single expressions in the form property:condition.  *                  A condition may contain:  *                      - wildcard \"*\" for any number of characters  *                      - wildcard \"?\" for one character  *                      - ranges in the form [value TO value]  *  *                  Single expressions may combined by 'AND', 'OR', 'NOT' operators and parenthesis '(', ')' for grouping.  *                  Property names can be nested like \"prop1.prop2\".  *                  Example: (NOT customer.name:meier*) AND (customer.age:[30 TO 40] OR customer.age:[50 TO 60])  *                  
String sort = "sort_example"; // String | String with comma separated pairs of field:order (e.g. contact.surname:asc,contact.comapnyname:desc). Result set will be sorted by included fields, in ascending 'asc', or descending 'dsc' order.
try {
    PaymentCustomersList result = apiInstance.paymentCustomersGet(count, offset, fields, q, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentCustomersApi#paymentCustomersGet");
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

[**PaymentCustomersList**](PaymentCustomersList.md)

### Authorization

[oauth_token](../README.md#oauth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="paymentCustomersGetById"></a>
# **paymentCustomersGetById**
> PaymentCustomersProductModel paymentCustomersGetById(paymentCustomerId)

GET Payment/Customers/{paymentCustomerId}

Get all payment customers

### Example
```java
// Import classes:
//import io.secuconnect.client.ApiClient;
//import io.secuconnect.client.ApiException;
//import io.secuconnect.client.Configuration;
//import io.secuconnect.client.auth.*;
//import io.secuconnect.client.api.PaymentCustomersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_token
OAuth oauth_token = (OAuth) defaultClient.getAuthentication("oauth_token");
oauth_token.setAccessToken("YOUR ACCESS TOKEN");

PaymentCustomersApi apiInstance = new PaymentCustomersApi();
String paymentCustomerId = "paymentCustomerId_example"; // String | Payment customer id
try {
    PaymentCustomersProductModel result = apiInstance.paymentCustomersGetById(paymentCustomerId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentCustomersApi#paymentCustomersGetById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **paymentCustomerId** | **String**| Payment customer id | [required]

### Return type

[**PaymentCustomersProductModel**](PaymentCustomersProductModel.md)

### Authorization

[oauth_token](../README.md#oauth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="paymentCustomersIdDelete"></a>
# **paymentCustomersIdDelete**
> List&lt;PaymentCustomersProductModel&gt; paymentCustomersIdDelete(paymentCustomerId)

DELETE Payment/Customers/{paymentCustomerId}

Delete payment customer

### Example
```java
// Import classes:
//import io.secuconnect.client.ApiClient;
//import io.secuconnect.client.ApiException;
//import io.secuconnect.client.Configuration;
//import io.secuconnect.client.auth.*;
//import io.secuconnect.client.api.PaymentCustomersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_token
OAuth oauth_token = (OAuth) defaultClient.getAuthentication("oauth_token");
oauth_token.setAccessToken("YOUR ACCESS TOKEN");

PaymentCustomersApi apiInstance = new PaymentCustomersApi();
String paymentCustomerId = "paymentCustomerId_example"; // String | Payment customer id
try {
    List<PaymentCustomersProductModel> result = apiInstance.paymentCustomersIdDelete(paymentCustomerId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentCustomersApi#paymentCustomersIdDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **paymentCustomerId** | **String**| Payment customer id | [required]

### Return type

[**List&lt;PaymentCustomersProductModel&gt;**](PaymentCustomersProductModel.md)

### Authorization

[oauth_token](../README.md#oauth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="paymentCustomersIdPut"></a>
# **paymentCustomersIdPut**
> PaymentCustomersProductModel paymentCustomersIdPut(paymentCustomerId, body)

PUT Payment/Customers/{paymentCustomerId}

Update payment customer

### Example
```java
// Import classes:
//import io.secuconnect.client.ApiClient;
//import io.secuconnect.client.ApiException;
//import io.secuconnect.client.Configuration;
//import io.secuconnect.client.auth.*;
//import io.secuconnect.client.api.PaymentCustomersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_token
OAuth oauth_token = (OAuth) defaultClient.getAuthentication("oauth_token");
oauth_token.setAccessToken("YOUR ACCESS TOKEN");

PaymentCustomersApi apiInstance = new PaymentCustomersApi();
String paymentCustomerId = "paymentCustomerId_example"; // String | Payment customer id
PaymentCustomersDTO body = new PaymentCustomersDTO(); // PaymentCustomersDTO | Payment customer properties
try {
    PaymentCustomersProductModel result = apiInstance.paymentCustomersIdPut(paymentCustomerId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentCustomersApi#paymentCustomersIdPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **paymentCustomerId** | **String**| Payment customer id | [required]
 **body** | [**PaymentCustomersDTO**](PaymentCustomersDTO.md)| Payment customer properties | [required]

### Return type

[**PaymentCustomersProductModel**](PaymentCustomersProductModel.md)

### Authorization

[oauth_token](../README.md#oauth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="paymentCustomersPost"></a>
# **paymentCustomersPost**
> PaymentCustomersProductModel paymentCustomersPost(body)

POST Payment/Customers

Add new customer

### Example
```java
// Import classes:
//import io.secuconnect.client.ApiClient;
//import io.secuconnect.client.ApiException;
//import io.secuconnect.client.Configuration;
//import io.secuconnect.client.auth.*;
//import io.secuconnect.client.api.PaymentCustomersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_token
OAuth oauth_token = (OAuth) defaultClient.getAuthentication("oauth_token");
oauth_token.setAccessToken("YOUR ACCESS TOKEN");

PaymentCustomersApi apiInstance = new PaymentCustomersApi();
PaymentCustomersDTO body = new PaymentCustomersDTO(); // PaymentCustomersDTO | Payment customer properties
try {
    PaymentCustomersProductModel result = apiInstance.paymentCustomersPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentCustomersApi#paymentCustomersPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PaymentCustomersDTO**](PaymentCustomersDTO.md)| Payment customer properties | [required]

### Return type

[**PaymentCustomersProductModel**](PaymentCustomersProductModel.md)

### Authorization

[oauth_token](../README.md#oauth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


# PaymentContainersApi

All URIs are relative to *https://connect-testing.secupay-ag.de/api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**paymentContainersGet**](PaymentContainersApi.md#paymentContainersGet) | **GET** /Payment/Containers | GET Payment/Containers
[**paymentContainersGetById**](PaymentContainersApi.md#paymentContainersGetById) | **GET** /Payment/Containers/{paymentContainerId} | GET Payment/Containers/{paymentContainerId}
[**paymentContainersIdAssignSecondaryIdDelete**](PaymentContainersApi.md#paymentContainersIdAssignSecondaryIdDelete) | **DELETE** /Payment/Containers/{paymentContainerId}/assign/{secondaryPaymentContainerId} | DELETE Payment/Containers/{paymentContainerId}/assign/{secondaryPaymentContainerId}
[**paymentContainersIdAssignSecondaryIdPost**](PaymentContainersApi.md#paymentContainersIdAssignSecondaryIdPost) | **POST** /Payment/Containers/{paymentContainerId}/assign/{secondaryPaymentContainerId} | POST Payment/Containers/{paymentContainerId}/assign/{secondaryPaymentContainerId}
[**paymentContainersIdDelete**](PaymentContainersApi.md#paymentContainersIdDelete) | **DELETE** /Payment/Containers/{paymentContainerId} | DELETE Payment/Containers/{paymentContainerId}
[**paymentContainersIdPut**](PaymentContainersApi.md#paymentContainersIdPut) | **PUT** /Payment/Containers/{paymentContainerId} | PUT Payment/Containers/{paymentContainerId}
[**paymentContainersPost**](PaymentContainersApi.md#paymentContainersPost) | **POST** /Payment/Containers | POST Payment/Containers


<a name="paymentContainersGet"></a>
# **paymentContainersGet**
> PaymentContainersList paymentContainersGet(count, offset, fields, q, sort)

GET Payment/Containers

Get a list of payment containers

### Example
```java
// Import classes:
//import io.secuconnect.client.ApiClient;
//import io.secuconnect.client.ApiException;
//import io.secuconnect.client.Configuration;
//import io.secuconnect.client.auth.*;
//import io.secuconnect.client.api.PaymentContainersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_token
OAuth oauth_token = (OAuth) defaultClient.getAuthentication("oauth_token");
oauth_token.setAccessToken("YOUR ACCESS TOKEN");

PaymentContainersApi apiInstance = new PaymentContainersApi();
Integer count = 56; // Integer | The number of items to return.
Integer offset = 56; // Integer | The position within the whole result set to start returning items (First element is at 0).
String fields = "fields_example"; // String | List of fields to include in the result. Nested properties can be accessed with this notation: prop1.prop2  Example: prop3,prop1.prop2
String q = "q_example"; // String | A query string to restrict the returned items to given conditions. The query string must consist of any combination of single expressions in the form property:condition.  *                  A condition may contain:  *                      - wildcard \"*\" for any number of characters  *                      - wildcard \"?\" for one character  *                      - ranges in the form [value TO value]  *  *                  Single expressions may combined by 'AND', 'OR', 'NOT' operators and parenthesis '(', ')' for grouping.  *                  Property names can be nested like \"prop1.prop2\".  *                  Example: (NOT customer.name:meier*) AND (customer.age:[30 TO 40] OR customer.age:[50 TO 60])  *                  
String sort = "sort_example"; // String | String with comma separated pairs of field:order (e.g. contact.surname:asc,contact.comapnyname:desc). Result set will be sorted by included fields, in ascending 'asc', or descending 'dsc' order.
try {
    PaymentContainersList result = apiInstance.paymentContainersGet(count, offset, fields, q, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentContainersApi#paymentContainersGet");
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

[**PaymentContainersList**](PaymentContainersList.md)

### Authorization

[oauth_token](../README.md#oauth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="paymentContainersGetById"></a>
# **paymentContainersGetById**
> PaymentContainersProductModel paymentContainersGetById(paymentContainerId)

GET Payment/Containers/{paymentContainerId}

Get all payment containers

### Example
```java
// Import classes:
//import io.secuconnect.client.ApiClient;
//import io.secuconnect.client.ApiException;
//import io.secuconnect.client.Configuration;
//import io.secuconnect.client.auth.*;
//import io.secuconnect.client.api.PaymentContainersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_token
OAuth oauth_token = (OAuth) defaultClient.getAuthentication("oauth_token");
oauth_token.setAccessToken("YOUR ACCESS TOKEN");

PaymentContainersApi apiInstance = new PaymentContainersApi();
String paymentContainerId = "paymentContainerId_example"; // String | Search one by provided id
try {
    PaymentContainersProductModel result = apiInstance.paymentContainersGetById(paymentContainerId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentContainersApi#paymentContainersGetById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **paymentContainerId** | **String**| Search one by provided id | [required]

### Return type

[**PaymentContainersProductModel**](PaymentContainersProductModel.md)

### Authorization

[oauth_token](../README.md#oauth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="paymentContainersIdAssignSecondaryIdDelete"></a>
# **paymentContainersIdAssignSecondaryIdDelete**
> List&lt;PaymentContainersProductModel&gt; paymentContainersIdAssignSecondaryIdDelete(paymentContainerId, secondaryPaymentContainerId)

DELETE Payment/Containers/{paymentContainerId}/assign/{secondaryPaymentContainerId}

Removes an existing payment container assignment

### Example
```java
// Import classes:
//import io.secuconnect.client.ApiClient;
//import io.secuconnect.client.ApiException;
//import io.secuconnect.client.Configuration;
//import io.secuconnect.client.auth.*;
//import io.secuconnect.client.api.PaymentContainersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_token
OAuth oauth_token = (OAuth) defaultClient.getAuthentication("oauth_token");
oauth_token.setAccessToken("YOUR ACCESS TOKEN");

PaymentContainersApi apiInstance = new PaymentContainersApi();
String paymentContainerId = "paymentContainerId_example"; // String | Payment container id
String secondaryPaymentContainerId = "secondaryPaymentContainerId_example"; // String | Id for which container is currently assigned to
try {
    List<PaymentContainersProductModel> result = apiInstance.paymentContainersIdAssignSecondaryIdDelete(paymentContainerId, secondaryPaymentContainerId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentContainersApi#paymentContainersIdAssignSecondaryIdDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **paymentContainerId** | **String**| Payment container id | [required]
 **secondaryPaymentContainerId** | **String**| Id for which container is currently assigned to | [required]

### Return type

[**List&lt;PaymentContainersProductModel&gt;**](PaymentContainersProductModel.md)

### Authorization

[oauth_token](../README.md#oauth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="paymentContainersIdAssignSecondaryIdPost"></a>
# **paymentContainersIdAssignSecondaryIdPost**
> PaymentContainersProductModel paymentContainersIdAssignSecondaryIdPost(paymentContainerId, secondaryPaymentContainerId)

POST Payment/Containers/{paymentContainerId}/assign/{secondaryPaymentContainerId}

Assign an existing payment container to ...

### Example
```java
// Import classes:
//import io.secuconnect.client.ApiClient;
//import io.secuconnect.client.ApiException;
//import io.secuconnect.client.Configuration;
//import io.secuconnect.client.auth.*;
//import io.secuconnect.client.api.PaymentContainersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_token
OAuth oauth_token = (OAuth) defaultClient.getAuthentication("oauth_token");
oauth_token.setAccessToken("YOUR ACCESS TOKEN");

PaymentContainersApi apiInstance = new PaymentContainersApi();
String paymentContainerId = "paymentContainerId_example"; // String | Payment container id
String secondaryPaymentContainerId = "secondaryPaymentContainerId_example"; // String | Id to which container will be assigned
try {
    PaymentContainersProductModel result = apiInstance.paymentContainersIdAssignSecondaryIdPost(paymentContainerId, secondaryPaymentContainerId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentContainersApi#paymentContainersIdAssignSecondaryIdPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **paymentContainerId** | **String**| Payment container id | [required]
 **secondaryPaymentContainerId** | **String**| Id to which container will be assigned | [required]

### Return type

[**PaymentContainersProductModel**](PaymentContainersProductModel.md)

### Authorization

[oauth_token](../README.md#oauth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="paymentContainersIdDelete"></a>
# **paymentContainersIdDelete**
> List&lt;PaymentContainersProductModel&gt; paymentContainersIdDelete(paymentContainerId)

DELETE Payment/Containers/{paymentContainerId}

Delete payment container

### Example
```java
// Import classes:
//import io.secuconnect.client.ApiClient;
//import io.secuconnect.client.ApiException;
//import io.secuconnect.client.Configuration;
//import io.secuconnect.client.auth.*;
//import io.secuconnect.client.api.PaymentContainersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_token
OAuth oauth_token = (OAuth) defaultClient.getAuthentication("oauth_token");
oauth_token.setAccessToken("YOUR ACCESS TOKEN");

PaymentContainersApi apiInstance = new PaymentContainersApi();
String paymentContainerId = "paymentContainerId_example"; // String | Payment container id
try {
    List<PaymentContainersProductModel> result = apiInstance.paymentContainersIdDelete(paymentContainerId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentContainersApi#paymentContainersIdDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **paymentContainerId** | **String**| Payment container id | [required]

### Return type

[**List&lt;PaymentContainersProductModel&gt;**](PaymentContainersProductModel.md)

### Authorization

[oauth_token](../README.md#oauth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="paymentContainersIdPut"></a>
# **paymentContainersIdPut**
> PaymentContainersProductModel paymentContainersIdPut(paymentContainerId, body)

PUT Payment/Containers/{paymentContainerId}

Update payment container

### Example
```java
// Import classes:
//import io.secuconnect.client.ApiClient;
//import io.secuconnect.client.ApiException;
//import io.secuconnect.client.Configuration;
//import io.secuconnect.client.auth.*;
//import io.secuconnect.client.api.PaymentContainersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_token
OAuth oauth_token = (OAuth) defaultClient.getAuthentication("oauth_token");
oauth_token.setAccessToken("YOUR ACCESS TOKEN");

PaymentContainersApi apiInstance = new PaymentContainersApi();
String paymentContainerId = "paymentContainerId_example"; // String | Payment container id
PaymentContainersDTO body = new PaymentContainersDTO(); // PaymentContainersDTO | Payment container properties
try {
    PaymentContainersProductModel result = apiInstance.paymentContainersIdPut(paymentContainerId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentContainersApi#paymentContainersIdPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **paymentContainerId** | **String**| Payment container id | [required]
 **body** | [**PaymentContainersDTO**](PaymentContainersDTO.md)| Payment container properties | [required]

### Return type

[**PaymentContainersProductModel**](PaymentContainersProductModel.md)

### Authorization

[oauth_token](../README.md#oauth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="paymentContainersPost"></a>
# **paymentContainersPost**
> PaymentContainersProductModel paymentContainersPost(body)

POST Payment/Containers

Add new containers

### Example
```java
// Import classes:
//import io.secuconnect.client.ApiClient;
//import io.secuconnect.client.ApiException;
//import io.secuconnect.client.Configuration;
//import io.secuconnect.client.auth.*;
//import io.secuconnect.client.api.PaymentContainersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_token
OAuth oauth_token = (OAuth) defaultClient.getAuthentication("oauth_token");
oauth_token.setAccessToken("YOUR ACCESS TOKEN");

PaymentContainersApi apiInstance = new PaymentContainersApi();
PaymentContainersDTO body = new PaymentContainersDTO(); // PaymentContainersDTO | Payment container properties
try {
    PaymentContainersProductModel result = apiInstance.paymentContainersPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentContainersApi#paymentContainersPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PaymentContainersDTO**](PaymentContainersDTO.md)| Payment container properties | [required]

### Return type

[**PaymentContainersProductModel**](PaymentContainersProductModel.md)

### Authorization

[oauth_token](../README.md#oauth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


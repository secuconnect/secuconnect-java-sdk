# PaymentContainersApi

All URIs are relative to *https://connect-testing.secupay-ag.de/api/v2/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**paymentContainersGet**](PaymentContainersApi.md#paymentContainersGet) | **GET** Payment/Containers | GET Payment/Containers
[**paymentContainersGetById**](PaymentContainersApi.md#paymentContainersGetById) | **GET** Payment/Containers/{id} | GET Payment/Containers/{id}
[**paymentContainersIdAssignSecondaryIdDelete**](PaymentContainersApi.md#paymentContainersIdAssignSecondaryIdDelete) | **DELETE** Payment/Containers/{id}/assign/{secondary-id} | DELETE Payment/Containers/{id}/assign/{secondary-id}
[**paymentContainersIdAssignSecondaryIdPost**](PaymentContainersApi.md#paymentContainersIdAssignSecondaryIdPost) | **POST** Payment/Containers/{id}/assign/{secondary-id} | POST Payment/Containers/{id}/assign/{secondary-id}
[**paymentContainersIdDelete**](PaymentContainersApi.md#paymentContainersIdDelete) | **DELETE** Payment/Containers/{id} | DELETE Payment/Containers/{id}
[**paymentContainersIdPut**](PaymentContainersApi.md#paymentContainersIdPut) | **PUT** Payment/Containers/{id} | PUT Payment/Containers/{id}
[**paymentContainersPost**](PaymentContainersApi.md#paymentContainersPost) | **POST** Payment/Containers | POST Payment/Containers


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
 **count** | **Integer**| The number of items to return. | [optional]
 **offset** | **Integer**| The position within the whole result set to start returning items (First element is at 0). | [optional]
 **fields** | **String**| List of fields to include in the result. Nested properties can be accessed with this notation: prop1.prop2  Example: prop3,prop1.prop2 | [optional]
 **q** | **String**| A query string to restrict the returned items to given conditions. The query string must consist of any combination of single expressions in the form property:condition.  *                  A condition may contain:  *                      - wildcard \&quot;*\&quot; for any number of characters  *                      - wildcard \&quot;?\&quot; for one character  *                      - ranges in the form [value TO value]  *  *                  Single expressions may combined by &#39;AND&#39;, &#39;OR&#39;, &#39;NOT&#39; operators and parenthesis &#39;(&#39;, &#39;)&#39; for grouping.  *                  Property names can be nested like \&quot;prop1.prop2\&quot;.  *                  Example: (NOT customer.name:meier*) AND (customer.age:[30 TO 40] OR customer.age:[50 TO 60])  *                   | [optional]
 **sort** | **String**| String with comma separated pairs of field:order (e.g. contact.surname:asc,contact.comapnyname:desc). Result set will be sorted by included fields, in ascending &#39;asc&#39;, or descending &#39;dsc&#39; order. | [optional]

### Return type

[**PaymentContainersList**](PaymentContainersList.md)

### Authorization

[oauth_token](../README.md#oauth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="paymentContainersGetById"></a>
# **paymentContainersGetById**
> PaymentContainersProductModel paymentContainersGetById(id)

GET Payment/Containers/{id}

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
String id = "id_example"; // String | Search one by provided id
try {
    PaymentContainersProductModel result = apiInstance.paymentContainersGetById(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentContainersApi#paymentContainersGetById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Search one by provided id |

### Return type

[**PaymentContainersProductModel**](PaymentContainersProductModel.md)

### Authorization

[oauth_token](../README.md#oauth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="paymentContainersIdAssignSecondaryIdDelete"></a>
# **paymentContainersIdAssignSecondaryIdDelete**
> List&lt;PaymentContainersProductModel&gt; paymentContainersIdAssignSecondaryIdDelete(id, secondaryId)

DELETE Payment/Containers/{id}/assign/{secondary-id}

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
String id = "id_example"; // String | Payment container id
String secondaryId = "secondaryId_example"; // String | Id for which container is currently assigned to
try {
    List<PaymentContainersProductModel> result = apiInstance.paymentContainersIdAssignSecondaryIdDelete(id, secondaryId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentContainersApi#paymentContainersIdAssignSecondaryIdDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Payment container id |
 **secondaryId** | **String**| Id for which container is currently assigned to |

### Return type

[**List&lt;PaymentContainersProductModel&gt;**](PaymentContainersProductModel.md)

### Authorization

[oauth_token](../README.md#oauth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="paymentContainersIdAssignSecondaryIdPost"></a>
# **paymentContainersIdAssignSecondaryIdPost**
> PaymentContainersProductModel paymentContainersIdAssignSecondaryIdPost(id, secondaryId)

POST Payment/Containers/{id}/assign/{secondary-id}

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
String id = "id_example"; // String | Payment container id
String secondaryId = "secondaryId_example"; // String | Id to which container will be assigned
try {
    PaymentContainersProductModel result = apiInstance.paymentContainersIdAssignSecondaryIdPost(id, secondaryId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentContainersApi#paymentContainersIdAssignSecondaryIdPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Payment container id |
 **secondaryId** | **String**| Id to which container will be assigned |

### Return type

[**PaymentContainersProductModel**](PaymentContainersProductModel.md)

### Authorization

[oauth_token](../README.md#oauth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="paymentContainersIdDelete"></a>
# **paymentContainersIdDelete**
> List&lt;PaymentContainersProductModel&gt; paymentContainersIdDelete(id)

DELETE Payment/Containers/{id}

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
String id = "id_example"; // String | Payment container id
try {
    List<PaymentContainersProductModel> result = apiInstance.paymentContainersIdDelete(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentContainersApi#paymentContainersIdDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Payment container id |

### Return type

[**List&lt;PaymentContainersProductModel&gt;**](PaymentContainersProductModel.md)

### Authorization

[oauth_token](../README.md#oauth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="paymentContainersIdPut"></a>
# **paymentContainersIdPut**
> PaymentContainersProductModel paymentContainersIdPut(id, body)

PUT Payment/Containers/{id}

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
String id = "id_example"; // String | Payment container id
PaymentContainersDTO body = new PaymentContainersDTO(); // PaymentContainersDTO | Payment container properties
try {
    PaymentContainersProductModel result = apiInstance.paymentContainersIdPut(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentContainersApi#paymentContainersIdPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Payment container id |
 **body** | [**PaymentContainersDTO**](PaymentContainersDTO.md)| Payment container properties |

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
 **body** | [**PaymentContainersDTO**](PaymentContainersDTO.md)| Payment container properties |

### Return type

[**PaymentContainersProductModel**](PaymentContainersProductModel.md)

### Authorization

[oauth_token](../README.md#oauth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


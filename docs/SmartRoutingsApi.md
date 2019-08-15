# SmartRoutingsApi

All URIs are relative to *https://connect-testing.secupay-ag.de/api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addRouting**](SmartRoutingsApi.md#addRouting) | **POST** /Smart/Routings | POST Smart/Routings
[**assignDeviceToRouting**](SmartRoutingsApi.md#assignDeviceToRouting) | **POST** /Smart/Routings/{smartRoutingId}/assign/{smartDeviceId} | POST Smart/Routings/{smartRoutingId}/assign/{smartDeviceId}
[**getAll**](SmartRoutingsApi.md#getAll) | **GET** /Smart/Routings | GET Smart/Routings
[**getOne**](SmartRoutingsApi.md#getOne) | **GET** /Smart/Routings/{smartRoutingId} | GET Smart/Routings/{smartRoutingId}
[**removeRouting**](SmartRoutingsApi.md#removeRouting) | **DELETE** /Smart/Routings/{smartRoutingId} | DELETE Smart/Routings/{smartRoutingId}
[**removeSmartRoutingAssignment**](SmartRoutingsApi.md#removeSmartRoutingAssignment) | **DELETE** /Smart/Routings/{smartRoutingId}/assign/{smartDeviceId} | DELETE Smart/Routings/{smartRoutingId}/assign/{smartDeviceId}
[**updateRouting**](SmartRoutingsApi.md#updateRouting) | **PUT** /Smart/Routings/{smartRoutingId} | PUT Smart/Routings/{smartRoutingId}


<a name="addRouting"></a>
# **addRouting**
> SmartRoutingsProductModel addRouting(smartRoutingProperties)

POST Smart/Routings

Create new smart routing

### Example
```java
// Import classes:
//import io.secuconnect.client.ApiClient;
//import io.secuconnect.client.ApiException;
//import io.secuconnect.client.Configuration;
//import io.secuconnect.client.auth.*;
//import io.secuconnect.client.api.SmartRoutingsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_token
OAuth oauth_token = (OAuth) defaultClient.getAuthentication("oauth_token");
oauth_token.setAccessToken("YOUR ACCESS TOKEN");

SmartRoutingsApi apiInstance = new SmartRoutingsApi();
SmartRoutingsDTO smartRoutingProperties = new SmartRoutingsDTO(); // SmartRoutingsDTO | Smart routing properties
try {
    SmartRoutingsProductModel result = apiInstance.addRouting(smartRoutingProperties);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SmartRoutingsApi#addRouting");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **smartRoutingProperties** | [**SmartRoutingsDTO**](SmartRoutingsDTO.md)| Smart routing properties | [required]

### Return type

[**SmartRoutingsProductModel**](SmartRoutingsProductModel.md)

### Authorization

[oauth_token](../README.md#oauth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="assignDeviceToRouting"></a>
# **assignDeviceToRouting**
> SmartRoutingsProductModel assignDeviceToRouting(smartRoutingId, smartDeviceId, smartRoutingAssignmentProperties)

POST Smart/Routings/{smartRoutingId}/assign/{smartDeviceId}

Assign the specific smart device to the specific smart routing

### Example
```java
// Import classes:
//import io.secuconnect.client.ApiClient;
//import io.secuconnect.client.ApiException;
//import io.secuconnect.client.Configuration;
//import io.secuconnect.client.auth.*;
//import io.secuconnect.client.api.SmartRoutingsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_token
OAuth oauth_token = (OAuth) defaultClient.getAuthentication("oauth_token");
oauth_token.setAccessToken("YOUR ACCESS TOKEN");

SmartRoutingsApi apiInstance = new SmartRoutingsApi();
String smartRoutingId = "smartRoutingId_example"; // String | Smart routing id
String smartDeviceId = "smartDeviceId_example"; // String | Smart device id
SmartRoutingPriority smartRoutingAssignmentProperties = new SmartRoutingPriority(); // SmartRoutingPriority | Smart routing assignment properties
try {
    SmartRoutingsProductModel result = apiInstance.assignDeviceToRouting(smartRoutingId, smartDeviceId, smartRoutingAssignmentProperties);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SmartRoutingsApi#assignDeviceToRouting");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **smartRoutingId** | **String**| Smart routing id | [required]
 **smartDeviceId** | **String**| Smart device id | [required]
 **smartRoutingAssignmentProperties** | [**SmartRoutingPriority**](SmartRoutingPriority.md)| Smart routing assignment properties |

### Return type

[**SmartRoutingsProductModel**](SmartRoutingsProductModel.md)

### Authorization

[oauth_token](../README.md#oauth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getAll"></a>
# **getAll**
> SmartRoutingsList getAll(count, offset, fields, q, sort)

GET Smart/Routings

Get a list of smart routings

### Example
```java
// Import classes:
//import io.secuconnect.client.ApiClient;
//import io.secuconnect.client.ApiException;
//import io.secuconnect.client.Configuration;
//import io.secuconnect.client.auth.*;
//import io.secuconnect.client.api.SmartRoutingsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_token
OAuth oauth_token = (OAuth) defaultClient.getAuthentication("oauth_token");
oauth_token.setAccessToken("YOUR ACCESS TOKEN");

SmartRoutingsApi apiInstance = new SmartRoutingsApi();
Integer count = 56; // Integer | The number of items to return.
Integer offset = 56; // Integer | The position within the whole result set to start returning items (First element is at 0).
String fields = "fields_example"; // String | List of fields to include in the result. Nested properties can be accessed with this notation: prop1.prop2  Example: prop3,prop1.prop2
String q = "q_example"; // String | A query string to restrict the returned items to given conditions. The query string must consist of any combination of single expressions in the form property:condition.  *                  A condition may contain:  *                      - wildcard \"*\" for any number of characters  *                      - wildcard \"?\" for one character  *                      - ranges in the form [value TO value]  *  *                  Single expressions may combined by 'AND', 'OR', 'NOT' operators and parenthesis '(', ')' for grouping.  *                  Property names can be nested like \"prop1.prop2\".  *                  Example: (NOT customer.name:meier*) AND (customer.age:[30 TO 40] OR customer.age:[50 TO 60])  *                  
String sort = "sort_example"; // String | String with comma separated pairs of field:order (e.g. contact.surname:asc,contact.comapnyname:desc). Result set will be sorted by included fields, in ascending 'asc', or descending 'dsc' order.
try {
    SmartRoutingsList result = apiInstance.getAll(count, offset, fields, q, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SmartRoutingsApi#getAll");
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

[**SmartRoutingsList**](SmartRoutingsList.md)

### Authorization

[oauth_token](../README.md#oauth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getOne"></a>
# **getOne**
> SmartRoutingsProductModel getOne(smartRoutingId)

GET Smart/Routings/{smartRoutingId}

Get one smart routing for a specific id

### Example
```java
// Import classes:
//import io.secuconnect.client.ApiClient;
//import io.secuconnect.client.ApiException;
//import io.secuconnect.client.Configuration;
//import io.secuconnect.client.auth.*;
//import io.secuconnect.client.api.SmartRoutingsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_token
OAuth oauth_token = (OAuth) defaultClient.getAuthentication("oauth_token");
oauth_token.setAccessToken("YOUR ACCESS TOKEN");

SmartRoutingsApi apiInstance = new SmartRoutingsApi();
String smartRoutingId = "smartRoutingId_example"; // String | Smart routing id
try {
    SmartRoutingsProductModel result = apiInstance.getOne(smartRoutingId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SmartRoutingsApi#getOne");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **smartRoutingId** | **String**| Smart routing id | [required]

### Return type

[**SmartRoutingsProductModel**](SmartRoutingsProductModel.md)

### Authorization

[oauth_token](../README.md#oauth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="removeRouting"></a>
# **removeRouting**
> List&lt;SmartRoutingsProductModel&gt; removeRouting(smartRoutingId)

DELETE Smart/Routings/{smartRoutingId}

Remove specific smart roting

### Example
```java
// Import classes:
//import io.secuconnect.client.ApiClient;
//import io.secuconnect.client.ApiException;
//import io.secuconnect.client.Configuration;
//import io.secuconnect.client.auth.*;
//import io.secuconnect.client.api.SmartRoutingsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_token
OAuth oauth_token = (OAuth) defaultClient.getAuthentication("oauth_token");
oauth_token.setAccessToken("YOUR ACCESS TOKEN");

SmartRoutingsApi apiInstance = new SmartRoutingsApi();
String smartRoutingId = "smartRoutingId_example"; // String | Smart routing id
try {
    List<SmartRoutingsProductModel> result = apiInstance.removeRouting(smartRoutingId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SmartRoutingsApi#removeRouting");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **smartRoutingId** | **String**| Smart routing id | [required]

### Return type

[**List&lt;SmartRoutingsProductModel&gt;**](SmartRoutingsProductModel.md)

### Authorization

[oauth_token](../README.md#oauth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="removeSmartRoutingAssignment"></a>
# **removeSmartRoutingAssignment**
> SmartRoutingsProductModel removeSmartRoutingAssignment(smartRoutingId, smartDeviceId)

DELETE Smart/Routings/{smartRoutingId}/assign/{smartDeviceId}

Remove smart routing assignment

### Example
```java
// Import classes:
//import io.secuconnect.client.ApiClient;
//import io.secuconnect.client.ApiException;
//import io.secuconnect.client.Configuration;
//import io.secuconnect.client.auth.*;
//import io.secuconnect.client.api.SmartRoutingsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_token
OAuth oauth_token = (OAuth) defaultClient.getAuthentication("oauth_token");
oauth_token.setAccessToken("YOUR ACCESS TOKEN");

SmartRoutingsApi apiInstance = new SmartRoutingsApi();
String smartRoutingId = "smartRoutingId_example"; // String | Smart routing id
String smartDeviceId = "smartDeviceId_example"; // String | Smart device id
try {
    SmartRoutingsProductModel result = apiInstance.removeSmartRoutingAssignment(smartRoutingId, smartDeviceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SmartRoutingsApi#removeSmartRoutingAssignment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **smartRoutingId** | **String**| Smart routing id | [required]
 **smartDeviceId** | **String**| Smart device id | [required]

### Return type

[**SmartRoutingsProductModel**](SmartRoutingsProductModel.md)

### Authorization

[oauth_token](../README.md#oauth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="updateRouting"></a>
# **updateRouting**
> SmartRoutingsProductModel updateRouting(smartRoutingId, smartRoutingProperties)

PUT Smart/Routings/{smartRoutingId}

Update specific smart routing

### Example
```java
// Import classes:
//import io.secuconnect.client.ApiClient;
//import io.secuconnect.client.ApiException;
//import io.secuconnect.client.Configuration;
//import io.secuconnect.client.auth.*;
//import io.secuconnect.client.api.SmartRoutingsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_token
OAuth oauth_token = (OAuth) defaultClient.getAuthentication("oauth_token");
oauth_token.setAccessToken("YOUR ACCESS TOKEN");

SmartRoutingsApi apiInstance = new SmartRoutingsApi();
String smartRoutingId = "smartRoutingId_example"; // String | Smart routing id
SmartRoutingsDTO smartRoutingProperties = new SmartRoutingsDTO(); // SmartRoutingsDTO | Smart routing properties
try {
    SmartRoutingsProductModel result = apiInstance.updateRouting(smartRoutingId, smartRoutingProperties);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SmartRoutingsApi#updateRouting");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **smartRoutingId** | **String**| Smart routing id | [required]
 **smartRoutingProperties** | [**SmartRoutingsDTO**](SmartRoutingsDTO.md)| Smart routing properties | [required]

### Return type

[**SmartRoutingsProductModel**](SmartRoutingsProductModel.md)

### Authorization

[oauth_token](../README.md#oauth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


# GeneralStoresApi

All URIs are relative to *https://connect-testing.secupay-ag.de/api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addStore**](GeneralStoresApi.md#addStore) | **POST** /General/Stores | POST General/Stores
[**assignGoogleKey**](GeneralStoresApi.md#assignGoogleKey) | **POST** /General/Stores/{generalStoreId}/assign/{googleKey} | POST General/Stores/{generalStoreId}/assign/{googleKey}
[**checkIn**](GeneralStoresApi.md#checkIn) | **POST** /General/Stores/{generalStoreId}/checkin | POST General/Stores/{generalStoreId}/checkin
[**getAll**](GeneralStoresApi.md#getAll) | **GET** /General/Stores | GET General/Stores
[**getOne**](GeneralStoresApi.md#getOne) | **GET** /General/Stores/{generalStoreId} | GET General/Stores/{generalStoreId}
[**setDefault**](GeneralStoresApi.md#setDefault) | **POST** /General/Stores/{generalStoreId}/setDefault | POST General/Stores/{generalStoreId}/setDefault
[**updateStore**](GeneralStoresApi.md#updateStore) | **PUT** /General/Stores/{generalStoreId} | PUT General/Stores/{generalStoreId}


<a name="addStore"></a>
# **addStore**
> GeneralStoresProductModel addStore(body)

POST General/Stores

Create general store

### Example
```java
// Import classes:
//import io.secuconnect.client.ApiClient;
//import io.secuconnect.client.ApiException;
//import io.secuconnect.client.Configuration;
//import io.secuconnect.client.auth.*;
//import io.secuconnect.client.api.GeneralStoresApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_token
OAuth oauth_token = (OAuth) defaultClient.getAuthentication("oauth_token");
oauth_token.setAccessToken("YOUR ACCESS TOKEN");

GeneralStoresApi apiInstance = new GeneralStoresApi();
GeneralStoresDTO body = new GeneralStoresDTO(); // GeneralStoresDTO | General store properties
try {
    GeneralStoresProductModel result = apiInstance.addStore(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GeneralStoresApi#addStore");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**GeneralStoresDTO**](GeneralStoresDTO.md)| General store properties | [required]

### Return type

[**GeneralStoresProductModel**](GeneralStoresProductModel.md)

### Authorization

[oauth_token](../README.md#oauth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="assignGoogleKey"></a>
# **assignGoogleKey**
> Object assignGoogleKey(generalStoreId, googleKey)

POST General/Stores/{generalStoreId}/assign/{googleKey}

Assign some object to general store

### Example
```java
// Import classes:
//import io.secuconnect.client.ApiClient;
//import io.secuconnect.client.ApiException;
//import io.secuconnect.client.Configuration;
//import io.secuconnect.client.auth.*;
//import io.secuconnect.client.api.GeneralStoresApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_token
OAuth oauth_token = (OAuth) defaultClient.getAuthentication("oauth_token");
oauth_token.setAccessToken("YOUR ACCESS TOKEN");

GeneralStoresApi apiInstance = new GeneralStoresApi();
String generalStoreId = "generalStoreId_example"; // String | General store id
String googleKey = "googleKey_example"; // String | Google key
try {
    Object result = apiInstance.assignGoogleKey(generalStoreId, googleKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GeneralStoresApi#assignGoogleKey");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **generalStoreId** | **String**| General store id | [required]
 **googleKey** | **String**| Google key | [required]

### Return type

**Object**

### Authorization

[oauth_token](../README.md#oauth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="checkIn"></a>
# **checkIn**
> Object checkIn(generalStoreId, body)

POST General/Stores/{generalStoreId}/checkin

Check in

### Example
```java
// Import classes:
//import io.secuconnect.client.ApiClient;
//import io.secuconnect.client.ApiException;
//import io.secuconnect.client.Configuration;
//import io.secuconnect.client.auth.*;
//import io.secuconnect.client.api.GeneralStoresApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_token
OAuth oauth_token = (OAuth) defaultClient.getAuthentication("oauth_token");
oauth_token.setAccessToken("YOUR ACCESS TOKEN");

GeneralStoresApi apiInstance = new GeneralStoresApi();
String generalStoreId = "generalStoreId_example"; // String | General store id
GeneralStoresDTOType body = new GeneralStoresDTOType(); // GeneralStoresDTOType | Type
try {
    Object result = apiInstance.checkIn(generalStoreId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GeneralStoresApi#checkIn");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **generalStoreId** | **String**| General store id | [required]
 **body** | [**GeneralStoresDTOType**](GeneralStoresDTOType.md)| Type | [required]

### Return type

**Object**

### Authorization

[oauth_token](../README.md#oauth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getAll"></a>
# **getAll**
> GeneralStoresList getAll(count, offset, fields, q, sort)

GET General/Stores

Get a list of general stores

### Example
```java
// Import classes:
//import io.secuconnect.client.ApiClient;
//import io.secuconnect.client.ApiException;
//import io.secuconnect.client.Configuration;
//import io.secuconnect.client.auth.*;
//import io.secuconnect.client.api.GeneralStoresApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_token
OAuth oauth_token = (OAuth) defaultClient.getAuthentication("oauth_token");
oauth_token.setAccessToken("YOUR ACCESS TOKEN");

GeneralStoresApi apiInstance = new GeneralStoresApi();
Integer count = 56; // Integer | The number of items to return.
Integer offset = 56; // Integer | The position within the whole result set to start returning items (First element is at 0).
String fields = "fields_example"; // String | List of fields to include in the result. Nested properties can be accessed with this notation: prop1.prop2  Example: prop3,prop1.prop2
String q = "q_example"; // String | A query string to restrict the returned items to given conditions. The query string must consist of any combination of single expressions in the form property:condition.  *                  A condition may contain:  *                      - wildcard \"*\" for any number of characters  *                      - wildcard \"?\" for one character  *                      - ranges in the form [value TO value]  *  *                  Single expressions may combined by 'AND', 'OR', 'NOT' operators and parenthesis '(', ')' for grouping.  *                  Property names can be nested like \"prop1.prop2\".  *                  Example: (NOT customer.name:meier*) AND (customer.age:[30 TO 40] OR customer.age:[50 TO 60])  *                  
String sort = "sort_example"; // String | String with comma separated pairs of field:order (e.g. contact.surname:asc,contact.comapnyname:desc). Result set will be sorted by included fields, in ascending 'asc', or descending 'dsc' order.
try {
    GeneralStoresList result = apiInstance.getAll(count, offset, fields, q, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GeneralStoresApi#getAll");
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

[**GeneralStoresList**](GeneralStoresList.md)

### Authorization

[oauth_token](../README.md#oauth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getOne"></a>
# **getOne**
> GeneralStoresProductModel getOne(generalStoreId)

GET General/Stores/{generalStoreId}

Get one general store for a specific id

### Example
```java
// Import classes:
//import io.secuconnect.client.ApiClient;
//import io.secuconnect.client.ApiException;
//import io.secuconnect.client.Configuration;
//import io.secuconnect.client.auth.*;
//import io.secuconnect.client.api.GeneralStoresApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_token
OAuth oauth_token = (OAuth) defaultClient.getAuthentication("oauth_token");
oauth_token.setAccessToken("YOUR ACCESS TOKEN");

GeneralStoresApi apiInstance = new GeneralStoresApi();
String generalStoreId = "generalStoreId_example"; // String | General store id
try {
    GeneralStoresProductModel result = apiInstance.getOne(generalStoreId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GeneralStoresApi#getOne");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **generalStoreId** | **String**| General store id | [required]

### Return type

[**GeneralStoresProductModel**](GeneralStoresProductModel.md)

### Authorization

[oauth_token](../README.md#oauth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="setDefault"></a>
# **setDefault**
> Object setDefault(generalStoreId, body)

POST General/Stores/{generalStoreId}/setDefault

Set default flag on general store

### Example
```java
// Import classes:
//import io.secuconnect.client.ApiClient;
//import io.secuconnect.client.ApiException;
//import io.secuconnect.client.Configuration;
//import io.secuconnect.client.auth.*;
//import io.secuconnect.client.api.GeneralStoresApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_token
OAuth oauth_token = (OAuth) defaultClient.getAuthentication("oauth_token");
oauth_token.setAccessToken("YOUR ACCESS TOKEN");

GeneralStoresApi apiInstance = new GeneralStoresApi();
String generalStoreId = "generalStoreId_example"; // String | General store id
GeneralStoresDTOReason body = new GeneralStoresDTOReason(); // GeneralStoresDTOReason | Reason
try {
    Object result = apiInstance.setDefault(generalStoreId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GeneralStoresApi#setDefault");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **generalStoreId** | **String**| General store id | [required]
 **body** | [**GeneralStoresDTOReason**](GeneralStoresDTOReason.md)| Reason |

### Return type

**Object**

### Authorization

[oauth_token](../README.md#oauth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="updateStore"></a>
# **updateStore**
> GeneralStoresProductModel updateStore(generalStoreId, body)

PUT General/Stores/{generalStoreId}

Update general store

### Example
```java
// Import classes:
//import io.secuconnect.client.ApiClient;
//import io.secuconnect.client.ApiException;
//import io.secuconnect.client.Configuration;
//import io.secuconnect.client.auth.*;
//import io.secuconnect.client.api.GeneralStoresApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_token
OAuth oauth_token = (OAuth) defaultClient.getAuthentication("oauth_token");
oauth_token.setAccessToken("YOUR ACCESS TOKEN");

GeneralStoresApi apiInstance = new GeneralStoresApi();
String generalStoreId = "generalStoreId_example"; // String | General store id
GeneralStoresDTO body = new GeneralStoresDTO(); // GeneralStoresDTO | General store properties
try {
    GeneralStoresProductModel result = apiInstance.updateStore(generalStoreId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GeneralStoresApi#updateStore");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **generalStoreId** | **String**| General store id | [required]
 **body** | [**GeneralStoresDTO**](GeneralStoresDTO.md)| General store properties | [required]

### Return type

[**GeneralStoresProductModel**](GeneralStoresProductModel.md)

### Authorization

[oauth_token](../README.md#oauth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


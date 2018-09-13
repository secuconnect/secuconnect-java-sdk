# LoyaltyStoregroupsApi

All URIs are relative to *https://connect-testing.secupay-ag.de/api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addStoreGroup**](LoyaltyStoregroupsApi.md#addStoreGroup) | **POST** /Loyalty/Storegroups | POST Loyalty/Storegroups
[**getAll**](LoyaltyStoregroupsApi.md#getAll) | **GET** /Loyalty/StoreGroups | GET Loyalty/StoreGroups
[**getOne**](LoyaltyStoregroupsApi.md#getOne) | **GET** /Loyalty/StoreGroups/{loyaltyStoreGroupId} | GET Loyalty/StoreGroups/{loyaltyStoreGroupId}
[**removeStoreGroup**](LoyaltyStoregroupsApi.md#removeStoreGroup) | **DELETE** /Loyalty/StoreGroups/{loyaltyStoreGroupId} | DELETE Loyalty/StoreGroups/{loyaltyStoreGroupId}
[**updateStoreGroup**](LoyaltyStoregroupsApi.md#updateStoreGroup) | **PUT** /Loyalty/StoreGroups/{loyaltyStoreGroupId} | PUT Loyalty/StoreGroups/{loyaltyStoreGroupId}


<a name="addStoreGroup"></a>
# **addStoreGroup**
> LoyaltyStoregroupsProductModel addStoreGroup(body)

POST Loyalty/Storegroups

Add new loyalty store group

### Example
```java
// Import classes:
//import io.secuconnect.client.ApiClient;
//import io.secuconnect.client.ApiException;
//import io.secuconnect.client.Configuration;
//import io.secuconnect.client.auth.*;
//import io.secuconnect.client.api.LoyaltyStoregroupsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_token
OAuth oauth_token = (OAuth) defaultClient.getAuthentication("oauth_token");
oauth_token.setAccessToken("YOUR ACCESS TOKEN");

LoyaltyStoregroupsApi apiInstance = new LoyaltyStoregroupsApi();
LoyaltyStoregroupsDTO body = new LoyaltyStoregroupsDTO(); // LoyaltyStoregroupsDTO | Loyalty store group properties
try {
    LoyaltyStoregroupsProductModel result = apiInstance.addStoreGroup(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LoyaltyStoregroupsApi#addStoreGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**LoyaltyStoregroupsDTO**](LoyaltyStoregroupsDTO.md)| Loyalty store group properties | [required]

### Return type

[**LoyaltyStoregroupsProductModel**](LoyaltyStoregroupsProductModel.md)

### Authorization

[oauth_token](../README.md#oauth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getAll"></a>
# **getAll**
> LoyaltyStoregroupsList getAll(count, offset, fields, q, sort)

GET Loyalty/StoreGroups

Get a list of loyalty store groups

### Example
```java
// Import classes:
//import io.secuconnect.client.ApiClient;
//import io.secuconnect.client.ApiException;
//import io.secuconnect.client.Configuration;
//import io.secuconnect.client.auth.*;
//import io.secuconnect.client.api.LoyaltyStoregroupsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_token
OAuth oauth_token = (OAuth) defaultClient.getAuthentication("oauth_token");
oauth_token.setAccessToken("YOUR ACCESS TOKEN");

LoyaltyStoregroupsApi apiInstance = new LoyaltyStoregroupsApi();
Integer count = 56; // Integer | The number of items to return.
Integer offset = 56; // Integer | The position within the whole result set to start returning items (First element is at 0).
String fields = "fields_example"; // String | List of fields to include in the result. Nested properties can be accessed with this notation: prop1.prop2  Example: prop3,prop1.prop2
String q = "q_example"; // String | A query string to restrict the returned items to given conditions. The query string must consist of any combination of single expressions in the form property:condition.  *                  A condition may contain:  *                      - wildcard \"*\" for any number of characters  *                      - wildcard \"?\" for one character  *                      - ranges in the form [value TO value]  *  *                  Single expressions may combined by 'AND', 'OR', 'NOT' operators and parenthesis '(', ')' for grouping.  *                  Property names can be nested like \"prop1.prop2\".  *                  Example: (NOT customer.name:meier*) AND (customer.age:[30 TO 40] OR customer.age:[50 TO 60])  *                  
String sort = "sort_example"; // String | String with comma separated pairs of field:order (e.g. contact.surname:asc,contact.comapnyname:desc). Result set will be sorted by included fields, in ascending 'asc', or descending 'dsc' order.
try {
    LoyaltyStoregroupsList result = apiInstance.getAll(count, offset, fields, q, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LoyaltyStoregroupsApi#getAll");
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

[**LoyaltyStoregroupsList**](LoyaltyStoregroupsList.md)

### Authorization

[oauth_token](../README.md#oauth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getOne"></a>
# **getOne**
> LoyaltyStoregroupsProductModel getOne(loyaltyStoreGroupId)

GET Loyalty/StoreGroups/{loyaltyStoreGroupId}

Get loyalty store group for a specific id

### Example
```java
// Import classes:
//import io.secuconnect.client.ApiClient;
//import io.secuconnect.client.ApiException;
//import io.secuconnect.client.Configuration;
//import io.secuconnect.client.auth.*;
//import io.secuconnect.client.api.LoyaltyStoregroupsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_token
OAuth oauth_token = (OAuth) defaultClient.getAuthentication("oauth_token");
oauth_token.setAccessToken("YOUR ACCESS TOKEN");

LoyaltyStoregroupsApi apiInstance = new LoyaltyStoregroupsApi();
String loyaltyStoreGroupId = "loyaltyStoreGroupId_example"; // String | loyalty store group id
try {
    LoyaltyStoregroupsProductModel result = apiInstance.getOne(loyaltyStoreGroupId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LoyaltyStoregroupsApi#getOne");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **loyaltyStoreGroupId** | **String**| loyalty store group id | [required]

### Return type

[**LoyaltyStoregroupsProductModel**](LoyaltyStoregroupsProductModel.md)

### Authorization

[oauth_token](../README.md#oauth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="removeStoreGroup"></a>
# **removeStoreGroup**
> List&lt;LoyaltyStoregroupsProductModel&gt; removeStoreGroup(loyaltyStoreGroupId)

DELETE Loyalty/StoreGroups/{loyaltyStoreGroupId}

Remove loyalty store group

### Example
```java
// Import classes:
//import io.secuconnect.client.ApiClient;
//import io.secuconnect.client.ApiException;
//import io.secuconnect.client.Configuration;
//import io.secuconnect.client.auth.*;
//import io.secuconnect.client.api.LoyaltyStoregroupsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_token
OAuth oauth_token = (OAuth) defaultClient.getAuthentication("oauth_token");
oauth_token.setAccessToken("YOUR ACCESS TOKEN");

LoyaltyStoregroupsApi apiInstance = new LoyaltyStoregroupsApi();
String loyaltyStoreGroupId = "loyaltyStoreGroupId_example"; // String | Loyalty store group id
try {
    List<LoyaltyStoregroupsProductModel> result = apiInstance.removeStoreGroup(loyaltyStoreGroupId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LoyaltyStoregroupsApi#removeStoreGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **loyaltyStoreGroupId** | **String**| Loyalty store group id | [required]

### Return type

[**List&lt;LoyaltyStoregroupsProductModel&gt;**](LoyaltyStoregroupsProductModel.md)

### Authorization

[oauth_token](../README.md#oauth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="updateStoreGroup"></a>
# **updateStoreGroup**
> LoyaltyStoregroupsProductModel updateStoreGroup(loyaltyStoreGroupId, body)

PUT Loyalty/StoreGroups/{loyaltyStoreGroupId}

Update loyalty store group

### Example
```java
// Import classes:
//import io.secuconnect.client.ApiClient;
//import io.secuconnect.client.ApiException;
//import io.secuconnect.client.Configuration;
//import io.secuconnect.client.auth.*;
//import io.secuconnect.client.api.LoyaltyStoregroupsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_token
OAuth oauth_token = (OAuth) defaultClient.getAuthentication("oauth_token");
oauth_token.setAccessToken("YOUR ACCESS TOKEN");

LoyaltyStoregroupsApi apiInstance = new LoyaltyStoregroupsApi();
String loyaltyStoreGroupId = "loyaltyStoreGroupId_example"; // String | Loyalty store group id
LoyaltyStoregroupsDTO body = new LoyaltyStoregroupsDTO(); // LoyaltyStoregroupsDTO | Loyalty store group properties
try {
    LoyaltyStoregroupsProductModel result = apiInstance.updateStoreGroup(loyaltyStoreGroupId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LoyaltyStoregroupsApi#updateStoreGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **loyaltyStoreGroupId** | **String**| Loyalty store group id | [required]
 **body** | [**LoyaltyStoregroupsDTO**](LoyaltyStoregroupsDTO.md)| Loyalty store group properties | [required]

### Return type

[**LoyaltyStoregroupsProductModel**](LoyaltyStoregroupsProductModel.md)

### Authorization

[oauth_token](../README.md#oauth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


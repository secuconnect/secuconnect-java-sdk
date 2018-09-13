# LoyaltyCardgroupsApi

All URIs are relative to *https://connect-testing.secupay-ag.de/api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addCardGroup**](LoyaltyCardgroupsApi.md#addCardGroup) | **POST** /Loyalty/Cardgroups | POST Loyalty/Cardgroups
[**checkPassCodeEnabled**](LoyaltyCardgroupsApi.md#checkPassCodeEnabled) | **POST** /Loyalty/Cardgroups/{loyaltyCardGroupId}/checkPasscodeEnabled | POST Loyalty/Cardgroups/{loyaltyCardGroupId}/checkPasscodeEnabled
[**getAll**](LoyaltyCardgroupsApi.md#getAll) | **GET** /Loyalty/Cardgroups | GET Loyalty/Cardgroups
[**getOne**](LoyaltyCardgroupsApi.md#getOne) | **GET** /Loyalty/Cardgroups/{loyaltyCardGroupId} | GET Loyalty/Cardgroups/{loyaltyCardGroupId}
[**updateCardGroup**](LoyaltyCardgroupsApi.md#updateCardGroup) | **PUT** /Loyalty/Cardgroups/{loyaltyCardGroupId} | PUT Loyalty/Cardgroups/{loyaltyCardGroupId}


<a name="addCardGroup"></a>
# **addCardGroup**
> LoyaltyCardgroupsProductModel addCardGroup(body)

POST Loyalty/Cardgroups

Add loyalty card group

### Example
```java
// Import classes:
//import io.secuconnect.client.ApiClient;
//import io.secuconnect.client.ApiException;
//import io.secuconnect.client.Configuration;
//import io.secuconnect.client.auth.*;
//import io.secuconnect.client.api.LoyaltyCardgroupsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_token
OAuth oauth_token = (OAuth) defaultClient.getAuthentication("oauth_token");
oauth_token.setAccessToken("YOUR ACCESS TOKEN");

LoyaltyCardgroupsApi apiInstance = new LoyaltyCardgroupsApi();
LoyaltyCardgroupsDTO body = new LoyaltyCardgroupsDTO(); // LoyaltyCardgroupsDTO | Loyalty card group properties
try {
    LoyaltyCardgroupsProductModel result = apiInstance.addCardGroup(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LoyaltyCardgroupsApi#addCardGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**LoyaltyCardgroupsDTO**](LoyaltyCardgroupsDTO.md)| Loyalty card group properties | [required]

### Return type

[**LoyaltyCardgroupsProductModel**](LoyaltyCardgroupsProductModel.md)

### Authorization

[oauth_token](../README.md#oauth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="checkPassCodeEnabled"></a>
# **checkPassCodeEnabled**
> Object checkPassCodeEnabled(loyaltyCardGroupId, body)

POST Loyalty/Cardgroups/{loyaltyCardGroupId}/checkPasscodeEnabled

Check whether passcode check is enabled

### Example
```java
// Import classes:
//import io.secuconnect.client.ApiClient;
//import io.secuconnect.client.ApiException;
//import io.secuconnect.client.Configuration;
//import io.secuconnect.client.auth.*;
//import io.secuconnect.client.api.LoyaltyCardgroupsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_token
OAuth oauth_token = (OAuth) defaultClient.getAuthentication("oauth_token");
oauth_token.setAccessToken("YOUR ACCESS TOKEN");

LoyaltyCardgroupsApi apiInstance = new LoyaltyCardgroupsApi();
String loyaltyCardGroupId = "loyaltyCardGroupId_example"; // String | Loyalty card group id
LoyaltyCardgroupsDTOCheckPasscodeEnabled body = new LoyaltyCardgroupsDTOCheckPasscodeEnabled(); // LoyaltyCardgroupsDTOCheckPasscodeEnabled | Check passcode details
try {
    Object result = apiInstance.checkPassCodeEnabled(loyaltyCardGroupId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LoyaltyCardgroupsApi#checkPassCodeEnabled");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **loyaltyCardGroupId** | **String**| Loyalty card group id | [required]
 **body** | [**LoyaltyCardgroupsDTOCheckPasscodeEnabled**](LoyaltyCardgroupsDTOCheckPasscodeEnabled.md)| Check passcode details |

### Return type

**Object**

### Authorization

[oauth_token](../README.md#oauth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getAll"></a>
# **getAll**
> LoyaltyCardgroupsList getAll(count, offset, fields, q, sort)

GET Loyalty/Cardgroups

Get a list of loyalty card groups

### Example
```java
// Import classes:
//import io.secuconnect.client.ApiClient;
//import io.secuconnect.client.ApiException;
//import io.secuconnect.client.Configuration;
//import io.secuconnect.client.auth.*;
//import io.secuconnect.client.api.LoyaltyCardgroupsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_token
OAuth oauth_token = (OAuth) defaultClient.getAuthentication("oauth_token");
oauth_token.setAccessToken("YOUR ACCESS TOKEN");

LoyaltyCardgroupsApi apiInstance = new LoyaltyCardgroupsApi();
Integer count = 56; // Integer | The number of items to return.
Integer offset = 56; // Integer | The position within the whole result set to start returning items (First element is at 0).
String fields = "fields_example"; // String | List of fields to include in the result. Nested properties can be accessed with this notation: prop1.prop2  Example: prop3,prop1.prop2
String q = "q_example"; // String | A query string to restrict the returned items to given conditions. The query string must consist of any combination of single expressions in the form property:condition.  *                  A condition may contain:  *                      - wildcard \"*\" for any number of characters  *                      - wildcard \"?\" for one character  *                      - ranges in the form [value TO value]  *  *                  Single expressions may combined by 'AND', 'OR', 'NOT' operators and parenthesis '(', ')' for grouping.  *                  Property names can be nested like \"prop1.prop2\".  *                  Example: (NOT customer.name:meier*) AND (customer.age:[30 TO 40] OR customer.age:[50 TO 60])  *                  
String sort = "sort_example"; // String | String with comma separated pairs of field:order (e.g. contact.surname:asc,contact.comapnyname:desc). Result set will be sorted by included fields, in ascending 'asc', or descending 'dsc' order.
try {
    LoyaltyCardgroupsList result = apiInstance.getAll(count, offset, fields, q, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LoyaltyCardgroupsApi#getAll");
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

[**LoyaltyCardgroupsList**](LoyaltyCardgroupsList.md)

### Authorization

[oauth_token](../README.md#oauth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getOne"></a>
# **getOne**
> LoyaltyCardgroupsProductModel getOne(loyaltyCardGroupId)

GET Loyalty/Cardgroups/{loyaltyCardGroupId}

Get loyalty card group for a specific id

### Example
```java
// Import classes:
//import io.secuconnect.client.ApiClient;
//import io.secuconnect.client.ApiException;
//import io.secuconnect.client.Configuration;
//import io.secuconnect.client.auth.*;
//import io.secuconnect.client.api.LoyaltyCardgroupsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_token
OAuth oauth_token = (OAuth) defaultClient.getAuthentication("oauth_token");
oauth_token.setAccessToken("YOUR ACCESS TOKEN");

LoyaltyCardgroupsApi apiInstance = new LoyaltyCardgroupsApi();
String loyaltyCardGroupId = "loyaltyCardGroupId_example"; // String | Search one by provided id
try {
    LoyaltyCardgroupsProductModel result = apiInstance.getOne(loyaltyCardGroupId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LoyaltyCardgroupsApi#getOne");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **loyaltyCardGroupId** | **String**| Search one by provided id | [required]

### Return type

[**LoyaltyCardgroupsProductModel**](LoyaltyCardgroupsProductModel.md)

### Authorization

[oauth_token](../README.md#oauth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="updateCardGroup"></a>
# **updateCardGroup**
> LoyaltyCardgroupsProductModel updateCardGroup(loyaltyCardGroupId, body)

PUT Loyalty/Cardgroups/{loyaltyCardGroupId}

Update loyalty card group

### Example
```java
// Import classes:
//import io.secuconnect.client.ApiClient;
//import io.secuconnect.client.ApiException;
//import io.secuconnect.client.Configuration;
//import io.secuconnect.client.auth.*;
//import io.secuconnect.client.api.LoyaltyCardgroupsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_token
OAuth oauth_token = (OAuth) defaultClient.getAuthentication("oauth_token");
oauth_token.setAccessToken("YOUR ACCESS TOKEN");

LoyaltyCardgroupsApi apiInstance = new LoyaltyCardgroupsApi();
String loyaltyCardGroupId = "loyaltyCardGroupId_example"; // String | Loyalty card group id
LoyaltyCardgroupsDTO body = new LoyaltyCardgroupsDTO(); // LoyaltyCardgroupsDTO | Loyalty card group properties
try {
    LoyaltyCardgroupsProductModel result = apiInstance.updateCardGroup(loyaltyCardGroupId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LoyaltyCardgroupsApi#updateCardGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **loyaltyCardGroupId** | **String**| Loyalty card group id | [required]
 **body** | [**LoyaltyCardgroupsDTO**](LoyaltyCardgroupsDTO.md)| Loyalty card group properties | [required]

### Return type

[**LoyaltyCardgroupsProductModel**](LoyaltyCardgroupsProductModel.md)

### Authorization

[oauth_token](../README.md#oauth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


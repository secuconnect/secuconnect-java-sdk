# LoyaltyCardsApi

All URIs are relative to *https://connect-testing.secupay-ag.de/api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**assignUser**](LoyaltyCardsApi.md#assignUser) | **POST** /Loyalty/Cards/{loyaltyCardId}/assignUser/{generalAccountId} | POST Loyalty/Cards/{loyaltyCardId}/assignUser/{generalAccountId}
[**getAll**](LoyaltyCardsApi.md#getAll) | **GET** /Loyalty/Cards | GET Loyalty/Cards
[**getOne**](LoyaltyCardsApi.md#getOne) | **GET** /Loyalty/Cards/{loyaltyCardId} | GET Loyalty/Cards/{loyaltyCardId}
[**removeAssignedUser**](LoyaltyCardsApi.md#removeAssignedUser) | **DELETE** /Loyalty/Cards/{loyaltyCardId}/assignUser/{generalAccountId} | DELETE Loyalty/Cards/{loyaltyCardId}/assignUser/{generalAccountId}


<a name="assignUser"></a>
# **assignUser**
> Object assignUser(loyaltyCardId, generalAccountId, loyaltyCardPin)

POST Loyalty/Cards/{loyaltyCardId}/assignUser/{generalAccountId}

Assign loyalty card to specific user account

### Example
```java
// Import classes:
//import io.secuconnect.client.ApiClient;
//import io.secuconnect.client.ApiException;
//import io.secuconnect.client.Configuration;
//import io.secuconnect.client.auth.*;
//import io.secuconnect.client.api.LoyaltyCardsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_token
OAuth oauth_token = (OAuth) defaultClient.getAuthentication("oauth_token");
oauth_token.setAccessToken("YOUR ACCESS TOKEN");

LoyaltyCardsApi apiInstance = new LoyaltyCardsApi();
String loyaltyCardId = "loyaltyCardId_example"; // String | Loyalty card id
String generalAccountId = "generalAccountId_example"; // String | General account id
Object loyaltyCardPin = null; // Object | Loyalty card pin for the specific card
try {
    Object result = apiInstance.assignUser(loyaltyCardId, generalAccountId, loyaltyCardPin);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LoyaltyCardsApi#assignUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **loyaltyCardId** | **String**| Loyalty card id | [required]
 **generalAccountId** | **String**| General account id | [required]
 **loyaltyCardPin** | **Object**| Loyalty card pin for the specific card |

### Return type

**Object**

### Authorization

[oauth_token](../README.md#oauth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getAll"></a>
# **getAll**
> LoyaltyCardsList getAll(count, offset, fields, q, sort)

GET Loyalty/Cards

Get a list of loyalty cards

### Example
```java
// Import classes:
//import io.secuconnect.client.ApiClient;
//import io.secuconnect.client.ApiException;
//import io.secuconnect.client.Configuration;
//import io.secuconnect.client.auth.*;
//import io.secuconnect.client.api.LoyaltyCardsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_token
OAuth oauth_token = (OAuth) defaultClient.getAuthentication("oauth_token");
oauth_token.setAccessToken("YOUR ACCESS TOKEN");

LoyaltyCardsApi apiInstance = new LoyaltyCardsApi();
Integer count = 56; // Integer | The number of items to return.
Integer offset = 56; // Integer | The position within the whole result set to start returning items (First element is at 0).
String fields = "fields_example"; // String | List of fields to include in the result. Nested properties can be accessed with this notation: prop1.prop2  Example: prop3,prop1.prop2
String q = "q_example"; // String | A query string to restrict the returned items to given conditions. The query string must consist of any combination of single expressions in the form property:condition.  *                  A condition may contain:  *                      - wildcard \"*\" for any number of characters  *                      - wildcard \"?\" for one character  *                      - ranges in the form [value TO value]  *  *                  Single expressions may combined by 'AND', 'OR', 'NOT' operators and parenthesis '(', ')' for grouping.  *                  Property names can be nested like \"prop1.prop2\".  *                  Example: (NOT customer.name:meier*) AND (customer.age:[30 TO 40] OR customer.age:[50 TO 60])  *                  
String sort = "sort_example"; // String | String with comma separated pairs of field:order (e.g. contact.surname:asc,contact.comapnyname:desc). Result set will be sorted by included fields, in ascending 'asc', or descending 'dsc' order.
try {
    LoyaltyCardsList result = apiInstance.getAll(count, offset, fields, q, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LoyaltyCardsApi#getAll");
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

[**LoyaltyCardsList**](LoyaltyCardsList.md)

### Authorization

[oauth_token](../README.md#oauth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getOne"></a>
# **getOne**
> LoyaltyCardsProductModel getOne(loyaltyCardId)

GET Loyalty/Cards/{loyaltyCardId}

Get loyalty card for a specific id

### Example
```java
// Import classes:
//import io.secuconnect.client.ApiClient;
//import io.secuconnect.client.ApiException;
//import io.secuconnect.client.Configuration;
//import io.secuconnect.client.auth.*;
//import io.secuconnect.client.api.LoyaltyCardsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_token
OAuth oauth_token = (OAuth) defaultClient.getAuthentication("oauth_token");
oauth_token.setAccessToken("YOUR ACCESS TOKEN");

LoyaltyCardsApi apiInstance = new LoyaltyCardsApi();
String loyaltyCardId = "loyaltyCardId_example"; // String | Search one loyalty card by provided id
try {
    LoyaltyCardsProductModel result = apiInstance.getOne(loyaltyCardId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LoyaltyCardsApi#getOne");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **loyaltyCardId** | **String**| Search one loyalty card by provided id | [required]

### Return type

[**LoyaltyCardsProductModel**](LoyaltyCardsProductModel.md)

### Authorization

[oauth_token](../README.md#oauth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="removeAssignedUser"></a>
# **removeAssignedUser**
> Object removeAssignedUser(loyaltyCardId, generalAccountId)

DELETE Loyalty/Cards/{loyaltyCardId}/assignUser/{generalAccountId}

Remove assigned loyalty card from specific user account

### Example
```java
// Import classes:
//import io.secuconnect.client.ApiClient;
//import io.secuconnect.client.ApiException;
//import io.secuconnect.client.Configuration;
//import io.secuconnect.client.auth.*;
//import io.secuconnect.client.api.LoyaltyCardsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_token
OAuth oauth_token = (OAuth) defaultClient.getAuthentication("oauth_token");
oauth_token.setAccessToken("YOUR ACCESS TOKEN");

LoyaltyCardsApi apiInstance = new LoyaltyCardsApi();
String loyaltyCardId = "loyaltyCardId_example"; // String | Loyalty card id
String generalAccountId = "generalAccountId_example"; // String | General account id
try {
    Object result = apiInstance.removeAssignedUser(loyaltyCardId, generalAccountId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LoyaltyCardsApi#removeAssignedUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **loyaltyCardId** | **String**| Loyalty card id | [required]
 **generalAccountId** | **String**| General account id | [required]

### Return type

**Object**

### Authorization

[oauth_token](../README.md#oauth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


# LoyaltyCustomersApi

All URIs are relative to *https://connect-testing.secupay-ag.de/api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addCustomer**](LoyaltyCustomersApi.md#addCustomer) | **POST** /Loyalty/Customers | POST Loyalty/Customers
[**assignPaymentContainer**](LoyaltyCustomersApi.md#assignPaymentContainer) | **POST** /Loyalty/Customers/{loyaltyCustomerId}/assignPaymentContainer/{loyaltyPaymentContainerId} | POST Loyalty/Customers/{loyaltyCustomerId}/assignPaymentContainer/{loyaltyPaymentContainerId}
[**checkForDuplicates**](LoyaltyCustomersApi.md#checkForDuplicates) | **POST** /Loyalty/Customers/{loyaltyCustomerId}/checkDuplicated/ | POST Loyalty/Customers/{loyaltyCustomerId}/checkDuplicated/
[**getAll**](LoyaltyCustomersApi.md#getAll) | **GET** /Loyalty/Customers | GET Loyalty/Customers
[**getOne**](LoyaltyCustomersApi.md#getOne) | **GET** /Loyalty/Customers/{loyaltyCustomerId} | GET Loyalty/Customers/{loyaltyCustomerId}
[**removeAssignedPaymentContainer**](LoyaltyCustomersApi.md#removeAssignedPaymentContainer) | **DELETE** /Loyalty/Customers/{loyaltyCustomerId}/assignPaymentContainer/{loyaltyPaymentContainerId} | DELETE Loyalty/Customers/{loyaltyCustomerId}/assignPaymentContainer/{loyaltyPaymentContainerId}
[**removeCustomer**](LoyaltyCustomersApi.md#removeCustomer) | **DELETE** /Loyalty/Customers/{loyaltyCustomerId} | DELETE Loyalty/Customers/{loyaltyCustomerId}
[**updateCustomer**](LoyaltyCustomersApi.md#updateCustomer) | **PUT** /Loyalty/Customers/{loyaltyCustomerId} | PUT Loyalty/Customers/{loyaltyCustomerId}


<a name="addCustomer"></a>
# **addCustomer**
> LoyaltyCustomersProductModel addCustomer(body)

POST Loyalty/Customers

Add loyalty customer

### Example
```java
// Import classes:
//import io.secuconnect.client.ApiClient;
//import io.secuconnect.client.ApiException;
//import io.secuconnect.client.Configuration;
//import io.secuconnect.client.auth.*;
//import io.secuconnect.client.api.LoyaltyCustomersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_token
OAuth oauth_token = (OAuth) defaultClient.getAuthentication("oauth_token");
oauth_token.setAccessToken("YOUR ACCESS TOKEN");

LoyaltyCustomersApi apiInstance = new LoyaltyCustomersApi();
LoyaltyCustomersDTO body = new LoyaltyCustomersDTO(); // LoyaltyCustomersDTO | loyalty Customer container properties
try {
    LoyaltyCustomersProductModel result = apiInstance.addCustomer(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LoyaltyCustomersApi#addCustomer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**LoyaltyCustomersDTO**](LoyaltyCustomersDTO.md)| loyalty Customer container properties | [required]

### Return type

[**LoyaltyCustomersProductModel**](LoyaltyCustomersProductModel.md)

### Authorization

[oauth_token](../README.md#oauth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="assignPaymentContainer"></a>
# **assignPaymentContainer**
> LoyaltyCustomersProductModel assignPaymentContainer(loyaltyCustomerId, loyaltyPaymentContainerId)

POST Loyalty/Customers/{loyaltyCustomerId}/assignPaymentContainer/{loyaltyPaymentContainerId}

Assigns LoyaltyPaymentContainer to customer

### Example
```java
// Import classes:
//import io.secuconnect.client.ApiClient;
//import io.secuconnect.client.ApiException;
//import io.secuconnect.client.Configuration;
//import io.secuconnect.client.auth.*;
//import io.secuconnect.client.api.LoyaltyCustomersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_token
OAuth oauth_token = (OAuth) defaultClient.getAuthentication("oauth_token");
oauth_token.setAccessToken("YOUR ACCESS TOKEN");

LoyaltyCustomersApi apiInstance = new LoyaltyCustomersApi();
String loyaltyCustomerId = "loyaltyCustomerId_example"; // String | Loyalty customer id
String loyaltyPaymentContainerId = "loyaltyPaymentContainerId_example"; // String | LoyaltyPaymentContainer id
try {
    LoyaltyCustomersProductModel result = apiInstance.assignPaymentContainer(loyaltyCustomerId, loyaltyPaymentContainerId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LoyaltyCustomersApi#assignPaymentContainer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **loyaltyCustomerId** | **String**| Loyalty customer id | [required]
 **loyaltyPaymentContainerId** | **String**| LoyaltyPaymentContainer id | [required]

### Return type

[**LoyaltyCustomersProductModel**](LoyaltyCustomersProductModel.md)

### Authorization

[oauth_token](../README.md#oauth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="checkForDuplicates"></a>
# **checkForDuplicates**
> Object checkForDuplicates(loyaltyCustomerId)

POST Loyalty/Customers/{loyaltyCustomerId}/checkDuplicated/

check if there are duplicated customers for a given merchant

### Example
```java
// Import classes:
//import io.secuconnect.client.ApiClient;
//import io.secuconnect.client.ApiException;
//import io.secuconnect.client.Configuration;
//import io.secuconnect.client.auth.*;
//import io.secuconnect.client.api.LoyaltyCustomersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_token
OAuth oauth_token = (OAuth) defaultClient.getAuthentication("oauth_token");
oauth_token.setAccessToken("YOUR ACCESS TOKEN");

LoyaltyCustomersApi apiInstance = new LoyaltyCustomersApi();
String loyaltyCustomerId = "loyaltyCustomerId_example"; // String | Loyalty customer id
try {
    Object result = apiInstance.checkForDuplicates(loyaltyCustomerId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LoyaltyCustomersApi#checkForDuplicates");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **loyaltyCustomerId** | **String**| Loyalty customer id | [required]

### Return type

**Object**

### Authorization

[oauth_token](../README.md#oauth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getAll"></a>
# **getAll**
> LoyaltyCustomersList getAll(count, offset, fields, q, sort)

GET Loyalty/Customers

Get a list of loyalty customers

### Example
```java
// Import classes:
//import io.secuconnect.client.ApiClient;
//import io.secuconnect.client.ApiException;
//import io.secuconnect.client.Configuration;
//import io.secuconnect.client.auth.*;
//import io.secuconnect.client.api.LoyaltyCustomersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_token
OAuth oauth_token = (OAuth) defaultClient.getAuthentication("oauth_token");
oauth_token.setAccessToken("YOUR ACCESS TOKEN");

LoyaltyCustomersApi apiInstance = new LoyaltyCustomersApi();
Integer count = 56; // Integer | The number of items to return.
Integer offset = 56; // Integer | The position within the whole result set to start returning items (First element is at 0).
String fields = "fields_example"; // String | List of fields to include in the result. Nested properties can be accessed with this notation: prop1.prop2  Example: prop3,prop1.prop2
String q = "q_example"; // String | A query string to restrict the returned items to given conditions. The query string must consist of any combination of single expressions in the form property:condition.  *                  A condition may contain:  *                      - wildcard \"*\" for any number of characters  *                      - wildcard \"?\" for one character  *                      - ranges in the form [value TO value]  *  *                  Single expressions may combined by 'AND', 'OR', 'NOT' operators and parenthesis '(', ')' for grouping.  *                  Property names can be nested like \"prop1.prop2\".  *                  Example: (NOT customer.name:meier*) AND (customer.age:[30 TO 40] OR customer.age:[50 TO 60])  *                  
String sort = "sort_example"; // String | String with comma separated pairs of field:order (e.g. contact.surname:asc,contact.comapnyname:desc). Result set will be sorted by included fields, in ascending 'asc', or descending 'dsc' order.
try {
    LoyaltyCustomersList result = apiInstance.getAll(count, offset, fields, q, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LoyaltyCustomersApi#getAll");
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

[**LoyaltyCustomersList**](LoyaltyCustomersList.md)

### Authorization

[oauth_token](../README.md#oauth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getOne"></a>
# **getOne**
> LoyaltyCustomersProductModel getOne(loyaltyCustomerId)

GET Loyalty/Customers/{loyaltyCustomerId}

Get loyalty customer for a specific id

### Example
```java
// Import classes:
//import io.secuconnect.client.ApiClient;
//import io.secuconnect.client.ApiException;
//import io.secuconnect.client.Configuration;
//import io.secuconnect.client.auth.*;
//import io.secuconnect.client.api.LoyaltyCustomersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_token
OAuth oauth_token = (OAuth) defaultClient.getAuthentication("oauth_token");
oauth_token.setAccessToken("YOUR ACCESS TOKEN");

LoyaltyCustomersApi apiInstance = new LoyaltyCustomersApi();
String loyaltyCustomerId = "loyaltyCustomerId_example"; // String | Search one loyalty customer by provided id
try {
    LoyaltyCustomersProductModel result = apiInstance.getOne(loyaltyCustomerId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LoyaltyCustomersApi#getOne");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **loyaltyCustomerId** | **String**| Search one loyalty customer by provided id | [required]

### Return type

[**LoyaltyCustomersProductModel**](LoyaltyCustomersProductModel.md)

### Authorization

[oauth_token](../README.md#oauth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="removeAssignedPaymentContainer"></a>
# **removeAssignedPaymentContainer**
> LoyaltyCustomersProductModel removeAssignedPaymentContainer(loyaltyCustomerId, loyaltyPaymentContainerId)

DELETE Loyalty/Customers/{loyaltyCustomerId}/assignPaymentContainer/{loyaltyPaymentContainerId}

Removes an assigned LoyaltyPaymentContainer from customer

### Example
```java
// Import classes:
//import io.secuconnect.client.ApiClient;
//import io.secuconnect.client.ApiException;
//import io.secuconnect.client.Configuration;
//import io.secuconnect.client.auth.*;
//import io.secuconnect.client.api.LoyaltyCustomersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_token
OAuth oauth_token = (OAuth) defaultClient.getAuthentication("oauth_token");
oauth_token.setAccessToken("YOUR ACCESS TOKEN");

LoyaltyCustomersApi apiInstance = new LoyaltyCustomersApi();
String loyaltyCustomerId = "loyaltyCustomerId_example"; // String | Loyalty customer id
String loyaltyPaymentContainerId = "loyaltyPaymentContainerId_example"; // String | LoyaltyPaymentContainer id
try {
    LoyaltyCustomersProductModel result = apiInstance.removeAssignedPaymentContainer(loyaltyCustomerId, loyaltyPaymentContainerId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LoyaltyCustomersApi#removeAssignedPaymentContainer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **loyaltyCustomerId** | **String**| Loyalty customer id | [required]
 **loyaltyPaymentContainerId** | **String**| LoyaltyPaymentContainer id | [required]

### Return type

[**LoyaltyCustomersProductModel**](LoyaltyCustomersProductModel.md)

### Authorization

[oauth_token](../README.md#oauth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="removeCustomer"></a>
# **removeCustomer**
> LoyaltyCustomersRemoved removeCustomer(loyaltyCustomerId)

DELETE Loyalty/Customers/{loyaltyCustomerId}

Remove assigned loyalty customer

### Example
```java
// Import classes:
//import io.secuconnect.client.ApiClient;
//import io.secuconnect.client.ApiException;
//import io.secuconnect.client.Configuration;
//import io.secuconnect.client.auth.*;
//import io.secuconnect.client.api.LoyaltyCustomersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_token
OAuth oauth_token = (OAuth) defaultClient.getAuthentication("oauth_token");
oauth_token.setAccessToken("YOUR ACCESS TOKEN");

LoyaltyCustomersApi apiInstance = new LoyaltyCustomersApi();
String loyaltyCustomerId = "loyaltyCustomerId_example"; // String | Loyalty customer id
try {
    LoyaltyCustomersRemoved result = apiInstance.removeCustomer(loyaltyCustomerId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LoyaltyCustomersApi#removeCustomer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **loyaltyCustomerId** | **String**| Loyalty customer id | [required]

### Return type

[**LoyaltyCustomersRemoved**](LoyaltyCustomersRemoved.md)

### Authorization

[oauth_token](../README.md#oauth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="updateCustomer"></a>
# **updateCustomer**
> LoyaltyCustomersProductModel updateCustomer(loyaltyCustomerId, body)

PUT Loyalty/Customers/{loyaltyCustomerId}

Function to update customer&#39;s data

### Example
```java
// Import classes:
//import io.secuconnect.client.ApiClient;
//import io.secuconnect.client.ApiException;
//import io.secuconnect.client.Configuration;
//import io.secuconnect.client.auth.*;
//import io.secuconnect.client.api.LoyaltyCustomersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_token
OAuth oauth_token = (OAuth) defaultClient.getAuthentication("oauth_token");
oauth_token.setAccessToken("YOUR ACCESS TOKEN");

LoyaltyCustomersApi apiInstance = new LoyaltyCustomersApi();
String loyaltyCustomerId = "loyaltyCustomerId_example"; // String | loyalty Customer Id CUS_XXX
LoyaltyCustomersDTO body = new LoyaltyCustomersDTO(); // LoyaltyCustomersDTO | loyalty Customer container properties
try {
    LoyaltyCustomersProductModel result = apiInstance.updateCustomer(loyaltyCustomerId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LoyaltyCustomersApi#updateCustomer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **loyaltyCustomerId** | **String**| loyalty Customer Id CUS_XXX | [required]
 **body** | [**LoyaltyCustomersDTO**](LoyaltyCustomersDTO.md)| loyalty Customer container properties | [required]

### Return type

[**LoyaltyCustomersProductModel**](LoyaltyCustomersProductModel.md)

### Authorization

[oauth_token](../README.md#oauth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


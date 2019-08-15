# SmartTransactionsApi

All URIs are relative to *https://connect-testing.secupay-ag.de/api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addTransaction**](SmartTransactionsApi.md#addTransaction) | **POST** /Smart/Transactions | POST Smart/Transactions
[**cancelTransaction**](SmartTransactionsApi.md#cancelTransaction) | **POST** /Smart/Transactions/{smartTransactionId}/cancel | POST Smart/Transactions/{smartTransactionId}/cancel
[**cancelTrx**](SmartTransactionsApi.md#cancelTrx) | **POST** /Smart/Transactions/{smartTransactionId}/canceltrx | POST Smart/Transactions/{smartTransactionId}/canceltrx
[**diagnose**](SmartTransactionsApi.md#diagnose) | **POST** /Smart/Transactions/{smartDeviceId}/diagnosis | POST Smart/Transactions/{smartDeviceId}/diagnosis
[**getAll**](SmartTransactionsApi.md#getAll) | **GET** /Smart/Transactions | GET Smart/Transactions
[**getOne**](SmartTransactionsApi.md#getOne) | **GET** /Smart/Transactions/{smartTransactionId} | GET Smart/Transactions/{smartTransactionId}
[**preTransaction**](SmartTransactionsApi.md#preTransaction) | **POST** /Smart/Transactions/{smartTransactionId}/preTransaction | POST Smart/Transactions/{smartTransactionId}/preTransaction
[**prepare**](SmartTransactionsApi.md#prepare) | **POST** /Smart/Transactions/{smartTransactionId}/prepare | POST Smart/Transactions/stx_xxx/prepare
[**startEndOfDayReport**](SmartTransactionsApi.md#startEndOfDayReport) | **POST** /Smart/Transactions/{smartDeviceId}/endOfDay | POST Smart/Transactions/{smartDeviceId}/endOfDay
[**startTransaction**](SmartTransactionsApi.md#startTransaction) | **POST** /Smart/Transactions/{smartTransactionId}/start/{paymentMethod} | POST Smart/Transactions/{smartTransactionId}/start/{paymentMethod}
[**updateTransaction**](SmartTransactionsApi.md#updateTransaction) | **PUT** /Smart/Transactions/{smartTransactionId} | PUT Smart/Transactions/{smartTransactionId}


<a name="addTransaction"></a>
# **addTransaction**
> SmartTransactionsProductModel addTransaction(smartTransactionProperties)

POST Smart/Transactions

Create new smart transaction

### Example
```java
// Import classes:
//import io.secuconnect.client.ApiClient;
//import io.secuconnect.client.ApiException;
//import io.secuconnect.client.Configuration;
//import io.secuconnect.client.auth.*;
//import io.secuconnect.client.api.SmartTransactionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_token
OAuth oauth_token = (OAuth) defaultClient.getAuthentication("oauth_token");
oauth_token.setAccessToken("YOUR ACCESS TOKEN");

SmartTransactionsApi apiInstance = new SmartTransactionsApi();
SmartTransactionsDTO smartTransactionProperties = new SmartTransactionsDTO(); // SmartTransactionsDTO | Smart transaction properties
try {
    SmartTransactionsProductModel result = apiInstance.addTransaction(smartTransactionProperties);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SmartTransactionsApi#addTransaction");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **smartTransactionProperties** | [**SmartTransactionsDTO**](SmartTransactionsDTO.md)| Smart transaction properties | [required]

### Return type

[**SmartTransactionsProductModel**](SmartTransactionsProductModel.md)

### Authorization

[oauth_token](../README.md#oauth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="cancelTransaction"></a>
# **cancelTransaction**
> SmartTransactionsProductModel cancelTransaction(smartTransactionId)

POST Smart/Transactions/{smartTransactionId}/cancel

Method to cancel the transaction with given idn

### Example
```java
// Import classes:
//import io.secuconnect.client.ApiClient;
//import io.secuconnect.client.ApiException;
//import io.secuconnect.client.Configuration;
//import io.secuconnect.client.auth.*;
//import io.secuconnect.client.api.SmartTransactionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_token
OAuth oauth_token = (OAuth) defaultClient.getAuthentication("oauth_token");
oauth_token.setAccessToken("YOUR ACCESS TOKEN");

SmartTransactionsApi apiInstance = new SmartTransactionsApi();
String smartTransactionId = "smartTransactionId_example"; // String | Smart transaction id
try {
    SmartTransactionsProductModel result = apiInstance.cancelTransaction(smartTransactionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SmartTransactionsApi#cancelTransaction");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **smartTransactionId** | **String**| Smart transaction id | [required]

### Return type

[**SmartTransactionsProductModel**](SmartTransactionsProductModel.md)

### Authorization

[oauth_token](../README.md#oauth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="cancelTrx"></a>
# **cancelTrx**
> SmartTransactionsProductModel cancelTrx(smartTransactionId)

POST Smart/Transactions/{smartTransactionId}/canceltrx

Starts Cancel &#39;Cash&#39; transaction on Terminal with &#39;receipt_number&#39; (&#39;Beleg-Nr.&#39;)

### Example
```java
// Import classes:
//import io.secuconnect.client.ApiClient;
//import io.secuconnect.client.ApiException;
//import io.secuconnect.client.Configuration;
//import io.secuconnect.client.auth.*;
//import io.secuconnect.client.api.SmartTransactionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_token
OAuth oauth_token = (OAuth) defaultClient.getAuthentication("oauth_token");
oauth_token.setAccessToken("YOUR ACCESS TOKEN");

SmartTransactionsApi apiInstance = new SmartTransactionsApi();
String smartTransactionId = "smartTransactionId_example"; // String | Smart transaction id
try {
    SmartTransactionsProductModel result = apiInstance.cancelTrx(smartTransactionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SmartTransactionsApi#cancelTrx");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **smartTransactionId** | **String**| Smart transaction id | [required]

### Return type

[**SmartTransactionsProductModel**](SmartTransactionsProductModel.md)

### Authorization

[oauth_token](../README.md#oauth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="diagnose"></a>
# **diagnose**
> SmartTransactionsProductModel diagnose(smartDeviceId)

POST Smart/Transactions/{smartDeviceId}/diagnosis

Starts extended Diagnose on Terminal, this method is normally called by SDK&#39;s from cash register

### Example
```java
// Import classes:
//import io.secuconnect.client.ApiClient;
//import io.secuconnect.client.ApiException;
//import io.secuconnect.client.Configuration;
//import io.secuconnect.client.auth.*;
//import io.secuconnect.client.api.SmartTransactionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_token
OAuth oauth_token = (OAuth) defaultClient.getAuthentication("oauth_token");
oauth_token.setAccessToken("YOUR ACCESS TOKEN");

SmartTransactionsApi apiInstance = new SmartTransactionsApi();
String smartDeviceId = "smartDeviceId_example"; // String | Smart device id
try {
    SmartTransactionsProductModel result = apiInstance.diagnose(smartDeviceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SmartTransactionsApi#diagnose");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **smartDeviceId** | **String**| Smart device id | [required]

### Return type

[**SmartTransactionsProductModel**](SmartTransactionsProductModel.md)

### Authorization

[oauth_token](../README.md#oauth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getAll"></a>
# **getAll**
> SmartTransactionsList getAll(count, offset, fields, q, sort)

GET Smart/Transactions

Get a list of smart transactions

### Example
```java
// Import classes:
//import io.secuconnect.client.ApiClient;
//import io.secuconnect.client.ApiException;
//import io.secuconnect.client.Configuration;
//import io.secuconnect.client.auth.*;
//import io.secuconnect.client.api.SmartTransactionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_token
OAuth oauth_token = (OAuth) defaultClient.getAuthentication("oauth_token");
oauth_token.setAccessToken("YOUR ACCESS TOKEN");

SmartTransactionsApi apiInstance = new SmartTransactionsApi();
Integer count = 56; // Integer | The number of items to return.
Integer offset = 56; // Integer | The position within the whole result set to start returning items (First element is at 0).
String fields = "fields_example"; // String | List of fields to include in the result. Nested properties can be accessed with this notation: prop1.prop2  Example: prop3,prop1.prop2
String q = "q_example"; // String | A query string to restrict the returned items to given conditions. The query string must consist of any combination of single expressions in the form property:condition.  *                  A condition may contain:  *                      - wildcard \"*\" for any number of characters  *                      - wildcard \"?\" for one character  *                      - ranges in the form [value TO value]  *  *                  Single expressions may combined by 'AND', 'OR', 'NOT' operators and parenthesis '(', ')' for grouping.  *                  Property names can be nested like \"prop1.prop2\".  *                  Example: (NOT customer.name:meier*) AND (customer.age:[30 TO 40] OR customer.age:[50 TO 60])  *                  
String sort = "sort_example"; // String | String with comma separated pairs of field:order (e.g. contact.surname:asc,contact.comapnyname:desc). Result set will be sorted by included fields, in ascending 'asc', or descending 'dsc' order.
try {
    SmartTransactionsList result = apiInstance.getAll(count, offset, fields, q, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SmartTransactionsApi#getAll");
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

[**SmartTransactionsList**](SmartTransactionsList.md)

### Authorization

[oauth_token](../README.md#oauth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getOne"></a>
# **getOne**
> SmartTransactionsProductModel getOne(smartTransactionId)

GET Smart/Transactions/{smartTransactionId}

Get one smart transaction for a specific id

### Example
```java
// Import classes:
//import io.secuconnect.client.ApiClient;
//import io.secuconnect.client.ApiException;
//import io.secuconnect.client.Configuration;
//import io.secuconnect.client.auth.*;
//import io.secuconnect.client.api.SmartTransactionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_token
OAuth oauth_token = (OAuth) defaultClient.getAuthentication("oauth_token");
oauth_token.setAccessToken("YOUR ACCESS TOKEN");

SmartTransactionsApi apiInstance = new SmartTransactionsApi();
String smartTransactionId = "smartTransactionId_example"; // String | Smart transaction id
try {
    SmartTransactionsProductModel result = apiInstance.getOne(smartTransactionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SmartTransactionsApi#getOne");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **smartTransactionId** | **String**| Smart transaction id | [required]

### Return type

[**SmartTransactionsProductModel**](SmartTransactionsProductModel.md)

### Authorization

[oauth_token](../README.md#oauth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="preTransaction"></a>
# **preTransaction**
> SmartTransactionsPreTransactionModel preTransaction(smartTransactionId)

POST Smart/Transactions/{smartTransactionId}/preTransaction

Function that checks balance of merchantcard from ident and if possible creates bonus product items for basket

### Example
```java
// Import classes:
//import io.secuconnect.client.ApiClient;
//import io.secuconnect.client.ApiException;
//import io.secuconnect.client.Configuration;
//import io.secuconnect.client.auth.*;
//import io.secuconnect.client.api.SmartTransactionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_token
OAuth oauth_token = (OAuth) defaultClient.getAuthentication("oauth_token");
oauth_token.setAccessToken("YOUR ACCESS TOKEN");

SmartTransactionsApi apiInstance = new SmartTransactionsApi();
String smartTransactionId = "smartTransactionId_example"; // String | Smart transaction id
try {
    SmartTransactionsPreTransactionModel result = apiInstance.preTransaction(smartTransactionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SmartTransactionsApi#preTransaction");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **smartTransactionId** | **String**| Smart transaction id | [required]

### Return type

[**SmartTransactionsPreTransactionModel**](SmartTransactionsPreTransactionModel.md)

### Authorization

[oauth_token](../README.md#oauth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="prepare"></a>
# **prepare**
> SmartTransactionsProductModel prepare(smartTransactionId, body)

POST Smart/Transactions/stx_xxx/prepare

Create and score payment transaction assigned to given smart transaction

### Example
```java
// Import classes:
//import io.secuconnect.client.ApiClient;
//import io.secuconnect.client.ApiException;
//import io.secuconnect.client.Configuration;
//import io.secuconnect.client.auth.*;
//import io.secuconnect.client.api.SmartTransactionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_token
OAuth oauth_token = (OAuth) defaultClient.getAuthentication("oauth_token");
oauth_token.setAccessToken("YOUR ACCESS TOKEN");

SmartTransactionsApi apiInstance = new SmartTransactionsApi();
String smartTransactionId = "smartTransactionId_example"; // String | Smart transaction id
SmartTransactionsPrepare body = new SmartTransactionsPrepare(); // SmartTransactionsPrepare | Information which customer and container will be used to this operation
try {
    SmartTransactionsProductModel result = apiInstance.prepare(smartTransactionId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SmartTransactionsApi#prepare");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **smartTransactionId** | **String**| Smart transaction id | [required]
 **body** | [**SmartTransactionsPrepare**](SmartTransactionsPrepare.md)| Information which customer and container will be used to this operation | [required]

### Return type

[**SmartTransactionsProductModel**](SmartTransactionsProductModel.md)

### Authorization

[oauth_token](../README.md#oauth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="startEndOfDayReport"></a>
# **startEndOfDayReport**
> SmartTransactionsProductModel startEndOfDayReport(smartDeviceId)

POST Smart/Transactions/{smartDeviceId}/endOfDay

Starts End of Day Report on Terminal, this method is normally called by SDK&#39;s from cash register

### Example
```java
// Import classes:
//import io.secuconnect.client.ApiClient;
//import io.secuconnect.client.ApiException;
//import io.secuconnect.client.Configuration;
//import io.secuconnect.client.auth.*;
//import io.secuconnect.client.api.SmartTransactionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_token
OAuth oauth_token = (OAuth) defaultClient.getAuthentication("oauth_token");
oauth_token.setAccessToken("YOUR ACCESS TOKEN");

SmartTransactionsApi apiInstance = new SmartTransactionsApi();
String smartDeviceId = "smartDeviceId_example"; // String | Smart device id
try {
    SmartTransactionsProductModel result = apiInstance.startEndOfDayReport(smartDeviceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SmartTransactionsApi#startEndOfDayReport");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **smartDeviceId** | **String**| Smart device id | [required]

### Return type

[**SmartTransactionsProductModel**](SmartTransactionsProductModel.md)

### Authorization

[oauth_token](../README.md#oauth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="startTransaction"></a>
# **startTransaction**
> SmartTransactionsProductModel startTransaction(smartTransactionId, paymentMethod)

POST Smart/Transactions/{smartTransactionId}/start/{paymentMethod}

Start smart transaction with given payment method

### Example
```java
// Import classes:
//import io.secuconnect.client.ApiClient;
//import io.secuconnect.client.ApiException;
//import io.secuconnect.client.Configuration;
//import io.secuconnect.client.auth.*;
//import io.secuconnect.client.api.SmartTransactionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_token
OAuth oauth_token = (OAuth) defaultClient.getAuthentication("oauth_token");
oauth_token.setAccessToken("YOUR ACCESS TOKEN");

SmartTransactionsApi apiInstance = new SmartTransactionsApi();
String smartTransactionId = "smartTransactionId_example"; // String | Smart transaction id
String paymentMethod = "paymentMethod_example"; // String | Payment method
try {
    SmartTransactionsProductModel result = apiInstance.startTransaction(smartTransactionId, paymentMethod);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SmartTransactionsApi#startTransaction");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **smartTransactionId** | **String**| Smart transaction id | [required]
 **paymentMethod** | **String**| Payment method | [required]

### Return type

[**SmartTransactionsProductModel**](SmartTransactionsProductModel.md)

### Authorization

[oauth_token](../README.md#oauth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="updateTransaction"></a>
# **updateTransaction**
> SmartTransactionsProductModel updateTransaction(smartTransactionId, smartTransactionProperties)

PUT Smart/Transactions/{smartTransactionId}

Update smart transaction

### Example
```java
// Import classes:
//import io.secuconnect.client.ApiClient;
//import io.secuconnect.client.ApiException;
//import io.secuconnect.client.Configuration;
//import io.secuconnect.client.auth.*;
//import io.secuconnect.client.api.SmartTransactionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_token
OAuth oauth_token = (OAuth) defaultClient.getAuthentication("oauth_token");
oauth_token.setAccessToken("YOUR ACCESS TOKEN");

SmartTransactionsApi apiInstance = new SmartTransactionsApi();
String smartTransactionId = "smartTransactionId_example"; // String | Smart transaction id
SmartTransactionsDTO smartTransactionProperties = new SmartTransactionsDTO(); // SmartTransactionsDTO | Smart transaction properties
try {
    SmartTransactionsProductModel result = apiInstance.updateTransaction(smartTransactionId, smartTransactionProperties);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SmartTransactionsApi#updateTransaction");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **smartTransactionId** | **String**| Smart transaction id | [required]
 **smartTransactionProperties** | [**SmartTransactionsDTO**](SmartTransactionsDTO.md)| Smart transaction properties | [required]

### Return type

[**SmartTransactionsProductModel**](SmartTransactionsProductModel.md)

### Authorization

[oauth_token](../README.md#oauth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


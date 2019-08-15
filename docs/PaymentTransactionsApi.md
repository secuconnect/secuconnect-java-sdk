# PaymentTransactionsApi

All URIs are relative to *https://connect-testing.secupay-ag.de/api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancel**](PaymentTransactionsApi.md#cancel) | **POST** /Payment/Transactions/{paymentTransactionId}/cancel | POST Payment/Transactions/{paymentTransactionId}/cancel
[**getAll**](PaymentTransactionsApi.md#getAll) | **GET** /Payment/Transactions | GET Payment/Transactions
[**getOne**](PaymentTransactionsApi.md#getOne) | **GET** /Payment/Transactions/{paymentTransactionId} | GET Payment/Transactions/{paymentTransactionId}
[**getShippingUrl**](PaymentTransactionsApi.md#getShippingUrl) | **GET** /Payment/Transactions/{paymentTransactionId}/shippingUrl | GET Payment/Transactions/{paymentTransactionId}/shippingUrl
[**revokeAccrual**](PaymentTransactionsApi.md#revokeAccrual) | **POST** /Payment/Transactions/{paymentTransactionId}/revokeAccrual | POST Payment/Transactions/{paymentTransactionId}/revokeAccrual


<a name="cancel"></a>
# **cancel**
> List&lt;PaymentTransactionsProductModel&gt; cancel(paymentTransactionId, body)

POST Payment/Transactions/{paymentTransactionId}/cancel

Cancel a payment transaction

### Example
```java
// Import classes:
//import io.secuconnect.client.ApiClient;
//import io.secuconnect.client.ApiException;
//import io.secuconnect.client.Configuration;
//import io.secuconnect.client.auth.*;
//import io.secuconnect.client.api.PaymentTransactionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_token
OAuth oauth_token = (OAuth) defaultClient.getAuthentication("oauth_token");
oauth_token.setAccessToken("YOUR ACCESS TOKEN");

PaymentTransactionsApi apiInstance = new PaymentTransactionsApi();
String paymentTransactionId = "paymentTransactionId_example"; // String | Payment transaction id
PaymentTransactionCancelDTO body = new PaymentTransactionCancelDTO(); // PaymentTransactionCancelDTO | Cancel payment transaction input properties
try {
    List<PaymentTransactionsProductModel> result = apiInstance.cancel(paymentTransactionId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentTransactionsApi#cancel");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **paymentTransactionId** | **String**| Payment transaction id | [required]
 **body** | [**PaymentTransactionCancelDTO**](PaymentTransactionCancelDTO.md)| Cancel payment transaction input properties |

### Return type

[**List&lt;PaymentTransactionsProductModel&gt;**](PaymentTransactionsProductModel.md)

### Authorization

[oauth_token](../README.md#oauth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getAll"></a>
# **getAll**
> PaymentTransactionsList getAll(count, offset, fields, q, sort)

GET Payment/Transactions

Get a list of payment transactions

### Example
```java
// Import classes:
//import io.secuconnect.client.ApiClient;
//import io.secuconnect.client.ApiException;
//import io.secuconnect.client.Configuration;
//import io.secuconnect.client.auth.*;
//import io.secuconnect.client.api.PaymentTransactionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_token
OAuth oauth_token = (OAuth) defaultClient.getAuthentication("oauth_token");
oauth_token.setAccessToken("YOUR ACCESS TOKEN");

PaymentTransactionsApi apiInstance = new PaymentTransactionsApi();
Integer count = 56; // Integer | The number of items to return.
Integer offset = 56; // Integer | The position within the whole result set to start returning items (First element is at 0).
String fields = "fields_example"; // String | List of fields to include in the result. Nested properties can be accessed with this notation: prop1.prop2  Example: prop3,prop1.prop2
String q = "q_example"; // String | A query string to restrict the returned items to given conditions. The query string must consist of any combination of single expressions in the form property:condition.  *                  A condition may contain:  *                      - wildcard \"*\" for any number of characters  *                      - wildcard \"?\" for one character  *                      - ranges in the form [value TO value]  *  *                  Single expressions may combined by 'AND', 'OR', 'NOT' operators and parenthesis '(', ')' for grouping.  *                  Property names can be nested like \"prop1.prop2\".  *                  Example: (NOT customer.name:meier*) AND (customer.age:[30 TO 40] OR customer.age:[50 TO 60])  *                  
String sort = "sort_example"; // String | String with comma separated pairs of field:order (e.g. contact.surname:asc,contact.comapnyname:desc). Result set will be sorted by included fields, in ascending 'asc', or descending 'dsc' order.
try {
    PaymentTransactionsList result = apiInstance.getAll(count, offset, fields, q, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentTransactionsApi#getAll");
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

[**PaymentTransactionsList**](PaymentTransactionsList.md)

### Authorization

[oauth_token](../README.md#oauth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getOne"></a>
# **getOne**
> PaymentTransactionsProductModel getOne(paymentTransactionId)

GET Payment/Transactions/{paymentTransactionId}

Get all payment transactions

### Example
```java
// Import classes:
//import io.secuconnect.client.ApiClient;
//import io.secuconnect.client.ApiException;
//import io.secuconnect.client.Configuration;
//import io.secuconnect.client.auth.*;
//import io.secuconnect.client.api.PaymentTransactionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_token
OAuth oauth_token = (OAuth) defaultClient.getAuthentication("oauth_token");
oauth_token.setAccessToken("YOUR ACCESS TOKEN");

PaymentTransactionsApi apiInstance = new PaymentTransactionsApi();
String paymentTransactionId = "paymentTransactionId_example"; // String | Payment transaction id
try {
    PaymentTransactionsProductModel result = apiInstance.getOne(paymentTransactionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentTransactionsApi#getOne");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **paymentTransactionId** | **String**| Payment transaction id | [required]

### Return type

[**PaymentTransactionsProductModel**](PaymentTransactionsProductModel.md)

### Authorization

[oauth_token](../README.md#oauth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getShippingUrl"></a>
# **getShippingUrl**
> PaymentTransactionsShippingUrl getShippingUrl(paymentTransactionId)

GET Payment/Transactions/{paymentTransactionId}/shippingUrl

Get the url where you can fill the shipping information

### Example
```java
// Import classes:
//import io.secuconnect.client.ApiClient;
//import io.secuconnect.client.ApiException;
//import io.secuconnect.client.Configuration;
//import io.secuconnect.client.auth.*;
//import io.secuconnect.client.api.PaymentTransactionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_token
OAuth oauth_token = (OAuth) defaultClient.getAuthentication("oauth_token");
oauth_token.setAccessToken("YOUR ACCESS TOKEN");

PaymentTransactionsApi apiInstance = new PaymentTransactionsApi();
String paymentTransactionId = "paymentTransactionId_example"; // String | Payment transaction id
try {
    PaymentTransactionsShippingUrl result = apiInstance.getShippingUrl(paymentTransactionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentTransactionsApi#getShippingUrl");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **paymentTransactionId** | **String**| Payment transaction id | [required]

### Return type

[**PaymentTransactionsShippingUrl**](PaymentTransactionsShippingUrl.md)

### Authorization

[oauth_token](../README.md#oauth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="revokeAccrual"></a>
# **revokeAccrual**
> PaymentTransactionsProductModel revokeAccrual(paymentTransactionId, body)

POST Payment/Transactions/{paymentTransactionId}/revokeAccrual

Revoke the accrual flag of a payment transaction

### Example
```java
// Import classes:
//import io.secuconnect.client.ApiClient;
//import io.secuconnect.client.ApiException;
//import io.secuconnect.client.Configuration;
//import io.secuconnect.client.auth.*;
//import io.secuconnect.client.api.PaymentTransactionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_token
OAuth oauth_token = (OAuth) defaultClient.getAuthentication("oauth_token");
oauth_token.setAccessToken("YOUR ACCESS TOKEN");

PaymentTransactionsApi apiInstance = new PaymentTransactionsApi();
String paymentTransactionId = "paymentTransactionId_example"; // String | Payment transaction id
Object body = null; // Object | Reverse accrual input properties
try {
    PaymentTransactionsProductModel result = apiInstance.revokeAccrual(paymentTransactionId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentTransactionsApi#revokeAccrual");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **paymentTransactionId** | **String**| Payment transaction id | [required]
 **body** | **Object**| Reverse accrual input properties |

### Return type

[**PaymentTransactionsProductModel**](PaymentTransactionsProductModel.md)

### Authorization

[oauth_token](../README.md#oauth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


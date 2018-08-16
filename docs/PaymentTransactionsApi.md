# PaymentTransactionsApi

All URIs are relative to *https://connect-testing.secupay-ag.de/api/v2/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**paymentTransactionsGet**](PaymentTransactionsApi.md#paymentTransactionsGet) | **GET** Payment/Transactions | GET Payment/Transactions
[**paymentTransactionsGetById**](PaymentTransactionsApi.md#paymentTransactionsGetById) | **GET** Payment/Transactions/{id} | GET Payment/Transactions/{id}
[**paymentTransactionsIdCancelPost**](PaymentTransactionsApi.md#paymentTransactionsIdCancelPost) | **POST** Payment/Transactions/{id}/cancel | POST Payment/Transactions/{id}/cancel
[**paymentTransactionsIdShippingUrlGet**](PaymentTransactionsApi.md#paymentTransactionsIdShippingUrlGet) | **GET** Payment/Transactions/{id}/ShippingUrl | GET Payment/Transactions/{id}/ShippingUrl


<a name="paymentTransactionsGet"></a>
# **paymentTransactionsGet**
> PaymentTransactionsList paymentTransactionsGet(count, offset, fields, q, sort)

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
    PaymentTransactionsList result = apiInstance.paymentTransactionsGet(count, offset, fields, q, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentTransactionsApi#paymentTransactionsGet");
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

[**PaymentTransactionsList**](PaymentTransactionsList.md)

### Authorization

[oauth_token](../README.md#oauth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="paymentTransactionsGetById"></a>
# **paymentTransactionsGetById**
> PaymentTransactionsProductModel paymentTransactionsGetById(id)

GET Payment/Transactions/{id}

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
String id = "id_example"; // String | Search one by provided id
try {
    PaymentTransactionsProductModel result = apiInstance.paymentTransactionsGetById(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentTransactionsApi#paymentTransactionsGetById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Search one by provided id |

### Return type

[**PaymentTransactionsProductModel**](PaymentTransactionsProductModel.md)

### Authorization

[oauth_token](../README.md#oauth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="paymentTransactionsIdCancelPost"></a>
# **paymentTransactionsIdCancelPost**
> List&lt;PaymentTransactionsCancelList&gt; paymentTransactionsIdCancelPost(id)

POST Payment/Transactions/{id}/cancel

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
String id = "id_example"; // String | Transaction identifier
try {
    List<PaymentTransactionsCancelList> result = apiInstance.paymentTransactionsIdCancelPost(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentTransactionsApi#paymentTransactionsIdCancelPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Transaction identifier |

### Return type

[**List&lt;PaymentTransactionsCancelList&gt;**](PaymentTransactionsCancelList.md)

### Authorization

[oauth_token](../README.md#oauth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="paymentTransactionsIdShippingUrlGet"></a>
# **paymentTransactionsIdShippingUrlGet**
> PaymentTransactionsShippingUrl paymentTransactionsIdShippingUrlGet(id)

GET Payment/Transactions/{id}/ShippingUrl

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
String id = "id_example"; // String | Transaction identifier
try {
    PaymentTransactionsShippingUrl result = apiInstance.paymentTransactionsIdShippingUrlGet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentTransactionsApi#paymentTransactionsIdShippingUrlGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Transaction identifier |

### Return type

[**PaymentTransactionsShippingUrl**](PaymentTransactionsShippingUrl.md)

### Authorization

[oauth_token](../README.md#oauth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


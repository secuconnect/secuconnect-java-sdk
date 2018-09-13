# SmartDevicesApi

All URIs are relative to *https://connect-testing.secupay-ag.de/api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addDevice**](SmartDevicesApi.md#addDevice) | **POST** /Smart/Devices | POST Smart/Devices
[**createPrepaidTid**](SmartDevicesApi.md#createPrepaidTid) | **POST** /Smart/Devices/{smartDeviceId}/CreatePrepaidTid | POST Smart/Devices/{smartDeviceId}/CreatePrepaidTid
[**createVirtualDevice**](SmartDevicesApi.md#createVirtualDevice) | **POST** /Smart/Devices/{smartDeviceId}/CreateVirtualDevice | POST Smart/Devices/{smartDeviceId}/CreateVirtualDevice
[**getAll**](SmartDevicesApi.md#getAll) | **GET** /Smart/Devices | GET Smart/Devices
[**getOne**](SmartDevicesApi.md#getOne) | **GET** /Smart/Devices/{smartDeviceId} | GET Smart/Devices/{smartDeviceId}
[**getRouting**](SmartDevicesApi.md#getRouting) | **GET** /Smart/Devices/{smartDeviceId}/routing/type/{type} | GET Smart/Devices/{smartDeviceId}/routing/type/{type}
[**getSecubaseConfig**](SmartDevicesApi.md#getSecubaseConfig) | **POST** /Smart/Devices/{smartDeviceId}/GetSecubaseConfig | POST Smart/Devices/{smartDeviceId}/GetSecubaseConfig
[**updateDevice**](SmartDevicesApi.md#updateDevice) | **PUT** /Smart/Devices/{smartDeviceId} | PUT Smart/Devices/{smartDeviceId}


<a name="addDevice"></a>
# **addDevice**
> SmartDevicesProductModel addDevice(smartDeviceProperties)

POST Smart/Devices

Create new smart device

### Example
```java
// Import classes:
//import io.secuconnect.client.ApiClient;
//import io.secuconnect.client.ApiException;
//import io.secuconnect.client.Configuration;
//import io.secuconnect.client.auth.*;
//import io.secuconnect.client.api.SmartDevicesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_token
OAuth oauth_token = (OAuth) defaultClient.getAuthentication("oauth_token");
oauth_token.setAccessToken("YOUR ACCESS TOKEN");

SmartDevicesApi apiInstance = new SmartDevicesApi();
SmartDevicesDTO smartDeviceProperties = new SmartDevicesDTO(); // SmartDevicesDTO | Smart device properties
try {
    SmartDevicesProductModel result = apiInstance.addDevice(smartDeviceProperties);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SmartDevicesApi#addDevice");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **smartDeviceProperties** | [**SmartDevicesDTO**](SmartDevicesDTO.md)| Smart device properties | [required]

### Return type

[**SmartDevicesProductModel**](SmartDevicesProductModel.md)

### Authorization

[oauth_token](../README.md#oauth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="createPrepaidTid"></a>
# **createPrepaidTid**
> SmartDevicesProductModel createPrepaidTid(smartDeviceId, prepaidTidProperties)

POST Smart/Devices/{smartDeviceId}/CreatePrepaidTid

Create prepaid tid

### Example
```java
// Import classes:
//import io.secuconnect.client.ApiClient;
//import io.secuconnect.client.ApiException;
//import io.secuconnect.client.Configuration;
//import io.secuconnect.client.auth.*;
//import io.secuconnect.client.api.SmartDevicesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_token
OAuth oauth_token = (OAuth) defaultClient.getAuthentication("oauth_token");
oauth_token.setAccessToken("YOUR ACCESS TOKEN");

SmartDevicesApi apiInstance = new SmartDevicesApi();
String smartDeviceId = "smartDeviceId_example"; // String | Smart device id
SmartDevicesDTOPrepaidTid prepaidTidProperties = new SmartDevicesDTOPrepaidTid(); // SmartDevicesDTOPrepaidTid | Prepaid tid properties
try {
    SmartDevicesProductModel result = apiInstance.createPrepaidTid(smartDeviceId, prepaidTidProperties);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SmartDevicesApi#createPrepaidTid");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **smartDeviceId** | **String**| Smart device id | [required]
 **prepaidTidProperties** | [**SmartDevicesDTOPrepaidTid**](SmartDevicesDTOPrepaidTid.md)| Prepaid tid properties | [required]

### Return type

[**SmartDevicesProductModel**](SmartDevicesProductModel.md)

### Authorization

[oauth_token](../README.md#oauth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="createVirtualDevice"></a>
# **createVirtualDevice**
> SmartDevicesProductModel createVirtualDevice(smartDeviceId)

POST Smart/Devices/{smartDeviceId}/CreateVirtualDevice

Create virtual device

### Example
```java
// Import classes:
//import io.secuconnect.client.ApiClient;
//import io.secuconnect.client.ApiException;
//import io.secuconnect.client.Configuration;
//import io.secuconnect.client.auth.*;
//import io.secuconnect.client.api.SmartDevicesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_token
OAuth oauth_token = (OAuth) defaultClient.getAuthentication("oauth_token");
oauth_token.setAccessToken("YOUR ACCESS TOKEN");

SmartDevicesApi apiInstance = new SmartDevicesApi();
String smartDeviceId = "smartDeviceId_example"; // String | Smart device id
try {
    SmartDevicesProductModel result = apiInstance.createVirtualDevice(smartDeviceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SmartDevicesApi#createVirtualDevice");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **smartDeviceId** | **String**| Smart device id | [required]

### Return type

[**SmartDevicesProductModel**](SmartDevicesProductModel.md)

### Authorization

[oauth_token](../README.md#oauth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getAll"></a>
# **getAll**
> SmartDevicesList getAll(count, offset, fields, q, sort)

GET Smart/Devices

Get a list of smart devices

### Example
```java
// Import classes:
//import io.secuconnect.client.ApiClient;
//import io.secuconnect.client.ApiException;
//import io.secuconnect.client.Configuration;
//import io.secuconnect.client.auth.*;
//import io.secuconnect.client.api.SmartDevicesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_token
OAuth oauth_token = (OAuth) defaultClient.getAuthentication("oauth_token");
oauth_token.setAccessToken("YOUR ACCESS TOKEN");

SmartDevicesApi apiInstance = new SmartDevicesApi();
Integer count = 56; // Integer | The number of items to return.
Integer offset = 56; // Integer | The position within the whole result set to start returning items (First element is at 0).
String fields = "fields_example"; // String | List of fields to include in the result. Nested properties can be accessed with this notation: prop1.prop2  Example: prop3,prop1.prop2
String q = "q_example"; // String | A query string to restrict the returned items to given conditions. The query string must consist of any combination of single expressions in the form property:condition.  *                  A condition may contain:  *                      - wildcard \"*\" for any number of characters  *                      - wildcard \"?\" for one character  *                      - ranges in the form [value TO value]  *  *                  Single expressions may combined by 'AND', 'OR', 'NOT' operators and parenthesis '(', ')' for grouping.  *                  Property names can be nested like \"prop1.prop2\".  *                  Example: (NOT customer.name:meier*) AND (customer.age:[30 TO 40] OR customer.age:[50 TO 60])  *                  
String sort = "sort_example"; // String | String with comma separated pairs of field:order (e.g. contact.surname:asc,contact.comapnyname:desc). Result set will be sorted by included fields, in ascending 'asc', or descending 'dsc' order.
try {
    SmartDevicesList result = apiInstance.getAll(count, offset, fields, q, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SmartDevicesApi#getAll");
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

[**SmartDevicesList**](SmartDevicesList.md)

### Authorization

[oauth_token](../README.md#oauth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getOne"></a>
# **getOne**
> SmartDevicesProductModel getOne(smartDeviceId)

GET Smart/Devices/{smartDeviceId}

Get one smart device for a specific id

### Example
```java
// Import classes:
//import io.secuconnect.client.ApiClient;
//import io.secuconnect.client.ApiException;
//import io.secuconnect.client.Configuration;
//import io.secuconnect.client.auth.*;
//import io.secuconnect.client.api.SmartDevicesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_token
OAuth oauth_token = (OAuth) defaultClient.getAuthentication("oauth_token");
oauth_token.setAccessToken("YOUR ACCESS TOKEN");

SmartDevicesApi apiInstance = new SmartDevicesApi();
String smartDeviceId = "smartDeviceId_example"; // String | Smart device id
try {
    SmartDevicesProductModel result = apiInstance.getOne(smartDeviceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SmartDevicesApi#getOne");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **smartDeviceId** | **String**| Smart device id | [required]

### Return type

[**SmartDevicesProductModel**](SmartDevicesProductModel.md)

### Authorization

[oauth_token](../README.md#oauth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getRouting"></a>
# **getRouting**
> SmartDevicesList1 getRouting(smartDeviceId, type)

GET Smart/Devices/{smartDeviceId}/routing/type/{type}

Get single routing

### Example
```java
// Import classes:
//import io.secuconnect.client.ApiClient;
//import io.secuconnect.client.ApiException;
//import io.secuconnect.client.Configuration;
//import io.secuconnect.client.auth.*;
//import io.secuconnect.client.api.SmartDevicesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_token
OAuth oauth_token = (OAuth) defaultClient.getAuthentication("oauth_token");
oauth_token.setAccessToken("YOUR ACCESS TOKEN");

SmartDevicesApi apiInstance = new SmartDevicesApi();
String smartDeviceId = "smartDeviceId_example"; // String | Smart device id
String type = "type_example"; // String | Payment type
try {
    SmartDevicesList1 result = apiInstance.getRouting(smartDeviceId, type);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SmartDevicesApi#getRouting");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **smartDeviceId** | **String**| Smart device id | [required]
 **type** | **String**| Payment type | [required]

### Return type

[**SmartDevicesList1**](SmartDevicesList1.md)

### Authorization

[oauth_token](../README.md#oauth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getSecubaseConfig"></a>
# **getSecubaseConfig**
> SmartDevicesSecubaseConfig getSecubaseConfig(smartDeviceId, secubaseConfigProperties)

POST Smart/Devices/{smartDeviceId}/GetSecubaseConfig

Get secubase config

### Example
```java
// Import classes:
//import io.secuconnect.client.ApiClient;
//import io.secuconnect.client.ApiException;
//import io.secuconnect.client.Configuration;
//import io.secuconnect.client.auth.*;
//import io.secuconnect.client.api.SmartDevicesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_token
OAuth oauth_token = (OAuth) defaultClient.getAuthentication("oauth_token");
oauth_token.setAccessToken("YOUR ACCESS TOKEN");

SmartDevicesApi apiInstance = new SmartDevicesApi();
String smartDeviceId = "smartDeviceId_example"; // String | Smart device id
SmartDevicesDTOSecubaseConfig secubaseConfigProperties = new SmartDevicesDTOSecubaseConfig(); // SmartDevicesDTOSecubaseConfig | Secubase config properties
try {
    SmartDevicesSecubaseConfig result = apiInstance.getSecubaseConfig(smartDeviceId, secubaseConfigProperties);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SmartDevicesApi#getSecubaseConfig");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **smartDeviceId** | **String**| Smart device id | [required]
 **secubaseConfigProperties** | [**SmartDevicesDTOSecubaseConfig**](SmartDevicesDTOSecubaseConfig.md)| Secubase config properties | [required]

### Return type

[**SmartDevicesSecubaseConfig**](SmartDevicesSecubaseConfig.md)

### Authorization

[oauth_token](../README.md#oauth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="updateDevice"></a>
# **updateDevice**
> SmartDevicesProductModel updateDevice(smartDeviceId, smartDeviceProperties)

PUT Smart/Devices/{smartDeviceId}

Update smart device

### Example
```java
// Import classes:
//import io.secuconnect.client.ApiClient;
//import io.secuconnect.client.ApiException;
//import io.secuconnect.client.Configuration;
//import io.secuconnect.client.auth.*;
//import io.secuconnect.client.api.SmartDevicesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_token
OAuth oauth_token = (OAuth) defaultClient.getAuthentication("oauth_token");
oauth_token.setAccessToken("YOUR ACCESS TOKEN");

SmartDevicesApi apiInstance = new SmartDevicesApi();
String smartDeviceId = "smartDeviceId_example"; // String | Smart device id
SmartDevicesDTO smartDeviceProperties = new SmartDevicesDTO(); // SmartDevicesDTO | Smart device properties
try {
    SmartDevicesProductModel result = apiInstance.updateDevice(smartDeviceId, smartDeviceProperties);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SmartDevicesApi#updateDevice");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **smartDeviceId** | **String**| Smart device id | [required]
 **smartDeviceProperties** | [**SmartDevicesDTO**](SmartDevicesDTO.md)| Smart device properties | [required]

### Return type

[**SmartDevicesProductModel**](SmartDevicesProductModel.md)

### Authorization

[oauth_token](../README.md#oauth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


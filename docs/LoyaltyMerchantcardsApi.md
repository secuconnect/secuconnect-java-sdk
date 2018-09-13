# LoyaltyMerchantcardsApi

All URIs are relative to *https://connect-testing.secupay-ag.de/api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addMerchantCard**](LoyaltyMerchantcardsApi.md#addMerchantCard) | **POST** /Loyalty/MerchantCards | POST Loyalty/MerchantCards
[**checkCsc**](LoyaltyMerchantcardsApi.md#checkCsc) | **POST** /Loyalty/MerchantCards/{loyaltyMerchantCardId}/checkCsc | POST Loyalty/MerchantCards/{loyaltyMerchantCardId}/checkCsc
[**checkPassCode**](LoyaltyMerchantcardsApi.md#checkPassCode) | **POST** /Loyalty/MerchantCards/{loyaltyMerchantCardId}/checkPasscode | POST Loyalty/MerchantCards/{loyaltyMerchantCardId}/checkPasscode
[**createMerchantcards**](LoyaltyMerchantcardsApi.md#createMerchantcards) | **POST** /Loyalty/MerchantCards/{generalMerchantId}/createMerchantcards/{loyaltyCardgroupId} | POST Loyalty/MerchantCards/{generalMerchantId}/createMerchantcards/{loyaltyCardgroupId}
[**executeTransaction**](LoyaltyMerchantcardsApi.md#executeTransaction) | **POST** /Loyalty/MerchantCards/{loyaltyMerchantCardId}/transaction | POST Loyalty/MerchantCards/{loyaltyMerchantCardId}/transaction
[**getAll**](LoyaltyMerchantcardsApi.md#getAll) | **GET** /Loyalty/MerchantCards | GET Loyalty/MerchantCards
[**getLock**](LoyaltyMerchantcardsApi.md#getLock) | **GET** /Loyalty/MerchantCards/{loyaltyMerchantCardId}/lock | GET Loyalty/MerchantCards/{loyaltyMerchantCardId}/lock
[**getOne**](LoyaltyMerchantcardsApi.md#getOne) | **GET** /Loyalty/MerchantCards/{loyaltyMerchantCardId} | GET Loyalty/MerchantCards/{loyaltyMerchantCardId}
[**getRawMerchantCardId**](LoyaltyMerchantcardsApi.md#getRawMerchantCardId) | **GET** /Loyalty/MerchantCards/{generalMerchantId}/merchantcard/{loyaltyCardId} | GET Loyalty/MerchantCards/{generalMerchantId}/merchantcard/{loyaltyCardId}
[**getVirtualTerminalData**](LoyaltyMerchantcardsApi.md#getVirtualTerminalData) | **GET** /Loyalty/MerchantCards/{loyaltyMerchantCardId}/virtualTerminalData/{loyaltyMerchantId} | GET Loyalty/MerchantCards/{loyaltyMerchantCardId}/virtualTerminalData/{loyaltyMerchantId}
[**lock**](LoyaltyMerchantcardsApi.md#lock) | **POST** /Loyalty/MerchantCards/{loyaltyMerchantCardId}/lock | POST Loyalty/MerchantCards/{loyaltyMerchantCardId}/lock
[**newPassCode**](LoyaltyMerchantcardsApi.md#newPassCode) | **POST** /Loyalty/MerchantCards/{loyaltyMerchantCardId}/newPasscode | POST Loyalty/MerchantCards/{loyaltyMerchantCardId}/newPasscode
[**registerCustomer**](LoyaltyMerchantcardsApi.md#registerCustomer) | **POST** /Loyalty/MerchantCards/{loyaltyMerchantCardId}/registerCustomer | POST Loyalty/MerchantCards/{loyaltyMerchantCardId}/registerCustomer
[**removeMerchantCard**](LoyaltyMerchantcardsApi.md#removeMerchantCard) | **DELETE** /Loyalty/MerchantCards/{loyaltyMerchantCardId} | DELETE Loyalty/MerchantCards/{loyaltyMerchantCardId}
[**resetPassCode**](LoyaltyMerchantcardsApi.md#resetPassCode) | **POST** /Loyalty/MerchantCards/{loyaltyMerchantCardId}/resetPasscode | POST Loyalty/MerchantCards/{loyaltyMerchantCardId}/resetPasscode
[**setCustomer**](LoyaltyMerchantcardsApi.md#setCustomer) | **POST** /Loyalty/MerchantCards/{loyaltyMerchantCardId}/setCustomer/{loyaltyCustomerId} | POST Loyalty/MerchantCards/{loyaltyMerchantCardId}/setCustomer/{loyaltyCustomerId}
[**unlock**](LoyaltyMerchantcardsApi.md#unlock) | **POST** /Loyalty/MerchantCards/{loyaltyMerchantCardId}/unlock | POST Loyalty/MerchantCards/{loyaltyMerchantCardId}/unlock
[**updateCardGroupOfMerchantCard**](LoyaltyMerchantcardsApi.md#updateCardGroupOfMerchantCard) | **PUT** /Loyalty/MerchantCards/{loyaltyMerchantCardId}/cardgroup/{loyaltyCardGroupId} | PUT Loyalty/MerchantCards/{loyaltyMerchantCardId}/cardgroup/{loyaltyCardGroupId}
[**updateMerchantCard**](LoyaltyMerchantcardsApi.md#updateMerchantCard) | **PUT** /Loyalty/MerchantCards/{loyaltyMerchantCardId} | PUT Loyalty/MerchantCards/{loyaltyMerchantCardId}
[**validateMerchantCard**](LoyaltyMerchantcardsApi.md#validateMerchantCard) | **POST** /Loyalty/MerchantCards/{loyaltyMerchantCardId}/validateMerchantcard | POST Loyalty/MerchantCards/{loyaltyMerchantCardId}/validateMerchantcard


<a name="addMerchantCard"></a>
# **addMerchantCard**
> LoyaltyMerchantcardsProductModel addMerchantCard(body)

POST Loyalty/MerchantCards

Add new loyalty merchant card

### Example
```java
// Import classes:
//import io.secuconnect.client.ApiClient;
//import io.secuconnect.client.ApiException;
//import io.secuconnect.client.Configuration;
//import io.secuconnect.client.auth.*;
//import io.secuconnect.client.api.LoyaltyMerchantcardsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_token
OAuth oauth_token = (OAuth) defaultClient.getAuthentication("oauth_token");
oauth_token.setAccessToken("YOUR ACCESS TOKEN");

LoyaltyMerchantcardsApi apiInstance = new LoyaltyMerchantcardsApi();
LoyaltyMerchantcardsDTO body = new LoyaltyMerchantcardsDTO(); // LoyaltyMerchantcardsDTO | Loyalty merchant card properties
try {
    LoyaltyMerchantcardsProductModel result = apiInstance.addMerchantCard(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LoyaltyMerchantcardsApi#addMerchantCard");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**LoyaltyMerchantcardsDTO**](LoyaltyMerchantcardsDTO.md)| Loyalty merchant card properties | [required]

### Return type

[**LoyaltyMerchantcardsProductModel**](LoyaltyMerchantcardsProductModel.md)

### Authorization

[oauth_token](../README.md#oauth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="checkCsc"></a>
# **checkCsc**
> Object checkCsc(loyaltyMerchantCardId, body)

POST Loyalty/MerchantCards/{loyaltyMerchantCardId}/checkCsc

Check CSC

### Example
```java
// Import classes:
//import io.secuconnect.client.ApiClient;
//import io.secuconnect.client.ApiException;
//import io.secuconnect.client.Configuration;
//import io.secuconnect.client.auth.*;
//import io.secuconnect.client.api.LoyaltyMerchantcardsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_token
OAuth oauth_token = (OAuth) defaultClient.getAuthentication("oauth_token");
oauth_token.setAccessToken("YOUR ACCESS TOKEN");

LoyaltyMerchantcardsApi apiInstance = new LoyaltyMerchantcardsApi();
String loyaltyMerchantCardId = "loyaltyMerchantCardId_example"; // String | Loyalty merchant card id
LoyaltyMerchantcardsDTOCsc body = new LoyaltyMerchantcardsDTOCsc(); // LoyaltyMerchantcardsDTOCsc | Information about card
try {
    Object result = apiInstance.checkCsc(loyaltyMerchantCardId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LoyaltyMerchantcardsApi#checkCsc");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **loyaltyMerchantCardId** | **String**| Loyalty merchant card id | [required]
 **body** | [**LoyaltyMerchantcardsDTOCsc**](LoyaltyMerchantcardsDTOCsc.md)| Information about card | [required]

### Return type

**Object**

### Authorization

[oauth_token](../README.md#oauth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="checkPassCode"></a>
# **checkPassCode**
> Object checkPassCode(loyaltyMerchantCardId, body)

POST Loyalty/MerchantCards/{loyaltyMerchantCardId}/checkPasscode

Function to check the Passcode card with cardnumber

### Example
```java
// Import classes:
//import io.secuconnect.client.ApiClient;
//import io.secuconnect.client.ApiException;
//import io.secuconnect.client.Configuration;
//import io.secuconnect.client.auth.*;
//import io.secuconnect.client.api.LoyaltyMerchantcardsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_token
OAuth oauth_token = (OAuth) defaultClient.getAuthentication("oauth_token");
oauth_token.setAccessToken("YOUR ACCESS TOKEN");

LoyaltyMerchantcardsApi apiInstance = new LoyaltyMerchantcardsApi();
String loyaltyMerchantCardId = "loyaltyMerchantCardId_example"; // String | Loyalty merchant card id
LoyaltyMerchantcardsDTOCheckPasscode body = new LoyaltyMerchantcardsDTOCheckPasscode(); // LoyaltyMerchantcardsDTOCheckPasscode | Information about card
try {
    Object result = apiInstance.checkPassCode(loyaltyMerchantCardId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LoyaltyMerchantcardsApi#checkPassCode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **loyaltyMerchantCardId** | **String**| Loyalty merchant card id | [required]
 **body** | [**LoyaltyMerchantcardsDTOCheckPasscode**](LoyaltyMerchantcardsDTOCheckPasscode.md)| Information about card | [required]

### Return type

**Object**

### Authorization

[oauth_token](../README.md#oauth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="createMerchantcards"></a>
# **createMerchantcards**
> List&lt;LoyaltyMerchantcardsProductModel&gt; createMerchantcards(generalMerchantId, loyaltyCardgroupId, body)

POST Loyalty/MerchantCards/{generalMerchantId}/createMerchantcards/{loyaltyCardgroupId}

Function to create multiple merchantcards for given merchant with given cardgroup

### Example
```java
// Import classes:
//import io.secuconnect.client.ApiClient;
//import io.secuconnect.client.ApiException;
//import io.secuconnect.client.Configuration;
//import io.secuconnect.client.auth.*;
//import io.secuconnect.client.api.LoyaltyMerchantcardsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_token
OAuth oauth_token = (OAuth) defaultClient.getAuthentication("oauth_token");
oauth_token.setAccessToken("YOUR ACCESS TOKEN");

LoyaltyMerchantcardsApi apiInstance = new LoyaltyMerchantcardsApi();
String generalMerchantId = "generalMerchantId_example"; // String | General merchant id
String loyaltyCardgroupId = "loyaltyCardgroupId_example"; // String | Loyalty card group id
LoyaltyMerchantcardsDTOCardsAmount body = new LoyaltyMerchantcardsDTOCardsAmount(); // LoyaltyMerchantcardsDTOCardsAmount | Cards amount
try {
    List<LoyaltyMerchantcardsProductModel> result = apiInstance.createMerchantcards(generalMerchantId, loyaltyCardgroupId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LoyaltyMerchantcardsApi#createMerchantcards");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **generalMerchantId** | **String**| General merchant id | [required]
 **loyaltyCardgroupId** | **String**| Loyalty card group id | [required]
 **body** | [**LoyaltyMerchantcardsDTOCardsAmount**](LoyaltyMerchantcardsDTOCardsAmount.md)| Cards amount | [required]

### Return type

[**List&lt;LoyaltyMerchantcardsProductModel&gt;**](LoyaltyMerchantcardsProductModel.md)

### Authorization

[oauth_token](../README.md#oauth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="executeTransaction"></a>
# **executeTransaction**
> LoyaltyMerchantcardsProductWithReceiptModel executeTransaction(loyaltyMerchantCardId, body)

POST Loyalty/MerchantCards/{loyaltyMerchantCardId}/transaction

Execute transaction from SDK

### Example
```java
// Import classes:
//import io.secuconnect.client.ApiClient;
//import io.secuconnect.client.ApiException;
//import io.secuconnect.client.Configuration;
//import io.secuconnect.client.auth.*;
//import io.secuconnect.client.api.LoyaltyMerchantcardsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_token
OAuth oauth_token = (OAuth) defaultClient.getAuthentication("oauth_token");
oauth_token.setAccessToken("YOUR ACCESS TOKEN");

LoyaltyMerchantcardsApi apiInstance = new LoyaltyMerchantcardsApi();
String loyaltyMerchantCardId = "loyaltyMerchantCardId_example"; // String | Loyalty merchant card id
LoyaltyMerchantcardsDTOTransaction body = new LoyaltyMerchantcardsDTOTransaction(); // LoyaltyMerchantcardsDTOTransaction | Transaction properties
try {
    LoyaltyMerchantcardsProductWithReceiptModel result = apiInstance.executeTransaction(loyaltyMerchantCardId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LoyaltyMerchantcardsApi#executeTransaction");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **loyaltyMerchantCardId** | **String**| Loyalty merchant card id | [required]
 **body** | [**LoyaltyMerchantcardsDTOTransaction**](LoyaltyMerchantcardsDTOTransaction.md)| Transaction properties | [required]

### Return type

[**LoyaltyMerchantcardsProductWithReceiptModel**](LoyaltyMerchantcardsProductWithReceiptModel.md)

### Authorization

[oauth_token](../README.md#oauth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getAll"></a>
# **getAll**
> LoyaltyMerchantcardsList getAll(count, offset, fields, q, sort)

GET Loyalty/MerchantCards

Get a list of loyalty merchant cards

### Example
```java
// Import classes:
//import io.secuconnect.client.ApiClient;
//import io.secuconnect.client.ApiException;
//import io.secuconnect.client.Configuration;
//import io.secuconnect.client.auth.*;
//import io.secuconnect.client.api.LoyaltyMerchantcardsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_token
OAuth oauth_token = (OAuth) defaultClient.getAuthentication("oauth_token");
oauth_token.setAccessToken("YOUR ACCESS TOKEN");

LoyaltyMerchantcardsApi apiInstance = new LoyaltyMerchantcardsApi();
Integer count = 56; // Integer | The number of items to return.
Integer offset = 56; // Integer | The position within the whole result set to start returning items (First element is at 0).
String fields = "fields_example"; // String | List of fields to include in the result. Nested properties can be accessed with this notation: prop1.prop2  Example: prop3,prop1.prop2
String q = "q_example"; // String | A query string to restrict the returned items to given conditions. The query string must consist of any combination of single expressions in the form property:condition.  *                  A condition may contain:  *                      - wildcard \"*\" for any number of characters  *                      - wildcard \"?\" for one character  *                      - ranges in the form [value TO value]  *  *                  Single expressions may combined by 'AND', 'OR', 'NOT' operators and parenthesis '(', ')' for grouping.  *                  Property names can be nested like \"prop1.prop2\".  *                  Example: (NOT customer.name:meier*) AND (customer.age:[30 TO 40] OR customer.age:[50 TO 60])  *                  
String sort = "sort_example"; // String | String with comma separated pairs of field:order (e.g. contact.surname:asc,contact.comapnyname:desc). Result set will be sorted by included fields, in ascending 'asc', or descending 'dsc' order.
try {
    LoyaltyMerchantcardsList result = apiInstance.getAll(count, offset, fields, q, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LoyaltyMerchantcardsApi#getAll");
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

[**LoyaltyMerchantcardsList**](LoyaltyMerchantcardsList.md)

### Authorization

[oauth_token](../README.md#oauth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getLock"></a>
# **getLock**
> LoyaltyMerchantcardsDTOLock getLock(loyaltyMerchantCardId)

GET Loyalty/MerchantCards/{loyaltyMerchantCardId}/lock

Get loyalty merchant card lock information for a specific id

### Example
```java
// Import classes:
//import io.secuconnect.client.ApiClient;
//import io.secuconnect.client.ApiException;
//import io.secuconnect.client.Configuration;
//import io.secuconnect.client.auth.*;
//import io.secuconnect.client.api.LoyaltyMerchantcardsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_token
OAuth oauth_token = (OAuth) defaultClient.getAuthentication("oauth_token");
oauth_token.setAccessToken("YOUR ACCESS TOKEN");

LoyaltyMerchantcardsApi apiInstance = new LoyaltyMerchantcardsApi();
String loyaltyMerchantCardId = "loyaltyMerchantCardId_example"; // String | Loyalty merchant card id
try {
    LoyaltyMerchantcardsDTOLock result = apiInstance.getLock(loyaltyMerchantCardId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LoyaltyMerchantcardsApi#getLock");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **loyaltyMerchantCardId** | **String**| Loyalty merchant card id | [required]

### Return type

[**LoyaltyMerchantcardsDTOLock**](LoyaltyMerchantcardsDTOLock.md)

### Authorization

[oauth_token](../README.md#oauth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getOne"></a>
# **getOne**
> LoyaltyMerchantcardsProductModel getOne(loyaltyMerchantCardId)

GET Loyalty/MerchantCards/{loyaltyMerchantCardId}

Get loyalty merchant card for a specific id

### Example
```java
// Import classes:
//import io.secuconnect.client.ApiClient;
//import io.secuconnect.client.ApiException;
//import io.secuconnect.client.Configuration;
//import io.secuconnect.client.auth.*;
//import io.secuconnect.client.api.LoyaltyMerchantcardsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_token
OAuth oauth_token = (OAuth) defaultClient.getAuthentication("oauth_token");
oauth_token.setAccessToken("YOUR ACCESS TOKEN");

LoyaltyMerchantcardsApi apiInstance = new LoyaltyMerchantcardsApi();
String loyaltyMerchantCardId = "loyaltyMerchantCardId_example"; // String | Search one by provided id
try {
    LoyaltyMerchantcardsProductModel result = apiInstance.getOne(loyaltyMerchantCardId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LoyaltyMerchantcardsApi#getOne");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **loyaltyMerchantCardId** | **String**| Search one by provided id | [required]

### Return type

[**LoyaltyMerchantcardsProductModel**](LoyaltyMerchantcardsProductModel.md)

### Authorization

[oauth_token](../README.md#oauth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getRawMerchantCardId"></a>
# **getRawMerchantCardId**
> Object getRawMerchantCardId(generalMerchantId, loyaltyCardId)

GET Loyalty/MerchantCards/{generalMerchantId}/merchantcard/{loyaltyCardId}

Get raw merchant card id for merchant id and card id

### Example
```java
// Import classes:
//import io.secuconnect.client.ApiClient;
//import io.secuconnect.client.ApiException;
//import io.secuconnect.client.Configuration;
//import io.secuconnect.client.auth.*;
//import io.secuconnect.client.api.LoyaltyMerchantcardsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_token
OAuth oauth_token = (OAuth) defaultClient.getAuthentication("oauth_token");
oauth_token.setAccessToken("YOUR ACCESS TOKEN");

LoyaltyMerchantcardsApi apiInstance = new LoyaltyMerchantcardsApi();
String generalMerchantId = "generalMerchantId_example"; // String | Merchant id
String loyaltyCardId = "loyaltyCardId_example"; // String | Card id
try {
    Object result = apiInstance.getRawMerchantCardId(generalMerchantId, loyaltyCardId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LoyaltyMerchantcardsApi#getRawMerchantCardId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **generalMerchantId** | **String**| Merchant id | [required]
 **loyaltyCardId** | **String**| Card id | [required]

### Return type

**Object**

### Authorization

[oauth_token](../README.md#oauth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getVirtualTerminalData"></a>
# **getVirtualTerminalData**
> VirtualTerminalData getVirtualTerminalData(loyaltyMerchantCardId, loyaltyMerchantId)

GET Loyalty/MerchantCards/{loyaltyMerchantCardId}/virtualTerminalData/{loyaltyMerchantId}

Get virtual terminal data for merchant

### Example
```java
// Import classes:
//import io.secuconnect.client.ApiClient;
//import io.secuconnect.client.ApiException;
//import io.secuconnect.client.Configuration;
//import io.secuconnect.client.auth.*;
//import io.secuconnect.client.api.LoyaltyMerchantcardsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_token
OAuth oauth_token = (OAuth) defaultClient.getAuthentication("oauth_token");
oauth_token.setAccessToken("YOUR ACCESS TOKEN");

LoyaltyMerchantcardsApi apiInstance = new LoyaltyMerchantcardsApi();
String loyaltyMerchantCardId = "loyaltyMerchantCardId_example"; // String | Merchant card id
String loyaltyMerchantId = "loyaltyMerchantId_example"; // String | Merchant id
try {
    VirtualTerminalData result = apiInstance.getVirtualTerminalData(loyaltyMerchantCardId, loyaltyMerchantId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LoyaltyMerchantcardsApi#getVirtualTerminalData");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **loyaltyMerchantCardId** | **String**| Merchant card id | [required]
 **loyaltyMerchantId** | **String**| Merchant id | [required]

### Return type

[**VirtualTerminalData**](VirtualTerminalData.md)

### Authorization

[oauth_token](../README.md#oauth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="lock"></a>
# **lock**
> LoyaltyMerchantcardsProductModel lock(loyaltyMerchantCardId, body)

POST Loyalty/MerchantCards/{loyaltyMerchantCardId}/lock

Lock merchant card

### Example
```java
// Import classes:
//import io.secuconnect.client.ApiClient;
//import io.secuconnect.client.ApiException;
//import io.secuconnect.client.Configuration;
//import io.secuconnect.client.auth.*;
//import io.secuconnect.client.api.LoyaltyMerchantcardsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_token
OAuth oauth_token = (OAuth) defaultClient.getAuthentication("oauth_token");
oauth_token.setAccessToken("YOUR ACCESS TOKEN");

LoyaltyMerchantcardsApi apiInstance = new LoyaltyMerchantcardsApi();
String loyaltyMerchantCardId = "loyaltyMerchantCardId_example"; // String | Loyalty merchant card id
LoyaltyMerchantcardsDTOLock body = new LoyaltyMerchantcardsDTOLock(); // LoyaltyMerchantcardsDTOLock | Information about lock
try {
    LoyaltyMerchantcardsProductModel result = apiInstance.lock(loyaltyMerchantCardId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LoyaltyMerchantcardsApi#lock");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **loyaltyMerchantCardId** | **String**| Loyalty merchant card id | [required]
 **body** | [**LoyaltyMerchantcardsDTOLock**](LoyaltyMerchantcardsDTOLock.md)| Information about lock | [required]

### Return type

[**LoyaltyMerchantcardsProductModel**](LoyaltyMerchantcardsProductModel.md)

### Authorization

[oauth_token](../README.md#oauth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="newPassCode"></a>
# **newPassCode**
> Object newPassCode(loyaltyMerchantCardId, body)

POST Loyalty/MerchantCards/{loyaltyMerchantCardId}/newPasscode

Function to save new given passcode for given merchantcard identified by cardnumber

### Example
```java
// Import classes:
//import io.secuconnect.client.ApiClient;
//import io.secuconnect.client.ApiException;
//import io.secuconnect.client.Configuration;
//import io.secuconnect.client.auth.*;
//import io.secuconnect.client.api.LoyaltyMerchantcardsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_token
OAuth oauth_token = (OAuth) defaultClient.getAuthentication("oauth_token");
oauth_token.setAccessToken("YOUR ACCESS TOKEN");

LoyaltyMerchantcardsApi apiInstance = new LoyaltyMerchantcardsApi();
String loyaltyMerchantCardId = "loyaltyMerchantCardId_example"; // String | Loyalty merchant card id
LoyaltyMerchantcardsDTONewPasscode body = new LoyaltyMerchantcardsDTONewPasscode(); // LoyaltyMerchantcardsDTONewPasscode | Information about card
try {
    Object result = apiInstance.newPassCode(loyaltyMerchantCardId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LoyaltyMerchantcardsApi#newPassCode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **loyaltyMerchantCardId** | **String**| Loyalty merchant card id | [required]
 **body** | [**LoyaltyMerchantcardsDTONewPasscode**](LoyaltyMerchantcardsDTONewPasscode.md)| Information about card | [required]

### Return type

**Object**

### Authorization

[oauth_token](../README.md#oauth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="registerCustomer"></a>
# **registerCustomer**
> LoyaltyMerchantcardsProductModel registerCustomer(loyaltyMerchantCardId, body)

POST Loyalty/MerchantCards/{loyaltyMerchantCardId}/registerCustomer

Register new customer for a card

### Example
```java
// Import classes:
//import io.secuconnect.client.ApiClient;
//import io.secuconnect.client.ApiException;
//import io.secuconnect.client.Configuration;
//import io.secuconnect.client.auth.*;
//import io.secuconnect.client.api.LoyaltyMerchantcardsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_token
OAuth oauth_token = (OAuth) defaultClient.getAuthentication("oauth_token");
oauth_token.setAccessToken("YOUR ACCESS TOKEN");

LoyaltyMerchantcardsApi apiInstance = new LoyaltyMerchantcardsApi();
String loyaltyMerchantCardId = "loyaltyMerchantCardId_example"; // String | Loyalty merchant card id
LoyaltyCustomersDTO body = new LoyaltyCustomersDTO(); // LoyaltyCustomersDTO | Loyalty customer properties
try {
    LoyaltyMerchantcardsProductModel result = apiInstance.registerCustomer(loyaltyMerchantCardId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LoyaltyMerchantcardsApi#registerCustomer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **loyaltyMerchantCardId** | **String**| Loyalty merchant card id | [required]
 **body** | [**LoyaltyCustomersDTO**](LoyaltyCustomersDTO.md)| Loyalty customer properties | [required]

### Return type

[**LoyaltyMerchantcardsProductModel**](LoyaltyMerchantcardsProductModel.md)

### Authorization

[oauth_token](../README.md#oauth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="removeMerchantCard"></a>
# **removeMerchantCard**
> LoyaltyMerchantcardsProductModel removeMerchantCard(loyaltyMerchantCardId)

DELETE Loyalty/MerchantCards/{loyaltyMerchantCardId}

Delete loyalty merchant card

### Example
```java
// Import classes:
//import io.secuconnect.client.ApiClient;
//import io.secuconnect.client.ApiException;
//import io.secuconnect.client.Configuration;
//import io.secuconnect.client.auth.*;
//import io.secuconnect.client.api.LoyaltyMerchantcardsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_token
OAuth oauth_token = (OAuth) defaultClient.getAuthentication("oauth_token");
oauth_token.setAccessToken("YOUR ACCESS TOKEN");

LoyaltyMerchantcardsApi apiInstance = new LoyaltyMerchantcardsApi();
String loyaltyMerchantCardId = "loyaltyMerchantCardId_example"; // String | Loyalty merchant card id
try {
    LoyaltyMerchantcardsProductModel result = apiInstance.removeMerchantCard(loyaltyMerchantCardId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LoyaltyMerchantcardsApi#removeMerchantCard");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **loyaltyMerchantCardId** | **String**| Loyalty merchant card id | [required]

### Return type

[**LoyaltyMerchantcardsProductModel**](LoyaltyMerchantcardsProductModel.md)

### Authorization

[oauth_token](../README.md#oauth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="resetPassCode"></a>
# **resetPassCode**
> Object resetPassCode(loyaltyMerchantCardId, body)

POST Loyalty/MerchantCards/{loyaltyMerchantCardId}/resetPasscode

Function to reset a passcode for given merchantcard

### Example
```java
// Import classes:
//import io.secuconnect.client.ApiClient;
//import io.secuconnect.client.ApiException;
//import io.secuconnect.client.Configuration;
//import io.secuconnect.client.auth.*;
//import io.secuconnect.client.api.LoyaltyMerchantcardsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_token
OAuth oauth_token = (OAuth) defaultClient.getAuthentication("oauth_token");
oauth_token.setAccessToken("YOUR ACCESS TOKEN");

LoyaltyMerchantcardsApi apiInstance = new LoyaltyMerchantcardsApi();
String loyaltyMerchantCardId = "loyaltyMerchantCardId_example"; // String | Loyalty merchant card id
LoyaltyMerchantcardsDTOResetPasscode body = new LoyaltyMerchantcardsDTOResetPasscode(); // LoyaltyMerchantcardsDTOResetPasscode | Information about card
try {
    Object result = apiInstance.resetPassCode(loyaltyMerchantCardId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LoyaltyMerchantcardsApi#resetPassCode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **loyaltyMerchantCardId** | **String**| Loyalty merchant card id | [required]
 **body** | [**LoyaltyMerchantcardsDTOResetPasscode**](LoyaltyMerchantcardsDTOResetPasscode.md)| Information about card | [required]

### Return type

**Object**

### Authorization

[oauth_token](../README.md#oauth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="setCustomer"></a>
# **setCustomer**
> LoyaltyMerchantcardsProductModel setCustomer(loyaltyMerchantCardId, loyaltyCustomerId)

POST Loyalty/MerchantCards/{loyaltyMerchantCardId}/setCustomer/{loyaltyCustomerId}

Set loyalty customer for a loyalty merchant card

### Example
```java
// Import classes:
//import io.secuconnect.client.ApiClient;
//import io.secuconnect.client.ApiException;
//import io.secuconnect.client.Configuration;
//import io.secuconnect.client.auth.*;
//import io.secuconnect.client.api.LoyaltyMerchantcardsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_token
OAuth oauth_token = (OAuth) defaultClient.getAuthentication("oauth_token");
oauth_token.setAccessToken("YOUR ACCESS TOKEN");

LoyaltyMerchantcardsApi apiInstance = new LoyaltyMerchantcardsApi();
String loyaltyMerchantCardId = "loyaltyMerchantCardId_example"; // String | Loyalty merchant card id
String loyaltyCustomerId = "loyaltyCustomerId_example"; // String | Loyalty customer id
try {
    LoyaltyMerchantcardsProductModel result = apiInstance.setCustomer(loyaltyMerchantCardId, loyaltyCustomerId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LoyaltyMerchantcardsApi#setCustomer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **loyaltyMerchantCardId** | **String**| Loyalty merchant card id | [required]
 **loyaltyCustomerId** | **String**| Loyalty customer id | [required]

### Return type

[**LoyaltyMerchantcardsProductModel**](LoyaltyMerchantcardsProductModel.md)

### Authorization

[oauth_token](../README.md#oauth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="unlock"></a>
# **unlock**
> LoyaltyMerchantcardsProductModel unlock(loyaltyMerchantCardId, body)

POST Loyalty/MerchantCards/{loyaltyMerchantCardId}/unlock

Unlock merchant card

### Example
```java
// Import classes:
//import io.secuconnect.client.ApiClient;
//import io.secuconnect.client.ApiException;
//import io.secuconnect.client.Configuration;
//import io.secuconnect.client.auth.*;
//import io.secuconnect.client.api.LoyaltyMerchantcardsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_token
OAuth oauth_token = (OAuth) defaultClient.getAuthentication("oauth_token");
oauth_token.setAccessToken("YOUR ACCESS TOKEN");

LoyaltyMerchantcardsApi apiInstance = new LoyaltyMerchantcardsApi();
String loyaltyMerchantCardId = "loyaltyMerchantCardId_example"; // String | Loyalty merchant card id
LoyaltyMerchantcardsDTOLock body = new LoyaltyMerchantcardsDTOLock(); // LoyaltyMerchantcardsDTOLock | Information about unlock
try {
    LoyaltyMerchantcardsProductModel result = apiInstance.unlock(loyaltyMerchantCardId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LoyaltyMerchantcardsApi#unlock");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **loyaltyMerchantCardId** | **String**| Loyalty merchant card id | [required]
 **body** | [**LoyaltyMerchantcardsDTOLock**](LoyaltyMerchantcardsDTOLock.md)| Information about unlock | [required]

### Return type

[**LoyaltyMerchantcardsProductModel**](LoyaltyMerchantcardsProductModel.md)

### Authorization

[oauth_token](../README.md#oauth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="updateCardGroupOfMerchantCard"></a>
# **updateCardGroupOfMerchantCard**
> LoyaltyMerchantcardsProductModel updateCardGroupOfMerchantCard(loyaltyMerchantCardId, loyaltyCardGroupId)

PUT Loyalty/MerchantCards/{loyaltyMerchantCardId}/cardgroup/{loyaltyCardGroupId}

Update loyalty card group

### Example
```java
// Import classes:
//import io.secuconnect.client.ApiClient;
//import io.secuconnect.client.ApiException;
//import io.secuconnect.client.Configuration;
//import io.secuconnect.client.auth.*;
//import io.secuconnect.client.api.LoyaltyMerchantcardsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_token
OAuth oauth_token = (OAuth) defaultClient.getAuthentication("oauth_token");
oauth_token.setAccessToken("YOUR ACCESS TOKEN");

LoyaltyMerchantcardsApi apiInstance = new LoyaltyMerchantcardsApi();
String loyaltyMerchantCardId = "loyaltyMerchantCardId_example"; // String | Loyalty merchant card id
String loyaltyCardGroupId = "loyaltyCardGroupId_example"; // String | Loyalty card group id
try {
    LoyaltyMerchantcardsProductModel result = apiInstance.updateCardGroupOfMerchantCard(loyaltyMerchantCardId, loyaltyCardGroupId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LoyaltyMerchantcardsApi#updateCardGroupOfMerchantCard");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **loyaltyMerchantCardId** | **String**| Loyalty merchant card id | [required]
 **loyaltyCardGroupId** | **String**| Loyalty card group id | [required]

### Return type

[**LoyaltyMerchantcardsProductModel**](LoyaltyMerchantcardsProductModel.md)

### Authorization

[oauth_token](../README.md#oauth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="updateMerchantCard"></a>
# **updateMerchantCard**
> LoyaltyMerchantcardsProductModel updateMerchantCard(loyaltyMerchantCardId, body)

PUT Loyalty/MerchantCards/{loyaltyMerchantCardId}

Update loyalty merchant card

### Example
```java
// Import classes:
//import io.secuconnect.client.ApiClient;
//import io.secuconnect.client.ApiException;
//import io.secuconnect.client.Configuration;
//import io.secuconnect.client.auth.*;
//import io.secuconnect.client.api.LoyaltyMerchantcardsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_token
OAuth oauth_token = (OAuth) defaultClient.getAuthentication("oauth_token");
oauth_token.setAccessToken("YOUR ACCESS TOKEN");

LoyaltyMerchantcardsApi apiInstance = new LoyaltyMerchantcardsApi();
String loyaltyMerchantCardId = "loyaltyMerchantCardId_example"; // String | Loyalty merchant card id
LoyaltyMerchantcardsDTO body = new LoyaltyMerchantcardsDTO(); // LoyaltyMerchantcardsDTO | Loyalty merchant card properties
try {
    LoyaltyMerchantcardsProductModel result = apiInstance.updateMerchantCard(loyaltyMerchantCardId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LoyaltyMerchantcardsApi#updateMerchantCard");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **loyaltyMerchantCardId** | **String**| Loyalty merchant card id | [required]
 **body** | [**LoyaltyMerchantcardsDTO**](LoyaltyMerchantcardsDTO.md)| Loyalty merchant card properties | [required]

### Return type

[**LoyaltyMerchantcardsProductModel**](LoyaltyMerchantcardsProductModel.md)

### Authorization

[oauth_token](../README.md#oauth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="validateMerchantCard"></a>
# **validateMerchantCard**
> LoyaltyMerchantcardsValidateMerchantCard validateMerchantCard(loyaltyMerchantCardId, body)

POST Loyalty/MerchantCards/{loyaltyMerchantCardId}/validateMerchantcard

Function to check the merchant card

### Example
```java
// Import classes:
//import io.secuconnect.client.ApiClient;
//import io.secuconnect.client.ApiException;
//import io.secuconnect.client.Configuration;
//import io.secuconnect.client.auth.*;
//import io.secuconnect.client.api.LoyaltyMerchantcardsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_token
OAuth oauth_token = (OAuth) defaultClient.getAuthentication("oauth_token");
oauth_token.setAccessToken("YOUR ACCESS TOKEN");

LoyaltyMerchantcardsApi apiInstance = new LoyaltyMerchantcardsApi();
String loyaltyMerchantCardId = "loyaltyMerchantCardId_example"; // String | Loyalty merchant card id
LoyaltyMerchantcardsDTOValidateMerchantCard body = new LoyaltyMerchantcardsDTOValidateMerchantCard(); // LoyaltyMerchantcardsDTOValidateMerchantCard | Information about card
try {
    LoyaltyMerchantcardsValidateMerchantCard result = apiInstance.validateMerchantCard(loyaltyMerchantCardId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LoyaltyMerchantcardsApi#validateMerchantCard");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **loyaltyMerchantCardId** | **String**| Loyalty merchant card id | [required]
 **body** | [**LoyaltyMerchantcardsDTOValidateMerchantCard**](LoyaltyMerchantcardsDTOValidateMerchantCard.md)| Information about card | [required]

### Return type

[**LoyaltyMerchantcardsValidateMerchantCard**](LoyaltyMerchantcardsValidateMerchantCard.md)

### Authorization

[oauth_token](../README.md#oauth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


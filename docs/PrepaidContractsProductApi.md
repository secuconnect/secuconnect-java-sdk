# PrepaidContractsProductApi

All URIs are relative to *https://connect-testing.secupay-ag.de/api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**mappingZvt**](PrepaidContractsProductApi.md#mappingZvt) | **POST** /Prepaid/Contracts/{prepaidContractId}/mappingZvt | POST Prepaid/Contracts/null/mappingZvt


<a name="mappingZvt"></a>
# **mappingZvt**
> PrepaidMappingZvt mappingZvt(prepaidContractId, body)

POST Prepaid/Contracts/null/mappingZvt

Gets prepaid item id from product id which is configured in prepaid contracts

### Example
```java
// Import classes:
//import io.secuconnect.client.ApiClient;
//import io.secuconnect.client.ApiException;
//import io.secuconnect.client.Configuration;
//import io.secuconnect.client.auth.*;
//import io.secuconnect.client.api.PrepaidContractsProductApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_token
OAuth oauth_token = (OAuth) defaultClient.getAuthentication("oauth_token");
oauth_token.setAccessToken("YOUR ACCESS TOKEN");

PrepaidContractsProductApi apiInstance = new PrepaidContractsProductApi();
String prepaidContractId = "prepaidContractId_example"; // String | Prepaid contract id
PrepaidZvtDTO body = new PrepaidZvtDTO(); // PrepaidZvtDTO | Prepaid transaction input properties
try {
    PrepaidMappingZvt result = apiInstance.mappingZvt(prepaidContractId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrepaidContractsProductApi#mappingZvt");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **prepaidContractId** | **String**| Prepaid contract id | [required]
 **body** | [**PrepaidZvtDTO**](PrepaidZvtDTO.md)| Prepaid transaction input properties |

### Return type

[**PrepaidMappingZvt**](PrepaidMappingZvt.md)

### Authorization

[oauth_token](../README.md#oauth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


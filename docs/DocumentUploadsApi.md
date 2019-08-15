# DocumentUploadsApi

All URIs are relative to *https://connect-testing.secupay-ag.de/api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**documentUploadsMultipartPost**](DocumentUploadsApi.md#documentUploadsMultipartPost) | **POST** /Document/Uploads?multipart | POST Document/Uploads
[**documentUploadsPost**](DocumentUploadsApi.md#documentUploadsPost) | **POST** /Document/Uploads | POST Document/Uploads


<a name="documentUploadsMultipartPost"></a>
# **documentUploadsMultipartPost**
> DocumentUploadsProductModel documentUploadsMultipartPost(fileToUpload)

POST Document/Uploads

Store uploaded file

### Example
```java
// Import classes:
//import io.secuconnect.client.ApiClient;
//import io.secuconnect.client.ApiException;
//import io.secuconnect.client.Configuration;
//import io.secuconnect.client.auth.*;
//import io.secuconnect.client.api.DocumentUploadsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_token
OAuth oauth_token = (OAuth) defaultClient.getAuthentication("oauth_token");
oauth_token.setAccessToken("YOUR ACCESS TOKEN");

DocumentUploadsApi apiInstance = new DocumentUploadsApi();
File fileToUpload = new File("/path/to/file.txt"); // File | File to upload
try {
    DocumentUploadsProductModel result = apiInstance.documentUploadsMultipartPost(fileToUpload);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DocumentUploadsApi#documentUploadsMultipartPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fileToUpload** | **File**| File to upload | [required]

### Return type

[**DocumentUploadsProductModel**](DocumentUploadsProductModel.md)

### Authorization

[oauth_token](../README.md#oauth_token)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: Not defined

<a name="documentUploadsPost"></a>
# **documentUploadsPost**
> DocumentUploadsBaseProductModel documentUploadsPost(content)

POST Document/Uploads

Store uploaded file

### Example
```java
// Import classes:
//import io.secuconnect.client.ApiClient;
//import io.secuconnect.client.ApiException;
//import io.secuconnect.client.Configuration;
//import io.secuconnect.client.auth.*;
//import io.secuconnect.client.api.DocumentUploadsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_token
OAuth oauth_token = (OAuth) defaultClient.getAuthentication("oauth_token");
oauth_token.setAccessToken("YOUR ACCESS TOKEN");

DocumentUploadsApi apiInstance = new DocumentUploadsApi();
DocumentUploadsDTOContent content = new DocumentUploadsDTOContent(); // DocumentUploadsDTOContent | Content
try {
    DocumentUploadsBaseProductModel result = apiInstance.documentUploadsPost(content);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DocumentUploadsApi#documentUploadsPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **content** | [**DocumentUploadsDTOContent**](DocumentUploadsDTOContent.md)| Content | [required]

### Return type

[**DocumentUploadsBaseProductModel**](DocumentUploadsBaseProductModel.md)

### Authorization

[oauth_token](../README.md#oauth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


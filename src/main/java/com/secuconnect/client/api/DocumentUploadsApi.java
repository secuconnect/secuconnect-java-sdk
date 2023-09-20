package com.secuconnect.client.api;

import com.google.gson.reflect.TypeToken;
import com.secuconnect.client.*;
import com.secuconnect.client.model.DocumentUploadsBaseProductModel;
import com.secuconnect.client.model.DocumentUploadsDTOContent;
import com.secuconnect.client.model.DocumentUploadsProductModel;
import com.secuconnect.client.model.DocumentUploadsProductModelWithContent;
import com.secuconnect.client.model.FileToUpload;
import com.secuconnect.client.model.ProductExceptionPayload;
import okhttp3.Call;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DocumentUploadsApi {
    private ApiClient apiClient;

    public DocumentUploadsApi() {
        this(Environment.getGlobalEnv().getApiClient());
    }

    public DocumentUploadsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for documentUploadsMultipartPost
     * @param body Input data format
     * @param multipart 
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public Call documentUploadsMultipartPostCall(FileToUpload body, String multipart) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/Document/Uploads?multipart";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (multipart != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("multipart", multipart));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "oauth_token" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames);
    }

    @SuppressWarnings("rawtypes")
    private Call documentUploadsMultipartPostValidateBeforeCall(FileToUpload body, String multipart) throws ApiException {

        return documentUploadsMultipartPostCall(body, multipart);
    }

    /**
     * Upload File / multipart MIME
     * Creates a new Docuemt Upload from the given data.
     * @param body Input data format
     * @param multipart 
     * @return DocumentUploadsProductModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DocumentUploadsProductModel documentUploadsMultipartPost(FileToUpload body, String multipart) throws ApiException {
        ApiResponse<DocumentUploadsProductModel> resp = documentUploadsMultipartPostWithHttpInfo(body, multipart);
        return resp.getData();
    }

    /**
     * Upload File / multipart MIME
     * Creates a new Docuemt Upload from the given data.
     * @param body Input data format
     * @param multipart 
     * @return ApiResponse&lt;DocumentUploadsProductModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<DocumentUploadsProductModel> documentUploadsMultipartPostWithHttpInfo(FileToUpload body, String multipart) throws ApiException {
        Call call = documentUploadsMultipartPostValidateBeforeCall(body, multipart);
        Type localVarReturnType = new TypeToken<DocumentUploadsProductModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Upload File / multipart MIME (asynchronously)
     * Creates a new Docuemt Upload from the given data.
     * @param body Input data format
     * @param multipart 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call documentUploadsMultipartPostAsync(FileToUpload body, String multipart, final ApiCallback<DocumentUploadsProductModel> callback) throws ApiException {
        Call call = documentUploadsMultipartPostValidateBeforeCall(body, multipart);
        Type localVarReturnType = new TypeToken<DocumentUploadsProductModel>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for documentUploadsPost
     * @param body Content
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public Call documentUploadsPostCall(DocumentUploadsDTOContent body) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/Document/Uploads";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "oauth_token" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames);
    }

    @SuppressWarnings("rawtypes")
    private Call documentUploadsPostValidateBeforeCall(DocumentUploadsDTOContent body) throws ApiException {

        return documentUploadsPostCall(body);
    }

    /**
     * Upload File / JSON
     * Creates a new Document Upload from the given data.
     * @param body Content
     * @return DocumentUploadsBaseProductModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DocumentUploadsBaseProductModel documentUploadsPost(DocumentUploadsDTOContent body) throws ApiException {
        ApiResponse<DocumentUploadsBaseProductModel> resp = documentUploadsPostWithHttpInfo(body);
        return resp.getData();
    }

    /**
     * Upload File / JSON
     * Creates a new Document Upload from the given data.
     * @param body Content
     * @return ApiResponse&lt;DocumentUploadsBaseProductModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<DocumentUploadsBaseProductModel> documentUploadsPostWithHttpInfo(DocumentUploadsDTOContent body) throws ApiException {
        Call call = documentUploadsPostValidateBeforeCall(body);
        Type localVarReturnType = new TypeToken<DocumentUploadsBaseProductModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Upload File / JSON (asynchronously)
     * Creates a new Document Upload from the given data.
     * @param body Content
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call documentUploadsPostAsync(DocumentUploadsDTOContent body, final ApiCallback<DocumentUploadsBaseProductModel> callback) throws ApiException {
        Call call = documentUploadsPostValidateBeforeCall(body);
        Type localVarReturnType = new TypeToken<DocumentUploadsBaseProductModel>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for download
     * @param documentUploadsId Document Uploads ID (required)
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public Call downloadCall(String documentUploadsId) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/Document/Uploads/{documentUploadsId}/Download"
            .replaceAll("\\{" + "documentUploadsId" + "\\}", apiClient.escapeString(documentUploadsId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "*/*"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "oauth_token" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames);
    }

    @SuppressWarnings("rawtypes")
    private Call downloadValidateBeforeCall(String documentUploadsId) throws ApiException {
        // verify the required parameter 'documentUploadsId' is set
        if (documentUploadsId == null) {
            throw new ApiException("Missing the required parameter 'documentUploadsId' when calling download(Async)");
        }

        return downloadCall(documentUploadsId);
    }

    /**
     * Download uploaded file
     * Downloads the contents of the specified Document Upload.
     * @param documentUploadsId Document Uploads ID (required)
     * @return String
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public String download(String documentUploadsId) throws ApiException {
        ApiResponse<String> resp = downloadWithHttpInfo(documentUploadsId);
        return resp.getData();
    }

    /**
     * Download uploaded file
     * Downloads the contents of the specified Document Upload.
     * @param documentUploadsId Document Uploads ID (required)
     * @return ApiResponse&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<String> downloadWithHttpInfo(String documentUploadsId) throws ApiException {
        Call call = downloadValidateBeforeCall(documentUploadsId);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Download uploaded file (asynchronously)
     * Downloads the contents of the specified Document Upload.
     * @param documentUploadsId Document Uploads ID (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call downloadAsync(String documentUploadsId, final ApiCallback<String> callback) throws ApiException {
        Call call = downloadValidateBeforeCall(documentUploadsId);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for getOne
     * @param documentUploadsId Document Uploads ID (required)
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public Call getOneCall(String documentUploadsId) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/Document/Uploads/{documentUploadsId}"
            .replaceAll("\\{" + "documentUploadsId" + "\\}", apiClient.escapeString(documentUploadsId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "oauth_token" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames);
    }

    @SuppressWarnings("rawtypes")
    private Call getOneValidateBeforeCall(String documentUploadsId) throws ApiException {
        // verify the required parameter 'documentUploadsId' is set
        if (documentUploadsId == null) {
            throw new ApiException("Missing the required parameter 'documentUploadsId' when calling getOne(Async)");
        }

        return getOneCall(documentUploadsId);
    }

    /**
     * Read Document Upload
     * Returns the specified Document Upload.
     * @param documentUploadsId Document Uploads ID (required)
     * @return DocumentUploadsProductModelWithContent
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DocumentUploadsProductModelWithContent getOne(String documentUploadsId) throws ApiException {
        ApiResponse<DocumentUploadsProductModelWithContent> resp = getOneWithHttpInfo(documentUploadsId);
        return resp.getData();
    }

    /**
     * Read Document Upload
     * Returns the specified Document Upload.
     * @param documentUploadsId Document Uploads ID (required)
     * @return ApiResponse&lt;DocumentUploadsProductModelWithContent&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<DocumentUploadsProductModelWithContent> getOneWithHttpInfo(String documentUploadsId) throws ApiException {
        Call call = getOneValidateBeforeCall(documentUploadsId);
        Type localVarReturnType = new TypeToken<DocumentUploadsProductModelWithContent>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Read Document Upload (asynchronously)
     * Returns the specified Document Upload.
     * @param documentUploadsId Document Uploads ID (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call getOneAsync(String documentUploadsId, final ApiCallback<DocumentUploadsProductModelWithContent> callback) throws ApiException {
        Call call = getOneValidateBeforeCall(documentUploadsId);
        Type localVarReturnType = new TypeToken<DocumentUploadsProductModelWithContent>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}

package io.secuconnect.client.api;

import io.secuconnect.client.ApiCallback;
import io.secuconnect.client.ApiClient;
import io.secuconnect.client.ApiException;
import io.secuconnect.client.ApiResponse;
import io.secuconnect.client.Configuration;
import io.secuconnect.client.Pair;
import io.secuconnect.client.ProgressRequestBody;
import io.secuconnect.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;

import io.secuconnect.client.model.DocumentUploadsBaseProductModel;
import io.secuconnect.client.model.DocumentUploadsDTOContent;
import io.secuconnect.client.model.DocumentUploadsProductModel;
import io.secuconnect.client.model.FileToUpload;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DocumentUploadsApi {
    private ApiClient apiClient;

    public DocumentUploadsApi() {
        this(Configuration.getDefaultApiClient());
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
     * Build call for documentUploadsdocumentUploadsMultipartPost
     * @param body Input data format (optional)
     * @param multipart  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call documentUploadsdocumentUploadsMultipartPostCall(FileToUpload body, String multipart, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
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

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "oauth_token" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call documentUploadsdocumentUploadsMultipartPostValidateBeforeCall(FileToUpload body, String multipart, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = documentUploadsdocumentUploadsMultipartPostCall(body, multipart, progressListener, progressRequestListener);
        return call;
    }

    /**
     * POST Document/Uploads
     * Store uploaded file
     * @param body Input data format (optional)
     * @param multipart  (optional)
     * @return DocumentUploadsProductModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DocumentUploadsProductModel documentUploadsdocumentUploadsMultipartPost(FileToUpload body, String multipart) throws ApiException {
        ApiResponse<DocumentUploadsProductModel> resp = documentUploadsdocumentUploadsMultipartPostWithHttpInfo(body, multipart);
        return resp.getData();
    }

    /**
     * POST Document/Uploads
     * Store uploaded file
     * @param body Input data format (optional)
     * @param multipart  (optional)
     * @return ApiResponse&lt;DocumentUploadsProductModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<DocumentUploadsProductModel> documentUploadsdocumentUploadsMultipartPostWithHttpInfo(FileToUpload body, String multipart) throws ApiException {
        com.squareup.okhttp.Call call = documentUploadsdocumentUploadsMultipartPostValidateBeforeCall(body, multipart, null, null);
        Type localVarReturnType = new TypeToken<DocumentUploadsProductModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * POST Document/Uploads (asynchronously)
     * Store uploaded file
     * @param body Input data format (optional)
     * @param multipart  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call documentUploadsdocumentUploadsMultipartPostAsync(FileToUpload body, String multipart, final ApiCallback<DocumentUploadsProductModel> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = documentUploadsdocumentUploadsMultipartPostValidateBeforeCall(body, multipart, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<DocumentUploadsProductModel>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for documentUploadsdocumentUploadsPost
     * @param body Content (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call documentUploadsdocumentUploadsPostCall(DocumentUploadsDTOContent body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
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

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "oauth_token" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call documentUploadsdocumentUploadsPostValidateBeforeCall(DocumentUploadsDTOContent body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = documentUploadsdocumentUploadsPostCall(body, progressListener, progressRequestListener);
        return call;
    }

    /**
     * POST Document/Uploads
     * Store uploaded file
     * @param body Content (optional)
     * @return DocumentUploadsBaseProductModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DocumentUploadsBaseProductModel documentUploadsdocumentUploadsPost(DocumentUploadsDTOContent body) throws ApiException {
        ApiResponse<DocumentUploadsBaseProductModel> resp = documentUploadsdocumentUploadsPostWithHttpInfo(body);
        return resp.getData();
    }

    /**
     * POST Document/Uploads
     * Store uploaded file
     * @param body Content (optional)
     * @return ApiResponse&lt;DocumentUploadsBaseProductModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<DocumentUploadsBaseProductModel> documentUploadsdocumentUploadsPostWithHttpInfo(DocumentUploadsDTOContent body) throws ApiException {
        com.squareup.okhttp.Call call = documentUploadsdocumentUploadsPostValidateBeforeCall(body, null, null);
        Type localVarReturnType = new TypeToken<DocumentUploadsBaseProductModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * POST Document/Uploads (asynchronously)
     * Store uploaded file
     * @param body Content (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call documentUploadsdocumentUploadsPostAsync(DocumentUploadsDTOContent body, final ApiCallback<DocumentUploadsBaseProductModel> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = documentUploadsdocumentUploadsPostValidateBeforeCall(body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<DocumentUploadsBaseProductModel>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}

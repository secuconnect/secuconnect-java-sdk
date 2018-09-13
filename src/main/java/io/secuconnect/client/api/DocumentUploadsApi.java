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
import java.io.File;
import io.secuconnect.client.model.ProductExceptionPayload;
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
     * Build call for documentUploadsPost
     * @param content Content (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call documentUploadsPostCall(DocumentUploadsDTOContent content, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = content;
        
        // create path and map variables
        String localVarPath = "/Document/Uploads";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
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
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call documentUploadsPostValidateBeforeCall(DocumentUploadsDTOContent content, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'content' is set
        if (content == null) {
            throw new ApiException("Missing the required parameter 'content' when calling documentUploadsPost(Async)");
        }
        
        
        com.squareup.okhttp.Call call = documentUploadsPostCall(content, progressListener, progressRequestListener);
        return call;
    }

    /**
     * POST Document/Uploads
     * Store uploaded file
     * @param content Content (required)
     * @return DocumentUploadsBaseProductModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DocumentUploadsBaseProductModel documentUploadsPost(DocumentUploadsDTOContent content) throws ApiException {
        ApiResponse<DocumentUploadsBaseProductModel> resp = documentUploadsPostWithHttpInfo(content);
        return resp.getData();
    }

    /**
     * POST Document/Uploads
     * Store uploaded file
     * @param content Content (required)
     * @return ApiResponse&lt;DocumentUploadsBaseProductModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<DocumentUploadsBaseProductModel> documentUploadsPostWithHttpInfo(DocumentUploadsDTOContent content) throws ApiException {
        com.squareup.okhttp.Call call = documentUploadsPostValidateBeforeCall(content, null, null);
        Type localVarReturnType = new TypeToken<DocumentUploadsBaseProductModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * POST Document/Uploads (asynchronously)
     * Store uploaded file
     * @param content Content (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call documentUploadsPostAsync(DocumentUploadsDTOContent content, final ApiCallback<DocumentUploadsBaseProductModel> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = documentUploadsPostValidateBeforeCall(content, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<DocumentUploadsBaseProductModel>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for documentUploadsmultipartPost
     * @param fileToUpload File to upload (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call documentUploadsmultipartPostCall(File fileToUpload, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Document/Uploads?multipart";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (fileToUpload != null)
        localVarFormParams.put("fileToUpload", fileToUpload);

        final String[] localVarAccepts = {
            
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "multipart/form-data"
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
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call documentUploadsmultipartPostValidateBeforeCall(File fileToUpload, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'fileToUpload' is set
        if (fileToUpload == null) {
            throw new ApiException("Missing the required parameter 'fileToUpload' when calling documentUploadsmultipartPost(Async)");
        }
        
        
        com.squareup.okhttp.Call call = documentUploadsmultipartPostCall(fileToUpload, progressListener, progressRequestListener);
        return call;
    }

    /**
     * POST Document/Uploads
     * Store uploaded file
     * @param fileToUpload File to upload (required)
     * @return DocumentUploadsProductModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DocumentUploadsProductModel documentUploadsmultipartPost(File fileToUpload) throws ApiException {
        ApiResponse<DocumentUploadsProductModel> resp = documentUploadsmultipartPostWithHttpInfo(fileToUpload);
        return resp.getData();
    }

    /**
     * POST Document/Uploads
     * Store uploaded file
     * @param fileToUpload File to upload (required)
     * @return ApiResponse&lt;DocumentUploadsProductModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<DocumentUploadsProductModel> documentUploadsmultipartPostWithHttpInfo(File fileToUpload) throws ApiException {
        com.squareup.okhttp.Call call = documentUploadsmultipartPostValidateBeforeCall(fileToUpload, null, null);
        Type localVarReturnType = new TypeToken<DocumentUploadsProductModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * POST Document/Uploads (asynchronously)
     * Store uploaded file
     * @param fileToUpload File to upload (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call documentUploadsmultipartPostAsync(File fileToUpload, final ApiCallback<DocumentUploadsProductModel> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = documentUploadsmultipartPostValidateBeforeCall(fileToUpload, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<DocumentUploadsProductModel>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}

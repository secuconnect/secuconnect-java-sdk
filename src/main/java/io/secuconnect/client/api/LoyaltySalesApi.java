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

import io.secuconnect.client.model.LoyaltyCardgroupsProductModel;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LoyaltySalesApi {
    private ApiClient apiClient;

    public LoyaltySalesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public LoyaltySalesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for loyaltySalesgetCardgroupsByMerchantId
     * @param generalMerchantId Search by provided id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call loyaltySalesgetCardgroupsByMerchantIdCall(String generalMerchantId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Loyalty/Sales/{generalMerchantId}/CardGroupsByMerchantID"
            .replaceAll("\\{" + "generalMerchantId" + "\\}", apiClient.escapeString(generalMerchantId.toString()));

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
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call loyaltySalesgetCardgroupsByMerchantIdValidateBeforeCall(String generalMerchantId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'generalMerchantId' is set
        if (generalMerchantId == null) {
            throw new ApiException("Missing the required parameter 'generalMerchantId' when calling loyaltySalesgetCardgroupsByMerchantId(Async)");
        }
        
        com.squareup.okhttp.Call call = loyaltySalesgetCardgroupsByMerchantIdCall(generalMerchantId, progressListener, progressRequestListener);
        return call;
    }

    /**
     * GET Loyalty/Sales/{generalMerchantId}/CardGroupsByMerchantID
     * Get cardgroups by merchant id
     * @param generalMerchantId Search by provided id (required)
     * @return List&lt;LoyaltyCardgroupsProductModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<LoyaltyCardgroupsProductModel> loyaltySalesgetCardgroupsByMerchantId(String generalMerchantId) throws ApiException {
        ApiResponse<List<LoyaltyCardgroupsProductModel>> resp = loyaltySalesgetCardgroupsByMerchantIdWithHttpInfo(generalMerchantId);
        return resp.getData();
    }

    /**
     * GET Loyalty/Sales/{generalMerchantId}/CardGroupsByMerchantID
     * Get cardgroups by merchant id
     * @param generalMerchantId Search by provided id (required)
     * @return ApiResponse&lt;List&lt;LoyaltyCardgroupsProductModel&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<LoyaltyCardgroupsProductModel>> loyaltySalesgetCardgroupsByMerchantIdWithHttpInfo(String generalMerchantId) throws ApiException {
        com.squareup.okhttp.Call call = loyaltySalesgetCardgroupsByMerchantIdValidateBeforeCall(generalMerchantId, null, null);
        Type localVarReturnType = new TypeToken<List<LoyaltyCardgroupsProductModel>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * GET Loyalty/Sales/{generalMerchantId}/CardGroupsByMerchantID (asynchronously)
     * Get cardgroups by merchant id
     * @param generalMerchantId Search by provided id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call loyaltySalesgetCardgroupsByMerchantIdAsync(String generalMerchantId, final ApiCallback<List<LoyaltyCardgroupsProductModel>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = loyaltySalesgetCardgroupsByMerchantIdValidateBeforeCall(generalMerchantId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<LoyaltyCardgroupsProductModel>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}

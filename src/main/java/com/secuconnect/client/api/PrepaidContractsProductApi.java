package com.secuconnect.client.api;

import com.secuconnect.client.ApiCallback;
import com.secuconnect.client.ApiClient;
import com.secuconnect.client.ApiException;
import com.secuconnect.client.ApiResponse;
import com.secuconnect.client.Configuration;
import com.secuconnect.client.Pair;
import com.secuconnect.client.ProgressRequestBody;
import com.secuconnect.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;

import com.secuconnect.client.model.PrepaidMappingZvt;
import com.secuconnect.client.model.PrepaidZvtDTO;
import com.secuconnect.client.model.ProductExceptionPayload;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PrepaidContractsProductApi {
    private ApiClient apiClient;

    public PrepaidContractsProductApi() {
        this(Configuration.getDefaultApiClient());
    }

    public PrepaidContractsProductApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for prepaidContractsmappingZvt
     * @param prepaidContractId Prepaid contract id (required)
     * @param body Prepaid transaction input properties (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call prepaidContractsmappingZvtCall(String prepaidContractId, PrepaidZvtDTO body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/Prepaid/Contracts/{prepaidContractId}/mappingZvt"
            .replaceAll("\\{" + "prepaidContractId" + "\\}", apiClient.escapeString(prepaidContractId.toString()));

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
    private com.squareup.okhttp.Call prepaidContractsmappingZvtValidateBeforeCall(String prepaidContractId, PrepaidZvtDTO body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'prepaidContractId' is set
        if (prepaidContractId == null) {
            throw new ApiException("Missing the required parameter 'prepaidContractId' when calling prepaidContractsmappingZvt(Async)");
        }
        
        com.squareup.okhttp.Call call = prepaidContractsmappingZvtCall(prepaidContractId, body, progressListener, progressRequestListener);
        return call;
    }

    /**
     * POST Prepaid/Contracts/me/mappingZvt
     * Gets prepaid item id from product id which is configured in prepaid contracts
     * @param prepaidContractId Prepaid contract id (required)
     * @param body Prepaid transaction input properties (optional)
     * @return PrepaidMappingZvt
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PrepaidMappingZvt prepaidContractsmappingZvt(String prepaidContractId, PrepaidZvtDTO body) throws ApiException {
        ApiResponse<PrepaidMappingZvt> resp = prepaidContractsmappingZvtWithHttpInfo(prepaidContractId, body);
        return resp.getData();
    }

    /**
     * POST Prepaid/Contracts/me/mappingZvt
     * Gets prepaid item id from product id which is configured in prepaid contracts
     * @param prepaidContractId Prepaid contract id (required)
     * @param body Prepaid transaction input properties (optional)
     * @return ApiResponse&lt;PrepaidMappingZvt&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PrepaidMappingZvt> prepaidContractsmappingZvtWithHttpInfo(String prepaidContractId, PrepaidZvtDTO body) throws ApiException {
        com.squareup.okhttp.Call call = prepaidContractsmappingZvtValidateBeforeCall(prepaidContractId, body, null, null);
        Type localVarReturnType = new TypeToken<PrepaidMappingZvt>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * POST Prepaid/Contracts/me/mappingZvt (asynchronously)
     * Gets prepaid item id from product id which is configured in prepaid contracts
     * @param prepaidContractId Prepaid contract id (required)
     * @param body Prepaid transaction input properties (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call prepaidContractsmappingZvtAsync(String prepaidContractId, PrepaidZvtDTO body, final ApiCallback<PrepaidMappingZvt> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = prepaidContractsmappingZvtValidateBeforeCall(prepaidContractId, body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<PrepaidMappingZvt>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}

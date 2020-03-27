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

import io.secuconnect.client.model.SecupayPayoutDTO;
import io.secuconnect.client.model.SecupayPayoutProductModel;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PaymentSecupayPayoutApi {
    private ApiClient apiClient;

    public PaymentSecupayPayoutApi() {
        this(Configuration.getDefaultApiClient());
    }

    public PaymentSecupayPayoutApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for paymentSecupaypayoutgetSecupaypayout
     * @param paymentPayoutId Payment payout id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call paymentSecupaypayoutgetSecupaypayoutCall(String paymentPayoutId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Payment/Secupaypayout/{paymentPayoutId}"
            .replaceAll("\\{" + "paymentPayoutId" + "\\}", apiClient.escapeString(paymentPayoutId.toString()));

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
    private com.squareup.okhttp.Call paymentSecupaypayoutgetSecupaypayoutValidateBeforeCall(String paymentPayoutId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'paymentPayoutId' is set
        if (paymentPayoutId == null) {
            throw new ApiException("Missing the required parameter 'paymentPayoutId' when calling paymentSecupaypayoutgetSecupaypayout(Async)");
        }
        
        com.squareup.okhttp.Call call = paymentSecupaypayoutgetSecupaypayoutCall(paymentPayoutId, progressListener, progressRequestListener);
        return call;
    }

    /**
     * GET Payment/Secupaypayout/{paymentPayoutId}
     * Get the details of a payment transaction
     * @param paymentPayoutId Payment payout id (required)
     * @return SecupayPayoutProductModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SecupayPayoutProductModel paymentSecupaypayoutgetSecupaypayout(String paymentPayoutId) throws ApiException {
        ApiResponse<SecupayPayoutProductModel> resp = paymentSecupaypayoutgetSecupaypayoutWithHttpInfo(paymentPayoutId);
        return resp.getData();
    }

    /**
     * GET Payment/Secupaypayout/{paymentPayoutId}
     * Get the details of a payment transaction
     * @param paymentPayoutId Payment payout id (required)
     * @return ApiResponse&lt;SecupayPayoutProductModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SecupayPayoutProductModel> paymentSecupaypayoutgetSecupaypayoutWithHttpInfo(String paymentPayoutId) throws ApiException {
        com.squareup.okhttp.Call call = paymentSecupaypayoutgetSecupaypayoutValidateBeforeCall(paymentPayoutId, null, null);
        Type localVarReturnType = new TypeToken<SecupayPayoutProductModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * GET Payment/Secupaypayout/{paymentPayoutId} (asynchronously)
     * Get the details of a payment transaction
     * @param paymentPayoutId Payment payout id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call paymentSecupaypayoutgetSecupaypayoutAsync(String paymentPayoutId, final ApiCallback<SecupayPayoutProductModel> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = paymentSecupaypayoutgetSecupaypayoutValidateBeforeCall(paymentPayoutId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<SecupayPayoutProductModel>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for paymentSecupaypayoutpaymentSecupaypayoutPost
     * @param body Payout payment transaction input properties (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call paymentSecupaypayoutpaymentSecupaypayoutPostCall(SecupayPayoutDTO body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/Payment/Secupaypayout";

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
    private com.squareup.okhttp.Call paymentSecupaypayoutpaymentSecupaypayoutPostValidateBeforeCall(SecupayPayoutDTO body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = paymentSecupaypayoutpaymentSecupaypayoutPostCall(body, progressListener, progressRequestListener);
        return call;
    }

    /**
     * POST Payment/Secupaypayout
     * Start a payout transaction
     * @param body Payout payment transaction input properties (optional)
     * @return SecupayPayoutProductModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SecupayPayoutProductModel paymentSecupaypayoutpaymentSecupaypayoutPost(SecupayPayoutDTO body) throws ApiException {
        ApiResponse<SecupayPayoutProductModel> resp = paymentSecupaypayoutpaymentSecupaypayoutPostWithHttpInfo(body);
        return resp.getData();
    }

    /**
     * POST Payment/Secupaypayout
     * Start a payout transaction
     * @param body Payout payment transaction input properties (optional)
     * @return ApiResponse&lt;SecupayPayoutProductModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SecupayPayoutProductModel> paymentSecupaypayoutpaymentSecupaypayoutPostWithHttpInfo(SecupayPayoutDTO body) throws ApiException {
        com.squareup.okhttp.Call call = paymentSecupaypayoutpaymentSecupaypayoutPostValidateBeforeCall(body, null, null);
        Type localVarReturnType = new TypeToken<SecupayPayoutProductModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * POST Payment/Secupaypayout (asynchronously)
     * Start a payout transaction
     * @param body Payout payment transaction input properties (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call paymentSecupaypayoutpaymentSecupaypayoutPostAsync(SecupayPayoutDTO body, final ApiCallback<SecupayPayoutProductModel> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = paymentSecupaypayoutpaymentSecupaypayoutPostValidateBeforeCall(body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<SecupayPayoutProductModel>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}

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

import com.secuconnect.client.model.LoyaltyCustomersDTO;
import com.secuconnect.client.model.LoyaltyMerchantcardsDTO;
import com.secuconnect.client.model.LoyaltyMerchantcardsDTOCardsAmount;
import com.secuconnect.client.model.LoyaltyMerchantcardsDTOCheckPasscode;
import com.secuconnect.client.model.LoyaltyMerchantcardsDTOCsc;
import com.secuconnect.client.model.LoyaltyMerchantcardsDTOLock;
import com.secuconnect.client.model.LoyaltyMerchantcardsDTONewPasscode;
import com.secuconnect.client.model.LoyaltyMerchantcardsDTOResetPasscode;
import com.secuconnect.client.model.LoyaltyMerchantcardsDTOTransaction;
import com.secuconnect.client.model.LoyaltyMerchantcardsDTOValidateMerchantCard;
import com.secuconnect.client.model.LoyaltyMerchantcardsList;
import com.secuconnect.client.model.LoyaltyMerchantcardsProductModel;
import com.secuconnect.client.model.LoyaltyMerchantcardsProductWithReceiptModel;
import com.secuconnect.client.model.LoyaltyMerchantcardsValidateMerchantCard;
import com.secuconnect.client.model.ProductExceptionPayload;
import com.secuconnect.client.model.ResultBoolean;
import com.secuconnect.client.model.VirtualTerminalDataModel;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LoyaltyMerchantcardsApi {
    private ApiClient apiClient;

    public LoyaltyMerchantcardsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public LoyaltyMerchantcardsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for loyaltyMerchantCardsaddMerchantCard
     * @param body Loyalty merchant card properties (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call loyaltyMerchantCardsaddMerchantCardCall(LoyaltyMerchantcardsDTO body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/Loyalty/MerchantCards";

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
    private com.squareup.okhttp.Call loyaltyMerchantCardsaddMerchantCardValidateBeforeCall(LoyaltyMerchantcardsDTO body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = loyaltyMerchantCardsaddMerchantCardCall(body, progressListener, progressRequestListener);
        return call;
    }

    /**
     * POST Loyalty/MerchantCards
     * Add new loyalty merchant card
     * @param body Loyalty merchant card properties (optional)
     * @return LoyaltyMerchantcardsProductModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public LoyaltyMerchantcardsProductModel loyaltyMerchantCardsaddMerchantCard(LoyaltyMerchantcardsDTO body) throws ApiException {
        ApiResponse<LoyaltyMerchantcardsProductModel> resp = loyaltyMerchantCardsaddMerchantCardWithHttpInfo(body);
        return resp.getData();
    }

    /**
     * POST Loyalty/MerchantCards
     * Add new loyalty merchant card
     * @param body Loyalty merchant card properties (optional)
     * @return ApiResponse&lt;LoyaltyMerchantcardsProductModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<LoyaltyMerchantcardsProductModel> loyaltyMerchantCardsaddMerchantCardWithHttpInfo(LoyaltyMerchantcardsDTO body) throws ApiException {
        com.squareup.okhttp.Call call = loyaltyMerchantCardsaddMerchantCardValidateBeforeCall(body, null, null);
        Type localVarReturnType = new TypeToken<LoyaltyMerchantcardsProductModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * POST Loyalty/MerchantCards (asynchronously)
     * Add new loyalty merchant card
     * @param body Loyalty merchant card properties (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call loyaltyMerchantCardsaddMerchantCardAsync(LoyaltyMerchantcardsDTO body, final ApiCallback<LoyaltyMerchantcardsProductModel> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = loyaltyMerchantCardsaddMerchantCardValidateBeforeCall(body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<LoyaltyMerchantcardsProductModel>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for loyaltyMerchantCardscheckCsc
     * @param loyaltyMerchantCardId Loyalty merchant card id (required)
     * @param body Information about card (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call loyaltyMerchantCardscheckCscCall(String loyaltyMerchantCardId, LoyaltyMerchantcardsDTOCsc body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/Loyalty/MerchantCards/{loyaltyMerchantCardId}/checkCsc"
            .replaceAll("\\{" + "loyaltyMerchantCardId" + "\\}", apiClient.escapeString(loyaltyMerchantCardId.toString()));

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
    private com.squareup.okhttp.Call loyaltyMerchantCardscheckCscValidateBeforeCall(String loyaltyMerchantCardId, LoyaltyMerchantcardsDTOCsc body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'loyaltyMerchantCardId' is set
        if (loyaltyMerchantCardId == null) {
            throw new ApiException("Missing the required parameter 'loyaltyMerchantCardId' when calling loyaltyMerchantCardscheckCsc(Async)");
        }
        
        com.squareup.okhttp.Call call = loyaltyMerchantCardscheckCscCall(loyaltyMerchantCardId, body, progressListener, progressRequestListener);
        return call;
    }

    /**
     * POST Loyalty/MerchantCards/{loyaltyMerchantCardId}/checkCsc
     * Check CSC
     * @param loyaltyMerchantCardId Loyalty merchant card id (required)
     * @param body Information about card (optional)
     * @return ResultBoolean
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ResultBoolean loyaltyMerchantCardscheckCsc(String loyaltyMerchantCardId, LoyaltyMerchantcardsDTOCsc body) throws ApiException {
        ApiResponse<ResultBoolean> resp = loyaltyMerchantCardscheckCscWithHttpInfo(loyaltyMerchantCardId, body);
        return resp.getData();
    }

    /**
     * POST Loyalty/MerchantCards/{loyaltyMerchantCardId}/checkCsc
     * Check CSC
     * @param loyaltyMerchantCardId Loyalty merchant card id (required)
     * @param body Information about card (optional)
     * @return ApiResponse&lt;ResultBoolean&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ResultBoolean> loyaltyMerchantCardscheckCscWithHttpInfo(String loyaltyMerchantCardId, LoyaltyMerchantcardsDTOCsc body) throws ApiException {
        com.squareup.okhttp.Call call = loyaltyMerchantCardscheckCscValidateBeforeCall(loyaltyMerchantCardId, body, null, null);
        Type localVarReturnType = new TypeToken<ResultBoolean>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * POST Loyalty/MerchantCards/{loyaltyMerchantCardId}/checkCsc (asynchronously)
     * Check CSC
     * @param loyaltyMerchantCardId Loyalty merchant card id (required)
     * @param body Information about card (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call loyaltyMerchantCardscheckCscAsync(String loyaltyMerchantCardId, LoyaltyMerchantcardsDTOCsc body, final ApiCallback<ResultBoolean> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = loyaltyMerchantCardscheckCscValidateBeforeCall(loyaltyMerchantCardId, body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ResultBoolean>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for loyaltyMerchantCardscheckPassCode
     * @param loyaltyMerchantCardId Loyalty merchant card id (required)
     * @param body Information about card (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call loyaltyMerchantCardscheckPassCodeCall(String loyaltyMerchantCardId, LoyaltyMerchantcardsDTOCheckPasscode body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/Loyalty/MerchantCards/{loyaltyMerchantCardId}/checkPasscode"
            .replaceAll("\\{" + "loyaltyMerchantCardId" + "\\}", apiClient.escapeString(loyaltyMerchantCardId.toString()));

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
    private com.squareup.okhttp.Call loyaltyMerchantCardscheckPassCodeValidateBeforeCall(String loyaltyMerchantCardId, LoyaltyMerchantcardsDTOCheckPasscode body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'loyaltyMerchantCardId' is set
        if (loyaltyMerchantCardId == null) {
            throw new ApiException("Missing the required parameter 'loyaltyMerchantCardId' when calling loyaltyMerchantCardscheckPassCode(Async)");
        }
        
        com.squareup.okhttp.Call call = loyaltyMerchantCardscheckPassCodeCall(loyaltyMerchantCardId, body, progressListener, progressRequestListener);
        return call;
    }

    /**
     * POST Loyalty/MerchantCards/{loyaltyMerchantCardId}/checkPasscode
     * Function to check the Passcode card with cardnumber
     * @param loyaltyMerchantCardId Loyalty merchant card id (required)
     * @param body Information about card (optional)
     * @return ResultBoolean
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ResultBoolean loyaltyMerchantCardscheckPassCode(String loyaltyMerchantCardId, LoyaltyMerchantcardsDTOCheckPasscode body) throws ApiException {
        ApiResponse<ResultBoolean> resp = loyaltyMerchantCardscheckPassCodeWithHttpInfo(loyaltyMerchantCardId, body);
        return resp.getData();
    }

    /**
     * POST Loyalty/MerchantCards/{loyaltyMerchantCardId}/checkPasscode
     * Function to check the Passcode card with cardnumber
     * @param loyaltyMerchantCardId Loyalty merchant card id (required)
     * @param body Information about card (optional)
     * @return ApiResponse&lt;ResultBoolean&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ResultBoolean> loyaltyMerchantCardscheckPassCodeWithHttpInfo(String loyaltyMerchantCardId, LoyaltyMerchantcardsDTOCheckPasscode body) throws ApiException {
        com.squareup.okhttp.Call call = loyaltyMerchantCardscheckPassCodeValidateBeforeCall(loyaltyMerchantCardId, body, null, null);
        Type localVarReturnType = new TypeToken<ResultBoolean>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * POST Loyalty/MerchantCards/{loyaltyMerchantCardId}/checkPasscode (asynchronously)
     * Function to check the Passcode card with cardnumber
     * @param loyaltyMerchantCardId Loyalty merchant card id (required)
     * @param body Information about card (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call loyaltyMerchantCardscheckPassCodeAsync(String loyaltyMerchantCardId, LoyaltyMerchantcardsDTOCheckPasscode body, final ApiCallback<ResultBoolean> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = loyaltyMerchantCardscheckPassCodeValidateBeforeCall(loyaltyMerchantCardId, body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ResultBoolean>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for loyaltyMerchantCardscreateMerchantcards
     * @param generalMerchantId General merchant id (required)
     * @param loyaltyCardgroupId Loyalty card group id (required)
     * @param body Cards amount (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call loyaltyMerchantCardscreateMerchantcardsCall(String generalMerchantId, String loyaltyCardgroupId, LoyaltyMerchantcardsDTOCardsAmount body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/Loyalty/MerchantCards/{generalMerchantId}/createMerchantcards/{loyaltyCardgroupId}"
            .replaceAll("\\{" + "generalMerchantId" + "\\}", apiClient.escapeString(generalMerchantId.toString()))
            .replaceAll("\\{" + "loyaltyCardgroupId" + "\\}", apiClient.escapeString(loyaltyCardgroupId.toString()));

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
    private com.squareup.okhttp.Call loyaltyMerchantCardscreateMerchantcardsValidateBeforeCall(String generalMerchantId, String loyaltyCardgroupId, LoyaltyMerchantcardsDTOCardsAmount body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'generalMerchantId' is set
        if (generalMerchantId == null) {
            throw new ApiException("Missing the required parameter 'generalMerchantId' when calling loyaltyMerchantCardscreateMerchantcards(Async)");
        }
        // verify the required parameter 'loyaltyCardgroupId' is set
        if (loyaltyCardgroupId == null) {
            throw new ApiException("Missing the required parameter 'loyaltyCardgroupId' when calling loyaltyMerchantCardscreateMerchantcards(Async)");
        }
        
        com.squareup.okhttp.Call call = loyaltyMerchantCardscreateMerchantcardsCall(generalMerchantId, loyaltyCardgroupId, body, progressListener, progressRequestListener);
        return call;
    }

    /**
     * POST Loyalty/MerchantCards/{generalMerchantId}/createMerchantcards/{loyaltyCardgroupId}
     * Function to create multiple merchantcards for given merchant with given cardgroup
     * @param generalMerchantId General merchant id (required)
     * @param loyaltyCardgroupId Loyalty card group id (required)
     * @param body Cards amount (optional)
     * @return List&lt;LoyaltyMerchantcardsProductModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<LoyaltyMerchantcardsProductModel> loyaltyMerchantCardscreateMerchantcards(String generalMerchantId, String loyaltyCardgroupId, LoyaltyMerchantcardsDTOCardsAmount body) throws ApiException {
        ApiResponse<List<LoyaltyMerchantcardsProductModel>> resp = loyaltyMerchantCardscreateMerchantcardsWithHttpInfo(generalMerchantId, loyaltyCardgroupId, body);
        return resp.getData();
    }

    /**
     * POST Loyalty/MerchantCards/{generalMerchantId}/createMerchantcards/{loyaltyCardgroupId}
     * Function to create multiple merchantcards for given merchant with given cardgroup
     * @param generalMerchantId General merchant id (required)
     * @param loyaltyCardgroupId Loyalty card group id (required)
     * @param body Cards amount (optional)
     * @return ApiResponse&lt;List&lt;LoyaltyMerchantcardsProductModel&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<LoyaltyMerchantcardsProductModel>> loyaltyMerchantCardscreateMerchantcardsWithHttpInfo(String generalMerchantId, String loyaltyCardgroupId, LoyaltyMerchantcardsDTOCardsAmount body) throws ApiException {
        com.squareup.okhttp.Call call = loyaltyMerchantCardscreateMerchantcardsValidateBeforeCall(generalMerchantId, loyaltyCardgroupId, body, null, null);
        Type localVarReturnType = new TypeToken<List<LoyaltyMerchantcardsProductModel>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * POST Loyalty/MerchantCards/{generalMerchantId}/createMerchantcards/{loyaltyCardgroupId} (asynchronously)
     * Function to create multiple merchantcards for given merchant with given cardgroup
     * @param generalMerchantId General merchant id (required)
     * @param loyaltyCardgroupId Loyalty card group id (required)
     * @param body Cards amount (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call loyaltyMerchantCardscreateMerchantcardsAsync(String generalMerchantId, String loyaltyCardgroupId, LoyaltyMerchantcardsDTOCardsAmount body, final ApiCallback<List<LoyaltyMerchantcardsProductModel>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = loyaltyMerchantCardscreateMerchantcardsValidateBeforeCall(generalMerchantId, loyaltyCardgroupId, body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<LoyaltyMerchantcardsProductModel>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for loyaltyMerchantCardsexecuteTransaction
     * @param loyaltyMerchantCardId Loyalty merchant card id (required)
     * @param body Transaction properties (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call loyaltyMerchantCardsexecuteTransactionCall(String loyaltyMerchantCardId, LoyaltyMerchantcardsDTOTransaction body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/Loyalty/MerchantCards/{loyaltyMerchantCardId}/transaction"
            .replaceAll("\\{" + "loyaltyMerchantCardId" + "\\}", apiClient.escapeString(loyaltyMerchantCardId.toString()));

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
    private com.squareup.okhttp.Call loyaltyMerchantCardsexecuteTransactionValidateBeforeCall(String loyaltyMerchantCardId, LoyaltyMerchantcardsDTOTransaction body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'loyaltyMerchantCardId' is set
        if (loyaltyMerchantCardId == null) {
            throw new ApiException("Missing the required parameter 'loyaltyMerchantCardId' when calling loyaltyMerchantCardsexecuteTransaction(Async)");
        }
        
        com.squareup.okhttp.Call call = loyaltyMerchantCardsexecuteTransactionCall(loyaltyMerchantCardId, body, progressListener, progressRequestListener);
        return call;
    }

    /**
     * POST Loyalty/MerchantCards/{loyaltyMerchantCardId}/transaction
     * Execute transaction from SDK
     * @param loyaltyMerchantCardId Loyalty merchant card id (required)
     * @param body Transaction properties (optional)
     * @return LoyaltyMerchantcardsProductWithReceiptModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public LoyaltyMerchantcardsProductWithReceiptModel loyaltyMerchantCardsexecuteTransaction(String loyaltyMerchantCardId, LoyaltyMerchantcardsDTOTransaction body) throws ApiException {
        ApiResponse<LoyaltyMerchantcardsProductWithReceiptModel> resp = loyaltyMerchantCardsexecuteTransactionWithHttpInfo(loyaltyMerchantCardId, body);
        return resp.getData();
    }

    /**
     * POST Loyalty/MerchantCards/{loyaltyMerchantCardId}/transaction
     * Execute transaction from SDK
     * @param loyaltyMerchantCardId Loyalty merchant card id (required)
     * @param body Transaction properties (optional)
     * @return ApiResponse&lt;LoyaltyMerchantcardsProductWithReceiptModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<LoyaltyMerchantcardsProductWithReceiptModel> loyaltyMerchantCardsexecuteTransactionWithHttpInfo(String loyaltyMerchantCardId, LoyaltyMerchantcardsDTOTransaction body) throws ApiException {
        com.squareup.okhttp.Call call = loyaltyMerchantCardsexecuteTransactionValidateBeforeCall(loyaltyMerchantCardId, body, null, null);
        Type localVarReturnType = new TypeToken<LoyaltyMerchantcardsProductWithReceiptModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * POST Loyalty/MerchantCards/{loyaltyMerchantCardId}/transaction (asynchronously)
     * Execute transaction from SDK
     * @param loyaltyMerchantCardId Loyalty merchant card id (required)
     * @param body Transaction properties (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call loyaltyMerchantCardsexecuteTransactionAsync(String loyaltyMerchantCardId, LoyaltyMerchantcardsDTOTransaction body, final ApiCallback<LoyaltyMerchantcardsProductWithReceiptModel> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = loyaltyMerchantCardsexecuteTransactionValidateBeforeCall(loyaltyMerchantCardId, body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<LoyaltyMerchantcardsProductWithReceiptModel>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for loyaltyMerchantCardsgetAll
     * @param count The number of items to return. (optional)
     * @param offset The position within the whole result set to start returning items (First element is at 0). (optional)
     * @param fields List of fields to include in the result. Nested properties can be accessed with this notation: prop1.prop2  Example: prop3,prop1.prop2 (optional)
     * @param q A query string to restrict the returned items to given conditions. The query string must consist of any combination of single expressions in the form property:condition.  *                   A condition may contain:  *                       - wildcard \&quot;*\&quot; for any number of characters  *                       - wildcard \&quot;?\&quot; for one character  *                       - ranges in the form [value TO value]  *  *                   Single expressions may combined by &#x27;AND&#x27;, &#x27;OR&#x27;, &#x27;NOT&#x27; operators and parenthesis &#x27;(&#x27;, &#x27;)&#x27; for grouping.  *                   Property names can be nested like \&quot;prop1.prop2\&quot;.  *                   Example: (NOT customer.name:meier*) AND (customer.age:[30 TO 40] OR customer.age:[50 TO 60])  *                    (optional)
     * @param sort String with comma separated pairs of field:order (e.g. contact.surname:asc,contact.comapnyname:desc). Result set will be sorted by included fields, in ascending &#x27;asc&#x27;, or descending &#x27;dsc&#x27; order. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call loyaltyMerchantCardsgetAllCall(Integer count, Integer offset, String fields, String q, String sort, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Loyalty/MerchantCards";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (count != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("count", count));
        if (offset != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("offset", offset));
        if (fields != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("fields", fields));
        if (q != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("q", q));
        if (sort != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("sort", sort));

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
    private com.squareup.okhttp.Call loyaltyMerchantCardsgetAllValidateBeforeCall(Integer count, Integer offset, String fields, String q, String sort, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = loyaltyMerchantCardsgetAllCall(count, offset, fields, q, sort, progressListener, progressRequestListener);
        return call;
    }

    /**
     * GET Loyalty/MerchantCards
     * Get a list of loyalty merchant cards
     * @param count The number of items to return. (optional)
     * @param offset The position within the whole result set to start returning items (First element is at 0). (optional)
     * @param fields List of fields to include in the result. Nested properties can be accessed with this notation: prop1.prop2  Example: prop3,prop1.prop2 (optional)
     * @param q A query string to restrict the returned items to given conditions. The query string must consist of any combination of single expressions in the form property:condition.  *                   A condition may contain:  *                       - wildcard \&quot;*\&quot; for any number of characters  *                       - wildcard \&quot;?\&quot; for one character  *                       - ranges in the form [value TO value]  *  *                   Single expressions may combined by &#x27;AND&#x27;, &#x27;OR&#x27;, &#x27;NOT&#x27; operators and parenthesis &#x27;(&#x27;, &#x27;)&#x27; for grouping.  *                   Property names can be nested like \&quot;prop1.prop2\&quot;.  *                   Example: (NOT customer.name:meier*) AND (customer.age:[30 TO 40] OR customer.age:[50 TO 60])  *                    (optional)
     * @param sort String with comma separated pairs of field:order (e.g. contact.surname:asc,contact.comapnyname:desc). Result set will be sorted by included fields, in ascending &#x27;asc&#x27;, or descending &#x27;dsc&#x27; order. (optional)
     * @return LoyaltyMerchantcardsList
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public LoyaltyMerchantcardsList loyaltyMerchantCardsgetAll(Integer count, Integer offset, String fields, String q, String sort) throws ApiException {
        ApiResponse<LoyaltyMerchantcardsList> resp = loyaltyMerchantCardsgetAllWithHttpInfo(count, offset, fields, q, sort);
        return resp.getData();
    }

    /**
     * GET Loyalty/MerchantCards
     * Get a list of loyalty merchant cards
     * @param count The number of items to return. (optional)
     * @param offset The position within the whole result set to start returning items (First element is at 0). (optional)
     * @param fields List of fields to include in the result. Nested properties can be accessed with this notation: prop1.prop2  Example: prop3,prop1.prop2 (optional)
     * @param q A query string to restrict the returned items to given conditions. The query string must consist of any combination of single expressions in the form property:condition.  *                   A condition may contain:  *                       - wildcard \&quot;*\&quot; for any number of characters  *                       - wildcard \&quot;?\&quot; for one character  *                       - ranges in the form [value TO value]  *  *                   Single expressions may combined by &#x27;AND&#x27;, &#x27;OR&#x27;, &#x27;NOT&#x27; operators and parenthesis &#x27;(&#x27;, &#x27;)&#x27; for grouping.  *                   Property names can be nested like \&quot;prop1.prop2\&quot;.  *                   Example: (NOT customer.name:meier*) AND (customer.age:[30 TO 40] OR customer.age:[50 TO 60])  *                    (optional)
     * @param sort String with comma separated pairs of field:order (e.g. contact.surname:asc,contact.comapnyname:desc). Result set will be sorted by included fields, in ascending &#x27;asc&#x27;, or descending &#x27;dsc&#x27; order. (optional)
     * @return ApiResponse&lt;LoyaltyMerchantcardsList&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<LoyaltyMerchantcardsList> loyaltyMerchantCardsgetAllWithHttpInfo(Integer count, Integer offset, String fields, String q, String sort) throws ApiException {
        com.squareup.okhttp.Call call = loyaltyMerchantCardsgetAllValidateBeforeCall(count, offset, fields, q, sort, null, null);
        Type localVarReturnType = new TypeToken<LoyaltyMerchantcardsList>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * GET Loyalty/MerchantCards (asynchronously)
     * Get a list of loyalty merchant cards
     * @param count The number of items to return. (optional)
     * @param offset The position within the whole result set to start returning items (First element is at 0). (optional)
     * @param fields List of fields to include in the result. Nested properties can be accessed with this notation: prop1.prop2  Example: prop3,prop1.prop2 (optional)
     * @param q A query string to restrict the returned items to given conditions. The query string must consist of any combination of single expressions in the form property:condition.  *                   A condition may contain:  *                       - wildcard \&quot;*\&quot; for any number of characters  *                       - wildcard \&quot;?\&quot; for one character  *                       - ranges in the form [value TO value]  *  *                   Single expressions may combined by &#x27;AND&#x27;, &#x27;OR&#x27;, &#x27;NOT&#x27; operators and parenthesis &#x27;(&#x27;, &#x27;)&#x27; for grouping.  *                   Property names can be nested like \&quot;prop1.prop2\&quot;.  *                   Example: (NOT customer.name:meier*) AND (customer.age:[30 TO 40] OR customer.age:[50 TO 60])  *                    (optional)
     * @param sort String with comma separated pairs of field:order (e.g. contact.surname:asc,contact.comapnyname:desc). Result set will be sorted by included fields, in ascending &#x27;asc&#x27;, or descending &#x27;dsc&#x27; order. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call loyaltyMerchantCardsgetAllAsync(Integer count, Integer offset, String fields, String q, String sort, final ApiCallback<LoyaltyMerchantcardsList> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = loyaltyMerchantCardsgetAllValidateBeforeCall(count, offset, fields, q, sort, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<LoyaltyMerchantcardsList>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for loyaltyMerchantCardsgetLock
     * @param loyaltyMerchantCardId Loyalty merchant card id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call loyaltyMerchantCardsgetLockCall(String loyaltyMerchantCardId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Loyalty/MerchantCards/{loyaltyMerchantCardId}/lock"
            .replaceAll("\\{" + "loyaltyMerchantCardId" + "\\}", apiClient.escapeString(loyaltyMerchantCardId.toString()));

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
    private com.squareup.okhttp.Call loyaltyMerchantCardsgetLockValidateBeforeCall(String loyaltyMerchantCardId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'loyaltyMerchantCardId' is set
        if (loyaltyMerchantCardId == null) {
            throw new ApiException("Missing the required parameter 'loyaltyMerchantCardId' when calling loyaltyMerchantCardsgetLock(Async)");
        }
        
        com.squareup.okhttp.Call call = loyaltyMerchantCardsgetLockCall(loyaltyMerchantCardId, progressListener, progressRequestListener);
        return call;
    }

    /**
     * GET Loyalty/MerchantCards/{loyaltyMerchantCardId}/lock
     * Get loyalty merchant card lock information for a specific id
     * @param loyaltyMerchantCardId Loyalty merchant card id (required)
     * @return LoyaltyMerchantcardsDTOLock
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public LoyaltyMerchantcardsDTOLock loyaltyMerchantCardsgetLock(String loyaltyMerchantCardId) throws ApiException {
        ApiResponse<LoyaltyMerchantcardsDTOLock> resp = loyaltyMerchantCardsgetLockWithHttpInfo(loyaltyMerchantCardId);
        return resp.getData();
    }

    /**
     * GET Loyalty/MerchantCards/{loyaltyMerchantCardId}/lock
     * Get loyalty merchant card lock information for a specific id
     * @param loyaltyMerchantCardId Loyalty merchant card id (required)
     * @return ApiResponse&lt;LoyaltyMerchantcardsDTOLock&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<LoyaltyMerchantcardsDTOLock> loyaltyMerchantCardsgetLockWithHttpInfo(String loyaltyMerchantCardId) throws ApiException {
        com.squareup.okhttp.Call call = loyaltyMerchantCardsgetLockValidateBeforeCall(loyaltyMerchantCardId, null, null);
        Type localVarReturnType = new TypeToken<LoyaltyMerchantcardsDTOLock>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * GET Loyalty/MerchantCards/{loyaltyMerchantCardId}/lock (asynchronously)
     * Get loyalty merchant card lock information for a specific id
     * @param loyaltyMerchantCardId Loyalty merchant card id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call loyaltyMerchantCardsgetLockAsync(String loyaltyMerchantCardId, final ApiCallback<LoyaltyMerchantcardsDTOLock> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = loyaltyMerchantCardsgetLockValidateBeforeCall(loyaltyMerchantCardId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<LoyaltyMerchantcardsDTOLock>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for loyaltyMerchantCardsgetOne
     * @param loyaltyMerchantCardId Search one by provided id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call loyaltyMerchantCardsgetOneCall(String loyaltyMerchantCardId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Loyalty/MerchantCards/{loyaltyMerchantCardId}"
            .replaceAll("\\{" + "loyaltyMerchantCardId" + "\\}", apiClient.escapeString(loyaltyMerchantCardId.toString()));

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
    private com.squareup.okhttp.Call loyaltyMerchantCardsgetOneValidateBeforeCall(String loyaltyMerchantCardId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'loyaltyMerchantCardId' is set
        if (loyaltyMerchantCardId == null) {
            throw new ApiException("Missing the required parameter 'loyaltyMerchantCardId' when calling loyaltyMerchantCardsgetOne(Async)");
        }
        
        com.squareup.okhttp.Call call = loyaltyMerchantCardsgetOneCall(loyaltyMerchantCardId, progressListener, progressRequestListener);
        return call;
    }

    /**
     * GET Loyalty/MerchantCards/{loyaltyMerchantCardId}
     * Get loyalty merchant card for a specific id
     * @param loyaltyMerchantCardId Search one by provided id (required)
     * @return LoyaltyMerchantcardsProductModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public LoyaltyMerchantcardsProductModel loyaltyMerchantCardsgetOne(String loyaltyMerchantCardId) throws ApiException {
        ApiResponse<LoyaltyMerchantcardsProductModel> resp = loyaltyMerchantCardsgetOneWithHttpInfo(loyaltyMerchantCardId);
        return resp.getData();
    }

    /**
     * GET Loyalty/MerchantCards/{loyaltyMerchantCardId}
     * Get loyalty merchant card for a specific id
     * @param loyaltyMerchantCardId Search one by provided id (required)
     * @return ApiResponse&lt;LoyaltyMerchantcardsProductModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<LoyaltyMerchantcardsProductModel> loyaltyMerchantCardsgetOneWithHttpInfo(String loyaltyMerchantCardId) throws ApiException {
        com.squareup.okhttp.Call call = loyaltyMerchantCardsgetOneValidateBeforeCall(loyaltyMerchantCardId, null, null);
        Type localVarReturnType = new TypeToken<LoyaltyMerchantcardsProductModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * GET Loyalty/MerchantCards/{loyaltyMerchantCardId} (asynchronously)
     * Get loyalty merchant card for a specific id
     * @param loyaltyMerchantCardId Search one by provided id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call loyaltyMerchantCardsgetOneAsync(String loyaltyMerchantCardId, final ApiCallback<LoyaltyMerchantcardsProductModel> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = loyaltyMerchantCardsgetOneValidateBeforeCall(loyaltyMerchantCardId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<LoyaltyMerchantcardsProductModel>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for loyaltyMerchantCardsgetVirtualTerminalData
     * @param loyaltyMerchantCardId Merchant card id (required)
     * @param loyaltyMerchantId Merchant id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call loyaltyMerchantCardsgetVirtualTerminalDataCall(String loyaltyMerchantCardId, String loyaltyMerchantId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Loyalty/MerchantCards/{loyaltyMerchantCardId}/virtualTerminalData/{loyaltyMerchantId}"
            .replaceAll("\\{" + "loyaltyMerchantCardId" + "\\}", apiClient.escapeString(loyaltyMerchantCardId.toString()))
            .replaceAll("\\{" + "loyaltyMerchantId" + "\\}", apiClient.escapeString(loyaltyMerchantId.toString()));

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
    private com.squareup.okhttp.Call loyaltyMerchantCardsgetVirtualTerminalDataValidateBeforeCall(String loyaltyMerchantCardId, String loyaltyMerchantId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'loyaltyMerchantCardId' is set
        if (loyaltyMerchantCardId == null) {
            throw new ApiException("Missing the required parameter 'loyaltyMerchantCardId' when calling loyaltyMerchantCardsgetVirtualTerminalData(Async)");
        }
        // verify the required parameter 'loyaltyMerchantId' is set
        if (loyaltyMerchantId == null) {
            throw new ApiException("Missing the required parameter 'loyaltyMerchantId' when calling loyaltyMerchantCardsgetVirtualTerminalData(Async)");
        }
        
        com.squareup.okhttp.Call call = loyaltyMerchantCardsgetVirtualTerminalDataCall(loyaltyMerchantCardId, loyaltyMerchantId, progressListener, progressRequestListener);
        return call;
    }

    /**
     * GET Loyalty/MerchantCards/{loyaltyMerchantCardId}/virtualTerminalData/{loyaltyMerchantId}
     * Get virtual terminal data for merchant
     * @param loyaltyMerchantCardId Merchant card id (required)
     * @param loyaltyMerchantId Merchant id (required)
     * @return VirtualTerminalDataModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public VirtualTerminalDataModel loyaltyMerchantCardsgetVirtualTerminalData(String loyaltyMerchantCardId, String loyaltyMerchantId) throws ApiException {
        ApiResponse<VirtualTerminalDataModel> resp = loyaltyMerchantCardsgetVirtualTerminalDataWithHttpInfo(loyaltyMerchantCardId, loyaltyMerchantId);
        return resp.getData();
    }

    /**
     * GET Loyalty/MerchantCards/{loyaltyMerchantCardId}/virtualTerminalData/{loyaltyMerchantId}
     * Get virtual terminal data for merchant
     * @param loyaltyMerchantCardId Merchant card id (required)
     * @param loyaltyMerchantId Merchant id (required)
     * @return ApiResponse&lt;VirtualTerminalDataModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<VirtualTerminalDataModel> loyaltyMerchantCardsgetVirtualTerminalDataWithHttpInfo(String loyaltyMerchantCardId, String loyaltyMerchantId) throws ApiException {
        com.squareup.okhttp.Call call = loyaltyMerchantCardsgetVirtualTerminalDataValidateBeforeCall(loyaltyMerchantCardId, loyaltyMerchantId, null, null);
        Type localVarReturnType = new TypeToken<VirtualTerminalDataModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * GET Loyalty/MerchantCards/{loyaltyMerchantCardId}/virtualTerminalData/{loyaltyMerchantId} (asynchronously)
     * Get virtual terminal data for merchant
     * @param loyaltyMerchantCardId Merchant card id (required)
     * @param loyaltyMerchantId Merchant id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call loyaltyMerchantCardsgetVirtualTerminalDataAsync(String loyaltyMerchantCardId, String loyaltyMerchantId, final ApiCallback<VirtualTerminalDataModel> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = loyaltyMerchantCardsgetVirtualTerminalDataValidateBeforeCall(loyaltyMerchantCardId, loyaltyMerchantId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<VirtualTerminalDataModel>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for loyaltyMerchantCardslock
     * @param loyaltyMerchantCardId Loyalty merchant card id (required)
     * @param body Information about lock (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call loyaltyMerchantCardslockCall(String loyaltyMerchantCardId, LoyaltyMerchantcardsDTOLock body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/Loyalty/MerchantCards/{loyaltyMerchantCardId}/lock"
            .replaceAll("\\{" + "loyaltyMerchantCardId" + "\\}", apiClient.escapeString(loyaltyMerchantCardId.toString()));

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
    private com.squareup.okhttp.Call loyaltyMerchantCardslockValidateBeforeCall(String loyaltyMerchantCardId, LoyaltyMerchantcardsDTOLock body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'loyaltyMerchantCardId' is set
        if (loyaltyMerchantCardId == null) {
            throw new ApiException("Missing the required parameter 'loyaltyMerchantCardId' when calling loyaltyMerchantCardslock(Async)");
        }
        
        com.squareup.okhttp.Call call = loyaltyMerchantCardslockCall(loyaltyMerchantCardId, body, progressListener, progressRequestListener);
        return call;
    }

    /**
     * POST Loyalty/MerchantCards/{loyaltyMerchantCardId}/lock
     * Lock merchant card
     * @param loyaltyMerchantCardId Loyalty merchant card id (required)
     * @param body Information about lock (optional)
     * @return LoyaltyMerchantcardsProductModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public LoyaltyMerchantcardsProductModel loyaltyMerchantCardslock(String loyaltyMerchantCardId, LoyaltyMerchantcardsDTOLock body) throws ApiException {
        ApiResponse<LoyaltyMerchantcardsProductModel> resp = loyaltyMerchantCardslockWithHttpInfo(loyaltyMerchantCardId, body);
        return resp.getData();
    }

    /**
     * POST Loyalty/MerchantCards/{loyaltyMerchantCardId}/lock
     * Lock merchant card
     * @param loyaltyMerchantCardId Loyalty merchant card id (required)
     * @param body Information about lock (optional)
     * @return ApiResponse&lt;LoyaltyMerchantcardsProductModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<LoyaltyMerchantcardsProductModel> loyaltyMerchantCardslockWithHttpInfo(String loyaltyMerchantCardId, LoyaltyMerchantcardsDTOLock body) throws ApiException {
        com.squareup.okhttp.Call call = loyaltyMerchantCardslockValidateBeforeCall(loyaltyMerchantCardId, body, null, null);
        Type localVarReturnType = new TypeToken<LoyaltyMerchantcardsProductModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * POST Loyalty/MerchantCards/{loyaltyMerchantCardId}/lock (asynchronously)
     * Lock merchant card
     * @param loyaltyMerchantCardId Loyalty merchant card id (required)
     * @param body Information about lock (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call loyaltyMerchantCardslockAsync(String loyaltyMerchantCardId, LoyaltyMerchantcardsDTOLock body, final ApiCallback<LoyaltyMerchantcardsProductModel> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = loyaltyMerchantCardslockValidateBeforeCall(loyaltyMerchantCardId, body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<LoyaltyMerchantcardsProductModel>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for loyaltyMerchantCardsnewPassCode
     * @param loyaltyMerchantCardId Loyalty merchant card id (required)
     * @param body Information about card (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call loyaltyMerchantCardsnewPassCodeCall(String loyaltyMerchantCardId, LoyaltyMerchantcardsDTONewPasscode body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/Loyalty/MerchantCards/{loyaltyMerchantCardId}/newPasscode"
            .replaceAll("\\{" + "loyaltyMerchantCardId" + "\\}", apiClient.escapeString(loyaltyMerchantCardId.toString()));

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
    private com.squareup.okhttp.Call loyaltyMerchantCardsnewPassCodeValidateBeforeCall(String loyaltyMerchantCardId, LoyaltyMerchantcardsDTONewPasscode body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'loyaltyMerchantCardId' is set
        if (loyaltyMerchantCardId == null) {
            throw new ApiException("Missing the required parameter 'loyaltyMerchantCardId' when calling loyaltyMerchantCardsnewPassCode(Async)");
        }
        
        com.squareup.okhttp.Call call = loyaltyMerchantCardsnewPassCodeCall(loyaltyMerchantCardId, body, progressListener, progressRequestListener);
        return call;
    }

    /**
     * POST Loyalty/MerchantCards/{loyaltyMerchantCardId}/newPasscode
     * Function to save new given passcode for given merchantcard identified by cardnumber
     * @param loyaltyMerchantCardId Loyalty merchant card id (required)
     * @param body Information about card (optional)
     * @return ResultBoolean
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ResultBoolean loyaltyMerchantCardsnewPassCode(String loyaltyMerchantCardId, LoyaltyMerchantcardsDTONewPasscode body) throws ApiException {
        ApiResponse<ResultBoolean> resp = loyaltyMerchantCardsnewPassCodeWithHttpInfo(loyaltyMerchantCardId, body);
        return resp.getData();
    }

    /**
     * POST Loyalty/MerchantCards/{loyaltyMerchantCardId}/newPasscode
     * Function to save new given passcode for given merchantcard identified by cardnumber
     * @param loyaltyMerchantCardId Loyalty merchant card id (required)
     * @param body Information about card (optional)
     * @return ApiResponse&lt;ResultBoolean&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ResultBoolean> loyaltyMerchantCardsnewPassCodeWithHttpInfo(String loyaltyMerchantCardId, LoyaltyMerchantcardsDTONewPasscode body) throws ApiException {
        com.squareup.okhttp.Call call = loyaltyMerchantCardsnewPassCodeValidateBeforeCall(loyaltyMerchantCardId, body, null, null);
        Type localVarReturnType = new TypeToken<ResultBoolean>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * POST Loyalty/MerchantCards/{loyaltyMerchantCardId}/newPasscode (asynchronously)
     * Function to save new given passcode for given merchantcard identified by cardnumber
     * @param loyaltyMerchantCardId Loyalty merchant card id (required)
     * @param body Information about card (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call loyaltyMerchantCardsnewPassCodeAsync(String loyaltyMerchantCardId, LoyaltyMerchantcardsDTONewPasscode body, final ApiCallback<ResultBoolean> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = loyaltyMerchantCardsnewPassCodeValidateBeforeCall(loyaltyMerchantCardId, body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ResultBoolean>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for loyaltyMerchantCardsregisterCustomer
     * @param loyaltyMerchantCardId Loyalty merchant card id (required)
     * @param body Loyalty customer properties (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call loyaltyMerchantCardsregisterCustomerCall(String loyaltyMerchantCardId, LoyaltyCustomersDTO body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/Loyalty/MerchantCards/{loyaltyMerchantCardId}/registerCustomer"
            .replaceAll("\\{" + "loyaltyMerchantCardId" + "\\}", apiClient.escapeString(loyaltyMerchantCardId.toString()));

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
    private com.squareup.okhttp.Call loyaltyMerchantCardsregisterCustomerValidateBeforeCall(String loyaltyMerchantCardId, LoyaltyCustomersDTO body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'loyaltyMerchantCardId' is set
        if (loyaltyMerchantCardId == null) {
            throw new ApiException("Missing the required parameter 'loyaltyMerchantCardId' when calling loyaltyMerchantCardsregisterCustomer(Async)");
        }
        
        com.squareup.okhttp.Call call = loyaltyMerchantCardsregisterCustomerCall(loyaltyMerchantCardId, body, progressListener, progressRequestListener);
        return call;
    }

    /**
     * POST Loyalty/MerchantCards/{loyaltyMerchantCardId}/registerCustomer
     * Register new customer for a card
     * @param loyaltyMerchantCardId Loyalty merchant card id (required)
     * @param body Loyalty customer properties (optional)
     * @return LoyaltyMerchantcardsProductModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public LoyaltyMerchantcardsProductModel loyaltyMerchantCardsregisterCustomer(String loyaltyMerchantCardId, LoyaltyCustomersDTO body) throws ApiException {
        ApiResponse<LoyaltyMerchantcardsProductModel> resp = loyaltyMerchantCardsregisterCustomerWithHttpInfo(loyaltyMerchantCardId, body);
        return resp.getData();
    }

    /**
     * POST Loyalty/MerchantCards/{loyaltyMerchantCardId}/registerCustomer
     * Register new customer for a card
     * @param loyaltyMerchantCardId Loyalty merchant card id (required)
     * @param body Loyalty customer properties (optional)
     * @return ApiResponse&lt;LoyaltyMerchantcardsProductModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<LoyaltyMerchantcardsProductModel> loyaltyMerchantCardsregisterCustomerWithHttpInfo(String loyaltyMerchantCardId, LoyaltyCustomersDTO body) throws ApiException {
        com.squareup.okhttp.Call call = loyaltyMerchantCardsregisterCustomerValidateBeforeCall(loyaltyMerchantCardId, body, null, null);
        Type localVarReturnType = new TypeToken<LoyaltyMerchantcardsProductModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * POST Loyalty/MerchantCards/{loyaltyMerchantCardId}/registerCustomer (asynchronously)
     * Register new customer for a card
     * @param loyaltyMerchantCardId Loyalty merchant card id (required)
     * @param body Loyalty customer properties (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call loyaltyMerchantCardsregisterCustomerAsync(String loyaltyMerchantCardId, LoyaltyCustomersDTO body, final ApiCallback<LoyaltyMerchantcardsProductModel> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = loyaltyMerchantCardsregisterCustomerValidateBeforeCall(loyaltyMerchantCardId, body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<LoyaltyMerchantcardsProductModel>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for loyaltyMerchantCardsremoveMerchantCard
     * @param loyaltyMerchantCardId Loyalty merchant card id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call loyaltyMerchantCardsremoveMerchantCardCall(String loyaltyMerchantCardId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Loyalty/MerchantCards/{loyaltyMerchantCardId}"
            .replaceAll("\\{" + "loyaltyMerchantCardId" + "\\}", apiClient.escapeString(loyaltyMerchantCardId.toString()));

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
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call loyaltyMerchantCardsremoveMerchantCardValidateBeforeCall(String loyaltyMerchantCardId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'loyaltyMerchantCardId' is set
        if (loyaltyMerchantCardId == null) {
            throw new ApiException("Missing the required parameter 'loyaltyMerchantCardId' when calling loyaltyMerchantCardsremoveMerchantCard(Async)");
        }
        
        com.squareup.okhttp.Call call = loyaltyMerchantCardsremoveMerchantCardCall(loyaltyMerchantCardId, progressListener, progressRequestListener);
        return call;
    }

    /**
     * DELETE Loyalty/MerchantCards/{loyaltyMerchantCardId}
     * Delete loyalty merchant card
     * @param loyaltyMerchantCardId Loyalty merchant card id (required)
     * @return LoyaltyMerchantcardsProductModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public LoyaltyMerchantcardsProductModel loyaltyMerchantCardsremoveMerchantCard(String loyaltyMerchantCardId) throws ApiException {
        ApiResponse<LoyaltyMerchantcardsProductModel> resp = loyaltyMerchantCardsremoveMerchantCardWithHttpInfo(loyaltyMerchantCardId);
        return resp.getData();
    }

    /**
     * DELETE Loyalty/MerchantCards/{loyaltyMerchantCardId}
     * Delete loyalty merchant card
     * @param loyaltyMerchantCardId Loyalty merchant card id (required)
     * @return ApiResponse&lt;LoyaltyMerchantcardsProductModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<LoyaltyMerchantcardsProductModel> loyaltyMerchantCardsremoveMerchantCardWithHttpInfo(String loyaltyMerchantCardId) throws ApiException {
        com.squareup.okhttp.Call call = loyaltyMerchantCardsremoveMerchantCardValidateBeforeCall(loyaltyMerchantCardId, null, null);
        Type localVarReturnType = new TypeToken<LoyaltyMerchantcardsProductModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * DELETE Loyalty/MerchantCards/{loyaltyMerchantCardId} (asynchronously)
     * Delete loyalty merchant card
     * @param loyaltyMerchantCardId Loyalty merchant card id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call loyaltyMerchantCardsremoveMerchantCardAsync(String loyaltyMerchantCardId, final ApiCallback<LoyaltyMerchantcardsProductModel> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = loyaltyMerchantCardsremoveMerchantCardValidateBeforeCall(loyaltyMerchantCardId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<LoyaltyMerchantcardsProductModel>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for loyaltyMerchantCardsresetPassCode
     * @param loyaltyMerchantCardId Loyalty merchant card id (required)
     * @param body Information about card (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call loyaltyMerchantCardsresetPassCodeCall(String loyaltyMerchantCardId, LoyaltyMerchantcardsDTOResetPasscode body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/Loyalty/MerchantCards/{loyaltyMerchantCardId}/resetPasscode"
            .replaceAll("\\{" + "loyaltyMerchantCardId" + "\\}", apiClient.escapeString(loyaltyMerchantCardId.toString()));

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
    private com.squareup.okhttp.Call loyaltyMerchantCardsresetPassCodeValidateBeforeCall(String loyaltyMerchantCardId, LoyaltyMerchantcardsDTOResetPasscode body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'loyaltyMerchantCardId' is set
        if (loyaltyMerchantCardId == null) {
            throw new ApiException("Missing the required parameter 'loyaltyMerchantCardId' when calling loyaltyMerchantCardsresetPassCode(Async)");
        }
        
        com.squareup.okhttp.Call call = loyaltyMerchantCardsresetPassCodeCall(loyaltyMerchantCardId, body, progressListener, progressRequestListener);
        return call;
    }

    /**
     * POST Loyalty/MerchantCards/{loyaltyMerchantCardId}/resetPasscode
     * Function to reset a passcode for given merchantcard
     * @param loyaltyMerchantCardId Loyalty merchant card id (required)
     * @param body Information about card (optional)
     * @return ResultBoolean
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ResultBoolean loyaltyMerchantCardsresetPassCode(String loyaltyMerchantCardId, LoyaltyMerchantcardsDTOResetPasscode body) throws ApiException {
        ApiResponse<ResultBoolean> resp = loyaltyMerchantCardsresetPassCodeWithHttpInfo(loyaltyMerchantCardId, body);
        return resp.getData();
    }

    /**
     * POST Loyalty/MerchantCards/{loyaltyMerchantCardId}/resetPasscode
     * Function to reset a passcode for given merchantcard
     * @param loyaltyMerchantCardId Loyalty merchant card id (required)
     * @param body Information about card (optional)
     * @return ApiResponse&lt;ResultBoolean&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ResultBoolean> loyaltyMerchantCardsresetPassCodeWithHttpInfo(String loyaltyMerchantCardId, LoyaltyMerchantcardsDTOResetPasscode body) throws ApiException {
        com.squareup.okhttp.Call call = loyaltyMerchantCardsresetPassCodeValidateBeforeCall(loyaltyMerchantCardId, body, null, null);
        Type localVarReturnType = new TypeToken<ResultBoolean>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * POST Loyalty/MerchantCards/{loyaltyMerchantCardId}/resetPasscode (asynchronously)
     * Function to reset a passcode for given merchantcard
     * @param loyaltyMerchantCardId Loyalty merchant card id (required)
     * @param body Information about card (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call loyaltyMerchantCardsresetPassCodeAsync(String loyaltyMerchantCardId, LoyaltyMerchantcardsDTOResetPasscode body, final ApiCallback<ResultBoolean> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = loyaltyMerchantCardsresetPassCodeValidateBeforeCall(loyaltyMerchantCardId, body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ResultBoolean>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for loyaltyMerchantCardssetCustomer
     * @param loyaltyMerchantCardId Loyalty merchant card id (required)
     * @param loyaltyCustomerId Loyalty customer id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call loyaltyMerchantCardssetCustomerCall(String loyaltyMerchantCardId, String loyaltyCustomerId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Loyalty/MerchantCards/{loyaltyMerchantCardId}/setCustomer/{loyaltyCustomerId}"
            .replaceAll("\\{" + "loyaltyMerchantCardId" + "\\}", apiClient.escapeString(loyaltyMerchantCardId.toString()))
            .replaceAll("\\{" + "loyaltyCustomerId" + "\\}", apiClient.escapeString(loyaltyCustomerId.toString()));

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
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call loyaltyMerchantCardssetCustomerValidateBeforeCall(String loyaltyMerchantCardId, String loyaltyCustomerId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'loyaltyMerchantCardId' is set
        if (loyaltyMerchantCardId == null) {
            throw new ApiException("Missing the required parameter 'loyaltyMerchantCardId' when calling loyaltyMerchantCardssetCustomer(Async)");
        }
        // verify the required parameter 'loyaltyCustomerId' is set
        if (loyaltyCustomerId == null) {
            throw new ApiException("Missing the required parameter 'loyaltyCustomerId' when calling loyaltyMerchantCardssetCustomer(Async)");
        }
        
        com.squareup.okhttp.Call call = loyaltyMerchantCardssetCustomerCall(loyaltyMerchantCardId, loyaltyCustomerId, progressListener, progressRequestListener);
        return call;
    }

    /**
     * POST Loyalty/MerchantCards/{loyaltyMerchantCardId}/setCustomer/{loyaltyCustomerId}
     * Set loyalty customer for a loyalty merchant card
     * @param loyaltyMerchantCardId Loyalty merchant card id (required)
     * @param loyaltyCustomerId Loyalty customer id (required)
     * @return LoyaltyMerchantcardsProductModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public LoyaltyMerchantcardsProductModel loyaltyMerchantCardssetCustomer(String loyaltyMerchantCardId, String loyaltyCustomerId) throws ApiException {
        ApiResponse<LoyaltyMerchantcardsProductModel> resp = loyaltyMerchantCardssetCustomerWithHttpInfo(loyaltyMerchantCardId, loyaltyCustomerId);
        return resp.getData();
    }

    /**
     * POST Loyalty/MerchantCards/{loyaltyMerchantCardId}/setCustomer/{loyaltyCustomerId}
     * Set loyalty customer for a loyalty merchant card
     * @param loyaltyMerchantCardId Loyalty merchant card id (required)
     * @param loyaltyCustomerId Loyalty customer id (required)
     * @return ApiResponse&lt;LoyaltyMerchantcardsProductModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<LoyaltyMerchantcardsProductModel> loyaltyMerchantCardssetCustomerWithHttpInfo(String loyaltyMerchantCardId, String loyaltyCustomerId) throws ApiException {
        com.squareup.okhttp.Call call = loyaltyMerchantCardssetCustomerValidateBeforeCall(loyaltyMerchantCardId, loyaltyCustomerId, null, null);
        Type localVarReturnType = new TypeToken<LoyaltyMerchantcardsProductModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * POST Loyalty/MerchantCards/{loyaltyMerchantCardId}/setCustomer/{loyaltyCustomerId} (asynchronously)
     * Set loyalty customer for a loyalty merchant card
     * @param loyaltyMerchantCardId Loyalty merchant card id (required)
     * @param loyaltyCustomerId Loyalty customer id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call loyaltyMerchantCardssetCustomerAsync(String loyaltyMerchantCardId, String loyaltyCustomerId, final ApiCallback<LoyaltyMerchantcardsProductModel> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = loyaltyMerchantCardssetCustomerValidateBeforeCall(loyaltyMerchantCardId, loyaltyCustomerId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<LoyaltyMerchantcardsProductModel>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for loyaltyMerchantCardsunlock
     * @param loyaltyMerchantCardId Loyalty merchant card id (required)
     * @param body Information about unlock (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call loyaltyMerchantCardsunlockCall(String loyaltyMerchantCardId, LoyaltyMerchantcardsDTOLock body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/Loyalty/MerchantCards/{loyaltyMerchantCardId}/unlock"
            .replaceAll("\\{" + "loyaltyMerchantCardId" + "\\}", apiClient.escapeString(loyaltyMerchantCardId.toString()));

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
    private com.squareup.okhttp.Call loyaltyMerchantCardsunlockValidateBeforeCall(String loyaltyMerchantCardId, LoyaltyMerchantcardsDTOLock body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'loyaltyMerchantCardId' is set
        if (loyaltyMerchantCardId == null) {
            throw new ApiException("Missing the required parameter 'loyaltyMerchantCardId' when calling loyaltyMerchantCardsunlock(Async)");
        }
        
        com.squareup.okhttp.Call call = loyaltyMerchantCardsunlockCall(loyaltyMerchantCardId, body, progressListener, progressRequestListener);
        return call;
    }

    /**
     * POST Loyalty/MerchantCards/{loyaltyMerchantCardId}/unlock
     * Unlock merchant card
     * @param loyaltyMerchantCardId Loyalty merchant card id (required)
     * @param body Information about unlock (optional)
     * @return LoyaltyMerchantcardsProductModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public LoyaltyMerchantcardsProductModel loyaltyMerchantCardsunlock(String loyaltyMerchantCardId, LoyaltyMerchantcardsDTOLock body) throws ApiException {
        ApiResponse<LoyaltyMerchantcardsProductModel> resp = loyaltyMerchantCardsunlockWithHttpInfo(loyaltyMerchantCardId, body);
        return resp.getData();
    }

    /**
     * POST Loyalty/MerchantCards/{loyaltyMerchantCardId}/unlock
     * Unlock merchant card
     * @param loyaltyMerchantCardId Loyalty merchant card id (required)
     * @param body Information about unlock (optional)
     * @return ApiResponse&lt;LoyaltyMerchantcardsProductModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<LoyaltyMerchantcardsProductModel> loyaltyMerchantCardsunlockWithHttpInfo(String loyaltyMerchantCardId, LoyaltyMerchantcardsDTOLock body) throws ApiException {
        com.squareup.okhttp.Call call = loyaltyMerchantCardsunlockValidateBeforeCall(loyaltyMerchantCardId, body, null, null);
        Type localVarReturnType = new TypeToken<LoyaltyMerchantcardsProductModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * POST Loyalty/MerchantCards/{loyaltyMerchantCardId}/unlock (asynchronously)
     * Unlock merchant card
     * @param loyaltyMerchantCardId Loyalty merchant card id (required)
     * @param body Information about unlock (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call loyaltyMerchantCardsunlockAsync(String loyaltyMerchantCardId, LoyaltyMerchantcardsDTOLock body, final ApiCallback<LoyaltyMerchantcardsProductModel> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = loyaltyMerchantCardsunlockValidateBeforeCall(loyaltyMerchantCardId, body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<LoyaltyMerchantcardsProductModel>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for loyaltyMerchantCardsupdateCardGroupOfMerchantCard
     * @param loyaltyMerchantCardId Loyalty merchant card id (required)
     * @param loyaltyCardGroupId Loyalty card group id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call loyaltyMerchantCardsupdateCardGroupOfMerchantCardCall(String loyaltyMerchantCardId, String loyaltyCardGroupId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Loyalty/MerchantCards/{loyaltyMerchantCardId}/cardgroup/{loyaltyCardGroupId}"
            .replaceAll("\\{" + "loyaltyMerchantCardId" + "\\}", apiClient.escapeString(loyaltyMerchantCardId.toString()))
            .replaceAll("\\{" + "loyaltyCardGroupId" + "\\}", apiClient.escapeString(loyaltyCardGroupId.toString()));

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
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call loyaltyMerchantCardsupdateCardGroupOfMerchantCardValidateBeforeCall(String loyaltyMerchantCardId, String loyaltyCardGroupId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'loyaltyMerchantCardId' is set
        if (loyaltyMerchantCardId == null) {
            throw new ApiException("Missing the required parameter 'loyaltyMerchantCardId' when calling loyaltyMerchantCardsupdateCardGroupOfMerchantCard(Async)");
        }
        // verify the required parameter 'loyaltyCardGroupId' is set
        if (loyaltyCardGroupId == null) {
            throw new ApiException("Missing the required parameter 'loyaltyCardGroupId' when calling loyaltyMerchantCardsupdateCardGroupOfMerchantCard(Async)");
        }
        
        com.squareup.okhttp.Call call = loyaltyMerchantCardsupdateCardGroupOfMerchantCardCall(loyaltyMerchantCardId, loyaltyCardGroupId, progressListener, progressRequestListener);
        return call;
    }

    /**
     * PUT Loyalty/MerchantCards/{loyaltyMerchantCardId}/cardgroup/{loyaltyCardGroupId}
     * Update loyalty card group
     * @param loyaltyMerchantCardId Loyalty merchant card id (required)
     * @param loyaltyCardGroupId Loyalty card group id (required)
     * @return LoyaltyMerchantcardsProductModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public LoyaltyMerchantcardsProductModel loyaltyMerchantCardsupdateCardGroupOfMerchantCard(String loyaltyMerchantCardId, String loyaltyCardGroupId) throws ApiException {
        ApiResponse<LoyaltyMerchantcardsProductModel> resp = loyaltyMerchantCardsupdateCardGroupOfMerchantCardWithHttpInfo(loyaltyMerchantCardId, loyaltyCardGroupId);
        return resp.getData();
    }

    /**
     * PUT Loyalty/MerchantCards/{loyaltyMerchantCardId}/cardgroup/{loyaltyCardGroupId}
     * Update loyalty card group
     * @param loyaltyMerchantCardId Loyalty merchant card id (required)
     * @param loyaltyCardGroupId Loyalty card group id (required)
     * @return ApiResponse&lt;LoyaltyMerchantcardsProductModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<LoyaltyMerchantcardsProductModel> loyaltyMerchantCardsupdateCardGroupOfMerchantCardWithHttpInfo(String loyaltyMerchantCardId, String loyaltyCardGroupId) throws ApiException {
        com.squareup.okhttp.Call call = loyaltyMerchantCardsupdateCardGroupOfMerchantCardValidateBeforeCall(loyaltyMerchantCardId, loyaltyCardGroupId, null, null);
        Type localVarReturnType = new TypeToken<LoyaltyMerchantcardsProductModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * PUT Loyalty/MerchantCards/{loyaltyMerchantCardId}/cardgroup/{loyaltyCardGroupId} (asynchronously)
     * Update loyalty card group
     * @param loyaltyMerchantCardId Loyalty merchant card id (required)
     * @param loyaltyCardGroupId Loyalty card group id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call loyaltyMerchantCardsupdateCardGroupOfMerchantCardAsync(String loyaltyMerchantCardId, String loyaltyCardGroupId, final ApiCallback<LoyaltyMerchantcardsProductModel> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = loyaltyMerchantCardsupdateCardGroupOfMerchantCardValidateBeforeCall(loyaltyMerchantCardId, loyaltyCardGroupId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<LoyaltyMerchantcardsProductModel>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for loyaltyMerchantCardsupdateMerchantCard
     * @param loyaltyMerchantCardId Loyalty merchant card id (required)
     * @param body Loyalty merchant card properties (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call loyaltyMerchantCardsupdateMerchantCardCall(String loyaltyMerchantCardId, LoyaltyMerchantcardsDTO body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/Loyalty/MerchantCards/{loyaltyMerchantCardId}"
            .replaceAll("\\{" + "loyaltyMerchantCardId" + "\\}", apiClient.escapeString(loyaltyMerchantCardId.toString()));

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
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call loyaltyMerchantCardsupdateMerchantCardValidateBeforeCall(String loyaltyMerchantCardId, LoyaltyMerchantcardsDTO body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'loyaltyMerchantCardId' is set
        if (loyaltyMerchantCardId == null) {
            throw new ApiException("Missing the required parameter 'loyaltyMerchantCardId' when calling loyaltyMerchantCardsupdateMerchantCard(Async)");
        }
        
        com.squareup.okhttp.Call call = loyaltyMerchantCardsupdateMerchantCardCall(loyaltyMerchantCardId, body, progressListener, progressRequestListener);
        return call;
    }

    /**
     * PUT Loyalty/MerchantCards/{loyaltyMerchantCardId}
     * Update loyalty merchant card
     * @param loyaltyMerchantCardId Loyalty merchant card id (required)
     * @param body Loyalty merchant card properties (optional)
     * @return LoyaltyMerchantcardsProductModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public LoyaltyMerchantcardsProductModel loyaltyMerchantCardsupdateMerchantCard(String loyaltyMerchantCardId, LoyaltyMerchantcardsDTO body) throws ApiException {
        ApiResponse<LoyaltyMerchantcardsProductModel> resp = loyaltyMerchantCardsupdateMerchantCardWithHttpInfo(loyaltyMerchantCardId, body);
        return resp.getData();
    }

    /**
     * PUT Loyalty/MerchantCards/{loyaltyMerchantCardId}
     * Update loyalty merchant card
     * @param loyaltyMerchantCardId Loyalty merchant card id (required)
     * @param body Loyalty merchant card properties (optional)
     * @return ApiResponse&lt;LoyaltyMerchantcardsProductModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<LoyaltyMerchantcardsProductModel> loyaltyMerchantCardsupdateMerchantCardWithHttpInfo(String loyaltyMerchantCardId, LoyaltyMerchantcardsDTO body) throws ApiException {
        com.squareup.okhttp.Call call = loyaltyMerchantCardsupdateMerchantCardValidateBeforeCall(loyaltyMerchantCardId, body, null, null);
        Type localVarReturnType = new TypeToken<LoyaltyMerchantcardsProductModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * PUT Loyalty/MerchantCards/{loyaltyMerchantCardId} (asynchronously)
     * Update loyalty merchant card
     * @param loyaltyMerchantCardId Loyalty merchant card id (required)
     * @param body Loyalty merchant card properties (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call loyaltyMerchantCardsupdateMerchantCardAsync(String loyaltyMerchantCardId, LoyaltyMerchantcardsDTO body, final ApiCallback<LoyaltyMerchantcardsProductModel> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = loyaltyMerchantCardsupdateMerchantCardValidateBeforeCall(loyaltyMerchantCardId, body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<LoyaltyMerchantcardsProductModel>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for loyaltyMerchantCardsvalidateMerchantCard
     * @param loyaltyMerchantCardId Loyalty merchant card id (required)
     * @param body Information about card (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call loyaltyMerchantCardsvalidateMerchantCardCall(String loyaltyMerchantCardId, LoyaltyMerchantcardsDTOValidateMerchantCard body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/Loyalty/MerchantCards/{loyaltyMerchantCardId}/validateMerchantcard"
            .replaceAll("\\{" + "loyaltyMerchantCardId" + "\\}", apiClient.escapeString(loyaltyMerchantCardId.toString()));

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
    private com.squareup.okhttp.Call loyaltyMerchantCardsvalidateMerchantCardValidateBeforeCall(String loyaltyMerchantCardId, LoyaltyMerchantcardsDTOValidateMerchantCard body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'loyaltyMerchantCardId' is set
        if (loyaltyMerchantCardId == null) {
            throw new ApiException("Missing the required parameter 'loyaltyMerchantCardId' when calling loyaltyMerchantCardsvalidateMerchantCard(Async)");
        }
        
        com.squareup.okhttp.Call call = loyaltyMerchantCardsvalidateMerchantCardCall(loyaltyMerchantCardId, body, progressListener, progressRequestListener);
        return call;
    }

    /**
     * POST Loyalty/MerchantCards/{loyaltyMerchantCardId}/validateMerchantcard
     * Function to check the merchant card
     * @param loyaltyMerchantCardId Loyalty merchant card id (required)
     * @param body Information about card (optional)
     * @return LoyaltyMerchantcardsValidateMerchantCard
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public LoyaltyMerchantcardsValidateMerchantCard loyaltyMerchantCardsvalidateMerchantCard(String loyaltyMerchantCardId, LoyaltyMerchantcardsDTOValidateMerchantCard body) throws ApiException {
        ApiResponse<LoyaltyMerchantcardsValidateMerchantCard> resp = loyaltyMerchantCardsvalidateMerchantCardWithHttpInfo(loyaltyMerchantCardId, body);
        return resp.getData();
    }

    /**
     * POST Loyalty/MerchantCards/{loyaltyMerchantCardId}/validateMerchantcard
     * Function to check the merchant card
     * @param loyaltyMerchantCardId Loyalty merchant card id (required)
     * @param body Information about card (optional)
     * @return ApiResponse&lt;LoyaltyMerchantcardsValidateMerchantCard&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<LoyaltyMerchantcardsValidateMerchantCard> loyaltyMerchantCardsvalidateMerchantCardWithHttpInfo(String loyaltyMerchantCardId, LoyaltyMerchantcardsDTOValidateMerchantCard body) throws ApiException {
        com.squareup.okhttp.Call call = loyaltyMerchantCardsvalidateMerchantCardValidateBeforeCall(loyaltyMerchantCardId, body, null, null);
        Type localVarReturnType = new TypeToken<LoyaltyMerchantcardsValidateMerchantCard>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * POST Loyalty/MerchantCards/{loyaltyMerchantCardId}/validateMerchantcard (asynchronously)
     * Function to check the merchant card
     * @param loyaltyMerchantCardId Loyalty merchant card id (required)
     * @param body Information about card (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call loyaltyMerchantCardsvalidateMerchantCardAsync(String loyaltyMerchantCardId, LoyaltyMerchantcardsDTOValidateMerchantCard body, final ApiCallback<LoyaltyMerchantcardsValidateMerchantCard> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = loyaltyMerchantCardsvalidateMerchantCardValidateBeforeCall(loyaltyMerchantCardId, body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<LoyaltyMerchantcardsValidateMerchantCard>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}

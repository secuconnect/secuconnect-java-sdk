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
import io.secuconnect.client.model.LoyaltyCustomersDTO;
import io.secuconnect.client.model.LoyaltyMerchantcardsCardBalanceReceipt;
import io.secuconnect.client.model.LoyaltyMerchantcardsDTO;
import io.secuconnect.client.model.LoyaltyMerchantcardsDTOCardBalanceReceipt;
import io.secuconnect.client.model.LoyaltyMerchantcardsDTOCardsAmount;
import io.secuconnect.client.model.LoyaltyMerchantcardsDTOCheckPasscode;
import io.secuconnect.client.model.LoyaltyMerchantcardsDTOCsc;
import io.secuconnect.client.model.LoyaltyMerchantcardsDTOLock;
import io.secuconnect.client.model.LoyaltyMerchantcardsDTONewPasscode;
import io.secuconnect.client.model.LoyaltyMerchantcardsDTOResetPasscode;
import io.secuconnect.client.model.LoyaltyMerchantcardsDTOTransaction;
import io.secuconnect.client.model.LoyaltyMerchantcardsDTOValidateMerchantCard;
import io.secuconnect.client.model.LoyaltyMerchantcardsList;
import io.secuconnect.client.model.LoyaltyMerchantcardsProductModel;
import io.secuconnect.client.model.LoyaltyMerchantcardsProductWithReceiptModel;
import io.secuconnect.client.model.LoyaltyMerchantcardsValidateMerchantCard;
import io.secuconnect.client.model.ProductExceptionPayload;
import io.secuconnect.client.model.ResultBoolean;
import io.secuconnect.client.model.VirtualTerminalDataModel;
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
     * Build call for addMerchantCard
     * @param body Loyalty merchant card properties
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call addMerchantCardCall(LoyaltyMerchantcardsDTO body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
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
                public com.squareup.okhttp.Response intercept(Chain chain) throws IOException {
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
    private com.squareup.okhttp.Call addMerchantCardValidateBeforeCall(LoyaltyMerchantcardsDTO body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = addMerchantCardCall(body, progressListener, progressRequestListener);
        return call;
    }

    /**
     * POST Loyalty/MerchantCards
     * Add new loyalty merchant card
     * @param body Loyalty merchant card properties
     * @return LoyaltyMerchantcardsProductModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public LoyaltyMerchantcardsProductModel addMerchantCard(LoyaltyMerchantcardsDTO body) throws ApiException {
        ApiResponse<LoyaltyMerchantcardsProductModel> resp = addMerchantCardWithHttpInfo(body);
        return resp.getData();
    }

    /**
     * POST Loyalty/MerchantCards
     * Add new loyalty merchant card
     * @param body Loyalty merchant card properties
     * @return ApiResponse&lt;LoyaltyMerchantcardsProductModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<LoyaltyMerchantcardsProductModel> addMerchantCardWithHttpInfo(LoyaltyMerchantcardsDTO body) throws ApiException {
        com.squareup.okhttp.Call call = addMerchantCardValidateBeforeCall(body, null, null);
        Type localVarReturnType = new TypeToken<LoyaltyMerchantcardsProductModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * POST Loyalty/MerchantCards (asynchronously)
     * Add new loyalty merchant card
     * @param body Loyalty merchant card properties
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call addMerchantCardAsync(LoyaltyMerchantcardsDTO body, final ApiCallback<LoyaltyMerchantcardsProductModel> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = addMerchantCardValidateBeforeCall(body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<LoyaltyMerchantcardsProductModel>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for cardBalanceReceipt
     * @param loyaltyMerchantCardId Loyalty merchant card id (required)
     * @param body Information about card &amp; current terminal
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call cardBalanceReceiptCall(String loyaltyMerchantCardId, LoyaltyMerchantcardsDTOCardBalanceReceipt body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/Loyalty/MerchantCards/{loyaltyMerchantCardId}/getCardBalanceReceipt"
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
                public com.squareup.okhttp.Response intercept(Chain chain) throws IOException {
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
    private com.squareup.okhttp.Call cardBalanceReceiptValidateBeforeCall(String loyaltyMerchantCardId, LoyaltyMerchantcardsDTOCardBalanceReceipt body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'loyaltyMerchantCardId' is set
        if (loyaltyMerchantCardId == null) {
            throw new ApiException("Missing the required parameter 'loyaltyMerchantCardId' when calling cardBalanceReceipt(Async)");
        }
        
        com.squareup.okhttp.Call call = cardBalanceReceiptCall(loyaltyMerchantCardId, body, progressListener, progressRequestListener);
        return call;
    }

    /**
     * POST Loyalty/MerchantCards/{loyaltyMerchantCardId}/getCardBalanceReceipt
     * Get card balance receipt and information about limit data and passcode protection
     * @param loyaltyMerchantCardId Loyalty merchant card id (required)
     * @param body Information about card &amp; current terminal
     * @return LoyaltyMerchantcardsCardBalanceReceipt
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public LoyaltyMerchantcardsCardBalanceReceipt cardBalanceReceipt(String loyaltyMerchantCardId, LoyaltyMerchantcardsDTOCardBalanceReceipt body) throws ApiException {
        ApiResponse<LoyaltyMerchantcardsCardBalanceReceipt> resp = cardBalanceReceiptWithHttpInfo(loyaltyMerchantCardId, body);
        return resp.getData();
    }

    /**
     * POST Loyalty/MerchantCards/{loyaltyMerchantCardId}/getCardBalanceReceipt
     * Get card balance receipt and information about limit data and passcode protection
     * @param loyaltyMerchantCardId Loyalty merchant card id (required)
     * @param body Information about card &amp; current terminal
     * @return ApiResponse&lt;LoyaltyMerchantcardsCardBalanceReceipt&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<LoyaltyMerchantcardsCardBalanceReceipt> cardBalanceReceiptWithHttpInfo(String loyaltyMerchantCardId, LoyaltyMerchantcardsDTOCardBalanceReceipt body) throws ApiException {
        com.squareup.okhttp.Call call = cardBalanceReceiptValidateBeforeCall(loyaltyMerchantCardId, body, null, null);
        Type localVarReturnType = new TypeToken<LoyaltyMerchantcardsCardBalanceReceipt>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * POST Loyalty/MerchantCards/{loyaltyMerchantCardId}/getCardBalanceReceipt (asynchronously)
     * Get card balance receipt and information about limit data and passcode protection
     * @param loyaltyMerchantCardId Loyalty merchant card id (required)
     * @param body Information about card &amp; current terminal
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call cardBalanceReceiptAsync(String loyaltyMerchantCardId, LoyaltyMerchantcardsDTOCardBalanceReceipt body, final ApiCallback<LoyaltyMerchantcardsCardBalanceReceipt> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = cardBalanceReceiptValidateBeforeCall(loyaltyMerchantCardId, body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<LoyaltyMerchantcardsCardBalanceReceipt>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for checkCsc
     * @param loyaltyMerchantCardId Loyalty merchant card id (required)
     * @param body Information about card
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call checkCscCall(String loyaltyMerchantCardId, LoyaltyMerchantcardsDTOCsc body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
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
                public com.squareup.okhttp.Response intercept(Chain chain) throws IOException {
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
    private com.squareup.okhttp.Call checkCscValidateBeforeCall(String loyaltyMerchantCardId, LoyaltyMerchantcardsDTOCsc body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'loyaltyMerchantCardId' is set
        if (loyaltyMerchantCardId == null) {
            throw new ApiException("Missing the required parameter 'loyaltyMerchantCardId' when calling checkCsc(Async)");
        }
        
        com.squareup.okhttp.Call call = checkCscCall(loyaltyMerchantCardId, body, progressListener, progressRequestListener);
        return call;
    }

    /**
     * POST Loyalty/MerchantCards/{loyaltyMerchantCardId}/checkCsc
     * Check CSC
     * @param loyaltyMerchantCardId Loyalty merchant card id (required)
     * @param body Information about card
     * @return ResultBoolean
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ResultBoolean checkCsc(String loyaltyMerchantCardId, LoyaltyMerchantcardsDTOCsc body) throws ApiException {
        ApiResponse<ResultBoolean> resp = checkCscWithHttpInfo(loyaltyMerchantCardId, body);
        return resp.getData();
    }

    /**
     * POST Loyalty/MerchantCards/{loyaltyMerchantCardId}/checkCsc
     * Check CSC
     * @param loyaltyMerchantCardId Loyalty merchant card id (required)
     * @param body Information about card
     * @return ApiResponse&lt;ResultBoolean&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ResultBoolean> checkCscWithHttpInfo(String loyaltyMerchantCardId, LoyaltyMerchantcardsDTOCsc body) throws ApiException {
        com.squareup.okhttp.Call call = checkCscValidateBeforeCall(loyaltyMerchantCardId, body, null, null);
        Type localVarReturnType = new TypeToken<ResultBoolean>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * POST Loyalty/MerchantCards/{loyaltyMerchantCardId}/checkCsc (asynchronously)
     * Check CSC
     * @param loyaltyMerchantCardId Loyalty merchant card id (required)
     * @param body Information about card
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call checkCscAsync(String loyaltyMerchantCardId, LoyaltyMerchantcardsDTOCsc body, final ApiCallback<ResultBoolean> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = checkCscValidateBeforeCall(loyaltyMerchantCardId, body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ResultBoolean>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for checkPassCode
     * @param loyaltyMerchantCardId Loyalty merchant card id (required)
     * @param body Information about card
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call checkPassCodeCall(String loyaltyMerchantCardId, LoyaltyMerchantcardsDTOCheckPasscode body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
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
                public com.squareup.okhttp.Response intercept(Chain chain) throws IOException {
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
    private com.squareup.okhttp.Call checkPassCodeValidateBeforeCall(String loyaltyMerchantCardId, LoyaltyMerchantcardsDTOCheckPasscode body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'loyaltyMerchantCardId' is set
        if (loyaltyMerchantCardId == null) {
            throw new ApiException("Missing the required parameter 'loyaltyMerchantCardId' when calling checkPassCode(Async)");
        }
        
        com.squareup.okhttp.Call call = checkPassCodeCall(loyaltyMerchantCardId, body, progressListener, progressRequestListener);
        return call;
    }

    /**
     * POST Loyalty/MerchantCards/{loyaltyMerchantCardId}/checkPasscode
     * Function to check the Passcode card with cardnumber
     * @param loyaltyMerchantCardId Loyalty merchant card id (required)
     * @param body Information about card
     * @return ResultBoolean
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ResultBoolean checkPassCode(String loyaltyMerchantCardId, LoyaltyMerchantcardsDTOCheckPasscode body) throws ApiException {
        ApiResponse<ResultBoolean> resp = checkPassCodeWithHttpInfo(loyaltyMerchantCardId, body);
        return resp.getData();
    }

    /**
     * POST Loyalty/MerchantCards/{loyaltyMerchantCardId}/checkPasscode
     * Function to check the Passcode card with cardnumber
     * @param loyaltyMerchantCardId Loyalty merchant card id (required)
     * @param body Information about card
     * @return ApiResponse&lt;ResultBoolean&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ResultBoolean> checkPassCodeWithHttpInfo(String loyaltyMerchantCardId, LoyaltyMerchantcardsDTOCheckPasscode body) throws ApiException {
        com.squareup.okhttp.Call call = checkPassCodeValidateBeforeCall(loyaltyMerchantCardId, body, null, null);
        Type localVarReturnType = new TypeToken<ResultBoolean>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * POST Loyalty/MerchantCards/{loyaltyMerchantCardId}/checkPasscode (asynchronously)
     * Function to check the Passcode card with cardnumber
     * @param loyaltyMerchantCardId Loyalty merchant card id (required)
     * @param body Information about card
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call checkPassCodeAsync(String loyaltyMerchantCardId, LoyaltyMerchantcardsDTOCheckPasscode body, final ApiCallback<ResultBoolean> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = checkPassCodeValidateBeforeCall(loyaltyMerchantCardId, body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ResultBoolean>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for createMerchantcards
     * @param generalMerchantId General merchant id (required)
     * @param loyaltyCardgroupId Loyalty card group id (required)
     * @param body Cards amount
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call createMerchantcardsCall(String generalMerchantId, String loyaltyCardgroupId, LoyaltyMerchantcardsDTOCardsAmount body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
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
                public com.squareup.okhttp.Response intercept(Chain chain) throws IOException {
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
    private com.squareup.okhttp.Call createMerchantcardsValidateBeforeCall(String generalMerchantId, String loyaltyCardgroupId, LoyaltyMerchantcardsDTOCardsAmount body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'generalMerchantId' is set
        if (generalMerchantId == null) {
            throw new ApiException("Missing the required parameter 'generalMerchantId' when calling createMerchantcards(Async)");
        }
        // verify the required parameter 'loyaltyCardgroupId' is set
        if (loyaltyCardgroupId == null) {
            throw new ApiException("Missing the required parameter 'loyaltyCardgroupId' when calling createMerchantcards(Async)");
        }
        
        com.squareup.okhttp.Call call = createMerchantcardsCall(generalMerchantId, loyaltyCardgroupId, body, progressListener, progressRequestListener);
        return call;
    }

    /**
     * POST Loyalty/MerchantCards/{generalMerchantId}/createMerchantcards/{loyaltyCardgroupId}
     * Function to create multiple merchantcards for given merchant with given cardgroup
     * @param generalMerchantId General merchant id (required)
     * @param loyaltyCardgroupId Loyalty card group id (required)
     * @param body Cards amount
     * @return List&lt;LoyaltyMerchantcardsProductModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<LoyaltyMerchantcardsProductModel> createMerchantcards(String generalMerchantId, String loyaltyCardgroupId, LoyaltyMerchantcardsDTOCardsAmount body) throws ApiException {
        ApiResponse<List<LoyaltyMerchantcardsProductModel>> resp = createMerchantcardsWithHttpInfo(generalMerchantId, loyaltyCardgroupId, body);
        return resp.getData();
    }

    /**
     * POST Loyalty/MerchantCards/{generalMerchantId}/createMerchantcards/{loyaltyCardgroupId}
     * Function to create multiple merchantcards for given merchant with given cardgroup
     * @param generalMerchantId General merchant id (required)
     * @param loyaltyCardgroupId Loyalty card group id (required)
     * @param body Cards amount
     * @return ApiResponse&lt;List&lt;LoyaltyMerchantcardsProductModel&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<LoyaltyMerchantcardsProductModel>> createMerchantcardsWithHttpInfo(String generalMerchantId, String loyaltyCardgroupId, LoyaltyMerchantcardsDTOCardsAmount body) throws ApiException {
        com.squareup.okhttp.Call call = createMerchantcardsValidateBeforeCall(generalMerchantId, loyaltyCardgroupId, body, null, null);
        Type localVarReturnType = new TypeToken<List<LoyaltyMerchantcardsProductModel>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * POST Loyalty/MerchantCards/{generalMerchantId}/createMerchantcards/{loyaltyCardgroupId} (asynchronously)
     * Function to create multiple merchantcards for given merchant with given cardgroup
     * @param generalMerchantId General merchant id (required)
     * @param loyaltyCardgroupId Loyalty card group id (required)
     * @param body Cards amount
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call createMerchantcardsAsync(String generalMerchantId, String loyaltyCardgroupId, LoyaltyMerchantcardsDTOCardsAmount body, final ApiCallback<List<LoyaltyMerchantcardsProductModel>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = createMerchantcardsValidateBeforeCall(generalMerchantId, loyaltyCardgroupId, body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<LoyaltyMerchantcardsProductModel>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for executeTransaction
     * @param loyaltyMerchantCardId Loyalty merchant card id (required)
     * @param body Transaction properties
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call executeTransactionCall(String loyaltyMerchantCardId, LoyaltyMerchantcardsDTOTransaction body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
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
                public com.squareup.okhttp.Response intercept(Chain chain) throws IOException {
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
    private com.squareup.okhttp.Call executeTransactionValidateBeforeCall(String loyaltyMerchantCardId, LoyaltyMerchantcardsDTOTransaction body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'loyaltyMerchantCardId' is set
        if (loyaltyMerchantCardId == null) {
            throw new ApiException("Missing the required parameter 'loyaltyMerchantCardId' when calling executeTransaction(Async)");
        }
        
        com.squareup.okhttp.Call call = executeTransactionCall(loyaltyMerchantCardId, body, progressListener, progressRequestListener);
        return call;
    }

    /**
     * POST Loyalty/MerchantCards/{loyaltyMerchantCardId}/transaction
     * Execute transaction from SDK
     * @param loyaltyMerchantCardId Loyalty merchant card id (required)
     * @param body Transaction properties
     * @return LoyaltyMerchantcardsProductWithReceiptModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public LoyaltyMerchantcardsProductWithReceiptModel executeTransaction(String loyaltyMerchantCardId, LoyaltyMerchantcardsDTOTransaction body) throws ApiException {
        ApiResponse<LoyaltyMerchantcardsProductWithReceiptModel> resp = executeTransactionWithHttpInfo(loyaltyMerchantCardId, body);
        return resp.getData();
    }

    /**
     * POST Loyalty/MerchantCards/{loyaltyMerchantCardId}/transaction
     * Execute transaction from SDK
     * @param loyaltyMerchantCardId Loyalty merchant card id (required)
     * @param body Transaction properties
     * @return ApiResponse&lt;LoyaltyMerchantcardsProductWithReceiptModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<LoyaltyMerchantcardsProductWithReceiptModel> executeTransactionWithHttpInfo(String loyaltyMerchantCardId, LoyaltyMerchantcardsDTOTransaction body) throws ApiException {
        com.squareup.okhttp.Call call = executeTransactionValidateBeforeCall(loyaltyMerchantCardId, body, null, null);
        Type localVarReturnType = new TypeToken<LoyaltyMerchantcardsProductWithReceiptModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * POST Loyalty/MerchantCards/{loyaltyMerchantCardId}/transaction (asynchronously)
     * Execute transaction from SDK
     * @param loyaltyMerchantCardId Loyalty merchant card id (required)
     * @param body Transaction properties
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call executeTransactionAsync(String loyaltyMerchantCardId, LoyaltyMerchantcardsDTOTransaction body, final ApiCallback<LoyaltyMerchantcardsProductWithReceiptModel> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = executeTransactionValidateBeforeCall(loyaltyMerchantCardId, body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<LoyaltyMerchantcardsProductWithReceiptModel>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getAll
     * @param count The maximum number of items to return
     * @param offset The position within the whole result set to start returning items (zero-based)
     * @param fields List of fields to include in the result. Nested properties can be accessed with this notation: &#x60;prop1.prop2&#x60;.
     * @param q A query string to restrict the returned items to given conditions. The query string must consist of any combination of single expressions in the form &#x60;property:condition&#x60;. Property names can be nested like &#x60;property.property&#x60;.  Example: &#x60;customer.name:Meier&#x60;  A condition may contain:  * &#x60;?&#x60; as wildcard for one character;  * &#x60;*&#x60; as wildcard for any number of characters.  You can also use value ranges in the form &#x60;[min TO max]&#x60;.  Example: &#x60;customer.age:[30 TO 40]&#x60;  You can combine expressions logically by &#x60;expr AND expr&#x60; and &#x60;{expr} OR {expr}&#x60;. You can also negate an expression using &#x60;NOT {expr}&#x60;. Parenthesis &#x60;(...)&#x60; can be used to control precedence.  Example: &#x60;(NOT customer.name:meier*) AND (customer.age:[30 TO 40] OR customer.age:[50 TO 60])&#x60;
     * @param sort String with comma separated pairs of &#x60;field:order&#x60;.   Options for order:  * &#x60;asc&#x60; ascending;  * &#x60;dsc&#x60; descending.
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getAllCall(Integer count, Integer offset, String fields, String q, String sort, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
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
                public com.squareup.okhttp.Response intercept(Chain chain) throws IOException {
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
    private com.squareup.okhttp.Call getAllValidateBeforeCall(Integer count, Integer offset, String fields, String q, String sort, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = getAllCall(count, offset, fields, q, sort, progressListener, progressRequestListener);
        return call;
    }

    /**
     * GET Loyalty/MerchantCards
     * Get a list of loyalty merchant cards
     * @param count The maximum number of items to return
     * @param offset The position within the whole result set to start returning items (zero-based)
     * @param fields List of fields to include in the result. Nested properties can be accessed with this notation: &#x60;prop1.prop2&#x60;.
     * @param q A query string to restrict the returned items to given conditions. The query string must consist of any combination of single expressions in the form &#x60;property:condition&#x60;. Property names can be nested like &#x60;property.property&#x60;.  Example: &#x60;customer.name:Meier&#x60;  A condition may contain:  * &#x60;?&#x60; as wildcard for one character;  * &#x60;*&#x60; as wildcard for any number of characters.  You can also use value ranges in the form &#x60;[min TO max]&#x60;.  Example: &#x60;customer.age:[30 TO 40]&#x60;  You can combine expressions logically by &#x60;expr AND expr&#x60; and &#x60;{expr} OR {expr}&#x60;. You can also negate an expression using &#x60;NOT {expr}&#x60;. Parenthesis &#x60;(...)&#x60; can be used to control precedence.  Example: &#x60;(NOT customer.name:meier*) AND (customer.age:[30 TO 40] OR customer.age:[50 TO 60])&#x60;
     * @param sort String with comma separated pairs of &#x60;field:order&#x60;.   Options for order:  * &#x60;asc&#x60; ascending;  * &#x60;dsc&#x60; descending.
     * @return LoyaltyMerchantcardsList
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public LoyaltyMerchantcardsList getAll(Integer count, Integer offset, String fields, String q, String sort) throws ApiException {
        ApiResponse<LoyaltyMerchantcardsList> resp = getAllWithHttpInfo(count, offset, fields, q, sort);
        return resp.getData();
    }

    /**
     * GET Loyalty/MerchantCards
     * Get a list of loyalty merchant cards
     * @param count The maximum number of items to return
     * @param offset The position within the whole result set to start returning items (zero-based)
     * @param fields List of fields to include in the result. Nested properties can be accessed with this notation: &#x60;prop1.prop2&#x60;.
     * @param q A query string to restrict the returned items to given conditions. The query string must consist of any combination of single expressions in the form &#x60;property:condition&#x60;. Property names can be nested like &#x60;property.property&#x60;.  Example: &#x60;customer.name:Meier&#x60;  A condition may contain:  * &#x60;?&#x60; as wildcard for one character;  * &#x60;*&#x60; as wildcard for any number of characters.  You can also use value ranges in the form &#x60;[min TO max]&#x60;.  Example: &#x60;customer.age:[30 TO 40]&#x60;  You can combine expressions logically by &#x60;expr AND expr&#x60; and &#x60;{expr} OR {expr}&#x60;. You can also negate an expression using &#x60;NOT {expr}&#x60;. Parenthesis &#x60;(...)&#x60; can be used to control precedence.  Example: &#x60;(NOT customer.name:meier*) AND (customer.age:[30 TO 40] OR customer.age:[50 TO 60])&#x60;
     * @param sort String with comma separated pairs of &#x60;field:order&#x60;.   Options for order:  * &#x60;asc&#x60; ascending;  * &#x60;dsc&#x60; descending.
     * @return ApiResponse&lt;LoyaltyMerchantcardsList&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<LoyaltyMerchantcardsList> getAllWithHttpInfo(Integer count, Integer offset, String fields, String q, String sort) throws ApiException {
        com.squareup.okhttp.Call call = getAllValidateBeforeCall(count, offset, fields, q, sort, null, null);
        Type localVarReturnType = new TypeToken<LoyaltyMerchantcardsList>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * GET Loyalty/MerchantCards (asynchronously)
     * Get a list of loyalty merchant cards
     * @param count The maximum number of items to return
     * @param offset The position within the whole result set to start returning items (zero-based)
     * @param fields List of fields to include in the result. Nested properties can be accessed with this notation: &#x60;prop1.prop2&#x60;.
     * @param q A query string to restrict the returned items to given conditions. The query string must consist of any combination of single expressions in the form &#x60;property:condition&#x60;. Property names can be nested like &#x60;property.property&#x60;.  Example: &#x60;customer.name:Meier&#x60;  A condition may contain:  * &#x60;?&#x60; as wildcard for one character;  * &#x60;*&#x60; as wildcard for any number of characters.  You can also use value ranges in the form &#x60;[min TO max]&#x60;.  Example: &#x60;customer.age:[30 TO 40]&#x60;  You can combine expressions logically by &#x60;expr AND expr&#x60; and &#x60;{expr} OR {expr}&#x60;. You can also negate an expression using &#x60;NOT {expr}&#x60;. Parenthesis &#x60;(...)&#x60; can be used to control precedence.  Example: &#x60;(NOT customer.name:meier*) AND (customer.age:[30 TO 40] OR customer.age:[50 TO 60])&#x60;
     * @param sort String with comma separated pairs of &#x60;field:order&#x60;.   Options for order:  * &#x60;asc&#x60; ascending;  * &#x60;dsc&#x60; descending.
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getAllAsync(Integer count, Integer offset, String fields, String q, String sort, final ApiCallback<LoyaltyMerchantcardsList> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getAllValidateBeforeCall(count, offset, fields, q, sort, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<LoyaltyMerchantcardsList>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getLock
     * @param loyaltyMerchantCardId Loyalty merchant card id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getLockCall(String loyaltyMerchantCardId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
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
                public com.squareup.okhttp.Response intercept(Chain chain) throws IOException {
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
    private com.squareup.okhttp.Call getLockValidateBeforeCall(String loyaltyMerchantCardId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'loyaltyMerchantCardId' is set
        if (loyaltyMerchantCardId == null) {
            throw new ApiException("Missing the required parameter 'loyaltyMerchantCardId' when calling getLock(Async)");
        }
        
        com.squareup.okhttp.Call call = getLockCall(loyaltyMerchantCardId, progressListener, progressRequestListener);
        return call;
    }

    /**
     * GET Loyalty/MerchantCards/{loyaltyMerchantCardId}/lock
     * Get loyalty merchant card lock information for a specific id
     * @param loyaltyMerchantCardId Loyalty merchant card id (required)
     * @return LoyaltyMerchantcardsDTOLock
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public LoyaltyMerchantcardsDTOLock getLock(String loyaltyMerchantCardId) throws ApiException {
        ApiResponse<LoyaltyMerchantcardsDTOLock> resp = getLockWithHttpInfo(loyaltyMerchantCardId);
        return resp.getData();
    }

    /**
     * GET Loyalty/MerchantCards/{loyaltyMerchantCardId}/lock
     * Get loyalty merchant card lock information for a specific id
     * @param loyaltyMerchantCardId Loyalty merchant card id (required)
     * @return ApiResponse&lt;LoyaltyMerchantcardsDTOLock&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<LoyaltyMerchantcardsDTOLock> getLockWithHttpInfo(String loyaltyMerchantCardId) throws ApiException {
        com.squareup.okhttp.Call call = getLockValidateBeforeCall(loyaltyMerchantCardId, null, null);
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
    public com.squareup.okhttp.Call getLockAsync(String loyaltyMerchantCardId, final ApiCallback<LoyaltyMerchantcardsDTOLock> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getLockValidateBeforeCall(loyaltyMerchantCardId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<LoyaltyMerchantcardsDTOLock>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getOne
     * @param loyaltyMerchantCardId Search one by provided id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getOneCall(String loyaltyMerchantCardId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
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
                public com.squareup.okhttp.Response intercept(Chain chain) throws IOException {
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
    private com.squareup.okhttp.Call getOneValidateBeforeCall(String loyaltyMerchantCardId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'loyaltyMerchantCardId' is set
        if (loyaltyMerchantCardId == null) {
            throw new ApiException("Missing the required parameter 'loyaltyMerchantCardId' when calling getOne(Async)");
        }
        
        com.squareup.okhttp.Call call = getOneCall(loyaltyMerchantCardId, progressListener, progressRequestListener);
        return call;
    }

    /**
     * GET Loyalty/MerchantCards/{loyaltyMerchantCardId}
     * Get loyalty merchant card for a specific id
     * @param loyaltyMerchantCardId Search one by provided id (required)
     * @return LoyaltyMerchantcardsProductModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public LoyaltyMerchantcardsProductModel getOne(String loyaltyMerchantCardId) throws ApiException {
        ApiResponse<LoyaltyMerchantcardsProductModel> resp = getOneWithHttpInfo(loyaltyMerchantCardId);
        return resp.getData();
    }

    /**
     * GET Loyalty/MerchantCards/{loyaltyMerchantCardId}
     * Get loyalty merchant card for a specific id
     * @param loyaltyMerchantCardId Search one by provided id (required)
     * @return ApiResponse&lt;LoyaltyMerchantcardsProductModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<LoyaltyMerchantcardsProductModel> getOneWithHttpInfo(String loyaltyMerchantCardId) throws ApiException {
        com.squareup.okhttp.Call call = getOneValidateBeforeCall(loyaltyMerchantCardId, null, null);
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
    public com.squareup.okhttp.Call getOneAsync(String loyaltyMerchantCardId, final ApiCallback<LoyaltyMerchantcardsProductModel> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getOneValidateBeforeCall(loyaltyMerchantCardId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<LoyaltyMerchantcardsProductModel>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getVirtualTerminalData
     * @param loyaltyMerchantCardId Merchant card id (required)
     * @param loyaltyMerchantId Merchant id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getVirtualTerminalDataCall(String loyaltyMerchantCardId, String loyaltyMerchantId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
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
                public com.squareup.okhttp.Response intercept(Chain chain) throws IOException {
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
    private com.squareup.okhttp.Call getVirtualTerminalDataValidateBeforeCall(String loyaltyMerchantCardId, String loyaltyMerchantId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'loyaltyMerchantCardId' is set
        if (loyaltyMerchantCardId == null) {
            throw new ApiException("Missing the required parameter 'loyaltyMerchantCardId' when calling getVirtualTerminalData(Async)");
        }
        // verify the required parameter 'loyaltyMerchantId' is set
        if (loyaltyMerchantId == null) {
            throw new ApiException("Missing the required parameter 'loyaltyMerchantId' when calling getVirtualTerminalData(Async)");
        }
        
        com.squareup.okhttp.Call call = getVirtualTerminalDataCall(loyaltyMerchantCardId, loyaltyMerchantId, progressListener, progressRequestListener);
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
    public VirtualTerminalDataModel getVirtualTerminalData(String loyaltyMerchantCardId, String loyaltyMerchantId) throws ApiException {
        ApiResponse<VirtualTerminalDataModel> resp = getVirtualTerminalDataWithHttpInfo(loyaltyMerchantCardId, loyaltyMerchantId);
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
    public ApiResponse<VirtualTerminalDataModel> getVirtualTerminalDataWithHttpInfo(String loyaltyMerchantCardId, String loyaltyMerchantId) throws ApiException {
        com.squareup.okhttp.Call call = getVirtualTerminalDataValidateBeforeCall(loyaltyMerchantCardId, loyaltyMerchantId, null, null);
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
    public com.squareup.okhttp.Call getVirtualTerminalDataAsync(String loyaltyMerchantCardId, String loyaltyMerchantId, final ApiCallback<VirtualTerminalDataModel> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getVirtualTerminalDataValidateBeforeCall(loyaltyMerchantCardId, loyaltyMerchantId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<VirtualTerminalDataModel>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for lock
     * @param loyaltyMerchantCardId Loyalty merchant card id (required)
     * @param body Information about lock
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call lockCall(String loyaltyMerchantCardId, LoyaltyMerchantcardsDTOLock body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
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
                public com.squareup.okhttp.Response intercept(Chain chain) throws IOException {
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
    private com.squareup.okhttp.Call lockValidateBeforeCall(String loyaltyMerchantCardId, LoyaltyMerchantcardsDTOLock body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'loyaltyMerchantCardId' is set
        if (loyaltyMerchantCardId == null) {
            throw new ApiException("Missing the required parameter 'loyaltyMerchantCardId' when calling lock(Async)");
        }
        
        com.squareup.okhttp.Call call = lockCall(loyaltyMerchantCardId, body, progressListener, progressRequestListener);
        return call;
    }

    /**
     * POST Loyalty/MerchantCards/{loyaltyMerchantCardId}/lock
     * Lock merchant card
     * @param loyaltyMerchantCardId Loyalty merchant card id (required)
     * @param body Information about lock
     * @return LoyaltyMerchantcardsProductModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public LoyaltyMerchantcardsProductModel lock(String loyaltyMerchantCardId, LoyaltyMerchantcardsDTOLock body) throws ApiException {
        ApiResponse<LoyaltyMerchantcardsProductModel> resp = lockWithHttpInfo(loyaltyMerchantCardId, body);
        return resp.getData();
    }

    /**
     * POST Loyalty/MerchantCards/{loyaltyMerchantCardId}/lock
     * Lock merchant card
     * @param loyaltyMerchantCardId Loyalty merchant card id (required)
     * @param body Information about lock
     * @return ApiResponse&lt;LoyaltyMerchantcardsProductModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<LoyaltyMerchantcardsProductModel> lockWithHttpInfo(String loyaltyMerchantCardId, LoyaltyMerchantcardsDTOLock body) throws ApiException {
        com.squareup.okhttp.Call call = lockValidateBeforeCall(loyaltyMerchantCardId, body, null, null);
        Type localVarReturnType = new TypeToken<LoyaltyMerchantcardsProductModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * POST Loyalty/MerchantCards/{loyaltyMerchantCardId}/lock (asynchronously)
     * Lock merchant card
     * @param loyaltyMerchantCardId Loyalty merchant card id (required)
     * @param body Information about lock
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call lockAsync(String loyaltyMerchantCardId, LoyaltyMerchantcardsDTOLock body, final ApiCallback<LoyaltyMerchantcardsProductModel> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = lockValidateBeforeCall(loyaltyMerchantCardId, body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<LoyaltyMerchantcardsProductModel>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for newPassCode
     * @param loyaltyMerchantCardId Loyalty merchant card id (required)
     * @param body Information about card
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call newPassCodeCall(String loyaltyMerchantCardId, LoyaltyMerchantcardsDTONewPasscode body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
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
                public com.squareup.okhttp.Response intercept(Chain chain) throws IOException {
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
    private com.squareup.okhttp.Call newPassCodeValidateBeforeCall(String loyaltyMerchantCardId, LoyaltyMerchantcardsDTONewPasscode body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'loyaltyMerchantCardId' is set
        if (loyaltyMerchantCardId == null) {
            throw new ApiException("Missing the required parameter 'loyaltyMerchantCardId' when calling newPassCode(Async)");
        }
        
        com.squareup.okhttp.Call call = newPassCodeCall(loyaltyMerchantCardId, body, progressListener, progressRequestListener);
        return call;
    }

    /**
     * POST Loyalty/MerchantCards/{loyaltyMerchantCardId}/newPasscode
     * Function to save new given passcode for given merchantcard identified by cardnumber
     * @param loyaltyMerchantCardId Loyalty merchant card id (required)
     * @param body Information about card
     * @return ResultBoolean
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ResultBoolean newPassCode(String loyaltyMerchantCardId, LoyaltyMerchantcardsDTONewPasscode body) throws ApiException {
        ApiResponse<ResultBoolean> resp = newPassCodeWithHttpInfo(loyaltyMerchantCardId, body);
        return resp.getData();
    }

    /**
     * POST Loyalty/MerchantCards/{loyaltyMerchantCardId}/newPasscode
     * Function to save new given passcode for given merchantcard identified by cardnumber
     * @param loyaltyMerchantCardId Loyalty merchant card id (required)
     * @param body Information about card
     * @return ApiResponse&lt;ResultBoolean&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ResultBoolean> newPassCodeWithHttpInfo(String loyaltyMerchantCardId, LoyaltyMerchantcardsDTONewPasscode body) throws ApiException {
        com.squareup.okhttp.Call call = newPassCodeValidateBeforeCall(loyaltyMerchantCardId, body, null, null);
        Type localVarReturnType = new TypeToken<ResultBoolean>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * POST Loyalty/MerchantCards/{loyaltyMerchantCardId}/newPasscode (asynchronously)
     * Function to save new given passcode for given merchantcard identified by cardnumber
     * @param loyaltyMerchantCardId Loyalty merchant card id (required)
     * @param body Information about card
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call newPassCodeAsync(String loyaltyMerchantCardId, LoyaltyMerchantcardsDTONewPasscode body, final ApiCallback<ResultBoolean> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = newPassCodeValidateBeforeCall(loyaltyMerchantCardId, body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ResultBoolean>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for registerCustomer
     * @param loyaltyMerchantCardId Loyalty merchant card id (required)
     * @param body Loyalty customer properties
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call registerCustomerCall(String loyaltyMerchantCardId, LoyaltyCustomersDTO body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
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
                public com.squareup.okhttp.Response intercept(Chain chain) throws IOException {
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
    private com.squareup.okhttp.Call registerCustomerValidateBeforeCall(String loyaltyMerchantCardId, LoyaltyCustomersDTO body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'loyaltyMerchantCardId' is set
        if (loyaltyMerchantCardId == null) {
            throw new ApiException("Missing the required parameter 'loyaltyMerchantCardId' when calling registerCustomer(Async)");
        }
        
        com.squareup.okhttp.Call call = registerCustomerCall(loyaltyMerchantCardId, body, progressListener, progressRequestListener);
        return call;
    }

    /**
     * POST Loyalty/MerchantCards/{loyaltyMerchantCardId}/registerCustomer
     * Register new customer for a card
     * @param loyaltyMerchantCardId Loyalty merchant card id (required)
     * @param body Loyalty customer properties
     * @return LoyaltyMerchantcardsProductModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public LoyaltyMerchantcardsProductModel registerCustomer(String loyaltyMerchantCardId, LoyaltyCustomersDTO body) throws ApiException {
        ApiResponse<LoyaltyMerchantcardsProductModel> resp = registerCustomerWithHttpInfo(loyaltyMerchantCardId, body);
        return resp.getData();
    }

    /**
     * POST Loyalty/MerchantCards/{loyaltyMerchantCardId}/registerCustomer
     * Register new customer for a card
     * @param loyaltyMerchantCardId Loyalty merchant card id (required)
     * @param body Loyalty customer properties
     * @return ApiResponse&lt;LoyaltyMerchantcardsProductModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<LoyaltyMerchantcardsProductModel> registerCustomerWithHttpInfo(String loyaltyMerchantCardId, LoyaltyCustomersDTO body) throws ApiException {
        com.squareup.okhttp.Call call = registerCustomerValidateBeforeCall(loyaltyMerchantCardId, body, null, null);
        Type localVarReturnType = new TypeToken<LoyaltyMerchantcardsProductModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * POST Loyalty/MerchantCards/{loyaltyMerchantCardId}/registerCustomer (asynchronously)
     * Register new customer for a card
     * @param loyaltyMerchantCardId Loyalty merchant card id (required)
     * @param body Loyalty customer properties
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call registerCustomerAsync(String loyaltyMerchantCardId, LoyaltyCustomersDTO body, final ApiCallback<LoyaltyMerchantcardsProductModel> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = registerCustomerValidateBeforeCall(loyaltyMerchantCardId, body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<LoyaltyMerchantcardsProductModel>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for removeMerchantCard
     * @param loyaltyMerchantCardId Loyalty merchant card id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call removeMerchantCardCall(String loyaltyMerchantCardId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
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
                public com.squareup.okhttp.Response intercept(Chain chain) throws IOException {
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
    private com.squareup.okhttp.Call removeMerchantCardValidateBeforeCall(String loyaltyMerchantCardId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'loyaltyMerchantCardId' is set
        if (loyaltyMerchantCardId == null) {
            throw new ApiException("Missing the required parameter 'loyaltyMerchantCardId' when calling removeMerchantCard(Async)");
        }
        
        com.squareup.okhttp.Call call = removeMerchantCardCall(loyaltyMerchantCardId, progressListener, progressRequestListener);
        return call;
    }

    /**
     * DELETE Loyalty/MerchantCards/{loyaltyMerchantCardId}
     * Delete loyalty merchant card
     * @param loyaltyMerchantCardId Loyalty merchant card id (required)
     * @return LoyaltyMerchantcardsProductModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public LoyaltyMerchantcardsProductModel removeMerchantCard(String loyaltyMerchantCardId) throws ApiException {
        ApiResponse<LoyaltyMerchantcardsProductModel> resp = removeMerchantCardWithHttpInfo(loyaltyMerchantCardId);
        return resp.getData();
    }

    /**
     * DELETE Loyalty/MerchantCards/{loyaltyMerchantCardId}
     * Delete loyalty merchant card
     * @param loyaltyMerchantCardId Loyalty merchant card id (required)
     * @return ApiResponse&lt;LoyaltyMerchantcardsProductModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<LoyaltyMerchantcardsProductModel> removeMerchantCardWithHttpInfo(String loyaltyMerchantCardId) throws ApiException {
        com.squareup.okhttp.Call call = removeMerchantCardValidateBeforeCall(loyaltyMerchantCardId, null, null);
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
    public com.squareup.okhttp.Call removeMerchantCardAsync(String loyaltyMerchantCardId, final ApiCallback<LoyaltyMerchantcardsProductModel> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = removeMerchantCardValidateBeforeCall(loyaltyMerchantCardId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<LoyaltyMerchantcardsProductModel>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for resetPassCode
     * @param loyaltyMerchantCardId Loyalty merchant card id (required)
     * @param body Information about card
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call resetPassCodeCall(String loyaltyMerchantCardId, LoyaltyMerchantcardsDTOResetPasscode body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
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
                public com.squareup.okhttp.Response intercept(Chain chain) throws IOException {
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
    private com.squareup.okhttp.Call resetPassCodeValidateBeforeCall(String loyaltyMerchantCardId, LoyaltyMerchantcardsDTOResetPasscode body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'loyaltyMerchantCardId' is set
        if (loyaltyMerchantCardId == null) {
            throw new ApiException("Missing the required parameter 'loyaltyMerchantCardId' when calling resetPassCode(Async)");
        }
        
        com.squareup.okhttp.Call call = resetPassCodeCall(loyaltyMerchantCardId, body, progressListener, progressRequestListener);
        return call;
    }

    /**
     * POST Loyalty/MerchantCards/{loyaltyMerchantCardId}/resetPasscode
     * Function to reset a passcode for given merchantcard
     * @param loyaltyMerchantCardId Loyalty merchant card id (required)
     * @param body Information about card
     * @return ResultBoolean
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ResultBoolean resetPassCode(String loyaltyMerchantCardId, LoyaltyMerchantcardsDTOResetPasscode body) throws ApiException {
        ApiResponse<ResultBoolean> resp = resetPassCodeWithHttpInfo(loyaltyMerchantCardId, body);
        return resp.getData();
    }

    /**
     * POST Loyalty/MerchantCards/{loyaltyMerchantCardId}/resetPasscode
     * Function to reset a passcode for given merchantcard
     * @param loyaltyMerchantCardId Loyalty merchant card id (required)
     * @param body Information about card
     * @return ApiResponse&lt;ResultBoolean&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ResultBoolean> resetPassCodeWithHttpInfo(String loyaltyMerchantCardId, LoyaltyMerchantcardsDTOResetPasscode body) throws ApiException {
        com.squareup.okhttp.Call call = resetPassCodeValidateBeforeCall(loyaltyMerchantCardId, body, null, null);
        Type localVarReturnType = new TypeToken<ResultBoolean>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * POST Loyalty/MerchantCards/{loyaltyMerchantCardId}/resetPasscode (asynchronously)
     * Function to reset a passcode for given merchantcard
     * @param loyaltyMerchantCardId Loyalty merchant card id (required)
     * @param body Information about card
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call resetPassCodeAsync(String loyaltyMerchantCardId, LoyaltyMerchantcardsDTOResetPasscode body, final ApiCallback<ResultBoolean> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = resetPassCodeValidateBeforeCall(loyaltyMerchantCardId, body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ResultBoolean>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for setCustomer
     * @param loyaltyMerchantCardId Loyalty merchant card id (required)
     * @param loyaltyCustomerId Loyalty customer id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call setCustomerCall(String loyaltyMerchantCardId, String loyaltyCustomerId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
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
                public com.squareup.okhttp.Response intercept(Chain chain) throws IOException {
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
    private com.squareup.okhttp.Call setCustomerValidateBeforeCall(String loyaltyMerchantCardId, String loyaltyCustomerId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'loyaltyMerchantCardId' is set
        if (loyaltyMerchantCardId == null) {
            throw new ApiException("Missing the required parameter 'loyaltyMerchantCardId' when calling setCustomer(Async)");
        }
        // verify the required parameter 'loyaltyCustomerId' is set
        if (loyaltyCustomerId == null) {
            throw new ApiException("Missing the required parameter 'loyaltyCustomerId' when calling setCustomer(Async)");
        }
        
        com.squareup.okhttp.Call call = setCustomerCall(loyaltyMerchantCardId, loyaltyCustomerId, progressListener, progressRequestListener);
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
    public LoyaltyMerchantcardsProductModel setCustomer(String loyaltyMerchantCardId, String loyaltyCustomerId) throws ApiException {
        ApiResponse<LoyaltyMerchantcardsProductModel> resp = setCustomerWithHttpInfo(loyaltyMerchantCardId, loyaltyCustomerId);
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
    public ApiResponse<LoyaltyMerchantcardsProductModel> setCustomerWithHttpInfo(String loyaltyMerchantCardId, String loyaltyCustomerId) throws ApiException {
        com.squareup.okhttp.Call call = setCustomerValidateBeforeCall(loyaltyMerchantCardId, loyaltyCustomerId, null, null);
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
    public com.squareup.okhttp.Call setCustomerAsync(String loyaltyMerchantCardId, String loyaltyCustomerId, final ApiCallback<LoyaltyMerchantcardsProductModel> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = setCustomerValidateBeforeCall(loyaltyMerchantCardId, loyaltyCustomerId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<LoyaltyMerchantcardsProductModel>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for unlock
     * @param loyaltyMerchantCardId Loyalty merchant card id (required)
     * @param body Information about unlock
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call unlockCall(String loyaltyMerchantCardId, LoyaltyMerchantcardsDTOLock body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
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
                public com.squareup.okhttp.Response intercept(Chain chain) throws IOException {
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
    private com.squareup.okhttp.Call unlockValidateBeforeCall(String loyaltyMerchantCardId, LoyaltyMerchantcardsDTOLock body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'loyaltyMerchantCardId' is set
        if (loyaltyMerchantCardId == null) {
            throw new ApiException("Missing the required parameter 'loyaltyMerchantCardId' when calling unlock(Async)");
        }
        
        com.squareup.okhttp.Call call = unlockCall(loyaltyMerchantCardId, body, progressListener, progressRequestListener);
        return call;
    }

    /**
     * POST Loyalty/MerchantCards/{loyaltyMerchantCardId}/unlock
     * Unlock merchant card
     * @param loyaltyMerchantCardId Loyalty merchant card id (required)
     * @param body Information about unlock
     * @return LoyaltyMerchantcardsProductModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public LoyaltyMerchantcardsProductModel unlock(String loyaltyMerchantCardId, LoyaltyMerchantcardsDTOLock body) throws ApiException {
        ApiResponse<LoyaltyMerchantcardsProductModel> resp = unlockWithHttpInfo(loyaltyMerchantCardId, body);
        return resp.getData();
    }

    /**
     * POST Loyalty/MerchantCards/{loyaltyMerchantCardId}/unlock
     * Unlock merchant card
     * @param loyaltyMerchantCardId Loyalty merchant card id (required)
     * @param body Information about unlock
     * @return ApiResponse&lt;LoyaltyMerchantcardsProductModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<LoyaltyMerchantcardsProductModel> unlockWithHttpInfo(String loyaltyMerchantCardId, LoyaltyMerchantcardsDTOLock body) throws ApiException {
        com.squareup.okhttp.Call call = unlockValidateBeforeCall(loyaltyMerchantCardId, body, null, null);
        Type localVarReturnType = new TypeToken<LoyaltyMerchantcardsProductModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * POST Loyalty/MerchantCards/{loyaltyMerchantCardId}/unlock (asynchronously)
     * Unlock merchant card
     * @param loyaltyMerchantCardId Loyalty merchant card id (required)
     * @param body Information about unlock
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call unlockAsync(String loyaltyMerchantCardId, LoyaltyMerchantcardsDTOLock body, final ApiCallback<LoyaltyMerchantcardsProductModel> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = unlockValidateBeforeCall(loyaltyMerchantCardId, body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<LoyaltyMerchantcardsProductModel>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for updateCardGroupOfMerchantCard
     * @param loyaltyMerchantCardId Loyalty merchant card id (required)
     * @param loyaltyCardGroupId Loyalty card group id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call updateCardGroupOfMerchantCardCall(String loyaltyMerchantCardId, String loyaltyCardGroupId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
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
                public com.squareup.okhttp.Response intercept(Chain chain) throws IOException {
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
    private com.squareup.okhttp.Call updateCardGroupOfMerchantCardValidateBeforeCall(String loyaltyMerchantCardId, String loyaltyCardGroupId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'loyaltyMerchantCardId' is set
        if (loyaltyMerchantCardId == null) {
            throw new ApiException("Missing the required parameter 'loyaltyMerchantCardId' when calling updateCardGroupOfMerchantCard(Async)");
        }
        // verify the required parameter 'loyaltyCardGroupId' is set
        if (loyaltyCardGroupId == null) {
            throw new ApiException("Missing the required parameter 'loyaltyCardGroupId' when calling updateCardGroupOfMerchantCard(Async)");
        }
        
        com.squareup.okhttp.Call call = updateCardGroupOfMerchantCardCall(loyaltyMerchantCardId, loyaltyCardGroupId, progressListener, progressRequestListener);
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
    public LoyaltyMerchantcardsProductModel updateCardGroupOfMerchantCard(String loyaltyMerchantCardId, String loyaltyCardGroupId) throws ApiException {
        ApiResponse<LoyaltyMerchantcardsProductModel> resp = updateCardGroupOfMerchantCardWithHttpInfo(loyaltyMerchantCardId, loyaltyCardGroupId);
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
    public ApiResponse<LoyaltyMerchantcardsProductModel> updateCardGroupOfMerchantCardWithHttpInfo(String loyaltyMerchantCardId, String loyaltyCardGroupId) throws ApiException {
        com.squareup.okhttp.Call call = updateCardGroupOfMerchantCardValidateBeforeCall(loyaltyMerchantCardId, loyaltyCardGroupId, null, null);
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
    public com.squareup.okhttp.Call updateCardGroupOfMerchantCardAsync(String loyaltyMerchantCardId, String loyaltyCardGroupId, final ApiCallback<LoyaltyMerchantcardsProductModel> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = updateCardGroupOfMerchantCardValidateBeforeCall(loyaltyMerchantCardId, loyaltyCardGroupId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<LoyaltyMerchantcardsProductModel>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for updateMerchantCard
     * @param loyaltyMerchantCardId Loyalty merchant card id (required)
     * @param body Loyalty merchant card properties
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call updateMerchantCardCall(String loyaltyMerchantCardId, LoyaltyMerchantcardsDTO body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
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
                public com.squareup.okhttp.Response intercept(Chain chain) throws IOException {
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
    private com.squareup.okhttp.Call updateMerchantCardValidateBeforeCall(String loyaltyMerchantCardId, LoyaltyMerchantcardsDTO body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'loyaltyMerchantCardId' is set
        if (loyaltyMerchantCardId == null) {
            throw new ApiException("Missing the required parameter 'loyaltyMerchantCardId' when calling updateMerchantCard(Async)");
        }
        
        com.squareup.okhttp.Call call = updateMerchantCardCall(loyaltyMerchantCardId, body, progressListener, progressRequestListener);
        return call;
    }

    /**
     * PUT Loyalty/MerchantCards/{loyaltyMerchantCardId}
     * Update loyalty merchant card
     * @param loyaltyMerchantCardId Loyalty merchant card id (required)
     * @param body Loyalty merchant card properties
     * @return LoyaltyMerchantcardsProductModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public LoyaltyMerchantcardsProductModel updateMerchantCard(String loyaltyMerchantCardId, LoyaltyMerchantcardsDTO body) throws ApiException {
        ApiResponse<LoyaltyMerchantcardsProductModel> resp = updateMerchantCardWithHttpInfo(loyaltyMerchantCardId, body);
        return resp.getData();
    }

    /**
     * PUT Loyalty/MerchantCards/{loyaltyMerchantCardId}
     * Update loyalty merchant card
     * @param loyaltyMerchantCardId Loyalty merchant card id (required)
     * @param body Loyalty merchant card properties
     * @return ApiResponse&lt;LoyaltyMerchantcardsProductModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<LoyaltyMerchantcardsProductModel> updateMerchantCardWithHttpInfo(String loyaltyMerchantCardId, LoyaltyMerchantcardsDTO body) throws ApiException {
        com.squareup.okhttp.Call call = updateMerchantCardValidateBeforeCall(loyaltyMerchantCardId, body, null, null);
        Type localVarReturnType = new TypeToken<LoyaltyMerchantcardsProductModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * PUT Loyalty/MerchantCards/{loyaltyMerchantCardId} (asynchronously)
     * Update loyalty merchant card
     * @param loyaltyMerchantCardId Loyalty merchant card id (required)
     * @param body Loyalty merchant card properties
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call updateMerchantCardAsync(String loyaltyMerchantCardId, LoyaltyMerchantcardsDTO body, final ApiCallback<LoyaltyMerchantcardsProductModel> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = updateMerchantCardValidateBeforeCall(loyaltyMerchantCardId, body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<LoyaltyMerchantcardsProductModel>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for validateMerchantCard
     * @param loyaltyMerchantCardId Loyalty merchant card id (required)
     * @param body Information about card
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call validateMerchantCardCall(String loyaltyMerchantCardId, LoyaltyMerchantcardsDTOValidateMerchantCard body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
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
                public com.squareup.okhttp.Response intercept(Chain chain) throws IOException {
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
    private com.squareup.okhttp.Call validateMerchantCardValidateBeforeCall(String loyaltyMerchantCardId, LoyaltyMerchantcardsDTOValidateMerchantCard body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'loyaltyMerchantCardId' is set
        if (loyaltyMerchantCardId == null) {
            throw new ApiException("Missing the required parameter 'loyaltyMerchantCardId' when calling validateMerchantCard(Async)");
        }
        
        com.squareup.okhttp.Call call = validateMerchantCardCall(loyaltyMerchantCardId, body, progressListener, progressRequestListener);
        return call;
    }

    /**
     * POST Loyalty/MerchantCards/{loyaltyMerchantCardId}/validateMerchantcard
     * Function to check the merchant card
     * @param loyaltyMerchantCardId Loyalty merchant card id (required)
     * @param body Information about card
     * @return LoyaltyMerchantcardsValidateMerchantCard
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public LoyaltyMerchantcardsValidateMerchantCard validateMerchantCard(String loyaltyMerchantCardId, LoyaltyMerchantcardsDTOValidateMerchantCard body) throws ApiException {
        ApiResponse<LoyaltyMerchantcardsValidateMerchantCard> resp = validateMerchantCardWithHttpInfo(loyaltyMerchantCardId, body);
        return resp.getData();
    }

    /**
     * POST Loyalty/MerchantCards/{loyaltyMerchantCardId}/validateMerchantcard
     * Function to check the merchant card
     * @param loyaltyMerchantCardId Loyalty merchant card id (required)
     * @param body Information about card
     * @return ApiResponse&lt;LoyaltyMerchantcardsValidateMerchantCard&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<LoyaltyMerchantcardsValidateMerchantCard> validateMerchantCardWithHttpInfo(String loyaltyMerchantCardId, LoyaltyMerchantcardsDTOValidateMerchantCard body) throws ApiException {
        com.squareup.okhttp.Call call = validateMerchantCardValidateBeforeCall(loyaltyMerchantCardId, body, null, null);
        Type localVarReturnType = new TypeToken<LoyaltyMerchantcardsValidateMerchantCard>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * POST Loyalty/MerchantCards/{loyaltyMerchantCardId}/validateMerchantcard (asynchronously)
     * Function to check the merchant card
     * @param loyaltyMerchantCardId Loyalty merchant card id (required)
     * @param body Information about card
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call validateMerchantCardAsync(String loyaltyMerchantCardId, LoyaltyMerchantcardsDTOValidateMerchantCard body, final ApiCallback<LoyaltyMerchantcardsValidateMerchantCard> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = validateMerchantCardValidateBeforeCall(loyaltyMerchantCardId, body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<LoyaltyMerchantcardsValidateMerchantCard>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}

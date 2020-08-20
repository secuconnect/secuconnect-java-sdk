package com.secuconnect.client.api;

import com.google.gson.reflect.TypeToken;
import com.secuconnect.client.*;
import com.secuconnect.client.model.LoyaltyCustomersDTO;
import com.secuconnect.client.model.LoyaltyMerchantcardsCardBalanceReceipt;
import com.secuconnect.client.model.LoyaltyMerchantcardsDTO;
import com.secuconnect.client.model.LoyaltyMerchantcardsDTOCardBalanceReceipt;
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
import okhttp3.Call;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LoyaltyMerchantcardsApi {
    private ApiClient apiClient;

    public LoyaltyMerchantcardsApi() {
        this(Environment.getGlobalEnv().getApiClient());
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
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public Call addMerchantCardCall(LoyaltyMerchantcardsDTO body) throws ApiException {
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

        String[] localVarAuthNames = new String[] { "oauth_token" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames);
    }

    @SuppressWarnings("rawtypes")
    private Call addMerchantCardValidateBeforeCall(LoyaltyMerchantcardsDTO body) throws ApiException {

        return addMerchantCardCall(body);
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
        Call call = addMerchantCardValidateBeforeCall(body);
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
    public Call addMerchantCardAsync(LoyaltyMerchantcardsDTO body, final ApiCallback<LoyaltyMerchantcardsProductModel> callback) throws ApiException {
        Call call = addMerchantCardValidateBeforeCall(body);
        Type localVarReturnType = new TypeToken<LoyaltyMerchantcardsProductModel>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for cardBalanceReceipt
     * @param loyaltyMerchantCardId Loyalty merchant card id (required)
     * @param body Information about card &amp; current terminal
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public Call cardBalanceReceiptCall(String loyaltyMerchantCardId, LoyaltyMerchantcardsDTOCardBalanceReceipt body) throws ApiException {
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

        String[] localVarAuthNames = new String[] { "oauth_token" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames);
    }

    @SuppressWarnings("rawtypes")
    private Call cardBalanceReceiptValidateBeforeCall(String loyaltyMerchantCardId, LoyaltyMerchantcardsDTOCardBalanceReceipt body) throws ApiException {
        // verify the required parameter 'loyaltyMerchantCardId' is set
        if (loyaltyMerchantCardId == null) {
            throw new ApiException("Missing the required parameter 'loyaltyMerchantCardId' when calling cardBalanceReceipt(Async)");
        }

        return cardBalanceReceiptCall(loyaltyMerchantCardId, body);
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
        Call call = cardBalanceReceiptValidateBeforeCall(loyaltyMerchantCardId, body);
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
    public Call cardBalanceReceiptAsync(String loyaltyMerchantCardId, LoyaltyMerchantcardsDTOCardBalanceReceipt body, final ApiCallback<LoyaltyMerchantcardsCardBalanceReceipt> callback) throws ApiException {
        Call call = cardBalanceReceiptValidateBeforeCall(loyaltyMerchantCardId, body);
        Type localVarReturnType = new TypeToken<LoyaltyMerchantcardsCardBalanceReceipt>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for checkCsc
     * @param loyaltyMerchantCardId Loyalty merchant card id (required)
     * @param body Information about card
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public Call checkCscCall(String loyaltyMerchantCardId, LoyaltyMerchantcardsDTOCsc body) throws ApiException {
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

        String[] localVarAuthNames = new String[] { "oauth_token" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames);
    }

    @SuppressWarnings("rawtypes")
    private Call checkCscValidateBeforeCall(String loyaltyMerchantCardId, LoyaltyMerchantcardsDTOCsc body) throws ApiException {
        // verify the required parameter 'loyaltyMerchantCardId' is set
        if (loyaltyMerchantCardId == null) {
            throw new ApiException("Missing the required parameter 'loyaltyMerchantCardId' when calling checkCsc(Async)");
        }

        return checkCscCall(loyaltyMerchantCardId, body);
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
        Call call = checkCscValidateBeforeCall(loyaltyMerchantCardId, body);
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
    public Call checkCscAsync(String loyaltyMerchantCardId, LoyaltyMerchantcardsDTOCsc body, final ApiCallback<ResultBoolean> callback) throws ApiException {
        Call call = checkCscValidateBeforeCall(loyaltyMerchantCardId, body);
        Type localVarReturnType = new TypeToken<ResultBoolean>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for checkPassCode
     * @param loyaltyMerchantCardId Loyalty merchant card id (required)
     * @param body Information about card
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public Call checkPassCodeCall(String loyaltyMerchantCardId, LoyaltyMerchantcardsDTOCheckPasscode body) throws ApiException {
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

        String[] localVarAuthNames = new String[] { "oauth_token" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames);
    }

    @SuppressWarnings("rawtypes")
    private Call checkPassCodeValidateBeforeCall(String loyaltyMerchantCardId, LoyaltyMerchantcardsDTOCheckPasscode body) throws ApiException {
        // verify the required parameter 'loyaltyMerchantCardId' is set
        if (loyaltyMerchantCardId == null) {
            throw new ApiException("Missing the required parameter 'loyaltyMerchantCardId' when calling checkPassCode(Async)");
        }

        return checkPassCodeCall(loyaltyMerchantCardId, body);
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
        Call call = checkPassCodeValidateBeforeCall(loyaltyMerchantCardId, body);
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
    public Call checkPassCodeAsync(String loyaltyMerchantCardId, LoyaltyMerchantcardsDTOCheckPasscode body, final ApiCallback<ResultBoolean> callback) throws ApiException {
        Call call = checkPassCodeValidateBeforeCall(loyaltyMerchantCardId, body);
        Type localVarReturnType = new TypeToken<ResultBoolean>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for createMerchantcards
     * @param generalMerchantId General merchant id (required)
     * @param loyaltyCardgroupId Loyalty card group id (required)
     * @param body Cards amount
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public Call createMerchantcardsCall(String generalMerchantId, String loyaltyCardgroupId, LoyaltyMerchantcardsDTOCardsAmount body) throws ApiException {
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

        String[] localVarAuthNames = new String[] { "oauth_token" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames);
    }

    @SuppressWarnings("rawtypes")
    private Call createMerchantcardsValidateBeforeCall(String generalMerchantId, String loyaltyCardgroupId, LoyaltyMerchantcardsDTOCardsAmount body) throws ApiException {
        // verify the required parameter 'generalMerchantId' is set
        if (generalMerchantId == null) {
            throw new ApiException("Missing the required parameter 'generalMerchantId' when calling createMerchantcards(Async)");
        }
        // verify the required parameter 'loyaltyCardgroupId' is set
        if (loyaltyCardgroupId == null) {
            throw new ApiException("Missing the required parameter 'loyaltyCardgroupId' when calling createMerchantcards(Async)");
        }

        return createMerchantcardsCall(generalMerchantId, loyaltyCardgroupId, body);
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
        Call call = createMerchantcardsValidateBeforeCall(generalMerchantId, loyaltyCardgroupId, body);
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
    public Call createMerchantcardsAsync(String generalMerchantId, String loyaltyCardgroupId, LoyaltyMerchantcardsDTOCardsAmount body, final ApiCallback<List<LoyaltyMerchantcardsProductModel>> callback) throws ApiException {
        Call call = createMerchantcardsValidateBeforeCall(generalMerchantId, loyaltyCardgroupId, body);
        Type localVarReturnType = new TypeToken<List<LoyaltyMerchantcardsProductModel>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for executeTransaction
     * @param loyaltyMerchantCardId Loyalty merchant card id (required)
     * @param body Transaction properties
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public Call executeTransactionCall(String loyaltyMerchantCardId, LoyaltyMerchantcardsDTOTransaction body) throws ApiException {
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

        String[] localVarAuthNames = new String[] { "oauth_token" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames);
    }

    @SuppressWarnings("rawtypes")
    private Call executeTransactionValidateBeforeCall(String loyaltyMerchantCardId, LoyaltyMerchantcardsDTOTransaction body) throws ApiException {
        // verify the required parameter 'loyaltyMerchantCardId' is set
        if (loyaltyMerchantCardId == null) {
            throw new ApiException("Missing the required parameter 'loyaltyMerchantCardId' when calling executeTransaction(Async)");
        }

        return executeTransactionCall(loyaltyMerchantCardId, body);
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
        Call call = executeTransactionValidateBeforeCall(loyaltyMerchantCardId, body);
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
    public Call executeTransactionAsync(String loyaltyMerchantCardId, LoyaltyMerchantcardsDTOTransaction body, final ApiCallback<LoyaltyMerchantcardsProductWithReceiptModel> callback) throws ApiException {
        Call call = executeTransactionValidateBeforeCall(loyaltyMerchantCardId, body);
        Type localVarReturnType = new TypeToken<LoyaltyMerchantcardsProductWithReceiptModel>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for getAll
     * @param count The number of items to return.
     * @param offset The position within the whole result set to start returning items (First element is at 0).
     * @param fields List of fields to include in the result. Nested properties can be accessed with this notation: prop1.prop2  Example: prop3,prop1.prop2
     * @param q A query string to restrict the returned items to given conditions. The query string must consist of any combination of single expressions in the form property:condition.  *                   A condition may contain:  *                       - wildcard \&quot;*\&quot; for any number of characters  *                       - wildcard \&quot;?\&quot; for one character  *                       - ranges in the form [value TO value]  *  *                   Single expressions may combined by &#x27;AND&#x27;, &#x27;OR&#x27;, &#x27;NOT&#x27; operators and parenthesis &#x27;(&#x27;, &#x27;)&#x27; for grouping.  *                   Property names can be nested like \&quot;prop1.prop2\&quot;.  *                   Example: (NOT customer.name:meier*) AND (customer.age:[30 TO 40] OR customer.age:[50 TO 60])  *                   
     * @param sort String with comma separated pairs of field:order (e.g. contact.surname:asc,contact.comapnyname:desc). Result set will be sorted by included fields, in ascending &#x27;asc&#x27;, or descending &#x27;dsc&#x27; order.
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public Call getAllCall(Integer count, Integer offset, String fields, String q, String sort) throws ApiException {
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

        String[] localVarAuthNames = new String[] { "oauth_token" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames);
    }

    @SuppressWarnings("rawtypes")
    private Call getAllValidateBeforeCall(Integer count, Integer offset, String fields, String q, String sort) throws ApiException {

        return getAllCall(count, offset, fields, q, sort);
    }

    /**
     * GET Loyalty/MerchantCards
     * Get a list of loyalty merchant cards
     * @param count The number of items to return.
     * @param offset The position within the whole result set to start returning items (First element is at 0).
     * @param fields List of fields to include in the result. Nested properties can be accessed with this notation: prop1.prop2  Example: prop3,prop1.prop2
     * @param q A query string to restrict the returned items to given conditions. The query string must consist of any combination of single expressions in the form property:condition.  *                   A condition may contain:  *                       - wildcard \&quot;*\&quot; for any number of characters  *                       - wildcard \&quot;?\&quot; for one character  *                       - ranges in the form [value TO value]  *  *                   Single expressions may combined by &#x27;AND&#x27;, &#x27;OR&#x27;, &#x27;NOT&#x27; operators and parenthesis &#x27;(&#x27;, &#x27;)&#x27; for grouping.  *                   Property names can be nested like \&quot;prop1.prop2\&quot;.  *                   Example: (NOT customer.name:meier*) AND (customer.age:[30 TO 40] OR customer.age:[50 TO 60])  *                   
     * @param sort String with comma separated pairs of field:order (e.g. contact.surname:asc,contact.comapnyname:desc). Result set will be sorted by included fields, in ascending &#x27;asc&#x27;, or descending &#x27;dsc&#x27; order.
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
     * @param count The number of items to return.
     * @param offset The position within the whole result set to start returning items (First element is at 0).
     * @param fields List of fields to include in the result. Nested properties can be accessed with this notation: prop1.prop2  Example: prop3,prop1.prop2
     * @param q A query string to restrict the returned items to given conditions. The query string must consist of any combination of single expressions in the form property:condition.  *                   A condition may contain:  *                       - wildcard \&quot;*\&quot; for any number of characters  *                       - wildcard \&quot;?\&quot; for one character  *                       - ranges in the form [value TO value]  *  *                   Single expressions may combined by &#x27;AND&#x27;, &#x27;OR&#x27;, &#x27;NOT&#x27; operators and parenthesis &#x27;(&#x27;, &#x27;)&#x27; for grouping.  *                   Property names can be nested like \&quot;prop1.prop2\&quot;.  *                   Example: (NOT customer.name:meier*) AND (customer.age:[30 TO 40] OR customer.age:[50 TO 60])  *                   
     * @param sort String with comma separated pairs of field:order (e.g. contact.surname:asc,contact.comapnyname:desc). Result set will be sorted by included fields, in ascending &#x27;asc&#x27;, or descending &#x27;dsc&#x27; order.
     * @return ApiResponse&lt;LoyaltyMerchantcardsList&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<LoyaltyMerchantcardsList> getAllWithHttpInfo(Integer count, Integer offset, String fields, String q, String sort) throws ApiException {
        Call call = getAllValidateBeforeCall(count, offset, fields, q, sort);
        Type localVarReturnType = new TypeToken<LoyaltyMerchantcardsList>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * GET Loyalty/MerchantCards (asynchronously)
     * Get a list of loyalty merchant cards
     * @param count The number of items to return.
     * @param offset The position within the whole result set to start returning items (First element is at 0).
     * @param fields List of fields to include in the result. Nested properties can be accessed with this notation: prop1.prop2  Example: prop3,prop1.prop2
     * @param q A query string to restrict the returned items to given conditions. The query string must consist of any combination of single expressions in the form property:condition.  *                   A condition may contain:  *                       - wildcard \&quot;*\&quot; for any number of characters  *                       - wildcard \&quot;?\&quot; for one character  *                       - ranges in the form [value TO value]  *  *                   Single expressions may combined by &#x27;AND&#x27;, &#x27;OR&#x27;, &#x27;NOT&#x27; operators and parenthesis &#x27;(&#x27;, &#x27;)&#x27; for grouping.  *                   Property names can be nested like \&quot;prop1.prop2\&quot;.  *                   Example: (NOT customer.name:meier*) AND (customer.age:[30 TO 40] OR customer.age:[50 TO 60])  *                   
     * @param sort String with comma separated pairs of field:order (e.g. contact.surname:asc,contact.comapnyname:desc). Result set will be sorted by included fields, in ascending &#x27;asc&#x27;, or descending &#x27;dsc&#x27; order.
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call getAllAsync(Integer count, Integer offset, String fields, String q, String sort, final ApiCallback<LoyaltyMerchantcardsList> callback) throws ApiException {
        Call call = getAllValidateBeforeCall(count, offset, fields, q, sort);
        Type localVarReturnType = new TypeToken<LoyaltyMerchantcardsList>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for getLock
     * @param loyaltyMerchantCardId Loyalty merchant card id (required)
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public Call getLockCall(String loyaltyMerchantCardId) throws ApiException {
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

        String[] localVarAuthNames = new String[] { "oauth_token" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames);
    }

    @SuppressWarnings("rawtypes")
    private Call getLockValidateBeforeCall(String loyaltyMerchantCardId) throws ApiException {
        // verify the required parameter 'loyaltyMerchantCardId' is set
        if (loyaltyMerchantCardId == null) {
            throw new ApiException("Missing the required parameter 'loyaltyMerchantCardId' when calling getLock(Async)");
        }

        return getLockCall(loyaltyMerchantCardId);
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
        Call call = getLockValidateBeforeCall(loyaltyMerchantCardId);
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
    public Call getLockAsync(String loyaltyMerchantCardId, final ApiCallback<LoyaltyMerchantcardsDTOLock> callback) throws ApiException {
        Call call = getLockValidateBeforeCall(loyaltyMerchantCardId);
        Type localVarReturnType = new TypeToken<LoyaltyMerchantcardsDTOLock>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for getOne
     * @param loyaltyMerchantCardId Search one by provided id (required)
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public Call getOneCall(String loyaltyMerchantCardId) throws ApiException {
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

        String[] localVarAuthNames = new String[] { "oauth_token" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames);
    }

    @SuppressWarnings("rawtypes")
    private Call getOneValidateBeforeCall(String loyaltyMerchantCardId) throws ApiException {
        // verify the required parameter 'loyaltyMerchantCardId' is set
        if (loyaltyMerchantCardId == null) {
            throw new ApiException("Missing the required parameter 'loyaltyMerchantCardId' when calling getOne(Async)");
        }

        return getOneCall(loyaltyMerchantCardId);
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
        Call call = getOneValidateBeforeCall(loyaltyMerchantCardId);
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
    public Call getOneAsync(String loyaltyMerchantCardId, final ApiCallback<LoyaltyMerchantcardsProductModel> callback) throws ApiException {
        Call call = getOneValidateBeforeCall(loyaltyMerchantCardId);
        Type localVarReturnType = new TypeToken<LoyaltyMerchantcardsProductModel>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for getVirtualTerminalData
     * @param loyaltyMerchantCardId Merchant card id (required)
     * @param loyaltyMerchantId Merchant id (required)
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public Call getVirtualTerminalDataCall(String loyaltyMerchantCardId, String loyaltyMerchantId) throws ApiException {
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

        String[] localVarAuthNames = new String[] { "oauth_token" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames);
    }

    @SuppressWarnings("rawtypes")
    private Call getVirtualTerminalDataValidateBeforeCall(String loyaltyMerchantCardId, String loyaltyMerchantId) throws ApiException {
        // verify the required parameter 'loyaltyMerchantCardId' is set
        if (loyaltyMerchantCardId == null) {
            throw new ApiException("Missing the required parameter 'loyaltyMerchantCardId' when calling getVirtualTerminalData(Async)");
        }
        // verify the required parameter 'loyaltyMerchantId' is set
        if (loyaltyMerchantId == null) {
            throw new ApiException("Missing the required parameter 'loyaltyMerchantId' when calling getVirtualTerminalData(Async)");
        }

        return getVirtualTerminalDataCall(loyaltyMerchantCardId, loyaltyMerchantId);
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
        Call call = getVirtualTerminalDataValidateBeforeCall(loyaltyMerchantCardId, loyaltyMerchantId);
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
    public Call getVirtualTerminalDataAsync(String loyaltyMerchantCardId, String loyaltyMerchantId, final ApiCallback<VirtualTerminalDataModel> callback) throws ApiException {
        Call call = getVirtualTerminalDataValidateBeforeCall(loyaltyMerchantCardId, loyaltyMerchantId);
        Type localVarReturnType = new TypeToken<VirtualTerminalDataModel>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for lock
     * @param loyaltyMerchantCardId Loyalty merchant card id (required)
     * @param body Information about lock
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public Call lockCall(String loyaltyMerchantCardId, LoyaltyMerchantcardsDTOLock body) throws ApiException {
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

        String[] localVarAuthNames = new String[] { "oauth_token" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames);
    }

    @SuppressWarnings("rawtypes")
    private Call lockValidateBeforeCall(String loyaltyMerchantCardId, LoyaltyMerchantcardsDTOLock body) throws ApiException {
        // verify the required parameter 'loyaltyMerchantCardId' is set
        if (loyaltyMerchantCardId == null) {
            throw new ApiException("Missing the required parameter 'loyaltyMerchantCardId' when calling lock(Async)");
        }

        return lockCall(loyaltyMerchantCardId, body);
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
        Call call = lockValidateBeforeCall(loyaltyMerchantCardId, body);
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
    public Call lockAsync(String loyaltyMerchantCardId, LoyaltyMerchantcardsDTOLock body, final ApiCallback<LoyaltyMerchantcardsProductModel> callback) throws ApiException {
        Call call = lockValidateBeforeCall(loyaltyMerchantCardId, body);
        Type localVarReturnType = new TypeToken<LoyaltyMerchantcardsProductModel>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for newPassCode
     * @param loyaltyMerchantCardId Loyalty merchant card id (required)
     * @param body Information about card
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public Call newPassCodeCall(String loyaltyMerchantCardId, LoyaltyMerchantcardsDTONewPasscode body) throws ApiException {
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

        String[] localVarAuthNames = new String[] { "oauth_token" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames);
    }

    @SuppressWarnings("rawtypes")
    private Call newPassCodeValidateBeforeCall(String loyaltyMerchantCardId, LoyaltyMerchantcardsDTONewPasscode body) throws ApiException {
        // verify the required parameter 'loyaltyMerchantCardId' is set
        if (loyaltyMerchantCardId == null) {
            throw new ApiException("Missing the required parameter 'loyaltyMerchantCardId' when calling newPassCode(Async)");
        }

        return newPassCodeCall(loyaltyMerchantCardId, body);
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
        Call call = newPassCodeValidateBeforeCall(loyaltyMerchantCardId, body);
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
    public Call newPassCodeAsync(String loyaltyMerchantCardId, LoyaltyMerchantcardsDTONewPasscode body, final ApiCallback<ResultBoolean> callback) throws ApiException {
        Call call = newPassCodeValidateBeforeCall(loyaltyMerchantCardId, body);
        Type localVarReturnType = new TypeToken<ResultBoolean>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for registerCustomer
     * @param loyaltyMerchantCardId Loyalty merchant card id (required)
     * @param body Loyalty customer properties
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public Call registerCustomerCall(String loyaltyMerchantCardId, LoyaltyCustomersDTO body) throws ApiException {
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

        String[] localVarAuthNames = new String[] { "oauth_token" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames);
    }

    @SuppressWarnings("rawtypes")
    private Call registerCustomerValidateBeforeCall(String loyaltyMerchantCardId, LoyaltyCustomersDTO body) throws ApiException {
        // verify the required parameter 'loyaltyMerchantCardId' is set
        if (loyaltyMerchantCardId == null) {
            throw new ApiException("Missing the required parameter 'loyaltyMerchantCardId' when calling registerCustomer(Async)");
        }

        return registerCustomerCall(loyaltyMerchantCardId, body);
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
        Call call = registerCustomerValidateBeforeCall(loyaltyMerchantCardId, body);
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
    public Call registerCustomerAsync(String loyaltyMerchantCardId, LoyaltyCustomersDTO body, final ApiCallback<LoyaltyMerchantcardsProductModel> callback) throws ApiException {
        Call call = registerCustomerValidateBeforeCall(loyaltyMerchantCardId, body);
        Type localVarReturnType = new TypeToken<LoyaltyMerchantcardsProductModel>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for removeMerchantCard
     * @param loyaltyMerchantCardId Loyalty merchant card id (required)
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public Call removeMerchantCardCall(String loyaltyMerchantCardId) throws ApiException {
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

        String[] localVarAuthNames = new String[] { "oauth_token" };
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames);
    }

    @SuppressWarnings("rawtypes")
    private Call removeMerchantCardValidateBeforeCall(String loyaltyMerchantCardId) throws ApiException {
        // verify the required parameter 'loyaltyMerchantCardId' is set
        if (loyaltyMerchantCardId == null) {
            throw new ApiException("Missing the required parameter 'loyaltyMerchantCardId' when calling removeMerchantCard(Async)");
        }

        return removeMerchantCardCall(loyaltyMerchantCardId);
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
        Call call = removeMerchantCardValidateBeforeCall(loyaltyMerchantCardId);
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
    public Call removeMerchantCardAsync(String loyaltyMerchantCardId, final ApiCallback<LoyaltyMerchantcardsProductModel> callback) throws ApiException {
        Call call = removeMerchantCardValidateBeforeCall(loyaltyMerchantCardId);
        Type localVarReturnType = new TypeToken<LoyaltyMerchantcardsProductModel>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for resetPassCode
     * @param loyaltyMerchantCardId Loyalty merchant card id (required)
     * @param body Information about card
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public Call resetPassCodeCall(String loyaltyMerchantCardId, LoyaltyMerchantcardsDTOResetPasscode body) throws ApiException {
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

        String[] localVarAuthNames = new String[] { "oauth_token" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames);
    }

    @SuppressWarnings("rawtypes")
    private Call resetPassCodeValidateBeforeCall(String loyaltyMerchantCardId, LoyaltyMerchantcardsDTOResetPasscode body) throws ApiException {
        // verify the required parameter 'loyaltyMerchantCardId' is set
        if (loyaltyMerchantCardId == null) {
            throw new ApiException("Missing the required parameter 'loyaltyMerchantCardId' when calling resetPassCode(Async)");
        }

        return resetPassCodeCall(loyaltyMerchantCardId, body);
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
        Call call = resetPassCodeValidateBeforeCall(loyaltyMerchantCardId, body);
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
    public Call resetPassCodeAsync(String loyaltyMerchantCardId, LoyaltyMerchantcardsDTOResetPasscode body, final ApiCallback<ResultBoolean> callback) throws ApiException {
        Call call = resetPassCodeValidateBeforeCall(loyaltyMerchantCardId, body);
        Type localVarReturnType = new TypeToken<ResultBoolean>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for setCustomer
     * @param loyaltyMerchantCardId Loyalty merchant card id (required)
     * @param loyaltyCustomerId Loyalty customer id (required)
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public Call setCustomerCall(String loyaltyMerchantCardId, String loyaltyCustomerId) throws ApiException {
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

        String[] localVarAuthNames = new String[] { "oauth_token" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames);
    }

    @SuppressWarnings("rawtypes")
    private Call setCustomerValidateBeforeCall(String loyaltyMerchantCardId, String loyaltyCustomerId) throws ApiException {
        // verify the required parameter 'loyaltyMerchantCardId' is set
        if (loyaltyMerchantCardId == null) {
            throw new ApiException("Missing the required parameter 'loyaltyMerchantCardId' when calling setCustomer(Async)");
        }
        // verify the required parameter 'loyaltyCustomerId' is set
        if (loyaltyCustomerId == null) {
            throw new ApiException("Missing the required parameter 'loyaltyCustomerId' when calling setCustomer(Async)");
        }

        return setCustomerCall(loyaltyMerchantCardId, loyaltyCustomerId);
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
        Call call = setCustomerValidateBeforeCall(loyaltyMerchantCardId, loyaltyCustomerId);
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
    public Call setCustomerAsync(String loyaltyMerchantCardId, String loyaltyCustomerId, final ApiCallback<LoyaltyMerchantcardsProductModel> callback) throws ApiException {
        Call call = setCustomerValidateBeforeCall(loyaltyMerchantCardId, loyaltyCustomerId);
        Type localVarReturnType = new TypeToken<LoyaltyMerchantcardsProductModel>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for unlock
     * @param loyaltyMerchantCardId Loyalty merchant card id (required)
     * @param body Information about unlock
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public Call unlockCall(String loyaltyMerchantCardId, LoyaltyMerchantcardsDTOLock body) throws ApiException {
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

        String[] localVarAuthNames = new String[] { "oauth_token" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames);
    }

    @SuppressWarnings("rawtypes")
    private Call unlockValidateBeforeCall(String loyaltyMerchantCardId, LoyaltyMerchantcardsDTOLock body) throws ApiException {
        // verify the required parameter 'loyaltyMerchantCardId' is set
        if (loyaltyMerchantCardId == null) {
            throw new ApiException("Missing the required parameter 'loyaltyMerchantCardId' when calling unlock(Async)");
        }

        return unlockCall(loyaltyMerchantCardId, body);
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
        Call call = unlockValidateBeforeCall(loyaltyMerchantCardId, body);
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
    public Call unlockAsync(String loyaltyMerchantCardId, LoyaltyMerchantcardsDTOLock body, final ApiCallback<LoyaltyMerchantcardsProductModel> callback) throws ApiException {
        Call call = unlockValidateBeforeCall(loyaltyMerchantCardId, body);
        Type localVarReturnType = new TypeToken<LoyaltyMerchantcardsProductModel>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for updateCardGroupOfMerchantCard
     * @param loyaltyMerchantCardId Loyalty merchant card id (required)
     * @param loyaltyCardGroupId Loyalty card group id (required)
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public Call updateCardGroupOfMerchantCardCall(String loyaltyMerchantCardId, String loyaltyCardGroupId) throws ApiException {
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

        String[] localVarAuthNames = new String[] { "oauth_token" };
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames);
    }

    @SuppressWarnings("rawtypes")
    private Call updateCardGroupOfMerchantCardValidateBeforeCall(String loyaltyMerchantCardId, String loyaltyCardGroupId) throws ApiException {
        // verify the required parameter 'loyaltyMerchantCardId' is set
        if (loyaltyMerchantCardId == null) {
            throw new ApiException("Missing the required parameter 'loyaltyMerchantCardId' when calling updateCardGroupOfMerchantCard(Async)");
        }
        // verify the required parameter 'loyaltyCardGroupId' is set
        if (loyaltyCardGroupId == null) {
            throw new ApiException("Missing the required parameter 'loyaltyCardGroupId' when calling updateCardGroupOfMerchantCard(Async)");
        }

        return updateCardGroupOfMerchantCardCall(loyaltyMerchantCardId, loyaltyCardGroupId);
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
        Call call = updateCardGroupOfMerchantCardValidateBeforeCall(loyaltyMerchantCardId, loyaltyCardGroupId);
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
    public Call updateCardGroupOfMerchantCardAsync(String loyaltyMerchantCardId, String loyaltyCardGroupId, final ApiCallback<LoyaltyMerchantcardsProductModel> callback) throws ApiException {
        Call call = updateCardGroupOfMerchantCardValidateBeforeCall(loyaltyMerchantCardId, loyaltyCardGroupId);
        Type localVarReturnType = new TypeToken<LoyaltyMerchantcardsProductModel>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for updateMerchantCard
     * @param loyaltyMerchantCardId Loyalty merchant card id (required)
     * @param body Loyalty merchant card properties
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public Call updateMerchantCardCall(String loyaltyMerchantCardId, LoyaltyMerchantcardsDTO body) throws ApiException {
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

        String[] localVarAuthNames = new String[] { "oauth_token" };
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames);
    }

    @SuppressWarnings("rawtypes")
    private Call updateMerchantCardValidateBeforeCall(String loyaltyMerchantCardId, LoyaltyMerchantcardsDTO body) throws ApiException {
        // verify the required parameter 'loyaltyMerchantCardId' is set
        if (loyaltyMerchantCardId == null) {
            throw new ApiException("Missing the required parameter 'loyaltyMerchantCardId' when calling updateMerchantCard(Async)");
        }

        return updateMerchantCardCall(loyaltyMerchantCardId, body);
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
        Call call = updateMerchantCardValidateBeforeCall(loyaltyMerchantCardId, body);
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
    public Call updateMerchantCardAsync(String loyaltyMerchantCardId, LoyaltyMerchantcardsDTO body, final ApiCallback<LoyaltyMerchantcardsProductModel> callback) throws ApiException {
        Call call = updateMerchantCardValidateBeforeCall(loyaltyMerchantCardId, body);
        Type localVarReturnType = new TypeToken<LoyaltyMerchantcardsProductModel>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for validateMerchantCard
     * @param loyaltyMerchantCardId Loyalty merchant card id (required)
     * @param body Information about card
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public Call validateMerchantCardCall(String loyaltyMerchantCardId, LoyaltyMerchantcardsDTOValidateMerchantCard body) throws ApiException {
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

        String[] localVarAuthNames = new String[] { "oauth_token" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames);
    }

    @SuppressWarnings("rawtypes")
    private Call validateMerchantCardValidateBeforeCall(String loyaltyMerchantCardId, LoyaltyMerchantcardsDTOValidateMerchantCard body) throws ApiException {
        // verify the required parameter 'loyaltyMerchantCardId' is set
        if (loyaltyMerchantCardId == null) {
            throw new ApiException("Missing the required parameter 'loyaltyMerchantCardId' when calling validateMerchantCard(Async)");
        }

        return validateMerchantCardCall(loyaltyMerchantCardId, body);
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
        Call call = validateMerchantCardValidateBeforeCall(loyaltyMerchantCardId, body);
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
    public Call validateMerchantCardAsync(String loyaltyMerchantCardId, LoyaltyMerchantcardsDTOValidateMerchantCard body, final ApiCallback<LoyaltyMerchantcardsValidateMerchantCard> callback) throws ApiException {
        Call call = validateMerchantCardValidateBeforeCall(loyaltyMerchantCardId, body);
        Type localVarReturnType = new TypeToken<LoyaltyMerchantcardsValidateMerchantCard>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}

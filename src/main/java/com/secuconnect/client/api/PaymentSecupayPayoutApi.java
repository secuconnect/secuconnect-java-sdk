package com.secuconnect.client.api;

import com.google.gson.reflect.TypeToken;
import com.secuconnect.client.*;
import com.secuconnect.client.model.ProductExceptionPayload;
import com.secuconnect.client.model.SecupayPayoutDTO;
import com.secuconnect.client.model.SecupayPayoutProductModel;
import okhttp3.Call;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PaymentSecupayPayoutApi {
    private ApiClient apiClient;

    public PaymentSecupayPayoutApi() {
        this(Environment.getGlobalEnv().getApiClient());
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
     * Build call for getSecupaypayout
     * @param paymentPayoutId Payment payout id (required)
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public Call getSecupaypayoutCall(String paymentPayoutId) throws ApiException {
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

        String[] localVarAuthNames = new String[] { "oauth_token" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames);
    }

    @SuppressWarnings("rawtypes")
    private Call getSecupaypayoutValidateBeforeCall(String paymentPayoutId) throws ApiException {
        // verify the required parameter 'paymentPayoutId' is set
        if (paymentPayoutId == null) {
            throw new ApiException("Missing the required parameter 'paymentPayoutId' when calling getSecupaypayout(Async)");
        }

        return getSecupaypayoutCall(paymentPayoutId);
    }

    /**
     * GET Payment/Secupaypayout/{paymentPayoutId}
     * Get the details of a payment transaction
     * @param paymentPayoutId Payment payout id (required)
     * @return SecupayPayoutProductModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SecupayPayoutProductModel getSecupaypayout(String paymentPayoutId) throws ApiException {
        ApiResponse<SecupayPayoutProductModel> resp = getSecupaypayoutWithHttpInfo(paymentPayoutId);
        return resp.getData();
    }

    /**
     * GET Payment/Secupaypayout/{paymentPayoutId}
     * Get the details of a payment transaction
     * @param paymentPayoutId Payment payout id (required)
     * @return ApiResponse&lt;SecupayPayoutProductModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SecupayPayoutProductModel> getSecupaypayoutWithHttpInfo(String paymentPayoutId) throws ApiException {
        Call call = getSecupaypayoutValidateBeforeCall(paymentPayoutId);
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
    public Call getSecupaypayoutAsync(String paymentPayoutId, final ApiCallback<SecupayPayoutProductModel> callback) throws ApiException {
        Call call = getSecupaypayoutValidateBeforeCall(paymentPayoutId);
        Type localVarReturnType = new TypeToken<SecupayPayoutProductModel>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for paymentSecupaypayoutPost
     * @param body Payout payment transaction input properties
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public Call paymentSecupaypayoutPostCall(SecupayPayoutDTO body) throws ApiException {
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

        String[] localVarAuthNames = new String[] { "oauth_token" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames);
    }

    @SuppressWarnings("rawtypes")
    private Call paymentSecupaypayoutPostValidateBeforeCall(SecupayPayoutDTO body) throws ApiException {

        return paymentSecupaypayoutPostCall(body);
    }

    /**
     * POST Payment/Secupaypayout
     * Start a payout transaction
     * @param body Payout payment transaction input properties
     * @return SecupayPayoutProductModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SecupayPayoutProductModel paymentSecupaypayoutPost(SecupayPayoutDTO body) throws ApiException {
        ApiResponse<SecupayPayoutProductModel> resp = paymentSecupaypayoutPostWithHttpInfo(body);
        return resp.getData();
    }

    /**
     * POST Payment/Secupaypayout
     * Start a payout transaction
     * @param body Payout payment transaction input properties
     * @return ApiResponse&lt;SecupayPayoutProductModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SecupayPayoutProductModel> paymentSecupaypayoutPostWithHttpInfo(SecupayPayoutDTO body) throws ApiException {
        Call call = paymentSecupaypayoutPostValidateBeforeCall(body);
        Type localVarReturnType = new TypeToken<SecupayPayoutProductModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * POST Payment/Secupaypayout (asynchronously)
     * Start a payout transaction
     * @param body Payout payment transaction input properties
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call paymentSecupaypayoutPostAsync(SecupayPayoutDTO body, final ApiCallback<SecupayPayoutProductModel> callback) throws ApiException {
        Call call = paymentSecupaypayoutPostValidateBeforeCall(body);
        Type localVarReturnType = new TypeToken<SecupayPayoutProductModel>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}

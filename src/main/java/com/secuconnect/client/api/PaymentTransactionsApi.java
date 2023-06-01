package com.secuconnect.client.api;

import com.google.gson.reflect.TypeToken;
import com.secuconnect.client.*;
import com.secuconnect.client.model.Aggregate;
import java.math.BigDecimal;
import com.secuconnect.client.model.PaymentCrowdFundingData;
import com.secuconnect.client.model.PaymentTransactionCancelDTO;
import com.secuconnect.client.model.PaymentTransactionsCheckStatus;
import com.secuconnect.client.model.PaymentTransactionsIncreaseAmountDTO;
import com.secuconnect.client.model.PaymentTransactionsList;
import com.secuconnect.client.model.PaymentTransactionsProductModel;
import com.secuconnect.client.model.PaymentTransactionsShippingUrl;
import com.secuconnect.client.model.ProductExceptionPayload;
import com.secuconnect.client.model.ResultBoolean;
import com.secuconnect.client.model.SecupayTransactionProductDTO;
import com.secuconnect.client.model.SecupayTransactionProductModel;
import com.secuconnect.client.model.SecupayTransactionSetShippingInformationDTO;
import okhttp3.Call;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PaymentTransactionsApi {
    private ApiClient apiClient;

    public PaymentTransactionsApi() {
        this(Environment.getGlobalEnv().getApiClient());
    }

    public PaymentTransactionsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for addTransaction
     * @param body Create payment transaction input properties
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public Call addTransactionCall(SecupayTransactionProductDTO body) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/Payment/Transactions";

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
    private Call addTransactionValidateBeforeCall(SecupayTransactionProductDTO body) throws ApiException {

        return addTransactionCall(body);
    }

    /**
     * POST Payment/Transactions
     * Create a payment transaction
     * @param body Create payment transaction input properties
     * @return SecupayTransactionProductModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SecupayTransactionProductModel addTransaction(SecupayTransactionProductDTO body) throws ApiException {
        ApiResponse<SecupayTransactionProductModel> resp = addTransactionWithHttpInfo(body);
        return resp.getData();
    }

    /**
     * POST Payment/Transactions
     * Create a payment transaction
     * @param body Create payment transaction input properties
     * @return ApiResponse&lt;SecupayTransactionProductModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SecupayTransactionProductModel> addTransactionWithHttpInfo(SecupayTransactionProductDTO body) throws ApiException {
        Call call = addTransactionValidateBeforeCall(body);
        Type localVarReturnType = new TypeToken<SecupayTransactionProductModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * POST Payment/Transactions (asynchronously)
     * Create a payment transaction
     * @param body Create payment transaction input properties
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call addTransactionAsync(SecupayTransactionProductDTO body, final ApiCallback<SecupayTransactionProductModel> callback) throws ApiException {
        Call call = addTransactionValidateBeforeCall(body);
        Type localVarReturnType = new TypeToken<SecupayTransactionProductModel>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for assignTransferBalance
     * @param paymentTransactionId Payment transaction ID (required)
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public Call assignTransferBalanceCall(String paymentTransactionId) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/Payment/Transactions/{paymentTransactionId}/assignTransferBalance"
            .replaceAll("\\{" + "paymentTransactionId" + "\\}", apiClient.escapeString(paymentTransactionId.toString()));

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
    private Call assignTransferBalanceValidateBeforeCall(String paymentTransactionId) throws ApiException {
        // verify the required parameter 'paymentTransactionId' is set
        if (paymentTransactionId == null) {
            throw new ApiException("Missing the required parameter 'paymentTransactionId' when calling assignTransferBalance(Async)");
        }

        return assignTransferBalanceCall(paymentTransactionId);
    }

    /**
     * POST Payment/Transactions/{paymentTransactionId}/assignTransferBalance
     * Assign balance to a payment transaction
     * @param paymentTransactionId Payment transaction ID (required)
     * @return PaymentTransactionsProductModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PaymentTransactionsProductModel assignTransferBalance(String paymentTransactionId) throws ApiException {
        ApiResponse<PaymentTransactionsProductModel> resp = assignTransferBalanceWithHttpInfo(paymentTransactionId);
        return resp.getData();
    }

    /**
     * POST Payment/Transactions/{paymentTransactionId}/assignTransferBalance
     * Assign balance to a payment transaction
     * @param paymentTransactionId Payment transaction ID (required)
     * @return ApiResponse&lt;PaymentTransactionsProductModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PaymentTransactionsProductModel> assignTransferBalanceWithHttpInfo(String paymentTransactionId) throws ApiException {
        Call call = assignTransferBalanceValidateBeforeCall(paymentTransactionId);
        Type localVarReturnType = new TypeToken<PaymentTransactionsProductModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * POST Payment/Transactions/{paymentTransactionId}/assignTransferBalance (asynchronously)
     * Assign balance to a payment transaction
     * @param paymentTransactionId Payment transaction ID (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call assignTransferBalanceAsync(String paymentTransactionId, final ApiCallback<PaymentTransactionsProductModel> callback) throws ApiException {
        Call call = assignTransferBalanceValidateBeforeCall(paymentTransactionId);
        Type localVarReturnType = new TypeToken<PaymentTransactionsProductModel>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for cancel
     * @param paymentTransactionId Payment transaction id (required)
     * @param body Cancel payment transaction input properties
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public Call cancelCall(String paymentTransactionId, PaymentTransactionCancelDTO body) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/Payment/Transactions/{paymentTransactionId}/cancel"
            .replaceAll("\\{" + "paymentTransactionId" + "\\}", apiClient.escapeString(paymentTransactionId.toString()));

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
    private Call cancelValidateBeforeCall(String paymentTransactionId, PaymentTransactionCancelDTO body) throws ApiException {
        // verify the required parameter 'paymentTransactionId' is set
        if (paymentTransactionId == null) {
            throw new ApiException("Missing the required parameter 'paymentTransactionId' when calling cancel(Async)");
        }

        return cancelCall(paymentTransactionId, body);
    }

    /**
     * POST Payment/Transactions/{paymentTransactionId}/cancel
     * Cancel a payment transaction
     * @param paymentTransactionId Payment transaction id (required)
     * @param body Cancel payment transaction input properties
     * @return List&lt;PaymentTransactionsProductModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<PaymentTransactionsProductModel> cancel(String paymentTransactionId, PaymentTransactionCancelDTO body) throws ApiException {
        ApiResponse<List<PaymentTransactionsProductModel>> resp = cancelWithHttpInfo(paymentTransactionId, body);
        return resp.getData();
    }

    /**
     * POST Payment/Transactions/{paymentTransactionId}/cancel
     * Cancel a payment transaction
     * @param paymentTransactionId Payment transaction id (required)
     * @param body Cancel payment transaction input properties
     * @return ApiResponse&lt;List&lt;PaymentTransactionsProductModel&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<PaymentTransactionsProductModel>> cancelWithHttpInfo(String paymentTransactionId, PaymentTransactionCancelDTO body) throws ApiException {
        Call call = cancelValidateBeforeCall(paymentTransactionId, body);
        Type localVarReturnType = new TypeToken<List<PaymentTransactionsProductModel>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * POST Payment/Transactions/{paymentTransactionId}/cancel (asynchronously)
     * Cancel a payment transaction
     * @param paymentTransactionId Payment transaction id (required)
     * @param body Cancel payment transaction input properties
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call cancelAsync(String paymentTransactionId, PaymentTransactionCancelDTO body, final ApiCallback<List<PaymentTransactionsProductModel>> callback) throws ApiException {
        Call call = cancelValidateBeforeCall(paymentTransactionId, body);
        Type localVarReturnType = new TypeToken<List<PaymentTransactionsProductModel>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for checkStatus
     * @param paymentTransactionId Payment transaction id (required)
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public Call checkStatusCall(String paymentTransactionId) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/Payment/Transactions/{paymentTransactionId}/checkStatus"
            .replaceAll("\\{" + "paymentTransactionId" + "\\}", apiClient.escapeString(paymentTransactionId.toString()));

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
    private Call checkStatusValidateBeforeCall(String paymentTransactionId) throws ApiException {
        // verify the required parameter 'paymentTransactionId' is set
        if (paymentTransactionId == null) {
            throw new ApiException("Missing the required parameter 'paymentTransactionId' when calling checkStatus(Async)");
        }

        return checkStatusCall(paymentTransactionId);
    }

    /**
     * GET Payment/Transactions/{paymentTransactionId}/checkStatus
     * Get the current status of a transaction
     * @param paymentTransactionId Payment transaction id (required)
     * @return PaymentTransactionsCheckStatus
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PaymentTransactionsCheckStatus checkStatus(String paymentTransactionId) throws ApiException {
        ApiResponse<PaymentTransactionsCheckStatus> resp = checkStatusWithHttpInfo(paymentTransactionId);
        return resp.getData();
    }

    /**
     * GET Payment/Transactions/{paymentTransactionId}/checkStatus
     * Get the current status of a transaction
     * @param paymentTransactionId Payment transaction id (required)
     * @return ApiResponse&lt;PaymentTransactionsCheckStatus&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PaymentTransactionsCheckStatus> checkStatusWithHttpInfo(String paymentTransactionId) throws ApiException {
        Call call = checkStatusValidateBeforeCall(paymentTransactionId);
        Type localVarReturnType = new TypeToken<PaymentTransactionsCheckStatus>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * GET Payment/Transactions/{paymentTransactionId}/checkStatus (asynchronously)
     * Get the current status of a transaction
     * @param paymentTransactionId Payment transaction id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call checkStatusAsync(String paymentTransactionId, final ApiCallback<PaymentTransactionsCheckStatus> callback) throws ApiException {
        Call call = checkStatusValidateBeforeCall(paymentTransactionId);
        Type localVarReturnType = new TypeToken<PaymentTransactionsCheckStatus>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for getAll
     * @param count The maximum number of items to return
     * @param offset The position within the whole result set to start returning items (zero-based)
     * @param fields List of fields to include in the result, all others will be filtered out. Nested properties can be accessed with this notation: &#x60;prop1.prop2&#x60;.
     * @param q A query string to restrict the returned items to given conditions. The query string must consist of any combination of single expressions in the form &#x60;property:condition&#x60;. Property names can be nested like &#x60;property.property&#x60;.  Example: &#x60;customer.name:Meier&#x60;  A condition may contain:  * &#x60;?&#x60; as wildcard for one character;  * &#x60;*&#x60; as wildcard for any number of characters.  You can also use value ranges in the form &#x60;[min TO max]&#x60;.  Example: &#x60;customer.age:[30 TO 40]&#x60;  You can combine expressions logically by &#x60;expr AND expr&#x60; and &#x60;{expr} OR {expr}&#x60;. You can also negate an expression using &#x60;NOT {expr}&#x60;. Parenthesis &#x60;(...)&#x60; can be used to control precedence.  Example: &#x60;(NOT customer.name:meier*) AND (customer.age:[30 TO 40] OR customer.age:[50 TO 60])&#x60;
     * @param sort String with comma separated pairs of &#x60;field:order&#x60;.  Options for order:  * &#x60;asc&#x60; ascending;  * &#x60;desc&#x60; descending.
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public Call getAllCall(Integer count, Integer offset, String fields, String q, String sort) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/Payment/Transactions";

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
     * GET Payment/Transactions
     * Get a list of payment transactions
     * @param count The maximum number of items to return
     * @param offset The position within the whole result set to start returning items (zero-based)
     * @param fields List of fields to include in the result, all others will be filtered out. Nested properties can be accessed with this notation: &#x60;prop1.prop2&#x60;.
     * @param q A query string to restrict the returned items to given conditions. The query string must consist of any combination of single expressions in the form &#x60;property:condition&#x60;. Property names can be nested like &#x60;property.property&#x60;.  Example: &#x60;customer.name:Meier&#x60;  A condition may contain:  * &#x60;?&#x60; as wildcard for one character;  * &#x60;*&#x60; as wildcard for any number of characters.  You can also use value ranges in the form &#x60;[min TO max]&#x60;.  Example: &#x60;customer.age:[30 TO 40]&#x60;  You can combine expressions logically by &#x60;expr AND expr&#x60; and &#x60;{expr} OR {expr}&#x60;. You can also negate an expression using &#x60;NOT {expr}&#x60;. Parenthesis &#x60;(...)&#x60; can be used to control precedence.  Example: &#x60;(NOT customer.name:meier*) AND (customer.age:[30 TO 40] OR customer.age:[50 TO 60])&#x60;
     * @param sort String with comma separated pairs of &#x60;field:order&#x60;.  Options for order:  * &#x60;asc&#x60; ascending;  * &#x60;desc&#x60; descending.
     * @return PaymentTransactionsList
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PaymentTransactionsList getAll(Integer count, Integer offset, String fields, String q, String sort) throws ApiException {
        ApiResponse<PaymentTransactionsList> resp = getAllWithHttpInfo(count, offset, fields, q, sort);
        return resp.getData();
    }

    /**
     * GET Payment/Transactions
     * Get a list of payment transactions
     * @param count The maximum number of items to return
     * @param offset The position within the whole result set to start returning items (zero-based)
     * @param fields List of fields to include in the result, all others will be filtered out. Nested properties can be accessed with this notation: &#x60;prop1.prop2&#x60;.
     * @param q A query string to restrict the returned items to given conditions. The query string must consist of any combination of single expressions in the form &#x60;property:condition&#x60;. Property names can be nested like &#x60;property.property&#x60;.  Example: &#x60;customer.name:Meier&#x60;  A condition may contain:  * &#x60;?&#x60; as wildcard for one character;  * &#x60;*&#x60; as wildcard for any number of characters.  You can also use value ranges in the form &#x60;[min TO max]&#x60;.  Example: &#x60;customer.age:[30 TO 40]&#x60;  You can combine expressions logically by &#x60;expr AND expr&#x60; and &#x60;{expr} OR {expr}&#x60;. You can also negate an expression using &#x60;NOT {expr}&#x60;. Parenthesis &#x60;(...)&#x60; can be used to control precedence.  Example: &#x60;(NOT customer.name:meier*) AND (customer.age:[30 TO 40] OR customer.age:[50 TO 60])&#x60;
     * @param sort String with comma separated pairs of &#x60;field:order&#x60;.  Options for order:  * &#x60;asc&#x60; ascending;  * &#x60;desc&#x60; descending.
     * @return ApiResponse&lt;PaymentTransactionsList&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PaymentTransactionsList> getAllWithHttpInfo(Integer count, Integer offset, String fields, String q, String sort) throws ApiException {
        Call call = getAllValidateBeforeCall(count, offset, fields, q, sort);
        Type localVarReturnType = new TypeToken<PaymentTransactionsList>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * GET Payment/Transactions (asynchronously)
     * Get a list of payment transactions
     * @param count The maximum number of items to return
     * @param offset The position within the whole result set to start returning items (zero-based)
     * @param fields List of fields to include in the result, all others will be filtered out. Nested properties can be accessed with this notation: &#x60;prop1.prop2&#x60;.
     * @param q A query string to restrict the returned items to given conditions. The query string must consist of any combination of single expressions in the form &#x60;property:condition&#x60;. Property names can be nested like &#x60;property.property&#x60;.  Example: &#x60;customer.name:Meier&#x60;  A condition may contain:  * &#x60;?&#x60; as wildcard for one character;  * &#x60;*&#x60; as wildcard for any number of characters.  You can also use value ranges in the form &#x60;[min TO max]&#x60;.  Example: &#x60;customer.age:[30 TO 40]&#x60;  You can combine expressions logically by &#x60;expr AND expr&#x60; and &#x60;{expr} OR {expr}&#x60;. You can also negate an expression using &#x60;NOT {expr}&#x60;. Parenthesis &#x60;(...)&#x60; can be used to control precedence.  Example: &#x60;(NOT customer.name:meier*) AND (customer.age:[30 TO 40] OR customer.age:[50 TO 60])&#x60;
     * @param sort String with comma separated pairs of &#x60;field:order&#x60;.  Options for order:  * &#x60;asc&#x60; ascending;  * &#x60;desc&#x60; descending.
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call getAllAsync(Integer count, Integer offset, String fields, String q, String sort, final ApiCallback<PaymentTransactionsList> callback) throws ApiException {
        Call call = getAllValidateBeforeCall(count, offset, fields, q, sort);
        Type localVarReturnType = new TypeToken<PaymentTransactionsList>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for getCrowdFundingData
     * @param generalMerchantId Merchant ID (MRC_...) (required)
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public Call getCrowdFundingDataCall(String generalMerchantId) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/Payment/Transactions/me/CrowdFundingData/{generalMerchantId}"
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

        String[] localVarAuthNames = new String[] { "oauth_token" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames);
    }

    @SuppressWarnings("rawtypes")
    private Call getCrowdFundingDataValidateBeforeCall(String generalMerchantId) throws ApiException {
        // verify the required parameter 'generalMerchantId' is set
        if (generalMerchantId == null) {
            throw new ApiException("Missing the required parameter 'generalMerchantId' when calling getCrowdFundingData(Async)");
        }

        return getCrowdFundingDataCall(generalMerchantId);
    }

    /**
     * GET Payment/Transactions/me/CrowdFundingData/{generalMerchantId}
     * Get the transaction amounts, count and payout data per product
     * @param generalMerchantId Merchant ID (MRC_...) (required)
     * @return PaymentCrowdFundingData
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PaymentCrowdFundingData getCrowdFundingData(String generalMerchantId) throws ApiException {
        ApiResponse<PaymentCrowdFundingData> resp = getCrowdFundingDataWithHttpInfo(generalMerchantId);
        return resp.getData();
    }

    /**
     * GET Payment/Transactions/me/CrowdFundingData/{generalMerchantId}
     * Get the transaction amounts, count and payout data per product
     * @param generalMerchantId Merchant ID (MRC_...) (required)
     * @return ApiResponse&lt;PaymentCrowdFundingData&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PaymentCrowdFundingData> getCrowdFundingDataWithHttpInfo(String generalMerchantId) throws ApiException {
        Call call = getCrowdFundingDataValidateBeforeCall(generalMerchantId);
        Type localVarReturnType = new TypeToken<PaymentCrowdFundingData>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * GET Payment/Transactions/me/CrowdFundingData/{generalMerchantId} (asynchronously)
     * Get the transaction amounts, count and payout data per product
     * @param generalMerchantId Merchant ID (MRC_...) (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call getCrowdFundingDataAsync(String generalMerchantId, final ApiCallback<PaymentCrowdFundingData> callback) throws ApiException {
        Call call = getCrowdFundingDataValidateBeforeCall(generalMerchantId);
        Type localVarReturnType = new TypeToken<PaymentCrowdFundingData>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for getOne
     * @param paymentTransactionId Payment transaction id (required)
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public Call getOneCall(String paymentTransactionId) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/Payment/Transactions/{paymentTransactionId}"
            .replaceAll("\\{" + "paymentTransactionId" + "\\}", apiClient.escapeString(paymentTransactionId.toString()));

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
    private Call getOneValidateBeforeCall(String paymentTransactionId) throws ApiException {
        // verify the required parameter 'paymentTransactionId' is set
        if (paymentTransactionId == null) {
            throw new ApiException("Missing the required parameter 'paymentTransactionId' when calling getOne(Async)");
        }

        return getOneCall(paymentTransactionId);
    }

    /**
     * GET Payment/Transactions/{paymentTransactionId}
     * Get all payment transactions
     * @param paymentTransactionId Payment transaction id (required)
     * @return PaymentTransactionsProductModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PaymentTransactionsProductModel getOne(String paymentTransactionId) throws ApiException {
        ApiResponse<PaymentTransactionsProductModel> resp = getOneWithHttpInfo(paymentTransactionId);
        return resp.getData();
    }

    /**
     * GET Payment/Transactions/{paymentTransactionId}
     * Get all payment transactions
     * @param paymentTransactionId Payment transaction id (required)
     * @return ApiResponse&lt;PaymentTransactionsProductModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PaymentTransactionsProductModel> getOneWithHttpInfo(String paymentTransactionId) throws ApiException {
        Call call = getOneValidateBeforeCall(paymentTransactionId);
        Type localVarReturnType = new TypeToken<PaymentTransactionsProductModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * GET Payment/Transactions/{paymentTransactionId} (asynchronously)
     * Get all payment transactions
     * @param paymentTransactionId Payment transaction id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call getOneAsync(String paymentTransactionId, final ApiCallback<PaymentTransactionsProductModel> callback) throws ApiException {
        Call call = getOneValidateBeforeCall(paymentTransactionId);
        Type localVarReturnType = new TypeToken<PaymentTransactionsProductModel>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for getPaymentTransactionsOldFormat
     * @param paymentTransactionId Payment ID (PCI_...) or hash (required)
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public Call getPaymentTransactionsOldFormatCall(String paymentTransactionId) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/Payment/Transactions/{paymentTransactionId}/OldFormat"
            .replaceAll("\\{" + "paymentTransactionId" + "\\}", apiClient.escapeString(paymentTransactionId.toString()));

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
    private Call getPaymentTransactionsOldFormatValidateBeforeCall(String paymentTransactionId) throws ApiException {
        // verify the required parameter 'paymentTransactionId' is set
        if (paymentTransactionId == null) {
            throw new ApiException("Missing the required parameter 'paymentTransactionId' when calling getPaymentTransactionsOldFormat(Async)");
        }

        return getPaymentTransactionsOldFormatCall(paymentTransactionId);
    }

    /**
     * GET Payment/Transactions/{paymentTransactionId}/OldFormat
     * Get old format for specific payment transactions
     * @param paymentTransactionId Payment ID (PCI_...) or hash (required)
     * @return SecupayTransactionProductModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SecupayTransactionProductModel getPaymentTransactionsOldFormat(String paymentTransactionId) throws ApiException {
        ApiResponse<SecupayTransactionProductModel> resp = getPaymentTransactionsOldFormatWithHttpInfo(paymentTransactionId);
        return resp.getData();
    }

    /**
     * GET Payment/Transactions/{paymentTransactionId}/OldFormat
     * Get old format for specific payment transactions
     * @param paymentTransactionId Payment ID (PCI_...) or hash (required)
     * @return ApiResponse&lt;SecupayTransactionProductModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SecupayTransactionProductModel> getPaymentTransactionsOldFormatWithHttpInfo(String paymentTransactionId) throws ApiException {
        Call call = getPaymentTransactionsOldFormatValidateBeforeCall(paymentTransactionId);
        Type localVarReturnType = new TypeToken<SecupayTransactionProductModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * GET Payment/Transactions/{paymentTransactionId}/OldFormat (asynchronously)
     * Get old format for specific payment transactions
     * @param paymentTransactionId Payment ID (PCI_...) or hash (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call getPaymentTransactionsOldFormatAsync(String paymentTransactionId, final ApiCallback<SecupayTransactionProductModel> callback) throws ApiException {
        Call call = getPaymentTransactionsOldFormatValidateBeforeCall(paymentTransactionId);
        Type localVarReturnType = new TypeToken<SecupayTransactionProductModel>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for getShippingUrl
     * @param paymentTransactionId Payment transaction id (required)
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public Call getShippingUrlCall(String paymentTransactionId) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/Payment/Transactions/{paymentTransactionId}/shippingUrl"
            .replaceAll("\\{" + "paymentTransactionId" + "\\}", apiClient.escapeString(paymentTransactionId.toString()));

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
    private Call getShippingUrlValidateBeforeCall(String paymentTransactionId) throws ApiException {
        // verify the required parameter 'paymentTransactionId' is set
        if (paymentTransactionId == null) {
            throw new ApiException("Missing the required parameter 'paymentTransactionId' when calling getShippingUrl(Async)");
        }

        return getShippingUrlCall(paymentTransactionId);
    }

    /**
     * GET Payment/Transactions/{paymentTransactionId}/shippingUrl
     * Get the url where you can fill the shipping information
     * @param paymentTransactionId Payment transaction id (required)
     * @return PaymentTransactionsShippingUrl
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PaymentTransactionsShippingUrl getShippingUrl(String paymentTransactionId) throws ApiException {
        ApiResponse<PaymentTransactionsShippingUrl> resp = getShippingUrlWithHttpInfo(paymentTransactionId);
        return resp.getData();
    }

    /**
     * GET Payment/Transactions/{paymentTransactionId}/shippingUrl
     * Get the url where you can fill the shipping information
     * @param paymentTransactionId Payment transaction id (required)
     * @return ApiResponse&lt;PaymentTransactionsShippingUrl&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PaymentTransactionsShippingUrl> getShippingUrlWithHttpInfo(String paymentTransactionId) throws ApiException {
        Call call = getShippingUrlValidateBeforeCall(paymentTransactionId);
        Type localVarReturnType = new TypeToken<PaymentTransactionsShippingUrl>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * GET Payment/Transactions/{paymentTransactionId}/shippingUrl (asynchronously)
     * Get the url where you can fill the shipping information
     * @param paymentTransactionId Payment transaction id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call getShippingUrlAsync(String paymentTransactionId, final ApiCallback<PaymentTransactionsShippingUrl> callback) throws ApiException {
        Call call = getShippingUrlValidateBeforeCall(paymentTransactionId);
        Type localVarReturnType = new TypeToken<PaymentTransactionsShippingUrl>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for increaseAmount
     * @param paymentTransactionId Payment ID (PCI_...) (required)
     * @param body increase amount input params
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public Call increaseAmountCall(String paymentTransactionId, PaymentTransactionsIncreaseAmountDTO body) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/Payment/Transactions/{paymentTransactionId}/IncreaseAmount"
            .replaceAll("\\{" + "paymentTransactionId" + "\\}", apiClient.escapeString(paymentTransactionId.toString()));

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
    private Call increaseAmountValidateBeforeCall(String paymentTransactionId, PaymentTransactionsIncreaseAmountDTO body) throws ApiException {
        // verify the required parameter 'paymentTransactionId' is set
        if (paymentTransactionId == null) {
            throw new ApiException("Missing the required parameter 'paymentTransactionId' when calling increaseAmount(Async)");
        }

        return increaseAmountCall(paymentTransactionId, body);
    }

    /**
     * POST Payment/Transactions/{paymentTransactionId}/IncreaseAmount
     * Increase the amount of a prepaid transaction which is not yet completed
     * @param paymentTransactionId Payment ID (PCI_...) (required)
     * @param body increase amount input params
     * @return PaymentTransactionsProductModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PaymentTransactionsProductModel increaseAmount(String paymentTransactionId, PaymentTransactionsIncreaseAmountDTO body) throws ApiException {
        ApiResponse<PaymentTransactionsProductModel> resp = increaseAmountWithHttpInfo(paymentTransactionId, body);
        return resp.getData();
    }

    /**
     * POST Payment/Transactions/{paymentTransactionId}/IncreaseAmount
     * Increase the amount of a prepaid transaction which is not yet completed
     * @param paymentTransactionId Payment ID (PCI_...) (required)
     * @param body increase amount input params
     * @return ApiResponse&lt;PaymentTransactionsProductModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PaymentTransactionsProductModel> increaseAmountWithHttpInfo(String paymentTransactionId, PaymentTransactionsIncreaseAmountDTO body) throws ApiException {
        Call call = increaseAmountValidateBeforeCall(paymentTransactionId, body);
        Type localVarReturnType = new TypeToken<PaymentTransactionsProductModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * POST Payment/Transactions/{paymentTransactionId}/IncreaseAmount (asynchronously)
     * Increase the amount of a prepaid transaction which is not yet completed
     * @param paymentTransactionId Payment ID (PCI_...) (required)
     * @param body increase amount input params
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call increaseAmountAsync(String paymentTransactionId, PaymentTransactionsIncreaseAmountDTO body, final ApiCallback<PaymentTransactionsProductModel> callback) throws ApiException {
        Call call = increaseAmountValidateBeforeCall(paymentTransactionId, body);
        Type localVarReturnType = new TypeToken<PaymentTransactionsProductModel>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for revokeAccrual
     * @param paymentTransactionId Payment transaction id (required)
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public Call revokeAccrualCall(String paymentTransactionId) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/Payment/Transactions/{paymentTransactionId}/revokeAccrual"
            .replaceAll("\\{" + "paymentTransactionId" + "\\}", apiClient.escapeString(paymentTransactionId.toString()));

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
    private Call revokeAccrualValidateBeforeCall(String paymentTransactionId) throws ApiException {
        // verify the required parameter 'paymentTransactionId' is set
        if (paymentTransactionId == null) {
            throw new ApiException("Missing the required parameter 'paymentTransactionId' when calling revokeAccrual(Async)");
        }

        return revokeAccrualCall(paymentTransactionId);
    }

    /**
     * POST Payment/Transactions/{paymentTransactionId}/revokeAccrual
     * Revoke the accrual flag of a payment transaction
     * @param paymentTransactionId Payment transaction id (required)
     * @return PaymentTransactionsProductModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PaymentTransactionsProductModel revokeAccrual(String paymentTransactionId) throws ApiException {
        ApiResponse<PaymentTransactionsProductModel> resp = revokeAccrualWithHttpInfo(paymentTransactionId);
        return resp.getData();
    }

    /**
     * POST Payment/Transactions/{paymentTransactionId}/revokeAccrual
     * Revoke the accrual flag of a payment transaction
     * @param paymentTransactionId Payment transaction id (required)
     * @return ApiResponse&lt;PaymentTransactionsProductModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PaymentTransactionsProductModel> revokeAccrualWithHttpInfo(String paymentTransactionId) throws ApiException {
        Call call = revokeAccrualValidateBeforeCall(paymentTransactionId);
        Type localVarReturnType = new TypeToken<PaymentTransactionsProductModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * POST Payment/Transactions/{paymentTransactionId}/revokeAccrual (asynchronously)
     * Revoke the accrual flag of a payment transaction
     * @param paymentTransactionId Payment transaction id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call revokeAccrualAsync(String paymentTransactionId, final ApiCallback<PaymentTransactionsProductModel> callback) throws ApiException {
        Call call = revokeAccrualValidateBeforeCall(paymentTransactionId);
        Type localVarReturnType = new TypeToken<PaymentTransactionsProductModel>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for updateShippingInformation
     * @param paymentTransactionId Payment ID (PCI_...) or hash (required)
     * @param body Update shipping information input properties
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public Call updateShippingInformationCall(String paymentTransactionId, SecupayTransactionSetShippingInformationDTO body) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/Payment/Transactions/{paymentTransactionId}/ShippingInformation"
            .replaceAll("\\{" + "paymentTransactionId" + "\\}", apiClient.escapeString(paymentTransactionId.toString()));

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
    private Call updateShippingInformationValidateBeforeCall(String paymentTransactionId, SecupayTransactionSetShippingInformationDTO body) throws ApiException {
        // verify the required parameter 'paymentTransactionId' is set
        if (paymentTransactionId == null) {
            throw new ApiException("Missing the required parameter 'paymentTransactionId' when calling updateShippingInformation(Async)");
        }

        return updateShippingInformationCall(paymentTransactionId, body);
    }

    /**
     * PUT Payment/Transactions/{paymentTransactionId}/ShippingInformation
     * Update the shipping information for a transaction
     * @param paymentTransactionId Payment ID (PCI_...) or hash (required)
     * @param body Update shipping information input properties
     * @return ResultBoolean
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ResultBoolean updateShippingInformation(String paymentTransactionId, SecupayTransactionSetShippingInformationDTO body) throws ApiException {
        ApiResponse<ResultBoolean> resp = updateShippingInformationWithHttpInfo(paymentTransactionId, body);
        return resp.getData();
    }

    /**
     * PUT Payment/Transactions/{paymentTransactionId}/ShippingInformation
     * Update the shipping information for a transaction
     * @param paymentTransactionId Payment ID (PCI_...) or hash (required)
     * @param body Update shipping information input properties
     * @return ApiResponse&lt;ResultBoolean&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ResultBoolean> updateShippingInformationWithHttpInfo(String paymentTransactionId, SecupayTransactionSetShippingInformationDTO body) throws ApiException {
        Call call = updateShippingInformationValidateBeforeCall(paymentTransactionId, body);
        Type localVarReturnType = new TypeToken<ResultBoolean>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * PUT Payment/Transactions/{paymentTransactionId}/ShippingInformation (asynchronously)
     * Update the shipping information for a transaction
     * @param paymentTransactionId Payment ID (PCI_...) or hash (required)
     * @param body Update shipping information input properties
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call updateShippingInformationAsync(String paymentTransactionId, SecupayTransactionSetShippingInformationDTO body, final ApiCallback<ResultBoolean> callback) throws ApiException {
        Call call = updateShippingInformationValidateBeforeCall(paymentTransactionId, body);
        Type localVarReturnType = new TypeToken<ResultBoolean>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}

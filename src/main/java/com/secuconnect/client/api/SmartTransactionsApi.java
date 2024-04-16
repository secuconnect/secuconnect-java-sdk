package com.secuconnect.client.api;

import com.google.gson.reflect.TypeToken;
import com.secuconnect.client.*;
import com.secuconnect.client.model.Aggregate;
import java.math.BigDecimal;
import com.secuconnect.client.model.ProductExceptionPayload;
import com.secuconnect.client.model.SmartTransactionsDTO;
import com.secuconnect.client.model.SmartTransactionsList;
import com.secuconnect.client.model.SmartTransactionsPreTransactionModel;
import com.secuconnect.client.model.SmartTransactionsPrepare;
import com.secuconnect.client.model.SmartTransactionsProductModel;
import com.secuconnect.client.model.SmartTransactionsSetDeliveryModel;
import com.secuconnect.client.model.SmartTransactionsStart;
import okhttp3.Call;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SmartTransactionsApi {
    private ApiClient apiClient;

    public SmartTransactionsApi() {
        this(Environment.getGlobalEnv().getApiClient());
    }

    public SmartTransactionsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for abortTransaction
     * @param smartTransactionId Smart Transaction ID (required)
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public Call abortTransactionCall(String smartTransactionId) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/Smart/Transactions/{smartTransactionId}/abort"
            .replaceAll("\\{" + "smartTransactionId" + "\\}", apiClient.escapeString(smartTransactionId.toString()));

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
    private Call abortTransactionValidateBeforeCall(String smartTransactionId) throws ApiException {
        // verify the required parameter 'smartTransactionId' is set
        if (smartTransactionId == null) {
            throw new ApiException("Missing the required parameter 'smartTransactionId' when calling abortTransaction(Async)");
        }

        return abortTransactionCall(smartTransactionId);
    }

    /**
     * Abort order
     * Abandons a Smart Transaction that has not yet been started.
     * @param smartTransactionId Smart Transaction ID (required)
     * @return SmartTransactionsProductModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SmartTransactionsProductModel abortTransaction(String smartTransactionId) throws ApiException {
        ApiResponse<SmartTransactionsProductModel> resp = abortTransactionWithHttpInfo(smartTransactionId);
        return resp.getData();
    }

    /**
     * Abort order
     * Abandons a Smart Transaction that has not yet been started.
     * @param smartTransactionId Smart Transaction ID (required)
     * @return ApiResponse&lt;SmartTransactionsProductModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SmartTransactionsProductModel> abortTransactionWithHttpInfo(String smartTransactionId) throws ApiException {
        Call call = abortTransactionValidateBeforeCall(smartTransactionId);
        Type localVarReturnType = new TypeToken<SmartTransactionsProductModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Abort order (asynchronously)
     * Abandons a Smart Transaction that has not yet been started.
     * @param smartTransactionId Smart Transaction ID (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call abortTransactionAsync(String smartTransactionId, final ApiCallback<SmartTransactionsProductModel> callback) throws ApiException {
        Call call = abortTransactionValidateBeforeCall(smartTransactionId);
        Type localVarReturnType = new TypeToken<SmartTransactionsProductModel>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for addTransaction
     * @param body Transaction details
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public Call addTransactionCall(SmartTransactionsDTO body) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/Smart/Transactions";

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
    private Call addTransactionValidateBeforeCall(SmartTransactionsDTO body) throws ApiException {

        return addTransactionCall(body);
    }

    /**
     * Create Smart Transaction
     * Creates a new Smart Transaction from the given data.
     * @param body Transaction details
     * @return SmartTransactionsProductModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SmartTransactionsProductModel addTransaction(SmartTransactionsDTO body) throws ApiException {
        ApiResponse<SmartTransactionsProductModel> resp = addTransactionWithHttpInfo(body);
        return resp.getData();
    }

    /**
     * Create Smart Transaction
     * Creates a new Smart Transaction from the given data.
     * @param body Transaction details
     * @return ApiResponse&lt;SmartTransactionsProductModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SmartTransactionsProductModel> addTransactionWithHttpInfo(SmartTransactionsDTO body) throws ApiException {
        Call call = addTransactionValidateBeforeCall(body);
        Type localVarReturnType = new TypeToken<SmartTransactionsProductModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Create Smart Transaction (asynchronously)
     * Creates a new Smart Transaction from the given data.
     * @param body Transaction details
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call addTransactionAsync(SmartTransactionsDTO body, final ApiCallback<SmartTransactionsProductModel> callback) throws ApiException {
        Call call = addTransactionValidateBeforeCall(body);
        Type localVarReturnType = new TypeToken<SmartTransactionsProductModel>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for cancelTransaction
     * @param smartTransactionId Smart Transaction ID (required)
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public Call cancelTransactionCall(String smartTransactionId) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/Smart/Transactions/{smartTransactionId}/cancel"
            .replaceAll("\\{" + "smartTransactionId" + "\\}", apiClient.escapeString(smartTransactionId.toString()));

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
    private Call cancelTransactionValidateBeforeCall(String smartTransactionId) throws ApiException {
        // verify the required parameter 'smartTransactionId' is set
        if (smartTransactionId == null) {
            throw new ApiException("Missing the required parameter 'smartTransactionId' when calling cancelTransaction(Async)");
        }

        return cancelTransactionCall(smartTransactionId);
    }

    /**
     * Cancel payment
     * Cancels the Smart Transaction.
     * @param smartTransactionId Smart Transaction ID (required)
     * @return SmartTransactionsProductModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SmartTransactionsProductModel cancelTransaction(String smartTransactionId) throws ApiException {
        ApiResponse<SmartTransactionsProductModel> resp = cancelTransactionWithHttpInfo(smartTransactionId);
        return resp.getData();
    }

    /**
     * Cancel payment
     * Cancels the Smart Transaction.
     * @param smartTransactionId Smart Transaction ID (required)
     * @return ApiResponse&lt;SmartTransactionsProductModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SmartTransactionsProductModel> cancelTransactionWithHttpInfo(String smartTransactionId) throws ApiException {
        Call call = cancelTransactionValidateBeforeCall(smartTransactionId);
        Type localVarReturnType = new TypeToken<SmartTransactionsProductModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Cancel payment (asynchronously)
     * Cancels the Smart Transaction.
     * @param smartTransactionId Smart Transaction ID (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call cancelTransactionAsync(String smartTransactionId, final ApiCallback<SmartTransactionsProductModel> callback) throws ApiException {
        Call call = cancelTransactionValidateBeforeCall(smartTransactionId);
        Type localVarReturnType = new TypeToken<SmartTransactionsProductModel>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for cancelTrx
     * @param smartTransactionId Receipt number (required)
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public Call cancelTrxCall(String smartTransactionId) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/Smart/Transactions/{smartTransactionId}/canceltrx"
            .replaceAll("\\{" + "smartTransactionId" + "\\}", apiClient.escapeString(smartTransactionId.toString()));

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
    private Call cancelTrxValidateBeforeCall(String smartTransactionId) throws ApiException {
        // verify the required parameter 'smartTransactionId' is set
        if (smartTransactionId == null) {
            throw new ApiException("Missing the required parameter 'smartTransactionId' when calling cancelTrx(Async)");
        }

        return cancelTrxCall(smartTransactionId);
    }

    /**
     * Cancel cash transaction
     * Cancels the terminal-induced &#x60;\&quot;cash\&quot;&#x60; transaction with the given receipt number.
     * @param smartTransactionId Receipt number (required)
     * @return SmartTransactionsProductModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SmartTransactionsProductModel cancelTrx(String smartTransactionId) throws ApiException {
        ApiResponse<SmartTransactionsProductModel> resp = cancelTrxWithHttpInfo(smartTransactionId);
        return resp.getData();
    }

    /**
     * Cancel cash transaction
     * Cancels the terminal-induced &#x60;\&quot;cash\&quot;&#x60; transaction with the given receipt number.
     * @param smartTransactionId Receipt number (required)
     * @return ApiResponse&lt;SmartTransactionsProductModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SmartTransactionsProductModel> cancelTrxWithHttpInfo(String smartTransactionId) throws ApiException {
        Call call = cancelTrxValidateBeforeCall(smartTransactionId);
        Type localVarReturnType = new TypeToken<SmartTransactionsProductModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Cancel cash transaction (asynchronously)
     * Cancels the terminal-induced &#x60;\&quot;cash\&quot;&#x60; transaction with the given receipt number.
     * @param smartTransactionId Receipt number (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call cancelTrxAsync(String smartTransactionId, final ApiCallback<SmartTransactionsProductModel> callback) throws ApiException {
        Call call = cancelTrxValidateBeforeCall(smartTransactionId);
        Type localVarReturnType = new TypeToken<SmartTransactionsProductModel>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for diagnose
     * @param smartDeviceId Smart Device ID (required)
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public Call diagnoseCall(String smartDeviceId) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/Smart/Transactions/{smartDeviceId}/diagnosis"
            .replaceAll("\\{" + "smartDeviceId" + "\\}", apiClient.escapeString(smartDeviceId.toString()));

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
    private Call diagnoseValidateBeforeCall(String smartDeviceId) throws ApiException {
        // verify the required parameter 'smartDeviceId' is set
        if (smartDeviceId == null) {
            throw new ApiException("Missing the required parameter 'smartDeviceId' when calling diagnose(Async)");
        }

        return diagnoseCall(smartDeviceId);
    }

    /**
     * Terminal diagnosis
     * Runs the diagnosis process on the POS payment terminal (PT). This operation is usually called by SDKs from the electronic cash register (ECR).  This request is blocking. Secuconnect API only answers after the payment terminal has finished the end-of-day report.
     * @param smartDeviceId Smart Device ID (required)
     * @return SmartTransactionsProductModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SmartTransactionsProductModel diagnose(String smartDeviceId) throws ApiException {
        ApiResponse<SmartTransactionsProductModel> resp = diagnoseWithHttpInfo(smartDeviceId);
        return resp.getData();
    }

    /**
     * Terminal diagnosis
     * Runs the diagnosis process on the POS payment terminal (PT). This operation is usually called by SDKs from the electronic cash register (ECR).  This request is blocking. Secuconnect API only answers after the payment terminal has finished the end-of-day report.
     * @param smartDeviceId Smart Device ID (required)
     * @return ApiResponse&lt;SmartTransactionsProductModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SmartTransactionsProductModel> diagnoseWithHttpInfo(String smartDeviceId) throws ApiException {
        Call call = diagnoseValidateBeforeCall(smartDeviceId);
        Type localVarReturnType = new TypeToken<SmartTransactionsProductModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Terminal diagnosis (asynchronously)
     * Runs the diagnosis process on the POS payment terminal (PT). This operation is usually called by SDKs from the electronic cash register (ECR).  This request is blocking. Secuconnect API only answers after the payment terminal has finished the end-of-day report.
     * @param smartDeviceId Smart Device ID (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call diagnoseAsync(String smartDeviceId, final ApiCallback<SmartTransactionsProductModel> callback) throws ApiException {
        Call call = diagnoseValidateBeforeCall(smartDeviceId);
        Type localVarReturnType = new TypeToken<SmartTransactionsProductModel>(){}.getType();
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
     * @param expand Expand fields (all or a specific one)
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public Call getAllCall(Integer count, Integer offset, String fields, String q, String sort, String expand) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/Smart/Transactions";

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
        if (expand != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("expand", expand));

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
    private Call getAllValidateBeforeCall(Integer count, Integer offset, String fields, String q, String sort, String expand) throws ApiException {

        return getAllCall(count, offset, fields, q, sort, expand);
    }

    /**
     * Find Smart Transactions
     * Returns the Smart Transactions matching the given criteria.
     * @param count The maximum number of items to return
     * @param offset The position within the whole result set to start returning items (zero-based)
     * @param fields List of fields to include in the result, all others will be filtered out. Nested properties can be accessed with this notation: &#x60;prop1.prop2&#x60;.
     * @param q A query string to restrict the returned items to given conditions. The query string must consist of any combination of single expressions in the form &#x60;property:condition&#x60;. Property names can be nested like &#x60;property.property&#x60;.  Example: &#x60;customer.name:Meier&#x60;  A condition may contain:  * &#x60;?&#x60; as wildcard for one character;  * &#x60;*&#x60; as wildcard for any number of characters.  You can also use value ranges in the form &#x60;[min TO max]&#x60;.  Example: &#x60;customer.age:[30 TO 40]&#x60;  You can combine expressions logically by &#x60;expr AND expr&#x60; and &#x60;{expr} OR {expr}&#x60;. You can also negate an expression using &#x60;NOT {expr}&#x60;. Parenthesis &#x60;(...)&#x60; can be used to control precedence.  Example: &#x60;(NOT customer.name:meier*) AND (customer.age:[30 TO 40] OR customer.age:[50 TO 60])&#x60;
     * @param sort String with comma separated pairs of &#x60;field:order&#x60;.  Options for order:  * &#x60;asc&#x60; ascending;  * &#x60;desc&#x60; descending.
     * @param expand Expand fields (all or a specific one)
     * @return SmartTransactionsList
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SmartTransactionsList getAll(Integer count, Integer offset, String fields, String q, String sort, String expand) throws ApiException {
        ApiResponse<SmartTransactionsList> resp = getAllWithHttpInfo(count, offset, fields, q, sort, expand);
        return resp.getData();
    }

    /**
     * Find Smart Transactions
     * Returns the Smart Transactions matching the given criteria.
     * @param count The maximum number of items to return
     * @param offset The position within the whole result set to start returning items (zero-based)
     * @param fields List of fields to include in the result, all others will be filtered out. Nested properties can be accessed with this notation: &#x60;prop1.prop2&#x60;.
     * @param q A query string to restrict the returned items to given conditions. The query string must consist of any combination of single expressions in the form &#x60;property:condition&#x60;. Property names can be nested like &#x60;property.property&#x60;.  Example: &#x60;customer.name:Meier&#x60;  A condition may contain:  * &#x60;?&#x60; as wildcard for one character;  * &#x60;*&#x60; as wildcard for any number of characters.  You can also use value ranges in the form &#x60;[min TO max]&#x60;.  Example: &#x60;customer.age:[30 TO 40]&#x60;  You can combine expressions logically by &#x60;expr AND expr&#x60; and &#x60;{expr} OR {expr}&#x60;. You can also negate an expression using &#x60;NOT {expr}&#x60;. Parenthesis &#x60;(...)&#x60; can be used to control precedence.  Example: &#x60;(NOT customer.name:meier*) AND (customer.age:[30 TO 40] OR customer.age:[50 TO 60])&#x60;
     * @param sort String with comma separated pairs of &#x60;field:order&#x60;.  Options for order:  * &#x60;asc&#x60; ascending;  * &#x60;desc&#x60; descending.
     * @param expand Expand fields (all or a specific one)
     * @return ApiResponse&lt;SmartTransactionsList&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SmartTransactionsList> getAllWithHttpInfo(Integer count, Integer offset, String fields, String q, String sort, String expand) throws ApiException {
        Call call = getAllValidateBeforeCall(count, offset, fields, q, sort, expand);
        Type localVarReturnType = new TypeToken<SmartTransactionsList>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Find Smart Transactions (asynchronously)
     * Returns the Smart Transactions matching the given criteria.
     * @param count The maximum number of items to return
     * @param offset The position within the whole result set to start returning items (zero-based)
     * @param fields List of fields to include in the result, all others will be filtered out. Nested properties can be accessed with this notation: &#x60;prop1.prop2&#x60;.
     * @param q A query string to restrict the returned items to given conditions. The query string must consist of any combination of single expressions in the form &#x60;property:condition&#x60;. Property names can be nested like &#x60;property.property&#x60;.  Example: &#x60;customer.name:Meier&#x60;  A condition may contain:  * &#x60;?&#x60; as wildcard for one character;  * &#x60;*&#x60; as wildcard for any number of characters.  You can also use value ranges in the form &#x60;[min TO max]&#x60;.  Example: &#x60;customer.age:[30 TO 40]&#x60;  You can combine expressions logically by &#x60;expr AND expr&#x60; and &#x60;{expr} OR {expr}&#x60;. You can also negate an expression using &#x60;NOT {expr}&#x60;. Parenthesis &#x60;(...)&#x60; can be used to control precedence.  Example: &#x60;(NOT customer.name:meier*) AND (customer.age:[30 TO 40] OR customer.age:[50 TO 60])&#x60;
     * @param sort String with comma separated pairs of &#x60;field:order&#x60;.  Options for order:  * &#x60;asc&#x60; ascending;  * &#x60;desc&#x60; descending.
     * @param expand Expand fields (all or a specific one)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call getAllAsync(Integer count, Integer offset, String fields, String q, String sort, String expand, final ApiCallback<SmartTransactionsList> callback) throws ApiException {
        Call call = getAllValidateBeforeCall(count, offset, fields, q, sort, expand);
        Type localVarReturnType = new TypeToken<SmartTransactionsList>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for getOne
     * @param smartTransactionId Smart Transaction ID (required)
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public Call getOneCall(String smartTransactionId) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/Smart/Transactions/{smartTransactionId}"
            .replaceAll("\\{" + "smartTransactionId" + "\\}", apiClient.escapeString(smartTransactionId.toString()));

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
    private Call getOneValidateBeforeCall(String smartTransactionId) throws ApiException {
        // verify the required parameter 'smartTransactionId' is set
        if (smartTransactionId == null) {
            throw new ApiException("Missing the required parameter 'smartTransactionId' when calling getOne(Async)");
        }

        return getOneCall(smartTransactionId);
    }

    /**
     * Read Smart Transaction
     * Returns the specified Smart Transaction.
     * @param smartTransactionId Smart Transaction ID (required)
     * @return SmartTransactionsProductModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SmartTransactionsProductModel getOne(String smartTransactionId) throws ApiException {
        ApiResponse<SmartTransactionsProductModel> resp = getOneWithHttpInfo(smartTransactionId);
        return resp.getData();
    }

    /**
     * Read Smart Transaction
     * Returns the specified Smart Transaction.
     * @param smartTransactionId Smart Transaction ID (required)
     * @return ApiResponse&lt;SmartTransactionsProductModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SmartTransactionsProductModel> getOneWithHttpInfo(String smartTransactionId) throws ApiException {
        Call call = getOneValidateBeforeCall(smartTransactionId);
        Type localVarReturnType = new TypeToken<SmartTransactionsProductModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Read Smart Transaction (asynchronously)
     * Returns the specified Smart Transaction.
     * @param smartTransactionId Smart Transaction ID (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call getOneAsync(String smartTransactionId, final ApiCallback<SmartTransactionsProductModel> callback) throws ApiException {
        Call call = getOneValidateBeforeCall(smartTransactionId);
        Type localVarReturnType = new TypeToken<SmartTransactionsProductModel>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for preTransaction
     * @param smartTransactionId Smart Transaction ID (required)
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public Call preTransactionCall(String smartTransactionId) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/Smart/Transactions/{smartTransactionId}/preTransaction"
            .replaceAll("\\{" + "smartTransactionId" + "\\}", apiClient.escapeString(smartTransactionId.toString()));

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
    private Call preTransactionValidateBeforeCall(String smartTransactionId) throws ApiException {
        // verify the required parameter 'smartTransactionId' is set
        if (smartTransactionId == null) {
            throw new ApiException("Missing the required parameter 'smartTransactionId' when calling preTransaction(Async)");
        }

        return preTransactionCall(smartTransactionId);
    }

    /**
     * Apply secucard (“pre-transaction”)
     * Checks the balance of the secucard Merchant Card in &#x60;ident&#x60;. If there is cash or bonus balance that can be applied, it adds bonus items to the basket and sets &#x60;missing_sum&#x60; inside &#x60;basket_info&#x60;.  _Note: In contrast to other operations it doesn&#x27;t return the full object._  In order to pay, you need to call one of the endpoints:  - &#x60;/start/loyalty&#x60; if there is no missing sum; - &#x60;/start/cash&#x60; if the remainder is paid at the cash register (ECR) without our terminals; - &#x60;/start/cashless&#x60; if the remainder is paid at the ECR with one of our terminals; - &#x60;/prepare/debit&#x60; and &#x60;/start&#x60; if the remainder is paid with SEPA direct debit; - &#x60;/prepare/creditcard&#x60; and &#x60;/start&#x60; if the remainder is paid with credit card.
     * @param smartTransactionId Smart Transaction ID (required)
     * @return SmartTransactionsPreTransactionModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SmartTransactionsPreTransactionModel preTransaction(String smartTransactionId) throws ApiException {
        ApiResponse<SmartTransactionsPreTransactionModel> resp = preTransactionWithHttpInfo(smartTransactionId);
        return resp.getData();
    }

    /**
     * Apply secucard (“pre-transaction”)
     * Checks the balance of the secucard Merchant Card in &#x60;ident&#x60;. If there is cash or bonus balance that can be applied, it adds bonus items to the basket and sets &#x60;missing_sum&#x60; inside &#x60;basket_info&#x60;.  _Note: In contrast to other operations it doesn&#x27;t return the full object._  In order to pay, you need to call one of the endpoints:  - &#x60;/start/loyalty&#x60; if there is no missing sum; - &#x60;/start/cash&#x60; if the remainder is paid at the cash register (ECR) without our terminals; - &#x60;/start/cashless&#x60; if the remainder is paid at the ECR with one of our terminals; - &#x60;/prepare/debit&#x60; and &#x60;/start&#x60; if the remainder is paid with SEPA direct debit; - &#x60;/prepare/creditcard&#x60; and &#x60;/start&#x60; if the remainder is paid with credit card.
     * @param smartTransactionId Smart Transaction ID (required)
     * @return ApiResponse&lt;SmartTransactionsPreTransactionModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SmartTransactionsPreTransactionModel> preTransactionWithHttpInfo(String smartTransactionId) throws ApiException {
        Call call = preTransactionValidateBeforeCall(smartTransactionId);
        Type localVarReturnType = new TypeToken<SmartTransactionsPreTransactionModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Apply secucard (“pre-transaction”) (asynchronously)
     * Checks the balance of the secucard Merchant Card in &#x60;ident&#x60;. If there is cash or bonus balance that can be applied, it adds bonus items to the basket and sets &#x60;missing_sum&#x60; inside &#x60;basket_info&#x60;.  _Note: In contrast to other operations it doesn&#x27;t return the full object._  In order to pay, you need to call one of the endpoints:  - &#x60;/start/loyalty&#x60; if there is no missing sum; - &#x60;/start/cash&#x60; if the remainder is paid at the cash register (ECR) without our terminals; - &#x60;/start/cashless&#x60; if the remainder is paid at the ECR with one of our terminals; - &#x60;/prepare/debit&#x60; and &#x60;/start&#x60; if the remainder is paid with SEPA direct debit; - &#x60;/prepare/creditcard&#x60; and &#x60;/start&#x60; if the remainder is paid with credit card.
     * @param smartTransactionId Smart Transaction ID (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call preTransactionAsync(String smartTransactionId, final ApiCallback<SmartTransactionsPreTransactionModel> callback) throws ApiException {
        Call call = preTransactionValidateBeforeCall(smartTransactionId);
        Type localVarReturnType = new TypeToken<SmartTransactionsPreTransactionModel>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for prepare
     * @param smartTransactionId Smart Transaction ID (required)
     * @param paymentMethod Payment method:  - &#x60;\&quot;creditcard\&quot;&#x60; (also for Google Pay and Apple Pay) - &#x60;\&quot;debit\&quot;&#x60; - &#x60;\&quot;eps\&quot;&#x60; (deprecated) - &#x60;\&quot;easycredit\&quot;&#x60; - &#x60;\&quot;giropay\&quot;&#x60; (deprecated) - &#x60;\&quot;invoice\&quot;&#x60; - &#x60;\&quot;paypal\&quot;&#x60; - &#x60;\&quot;prepaid\&quot;&#x60; - &#x60;\&quot;sofort\&quot;&#x60; (deprecated) (required)
     * @param body Optional customer and/or payment details
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public Call prepareCall(String smartTransactionId, String paymentMethod, SmartTransactionsPrepare body) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/Smart/Transactions/{smartTransactionId}/prepare/{paymentMethod}"
            .replaceAll("\\{" + "smartTransactionId" + "\\}", apiClient.escapeString(smartTransactionId.toString()))
            .replaceAll("\\{" + "paymentMethod" + "\\}", apiClient.escapeString(paymentMethod.toString()));

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
    private Call prepareValidateBeforeCall(String smartTransactionId, String paymentMethod, SmartTransactionsPrepare body) throws ApiException {
        // verify the required parameter 'smartTransactionId' is set
        if (smartTransactionId == null) {
            throw new ApiException("Missing the required parameter 'smartTransactionId' when calling prepare(Async)");
        }
        // verify the required parameter 'paymentMethod' is set
        if (paymentMethod == null) {
            throw new ApiException("Missing the required parameter 'paymentMethod' when calling prepare(Async)");
        }

        return prepareCall(smartTransactionId, paymentMethod, body);
    }

    /**
     * Authorize payment (”prepare”)
     * Create the Payment Transaction and links it to the Smart Transaction. If required, a scoring is performed. When &#x60;auto_capture&#x60; is set on &#x60;true&#x60; it will also start the Smart Transaction and execute the payment.  You can pass the payment data or the ID of an existing Payment Container. Likewise, you can also pass the customer details or the ID of an existing Payment Customer. If not passed, it is expected these details have been set before.
     * @param smartTransactionId Smart Transaction ID (required)
     * @param paymentMethod Payment method:  - &#x60;\&quot;creditcard\&quot;&#x60; (also for Google Pay and Apple Pay) - &#x60;\&quot;debit\&quot;&#x60; - &#x60;\&quot;eps\&quot;&#x60; (deprecated) - &#x60;\&quot;easycredit\&quot;&#x60; - &#x60;\&quot;giropay\&quot;&#x60; (deprecated) - &#x60;\&quot;invoice\&quot;&#x60; - &#x60;\&quot;paypal\&quot;&#x60; - &#x60;\&quot;prepaid\&quot;&#x60; - &#x60;\&quot;sofort\&quot;&#x60; (deprecated) (required)
     * @param body Optional customer and/or payment details
     * @return SmartTransactionsProductModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SmartTransactionsProductModel prepare(String smartTransactionId, String paymentMethod, SmartTransactionsPrepare body) throws ApiException {
        ApiResponse<SmartTransactionsProductModel> resp = prepareWithHttpInfo(smartTransactionId, paymentMethod, body);
        return resp.getData();
    }

    /**
     * Authorize payment (”prepare”)
     * Create the Payment Transaction and links it to the Smart Transaction. If required, a scoring is performed. When &#x60;auto_capture&#x60; is set on &#x60;true&#x60; it will also start the Smart Transaction and execute the payment.  You can pass the payment data or the ID of an existing Payment Container. Likewise, you can also pass the customer details or the ID of an existing Payment Customer. If not passed, it is expected these details have been set before.
     * @param smartTransactionId Smart Transaction ID (required)
     * @param paymentMethod Payment method:  - &#x60;\&quot;creditcard\&quot;&#x60; (also for Google Pay and Apple Pay) - &#x60;\&quot;debit\&quot;&#x60; - &#x60;\&quot;eps\&quot;&#x60; (deprecated) - &#x60;\&quot;easycredit\&quot;&#x60; - &#x60;\&quot;giropay\&quot;&#x60; (deprecated) - &#x60;\&quot;invoice\&quot;&#x60; - &#x60;\&quot;paypal\&quot;&#x60; - &#x60;\&quot;prepaid\&quot;&#x60; - &#x60;\&quot;sofort\&quot;&#x60; (deprecated) (required)
     * @param body Optional customer and/or payment details
     * @return ApiResponse&lt;SmartTransactionsProductModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SmartTransactionsProductModel> prepareWithHttpInfo(String smartTransactionId, String paymentMethod, SmartTransactionsPrepare body) throws ApiException {
        Call call = prepareValidateBeforeCall(smartTransactionId, paymentMethod, body);
        Type localVarReturnType = new TypeToken<SmartTransactionsProductModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Authorize payment (”prepare”) (asynchronously)
     * Create the Payment Transaction and links it to the Smart Transaction. If required, a scoring is performed. When &#x60;auto_capture&#x60; is set on &#x60;true&#x60; it will also start the Smart Transaction and execute the payment.  You can pass the payment data or the ID of an existing Payment Container. Likewise, you can also pass the customer details or the ID of an existing Payment Customer. If not passed, it is expected these details have been set before.
     * @param smartTransactionId Smart Transaction ID (required)
     * @param paymentMethod Payment method:  - &#x60;\&quot;creditcard\&quot;&#x60; (also for Google Pay and Apple Pay) - &#x60;\&quot;debit\&quot;&#x60; - &#x60;\&quot;eps\&quot;&#x60; (deprecated) - &#x60;\&quot;easycredit\&quot;&#x60; - &#x60;\&quot;giropay\&quot;&#x60; (deprecated) - &#x60;\&quot;invoice\&quot;&#x60; - &#x60;\&quot;paypal\&quot;&#x60; - &#x60;\&quot;prepaid\&quot;&#x60; - &#x60;\&quot;sofort\&quot;&#x60; (deprecated) (required)
     * @param body Optional customer and/or payment details
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call prepareAsync(String smartTransactionId, String paymentMethod, SmartTransactionsPrepare body, final ApiCallback<SmartTransactionsProductModel> callback) throws ApiException {
        Call call = prepareValidateBeforeCall(smartTransactionId, paymentMethod, body);
        Type localVarReturnType = new TypeToken<SmartTransactionsProductModel>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for setDelivery
     * @param smartTransactionId Smart Transaction ID (required)
     * @param body Shipping information
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public Call setDeliveryCall(String smartTransactionId, SmartTransactionsSetDeliveryModel body) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/Smart/Transactions/{smartTransactionId}/setDelivery"
            .replaceAll("\\{" + "smartTransactionId" + "\\}", apiClient.escapeString(smartTransactionId.toString()));

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
    private Call setDeliveryValidateBeforeCall(String smartTransactionId, SmartTransactionsSetDeliveryModel body) throws ApiException {
        // verify the required parameter 'smartTransactionId' is set
        if (smartTransactionId == null) {
            throw new ApiException("Missing the required parameter 'smartTransactionId' when calling setDelivery(Async)");
        }

        return setDeliveryCall(smartTransactionId, body);
    }

    /**
     * Set delivery
     * Adds shipping information, and marks the Payment Transaction as shipped when called the first time.  **Note: This is obligatory for purchase on account, because otherwise it is not known that and when the invoice is due.**
     * @param smartTransactionId Smart Transaction ID (required)
     * @param body Shipping information
     * @return SmartTransactionsProductModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SmartTransactionsProductModel setDelivery(String smartTransactionId, SmartTransactionsSetDeliveryModel body) throws ApiException {
        ApiResponse<SmartTransactionsProductModel> resp = setDeliveryWithHttpInfo(smartTransactionId, body);
        return resp.getData();
    }

    /**
     * Set delivery
     * Adds shipping information, and marks the Payment Transaction as shipped when called the first time.  **Note: This is obligatory for purchase on account, because otherwise it is not known that and when the invoice is due.**
     * @param smartTransactionId Smart Transaction ID (required)
     * @param body Shipping information
     * @return ApiResponse&lt;SmartTransactionsProductModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SmartTransactionsProductModel> setDeliveryWithHttpInfo(String smartTransactionId, SmartTransactionsSetDeliveryModel body) throws ApiException {
        Call call = setDeliveryValidateBeforeCall(smartTransactionId, body);
        Type localVarReturnType = new TypeToken<SmartTransactionsProductModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Set delivery (asynchronously)
     * Adds shipping information, and marks the Payment Transaction as shipped when called the first time.  **Note: This is obligatory for purchase on account, because otherwise it is not known that and when the invoice is due.**
     * @param smartTransactionId Smart Transaction ID (required)
     * @param body Shipping information
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call setDeliveryAsync(String smartTransactionId, SmartTransactionsSetDeliveryModel body, final ApiCallback<SmartTransactionsProductModel> callback) throws ApiException {
        Call call = setDeliveryValidateBeforeCall(smartTransactionId, body);
        Type localVarReturnType = new TypeToken<SmartTransactionsProductModel>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for startEndOfDayReport
     * @param smartDeviceId Smart Device ID (required)
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public Call startEndOfDayReportCall(String smartDeviceId) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/Smart/Transactions/{smartDeviceId}/endOfDay"
            .replaceAll("\\{" + "smartDeviceId" + "\\}", apiClient.escapeString(smartDeviceId.toString()));

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
    private Call startEndOfDayReportValidateBeforeCall(String smartDeviceId) throws ApiException {
        // verify the required parameter 'smartDeviceId' is set
        if (smartDeviceId == null) {
            throw new ApiException("Missing the required parameter 'smartDeviceId' when calling startEndOfDayReport(Async)");
        }

        return startEndOfDayReportCall(smartDeviceId);
    }

    /**
     * Terminal end-of-day report
     * Runs the end of day report on the POS payment terminal. This operation is usually called by SDKs from the electronic cash register (ECR).  This request is blocking. Secuconnect API only answers after the payment terminal has finished the end-of-day report.
     * @param smartDeviceId Smart Device ID (required)
     * @return SmartTransactionsProductModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SmartTransactionsProductModel startEndOfDayReport(String smartDeviceId) throws ApiException {
        ApiResponse<SmartTransactionsProductModel> resp = startEndOfDayReportWithHttpInfo(smartDeviceId);
        return resp.getData();
    }

    /**
     * Terminal end-of-day report
     * Runs the end of day report on the POS payment terminal. This operation is usually called by SDKs from the electronic cash register (ECR).  This request is blocking. Secuconnect API only answers after the payment terminal has finished the end-of-day report.
     * @param smartDeviceId Smart Device ID (required)
     * @return ApiResponse&lt;SmartTransactionsProductModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SmartTransactionsProductModel> startEndOfDayReportWithHttpInfo(String smartDeviceId) throws ApiException {
        Call call = startEndOfDayReportValidateBeforeCall(smartDeviceId);
        Type localVarReturnType = new TypeToken<SmartTransactionsProductModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Terminal end-of-day report (asynchronously)
     * Runs the end of day report on the POS payment terminal. This operation is usually called by SDKs from the electronic cash register (ECR).  This request is blocking. Secuconnect API only answers after the payment terminal has finished the end-of-day report.
     * @param smartDeviceId Smart Device ID (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call startEndOfDayReportAsync(String smartDeviceId, final ApiCallback<SmartTransactionsProductModel> callback) throws ApiException {
        Call call = startEndOfDayReportValidateBeforeCall(smartDeviceId);
        Type localVarReturnType = new TypeToken<SmartTransactionsProductModel>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for startTransaction
     * @param smartTransactionId Smart Transaction ID (required)
     * @param paymentMethod Payment method, if not in succession to &#x60;/prepare&#x60;:  - &#x60;\&quot;cash\&quot;&#x60; - &#x60;\&quot;cashless\&quot;&#x60; - &#x60;\&quot;debit\&quot;&#x60; - &#x60;\&quot;invoice\&quot;&#x60; - &#x60;\&quot;loyalty\&quot;&#x60; - &#x60;\&quot;prepaid\&quot;&#x60; - &#x60;\&quot;cashless_direct\&quot;&#x60; - &#x60;\&quot;ccload\&quot;&#x60; (required)
     * @param body Optional customer and/or payment details
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public Call startTransactionCall(String smartTransactionId, String paymentMethod, SmartTransactionsStart body) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/Smart/Transactions/{smartTransactionId}/start/{paymentMethod}"
            .replaceAll("\\{" + "smartTransactionId" + "\\}", apiClient.escapeString(smartTransactionId.toString()))
            .replaceAll("\\{" + "paymentMethod" + "\\}", apiClient.escapeString(paymentMethod.toString()));

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
    private Call startTransactionValidateBeforeCall(String smartTransactionId, String paymentMethod, SmartTransactionsStart body) throws ApiException {
        // verify the required parameter 'smartTransactionId' is set
        if (smartTransactionId == null) {
            throw new ApiException("Missing the required parameter 'smartTransactionId' when calling startTransaction(Async)");
        }
        // verify the required parameter 'paymentMethod' is set
        if (paymentMethod == null) {
            throw new ApiException("Missing the required parameter 'paymentMethod' when calling startTransaction(Async)");
        }

        return startTransactionCall(smartTransactionId, paymentMethod, body);
    }

    /**
     * Capture payment (“start”)
     * Starts the Smart Transaction and captures the payment.  You can either pass the payment method and start it directly, or you can authorize it before with a call to &#x60;POST /Smart/Transactions/{id}/prepare/{method}&#x60;. You _must_ call &#x60;/prepare&#x60;, if an external authorization might be needed (credit card 3-D Secure, PayPal, Sofort, etc.).  You can save the call to &#x60;/start&#x60; when you use &#x60;/prepare&#x60; in combination with &#x60;auto_capture&#x60;. This will automatically start the Smart Transaction after the payment has been authorised.  In case of direct debit, you can either pass the payment data or the ID of an existing Payment Container.  Likewise you can pass the customer details or the ID of an existing Payment Customer. If not passed, it expects these details to be set before.  If started with method &#x60;\&quot;cash\&quot;&#x60;, it only tracks the ECR payment so that loyalty operations can be applied.  Type &#x60;\&quot;cashless\&quot;&#x60; is blocking, and starts a card payment at the payment terminal attached with SmartZVT.
     * @param smartTransactionId Smart Transaction ID (required)
     * @param paymentMethod Payment method, if not in succession to &#x60;/prepare&#x60;:  - &#x60;\&quot;cash\&quot;&#x60; - &#x60;\&quot;cashless\&quot;&#x60; - &#x60;\&quot;debit\&quot;&#x60; - &#x60;\&quot;invoice\&quot;&#x60; - &#x60;\&quot;loyalty\&quot;&#x60; - &#x60;\&quot;prepaid\&quot;&#x60; - &#x60;\&quot;cashless_direct\&quot;&#x60; - &#x60;\&quot;ccload\&quot;&#x60; (required)
     * @param body Optional customer and/or payment details
     * @return SmartTransactionsProductModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SmartTransactionsProductModel startTransaction(String smartTransactionId, String paymentMethod, SmartTransactionsStart body) throws ApiException {
        ApiResponse<SmartTransactionsProductModel> resp = startTransactionWithHttpInfo(smartTransactionId, paymentMethod, body);
        return resp.getData();
    }

    /**
     * Capture payment (“start”)
     * Starts the Smart Transaction and captures the payment.  You can either pass the payment method and start it directly, or you can authorize it before with a call to &#x60;POST /Smart/Transactions/{id}/prepare/{method}&#x60;. You _must_ call &#x60;/prepare&#x60;, if an external authorization might be needed (credit card 3-D Secure, PayPal, Sofort, etc.).  You can save the call to &#x60;/start&#x60; when you use &#x60;/prepare&#x60; in combination with &#x60;auto_capture&#x60;. This will automatically start the Smart Transaction after the payment has been authorised.  In case of direct debit, you can either pass the payment data or the ID of an existing Payment Container.  Likewise you can pass the customer details or the ID of an existing Payment Customer. If not passed, it expects these details to be set before.  If started with method &#x60;\&quot;cash\&quot;&#x60;, it only tracks the ECR payment so that loyalty operations can be applied.  Type &#x60;\&quot;cashless\&quot;&#x60; is blocking, and starts a card payment at the payment terminal attached with SmartZVT.
     * @param smartTransactionId Smart Transaction ID (required)
     * @param paymentMethod Payment method, if not in succession to &#x60;/prepare&#x60;:  - &#x60;\&quot;cash\&quot;&#x60; - &#x60;\&quot;cashless\&quot;&#x60; - &#x60;\&quot;debit\&quot;&#x60; - &#x60;\&quot;invoice\&quot;&#x60; - &#x60;\&quot;loyalty\&quot;&#x60; - &#x60;\&quot;prepaid\&quot;&#x60; - &#x60;\&quot;cashless_direct\&quot;&#x60; - &#x60;\&quot;ccload\&quot;&#x60; (required)
     * @param body Optional customer and/or payment details
     * @return ApiResponse&lt;SmartTransactionsProductModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SmartTransactionsProductModel> startTransactionWithHttpInfo(String smartTransactionId, String paymentMethod, SmartTransactionsStart body) throws ApiException {
        Call call = startTransactionValidateBeforeCall(smartTransactionId, paymentMethod, body);
        Type localVarReturnType = new TypeToken<SmartTransactionsProductModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Capture payment (“start”) (asynchronously)
     * Starts the Smart Transaction and captures the payment.  You can either pass the payment method and start it directly, or you can authorize it before with a call to &#x60;POST /Smart/Transactions/{id}/prepare/{method}&#x60;. You _must_ call &#x60;/prepare&#x60;, if an external authorization might be needed (credit card 3-D Secure, PayPal, Sofort, etc.).  You can save the call to &#x60;/start&#x60; when you use &#x60;/prepare&#x60; in combination with &#x60;auto_capture&#x60;. This will automatically start the Smart Transaction after the payment has been authorised.  In case of direct debit, you can either pass the payment data or the ID of an existing Payment Container.  Likewise you can pass the customer details or the ID of an existing Payment Customer. If not passed, it expects these details to be set before.  If started with method &#x60;\&quot;cash\&quot;&#x60;, it only tracks the ECR payment so that loyalty operations can be applied.  Type &#x60;\&quot;cashless\&quot;&#x60; is blocking, and starts a card payment at the payment terminal attached with SmartZVT.
     * @param smartTransactionId Smart Transaction ID (required)
     * @param paymentMethod Payment method, if not in succession to &#x60;/prepare&#x60;:  - &#x60;\&quot;cash\&quot;&#x60; - &#x60;\&quot;cashless\&quot;&#x60; - &#x60;\&quot;debit\&quot;&#x60; - &#x60;\&quot;invoice\&quot;&#x60; - &#x60;\&quot;loyalty\&quot;&#x60; - &#x60;\&quot;prepaid\&quot;&#x60; - &#x60;\&quot;cashless_direct\&quot;&#x60; - &#x60;\&quot;ccload\&quot;&#x60; (required)
     * @param body Optional customer and/or payment details
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call startTransactionAsync(String smartTransactionId, String paymentMethod, SmartTransactionsStart body, final ApiCallback<SmartTransactionsProductModel> callback) throws ApiException {
        Call call = startTransactionValidateBeforeCall(smartTransactionId, paymentMethod, body);
        Type localVarReturnType = new TypeToken<SmartTransactionsProductModel>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for updatePaymentContainer
     * @param subscriptionId Subscription ID (required)
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public Call updatePaymentContainerCall(String subscriptionId) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/Smart/Transactions/{subscriptionId}/updatePaymentContainer"
            .replaceAll("\\{" + "subscriptionId" + "\\}", apiClient.escapeString(subscriptionId.toString()));

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
    private Call updatePaymentContainerValidateBeforeCall(String subscriptionId) throws ApiException {
        // verify the required parameter 'subscriptionId' is set
        if (subscriptionId == null) {
            throw new ApiException("Missing the required parameter 'subscriptionId' when calling updatePaymentContainer(Async)");
        }

        return updatePaymentContainerCall(subscriptionId);
    }

    /**
     * Update payment container for subscription
     * Requests new authorization for a subscription.  The Payment Container for a subscription may have become unusable. For instance may the customer have returned their card or changed their bank account.  The returned Smart Transaction is to be used like after a call to &#x60;/prepare&#x60;. There are URLs inside &#x60;payment_links&#x60; to authorize for credit card, SEPA direct debit or with PayPal.
     * @param subscriptionId Subscription ID (required)
     * @return SmartTransactionsProductModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SmartTransactionsProductModel updatePaymentContainer(String subscriptionId) throws ApiException {
        ApiResponse<SmartTransactionsProductModel> resp = updatePaymentContainerWithHttpInfo(subscriptionId);
        return resp.getData();
    }

    /**
     * Update payment container for subscription
     * Requests new authorization for a subscription.  The Payment Container for a subscription may have become unusable. For instance may the customer have returned their card or changed their bank account.  The returned Smart Transaction is to be used like after a call to &#x60;/prepare&#x60;. There are URLs inside &#x60;payment_links&#x60; to authorize for credit card, SEPA direct debit or with PayPal.
     * @param subscriptionId Subscription ID (required)
     * @return ApiResponse&lt;SmartTransactionsProductModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SmartTransactionsProductModel> updatePaymentContainerWithHttpInfo(String subscriptionId) throws ApiException {
        Call call = updatePaymentContainerValidateBeforeCall(subscriptionId);
        Type localVarReturnType = new TypeToken<SmartTransactionsProductModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Update payment container for subscription (asynchronously)
     * Requests new authorization for a subscription.  The Payment Container for a subscription may have become unusable. For instance may the customer have returned their card or changed their bank account.  The returned Smart Transaction is to be used like after a call to &#x60;/prepare&#x60;. There are URLs inside &#x60;payment_links&#x60; to authorize for credit card, SEPA direct debit or with PayPal.
     * @param subscriptionId Subscription ID (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call updatePaymentContainerAsync(String subscriptionId, final ApiCallback<SmartTransactionsProductModel> callback) throws ApiException {
        Call call = updatePaymentContainerValidateBeforeCall(subscriptionId);
        Type localVarReturnType = new TypeToken<SmartTransactionsProductModel>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for updateTransaction
     * @param smartTransactionId Smart Transaction ID (required)
     * @param body Transaction details
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public Call updateTransactionCall(String smartTransactionId, SmartTransactionsDTO body) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/Smart/Transactions/{smartTransactionId}"
            .replaceAll("\\{" + "smartTransactionId" + "\\}", apiClient.escapeString(smartTransactionId.toString()));

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
    private Call updateTransactionValidateBeforeCall(String smartTransactionId, SmartTransactionsDTO body) throws ApiException {
        // verify the required parameter 'smartTransactionId' is set
        if (smartTransactionId == null) {
            throw new ApiException("Missing the required parameter 'smartTransactionId' when calling updateTransaction(Async)");
        }

        return updateTransactionCall(smartTransactionId, body);
    }

    /**
     * Update Smart Transaction
     * Updates the specified Smart Transaction with the given data. It can only be updated before the payment is executed with &#x60;POST /Smart/Transactions/{id}/start[/{method}]&#x60;, or with &#x60;POST /Smart/Transactions/{id}/prepare/{method}&#x60; in combination with &#x60;auto_capture&#x60;.  You must always pass &#x60;basket&#x60; and &#x60;basket_info&#x60;. Otherwise &#x60;basket&#x60; is removed, and basket info is set to the defaults.  Some data can not be changed after creation, f. e. &#x60;application_context&#x60;.
     * @param smartTransactionId Smart Transaction ID (required)
     * @param body Transaction details
     * @return SmartTransactionsProductModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SmartTransactionsProductModel updateTransaction(String smartTransactionId, SmartTransactionsDTO body) throws ApiException {
        ApiResponse<SmartTransactionsProductModel> resp = updateTransactionWithHttpInfo(smartTransactionId, body);
        return resp.getData();
    }

    /**
     * Update Smart Transaction
     * Updates the specified Smart Transaction with the given data. It can only be updated before the payment is executed with &#x60;POST /Smart/Transactions/{id}/start[/{method}]&#x60;, or with &#x60;POST /Smart/Transactions/{id}/prepare/{method}&#x60; in combination with &#x60;auto_capture&#x60;.  You must always pass &#x60;basket&#x60; and &#x60;basket_info&#x60;. Otherwise &#x60;basket&#x60; is removed, and basket info is set to the defaults.  Some data can not be changed after creation, f. e. &#x60;application_context&#x60;.
     * @param smartTransactionId Smart Transaction ID (required)
     * @param body Transaction details
     * @return ApiResponse&lt;SmartTransactionsProductModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SmartTransactionsProductModel> updateTransactionWithHttpInfo(String smartTransactionId, SmartTransactionsDTO body) throws ApiException {
        Call call = updateTransactionValidateBeforeCall(smartTransactionId, body);
        Type localVarReturnType = new TypeToken<SmartTransactionsProductModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Update Smart Transaction (asynchronously)
     * Updates the specified Smart Transaction with the given data. It can only be updated before the payment is executed with &#x60;POST /Smart/Transactions/{id}/start[/{method}]&#x60;, or with &#x60;POST /Smart/Transactions/{id}/prepare/{method}&#x60; in combination with &#x60;auto_capture&#x60;.  You must always pass &#x60;basket&#x60; and &#x60;basket_info&#x60;. Otherwise &#x60;basket&#x60; is removed, and basket info is set to the defaults.  Some data can not be changed after creation, f. e. &#x60;application_context&#x60;.
     * @param smartTransactionId Smart Transaction ID (required)
     * @param body Transaction details
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call updateTransactionAsync(String smartTransactionId, SmartTransactionsDTO body, final ApiCallback<SmartTransactionsProductModel> callback) throws ApiException {
        Call call = updateTransactionValidateBeforeCall(smartTransactionId, body);
        Type localVarReturnType = new TypeToken<SmartTransactionsProductModel>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}

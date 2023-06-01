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
     * @param smartTransactionId Smart transaction id (required)
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
     * POST Smart/Transactions/{smartTransactionId}/abort
     * Method to abort an unpaid smart transaction
     * @param smartTransactionId Smart transaction id (required)
     * @return SmartTransactionsProductModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SmartTransactionsProductModel abortTransaction(String smartTransactionId) throws ApiException {
        ApiResponse<SmartTransactionsProductModel> resp = abortTransactionWithHttpInfo(smartTransactionId);
        return resp.getData();
    }

    /**
     * POST Smart/Transactions/{smartTransactionId}/abort
     * Method to abort an unpaid smart transaction
     * @param smartTransactionId Smart transaction id (required)
     * @return ApiResponse&lt;SmartTransactionsProductModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SmartTransactionsProductModel> abortTransactionWithHttpInfo(String smartTransactionId) throws ApiException {
        Call call = abortTransactionValidateBeforeCall(smartTransactionId);
        Type localVarReturnType = new TypeToken<SmartTransactionsProductModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * POST Smart/Transactions/{smartTransactionId}/abort (asynchronously)
     * Method to abort an unpaid smart transaction
     * @param smartTransactionId Smart transaction id (required)
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
     * @param body Smart transaction properties
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
     * POST Smart/Transactions
     * Create new smart transaction
     * @param body Smart transaction properties
     * @return SmartTransactionsProductModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SmartTransactionsProductModel addTransaction(SmartTransactionsDTO body) throws ApiException {
        ApiResponse<SmartTransactionsProductModel> resp = addTransactionWithHttpInfo(body);
        return resp.getData();
    }

    /**
     * POST Smart/Transactions
     * Create new smart transaction
     * @param body Smart transaction properties
     * @return ApiResponse&lt;SmartTransactionsProductModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SmartTransactionsProductModel> addTransactionWithHttpInfo(SmartTransactionsDTO body) throws ApiException {
        Call call = addTransactionValidateBeforeCall(body);
        Type localVarReturnType = new TypeToken<SmartTransactionsProductModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * POST Smart/Transactions (asynchronously)
     * Create new smart transaction
     * @param body Smart transaction properties
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
     * @param smartTransactionId Smart transaction id (required)
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
     * POST Smart/Transactions/{smartTransactionId}/cancel
     * Method to cancel a loyalty transaction
     * @param smartTransactionId Smart transaction id (required)
     * @return SmartTransactionsProductModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SmartTransactionsProductModel cancelTransaction(String smartTransactionId) throws ApiException {
        ApiResponse<SmartTransactionsProductModel> resp = cancelTransactionWithHttpInfo(smartTransactionId);
        return resp.getData();
    }

    /**
     * POST Smart/Transactions/{smartTransactionId}/cancel
     * Method to cancel a loyalty transaction
     * @param smartTransactionId Smart transaction id (required)
     * @return ApiResponse&lt;SmartTransactionsProductModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SmartTransactionsProductModel> cancelTransactionWithHttpInfo(String smartTransactionId) throws ApiException {
        Call call = cancelTransactionValidateBeforeCall(smartTransactionId);
        Type localVarReturnType = new TypeToken<SmartTransactionsProductModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * POST Smart/Transactions/{smartTransactionId}/cancel (asynchronously)
     * Method to cancel a loyalty transaction
     * @param smartTransactionId Smart transaction id (required)
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
     * @param smartTransactionId Smart transaction id (required)
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
     * POST Smart/Transactions/{smartTransactionId}/canceltrx
     * Starts Cancel &#x27;Cash&#x27; transaction on Terminal with &#x27;receipt_number&#x27; (&#x27;Beleg-Nr.&#x27;)
     * @param smartTransactionId Smart transaction id (required)
     * @return SmartTransactionsProductModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SmartTransactionsProductModel cancelTrx(String smartTransactionId) throws ApiException {
        ApiResponse<SmartTransactionsProductModel> resp = cancelTrxWithHttpInfo(smartTransactionId);
        return resp.getData();
    }

    /**
     * POST Smart/Transactions/{smartTransactionId}/canceltrx
     * Starts Cancel &#x27;Cash&#x27; transaction on Terminal with &#x27;receipt_number&#x27; (&#x27;Beleg-Nr.&#x27;)
     * @param smartTransactionId Smart transaction id (required)
     * @return ApiResponse&lt;SmartTransactionsProductModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SmartTransactionsProductModel> cancelTrxWithHttpInfo(String smartTransactionId) throws ApiException {
        Call call = cancelTrxValidateBeforeCall(smartTransactionId);
        Type localVarReturnType = new TypeToken<SmartTransactionsProductModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * POST Smart/Transactions/{smartTransactionId}/canceltrx (asynchronously)
     * Starts Cancel &#x27;Cash&#x27; transaction on Terminal with &#x27;receipt_number&#x27; (&#x27;Beleg-Nr.&#x27;)
     * @param smartTransactionId Smart transaction id (required)
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
     * @param smartDeviceId Smart device id (required)
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
     * POST Smart/Transactions/{smartDeviceId}/diagnosis
     * Starts extended Diagnose on Terminal, this method is normally called by SDK&#x27;s from cash register
     * @param smartDeviceId Smart device id (required)
     * @return SmartTransactionsProductModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SmartTransactionsProductModel diagnose(String smartDeviceId) throws ApiException {
        ApiResponse<SmartTransactionsProductModel> resp = diagnoseWithHttpInfo(smartDeviceId);
        return resp.getData();
    }

    /**
     * POST Smart/Transactions/{smartDeviceId}/diagnosis
     * Starts extended Diagnose on Terminal, this method is normally called by SDK&#x27;s from cash register
     * @param smartDeviceId Smart device id (required)
     * @return ApiResponse&lt;SmartTransactionsProductModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SmartTransactionsProductModel> diagnoseWithHttpInfo(String smartDeviceId) throws ApiException {
        Call call = diagnoseValidateBeforeCall(smartDeviceId);
        Type localVarReturnType = new TypeToken<SmartTransactionsProductModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * POST Smart/Transactions/{smartDeviceId}/diagnosis (asynchronously)
     * Starts extended Diagnose on Terminal, this method is normally called by SDK&#x27;s from cash register
     * @param smartDeviceId Smart device id (required)
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
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public Call getAllCall(Integer count, Integer offset, String fields, String q, String sort) throws ApiException {
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
     * GET Smart/Transactions
     * Get a list of smart transactions
     * @param count The maximum number of items to return
     * @param offset The position within the whole result set to start returning items (zero-based)
     * @param fields List of fields to include in the result, all others will be filtered out. Nested properties can be accessed with this notation: &#x60;prop1.prop2&#x60;.
     * @param q A query string to restrict the returned items to given conditions. The query string must consist of any combination of single expressions in the form &#x60;property:condition&#x60;. Property names can be nested like &#x60;property.property&#x60;.  Example: &#x60;customer.name:Meier&#x60;  A condition may contain:  * &#x60;?&#x60; as wildcard for one character;  * &#x60;*&#x60; as wildcard for any number of characters.  You can also use value ranges in the form &#x60;[min TO max]&#x60;.  Example: &#x60;customer.age:[30 TO 40]&#x60;  You can combine expressions logically by &#x60;expr AND expr&#x60; and &#x60;{expr} OR {expr}&#x60;. You can also negate an expression using &#x60;NOT {expr}&#x60;. Parenthesis &#x60;(...)&#x60; can be used to control precedence.  Example: &#x60;(NOT customer.name:meier*) AND (customer.age:[30 TO 40] OR customer.age:[50 TO 60])&#x60;
     * @param sort String with comma separated pairs of &#x60;field:order&#x60;.  Options for order:  * &#x60;asc&#x60; ascending;  * &#x60;desc&#x60; descending.
     * @return SmartTransactionsList
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SmartTransactionsList getAll(Integer count, Integer offset, String fields, String q, String sort) throws ApiException {
        ApiResponse<SmartTransactionsList> resp = getAllWithHttpInfo(count, offset, fields, q, sort);
        return resp.getData();
    }

    /**
     * GET Smart/Transactions
     * Get a list of smart transactions
     * @param count The maximum number of items to return
     * @param offset The position within the whole result set to start returning items (zero-based)
     * @param fields List of fields to include in the result, all others will be filtered out. Nested properties can be accessed with this notation: &#x60;prop1.prop2&#x60;.
     * @param q A query string to restrict the returned items to given conditions. The query string must consist of any combination of single expressions in the form &#x60;property:condition&#x60;. Property names can be nested like &#x60;property.property&#x60;.  Example: &#x60;customer.name:Meier&#x60;  A condition may contain:  * &#x60;?&#x60; as wildcard for one character;  * &#x60;*&#x60; as wildcard for any number of characters.  You can also use value ranges in the form &#x60;[min TO max]&#x60;.  Example: &#x60;customer.age:[30 TO 40]&#x60;  You can combine expressions logically by &#x60;expr AND expr&#x60; and &#x60;{expr} OR {expr}&#x60;. You can also negate an expression using &#x60;NOT {expr}&#x60;. Parenthesis &#x60;(...)&#x60; can be used to control precedence.  Example: &#x60;(NOT customer.name:meier*) AND (customer.age:[30 TO 40] OR customer.age:[50 TO 60])&#x60;
     * @param sort String with comma separated pairs of &#x60;field:order&#x60;.  Options for order:  * &#x60;asc&#x60; ascending;  * &#x60;desc&#x60; descending.
     * @return ApiResponse&lt;SmartTransactionsList&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SmartTransactionsList> getAllWithHttpInfo(Integer count, Integer offset, String fields, String q, String sort) throws ApiException {
        Call call = getAllValidateBeforeCall(count, offset, fields, q, sort);
        Type localVarReturnType = new TypeToken<SmartTransactionsList>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * GET Smart/Transactions (asynchronously)
     * Get a list of smart transactions
     * @param count The maximum number of items to return
     * @param offset The position within the whole result set to start returning items (zero-based)
     * @param fields List of fields to include in the result, all others will be filtered out. Nested properties can be accessed with this notation: &#x60;prop1.prop2&#x60;.
     * @param q A query string to restrict the returned items to given conditions. The query string must consist of any combination of single expressions in the form &#x60;property:condition&#x60;. Property names can be nested like &#x60;property.property&#x60;.  Example: &#x60;customer.name:Meier&#x60;  A condition may contain:  * &#x60;?&#x60; as wildcard for one character;  * &#x60;*&#x60; as wildcard for any number of characters.  You can also use value ranges in the form &#x60;[min TO max]&#x60;.  Example: &#x60;customer.age:[30 TO 40]&#x60;  You can combine expressions logically by &#x60;expr AND expr&#x60; and &#x60;{expr} OR {expr}&#x60;. You can also negate an expression using &#x60;NOT {expr}&#x60;. Parenthesis &#x60;(...)&#x60; can be used to control precedence.  Example: &#x60;(NOT customer.name:meier*) AND (customer.age:[30 TO 40] OR customer.age:[50 TO 60])&#x60;
     * @param sort String with comma separated pairs of &#x60;field:order&#x60;.  Options for order:  * &#x60;asc&#x60; ascending;  * &#x60;desc&#x60; descending.
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call getAllAsync(Integer count, Integer offset, String fields, String q, String sort, final ApiCallback<SmartTransactionsList> callback) throws ApiException {
        Call call = getAllValidateBeforeCall(count, offset, fields, q, sort);
        Type localVarReturnType = new TypeToken<SmartTransactionsList>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for getOne
     * @param smartTransactionId Smart transaction id (required)
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
     * GET Smart/Transactions/{smartTransactionId}
     * Get one smart transaction for a specific id
     * @param smartTransactionId Smart transaction id (required)
     * @return SmartTransactionsProductModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SmartTransactionsProductModel getOne(String smartTransactionId) throws ApiException {
        ApiResponse<SmartTransactionsProductModel> resp = getOneWithHttpInfo(smartTransactionId);
        return resp.getData();
    }

    /**
     * GET Smart/Transactions/{smartTransactionId}
     * Get one smart transaction for a specific id
     * @param smartTransactionId Smart transaction id (required)
     * @return ApiResponse&lt;SmartTransactionsProductModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SmartTransactionsProductModel> getOneWithHttpInfo(String smartTransactionId) throws ApiException {
        Call call = getOneValidateBeforeCall(smartTransactionId);
        Type localVarReturnType = new TypeToken<SmartTransactionsProductModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * GET Smart/Transactions/{smartTransactionId} (asynchronously)
     * Get one smart transaction for a specific id
     * @param smartTransactionId Smart transaction id (required)
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
     * @param smartTransactionId Smart transaction id (required)
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
     * POST Smart/Transactions/{smartTransactionId}/preTransaction
     * Function that checks balance of merchantcard from ident and if possible creates bonus product items for basket
     * @param smartTransactionId Smart transaction id (required)
     * @return SmartTransactionsPreTransactionModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SmartTransactionsPreTransactionModel preTransaction(String smartTransactionId) throws ApiException {
        ApiResponse<SmartTransactionsPreTransactionModel> resp = preTransactionWithHttpInfo(smartTransactionId);
        return resp.getData();
    }

    /**
     * POST Smart/Transactions/{smartTransactionId}/preTransaction
     * Function that checks balance of merchantcard from ident and if possible creates bonus product items for basket
     * @param smartTransactionId Smart transaction id (required)
     * @return ApiResponse&lt;SmartTransactionsPreTransactionModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SmartTransactionsPreTransactionModel> preTransactionWithHttpInfo(String smartTransactionId) throws ApiException {
        Call call = preTransactionValidateBeforeCall(smartTransactionId);
        Type localVarReturnType = new TypeToken<SmartTransactionsPreTransactionModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * POST Smart/Transactions/{smartTransactionId}/preTransaction (asynchronously)
     * Function that checks balance of merchantcard from ident and if possible creates bonus product items for basket
     * @param smartTransactionId Smart transaction id (required)
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
     * @param smartTransactionId Smart transaction id (required)
     * @param paymentMethod Payment method (required)
     * @param body Information which customer and container will be used to this operation
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
     * POST Smart/Transactions/stx_xxx/prepare/{paymentMethod}
     * Create and score payment transaction assigned to given smart transaction
     * @param smartTransactionId Smart transaction id (required)
     * @param paymentMethod Payment method (required)
     * @param body Information which customer and container will be used to this operation
     * @return SmartTransactionsProductModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SmartTransactionsProductModel prepare(String smartTransactionId, String paymentMethod, SmartTransactionsPrepare body) throws ApiException {
        ApiResponse<SmartTransactionsProductModel> resp = prepareWithHttpInfo(smartTransactionId, paymentMethod, body);
        return resp.getData();
    }

    /**
     * POST Smart/Transactions/stx_xxx/prepare/{paymentMethod}
     * Create and score payment transaction assigned to given smart transaction
     * @param smartTransactionId Smart transaction id (required)
     * @param paymentMethod Payment method (required)
     * @param body Information which customer and container will be used to this operation
     * @return ApiResponse&lt;SmartTransactionsProductModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SmartTransactionsProductModel> prepareWithHttpInfo(String smartTransactionId, String paymentMethod, SmartTransactionsPrepare body) throws ApiException {
        Call call = prepareValidateBeforeCall(smartTransactionId, paymentMethod, body);
        Type localVarReturnType = new TypeToken<SmartTransactionsProductModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * POST Smart/Transactions/stx_xxx/prepare/{paymentMethod} (asynchronously)
     * Create and score payment transaction assigned to given smart transaction
     * @param smartTransactionId Smart transaction id (required)
     * @param paymentMethod Payment method (required)
     * @param body Information which customer and container will be used to this operation
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
     * @param smartTransactionId Smart transaction id (required)
     * @param body Information about the delivery status
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
     * POST Smart/Transactions/stx_xxx/setDelivery
     * Set delivery options to given smart transaction
     * @param smartTransactionId Smart transaction id (required)
     * @param body Information about the delivery status
     * @return SmartTransactionsProductModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SmartTransactionsProductModel setDelivery(String smartTransactionId, SmartTransactionsSetDeliveryModel body) throws ApiException {
        ApiResponse<SmartTransactionsProductModel> resp = setDeliveryWithHttpInfo(smartTransactionId, body);
        return resp.getData();
    }

    /**
     * POST Smart/Transactions/stx_xxx/setDelivery
     * Set delivery options to given smart transaction
     * @param smartTransactionId Smart transaction id (required)
     * @param body Information about the delivery status
     * @return ApiResponse&lt;SmartTransactionsProductModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SmartTransactionsProductModel> setDeliveryWithHttpInfo(String smartTransactionId, SmartTransactionsSetDeliveryModel body) throws ApiException {
        Call call = setDeliveryValidateBeforeCall(smartTransactionId, body);
        Type localVarReturnType = new TypeToken<SmartTransactionsProductModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * POST Smart/Transactions/stx_xxx/setDelivery (asynchronously)
     * Set delivery options to given smart transaction
     * @param smartTransactionId Smart transaction id (required)
     * @param body Information about the delivery status
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
     * @param smartDeviceId Smart device id (required)
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
     * POST Smart/Transactions/{smartDeviceId}/endOfDay
     * Starts End of Day Report on Terminal, this method is normally called by SDK&#x27;s from cash register
     * @param smartDeviceId Smart device id (required)
     * @return SmartTransactionsProductModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SmartTransactionsProductModel startEndOfDayReport(String smartDeviceId) throws ApiException {
        ApiResponse<SmartTransactionsProductModel> resp = startEndOfDayReportWithHttpInfo(smartDeviceId);
        return resp.getData();
    }

    /**
     * POST Smart/Transactions/{smartDeviceId}/endOfDay
     * Starts End of Day Report on Terminal, this method is normally called by SDK&#x27;s from cash register
     * @param smartDeviceId Smart device id (required)
     * @return ApiResponse&lt;SmartTransactionsProductModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SmartTransactionsProductModel> startEndOfDayReportWithHttpInfo(String smartDeviceId) throws ApiException {
        Call call = startEndOfDayReportValidateBeforeCall(smartDeviceId);
        Type localVarReturnType = new TypeToken<SmartTransactionsProductModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * POST Smart/Transactions/{smartDeviceId}/endOfDay (asynchronously)
     * Starts End of Day Report on Terminal, this method is normally called by SDK&#x27;s from cash register
     * @param smartDeviceId Smart device id (required)
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
     * @param smartTransactionId Smart transaction id (required)
     * @param paymentMethod Payment method (required)
     * @param body Information which customer and container will be used to this operation
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public Call startTransactionCall(String smartTransactionId, String paymentMethod, SmartTransactionsPrepare body) throws ApiException {
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
    private Call startTransactionValidateBeforeCall(String smartTransactionId, String paymentMethod, SmartTransactionsPrepare body) throws ApiException {
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
     * POST Smart/Transactions/{smartTransactionId}/start/{paymentMethod}
     * Start smart transaction with given payment method
     * @param smartTransactionId Smart transaction id (required)
     * @param paymentMethod Payment method (required)
     * @param body Information which customer and container will be used to this operation
     * @return SmartTransactionsProductModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SmartTransactionsProductModel startTransaction(String smartTransactionId, String paymentMethod, SmartTransactionsPrepare body) throws ApiException {
        ApiResponse<SmartTransactionsProductModel> resp = startTransactionWithHttpInfo(smartTransactionId, paymentMethod, body);
        return resp.getData();
    }

    /**
     * POST Smart/Transactions/{smartTransactionId}/start/{paymentMethod}
     * Start smart transaction with given payment method
     * @param smartTransactionId Smart transaction id (required)
     * @param paymentMethod Payment method (required)
     * @param body Information which customer and container will be used to this operation
     * @return ApiResponse&lt;SmartTransactionsProductModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SmartTransactionsProductModel> startTransactionWithHttpInfo(String smartTransactionId, String paymentMethod, SmartTransactionsPrepare body) throws ApiException {
        Call call = startTransactionValidateBeforeCall(smartTransactionId, paymentMethod, body);
        Type localVarReturnType = new TypeToken<SmartTransactionsProductModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * POST Smart/Transactions/{smartTransactionId}/start/{paymentMethod} (asynchronously)
     * Start smart transaction with given payment method
     * @param smartTransactionId Smart transaction id (required)
     * @param paymentMethod Payment method (required)
     * @param body Information which customer and container will be used to this operation
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call startTransactionAsync(String smartTransactionId, String paymentMethod, SmartTransactionsPrepare body, final ApiCallback<SmartTransactionsProductModel> callback) throws ApiException {
        Call call = startTransactionValidateBeforeCall(smartTransactionId, paymentMethod, body);
        Type localVarReturnType = new TypeToken<SmartTransactionsProductModel>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for updatePaymentContainer
     * @param subscriptionId Subscription id (required)
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
     * POST Smart/Transactions/{smartTransactionId}/updatePaymentContainer
     * Method to update the payment container for an existing subscription.
     * @param subscriptionId Subscription id (required)
     * @return SmartTransactionsProductModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SmartTransactionsProductModel updatePaymentContainer(String subscriptionId) throws ApiException {
        ApiResponse<SmartTransactionsProductModel> resp = updatePaymentContainerWithHttpInfo(subscriptionId);
        return resp.getData();
    }

    /**
     * POST Smart/Transactions/{smartTransactionId}/updatePaymentContainer
     * Method to update the payment container for an existing subscription.
     * @param subscriptionId Subscription id (required)
     * @return ApiResponse&lt;SmartTransactionsProductModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SmartTransactionsProductModel> updatePaymentContainerWithHttpInfo(String subscriptionId) throws ApiException {
        Call call = updatePaymentContainerValidateBeforeCall(subscriptionId);
        Type localVarReturnType = new TypeToken<SmartTransactionsProductModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * POST Smart/Transactions/{smartTransactionId}/updatePaymentContainer (asynchronously)
     * Method to update the payment container for an existing subscription.
     * @param subscriptionId Subscription id (required)
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
     * @param smartTransactionId Smart transaction id (required)
     * @param body Smart transaction properties
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
     * PUT Smart/Transactions/{smartTransactionId}
     * Update smart transaction
     * @param smartTransactionId Smart transaction id (required)
     * @param body Smart transaction properties
     * @return SmartTransactionsProductModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SmartTransactionsProductModel updateTransaction(String smartTransactionId, SmartTransactionsDTO body) throws ApiException {
        ApiResponse<SmartTransactionsProductModel> resp = updateTransactionWithHttpInfo(smartTransactionId, body);
        return resp.getData();
    }

    /**
     * PUT Smart/Transactions/{smartTransactionId}
     * Update smart transaction
     * @param smartTransactionId Smart transaction id (required)
     * @param body Smart transaction properties
     * @return ApiResponse&lt;SmartTransactionsProductModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SmartTransactionsProductModel> updateTransactionWithHttpInfo(String smartTransactionId, SmartTransactionsDTO body) throws ApiException {
        Call call = updateTransactionValidateBeforeCall(smartTransactionId, body);
        Type localVarReturnType = new TypeToken<SmartTransactionsProductModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * PUT Smart/Transactions/{smartTransactionId} (asynchronously)
     * Update smart transaction
     * @param smartTransactionId Smart transaction id (required)
     * @param body Smart transaction properties
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

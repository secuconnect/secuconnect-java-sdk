package com.secuconnect.client.api;

import com.google.gson.reflect.TypeToken;
import com.secuconnect.client.*;
import com.secuconnect.client.model.Aggregate;
import java.math.BigDecimal;
import com.secuconnect.client.model.ProductExceptionPayload;
import com.secuconnect.client.model.SmartRoutingsDTO;
import com.secuconnect.client.model.SmartRoutingsList;
import com.secuconnect.client.model.SmartRoutingsProductModel;
import okhttp3.Call;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SmartRoutingsApi {
    private ApiClient apiClient;

    public SmartRoutingsApi() {
        this(Environment.getGlobalEnv().getApiClient());
    }

    public SmartRoutingsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for addRouting
     * @param body Smart Routing details
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public Call addRoutingCall(SmartRoutingsDTO body) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/Smart/Routings";

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
    private Call addRoutingValidateBeforeCall(SmartRoutingsDTO body) throws ApiException {

        return addRoutingCall(body);
    }

    /**
     * Create Smart Routing
     * Creates a new Smart Routing from the given data.
     * @param body Smart Routing details
     * @return SmartRoutingsProductModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SmartRoutingsProductModel addRouting(SmartRoutingsDTO body) throws ApiException {
        ApiResponse<SmartRoutingsProductModel> resp = addRoutingWithHttpInfo(body);
        return resp.getData();
    }

    /**
     * Create Smart Routing
     * Creates a new Smart Routing from the given data.
     * @param body Smart Routing details
     * @return ApiResponse&lt;SmartRoutingsProductModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SmartRoutingsProductModel> addRoutingWithHttpInfo(SmartRoutingsDTO body) throws ApiException {
        Call call = addRoutingValidateBeforeCall(body);
        Type localVarReturnType = new TypeToken<SmartRoutingsProductModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Create Smart Routing (asynchronously)
     * Creates a new Smart Routing from the given data.
     * @param body Smart Routing details
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call addRoutingAsync(SmartRoutingsDTO body, final ApiCallback<SmartRoutingsProductModel> callback) throws ApiException {
        Call call = addRoutingValidateBeforeCall(body);
        Type localVarReturnType = new TypeToken<SmartRoutingsProductModel>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for assignDeviceToRouting
     * @param smartRoutingId Smart Routing ID (required)
     * @param smartDeviceId Smart Device ID (required)
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public Call assignDeviceToRoutingCall(String smartRoutingId, String smartDeviceId) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/Smart/Routings/{smartRoutingId}/assign/{smartDeviceId}"
            .replaceAll("\\{" + "smartRoutingId" + "\\}", apiClient.escapeString(smartRoutingId.toString()))
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
    private Call assignDeviceToRoutingValidateBeforeCall(String smartRoutingId, String smartDeviceId) throws ApiException {
        // verify the required parameter 'smartRoutingId' is set
        if (smartRoutingId == null) {
            throw new ApiException("Missing the required parameter 'smartRoutingId' when calling assignDeviceToRouting(Async)");
        }
        // verify the required parameter 'smartDeviceId' is set
        if (smartDeviceId == null) {
            throw new ApiException("Missing the required parameter 'smartDeviceId' when calling assignDeviceToRouting(Async)");
        }

        return assignDeviceToRoutingCall(smartRoutingId, smartDeviceId);
    }

    /**
     * Assign Smart Device
     * Assigns the specified Smart Device to the specified Smart Routing.
     * @param smartRoutingId Smart Routing ID (required)
     * @param smartDeviceId Smart Device ID (required)
     * @return SmartRoutingsProductModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SmartRoutingsProductModel assignDeviceToRouting(String smartRoutingId, String smartDeviceId) throws ApiException {
        ApiResponse<SmartRoutingsProductModel> resp = assignDeviceToRoutingWithHttpInfo(smartRoutingId, smartDeviceId);
        return resp.getData();
    }

    /**
     * Assign Smart Device
     * Assigns the specified Smart Device to the specified Smart Routing.
     * @param smartRoutingId Smart Routing ID (required)
     * @param smartDeviceId Smart Device ID (required)
     * @return ApiResponse&lt;SmartRoutingsProductModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SmartRoutingsProductModel> assignDeviceToRoutingWithHttpInfo(String smartRoutingId, String smartDeviceId) throws ApiException {
        Call call = assignDeviceToRoutingValidateBeforeCall(smartRoutingId, smartDeviceId);
        Type localVarReturnType = new TypeToken<SmartRoutingsProductModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Assign Smart Device (asynchronously)
     * Assigns the specified Smart Device to the specified Smart Routing.
     * @param smartRoutingId Smart Routing ID (required)
     * @param smartDeviceId Smart Device ID (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call assignDeviceToRoutingAsync(String smartRoutingId, String smartDeviceId, final ApiCallback<SmartRoutingsProductModel> callback) throws ApiException {
        Call call = assignDeviceToRoutingValidateBeforeCall(smartRoutingId, smartDeviceId);
        Type localVarReturnType = new TypeToken<SmartRoutingsProductModel>(){}.getType();
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
        String localVarPath = "/Smart/Routings";

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
     * Find Smart Routings
     * Returns the Smart Routings matching the given criteria.
     * @param count The maximum number of items to return
     * @param offset The position within the whole result set to start returning items (zero-based)
     * @param fields List of fields to include in the result, all others will be filtered out. Nested properties can be accessed with this notation: &#x60;prop1.prop2&#x60;.
     * @param q A query string to restrict the returned items to given conditions. The query string must consist of any combination of single expressions in the form &#x60;property:condition&#x60;. Property names can be nested like &#x60;property.property&#x60;.  Example: &#x60;customer.name:Meier&#x60;  A condition may contain:  * &#x60;?&#x60; as wildcard for one character;  * &#x60;*&#x60; as wildcard for any number of characters.  You can also use value ranges in the form &#x60;[min TO max]&#x60;.  Example: &#x60;customer.age:[30 TO 40]&#x60;  You can combine expressions logically by &#x60;expr AND expr&#x60; and &#x60;{expr} OR {expr}&#x60;. You can also negate an expression using &#x60;NOT {expr}&#x60;. Parenthesis &#x60;(...)&#x60; can be used to control precedence.  Example: &#x60;(NOT customer.name:meier*) AND (customer.age:[30 TO 40] OR customer.age:[50 TO 60])&#x60;
     * @param sort String with comma separated pairs of &#x60;field:order&#x60;.  Options for order:  * &#x60;asc&#x60; ascending;  * &#x60;desc&#x60; descending.
     * @return SmartRoutingsList
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SmartRoutingsList getAll(Integer count, Integer offset, String fields, String q, String sort) throws ApiException {
        ApiResponse<SmartRoutingsList> resp = getAllWithHttpInfo(count, offset, fields, q, sort);
        return resp.getData();
    }

    /**
     * Find Smart Routings
     * Returns the Smart Routings matching the given criteria.
     * @param count The maximum number of items to return
     * @param offset The position within the whole result set to start returning items (zero-based)
     * @param fields List of fields to include in the result, all others will be filtered out. Nested properties can be accessed with this notation: &#x60;prop1.prop2&#x60;.
     * @param q A query string to restrict the returned items to given conditions. The query string must consist of any combination of single expressions in the form &#x60;property:condition&#x60;. Property names can be nested like &#x60;property.property&#x60;.  Example: &#x60;customer.name:Meier&#x60;  A condition may contain:  * &#x60;?&#x60; as wildcard for one character;  * &#x60;*&#x60; as wildcard for any number of characters.  You can also use value ranges in the form &#x60;[min TO max]&#x60;.  Example: &#x60;customer.age:[30 TO 40]&#x60;  You can combine expressions logically by &#x60;expr AND expr&#x60; and &#x60;{expr} OR {expr}&#x60;. You can also negate an expression using &#x60;NOT {expr}&#x60;. Parenthesis &#x60;(...)&#x60; can be used to control precedence.  Example: &#x60;(NOT customer.name:meier*) AND (customer.age:[30 TO 40] OR customer.age:[50 TO 60])&#x60;
     * @param sort String with comma separated pairs of &#x60;field:order&#x60;.  Options for order:  * &#x60;asc&#x60; ascending;  * &#x60;desc&#x60; descending.
     * @return ApiResponse&lt;SmartRoutingsList&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SmartRoutingsList> getAllWithHttpInfo(Integer count, Integer offset, String fields, String q, String sort) throws ApiException {
        Call call = getAllValidateBeforeCall(count, offset, fields, q, sort);
        Type localVarReturnType = new TypeToken<SmartRoutingsList>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Find Smart Routings (asynchronously)
     * Returns the Smart Routings matching the given criteria.
     * @param count The maximum number of items to return
     * @param offset The position within the whole result set to start returning items (zero-based)
     * @param fields List of fields to include in the result, all others will be filtered out. Nested properties can be accessed with this notation: &#x60;prop1.prop2&#x60;.
     * @param q A query string to restrict the returned items to given conditions. The query string must consist of any combination of single expressions in the form &#x60;property:condition&#x60;. Property names can be nested like &#x60;property.property&#x60;.  Example: &#x60;customer.name:Meier&#x60;  A condition may contain:  * &#x60;?&#x60; as wildcard for one character;  * &#x60;*&#x60; as wildcard for any number of characters.  You can also use value ranges in the form &#x60;[min TO max]&#x60;.  Example: &#x60;customer.age:[30 TO 40]&#x60;  You can combine expressions logically by &#x60;expr AND expr&#x60; and &#x60;{expr} OR {expr}&#x60;. You can also negate an expression using &#x60;NOT {expr}&#x60;. Parenthesis &#x60;(...)&#x60; can be used to control precedence.  Example: &#x60;(NOT customer.name:meier*) AND (customer.age:[30 TO 40] OR customer.age:[50 TO 60])&#x60;
     * @param sort String with comma separated pairs of &#x60;field:order&#x60;.  Options for order:  * &#x60;asc&#x60; ascending;  * &#x60;desc&#x60; descending.
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call getAllAsync(Integer count, Integer offset, String fields, String q, String sort, final ApiCallback<SmartRoutingsList> callback) throws ApiException {
        Call call = getAllValidateBeforeCall(count, offset, fields, q, sort);
        Type localVarReturnType = new TypeToken<SmartRoutingsList>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for getOne
     * @param smartRoutingId Smart Routing ID (required)
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public Call getOneCall(String smartRoutingId) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/Smart/Routings/{smartRoutingId}"
            .replaceAll("\\{" + "smartRoutingId" + "\\}", apiClient.escapeString(smartRoutingId.toString()));

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
    private Call getOneValidateBeforeCall(String smartRoutingId) throws ApiException {
        // verify the required parameter 'smartRoutingId' is set
        if (smartRoutingId == null) {
            throw new ApiException("Missing the required parameter 'smartRoutingId' when calling getOne(Async)");
        }

        return getOneCall(smartRoutingId);
    }

    /**
     * Read Smart Routing
     * Returns the specified Smart Routing.
     * @param smartRoutingId Smart Routing ID (required)
     * @return SmartRoutingsProductModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SmartRoutingsProductModel getOne(String smartRoutingId) throws ApiException {
        ApiResponse<SmartRoutingsProductModel> resp = getOneWithHttpInfo(smartRoutingId);
        return resp.getData();
    }

    /**
     * Read Smart Routing
     * Returns the specified Smart Routing.
     * @param smartRoutingId Smart Routing ID (required)
     * @return ApiResponse&lt;SmartRoutingsProductModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SmartRoutingsProductModel> getOneWithHttpInfo(String smartRoutingId) throws ApiException {
        Call call = getOneValidateBeforeCall(smartRoutingId);
        Type localVarReturnType = new TypeToken<SmartRoutingsProductModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Read Smart Routing (asynchronously)
     * Returns the specified Smart Routing.
     * @param smartRoutingId Smart Routing ID (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call getOneAsync(String smartRoutingId, final ApiCallback<SmartRoutingsProductModel> callback) throws ApiException {
        Call call = getOneValidateBeforeCall(smartRoutingId);
        Type localVarReturnType = new TypeToken<SmartRoutingsProductModel>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for removeRouting
     * @param smartRoutingId Smart Routing ID (required)
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public Call removeRoutingCall(String smartRoutingId) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/Smart/Routings/{smartRoutingId}"
            .replaceAll("\\{" + "smartRoutingId" + "\\}", apiClient.escapeString(smartRoutingId.toString()));

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
    private Call removeRoutingValidateBeforeCall(String smartRoutingId) throws ApiException {
        // verify the required parameter 'smartRoutingId' is set
        if (smartRoutingId == null) {
            throw new ApiException("Missing the required parameter 'smartRoutingId' when calling removeRouting(Async)");
        }

        return removeRoutingCall(smartRoutingId);
    }

    /**
     * Delete Smart Routing
     * Deletes the specified Smart Routing.
     * @param smartRoutingId Smart Routing ID (required)
     * @return SmartRoutingsProductModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SmartRoutingsProductModel removeRouting(String smartRoutingId) throws ApiException {
        ApiResponse<SmartRoutingsProductModel> resp = removeRoutingWithHttpInfo(smartRoutingId);
        return resp.getData();
    }

    /**
     * Delete Smart Routing
     * Deletes the specified Smart Routing.
     * @param smartRoutingId Smart Routing ID (required)
     * @return ApiResponse&lt;SmartRoutingsProductModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SmartRoutingsProductModel> removeRoutingWithHttpInfo(String smartRoutingId) throws ApiException {
        Call call = removeRoutingValidateBeforeCall(smartRoutingId);
        Type localVarReturnType = new TypeToken<SmartRoutingsProductModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Delete Smart Routing (asynchronously)
     * Deletes the specified Smart Routing.
     * @param smartRoutingId Smart Routing ID (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call removeRoutingAsync(String smartRoutingId, final ApiCallback<SmartRoutingsProductModel> callback) throws ApiException {
        Call call = removeRoutingValidateBeforeCall(smartRoutingId);
        Type localVarReturnType = new TypeToken<SmartRoutingsProductModel>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for removeSmartRoutingAssignment
     * @param smartRoutingId Smart Routing ID (required)
     * @param smartDeviceId Smart Device ID (required)
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public Call removeSmartRoutingAssignmentCall(String smartRoutingId, String smartDeviceId) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/Smart/Routings/{smartRoutingId}/assign/{smartDeviceId}"
            .replaceAll("\\{" + "smartRoutingId" + "\\}", apiClient.escapeString(smartRoutingId.toString()))
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
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames);
    }

    @SuppressWarnings("rawtypes")
    private Call removeSmartRoutingAssignmentValidateBeforeCall(String smartRoutingId, String smartDeviceId) throws ApiException {
        // verify the required parameter 'smartRoutingId' is set
        if (smartRoutingId == null) {
            throw new ApiException("Missing the required parameter 'smartRoutingId' when calling removeSmartRoutingAssignment(Async)");
        }
        // verify the required parameter 'smartDeviceId' is set
        if (smartDeviceId == null) {
            throw new ApiException("Missing the required parameter 'smartDeviceId' when calling removeSmartRoutingAssignment(Async)");
        }

        return removeSmartRoutingAssignmentCall(smartRoutingId, smartDeviceId);
    }

    /**
     * Unassign Smart Device
     * Unassigns the specified Smart Device from the specified Smart Routing.
     * @param smartRoutingId Smart Routing ID (required)
     * @param smartDeviceId Smart Device ID (required)
     * @return SmartRoutingsProductModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SmartRoutingsProductModel removeSmartRoutingAssignment(String smartRoutingId, String smartDeviceId) throws ApiException {
        ApiResponse<SmartRoutingsProductModel> resp = removeSmartRoutingAssignmentWithHttpInfo(smartRoutingId, smartDeviceId);
        return resp.getData();
    }

    /**
     * Unassign Smart Device
     * Unassigns the specified Smart Device from the specified Smart Routing.
     * @param smartRoutingId Smart Routing ID (required)
     * @param smartDeviceId Smart Device ID (required)
     * @return ApiResponse&lt;SmartRoutingsProductModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SmartRoutingsProductModel> removeSmartRoutingAssignmentWithHttpInfo(String smartRoutingId, String smartDeviceId) throws ApiException {
        Call call = removeSmartRoutingAssignmentValidateBeforeCall(smartRoutingId, smartDeviceId);
        Type localVarReturnType = new TypeToken<SmartRoutingsProductModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Unassign Smart Device (asynchronously)
     * Unassigns the specified Smart Device from the specified Smart Routing.
     * @param smartRoutingId Smart Routing ID (required)
     * @param smartDeviceId Smart Device ID (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call removeSmartRoutingAssignmentAsync(String smartRoutingId, String smartDeviceId, final ApiCallback<SmartRoutingsProductModel> callback) throws ApiException {
        Call call = removeSmartRoutingAssignmentValidateBeforeCall(smartRoutingId, smartDeviceId);
        Type localVarReturnType = new TypeToken<SmartRoutingsProductModel>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for updateRouting
     * @param smartRoutingId Smart Routing ID (required)
     * @param body Smart Routing details
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public Call updateRoutingCall(String smartRoutingId, SmartRoutingsDTO body) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/Smart/Routings/{smartRoutingId}"
            .replaceAll("\\{" + "smartRoutingId" + "\\}", apiClient.escapeString(smartRoutingId.toString()));

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
    private Call updateRoutingValidateBeforeCall(String smartRoutingId, SmartRoutingsDTO body) throws ApiException {
        // verify the required parameter 'smartRoutingId' is set
        if (smartRoutingId == null) {
            throw new ApiException("Missing the required parameter 'smartRoutingId' when calling updateRouting(Async)");
        }

        return updateRoutingCall(smartRoutingId, body);
    }

    /**
     * Update Smart Routing
     * Updates the specified Smart Routing with the given data.
     * @param smartRoutingId Smart Routing ID (required)
     * @param body Smart Routing details
     * @return SmartRoutingsProductModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SmartRoutingsProductModel updateRouting(String smartRoutingId, SmartRoutingsDTO body) throws ApiException {
        ApiResponse<SmartRoutingsProductModel> resp = updateRoutingWithHttpInfo(smartRoutingId, body);
        return resp.getData();
    }

    /**
     * Update Smart Routing
     * Updates the specified Smart Routing with the given data.
     * @param smartRoutingId Smart Routing ID (required)
     * @param body Smart Routing details
     * @return ApiResponse&lt;SmartRoutingsProductModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SmartRoutingsProductModel> updateRoutingWithHttpInfo(String smartRoutingId, SmartRoutingsDTO body) throws ApiException {
        Call call = updateRoutingValidateBeforeCall(smartRoutingId, body);
        Type localVarReturnType = new TypeToken<SmartRoutingsProductModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Update Smart Routing (asynchronously)
     * Updates the specified Smart Routing with the given data.
     * @param smartRoutingId Smart Routing ID (required)
     * @param body Smart Routing details
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call updateRoutingAsync(String smartRoutingId, SmartRoutingsDTO body, final ApiCallback<SmartRoutingsProductModel> callback) throws ApiException {
        Call call = updateRoutingValidateBeforeCall(smartRoutingId, body);
        Type localVarReturnType = new TypeToken<SmartRoutingsProductModel>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}

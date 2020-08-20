package com.secuconnect.client.api;

import com.google.gson.reflect.TypeToken;
import com.secuconnect.client.*;
import com.secuconnect.client.model.ProductExceptionPayload;
import com.secuconnect.client.model.SmartRoutingPriority;
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
     * @param body Smart routing properties
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
     * POST Smart/Routings
     * Create new smart routing
     * @param body Smart routing properties
     * @return SmartRoutingsProductModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SmartRoutingsProductModel addRouting(SmartRoutingsDTO body) throws ApiException {
        ApiResponse<SmartRoutingsProductModel> resp = addRoutingWithHttpInfo(body);
        return resp.getData();
    }

    /**
     * POST Smart/Routings
     * Create new smart routing
     * @param body Smart routing properties
     * @return ApiResponse&lt;SmartRoutingsProductModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SmartRoutingsProductModel> addRoutingWithHttpInfo(SmartRoutingsDTO body) throws ApiException {
        Call call = addRoutingValidateBeforeCall(body);
        Type localVarReturnType = new TypeToken<SmartRoutingsProductModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * POST Smart/Routings (asynchronously)
     * Create new smart routing
     * @param body Smart routing properties
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
     * @param smartRoutingId Smart routing id (required)
     * @param smartDeviceId Smart device id (required)
     * @param body Smart routing assignment properties
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public Call assignDeviceToRoutingCall(String smartRoutingId, String smartDeviceId, SmartRoutingPriority body) throws ApiException {
        Object localVarPostBody = body;

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
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "oauth_token" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames);
    }

    @SuppressWarnings("rawtypes")
    private Call assignDeviceToRoutingValidateBeforeCall(String smartRoutingId, String smartDeviceId, SmartRoutingPriority body) throws ApiException {
        // verify the required parameter 'smartRoutingId' is set
        if (smartRoutingId == null) {
            throw new ApiException("Missing the required parameter 'smartRoutingId' when calling assignDeviceToRouting(Async)");
        }
        // verify the required parameter 'smartDeviceId' is set
        if (smartDeviceId == null) {
            throw new ApiException("Missing the required parameter 'smartDeviceId' when calling assignDeviceToRouting(Async)");
        }

        return assignDeviceToRoutingCall(smartRoutingId, smartDeviceId, body);
    }

    /**
     * POST Smart/Routings/{smartRoutingId}/assign/{smartDeviceId}
     * Assign the specific smart device to the specific smart routing
     * @param smartRoutingId Smart routing id (required)
     * @param smartDeviceId Smart device id (required)
     * @param body Smart routing assignment properties
     * @return SmartRoutingsProductModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SmartRoutingsProductModel assignDeviceToRouting(String smartRoutingId, String smartDeviceId, SmartRoutingPriority body) throws ApiException {
        ApiResponse<SmartRoutingsProductModel> resp = assignDeviceToRoutingWithHttpInfo(smartRoutingId, smartDeviceId, body);
        return resp.getData();
    }

    /**
     * POST Smart/Routings/{smartRoutingId}/assign/{smartDeviceId}
     * Assign the specific smart device to the specific smart routing
     * @param smartRoutingId Smart routing id (required)
     * @param smartDeviceId Smart device id (required)
     * @param body Smart routing assignment properties
     * @return ApiResponse&lt;SmartRoutingsProductModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SmartRoutingsProductModel> assignDeviceToRoutingWithHttpInfo(String smartRoutingId, String smartDeviceId, SmartRoutingPriority body) throws ApiException {
        Call call = assignDeviceToRoutingValidateBeforeCall(smartRoutingId, smartDeviceId, body);
        Type localVarReturnType = new TypeToken<SmartRoutingsProductModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * POST Smart/Routings/{smartRoutingId}/assign/{smartDeviceId} (asynchronously)
     * Assign the specific smart device to the specific smart routing
     * @param smartRoutingId Smart routing id (required)
     * @param smartDeviceId Smart device id (required)
     * @param body Smart routing assignment properties
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call assignDeviceToRoutingAsync(String smartRoutingId, String smartDeviceId, SmartRoutingPriority body, final ApiCallback<SmartRoutingsProductModel> callback) throws ApiException {
        Call call = assignDeviceToRoutingValidateBeforeCall(smartRoutingId, smartDeviceId, body);
        Type localVarReturnType = new TypeToken<SmartRoutingsProductModel>(){}.getType();
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
     * GET Smart/Routings
     * Get a list of smart routings
     * @param count The number of items to return.
     * @param offset The position within the whole result set to start returning items (First element is at 0).
     * @param fields List of fields to include in the result. Nested properties can be accessed with this notation: prop1.prop2  Example: prop3,prop1.prop2
     * @param q A query string to restrict the returned items to given conditions. The query string must consist of any combination of single expressions in the form property:condition.  *                   A condition may contain:  *                       - wildcard \&quot;*\&quot; for any number of characters  *                       - wildcard \&quot;?\&quot; for one character  *                       - ranges in the form [value TO value]  *  *                   Single expressions may combined by &#x27;AND&#x27;, &#x27;OR&#x27;, &#x27;NOT&#x27; operators and parenthesis &#x27;(&#x27;, &#x27;)&#x27; for grouping.  *                   Property names can be nested like \&quot;prop1.prop2\&quot;.  *                   Example: (NOT customer.name:meier*) AND (customer.age:[30 TO 40] OR customer.age:[50 TO 60])  *                   
     * @param sort String with comma separated pairs of field:order (e.g. contact.surname:asc,contact.comapnyname:desc). Result set will be sorted by included fields, in ascending &#x27;asc&#x27;, or descending &#x27;dsc&#x27; order.
     * @return SmartRoutingsList
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SmartRoutingsList getAll(Integer count, Integer offset, String fields, String q, String sort) throws ApiException {
        ApiResponse<SmartRoutingsList> resp = getAllWithHttpInfo(count, offset, fields, q, sort);
        return resp.getData();
    }

    /**
     * GET Smart/Routings
     * Get a list of smart routings
     * @param count The number of items to return.
     * @param offset The position within the whole result set to start returning items (First element is at 0).
     * @param fields List of fields to include in the result. Nested properties can be accessed with this notation: prop1.prop2  Example: prop3,prop1.prop2
     * @param q A query string to restrict the returned items to given conditions. The query string must consist of any combination of single expressions in the form property:condition.  *                   A condition may contain:  *                       - wildcard \&quot;*\&quot; for any number of characters  *                       - wildcard \&quot;?\&quot; for one character  *                       - ranges in the form [value TO value]  *  *                   Single expressions may combined by &#x27;AND&#x27;, &#x27;OR&#x27;, &#x27;NOT&#x27; operators and parenthesis &#x27;(&#x27;, &#x27;)&#x27; for grouping.  *                   Property names can be nested like \&quot;prop1.prop2\&quot;.  *                   Example: (NOT customer.name:meier*) AND (customer.age:[30 TO 40] OR customer.age:[50 TO 60])  *                   
     * @param sort String with comma separated pairs of field:order (e.g. contact.surname:asc,contact.comapnyname:desc). Result set will be sorted by included fields, in ascending &#x27;asc&#x27;, or descending &#x27;dsc&#x27; order.
     * @return ApiResponse&lt;SmartRoutingsList&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SmartRoutingsList> getAllWithHttpInfo(Integer count, Integer offset, String fields, String q, String sort) throws ApiException {
        Call call = getAllValidateBeforeCall(count, offset, fields, q, sort);
        Type localVarReturnType = new TypeToken<SmartRoutingsList>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * GET Smart/Routings (asynchronously)
     * Get a list of smart routings
     * @param count The number of items to return.
     * @param offset The position within the whole result set to start returning items (First element is at 0).
     * @param fields List of fields to include in the result. Nested properties can be accessed with this notation: prop1.prop2  Example: prop3,prop1.prop2
     * @param q A query string to restrict the returned items to given conditions. The query string must consist of any combination of single expressions in the form property:condition.  *                   A condition may contain:  *                       - wildcard \&quot;*\&quot; for any number of characters  *                       - wildcard \&quot;?\&quot; for one character  *                       - ranges in the form [value TO value]  *  *                   Single expressions may combined by &#x27;AND&#x27;, &#x27;OR&#x27;, &#x27;NOT&#x27; operators and parenthesis &#x27;(&#x27;, &#x27;)&#x27; for grouping.  *                   Property names can be nested like \&quot;prop1.prop2\&quot;.  *                   Example: (NOT customer.name:meier*) AND (customer.age:[30 TO 40] OR customer.age:[50 TO 60])  *                   
     * @param sort String with comma separated pairs of field:order (e.g. contact.surname:asc,contact.comapnyname:desc). Result set will be sorted by included fields, in ascending &#x27;asc&#x27;, or descending &#x27;dsc&#x27; order.
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
     * @param smartRoutingId Smart routing id (required)
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
     * GET Smart/Routings/{smartRoutingId}
     * Get one smart routing for a specific id
     * @param smartRoutingId Smart routing id (required)
     * @return SmartRoutingsProductModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SmartRoutingsProductModel getOne(String smartRoutingId) throws ApiException {
        ApiResponse<SmartRoutingsProductModel> resp = getOneWithHttpInfo(smartRoutingId);
        return resp.getData();
    }

    /**
     * GET Smart/Routings/{smartRoutingId}
     * Get one smart routing for a specific id
     * @param smartRoutingId Smart routing id (required)
     * @return ApiResponse&lt;SmartRoutingsProductModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SmartRoutingsProductModel> getOneWithHttpInfo(String smartRoutingId) throws ApiException {
        Call call = getOneValidateBeforeCall(smartRoutingId);
        Type localVarReturnType = new TypeToken<SmartRoutingsProductModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * GET Smart/Routings/{smartRoutingId} (asynchronously)
     * Get one smart routing for a specific id
     * @param smartRoutingId Smart routing id (required)
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
     * @param smartRoutingId Smart routing id (required)
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
     * DELETE Smart/Routings/{smartRoutingId}
     * Remove specific smart roting
     * @param smartRoutingId Smart routing id (required)
     * @return List&lt;SmartRoutingsProductModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<SmartRoutingsProductModel> removeRouting(String smartRoutingId) throws ApiException {
        ApiResponse<List<SmartRoutingsProductModel>> resp = removeRoutingWithHttpInfo(smartRoutingId);
        return resp.getData();
    }

    /**
     * DELETE Smart/Routings/{smartRoutingId}
     * Remove specific smart roting
     * @param smartRoutingId Smart routing id (required)
     * @return ApiResponse&lt;List&lt;SmartRoutingsProductModel&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<SmartRoutingsProductModel>> removeRoutingWithHttpInfo(String smartRoutingId) throws ApiException {
        Call call = removeRoutingValidateBeforeCall(smartRoutingId);
        Type localVarReturnType = new TypeToken<List<SmartRoutingsProductModel>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * DELETE Smart/Routings/{smartRoutingId} (asynchronously)
     * Remove specific smart roting
     * @param smartRoutingId Smart routing id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call removeRoutingAsync(String smartRoutingId, final ApiCallback<List<SmartRoutingsProductModel>> callback) throws ApiException {
        Call call = removeRoutingValidateBeforeCall(smartRoutingId);
        Type localVarReturnType = new TypeToken<List<SmartRoutingsProductModel>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for removeSmartRoutingAssignment
     * @param smartRoutingId Smart routing id (required)
     * @param smartDeviceId Smart device id (required)
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
     * DELETE Smart/Routings/{smartRoutingId}/assign/{smartDeviceId}
     * Remove smart routing assignment
     * @param smartRoutingId Smart routing id (required)
     * @param smartDeviceId Smart device id (required)
     * @return SmartRoutingsProductModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SmartRoutingsProductModel removeSmartRoutingAssignment(String smartRoutingId, String smartDeviceId) throws ApiException {
        ApiResponse<SmartRoutingsProductModel> resp = removeSmartRoutingAssignmentWithHttpInfo(smartRoutingId, smartDeviceId);
        return resp.getData();
    }

    /**
     * DELETE Smart/Routings/{smartRoutingId}/assign/{smartDeviceId}
     * Remove smart routing assignment
     * @param smartRoutingId Smart routing id (required)
     * @param smartDeviceId Smart device id (required)
     * @return ApiResponse&lt;SmartRoutingsProductModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SmartRoutingsProductModel> removeSmartRoutingAssignmentWithHttpInfo(String smartRoutingId, String smartDeviceId) throws ApiException {
        Call call = removeSmartRoutingAssignmentValidateBeforeCall(smartRoutingId, smartDeviceId);
        Type localVarReturnType = new TypeToken<SmartRoutingsProductModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * DELETE Smart/Routings/{smartRoutingId}/assign/{smartDeviceId} (asynchronously)
     * Remove smart routing assignment
     * @param smartRoutingId Smart routing id (required)
     * @param smartDeviceId Smart device id (required)
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
     * @param smartRoutingId Smart routing id (required)
     * @param body Smart routing properties
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
     * PUT Smart/Routings/{smartRoutingId}
     * Update specific smart routing
     * @param smartRoutingId Smart routing id (required)
     * @param body Smart routing properties
     * @return SmartRoutingsProductModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SmartRoutingsProductModel updateRouting(String smartRoutingId, SmartRoutingsDTO body) throws ApiException {
        ApiResponse<SmartRoutingsProductModel> resp = updateRoutingWithHttpInfo(smartRoutingId, body);
        return resp.getData();
    }

    /**
     * PUT Smart/Routings/{smartRoutingId}
     * Update specific smart routing
     * @param smartRoutingId Smart routing id (required)
     * @param body Smart routing properties
     * @return ApiResponse&lt;SmartRoutingsProductModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SmartRoutingsProductModel> updateRoutingWithHttpInfo(String smartRoutingId, SmartRoutingsDTO body) throws ApiException {
        Call call = updateRoutingValidateBeforeCall(smartRoutingId, body);
        Type localVarReturnType = new TypeToken<SmartRoutingsProductModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * PUT Smart/Routings/{smartRoutingId} (asynchronously)
     * Update specific smart routing
     * @param smartRoutingId Smart routing id (required)
     * @param body Smart routing properties
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

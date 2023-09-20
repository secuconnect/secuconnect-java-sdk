package com.secuconnect.client.api;

import com.google.gson.reflect.TypeToken;
import com.secuconnect.client.*;
import com.secuconnect.client.model.Aggregate;
import java.math.BigDecimal;
import com.secuconnect.client.model.ProductExceptionPayload;
import com.secuconnect.client.model.SmartDeviceUserPin;
import com.secuconnect.client.model.SmartDevicesDTO;
import com.secuconnect.client.model.SmartDevicesList;
import com.secuconnect.client.model.SmartDevicesProductModel;
import okhttp3.Call;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SmartDevicesApi {
    private ApiClient apiClient;

    public SmartDevicesApi() {
        this(Environment.getGlobalEnv().getApiClient());
    }

    public SmartDevicesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for addDevice
     * @param body Smart device properties
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public Call addDeviceCall(SmartDevicesDTO body) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/Smart/Devices";

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
    private Call addDeviceValidateBeforeCall(SmartDevicesDTO body) throws ApiException {

        return addDeviceCall(body);
    }

    /**
     * Create Smart Device
     * Creates a new Smart Device from the given data.
     * @param body Smart device properties
     * @return SmartDevicesProductModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SmartDevicesProductModel addDevice(SmartDevicesDTO body) throws ApiException {
        ApiResponse<SmartDevicesProductModel> resp = addDeviceWithHttpInfo(body);
        return resp.getData();
    }

    /**
     * Create Smart Device
     * Creates a new Smart Device from the given data.
     * @param body Smart device properties
     * @return ApiResponse&lt;SmartDevicesProductModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SmartDevicesProductModel> addDeviceWithHttpInfo(SmartDevicesDTO body) throws ApiException {
        Call call = addDeviceValidateBeforeCall(body);
        Type localVarReturnType = new TypeToken<SmartDevicesProductModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Create Smart Device (asynchronously)
     * Creates a new Smart Device from the given data.
     * @param body Smart device properties
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call addDeviceAsync(SmartDevicesDTO body, final ApiCallback<SmartDevicesProductModel> callback) throws ApiException {
        Call call = addDeviceValidateBeforeCall(body);
        Type localVarReturnType = new TypeToken<SmartDevicesProductModel>(){}.getType();
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
        String localVarPath = "/Smart/Devices";

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
     * Find Smart Devices
     * Returns the Smart Devices matching the given criteria.
     * @param count The maximum number of items to return
     * @param offset The position within the whole result set to start returning items (zero-based)
     * @param fields List of fields to include in the result, all others will be filtered out. Nested properties can be accessed with this notation: &#x60;prop1.prop2&#x60;.
     * @param q A query string to restrict the returned items to given conditions. The query string must consist of any combination of single expressions in the form &#x60;property:condition&#x60;. Property names can be nested like &#x60;property.property&#x60;.  Example: &#x60;customer.name:Meier&#x60;  A condition may contain:  * &#x60;?&#x60; as wildcard for one character;  * &#x60;*&#x60; as wildcard for any number of characters.  You can also use value ranges in the form &#x60;[min TO max]&#x60;.  Example: &#x60;customer.age:[30 TO 40]&#x60;  You can combine expressions logically by &#x60;expr AND expr&#x60; and &#x60;{expr} OR {expr}&#x60;. You can also negate an expression using &#x60;NOT {expr}&#x60;. Parenthesis &#x60;(...)&#x60; can be used to control precedence.  Example: &#x60;(NOT customer.name:meier*) AND (customer.age:[30 TO 40] OR customer.age:[50 TO 60])&#x60;
     * @param sort String with comma separated pairs of &#x60;field:order&#x60;.  Options for order:  * &#x60;asc&#x60; ascending;  * &#x60;desc&#x60; descending.
     * @return SmartDevicesList
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SmartDevicesList getAll(Integer count, Integer offset, String fields, String q, String sort) throws ApiException {
        ApiResponse<SmartDevicesList> resp = getAllWithHttpInfo(count, offset, fields, q, sort);
        return resp.getData();
    }

    /**
     * Find Smart Devices
     * Returns the Smart Devices matching the given criteria.
     * @param count The maximum number of items to return
     * @param offset The position within the whole result set to start returning items (zero-based)
     * @param fields List of fields to include in the result, all others will be filtered out. Nested properties can be accessed with this notation: &#x60;prop1.prop2&#x60;.
     * @param q A query string to restrict the returned items to given conditions. The query string must consist of any combination of single expressions in the form &#x60;property:condition&#x60;. Property names can be nested like &#x60;property.property&#x60;.  Example: &#x60;customer.name:Meier&#x60;  A condition may contain:  * &#x60;?&#x60; as wildcard for one character;  * &#x60;*&#x60; as wildcard for any number of characters.  You can also use value ranges in the form &#x60;[min TO max]&#x60;.  Example: &#x60;customer.age:[30 TO 40]&#x60;  You can combine expressions logically by &#x60;expr AND expr&#x60; and &#x60;{expr} OR {expr}&#x60;. You can also negate an expression using &#x60;NOT {expr}&#x60;. Parenthesis &#x60;(...)&#x60; can be used to control precedence.  Example: &#x60;(NOT customer.name:meier*) AND (customer.age:[30 TO 40] OR customer.age:[50 TO 60])&#x60;
     * @param sort String with comma separated pairs of &#x60;field:order&#x60;.  Options for order:  * &#x60;asc&#x60; ascending;  * &#x60;desc&#x60; descending.
     * @return ApiResponse&lt;SmartDevicesList&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SmartDevicesList> getAllWithHttpInfo(Integer count, Integer offset, String fields, String q, String sort) throws ApiException {
        Call call = getAllValidateBeforeCall(count, offset, fields, q, sort);
        Type localVarReturnType = new TypeToken<SmartDevicesList>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Find Smart Devices (asynchronously)
     * Returns the Smart Devices matching the given criteria.
     * @param count The maximum number of items to return
     * @param offset The position within the whole result set to start returning items (zero-based)
     * @param fields List of fields to include in the result, all others will be filtered out. Nested properties can be accessed with this notation: &#x60;prop1.prop2&#x60;.
     * @param q A query string to restrict the returned items to given conditions. The query string must consist of any combination of single expressions in the form &#x60;property:condition&#x60;. Property names can be nested like &#x60;property.property&#x60;.  Example: &#x60;customer.name:Meier&#x60;  A condition may contain:  * &#x60;?&#x60; as wildcard for one character;  * &#x60;*&#x60; as wildcard for any number of characters.  You can also use value ranges in the form &#x60;[min TO max]&#x60;.  Example: &#x60;customer.age:[30 TO 40]&#x60;  You can combine expressions logically by &#x60;expr AND expr&#x60; and &#x60;{expr} OR {expr}&#x60;. You can also negate an expression using &#x60;NOT {expr}&#x60;. Parenthesis &#x60;(...)&#x60; can be used to control precedence.  Example: &#x60;(NOT customer.name:meier*) AND (customer.age:[30 TO 40] OR customer.age:[50 TO 60])&#x60;
     * @param sort String with comma separated pairs of &#x60;field:order&#x60;.  Options for order:  * &#x60;asc&#x60; ascending;  * &#x60;desc&#x60; descending.
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call getAllAsync(Integer count, Integer offset, String fields, String q, String sort, final ApiCallback<SmartDevicesList> callback) throws ApiException {
        Call call = getAllValidateBeforeCall(count, offset, fields, q, sort);
        Type localVarReturnType = new TypeToken<SmartDevicesList>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for getOne
     * @param smartDeviceId Smart device id (required)
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public Call getOneCall(String smartDeviceId) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/Smart/Devices/{smartDeviceId}"
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
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames);
    }

    @SuppressWarnings("rawtypes")
    private Call getOneValidateBeforeCall(String smartDeviceId) throws ApiException {
        // verify the required parameter 'smartDeviceId' is set
        if (smartDeviceId == null) {
            throw new ApiException("Missing the required parameter 'smartDeviceId' when calling getOne(Async)");
        }

        return getOneCall(smartDeviceId);
    }

    /**
     * Read Smart Device
     * Returns the specified Smart Device.
     * @param smartDeviceId Smart device id (required)
     * @return SmartDevicesProductModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SmartDevicesProductModel getOne(String smartDeviceId) throws ApiException {
        ApiResponse<SmartDevicesProductModel> resp = getOneWithHttpInfo(smartDeviceId);
        return resp.getData();
    }

    /**
     * Read Smart Device
     * Returns the specified Smart Device.
     * @param smartDeviceId Smart device id (required)
     * @return ApiResponse&lt;SmartDevicesProductModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SmartDevicesProductModel> getOneWithHttpInfo(String smartDeviceId) throws ApiException {
        Call call = getOneValidateBeforeCall(smartDeviceId);
        Type localVarReturnType = new TypeToken<SmartDevicesProductModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Read Smart Device (asynchronously)
     * Returns the specified Smart Device.
     * @param smartDeviceId Smart device id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call getOneAsync(String smartDeviceId, final ApiCallback<SmartDevicesProductModel> callback) throws ApiException {
        Call call = getOneValidateBeforeCall(smartDeviceId);
        Type localVarReturnType = new TypeToken<SmartDevicesProductModel>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for getRouting
     * @param smartDeviceId Smart device id (required)
     * @param type Smart Device Type (required)
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public Call getRoutingCall(String smartDeviceId, String type) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/Smart/Devices/{smartDeviceId}/routing/{type}"
            .replaceAll("\\{" + "smartDeviceId" + "\\}", apiClient.escapeString(smartDeviceId.toString()))
            .replaceAll("\\{" + "type" + "\\}", apiClient.escapeString(type.toString()));

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
    private Call getRoutingValidateBeforeCall(String smartDeviceId, String type) throws ApiException {
        // verify the required parameter 'smartDeviceId' is set
        if (smartDeviceId == null) {
            throw new ApiException("Missing the required parameter 'smartDeviceId' when calling getRouting(Async)");
        }
        // verify the required parameter 'type' is set
        if (type == null) {
            throw new ApiException("Missing the required parameter 'type' when calling getRouting(Async)");
        }

        return getRoutingCall(smartDeviceId, type);
    }

    /**
     * Get with routing
     * Returns the specified Smart Device if it is assigned to a single routing.
     * @param smartDeviceId Smart device id (required)
     * @param type Smart Device Type (required)
     * @return SmartDevicesProductModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SmartDevicesProductModel getRouting(String smartDeviceId, String type) throws ApiException {
        ApiResponse<SmartDevicesProductModel> resp = getRoutingWithHttpInfo(smartDeviceId, type);
        return resp.getData();
    }

    /**
     * Get with routing
     * Returns the specified Smart Device if it is assigned to a single routing.
     * @param smartDeviceId Smart device id (required)
     * @param type Smart Device Type (required)
     * @return ApiResponse&lt;SmartDevicesProductModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SmartDevicesProductModel> getRoutingWithHttpInfo(String smartDeviceId, String type) throws ApiException {
        Call call = getRoutingValidateBeforeCall(smartDeviceId, type);
        Type localVarReturnType = new TypeToken<SmartDevicesProductModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get with routing (asynchronously)
     * Returns the specified Smart Device if it is assigned to a single routing.
     * @param smartDeviceId Smart device id (required)
     * @param type Smart Device Type (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call getRoutingAsync(String smartDeviceId, String type, final ApiCallback<SmartDevicesProductModel> callback) throws ApiException {
        Call call = getRoutingValidateBeforeCall(smartDeviceId, type);
        Type localVarReturnType = new TypeToken<SmartDevicesProductModel>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for updateDevice
     * @param smartDeviceId Smart device id (required)
     * @param body Smart device properties
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public Call updateDeviceCall(String smartDeviceId, SmartDevicesDTO body) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/Smart/Devices/{smartDeviceId}"
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
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames);
    }

    @SuppressWarnings("rawtypes")
    private Call updateDeviceValidateBeforeCall(String smartDeviceId, SmartDevicesDTO body) throws ApiException {
        // verify the required parameter 'smartDeviceId' is set
        if (smartDeviceId == null) {
            throw new ApiException("Missing the required parameter 'smartDeviceId' when calling updateDevice(Async)");
        }

        return updateDeviceCall(smartDeviceId, body);
    }

    /**
     * Update Smart Device
     * Updates the specified Smart Device with the given data.
     * @param smartDeviceId Smart device id (required)
     * @param body Smart device properties
     * @return SmartDevicesProductModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SmartDevicesProductModel updateDevice(String smartDeviceId, SmartDevicesDTO body) throws ApiException {
        ApiResponse<SmartDevicesProductModel> resp = updateDeviceWithHttpInfo(smartDeviceId, body);
        return resp.getData();
    }

    /**
     * Update Smart Device
     * Updates the specified Smart Device with the given data.
     * @param smartDeviceId Smart device id (required)
     * @param body Smart device properties
     * @return ApiResponse&lt;SmartDevicesProductModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SmartDevicesProductModel> updateDeviceWithHttpInfo(String smartDeviceId, SmartDevicesDTO body) throws ApiException {
        Call call = updateDeviceValidateBeforeCall(smartDeviceId, body);
        Type localVarReturnType = new TypeToken<SmartDevicesProductModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Update Smart Device (asynchronously)
     * Updates the specified Smart Device with the given data.
     * @param smartDeviceId Smart device id (required)
     * @param body Smart device properties
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call updateDeviceAsync(String smartDeviceId, SmartDevicesDTO body, final ApiCallback<SmartDevicesProductModel> callback) throws ApiException {
        Call call = updateDeviceValidateBeforeCall(smartDeviceId, body);
        Type localVarReturnType = new TypeToken<SmartDevicesProductModel>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for updatePin
     * @param smartDeviceId Smart device id (required)
     * @param body Smart device properties
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public Call updatePinCall(String smartDeviceId, SmartDeviceUserPin body) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/Smart/Devices/{smartDeviceId}/pin"
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
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames);
    }

    @SuppressWarnings("rawtypes")
    private Call updatePinValidateBeforeCall(String smartDeviceId, SmartDeviceUserPin body) throws ApiException {
        // verify the required parameter 'smartDeviceId' is set
        if (smartDeviceId == null) {
            throw new ApiException("Missing the required parameter 'smartDeviceId' when calling updatePin(Async)");
        }

        return updatePinCall(smartDeviceId, body);
    }

    /**
     * Set device PIN
     * Sets the PIN that needs to be passed to authenticate the Smart Device.
     * @param smartDeviceId Smart device id (required)
     * @param body Smart device properties
     * @return SmartDevicesProductModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SmartDevicesProductModel updatePin(String smartDeviceId, SmartDeviceUserPin body) throws ApiException {
        ApiResponse<SmartDevicesProductModel> resp = updatePinWithHttpInfo(smartDeviceId, body);
        return resp.getData();
    }

    /**
     * Set device PIN
     * Sets the PIN that needs to be passed to authenticate the Smart Device.
     * @param smartDeviceId Smart device id (required)
     * @param body Smart device properties
     * @return ApiResponse&lt;SmartDevicesProductModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SmartDevicesProductModel> updatePinWithHttpInfo(String smartDeviceId, SmartDeviceUserPin body) throws ApiException {
        Call call = updatePinValidateBeforeCall(smartDeviceId, body);
        Type localVarReturnType = new TypeToken<SmartDevicesProductModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Set device PIN (asynchronously)
     * Sets the PIN that needs to be passed to authenticate the Smart Device.
     * @param smartDeviceId Smart device id (required)
     * @param body Smart device properties
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call updatePinAsync(String smartDeviceId, SmartDeviceUserPin body, final ApiCallback<SmartDevicesProductModel> callback) throws ApiException {
        Call call = updatePinValidateBeforeCall(smartDeviceId, body);
        Type localVarReturnType = new TypeToken<SmartDevicesProductModel>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}

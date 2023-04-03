package com.secuconnect.client.api;

import com.google.gson.reflect.TypeToken;
import com.secuconnect.client.*;
import com.secuconnect.client.model.Aggregate;
import java.math.BigDecimal;
import com.secuconnect.client.model.GeneralStoresDTO;
import com.secuconnect.client.model.GeneralStoresDTOReason;
import com.secuconnect.client.model.GeneralStoresDTOType;
import com.secuconnect.client.model.GeneralStoresList;
import com.secuconnect.client.model.GeneralStoresProductModel;
import com.secuconnect.client.model.ProductExceptionPayload;
import com.secuconnect.client.model.ResultBoolean;
import okhttp3.Call;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneralStoresApi {
    private ApiClient apiClient;

    public GeneralStoresApi() {
        this(Environment.getGlobalEnv().getApiClient());
    }

    public GeneralStoresApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for addStore
     * @param body General store properties
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public Call addStoreCall(GeneralStoresDTO body) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/General/Stores";

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
    private Call addStoreValidateBeforeCall(GeneralStoresDTO body) throws ApiException {

        return addStoreCall(body);
    }

    /**
     * POST General/Stores
     * Create general store
     * @param body General store properties
     * @return GeneralStoresProductModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public GeneralStoresProductModel addStore(GeneralStoresDTO body) throws ApiException {
        ApiResponse<GeneralStoresProductModel> resp = addStoreWithHttpInfo(body);
        return resp.getData();
    }

    /**
     * POST General/Stores
     * Create general store
     * @param body General store properties
     * @return ApiResponse&lt;GeneralStoresProductModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<GeneralStoresProductModel> addStoreWithHttpInfo(GeneralStoresDTO body) throws ApiException {
        Call call = addStoreValidateBeforeCall(body);
        Type localVarReturnType = new TypeToken<GeneralStoresProductModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * POST General/Stores (asynchronously)
     * Create general store
     * @param body General store properties
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call addStoreAsync(GeneralStoresDTO body, final ApiCallback<GeneralStoresProductModel> callback) throws ApiException {
        Call call = addStoreValidateBeforeCall(body);
        Type localVarReturnType = new TypeToken<GeneralStoresProductModel>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for checkIn
     * @param generalStoreId General store id (required)
     * @param body General store properties
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public Call checkInCall(String generalStoreId, GeneralStoresDTOType body) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/General/Stores/{generalStoreId}/checkin"
            .replaceAll("\\{" + "generalStoreId" + "\\}", apiClient.escapeString(generalStoreId.toString()));

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
    private Call checkInValidateBeforeCall(String generalStoreId, GeneralStoresDTOType body) throws ApiException {
        // verify the required parameter 'generalStoreId' is set
        if (generalStoreId == null) {
            throw new ApiException("Missing the required parameter 'generalStoreId' when calling checkIn(Async)");
        }

        return checkInCall(generalStoreId, body);
    }

    /**
     * POST General/Stores/{generalStoreId}/checkin
     * Check in
     * @param generalStoreId General store id (required)
     * @param body General store properties
     * @return ResultBoolean
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ResultBoolean checkIn(String generalStoreId, GeneralStoresDTOType body) throws ApiException {
        ApiResponse<ResultBoolean> resp = checkInWithHttpInfo(generalStoreId, body);
        return resp.getData();
    }

    /**
     * POST General/Stores/{generalStoreId}/checkin
     * Check in
     * @param generalStoreId General store id (required)
     * @param body General store properties
     * @return ApiResponse&lt;ResultBoolean&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ResultBoolean> checkInWithHttpInfo(String generalStoreId, GeneralStoresDTOType body) throws ApiException {
        Call call = checkInValidateBeforeCall(generalStoreId, body);
        Type localVarReturnType = new TypeToken<ResultBoolean>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * POST General/Stores/{generalStoreId}/checkin (asynchronously)
     * Check in
     * @param generalStoreId General store id (required)
     * @param body General store properties
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call checkInAsync(String generalStoreId, GeneralStoresDTOType body, final ApiCallback<ResultBoolean> callback) throws ApiException {
        Call call = checkInValidateBeforeCall(generalStoreId, body);
        Type localVarReturnType = new TypeToken<ResultBoolean>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for getAll
     * @param count The maximum number of items to return
     * @param offset The position within the whole result set to start returning items (zero-based)
     * @param fields List of fields to include in the result. Nested properties can be accessed with this notation: &#x60;prop1.prop2&#x60;.
     * @param q A query string to restrict the returned items to given conditions. The query string must consist of any combination of single expressions in the form &#x60;property:condition&#x60;. Property names can be nested like &#x60;property.property&#x60;.  Example: &#x60;customer.name:Meier&#x60;  A condition may contain:  * &#x60;?&#x60; as wildcard for one character;  * &#x60;*&#x60; as wildcard for any number of characters.  You can also use value ranges in the form &#x60;[min TO max]&#x60;.  Example: &#x60;customer.age:[30 TO 40]&#x60;  You can combine expressions logically by &#x60;expr AND expr&#x60; and &#x60;{expr} OR {expr}&#x60;. You can also negate an expression using &#x60;NOT {expr}&#x60;. Parenthesis &#x60;(...)&#x60; can be used to control precedence.  Example: &#x60;(NOT customer.name:meier*) AND (customer.age:[30 TO 40] OR customer.age:[50 TO 60])&#x60;
     * @param sort String with comma separated pairs of &#x60;field:order&#x60;.  Options for order:  * &#x60;asc&#x60; ascending;  * &#x60;dsc&#x60; descending.
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public Call getAllCall(Integer count, Integer offset, String fields, String q, String sort) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/General/Stores";

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
     * GET General/Stores
     * Get a list of general stores
     * @param count The maximum number of items to return
     * @param offset The position within the whole result set to start returning items (zero-based)
     * @param fields List of fields to include in the result. Nested properties can be accessed with this notation: &#x60;prop1.prop2&#x60;.
     * @param q A query string to restrict the returned items to given conditions. The query string must consist of any combination of single expressions in the form &#x60;property:condition&#x60;. Property names can be nested like &#x60;property.property&#x60;.  Example: &#x60;customer.name:Meier&#x60;  A condition may contain:  * &#x60;?&#x60; as wildcard for one character;  * &#x60;*&#x60; as wildcard for any number of characters.  You can also use value ranges in the form &#x60;[min TO max]&#x60;.  Example: &#x60;customer.age:[30 TO 40]&#x60;  You can combine expressions logically by &#x60;expr AND expr&#x60; and &#x60;{expr} OR {expr}&#x60;. You can also negate an expression using &#x60;NOT {expr}&#x60;. Parenthesis &#x60;(...)&#x60; can be used to control precedence.  Example: &#x60;(NOT customer.name:meier*) AND (customer.age:[30 TO 40] OR customer.age:[50 TO 60])&#x60;
     * @param sort String with comma separated pairs of &#x60;field:order&#x60;.  Options for order:  * &#x60;asc&#x60; ascending;  * &#x60;dsc&#x60; descending.
     * @return GeneralStoresList
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public GeneralStoresList getAll(Integer count, Integer offset, String fields, String q, String sort) throws ApiException {
        ApiResponse<GeneralStoresList> resp = getAllWithHttpInfo(count, offset, fields, q, sort);
        return resp.getData();
    }

    /**
     * GET General/Stores
     * Get a list of general stores
     * @param count The maximum number of items to return
     * @param offset The position within the whole result set to start returning items (zero-based)
     * @param fields List of fields to include in the result. Nested properties can be accessed with this notation: &#x60;prop1.prop2&#x60;.
     * @param q A query string to restrict the returned items to given conditions. The query string must consist of any combination of single expressions in the form &#x60;property:condition&#x60;. Property names can be nested like &#x60;property.property&#x60;.  Example: &#x60;customer.name:Meier&#x60;  A condition may contain:  * &#x60;?&#x60; as wildcard for one character;  * &#x60;*&#x60; as wildcard for any number of characters.  You can also use value ranges in the form &#x60;[min TO max]&#x60;.  Example: &#x60;customer.age:[30 TO 40]&#x60;  You can combine expressions logically by &#x60;expr AND expr&#x60; and &#x60;{expr} OR {expr}&#x60;. You can also negate an expression using &#x60;NOT {expr}&#x60;. Parenthesis &#x60;(...)&#x60; can be used to control precedence.  Example: &#x60;(NOT customer.name:meier*) AND (customer.age:[30 TO 40] OR customer.age:[50 TO 60])&#x60;
     * @param sort String with comma separated pairs of &#x60;field:order&#x60;.  Options for order:  * &#x60;asc&#x60; ascending;  * &#x60;dsc&#x60; descending.
     * @return ApiResponse&lt;GeneralStoresList&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<GeneralStoresList> getAllWithHttpInfo(Integer count, Integer offset, String fields, String q, String sort) throws ApiException {
        Call call = getAllValidateBeforeCall(count, offset, fields, q, sort);
        Type localVarReturnType = new TypeToken<GeneralStoresList>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * GET General/Stores (asynchronously)
     * Get a list of general stores
     * @param count The maximum number of items to return
     * @param offset The position within the whole result set to start returning items (zero-based)
     * @param fields List of fields to include in the result. Nested properties can be accessed with this notation: &#x60;prop1.prop2&#x60;.
     * @param q A query string to restrict the returned items to given conditions. The query string must consist of any combination of single expressions in the form &#x60;property:condition&#x60;. Property names can be nested like &#x60;property.property&#x60;.  Example: &#x60;customer.name:Meier&#x60;  A condition may contain:  * &#x60;?&#x60; as wildcard for one character;  * &#x60;*&#x60; as wildcard for any number of characters.  You can also use value ranges in the form &#x60;[min TO max]&#x60;.  Example: &#x60;customer.age:[30 TO 40]&#x60;  You can combine expressions logically by &#x60;expr AND expr&#x60; and &#x60;{expr} OR {expr}&#x60;. You can also negate an expression using &#x60;NOT {expr}&#x60;. Parenthesis &#x60;(...)&#x60; can be used to control precedence.  Example: &#x60;(NOT customer.name:meier*) AND (customer.age:[30 TO 40] OR customer.age:[50 TO 60])&#x60;
     * @param sort String with comma separated pairs of &#x60;field:order&#x60;.  Options for order:  * &#x60;asc&#x60; ascending;  * &#x60;dsc&#x60; descending.
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call getAllAsync(Integer count, Integer offset, String fields, String q, String sort, final ApiCallback<GeneralStoresList> callback) throws ApiException {
        Call call = getAllValidateBeforeCall(count, offset, fields, q, sort);
        Type localVarReturnType = new TypeToken<GeneralStoresList>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for getOne
     * @param generalStoreId General store id (required)
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public Call getOneCall(String generalStoreId) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/General/Stores/{generalStoreId}"
            .replaceAll("\\{" + "generalStoreId" + "\\}", apiClient.escapeString(generalStoreId.toString()));

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
    private Call getOneValidateBeforeCall(String generalStoreId) throws ApiException {
        // verify the required parameter 'generalStoreId' is set
        if (generalStoreId == null) {
            throw new ApiException("Missing the required parameter 'generalStoreId' when calling getOne(Async)");
        }

        return getOneCall(generalStoreId);
    }

    /**
     * GET General/Stores/{generalStoreId}
     * Get one general store for a specific id
     * @param generalStoreId General store id (required)
     * @return GeneralStoresProductModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public GeneralStoresProductModel getOne(String generalStoreId) throws ApiException {
        ApiResponse<GeneralStoresProductModel> resp = getOneWithHttpInfo(generalStoreId);
        return resp.getData();
    }

    /**
     * GET General/Stores/{generalStoreId}
     * Get one general store for a specific id
     * @param generalStoreId General store id (required)
     * @return ApiResponse&lt;GeneralStoresProductModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<GeneralStoresProductModel> getOneWithHttpInfo(String generalStoreId) throws ApiException {
        Call call = getOneValidateBeforeCall(generalStoreId);
        Type localVarReturnType = new TypeToken<GeneralStoresProductModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * GET General/Stores/{generalStoreId} (asynchronously)
     * Get one general store for a specific id
     * @param generalStoreId General store id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call getOneAsync(String generalStoreId, final ApiCallback<GeneralStoresProductModel> callback) throws ApiException {
        Call call = getOneValidateBeforeCall(generalStoreId);
        Type localVarReturnType = new TypeToken<GeneralStoresProductModel>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for setDefault
     * @param generalStoreId General store id (required)
     * @param body Reason
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public Call setDefaultCall(String generalStoreId, GeneralStoresDTOReason body) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/General/Stores/{generalStoreId}/setDefault"
            .replaceAll("\\{" + "generalStoreId" + "\\}", apiClient.escapeString(generalStoreId.toString()));

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
    private Call setDefaultValidateBeforeCall(String generalStoreId, GeneralStoresDTOReason body) throws ApiException {
        // verify the required parameter 'generalStoreId' is set
        if (generalStoreId == null) {
            throw new ApiException("Missing the required parameter 'generalStoreId' when calling setDefault(Async)");
        }

        return setDefaultCall(generalStoreId, body);
    }

    /**
     * POST General/Stores/{generalStoreId}/setDefault
     * Set default flag on general store
     * @param generalStoreId General store id (required)
     * @param body Reason
     * @return ResultBoolean
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ResultBoolean setDefault(String generalStoreId, GeneralStoresDTOReason body) throws ApiException {
        ApiResponse<ResultBoolean> resp = setDefaultWithHttpInfo(generalStoreId, body);
        return resp.getData();
    }

    /**
     * POST General/Stores/{generalStoreId}/setDefault
     * Set default flag on general store
     * @param generalStoreId General store id (required)
     * @param body Reason
     * @return ApiResponse&lt;ResultBoolean&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ResultBoolean> setDefaultWithHttpInfo(String generalStoreId, GeneralStoresDTOReason body) throws ApiException {
        Call call = setDefaultValidateBeforeCall(generalStoreId, body);
        Type localVarReturnType = new TypeToken<ResultBoolean>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * POST General/Stores/{generalStoreId}/setDefault (asynchronously)
     * Set default flag on general store
     * @param generalStoreId General store id (required)
     * @param body Reason
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call setDefaultAsync(String generalStoreId, GeneralStoresDTOReason body, final ApiCallback<ResultBoolean> callback) throws ApiException {
        Call call = setDefaultValidateBeforeCall(generalStoreId, body);
        Type localVarReturnType = new TypeToken<ResultBoolean>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for updateStore
     * @param generalStoreId General store id (required)
     * @param body General store properties
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public Call updateStoreCall(String generalStoreId, GeneralStoresDTO body) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/General/Stores/{generalStoreId}"
            .replaceAll("\\{" + "generalStoreId" + "\\}", apiClient.escapeString(generalStoreId.toString()));

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
    private Call updateStoreValidateBeforeCall(String generalStoreId, GeneralStoresDTO body) throws ApiException {
        // verify the required parameter 'generalStoreId' is set
        if (generalStoreId == null) {
            throw new ApiException("Missing the required parameter 'generalStoreId' when calling updateStore(Async)");
        }

        return updateStoreCall(generalStoreId, body);
    }

    /**
     * PUT General/Stores/{generalStoreId}
     * Update general store
     * @param generalStoreId General store id (required)
     * @param body General store properties
     * @return GeneralStoresProductModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public GeneralStoresProductModel updateStore(String generalStoreId, GeneralStoresDTO body) throws ApiException {
        ApiResponse<GeneralStoresProductModel> resp = updateStoreWithHttpInfo(generalStoreId, body);
        return resp.getData();
    }

    /**
     * PUT General/Stores/{generalStoreId}
     * Update general store
     * @param generalStoreId General store id (required)
     * @param body General store properties
     * @return ApiResponse&lt;GeneralStoresProductModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<GeneralStoresProductModel> updateStoreWithHttpInfo(String generalStoreId, GeneralStoresDTO body) throws ApiException {
        Call call = updateStoreValidateBeforeCall(generalStoreId, body);
        Type localVarReturnType = new TypeToken<GeneralStoresProductModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * PUT General/Stores/{generalStoreId} (asynchronously)
     * Update general store
     * @param generalStoreId General store id (required)
     * @param body General store properties
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call updateStoreAsync(String generalStoreId, GeneralStoresDTO body, final ApiCallback<GeneralStoresProductModel> callback) throws ApiException {
        Call call = updateStoreValidateBeforeCall(generalStoreId, body);
        Type localVarReturnType = new TypeToken<GeneralStoresProductModel>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}

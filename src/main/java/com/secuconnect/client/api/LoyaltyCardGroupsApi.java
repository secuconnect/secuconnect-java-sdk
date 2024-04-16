package com.secuconnect.client.api;

import com.google.gson.reflect.TypeToken;
import com.secuconnect.client.*;
import com.secuconnect.client.model.Aggregate;
import java.math.BigDecimal;
import com.secuconnect.client.model.LoyaltyCardgroupsDTO;
import com.secuconnect.client.model.LoyaltyCardgroupsDTOCheckPasscodeEnabled;
import com.secuconnect.client.model.LoyaltyCardgroupsList;
import com.secuconnect.client.model.LoyaltyCardgroupsProductModel;
import com.secuconnect.client.model.LoyaltyCardgroupsUpdateDTO;
import com.secuconnect.client.model.ProductExceptionPayload;
import com.secuconnect.client.model.ResultBoolean;
import okhttp3.Call;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LoyaltyCardGroupsApi {
    private ApiClient apiClient;

    public LoyaltyCardGroupsApi() {
        this(Environment.getGlobalEnv().getApiClient());
    }

    public LoyaltyCardGroupsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for addCardGroup
     * @param body Loyalty Card Group details
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public Call addCardGroupCall(LoyaltyCardgroupsDTO body) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/Loyalty/Cardgroups";

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
    private Call addCardGroupValidateBeforeCall(LoyaltyCardgroupsDTO body) throws ApiException {

        return addCardGroupCall(body);
    }

    /**
     * Create Loyalty Card Group
     * Creates a new Loyalty Cardgroup using the given data.
     * @param body Loyalty Card Group details
     * @return LoyaltyCardgroupsProductModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public LoyaltyCardgroupsProductModel addCardGroup(LoyaltyCardgroupsDTO body) throws ApiException {
        ApiResponse<LoyaltyCardgroupsProductModel> resp = addCardGroupWithHttpInfo(body);
        return resp.getData();
    }

    /**
     * Create Loyalty Card Group
     * Creates a new Loyalty Cardgroup using the given data.
     * @param body Loyalty Card Group details
     * @return ApiResponse&lt;LoyaltyCardgroupsProductModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<LoyaltyCardgroupsProductModel> addCardGroupWithHttpInfo(LoyaltyCardgroupsDTO body) throws ApiException {
        Call call = addCardGroupValidateBeforeCall(body);
        Type localVarReturnType = new TypeToken<LoyaltyCardgroupsProductModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Create Loyalty Card Group (asynchronously)
     * Creates a new Loyalty Cardgroup using the given data.
     * @param body Loyalty Card Group details
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call addCardGroupAsync(LoyaltyCardgroupsDTO body, final ApiCallback<LoyaltyCardgroupsProductModel> callback) throws ApiException {
        Call call = addCardGroupValidateBeforeCall(body);
        Type localVarReturnType = new TypeToken<LoyaltyCardgroupsProductModel>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for checkPassCodeEnabled
     * @param loyaltyCardGroupId Loyalty Card Group ID (required)
     * @param body Check passcode details
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public Call checkPassCodeEnabledCall(String loyaltyCardGroupId, LoyaltyCardgroupsDTOCheckPasscodeEnabled body) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/Loyalty/Cardgroups/{loyaltyCardGroupId}/checkPasscodeEnabled"
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
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "oauth_token" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames);
    }

    @SuppressWarnings("rawtypes")
    private Call checkPassCodeEnabledValidateBeforeCall(String loyaltyCardGroupId, LoyaltyCardgroupsDTOCheckPasscodeEnabled body) throws ApiException {
        // verify the required parameter 'loyaltyCardGroupId' is set
        if (loyaltyCardGroupId == null) {
            throw new ApiException("Missing the required parameter 'loyaltyCardGroupId' when calling checkPassCodeEnabled(Async)");
        }

        return checkPassCodeEnabledCall(loyaltyCardGroupId, body);
    }

    /**
     * Check need for passcode check
     * Checks whether the passcode check is enabled, and therefore required, for a specific action.
     * @param loyaltyCardGroupId Loyalty Card Group ID (required)
     * @param body Check passcode details
     * @return ResultBoolean
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ResultBoolean checkPassCodeEnabled(String loyaltyCardGroupId, LoyaltyCardgroupsDTOCheckPasscodeEnabled body) throws ApiException {
        ApiResponse<ResultBoolean> resp = checkPassCodeEnabledWithHttpInfo(loyaltyCardGroupId, body);
        return resp.getData();
    }

    /**
     * Check need for passcode check
     * Checks whether the passcode check is enabled, and therefore required, for a specific action.
     * @param loyaltyCardGroupId Loyalty Card Group ID (required)
     * @param body Check passcode details
     * @return ApiResponse&lt;ResultBoolean&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ResultBoolean> checkPassCodeEnabledWithHttpInfo(String loyaltyCardGroupId, LoyaltyCardgroupsDTOCheckPasscodeEnabled body) throws ApiException {
        Call call = checkPassCodeEnabledValidateBeforeCall(loyaltyCardGroupId, body);
        Type localVarReturnType = new TypeToken<ResultBoolean>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Check need for passcode check (asynchronously)
     * Checks whether the passcode check is enabled, and therefore required, for a specific action.
     * @param loyaltyCardGroupId Loyalty Card Group ID (required)
     * @param body Check passcode details
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call checkPassCodeEnabledAsync(String loyaltyCardGroupId, LoyaltyCardgroupsDTOCheckPasscodeEnabled body, final ApiCallback<ResultBoolean> callback) throws ApiException {
        Call call = checkPassCodeEnabledValidateBeforeCall(loyaltyCardGroupId, body);
        Type localVarReturnType = new TypeToken<ResultBoolean>(){}.getType();
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
        String localVarPath = "/Loyalty/Cardgroups";

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
     * Find Loyalty Card Groups
     * Returns the Loyalty Card Groups matching the given criteria.
     * @param count The maximum number of items to return
     * @param offset The position within the whole result set to start returning items (zero-based)
     * @param fields List of fields to include in the result, all others will be filtered out. Nested properties can be accessed with this notation: &#x60;prop1.prop2&#x60;.
     * @param q A query string to restrict the returned items to given conditions. The query string must consist of any combination of single expressions in the form &#x60;property:condition&#x60;. Property names can be nested like &#x60;property.property&#x60;.  Example: &#x60;customer.name:Meier&#x60;  A condition may contain:  * &#x60;?&#x60; as wildcard for one character;  * &#x60;*&#x60; as wildcard for any number of characters.  You can also use value ranges in the form &#x60;[min TO max]&#x60;.  Example: &#x60;customer.age:[30 TO 40]&#x60;  You can combine expressions logically by &#x60;expr AND expr&#x60; and &#x60;{expr} OR {expr}&#x60;. You can also negate an expression using &#x60;NOT {expr}&#x60;. Parenthesis &#x60;(...)&#x60; can be used to control precedence.  Example: &#x60;(NOT customer.name:meier*) AND (customer.age:[30 TO 40] OR customer.age:[50 TO 60])&#x60;
     * @param sort String with comma separated pairs of &#x60;field:order&#x60;.  Options for order:  * &#x60;asc&#x60; ascending;  * &#x60;desc&#x60; descending.
     * @param expand Expand fields (all or a specific one)
     * @return LoyaltyCardgroupsList
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public LoyaltyCardgroupsList getAll(Integer count, Integer offset, String fields, String q, String sort, String expand) throws ApiException {
        ApiResponse<LoyaltyCardgroupsList> resp = getAllWithHttpInfo(count, offset, fields, q, sort, expand);
        return resp.getData();
    }

    /**
     * Find Loyalty Card Groups
     * Returns the Loyalty Card Groups matching the given criteria.
     * @param count The maximum number of items to return
     * @param offset The position within the whole result set to start returning items (zero-based)
     * @param fields List of fields to include in the result, all others will be filtered out. Nested properties can be accessed with this notation: &#x60;prop1.prop2&#x60;.
     * @param q A query string to restrict the returned items to given conditions. The query string must consist of any combination of single expressions in the form &#x60;property:condition&#x60;. Property names can be nested like &#x60;property.property&#x60;.  Example: &#x60;customer.name:Meier&#x60;  A condition may contain:  * &#x60;?&#x60; as wildcard for one character;  * &#x60;*&#x60; as wildcard for any number of characters.  You can also use value ranges in the form &#x60;[min TO max]&#x60;.  Example: &#x60;customer.age:[30 TO 40]&#x60;  You can combine expressions logically by &#x60;expr AND expr&#x60; and &#x60;{expr} OR {expr}&#x60;. You can also negate an expression using &#x60;NOT {expr}&#x60;. Parenthesis &#x60;(...)&#x60; can be used to control precedence.  Example: &#x60;(NOT customer.name:meier*) AND (customer.age:[30 TO 40] OR customer.age:[50 TO 60])&#x60;
     * @param sort String with comma separated pairs of &#x60;field:order&#x60;.  Options for order:  * &#x60;asc&#x60; ascending;  * &#x60;desc&#x60; descending.
     * @param expand Expand fields (all or a specific one)
     * @return ApiResponse&lt;LoyaltyCardgroupsList&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<LoyaltyCardgroupsList> getAllWithHttpInfo(Integer count, Integer offset, String fields, String q, String sort, String expand) throws ApiException {
        Call call = getAllValidateBeforeCall(count, offset, fields, q, sort, expand);
        Type localVarReturnType = new TypeToken<LoyaltyCardgroupsList>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Find Loyalty Card Groups (asynchronously)
     * Returns the Loyalty Card Groups matching the given criteria.
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
    public Call getAllAsync(Integer count, Integer offset, String fields, String q, String sort, String expand, final ApiCallback<LoyaltyCardgroupsList> callback) throws ApiException {
        Call call = getAllValidateBeforeCall(count, offset, fields, q, sort, expand);
        Type localVarReturnType = new TypeToken<LoyaltyCardgroupsList>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for getOne
     * @param loyaltyCardGroupId Loyalty Card Group ID (required)
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public Call getOneCall(String loyaltyCardGroupId) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/Loyalty/Cardgroups/{loyaltyCardGroupId}"
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
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames);
    }

    @SuppressWarnings("rawtypes")
    private Call getOneValidateBeforeCall(String loyaltyCardGroupId) throws ApiException {
        // verify the required parameter 'loyaltyCardGroupId' is set
        if (loyaltyCardGroupId == null) {
            throw new ApiException("Missing the required parameter 'loyaltyCardGroupId' when calling getOne(Async)");
        }

        return getOneCall(loyaltyCardGroupId);
    }

    /**
     * Read Loyalty Card Group
     * Returns the specified Loyalty Card Group.
     * @param loyaltyCardGroupId Loyalty Card Group ID (required)
     * @return LoyaltyCardgroupsProductModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public LoyaltyCardgroupsProductModel getOne(String loyaltyCardGroupId) throws ApiException {
        ApiResponse<LoyaltyCardgroupsProductModel> resp = getOneWithHttpInfo(loyaltyCardGroupId);
        return resp.getData();
    }

    /**
     * Read Loyalty Card Group
     * Returns the specified Loyalty Card Group.
     * @param loyaltyCardGroupId Loyalty Card Group ID (required)
     * @return ApiResponse&lt;LoyaltyCardgroupsProductModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<LoyaltyCardgroupsProductModel> getOneWithHttpInfo(String loyaltyCardGroupId) throws ApiException {
        Call call = getOneValidateBeforeCall(loyaltyCardGroupId);
        Type localVarReturnType = new TypeToken<LoyaltyCardgroupsProductModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Read Loyalty Card Group (asynchronously)
     * Returns the specified Loyalty Card Group.
     * @param loyaltyCardGroupId Loyalty Card Group ID (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call getOneAsync(String loyaltyCardGroupId, final ApiCallback<LoyaltyCardgroupsProductModel> callback) throws ApiException {
        Call call = getOneValidateBeforeCall(loyaltyCardGroupId);
        Type localVarReturnType = new TypeToken<LoyaltyCardgroupsProductModel>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for updateCardGroup
     * @param loyaltyCardGroupId Loyalty Card Group ID (required)
     * @param body Loyalty Card Group details
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public Call updateCardGroupCall(String loyaltyCardGroupId, LoyaltyCardgroupsUpdateDTO body) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/Loyalty/Cardgroups/{loyaltyCardGroupId}"
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
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "oauth_token" };
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames);
    }

    @SuppressWarnings("rawtypes")
    private Call updateCardGroupValidateBeforeCall(String loyaltyCardGroupId, LoyaltyCardgroupsUpdateDTO body) throws ApiException {
        // verify the required parameter 'loyaltyCardGroupId' is set
        if (loyaltyCardGroupId == null) {
            throw new ApiException("Missing the required parameter 'loyaltyCardGroupId' when calling updateCardGroup(Async)");
        }

        return updateCardGroupCall(loyaltyCardGroupId, body);
    }

    /**
     * Update Loyalty Card Group
     * Updates the specified Loyalty Card Group using the given data.
     * @param loyaltyCardGroupId Loyalty Card Group ID (required)
     * @param body Loyalty Card Group details
     * @return LoyaltyCardgroupsProductModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public LoyaltyCardgroupsProductModel updateCardGroup(String loyaltyCardGroupId, LoyaltyCardgroupsUpdateDTO body) throws ApiException {
        ApiResponse<LoyaltyCardgroupsProductModel> resp = updateCardGroupWithHttpInfo(loyaltyCardGroupId, body);
        return resp.getData();
    }

    /**
     * Update Loyalty Card Group
     * Updates the specified Loyalty Card Group using the given data.
     * @param loyaltyCardGroupId Loyalty Card Group ID (required)
     * @param body Loyalty Card Group details
     * @return ApiResponse&lt;LoyaltyCardgroupsProductModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<LoyaltyCardgroupsProductModel> updateCardGroupWithHttpInfo(String loyaltyCardGroupId, LoyaltyCardgroupsUpdateDTO body) throws ApiException {
        Call call = updateCardGroupValidateBeforeCall(loyaltyCardGroupId, body);
        Type localVarReturnType = new TypeToken<LoyaltyCardgroupsProductModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Update Loyalty Card Group (asynchronously)
     * Updates the specified Loyalty Card Group using the given data.
     * @param loyaltyCardGroupId Loyalty Card Group ID (required)
     * @param body Loyalty Card Group details
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call updateCardGroupAsync(String loyaltyCardGroupId, LoyaltyCardgroupsUpdateDTO body, final ApiCallback<LoyaltyCardgroupsProductModel> callback) throws ApiException {
        Call call = updateCardGroupValidateBeforeCall(loyaltyCardGroupId, body);
        Type localVarReturnType = new TypeToken<LoyaltyCardgroupsProductModel>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}

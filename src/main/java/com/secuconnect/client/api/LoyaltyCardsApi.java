package com.secuconnect.client.api;

import com.google.gson.reflect.TypeToken;
import com.secuconnect.client.*;
import com.secuconnect.client.model.Aggregate;
import java.math.BigDecimal;
import com.secuconnect.client.model.CardPin;
import com.secuconnect.client.model.LoyaltyCardsList;
import com.secuconnect.client.model.LoyaltyCardsProductModel;
import com.secuconnect.client.model.ProductExceptionPayload;
import com.secuconnect.client.model.ResultBoolean;
import okhttp3.Call;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LoyaltyCardsApi {
    private ApiClient apiClient;

    public LoyaltyCardsApi() {
        this(Environment.getGlobalEnv().getApiClient());
    }

    public LoyaltyCardsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for assignUser
     * @param loyaltyCardId Loyalty card id (required)
     * @param generalAccountId General account id (required)
     * @param body Loyalty card pin for the specific card
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public Call assignUserCall(String loyaltyCardId, String generalAccountId, CardPin body) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/Loyalty/Cards/{loyaltyCardId}/assignUser/{generalAccountId}"
            .replaceAll("\\{" + "loyaltyCardId" + "\\}", apiClient.escapeString(loyaltyCardId.toString()))
            .replaceAll("\\{" + "generalAccountId" + "\\}", apiClient.escapeString(generalAccountId.toString()));

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
    private Call assignUserValidateBeforeCall(String loyaltyCardId, String generalAccountId, CardPin body) throws ApiException {
        // verify the required parameter 'loyaltyCardId' is set
        if (loyaltyCardId == null) {
            throw new ApiException("Missing the required parameter 'loyaltyCardId' when calling assignUser(Async)");
        }
        // verify the required parameter 'generalAccountId' is set
        if (generalAccountId == null) {
            throw new ApiException("Missing the required parameter 'generalAccountId' when calling assignUser(Async)");
        }

        return assignUserCall(loyaltyCardId, generalAccountId, body);
    }

    /**
     * POST Loyalty/Cards/{loyaltyCardId}/assignUser/{generalAccountId}
     * Assign loyalty card to specific user account
     * @param loyaltyCardId Loyalty card id (required)
     * @param generalAccountId General account id (required)
     * @param body Loyalty card pin for the specific card
     * @return ResultBoolean
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ResultBoolean assignUser(String loyaltyCardId, String generalAccountId, CardPin body) throws ApiException {
        ApiResponse<ResultBoolean> resp = assignUserWithHttpInfo(loyaltyCardId, generalAccountId, body);
        return resp.getData();
    }

    /**
     * POST Loyalty/Cards/{loyaltyCardId}/assignUser/{generalAccountId}
     * Assign loyalty card to specific user account
     * @param loyaltyCardId Loyalty card id (required)
     * @param generalAccountId General account id (required)
     * @param body Loyalty card pin for the specific card
     * @return ApiResponse&lt;ResultBoolean&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ResultBoolean> assignUserWithHttpInfo(String loyaltyCardId, String generalAccountId, CardPin body) throws ApiException {
        Call call = assignUserValidateBeforeCall(loyaltyCardId, generalAccountId, body);
        Type localVarReturnType = new TypeToken<ResultBoolean>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * POST Loyalty/Cards/{loyaltyCardId}/assignUser/{generalAccountId} (asynchronously)
     * Assign loyalty card to specific user account
     * @param loyaltyCardId Loyalty card id (required)
     * @param generalAccountId General account id (required)
     * @param body Loyalty card pin for the specific card
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call assignUserAsync(String loyaltyCardId, String generalAccountId, CardPin body, final ApiCallback<ResultBoolean> callback) throws ApiException {
        Call call = assignUserValidateBeforeCall(loyaltyCardId, generalAccountId, body);
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
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public Call getAllCall(Integer count, Integer offset, String fields, String q, String sort) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/Loyalty/Cards";

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
     * GET Loyalty/Cards
     * Get a list of loyalty cards
     * @param count The maximum number of items to return
     * @param offset The position within the whole result set to start returning items (zero-based)
     * @param fields List of fields to include in the result, all others will be filtered out. Nested properties can be accessed with this notation: &#x60;prop1.prop2&#x60;.
     * @param q A query string to restrict the returned items to given conditions. The query string must consist of any combination of single expressions in the form &#x60;property:condition&#x60;. Property names can be nested like &#x60;property.property&#x60;.  Example: &#x60;customer.name:Meier&#x60;  A condition may contain:  * &#x60;?&#x60; as wildcard for one character;  * &#x60;*&#x60; as wildcard for any number of characters.  You can also use value ranges in the form &#x60;[min TO max]&#x60;.  Example: &#x60;customer.age:[30 TO 40]&#x60;  You can combine expressions logically by &#x60;expr AND expr&#x60; and &#x60;{expr} OR {expr}&#x60;. You can also negate an expression using &#x60;NOT {expr}&#x60;. Parenthesis &#x60;(...)&#x60; can be used to control precedence.  Example: &#x60;(NOT customer.name:meier*) AND (customer.age:[30 TO 40] OR customer.age:[50 TO 60])&#x60;
     * @param sort String with comma separated pairs of &#x60;field:order&#x60;.  Options for order:  * &#x60;asc&#x60; ascending;  * &#x60;desc&#x60; descending.
     * @return LoyaltyCardsList
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public LoyaltyCardsList getAll(Integer count, Integer offset, String fields, String q, String sort) throws ApiException {
        ApiResponse<LoyaltyCardsList> resp = getAllWithHttpInfo(count, offset, fields, q, sort);
        return resp.getData();
    }

    /**
     * GET Loyalty/Cards
     * Get a list of loyalty cards
     * @param count The maximum number of items to return
     * @param offset The position within the whole result set to start returning items (zero-based)
     * @param fields List of fields to include in the result, all others will be filtered out. Nested properties can be accessed with this notation: &#x60;prop1.prop2&#x60;.
     * @param q A query string to restrict the returned items to given conditions. The query string must consist of any combination of single expressions in the form &#x60;property:condition&#x60;. Property names can be nested like &#x60;property.property&#x60;.  Example: &#x60;customer.name:Meier&#x60;  A condition may contain:  * &#x60;?&#x60; as wildcard for one character;  * &#x60;*&#x60; as wildcard for any number of characters.  You can also use value ranges in the form &#x60;[min TO max]&#x60;.  Example: &#x60;customer.age:[30 TO 40]&#x60;  You can combine expressions logically by &#x60;expr AND expr&#x60; and &#x60;{expr} OR {expr}&#x60;. You can also negate an expression using &#x60;NOT {expr}&#x60;. Parenthesis &#x60;(...)&#x60; can be used to control precedence.  Example: &#x60;(NOT customer.name:meier*) AND (customer.age:[30 TO 40] OR customer.age:[50 TO 60])&#x60;
     * @param sort String with comma separated pairs of &#x60;field:order&#x60;.  Options for order:  * &#x60;asc&#x60; ascending;  * &#x60;desc&#x60; descending.
     * @return ApiResponse&lt;LoyaltyCardsList&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<LoyaltyCardsList> getAllWithHttpInfo(Integer count, Integer offset, String fields, String q, String sort) throws ApiException {
        Call call = getAllValidateBeforeCall(count, offset, fields, q, sort);
        Type localVarReturnType = new TypeToken<LoyaltyCardsList>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * GET Loyalty/Cards (asynchronously)
     * Get a list of loyalty cards
     * @param count The maximum number of items to return
     * @param offset The position within the whole result set to start returning items (zero-based)
     * @param fields List of fields to include in the result, all others will be filtered out. Nested properties can be accessed with this notation: &#x60;prop1.prop2&#x60;.
     * @param q A query string to restrict the returned items to given conditions. The query string must consist of any combination of single expressions in the form &#x60;property:condition&#x60;. Property names can be nested like &#x60;property.property&#x60;.  Example: &#x60;customer.name:Meier&#x60;  A condition may contain:  * &#x60;?&#x60; as wildcard for one character;  * &#x60;*&#x60; as wildcard for any number of characters.  You can also use value ranges in the form &#x60;[min TO max]&#x60;.  Example: &#x60;customer.age:[30 TO 40]&#x60;  You can combine expressions logically by &#x60;expr AND expr&#x60; and &#x60;{expr} OR {expr}&#x60;. You can also negate an expression using &#x60;NOT {expr}&#x60;. Parenthesis &#x60;(...)&#x60; can be used to control precedence.  Example: &#x60;(NOT customer.name:meier*) AND (customer.age:[30 TO 40] OR customer.age:[50 TO 60])&#x60;
     * @param sort String with comma separated pairs of &#x60;field:order&#x60;.  Options for order:  * &#x60;asc&#x60; ascending;  * &#x60;desc&#x60; descending.
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call getAllAsync(Integer count, Integer offset, String fields, String q, String sort, final ApiCallback<LoyaltyCardsList> callback) throws ApiException {
        Call call = getAllValidateBeforeCall(count, offset, fields, q, sort);
        Type localVarReturnType = new TypeToken<LoyaltyCardsList>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for getOne
     * @param loyaltyCardId Search one loyalty card by provided id (required)
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public Call getOneCall(String loyaltyCardId) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/Loyalty/Cards/{loyaltyCardId}"
            .replaceAll("\\{" + "loyaltyCardId" + "\\}", apiClient.escapeString(loyaltyCardId.toString()));

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
    private Call getOneValidateBeforeCall(String loyaltyCardId) throws ApiException {
        // verify the required parameter 'loyaltyCardId' is set
        if (loyaltyCardId == null) {
            throw new ApiException("Missing the required parameter 'loyaltyCardId' when calling getOne(Async)");
        }

        return getOneCall(loyaltyCardId);
    }

    /**
     * GET Loyalty/Cards/{loyaltyCardId}
     * Get loyalty card for a specific id
     * @param loyaltyCardId Search one loyalty card by provided id (required)
     * @return LoyaltyCardsProductModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public LoyaltyCardsProductModel getOne(String loyaltyCardId) throws ApiException {
        ApiResponse<LoyaltyCardsProductModel> resp = getOneWithHttpInfo(loyaltyCardId);
        return resp.getData();
    }

    /**
     * GET Loyalty/Cards/{loyaltyCardId}
     * Get loyalty card for a specific id
     * @param loyaltyCardId Search one loyalty card by provided id (required)
     * @return ApiResponse&lt;LoyaltyCardsProductModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<LoyaltyCardsProductModel> getOneWithHttpInfo(String loyaltyCardId) throws ApiException {
        Call call = getOneValidateBeforeCall(loyaltyCardId);
        Type localVarReturnType = new TypeToken<LoyaltyCardsProductModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * GET Loyalty/Cards/{loyaltyCardId} (asynchronously)
     * Get loyalty card for a specific id
     * @param loyaltyCardId Search one loyalty card by provided id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call getOneAsync(String loyaltyCardId, final ApiCallback<LoyaltyCardsProductModel> callback) throws ApiException {
        Call call = getOneValidateBeforeCall(loyaltyCardId);
        Type localVarReturnType = new TypeToken<LoyaltyCardsProductModel>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for removeAssignedUser
     * @param loyaltyCardId Loyalty card id (required)
     * @param generalAccountId General account id (required)
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public Call removeAssignedUserCall(String loyaltyCardId, String generalAccountId) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/Loyalty/Cards/{loyaltyCardId}/assignUser/{generalAccountId}"
            .replaceAll("\\{" + "loyaltyCardId" + "\\}", apiClient.escapeString(loyaltyCardId.toString()))
            .replaceAll("\\{" + "generalAccountId" + "\\}", apiClient.escapeString(generalAccountId.toString()));

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
    private Call removeAssignedUserValidateBeforeCall(String loyaltyCardId, String generalAccountId) throws ApiException {
        // verify the required parameter 'loyaltyCardId' is set
        if (loyaltyCardId == null) {
            throw new ApiException("Missing the required parameter 'loyaltyCardId' when calling removeAssignedUser(Async)");
        }
        // verify the required parameter 'generalAccountId' is set
        if (generalAccountId == null) {
            throw new ApiException("Missing the required parameter 'generalAccountId' when calling removeAssignedUser(Async)");
        }

        return removeAssignedUserCall(loyaltyCardId, generalAccountId);
    }

    /**
     * DELETE Loyalty/Cards/{loyaltyCardId}/assignUser/{generalAccountId}
     * Remove assigned loyalty card from specific user account
     * @param loyaltyCardId Loyalty card id (required)
     * @param generalAccountId General account id (required)
     * @return ResultBoolean
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ResultBoolean removeAssignedUser(String loyaltyCardId, String generalAccountId) throws ApiException {
        ApiResponse<ResultBoolean> resp = removeAssignedUserWithHttpInfo(loyaltyCardId, generalAccountId);
        return resp.getData();
    }

    /**
     * DELETE Loyalty/Cards/{loyaltyCardId}/assignUser/{generalAccountId}
     * Remove assigned loyalty card from specific user account
     * @param loyaltyCardId Loyalty card id (required)
     * @param generalAccountId General account id (required)
     * @return ApiResponse&lt;ResultBoolean&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ResultBoolean> removeAssignedUserWithHttpInfo(String loyaltyCardId, String generalAccountId) throws ApiException {
        Call call = removeAssignedUserValidateBeforeCall(loyaltyCardId, generalAccountId);
        Type localVarReturnType = new TypeToken<ResultBoolean>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * DELETE Loyalty/Cards/{loyaltyCardId}/assignUser/{generalAccountId} (asynchronously)
     * Remove assigned loyalty card from specific user account
     * @param loyaltyCardId Loyalty card id (required)
     * @param generalAccountId General account id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call removeAssignedUserAsync(String loyaltyCardId, String generalAccountId, final ApiCallback<ResultBoolean> callback) throws ApiException {
        Call call = removeAssignedUserValidateBeforeCall(loyaltyCardId, generalAccountId);
        Type localVarReturnType = new TypeToken<ResultBoolean>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}

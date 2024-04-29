package com.secuconnect.client.api;

import com.google.gson.reflect.TypeToken;
import com.secuconnect.client.*;
import com.secuconnect.client.model.Aggregate;
import java.math.BigDecimal;
import com.secuconnect.client.model.PrepaidSalesList;
import com.secuconnect.client.model.PrepaidSalesProductDTO;
import com.secuconnect.client.model.PrepaidSalesProductModel;
import com.secuconnect.client.model.ProductExceptionPayload;
import okhttp3.Call;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PrepaidSalesApi {
    private ApiClient apiClient;

    public PrepaidSalesApi() {
        this(Environment.getGlobalEnv().getApiClient());
    }

    public PrepaidSalesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for addSale
     * @param body Sale details
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public Call addSaleCall(PrepaidSalesProductDTO body) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/Prepaid/Sales";

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
    private Call addSaleValidateBeforeCall(PrepaidSalesProductDTO body) throws ApiException {

        return addSaleCall(body);
    }

    /**
     * Create Prepaid Sale
     * Creates a new Prepaid Sale from the given data.
     * @param body Sale details
     * @return PrepaidSalesProductModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PrepaidSalesProductModel addSale(PrepaidSalesProductDTO body) throws ApiException {
        ApiResponse<PrepaidSalesProductModel> resp = addSaleWithHttpInfo(body);
        return resp.getData();
    }

    /**
     * Create Prepaid Sale
     * Creates a new Prepaid Sale from the given data.
     * @param body Sale details
     * @return ApiResponse&lt;PrepaidSalesProductModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PrepaidSalesProductModel> addSaleWithHttpInfo(PrepaidSalesProductDTO body) throws ApiException {
        Call call = addSaleValidateBeforeCall(body);
        Type localVarReturnType = new TypeToken<PrepaidSalesProductModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Create Prepaid Sale (asynchronously)
     * Creates a new Prepaid Sale from the given data.
     * @param body Sale details
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call addSaleAsync(PrepaidSalesProductDTO body, final ApiCallback<PrepaidSalesProductModel> callback) throws ApiException {
        Call call = addSaleValidateBeforeCall(body);
        Type localVarReturnType = new TypeToken<PrepaidSalesProductModel>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for confirm
     * @param prepaidSaleId Prepaid Sale ID (required)
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public Call confirmCall(String prepaidSaleId) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/Prepaid/Sales/{prepaidSaleId}/Confirm"
            .replaceAll("\\{" + "prepaidSaleId" + "\\}", apiClient.escapeString(prepaidSaleId.toString()));

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
    private Call confirmValidateBeforeCall(String prepaidSaleId) throws ApiException {
        // verify the required parameter 'prepaidSaleId' is set
        if (prepaidSaleId == null) {
            throw new ApiException("Missing the required parameter 'prepaidSaleId' when calling confirm(Async)");
        }

        return confirmCall(prepaidSaleId);
    }

    /**
     * Confirm sale
     * Confirms and executes the specified Prepaid Sale.
     * @param prepaidSaleId Prepaid Sale ID (required)
     * @return PrepaidSalesProductModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PrepaidSalesProductModel confirm(String prepaidSaleId) throws ApiException {
        ApiResponse<PrepaidSalesProductModel> resp = confirmWithHttpInfo(prepaidSaleId);
        return resp.getData();
    }

    /**
     * Confirm sale
     * Confirms and executes the specified Prepaid Sale.
     * @param prepaidSaleId Prepaid Sale ID (required)
     * @return ApiResponse&lt;PrepaidSalesProductModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PrepaidSalesProductModel> confirmWithHttpInfo(String prepaidSaleId) throws ApiException {
        Call call = confirmValidateBeforeCall(prepaidSaleId);
        Type localVarReturnType = new TypeToken<PrepaidSalesProductModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Confirm sale (asynchronously)
     * Confirms and executes the specified Prepaid Sale.
     * @param prepaidSaleId Prepaid Sale ID (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call confirmAsync(String prepaidSaleId, final ApiCallback<PrepaidSalesProductModel> callback) throws ApiException {
        Call call = confirmValidateBeforeCall(prepaidSaleId);
        Type localVarReturnType = new TypeToken<PrepaidSalesProductModel>(){}.getType();
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
        String localVarPath = "/Prepaid/Sales";

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
     * Find Prepaid Sales
     * Returns the Prepaid Sales matching the given criteria.
     * @param count The maximum number of items to return
     * @param offset The position within the whole result set to start returning items (zero-based)
     * @param fields List of fields to include in the result, all others will be filtered out. Nested properties can be accessed with this notation: &#x60;prop1.prop2&#x60;.
     * @param q A query string to restrict the returned items to given conditions. The query string must consist of any combination of single expressions in the form &#x60;property:condition&#x60;. Property names can be nested like &#x60;property.property&#x60;.  Example: &#x60;customer.name:Meier&#x60;  A condition may contain:  * &#x60;?&#x60; as wildcard for one character;  * &#x60;*&#x60; as wildcard for any number of characters.  You can also use value ranges in the form &#x60;[min TO max]&#x60;.  Example: &#x60;customer.age:[30 TO 40]&#x60;  You can combine expressions logically by &#x60;expr AND expr&#x60; and &#x60;{expr} OR {expr}&#x60;. You can also negate an expression using &#x60;NOT {expr}&#x60;. Parenthesis &#x60;(...)&#x60; can be used to control precedence.  Example: &#x60;(NOT customer.name:meier*) AND (customer.age:[30 TO 40] OR customer.age:[50 TO 60])&#x60;
     * @param sort String with comma separated pairs of &#x60;field:order&#x60;.  Options for order:  * &#x60;asc&#x60; ascending;  * &#x60;desc&#x60; descending.
     * @return PrepaidSalesList
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PrepaidSalesList getAll(Integer count, Integer offset, String fields, String q, String sort) throws ApiException {
        ApiResponse<PrepaidSalesList> resp = getAllWithHttpInfo(count, offset, fields, q, sort);
        return resp.getData();
    }

    /**
     * Find Prepaid Sales
     * Returns the Prepaid Sales matching the given criteria.
     * @param count The maximum number of items to return
     * @param offset The position within the whole result set to start returning items (zero-based)
     * @param fields List of fields to include in the result, all others will be filtered out. Nested properties can be accessed with this notation: &#x60;prop1.prop2&#x60;.
     * @param q A query string to restrict the returned items to given conditions. The query string must consist of any combination of single expressions in the form &#x60;property:condition&#x60;. Property names can be nested like &#x60;property.property&#x60;.  Example: &#x60;customer.name:Meier&#x60;  A condition may contain:  * &#x60;?&#x60; as wildcard for one character;  * &#x60;*&#x60; as wildcard for any number of characters.  You can also use value ranges in the form &#x60;[min TO max]&#x60;.  Example: &#x60;customer.age:[30 TO 40]&#x60;  You can combine expressions logically by &#x60;expr AND expr&#x60; and &#x60;{expr} OR {expr}&#x60;. You can also negate an expression using &#x60;NOT {expr}&#x60;. Parenthesis &#x60;(...)&#x60; can be used to control precedence.  Example: &#x60;(NOT customer.name:meier*) AND (customer.age:[30 TO 40] OR customer.age:[50 TO 60])&#x60;
     * @param sort String with comma separated pairs of &#x60;field:order&#x60;.  Options for order:  * &#x60;asc&#x60; ascending;  * &#x60;desc&#x60; descending.
     * @return ApiResponse&lt;PrepaidSalesList&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PrepaidSalesList> getAllWithHttpInfo(Integer count, Integer offset, String fields, String q, String sort) throws ApiException {
        Call call = getAllValidateBeforeCall(count, offset, fields, q, sort);
        Type localVarReturnType = new TypeToken<PrepaidSalesList>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Find Prepaid Sales (asynchronously)
     * Returns the Prepaid Sales matching the given criteria.
     * @param count The maximum number of items to return
     * @param offset The position within the whole result set to start returning items (zero-based)
     * @param fields List of fields to include in the result, all others will be filtered out. Nested properties can be accessed with this notation: &#x60;prop1.prop2&#x60;.
     * @param q A query string to restrict the returned items to given conditions. The query string must consist of any combination of single expressions in the form &#x60;property:condition&#x60;. Property names can be nested like &#x60;property.property&#x60;.  Example: &#x60;customer.name:Meier&#x60;  A condition may contain:  * &#x60;?&#x60; as wildcard for one character;  * &#x60;*&#x60; as wildcard for any number of characters.  You can also use value ranges in the form &#x60;[min TO max]&#x60;.  Example: &#x60;customer.age:[30 TO 40]&#x60;  You can combine expressions logically by &#x60;expr AND expr&#x60; and &#x60;{expr} OR {expr}&#x60;. You can also negate an expression using &#x60;NOT {expr}&#x60;. Parenthesis &#x60;(...)&#x60; can be used to control precedence.  Example: &#x60;(NOT customer.name:meier*) AND (customer.age:[30 TO 40] OR customer.age:[50 TO 60])&#x60;
     * @param sort String with comma separated pairs of &#x60;field:order&#x60;.  Options for order:  * &#x60;asc&#x60; ascending;  * &#x60;desc&#x60; descending.
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call getAllAsync(Integer count, Integer offset, String fields, String q, String sort, final ApiCallback<PrepaidSalesList> callback) throws ApiException {
        Call call = getAllValidateBeforeCall(count, offset, fields, q, sort);
        Type localVarReturnType = new TypeToken<PrepaidSalesList>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for getOne
     * @param prepaidSaleId Prepaid Sale ID (required)
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public Call getOneCall(String prepaidSaleId) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/Prepaid/Sales/{prepaidSaleId}"
            .replaceAll("\\{" + "prepaidSaleId" + "\\}", apiClient.escapeString(prepaidSaleId.toString()));

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
    private Call getOneValidateBeforeCall(String prepaidSaleId) throws ApiException {
        // verify the required parameter 'prepaidSaleId' is set
        if (prepaidSaleId == null) {
            throw new ApiException("Missing the required parameter 'prepaidSaleId' when calling getOne(Async)");
        }

        return getOneCall(prepaidSaleId);
    }

    /**
     * Read Prepaid Sale
     * Returns the specified Prepaid Sale.
     * @param prepaidSaleId Prepaid Sale ID (required)
     * @return PrepaidSalesProductModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PrepaidSalesProductModel getOne(String prepaidSaleId) throws ApiException {
        ApiResponse<PrepaidSalesProductModel> resp = getOneWithHttpInfo(prepaidSaleId);
        return resp.getData();
    }

    /**
     * Read Prepaid Sale
     * Returns the specified Prepaid Sale.
     * @param prepaidSaleId Prepaid Sale ID (required)
     * @return ApiResponse&lt;PrepaidSalesProductModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PrepaidSalesProductModel> getOneWithHttpInfo(String prepaidSaleId) throws ApiException {
        Call call = getOneValidateBeforeCall(prepaidSaleId);
        Type localVarReturnType = new TypeToken<PrepaidSalesProductModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Read Prepaid Sale (asynchronously)
     * Returns the specified Prepaid Sale.
     * @param prepaidSaleId Prepaid Sale ID (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call getOneAsync(String prepaidSaleId, final ApiCallback<PrepaidSalesProductModel> callback) throws ApiException {
        Call call = getOneValidateBeforeCall(prepaidSaleId);
        Type localVarReturnType = new TypeToken<PrepaidSalesProductModel>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}

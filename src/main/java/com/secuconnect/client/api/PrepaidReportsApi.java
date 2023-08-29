package com.secuconnect.client.api;

import com.google.gson.reflect.TypeToken;
import com.secuconnect.client.*;
import com.secuconnect.client.model.Aggregate;
import java.math.BigDecimal;
import com.secuconnect.client.model.PrepaidReportsDTO;
import com.secuconnect.client.model.PrepaidReportsList;
import com.secuconnect.client.model.PrepaidReportsProductModel;
import com.secuconnect.client.model.ProductExceptionPayload;
import com.secuconnect.client.model.ProductInstanceUID;
import okhttp3.Call;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PrepaidReportsApi {
    private ApiClient apiClient;

    public PrepaidReportsApi() {
        this(Environment.getGlobalEnv().getApiClient());
    }

    public PrepaidReportsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for createReport
     * @param body 
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public Call createReportCall(PrepaidReportsDTO body) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/Prepaid/Reports";

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
    private Call createReportValidateBeforeCall(PrepaidReportsDTO body) throws ApiException {

        return createReportCall(body);
    }

    /**
     * Create Prepaid Report
     * &#x60;POST Prepaid/Reports&#x60;
     * @param body 
     * @return PrepaidReportsProductModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PrepaidReportsProductModel createReport(PrepaidReportsDTO body) throws ApiException {
        ApiResponse<PrepaidReportsProductModel> resp = createReportWithHttpInfo(body);
        return resp.getData();
    }

    /**
     * Create Prepaid Report
     * &#x60;POST Prepaid/Reports&#x60;
     * @param body 
     * @return ApiResponse&lt;PrepaidReportsProductModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PrepaidReportsProductModel> createReportWithHttpInfo(PrepaidReportsDTO body) throws ApiException {
        Call call = createReportValidateBeforeCall(body);
        Type localVarReturnType = new TypeToken<PrepaidReportsProductModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Create Prepaid Report (asynchronously)
     * &#x60;POST Prepaid/Reports&#x60;
     * @param body 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call createReportAsync(PrepaidReportsDTO body, final ApiCallback<PrepaidReportsProductModel> callback) throws ApiException {
        Call call = createReportValidateBeforeCall(body);
        Type localVarReturnType = new TypeToken<PrepaidReportsProductModel>(){}.getType();
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
        String localVarPath = "/Prepaid/Reports";

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
     * GET Prepaid/Reports/
     * Get a list of prepaid Reports
     * @param count The maximum number of items to return
     * @param offset The position within the whole result set to start returning items (zero-based)
     * @param fields List of fields to include in the result, all others will be filtered out. Nested properties can be accessed with this notation: &#x60;prop1.prop2&#x60;.
     * @param q A query string to restrict the returned items to given conditions. The query string must consist of any combination of single expressions in the form &#x60;property:condition&#x60;. Property names can be nested like &#x60;property.property&#x60;.  Example: &#x60;customer.name:Meier&#x60;  A condition may contain:  * &#x60;?&#x60; as wildcard for one character;  * &#x60;*&#x60; as wildcard for any number of characters.  You can also use value ranges in the form &#x60;[min TO max]&#x60;.  Example: &#x60;customer.age:[30 TO 40]&#x60;  You can combine expressions logically by &#x60;expr AND expr&#x60; and &#x60;{expr} OR {expr}&#x60;. You can also negate an expression using &#x60;NOT {expr}&#x60;. Parenthesis &#x60;(...)&#x60; can be used to control precedence.  Example: &#x60;(NOT customer.name:meier*) AND (customer.age:[30 TO 40] OR customer.age:[50 TO 60])&#x60;
     * @param sort String with comma separated pairs of &#x60;field:order&#x60;.  Options for order:  * &#x60;asc&#x60; ascending;  * &#x60;desc&#x60; descending.
     * @return PrepaidReportsList
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PrepaidReportsList getAll(Integer count, Integer offset, String fields, String q, String sort) throws ApiException {
        ApiResponse<PrepaidReportsList> resp = getAllWithHttpInfo(count, offset, fields, q, sort);
        return resp.getData();
    }

    /**
     * GET Prepaid/Reports/
     * Get a list of prepaid Reports
     * @param count The maximum number of items to return
     * @param offset The position within the whole result set to start returning items (zero-based)
     * @param fields List of fields to include in the result, all others will be filtered out. Nested properties can be accessed with this notation: &#x60;prop1.prop2&#x60;.
     * @param q A query string to restrict the returned items to given conditions. The query string must consist of any combination of single expressions in the form &#x60;property:condition&#x60;. Property names can be nested like &#x60;property.property&#x60;.  Example: &#x60;customer.name:Meier&#x60;  A condition may contain:  * &#x60;?&#x60; as wildcard for one character;  * &#x60;*&#x60; as wildcard for any number of characters.  You can also use value ranges in the form &#x60;[min TO max]&#x60;.  Example: &#x60;customer.age:[30 TO 40]&#x60;  You can combine expressions logically by &#x60;expr AND expr&#x60; and &#x60;{expr} OR {expr}&#x60;. You can also negate an expression using &#x60;NOT {expr}&#x60;. Parenthesis &#x60;(...)&#x60; can be used to control precedence.  Example: &#x60;(NOT customer.name:meier*) AND (customer.age:[30 TO 40] OR customer.age:[50 TO 60])&#x60;
     * @param sort String with comma separated pairs of &#x60;field:order&#x60;.  Options for order:  * &#x60;asc&#x60; ascending;  * &#x60;desc&#x60; descending.
     * @return ApiResponse&lt;PrepaidReportsList&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PrepaidReportsList> getAllWithHttpInfo(Integer count, Integer offset, String fields, String q, String sort) throws ApiException {
        Call call = getAllValidateBeforeCall(count, offset, fields, q, sort);
        Type localVarReturnType = new TypeToken<PrepaidReportsList>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * GET Prepaid/Reports/ (asynchronously)
     * Get a list of prepaid Reports
     * @param count The maximum number of items to return
     * @param offset The position within the whole result set to start returning items (zero-based)
     * @param fields List of fields to include in the result, all others will be filtered out. Nested properties can be accessed with this notation: &#x60;prop1.prop2&#x60;.
     * @param q A query string to restrict the returned items to given conditions. The query string must consist of any combination of single expressions in the form &#x60;property:condition&#x60;. Property names can be nested like &#x60;property.property&#x60;.  Example: &#x60;customer.name:Meier&#x60;  A condition may contain:  * &#x60;?&#x60; as wildcard for one character;  * &#x60;*&#x60; as wildcard for any number of characters.  You can also use value ranges in the form &#x60;[min TO max]&#x60;.  Example: &#x60;customer.age:[30 TO 40]&#x60;  You can combine expressions logically by &#x60;expr AND expr&#x60; and &#x60;{expr} OR {expr}&#x60;. You can also negate an expression using &#x60;NOT {expr}&#x60;. Parenthesis &#x60;(...)&#x60; can be used to control precedence.  Example: &#x60;(NOT customer.name:meier*) AND (customer.age:[30 TO 40] OR customer.age:[50 TO 60])&#x60;
     * @param sort String with comma separated pairs of &#x60;field:order&#x60;.  Options for order:  * &#x60;asc&#x60; ascending;  * &#x60;desc&#x60; descending.
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call getAllAsync(Integer count, Integer offset, String fields, String q, String sort, final ApiCallback<PrepaidReportsList> callback) throws ApiException {
        Call call = getAllValidateBeforeCall(count, offset, fields, q, sort);
        Type localVarReturnType = new TypeToken<PrepaidReportsList>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for getOne
     * @param prepaidReportsId Prepaid Reports id (required)
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public Call getOneCall(ProductInstanceUID prepaidReportsId) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/Prepaid/Reports/{prepaidReportsId}"
            .replaceAll("\\{" + "prepaidReportsId" + "\\}", apiClient.escapeString(prepaidReportsId.toString()));

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
    private Call getOneValidateBeforeCall(ProductInstanceUID prepaidReportsId) throws ApiException {
        // verify the required parameter 'prepaidReportsId' is set
        if (prepaidReportsId == null) {
            throw new ApiException("Missing the required parameter 'prepaidReportsId' when calling getOne(Async)");
        }

        return getOneCall(prepaidReportsId);
    }

    /**
     * GET Prepaid/Reports/{prepaidReportsId}
     * Get one prepaid Reports for a specific id
     * @param prepaidReportsId Prepaid Reports id (required)
     * @return PrepaidReportsProductModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PrepaidReportsProductModel getOne(ProductInstanceUID prepaidReportsId) throws ApiException {
        ApiResponse<PrepaidReportsProductModel> resp = getOneWithHttpInfo(prepaidReportsId);
        return resp.getData();
    }

    /**
     * GET Prepaid/Reports/{prepaidReportsId}
     * Get one prepaid Reports for a specific id
     * @param prepaidReportsId Prepaid Reports id (required)
     * @return ApiResponse&lt;PrepaidReportsProductModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PrepaidReportsProductModel> getOneWithHttpInfo(ProductInstanceUID prepaidReportsId) throws ApiException {
        Call call = getOneValidateBeforeCall(prepaidReportsId);
        Type localVarReturnType = new TypeToken<PrepaidReportsProductModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * GET Prepaid/Reports/{prepaidReportsId} (asynchronously)
     * Get one prepaid Reports for a specific id
     * @param prepaidReportsId Prepaid Reports id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call getOneAsync(ProductInstanceUID prepaidReportsId, final ApiCallback<PrepaidReportsProductModel> callback) throws ApiException {
        Call call = getOneValidateBeforeCall(prepaidReportsId);
        Type localVarReturnType = new TypeToken<PrepaidReportsProductModel>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}

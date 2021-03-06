package com.secuconnect.client.api;

import com.google.gson.reflect.TypeToken;
import com.secuconnect.client.*;
import com.secuconnect.client.model.PaymentPlansDTO;
import com.secuconnect.client.model.PaymentPlansList;
import com.secuconnect.client.model.PaymentPlansProductModel;
import com.secuconnect.client.model.ProductExceptionPayload;
import okhttp3.Call;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PaymentPlansApi {
    private ApiClient apiClient;

    public PaymentPlansApi() {
        this(Environment.getGlobalEnv().getApiClient());
    }

    public PaymentPlansApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for paymentPlansApiInterfacePatchPlans
     * @param paymentPlanId Payment plan id (required)
     * @param body Payment plans properties
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public Call paymentPlansApiInterfacePatchPlansCall(String paymentPlanId, PaymentPlansDTO body) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/Payment/Plans/{paymentPlanId}"
            .replaceAll("\\{" + "paymentPlanId" + "\\}", apiClient.escapeString(paymentPlanId.toString()));

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
        return apiClient.buildCall(localVarPath, "PATCH", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames);
    }

    @SuppressWarnings("rawtypes")
    private Call paymentPlansApiInterfacePatchPlansValidateBeforeCall(String paymentPlanId, PaymentPlansDTO body) throws ApiException {
        // verify the required parameter 'paymentPlanId' is set
        if (paymentPlanId == null) {
            throw new ApiException("Missing the required parameter 'paymentPlanId' when calling paymentPlansApiInterfacePatchPlans(Async)");
        }

        return paymentPlansApiInterfacePatchPlansCall(paymentPlanId, body);
    }

    /**
     * PATCH Payment/Plans/{paymentPlanId}
     * Get payment plan by id
     * @param paymentPlanId Payment plan id (required)
     * @param body Payment plans properties
     * @return PaymentPlansProductModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PaymentPlansProductModel paymentPlansApiInterfacePatchPlans(String paymentPlanId, PaymentPlansDTO body) throws ApiException {
        ApiResponse<PaymentPlansProductModel> resp = paymentPlansApiInterfacePatchPlansWithHttpInfo(paymentPlanId, body);
        return resp.getData();
    }

    /**
     * PATCH Payment/Plans/{paymentPlanId}
     * Get payment plan by id
     * @param paymentPlanId Payment plan id (required)
     * @param body Payment plans properties
     * @return ApiResponse&lt;PaymentPlansProductModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PaymentPlansProductModel> paymentPlansApiInterfacePatchPlansWithHttpInfo(String paymentPlanId, PaymentPlansDTO body) throws ApiException {
        Call call = paymentPlansApiInterfacePatchPlansValidateBeforeCall(paymentPlanId, body);
        Type localVarReturnType = new TypeToken<PaymentPlansProductModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * PATCH Payment/Plans/{paymentPlanId} (asynchronously)
     * Get payment plan by id
     * @param paymentPlanId Payment plan id (required)
     * @param body Payment plans properties
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call paymentPlansApiInterfacePatchPlansAsync(String paymentPlanId, PaymentPlansDTO body, final ApiCallback<PaymentPlansProductModel> callback) throws ApiException {
        Call call = paymentPlansApiInterfacePatchPlansValidateBeforeCall(paymentPlanId, body);
        Type localVarReturnType = new TypeToken<PaymentPlansProductModel>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for paymentPlansApiInterfaceUpdatePlans
     * @param paymentPlanId Payment plan id (required)
     * @param body Payment plans properties
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public Call paymentPlansApiInterfaceUpdatePlansCall(String paymentPlanId, PaymentPlansDTO body) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/Payment/Plans/{paymentPlanId}"
            .replaceAll("\\{" + "paymentPlanId" + "\\}", apiClient.escapeString(paymentPlanId.toString()));

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
    private Call paymentPlansApiInterfaceUpdatePlansValidateBeforeCall(String paymentPlanId, PaymentPlansDTO body) throws ApiException {
        // verify the required parameter 'paymentPlanId' is set
        if (paymentPlanId == null) {
            throw new ApiException("Missing the required parameter 'paymentPlanId' when calling paymentPlansApiInterfaceUpdatePlans(Async)");
        }

        return paymentPlansApiInterfaceUpdatePlansCall(paymentPlanId, body);
    }

    /**
     * PUT Payment/Plans/{paymentPlanId}
     * Get payment plan by id
     * @param paymentPlanId Payment plan id (required)
     * @param body Payment plans properties
     * @return PaymentPlansProductModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PaymentPlansProductModel paymentPlansApiInterfaceUpdatePlans(String paymentPlanId, PaymentPlansDTO body) throws ApiException {
        ApiResponse<PaymentPlansProductModel> resp = paymentPlansApiInterfaceUpdatePlansWithHttpInfo(paymentPlanId, body);
        return resp.getData();
    }

    /**
     * PUT Payment/Plans/{paymentPlanId}
     * Get payment plan by id
     * @param paymentPlanId Payment plan id (required)
     * @param body Payment plans properties
     * @return ApiResponse&lt;PaymentPlansProductModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PaymentPlansProductModel> paymentPlansApiInterfaceUpdatePlansWithHttpInfo(String paymentPlanId, PaymentPlansDTO body) throws ApiException {
        Call call = paymentPlansApiInterfaceUpdatePlansValidateBeforeCall(paymentPlanId, body);
        Type localVarReturnType = new TypeToken<PaymentPlansProductModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * PUT Payment/Plans/{paymentPlanId} (asynchronously)
     * Get payment plan by id
     * @param paymentPlanId Payment plan id (required)
     * @param body Payment plans properties
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call paymentPlansApiInterfaceUpdatePlansAsync(String paymentPlanId, PaymentPlansDTO body, final ApiCallback<PaymentPlansProductModel> callback) throws ApiException {
        Call call = paymentPlansApiInterfaceUpdatePlansValidateBeforeCall(paymentPlanId, body);
        Type localVarReturnType = new TypeToken<PaymentPlansProductModel>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for paymentPlansGet
     * @param count The maximum number of items to return
     * @param offset The position within the whole result set to start returning items (zero-based)
     * @param fields List of fields to include in the result. Nested properties can be accessed with this notation: &#x60;prop1.prop2&#x60;.
     * @param q A query string to restrict the returned items to given conditions. The query string must consist of any combination of single expressions in the form &#x60;property:condition&#x60;. Property names can be nested like &#x60;property.property&#x60;.  Example: &#x60;customer.name:Meier&#x60;  A condition may contain:  * &#x60;?&#x60; as wildcard for one character;  * &#x60;*&#x60; as wildcard for any number of characters.  You can also use value ranges in the form &#x60;[min TO max]&#x60;.  Example: &#x60;customer.age:[30 TO 40]&#x60;  You can combine expressions logically by &#x60;expr AND expr&#x60; and &#x60;{expr} OR {expr}&#x60;. You can also negate an expression using &#x60;NOT {expr}&#x60;. Parenthesis &#x60;(...)&#x60; can be used to control precedence.  Example: &#x60;(NOT customer.name:meier*) AND (customer.age:[30 TO 40] OR customer.age:[50 TO 60])&#x60;
     * @param sort String with comma separated pairs of &#x60;field:order&#x60;.   Options for order:  * &#x60;asc&#x60; ascending;  * &#x60;dsc&#x60; descending.
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public Call paymentPlansGetCall(Integer count, Integer offset, String fields, String q, String sort) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/Payment/Plans";

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
    private Call paymentPlansGetValidateBeforeCall(Integer count, Integer offset, String fields, String q, String sort) throws ApiException {

        return paymentPlansGetCall(count, offset, fields, q, sort);
    }

    /**
     * GET Payment/Plans
     * Get a list of payment plans
     * @param count The maximum number of items to return
     * @param offset The position within the whole result set to start returning items (zero-based)
     * @param fields List of fields to include in the result. Nested properties can be accessed with this notation: &#x60;prop1.prop2&#x60;.
     * @param q A query string to restrict the returned items to given conditions. The query string must consist of any combination of single expressions in the form &#x60;property:condition&#x60;. Property names can be nested like &#x60;property.property&#x60;.  Example: &#x60;customer.name:Meier&#x60;  A condition may contain:  * &#x60;?&#x60; as wildcard for one character;  * &#x60;*&#x60; as wildcard for any number of characters.  You can also use value ranges in the form &#x60;[min TO max]&#x60;.  Example: &#x60;customer.age:[30 TO 40]&#x60;  You can combine expressions logically by &#x60;expr AND expr&#x60; and &#x60;{expr} OR {expr}&#x60;. You can also negate an expression using &#x60;NOT {expr}&#x60;. Parenthesis &#x60;(...)&#x60; can be used to control precedence.  Example: &#x60;(NOT customer.name:meier*) AND (customer.age:[30 TO 40] OR customer.age:[50 TO 60])&#x60;
     * @param sort String with comma separated pairs of &#x60;field:order&#x60;.   Options for order:  * &#x60;asc&#x60; ascending;  * &#x60;dsc&#x60; descending.
     * @return PaymentPlansList
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PaymentPlansList paymentPlansGet(Integer count, Integer offset, String fields, String q, String sort) throws ApiException {
        ApiResponse<PaymentPlansList> resp = paymentPlansGetWithHttpInfo(count, offset, fields, q, sort);
        return resp.getData();
    }

    /**
     * GET Payment/Plans
     * Get a list of payment plans
     * @param count The maximum number of items to return
     * @param offset The position within the whole result set to start returning items (zero-based)
     * @param fields List of fields to include in the result. Nested properties can be accessed with this notation: &#x60;prop1.prop2&#x60;.
     * @param q A query string to restrict the returned items to given conditions. The query string must consist of any combination of single expressions in the form &#x60;property:condition&#x60;. Property names can be nested like &#x60;property.property&#x60;.  Example: &#x60;customer.name:Meier&#x60;  A condition may contain:  * &#x60;?&#x60; as wildcard for one character;  * &#x60;*&#x60; as wildcard for any number of characters.  You can also use value ranges in the form &#x60;[min TO max]&#x60;.  Example: &#x60;customer.age:[30 TO 40]&#x60;  You can combine expressions logically by &#x60;expr AND expr&#x60; and &#x60;{expr} OR {expr}&#x60;. You can also negate an expression using &#x60;NOT {expr}&#x60;. Parenthesis &#x60;(...)&#x60; can be used to control precedence.  Example: &#x60;(NOT customer.name:meier*) AND (customer.age:[30 TO 40] OR customer.age:[50 TO 60])&#x60;
     * @param sort String with comma separated pairs of &#x60;field:order&#x60;.   Options for order:  * &#x60;asc&#x60; ascending;  * &#x60;dsc&#x60; descending.
     * @return ApiResponse&lt;PaymentPlansList&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PaymentPlansList> paymentPlansGetWithHttpInfo(Integer count, Integer offset, String fields, String q, String sort) throws ApiException {
        Call call = paymentPlansGetValidateBeforeCall(count, offset, fields, q, sort);
        Type localVarReturnType = new TypeToken<PaymentPlansList>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * GET Payment/Plans (asynchronously)
     * Get a list of payment plans
     * @param count The maximum number of items to return
     * @param offset The position within the whole result set to start returning items (zero-based)
     * @param fields List of fields to include in the result. Nested properties can be accessed with this notation: &#x60;prop1.prop2&#x60;.
     * @param q A query string to restrict the returned items to given conditions. The query string must consist of any combination of single expressions in the form &#x60;property:condition&#x60;. Property names can be nested like &#x60;property.property&#x60;.  Example: &#x60;customer.name:Meier&#x60;  A condition may contain:  * &#x60;?&#x60; as wildcard for one character;  * &#x60;*&#x60; as wildcard for any number of characters.  You can also use value ranges in the form &#x60;[min TO max]&#x60;.  Example: &#x60;customer.age:[30 TO 40]&#x60;  You can combine expressions logically by &#x60;expr AND expr&#x60; and &#x60;{expr} OR {expr}&#x60;. You can also negate an expression using &#x60;NOT {expr}&#x60;. Parenthesis &#x60;(...)&#x60; can be used to control precedence.  Example: &#x60;(NOT customer.name:meier*) AND (customer.age:[30 TO 40] OR customer.age:[50 TO 60])&#x60;
     * @param sort String with comma separated pairs of &#x60;field:order&#x60;.   Options for order:  * &#x60;asc&#x60; ascending;  * &#x60;dsc&#x60; descending.
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call paymentPlansGetAsync(Integer count, Integer offset, String fields, String q, String sort, final ApiCallback<PaymentPlansList> callback) throws ApiException {
        Call call = paymentPlansGetValidateBeforeCall(count, offset, fields, q, sort);
        Type localVarReturnType = new TypeToken<PaymentPlansList>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for paymentPlansGetById
     * @param paymentPlanId Payment plan id (required)
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public Call paymentPlansGetByIdCall(String paymentPlanId) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/Payment/Plans/{paymentPlanId}"
            .replaceAll("\\{" + "paymentPlanId" + "\\}", apiClient.escapeString(paymentPlanId.toString()));

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
    private Call paymentPlansGetByIdValidateBeforeCall(String paymentPlanId) throws ApiException {
        // verify the required parameter 'paymentPlanId' is set
        if (paymentPlanId == null) {
            throw new ApiException("Missing the required parameter 'paymentPlanId' when calling paymentPlansGetById(Async)");
        }

        return paymentPlansGetByIdCall(paymentPlanId);
    }

    /**
     * GET Payment/Plans/{paymentPlanId}
     * Get payment plan by id
     * @param paymentPlanId Payment plan id (required)
     * @return PaymentPlansProductModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PaymentPlansProductModel paymentPlansGetById(String paymentPlanId) throws ApiException {
        ApiResponse<PaymentPlansProductModel> resp = paymentPlansGetByIdWithHttpInfo(paymentPlanId);
        return resp.getData();
    }

    /**
     * GET Payment/Plans/{paymentPlanId}
     * Get payment plan by id
     * @param paymentPlanId Payment plan id (required)
     * @return ApiResponse&lt;PaymentPlansProductModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PaymentPlansProductModel> paymentPlansGetByIdWithHttpInfo(String paymentPlanId) throws ApiException {
        Call call = paymentPlansGetByIdValidateBeforeCall(paymentPlanId);
        Type localVarReturnType = new TypeToken<PaymentPlansProductModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * GET Payment/Plans/{paymentPlanId} (asynchronously)
     * Get payment plan by id
     * @param paymentPlanId Payment plan id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call paymentPlansGetByIdAsync(String paymentPlanId, final ApiCallback<PaymentPlansProductModel> callback) throws ApiException {
        Call call = paymentPlansGetByIdValidateBeforeCall(paymentPlanId);
        Type localVarReturnType = new TypeToken<PaymentPlansProductModel>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for paymentPlansPost
     * @param body Payment plan properties
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public Call paymentPlansPostCall(PaymentPlansDTO body) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/Payment/Plans";

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
    private Call paymentPlansPostValidateBeforeCall(PaymentPlansDTO body) throws ApiException {

        return paymentPlansPostCall(body);
    }

    /**
     * POST Payment/Plans
     * Add new plan
     * @param body Payment plan properties
     * @return PaymentPlansProductModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PaymentPlansProductModel paymentPlansPost(PaymentPlansDTO body) throws ApiException {
        ApiResponse<PaymentPlansProductModel> resp = paymentPlansPostWithHttpInfo(body);
        return resp.getData();
    }

    /**
     * POST Payment/Plans
     * Add new plan
     * @param body Payment plan properties
     * @return ApiResponse&lt;PaymentPlansProductModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PaymentPlansProductModel> paymentPlansPostWithHttpInfo(PaymentPlansDTO body) throws ApiException {
        Call call = paymentPlansPostValidateBeforeCall(body);
        Type localVarReturnType = new TypeToken<PaymentPlansProductModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * POST Payment/Plans (asynchronously)
     * Add new plan
     * @param body Payment plan properties
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call paymentPlansPostAsync(PaymentPlansDTO body, final ApiCallback<PaymentPlansProductModel> callback) throws ApiException {
        Call call = paymentPlansPostValidateBeforeCall(body);
        Type localVarReturnType = new TypeToken<PaymentPlansProductModel>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}

package com.secuconnect.client.api;

import com.google.gson.reflect.TypeToken;
import com.secuconnect.client.*;
import com.secuconnect.client.model.PaymentSubscriptionsList;
import com.secuconnect.client.model.PaymentSubscriptionsProductModel;
import com.secuconnect.client.model.ProductExceptionPayload;
import okhttp3.Call;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PaymentSubscriptionsApi {
    private ApiClient apiClient;

    public PaymentSubscriptionsApi() {
        this(Environment.getGlobalEnv().getApiClient());
    }

    public PaymentSubscriptionsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for paymentSubscriptionGetById
     * @param paymentSubscriptionId Payment subscription id (required)
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public Call paymentSubscriptionGetByIdCall(String paymentSubscriptionId) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/Payment/Subscriptions/{paymentSubscriptionId}"
            .replaceAll("\\{" + "paymentSubscriptionId" + "\\}", apiClient.escapeString(paymentSubscriptionId.toString()));

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
    private Call paymentSubscriptionGetByIdValidateBeforeCall(String paymentSubscriptionId) throws ApiException {
        // verify the required parameter 'paymentSubscriptionId' is set
        if (paymentSubscriptionId == null) {
            throw new ApiException("Missing the required parameter 'paymentSubscriptionId' when calling paymentSubscriptionGetById(Async)");
        }

        return paymentSubscriptionGetByIdCall(paymentSubscriptionId);
    }

    /**
     * GET Payment/Subscriptions/{paymentSubscriptionId}
     * Get payment subscription by id
     * @param paymentSubscriptionId Payment subscription id (required)
     * @return PaymentSubscriptionsProductModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PaymentSubscriptionsProductModel paymentSubscriptionGetById(String paymentSubscriptionId) throws ApiException {
        ApiResponse<PaymentSubscriptionsProductModel> resp = paymentSubscriptionGetByIdWithHttpInfo(paymentSubscriptionId);
        return resp.getData();
    }

    /**
     * GET Payment/Subscriptions/{paymentSubscriptionId}
     * Get payment subscription by id
     * @param paymentSubscriptionId Payment subscription id (required)
     * @return ApiResponse&lt;PaymentSubscriptionsProductModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PaymentSubscriptionsProductModel> paymentSubscriptionGetByIdWithHttpInfo(String paymentSubscriptionId) throws ApiException {
        Call call = paymentSubscriptionGetByIdValidateBeforeCall(paymentSubscriptionId);
        Type localVarReturnType = new TypeToken<PaymentSubscriptionsProductModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * GET Payment/Subscriptions/{paymentSubscriptionId} (asynchronously)
     * Get payment subscription by id
     * @param paymentSubscriptionId Payment subscription id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call paymentSubscriptionGetByIdAsync(String paymentSubscriptionId, final ApiCallback<PaymentSubscriptionsProductModel> callback) throws ApiException {
        Call call = paymentSubscriptionGetByIdValidateBeforeCall(paymentSubscriptionId);
        Type localVarReturnType = new TypeToken<PaymentSubscriptionsProductModel>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for paymentSubscriptionsGet
     * @param count The maximum number of items to return
     * @param offset The position within the whole result set to start returning items (zero-based)
     * @param fields List of fields to include in the result. Nested properties can be accessed with this notation: &#x60;prop1.prop2&#x60;.
     * @param q A query string to restrict the returned items to given conditions. The query string must consist of any combination of single expressions in the form &#x60;property:condition&#x60;. Property names can be nested like &#x60;property.property&#x60;.    Example: &#x60;customer.name:Meier&#x60;    A condition may contain:   * &#x60;?&#x60; as wildcard for one character;   * &#x60;*&#x60; as wildcard for any number of characters.    You can also use value ranges in the form &#x60;[min TO max]&#x60;.    Example: &#x60;customer.age:[30 TO 40]&#x60;    You can combine expressions logically by &#x60;expr AND expr&#x60; and &#x60;{expr} OR {expr}&#x60;. You can also negate an expression using &#x60;NOT {expr}&#x60;. Parenthesis &#x60;(...)&#x60; can be used to control precedence.    Example: &#x60;(NOT customer.name:meier*) AND (customer.age:[30 TO 40] OR customer.age:[50 TO 60])&#x60;
     * @param sort String with comma separated pairs of &#x60;field:order&#x60;.     Options for order:   * &#x60;asc&#x60; ascending;   * &#x60;dsc&#x60; descending.
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public Call paymentSubscriptionsGetCall(Integer count, Integer offset, String fields, String q, String sort) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/Payment/Subscriptions";

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
    private Call paymentSubscriptionsGetValidateBeforeCall(Integer count, Integer offset, String fields, String q, String sort) throws ApiException {

        return paymentSubscriptionsGetCall(count, offset, fields, q, sort);
    }

    /**
     * GET Payment/Subscriptions
     * Get a list of payment subscriptions
     * @param count The maximum number of items to return
     * @param offset The position within the whole result set to start returning items (zero-based)
     * @param fields List of fields to include in the result. Nested properties can be accessed with this notation: &#x60;prop1.prop2&#x60;.
     * @param q A query string to restrict the returned items to given conditions. The query string must consist of any combination of single expressions in the form &#x60;property:condition&#x60;. Property names can be nested like &#x60;property.property&#x60;.    Example: &#x60;customer.name:Meier&#x60;    A condition may contain:   * &#x60;?&#x60; as wildcard for one character;   * &#x60;*&#x60; as wildcard for any number of characters.    You can also use value ranges in the form &#x60;[min TO max]&#x60;.    Example: &#x60;customer.age:[30 TO 40]&#x60;    You can combine expressions logically by &#x60;expr AND expr&#x60; and &#x60;{expr} OR {expr}&#x60;. You can also negate an expression using &#x60;NOT {expr}&#x60;. Parenthesis &#x60;(...)&#x60; can be used to control precedence.    Example: &#x60;(NOT customer.name:meier*) AND (customer.age:[30 TO 40] OR customer.age:[50 TO 60])&#x60;
     * @param sort String with comma separated pairs of &#x60;field:order&#x60;.     Options for order:   * &#x60;asc&#x60; ascending;   * &#x60;dsc&#x60; descending.
     * @return PaymentSubscriptionsList
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PaymentSubscriptionsList paymentSubscriptionsGet(Integer count, Integer offset, String fields, String q, String sort) throws ApiException {
        ApiResponse<PaymentSubscriptionsList> resp = paymentSubscriptionsGetWithHttpInfo(count, offset, fields, q, sort);
        return resp.getData();
    }

    /**
     * GET Payment/Subscriptions
     * Get a list of payment subscriptions
     * @param count The maximum number of items to return
     * @param offset The position within the whole result set to start returning items (zero-based)
     * @param fields List of fields to include in the result. Nested properties can be accessed with this notation: &#x60;prop1.prop2&#x60;.
     * @param q A query string to restrict the returned items to given conditions. The query string must consist of any combination of single expressions in the form &#x60;property:condition&#x60;. Property names can be nested like &#x60;property.property&#x60;.    Example: &#x60;customer.name:Meier&#x60;    A condition may contain:   * &#x60;?&#x60; as wildcard for one character;   * &#x60;*&#x60; as wildcard for any number of characters.    You can also use value ranges in the form &#x60;[min TO max]&#x60;.    Example: &#x60;customer.age:[30 TO 40]&#x60;    You can combine expressions logically by &#x60;expr AND expr&#x60; and &#x60;{expr} OR {expr}&#x60;. You can also negate an expression using &#x60;NOT {expr}&#x60;. Parenthesis &#x60;(...)&#x60; can be used to control precedence.    Example: &#x60;(NOT customer.name:meier*) AND (customer.age:[30 TO 40] OR customer.age:[50 TO 60])&#x60;
     * @param sort String with comma separated pairs of &#x60;field:order&#x60;.     Options for order:   * &#x60;asc&#x60; ascending;   * &#x60;dsc&#x60; descending.
     * @return ApiResponse&lt;PaymentSubscriptionsList&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PaymentSubscriptionsList> paymentSubscriptionsGetWithHttpInfo(Integer count, Integer offset, String fields, String q, String sort) throws ApiException {
        Call call = paymentSubscriptionsGetValidateBeforeCall(count, offset, fields, q, sort);
        Type localVarReturnType = new TypeToken<PaymentSubscriptionsList>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * GET Payment/Subscriptions (asynchronously)
     * Get a list of payment subscriptions
     * @param count The maximum number of items to return
     * @param offset The position within the whole result set to start returning items (zero-based)
     * @param fields List of fields to include in the result. Nested properties can be accessed with this notation: &#x60;prop1.prop2&#x60;.
     * @param q A query string to restrict the returned items to given conditions. The query string must consist of any combination of single expressions in the form &#x60;property:condition&#x60;. Property names can be nested like &#x60;property.property&#x60;.    Example: &#x60;customer.name:Meier&#x60;    A condition may contain:   * &#x60;?&#x60; as wildcard for one character;   * &#x60;*&#x60; as wildcard for any number of characters.    You can also use value ranges in the form &#x60;[min TO max]&#x60;.    Example: &#x60;customer.age:[30 TO 40]&#x60;    You can combine expressions logically by &#x60;expr AND expr&#x60; and &#x60;{expr} OR {expr}&#x60;. You can also negate an expression using &#x60;NOT {expr}&#x60;. Parenthesis &#x60;(...)&#x60; can be used to control precedence.    Example: &#x60;(NOT customer.name:meier*) AND (customer.age:[30 TO 40] OR customer.age:[50 TO 60])&#x60;
     * @param sort String with comma separated pairs of &#x60;field:order&#x60;.     Options for order:   * &#x60;asc&#x60; ascending;   * &#x60;dsc&#x60; descending.
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call paymentSubscriptionsGetAsync(Integer count, Integer offset, String fields, String q, String sort, final ApiCallback<PaymentSubscriptionsList> callback) throws ApiException {
        Call call = paymentSubscriptionsGetValidateBeforeCall(count, offset, fields, q, sort);
        Type localVarReturnType = new TypeToken<PaymentSubscriptionsList>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}

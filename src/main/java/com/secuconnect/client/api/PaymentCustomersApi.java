package com.secuconnect.client.api;

import com.google.gson.reflect.TypeToken;
import com.secuconnect.client.*;
import com.secuconnect.client.model.Aggregate;
import java.math.BigDecimal;
import com.secuconnect.client.model.PaymentCustomersDTO;
import com.secuconnect.client.model.PaymentCustomersList;
import com.secuconnect.client.model.PaymentCustomersProductModel;
import com.secuconnect.client.model.ProductExceptionPayload;
import okhttp3.Call;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PaymentCustomersApi {
    private ApiClient apiClient;

    public PaymentCustomersApi() {
        this(Environment.getGlobalEnv().getApiClient());
    }

    public PaymentCustomersApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for paymentCustomersGet
     * @param count The maximum number of items to return
     * @param offset The position within the whole result set to start returning items (zero-based)
     * @param fields List of fields to include in the result, all others will be filtered out. Nested properties can be accessed with this notation: &#x60;prop1.prop2&#x60;.
     * @param q A query string to restrict the returned items to given conditions. The query string must consist of any combination of single expressions in the form &#x60;property:condition&#x60;. Property names can be nested like &#x60;property.property&#x60;.  Example: &#x60;customer.name:Meier&#x60;  A condition may contain:  * &#x60;?&#x60; as wildcard for one character;  * &#x60;*&#x60; as wildcard for any number of characters.  You can also use value ranges in the form &#x60;[min TO max]&#x60;.  Example: &#x60;customer.age:[30 TO 40]&#x60;  You can combine expressions logically by &#x60;expr AND expr&#x60; and &#x60;{expr} OR {expr}&#x60;. You can also negate an expression using &#x60;NOT {expr}&#x60;. Parenthesis &#x60;(...)&#x60; can be used to control precedence.  Example: &#x60;(NOT customer.name:meier*) AND (customer.age:[30 TO 40] OR customer.age:[50 TO 60])&#x60;
     * @param sort String with comma separated pairs of &#x60;field:order&#x60;.  Options for order:  * &#x60;asc&#x60; ascending;  * &#x60;desc&#x60; descending.
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public Call paymentCustomersGetCall(Integer count, Integer offset, String fields, String q, String sort) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/Payment/Customers";

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
    private Call paymentCustomersGetValidateBeforeCall(Integer count, Integer offset, String fields, String q, String sort) throws ApiException {

        return paymentCustomersGetCall(count, offset, fields, q, sort);
    }

    /**
     * Find Payment Customers
     * Returns the Payment Customers matching the given criteria.
     * @param count The maximum number of items to return
     * @param offset The position within the whole result set to start returning items (zero-based)
     * @param fields List of fields to include in the result, all others will be filtered out. Nested properties can be accessed with this notation: &#x60;prop1.prop2&#x60;.
     * @param q A query string to restrict the returned items to given conditions. The query string must consist of any combination of single expressions in the form &#x60;property:condition&#x60;. Property names can be nested like &#x60;property.property&#x60;.  Example: &#x60;customer.name:Meier&#x60;  A condition may contain:  * &#x60;?&#x60; as wildcard for one character;  * &#x60;*&#x60; as wildcard for any number of characters.  You can also use value ranges in the form &#x60;[min TO max]&#x60;.  Example: &#x60;customer.age:[30 TO 40]&#x60;  You can combine expressions logically by &#x60;expr AND expr&#x60; and &#x60;{expr} OR {expr}&#x60;. You can also negate an expression using &#x60;NOT {expr}&#x60;. Parenthesis &#x60;(...)&#x60; can be used to control precedence.  Example: &#x60;(NOT customer.name:meier*) AND (customer.age:[30 TO 40] OR customer.age:[50 TO 60])&#x60;
     * @param sort String with comma separated pairs of &#x60;field:order&#x60;.  Options for order:  * &#x60;asc&#x60; ascending;  * &#x60;desc&#x60; descending.
     * @return PaymentCustomersList
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PaymentCustomersList paymentCustomersGet(Integer count, Integer offset, String fields, String q, String sort) throws ApiException {
        ApiResponse<PaymentCustomersList> resp = paymentCustomersGetWithHttpInfo(count, offset, fields, q, sort);
        return resp.getData();
    }

    /**
     * Find Payment Customers
     * Returns the Payment Customers matching the given criteria.
     * @param count The maximum number of items to return
     * @param offset The position within the whole result set to start returning items (zero-based)
     * @param fields List of fields to include in the result, all others will be filtered out. Nested properties can be accessed with this notation: &#x60;prop1.prop2&#x60;.
     * @param q A query string to restrict the returned items to given conditions. The query string must consist of any combination of single expressions in the form &#x60;property:condition&#x60;. Property names can be nested like &#x60;property.property&#x60;.  Example: &#x60;customer.name:Meier&#x60;  A condition may contain:  * &#x60;?&#x60; as wildcard for one character;  * &#x60;*&#x60; as wildcard for any number of characters.  You can also use value ranges in the form &#x60;[min TO max]&#x60;.  Example: &#x60;customer.age:[30 TO 40]&#x60;  You can combine expressions logically by &#x60;expr AND expr&#x60; and &#x60;{expr} OR {expr}&#x60;. You can also negate an expression using &#x60;NOT {expr}&#x60;. Parenthesis &#x60;(...)&#x60; can be used to control precedence.  Example: &#x60;(NOT customer.name:meier*) AND (customer.age:[30 TO 40] OR customer.age:[50 TO 60])&#x60;
     * @param sort String with comma separated pairs of &#x60;field:order&#x60;.  Options for order:  * &#x60;asc&#x60; ascending;  * &#x60;desc&#x60; descending.
     * @return ApiResponse&lt;PaymentCustomersList&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PaymentCustomersList> paymentCustomersGetWithHttpInfo(Integer count, Integer offset, String fields, String q, String sort) throws ApiException {
        Call call = paymentCustomersGetValidateBeforeCall(count, offset, fields, q, sort);
        Type localVarReturnType = new TypeToken<PaymentCustomersList>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Find Payment Customers (asynchronously)
     * Returns the Payment Customers matching the given criteria.
     * @param count The maximum number of items to return
     * @param offset The position within the whole result set to start returning items (zero-based)
     * @param fields List of fields to include in the result, all others will be filtered out. Nested properties can be accessed with this notation: &#x60;prop1.prop2&#x60;.
     * @param q A query string to restrict the returned items to given conditions. The query string must consist of any combination of single expressions in the form &#x60;property:condition&#x60;. Property names can be nested like &#x60;property.property&#x60;.  Example: &#x60;customer.name:Meier&#x60;  A condition may contain:  * &#x60;?&#x60; as wildcard for one character;  * &#x60;*&#x60; as wildcard for any number of characters.  You can also use value ranges in the form &#x60;[min TO max]&#x60;.  Example: &#x60;customer.age:[30 TO 40]&#x60;  You can combine expressions logically by &#x60;expr AND expr&#x60; and &#x60;{expr} OR {expr}&#x60;. You can also negate an expression using &#x60;NOT {expr}&#x60;. Parenthesis &#x60;(...)&#x60; can be used to control precedence.  Example: &#x60;(NOT customer.name:meier*) AND (customer.age:[30 TO 40] OR customer.age:[50 TO 60])&#x60;
     * @param sort String with comma separated pairs of &#x60;field:order&#x60;.  Options for order:  * &#x60;asc&#x60; ascending;  * &#x60;desc&#x60; descending.
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call paymentCustomersGetAsync(Integer count, Integer offset, String fields, String q, String sort, final ApiCallback<PaymentCustomersList> callback) throws ApiException {
        Call call = paymentCustomersGetValidateBeforeCall(count, offset, fields, q, sort);
        Type localVarReturnType = new TypeToken<PaymentCustomersList>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for paymentCustomersGetById
     * @param paymentCustomerId Payment Customer ID (required)
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public Call paymentCustomersGetByIdCall(String paymentCustomerId) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/Payment/Customers/{paymentCustomerId}"
            .replaceAll("\\{" + "paymentCustomerId" + "\\}", apiClient.escapeString(paymentCustomerId.toString()));

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
    private Call paymentCustomersGetByIdValidateBeforeCall(String paymentCustomerId) throws ApiException {
        // verify the required parameter 'paymentCustomerId' is set
        if (paymentCustomerId == null) {
            throw new ApiException("Missing the required parameter 'paymentCustomerId' when calling paymentCustomersGetById(Async)");
        }

        return paymentCustomersGetByIdCall(paymentCustomerId);
    }

    /**
     * Read Payment Customer
     * Returns the specified Payment Customer.
     * @param paymentCustomerId Payment Customer ID (required)
     * @return PaymentCustomersProductModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PaymentCustomersProductModel paymentCustomersGetById(String paymentCustomerId) throws ApiException {
        ApiResponse<PaymentCustomersProductModel> resp = paymentCustomersGetByIdWithHttpInfo(paymentCustomerId);
        return resp.getData();
    }

    /**
     * Read Payment Customer
     * Returns the specified Payment Customer.
     * @param paymentCustomerId Payment Customer ID (required)
     * @return ApiResponse&lt;PaymentCustomersProductModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PaymentCustomersProductModel> paymentCustomersGetByIdWithHttpInfo(String paymentCustomerId) throws ApiException {
        Call call = paymentCustomersGetByIdValidateBeforeCall(paymentCustomerId);
        Type localVarReturnType = new TypeToken<PaymentCustomersProductModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Read Payment Customer (asynchronously)
     * Returns the specified Payment Customer.
     * @param paymentCustomerId Payment Customer ID (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call paymentCustomersGetByIdAsync(String paymentCustomerId, final ApiCallback<PaymentCustomersProductModel> callback) throws ApiException {
        Call call = paymentCustomersGetByIdValidateBeforeCall(paymentCustomerId);
        Type localVarReturnType = new TypeToken<PaymentCustomersProductModel>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for paymentCustomersIdDelete
     * @param paymentCustomerId Payment Customer ID (required)
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public Call paymentCustomersIdDeleteCall(String paymentCustomerId) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/Payment/Customers/{paymentCustomerId}"
            .replaceAll("\\{" + "paymentCustomerId" + "\\}", apiClient.escapeString(paymentCustomerId.toString()));

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
    private Call paymentCustomersIdDeleteValidateBeforeCall(String paymentCustomerId) throws ApiException {
        // verify the required parameter 'paymentCustomerId' is set
        if (paymentCustomerId == null) {
            throw new ApiException("Missing the required parameter 'paymentCustomerId' when calling paymentCustomersIdDelete(Async)");
        }

        return paymentCustomersIdDeleteCall(paymentCustomerId);
    }

    /**
     * Delete Payment Customer
     * Deletes the specified Payment Customer.
     * @param paymentCustomerId Payment Customer ID (required)
     * @return List&lt;PaymentCustomersProductModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<PaymentCustomersProductModel> paymentCustomersIdDelete(String paymentCustomerId) throws ApiException {
        ApiResponse<List<PaymentCustomersProductModel>> resp = paymentCustomersIdDeleteWithHttpInfo(paymentCustomerId);
        return resp.getData();
    }

    /**
     * Delete Payment Customer
     * Deletes the specified Payment Customer.
     * @param paymentCustomerId Payment Customer ID (required)
     * @return ApiResponse&lt;List&lt;PaymentCustomersProductModel&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<PaymentCustomersProductModel>> paymentCustomersIdDeleteWithHttpInfo(String paymentCustomerId) throws ApiException {
        Call call = paymentCustomersIdDeleteValidateBeforeCall(paymentCustomerId);
        Type localVarReturnType = new TypeToken<List<PaymentCustomersProductModel>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Delete Payment Customer (asynchronously)
     * Deletes the specified Payment Customer.
     * @param paymentCustomerId Payment Customer ID (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call paymentCustomersIdDeleteAsync(String paymentCustomerId, final ApiCallback<List<PaymentCustomersProductModel>> callback) throws ApiException {
        Call call = paymentCustomersIdDeleteValidateBeforeCall(paymentCustomerId);
        Type localVarReturnType = new TypeToken<List<PaymentCustomersProductModel>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for paymentCustomersIdPut
     * @param paymentCustomerId Payment Customer ID (required)
     * @param body Payment customer properties
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public Call paymentCustomersIdPutCall(String paymentCustomerId, PaymentCustomersDTO body) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/Payment/Customers/{paymentCustomerId}"
            .replaceAll("\\{" + "paymentCustomerId" + "\\}", apiClient.escapeString(paymentCustomerId.toString()));

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
    private Call paymentCustomersIdPutValidateBeforeCall(String paymentCustomerId, PaymentCustomersDTO body) throws ApiException {
        // verify the required parameter 'paymentCustomerId' is set
        if (paymentCustomerId == null) {
            throw new ApiException("Missing the required parameter 'paymentCustomerId' when calling paymentCustomersIdPut(Async)");
        }

        return paymentCustomersIdPutCall(paymentCustomerId, body);
    }

    /**
     * Update Payment Customer
     * Updates the specified Payment Customer with the given data.
     * @param paymentCustomerId Payment Customer ID (required)
     * @param body Payment customer properties
     * @return PaymentCustomersProductModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PaymentCustomersProductModel paymentCustomersIdPut(String paymentCustomerId, PaymentCustomersDTO body) throws ApiException {
        ApiResponse<PaymentCustomersProductModel> resp = paymentCustomersIdPutWithHttpInfo(paymentCustomerId, body);
        return resp.getData();
    }

    /**
     * Update Payment Customer
     * Updates the specified Payment Customer with the given data.
     * @param paymentCustomerId Payment Customer ID (required)
     * @param body Payment customer properties
     * @return ApiResponse&lt;PaymentCustomersProductModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PaymentCustomersProductModel> paymentCustomersIdPutWithHttpInfo(String paymentCustomerId, PaymentCustomersDTO body) throws ApiException {
        Call call = paymentCustomersIdPutValidateBeforeCall(paymentCustomerId, body);
        Type localVarReturnType = new TypeToken<PaymentCustomersProductModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Update Payment Customer (asynchronously)
     * Updates the specified Payment Customer with the given data.
     * @param paymentCustomerId Payment Customer ID (required)
     * @param body Payment customer properties
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call paymentCustomersIdPutAsync(String paymentCustomerId, PaymentCustomersDTO body, final ApiCallback<PaymentCustomersProductModel> callback) throws ApiException {
        Call call = paymentCustomersIdPutValidateBeforeCall(paymentCustomerId, body);
        Type localVarReturnType = new TypeToken<PaymentCustomersProductModel>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for paymentCustomersPost
     * @param body Details of the new Payment Customer
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public Call paymentCustomersPostCall(PaymentCustomersDTO body) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/Payment/Customers";

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
    private Call paymentCustomersPostValidateBeforeCall(PaymentCustomersDTO body) throws ApiException {

        return paymentCustomersPostCall(body);
    }

    /**
     * Create Payment Customer
     * Creates a new Payment Customer with the given data.
     * @param body Details of the new Payment Customer
     * @return PaymentCustomersProductModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PaymentCustomersProductModel paymentCustomersPost(PaymentCustomersDTO body) throws ApiException {
        ApiResponse<PaymentCustomersProductModel> resp = paymentCustomersPostWithHttpInfo(body);
        return resp.getData();
    }

    /**
     * Create Payment Customer
     * Creates a new Payment Customer with the given data.
     * @param body Details of the new Payment Customer
     * @return ApiResponse&lt;PaymentCustomersProductModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PaymentCustomersProductModel> paymentCustomersPostWithHttpInfo(PaymentCustomersDTO body) throws ApiException {
        Call call = paymentCustomersPostValidateBeforeCall(body);
        Type localVarReturnType = new TypeToken<PaymentCustomersProductModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Create Payment Customer (asynchronously)
     * Creates a new Payment Customer with the given data.
     * @param body Details of the new Payment Customer
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call paymentCustomersPostAsync(PaymentCustomersDTO body, final ApiCallback<PaymentCustomersProductModel> callback) throws ApiException {
        Call call = paymentCustomersPostValidateBeforeCall(body);
        Type localVarReturnType = new TypeToken<PaymentCustomersProductModel>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}

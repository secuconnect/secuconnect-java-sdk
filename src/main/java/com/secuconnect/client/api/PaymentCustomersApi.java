package com.secuconnect.client.api;

import com.google.gson.reflect.TypeToken;
import com.secuconnect.client.*;
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
     * @param count The number of items to return.
     * @param offset The position within the whole result set to start returning items (First element is at 0).
     * @param fields List of fields to include in the result. Nested properties can be accessed with this notation: prop1.prop2  Example: prop3,prop1.prop2
     * @param q A query string to restrict the returned items to given conditions. The query string must consist of any combination of single expressions in the form property:condition.  *                   A condition may contain:  *                       - wildcard \&quot;*\&quot; for any number of characters  *                       - wildcard \&quot;?\&quot; for one character  *                       - ranges in the form [value TO value]  *  *                   Single expressions may combined by &#x27;AND&#x27;, &#x27;OR&#x27;, &#x27;NOT&#x27; operators and parenthesis &#x27;(&#x27;, &#x27;)&#x27; for grouping.  *                   Property names can be nested like \&quot;prop1.prop2\&quot;.  *                   Example: (NOT customer.name:meier*) AND (customer.age:[30 TO 40] OR customer.age:[50 TO 60])  *                   
     * @param sort String with comma separated pairs of field:order (e.g. contact.surname:asc,contact.comapnyname:desc). Result set will be sorted by included fields, in ascending &#x27;asc&#x27;, or descending &#x27;dsc&#x27; order.
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
     * GET Payment/Customers
     * Get a list of payment customers
     * @param count The number of items to return.
     * @param offset The position within the whole result set to start returning items (First element is at 0).
     * @param fields List of fields to include in the result. Nested properties can be accessed with this notation: prop1.prop2  Example: prop3,prop1.prop2
     * @param q A query string to restrict the returned items to given conditions. The query string must consist of any combination of single expressions in the form property:condition.  *                   A condition may contain:  *                       - wildcard \&quot;*\&quot; for any number of characters  *                       - wildcard \&quot;?\&quot; for one character  *                       - ranges in the form [value TO value]  *  *                   Single expressions may combined by &#x27;AND&#x27;, &#x27;OR&#x27;, &#x27;NOT&#x27; operators and parenthesis &#x27;(&#x27;, &#x27;)&#x27; for grouping.  *                   Property names can be nested like \&quot;prop1.prop2\&quot;.  *                   Example: (NOT customer.name:meier*) AND (customer.age:[30 TO 40] OR customer.age:[50 TO 60])  *                   
     * @param sort String with comma separated pairs of field:order (e.g. contact.surname:asc,contact.comapnyname:desc). Result set will be sorted by included fields, in ascending &#x27;asc&#x27;, or descending &#x27;dsc&#x27; order.
     * @return PaymentCustomersList
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PaymentCustomersList paymentCustomersGet(Integer count, Integer offset, String fields, String q, String sort) throws ApiException {
        ApiResponse<PaymentCustomersList> resp = paymentCustomersGetWithHttpInfo(count, offset, fields, q, sort);
        return resp.getData();
    }

    /**
     * GET Payment/Customers
     * Get a list of payment customers
     * @param count The number of items to return.
     * @param offset The position within the whole result set to start returning items (First element is at 0).
     * @param fields List of fields to include in the result. Nested properties can be accessed with this notation: prop1.prop2  Example: prop3,prop1.prop2
     * @param q A query string to restrict the returned items to given conditions. The query string must consist of any combination of single expressions in the form property:condition.  *                   A condition may contain:  *                       - wildcard \&quot;*\&quot; for any number of characters  *                       - wildcard \&quot;?\&quot; for one character  *                       - ranges in the form [value TO value]  *  *                   Single expressions may combined by &#x27;AND&#x27;, &#x27;OR&#x27;, &#x27;NOT&#x27; operators and parenthesis &#x27;(&#x27;, &#x27;)&#x27; for grouping.  *                   Property names can be nested like \&quot;prop1.prop2\&quot;.  *                   Example: (NOT customer.name:meier*) AND (customer.age:[30 TO 40] OR customer.age:[50 TO 60])  *                   
     * @param sort String with comma separated pairs of field:order (e.g. contact.surname:asc,contact.comapnyname:desc). Result set will be sorted by included fields, in ascending &#x27;asc&#x27;, or descending &#x27;dsc&#x27; order.
     * @return ApiResponse&lt;PaymentCustomersList&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PaymentCustomersList> paymentCustomersGetWithHttpInfo(Integer count, Integer offset, String fields, String q, String sort) throws ApiException {
        Call call = paymentCustomersGetValidateBeforeCall(count, offset, fields, q, sort);
        Type localVarReturnType = new TypeToken<PaymentCustomersList>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * GET Payment/Customers (asynchronously)
     * Get a list of payment customers
     * @param count The number of items to return.
     * @param offset The position within the whole result set to start returning items (First element is at 0).
     * @param fields List of fields to include in the result. Nested properties can be accessed with this notation: prop1.prop2  Example: prop3,prop1.prop2
     * @param q A query string to restrict the returned items to given conditions. The query string must consist of any combination of single expressions in the form property:condition.  *                   A condition may contain:  *                       - wildcard \&quot;*\&quot; for any number of characters  *                       - wildcard \&quot;?\&quot; for one character  *                       - ranges in the form [value TO value]  *  *                   Single expressions may combined by &#x27;AND&#x27;, &#x27;OR&#x27;, &#x27;NOT&#x27; operators and parenthesis &#x27;(&#x27;, &#x27;)&#x27; for grouping.  *                   Property names can be nested like \&quot;prop1.prop2\&quot;.  *                   Example: (NOT customer.name:meier*) AND (customer.age:[30 TO 40] OR customer.age:[50 TO 60])  *                   
     * @param sort String with comma separated pairs of field:order (e.g. contact.surname:asc,contact.comapnyname:desc). Result set will be sorted by included fields, in ascending &#x27;asc&#x27;, or descending &#x27;dsc&#x27; order.
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
     * @param paymentCustomerId Payment customer id (required)
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
     * GET Payment/Customers/{paymentCustomerId}
     * Get all payment customers
     * @param paymentCustomerId Payment customer id (required)
     * @return PaymentCustomersProductModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PaymentCustomersProductModel paymentCustomersGetById(String paymentCustomerId) throws ApiException {
        ApiResponse<PaymentCustomersProductModel> resp = paymentCustomersGetByIdWithHttpInfo(paymentCustomerId);
        return resp.getData();
    }

    /**
     * GET Payment/Customers/{paymentCustomerId}
     * Get all payment customers
     * @param paymentCustomerId Payment customer id (required)
     * @return ApiResponse&lt;PaymentCustomersProductModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PaymentCustomersProductModel> paymentCustomersGetByIdWithHttpInfo(String paymentCustomerId) throws ApiException {
        Call call = paymentCustomersGetByIdValidateBeforeCall(paymentCustomerId);
        Type localVarReturnType = new TypeToken<PaymentCustomersProductModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * GET Payment/Customers/{paymentCustomerId} (asynchronously)
     * Get all payment customers
     * @param paymentCustomerId Payment customer id (required)
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
     * @param paymentCustomerId Payment customer id (required)
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
     * DELETE Payment/Customers/{paymentCustomerId}
     * Delete payment customer
     * @param paymentCustomerId Payment customer id (required)
     * @return List&lt;PaymentCustomersProductModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<PaymentCustomersProductModel> paymentCustomersIdDelete(String paymentCustomerId) throws ApiException {
        ApiResponse<List<PaymentCustomersProductModel>> resp = paymentCustomersIdDeleteWithHttpInfo(paymentCustomerId);
        return resp.getData();
    }

    /**
     * DELETE Payment/Customers/{paymentCustomerId}
     * Delete payment customer
     * @param paymentCustomerId Payment customer id (required)
     * @return ApiResponse&lt;List&lt;PaymentCustomersProductModel&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<PaymentCustomersProductModel>> paymentCustomersIdDeleteWithHttpInfo(String paymentCustomerId) throws ApiException {
        Call call = paymentCustomersIdDeleteValidateBeforeCall(paymentCustomerId);
        Type localVarReturnType = new TypeToken<List<PaymentCustomersProductModel>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * DELETE Payment/Customers/{paymentCustomerId} (asynchronously)
     * Delete payment customer
     * @param paymentCustomerId Payment customer id (required)
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
     * @param paymentCustomerId Payment customer id (required)
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
     * PUT Payment/Customers/{paymentCustomerId}
     * Update payment customer
     * @param paymentCustomerId Payment customer id (required)
     * @param body Payment customer properties
     * @return PaymentCustomersProductModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PaymentCustomersProductModel paymentCustomersIdPut(String paymentCustomerId, PaymentCustomersDTO body) throws ApiException {
        ApiResponse<PaymentCustomersProductModel> resp = paymentCustomersIdPutWithHttpInfo(paymentCustomerId, body);
        return resp.getData();
    }

    /**
     * PUT Payment/Customers/{paymentCustomerId}
     * Update payment customer
     * @param paymentCustomerId Payment customer id (required)
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
     * PUT Payment/Customers/{paymentCustomerId} (asynchronously)
     * Update payment customer
     * @param paymentCustomerId Payment customer id (required)
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
     * @param body Payment customer properties
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
     * POST Payment/Customers
     * Add new customer
     * @param body Payment customer properties
     * @return PaymentCustomersProductModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PaymentCustomersProductModel paymentCustomersPost(PaymentCustomersDTO body) throws ApiException {
        ApiResponse<PaymentCustomersProductModel> resp = paymentCustomersPostWithHttpInfo(body);
        return resp.getData();
    }

    /**
     * POST Payment/Customers
     * Add new customer
     * @param body Payment customer properties
     * @return ApiResponse&lt;PaymentCustomersProductModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PaymentCustomersProductModel> paymentCustomersPostWithHttpInfo(PaymentCustomersDTO body) throws ApiException {
        Call call = paymentCustomersPostValidateBeforeCall(body);
        Type localVarReturnType = new TypeToken<PaymentCustomersProductModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * POST Payment/Customers (asynchronously)
     * Add new customer
     * @param body Payment customer properties
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

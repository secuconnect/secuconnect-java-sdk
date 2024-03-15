package com.secuconnect.client.api;

import com.google.gson.reflect.TypeToken;
import com.secuconnect.client.*;
import com.secuconnect.client.model.Aggregate;
import java.math.BigDecimal;
import com.secuconnect.client.model.LoyaltyCustomersDTO;
import com.secuconnect.client.model.LoyaltyCustomersList;
import com.secuconnect.client.model.LoyaltyCustomersProductModel;
import com.secuconnect.client.model.ProductExceptionPayload;
import okhttp3.Call;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LoyaltyCustomersApi {
    private ApiClient apiClient;

    public LoyaltyCustomersApi() {
        this(Environment.getGlobalEnv().getApiClient());
    }

    public LoyaltyCustomersApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for addCustomer
     * @param body Loyalty Customer details
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public Call addCustomerCall(LoyaltyCustomersDTO body) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/Loyalty/Customers";

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
    private Call addCustomerValidateBeforeCall(LoyaltyCustomersDTO body) throws ApiException {

        return addCustomerCall(body);
    }

    /**
     * Create Loyalty Customer
     * Creates a new Loyalty Customer using the given data.
     * @param body Loyalty Customer details
     * @return LoyaltyCustomersProductModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public LoyaltyCustomersProductModel addCustomer(LoyaltyCustomersDTO body) throws ApiException {
        ApiResponse<LoyaltyCustomersProductModel> resp = addCustomerWithHttpInfo(body);
        return resp.getData();
    }

    /**
     * Create Loyalty Customer
     * Creates a new Loyalty Customer using the given data.
     * @param body Loyalty Customer details
     * @return ApiResponse&lt;LoyaltyCustomersProductModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<LoyaltyCustomersProductModel> addCustomerWithHttpInfo(LoyaltyCustomersDTO body) throws ApiException {
        Call call = addCustomerValidateBeforeCall(body);
        Type localVarReturnType = new TypeToken<LoyaltyCustomersProductModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Create Loyalty Customer (asynchronously)
     * Creates a new Loyalty Customer using the given data.
     * @param body Loyalty Customer details
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call addCustomerAsync(LoyaltyCustomersDTO body, final ApiCallback<LoyaltyCustomersProductModel> callback) throws ApiException {
        Call call = addCustomerValidateBeforeCall(body);
        Type localVarReturnType = new TypeToken<LoyaltyCustomersProductModel>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for assignPaymentContainer
     * @param loyaltyCustomerId Loyalty Customer ID (required)
     * @param loyaltyPaymentContainerId Loyalty Payment Container ID (required)
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public Call assignPaymentContainerCall(String loyaltyCustomerId, String loyaltyPaymentContainerId) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/Loyalty/Customers/{loyaltyCustomerId}/assignPaymentContainer/{loyaltyPaymentContainerId}"
            .replaceAll("\\{" + "loyaltyCustomerId" + "\\}", apiClient.escapeString(loyaltyCustomerId.toString()))
            .replaceAll("\\{" + "loyaltyPaymentContainerId" + "\\}", apiClient.escapeString(loyaltyPaymentContainerId.toString()));

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
    private Call assignPaymentContainerValidateBeforeCall(String loyaltyCustomerId, String loyaltyPaymentContainerId) throws ApiException {
        // verify the required parameter 'loyaltyCustomerId' is set
        if (loyaltyCustomerId == null) {
            throw new ApiException("Missing the required parameter 'loyaltyCustomerId' when calling assignPaymentContainer(Async)");
        }
        // verify the required parameter 'loyaltyPaymentContainerId' is set
        if (loyaltyPaymentContainerId == null) {
            throw new ApiException("Missing the required parameter 'loyaltyPaymentContainerId' when calling assignPaymentContainer(Async)");
        }

        return assignPaymentContainerCall(loyaltyCustomerId, loyaltyPaymentContainerId);
    }

    /**
     * Assign payment container to customer
     * Assigns the specified Loyalty Payment Container to the specified Loyalty Customer.
     * @param loyaltyCustomerId Loyalty Customer ID (required)
     * @param loyaltyPaymentContainerId Loyalty Payment Container ID (required)
     * @return LoyaltyCustomersProductModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public LoyaltyCustomersProductModel assignPaymentContainer(String loyaltyCustomerId, String loyaltyPaymentContainerId) throws ApiException {
        ApiResponse<LoyaltyCustomersProductModel> resp = assignPaymentContainerWithHttpInfo(loyaltyCustomerId, loyaltyPaymentContainerId);
        return resp.getData();
    }

    /**
     * Assign payment container to customer
     * Assigns the specified Loyalty Payment Container to the specified Loyalty Customer.
     * @param loyaltyCustomerId Loyalty Customer ID (required)
     * @param loyaltyPaymentContainerId Loyalty Payment Container ID (required)
     * @return ApiResponse&lt;LoyaltyCustomersProductModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<LoyaltyCustomersProductModel> assignPaymentContainerWithHttpInfo(String loyaltyCustomerId, String loyaltyPaymentContainerId) throws ApiException {
        Call call = assignPaymentContainerValidateBeforeCall(loyaltyCustomerId, loyaltyPaymentContainerId);
        Type localVarReturnType = new TypeToken<LoyaltyCustomersProductModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Assign payment container to customer (asynchronously)
     * Assigns the specified Loyalty Payment Container to the specified Loyalty Customer.
     * @param loyaltyCustomerId Loyalty Customer ID (required)
     * @param loyaltyPaymentContainerId Loyalty Payment Container ID (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call assignPaymentContainerAsync(String loyaltyCustomerId, String loyaltyPaymentContainerId, final ApiCallback<LoyaltyCustomersProductModel> callback) throws ApiException {
        Call call = assignPaymentContainerValidateBeforeCall(loyaltyCustomerId, loyaltyPaymentContainerId);
        Type localVarReturnType = new TypeToken<LoyaltyCustomersProductModel>(){}.getType();
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
        String localVarPath = "/Loyalty/Customers";

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
     * Find Loyalty Customers
     * Returns the Loyalty Customers matching the given criteria.
     * @param count The maximum number of items to return
     * @param offset The position within the whole result set to start returning items (zero-based)
     * @param fields List of fields to include in the result, all others will be filtered out. Nested properties can be accessed with this notation: &#x60;prop1.prop2&#x60;.
     * @param q A query string to restrict the returned items to given conditions. The query string must consist of any combination of single expressions in the form &#x60;property:condition&#x60;. Property names can be nested like &#x60;property.property&#x60;.  Example: &#x60;customer.name:Meier&#x60;  A condition may contain:  * &#x60;?&#x60; as wildcard for one character;  * &#x60;*&#x60; as wildcard for any number of characters.  You can also use value ranges in the form &#x60;[min TO max]&#x60;.  Example: &#x60;customer.age:[30 TO 40]&#x60;  You can combine expressions logically by &#x60;expr AND expr&#x60; and &#x60;{expr} OR {expr}&#x60;. You can also negate an expression using &#x60;NOT {expr}&#x60;. Parenthesis &#x60;(...)&#x60; can be used to control precedence.  Example: &#x60;(NOT customer.name:meier*) AND (customer.age:[30 TO 40] OR customer.age:[50 TO 60])&#x60;
     * @param sort String with comma separated pairs of &#x60;field:order&#x60;.  Options for order:  * &#x60;asc&#x60; ascending;  * &#x60;desc&#x60; descending.
     * @return LoyaltyCustomersList
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public LoyaltyCustomersList getAll(Integer count, Integer offset, String fields, String q, String sort) throws ApiException {
        ApiResponse<LoyaltyCustomersList> resp = getAllWithHttpInfo(count, offset, fields, q, sort);
        return resp.getData();
    }

    /**
     * Find Loyalty Customers
     * Returns the Loyalty Customers matching the given criteria.
     * @param count The maximum number of items to return
     * @param offset The position within the whole result set to start returning items (zero-based)
     * @param fields List of fields to include in the result, all others will be filtered out. Nested properties can be accessed with this notation: &#x60;prop1.prop2&#x60;.
     * @param q A query string to restrict the returned items to given conditions. The query string must consist of any combination of single expressions in the form &#x60;property:condition&#x60;. Property names can be nested like &#x60;property.property&#x60;.  Example: &#x60;customer.name:Meier&#x60;  A condition may contain:  * &#x60;?&#x60; as wildcard for one character;  * &#x60;*&#x60; as wildcard for any number of characters.  You can also use value ranges in the form &#x60;[min TO max]&#x60;.  Example: &#x60;customer.age:[30 TO 40]&#x60;  You can combine expressions logically by &#x60;expr AND expr&#x60; and &#x60;{expr} OR {expr}&#x60;. You can also negate an expression using &#x60;NOT {expr}&#x60;. Parenthesis &#x60;(...)&#x60; can be used to control precedence.  Example: &#x60;(NOT customer.name:meier*) AND (customer.age:[30 TO 40] OR customer.age:[50 TO 60])&#x60;
     * @param sort String with comma separated pairs of &#x60;field:order&#x60;.  Options for order:  * &#x60;asc&#x60; ascending;  * &#x60;desc&#x60; descending.
     * @return ApiResponse&lt;LoyaltyCustomersList&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<LoyaltyCustomersList> getAllWithHttpInfo(Integer count, Integer offset, String fields, String q, String sort) throws ApiException {
        Call call = getAllValidateBeforeCall(count, offset, fields, q, sort);
        Type localVarReturnType = new TypeToken<LoyaltyCustomersList>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Find Loyalty Customers (asynchronously)
     * Returns the Loyalty Customers matching the given criteria.
     * @param count The maximum number of items to return
     * @param offset The position within the whole result set to start returning items (zero-based)
     * @param fields List of fields to include in the result, all others will be filtered out. Nested properties can be accessed with this notation: &#x60;prop1.prop2&#x60;.
     * @param q A query string to restrict the returned items to given conditions. The query string must consist of any combination of single expressions in the form &#x60;property:condition&#x60;. Property names can be nested like &#x60;property.property&#x60;.  Example: &#x60;customer.name:Meier&#x60;  A condition may contain:  * &#x60;?&#x60; as wildcard for one character;  * &#x60;*&#x60; as wildcard for any number of characters.  You can also use value ranges in the form &#x60;[min TO max]&#x60;.  Example: &#x60;customer.age:[30 TO 40]&#x60;  You can combine expressions logically by &#x60;expr AND expr&#x60; and &#x60;{expr} OR {expr}&#x60;. You can also negate an expression using &#x60;NOT {expr}&#x60;. Parenthesis &#x60;(...)&#x60; can be used to control precedence.  Example: &#x60;(NOT customer.name:meier*) AND (customer.age:[30 TO 40] OR customer.age:[50 TO 60])&#x60;
     * @param sort String with comma separated pairs of &#x60;field:order&#x60;.  Options for order:  * &#x60;asc&#x60; ascending;  * &#x60;desc&#x60; descending.
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call getAllAsync(Integer count, Integer offset, String fields, String q, String sort, final ApiCallback<LoyaltyCustomersList> callback) throws ApiException {
        Call call = getAllValidateBeforeCall(count, offset, fields, q, sort);
        Type localVarReturnType = new TypeToken<LoyaltyCustomersList>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for getOne
     * @param loyaltyCustomerId Loyalty Customer ID (required)
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public Call getOneCall(String loyaltyCustomerId) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/Loyalty/Customers/{loyaltyCustomerId}"
            .replaceAll("\\{" + "loyaltyCustomerId" + "\\}", apiClient.escapeString(loyaltyCustomerId.toString()));

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
    private Call getOneValidateBeforeCall(String loyaltyCustomerId) throws ApiException {
        // verify the required parameter 'loyaltyCustomerId' is set
        if (loyaltyCustomerId == null) {
            throw new ApiException("Missing the required parameter 'loyaltyCustomerId' when calling getOne(Async)");
        }

        return getOneCall(loyaltyCustomerId);
    }

    /**
     * Read Loyalty Customer
     * Returns the specified Loyalty Customer.
     * @param loyaltyCustomerId Loyalty Customer ID (required)
     * @return LoyaltyCustomersProductModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public LoyaltyCustomersProductModel getOne(String loyaltyCustomerId) throws ApiException {
        ApiResponse<LoyaltyCustomersProductModel> resp = getOneWithHttpInfo(loyaltyCustomerId);
        return resp.getData();
    }

    /**
     * Read Loyalty Customer
     * Returns the specified Loyalty Customer.
     * @param loyaltyCustomerId Loyalty Customer ID (required)
     * @return ApiResponse&lt;LoyaltyCustomersProductModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<LoyaltyCustomersProductModel> getOneWithHttpInfo(String loyaltyCustomerId) throws ApiException {
        Call call = getOneValidateBeforeCall(loyaltyCustomerId);
        Type localVarReturnType = new TypeToken<LoyaltyCustomersProductModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Read Loyalty Customer (asynchronously)
     * Returns the specified Loyalty Customer.
     * @param loyaltyCustomerId Loyalty Customer ID (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call getOneAsync(String loyaltyCustomerId, final ApiCallback<LoyaltyCustomersProductModel> callback) throws ApiException {
        Call call = getOneValidateBeforeCall(loyaltyCustomerId);
        Type localVarReturnType = new TypeToken<LoyaltyCustomersProductModel>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for removeAssignedPaymentContainer
     * @param loyaltyCustomerId Loyalty Customer ID (required)
     * @param loyaltyPaymentContainerId Loyalty Payment Container ID (required)
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public Call removeAssignedPaymentContainerCall(String loyaltyCustomerId, String loyaltyPaymentContainerId) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/Loyalty/Customers/{loyaltyCustomerId}/assignPaymentContainer/{loyaltyPaymentContainerId}"
            .replaceAll("\\{" + "loyaltyCustomerId" + "\\}", apiClient.escapeString(loyaltyCustomerId.toString()))
            .replaceAll("\\{" + "loyaltyPaymentContainerId" + "\\}", apiClient.escapeString(loyaltyPaymentContainerId.toString()));

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
    private Call removeAssignedPaymentContainerValidateBeforeCall(String loyaltyCustomerId, String loyaltyPaymentContainerId) throws ApiException {
        // verify the required parameter 'loyaltyCustomerId' is set
        if (loyaltyCustomerId == null) {
            throw new ApiException("Missing the required parameter 'loyaltyCustomerId' when calling removeAssignedPaymentContainer(Async)");
        }
        // verify the required parameter 'loyaltyPaymentContainerId' is set
        if (loyaltyPaymentContainerId == null) {
            throw new ApiException("Missing the required parameter 'loyaltyPaymentContainerId' when calling removeAssignedPaymentContainer(Async)");
        }

        return removeAssignedPaymentContainerCall(loyaltyCustomerId, loyaltyPaymentContainerId);
    }

    /**
     * Detach payment container from customer
     * Detaches the specified Loyalty Payment Container from the specified Loyalty Customer.
     * @param loyaltyCustomerId Loyalty Customer ID (required)
     * @param loyaltyPaymentContainerId Loyalty Payment Container ID (required)
     * @return LoyaltyCustomersProductModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public LoyaltyCustomersProductModel removeAssignedPaymentContainer(String loyaltyCustomerId, String loyaltyPaymentContainerId) throws ApiException {
        ApiResponse<LoyaltyCustomersProductModel> resp = removeAssignedPaymentContainerWithHttpInfo(loyaltyCustomerId, loyaltyPaymentContainerId);
        return resp.getData();
    }

    /**
     * Detach payment container from customer
     * Detaches the specified Loyalty Payment Container from the specified Loyalty Customer.
     * @param loyaltyCustomerId Loyalty Customer ID (required)
     * @param loyaltyPaymentContainerId Loyalty Payment Container ID (required)
     * @return ApiResponse&lt;LoyaltyCustomersProductModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<LoyaltyCustomersProductModel> removeAssignedPaymentContainerWithHttpInfo(String loyaltyCustomerId, String loyaltyPaymentContainerId) throws ApiException {
        Call call = removeAssignedPaymentContainerValidateBeforeCall(loyaltyCustomerId, loyaltyPaymentContainerId);
        Type localVarReturnType = new TypeToken<LoyaltyCustomersProductModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Detach payment container from customer (asynchronously)
     * Detaches the specified Loyalty Payment Container from the specified Loyalty Customer.
     * @param loyaltyCustomerId Loyalty Customer ID (required)
     * @param loyaltyPaymentContainerId Loyalty Payment Container ID (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call removeAssignedPaymentContainerAsync(String loyaltyCustomerId, String loyaltyPaymentContainerId, final ApiCallback<LoyaltyCustomersProductModel> callback) throws ApiException {
        Call call = removeAssignedPaymentContainerValidateBeforeCall(loyaltyCustomerId, loyaltyPaymentContainerId);
        Type localVarReturnType = new TypeToken<LoyaltyCustomersProductModel>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for updateCustomer
     * @param loyaltyCustomerId Loyalty Customer ID (required)
     * @param body Loyalty Customer details
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public Call updateCustomerCall(String loyaltyCustomerId, LoyaltyCustomersDTO body) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/Loyalty/Customers/{loyaltyCustomerId}"
            .replaceAll("\\{" + "loyaltyCustomerId" + "\\}", apiClient.escapeString(loyaltyCustomerId.toString()));

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
    private Call updateCustomerValidateBeforeCall(String loyaltyCustomerId, LoyaltyCustomersDTO body) throws ApiException {
        // verify the required parameter 'loyaltyCustomerId' is set
        if (loyaltyCustomerId == null) {
            throw new ApiException("Missing the required parameter 'loyaltyCustomerId' when calling updateCustomer(Async)");
        }

        return updateCustomerCall(loyaltyCustomerId, body);
    }

    /**
     * Update Loyalty Customer
     * Updates the specified Loyalty Customer using the given data.
     * @param loyaltyCustomerId Loyalty Customer ID (required)
     * @param body Loyalty Customer details
     * @return LoyaltyCustomersProductModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public LoyaltyCustomersProductModel updateCustomer(String loyaltyCustomerId, LoyaltyCustomersDTO body) throws ApiException {
        ApiResponse<LoyaltyCustomersProductModel> resp = updateCustomerWithHttpInfo(loyaltyCustomerId, body);
        return resp.getData();
    }

    /**
     * Update Loyalty Customer
     * Updates the specified Loyalty Customer using the given data.
     * @param loyaltyCustomerId Loyalty Customer ID (required)
     * @param body Loyalty Customer details
     * @return ApiResponse&lt;LoyaltyCustomersProductModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<LoyaltyCustomersProductModel> updateCustomerWithHttpInfo(String loyaltyCustomerId, LoyaltyCustomersDTO body) throws ApiException {
        Call call = updateCustomerValidateBeforeCall(loyaltyCustomerId, body);
        Type localVarReturnType = new TypeToken<LoyaltyCustomersProductModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Update Loyalty Customer (asynchronously)
     * Updates the specified Loyalty Customer using the given data.
     * @param loyaltyCustomerId Loyalty Customer ID (required)
     * @param body Loyalty Customer details
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call updateCustomerAsync(String loyaltyCustomerId, LoyaltyCustomersDTO body, final ApiCallback<LoyaltyCustomersProductModel> callback) throws ApiException {
        Call call = updateCustomerValidateBeforeCall(loyaltyCustomerId, body);
        Type localVarReturnType = new TypeToken<LoyaltyCustomersProductModel>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}

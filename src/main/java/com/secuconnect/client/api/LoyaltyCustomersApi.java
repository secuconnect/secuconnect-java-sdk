package com.secuconnect.client.api;

import com.google.gson.reflect.TypeToken;
import com.secuconnect.client.*;
import com.secuconnect.client.model.CustomersWithoutMerchantcardAndDuplicatedCustomers;
import com.secuconnect.client.model.LoyaltyCustomersDTO;
import com.secuconnect.client.model.LoyaltyCustomersList;
import com.secuconnect.client.model.LoyaltyCustomersProductModel;
import com.secuconnect.client.model.LoyaltyCustomersRemoved;
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
     * @param body loyalty Customer container properties
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
     * POST Loyalty/Customers
     * Add loyalty customer
     * @param body loyalty Customer container properties
     * @return LoyaltyCustomersProductModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public LoyaltyCustomersProductModel addCustomer(LoyaltyCustomersDTO body) throws ApiException {
        ApiResponse<LoyaltyCustomersProductModel> resp = addCustomerWithHttpInfo(body);
        return resp.getData();
    }

    /**
     * POST Loyalty/Customers
     * Add loyalty customer
     * @param body loyalty Customer container properties
     * @return ApiResponse&lt;LoyaltyCustomersProductModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<LoyaltyCustomersProductModel> addCustomerWithHttpInfo(LoyaltyCustomersDTO body) throws ApiException {
        Call call = addCustomerValidateBeforeCall(body);
        Type localVarReturnType = new TypeToken<LoyaltyCustomersProductModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * POST Loyalty/Customers (asynchronously)
     * Add loyalty customer
     * @param body loyalty Customer container properties
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
     * @param loyaltyCustomerId Loyalty customer id (required)
     * @param loyaltyPaymentContainerId LoyaltyPaymentContainer id (required)
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
     * POST Loyalty/Customers/{loyaltyCustomerId}/assignPaymentContainer/{loyaltyPaymentContainerId}
     * Assigns LoyaltyPaymentContainer to customer
     * @param loyaltyCustomerId Loyalty customer id (required)
     * @param loyaltyPaymentContainerId LoyaltyPaymentContainer id (required)
     * @return LoyaltyCustomersProductModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public LoyaltyCustomersProductModel assignPaymentContainer(String loyaltyCustomerId, String loyaltyPaymentContainerId) throws ApiException {
        ApiResponse<LoyaltyCustomersProductModel> resp = assignPaymentContainerWithHttpInfo(loyaltyCustomerId, loyaltyPaymentContainerId);
        return resp.getData();
    }

    /**
     * POST Loyalty/Customers/{loyaltyCustomerId}/assignPaymentContainer/{loyaltyPaymentContainerId}
     * Assigns LoyaltyPaymentContainer to customer
     * @param loyaltyCustomerId Loyalty customer id (required)
     * @param loyaltyPaymentContainerId LoyaltyPaymentContainer id (required)
     * @return ApiResponse&lt;LoyaltyCustomersProductModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<LoyaltyCustomersProductModel> assignPaymentContainerWithHttpInfo(String loyaltyCustomerId, String loyaltyPaymentContainerId) throws ApiException {
        Call call = assignPaymentContainerValidateBeforeCall(loyaltyCustomerId, loyaltyPaymentContainerId);
        Type localVarReturnType = new TypeToken<LoyaltyCustomersProductModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * POST Loyalty/Customers/{loyaltyCustomerId}/assignPaymentContainer/{loyaltyPaymentContainerId} (asynchronously)
     * Assigns LoyaltyPaymentContainer to customer
     * @param loyaltyCustomerId Loyalty customer id (required)
     * @param loyaltyPaymentContainerId LoyaltyPaymentContainer id (required)
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
     * Build call for checkForDuplicates
     * @param loyaltyCustomerId Loyalty customer id (required)
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public Call checkForDuplicatesCall(String loyaltyCustomerId) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/Loyalty/Customers/{loyaltyCustomerId}/checkDuplicated/"
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
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames);
    }

    @SuppressWarnings("rawtypes")
    private Call checkForDuplicatesValidateBeforeCall(String loyaltyCustomerId) throws ApiException {
        // verify the required parameter 'loyaltyCustomerId' is set
        if (loyaltyCustomerId == null) {
            throw new ApiException("Missing the required parameter 'loyaltyCustomerId' when calling checkForDuplicates(Async)");
        }

        return checkForDuplicatesCall(loyaltyCustomerId);
    }

    /**
     * POST Loyalty/Customers/{loyaltyCustomerId}/checkDuplicated/
     * check if there are duplicated customers for a given merchant
     * @param loyaltyCustomerId Loyalty customer id (required)
     * @return CustomersWithoutMerchantcardAndDuplicatedCustomers
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CustomersWithoutMerchantcardAndDuplicatedCustomers checkForDuplicates(String loyaltyCustomerId) throws ApiException {
        ApiResponse<CustomersWithoutMerchantcardAndDuplicatedCustomers> resp = checkForDuplicatesWithHttpInfo(loyaltyCustomerId);
        return resp.getData();
    }

    /**
     * POST Loyalty/Customers/{loyaltyCustomerId}/checkDuplicated/
     * check if there are duplicated customers for a given merchant
     * @param loyaltyCustomerId Loyalty customer id (required)
     * @return ApiResponse&lt;CustomersWithoutMerchantcardAndDuplicatedCustomers&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CustomersWithoutMerchantcardAndDuplicatedCustomers> checkForDuplicatesWithHttpInfo(String loyaltyCustomerId) throws ApiException {
        Call call = checkForDuplicatesValidateBeforeCall(loyaltyCustomerId);
        Type localVarReturnType = new TypeToken<CustomersWithoutMerchantcardAndDuplicatedCustomers>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * POST Loyalty/Customers/{loyaltyCustomerId}/checkDuplicated/ (asynchronously)
     * check if there are duplicated customers for a given merchant
     * @param loyaltyCustomerId Loyalty customer id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call checkForDuplicatesAsync(String loyaltyCustomerId, final ApiCallback<CustomersWithoutMerchantcardAndDuplicatedCustomers> callback) throws ApiException {
        Call call = checkForDuplicatesValidateBeforeCall(loyaltyCustomerId);
        Type localVarReturnType = new TypeToken<CustomersWithoutMerchantcardAndDuplicatedCustomers>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for getAll
     * @param count The number of items to return.
     * @param offset The position within the whole result set to start returning items (First element is at 0).
     * @param fields List of fields to include in the result. Nested properties can be accessed with this notation: prop1.prop2  Example: prop3,prop1.prop2
     * @param q A query string to restrict the returned items to given conditions. The query string must consist of any combination of single expressions in the form property:condition.  *                   A condition may contain:  *                       - wildcard \&quot;*\&quot; for any number of characters  *                       - wildcard \&quot;?\&quot; for one character  *                       - ranges in the form [value TO value]  *  *                   Single expressions may combined by &#x27;AND&#x27;, &#x27;OR&#x27;, &#x27;NOT&#x27; operators and parenthesis &#x27;(&#x27;, &#x27;)&#x27; for grouping.  *                   Property names can be nested like \&quot;prop1.prop2\&quot;.  *                   Example: (NOT customer.name:meier*) AND (customer.age:[30 TO 40] OR customer.age:[50 TO 60])  *                   
     * @param sort String with comma separated pairs of field:order (e.g. contact.surname:asc,contact.comapnyname:desc). Result set will be sorted by included fields, in ascending &#x27;asc&#x27;, or descending &#x27;dsc&#x27; order.
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
     * GET Loyalty/Customers
     * Get a list of loyalty customers
     * @param count The number of items to return.
     * @param offset The position within the whole result set to start returning items (First element is at 0).
     * @param fields List of fields to include in the result. Nested properties can be accessed with this notation: prop1.prop2  Example: prop3,prop1.prop2
     * @param q A query string to restrict the returned items to given conditions. The query string must consist of any combination of single expressions in the form property:condition.  *                   A condition may contain:  *                       - wildcard \&quot;*\&quot; for any number of characters  *                       - wildcard \&quot;?\&quot; for one character  *                       - ranges in the form [value TO value]  *  *                   Single expressions may combined by &#x27;AND&#x27;, &#x27;OR&#x27;, &#x27;NOT&#x27; operators and parenthesis &#x27;(&#x27;, &#x27;)&#x27; for grouping.  *                   Property names can be nested like \&quot;prop1.prop2\&quot;.  *                   Example: (NOT customer.name:meier*) AND (customer.age:[30 TO 40] OR customer.age:[50 TO 60])  *                   
     * @param sort String with comma separated pairs of field:order (e.g. contact.surname:asc,contact.comapnyname:desc). Result set will be sorted by included fields, in ascending &#x27;asc&#x27;, or descending &#x27;dsc&#x27; order.
     * @return LoyaltyCustomersList
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public LoyaltyCustomersList getAll(Integer count, Integer offset, String fields, String q, String sort) throws ApiException {
        ApiResponse<LoyaltyCustomersList> resp = getAllWithHttpInfo(count, offset, fields, q, sort);
        return resp.getData();
    }

    /**
     * GET Loyalty/Customers
     * Get a list of loyalty customers
     * @param count The number of items to return.
     * @param offset The position within the whole result set to start returning items (First element is at 0).
     * @param fields List of fields to include in the result. Nested properties can be accessed with this notation: prop1.prop2  Example: prop3,prop1.prop2
     * @param q A query string to restrict the returned items to given conditions. The query string must consist of any combination of single expressions in the form property:condition.  *                   A condition may contain:  *                       - wildcard \&quot;*\&quot; for any number of characters  *                       - wildcard \&quot;?\&quot; for one character  *                       - ranges in the form [value TO value]  *  *                   Single expressions may combined by &#x27;AND&#x27;, &#x27;OR&#x27;, &#x27;NOT&#x27; operators and parenthesis &#x27;(&#x27;, &#x27;)&#x27; for grouping.  *                   Property names can be nested like \&quot;prop1.prop2\&quot;.  *                   Example: (NOT customer.name:meier*) AND (customer.age:[30 TO 40] OR customer.age:[50 TO 60])  *                   
     * @param sort String with comma separated pairs of field:order (e.g. contact.surname:asc,contact.comapnyname:desc). Result set will be sorted by included fields, in ascending &#x27;asc&#x27;, or descending &#x27;dsc&#x27; order.
     * @return ApiResponse&lt;LoyaltyCustomersList&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<LoyaltyCustomersList> getAllWithHttpInfo(Integer count, Integer offset, String fields, String q, String sort) throws ApiException {
        Call call = getAllValidateBeforeCall(count, offset, fields, q, sort);
        Type localVarReturnType = new TypeToken<LoyaltyCustomersList>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * GET Loyalty/Customers (asynchronously)
     * Get a list of loyalty customers
     * @param count The number of items to return.
     * @param offset The position within the whole result set to start returning items (First element is at 0).
     * @param fields List of fields to include in the result. Nested properties can be accessed with this notation: prop1.prop2  Example: prop3,prop1.prop2
     * @param q A query string to restrict the returned items to given conditions. The query string must consist of any combination of single expressions in the form property:condition.  *                   A condition may contain:  *                       - wildcard \&quot;*\&quot; for any number of characters  *                       - wildcard \&quot;?\&quot; for one character  *                       - ranges in the form [value TO value]  *  *                   Single expressions may combined by &#x27;AND&#x27;, &#x27;OR&#x27;, &#x27;NOT&#x27; operators and parenthesis &#x27;(&#x27;, &#x27;)&#x27; for grouping.  *                   Property names can be nested like \&quot;prop1.prop2\&quot;.  *                   Example: (NOT customer.name:meier*) AND (customer.age:[30 TO 40] OR customer.age:[50 TO 60])  *                   
     * @param sort String with comma separated pairs of field:order (e.g. contact.surname:asc,contact.comapnyname:desc). Result set will be sorted by included fields, in ascending &#x27;asc&#x27;, or descending &#x27;dsc&#x27; order.
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
     * @param loyaltyCustomerId Search one loyalty customer by provided id (required)
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
     * GET Loyalty/Customers/{loyaltyCustomerId}
     * Get loyalty customer for a specific id
     * @param loyaltyCustomerId Search one loyalty customer by provided id (required)
     * @return LoyaltyCustomersProductModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public LoyaltyCustomersProductModel getOne(String loyaltyCustomerId) throws ApiException {
        ApiResponse<LoyaltyCustomersProductModel> resp = getOneWithHttpInfo(loyaltyCustomerId);
        return resp.getData();
    }

    /**
     * GET Loyalty/Customers/{loyaltyCustomerId}
     * Get loyalty customer for a specific id
     * @param loyaltyCustomerId Search one loyalty customer by provided id (required)
     * @return ApiResponse&lt;LoyaltyCustomersProductModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<LoyaltyCustomersProductModel> getOneWithHttpInfo(String loyaltyCustomerId) throws ApiException {
        Call call = getOneValidateBeforeCall(loyaltyCustomerId);
        Type localVarReturnType = new TypeToken<LoyaltyCustomersProductModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * GET Loyalty/Customers/{loyaltyCustomerId} (asynchronously)
     * Get loyalty customer for a specific id
     * @param loyaltyCustomerId Search one loyalty customer by provided id (required)
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
     * @param loyaltyCustomerId Loyalty customer id (required)
     * @param loyaltyPaymentContainerId LoyaltyPaymentContainer id (required)
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
     * DELETE Loyalty/Customers/{loyaltyCustomerId}/assignPaymentContainer/{loyaltyPaymentContainerId}
     * Removes an assigned LoyaltyPaymentContainer from customer
     * @param loyaltyCustomerId Loyalty customer id (required)
     * @param loyaltyPaymentContainerId LoyaltyPaymentContainer id (required)
     * @return LoyaltyCustomersProductModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public LoyaltyCustomersProductModel removeAssignedPaymentContainer(String loyaltyCustomerId, String loyaltyPaymentContainerId) throws ApiException {
        ApiResponse<LoyaltyCustomersProductModel> resp = removeAssignedPaymentContainerWithHttpInfo(loyaltyCustomerId, loyaltyPaymentContainerId);
        return resp.getData();
    }

    /**
     * DELETE Loyalty/Customers/{loyaltyCustomerId}/assignPaymentContainer/{loyaltyPaymentContainerId}
     * Removes an assigned LoyaltyPaymentContainer from customer
     * @param loyaltyCustomerId Loyalty customer id (required)
     * @param loyaltyPaymentContainerId LoyaltyPaymentContainer id (required)
     * @return ApiResponse&lt;LoyaltyCustomersProductModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<LoyaltyCustomersProductModel> removeAssignedPaymentContainerWithHttpInfo(String loyaltyCustomerId, String loyaltyPaymentContainerId) throws ApiException {
        Call call = removeAssignedPaymentContainerValidateBeforeCall(loyaltyCustomerId, loyaltyPaymentContainerId);
        Type localVarReturnType = new TypeToken<LoyaltyCustomersProductModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * DELETE Loyalty/Customers/{loyaltyCustomerId}/assignPaymentContainer/{loyaltyPaymentContainerId} (asynchronously)
     * Removes an assigned LoyaltyPaymentContainer from customer
     * @param loyaltyCustomerId Loyalty customer id (required)
     * @param loyaltyPaymentContainerId LoyaltyPaymentContainer id (required)
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
     * Build call for removeCustomer
     * @param loyaltyCustomerId Loyalty customer id (required)
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public Call removeCustomerCall(String loyaltyCustomerId) throws ApiException {
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
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames);
    }

    @SuppressWarnings("rawtypes")
    private Call removeCustomerValidateBeforeCall(String loyaltyCustomerId) throws ApiException {
        // verify the required parameter 'loyaltyCustomerId' is set
        if (loyaltyCustomerId == null) {
            throw new ApiException("Missing the required parameter 'loyaltyCustomerId' when calling removeCustomer(Async)");
        }

        return removeCustomerCall(loyaltyCustomerId);
    }

    /**
     * DELETE Loyalty/Customers/{loyaltyCustomerId}
     * Remove assigned loyalty customer
     * @param loyaltyCustomerId Loyalty customer id (required)
     * @return LoyaltyCustomersRemoved
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public LoyaltyCustomersRemoved removeCustomer(String loyaltyCustomerId) throws ApiException {
        ApiResponse<LoyaltyCustomersRemoved> resp = removeCustomerWithHttpInfo(loyaltyCustomerId);
        return resp.getData();
    }

    /**
     * DELETE Loyalty/Customers/{loyaltyCustomerId}
     * Remove assigned loyalty customer
     * @param loyaltyCustomerId Loyalty customer id (required)
     * @return ApiResponse&lt;LoyaltyCustomersRemoved&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<LoyaltyCustomersRemoved> removeCustomerWithHttpInfo(String loyaltyCustomerId) throws ApiException {
        Call call = removeCustomerValidateBeforeCall(loyaltyCustomerId);
        Type localVarReturnType = new TypeToken<LoyaltyCustomersRemoved>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * DELETE Loyalty/Customers/{loyaltyCustomerId} (asynchronously)
     * Remove assigned loyalty customer
     * @param loyaltyCustomerId Loyalty customer id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call removeCustomerAsync(String loyaltyCustomerId, final ApiCallback<LoyaltyCustomersRemoved> callback) throws ApiException {
        Call call = removeCustomerValidateBeforeCall(loyaltyCustomerId);
        Type localVarReturnType = new TypeToken<LoyaltyCustomersRemoved>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for updateCustomer
     * @param loyaltyCustomerId loyalty Customer Id CUS_XXX (required)
     * @param body loyalty Customer container properties
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
     * PUT Loyalty/Customers/{loyaltyCustomerId}
     * Function to update customer&#x27;s data
     * @param loyaltyCustomerId loyalty Customer Id CUS_XXX (required)
     * @param body loyalty Customer container properties
     * @return LoyaltyCustomersProductModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public LoyaltyCustomersProductModel updateCustomer(String loyaltyCustomerId, LoyaltyCustomersDTO body) throws ApiException {
        ApiResponse<LoyaltyCustomersProductModel> resp = updateCustomerWithHttpInfo(loyaltyCustomerId, body);
        return resp.getData();
    }

    /**
     * PUT Loyalty/Customers/{loyaltyCustomerId}
     * Function to update customer&#x27;s data
     * @param loyaltyCustomerId loyalty Customer Id CUS_XXX (required)
     * @param body loyalty Customer container properties
     * @return ApiResponse&lt;LoyaltyCustomersProductModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<LoyaltyCustomersProductModel> updateCustomerWithHttpInfo(String loyaltyCustomerId, LoyaltyCustomersDTO body) throws ApiException {
        Call call = updateCustomerValidateBeforeCall(loyaltyCustomerId, body);
        Type localVarReturnType = new TypeToken<LoyaltyCustomersProductModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * PUT Loyalty/Customers/{loyaltyCustomerId} (asynchronously)
     * Function to update customer&#x27;s data
     * @param loyaltyCustomerId loyalty Customer Id CUS_XXX (required)
     * @param body loyalty Customer container properties
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

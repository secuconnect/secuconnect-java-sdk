package com.secuconnect.client.api;

import com.google.gson.reflect.TypeToken;
import com.secuconnect.client.*;
import com.secuconnect.client.model.PaymentContainersDTO;
import com.secuconnect.client.model.PaymentContainersList;
import com.secuconnect.client.model.PaymentContainersProductModel;
import com.secuconnect.client.model.ProductExceptionPayload;
import okhttp3.Call;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PaymentContainersApi {
    private ApiClient apiClient;

    public PaymentContainersApi() {
        this(Environment.getGlobalEnv().getApiClient());
    }

    public PaymentContainersApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for paymentContainersGet
     * @param count The maximum number of items to return
     * @param offset The position within the whole result set to start returning items (zero-based)
     * @param fields List of fields to include in the result. Nested properties can be accessed with this notation: &#x60;prop1.prop2&#x60;.
     * @param q A query string to restrict the returned items to given conditions. The query string must consist of any combination of single expressions in the form &#x60;property:condition&#x60;. Property names can be nested like &#x60;property.property&#x60;.  Example: &#x60;customer.name:Meier&#x60;  A condition may contain:  * &#x60;?&#x60; as wildcard for one character;  * &#x60;*&#x60; as wildcard for any number of characters.  You can also use value ranges in the form &#x60;[min TO max]&#x60;.  Example: &#x60;customer.age:[30 TO 40]&#x60;  You can combine expressions logically by &#x60;expr AND expr&#x60; and &#x60;{expr} OR {expr}&#x60;. You can also negate an expression using &#x60;NOT {expr}&#x60;. Parenthesis &#x60;(...)&#x60; can be used to control precedence.  Example: &#x60;(NOT customer.name:meier*) AND (customer.age:[30 TO 40] OR customer.age:[50 TO 60])&#x60;
     * @param sort String with comma separated pairs of &#x60;field:order&#x60;.   Options for order:  * &#x60;asc&#x60; ascending;  * &#x60;dsc&#x60; descending.
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public Call paymentContainersGetCall(Integer count, Integer offset, String fields, String q, String sort) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/Payment/Containers";

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
    private Call paymentContainersGetValidateBeforeCall(Integer count, Integer offset, String fields, String q, String sort) throws ApiException {

        return paymentContainersGetCall(count, offset, fields, q, sort);
    }

    /**
     * GET Payment/Containers
     * Get a list of payment containers
     * @param count The maximum number of items to return
     * @param offset The position within the whole result set to start returning items (zero-based)
     * @param fields List of fields to include in the result. Nested properties can be accessed with this notation: &#x60;prop1.prop2&#x60;.
     * @param q A query string to restrict the returned items to given conditions. The query string must consist of any combination of single expressions in the form &#x60;property:condition&#x60;. Property names can be nested like &#x60;property.property&#x60;.  Example: &#x60;customer.name:Meier&#x60;  A condition may contain:  * &#x60;?&#x60; as wildcard for one character;  * &#x60;*&#x60; as wildcard for any number of characters.  You can also use value ranges in the form &#x60;[min TO max]&#x60;.  Example: &#x60;customer.age:[30 TO 40]&#x60;  You can combine expressions logically by &#x60;expr AND expr&#x60; and &#x60;{expr} OR {expr}&#x60;. You can also negate an expression using &#x60;NOT {expr}&#x60;. Parenthesis &#x60;(...)&#x60; can be used to control precedence.  Example: &#x60;(NOT customer.name:meier*) AND (customer.age:[30 TO 40] OR customer.age:[50 TO 60])&#x60;
     * @param sort String with comma separated pairs of &#x60;field:order&#x60;.   Options for order:  * &#x60;asc&#x60; ascending;  * &#x60;dsc&#x60; descending.
     * @return PaymentContainersList
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PaymentContainersList paymentContainersGet(Integer count, Integer offset, String fields, String q, String sort) throws ApiException {
        ApiResponse<PaymentContainersList> resp = paymentContainersGetWithHttpInfo(count, offset, fields, q, sort);
        return resp.getData();
    }

    /**
     * GET Payment/Containers
     * Get a list of payment containers
     * @param count The maximum number of items to return
     * @param offset The position within the whole result set to start returning items (zero-based)
     * @param fields List of fields to include in the result. Nested properties can be accessed with this notation: &#x60;prop1.prop2&#x60;.
     * @param q A query string to restrict the returned items to given conditions. The query string must consist of any combination of single expressions in the form &#x60;property:condition&#x60;. Property names can be nested like &#x60;property.property&#x60;.  Example: &#x60;customer.name:Meier&#x60;  A condition may contain:  * &#x60;?&#x60; as wildcard for one character;  * &#x60;*&#x60; as wildcard for any number of characters.  You can also use value ranges in the form &#x60;[min TO max]&#x60;.  Example: &#x60;customer.age:[30 TO 40]&#x60;  You can combine expressions logically by &#x60;expr AND expr&#x60; and &#x60;{expr} OR {expr}&#x60;. You can also negate an expression using &#x60;NOT {expr}&#x60;. Parenthesis &#x60;(...)&#x60; can be used to control precedence.  Example: &#x60;(NOT customer.name:meier*) AND (customer.age:[30 TO 40] OR customer.age:[50 TO 60])&#x60;
     * @param sort String with comma separated pairs of &#x60;field:order&#x60;.   Options for order:  * &#x60;asc&#x60; ascending;  * &#x60;dsc&#x60; descending.
     * @return ApiResponse&lt;PaymentContainersList&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PaymentContainersList> paymentContainersGetWithHttpInfo(Integer count, Integer offset, String fields, String q, String sort) throws ApiException {
        Call call = paymentContainersGetValidateBeforeCall(count, offset, fields, q, sort);
        Type localVarReturnType = new TypeToken<PaymentContainersList>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * GET Payment/Containers (asynchronously)
     * Get a list of payment containers
     * @param count The maximum number of items to return
     * @param offset The position within the whole result set to start returning items (zero-based)
     * @param fields List of fields to include in the result. Nested properties can be accessed with this notation: &#x60;prop1.prop2&#x60;.
     * @param q A query string to restrict the returned items to given conditions. The query string must consist of any combination of single expressions in the form &#x60;property:condition&#x60;. Property names can be nested like &#x60;property.property&#x60;.  Example: &#x60;customer.name:Meier&#x60;  A condition may contain:  * &#x60;?&#x60; as wildcard for one character;  * &#x60;*&#x60; as wildcard for any number of characters.  You can also use value ranges in the form &#x60;[min TO max]&#x60;.  Example: &#x60;customer.age:[30 TO 40]&#x60;  You can combine expressions logically by &#x60;expr AND expr&#x60; and &#x60;{expr} OR {expr}&#x60;. You can also negate an expression using &#x60;NOT {expr}&#x60;. Parenthesis &#x60;(...)&#x60; can be used to control precedence.  Example: &#x60;(NOT customer.name:meier*) AND (customer.age:[30 TO 40] OR customer.age:[50 TO 60])&#x60;
     * @param sort String with comma separated pairs of &#x60;field:order&#x60;.   Options for order:  * &#x60;asc&#x60; ascending;  * &#x60;dsc&#x60; descending.
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call paymentContainersGetAsync(Integer count, Integer offset, String fields, String q, String sort, final ApiCallback<PaymentContainersList> callback) throws ApiException {
        Call call = paymentContainersGetValidateBeforeCall(count, offset, fields, q, sort);
        Type localVarReturnType = new TypeToken<PaymentContainersList>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for paymentContainersGetById
     * @param paymentContainerId Search one by provided id (required)
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public Call paymentContainersGetByIdCall(String paymentContainerId) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/Payment/Containers/{paymentContainerId}"
            .replaceAll("\\{" + "paymentContainerId" + "\\}", apiClient.escapeString(paymentContainerId.toString()));

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
    private Call paymentContainersGetByIdValidateBeforeCall(String paymentContainerId) throws ApiException {
        // verify the required parameter 'paymentContainerId' is set
        if (paymentContainerId == null) {
            throw new ApiException("Missing the required parameter 'paymentContainerId' when calling paymentContainersGetById(Async)");
        }

        return paymentContainersGetByIdCall(paymentContainerId);
    }

    /**
     * GET Payment/Containers/{paymentContainerId}
     * Get all payment containers
     * @param paymentContainerId Search one by provided id (required)
     * @return PaymentContainersProductModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PaymentContainersProductModel paymentContainersGetById(String paymentContainerId) throws ApiException {
        ApiResponse<PaymentContainersProductModel> resp = paymentContainersGetByIdWithHttpInfo(paymentContainerId);
        return resp.getData();
    }

    /**
     * GET Payment/Containers/{paymentContainerId}
     * Get all payment containers
     * @param paymentContainerId Search one by provided id (required)
     * @return ApiResponse&lt;PaymentContainersProductModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PaymentContainersProductModel> paymentContainersGetByIdWithHttpInfo(String paymentContainerId) throws ApiException {
        Call call = paymentContainersGetByIdValidateBeforeCall(paymentContainerId);
        Type localVarReturnType = new TypeToken<PaymentContainersProductModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * GET Payment/Containers/{paymentContainerId} (asynchronously)
     * Get all payment containers
     * @param paymentContainerId Search one by provided id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call paymentContainersGetByIdAsync(String paymentContainerId, final ApiCallback<PaymentContainersProductModel> callback) throws ApiException {
        Call call = paymentContainersGetByIdValidateBeforeCall(paymentContainerId);
        Type localVarReturnType = new TypeToken<PaymentContainersProductModel>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for paymentContainersIdAssignSecondaryIdDelete
     * @param paymentContainerId Payment container id (required)
     * @param secondaryPaymentContainerId Id for which container is currently assigned to (required)
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public Call paymentContainersIdAssignSecondaryIdDeleteCall(String paymentContainerId, String secondaryPaymentContainerId) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/Payment/Containers/{paymentContainerId}/assign/{secondaryPaymentContainerId}"
            .replaceAll("\\{" + "paymentContainerId" + "\\}", apiClient.escapeString(paymentContainerId.toString()))
            .replaceAll("\\{" + "secondaryPaymentContainerId" + "\\}", apiClient.escapeString(secondaryPaymentContainerId.toString()));

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
    private Call paymentContainersIdAssignSecondaryIdDeleteValidateBeforeCall(String paymentContainerId, String secondaryPaymentContainerId) throws ApiException {
        // verify the required parameter 'paymentContainerId' is set
        if (paymentContainerId == null) {
            throw new ApiException("Missing the required parameter 'paymentContainerId' when calling paymentContainersIdAssignSecondaryIdDelete(Async)");
        }
        // verify the required parameter 'secondaryPaymentContainerId' is set
        if (secondaryPaymentContainerId == null) {
            throw new ApiException("Missing the required parameter 'secondaryPaymentContainerId' when calling paymentContainersIdAssignSecondaryIdDelete(Async)");
        }

        return paymentContainersIdAssignSecondaryIdDeleteCall(paymentContainerId, secondaryPaymentContainerId);
    }

    /**
     * DELETE Payment/Containers/{paymentContainerId}/assign/{secondaryPaymentContainerId}
     * Removes an existing payment container assignment
     * @param paymentContainerId Payment container id (required)
     * @param secondaryPaymentContainerId Id for which container is currently assigned to (required)
     * @return List&lt;PaymentContainersProductModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<PaymentContainersProductModel> paymentContainersIdAssignSecondaryIdDelete(String paymentContainerId, String secondaryPaymentContainerId) throws ApiException {
        ApiResponse<List<PaymentContainersProductModel>> resp = paymentContainersIdAssignSecondaryIdDeleteWithHttpInfo(paymentContainerId, secondaryPaymentContainerId);
        return resp.getData();
    }

    /**
     * DELETE Payment/Containers/{paymentContainerId}/assign/{secondaryPaymentContainerId}
     * Removes an existing payment container assignment
     * @param paymentContainerId Payment container id (required)
     * @param secondaryPaymentContainerId Id for which container is currently assigned to (required)
     * @return ApiResponse&lt;List&lt;PaymentContainersProductModel&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<PaymentContainersProductModel>> paymentContainersIdAssignSecondaryIdDeleteWithHttpInfo(String paymentContainerId, String secondaryPaymentContainerId) throws ApiException {
        Call call = paymentContainersIdAssignSecondaryIdDeleteValidateBeforeCall(paymentContainerId, secondaryPaymentContainerId);
        Type localVarReturnType = new TypeToken<List<PaymentContainersProductModel>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * DELETE Payment/Containers/{paymentContainerId}/assign/{secondaryPaymentContainerId} (asynchronously)
     * Removes an existing payment container assignment
     * @param paymentContainerId Payment container id (required)
     * @param secondaryPaymentContainerId Id for which container is currently assigned to (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call paymentContainersIdAssignSecondaryIdDeleteAsync(String paymentContainerId, String secondaryPaymentContainerId, final ApiCallback<List<PaymentContainersProductModel>> callback) throws ApiException {
        Call call = paymentContainersIdAssignSecondaryIdDeleteValidateBeforeCall(paymentContainerId, secondaryPaymentContainerId);
        Type localVarReturnType = new TypeToken<List<PaymentContainersProductModel>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for paymentContainersIdAssignSecondaryIdPost
     * @param paymentContainerId Payment container id (required)
     * @param secondaryPaymentContainerId Id to which container will be assigned (required)
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public Call paymentContainersIdAssignSecondaryIdPostCall(String paymentContainerId, String secondaryPaymentContainerId) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/Payment/Containers/{paymentContainerId}/assign/{secondaryPaymentContainerId}"
            .replaceAll("\\{" + "paymentContainerId" + "\\}", apiClient.escapeString(paymentContainerId.toString()))
            .replaceAll("\\{" + "secondaryPaymentContainerId" + "\\}", apiClient.escapeString(secondaryPaymentContainerId.toString()));

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
    private Call paymentContainersIdAssignSecondaryIdPostValidateBeforeCall(String paymentContainerId, String secondaryPaymentContainerId) throws ApiException {
        // verify the required parameter 'paymentContainerId' is set
        if (paymentContainerId == null) {
            throw new ApiException("Missing the required parameter 'paymentContainerId' when calling paymentContainersIdAssignSecondaryIdPost(Async)");
        }
        // verify the required parameter 'secondaryPaymentContainerId' is set
        if (secondaryPaymentContainerId == null) {
            throw new ApiException("Missing the required parameter 'secondaryPaymentContainerId' when calling paymentContainersIdAssignSecondaryIdPost(Async)");
        }

        return paymentContainersIdAssignSecondaryIdPostCall(paymentContainerId, secondaryPaymentContainerId);
    }

    /**
     * POST Payment/Containers/{paymentContainerId}/assign/{secondaryPaymentContainerId}
     * Assign an existing payment container to ...
     * @param paymentContainerId Payment container id (required)
     * @param secondaryPaymentContainerId Id to which container will be assigned (required)
     * @return PaymentContainersProductModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PaymentContainersProductModel paymentContainersIdAssignSecondaryIdPost(String paymentContainerId, String secondaryPaymentContainerId) throws ApiException {
        ApiResponse<PaymentContainersProductModel> resp = paymentContainersIdAssignSecondaryIdPostWithHttpInfo(paymentContainerId, secondaryPaymentContainerId);
        return resp.getData();
    }

    /**
     * POST Payment/Containers/{paymentContainerId}/assign/{secondaryPaymentContainerId}
     * Assign an existing payment container to ...
     * @param paymentContainerId Payment container id (required)
     * @param secondaryPaymentContainerId Id to which container will be assigned (required)
     * @return ApiResponse&lt;PaymentContainersProductModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PaymentContainersProductModel> paymentContainersIdAssignSecondaryIdPostWithHttpInfo(String paymentContainerId, String secondaryPaymentContainerId) throws ApiException {
        Call call = paymentContainersIdAssignSecondaryIdPostValidateBeforeCall(paymentContainerId, secondaryPaymentContainerId);
        Type localVarReturnType = new TypeToken<PaymentContainersProductModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * POST Payment/Containers/{paymentContainerId}/assign/{secondaryPaymentContainerId} (asynchronously)
     * Assign an existing payment container to ...
     * @param paymentContainerId Payment container id (required)
     * @param secondaryPaymentContainerId Id to which container will be assigned (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call paymentContainersIdAssignSecondaryIdPostAsync(String paymentContainerId, String secondaryPaymentContainerId, final ApiCallback<PaymentContainersProductModel> callback) throws ApiException {
        Call call = paymentContainersIdAssignSecondaryIdPostValidateBeforeCall(paymentContainerId, secondaryPaymentContainerId);
        Type localVarReturnType = new TypeToken<PaymentContainersProductModel>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for paymentContainersIdDelete
     * @param paymentContainerId Payment container id (required)
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public Call paymentContainersIdDeleteCall(String paymentContainerId) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/Payment/Containers/{paymentContainerId}"
            .replaceAll("\\{" + "paymentContainerId" + "\\}", apiClient.escapeString(paymentContainerId.toString()));

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
    private Call paymentContainersIdDeleteValidateBeforeCall(String paymentContainerId) throws ApiException {
        // verify the required parameter 'paymentContainerId' is set
        if (paymentContainerId == null) {
            throw new ApiException("Missing the required parameter 'paymentContainerId' when calling paymentContainersIdDelete(Async)");
        }

        return paymentContainersIdDeleteCall(paymentContainerId);
    }

    /**
     * DELETE Payment/Containers/{paymentContainerId}
     * Delete payment container
     * @param paymentContainerId Payment container id (required)
     * @return List&lt;PaymentContainersProductModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<PaymentContainersProductModel> paymentContainersIdDelete(String paymentContainerId) throws ApiException {
        ApiResponse<List<PaymentContainersProductModel>> resp = paymentContainersIdDeleteWithHttpInfo(paymentContainerId);
        return resp.getData();
    }

    /**
     * DELETE Payment/Containers/{paymentContainerId}
     * Delete payment container
     * @param paymentContainerId Payment container id (required)
     * @return ApiResponse&lt;List&lt;PaymentContainersProductModel&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<PaymentContainersProductModel>> paymentContainersIdDeleteWithHttpInfo(String paymentContainerId) throws ApiException {
        Call call = paymentContainersIdDeleteValidateBeforeCall(paymentContainerId);
        Type localVarReturnType = new TypeToken<List<PaymentContainersProductModel>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * DELETE Payment/Containers/{paymentContainerId} (asynchronously)
     * Delete payment container
     * @param paymentContainerId Payment container id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call paymentContainersIdDeleteAsync(String paymentContainerId, final ApiCallback<List<PaymentContainersProductModel>> callback) throws ApiException {
        Call call = paymentContainersIdDeleteValidateBeforeCall(paymentContainerId);
        Type localVarReturnType = new TypeToken<List<PaymentContainersProductModel>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for paymentContainersIdPut
     * @param paymentContainerId Payment container id (required)
     * @param body Payment container properties
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public Call paymentContainersIdPutCall(String paymentContainerId, PaymentContainersDTO body) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/Payment/Containers/{paymentContainerId}"
            .replaceAll("\\{" + "paymentContainerId" + "\\}", apiClient.escapeString(paymentContainerId.toString()));

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
    private Call paymentContainersIdPutValidateBeforeCall(String paymentContainerId, PaymentContainersDTO body) throws ApiException {
        // verify the required parameter 'paymentContainerId' is set
        if (paymentContainerId == null) {
            throw new ApiException("Missing the required parameter 'paymentContainerId' when calling paymentContainersIdPut(Async)");
        }

        return paymentContainersIdPutCall(paymentContainerId, body);
    }

    /**
     * PUT Payment/Containers/{paymentContainerId}
     * Update payment container
     * @param paymentContainerId Payment container id (required)
     * @param body Payment container properties
     * @return PaymentContainersProductModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PaymentContainersProductModel paymentContainersIdPut(String paymentContainerId, PaymentContainersDTO body) throws ApiException {
        ApiResponse<PaymentContainersProductModel> resp = paymentContainersIdPutWithHttpInfo(paymentContainerId, body);
        return resp.getData();
    }

    /**
     * PUT Payment/Containers/{paymentContainerId}
     * Update payment container
     * @param paymentContainerId Payment container id (required)
     * @param body Payment container properties
     * @return ApiResponse&lt;PaymentContainersProductModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PaymentContainersProductModel> paymentContainersIdPutWithHttpInfo(String paymentContainerId, PaymentContainersDTO body) throws ApiException {
        Call call = paymentContainersIdPutValidateBeforeCall(paymentContainerId, body);
        Type localVarReturnType = new TypeToken<PaymentContainersProductModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * PUT Payment/Containers/{paymentContainerId} (asynchronously)
     * Update payment container
     * @param paymentContainerId Payment container id (required)
     * @param body Payment container properties
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call paymentContainersIdPutAsync(String paymentContainerId, PaymentContainersDTO body, final ApiCallback<PaymentContainersProductModel> callback) throws ApiException {
        Call call = paymentContainersIdPutValidateBeforeCall(paymentContainerId, body);
        Type localVarReturnType = new TypeToken<PaymentContainersProductModel>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for paymentContainersPost
     * @param body Payment container properties
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public Call paymentContainersPostCall(PaymentContainersDTO body) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/Payment/Containers";

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
    private Call paymentContainersPostValidateBeforeCall(PaymentContainersDTO body) throws ApiException {

        return paymentContainersPostCall(body);
    }

    /**
     * POST Payment/Containers
     * Add new containers
     * @param body Payment container properties
     * @return PaymentContainersProductModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PaymentContainersProductModel paymentContainersPost(PaymentContainersDTO body) throws ApiException {
        ApiResponse<PaymentContainersProductModel> resp = paymentContainersPostWithHttpInfo(body);
        return resp.getData();
    }

    /**
     * POST Payment/Containers
     * Add new containers
     * @param body Payment container properties
     * @return ApiResponse&lt;PaymentContainersProductModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PaymentContainersProductModel> paymentContainersPostWithHttpInfo(PaymentContainersDTO body) throws ApiException {
        Call call = paymentContainersPostValidateBeforeCall(body);
        Type localVarReturnType = new TypeToken<PaymentContainersProductModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * POST Payment/Containers (asynchronously)
     * Add new containers
     * @param body Payment container properties
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call paymentContainersPostAsync(PaymentContainersDTO body, final ApiCallback<PaymentContainersProductModel> callback) throws ApiException {
        Call call = paymentContainersPostValidateBeforeCall(body);
        Type localVarReturnType = new TypeToken<PaymentContainersProductModel>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}

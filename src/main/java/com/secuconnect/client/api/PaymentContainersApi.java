package com.secuconnect.client.api;

import com.google.gson.reflect.TypeToken;
import com.secuconnect.client.*;
import com.secuconnect.client.model.Aggregate;
import java.math.BigDecimal;
import com.secuconnect.client.model.MandateDTO;
import com.secuconnect.client.model.MandateProductModel;
import com.secuconnect.client.model.PaymentContainersDTO;
import com.secuconnect.client.model.PaymentContainersList;
import com.secuconnect.client.model.PaymentContainersProductModel;
import com.secuconnect.client.model.ProductExceptionPayload;
import com.secuconnect.client.model.UploadMandateDTO;
import com.secuconnect.client.model.UploadMandateProductModel;
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
     * Build call for mandate
     * @param paymentContainerId Payment Container ID (required)
     * @param body B2B mandate form properties
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public Call mandateCall(String paymentContainerId, MandateDTO body) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/Payment/Containers/{paymentContainerId}/mandate"
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
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames);
    }

    @SuppressWarnings("rawtypes")
    private Call mandateValidateBeforeCall(String paymentContainerId, MandateDTO body) throws ApiException {
        // verify the required parameter 'paymentContainerId' is set
        if (paymentContainerId == null) {
            throw new ApiException("Missing the required parameter 'paymentContainerId' when calling mandate(Async)");
        }

        return mandateCall(paymentContainerId, body);
    }

    /**
     * Obtain SEPA Mandate Form
     * Returns the URL of the B2B mandate form for this Payment Container. The form is a one-page PDF document. It must be signed by an authorised person and then uploaded again.
     * @param paymentContainerId Payment Container ID (required)
     * @param body B2B mandate form properties
     * @return MandateProductModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public MandateProductModel mandate(String paymentContainerId, MandateDTO body) throws ApiException {
        ApiResponse<MandateProductModel> resp = mandateWithHttpInfo(paymentContainerId, body);
        return resp.getData();
    }

    /**
     * Obtain SEPA Mandate Form
     * Returns the URL of the B2B mandate form for this Payment Container. The form is a one-page PDF document. It must be signed by an authorised person and then uploaded again.
     * @param paymentContainerId Payment Container ID (required)
     * @param body B2B mandate form properties
     * @return ApiResponse&lt;MandateProductModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<MandateProductModel> mandateWithHttpInfo(String paymentContainerId, MandateDTO body) throws ApiException {
        Call call = mandateValidateBeforeCall(paymentContainerId, body);
        Type localVarReturnType = new TypeToken<MandateProductModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Obtain SEPA Mandate Form (asynchronously)
     * Returns the URL of the B2B mandate form for this Payment Container. The form is a one-page PDF document. It must be signed by an authorised person and then uploaded again.
     * @param paymentContainerId Payment Container ID (required)
     * @param body B2B mandate form properties
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call mandateAsync(String paymentContainerId, MandateDTO body, final ApiCallback<MandateProductModel> callback) throws ApiException {
        Call call = mandateValidateBeforeCall(paymentContainerId, body);
        Type localVarReturnType = new TypeToken<MandateProductModel>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for paymentContainersGet
     * @param count The maximum number of items to return
     * @param offset The position within the whole result set to start returning items (zero-based)
     * @param fields List of fields to include in the result, all others will be filtered out. Nested properties can be accessed with this notation: &#x60;prop1.prop2&#x60;.
     * @param q A query string to restrict the returned items to given conditions. The query string must consist of any combination of single expressions in the form &#x60;property:condition&#x60;. Property names can be nested like &#x60;property.property&#x60;.  Example: &#x60;customer.name:Meier&#x60;  A condition may contain:  * &#x60;?&#x60; as wildcard for one character;  * &#x60;*&#x60; as wildcard for any number of characters.  You can also use value ranges in the form &#x60;[min TO max]&#x60;.  Example: &#x60;customer.age:[30 TO 40]&#x60;  You can combine expressions logically by &#x60;expr AND expr&#x60; and &#x60;{expr} OR {expr}&#x60;. You can also negate an expression using &#x60;NOT {expr}&#x60;. Parenthesis &#x60;(...)&#x60; can be used to control precedence.  Example: &#x60;(NOT customer.name:meier*) AND (customer.age:[30 TO 40] OR customer.age:[50 TO 60])&#x60;
     * @param sort String with comma separated pairs of &#x60;field:order&#x60;.  Options for order:  * &#x60;asc&#x60; ascending;  * &#x60;desc&#x60; descending.
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
     * Find Payment Containers
     * Returns the Payment Containers matching the given criteria.
     * @param count The maximum number of items to return
     * @param offset The position within the whole result set to start returning items (zero-based)
     * @param fields List of fields to include in the result, all others will be filtered out. Nested properties can be accessed with this notation: &#x60;prop1.prop2&#x60;.
     * @param q A query string to restrict the returned items to given conditions. The query string must consist of any combination of single expressions in the form &#x60;property:condition&#x60;. Property names can be nested like &#x60;property.property&#x60;.  Example: &#x60;customer.name:Meier&#x60;  A condition may contain:  * &#x60;?&#x60; as wildcard for one character;  * &#x60;*&#x60; as wildcard for any number of characters.  You can also use value ranges in the form &#x60;[min TO max]&#x60;.  Example: &#x60;customer.age:[30 TO 40]&#x60;  You can combine expressions logically by &#x60;expr AND expr&#x60; and &#x60;{expr} OR {expr}&#x60;. You can also negate an expression using &#x60;NOT {expr}&#x60;. Parenthesis &#x60;(...)&#x60; can be used to control precedence.  Example: &#x60;(NOT customer.name:meier*) AND (customer.age:[30 TO 40] OR customer.age:[50 TO 60])&#x60;
     * @param sort String with comma separated pairs of &#x60;field:order&#x60;.  Options for order:  * &#x60;asc&#x60; ascending;  * &#x60;desc&#x60; descending.
     * @return PaymentContainersList
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PaymentContainersList paymentContainersGet(Integer count, Integer offset, String fields, String q, String sort) throws ApiException {
        ApiResponse<PaymentContainersList> resp = paymentContainersGetWithHttpInfo(count, offset, fields, q, sort);
        return resp.getData();
    }

    /**
     * Find Payment Containers
     * Returns the Payment Containers matching the given criteria.
     * @param count The maximum number of items to return
     * @param offset The position within the whole result set to start returning items (zero-based)
     * @param fields List of fields to include in the result, all others will be filtered out. Nested properties can be accessed with this notation: &#x60;prop1.prop2&#x60;.
     * @param q A query string to restrict the returned items to given conditions. The query string must consist of any combination of single expressions in the form &#x60;property:condition&#x60;. Property names can be nested like &#x60;property.property&#x60;.  Example: &#x60;customer.name:Meier&#x60;  A condition may contain:  * &#x60;?&#x60; as wildcard for one character;  * &#x60;*&#x60; as wildcard for any number of characters.  You can also use value ranges in the form &#x60;[min TO max]&#x60;.  Example: &#x60;customer.age:[30 TO 40]&#x60;  You can combine expressions logically by &#x60;expr AND expr&#x60; and &#x60;{expr} OR {expr}&#x60;. You can also negate an expression using &#x60;NOT {expr}&#x60;. Parenthesis &#x60;(...)&#x60; can be used to control precedence.  Example: &#x60;(NOT customer.name:meier*) AND (customer.age:[30 TO 40] OR customer.age:[50 TO 60])&#x60;
     * @param sort String with comma separated pairs of &#x60;field:order&#x60;.  Options for order:  * &#x60;asc&#x60; ascending;  * &#x60;desc&#x60; descending.
     * @return ApiResponse&lt;PaymentContainersList&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PaymentContainersList> paymentContainersGetWithHttpInfo(Integer count, Integer offset, String fields, String q, String sort) throws ApiException {
        Call call = paymentContainersGetValidateBeforeCall(count, offset, fields, q, sort);
        Type localVarReturnType = new TypeToken<PaymentContainersList>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Find Payment Containers (asynchronously)
     * Returns the Payment Containers matching the given criteria.
     * @param count The maximum number of items to return
     * @param offset The position within the whole result set to start returning items (zero-based)
     * @param fields List of fields to include in the result, all others will be filtered out. Nested properties can be accessed with this notation: &#x60;prop1.prop2&#x60;.
     * @param q A query string to restrict the returned items to given conditions. The query string must consist of any combination of single expressions in the form &#x60;property:condition&#x60;. Property names can be nested like &#x60;property.property&#x60;.  Example: &#x60;customer.name:Meier&#x60;  A condition may contain:  * &#x60;?&#x60; as wildcard for one character;  * &#x60;*&#x60; as wildcard for any number of characters.  You can also use value ranges in the form &#x60;[min TO max]&#x60;.  Example: &#x60;customer.age:[30 TO 40]&#x60;  You can combine expressions logically by &#x60;expr AND expr&#x60; and &#x60;{expr} OR {expr}&#x60;. You can also negate an expression using &#x60;NOT {expr}&#x60;. Parenthesis &#x60;(...)&#x60; can be used to control precedence.  Example: &#x60;(NOT customer.name:meier*) AND (customer.age:[30 TO 40] OR customer.age:[50 TO 60])&#x60;
     * @param sort String with comma separated pairs of &#x60;field:order&#x60;.  Options for order:  * &#x60;asc&#x60; ascending;  * &#x60;desc&#x60; descending.
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
     * @param paymentContainerId Payment Container ID (required)
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
     * Read Payment Containers
     * Returns the specified Payment Container.
     * @param paymentContainerId Payment Container ID (required)
     * @return PaymentContainersProductModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PaymentContainersProductModel paymentContainersGetById(String paymentContainerId) throws ApiException {
        ApiResponse<PaymentContainersProductModel> resp = paymentContainersGetByIdWithHttpInfo(paymentContainerId);
        return resp.getData();
    }

    /**
     * Read Payment Containers
     * Returns the specified Payment Container.
     * @param paymentContainerId Payment Container ID (required)
     * @return ApiResponse&lt;PaymentContainersProductModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PaymentContainersProductModel> paymentContainersGetByIdWithHttpInfo(String paymentContainerId) throws ApiException {
        Call call = paymentContainersGetByIdValidateBeforeCall(paymentContainerId);
        Type localVarReturnType = new TypeToken<PaymentContainersProductModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Read Payment Containers (asynchronously)
     * Returns the specified Payment Container.
     * @param paymentContainerId Payment Container ID (required)
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
     * Build call for paymentContainersIdDelete
     * @param paymentContainerId Payment Container ID (required)
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
     * Delete Payment Container
     * Deletes a Payment Container.
     * @param paymentContainerId Payment Container ID (required)
     * @return List&lt;PaymentContainersProductModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<PaymentContainersProductModel> paymentContainersIdDelete(String paymentContainerId) throws ApiException {
        ApiResponse<List<PaymentContainersProductModel>> resp = paymentContainersIdDeleteWithHttpInfo(paymentContainerId);
        return resp.getData();
    }

    /**
     * Delete Payment Container
     * Deletes a Payment Container.
     * @param paymentContainerId Payment Container ID (required)
     * @return ApiResponse&lt;List&lt;PaymentContainersProductModel&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<PaymentContainersProductModel>> paymentContainersIdDeleteWithHttpInfo(String paymentContainerId) throws ApiException {
        Call call = paymentContainersIdDeleteValidateBeforeCall(paymentContainerId);
        Type localVarReturnType = new TypeToken<List<PaymentContainersProductModel>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Delete Payment Container (asynchronously)
     * Deletes a Payment Container.
     * @param paymentContainerId Payment Container ID (required)
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
     * @param paymentContainerId Payment Container ID (required)
     * @param body Payment Container properties
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
     * Update Payment Container
     * Updates the specified Payment Container with the given data.
     * @param paymentContainerId Payment Container ID (required)
     * @param body Payment Container properties
     * @return PaymentContainersProductModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PaymentContainersProductModel paymentContainersIdPut(String paymentContainerId, PaymentContainersDTO body) throws ApiException {
        ApiResponse<PaymentContainersProductModel> resp = paymentContainersIdPutWithHttpInfo(paymentContainerId, body);
        return resp.getData();
    }

    /**
     * Update Payment Container
     * Updates the specified Payment Container with the given data.
     * @param paymentContainerId Payment Container ID (required)
     * @param body Payment Container properties
     * @return ApiResponse&lt;PaymentContainersProductModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PaymentContainersProductModel> paymentContainersIdPutWithHttpInfo(String paymentContainerId, PaymentContainersDTO body) throws ApiException {
        Call call = paymentContainersIdPutValidateBeforeCall(paymentContainerId, body);
        Type localVarReturnType = new TypeToken<PaymentContainersProductModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Update Payment Container (asynchronously)
     * Updates the specified Payment Container with the given data.
     * @param paymentContainerId Payment Container ID (required)
     * @param body Payment Container properties
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
     * @param body Payment Container properties
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
     * Create Payment Container
     * Creates a new Payment Container from the given data.
     * @param body Payment Container properties
     * @return PaymentContainersProductModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PaymentContainersProductModel paymentContainersPost(PaymentContainersDTO body) throws ApiException {
        ApiResponse<PaymentContainersProductModel> resp = paymentContainersPostWithHttpInfo(body);
        return resp.getData();
    }

    /**
     * Create Payment Container
     * Creates a new Payment Container from the given data.
     * @param body Payment Container properties
     * @return ApiResponse&lt;PaymentContainersProductModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PaymentContainersProductModel> paymentContainersPostWithHttpInfo(PaymentContainersDTO body) throws ApiException {
        Call call = paymentContainersPostValidateBeforeCall(body);
        Type localVarReturnType = new TypeToken<PaymentContainersProductModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Create Payment Container (asynchronously)
     * Creates a new Payment Container from the given data.
     * @param body Payment Container properties
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

    /**
     * Build call for uploadMandate
     * @param paymentContainerId Payment Container ID (required)
     * @param body Signed B2B mandate properties
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public Call uploadMandateCall(String paymentContainerId, UploadMandateDTO body) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/Payment/Containers/{paymentContainerId}/Uploadmandate"
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
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames);
    }

    @SuppressWarnings("rawtypes")
    private Call uploadMandateValidateBeforeCall(String paymentContainerId, UploadMandateDTO body) throws ApiException {
        // verify the required parameter 'paymentContainerId' is set
        if (paymentContainerId == null) {
            throw new ApiException("Missing the required parameter 'paymentContainerId' when calling uploadMandate(Async)");
        }

        return uploadMandateCall(paymentContainerId, body);
    }

    /**
     * Process Signed SEPA Mandate
     * Processes the signed B2B mandate for this Payment Container. The PDF must have been uploaded shortly before with POST /Document/Uploads. Now it is assigned to the Payment Container and a service case is created to carry out the activation.
     * @param paymentContainerId Payment Container ID (required)
     * @param body Signed B2B mandate properties
     * @return UploadMandateProductModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public UploadMandateProductModel uploadMandate(String paymentContainerId, UploadMandateDTO body) throws ApiException {
        ApiResponse<UploadMandateProductModel> resp = uploadMandateWithHttpInfo(paymentContainerId, body);
        return resp.getData();
    }

    /**
     * Process Signed SEPA Mandate
     * Processes the signed B2B mandate for this Payment Container. The PDF must have been uploaded shortly before with POST /Document/Uploads. Now it is assigned to the Payment Container and a service case is created to carry out the activation.
     * @param paymentContainerId Payment Container ID (required)
     * @param body Signed B2B mandate properties
     * @return ApiResponse&lt;UploadMandateProductModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<UploadMandateProductModel> uploadMandateWithHttpInfo(String paymentContainerId, UploadMandateDTO body) throws ApiException {
        Call call = uploadMandateValidateBeforeCall(paymentContainerId, body);
        Type localVarReturnType = new TypeToken<UploadMandateProductModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Process Signed SEPA Mandate (asynchronously)
     * Processes the signed B2B mandate for this Payment Container. The PDF must have been uploaded shortly before with POST /Document/Uploads. Now it is assigned to the Payment Container and a service case is created to carry out the activation.
     * @param paymentContainerId Payment Container ID (required)
     * @param body Signed B2B mandate properties
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call uploadMandateAsync(String paymentContainerId, UploadMandateDTO body, final ApiCallback<UploadMandateProductModel> callback) throws ApiException {
        Call call = uploadMandateValidateBeforeCall(paymentContainerId, body);
        Type localVarReturnType = new TypeToken<UploadMandateProductModel>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}

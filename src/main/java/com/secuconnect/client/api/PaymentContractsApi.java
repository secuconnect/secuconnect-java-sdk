package com.secuconnect.client.api;

import com.google.gson.reflect.TypeToken;
import com.secuconnect.client.*;
import com.secuconnect.client.model.Aggregate;
import com.secuconnect.client.model.BankAccountDescriptor;
import java.math.BigDecimal;
import com.secuconnect.client.model.PaymentContractsDTOClone;
import com.secuconnect.client.model.PaymentContractsDTORequestId;
import com.secuconnect.client.model.PaymentContractsList;
import com.secuconnect.client.model.PaymentContractsProductModel;
import com.secuconnect.client.model.PaymentContractsRequestIdResult;
import com.secuconnect.client.model.ProductExceptionPayload;
import com.secuconnect.client.model.ResultBoolean;
import okhttp3.Call;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PaymentContractsApi {
    private ApiClient apiClient;

    public PaymentContractsApi() {
        this(Environment.getGlobalEnv().getApiClient());
    }

    public PaymentContractsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for clone
     * @param paymentContractId Payment Contract ID (&#x60;PCR_...&#x60;) or General Contract ID (&#x60;GCR_...&#x60;) of master contract (required)
     * @param body New Payment Contract
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public Call cloneCall(String paymentContractId, PaymentContractsDTOClone body) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/Payment/Contracts/{paymentContractId}/clone"
            .replaceAll("\\{" + "paymentContractId" + "\\}", apiClient.escapeString(paymentContractId.toString()));

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
    private Call cloneValidateBeforeCall(String paymentContractId, PaymentContractsDTOClone body) throws ApiException {
        // verify the required parameter 'paymentContractId' is set
        if (paymentContractId == null) {
            throw new ApiException("Missing the required parameter 'paymentContractId' when calling clone(Async)");
        }

        return cloneCall(paymentContractId, body);
    }

    /**
     * Clone contract
     * Clones a contract without identification process. This is used to onboard new projects for known merchants of your platform or marketplace.
     * @param paymentContractId Payment Contract ID (&#x60;PCR_...&#x60;) or General Contract ID (&#x60;GCR_...&#x60;) of master contract (required)
     * @param body New Payment Contract
     * @return PaymentContractsProductModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PaymentContractsProductModel clone(String paymentContractId, PaymentContractsDTOClone body) throws ApiException {
        ApiResponse<PaymentContractsProductModel> resp = cloneWithHttpInfo(paymentContractId, body);
        return resp.getData();
    }

    /**
     * Clone contract
     * Clones a contract without identification process. This is used to onboard new projects for known merchants of your platform or marketplace.
     * @param paymentContractId Payment Contract ID (&#x60;PCR_...&#x60;) or General Contract ID (&#x60;GCR_...&#x60;) of master contract (required)
     * @param body New Payment Contract
     * @return ApiResponse&lt;PaymentContractsProductModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PaymentContractsProductModel> cloneWithHttpInfo(String paymentContractId, PaymentContractsDTOClone body) throws ApiException {
        Call call = cloneValidateBeforeCall(paymentContractId, body);
        Type localVarReturnType = new TypeToken<PaymentContractsProductModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Clone contract (asynchronously)
     * Clones a contract without identification process. This is used to onboard new projects for known merchants of your platform or marketplace.
     * @param paymentContractId Payment Contract ID (&#x60;PCR_...&#x60;) or General Contract ID (&#x60;GCR_...&#x60;) of master contract (required)
     * @param body New Payment Contract
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call cloneAsync(String paymentContractId, PaymentContractsDTOClone body, final ApiCallback<PaymentContractsProductModel> callback) throws ApiException {
        Call call = cloneValidateBeforeCall(paymentContractId, body);
        Type localVarReturnType = new TypeToken<PaymentContractsProductModel>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for paymentContractsGet
     * @param count The maximum number of items to return
     * @param offset The position within the whole result set to start returning items (zero-based)
     * @param fields List of fields to include in the result, all others will be filtered out. Nested properties can be accessed with this notation: &#x60;prop1.prop2&#x60;.
     * @param q A query string to restrict the returned items to given conditions. The query string must consist of any combination of single expressions in the form &#x60;property:condition&#x60;. Property names can be nested like &#x60;property.property&#x60;.  Example: &#x60;customer.name:Meier&#x60;  A condition may contain:  * &#x60;?&#x60; as wildcard for one character;  * &#x60;*&#x60; as wildcard for any number of characters.  You can also use value ranges in the form &#x60;[min TO max]&#x60;.  Example: &#x60;customer.age:[30 TO 40]&#x60;  You can combine expressions logically by &#x60;expr AND expr&#x60; and &#x60;{expr} OR {expr}&#x60;. You can also negate an expression using &#x60;NOT {expr}&#x60;. Parenthesis &#x60;(...)&#x60; can be used to control precedence.  Example: &#x60;(NOT customer.name:meier*) AND (customer.age:[30 TO 40] OR customer.age:[50 TO 60])&#x60;
     * @param sort String with comma separated pairs of &#x60;field:order&#x60;.  Options for order:  * &#x60;asc&#x60; ascending;  * &#x60;desc&#x60; descending.
     * @param expand Expand fields (all or a specific one)
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @deprecated
     */
    public Call paymentContractsGetCall(Integer count, Integer offset, String fields, String q, String sort, String expand) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/Payment/Contracts";

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
        if (expand != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("expand", expand));

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
    private Call paymentContractsGetValidateBeforeCall(Integer count, Integer offset, String fields, String q, String sort, String expand) throws ApiException {

        return paymentContractsGetCall(count, offset, fields, q, sort, expand);
    }

    /**
     * Find Payment Contracts
     * Returns the Payment Contracts matching the given criteria.
     * @param count The maximum number of items to return
     * @param offset The position within the whole result set to start returning items (zero-based)
     * @param fields List of fields to include in the result, all others will be filtered out. Nested properties can be accessed with this notation: &#x60;prop1.prop2&#x60;.
     * @param q A query string to restrict the returned items to given conditions. The query string must consist of any combination of single expressions in the form &#x60;property:condition&#x60;. Property names can be nested like &#x60;property.property&#x60;.  Example: &#x60;customer.name:Meier&#x60;  A condition may contain:  * &#x60;?&#x60; as wildcard for one character;  * &#x60;*&#x60; as wildcard for any number of characters.  You can also use value ranges in the form &#x60;[min TO max]&#x60;.  Example: &#x60;customer.age:[30 TO 40]&#x60;  You can combine expressions logically by &#x60;expr AND expr&#x60; and &#x60;{expr} OR {expr}&#x60;. You can also negate an expression using &#x60;NOT {expr}&#x60;. Parenthesis &#x60;(...)&#x60; can be used to control precedence.  Example: &#x60;(NOT customer.name:meier*) AND (customer.age:[30 TO 40] OR customer.age:[50 TO 60])&#x60;
     * @param sort String with comma separated pairs of &#x60;field:order&#x60;.  Options for order:  * &#x60;asc&#x60; ascending;  * &#x60;desc&#x60; descending.
     * @param expand Expand fields (all or a specific one)
     * @return PaymentContractsList
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PaymentContractsList paymentContractsGet(Integer count, Integer offset, String fields, String q, String sort, String expand) throws ApiException {
        ApiResponse<PaymentContractsList> resp = paymentContractsGetWithHttpInfo(count, offset, fields, q, sort, expand);
        return resp.getData();
    }

    /**
     * Find Payment Contracts
     * Returns the Payment Contracts matching the given criteria.
     * @param count The maximum number of items to return
     * @param offset The position within the whole result set to start returning items (zero-based)
     * @param fields List of fields to include in the result, all others will be filtered out. Nested properties can be accessed with this notation: &#x60;prop1.prop2&#x60;.
     * @param q A query string to restrict the returned items to given conditions. The query string must consist of any combination of single expressions in the form &#x60;property:condition&#x60;. Property names can be nested like &#x60;property.property&#x60;.  Example: &#x60;customer.name:Meier&#x60;  A condition may contain:  * &#x60;?&#x60; as wildcard for one character;  * &#x60;*&#x60; as wildcard for any number of characters.  You can also use value ranges in the form &#x60;[min TO max]&#x60;.  Example: &#x60;customer.age:[30 TO 40]&#x60;  You can combine expressions logically by &#x60;expr AND expr&#x60; and &#x60;{expr} OR {expr}&#x60;. You can also negate an expression using &#x60;NOT {expr}&#x60;. Parenthesis &#x60;(...)&#x60; can be used to control precedence.  Example: &#x60;(NOT customer.name:meier*) AND (customer.age:[30 TO 40] OR customer.age:[50 TO 60])&#x60;
     * @param sort String with comma separated pairs of &#x60;field:order&#x60;.  Options for order:  * &#x60;asc&#x60; ascending;  * &#x60;desc&#x60; descending.
     * @param expand Expand fields (all or a specific one)
     * @return ApiResponse&lt;PaymentContractsList&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PaymentContractsList> paymentContractsGetWithHttpInfo(Integer count, Integer offset, String fields, String q, String sort, String expand) throws ApiException {
        Call call = paymentContractsGetValidateBeforeCall(count, offset, fields, q, sort, expand);
        Type localVarReturnType = new TypeToken<PaymentContractsList>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Find Payment Contracts (asynchronously)
     * Returns the Payment Contracts matching the given criteria.
     * @param count The maximum number of items to return
     * @param offset The position within the whole result set to start returning items (zero-based)
     * @param fields List of fields to include in the result, all others will be filtered out. Nested properties can be accessed with this notation: &#x60;prop1.prop2&#x60;.
     * @param q A query string to restrict the returned items to given conditions. The query string must consist of any combination of single expressions in the form &#x60;property:condition&#x60;. Property names can be nested like &#x60;property.property&#x60;.  Example: &#x60;customer.name:Meier&#x60;  A condition may contain:  * &#x60;?&#x60; as wildcard for one character;  * &#x60;*&#x60; as wildcard for any number of characters.  You can also use value ranges in the form &#x60;[min TO max]&#x60;.  Example: &#x60;customer.age:[30 TO 40]&#x60;  You can combine expressions logically by &#x60;expr AND expr&#x60; and &#x60;{expr} OR {expr}&#x60;. You can also negate an expression using &#x60;NOT {expr}&#x60;. Parenthesis &#x60;(...)&#x60; can be used to control precedence.  Example: &#x60;(NOT customer.name:meier*) AND (customer.age:[30 TO 40] OR customer.age:[50 TO 60])&#x60;
     * @param sort String with comma separated pairs of &#x60;field:order&#x60;.  Options for order:  * &#x60;asc&#x60; ascending;  * &#x60;desc&#x60; descending.
     * @param expand Expand fields (all or a specific one)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call paymentContractsGetAsync(Integer count, Integer offset, String fields, String q, String sort, String expand, final ApiCallback<PaymentContractsList> callback) throws ApiException {
        Call call = paymentContractsGetValidateBeforeCall(count, offset, fields, q, sort, expand);
        Type localVarReturnType = new TypeToken<PaymentContractsList>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for paymentContractsGetById
     * @param paymentContractId Payment Contract ID (&#x60;PCR_...&#x60;) or General Contract ID (&#x60;GCR_...&#x60;) (required)
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @deprecated
     */
    public Call paymentContractsGetByIdCall(String paymentContractId) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/Payment/Contracts/{paymentContractId}"
            .replaceAll("\\{" + "paymentContractId" + "\\}", apiClient.escapeString(paymentContractId.toString()));

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
    private Call paymentContractsGetByIdValidateBeforeCall(String paymentContractId) throws ApiException {
        // verify the required parameter 'paymentContractId' is set
        if (paymentContractId == null) {
            throw new ApiException("Missing the required parameter 'paymentContractId' when calling paymentContractsGetById(Async)");
        }

        return paymentContractsGetByIdCall(paymentContractId);
    }

    /**
     * Read Payment Contract
     * Returns the specified Payment Contract.
     * @param paymentContractId Payment Contract ID (&#x60;PCR_...&#x60;) or General Contract ID (&#x60;GCR_...&#x60;) (required)
     * @return PaymentContractsProductModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PaymentContractsProductModel paymentContractsGetById(String paymentContractId) throws ApiException {
        ApiResponse<PaymentContractsProductModel> resp = paymentContractsGetByIdWithHttpInfo(paymentContractId);
        return resp.getData();
    }

    /**
     * Read Payment Contract
     * Returns the specified Payment Contract.
     * @param paymentContractId Payment Contract ID (&#x60;PCR_...&#x60;) or General Contract ID (&#x60;GCR_...&#x60;) (required)
     * @return ApiResponse&lt;PaymentContractsProductModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PaymentContractsProductModel> paymentContractsGetByIdWithHttpInfo(String paymentContractId) throws ApiException {
        Call call = paymentContractsGetByIdValidateBeforeCall(paymentContractId);
        Type localVarReturnType = new TypeToken<PaymentContractsProductModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Read Payment Contract (asynchronously)
     * Returns the specified Payment Contract.
     * @param paymentContractId Payment Contract ID (&#x60;PCR_...&#x60;) or General Contract ID (&#x60;GCR_...&#x60;) (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call paymentContractsGetByIdAsync(String paymentContractId, final ApiCallback<PaymentContractsProductModel> callback) throws ApiException {
        Call call = paymentContractsGetByIdValidateBeforeCall(paymentContractId);
        Type localVarReturnType = new TypeToken<PaymentContractsProductModel>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for paymentContractsIdPaymentMethodsGet
     * @param paymentContractId Contract identifier (required)
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @deprecated
     */
    public Call paymentContractsIdPaymentMethodsGetCall(String paymentContractId) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/Payment/Contracts/{paymentContractId}/paymentMethods"
            .replaceAll("\\{" + "paymentContractId" + "\\}", apiClient.escapeString(paymentContractId.toString()));

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
    private Call paymentContractsIdPaymentMethodsGetValidateBeforeCall(String paymentContractId) throws ApiException {
        // verify the required parameter 'paymentContractId' is set
        if (paymentContractId == null) {
            throw new ApiException("Missing the required parameter 'paymentContractId' when calling paymentContractsIdPaymentMethodsGet(Async)");
        }

        return paymentContractsIdPaymentMethodsGetCall(paymentContractId);
    }

    /**
     * Get available payment methods
     * Get available payment methods for the Payment Contract for the given ID.
     * @param paymentContractId Contract identifier (required)
     * @return List&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<String> paymentContractsIdPaymentMethodsGet(String paymentContractId) throws ApiException {
        ApiResponse<List<String>> resp = paymentContractsIdPaymentMethodsGetWithHttpInfo(paymentContractId);
        return resp.getData();
    }

    /**
     * Get available payment methods
     * Get available payment methods for the Payment Contract for the given ID.
     * @param paymentContractId Contract identifier (required)
     * @return ApiResponse&lt;List&lt;String&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<String>> paymentContractsIdPaymentMethodsGetWithHttpInfo(String paymentContractId) throws ApiException {
        Call call = paymentContractsIdPaymentMethodsGetValidateBeforeCall(paymentContractId);
        Type localVarReturnType = new TypeToken<List<String>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get available payment methods (asynchronously)
     * Get available payment methods for the Payment Contract for the given ID.
     * @param paymentContractId Contract identifier (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call paymentContractsIdPaymentMethodsGetAsync(String paymentContractId, final ApiCallback<List<String>> callback) throws ApiException {
        Call call = paymentContractsIdPaymentMethodsGetValidateBeforeCall(paymentContractId);
        Type localVarReturnType = new TypeToken<List<String>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for requestId
     * @param paymentContractId Payment Contract ID (&#x60;PCR_...&#x60;) or General Contract ID (&#x60;GCR_...&#x60;) of master contract (required)
     * @param body Payment contract request id properties
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public Call requestIdCall(String paymentContractId, PaymentContractsDTORequestId body) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/Payment/Contracts/{paymentContractId}/requestId"
            .replaceAll("\\{" + "paymentContractId" + "\\}", apiClient.escapeString(paymentContractId.toString()));

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
    private Call requestIdValidateBeforeCall(String paymentContractId, PaymentContractsDTORequestId body) throws ApiException {
        // verify the required parameter 'paymentContractId' is set
        if (paymentContractId == null) {
            throw new ApiException("Missing the required parameter 'paymentContractId' when calling requestId(Async)");
        }

        return requestIdCall(paymentContractId, body);
    }

    /**
     * Clone contract and request identification
     * Clones a contract and starts the identification process. This is used to onboard entirely new merchants to your platform or marketplace.
     * @param paymentContractId Payment Contract ID (&#x60;PCR_...&#x60;) or General Contract ID (&#x60;GCR_...&#x60;) of master contract (required)
     * @param body Payment contract request id properties
     * @return PaymentContractsRequestIdResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PaymentContractsRequestIdResult requestId(String paymentContractId, PaymentContractsDTORequestId body) throws ApiException {
        ApiResponse<PaymentContractsRequestIdResult> resp = requestIdWithHttpInfo(paymentContractId, body);
        return resp.getData();
    }

    /**
     * Clone contract and request identification
     * Clones a contract and starts the identification process. This is used to onboard entirely new merchants to your platform or marketplace.
     * @param paymentContractId Payment Contract ID (&#x60;PCR_...&#x60;) or General Contract ID (&#x60;GCR_...&#x60;) of master contract (required)
     * @param body Payment contract request id properties
     * @return ApiResponse&lt;PaymentContractsRequestIdResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PaymentContractsRequestIdResult> requestIdWithHttpInfo(String paymentContractId, PaymentContractsDTORequestId body) throws ApiException {
        Call call = requestIdValidateBeforeCall(paymentContractId, body);
        Type localVarReturnType = new TypeToken<PaymentContractsRequestIdResult>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Clone contract and request identification (asynchronously)
     * Clones a contract and starts the identification process. This is used to onboard entirely new merchants to your platform or marketplace.
     * @param paymentContractId Payment Contract ID (&#x60;PCR_...&#x60;) or General Contract ID (&#x60;GCR_...&#x60;) of master contract (required)
     * @param body Payment contract request id properties
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call requestIdAsync(String paymentContractId, PaymentContractsDTORequestId body, final ApiCallback<PaymentContractsRequestIdResult> callback) throws ApiException {
        Call call = requestIdValidateBeforeCall(paymentContractId, body);
        Type localVarReturnType = new TypeToken<PaymentContractsRequestIdResult>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for revokeAccrual
     * @param paymentContractId Contract identifier (required)
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @deprecated
     */
    public Call revokeAccrualCall(String paymentContractId) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/Payment/Contracts/{paymentContractId}/revokeAccrual"
            .replaceAll("\\{" + "paymentContractId" + "\\}", apiClient.escapeString(paymentContractId.toString()));

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
    private Call revokeAccrualValidateBeforeCall(String paymentContractId) throws ApiException {
        // verify the required parameter 'paymentContractId' is set
        if (paymentContractId == null) {
            throw new ApiException("Missing the required parameter 'paymentContractId' when calling revokeAccrual(Async)");
        }

        return revokeAccrualCall(paymentContractId);
    }

    /**
     * Revoke all accruals
     * Revoke accrual flag for all transactions of the specified Payment Contract.
     * @param paymentContractId Contract identifier (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void revokeAccrual(String paymentContractId) throws ApiException {
        revokeAccrualWithHttpInfo(paymentContractId);
    }

    /**
     * Revoke all accruals
     * Revoke accrual flag for all transactions of the specified Payment Contract.
     * @param paymentContractId Contract identifier (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> revokeAccrualWithHttpInfo(String paymentContractId) throws ApiException {
        Call call = revokeAccrualValidateBeforeCall(paymentContractId);
        return apiClient.execute(call);
    }

    /**
     * Revoke all accruals (asynchronously)
     * Revoke accrual flag for all transactions of the specified Payment Contract.
     * @param paymentContractId Contract identifier (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call revokeAccrualAsync(String paymentContractId, final ApiCallback<Void> callback) throws ApiException {
        Call call = revokeAccrualValidateBeforeCall(paymentContractId);
        apiClient.executeAsync(call, callback);
        return call;
    }

    /**
     * Build call for updateBankAccount
     * @param paymentContractId Contract identifier (required)
     * @param body 
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @deprecated
     */
    public Call updateBankAccountCall(String paymentContractId, BankAccountDescriptor body) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/Payment/Contracts/{paymentContractId}/updateBankAccount"
            .replaceAll("\\{" + "paymentContractId" + "\\}", apiClient.escapeString(paymentContractId.toString()));

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
    private Call updateBankAccountValidateBeforeCall(String paymentContractId, BankAccountDescriptor body) throws ApiException {
        // verify the required parameter 'paymentContractId' is set
        if (paymentContractId == null) {
            throw new ApiException("Missing the required parameter 'paymentContractId' when calling updateBankAccount(Async)");
        }

        return updateBankAccountCall(paymentContractId, body);
    }

    /**
     * Change bank account
     * Changes the payout bank account of a contract.
     * @param paymentContractId Contract identifier (required)
     * @param body 
     * @return ResultBoolean
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ResultBoolean updateBankAccount(String paymentContractId, BankAccountDescriptor body) throws ApiException {
        ApiResponse<ResultBoolean> resp = updateBankAccountWithHttpInfo(paymentContractId, body);
        return resp.getData();
    }

    /**
     * Change bank account
     * Changes the payout bank account of a contract.
     * @param paymentContractId Contract identifier (required)
     * @param body 
     * @return ApiResponse&lt;ResultBoolean&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ResultBoolean> updateBankAccountWithHttpInfo(String paymentContractId, BankAccountDescriptor body) throws ApiException {
        Call call = updateBankAccountValidateBeforeCall(paymentContractId, body);
        Type localVarReturnType = new TypeToken<ResultBoolean>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Change bank account (asynchronously)
     * Changes the payout bank account of a contract.
     * @param paymentContractId Contract identifier (required)
     * @param body 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call updateBankAccountAsync(String paymentContractId, BankAccountDescriptor body, final ApiCallback<ResultBoolean> callback) throws ApiException {
        Call call = updateBankAccountValidateBeforeCall(paymentContractId, body);
        Type localVarReturnType = new TypeToken<ResultBoolean>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}

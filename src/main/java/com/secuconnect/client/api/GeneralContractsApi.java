package com.secuconnect.client.api;

import com.google.gson.reflect.TypeToken;
import com.secuconnect.client.*;
import com.secuconnect.client.model.BankAccountDescriptor;
import com.secuconnect.client.model.GeneralContractsList;
import com.secuconnect.client.model.GeneralContractsProductModel;
import com.secuconnect.client.model.GetAvailablePaymentMethodsDTO;
import com.secuconnect.client.model.ProductExceptionPayload;
import com.secuconnect.client.model.ResultBoolean;
import okhttp3.Call;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneralContractsApi {
    private ApiClient apiClient;

    public GeneralContractsApi() {
        this(Environment.getGlobalEnv().getApiClient());
    }

    public GeneralContractsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getAll
     * @param count The maximum number of items to return
     * @param offset The position within the whole result set to start returning items (zero-based)
     * @param fields List of fields to include in the result. Nested properties can be accessed with this notation: &#x60;prop1.prop2&#x60;.
     * @param q A query string to restrict the returned items to given conditions. The query string must consist of any combination of single expressions in the form &#x60;property:condition&#x60;. Property names can be nested like &#x60;property.property&#x60;.    Example: &#x60;customer.name:Meier&#x60;    A condition may contain:   * &#x60;?&#x60; as wildcard for one character;   * &#x60;*&#x60; as wildcard for any number of characters.    You can also use value ranges in the form &#x60;[min TO max]&#x60;.    Example: &#x60;customer.age:[30 TO 40]&#x60;    You can combine expressions logically by &#x60;expr AND expr&#x60; and &#x60;{expr} OR {expr}&#x60;. You can also negate an expression using &#x60;NOT {expr}&#x60;. Parenthesis &#x60;(...)&#x60; can be used to control precedence.    Example: &#x60;(NOT customer.name:meier*) AND (customer.age:[30 TO 40] OR customer.age:[50 TO 60])&#x60;
     * @param sort String with comma separated pairs of &#x60;field:order&#x60;.     Options for order:   * &#x60;asc&#x60; ascending;   * &#x60;dsc&#x60; descending.
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public Call getAllCall(Integer count, Integer offset, String fields, String q, String sort) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/General/Contracts";

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
     * GET General/Contracts
     * Get a list of general contracts
     * @param count The maximum number of items to return
     * @param offset The position within the whole result set to start returning items (zero-based)
     * @param fields List of fields to include in the result. Nested properties can be accessed with this notation: &#x60;prop1.prop2&#x60;.
     * @param q A query string to restrict the returned items to given conditions. The query string must consist of any combination of single expressions in the form &#x60;property:condition&#x60;. Property names can be nested like &#x60;property.property&#x60;.    Example: &#x60;customer.name:Meier&#x60;    A condition may contain:   * &#x60;?&#x60; as wildcard for one character;   * &#x60;*&#x60; as wildcard for any number of characters.    You can also use value ranges in the form &#x60;[min TO max]&#x60;.    Example: &#x60;customer.age:[30 TO 40]&#x60;    You can combine expressions logically by &#x60;expr AND expr&#x60; and &#x60;{expr} OR {expr}&#x60;. You can also negate an expression using &#x60;NOT {expr}&#x60;. Parenthesis &#x60;(...)&#x60; can be used to control precedence.    Example: &#x60;(NOT customer.name:meier*) AND (customer.age:[30 TO 40] OR customer.age:[50 TO 60])&#x60;
     * @param sort String with comma separated pairs of &#x60;field:order&#x60;.     Options for order:   * &#x60;asc&#x60; ascending;   * &#x60;dsc&#x60; descending.
     * @return GeneralContractsList
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public GeneralContractsList getAll(Integer count, Integer offset, String fields, String q, String sort) throws ApiException {
        ApiResponse<GeneralContractsList> resp = getAllWithHttpInfo(count, offset, fields, q, sort);
        return resp.getData();
    }

    /**
     * GET General/Contracts
     * Get a list of general contracts
     * @param count The maximum number of items to return
     * @param offset The position within the whole result set to start returning items (zero-based)
     * @param fields List of fields to include in the result. Nested properties can be accessed with this notation: &#x60;prop1.prop2&#x60;.
     * @param q A query string to restrict the returned items to given conditions. The query string must consist of any combination of single expressions in the form &#x60;property:condition&#x60;. Property names can be nested like &#x60;property.property&#x60;.    Example: &#x60;customer.name:Meier&#x60;    A condition may contain:   * &#x60;?&#x60; as wildcard for one character;   * &#x60;*&#x60; as wildcard for any number of characters.    You can also use value ranges in the form &#x60;[min TO max]&#x60;.    Example: &#x60;customer.age:[30 TO 40]&#x60;    You can combine expressions logically by &#x60;expr AND expr&#x60; and &#x60;{expr} OR {expr}&#x60;. You can also negate an expression using &#x60;NOT {expr}&#x60;. Parenthesis &#x60;(...)&#x60; can be used to control precedence.    Example: &#x60;(NOT customer.name:meier*) AND (customer.age:[30 TO 40] OR customer.age:[50 TO 60])&#x60;
     * @param sort String with comma separated pairs of &#x60;field:order&#x60;.     Options for order:   * &#x60;asc&#x60; ascending;   * &#x60;dsc&#x60; descending.
     * @return ApiResponse&lt;GeneralContractsList&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<GeneralContractsList> getAllWithHttpInfo(Integer count, Integer offset, String fields, String q, String sort) throws ApiException {
        Call call = getAllValidateBeforeCall(count, offset, fields, q, sort);
        Type localVarReturnType = new TypeToken<GeneralContractsList>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * GET General/Contracts (asynchronously)
     * Get a list of general contracts
     * @param count The maximum number of items to return
     * @param offset The position within the whole result set to start returning items (zero-based)
     * @param fields List of fields to include in the result. Nested properties can be accessed with this notation: &#x60;prop1.prop2&#x60;.
     * @param q A query string to restrict the returned items to given conditions. The query string must consist of any combination of single expressions in the form &#x60;property:condition&#x60;. Property names can be nested like &#x60;property.property&#x60;.    Example: &#x60;customer.name:Meier&#x60;    A condition may contain:   * &#x60;?&#x60; as wildcard for one character;   * &#x60;*&#x60; as wildcard for any number of characters.    You can also use value ranges in the form &#x60;[min TO max]&#x60;.    Example: &#x60;customer.age:[30 TO 40]&#x60;    You can combine expressions logically by &#x60;expr AND expr&#x60; and &#x60;{expr} OR {expr}&#x60;. You can also negate an expression using &#x60;NOT {expr}&#x60;. Parenthesis &#x60;(...)&#x60; can be used to control precedence.    Example: &#x60;(NOT customer.name:meier*) AND (customer.age:[30 TO 40] OR customer.age:[50 TO 60])&#x60;
     * @param sort String with comma separated pairs of &#x60;field:order&#x60;.     Options for order:   * &#x60;asc&#x60; ascending;   * &#x60;dsc&#x60; descending.
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call getAllAsync(Integer count, Integer offset, String fields, String q, String sort, final ApiCallback<GeneralContractsList> callback) throws ApiException {
        Call call = getAllValidateBeforeCall(count, offset, fields, q, sort);
        Type localVarReturnType = new TypeToken<GeneralContractsList>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for getAvailablePaymentMethods
     * @param generalContractId Contract identifier (required)
     * @param body options
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public Call getAvailablePaymentMethodsCall(String generalContractId, GetAvailablePaymentMethodsDTO body) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/General/Contracts/{generalContractId}/getAvailablePaymentMethods"
            .replaceAll("\\{" + "generalContractId" + "\\}", apiClient.escapeString(generalContractId.toString()));

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
    private Call getAvailablePaymentMethodsValidateBeforeCall(String generalContractId, GetAvailablePaymentMethodsDTO body) throws ApiException {
        // verify the required parameter 'generalContractId' is set
        if (generalContractId == null) {
            throw new ApiException("Missing the required parameter 'generalContractId' when calling getAvailablePaymentMethods(Async)");
        }

        return getAvailablePaymentMethodsCall(generalContractId, body);
    }

    /**
     * POST General/Contracts/{generalContractId}/getAvailablePaymentMethods
     * Get available payment methods for given contract
     * @param generalContractId Contract identifier (required)
     * @param body options
     * @return List&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<String> getAvailablePaymentMethods(String generalContractId, GetAvailablePaymentMethodsDTO body) throws ApiException {
        ApiResponse<List<String>> resp = getAvailablePaymentMethodsWithHttpInfo(generalContractId, body);
        return resp.getData();
    }

    /**
     * POST General/Contracts/{generalContractId}/getAvailablePaymentMethods
     * Get available payment methods for given contract
     * @param generalContractId Contract identifier (required)
     * @param body options
     * @return ApiResponse&lt;List&lt;String&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<String>> getAvailablePaymentMethodsWithHttpInfo(String generalContractId, GetAvailablePaymentMethodsDTO body) throws ApiException {
        Call call = getAvailablePaymentMethodsValidateBeforeCall(generalContractId, body);
        Type localVarReturnType = new TypeToken<List<String>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * POST General/Contracts/{generalContractId}/getAvailablePaymentMethods (asynchronously)
     * Get available payment methods for given contract
     * @param generalContractId Contract identifier (required)
     * @param body options
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call getAvailablePaymentMethodsAsync(String generalContractId, GetAvailablePaymentMethodsDTO body, final ApiCallback<List<String>> callback) throws ApiException {
        Call call = getAvailablePaymentMethodsValidateBeforeCall(generalContractId, body);
        Type localVarReturnType = new TypeToken<List<String>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for getOne
     * @param generalContractId General contract id (required)
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public Call getOneCall(String generalContractId) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/General/Contracts/{generalContractId}"
            .replaceAll("\\{" + "generalContractId" + "\\}", apiClient.escapeString(generalContractId.toString()));

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
    private Call getOneValidateBeforeCall(String generalContractId) throws ApiException {
        // verify the required parameter 'generalContractId' is set
        if (generalContractId == null) {
            throw new ApiException("Missing the required parameter 'generalContractId' when calling getOne(Async)");
        }

        return getOneCall(generalContractId);
    }

    /**
     * GET General/Contracts/{generalContractId}
     * Get one general contract for a specific id
     * @param generalContractId General contract id (required)
     * @return GeneralContractsProductModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public GeneralContractsProductModel getOne(String generalContractId) throws ApiException {
        ApiResponse<GeneralContractsProductModel> resp = getOneWithHttpInfo(generalContractId);
        return resp.getData();
    }

    /**
     * GET General/Contracts/{generalContractId}
     * Get one general contract for a specific id
     * @param generalContractId General contract id (required)
     * @return ApiResponse&lt;GeneralContractsProductModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<GeneralContractsProductModel> getOneWithHttpInfo(String generalContractId) throws ApiException {
        Call call = getOneValidateBeforeCall(generalContractId);
        Type localVarReturnType = new TypeToken<GeneralContractsProductModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * GET General/Contracts/{generalContractId} (asynchronously)
     * Get one general contract for a specific id
     * @param generalContractId General contract id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call getOneAsync(String generalContractId, final ApiCallback<GeneralContractsProductModel> callback) throws ApiException {
        Call call = getOneValidateBeforeCall(generalContractId);
        Type localVarReturnType = new TypeToken<GeneralContractsProductModel>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for revokeAccrual
     * @param generalContractId Contract identifier (required)
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public Call revokeAccrualCall(String generalContractId) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/General/Contracts/{generalContractId}/revokeAccrual"
            .replaceAll("\\{" + "generalContractId" + "\\}", apiClient.escapeString(generalContractId.toString()));

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
    private Call revokeAccrualValidateBeforeCall(String generalContractId) throws ApiException {
        // verify the required parameter 'generalContractId' is set
        if (generalContractId == null) {
            throw new ApiException("Missing the required parameter 'generalContractId' when calling revokeAccrual(Async)");
        }

        return revokeAccrualCall(generalContractId);
    }

    /**
     * POST General/Contracts/{generalContractId}/revokeAccrual
     * Revoke accrual flag for all transactions of given contract
     * @param generalContractId Contract identifier (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void revokeAccrual(String generalContractId) throws ApiException {
        revokeAccrualWithHttpInfo(generalContractId);
    }

    /**
     * POST General/Contracts/{generalContractId}/revokeAccrual
     * Revoke accrual flag for all transactions of given contract
     * @param generalContractId Contract identifier (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> revokeAccrualWithHttpInfo(String generalContractId) throws ApiException {
        Call call = revokeAccrualValidateBeforeCall(generalContractId);
        return apiClient.execute(call);
    }

    /**
     * POST General/Contracts/{generalContractId}/revokeAccrual (asynchronously)
     * Revoke accrual flag for all transactions of given contract
     * @param generalContractId Contract identifier (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call revokeAccrualAsync(String generalContractId, final ApiCallback<Void> callback) throws ApiException {
        Call call = revokeAccrualValidateBeforeCall(generalContractId);
        apiClient.executeAsync(call, callback);
        return call;
    }

    /**
     * Build call for updateBankAccount
     * @param generalContractId Contract identifier (required)
     * @param body options
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public Call updateBankAccountCall(String generalContractId, BankAccountDescriptor body) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/General/Contracts/{generalContractId}/updateBankAccount"
            .replaceAll("\\{" + "generalContractId" + "\\}", apiClient.escapeString(generalContractId.toString()));

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
    private Call updateBankAccountValidateBeforeCall(String generalContractId, BankAccountDescriptor body) throws ApiException {
        // verify the required parameter 'generalContractId' is set
        if (generalContractId == null) {
            throw new ApiException("Missing the required parameter 'generalContractId' when calling updateBankAccount(Async)");
        }

        return updateBankAccountCall(generalContractId, body);
    }

    /**
     * POST General/Contracts/{generalContractId}/updateBankAccount
     * Change the payout bank account of a contract
     * @param generalContractId Contract identifier (required)
     * @param body options
     * @return ResultBoolean
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ResultBoolean updateBankAccount(String generalContractId, BankAccountDescriptor body) throws ApiException {
        ApiResponse<ResultBoolean> resp = updateBankAccountWithHttpInfo(generalContractId, body);
        return resp.getData();
    }

    /**
     * POST General/Contracts/{generalContractId}/updateBankAccount
     * Change the payout bank account of a contract
     * @param generalContractId Contract identifier (required)
     * @param body options
     * @return ApiResponse&lt;ResultBoolean&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ResultBoolean> updateBankAccountWithHttpInfo(String generalContractId, BankAccountDescriptor body) throws ApiException {
        Call call = updateBankAccountValidateBeforeCall(generalContractId, body);
        Type localVarReturnType = new TypeToken<ResultBoolean>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * POST General/Contracts/{generalContractId}/updateBankAccount (asynchronously)
     * Change the payout bank account of a contract
     * @param generalContractId Contract identifier (required)
     * @param body options
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call updateBankAccountAsync(String generalContractId, BankAccountDescriptor body, final ApiCallback<ResultBoolean> callback) throws ApiException {
        Call call = updateBankAccountValidateBeforeCall(generalContractId, body);
        Type localVarReturnType = new TypeToken<ResultBoolean>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}

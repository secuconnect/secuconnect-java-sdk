package com.secuconnect.client.api;

import com.google.gson.reflect.TypeToken;
import com.secuconnect.client.*;
import com.secuconnect.client.model.Aggregate;
import com.secuconnect.client.model.AvailableCurrencies;
import com.secuconnect.client.model.BankAccountDescriptor;
import java.math.BigDecimal;
import com.secuconnect.client.model.GeneralContractsDTO;
import com.secuconnect.client.model.GeneralContractsList;
import com.secuconnect.client.model.GeneralContractsProductModel;
import com.secuconnect.client.model.GeneralContractsTransferBalanceModel;
import com.secuconnect.client.model.GetAvailablePaymentMethodsDTO;
import com.secuconnect.client.model.IframeOptions;
import com.secuconnect.client.model.PaymentLinkOptions;
import com.secuconnect.client.model.ProductExceptionPayload;
import com.secuconnect.client.model.ProductInstanceID;
import com.secuconnect.client.model.ResultBoolean;
import com.secuconnect.client.model.ThirdPartyConfigurationDTO;
import com.secuconnect.client.model.ThirdPartyConfigurationProductModel;
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
     * Build call for addPaymentLinkConfiguration
     * @param generalContractId Contract identifier (required)
     * @param body 
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public Call addPaymentLinkConfigurationCall(String generalContractId, PaymentLinkOptions body) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/General/Contracts/{generalContractId}/savePaymentLinkConfiguration"
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
    private Call addPaymentLinkConfigurationValidateBeforeCall(String generalContractId, PaymentLinkOptions body) throws ApiException {
        // verify the required parameter 'generalContractId' is set
        if (generalContractId == null) {
            throw new ApiException("Missing the required parameter 'generalContractId' when calling addPaymentLinkConfiguration(Async)");
        }

        return addPaymentLinkConfigurationCall(generalContractId, body);
    }

    /**
     * POST General/Contracts/{generalContractId}/SavePaymentLinkConfiguration
     * Saves payment link options configuration
     * @param generalContractId Contract identifier (required)
     * @param body 
     * @return GeneralContractsProductModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public GeneralContractsProductModel addPaymentLinkConfiguration(String generalContractId, PaymentLinkOptions body) throws ApiException {
        ApiResponse<GeneralContractsProductModel> resp = addPaymentLinkConfigurationWithHttpInfo(generalContractId, body);
        return resp.getData();
    }

    /**
     * POST General/Contracts/{generalContractId}/SavePaymentLinkConfiguration
     * Saves payment link options configuration
     * @param generalContractId Contract identifier (required)
     * @param body 
     * @return ApiResponse&lt;GeneralContractsProductModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<GeneralContractsProductModel> addPaymentLinkConfigurationWithHttpInfo(String generalContractId, PaymentLinkOptions body) throws ApiException {
        Call call = addPaymentLinkConfigurationValidateBeforeCall(generalContractId, body);
        Type localVarReturnType = new TypeToken<GeneralContractsProductModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * POST General/Contracts/{generalContractId}/SavePaymentLinkConfiguration (asynchronously)
     * Saves payment link options configuration
     * @param generalContractId Contract identifier (required)
     * @param body 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call addPaymentLinkConfigurationAsync(String generalContractId, PaymentLinkOptions body, final ApiCallback<GeneralContractsProductModel> callback) throws ApiException {
        Call call = addPaymentLinkConfigurationValidateBeforeCall(generalContractId, body);
        Type localVarReturnType = new TypeToken<GeneralContractsProductModel>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for addThirdPartyConfiguration
     * @param generalContractId General contract id (required)
     * @param body 
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public Call addThirdPartyConfigurationCall(String generalContractId, ThirdPartyConfigurationDTO body) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/General/Contracts/{generalContractId}/ThirdPartyConfiguration"
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
    private Call addThirdPartyConfigurationValidateBeforeCall(String generalContractId, ThirdPartyConfigurationDTO body) throws ApiException {
        // verify the required parameter 'generalContractId' is set
        if (generalContractId == null) {
            throw new ApiException("Missing the required parameter 'generalContractId' when calling addThirdPartyConfiguration(Async)");
        }

        return addThirdPartyConfigurationCall(generalContractId, body);
    }

    /**
     * POST General/Contracts/{generalContractId}/ThirdPartyConfiguration
     * Adds a new third party configuration
     * @param generalContractId General contract id (required)
     * @param body 
     * @return ThirdPartyConfigurationProductModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ThirdPartyConfigurationProductModel addThirdPartyConfiguration(String generalContractId, ThirdPartyConfigurationDTO body) throws ApiException {
        ApiResponse<ThirdPartyConfigurationProductModel> resp = addThirdPartyConfigurationWithHttpInfo(generalContractId, body);
        return resp.getData();
    }

    /**
     * POST General/Contracts/{generalContractId}/ThirdPartyConfiguration
     * Adds a new third party configuration
     * @param generalContractId General contract id (required)
     * @param body 
     * @return ApiResponse&lt;ThirdPartyConfigurationProductModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ThirdPartyConfigurationProductModel> addThirdPartyConfigurationWithHttpInfo(String generalContractId, ThirdPartyConfigurationDTO body) throws ApiException {
        Call call = addThirdPartyConfigurationValidateBeforeCall(generalContractId, body);
        Type localVarReturnType = new TypeToken<ThirdPartyConfigurationProductModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * POST General/Contracts/{generalContractId}/ThirdPartyConfiguration (asynchronously)
     * Adds a new third party configuration
     * @param generalContractId General contract id (required)
     * @param body 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call addThirdPartyConfigurationAsync(String generalContractId, ThirdPartyConfigurationDTO body, final ApiCallback<ThirdPartyConfigurationProductModel> callback) throws ApiException {
        Call call = addThirdPartyConfigurationValidateBeforeCall(generalContractId, body);
        Type localVarReturnType = new TypeToken<ThirdPartyConfigurationProductModel>(){}.getType();
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
     * @param fields List of fields to include in the result, all others will be filtered out. Nested properties can be accessed with this notation: &#x60;prop1.prop2&#x60;.
     * @param q A query string to restrict the returned items to given conditions. The query string must consist of any combination of single expressions in the form &#x60;property:condition&#x60;. Property names can be nested like &#x60;property.property&#x60;.  Example: &#x60;customer.name:Meier&#x60;  A condition may contain:  * &#x60;?&#x60; as wildcard for one character;  * &#x60;*&#x60; as wildcard for any number of characters.  You can also use value ranges in the form &#x60;[min TO max]&#x60;.  Example: &#x60;customer.age:[30 TO 40]&#x60;  You can combine expressions logically by &#x60;expr AND expr&#x60; and &#x60;{expr} OR {expr}&#x60;. You can also negate an expression using &#x60;NOT {expr}&#x60;. Parenthesis &#x60;(...)&#x60; can be used to control precedence.  Example: &#x60;(NOT customer.name:meier*) AND (customer.age:[30 TO 40] OR customer.age:[50 TO 60])&#x60;
     * @param sort String with comma separated pairs of &#x60;field:order&#x60;.  Options for order:  * &#x60;asc&#x60; ascending;  * &#x60;desc&#x60; descending.
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
     * @param fields List of fields to include in the result, all others will be filtered out. Nested properties can be accessed with this notation: &#x60;prop1.prop2&#x60;.
     * @param q A query string to restrict the returned items to given conditions. The query string must consist of any combination of single expressions in the form &#x60;property:condition&#x60;. Property names can be nested like &#x60;property.property&#x60;.  Example: &#x60;customer.name:Meier&#x60;  A condition may contain:  * &#x60;?&#x60; as wildcard for one character;  * &#x60;*&#x60; as wildcard for any number of characters.  You can also use value ranges in the form &#x60;[min TO max]&#x60;.  Example: &#x60;customer.age:[30 TO 40]&#x60;  You can combine expressions logically by &#x60;expr AND expr&#x60; and &#x60;{expr} OR {expr}&#x60;. You can also negate an expression using &#x60;NOT {expr}&#x60;. Parenthesis &#x60;(...)&#x60; can be used to control precedence.  Example: &#x60;(NOT customer.name:meier*) AND (customer.age:[30 TO 40] OR customer.age:[50 TO 60])&#x60;
     * @param sort String with comma separated pairs of &#x60;field:order&#x60;.  Options for order:  * &#x60;asc&#x60; ascending;  * &#x60;desc&#x60; descending.
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
     * @param fields List of fields to include in the result, all others will be filtered out. Nested properties can be accessed with this notation: &#x60;prop1.prop2&#x60;.
     * @param q A query string to restrict the returned items to given conditions. The query string must consist of any combination of single expressions in the form &#x60;property:condition&#x60;. Property names can be nested like &#x60;property.property&#x60;.  Example: &#x60;customer.name:Meier&#x60;  A condition may contain:  * &#x60;?&#x60; as wildcard for one character;  * &#x60;*&#x60; as wildcard for any number of characters.  You can also use value ranges in the form &#x60;[min TO max]&#x60;.  Example: &#x60;customer.age:[30 TO 40]&#x60;  You can combine expressions logically by &#x60;expr AND expr&#x60; and &#x60;{expr} OR {expr}&#x60;. You can also negate an expression using &#x60;NOT {expr}&#x60;. Parenthesis &#x60;(...)&#x60; can be used to control precedence.  Example: &#x60;(NOT customer.name:meier*) AND (customer.age:[30 TO 40] OR customer.age:[50 TO 60])&#x60;
     * @param sort String with comma separated pairs of &#x60;field:order&#x60;.  Options for order:  * &#x60;asc&#x60; ascending;  * &#x60;desc&#x60; descending.
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
     * Build call for getAvailableCurrencies
     * @param generalContractId Contract identifier (required)
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public Call getAvailableCurrenciesCall(String generalContractId) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/General/Contracts/{generalContractId}/AvailableCurrencies"
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
    private Call getAvailableCurrenciesValidateBeforeCall(String generalContractId) throws ApiException {
        // verify the required parameter 'generalContractId' is set
        if (generalContractId == null) {
            throw new ApiException("Missing the required parameter 'generalContractId' when calling getAvailableCurrencies(Async)");
        }

        return getAvailableCurrenciesCall(generalContractId);
    }

    /**
     * GET General/Contracts/{generalContractId}/AvailableCurrencies
     * Gets the available currencies of a contract
     * @param generalContractId Contract identifier (required)
     * @return AvailableCurrencies
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public AvailableCurrencies getAvailableCurrencies(String generalContractId) throws ApiException {
        ApiResponse<AvailableCurrencies> resp = getAvailableCurrenciesWithHttpInfo(generalContractId);
        return resp.getData();
    }

    /**
     * GET General/Contracts/{generalContractId}/AvailableCurrencies
     * Gets the available currencies of a contract
     * @param generalContractId Contract identifier (required)
     * @return ApiResponse&lt;AvailableCurrencies&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<AvailableCurrencies> getAvailableCurrenciesWithHttpInfo(String generalContractId) throws ApiException {
        Call call = getAvailableCurrenciesValidateBeforeCall(generalContractId);
        Type localVarReturnType = new TypeToken<AvailableCurrencies>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * GET General/Contracts/{generalContractId}/AvailableCurrencies (asynchronously)
     * Gets the available currencies of a contract
     * @param generalContractId Contract identifier (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call getAvailableCurrenciesAsync(String generalContractId, final ApiCallback<AvailableCurrencies> callback) throws ApiException {
        Call call = getAvailableCurrenciesValidateBeforeCall(generalContractId);
        Type localVarReturnType = new TypeToken<AvailableCurrencies>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for getAvailablePaymentMethods
     * @param generalContractId Contract identifier (required)
     * @param body 
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
     * @param body 
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
     * @param body 
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
     * @param body 
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
     * Build call for getAvailablePaymentMethodsForTransaction
     * @param generalContractId Contract identifier (required)
     * @param smartTransactionId Smart Transaction identifier (required)
     * @param body 
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public Call getAvailablePaymentMethodsForTransactionCall(String generalContractId, String smartTransactionId, GetAvailablePaymentMethodsDTO body) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/General/Contracts/{generalContractId}/getAvailablePaymentMethods/{smartTransactionId}"
            .replaceAll("\\{" + "generalContractId" + "\\}", apiClient.escapeString(generalContractId.toString()))
            .replaceAll("\\{" + "smartTransactionId" + "\\}", apiClient.escapeString(smartTransactionId.toString()));

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
    private Call getAvailablePaymentMethodsForTransactionValidateBeforeCall(String generalContractId, String smartTransactionId, GetAvailablePaymentMethodsDTO body) throws ApiException {
        // verify the required parameter 'generalContractId' is set
        if (generalContractId == null) {
            throw new ApiException("Missing the required parameter 'generalContractId' when calling getAvailablePaymentMethodsForTransaction(Async)");
        }
        // verify the required parameter 'smartTransactionId' is set
        if (smartTransactionId == null) {
            throw new ApiException("Missing the required parameter 'smartTransactionId' when calling getAvailablePaymentMethodsForTransaction(Async)");
        }

        return getAvailablePaymentMethodsForTransactionCall(generalContractId, smartTransactionId, body);
    }

    /**
     * POST General/Contracts/{generalContractId}/getAvailablePaymentMethods/{smartTransactionId}
     * Get available payment methods for given contract
     * @param generalContractId Contract identifier (required)
     * @param smartTransactionId Smart Transaction identifier (required)
     * @param body 
     * @return List&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<String> getAvailablePaymentMethodsForTransaction(String generalContractId, String smartTransactionId, GetAvailablePaymentMethodsDTO body) throws ApiException {
        ApiResponse<List<String>> resp = getAvailablePaymentMethodsForTransactionWithHttpInfo(generalContractId, smartTransactionId, body);
        return resp.getData();
    }

    /**
     * POST General/Contracts/{generalContractId}/getAvailablePaymentMethods/{smartTransactionId}
     * Get available payment methods for given contract
     * @param generalContractId Contract identifier (required)
     * @param smartTransactionId Smart Transaction identifier (required)
     * @param body 
     * @return ApiResponse&lt;List&lt;String&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<String>> getAvailablePaymentMethodsForTransactionWithHttpInfo(String generalContractId, String smartTransactionId, GetAvailablePaymentMethodsDTO body) throws ApiException {
        Call call = getAvailablePaymentMethodsForTransactionValidateBeforeCall(generalContractId, smartTransactionId, body);
        Type localVarReturnType = new TypeToken<List<String>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * POST General/Contracts/{generalContractId}/getAvailablePaymentMethods/{smartTransactionId} (asynchronously)
     * Get available payment methods for given contract
     * @param generalContractId Contract identifier (required)
     * @param smartTransactionId Smart Transaction identifier (required)
     * @param body 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call getAvailablePaymentMethodsForTransactionAsync(String generalContractId, String smartTransactionId, GetAvailablePaymentMethodsDTO body, final ApiCallback<List<String>> callback) throws ApiException {
        Call call = getAvailablePaymentMethodsForTransactionValidateBeforeCall(generalContractId, smartTransactionId, body);
        Type localVarReturnType = new TypeToken<List<String>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for getIframeOptions
     * @param generalContractId Contract identifier (required)
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public Call getIframeOptionsCall(String generalContractId) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/General/Contracts/{generalContractId}/IframeOptions"
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
    private Call getIframeOptionsValidateBeforeCall(String generalContractId) throws ApiException {
        // verify the required parameter 'generalContractId' is set
        if (generalContractId == null) {
            throw new ApiException("Missing the required parameter 'generalContractId' when calling getIframeOptions(Async)");
        }

        return getIframeOptionsCall(generalContractId);
    }

    /**
     * GET General/Contracts/{generalContractId}/IframeOptions
     * Get apiv2-based iframe options for given contract
     * @param generalContractId Contract identifier (required)
     * @return IframeOptions
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public IframeOptions getIframeOptions(String generalContractId) throws ApiException {
        ApiResponse<IframeOptions> resp = getIframeOptionsWithHttpInfo(generalContractId);
        return resp.getData();
    }

    /**
     * GET General/Contracts/{generalContractId}/IframeOptions
     * Get apiv2-based iframe options for given contract
     * @param generalContractId Contract identifier (required)
     * @return ApiResponse&lt;IframeOptions&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<IframeOptions> getIframeOptionsWithHttpInfo(String generalContractId) throws ApiException {
        Call call = getIframeOptionsValidateBeforeCall(generalContractId);
        Type localVarReturnType = new TypeToken<IframeOptions>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * GET General/Contracts/{generalContractId}/IframeOptions (asynchronously)
     * Get apiv2-based iframe options for given contract
     * @param generalContractId Contract identifier (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call getIframeOptionsAsync(String generalContractId, final ApiCallback<IframeOptions> callback) throws ApiException {
        Call call = getIframeOptionsValidateBeforeCall(generalContractId);
        Type localVarReturnType = new TypeToken<IframeOptions>(){}.getType();
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
     * Build call for getThirdPartyConfiguration
     * @param generalContractId General contract id (required)
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public Call getThirdPartyConfigurationCall(String generalContractId) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/General/Contracts/{generalContractId}/ThirdPartyConfiguration"
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
    private Call getThirdPartyConfigurationValidateBeforeCall(String generalContractId) throws ApiException {
        // verify the required parameter 'generalContractId' is set
        if (generalContractId == null) {
            throw new ApiException("Missing the required parameter 'generalContractId' when calling getThirdPartyConfiguration(Async)");
        }

        return getThirdPartyConfigurationCall(generalContractId);
    }

    /**
     * GET General/Contracts/{generalContractId}/ThirdPartyConfiguration
     * Get third party configuration
     * @param generalContractId General contract id (required)
     * @return ThirdPartyConfigurationProductModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ThirdPartyConfigurationProductModel getThirdPartyConfiguration(String generalContractId) throws ApiException {
        ApiResponse<ThirdPartyConfigurationProductModel> resp = getThirdPartyConfigurationWithHttpInfo(generalContractId);
        return resp.getData();
    }

    /**
     * GET General/Contracts/{generalContractId}/ThirdPartyConfiguration
     * Get third party configuration
     * @param generalContractId General contract id (required)
     * @return ApiResponse&lt;ThirdPartyConfigurationProductModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ThirdPartyConfigurationProductModel> getThirdPartyConfigurationWithHttpInfo(String generalContractId) throws ApiException {
        Call call = getThirdPartyConfigurationValidateBeforeCall(generalContractId);
        Type localVarReturnType = new TypeToken<ThirdPartyConfigurationProductModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * GET General/Contracts/{generalContractId}/ThirdPartyConfiguration (asynchronously)
     * Get third party configuration
     * @param generalContractId General contract id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call getThirdPartyConfigurationAsync(String generalContractId, final ApiCallback<ThirdPartyConfigurationProductModel> callback) throws ApiException {
        Call call = getThirdPartyConfigurationValidateBeforeCall(generalContractId);
        Type localVarReturnType = new TypeToken<ThirdPartyConfigurationProductModel>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for getTransferBalance
     * @param generalContractId Contract identifier (required)
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public Call getTransferBalanceCall(ProductInstanceID generalContractId) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/General/Contracts/{generalContractId}/transferBalance"
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
    private Call getTransferBalanceValidateBeforeCall(ProductInstanceID generalContractId) throws ApiException {
        // verify the required parameter 'generalContractId' is set
        if (generalContractId == null) {
            throw new ApiException("Missing the required parameter 'generalContractId' when calling getTransferBalance(Async)");
        }

        return getTransferBalanceCall(generalContractId);
    }

    /**
     * GET General/Contracts/{generalContractId}/transferBalance
     * Get balance for each currency of a contract
     * @param generalContractId Contract identifier (required)
     * @return GeneralContractsTransferBalanceModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public GeneralContractsTransferBalanceModel getTransferBalance(ProductInstanceID generalContractId) throws ApiException {
        ApiResponse<GeneralContractsTransferBalanceModel> resp = getTransferBalanceWithHttpInfo(generalContractId);
        return resp.getData();
    }

    /**
     * GET General/Contracts/{generalContractId}/transferBalance
     * Get balance for each currency of a contract
     * @param generalContractId Contract identifier (required)
     * @return ApiResponse&lt;GeneralContractsTransferBalanceModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<GeneralContractsTransferBalanceModel> getTransferBalanceWithHttpInfo(ProductInstanceID generalContractId) throws ApiException {
        Call call = getTransferBalanceValidateBeforeCall(generalContractId);
        Type localVarReturnType = new TypeToken<GeneralContractsTransferBalanceModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * GET General/Contracts/{generalContractId}/transferBalance (asynchronously)
     * Get balance for each currency of a contract
     * @param generalContractId Contract identifier (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call getTransferBalanceAsync(ProductInstanceID generalContractId, final ApiCallback<GeneralContractsTransferBalanceModel> callback) throws ApiException {
        Call call = getTransferBalanceValidateBeforeCall(generalContractId);
        Type localVarReturnType = new TypeToken<GeneralContractsTransferBalanceModel>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for patchContract
     * @param generalContractId General contract id (required)
     * @param body 
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public Call patchContractCall(String generalContractId, GeneralContractsDTO body) throws ApiException {
        Object localVarPostBody = body;

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
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "oauth_token" };
        return apiClient.buildCall(localVarPath, "PATCH", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames);
    }

    @SuppressWarnings("rawtypes")
    private Call patchContractValidateBeforeCall(String generalContractId, GeneralContractsDTO body) throws ApiException {
        // verify the required parameter 'generalContractId' is set
        if (generalContractId == null) {
            throw new ApiException("Missing the required parameter 'generalContractId' when calling patchContract(Async)");
        }

        return patchContractCall(generalContractId, body);
    }

    /**
     * PATCH General/Contracts/{generalContractId}
     * Patches one general contract for a specific id
     * @param generalContractId General contract id (required)
     * @param body 
     * @return GeneralContractsProductModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public GeneralContractsProductModel patchContract(String generalContractId, GeneralContractsDTO body) throws ApiException {
        ApiResponse<GeneralContractsProductModel> resp = patchContractWithHttpInfo(generalContractId, body);
        return resp.getData();
    }

    /**
     * PATCH General/Contracts/{generalContractId}
     * Patches one general contract for a specific id
     * @param generalContractId General contract id (required)
     * @param body 
     * @return ApiResponse&lt;GeneralContractsProductModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<GeneralContractsProductModel> patchContractWithHttpInfo(String generalContractId, GeneralContractsDTO body) throws ApiException {
        Call call = patchContractValidateBeforeCall(generalContractId, body);
        Type localVarReturnType = new TypeToken<GeneralContractsProductModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * PATCH General/Contracts/{generalContractId} (asynchronously)
     * Patches one general contract for a specific id
     * @param generalContractId General contract id (required)
     * @param body 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call patchContractAsync(String generalContractId, GeneralContractsDTO body, final ApiCallback<GeneralContractsProductModel> callback) throws ApiException {
        Call call = patchContractValidateBeforeCall(generalContractId, body);
        Type localVarReturnType = new TypeToken<GeneralContractsProductModel>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for patchThirdPartyConfiguration
     * @param generalContractId General contract id (required)
     * @param body 
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public Call patchThirdPartyConfigurationCall(String generalContractId, ThirdPartyConfigurationDTO body) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/General/Contracts/{generalContractId}/ThirdPartyConfiguration"
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
        return apiClient.buildCall(localVarPath, "PATCH", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames);
    }

    @SuppressWarnings("rawtypes")
    private Call patchThirdPartyConfigurationValidateBeforeCall(String generalContractId, ThirdPartyConfigurationDTO body) throws ApiException {
        // verify the required parameter 'generalContractId' is set
        if (generalContractId == null) {
            throw new ApiException("Missing the required parameter 'generalContractId' when calling patchThirdPartyConfiguration(Async)");
        }

        return patchThirdPartyConfigurationCall(generalContractId, body);
    }

    /**
     * PATCH General/Contracts/{generalContractId}/ThirdPartyConfiguration
     * Patches a third party configuration
     * @param generalContractId General contract id (required)
     * @param body 
     * @return ThirdPartyConfigurationProductModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ThirdPartyConfigurationProductModel patchThirdPartyConfiguration(String generalContractId, ThirdPartyConfigurationDTO body) throws ApiException {
        ApiResponse<ThirdPartyConfigurationProductModel> resp = patchThirdPartyConfigurationWithHttpInfo(generalContractId, body);
        return resp.getData();
    }

    /**
     * PATCH General/Contracts/{generalContractId}/ThirdPartyConfiguration
     * Patches a third party configuration
     * @param generalContractId General contract id (required)
     * @param body 
     * @return ApiResponse&lt;ThirdPartyConfigurationProductModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ThirdPartyConfigurationProductModel> patchThirdPartyConfigurationWithHttpInfo(String generalContractId, ThirdPartyConfigurationDTO body) throws ApiException {
        Call call = patchThirdPartyConfigurationValidateBeforeCall(generalContractId, body);
        Type localVarReturnType = new TypeToken<ThirdPartyConfigurationProductModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * PATCH General/Contracts/{generalContractId}/ThirdPartyConfiguration (asynchronously)
     * Patches a third party configuration
     * @param generalContractId General contract id (required)
     * @param body 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call patchThirdPartyConfigurationAsync(String generalContractId, ThirdPartyConfigurationDTO body, final ApiCallback<ThirdPartyConfigurationProductModel> callback) throws ApiException {
        Call call = patchThirdPartyConfigurationValidateBeforeCall(generalContractId, body);
        Type localVarReturnType = new TypeToken<ThirdPartyConfigurationProductModel>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for removeThirdPartyConfiguration
     * @param generalContractId General contract id (required)
     * @param thirdPartyName Third party name (required)
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public Call removeThirdPartyConfigurationCall(String generalContractId, String thirdPartyName) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/General/Contracts/{generalContractId}/ThirdPartyConfiguration/{thirdPartyName}"
            .replaceAll("\\{" + "generalContractId" + "\\}", apiClient.escapeString(generalContractId.toString()))
            .replaceAll("\\{" + "thirdPartyName" + "\\}", apiClient.escapeString(thirdPartyName.toString()));

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
    private Call removeThirdPartyConfigurationValidateBeforeCall(String generalContractId, String thirdPartyName) throws ApiException {
        // verify the required parameter 'generalContractId' is set
        if (generalContractId == null) {
            throw new ApiException("Missing the required parameter 'generalContractId' when calling removeThirdPartyConfiguration(Async)");
        }
        // verify the required parameter 'thirdPartyName' is set
        if (thirdPartyName == null) {
            throw new ApiException("Missing the required parameter 'thirdPartyName' when calling removeThirdPartyConfiguration(Async)");
        }

        return removeThirdPartyConfigurationCall(generalContractId, thirdPartyName);
    }

    /**
     * DELETE General/Contracts/{generalContractId}/ThirdPartyConfiguration
     * Deletes one or all third party configurations for a contract
     * @param generalContractId General contract id (required)
     * @param thirdPartyName Third party name (required)
     * @return ThirdPartyConfigurationProductModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ThirdPartyConfigurationProductModel removeThirdPartyConfiguration(String generalContractId, String thirdPartyName) throws ApiException {
        ApiResponse<ThirdPartyConfigurationProductModel> resp = removeThirdPartyConfigurationWithHttpInfo(generalContractId, thirdPartyName);
        return resp.getData();
    }

    /**
     * DELETE General/Contracts/{generalContractId}/ThirdPartyConfiguration
     * Deletes one or all third party configurations for a contract
     * @param generalContractId General contract id (required)
     * @param thirdPartyName Third party name (required)
     * @return ApiResponse&lt;ThirdPartyConfigurationProductModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ThirdPartyConfigurationProductModel> removeThirdPartyConfigurationWithHttpInfo(String generalContractId, String thirdPartyName) throws ApiException {
        Call call = removeThirdPartyConfigurationValidateBeforeCall(generalContractId, thirdPartyName);
        Type localVarReturnType = new TypeToken<ThirdPartyConfigurationProductModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * DELETE General/Contracts/{generalContractId}/ThirdPartyConfiguration (asynchronously)
     * Deletes one or all third party configurations for a contract
     * @param generalContractId General contract id (required)
     * @param thirdPartyName Third party name (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call removeThirdPartyConfigurationAsync(String generalContractId, String thirdPartyName, final ApiCallback<ThirdPartyConfigurationProductModel> callback) throws ApiException {
        Call call = removeThirdPartyConfigurationValidateBeforeCall(generalContractId, thirdPartyName);
        Type localVarReturnType = new TypeToken<ThirdPartyConfigurationProductModel>(){}.getType();
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
     * Build call for terminate
     * @param generalContractId Contract identifier (required)
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public Call terminateCall(String generalContractId) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/General/Contracts/{generalContractId}/terminate"
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
    private Call terminateValidateBeforeCall(String generalContractId) throws ApiException {
        // verify the required parameter 'generalContractId' is set
        if (generalContractId == null) {
            throw new ApiException("Missing the required parameter 'generalContractId' when calling terminate(Async)");
        }

        return terminateCall(generalContractId);
    }

    /**
     * POST General/Contracts/{generalContractId}/terminate
     * Terminates given contract
     * @param generalContractId Contract identifier (required)
     * @return ResultBoolean
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ResultBoolean terminate(String generalContractId) throws ApiException {
        ApiResponse<ResultBoolean> resp = terminateWithHttpInfo(generalContractId);
        return resp.getData();
    }

    /**
     * POST General/Contracts/{generalContractId}/terminate
     * Terminates given contract
     * @param generalContractId Contract identifier (required)
     * @return ApiResponse&lt;ResultBoolean&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ResultBoolean> terminateWithHttpInfo(String generalContractId) throws ApiException {
        Call call = terminateValidateBeforeCall(generalContractId);
        Type localVarReturnType = new TypeToken<ResultBoolean>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * POST General/Contracts/{generalContractId}/terminate (asynchronously)
     * Terminates given contract
     * @param generalContractId Contract identifier (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call terminateAsync(String generalContractId, final ApiCallback<ResultBoolean> callback) throws ApiException {
        Call call = terminateValidateBeforeCall(generalContractId);
        Type localVarReturnType = new TypeToken<ResultBoolean>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for updateBankAccount
     * @param generalContractId Contract identifier (required)
     * @param body 
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
     * @param body 
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
     * @param body 
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
     * @param body 
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

    /**
     * Build call for updateContract
     * @param generalContractId General contract id (required)
     * @param body 
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public Call updateContractCall(String generalContractId, GeneralContractsDTO body) throws ApiException {
        Object localVarPostBody = body;

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
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "oauth_token" };
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames);
    }

    @SuppressWarnings("rawtypes")
    private Call updateContractValidateBeforeCall(String generalContractId, GeneralContractsDTO body) throws ApiException {
        // verify the required parameter 'generalContractId' is set
        if (generalContractId == null) {
            throw new ApiException("Missing the required parameter 'generalContractId' when calling updateContract(Async)");
        }

        return updateContractCall(generalContractId, body);
    }

    /**
     * PUT General/Contracts/{generalContractId}
     * Updates one general contract for a specific id
     * @param generalContractId General contract id (required)
     * @param body 
     * @return GeneralContractsProductModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public GeneralContractsProductModel updateContract(String generalContractId, GeneralContractsDTO body) throws ApiException {
        ApiResponse<GeneralContractsProductModel> resp = updateContractWithHttpInfo(generalContractId, body);
        return resp.getData();
    }

    /**
     * PUT General/Contracts/{generalContractId}
     * Updates one general contract for a specific id
     * @param generalContractId General contract id (required)
     * @param body 
     * @return ApiResponse&lt;GeneralContractsProductModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<GeneralContractsProductModel> updateContractWithHttpInfo(String generalContractId, GeneralContractsDTO body) throws ApiException {
        Call call = updateContractValidateBeforeCall(generalContractId, body);
        Type localVarReturnType = new TypeToken<GeneralContractsProductModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * PUT General/Contracts/{generalContractId} (asynchronously)
     * Updates one general contract for a specific id
     * @param generalContractId General contract id (required)
     * @param body 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call updateContractAsync(String generalContractId, GeneralContractsDTO body, final ApiCallback<GeneralContractsProductModel> callback) throws ApiException {
        Call call = updateContractValidateBeforeCall(generalContractId, body);
        Type localVarReturnType = new TypeToken<GeneralContractsProductModel>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for updateThirdPartyConfiguration
     * @param generalContractId General contract id (required)
     * @param body 
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public Call updateThirdPartyConfigurationCall(String generalContractId, ThirdPartyConfigurationDTO body) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/General/Contracts/{generalContractId}/ThirdPartyConfiguration"
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
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames);
    }

    @SuppressWarnings("rawtypes")
    private Call updateThirdPartyConfigurationValidateBeforeCall(String generalContractId, ThirdPartyConfigurationDTO body) throws ApiException {
        // verify the required parameter 'generalContractId' is set
        if (generalContractId == null) {
            throw new ApiException("Missing the required parameter 'generalContractId' when calling updateThirdPartyConfiguration(Async)");
        }

        return updateThirdPartyConfigurationCall(generalContractId, body);
    }

    /**
     * PUT General/Contracts/{generalContractId}/ThirdPartyConfiguration
     * Updates a third party configuration
     * @param generalContractId General contract id (required)
     * @param body 
     * @return ThirdPartyConfigurationProductModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ThirdPartyConfigurationProductModel updateThirdPartyConfiguration(String generalContractId, ThirdPartyConfigurationDTO body) throws ApiException {
        ApiResponse<ThirdPartyConfigurationProductModel> resp = updateThirdPartyConfigurationWithHttpInfo(generalContractId, body);
        return resp.getData();
    }

    /**
     * PUT General/Contracts/{generalContractId}/ThirdPartyConfiguration
     * Updates a third party configuration
     * @param generalContractId General contract id (required)
     * @param body 
     * @return ApiResponse&lt;ThirdPartyConfigurationProductModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ThirdPartyConfigurationProductModel> updateThirdPartyConfigurationWithHttpInfo(String generalContractId, ThirdPartyConfigurationDTO body) throws ApiException {
        Call call = updateThirdPartyConfigurationValidateBeforeCall(generalContractId, body);
        Type localVarReturnType = new TypeToken<ThirdPartyConfigurationProductModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * PUT General/Contracts/{generalContractId}/ThirdPartyConfiguration (asynchronously)
     * Updates a third party configuration
     * @param generalContractId General contract id (required)
     * @param body 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call updateThirdPartyConfigurationAsync(String generalContractId, ThirdPartyConfigurationDTO body, final ApiCallback<ThirdPartyConfigurationProductModel> callback) throws ApiException {
        Call call = updateThirdPartyConfigurationValidateBeforeCall(generalContractId, body);
        Type localVarReturnType = new TypeToken<ThirdPartyConfigurationProductModel>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}

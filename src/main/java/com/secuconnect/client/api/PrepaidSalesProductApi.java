package com.secuconnect.client.api;

import com.google.gson.reflect.TypeToken;
import com.secuconnect.client.*;
import com.secuconnect.client.model.PrepaidSalesProductDTO;
import com.secuconnect.client.model.PrepaidSalesProductModel;
import com.secuconnect.client.model.ProductExceptionPayload;
import okhttp3.Call;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PrepaidSalesProductApi {
    private ApiClient apiClient;

    public PrepaidSalesProductApi() {
        this(Environment.getGlobalEnv().getApiClient());
    }

    public PrepaidSalesProductApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for addSale
     * @param body Prepaid transaction input properties
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public Call addSaleCall(PrepaidSalesProductDTO body) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/Prepaid/Sales";

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
    private Call addSaleValidateBeforeCall(PrepaidSalesProductDTO body) throws ApiException {

        return addSaleCall(body);
    }

    /**
     * POST Prepaid/Sales
     * Create new prepaid transaction
     * @param body Prepaid transaction input properties
     * @return PrepaidSalesProductModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PrepaidSalesProductModel addSale(PrepaidSalesProductDTO body) throws ApiException {
        ApiResponse<PrepaidSalesProductModel> resp = addSaleWithHttpInfo(body);
        return resp.getData();
    }

    /**
     * POST Prepaid/Sales
     * Create new prepaid transaction
     * @param body Prepaid transaction input properties
     * @return ApiResponse&lt;PrepaidSalesProductModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PrepaidSalesProductModel> addSaleWithHttpInfo(PrepaidSalesProductDTO body) throws ApiException {
        Call call = addSaleValidateBeforeCall(body);
        Type localVarReturnType = new TypeToken<PrepaidSalesProductModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * POST Prepaid/Sales (asynchronously)
     * Create new prepaid transaction
     * @param body Prepaid transaction input properties
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call addSaleAsync(PrepaidSalesProductDTO body, final ApiCallback<PrepaidSalesProductModel> callback) throws ApiException {
        Call call = addSaleValidateBeforeCall(body);
        Type localVarReturnType = new TypeToken<PrepaidSalesProductModel>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}

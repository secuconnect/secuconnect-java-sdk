package com.secuconnect.client.api;

import com.google.gson.reflect.TypeToken;
import com.secuconnect.client.*;
import com.secuconnect.client.model.PrepaidMappingZvt;
import com.secuconnect.client.model.PrepaidZvtDTO;
import com.secuconnect.client.model.ProductExceptionPayload;
import okhttp3.Call;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PrepaidContractsApi {
    private ApiClient apiClient;

    public PrepaidContractsApi() {
        this(Environment.getGlobalEnv().getApiClient());
    }

    public PrepaidContractsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for mappingZvt
     * @param prepaidContractId Prepaid contract id (required)
     * @param body Prepaid transaction input properties
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public Call mappingZvtCall(String prepaidContractId, PrepaidZvtDTO body) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/Prepaid/Contracts/{prepaidContractId}/mappingZvt"
            .replaceAll("\\{" + "prepaidContractId" + "\\}", apiClient.escapeString(prepaidContractId.toString()));

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
    private Call mappingZvtValidateBeforeCall(String prepaidContractId, PrepaidZvtDTO body) throws ApiException {
        // verify the required parameter 'prepaidContractId' is set
        if (prepaidContractId == null) {
            throw new ApiException("Missing the required parameter 'prepaidContractId' when calling mappingZvt(Async)");
        }

        return mappingZvtCall(prepaidContractId, body);
    }

    /**
     * POST Prepaid/Contracts/me/mappingZvt
     * Gets prepaid item id from product id which is configured in prepaid contracts
     * @param prepaidContractId Prepaid contract id (required)
     * @param body Prepaid transaction input properties
     * @return PrepaidMappingZvt
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PrepaidMappingZvt mappingZvt(String prepaidContractId, PrepaidZvtDTO body) throws ApiException {
        ApiResponse<PrepaidMappingZvt> resp = mappingZvtWithHttpInfo(prepaidContractId, body);
        return resp.getData();
    }

    /**
     * POST Prepaid/Contracts/me/mappingZvt
     * Gets prepaid item id from product id which is configured in prepaid contracts
     * @param prepaidContractId Prepaid contract id (required)
     * @param body Prepaid transaction input properties
     * @return ApiResponse&lt;PrepaidMappingZvt&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PrepaidMappingZvt> mappingZvtWithHttpInfo(String prepaidContractId, PrepaidZvtDTO body) throws ApiException {
        Call call = mappingZvtValidateBeforeCall(prepaidContractId, body);
        Type localVarReturnType = new TypeToken<PrepaidMappingZvt>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * POST Prepaid/Contracts/me/mappingZvt (asynchronously)
     * Gets prepaid item id from product id which is configured in prepaid contracts
     * @param prepaidContractId Prepaid contract id (required)
     * @param body Prepaid transaction input properties
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call mappingZvtAsync(String prepaidContractId, PrepaidZvtDTO body, final ApiCallback<PrepaidMappingZvt> callback) throws ApiException {
        Call call = mappingZvtValidateBeforeCall(prepaidContractId, body);
        Type localVarReturnType = new TypeToken<PrepaidMappingZvt>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}

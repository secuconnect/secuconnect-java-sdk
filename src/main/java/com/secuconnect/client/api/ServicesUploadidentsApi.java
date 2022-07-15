package com.secuconnect.client.api;

import com.google.gson.reflect.TypeToken;
import com.secuconnect.client.*;
import com.secuconnect.client.model.ProductExceptionPayload;
import com.secuconnect.client.model.UploadidentsProductDTO;
import com.secuconnect.client.model.UploadidentsProductModel;
import okhttp3.Call;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ServicesUploadidentsApi {
    private ApiClient apiClient;

    public ServicesUploadidentsApi() {
        this(Environment.getGlobalEnv().getApiClient());
    }

    public ServicesUploadidentsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for addUploadidents
     * @param body Upload idents input properties
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public Call addUploadidentsCall(UploadidentsProductDTO body) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/Services/Uploadidents";

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
    private Call addUploadidentsValidateBeforeCall(UploadidentsProductDTO body) throws ApiException {

        return addUploadidentsCall(body);
    }

    /**
     * POST Services/Uploadidents
     * Create new upload ident
     * @param body Upload idents input properties
     * @return UploadidentsProductModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public UploadidentsProductModel addUploadidents(UploadidentsProductDTO body) throws ApiException {
        ApiResponse<UploadidentsProductModel> resp = addUploadidentsWithHttpInfo(body);
        return resp.getData();
    }

    /**
     * POST Services/Uploadidents
     * Create new upload ident
     * @param body Upload idents input properties
     * @return ApiResponse&lt;UploadidentsProductModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<UploadidentsProductModel> addUploadidentsWithHttpInfo(UploadidentsProductDTO body) throws ApiException {
        Call call = addUploadidentsValidateBeforeCall(body);
        Type localVarReturnType = new TypeToken<UploadidentsProductModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * POST Services/Uploadidents (asynchronously)
     * Create new upload ident
     * @param body Upload idents input properties
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call addUploadidentsAsync(UploadidentsProductDTO body, final ApiCallback<UploadidentsProductModel> callback) throws ApiException {
        Call call = addUploadidentsValidateBeforeCall(body);
        Type localVarReturnType = new TypeToken<UploadidentsProductModel>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}

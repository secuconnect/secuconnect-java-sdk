package com.secuconnect.client.api;

import com.google.gson.reflect.TypeToken;
import com.secuconnect.client.*;
import com.secuconnect.client.model.AvailableCountry;
import com.secuconnect.client.model.ProductExceptionPayload;
import okhttp3.Call;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PublicWebsiteApi {
    private ApiClient apiClient;

    public PublicWebsiteApi() {
        this(Environment.getGlobalEnv().getApiClient());
    }

    public PublicWebsiteApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for availableCountries
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public Call availableCountriesCall() throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/Public/Website/me/availableCountries";

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
    private Call availableCountriesValidateBeforeCall() throws ApiException {

        return availableCountriesCall();
    }

    /**
     * GET Public/Website/me/availableCountries
     * Get a list of available Countries
     * @return List&lt;AvailableCountry&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<AvailableCountry> availableCountries() throws ApiException {
        ApiResponse<List<AvailableCountry>> resp = availableCountriesWithHttpInfo();
        return resp.getData();
    }

    /**
     * GET Public/Website/me/availableCountries
     * Get a list of available Countries
     * @return ApiResponse&lt;List&lt;AvailableCountry&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<AvailableCountry>> availableCountriesWithHttpInfo() throws ApiException {
        Call call = availableCountriesValidateBeforeCall();
        Type localVarReturnType = new TypeToken<List<AvailableCountry>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * GET Public/Website/me/availableCountries (asynchronously)
     * Get a list of available Countries
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call availableCountriesAsync(final ApiCallback<List<AvailableCountry>> callback) throws ApiException {
        Call call = availableCountriesValidateBeforeCall();
        Type localVarReturnType = new TypeToken<List<AvailableCountry>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}

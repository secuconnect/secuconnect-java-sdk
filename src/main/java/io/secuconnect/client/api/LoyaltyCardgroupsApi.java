package io.secuconnect.client.api;

import io.secuconnect.client.ApiCallback;
import io.secuconnect.client.ApiClient;
import io.secuconnect.client.ApiException;
import io.secuconnect.client.ApiResponse;
import io.secuconnect.client.Configuration;
import io.secuconnect.client.Pair;
import io.secuconnect.client.ProgressRequestBody;
import io.secuconnect.client.ProgressResponseBody;
import com.google.gson.reflect.TypeToken;
import java.io.IOException;
import io.secuconnect.client.model.LoyaltyCardgroupsDTO;
import io.secuconnect.client.model.LoyaltyCardgroupsDTOCheckPasscodeEnabled;
import io.secuconnect.client.model.LoyaltyCardgroupsList;
import io.secuconnect.client.model.LoyaltyCardgroupsProductModel;
import io.secuconnect.client.model.ProductExceptionPayload;
import io.secuconnect.client.model.ResultBoolean;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LoyaltyCardgroupsApi {
    private ApiClient apiClient;

    public LoyaltyCardgroupsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public LoyaltyCardgroupsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for addCardGroup
     * @param body Loyalty card group properties
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call addCardGroupCall(LoyaltyCardgroupsDTO body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/Loyalty/Cardgroups";

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

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "oauth_token" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call addCardGroupValidateBeforeCall(LoyaltyCardgroupsDTO body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = addCardGroupCall(body, progressListener, progressRequestListener);
        return call;
    }

    /**
     * POST Loyalty/Cardgroups
     * Add loyalty card group
     * @param body Loyalty card group properties
     * @return LoyaltyCardgroupsProductModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public LoyaltyCardgroupsProductModel addCardGroup(LoyaltyCardgroupsDTO body) throws ApiException {
        ApiResponse<LoyaltyCardgroupsProductModel> resp = addCardGroupWithHttpInfo(body);
        return resp.getData();
    }

    /**
     * POST Loyalty/Cardgroups
     * Add loyalty card group
     * @param body Loyalty card group properties
     * @return ApiResponse&lt;LoyaltyCardgroupsProductModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<LoyaltyCardgroupsProductModel> addCardGroupWithHttpInfo(LoyaltyCardgroupsDTO body) throws ApiException {
        com.squareup.okhttp.Call call = addCardGroupValidateBeforeCall(body, null, null);
        Type localVarReturnType = new TypeToken<LoyaltyCardgroupsProductModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * POST Loyalty/Cardgroups (asynchronously)
     * Add loyalty card group
     * @param body Loyalty card group properties
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call addCardGroupAsync(LoyaltyCardgroupsDTO body, final ApiCallback<LoyaltyCardgroupsProductModel> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = addCardGroupValidateBeforeCall(body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<LoyaltyCardgroupsProductModel>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for checkPassCodeEnabled
     * @param loyaltyCardGroupId Loyalty card group id (required)
     * @param body Check passcode details
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call checkPassCodeEnabledCall(String loyaltyCardGroupId, LoyaltyCardgroupsDTOCheckPasscodeEnabled body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/Loyalty/Cardgroups/{loyaltyCardGroupId}/checkPasscodeEnabled"
            .replaceAll("\\{" + "loyaltyCardGroupId" + "\\}", apiClient.escapeString(loyaltyCardGroupId.toString()));

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

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "oauth_token" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call checkPassCodeEnabledValidateBeforeCall(String loyaltyCardGroupId, LoyaltyCardgroupsDTOCheckPasscodeEnabled body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'loyaltyCardGroupId' is set
        if (loyaltyCardGroupId == null) {
            throw new ApiException("Missing the required parameter 'loyaltyCardGroupId' when calling checkPassCodeEnabled(Async)");
        }
        
        com.squareup.okhttp.Call call = checkPassCodeEnabledCall(loyaltyCardGroupId, body, progressListener, progressRequestListener);
        return call;
    }

    /**
     * POST Loyalty/Cardgroups/{loyaltyCardGroupId}/checkPasscodeEnabled
     * Check whether passcode check is enabled
     * @param loyaltyCardGroupId Loyalty card group id (required)
     * @param body Check passcode details
     * @return ResultBoolean
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ResultBoolean checkPassCodeEnabled(String loyaltyCardGroupId, LoyaltyCardgroupsDTOCheckPasscodeEnabled body) throws ApiException {
        ApiResponse<ResultBoolean> resp = checkPassCodeEnabledWithHttpInfo(loyaltyCardGroupId, body);
        return resp.getData();
    }

    /**
     * POST Loyalty/Cardgroups/{loyaltyCardGroupId}/checkPasscodeEnabled
     * Check whether passcode check is enabled
     * @param loyaltyCardGroupId Loyalty card group id (required)
     * @param body Check passcode details
     * @return ApiResponse&lt;ResultBoolean&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ResultBoolean> checkPassCodeEnabledWithHttpInfo(String loyaltyCardGroupId, LoyaltyCardgroupsDTOCheckPasscodeEnabled body) throws ApiException {
        com.squareup.okhttp.Call call = checkPassCodeEnabledValidateBeforeCall(loyaltyCardGroupId, body, null, null);
        Type localVarReturnType = new TypeToken<ResultBoolean>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * POST Loyalty/Cardgroups/{loyaltyCardGroupId}/checkPasscodeEnabled (asynchronously)
     * Check whether passcode check is enabled
     * @param loyaltyCardGroupId Loyalty card group id (required)
     * @param body Check passcode details
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call checkPassCodeEnabledAsync(String loyaltyCardGroupId, LoyaltyCardgroupsDTOCheckPasscodeEnabled body, final ApiCallback<ResultBoolean> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = checkPassCodeEnabledValidateBeforeCall(loyaltyCardGroupId, body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ResultBoolean>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getAll
     * @param count The maximum number of items to return
     * @param offset The position within the whole result set to start returning items (zero-based)
     * @param fields List of fields to include in the result. Nested properties can be accessed with this notation: prop1.prop2  Example: prop3,prop1.prop2
     * @param q A query string to restrict the returned items to given conditions. The query string must consist of any combination of single expressions in the form property:condition.  *                   A condition may contain:  *                       - wildcard \&quot;*\&quot; for any number of characters  *                       - wildcard \&quot;?\&quot; for one character  *                       - ranges in the form [value TO value]  *  *                   Single expressions may combined by &#x27;AND&#x27;, &#x27;OR&#x27;, &#x27;NOT&#x27; operators and parenthesis &#x27;(&#x27;, &#x27;)&#x27; for grouping.  *                   Property names can be nested like \&quot;prop1.prop2\&quot;.  *                   Example: (NOT customer.name:meier*) AND (customer.age:[30 TO 40] OR customer.age:[50 TO 60])  *                   
     * @param sort String with comma separated pairs of field:order (e.g. contact.surname:asc,contact.comapnyname:desc). Result set will be sorted by included fields, in ascending &#x27;asc&#x27;, or descending &#x27;dsc&#x27; order.
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getAllCall(Integer count, Integer offset, String fields, String q, String sort, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Loyalty/Cardgroups";

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

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "oauth_token" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getAllValidateBeforeCall(Integer count, Integer offset, String fields, String q, String sort, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = getAllCall(count, offset, fields, q, sort, progressListener, progressRequestListener);
        return call;
    }

    /**
     * GET Loyalty/Cardgroups
     * Get a list of loyalty card groups
     * @param count The maximum number of items to return
     * @param offset The position within the whole result set to start returning items (zero-based)
     * @param fields List of fields to include in the result. Nested properties can be accessed with this notation: prop1.prop2  Example: prop3,prop1.prop2
     * @param q A query string to restrict the returned items to given conditions. The query string must consist of any combination of single expressions in the form property:condition.  *                   A condition may contain:  *                       - wildcard \&quot;*\&quot; for any number of characters  *                       - wildcard \&quot;?\&quot; for one character  *                       - ranges in the form [value TO value]  *  *                   Single expressions may combined by &#x27;AND&#x27;, &#x27;OR&#x27;, &#x27;NOT&#x27; operators and parenthesis &#x27;(&#x27;, &#x27;)&#x27; for grouping.  *                   Property names can be nested like \&quot;prop1.prop2\&quot;.  *                   Example: (NOT customer.name:meier*) AND (customer.age:[30 TO 40] OR customer.age:[50 TO 60])  *                   
     * @param sort String with comma separated pairs of field:order (e.g. contact.surname:asc,contact.comapnyname:desc). Result set will be sorted by included fields, in ascending &#x27;asc&#x27;, or descending &#x27;dsc&#x27; order.
     * @return LoyaltyCardgroupsList
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public LoyaltyCardgroupsList getAll(Integer count, Integer offset, String fields, String q, String sort) throws ApiException {
        ApiResponse<LoyaltyCardgroupsList> resp = getAllWithHttpInfo(count, offset, fields, q, sort);
        return resp.getData();
    }

    /**
     * GET Loyalty/Cardgroups
     * Get a list of loyalty card groups
     * @param count The maximum number of items to return
     * @param offset The position within the whole result set to start returning items (zero-based)
     * @param fields List of fields to include in the result. Nested properties can be accessed with this notation: prop1.prop2  Example: prop3,prop1.prop2
     * @param q A query string to restrict the returned items to given conditions. The query string must consist of any combination of single expressions in the form property:condition.  *                   A condition may contain:  *                       - wildcard \&quot;*\&quot; for any number of characters  *                       - wildcard \&quot;?\&quot; for one character  *                       - ranges in the form [value TO value]  *  *                   Single expressions may combined by &#x27;AND&#x27;, &#x27;OR&#x27;, &#x27;NOT&#x27; operators and parenthesis &#x27;(&#x27;, &#x27;)&#x27; for grouping.  *                   Property names can be nested like \&quot;prop1.prop2\&quot;.  *                   Example: (NOT customer.name:meier*) AND (customer.age:[30 TO 40] OR customer.age:[50 TO 60])  *                   
     * @param sort String with comma separated pairs of field:order (e.g. contact.surname:asc,contact.comapnyname:desc). Result set will be sorted by included fields, in ascending &#x27;asc&#x27;, or descending &#x27;dsc&#x27; order.
     * @return ApiResponse&lt;LoyaltyCardgroupsList&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<LoyaltyCardgroupsList> getAllWithHttpInfo(Integer count, Integer offset, String fields, String q, String sort) throws ApiException {
        com.squareup.okhttp.Call call = getAllValidateBeforeCall(count, offset, fields, q, sort, null, null);
        Type localVarReturnType = new TypeToken<LoyaltyCardgroupsList>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * GET Loyalty/Cardgroups (asynchronously)
     * Get a list of loyalty card groups
     * @param count The maximum number of items to return
     * @param offset The position within the whole result set to start returning items (zero-based)
     * @param fields List of fields to include in the result. Nested properties can be accessed with this notation: prop1.prop2  Example: prop3,prop1.prop2
     * @param q A query string to restrict the returned items to given conditions. The query string must consist of any combination of single expressions in the form property:condition.  *                   A condition may contain:  *                       - wildcard \&quot;*\&quot; for any number of characters  *                       - wildcard \&quot;?\&quot; for one character  *                       - ranges in the form [value TO value]  *  *                   Single expressions may combined by &#x27;AND&#x27;, &#x27;OR&#x27;, &#x27;NOT&#x27; operators and parenthesis &#x27;(&#x27;, &#x27;)&#x27; for grouping.  *                   Property names can be nested like \&quot;prop1.prop2\&quot;.  *                   Example: (NOT customer.name:meier*) AND (customer.age:[30 TO 40] OR customer.age:[50 TO 60])  *                   
     * @param sort String with comma separated pairs of field:order (e.g. contact.surname:asc,contact.comapnyname:desc). Result set will be sorted by included fields, in ascending &#x27;asc&#x27;, or descending &#x27;dsc&#x27; order.
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getAllAsync(Integer count, Integer offset, String fields, String q, String sort, final ApiCallback<LoyaltyCardgroupsList> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getAllValidateBeforeCall(count, offset, fields, q, sort, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<LoyaltyCardgroupsList>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getCardgroupsByMerchantId
     * @param generalMerchantId Search by provided id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getCardgroupsByMerchantIdCall(String generalMerchantId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Loyalty/Sales/{generalMerchantId}/CardGroupsByMerchantID"
            .replaceAll("\\{" + "generalMerchantId" + "\\}", apiClient.escapeString(generalMerchantId.toString()));

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

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "oauth_token" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getCardgroupsByMerchantIdValidateBeforeCall(String generalMerchantId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'generalMerchantId' is set
        if (generalMerchantId == null) {
            throw new ApiException("Missing the required parameter 'generalMerchantId' when calling getCardgroupsByMerchantId(Async)");
        }
        
        com.squareup.okhttp.Call call = getCardgroupsByMerchantIdCall(generalMerchantId, progressListener, progressRequestListener);
        return call;
    }

    /**
     * GET Loyalty/Sales/{generalMerchantId}/CardGroupsByMerchantID
     * Get cardgroups by merchant id
     * @param generalMerchantId Search by provided id (required)
     * @return List&lt;LoyaltyCardgroupsProductModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<LoyaltyCardgroupsProductModel> getCardgroupsByMerchantId(String generalMerchantId) throws ApiException {
        ApiResponse<List<LoyaltyCardgroupsProductModel>> resp = getCardgroupsByMerchantIdWithHttpInfo(generalMerchantId);
        return resp.getData();
    }

    /**
     * GET Loyalty/Sales/{generalMerchantId}/CardGroupsByMerchantID
     * Get cardgroups by merchant id
     * @param generalMerchantId Search by provided id (required)
     * @return ApiResponse&lt;List&lt;LoyaltyCardgroupsProductModel&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<LoyaltyCardgroupsProductModel>> getCardgroupsByMerchantIdWithHttpInfo(String generalMerchantId) throws ApiException {
        com.squareup.okhttp.Call call = getCardgroupsByMerchantIdValidateBeforeCall(generalMerchantId, null, null);
        Type localVarReturnType = new TypeToken<List<LoyaltyCardgroupsProductModel>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * GET Loyalty/Sales/{generalMerchantId}/CardGroupsByMerchantID (asynchronously)
     * Get cardgroups by merchant id
     * @param generalMerchantId Search by provided id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getCardgroupsByMerchantIdAsync(String generalMerchantId, final ApiCallback<List<LoyaltyCardgroupsProductModel>> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getCardgroupsByMerchantIdValidateBeforeCall(generalMerchantId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<LoyaltyCardgroupsProductModel>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getOne
     * @param loyaltyCardGroupId Search one by provided id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getOneCall(String loyaltyCardGroupId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Loyalty/Cardgroups/{loyaltyCardGroupId}"
            .replaceAll("\\{" + "loyaltyCardGroupId" + "\\}", apiClient.escapeString(loyaltyCardGroupId.toString()));

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

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "oauth_token" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getOneValidateBeforeCall(String loyaltyCardGroupId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'loyaltyCardGroupId' is set
        if (loyaltyCardGroupId == null) {
            throw new ApiException("Missing the required parameter 'loyaltyCardGroupId' when calling getOne(Async)");
        }
        
        com.squareup.okhttp.Call call = getOneCall(loyaltyCardGroupId, progressListener, progressRequestListener);
        return call;
    }

    /**
     * GET Loyalty/Cardgroups/{loyaltyCardGroupId}
     * Get loyalty card group for a specific id
     * @param loyaltyCardGroupId Search one by provided id (required)
     * @return LoyaltyCardgroupsProductModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public LoyaltyCardgroupsProductModel getOne(String loyaltyCardGroupId) throws ApiException {
        ApiResponse<LoyaltyCardgroupsProductModel> resp = getOneWithHttpInfo(loyaltyCardGroupId);
        return resp.getData();
    }

    /**
     * GET Loyalty/Cardgroups/{loyaltyCardGroupId}
     * Get loyalty card group for a specific id
     * @param loyaltyCardGroupId Search one by provided id (required)
     * @return ApiResponse&lt;LoyaltyCardgroupsProductModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<LoyaltyCardgroupsProductModel> getOneWithHttpInfo(String loyaltyCardGroupId) throws ApiException {
        com.squareup.okhttp.Call call = getOneValidateBeforeCall(loyaltyCardGroupId, null, null);
        Type localVarReturnType = new TypeToken<LoyaltyCardgroupsProductModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * GET Loyalty/Cardgroups/{loyaltyCardGroupId} (asynchronously)
     * Get loyalty card group for a specific id
     * @param loyaltyCardGroupId Search one by provided id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getOneAsync(String loyaltyCardGroupId, final ApiCallback<LoyaltyCardgroupsProductModel> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getOneValidateBeforeCall(loyaltyCardGroupId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<LoyaltyCardgroupsProductModel>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for updateCardGroup
     * @param loyaltyCardGroupId Loyalty card group id (required)
     * @param body Loyalty card group properties
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call updateCardGroupCall(String loyaltyCardGroupId, LoyaltyCardgroupsDTO body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/Loyalty/Cardgroups/{loyaltyCardGroupId}"
            .replaceAll("\\{" + "loyaltyCardGroupId" + "\\}", apiClient.escapeString(loyaltyCardGroupId.toString()));

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

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "oauth_token" };
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call updateCardGroupValidateBeforeCall(String loyaltyCardGroupId, LoyaltyCardgroupsDTO body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'loyaltyCardGroupId' is set
        if (loyaltyCardGroupId == null) {
            throw new ApiException("Missing the required parameter 'loyaltyCardGroupId' when calling updateCardGroup(Async)");
        }
        
        com.squareup.okhttp.Call call = updateCardGroupCall(loyaltyCardGroupId, body, progressListener, progressRequestListener);
        return call;
    }

    /**
     * PUT Loyalty/Cardgroups/{loyaltyCardGroupId}
     * Update loyalty card group
     * @param loyaltyCardGroupId Loyalty card group id (required)
     * @param body Loyalty card group properties
     * @return LoyaltyCardgroupsProductModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public LoyaltyCardgroupsProductModel updateCardGroup(String loyaltyCardGroupId, LoyaltyCardgroupsDTO body) throws ApiException {
        ApiResponse<LoyaltyCardgroupsProductModel> resp = updateCardGroupWithHttpInfo(loyaltyCardGroupId, body);
        return resp.getData();
    }

    /**
     * PUT Loyalty/Cardgroups/{loyaltyCardGroupId}
     * Update loyalty card group
     * @param loyaltyCardGroupId Loyalty card group id (required)
     * @param body Loyalty card group properties
     * @return ApiResponse&lt;LoyaltyCardgroupsProductModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<LoyaltyCardgroupsProductModel> updateCardGroupWithHttpInfo(String loyaltyCardGroupId, LoyaltyCardgroupsDTO body) throws ApiException {
        com.squareup.okhttp.Call call = updateCardGroupValidateBeforeCall(loyaltyCardGroupId, body, null, null);
        Type localVarReturnType = new TypeToken<LoyaltyCardgroupsProductModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * PUT Loyalty/Cardgroups/{loyaltyCardGroupId} (asynchronously)
     * Update loyalty card group
     * @param loyaltyCardGroupId Loyalty card group id (required)
     * @param body Loyalty card group properties
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call updateCardGroupAsync(String loyaltyCardGroupId, LoyaltyCardgroupsDTO body, final ApiCallback<LoyaltyCardgroupsProductModel> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = updateCardGroupValidateBeforeCall(loyaltyCardGroupId, body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<LoyaltyCardgroupsProductModel>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}

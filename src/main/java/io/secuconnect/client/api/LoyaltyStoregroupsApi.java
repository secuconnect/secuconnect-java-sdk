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
import io.secuconnect.client.model.LoyaltyStoregroupsDTO;
import io.secuconnect.client.model.LoyaltyStoregroupsList;
import io.secuconnect.client.model.LoyaltyStoregroupsProductModel;
import io.secuconnect.client.model.ProductExceptionPayload;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LoyaltyStoregroupsApi {
    private ApiClient apiClient;

    public LoyaltyStoregroupsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public LoyaltyStoregroupsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for addStoreGroup
     * @param body Loyalty store group properties
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call addStoreGroupCall(LoyaltyStoregroupsDTO body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/Loyalty/Storegroups";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

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
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call addStoreGroupValidateBeforeCall(LoyaltyStoregroupsDTO body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = addStoreGroupCall(body, progressListener, progressRequestListener);
        return call;
    }

    /**
     * POST Loyalty/Storegroups
     * Add new loyalty store group
     * @param body Loyalty store group properties
     * @return LoyaltyStoregroupsProductModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public LoyaltyStoregroupsProductModel addStoreGroup(LoyaltyStoregroupsDTO body) throws ApiException {
        ApiResponse<LoyaltyStoregroupsProductModel> resp = addStoreGroupWithHttpInfo(body);
        return resp.getData();
    }

    /**
     * POST Loyalty/Storegroups
     * Add new loyalty store group
     * @param body Loyalty store group properties
     * @return ApiResponse&lt;LoyaltyStoregroupsProductModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<LoyaltyStoregroupsProductModel> addStoreGroupWithHttpInfo(LoyaltyStoregroupsDTO body) throws ApiException {
        com.squareup.okhttp.Call call = addStoreGroupValidateBeforeCall(body, null, null);
        Type localVarReturnType = new TypeToken<LoyaltyStoregroupsProductModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * POST Loyalty/Storegroups (asynchronously)
     * Add new loyalty store group
     * @param body Loyalty store group properties
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call addStoreGroupAsync(LoyaltyStoregroupsDTO body, final ApiCallback<LoyaltyStoregroupsProductModel> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = addStoreGroupValidateBeforeCall(body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<LoyaltyStoregroupsProductModel>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getAll
     * @param count The number of items to return.
     * @param offset The position within the whole result set to start returning items (First element is at 0).
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
        String localVarPath = "/Loyalty/StoreGroups";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (count != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "count", count));
        if (offset != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "offset", offset));
        if (fields != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "fields", fields));
        if (q != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "q", q));
        if (sort != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort", sort));

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
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getAllValidateBeforeCall(Integer count, Integer offset, String fields, String q, String sort, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = getAllCall(count, offset, fields, q, sort, progressListener, progressRequestListener);
        return call;
    }

    /**
     * GET Loyalty/StoreGroups
     * Get a list of loyalty store groups
     * @param count The number of items to return.
     * @param offset The position within the whole result set to start returning items (First element is at 0).
     * @param fields List of fields to include in the result. Nested properties can be accessed with this notation: prop1.prop2  Example: prop3,prop1.prop2
     * @param q A query string to restrict the returned items to given conditions. The query string must consist of any combination of single expressions in the form property:condition.  *                   A condition may contain:  *                       - wildcard \&quot;*\&quot; for any number of characters  *                       - wildcard \&quot;?\&quot; for one character  *                       - ranges in the form [value TO value]  *  *                   Single expressions may combined by &#x27;AND&#x27;, &#x27;OR&#x27;, &#x27;NOT&#x27; operators and parenthesis &#x27;(&#x27;, &#x27;)&#x27; for grouping.  *                   Property names can be nested like \&quot;prop1.prop2\&quot;.  *                   Example: (NOT customer.name:meier*) AND (customer.age:[30 TO 40] OR customer.age:[50 TO 60])  *                   
     * @param sort String with comma separated pairs of field:order (e.g. contact.surname:asc,contact.comapnyname:desc). Result set will be sorted by included fields, in ascending &#x27;asc&#x27;, or descending &#x27;dsc&#x27; order.
     * @return LoyaltyStoregroupsList
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public LoyaltyStoregroupsList getAll(Integer count, Integer offset, String fields, String q, String sort) throws ApiException {
        ApiResponse<LoyaltyStoregroupsList> resp = getAllWithHttpInfo(count, offset, fields, q, sort);
        return resp.getData();
    }

    /**
     * GET Loyalty/StoreGroups
     * Get a list of loyalty store groups
     * @param count The number of items to return.
     * @param offset The position within the whole result set to start returning items (First element is at 0).
     * @param fields List of fields to include in the result. Nested properties can be accessed with this notation: prop1.prop2  Example: prop3,prop1.prop2
     * @param q A query string to restrict the returned items to given conditions. The query string must consist of any combination of single expressions in the form property:condition.  *                   A condition may contain:  *                       - wildcard \&quot;*\&quot; for any number of characters  *                       - wildcard \&quot;?\&quot; for one character  *                       - ranges in the form [value TO value]  *  *                   Single expressions may combined by &#x27;AND&#x27;, &#x27;OR&#x27;, &#x27;NOT&#x27; operators and parenthesis &#x27;(&#x27;, &#x27;)&#x27; for grouping.  *                   Property names can be nested like \&quot;prop1.prop2\&quot;.  *                   Example: (NOT customer.name:meier*) AND (customer.age:[30 TO 40] OR customer.age:[50 TO 60])  *                   
     * @param sort String with comma separated pairs of field:order (e.g. contact.surname:asc,contact.comapnyname:desc). Result set will be sorted by included fields, in ascending &#x27;asc&#x27;, or descending &#x27;dsc&#x27; order.
     * @return ApiResponse&lt;LoyaltyStoregroupsList&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<LoyaltyStoregroupsList> getAllWithHttpInfo(Integer count, Integer offset, String fields, String q, String sort) throws ApiException {
        com.squareup.okhttp.Call call = getAllValidateBeforeCall(count, offset, fields, q, sort, null, null);
        Type localVarReturnType = new TypeToken<LoyaltyStoregroupsList>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * GET Loyalty/StoreGroups (asynchronously)
     * Get a list of loyalty store groups
     * @param count The number of items to return.
     * @param offset The position within the whole result set to start returning items (First element is at 0).
     * @param fields List of fields to include in the result. Nested properties can be accessed with this notation: prop1.prop2  Example: prop3,prop1.prop2
     * @param q A query string to restrict the returned items to given conditions. The query string must consist of any combination of single expressions in the form property:condition.  *                   A condition may contain:  *                       - wildcard \&quot;*\&quot; for any number of characters  *                       - wildcard \&quot;?\&quot; for one character  *                       - ranges in the form [value TO value]  *  *                   Single expressions may combined by &#x27;AND&#x27;, &#x27;OR&#x27;, &#x27;NOT&#x27; operators and parenthesis &#x27;(&#x27;, &#x27;)&#x27; for grouping.  *                   Property names can be nested like \&quot;prop1.prop2\&quot;.  *                   Example: (NOT customer.name:meier*) AND (customer.age:[30 TO 40] OR customer.age:[50 TO 60])  *                   
     * @param sort String with comma separated pairs of field:order (e.g. contact.surname:asc,contact.comapnyname:desc). Result set will be sorted by included fields, in ascending &#x27;asc&#x27;, or descending &#x27;dsc&#x27; order.
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getAllAsync(Integer count, Integer offset, String fields, String q, String sort, final ApiCallback<LoyaltyStoregroupsList> callback) throws ApiException {

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
        Type localVarReturnType = new TypeToken<LoyaltyStoregroupsList>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getOne
     * @param loyaltyStoreGroupId loyalty store group id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getOneCall(String loyaltyStoreGroupId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Loyalty/StoreGroups/{loyaltyStoreGroupId}"
            .replaceAll("\\{" + "loyaltyStoreGroupId" + "\\}", apiClient.escapeString(loyaltyStoreGroupId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

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
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getOneValidateBeforeCall(String loyaltyStoreGroupId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'loyaltyStoreGroupId' is set
        if (loyaltyStoreGroupId == null) {
            throw new ApiException("Missing the required parameter 'loyaltyStoreGroupId' when calling getOne(Async)");
        }
        
        com.squareup.okhttp.Call call = getOneCall(loyaltyStoreGroupId, progressListener, progressRequestListener);
        return call;
    }

    /**
     * GET Loyalty/StoreGroups/{loyaltyStoreGroupId}
     * Get loyalty store group for a specific id
     * @param loyaltyStoreGroupId loyalty store group id (required)
     * @return LoyaltyStoregroupsProductModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public LoyaltyStoregroupsProductModel getOne(String loyaltyStoreGroupId) throws ApiException {
        ApiResponse<LoyaltyStoregroupsProductModel> resp = getOneWithHttpInfo(loyaltyStoreGroupId);
        return resp.getData();
    }

    /**
     * GET Loyalty/StoreGroups/{loyaltyStoreGroupId}
     * Get loyalty store group for a specific id
     * @param loyaltyStoreGroupId loyalty store group id (required)
     * @return ApiResponse&lt;LoyaltyStoregroupsProductModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<LoyaltyStoregroupsProductModel> getOneWithHttpInfo(String loyaltyStoreGroupId) throws ApiException {
        com.squareup.okhttp.Call call = getOneValidateBeforeCall(loyaltyStoreGroupId, null, null);
        Type localVarReturnType = new TypeToken<LoyaltyStoregroupsProductModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * GET Loyalty/StoreGroups/{loyaltyStoreGroupId} (asynchronously)
     * Get loyalty store group for a specific id
     * @param loyaltyStoreGroupId loyalty store group id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getOneAsync(String loyaltyStoreGroupId, final ApiCallback<LoyaltyStoregroupsProductModel> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getOneValidateBeforeCall(loyaltyStoreGroupId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<LoyaltyStoregroupsProductModel>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for removeStoreGroup
     * @param loyaltyStoreGroupId Loyalty store group id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call removeStoreGroupCall(String loyaltyStoreGroupId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Loyalty/StoreGroups/{loyaltyStoreGroupId}"
            .replaceAll("\\{" + "loyaltyStoreGroupId" + "\\}", apiClient.escapeString(loyaltyStoreGroupId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

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
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call removeStoreGroupValidateBeforeCall(String loyaltyStoreGroupId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'loyaltyStoreGroupId' is set
        if (loyaltyStoreGroupId == null) {
            throw new ApiException("Missing the required parameter 'loyaltyStoreGroupId' when calling removeStoreGroup(Async)");
        }
        
        com.squareup.okhttp.Call call = removeStoreGroupCall(loyaltyStoreGroupId, progressListener, progressRequestListener);
        return call;
    }

    /**
     * DELETE Loyalty/StoreGroups/{loyaltyStoreGroupId}
     * Remove loyalty store group
     * @param loyaltyStoreGroupId Loyalty store group id (required)
     * @return List&lt;LoyaltyStoregroupsProductModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<LoyaltyStoregroupsProductModel> removeStoreGroup(String loyaltyStoreGroupId) throws ApiException {
        ApiResponse<List<LoyaltyStoregroupsProductModel>> resp = removeStoreGroupWithHttpInfo(loyaltyStoreGroupId);
        return resp.getData();
    }

    /**
     * DELETE Loyalty/StoreGroups/{loyaltyStoreGroupId}
     * Remove loyalty store group
     * @param loyaltyStoreGroupId Loyalty store group id (required)
     * @return ApiResponse&lt;List&lt;LoyaltyStoregroupsProductModel&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<LoyaltyStoregroupsProductModel>> removeStoreGroupWithHttpInfo(String loyaltyStoreGroupId) throws ApiException {
        com.squareup.okhttp.Call call = removeStoreGroupValidateBeforeCall(loyaltyStoreGroupId, null, null);
        Type localVarReturnType = new TypeToken<List<LoyaltyStoregroupsProductModel>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * DELETE Loyalty/StoreGroups/{loyaltyStoreGroupId} (asynchronously)
     * Remove loyalty store group
     * @param loyaltyStoreGroupId Loyalty store group id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call removeStoreGroupAsync(String loyaltyStoreGroupId, final ApiCallback<List<LoyaltyStoregroupsProductModel>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = removeStoreGroupValidateBeforeCall(loyaltyStoreGroupId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<LoyaltyStoregroupsProductModel>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for updateStoreGroup
     * @param loyaltyStoreGroupId Loyalty store group id (required)
     * @param body Loyalty store group properties
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call updateStoreGroupCall(String loyaltyStoreGroupId, LoyaltyStoregroupsDTO body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/Loyalty/StoreGroups/{loyaltyStoreGroupId}"
            .replaceAll("\\{" + "loyaltyStoreGroupId" + "\\}", apiClient.escapeString(loyaltyStoreGroupId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

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
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call updateStoreGroupValidateBeforeCall(String loyaltyStoreGroupId, LoyaltyStoregroupsDTO body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'loyaltyStoreGroupId' is set
        if (loyaltyStoreGroupId == null) {
            throw new ApiException("Missing the required parameter 'loyaltyStoreGroupId' when calling updateStoreGroup(Async)");
        }
        
        com.squareup.okhttp.Call call = updateStoreGroupCall(loyaltyStoreGroupId, body, progressListener, progressRequestListener);
        return call;
    }

    /**
     * PUT Loyalty/StoreGroups/{loyaltyStoreGroupId}
     * Update loyalty store group
     * @param loyaltyStoreGroupId Loyalty store group id (required)
     * @param body Loyalty store group properties
     * @return LoyaltyStoregroupsProductModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public LoyaltyStoregroupsProductModel updateStoreGroup(String loyaltyStoreGroupId, LoyaltyStoregroupsDTO body) throws ApiException {
        ApiResponse<LoyaltyStoregroupsProductModel> resp = updateStoreGroupWithHttpInfo(loyaltyStoreGroupId, body);
        return resp.getData();
    }

    /**
     * PUT Loyalty/StoreGroups/{loyaltyStoreGroupId}
     * Update loyalty store group
     * @param loyaltyStoreGroupId Loyalty store group id (required)
     * @param body Loyalty store group properties
     * @return ApiResponse&lt;LoyaltyStoregroupsProductModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<LoyaltyStoregroupsProductModel> updateStoreGroupWithHttpInfo(String loyaltyStoreGroupId, LoyaltyStoregroupsDTO body) throws ApiException {
        com.squareup.okhttp.Call call = updateStoreGroupValidateBeforeCall(loyaltyStoreGroupId, body, null, null);
        Type localVarReturnType = new TypeToken<LoyaltyStoregroupsProductModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * PUT Loyalty/StoreGroups/{loyaltyStoreGroupId} (asynchronously)
     * Update loyalty store group
     * @param loyaltyStoreGroupId Loyalty store group id (required)
     * @param body Loyalty store group properties
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call updateStoreGroupAsync(String loyaltyStoreGroupId, LoyaltyStoregroupsDTO body, final ApiCallback<LoyaltyStoregroupsProductModel> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = updateStoreGroupValidateBeforeCall(loyaltyStoreGroupId, body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<LoyaltyStoregroupsProductModel>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}

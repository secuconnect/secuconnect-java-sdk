package com.secuconnect.client.api;

import com.secuconnect.client.ApiCallback;
import com.secuconnect.client.ApiClient;
import com.secuconnect.client.ApiException;
import com.secuconnect.client.ApiResponse;
import com.secuconnect.client.Configuration;
import com.secuconnect.client.Pair;
import com.secuconnect.client.ProgressRequestBody;
import com.secuconnect.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;

import com.secuconnect.client.model.CardPin;
import com.secuconnect.client.model.LoyaltyCardsList;
import com.secuconnect.client.model.LoyaltyCardsProductModel;
import com.secuconnect.client.model.ProductExceptionPayload;
import com.secuconnect.client.model.ResultBoolean;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LoyaltyCardsApi {
    private ApiClient apiClient;

    public LoyaltyCardsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public LoyaltyCardsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for loyaltyCardsassignUser
     * @param loyaltyCardId Loyalty card id (required)
     * @param generalAccountId General account id (required)
     * @param body Loyalty card pin for the specific card (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call loyaltyCardsassignUserCall(String loyaltyCardId, String generalAccountId, CardPin body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/Loyalty/Cards/{loyaltyCardId}/assignUser/{generalAccountId}"
            .replaceAll("\\{" + "loyaltyCardId" + "\\}", apiClient.escapeString(loyaltyCardId.toString()))
            .replaceAll("\\{" + "generalAccountId" + "\\}", apiClient.escapeString(generalAccountId.toString()));

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
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
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
    private com.squareup.okhttp.Call loyaltyCardsassignUserValidateBeforeCall(String loyaltyCardId, String generalAccountId, CardPin body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'loyaltyCardId' is set
        if (loyaltyCardId == null) {
            throw new ApiException("Missing the required parameter 'loyaltyCardId' when calling loyaltyCardsassignUser(Async)");
        }
        // verify the required parameter 'generalAccountId' is set
        if (generalAccountId == null) {
            throw new ApiException("Missing the required parameter 'generalAccountId' when calling loyaltyCardsassignUser(Async)");
        }
        
        com.squareup.okhttp.Call call = loyaltyCardsassignUserCall(loyaltyCardId, generalAccountId, body, progressListener, progressRequestListener);
        return call;
    }

    /**
     * POST Loyalty/Cards/{loyaltyCardId}/assignUser/{generalAccountId}
     * Assign loyalty card to specific user account
     * @param loyaltyCardId Loyalty card id (required)
     * @param generalAccountId General account id (required)
     * @param body Loyalty card pin for the specific card (optional)
     * @return ResultBoolean
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ResultBoolean loyaltyCardsassignUser(String loyaltyCardId, String generalAccountId, CardPin body) throws ApiException {
        ApiResponse<ResultBoolean> resp = loyaltyCardsassignUserWithHttpInfo(loyaltyCardId, generalAccountId, body);
        return resp.getData();
    }

    /**
     * POST Loyalty/Cards/{loyaltyCardId}/assignUser/{generalAccountId}
     * Assign loyalty card to specific user account
     * @param loyaltyCardId Loyalty card id (required)
     * @param generalAccountId General account id (required)
     * @param body Loyalty card pin for the specific card (optional)
     * @return ApiResponse&lt;ResultBoolean&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ResultBoolean> loyaltyCardsassignUserWithHttpInfo(String loyaltyCardId, String generalAccountId, CardPin body) throws ApiException {
        com.squareup.okhttp.Call call = loyaltyCardsassignUserValidateBeforeCall(loyaltyCardId, generalAccountId, body, null, null);
        Type localVarReturnType = new TypeToken<ResultBoolean>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * POST Loyalty/Cards/{loyaltyCardId}/assignUser/{generalAccountId} (asynchronously)
     * Assign loyalty card to specific user account
     * @param loyaltyCardId Loyalty card id (required)
     * @param generalAccountId General account id (required)
     * @param body Loyalty card pin for the specific card (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call loyaltyCardsassignUserAsync(String loyaltyCardId, String generalAccountId, CardPin body, final ApiCallback<ResultBoolean> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = loyaltyCardsassignUserValidateBeforeCall(loyaltyCardId, generalAccountId, body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ResultBoolean>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for loyaltyCardsgetAll
     * @param count The number of items to return. (optional)
     * @param offset The position within the whole result set to start returning items (First element is at 0). (optional)
     * @param fields List of fields to include in the result. Nested properties can be accessed with this notation: prop1.prop2  Example: prop3,prop1.prop2 (optional)
     * @param q A query string to restrict the returned items to given conditions. The query string must consist of any combination of single expressions in the form property:condition.  *                   A condition may contain:  *                       - wildcard \&quot;*\&quot; for any number of characters  *                       - wildcard \&quot;?\&quot; for one character  *                       - ranges in the form [value TO value]  *  *                   Single expressions may combined by &#x27;AND&#x27;, &#x27;OR&#x27;, &#x27;NOT&#x27; operators and parenthesis &#x27;(&#x27;, &#x27;)&#x27; for grouping.  *                   Property names can be nested like \&quot;prop1.prop2\&quot;.  *                   Example: (NOT customer.name:meier*) AND (customer.age:[30 TO 40] OR customer.age:[50 TO 60])  *                    (optional)
     * @param sort String with comma separated pairs of field:order (e.g. contact.surname:asc,contact.comapnyname:desc). Result set will be sorted by included fields, in ascending &#x27;asc&#x27;, or descending &#x27;dsc&#x27; order. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call loyaltyCardsgetAllCall(Integer count, Integer offset, String fields, String q, String sort, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Loyalty/Cards";

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
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
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
    private com.squareup.okhttp.Call loyaltyCardsgetAllValidateBeforeCall(Integer count, Integer offset, String fields, String q, String sort, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = loyaltyCardsgetAllCall(count, offset, fields, q, sort, progressListener, progressRequestListener);
        return call;
    }

    /**
     * GET Loyalty/Cards
     * Get a list of loyalty cards
     * @param count The number of items to return. (optional)
     * @param offset The position within the whole result set to start returning items (First element is at 0). (optional)
     * @param fields List of fields to include in the result. Nested properties can be accessed with this notation: prop1.prop2  Example: prop3,prop1.prop2 (optional)
     * @param q A query string to restrict the returned items to given conditions. The query string must consist of any combination of single expressions in the form property:condition.  *                   A condition may contain:  *                       - wildcard \&quot;*\&quot; for any number of characters  *                       - wildcard \&quot;?\&quot; for one character  *                       - ranges in the form [value TO value]  *  *                   Single expressions may combined by &#x27;AND&#x27;, &#x27;OR&#x27;, &#x27;NOT&#x27; operators and parenthesis &#x27;(&#x27;, &#x27;)&#x27; for grouping.  *                   Property names can be nested like \&quot;prop1.prop2\&quot;.  *                   Example: (NOT customer.name:meier*) AND (customer.age:[30 TO 40] OR customer.age:[50 TO 60])  *                    (optional)
     * @param sort String with comma separated pairs of field:order (e.g. contact.surname:asc,contact.comapnyname:desc). Result set will be sorted by included fields, in ascending &#x27;asc&#x27;, or descending &#x27;dsc&#x27; order. (optional)
     * @return LoyaltyCardsList
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public LoyaltyCardsList loyaltyCardsgetAll(Integer count, Integer offset, String fields, String q, String sort) throws ApiException {
        ApiResponse<LoyaltyCardsList> resp = loyaltyCardsgetAllWithHttpInfo(count, offset, fields, q, sort);
        return resp.getData();
    }

    /**
     * GET Loyalty/Cards
     * Get a list of loyalty cards
     * @param count The number of items to return. (optional)
     * @param offset The position within the whole result set to start returning items (First element is at 0). (optional)
     * @param fields List of fields to include in the result. Nested properties can be accessed with this notation: prop1.prop2  Example: prop3,prop1.prop2 (optional)
     * @param q A query string to restrict the returned items to given conditions. The query string must consist of any combination of single expressions in the form property:condition.  *                   A condition may contain:  *                       - wildcard \&quot;*\&quot; for any number of characters  *                       - wildcard \&quot;?\&quot; for one character  *                       - ranges in the form [value TO value]  *  *                   Single expressions may combined by &#x27;AND&#x27;, &#x27;OR&#x27;, &#x27;NOT&#x27; operators and parenthesis &#x27;(&#x27;, &#x27;)&#x27; for grouping.  *                   Property names can be nested like \&quot;prop1.prop2\&quot;.  *                   Example: (NOT customer.name:meier*) AND (customer.age:[30 TO 40] OR customer.age:[50 TO 60])  *                    (optional)
     * @param sort String with comma separated pairs of field:order (e.g. contact.surname:asc,contact.comapnyname:desc). Result set will be sorted by included fields, in ascending &#x27;asc&#x27;, or descending &#x27;dsc&#x27; order. (optional)
     * @return ApiResponse&lt;LoyaltyCardsList&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<LoyaltyCardsList> loyaltyCardsgetAllWithHttpInfo(Integer count, Integer offset, String fields, String q, String sort) throws ApiException {
        com.squareup.okhttp.Call call = loyaltyCardsgetAllValidateBeforeCall(count, offset, fields, q, sort, null, null);
        Type localVarReturnType = new TypeToken<LoyaltyCardsList>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * GET Loyalty/Cards (asynchronously)
     * Get a list of loyalty cards
     * @param count The number of items to return. (optional)
     * @param offset The position within the whole result set to start returning items (First element is at 0). (optional)
     * @param fields List of fields to include in the result. Nested properties can be accessed with this notation: prop1.prop2  Example: prop3,prop1.prop2 (optional)
     * @param q A query string to restrict the returned items to given conditions. The query string must consist of any combination of single expressions in the form property:condition.  *                   A condition may contain:  *                       - wildcard \&quot;*\&quot; for any number of characters  *                       - wildcard \&quot;?\&quot; for one character  *                       - ranges in the form [value TO value]  *  *                   Single expressions may combined by &#x27;AND&#x27;, &#x27;OR&#x27;, &#x27;NOT&#x27; operators and parenthesis &#x27;(&#x27;, &#x27;)&#x27; for grouping.  *                   Property names can be nested like \&quot;prop1.prop2\&quot;.  *                   Example: (NOT customer.name:meier*) AND (customer.age:[30 TO 40] OR customer.age:[50 TO 60])  *                    (optional)
     * @param sort String with comma separated pairs of field:order (e.g. contact.surname:asc,contact.comapnyname:desc). Result set will be sorted by included fields, in ascending &#x27;asc&#x27;, or descending &#x27;dsc&#x27; order. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call loyaltyCardsgetAllAsync(Integer count, Integer offset, String fields, String q, String sort, final ApiCallback<LoyaltyCardsList> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = loyaltyCardsgetAllValidateBeforeCall(count, offset, fields, q, sort, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<LoyaltyCardsList>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for loyaltyCardsgetOne
     * @param loyaltyCardId Search one loyalty card by provided id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call loyaltyCardsgetOneCall(String loyaltyCardId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Loyalty/Cards/{loyaltyCardId}"
            .replaceAll("\\{" + "loyaltyCardId" + "\\}", apiClient.escapeString(loyaltyCardId.toString()));

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
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
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
    private com.squareup.okhttp.Call loyaltyCardsgetOneValidateBeforeCall(String loyaltyCardId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'loyaltyCardId' is set
        if (loyaltyCardId == null) {
            throw new ApiException("Missing the required parameter 'loyaltyCardId' when calling loyaltyCardsgetOne(Async)");
        }
        
        com.squareup.okhttp.Call call = loyaltyCardsgetOneCall(loyaltyCardId, progressListener, progressRequestListener);
        return call;
    }

    /**
     * GET Loyalty/Cards/{loyaltyCardId}
     * Get loyalty card for a specific id
     * @param loyaltyCardId Search one loyalty card by provided id (required)
     * @return LoyaltyCardsProductModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public LoyaltyCardsProductModel loyaltyCardsgetOne(String loyaltyCardId) throws ApiException {
        ApiResponse<LoyaltyCardsProductModel> resp = loyaltyCardsgetOneWithHttpInfo(loyaltyCardId);
        return resp.getData();
    }

    /**
     * GET Loyalty/Cards/{loyaltyCardId}
     * Get loyalty card for a specific id
     * @param loyaltyCardId Search one loyalty card by provided id (required)
     * @return ApiResponse&lt;LoyaltyCardsProductModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<LoyaltyCardsProductModel> loyaltyCardsgetOneWithHttpInfo(String loyaltyCardId) throws ApiException {
        com.squareup.okhttp.Call call = loyaltyCardsgetOneValidateBeforeCall(loyaltyCardId, null, null);
        Type localVarReturnType = new TypeToken<LoyaltyCardsProductModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * GET Loyalty/Cards/{loyaltyCardId} (asynchronously)
     * Get loyalty card for a specific id
     * @param loyaltyCardId Search one loyalty card by provided id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call loyaltyCardsgetOneAsync(String loyaltyCardId, final ApiCallback<LoyaltyCardsProductModel> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = loyaltyCardsgetOneValidateBeforeCall(loyaltyCardId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<LoyaltyCardsProductModel>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for loyaltyCardsremoveAssignedUser
     * @param loyaltyCardId Loyalty card id (required)
     * @param generalAccountId General account id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call loyaltyCardsremoveAssignedUserCall(String loyaltyCardId, String generalAccountId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Loyalty/Cards/{loyaltyCardId}/assignUser/{generalAccountId}"
            .replaceAll("\\{" + "loyaltyCardId" + "\\}", apiClient.escapeString(loyaltyCardId.toString()))
            .replaceAll("\\{" + "generalAccountId" + "\\}", apiClient.escapeString(generalAccountId.toString()));

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
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "oauth_token" };
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call loyaltyCardsremoveAssignedUserValidateBeforeCall(String loyaltyCardId, String generalAccountId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'loyaltyCardId' is set
        if (loyaltyCardId == null) {
            throw new ApiException("Missing the required parameter 'loyaltyCardId' when calling loyaltyCardsremoveAssignedUser(Async)");
        }
        // verify the required parameter 'generalAccountId' is set
        if (generalAccountId == null) {
            throw new ApiException("Missing the required parameter 'generalAccountId' when calling loyaltyCardsremoveAssignedUser(Async)");
        }
        
        com.squareup.okhttp.Call call = loyaltyCardsremoveAssignedUserCall(loyaltyCardId, generalAccountId, progressListener, progressRequestListener);
        return call;
    }

    /**
     * DELETE Loyalty/Cards/{loyaltyCardId}/assignUser/{generalAccountId}
     * Remove assigned loyalty card from specific user account
     * @param loyaltyCardId Loyalty card id (required)
     * @param generalAccountId General account id (required)
     * @return ResultBoolean
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ResultBoolean loyaltyCardsremoveAssignedUser(String loyaltyCardId, String generalAccountId) throws ApiException {
        ApiResponse<ResultBoolean> resp = loyaltyCardsremoveAssignedUserWithHttpInfo(loyaltyCardId, generalAccountId);
        return resp.getData();
    }

    /**
     * DELETE Loyalty/Cards/{loyaltyCardId}/assignUser/{generalAccountId}
     * Remove assigned loyalty card from specific user account
     * @param loyaltyCardId Loyalty card id (required)
     * @param generalAccountId General account id (required)
     * @return ApiResponse&lt;ResultBoolean&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ResultBoolean> loyaltyCardsremoveAssignedUserWithHttpInfo(String loyaltyCardId, String generalAccountId) throws ApiException {
        com.squareup.okhttp.Call call = loyaltyCardsremoveAssignedUserValidateBeforeCall(loyaltyCardId, generalAccountId, null, null);
        Type localVarReturnType = new TypeToken<ResultBoolean>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * DELETE Loyalty/Cards/{loyaltyCardId}/assignUser/{generalAccountId} (asynchronously)
     * Remove assigned loyalty card from specific user account
     * @param loyaltyCardId Loyalty card id (required)
     * @param generalAccountId General account id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call loyaltyCardsremoveAssignedUserAsync(String loyaltyCardId, String generalAccountId, final ApiCallback<ResultBoolean> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = loyaltyCardsremoveAssignedUserValidateBeforeCall(loyaltyCardId, generalAccountId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ResultBoolean>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
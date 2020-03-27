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

import com.secuconnect.client.model.ProductExceptionPayload;
import com.secuconnect.client.model.SmartRoutingPriority;
import com.secuconnect.client.model.SmartRoutingsDTO;
import com.secuconnect.client.model.SmartRoutingsList;
import com.secuconnect.client.model.SmartRoutingsProductModel;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SmartRoutingsApi {
    private ApiClient apiClient;

    public SmartRoutingsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public SmartRoutingsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for smartRoutingsaddRouting
     * @param body Smart routing properties (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call smartRoutingsaddRoutingCall(SmartRoutingsDTO body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/Smart/Routings";

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
    private com.squareup.okhttp.Call smartRoutingsaddRoutingValidateBeforeCall(SmartRoutingsDTO body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = smartRoutingsaddRoutingCall(body, progressListener, progressRequestListener);
        return call;
    }

    /**
     * POST Smart/Routings
     * Create new smart routing
     * @param body Smart routing properties (optional)
     * @return SmartRoutingsProductModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SmartRoutingsProductModel smartRoutingsaddRouting(SmartRoutingsDTO body) throws ApiException {
        ApiResponse<SmartRoutingsProductModel> resp = smartRoutingsaddRoutingWithHttpInfo(body);
        return resp.getData();
    }

    /**
     * POST Smart/Routings
     * Create new smart routing
     * @param body Smart routing properties (optional)
     * @return ApiResponse&lt;SmartRoutingsProductModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SmartRoutingsProductModel> smartRoutingsaddRoutingWithHttpInfo(SmartRoutingsDTO body) throws ApiException {
        com.squareup.okhttp.Call call = smartRoutingsaddRoutingValidateBeforeCall(body, null, null);
        Type localVarReturnType = new TypeToken<SmartRoutingsProductModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * POST Smart/Routings (asynchronously)
     * Create new smart routing
     * @param body Smart routing properties (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call smartRoutingsaddRoutingAsync(SmartRoutingsDTO body, final ApiCallback<SmartRoutingsProductModel> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = smartRoutingsaddRoutingValidateBeforeCall(body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<SmartRoutingsProductModel>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for smartRoutingsassignDeviceToRouting
     * @param smartRoutingId Smart routing id (required)
     * @param smartDeviceId Smart device id (required)
     * @param body Smart routing assignment properties (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call smartRoutingsassignDeviceToRoutingCall(String smartRoutingId, String smartDeviceId, SmartRoutingPriority body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/Smart/Routings/{smartRoutingId}/assign/{smartDeviceId}"
            .replaceAll("\\{" + "smartRoutingId" + "\\}", apiClient.escapeString(smartRoutingId.toString()))
            .replaceAll("\\{" + "smartDeviceId" + "\\}", apiClient.escapeString(smartDeviceId.toString()));

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
    private com.squareup.okhttp.Call smartRoutingsassignDeviceToRoutingValidateBeforeCall(String smartRoutingId, String smartDeviceId, SmartRoutingPriority body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'smartRoutingId' is set
        if (smartRoutingId == null) {
            throw new ApiException("Missing the required parameter 'smartRoutingId' when calling smartRoutingsassignDeviceToRouting(Async)");
        }
        // verify the required parameter 'smartDeviceId' is set
        if (smartDeviceId == null) {
            throw new ApiException("Missing the required parameter 'smartDeviceId' when calling smartRoutingsassignDeviceToRouting(Async)");
        }
        
        com.squareup.okhttp.Call call = smartRoutingsassignDeviceToRoutingCall(smartRoutingId, smartDeviceId, body, progressListener, progressRequestListener);
        return call;
    }

    /**
     * POST Smart/Routings/{smartRoutingId}/assign/{smartDeviceId}
     * Assign the specific smart device to the specific smart routing
     * @param smartRoutingId Smart routing id (required)
     * @param smartDeviceId Smart device id (required)
     * @param body Smart routing assignment properties (optional)
     * @return SmartRoutingsProductModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SmartRoutingsProductModel smartRoutingsassignDeviceToRouting(String smartRoutingId, String smartDeviceId, SmartRoutingPriority body) throws ApiException {
        ApiResponse<SmartRoutingsProductModel> resp = smartRoutingsassignDeviceToRoutingWithHttpInfo(smartRoutingId, smartDeviceId, body);
        return resp.getData();
    }

    /**
     * POST Smart/Routings/{smartRoutingId}/assign/{smartDeviceId}
     * Assign the specific smart device to the specific smart routing
     * @param smartRoutingId Smart routing id (required)
     * @param smartDeviceId Smart device id (required)
     * @param body Smart routing assignment properties (optional)
     * @return ApiResponse&lt;SmartRoutingsProductModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SmartRoutingsProductModel> smartRoutingsassignDeviceToRoutingWithHttpInfo(String smartRoutingId, String smartDeviceId, SmartRoutingPriority body) throws ApiException {
        com.squareup.okhttp.Call call = smartRoutingsassignDeviceToRoutingValidateBeforeCall(smartRoutingId, smartDeviceId, body, null, null);
        Type localVarReturnType = new TypeToken<SmartRoutingsProductModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * POST Smart/Routings/{smartRoutingId}/assign/{smartDeviceId} (asynchronously)
     * Assign the specific smart device to the specific smart routing
     * @param smartRoutingId Smart routing id (required)
     * @param smartDeviceId Smart device id (required)
     * @param body Smart routing assignment properties (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call smartRoutingsassignDeviceToRoutingAsync(String smartRoutingId, String smartDeviceId, SmartRoutingPriority body, final ApiCallback<SmartRoutingsProductModel> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = smartRoutingsassignDeviceToRoutingValidateBeforeCall(smartRoutingId, smartDeviceId, body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<SmartRoutingsProductModel>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for smartRoutingsgetAll
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
    public com.squareup.okhttp.Call smartRoutingsgetAllCall(Integer count, Integer offset, String fields, String q, String sort, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Smart/Routings";

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
    private com.squareup.okhttp.Call smartRoutingsgetAllValidateBeforeCall(Integer count, Integer offset, String fields, String q, String sort, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = smartRoutingsgetAllCall(count, offset, fields, q, sort, progressListener, progressRequestListener);
        return call;
    }

    /**
     * GET Smart/Routings
     * Get a list of smart routings
     * @param count The number of items to return. (optional)
     * @param offset The position within the whole result set to start returning items (First element is at 0). (optional)
     * @param fields List of fields to include in the result. Nested properties can be accessed with this notation: prop1.prop2  Example: prop3,prop1.prop2 (optional)
     * @param q A query string to restrict the returned items to given conditions. The query string must consist of any combination of single expressions in the form property:condition.  *                   A condition may contain:  *                       - wildcard \&quot;*\&quot; for any number of characters  *                       - wildcard \&quot;?\&quot; for one character  *                       - ranges in the form [value TO value]  *  *                   Single expressions may combined by &#x27;AND&#x27;, &#x27;OR&#x27;, &#x27;NOT&#x27; operators and parenthesis &#x27;(&#x27;, &#x27;)&#x27; for grouping.  *                   Property names can be nested like \&quot;prop1.prop2\&quot;.  *                   Example: (NOT customer.name:meier*) AND (customer.age:[30 TO 40] OR customer.age:[50 TO 60])  *                    (optional)
     * @param sort String with comma separated pairs of field:order (e.g. contact.surname:asc,contact.comapnyname:desc). Result set will be sorted by included fields, in ascending &#x27;asc&#x27;, or descending &#x27;dsc&#x27; order. (optional)
     * @return SmartRoutingsList
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SmartRoutingsList smartRoutingsgetAll(Integer count, Integer offset, String fields, String q, String sort) throws ApiException {
        ApiResponse<SmartRoutingsList> resp = smartRoutingsgetAllWithHttpInfo(count, offset, fields, q, sort);
        return resp.getData();
    }

    /**
     * GET Smart/Routings
     * Get a list of smart routings
     * @param count The number of items to return. (optional)
     * @param offset The position within the whole result set to start returning items (First element is at 0). (optional)
     * @param fields List of fields to include in the result. Nested properties can be accessed with this notation: prop1.prop2  Example: prop3,prop1.prop2 (optional)
     * @param q A query string to restrict the returned items to given conditions. The query string must consist of any combination of single expressions in the form property:condition.  *                   A condition may contain:  *                       - wildcard \&quot;*\&quot; for any number of characters  *                       - wildcard \&quot;?\&quot; for one character  *                       - ranges in the form [value TO value]  *  *                   Single expressions may combined by &#x27;AND&#x27;, &#x27;OR&#x27;, &#x27;NOT&#x27; operators and parenthesis &#x27;(&#x27;, &#x27;)&#x27; for grouping.  *                   Property names can be nested like \&quot;prop1.prop2\&quot;.  *                   Example: (NOT customer.name:meier*) AND (customer.age:[30 TO 40] OR customer.age:[50 TO 60])  *                    (optional)
     * @param sort String with comma separated pairs of field:order (e.g. contact.surname:asc,contact.comapnyname:desc). Result set will be sorted by included fields, in ascending &#x27;asc&#x27;, or descending &#x27;dsc&#x27; order. (optional)
     * @return ApiResponse&lt;SmartRoutingsList&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SmartRoutingsList> smartRoutingsgetAllWithHttpInfo(Integer count, Integer offset, String fields, String q, String sort) throws ApiException {
        com.squareup.okhttp.Call call = smartRoutingsgetAllValidateBeforeCall(count, offset, fields, q, sort, null, null);
        Type localVarReturnType = new TypeToken<SmartRoutingsList>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * GET Smart/Routings (asynchronously)
     * Get a list of smart routings
     * @param count The number of items to return. (optional)
     * @param offset The position within the whole result set to start returning items (First element is at 0). (optional)
     * @param fields List of fields to include in the result. Nested properties can be accessed with this notation: prop1.prop2  Example: prop3,prop1.prop2 (optional)
     * @param q A query string to restrict the returned items to given conditions. The query string must consist of any combination of single expressions in the form property:condition.  *                   A condition may contain:  *                       - wildcard \&quot;*\&quot; for any number of characters  *                       - wildcard \&quot;?\&quot; for one character  *                       - ranges in the form [value TO value]  *  *                   Single expressions may combined by &#x27;AND&#x27;, &#x27;OR&#x27;, &#x27;NOT&#x27; operators and parenthesis &#x27;(&#x27;, &#x27;)&#x27; for grouping.  *                   Property names can be nested like \&quot;prop1.prop2\&quot;.  *                   Example: (NOT customer.name:meier*) AND (customer.age:[30 TO 40] OR customer.age:[50 TO 60])  *                    (optional)
     * @param sort String with comma separated pairs of field:order (e.g. contact.surname:asc,contact.comapnyname:desc). Result set will be sorted by included fields, in ascending &#x27;asc&#x27;, or descending &#x27;dsc&#x27; order. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call smartRoutingsgetAllAsync(Integer count, Integer offset, String fields, String q, String sort, final ApiCallback<SmartRoutingsList> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = smartRoutingsgetAllValidateBeforeCall(count, offset, fields, q, sort, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<SmartRoutingsList>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for smartRoutingsgetOne
     * @param smartRoutingId Smart routing id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call smartRoutingsgetOneCall(String smartRoutingId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Smart/Routings/{smartRoutingId}"
            .replaceAll("\\{" + "smartRoutingId" + "\\}", apiClient.escapeString(smartRoutingId.toString()));

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
    private com.squareup.okhttp.Call smartRoutingsgetOneValidateBeforeCall(String smartRoutingId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'smartRoutingId' is set
        if (smartRoutingId == null) {
            throw new ApiException("Missing the required parameter 'smartRoutingId' when calling smartRoutingsgetOne(Async)");
        }
        
        com.squareup.okhttp.Call call = smartRoutingsgetOneCall(smartRoutingId, progressListener, progressRequestListener);
        return call;
    }

    /**
     * GET Smart/Routings/{smartRoutingId}
     * Get one smart routing for a specific id
     * @param smartRoutingId Smart routing id (required)
     * @return SmartRoutingsProductModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SmartRoutingsProductModel smartRoutingsgetOne(String smartRoutingId) throws ApiException {
        ApiResponse<SmartRoutingsProductModel> resp = smartRoutingsgetOneWithHttpInfo(smartRoutingId);
        return resp.getData();
    }

    /**
     * GET Smart/Routings/{smartRoutingId}
     * Get one smart routing for a specific id
     * @param smartRoutingId Smart routing id (required)
     * @return ApiResponse&lt;SmartRoutingsProductModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SmartRoutingsProductModel> smartRoutingsgetOneWithHttpInfo(String smartRoutingId) throws ApiException {
        com.squareup.okhttp.Call call = smartRoutingsgetOneValidateBeforeCall(smartRoutingId, null, null);
        Type localVarReturnType = new TypeToken<SmartRoutingsProductModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * GET Smart/Routings/{smartRoutingId} (asynchronously)
     * Get one smart routing for a specific id
     * @param smartRoutingId Smart routing id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call smartRoutingsgetOneAsync(String smartRoutingId, final ApiCallback<SmartRoutingsProductModel> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = smartRoutingsgetOneValidateBeforeCall(smartRoutingId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<SmartRoutingsProductModel>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for smartRoutingsremoveRouting
     * @param smartRoutingId Smart routing id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call smartRoutingsremoveRoutingCall(String smartRoutingId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Smart/Routings/{smartRoutingId}"
            .replaceAll("\\{" + "smartRoutingId" + "\\}", apiClient.escapeString(smartRoutingId.toString()));

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
    private com.squareup.okhttp.Call smartRoutingsremoveRoutingValidateBeforeCall(String smartRoutingId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'smartRoutingId' is set
        if (smartRoutingId == null) {
            throw new ApiException("Missing the required parameter 'smartRoutingId' when calling smartRoutingsremoveRouting(Async)");
        }
        
        com.squareup.okhttp.Call call = smartRoutingsremoveRoutingCall(smartRoutingId, progressListener, progressRequestListener);
        return call;
    }

    /**
     * DELETE Smart/Routings/{smartRoutingId}
     * Remove specific smart roting
     * @param smartRoutingId Smart routing id (required)
     * @return List&lt;SmartRoutingsProductModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<SmartRoutingsProductModel> smartRoutingsremoveRouting(String smartRoutingId) throws ApiException {
        ApiResponse<List<SmartRoutingsProductModel>> resp = smartRoutingsremoveRoutingWithHttpInfo(smartRoutingId);
        return resp.getData();
    }

    /**
     * DELETE Smart/Routings/{smartRoutingId}
     * Remove specific smart roting
     * @param smartRoutingId Smart routing id (required)
     * @return ApiResponse&lt;List&lt;SmartRoutingsProductModel&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<SmartRoutingsProductModel>> smartRoutingsremoveRoutingWithHttpInfo(String smartRoutingId) throws ApiException {
        com.squareup.okhttp.Call call = smartRoutingsremoveRoutingValidateBeforeCall(smartRoutingId, null, null);
        Type localVarReturnType = new TypeToken<List<SmartRoutingsProductModel>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * DELETE Smart/Routings/{smartRoutingId} (asynchronously)
     * Remove specific smart roting
     * @param smartRoutingId Smart routing id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call smartRoutingsremoveRoutingAsync(String smartRoutingId, final ApiCallback<List<SmartRoutingsProductModel>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = smartRoutingsremoveRoutingValidateBeforeCall(smartRoutingId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<SmartRoutingsProductModel>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for smartRoutingsremoveSmartRoutingAssignment
     * @param smartRoutingId Smart routing id (required)
     * @param smartDeviceId Smart device id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call smartRoutingsremoveSmartRoutingAssignmentCall(String smartRoutingId, String smartDeviceId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Smart/Routings/{smartRoutingId}/assign/{smartDeviceId}"
            .replaceAll("\\{" + "smartRoutingId" + "\\}", apiClient.escapeString(smartRoutingId.toString()))
            .replaceAll("\\{" + "smartDeviceId" + "\\}", apiClient.escapeString(smartDeviceId.toString()));

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
    private com.squareup.okhttp.Call smartRoutingsremoveSmartRoutingAssignmentValidateBeforeCall(String smartRoutingId, String smartDeviceId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'smartRoutingId' is set
        if (smartRoutingId == null) {
            throw new ApiException("Missing the required parameter 'smartRoutingId' when calling smartRoutingsremoveSmartRoutingAssignment(Async)");
        }
        // verify the required parameter 'smartDeviceId' is set
        if (smartDeviceId == null) {
            throw new ApiException("Missing the required parameter 'smartDeviceId' when calling smartRoutingsremoveSmartRoutingAssignment(Async)");
        }
        
        com.squareup.okhttp.Call call = smartRoutingsremoveSmartRoutingAssignmentCall(smartRoutingId, smartDeviceId, progressListener, progressRequestListener);
        return call;
    }

    /**
     * DELETE Smart/Routings/{smartRoutingId}/assign/{smartDeviceId}
     * Remove smart routing assignment
     * @param smartRoutingId Smart routing id (required)
     * @param smartDeviceId Smart device id (required)
     * @return SmartRoutingsProductModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SmartRoutingsProductModel smartRoutingsremoveSmartRoutingAssignment(String smartRoutingId, String smartDeviceId) throws ApiException {
        ApiResponse<SmartRoutingsProductModel> resp = smartRoutingsremoveSmartRoutingAssignmentWithHttpInfo(smartRoutingId, smartDeviceId);
        return resp.getData();
    }

    /**
     * DELETE Smart/Routings/{smartRoutingId}/assign/{smartDeviceId}
     * Remove smart routing assignment
     * @param smartRoutingId Smart routing id (required)
     * @param smartDeviceId Smart device id (required)
     * @return ApiResponse&lt;SmartRoutingsProductModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SmartRoutingsProductModel> smartRoutingsremoveSmartRoutingAssignmentWithHttpInfo(String smartRoutingId, String smartDeviceId) throws ApiException {
        com.squareup.okhttp.Call call = smartRoutingsremoveSmartRoutingAssignmentValidateBeforeCall(smartRoutingId, smartDeviceId, null, null);
        Type localVarReturnType = new TypeToken<SmartRoutingsProductModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * DELETE Smart/Routings/{smartRoutingId}/assign/{smartDeviceId} (asynchronously)
     * Remove smart routing assignment
     * @param smartRoutingId Smart routing id (required)
     * @param smartDeviceId Smart device id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call smartRoutingsremoveSmartRoutingAssignmentAsync(String smartRoutingId, String smartDeviceId, final ApiCallback<SmartRoutingsProductModel> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = smartRoutingsremoveSmartRoutingAssignmentValidateBeforeCall(smartRoutingId, smartDeviceId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<SmartRoutingsProductModel>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for smartRoutingsupdateRouting
     * @param smartRoutingId Smart routing id (required)
     * @param body Smart routing properties (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call smartRoutingsupdateRoutingCall(String smartRoutingId, SmartRoutingsDTO body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/Smart/Routings/{smartRoutingId}"
            .replaceAll("\\{" + "smartRoutingId" + "\\}", apiClient.escapeString(smartRoutingId.toString()));

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
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call smartRoutingsupdateRoutingValidateBeforeCall(String smartRoutingId, SmartRoutingsDTO body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'smartRoutingId' is set
        if (smartRoutingId == null) {
            throw new ApiException("Missing the required parameter 'smartRoutingId' when calling smartRoutingsupdateRouting(Async)");
        }
        
        com.squareup.okhttp.Call call = smartRoutingsupdateRoutingCall(smartRoutingId, body, progressListener, progressRequestListener);
        return call;
    }

    /**
     * PUT Smart/Routings/{smartRoutingId}
     * Update specific smart routing
     * @param smartRoutingId Smart routing id (required)
     * @param body Smart routing properties (optional)
     * @return SmartRoutingsProductModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SmartRoutingsProductModel smartRoutingsupdateRouting(String smartRoutingId, SmartRoutingsDTO body) throws ApiException {
        ApiResponse<SmartRoutingsProductModel> resp = smartRoutingsupdateRoutingWithHttpInfo(smartRoutingId, body);
        return resp.getData();
    }

    /**
     * PUT Smart/Routings/{smartRoutingId}
     * Update specific smart routing
     * @param smartRoutingId Smart routing id (required)
     * @param body Smart routing properties (optional)
     * @return ApiResponse&lt;SmartRoutingsProductModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SmartRoutingsProductModel> smartRoutingsupdateRoutingWithHttpInfo(String smartRoutingId, SmartRoutingsDTO body) throws ApiException {
        com.squareup.okhttp.Call call = smartRoutingsupdateRoutingValidateBeforeCall(smartRoutingId, body, null, null);
        Type localVarReturnType = new TypeToken<SmartRoutingsProductModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * PUT Smart/Routings/{smartRoutingId} (asynchronously)
     * Update specific smart routing
     * @param smartRoutingId Smart routing id (required)
     * @param body Smart routing properties (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call smartRoutingsupdateRoutingAsync(String smartRoutingId, SmartRoutingsDTO body, final ApiCallback<SmartRoutingsProductModel> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = smartRoutingsupdateRoutingValidateBeforeCall(smartRoutingId, body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<SmartRoutingsProductModel>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}

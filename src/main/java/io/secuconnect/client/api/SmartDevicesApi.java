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
import io.secuconnect.client.model.ProductExceptionPayload;
import io.secuconnect.client.model.SmartDeviceUserPin;
import io.secuconnect.client.model.SmartDevicesDTO;
import io.secuconnect.client.model.SmartDevicesDTOPrepaidTid;
import io.secuconnect.client.model.SmartDevicesDTOSecubaseConfig;
import io.secuconnect.client.model.SmartDevicesList;
import io.secuconnect.client.model.SmartDevicesProductModel;
import io.secuconnect.client.model.SmartDevicesSecubaseConfig;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SmartDevicesApi {
    private ApiClient apiClient;

    public SmartDevicesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public SmartDevicesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for addDevice
     * @param body Smart device properties
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call addDeviceCall(SmartDevicesDTO body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/Smart/Devices";

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
    private com.squareup.okhttp.Call addDeviceValidateBeforeCall(SmartDevicesDTO body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = addDeviceCall(body, progressListener, progressRequestListener);
        return call;
    }

    /**
     * POST Smart/Devices
     * Create new smart device
     * @param body Smart device properties
     * @return SmartDevicesProductModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SmartDevicesProductModel addDevice(SmartDevicesDTO body) throws ApiException {
        ApiResponse<SmartDevicesProductModel> resp = addDeviceWithHttpInfo(body);
        return resp.getData();
    }

    /**
     * POST Smart/Devices
     * Create new smart device
     * @param body Smart device properties
     * @return ApiResponse&lt;SmartDevicesProductModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SmartDevicesProductModel> addDeviceWithHttpInfo(SmartDevicesDTO body) throws ApiException {
        com.squareup.okhttp.Call call = addDeviceValidateBeforeCall(body, null, null);
        Type localVarReturnType = new TypeToken<SmartDevicesProductModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * POST Smart/Devices (asynchronously)
     * Create new smart device
     * @param body Smart device properties
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call addDeviceAsync(SmartDevicesDTO body, final ApiCallback<SmartDevicesProductModel> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = addDeviceValidateBeforeCall(body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<SmartDevicesProductModel>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for createPrepaidTid
     * @param smartDeviceId Smart device id (required)
     * @param body Prepaid tid properties
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call createPrepaidTidCall(String smartDeviceId, SmartDevicesDTOPrepaidTid body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/Smart/Devices/{smartDeviceId}/createPrepaidTid"
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
    private com.squareup.okhttp.Call createPrepaidTidValidateBeforeCall(String smartDeviceId, SmartDevicesDTOPrepaidTid body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'smartDeviceId' is set
        if (smartDeviceId == null) {
            throw new ApiException("Missing the required parameter 'smartDeviceId' when calling createPrepaidTid(Async)");
        }
        
        com.squareup.okhttp.Call call = createPrepaidTidCall(smartDeviceId, body, progressListener, progressRequestListener);
        return call;
    }

    /**
     * POST Smart/Devices/{smartDeviceId}/createPrepaidTid
     * Create prepaid tid
     * @param smartDeviceId Smart device id (required)
     * @param body Prepaid tid properties
     * @return SmartDevicesProductModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SmartDevicesProductModel createPrepaidTid(String smartDeviceId, SmartDevicesDTOPrepaidTid body) throws ApiException {
        ApiResponse<SmartDevicesProductModel> resp = createPrepaidTidWithHttpInfo(smartDeviceId, body);
        return resp.getData();
    }

    /**
     * POST Smart/Devices/{smartDeviceId}/createPrepaidTid
     * Create prepaid tid
     * @param smartDeviceId Smart device id (required)
     * @param body Prepaid tid properties
     * @return ApiResponse&lt;SmartDevicesProductModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SmartDevicesProductModel> createPrepaidTidWithHttpInfo(String smartDeviceId, SmartDevicesDTOPrepaidTid body) throws ApiException {
        com.squareup.okhttp.Call call = createPrepaidTidValidateBeforeCall(smartDeviceId, body, null, null);
        Type localVarReturnType = new TypeToken<SmartDevicesProductModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * POST Smart/Devices/{smartDeviceId}/createPrepaidTid (asynchronously)
     * Create prepaid tid
     * @param smartDeviceId Smart device id (required)
     * @param body Prepaid tid properties
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call createPrepaidTidAsync(String smartDeviceId, SmartDevicesDTOPrepaidTid body, final ApiCallback<SmartDevicesProductModel> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = createPrepaidTidValidateBeforeCall(smartDeviceId, body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<SmartDevicesProductModel>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for createVirtualDevice
     * @param smartDeviceId Smart device id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call createVirtualDeviceCall(String smartDeviceId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Smart/Devices/{smartDeviceId}/createVirtualDevice"
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
    private com.squareup.okhttp.Call createVirtualDeviceValidateBeforeCall(String smartDeviceId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'smartDeviceId' is set
        if (smartDeviceId == null) {
            throw new ApiException("Missing the required parameter 'smartDeviceId' when calling createVirtualDevice(Async)");
        }
        
        com.squareup.okhttp.Call call = createVirtualDeviceCall(smartDeviceId, progressListener, progressRequestListener);
        return call;
    }

    /**
     * POST Smart/Devices/{smartDeviceId}/createVirtualDevice
     * Create virtual device
     * @param smartDeviceId Smart device id (required)
     * @return SmartDevicesProductModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SmartDevicesProductModel createVirtualDevice(String smartDeviceId) throws ApiException {
        ApiResponse<SmartDevicesProductModel> resp = createVirtualDeviceWithHttpInfo(smartDeviceId);
        return resp.getData();
    }

    /**
     * POST Smart/Devices/{smartDeviceId}/createVirtualDevice
     * Create virtual device
     * @param smartDeviceId Smart device id (required)
     * @return ApiResponse&lt;SmartDevicesProductModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SmartDevicesProductModel> createVirtualDeviceWithHttpInfo(String smartDeviceId) throws ApiException {
        com.squareup.okhttp.Call call = createVirtualDeviceValidateBeforeCall(smartDeviceId, null, null);
        Type localVarReturnType = new TypeToken<SmartDevicesProductModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * POST Smart/Devices/{smartDeviceId}/createVirtualDevice (asynchronously)
     * Create virtual device
     * @param smartDeviceId Smart device id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call createVirtualDeviceAsync(String smartDeviceId, final ApiCallback<SmartDevicesProductModel> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = createVirtualDeviceValidateBeforeCall(smartDeviceId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<SmartDevicesProductModel>(){}.getType();
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
        String localVarPath = "/Smart/Devices";

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
     * GET Smart/Devices
     * Get a list of smart devices
     * @param count The number of items to return.
     * @param offset The position within the whole result set to start returning items (First element is at 0).
     * @param fields List of fields to include in the result. Nested properties can be accessed with this notation: prop1.prop2  Example: prop3,prop1.prop2
     * @param q A query string to restrict the returned items to given conditions. The query string must consist of any combination of single expressions in the form property:condition.  *                   A condition may contain:  *                       - wildcard \&quot;*\&quot; for any number of characters  *                       - wildcard \&quot;?\&quot; for one character  *                       - ranges in the form [value TO value]  *  *                   Single expressions may combined by &#x27;AND&#x27;, &#x27;OR&#x27;, &#x27;NOT&#x27; operators and parenthesis &#x27;(&#x27;, &#x27;)&#x27; for grouping.  *                   Property names can be nested like \&quot;prop1.prop2\&quot;.  *                   Example: (NOT customer.name:meier*) AND (customer.age:[30 TO 40] OR customer.age:[50 TO 60])  *                   
     * @param sort String with comma separated pairs of field:order (e.g. contact.surname:asc,contact.comapnyname:desc). Result set will be sorted by included fields, in ascending &#x27;asc&#x27;, or descending &#x27;dsc&#x27; order.
     * @return SmartDevicesList
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SmartDevicesList getAll(Integer count, Integer offset, String fields, String q, String sort) throws ApiException {
        ApiResponse<SmartDevicesList> resp = getAllWithHttpInfo(count, offset, fields, q, sort);
        return resp.getData();
    }

    /**
     * GET Smart/Devices
     * Get a list of smart devices
     * @param count The number of items to return.
     * @param offset The position within the whole result set to start returning items (First element is at 0).
     * @param fields List of fields to include in the result. Nested properties can be accessed with this notation: prop1.prop2  Example: prop3,prop1.prop2
     * @param q A query string to restrict the returned items to given conditions. The query string must consist of any combination of single expressions in the form property:condition.  *                   A condition may contain:  *                       - wildcard \&quot;*\&quot; for any number of characters  *                       - wildcard \&quot;?\&quot; for one character  *                       - ranges in the form [value TO value]  *  *                   Single expressions may combined by &#x27;AND&#x27;, &#x27;OR&#x27;, &#x27;NOT&#x27; operators and parenthesis &#x27;(&#x27;, &#x27;)&#x27; for grouping.  *                   Property names can be nested like \&quot;prop1.prop2\&quot;.  *                   Example: (NOT customer.name:meier*) AND (customer.age:[30 TO 40] OR customer.age:[50 TO 60])  *                   
     * @param sort String with comma separated pairs of field:order (e.g. contact.surname:asc,contact.comapnyname:desc). Result set will be sorted by included fields, in ascending &#x27;asc&#x27;, or descending &#x27;dsc&#x27; order.
     * @return ApiResponse&lt;SmartDevicesList&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SmartDevicesList> getAllWithHttpInfo(Integer count, Integer offset, String fields, String q, String sort) throws ApiException {
        com.squareup.okhttp.Call call = getAllValidateBeforeCall(count, offset, fields, q, sort, null, null);
        Type localVarReturnType = new TypeToken<SmartDevicesList>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * GET Smart/Devices (asynchronously)
     * Get a list of smart devices
     * @param count The number of items to return.
     * @param offset The position within the whole result set to start returning items (First element is at 0).
     * @param fields List of fields to include in the result. Nested properties can be accessed with this notation: prop1.prop2  Example: prop3,prop1.prop2
     * @param q A query string to restrict the returned items to given conditions. The query string must consist of any combination of single expressions in the form property:condition.  *                   A condition may contain:  *                       - wildcard \&quot;*\&quot; for any number of characters  *                       - wildcard \&quot;?\&quot; for one character  *                       - ranges in the form [value TO value]  *  *                   Single expressions may combined by &#x27;AND&#x27;, &#x27;OR&#x27;, &#x27;NOT&#x27; operators and parenthesis &#x27;(&#x27;, &#x27;)&#x27; for grouping.  *                   Property names can be nested like \&quot;prop1.prop2\&quot;.  *                   Example: (NOT customer.name:meier*) AND (customer.age:[30 TO 40] OR customer.age:[50 TO 60])  *                   
     * @param sort String with comma separated pairs of field:order (e.g. contact.surname:asc,contact.comapnyname:desc). Result set will be sorted by included fields, in ascending &#x27;asc&#x27;, or descending &#x27;dsc&#x27; order.
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getAllAsync(Integer count, Integer offset, String fields, String q, String sort, final ApiCallback<SmartDevicesList> callback) throws ApiException {

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
        Type localVarReturnType = new TypeToken<SmartDevicesList>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getOne
     * @param smartDeviceId Smart device id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getOneCall(String smartDeviceId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Smart/Devices/{smartDeviceId}"
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
    private com.squareup.okhttp.Call getOneValidateBeforeCall(String smartDeviceId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'smartDeviceId' is set
        if (smartDeviceId == null) {
            throw new ApiException("Missing the required parameter 'smartDeviceId' when calling getOne(Async)");
        }
        
        com.squareup.okhttp.Call call = getOneCall(smartDeviceId, progressListener, progressRequestListener);
        return call;
    }

    /**
     * GET Smart/Devices/{smartDeviceId}
     * Get one smart device for a specific id
     * @param smartDeviceId Smart device id (required)
     * @return SmartDevicesProductModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SmartDevicesProductModel getOne(String smartDeviceId) throws ApiException {
        ApiResponse<SmartDevicesProductModel> resp = getOneWithHttpInfo(smartDeviceId);
        return resp.getData();
    }

    /**
     * GET Smart/Devices/{smartDeviceId}
     * Get one smart device for a specific id
     * @param smartDeviceId Smart device id (required)
     * @return ApiResponse&lt;SmartDevicesProductModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SmartDevicesProductModel> getOneWithHttpInfo(String smartDeviceId) throws ApiException {
        com.squareup.okhttp.Call call = getOneValidateBeforeCall(smartDeviceId, null, null);
        Type localVarReturnType = new TypeToken<SmartDevicesProductModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * GET Smart/Devices/{smartDeviceId} (asynchronously)
     * Get one smart device for a specific id
     * @param smartDeviceId Smart device id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getOneAsync(String smartDeviceId, final ApiCallback<SmartDevicesProductModel> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getOneValidateBeforeCall(smartDeviceId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<SmartDevicesProductModel>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getRouting
     * @param smartDeviceId Smart device id (required)
     * @param type Payment type (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getRoutingCall(String smartDeviceId, String type, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Smart/Devices/{smartDeviceId}/routing/type/{type}"
            .replaceAll("\\{" + "smartDeviceId" + "\\}", apiClient.escapeString(smartDeviceId.toString()))
            .replaceAll("\\{" + "type" + "\\}", apiClient.escapeString(type.toString()));

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
    private com.squareup.okhttp.Call getRoutingValidateBeforeCall(String smartDeviceId, String type, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'smartDeviceId' is set
        if (smartDeviceId == null) {
            throw new ApiException("Missing the required parameter 'smartDeviceId' when calling getRouting(Async)");
        }
        // verify the required parameter 'type' is set
        if (type == null) {
            throw new ApiException("Missing the required parameter 'type' when calling getRouting(Async)");
        }
        
        com.squareup.okhttp.Call call = getRoutingCall(smartDeviceId, type, progressListener, progressRequestListener);
        return call;
    }

    /**
     * GET Smart/Devices/{smartDeviceId}/routing/type/{type}
     * Get single routing
     * @param smartDeviceId Smart device id (required)
     * @param type Payment type (required)
     * @return SmartDevicesList
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SmartDevicesList getRouting(String smartDeviceId, String type) throws ApiException {
        ApiResponse<SmartDevicesList> resp = getRoutingWithHttpInfo(smartDeviceId, type);
        return resp.getData();
    }

    /**
     * GET Smart/Devices/{smartDeviceId}/routing/type/{type}
     * Get single routing
     * @param smartDeviceId Smart device id (required)
     * @param type Payment type (required)
     * @return ApiResponse&lt;SmartDevicesList&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SmartDevicesList> getRoutingWithHttpInfo(String smartDeviceId, String type) throws ApiException {
        com.squareup.okhttp.Call call = getRoutingValidateBeforeCall(smartDeviceId, type, null, null);
        Type localVarReturnType = new TypeToken<SmartDevicesList>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * GET Smart/Devices/{smartDeviceId}/routing/type/{type} (asynchronously)
     * Get single routing
     * @param smartDeviceId Smart device id (required)
     * @param type Payment type (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getRoutingAsync(String smartDeviceId, String type, final ApiCallback<SmartDevicesList> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getRoutingValidateBeforeCall(smartDeviceId, type, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<SmartDevicesList>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getSecubaseConfig
     * @param smartDeviceId Smart device id (required)
     * @param body Secubase config properties
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getSecubaseConfigCall(String smartDeviceId, SmartDevicesDTOSecubaseConfig body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/Smart/Devices/{smartDeviceId}/getSecubaseConfig"
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
    private com.squareup.okhttp.Call getSecubaseConfigValidateBeforeCall(String smartDeviceId, SmartDevicesDTOSecubaseConfig body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'smartDeviceId' is set
        if (smartDeviceId == null) {
            throw new ApiException("Missing the required parameter 'smartDeviceId' when calling getSecubaseConfig(Async)");
        }
        
        com.squareup.okhttp.Call call = getSecubaseConfigCall(smartDeviceId, body, progressListener, progressRequestListener);
        return call;
    }

    /**
     * POST Smart/Devices/{smartDeviceId}/getSecubaseConfig
     * Get secubase config
     * @param smartDeviceId Smart device id (required)
     * @param body Secubase config properties
     * @return SmartDevicesSecubaseConfig
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SmartDevicesSecubaseConfig getSecubaseConfig(String smartDeviceId, SmartDevicesDTOSecubaseConfig body) throws ApiException {
        ApiResponse<SmartDevicesSecubaseConfig> resp = getSecubaseConfigWithHttpInfo(smartDeviceId, body);
        return resp.getData();
    }

    /**
     * POST Smart/Devices/{smartDeviceId}/getSecubaseConfig
     * Get secubase config
     * @param smartDeviceId Smart device id (required)
     * @param body Secubase config properties
     * @return ApiResponse&lt;SmartDevicesSecubaseConfig&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SmartDevicesSecubaseConfig> getSecubaseConfigWithHttpInfo(String smartDeviceId, SmartDevicesDTOSecubaseConfig body) throws ApiException {
        com.squareup.okhttp.Call call = getSecubaseConfigValidateBeforeCall(smartDeviceId, body, null, null);
        Type localVarReturnType = new TypeToken<SmartDevicesSecubaseConfig>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * POST Smart/Devices/{smartDeviceId}/getSecubaseConfig (asynchronously)
     * Get secubase config
     * @param smartDeviceId Smart device id (required)
     * @param body Secubase config properties
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getSecubaseConfigAsync(String smartDeviceId, SmartDevicesDTOSecubaseConfig body, final ApiCallback<SmartDevicesSecubaseConfig> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getSecubaseConfigValidateBeforeCall(smartDeviceId, body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<SmartDevicesSecubaseConfig>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for updateDevice
     * @param smartDeviceId Smart device id (required)
     * @param body Smart device properties
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call updateDeviceCall(String smartDeviceId, SmartDevicesDTO body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/Smart/Devices/{smartDeviceId}"
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
    private com.squareup.okhttp.Call updateDeviceValidateBeforeCall(String smartDeviceId, SmartDevicesDTO body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'smartDeviceId' is set
        if (smartDeviceId == null) {
            throw new ApiException("Missing the required parameter 'smartDeviceId' when calling updateDevice(Async)");
        }
        
        com.squareup.okhttp.Call call = updateDeviceCall(smartDeviceId, body, progressListener, progressRequestListener);
        return call;
    }

    /**
     * PUT Smart/Devices/{smartDeviceId}
     * Update smart device
     * @param smartDeviceId Smart device id (required)
     * @param body Smart device properties
     * @return SmartDevicesProductModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SmartDevicesProductModel updateDevice(String smartDeviceId, SmartDevicesDTO body) throws ApiException {
        ApiResponse<SmartDevicesProductModel> resp = updateDeviceWithHttpInfo(smartDeviceId, body);
        return resp.getData();
    }

    /**
     * PUT Smart/Devices/{smartDeviceId}
     * Update smart device
     * @param smartDeviceId Smart device id (required)
     * @param body Smart device properties
     * @return ApiResponse&lt;SmartDevicesProductModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SmartDevicesProductModel> updateDeviceWithHttpInfo(String smartDeviceId, SmartDevicesDTO body) throws ApiException {
        com.squareup.okhttp.Call call = updateDeviceValidateBeforeCall(smartDeviceId, body, null, null);
        Type localVarReturnType = new TypeToken<SmartDevicesProductModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * PUT Smart/Devices/{smartDeviceId} (asynchronously)
     * Update smart device
     * @param smartDeviceId Smart device id (required)
     * @param body Smart device properties
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call updateDeviceAsync(String smartDeviceId, SmartDevicesDTO body, final ApiCallback<SmartDevicesProductModel> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = updateDeviceValidateBeforeCall(smartDeviceId, body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<SmartDevicesProductModel>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for updatePin
     * @param smartDeviceId Smart device id (required)
     * @param body Smart device properties
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call updatePinCall(String smartDeviceId, SmartDeviceUserPin body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/Smart/Devices/{smartDeviceId}/pin"
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
    private com.squareup.okhttp.Call updatePinValidateBeforeCall(String smartDeviceId, SmartDeviceUserPin body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'smartDeviceId' is set
        if (smartDeviceId == null) {
            throw new ApiException("Missing the required parameter 'smartDeviceId' when calling updatePin(Async)");
        }
        
        com.squareup.okhttp.Call call = updatePinCall(smartDeviceId, body, progressListener, progressRequestListener);
        return call;
    }

    /**
     * PUT /Smart/Devices/{smartDeviceId}/pin
     * Create new smart device
     * @param smartDeviceId Smart device id (required)
     * @param body Smart device properties
     * @return SmartDevicesProductModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SmartDevicesProductModel updatePin(String smartDeviceId, SmartDeviceUserPin body) throws ApiException {
        ApiResponse<SmartDevicesProductModel> resp = updatePinWithHttpInfo(smartDeviceId, body);
        return resp.getData();
    }

    /**
     * PUT /Smart/Devices/{smartDeviceId}/pin
     * Create new smart device
     * @param smartDeviceId Smart device id (required)
     * @param body Smart device properties
     * @return ApiResponse&lt;SmartDevicesProductModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SmartDevicesProductModel> updatePinWithHttpInfo(String smartDeviceId, SmartDeviceUserPin body) throws ApiException {
        com.squareup.okhttp.Call call = updatePinValidateBeforeCall(smartDeviceId, body, null, null);
        Type localVarReturnType = new TypeToken<SmartDevicesProductModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * PUT /Smart/Devices/{smartDeviceId}/pin (asynchronously)
     * Create new smart device
     * @param smartDeviceId Smart device id (required)
     * @param body Smart device properties
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call updatePinAsync(String smartDeviceId, SmartDeviceUserPin body, final ApiCallback<SmartDevicesProductModel> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = updatePinValidateBeforeCall(smartDeviceId, body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<SmartDevicesProductModel>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}

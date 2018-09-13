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
import io.secuconnect.client.model.SmartDevicesDTO;
import io.secuconnect.client.model.SmartDevicesDTOPrepaidTid;
import io.secuconnect.client.model.SmartDevicesDTOSecubaseConfig;
import io.secuconnect.client.model.SmartDevicesList;
import io.secuconnect.client.model.SmartDevicesList1;
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
     * @param smartDeviceProperties Smart device properties (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call addDeviceCall(SmartDevicesDTO smartDeviceProperties, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = smartDeviceProperties;
        
        // create path and map variables
        String localVarPath = "/Smart/Devices";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            
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
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call addDeviceValidateBeforeCall(SmartDevicesDTO smartDeviceProperties, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'smartDeviceProperties' is set
        if (smartDeviceProperties == null) {
            throw new ApiException("Missing the required parameter 'smartDeviceProperties' when calling addDevice(Async)");
        }
        
        
        com.squareup.okhttp.Call call = addDeviceCall(smartDeviceProperties, progressListener, progressRequestListener);
        return call;
    }

    /**
     * POST Smart/Devices
     * Create new smart device
     * @param smartDeviceProperties Smart device properties (required)
     * @return SmartDevicesProductModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SmartDevicesProductModel addDevice(SmartDevicesDTO smartDeviceProperties) throws ApiException {
        ApiResponse<SmartDevicesProductModel> resp = addDeviceWithHttpInfo(smartDeviceProperties);
        return resp.getData();
    }

    /**
     * POST Smart/Devices
     * Create new smart device
     * @param smartDeviceProperties Smart device properties (required)
     * @return ApiResponse&lt;SmartDevicesProductModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SmartDevicesProductModel> addDeviceWithHttpInfo(SmartDevicesDTO smartDeviceProperties) throws ApiException {
        com.squareup.okhttp.Call call = addDeviceValidateBeforeCall(smartDeviceProperties, null, null);
        Type localVarReturnType = new TypeToken<SmartDevicesProductModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * POST Smart/Devices (asynchronously)
     * Create new smart device
     * @param smartDeviceProperties Smart device properties (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call addDeviceAsync(SmartDevicesDTO smartDeviceProperties, final ApiCallback<SmartDevicesProductModel> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = addDeviceValidateBeforeCall(smartDeviceProperties, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<SmartDevicesProductModel>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for createPrepaidTid
     * @param smartDeviceId Smart device id (required)
     * @param prepaidTidProperties Prepaid tid properties (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call createPrepaidTidCall(String smartDeviceId, SmartDevicesDTOPrepaidTid prepaidTidProperties, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = prepaidTidProperties;
        
        // create path and map variables
        String localVarPath = "/Smart/Devices/{smartDeviceId}/CreatePrepaidTid"
            .replaceAll("\\{" + "smartDeviceId" + "\\}", apiClient.escapeString(smartDeviceId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            
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
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call createPrepaidTidValidateBeforeCall(String smartDeviceId, SmartDevicesDTOPrepaidTid prepaidTidProperties, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'smartDeviceId' is set
        if (smartDeviceId == null) {
            throw new ApiException("Missing the required parameter 'smartDeviceId' when calling createPrepaidTid(Async)");
        }
        
        // verify the required parameter 'prepaidTidProperties' is set
        if (prepaidTidProperties == null) {
            throw new ApiException("Missing the required parameter 'prepaidTidProperties' when calling createPrepaidTid(Async)");
        }
        
        
        com.squareup.okhttp.Call call = createPrepaidTidCall(smartDeviceId, prepaidTidProperties, progressListener, progressRequestListener);
        return call;
    }

    /**
     * POST Smart/Devices/{smartDeviceId}/CreatePrepaidTid
     * Create prepaid tid
     * @param smartDeviceId Smart device id (required)
     * @param prepaidTidProperties Prepaid tid properties (required)
     * @return SmartDevicesProductModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SmartDevicesProductModel createPrepaidTid(String smartDeviceId, SmartDevicesDTOPrepaidTid prepaidTidProperties) throws ApiException {
        ApiResponse<SmartDevicesProductModel> resp = createPrepaidTidWithHttpInfo(smartDeviceId, prepaidTidProperties);
        return resp.getData();
    }

    /**
     * POST Smart/Devices/{smartDeviceId}/CreatePrepaidTid
     * Create prepaid tid
     * @param smartDeviceId Smart device id (required)
     * @param prepaidTidProperties Prepaid tid properties (required)
     * @return ApiResponse&lt;SmartDevicesProductModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SmartDevicesProductModel> createPrepaidTidWithHttpInfo(String smartDeviceId, SmartDevicesDTOPrepaidTid prepaidTidProperties) throws ApiException {
        com.squareup.okhttp.Call call = createPrepaidTidValidateBeforeCall(smartDeviceId, prepaidTidProperties, null, null);
        Type localVarReturnType = new TypeToken<SmartDevicesProductModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * POST Smart/Devices/{smartDeviceId}/CreatePrepaidTid (asynchronously)
     * Create prepaid tid
     * @param smartDeviceId Smart device id (required)
     * @param prepaidTidProperties Prepaid tid properties (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call createPrepaidTidAsync(String smartDeviceId, SmartDevicesDTOPrepaidTid prepaidTidProperties, final ApiCallback<SmartDevicesProductModel> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = createPrepaidTidValidateBeforeCall(smartDeviceId, prepaidTidProperties, progressListener, progressRequestListener);
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
        String localVarPath = "/Smart/Devices/{smartDeviceId}/CreateVirtualDevice"
            .replaceAll("\\{" + "smartDeviceId" + "\\}", apiClient.escapeString(smartDeviceId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            
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
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
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
     * POST Smart/Devices/{smartDeviceId}/CreateVirtualDevice
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
     * POST Smart/Devices/{smartDeviceId}/CreateVirtualDevice
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
     * POST Smart/Devices/{smartDeviceId}/CreateVirtualDevice (asynchronously)
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
     * @param q A query string to restrict the returned items to given conditions. The query string must consist of any combination of single expressions in the form property:condition.  *                  A condition may contain:  *                      - wildcard \&quot;*\&quot; for any number of characters  *                      - wildcard \&quot;?\&quot; for one character  *                      - ranges in the form [value TO value]  *  *                  Single expressions may combined by &#39;AND&#39;, &#39;OR&#39;, &#39;NOT&#39; operators and parenthesis &#39;(&#39;, &#39;)&#39; for grouping.  *                  Property names can be nested like \&quot;prop1.prop2\&quot;.  *                  Example: (NOT customer.name:meier*) AND (customer.age:[30 TO 40] OR customer.age:[50 TO 60])  *                  
     * @param sort String with comma separated pairs of field:order (e.g. contact.surname:asc,contact.comapnyname:desc). Result set will be sorted by included fields, in ascending &#39;asc&#39;, or descending &#39;dsc&#39; order.
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
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
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
     * @param q A query string to restrict the returned items to given conditions. The query string must consist of any combination of single expressions in the form property:condition.  *                  A condition may contain:  *                      - wildcard \&quot;*\&quot; for any number of characters  *                      - wildcard \&quot;?\&quot; for one character  *                      - ranges in the form [value TO value]  *  *                  Single expressions may combined by &#39;AND&#39;, &#39;OR&#39;, &#39;NOT&#39; operators and parenthesis &#39;(&#39;, &#39;)&#39; for grouping.  *                  Property names can be nested like \&quot;prop1.prop2\&quot;.  *                  Example: (NOT customer.name:meier*) AND (customer.age:[30 TO 40] OR customer.age:[50 TO 60])  *                  
     * @param sort String with comma separated pairs of field:order (e.g. contact.surname:asc,contact.comapnyname:desc). Result set will be sorted by included fields, in ascending &#39;asc&#39;, or descending &#39;dsc&#39; order.
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
     * @param q A query string to restrict the returned items to given conditions. The query string must consist of any combination of single expressions in the form property:condition.  *                  A condition may contain:  *                      - wildcard \&quot;*\&quot; for any number of characters  *                      - wildcard \&quot;?\&quot; for one character  *                      - ranges in the form [value TO value]  *  *                  Single expressions may combined by &#39;AND&#39;, &#39;OR&#39;, &#39;NOT&#39; operators and parenthesis &#39;(&#39;, &#39;)&#39; for grouping.  *                  Property names can be nested like \&quot;prop1.prop2\&quot;.  *                  Example: (NOT customer.name:meier*) AND (customer.age:[30 TO 40] OR customer.age:[50 TO 60])  *                  
     * @param sort String with comma separated pairs of field:order (e.g. contact.surname:asc,contact.comapnyname:desc). Result set will be sorted by included fields, in ascending &#39;asc&#39;, or descending &#39;dsc&#39; order.
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
     * @param q A query string to restrict the returned items to given conditions. The query string must consist of any combination of single expressions in the form property:condition.  *                  A condition may contain:  *                      - wildcard \&quot;*\&quot; for any number of characters  *                      - wildcard \&quot;?\&quot; for one character  *                      - ranges in the form [value TO value]  *  *                  Single expressions may combined by &#39;AND&#39;, &#39;OR&#39;, &#39;NOT&#39; operators and parenthesis &#39;(&#39;, &#39;)&#39; for grouping.  *                  Property names can be nested like \&quot;prop1.prop2\&quot;.  *                  Example: (NOT customer.name:meier*) AND (customer.age:[30 TO 40] OR customer.age:[50 TO 60])  *                  
     * @param sort String with comma separated pairs of field:order (e.g. contact.surname:asc,contact.comapnyname:desc). Result set will be sorted by included fields, in ascending &#39;asc&#39;, or descending &#39;dsc&#39; order.
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

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            
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
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
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

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            
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
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
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
     * @return SmartDevicesList1
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SmartDevicesList1 getRouting(String smartDeviceId, String type) throws ApiException {
        ApiResponse<SmartDevicesList1> resp = getRoutingWithHttpInfo(smartDeviceId, type);
        return resp.getData();
    }

    /**
     * GET Smart/Devices/{smartDeviceId}/routing/type/{type}
     * Get single routing
     * @param smartDeviceId Smart device id (required)
     * @param type Payment type (required)
     * @return ApiResponse&lt;SmartDevicesList1&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SmartDevicesList1> getRoutingWithHttpInfo(String smartDeviceId, String type) throws ApiException {
        com.squareup.okhttp.Call call = getRoutingValidateBeforeCall(smartDeviceId, type, null, null);
        Type localVarReturnType = new TypeToken<SmartDevicesList1>(){}.getType();
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
    public com.squareup.okhttp.Call getRoutingAsync(String smartDeviceId, String type, final ApiCallback<SmartDevicesList1> callback) throws ApiException {

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
        Type localVarReturnType = new TypeToken<SmartDevicesList1>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getSecubaseConfig
     * @param smartDeviceId Smart device id (required)
     * @param secubaseConfigProperties Secubase config properties (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getSecubaseConfigCall(String smartDeviceId, SmartDevicesDTOSecubaseConfig secubaseConfigProperties, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = secubaseConfigProperties;
        
        // create path and map variables
        String localVarPath = "/Smart/Devices/{smartDeviceId}/GetSecubaseConfig"
            .replaceAll("\\{" + "smartDeviceId" + "\\}", apiClient.escapeString(smartDeviceId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            
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
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getSecubaseConfigValidateBeforeCall(String smartDeviceId, SmartDevicesDTOSecubaseConfig secubaseConfigProperties, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'smartDeviceId' is set
        if (smartDeviceId == null) {
            throw new ApiException("Missing the required parameter 'smartDeviceId' when calling getSecubaseConfig(Async)");
        }
        
        // verify the required parameter 'secubaseConfigProperties' is set
        if (secubaseConfigProperties == null) {
            throw new ApiException("Missing the required parameter 'secubaseConfigProperties' when calling getSecubaseConfig(Async)");
        }
        
        
        com.squareup.okhttp.Call call = getSecubaseConfigCall(smartDeviceId, secubaseConfigProperties, progressListener, progressRequestListener);
        return call;
    }

    /**
     * POST Smart/Devices/{smartDeviceId}/GetSecubaseConfig
     * Get secubase config
     * @param smartDeviceId Smart device id (required)
     * @param secubaseConfigProperties Secubase config properties (required)
     * @return SmartDevicesSecubaseConfig
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SmartDevicesSecubaseConfig getSecubaseConfig(String smartDeviceId, SmartDevicesDTOSecubaseConfig secubaseConfigProperties) throws ApiException {
        ApiResponse<SmartDevicesSecubaseConfig> resp = getSecubaseConfigWithHttpInfo(smartDeviceId, secubaseConfigProperties);
        return resp.getData();
    }

    /**
     * POST Smart/Devices/{smartDeviceId}/GetSecubaseConfig
     * Get secubase config
     * @param smartDeviceId Smart device id (required)
     * @param secubaseConfigProperties Secubase config properties (required)
     * @return ApiResponse&lt;SmartDevicesSecubaseConfig&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SmartDevicesSecubaseConfig> getSecubaseConfigWithHttpInfo(String smartDeviceId, SmartDevicesDTOSecubaseConfig secubaseConfigProperties) throws ApiException {
        com.squareup.okhttp.Call call = getSecubaseConfigValidateBeforeCall(smartDeviceId, secubaseConfigProperties, null, null);
        Type localVarReturnType = new TypeToken<SmartDevicesSecubaseConfig>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * POST Smart/Devices/{smartDeviceId}/GetSecubaseConfig (asynchronously)
     * Get secubase config
     * @param smartDeviceId Smart device id (required)
     * @param secubaseConfigProperties Secubase config properties (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getSecubaseConfigAsync(String smartDeviceId, SmartDevicesDTOSecubaseConfig secubaseConfigProperties, final ApiCallback<SmartDevicesSecubaseConfig> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getSecubaseConfigValidateBeforeCall(smartDeviceId, secubaseConfigProperties, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<SmartDevicesSecubaseConfig>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for updateDevice
     * @param smartDeviceId Smart device id (required)
     * @param smartDeviceProperties Smart device properties (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call updateDeviceCall(String smartDeviceId, SmartDevicesDTO smartDeviceProperties, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = smartDeviceProperties;
        
        // create path and map variables
        String localVarPath = "/Smart/Devices/{smartDeviceId}"
            .replaceAll("\\{" + "smartDeviceId" + "\\}", apiClient.escapeString(smartDeviceId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            
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
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call updateDeviceValidateBeforeCall(String smartDeviceId, SmartDevicesDTO smartDeviceProperties, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'smartDeviceId' is set
        if (smartDeviceId == null) {
            throw new ApiException("Missing the required parameter 'smartDeviceId' when calling updateDevice(Async)");
        }
        
        // verify the required parameter 'smartDeviceProperties' is set
        if (smartDeviceProperties == null) {
            throw new ApiException("Missing the required parameter 'smartDeviceProperties' when calling updateDevice(Async)");
        }
        
        
        com.squareup.okhttp.Call call = updateDeviceCall(smartDeviceId, smartDeviceProperties, progressListener, progressRequestListener);
        return call;
    }

    /**
     * PUT Smart/Devices/{smartDeviceId}
     * Update smart device
     * @param smartDeviceId Smart device id (required)
     * @param smartDeviceProperties Smart device properties (required)
     * @return SmartDevicesProductModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SmartDevicesProductModel updateDevice(String smartDeviceId, SmartDevicesDTO smartDeviceProperties) throws ApiException {
        ApiResponse<SmartDevicesProductModel> resp = updateDeviceWithHttpInfo(smartDeviceId, smartDeviceProperties);
        return resp.getData();
    }

    /**
     * PUT Smart/Devices/{smartDeviceId}
     * Update smart device
     * @param smartDeviceId Smart device id (required)
     * @param smartDeviceProperties Smart device properties (required)
     * @return ApiResponse&lt;SmartDevicesProductModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SmartDevicesProductModel> updateDeviceWithHttpInfo(String smartDeviceId, SmartDevicesDTO smartDeviceProperties) throws ApiException {
        com.squareup.okhttp.Call call = updateDeviceValidateBeforeCall(smartDeviceId, smartDeviceProperties, null, null);
        Type localVarReturnType = new TypeToken<SmartDevicesProductModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * PUT Smart/Devices/{smartDeviceId} (asynchronously)
     * Update smart device
     * @param smartDeviceId Smart device id (required)
     * @param smartDeviceProperties Smart device properties (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call updateDeviceAsync(String smartDeviceId, SmartDevicesDTO smartDeviceProperties, final ApiCallback<SmartDevicesProductModel> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = updateDeviceValidateBeforeCall(smartDeviceId, smartDeviceProperties, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<SmartDevicesProductModel>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}

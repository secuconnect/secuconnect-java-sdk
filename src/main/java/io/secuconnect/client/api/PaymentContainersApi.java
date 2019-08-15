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
import io.secuconnect.client.model.PaymentContainersDTO;
import io.secuconnect.client.model.PaymentContainersList;
import io.secuconnect.client.model.PaymentContainersProductModel;
import io.secuconnect.client.model.ProductExceptionPayload;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PaymentContainersApi {
    private ApiClient apiClient;

    public PaymentContainersApi() {
        this(Configuration.getDefaultApiClient());
    }

    public PaymentContainersApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for paymentContainersGet
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
    public com.squareup.okhttp.Call paymentContainersGetCall(Integer count, Integer offset, String fields, String q, String sort, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Payment/Containers";

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
    private com.squareup.okhttp.Call paymentContainersGetValidateBeforeCall(Integer count, Integer offset, String fields, String q, String sort, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        
        com.squareup.okhttp.Call call = paymentContainersGetCall(count, offset, fields, q, sort, progressListener, progressRequestListener);
        return call;
    }

    /**
     * GET Payment/Containers
     * Get a list of payment containers
     * @param count The number of items to return.
     * @param offset The position within the whole result set to start returning items (First element is at 0).
     * @param fields List of fields to include in the result. Nested properties can be accessed with this notation: prop1.prop2  Example: prop3,prop1.prop2
     * @param q A query string to restrict the returned items to given conditions. The query string must consist of any combination of single expressions in the form property:condition.  *                  A condition may contain:  *                      - wildcard \&quot;*\&quot; for any number of characters  *                      - wildcard \&quot;?\&quot; for one character  *                      - ranges in the form [value TO value]  *  *                  Single expressions may combined by &#39;AND&#39;, &#39;OR&#39;, &#39;NOT&#39; operators and parenthesis &#39;(&#39;, &#39;)&#39; for grouping.  *                  Property names can be nested like \&quot;prop1.prop2\&quot;.  *                  Example: (NOT customer.name:meier*) AND (customer.age:[30 TO 40] OR customer.age:[50 TO 60])  *                  
     * @param sort String with comma separated pairs of field:order (e.g. contact.surname:asc,contact.comapnyname:desc). Result set will be sorted by included fields, in ascending &#39;asc&#39;, or descending &#39;dsc&#39; order.
     * @return PaymentContainersList
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PaymentContainersList paymentContainersGet(Integer count, Integer offset, String fields, String q, String sort) throws ApiException {
        ApiResponse<PaymentContainersList> resp = paymentContainersGetWithHttpInfo(count, offset, fields, q, sort);
        return resp.getData();
    }

    /**
     * GET Payment/Containers
     * Get a list of payment containers
     * @param count The number of items to return.
     * @param offset The position within the whole result set to start returning items (First element is at 0).
     * @param fields List of fields to include in the result. Nested properties can be accessed with this notation: prop1.prop2  Example: prop3,prop1.prop2
     * @param q A query string to restrict the returned items to given conditions. The query string must consist of any combination of single expressions in the form property:condition.  *                  A condition may contain:  *                      - wildcard \&quot;*\&quot; for any number of characters  *                      - wildcard \&quot;?\&quot; for one character  *                      - ranges in the form [value TO value]  *  *                  Single expressions may combined by &#39;AND&#39;, &#39;OR&#39;, &#39;NOT&#39; operators and parenthesis &#39;(&#39;, &#39;)&#39; for grouping.  *                  Property names can be nested like \&quot;prop1.prop2\&quot;.  *                  Example: (NOT customer.name:meier*) AND (customer.age:[30 TO 40] OR customer.age:[50 TO 60])  *                  
     * @param sort String with comma separated pairs of field:order (e.g. contact.surname:asc,contact.comapnyname:desc). Result set will be sorted by included fields, in ascending &#39;asc&#39;, or descending &#39;dsc&#39; order.
     * @return ApiResponse&lt;PaymentContainersList&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PaymentContainersList> paymentContainersGetWithHttpInfo(Integer count, Integer offset, String fields, String q, String sort) throws ApiException {
        com.squareup.okhttp.Call call = paymentContainersGetValidateBeforeCall(count, offset, fields, q, sort, null, null);
        Type localVarReturnType = new TypeToken<PaymentContainersList>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * GET Payment/Containers (asynchronously)
     * Get a list of payment containers
     * @param count The number of items to return.
     * @param offset The position within the whole result set to start returning items (First element is at 0).
     * @param fields List of fields to include in the result. Nested properties can be accessed with this notation: prop1.prop2  Example: prop3,prop1.prop2
     * @param q A query string to restrict the returned items to given conditions. The query string must consist of any combination of single expressions in the form property:condition.  *                  A condition may contain:  *                      - wildcard \&quot;*\&quot; for any number of characters  *                      - wildcard \&quot;?\&quot; for one character  *                      - ranges in the form [value TO value]  *  *                  Single expressions may combined by &#39;AND&#39;, &#39;OR&#39;, &#39;NOT&#39; operators and parenthesis &#39;(&#39;, &#39;)&#39; for grouping.  *                  Property names can be nested like \&quot;prop1.prop2\&quot;.  *                  Example: (NOT customer.name:meier*) AND (customer.age:[30 TO 40] OR customer.age:[50 TO 60])  *                  
     * @param sort String with comma separated pairs of field:order (e.g. contact.surname:asc,contact.comapnyname:desc). Result set will be sorted by included fields, in ascending &#39;asc&#39;, or descending &#39;dsc&#39; order.
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call paymentContainersGetAsync(Integer count, Integer offset, String fields, String q, String sort, final ApiCallback<PaymentContainersList> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = paymentContainersGetValidateBeforeCall(count, offset, fields, q, sort, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<PaymentContainersList>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for paymentContainersGetById
     * @param paymentContainerId Search one by provided id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call paymentContainersGetByIdCall(String paymentContainerId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Payment/Containers/{paymentContainerId}"
            .replaceAll("\\{" + "paymentContainerId" + "\\}", apiClient.escapeString(paymentContainerId.toString()));

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
    private com.squareup.okhttp.Call paymentContainersGetByIdValidateBeforeCall(String paymentContainerId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'paymentContainerId' is set
        if (paymentContainerId == null) {
            throw new ApiException("Missing the required parameter 'paymentContainerId' when calling paymentContainersGetById(Async)");
        }
        
        
        com.squareup.okhttp.Call call = paymentContainersGetByIdCall(paymentContainerId, progressListener, progressRequestListener);
        return call;
    }

    /**
     * GET Payment/Containers/{paymentContainerId}
     * Get all payment containers
     * @param paymentContainerId Search one by provided id (required)
     * @return PaymentContainersProductModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PaymentContainersProductModel paymentContainersGetById(String paymentContainerId) throws ApiException {
        ApiResponse<PaymentContainersProductModel> resp = paymentContainersGetByIdWithHttpInfo(paymentContainerId);
        return resp.getData();
    }

    /**
     * GET Payment/Containers/{paymentContainerId}
     * Get all payment containers
     * @param paymentContainerId Search one by provided id (required)
     * @return ApiResponse&lt;PaymentContainersProductModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PaymentContainersProductModel> paymentContainersGetByIdWithHttpInfo(String paymentContainerId) throws ApiException {
        com.squareup.okhttp.Call call = paymentContainersGetByIdValidateBeforeCall(paymentContainerId, null, null);
        Type localVarReturnType = new TypeToken<PaymentContainersProductModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * GET Payment/Containers/{paymentContainerId} (asynchronously)
     * Get all payment containers
     * @param paymentContainerId Search one by provided id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call paymentContainersGetByIdAsync(String paymentContainerId, final ApiCallback<PaymentContainersProductModel> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = paymentContainersGetByIdValidateBeforeCall(paymentContainerId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<PaymentContainersProductModel>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for paymentContainersIdAssignSecondaryIdDelete
     * @param paymentContainerId Payment container id (required)
     * @param secondaryPaymentContainerId Id for which container is currently assigned to (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call paymentContainersIdAssignSecondaryIdDeleteCall(String paymentContainerId, String secondaryPaymentContainerId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Payment/Containers/{paymentContainerId}/assign/{secondaryPaymentContainerId}"
            .replaceAll("\\{" + "paymentContainerId" + "\\}", apiClient.escapeString(paymentContainerId.toString()))
            .replaceAll("\\{" + "secondaryPaymentContainerId" + "\\}", apiClient.escapeString(secondaryPaymentContainerId.toString()));

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
    private com.squareup.okhttp.Call paymentContainersIdAssignSecondaryIdDeleteValidateBeforeCall(String paymentContainerId, String secondaryPaymentContainerId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'paymentContainerId' is set
        if (paymentContainerId == null) {
            throw new ApiException("Missing the required parameter 'paymentContainerId' when calling paymentContainersIdAssignSecondaryIdDelete(Async)");
        }
        
        // verify the required parameter 'secondaryPaymentContainerId' is set
        if (secondaryPaymentContainerId == null) {
            throw new ApiException("Missing the required parameter 'secondaryPaymentContainerId' when calling paymentContainersIdAssignSecondaryIdDelete(Async)");
        }
        
        
        com.squareup.okhttp.Call call = paymentContainersIdAssignSecondaryIdDeleteCall(paymentContainerId, secondaryPaymentContainerId, progressListener, progressRequestListener);
        return call;
    }

    /**
     * DELETE Payment/Containers/{paymentContainerId}/assign/{secondaryPaymentContainerId}
     * Removes an existing payment container assignment
     * @param paymentContainerId Payment container id (required)
     * @param secondaryPaymentContainerId Id for which container is currently assigned to (required)
     * @return List&lt;PaymentContainersProductModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<PaymentContainersProductModel> paymentContainersIdAssignSecondaryIdDelete(String paymentContainerId, String secondaryPaymentContainerId) throws ApiException {
        ApiResponse<List<PaymentContainersProductModel>> resp = paymentContainersIdAssignSecondaryIdDeleteWithHttpInfo(paymentContainerId, secondaryPaymentContainerId);
        return resp.getData();
    }

    /**
     * DELETE Payment/Containers/{paymentContainerId}/assign/{secondaryPaymentContainerId}
     * Removes an existing payment container assignment
     * @param paymentContainerId Payment container id (required)
     * @param secondaryPaymentContainerId Id for which container is currently assigned to (required)
     * @return ApiResponse&lt;List&lt;PaymentContainersProductModel&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<PaymentContainersProductModel>> paymentContainersIdAssignSecondaryIdDeleteWithHttpInfo(String paymentContainerId, String secondaryPaymentContainerId) throws ApiException {
        com.squareup.okhttp.Call call = paymentContainersIdAssignSecondaryIdDeleteValidateBeforeCall(paymentContainerId, secondaryPaymentContainerId, null, null);
        Type localVarReturnType = new TypeToken<List<PaymentContainersProductModel>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * DELETE Payment/Containers/{paymentContainerId}/assign/{secondaryPaymentContainerId} (asynchronously)
     * Removes an existing payment container assignment
     * @param paymentContainerId Payment container id (required)
     * @param secondaryPaymentContainerId Id for which container is currently assigned to (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call paymentContainersIdAssignSecondaryIdDeleteAsync(String paymentContainerId, String secondaryPaymentContainerId, final ApiCallback<List<PaymentContainersProductModel>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = paymentContainersIdAssignSecondaryIdDeleteValidateBeforeCall(paymentContainerId, secondaryPaymentContainerId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<PaymentContainersProductModel>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for paymentContainersIdAssignSecondaryIdPost
     * @param paymentContainerId Payment container id (required)
     * @param secondaryPaymentContainerId Id to which container will be assigned (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call paymentContainersIdAssignSecondaryIdPostCall(String paymentContainerId, String secondaryPaymentContainerId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Payment/Containers/{paymentContainerId}/assign/{secondaryPaymentContainerId}"
            .replaceAll("\\{" + "paymentContainerId" + "\\}", apiClient.escapeString(paymentContainerId.toString()))
            .replaceAll("\\{" + "secondaryPaymentContainerId" + "\\}", apiClient.escapeString(secondaryPaymentContainerId.toString()));

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
    private com.squareup.okhttp.Call paymentContainersIdAssignSecondaryIdPostValidateBeforeCall(String paymentContainerId, String secondaryPaymentContainerId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'paymentContainerId' is set
        if (paymentContainerId == null) {
            throw new ApiException("Missing the required parameter 'paymentContainerId' when calling paymentContainersIdAssignSecondaryIdPost(Async)");
        }
        
        // verify the required parameter 'secondaryPaymentContainerId' is set
        if (secondaryPaymentContainerId == null) {
            throw new ApiException("Missing the required parameter 'secondaryPaymentContainerId' when calling paymentContainersIdAssignSecondaryIdPost(Async)");
        }
        
        
        com.squareup.okhttp.Call call = paymentContainersIdAssignSecondaryIdPostCall(paymentContainerId, secondaryPaymentContainerId, progressListener, progressRequestListener);
        return call;
    }

    /**
     * POST Payment/Containers/{paymentContainerId}/assign/{secondaryPaymentContainerId}
     * Assign an existing payment container to ...
     * @param paymentContainerId Payment container id (required)
     * @param secondaryPaymentContainerId Id to which container will be assigned (required)
     * @return PaymentContainersProductModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PaymentContainersProductModel paymentContainersIdAssignSecondaryIdPost(String paymentContainerId, String secondaryPaymentContainerId) throws ApiException {
        ApiResponse<PaymentContainersProductModel> resp = paymentContainersIdAssignSecondaryIdPostWithHttpInfo(paymentContainerId, secondaryPaymentContainerId);
        return resp.getData();
    }

    /**
     * POST Payment/Containers/{paymentContainerId}/assign/{secondaryPaymentContainerId}
     * Assign an existing payment container to ...
     * @param paymentContainerId Payment container id (required)
     * @param secondaryPaymentContainerId Id to which container will be assigned (required)
     * @return ApiResponse&lt;PaymentContainersProductModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PaymentContainersProductModel> paymentContainersIdAssignSecondaryIdPostWithHttpInfo(String paymentContainerId, String secondaryPaymentContainerId) throws ApiException {
        com.squareup.okhttp.Call call = paymentContainersIdAssignSecondaryIdPostValidateBeforeCall(paymentContainerId, secondaryPaymentContainerId, null, null);
        Type localVarReturnType = new TypeToken<PaymentContainersProductModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * POST Payment/Containers/{paymentContainerId}/assign/{secondaryPaymentContainerId} (asynchronously)
     * Assign an existing payment container to ...
     * @param paymentContainerId Payment container id (required)
     * @param secondaryPaymentContainerId Id to which container will be assigned (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call paymentContainersIdAssignSecondaryIdPostAsync(String paymentContainerId, String secondaryPaymentContainerId, final ApiCallback<PaymentContainersProductModel> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = paymentContainersIdAssignSecondaryIdPostValidateBeforeCall(paymentContainerId, secondaryPaymentContainerId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<PaymentContainersProductModel>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for paymentContainersIdDelete
     * @param paymentContainerId Payment container id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call paymentContainersIdDeleteCall(String paymentContainerId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Payment/Containers/{paymentContainerId}"
            .replaceAll("\\{" + "paymentContainerId" + "\\}", apiClient.escapeString(paymentContainerId.toString()));

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
    private com.squareup.okhttp.Call paymentContainersIdDeleteValidateBeforeCall(String paymentContainerId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'paymentContainerId' is set
        if (paymentContainerId == null) {
            throw new ApiException("Missing the required parameter 'paymentContainerId' when calling paymentContainersIdDelete(Async)");
        }
        
        
        com.squareup.okhttp.Call call = paymentContainersIdDeleteCall(paymentContainerId, progressListener, progressRequestListener);
        return call;
    }

    /**
     * DELETE Payment/Containers/{paymentContainerId}
     * Delete payment container
     * @param paymentContainerId Payment container id (required)
     * @return List&lt;PaymentContainersProductModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<PaymentContainersProductModel> paymentContainersIdDelete(String paymentContainerId) throws ApiException {
        ApiResponse<List<PaymentContainersProductModel>> resp = paymentContainersIdDeleteWithHttpInfo(paymentContainerId);
        return resp.getData();
    }

    /**
     * DELETE Payment/Containers/{paymentContainerId}
     * Delete payment container
     * @param paymentContainerId Payment container id (required)
     * @return ApiResponse&lt;List&lt;PaymentContainersProductModel&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<PaymentContainersProductModel>> paymentContainersIdDeleteWithHttpInfo(String paymentContainerId) throws ApiException {
        com.squareup.okhttp.Call call = paymentContainersIdDeleteValidateBeforeCall(paymentContainerId, null, null);
        Type localVarReturnType = new TypeToken<List<PaymentContainersProductModel>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * DELETE Payment/Containers/{paymentContainerId} (asynchronously)
     * Delete payment container
     * @param paymentContainerId Payment container id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call paymentContainersIdDeleteAsync(String paymentContainerId, final ApiCallback<List<PaymentContainersProductModel>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = paymentContainersIdDeleteValidateBeforeCall(paymentContainerId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<PaymentContainersProductModel>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for paymentContainersIdPut
     * @param paymentContainerId Payment container id (required)
     * @param body Payment container properties (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call paymentContainersIdPutCall(String paymentContainerId, PaymentContainersDTO body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/Payment/Containers/{paymentContainerId}"
            .replaceAll("\\{" + "paymentContainerId" + "\\}", apiClient.escapeString(paymentContainerId.toString()));

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
    private com.squareup.okhttp.Call paymentContainersIdPutValidateBeforeCall(String paymentContainerId, PaymentContainersDTO body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'paymentContainerId' is set
        if (paymentContainerId == null) {
            throw new ApiException("Missing the required parameter 'paymentContainerId' when calling paymentContainersIdPut(Async)");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling paymentContainersIdPut(Async)");
        }
        
        
        com.squareup.okhttp.Call call = paymentContainersIdPutCall(paymentContainerId, body, progressListener, progressRequestListener);
        return call;
    }

    /**
     * PUT Payment/Containers/{paymentContainerId}
     * Update payment container
     * @param paymentContainerId Payment container id (required)
     * @param body Payment container properties (required)
     * @return PaymentContainersProductModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PaymentContainersProductModel paymentContainersIdPut(String paymentContainerId, PaymentContainersDTO body) throws ApiException {
        ApiResponse<PaymentContainersProductModel> resp = paymentContainersIdPutWithHttpInfo(paymentContainerId, body);
        return resp.getData();
    }

    /**
     * PUT Payment/Containers/{paymentContainerId}
     * Update payment container
     * @param paymentContainerId Payment container id (required)
     * @param body Payment container properties (required)
     * @return ApiResponse&lt;PaymentContainersProductModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PaymentContainersProductModel> paymentContainersIdPutWithHttpInfo(String paymentContainerId, PaymentContainersDTO body) throws ApiException {
        com.squareup.okhttp.Call call = paymentContainersIdPutValidateBeforeCall(paymentContainerId, body, null, null);
        Type localVarReturnType = new TypeToken<PaymentContainersProductModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * PUT Payment/Containers/{paymentContainerId} (asynchronously)
     * Update payment container
     * @param paymentContainerId Payment container id (required)
     * @param body Payment container properties (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call paymentContainersIdPutAsync(String paymentContainerId, PaymentContainersDTO body, final ApiCallback<PaymentContainersProductModel> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = paymentContainersIdPutValidateBeforeCall(paymentContainerId, body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<PaymentContainersProductModel>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for paymentContainersPost
     * @param body Payment container properties (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call paymentContainersPostCall(PaymentContainersDTO body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/Payment/Containers";

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
    private com.squareup.okhttp.Call paymentContainersPostValidateBeforeCall(PaymentContainersDTO body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling paymentContainersPost(Async)");
        }
        
        
        com.squareup.okhttp.Call call = paymentContainersPostCall(body, progressListener, progressRequestListener);
        return call;
    }

    /**
     * POST Payment/Containers
     * Add new containers
     * @param body Payment container properties (required)
     * @return PaymentContainersProductModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PaymentContainersProductModel paymentContainersPost(PaymentContainersDTO body) throws ApiException {
        ApiResponse<PaymentContainersProductModel> resp = paymentContainersPostWithHttpInfo(body);
        return resp.getData();
    }

    /**
     * POST Payment/Containers
     * Add new containers
     * @param body Payment container properties (required)
     * @return ApiResponse&lt;PaymentContainersProductModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PaymentContainersProductModel> paymentContainersPostWithHttpInfo(PaymentContainersDTO body) throws ApiException {
        com.squareup.okhttp.Call call = paymentContainersPostValidateBeforeCall(body, null, null);
        Type localVarReturnType = new TypeToken<PaymentContainersProductModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * POST Payment/Containers (asynchronously)
     * Add new containers
     * @param body Payment container properties (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call paymentContainersPostAsync(PaymentContainersDTO body, final ApiCallback<PaymentContainersProductModel> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = paymentContainersPostValidateBeforeCall(body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<PaymentContainersProductModel>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}

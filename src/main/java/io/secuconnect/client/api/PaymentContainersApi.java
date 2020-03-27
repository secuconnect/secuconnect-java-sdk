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
     * Build call for paymentContainerspaymentContainersGet
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
    public com.squareup.okhttp.Call paymentContainerspaymentContainersGetCall(Integer count, Integer offset, String fields, String q, String sort, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Payment/Containers";

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
    private com.squareup.okhttp.Call paymentContainerspaymentContainersGetValidateBeforeCall(Integer count, Integer offset, String fields, String q, String sort, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = paymentContainerspaymentContainersGetCall(count, offset, fields, q, sort, progressListener, progressRequestListener);
        return call;
    }

    /**
     * GET Payment/Containers
     * Get a list of payment containers
     * @param count The number of items to return. (optional)
     * @param offset The position within the whole result set to start returning items (First element is at 0). (optional)
     * @param fields List of fields to include in the result. Nested properties can be accessed with this notation: prop1.prop2  Example: prop3,prop1.prop2 (optional)
     * @param q A query string to restrict the returned items to given conditions. The query string must consist of any combination of single expressions in the form property:condition.  *                   A condition may contain:  *                       - wildcard \&quot;*\&quot; for any number of characters  *                       - wildcard \&quot;?\&quot; for one character  *                       - ranges in the form [value TO value]  *  *                   Single expressions may combined by &#x27;AND&#x27;, &#x27;OR&#x27;, &#x27;NOT&#x27; operators and parenthesis &#x27;(&#x27;, &#x27;)&#x27; for grouping.  *                   Property names can be nested like \&quot;prop1.prop2\&quot;.  *                   Example: (NOT customer.name:meier*) AND (customer.age:[30 TO 40] OR customer.age:[50 TO 60])  *                    (optional)
     * @param sort String with comma separated pairs of field:order (e.g. contact.surname:asc,contact.comapnyname:desc). Result set will be sorted by included fields, in ascending &#x27;asc&#x27;, or descending &#x27;dsc&#x27; order. (optional)
     * @return PaymentContainersList
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PaymentContainersList paymentContainerspaymentContainersGet(Integer count, Integer offset, String fields, String q, String sort) throws ApiException {
        ApiResponse<PaymentContainersList> resp = paymentContainerspaymentContainersGetWithHttpInfo(count, offset, fields, q, sort);
        return resp.getData();
    }

    /**
     * GET Payment/Containers
     * Get a list of payment containers
     * @param count The number of items to return. (optional)
     * @param offset The position within the whole result set to start returning items (First element is at 0). (optional)
     * @param fields List of fields to include in the result. Nested properties can be accessed with this notation: prop1.prop2  Example: prop3,prop1.prop2 (optional)
     * @param q A query string to restrict the returned items to given conditions. The query string must consist of any combination of single expressions in the form property:condition.  *                   A condition may contain:  *                       - wildcard \&quot;*\&quot; for any number of characters  *                       - wildcard \&quot;?\&quot; for one character  *                       - ranges in the form [value TO value]  *  *                   Single expressions may combined by &#x27;AND&#x27;, &#x27;OR&#x27;, &#x27;NOT&#x27; operators and parenthesis &#x27;(&#x27;, &#x27;)&#x27; for grouping.  *                   Property names can be nested like \&quot;prop1.prop2\&quot;.  *                   Example: (NOT customer.name:meier*) AND (customer.age:[30 TO 40] OR customer.age:[50 TO 60])  *                    (optional)
     * @param sort String with comma separated pairs of field:order (e.g. contact.surname:asc,contact.comapnyname:desc). Result set will be sorted by included fields, in ascending &#x27;asc&#x27;, or descending &#x27;dsc&#x27; order. (optional)
     * @return ApiResponse&lt;PaymentContainersList&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PaymentContainersList> paymentContainerspaymentContainersGetWithHttpInfo(Integer count, Integer offset, String fields, String q, String sort) throws ApiException {
        com.squareup.okhttp.Call call = paymentContainerspaymentContainersGetValidateBeforeCall(count, offset, fields, q, sort, null, null);
        Type localVarReturnType = new TypeToken<PaymentContainersList>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * GET Payment/Containers (asynchronously)
     * Get a list of payment containers
     * @param count The number of items to return. (optional)
     * @param offset The position within the whole result set to start returning items (First element is at 0). (optional)
     * @param fields List of fields to include in the result. Nested properties can be accessed with this notation: prop1.prop2  Example: prop3,prop1.prop2 (optional)
     * @param q A query string to restrict the returned items to given conditions. The query string must consist of any combination of single expressions in the form property:condition.  *                   A condition may contain:  *                       - wildcard \&quot;*\&quot; for any number of characters  *                       - wildcard \&quot;?\&quot; for one character  *                       - ranges in the form [value TO value]  *  *                   Single expressions may combined by &#x27;AND&#x27;, &#x27;OR&#x27;, &#x27;NOT&#x27; operators and parenthesis &#x27;(&#x27;, &#x27;)&#x27; for grouping.  *                   Property names can be nested like \&quot;prop1.prop2\&quot;.  *                   Example: (NOT customer.name:meier*) AND (customer.age:[30 TO 40] OR customer.age:[50 TO 60])  *                    (optional)
     * @param sort String with comma separated pairs of field:order (e.g. contact.surname:asc,contact.comapnyname:desc). Result set will be sorted by included fields, in ascending &#x27;asc&#x27;, or descending &#x27;dsc&#x27; order. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call paymentContainerspaymentContainersGetAsync(Integer count, Integer offset, String fields, String q, String sort, final ApiCallback<PaymentContainersList> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = paymentContainerspaymentContainersGetValidateBeforeCall(count, offset, fields, q, sort, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<PaymentContainersList>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for paymentContainerspaymentContainersGetById
     * @param paymentContainerId Search one by provided id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call paymentContainerspaymentContainersGetByIdCall(String paymentContainerId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Payment/Containers/{paymentContainerId}"
            .replaceAll("\\{" + "paymentContainerId" + "\\}", apiClient.escapeString(paymentContainerId.toString()));

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
    private com.squareup.okhttp.Call paymentContainerspaymentContainersGetByIdValidateBeforeCall(String paymentContainerId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'paymentContainerId' is set
        if (paymentContainerId == null) {
            throw new ApiException("Missing the required parameter 'paymentContainerId' when calling paymentContainerspaymentContainersGetById(Async)");
        }
        
        com.squareup.okhttp.Call call = paymentContainerspaymentContainersGetByIdCall(paymentContainerId, progressListener, progressRequestListener);
        return call;
    }

    /**
     * GET Payment/Containers/{paymentContainerId}
     * Get all payment containers
     * @param paymentContainerId Search one by provided id (required)
     * @return PaymentContainersProductModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PaymentContainersProductModel paymentContainerspaymentContainersGetById(String paymentContainerId) throws ApiException {
        ApiResponse<PaymentContainersProductModel> resp = paymentContainerspaymentContainersGetByIdWithHttpInfo(paymentContainerId);
        return resp.getData();
    }

    /**
     * GET Payment/Containers/{paymentContainerId}
     * Get all payment containers
     * @param paymentContainerId Search one by provided id (required)
     * @return ApiResponse&lt;PaymentContainersProductModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PaymentContainersProductModel> paymentContainerspaymentContainersGetByIdWithHttpInfo(String paymentContainerId) throws ApiException {
        com.squareup.okhttp.Call call = paymentContainerspaymentContainersGetByIdValidateBeforeCall(paymentContainerId, null, null);
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
    public com.squareup.okhttp.Call paymentContainerspaymentContainersGetByIdAsync(String paymentContainerId, final ApiCallback<PaymentContainersProductModel> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = paymentContainerspaymentContainersGetByIdValidateBeforeCall(paymentContainerId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<PaymentContainersProductModel>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for paymentContainerspaymentContainersIdAssignSecondaryIdDelete
     * @param paymentContainerId Payment container id (required)
     * @param secondaryPaymentContainerId Id for which container is currently assigned to (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call paymentContainerspaymentContainersIdAssignSecondaryIdDeleteCall(String paymentContainerId, String secondaryPaymentContainerId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Payment/Containers/{paymentContainerId}/assign/{secondaryPaymentContainerId}"
            .replaceAll("\\{" + "paymentContainerId" + "\\}", apiClient.escapeString(paymentContainerId.toString()))
            .replaceAll("\\{" + "secondaryPaymentContainerId" + "\\}", apiClient.escapeString(secondaryPaymentContainerId.toString()));

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
    private com.squareup.okhttp.Call paymentContainerspaymentContainersIdAssignSecondaryIdDeleteValidateBeforeCall(String paymentContainerId, String secondaryPaymentContainerId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'paymentContainerId' is set
        if (paymentContainerId == null) {
            throw new ApiException("Missing the required parameter 'paymentContainerId' when calling paymentContainerspaymentContainersIdAssignSecondaryIdDelete(Async)");
        }
        // verify the required parameter 'secondaryPaymentContainerId' is set
        if (secondaryPaymentContainerId == null) {
            throw new ApiException("Missing the required parameter 'secondaryPaymentContainerId' when calling paymentContainerspaymentContainersIdAssignSecondaryIdDelete(Async)");
        }
        
        com.squareup.okhttp.Call call = paymentContainerspaymentContainersIdAssignSecondaryIdDeleteCall(paymentContainerId, secondaryPaymentContainerId, progressListener, progressRequestListener);
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
    public List<PaymentContainersProductModel> paymentContainerspaymentContainersIdAssignSecondaryIdDelete(String paymentContainerId, String secondaryPaymentContainerId) throws ApiException {
        ApiResponse<List<PaymentContainersProductModel>> resp = paymentContainerspaymentContainersIdAssignSecondaryIdDeleteWithHttpInfo(paymentContainerId, secondaryPaymentContainerId);
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
    public ApiResponse<List<PaymentContainersProductModel>> paymentContainerspaymentContainersIdAssignSecondaryIdDeleteWithHttpInfo(String paymentContainerId, String secondaryPaymentContainerId) throws ApiException {
        com.squareup.okhttp.Call call = paymentContainerspaymentContainersIdAssignSecondaryIdDeleteValidateBeforeCall(paymentContainerId, secondaryPaymentContainerId, null, null);
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
    public com.squareup.okhttp.Call paymentContainerspaymentContainersIdAssignSecondaryIdDeleteAsync(String paymentContainerId, String secondaryPaymentContainerId, final ApiCallback<List<PaymentContainersProductModel>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = paymentContainerspaymentContainersIdAssignSecondaryIdDeleteValidateBeforeCall(paymentContainerId, secondaryPaymentContainerId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<PaymentContainersProductModel>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for paymentContainerspaymentContainersIdAssignSecondaryIdPost
     * @param paymentContainerId Payment container id (required)
     * @param secondaryPaymentContainerId Id to which container will be assigned (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call paymentContainerspaymentContainersIdAssignSecondaryIdPostCall(String paymentContainerId, String secondaryPaymentContainerId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Payment/Containers/{paymentContainerId}/assign/{secondaryPaymentContainerId}"
            .replaceAll("\\{" + "paymentContainerId" + "\\}", apiClient.escapeString(paymentContainerId.toString()))
            .replaceAll("\\{" + "secondaryPaymentContainerId" + "\\}", apiClient.escapeString(secondaryPaymentContainerId.toString()));

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
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call paymentContainerspaymentContainersIdAssignSecondaryIdPostValidateBeforeCall(String paymentContainerId, String secondaryPaymentContainerId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'paymentContainerId' is set
        if (paymentContainerId == null) {
            throw new ApiException("Missing the required parameter 'paymentContainerId' when calling paymentContainerspaymentContainersIdAssignSecondaryIdPost(Async)");
        }
        // verify the required parameter 'secondaryPaymentContainerId' is set
        if (secondaryPaymentContainerId == null) {
            throw new ApiException("Missing the required parameter 'secondaryPaymentContainerId' when calling paymentContainerspaymentContainersIdAssignSecondaryIdPost(Async)");
        }
        
        com.squareup.okhttp.Call call = paymentContainerspaymentContainersIdAssignSecondaryIdPostCall(paymentContainerId, secondaryPaymentContainerId, progressListener, progressRequestListener);
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
    public PaymentContainersProductModel paymentContainerspaymentContainersIdAssignSecondaryIdPost(String paymentContainerId, String secondaryPaymentContainerId) throws ApiException {
        ApiResponse<PaymentContainersProductModel> resp = paymentContainerspaymentContainersIdAssignSecondaryIdPostWithHttpInfo(paymentContainerId, secondaryPaymentContainerId);
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
    public ApiResponse<PaymentContainersProductModel> paymentContainerspaymentContainersIdAssignSecondaryIdPostWithHttpInfo(String paymentContainerId, String secondaryPaymentContainerId) throws ApiException {
        com.squareup.okhttp.Call call = paymentContainerspaymentContainersIdAssignSecondaryIdPostValidateBeforeCall(paymentContainerId, secondaryPaymentContainerId, null, null);
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
    public com.squareup.okhttp.Call paymentContainerspaymentContainersIdAssignSecondaryIdPostAsync(String paymentContainerId, String secondaryPaymentContainerId, final ApiCallback<PaymentContainersProductModel> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = paymentContainerspaymentContainersIdAssignSecondaryIdPostValidateBeforeCall(paymentContainerId, secondaryPaymentContainerId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<PaymentContainersProductModel>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for paymentContainerspaymentContainersIdDelete
     * @param paymentContainerId Payment container id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call paymentContainerspaymentContainersIdDeleteCall(String paymentContainerId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Payment/Containers/{paymentContainerId}"
            .replaceAll("\\{" + "paymentContainerId" + "\\}", apiClient.escapeString(paymentContainerId.toString()));

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
    private com.squareup.okhttp.Call paymentContainerspaymentContainersIdDeleteValidateBeforeCall(String paymentContainerId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'paymentContainerId' is set
        if (paymentContainerId == null) {
            throw new ApiException("Missing the required parameter 'paymentContainerId' when calling paymentContainerspaymentContainersIdDelete(Async)");
        }
        
        com.squareup.okhttp.Call call = paymentContainerspaymentContainersIdDeleteCall(paymentContainerId, progressListener, progressRequestListener);
        return call;
    }

    /**
     * DELETE Payment/Containers/{paymentContainerId}
     * Delete payment container
     * @param paymentContainerId Payment container id (required)
     * @return List&lt;PaymentContainersProductModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<PaymentContainersProductModel> paymentContainerspaymentContainersIdDelete(String paymentContainerId) throws ApiException {
        ApiResponse<List<PaymentContainersProductModel>> resp = paymentContainerspaymentContainersIdDeleteWithHttpInfo(paymentContainerId);
        return resp.getData();
    }

    /**
     * DELETE Payment/Containers/{paymentContainerId}
     * Delete payment container
     * @param paymentContainerId Payment container id (required)
     * @return ApiResponse&lt;List&lt;PaymentContainersProductModel&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<PaymentContainersProductModel>> paymentContainerspaymentContainersIdDeleteWithHttpInfo(String paymentContainerId) throws ApiException {
        com.squareup.okhttp.Call call = paymentContainerspaymentContainersIdDeleteValidateBeforeCall(paymentContainerId, null, null);
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
    public com.squareup.okhttp.Call paymentContainerspaymentContainersIdDeleteAsync(String paymentContainerId, final ApiCallback<List<PaymentContainersProductModel>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = paymentContainerspaymentContainersIdDeleteValidateBeforeCall(paymentContainerId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<PaymentContainersProductModel>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for paymentContainerspaymentContainersIdPut
     * @param paymentContainerId Payment container id (required)
     * @param body Payment container properties (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call paymentContainerspaymentContainersIdPutCall(String paymentContainerId, PaymentContainersDTO body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/Payment/Containers/{paymentContainerId}"
            .replaceAll("\\{" + "paymentContainerId" + "\\}", apiClient.escapeString(paymentContainerId.toString()));

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
    private com.squareup.okhttp.Call paymentContainerspaymentContainersIdPutValidateBeforeCall(String paymentContainerId, PaymentContainersDTO body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'paymentContainerId' is set
        if (paymentContainerId == null) {
            throw new ApiException("Missing the required parameter 'paymentContainerId' when calling paymentContainerspaymentContainersIdPut(Async)");
        }
        
        com.squareup.okhttp.Call call = paymentContainerspaymentContainersIdPutCall(paymentContainerId, body, progressListener, progressRequestListener);
        return call;
    }

    /**
     * PUT Payment/Containers/{paymentContainerId}
     * Update payment container
     * @param paymentContainerId Payment container id (required)
     * @param body Payment container properties (optional)
     * @return PaymentContainersProductModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PaymentContainersProductModel paymentContainerspaymentContainersIdPut(String paymentContainerId, PaymentContainersDTO body) throws ApiException {
        ApiResponse<PaymentContainersProductModel> resp = paymentContainerspaymentContainersIdPutWithHttpInfo(paymentContainerId, body);
        return resp.getData();
    }

    /**
     * PUT Payment/Containers/{paymentContainerId}
     * Update payment container
     * @param paymentContainerId Payment container id (required)
     * @param body Payment container properties (optional)
     * @return ApiResponse&lt;PaymentContainersProductModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PaymentContainersProductModel> paymentContainerspaymentContainersIdPutWithHttpInfo(String paymentContainerId, PaymentContainersDTO body) throws ApiException {
        com.squareup.okhttp.Call call = paymentContainerspaymentContainersIdPutValidateBeforeCall(paymentContainerId, body, null, null);
        Type localVarReturnType = new TypeToken<PaymentContainersProductModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * PUT Payment/Containers/{paymentContainerId} (asynchronously)
     * Update payment container
     * @param paymentContainerId Payment container id (required)
     * @param body Payment container properties (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call paymentContainerspaymentContainersIdPutAsync(String paymentContainerId, PaymentContainersDTO body, final ApiCallback<PaymentContainersProductModel> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = paymentContainerspaymentContainersIdPutValidateBeforeCall(paymentContainerId, body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<PaymentContainersProductModel>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for paymentContainerspaymentContainersPost
     * @param body Payment container properties (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call paymentContainerspaymentContainersPostCall(PaymentContainersDTO body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/Payment/Containers";

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
    private com.squareup.okhttp.Call paymentContainerspaymentContainersPostValidateBeforeCall(PaymentContainersDTO body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = paymentContainerspaymentContainersPostCall(body, progressListener, progressRequestListener);
        return call;
    }

    /**
     * POST Payment/Containers
     * Add new containers
     * @param body Payment container properties (optional)
     * @return PaymentContainersProductModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PaymentContainersProductModel paymentContainerspaymentContainersPost(PaymentContainersDTO body) throws ApiException {
        ApiResponse<PaymentContainersProductModel> resp = paymentContainerspaymentContainersPostWithHttpInfo(body);
        return resp.getData();
    }

    /**
     * POST Payment/Containers
     * Add new containers
     * @param body Payment container properties (optional)
     * @return ApiResponse&lt;PaymentContainersProductModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PaymentContainersProductModel> paymentContainerspaymentContainersPostWithHttpInfo(PaymentContainersDTO body) throws ApiException {
        com.squareup.okhttp.Call call = paymentContainerspaymentContainersPostValidateBeforeCall(body, null, null);
        Type localVarReturnType = new TypeToken<PaymentContainersProductModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * POST Payment/Containers (asynchronously)
     * Add new containers
     * @param body Payment container properties (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call paymentContainerspaymentContainersPostAsync(PaymentContainersDTO body, final ApiCallback<PaymentContainersProductModel> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = paymentContainerspaymentContainersPostValidateBeforeCall(body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<PaymentContainersProductModel>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}

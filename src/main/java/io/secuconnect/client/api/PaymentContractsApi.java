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
import io.secuconnect.client.model.PaymentContractsDTO;
import io.secuconnect.client.model.PaymentContractsDTOClone;
import io.secuconnect.client.model.PaymentContractsDTORequestId;
import io.secuconnect.client.model.PaymentContractsList;
import io.secuconnect.client.model.PaymentContractsProductModel;
import io.secuconnect.client.model.PaymentContractsRequestIdResult;
import io.secuconnect.client.model.ProductExceptionPayload;
import io.secuconnect.client.model.StringList;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PaymentContractsApi {
    private ApiClient apiClient;

    public PaymentContractsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public PaymentContractsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for clone
     * @param paymentContractId Contract identifier (required)
     * @param body Payment contract clone properties
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call cloneCall(String paymentContractId, PaymentContractsDTOClone body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/Payment/Contracts/{paymentContractId}/clone"
            .replaceAll("\\{" + "paymentContractId" + "\\}", apiClient.escapeString(paymentContractId.toString()));

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
    private com.squareup.okhttp.Call cloneValidateBeforeCall(String paymentContractId, PaymentContractsDTOClone body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'paymentContractId' is set
        if (paymentContractId == null) {
            throw new ApiException("Missing the required parameter 'paymentContractId' when calling clone(Async)");
        }
        
        com.squareup.okhttp.Call call = cloneCall(paymentContractId, body, progressListener, progressRequestListener);
        return call;
    }

    /**
     * POST Payment/Contracts/{paymentContractId}/clone
     * Clone an existing payment contract
     * @param paymentContractId Contract identifier (required)
     * @param body Payment contract clone properties
     * @return PaymentContractsProductModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PaymentContractsProductModel clone(String paymentContractId, PaymentContractsDTOClone body) throws ApiException {
        ApiResponse<PaymentContractsProductModel> resp = cloneWithHttpInfo(paymentContractId, body);
        return resp.getData();
    }

    /**
     * POST Payment/Contracts/{paymentContractId}/clone
     * Clone an existing payment contract
     * @param paymentContractId Contract identifier (required)
     * @param body Payment contract clone properties
     * @return ApiResponse&lt;PaymentContractsProductModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PaymentContractsProductModel> cloneWithHttpInfo(String paymentContractId, PaymentContractsDTOClone body) throws ApiException {
        com.squareup.okhttp.Call call = cloneValidateBeforeCall(paymentContractId, body, null, null);
        Type localVarReturnType = new TypeToken<PaymentContractsProductModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * POST Payment/Contracts/{paymentContractId}/clone (asynchronously)
     * Clone an existing payment contract
     * @param paymentContractId Contract identifier (required)
     * @param body Payment contract clone properties
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call cloneAsync(String paymentContractId, PaymentContractsDTOClone body, final ApiCallback<PaymentContractsProductModel> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = cloneValidateBeforeCall(paymentContractId, body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<PaymentContractsProductModel>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for paymentContractsGet
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
    public com.squareup.okhttp.Call paymentContractsGetCall(Integer count, Integer offset, String fields, String q, String sort, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Payment/Contracts";

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
    private com.squareup.okhttp.Call paymentContractsGetValidateBeforeCall(Integer count, Integer offset, String fields, String q, String sort, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = paymentContractsGetCall(count, offset, fields, q, sort, progressListener, progressRequestListener);
        return call;
    }

    /**
     * GET Payment/Contracts
     * Get a list of payment contracts
     * @param count The number of items to return.
     * @param offset The position within the whole result set to start returning items (First element is at 0).
     * @param fields List of fields to include in the result. Nested properties can be accessed with this notation: prop1.prop2  Example: prop3,prop1.prop2
     * @param q A query string to restrict the returned items to given conditions. The query string must consist of any combination of single expressions in the form property:condition.  *                   A condition may contain:  *                       - wildcard \&quot;*\&quot; for any number of characters  *                       - wildcard \&quot;?\&quot; for one character  *                       - ranges in the form [value TO value]  *  *                   Single expressions may combined by &#x27;AND&#x27;, &#x27;OR&#x27;, &#x27;NOT&#x27; operators and parenthesis &#x27;(&#x27;, &#x27;)&#x27; for grouping.  *                   Property names can be nested like \&quot;prop1.prop2\&quot;.  *                   Example: (NOT customer.name:meier*) AND (customer.age:[30 TO 40] OR customer.age:[50 TO 60])  *                   
     * @param sort String with comma separated pairs of field:order (e.g. contact.surname:asc,contact.comapnyname:desc). Result set will be sorted by included fields, in ascending &#x27;asc&#x27;, or descending &#x27;dsc&#x27; order.
     * @return PaymentContractsList
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PaymentContractsList paymentContractsGet(Integer count, Integer offset, String fields, String q, String sort) throws ApiException {
        ApiResponse<PaymentContractsList> resp = paymentContractsGetWithHttpInfo(count, offset, fields, q, sort);
        return resp.getData();
    }

    /**
     * GET Payment/Contracts
     * Get a list of payment contracts
     * @param count The number of items to return.
     * @param offset The position within the whole result set to start returning items (First element is at 0).
     * @param fields List of fields to include in the result. Nested properties can be accessed with this notation: prop1.prop2  Example: prop3,prop1.prop2
     * @param q A query string to restrict the returned items to given conditions. The query string must consist of any combination of single expressions in the form property:condition.  *                   A condition may contain:  *                       - wildcard \&quot;*\&quot; for any number of characters  *                       - wildcard \&quot;?\&quot; for one character  *                       - ranges in the form [value TO value]  *  *                   Single expressions may combined by &#x27;AND&#x27;, &#x27;OR&#x27;, &#x27;NOT&#x27; operators and parenthesis &#x27;(&#x27;, &#x27;)&#x27; for grouping.  *                   Property names can be nested like \&quot;prop1.prop2\&quot;.  *                   Example: (NOT customer.name:meier*) AND (customer.age:[30 TO 40] OR customer.age:[50 TO 60])  *                   
     * @param sort String with comma separated pairs of field:order (e.g. contact.surname:asc,contact.comapnyname:desc). Result set will be sorted by included fields, in ascending &#x27;asc&#x27;, or descending &#x27;dsc&#x27; order.
     * @return ApiResponse&lt;PaymentContractsList&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PaymentContractsList> paymentContractsGetWithHttpInfo(Integer count, Integer offset, String fields, String q, String sort) throws ApiException {
        com.squareup.okhttp.Call call = paymentContractsGetValidateBeforeCall(count, offset, fields, q, sort, null, null);
        Type localVarReturnType = new TypeToken<PaymentContractsList>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * GET Payment/Contracts (asynchronously)
     * Get a list of payment contracts
     * @param count The number of items to return.
     * @param offset The position within the whole result set to start returning items (First element is at 0).
     * @param fields List of fields to include in the result. Nested properties can be accessed with this notation: prop1.prop2  Example: prop3,prop1.prop2
     * @param q A query string to restrict the returned items to given conditions. The query string must consist of any combination of single expressions in the form property:condition.  *                   A condition may contain:  *                       - wildcard \&quot;*\&quot; for any number of characters  *                       - wildcard \&quot;?\&quot; for one character  *                       - ranges in the form [value TO value]  *  *                   Single expressions may combined by &#x27;AND&#x27;, &#x27;OR&#x27;, &#x27;NOT&#x27; operators and parenthesis &#x27;(&#x27;, &#x27;)&#x27; for grouping.  *                   Property names can be nested like \&quot;prop1.prop2\&quot;.  *                   Example: (NOT customer.name:meier*) AND (customer.age:[30 TO 40] OR customer.age:[50 TO 60])  *                   
     * @param sort String with comma separated pairs of field:order (e.g. contact.surname:asc,contact.comapnyname:desc). Result set will be sorted by included fields, in ascending &#x27;asc&#x27;, or descending &#x27;dsc&#x27; order.
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call paymentContractsGetAsync(Integer count, Integer offset, String fields, String q, String sort, final ApiCallback<PaymentContractsList> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = paymentContractsGetValidateBeforeCall(count, offset, fields, q, sort, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<PaymentContractsList>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for paymentContractsGetById
     * @param paymentContractId Search one by provided id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call paymentContractsGetByIdCall(String paymentContractId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Payment/Contracts/{paymentContractId}"
            .replaceAll("\\{" + "paymentContractId" + "\\}", apiClient.escapeString(paymentContractId.toString()));

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
    private com.squareup.okhttp.Call paymentContractsGetByIdValidateBeforeCall(String paymentContractId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'paymentContractId' is set
        if (paymentContractId == null) {
            throw new ApiException("Missing the required parameter 'paymentContractId' when calling paymentContractsGetById(Async)");
        }
        
        com.squareup.okhttp.Call call = paymentContractsGetByIdCall(paymentContractId, progressListener, progressRequestListener);
        return call;
    }

    /**
     * GET Payment/Contracts/{paymentContractId}
     * Get all payment contracts
     * @param paymentContractId Search one by provided id (required)
     * @return PaymentContractsProductModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PaymentContractsProductModel paymentContractsGetById(String paymentContractId) throws ApiException {
        ApiResponse<PaymentContractsProductModel> resp = paymentContractsGetByIdWithHttpInfo(paymentContractId);
        return resp.getData();
    }

    /**
     * GET Payment/Contracts/{paymentContractId}
     * Get all payment contracts
     * @param paymentContractId Search one by provided id (required)
     * @return ApiResponse&lt;PaymentContractsProductModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PaymentContractsProductModel> paymentContractsGetByIdWithHttpInfo(String paymentContractId) throws ApiException {
        com.squareup.okhttp.Call call = paymentContractsGetByIdValidateBeforeCall(paymentContractId, null, null);
        Type localVarReturnType = new TypeToken<PaymentContractsProductModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * GET Payment/Contracts/{paymentContractId} (asynchronously)
     * Get all payment contracts
     * @param paymentContractId Search one by provided id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call paymentContractsGetByIdAsync(String paymentContractId, final ApiCallback<PaymentContractsProductModel> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = paymentContractsGetByIdValidateBeforeCall(paymentContractId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<PaymentContractsProductModel>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for paymentContractsIdDelete
     * @param paymentContractId Payment contract id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call paymentContractsIdDeleteCall(String paymentContractId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Payment/Contracts/{paymentContractId}"
            .replaceAll("\\{" + "paymentContractId" + "\\}", apiClient.escapeString(paymentContractId.toString()));

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
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call paymentContractsIdDeleteValidateBeforeCall(String paymentContractId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'paymentContractId' is set
        if (paymentContractId == null) {
            throw new ApiException("Missing the required parameter 'paymentContractId' when calling paymentContractsIdDelete(Async)");
        }
        
        com.squareup.okhttp.Call call = paymentContractsIdDeleteCall(paymentContractId, progressListener, progressRequestListener);
        return call;
    }

    /**
     * DELETE Payment/Contracts/{paymentContractId}
     * Delete payment contract
     * @param paymentContractId Payment contract id (required)
     * @return List&lt;PaymentContractsProductModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<PaymentContractsProductModel> paymentContractsIdDelete(String paymentContractId) throws ApiException {
        ApiResponse<List<PaymentContractsProductModel>> resp = paymentContractsIdDeleteWithHttpInfo(paymentContractId);
        return resp.getData();
    }

    /**
     * DELETE Payment/Contracts/{paymentContractId}
     * Delete payment contract
     * @param paymentContractId Payment contract id (required)
     * @return ApiResponse&lt;List&lt;PaymentContractsProductModel&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<PaymentContractsProductModel>> paymentContractsIdDeleteWithHttpInfo(String paymentContractId) throws ApiException {
        com.squareup.okhttp.Call call = paymentContractsIdDeleteValidateBeforeCall(paymentContractId, null, null);
        Type localVarReturnType = new TypeToken<List<PaymentContractsProductModel>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * DELETE Payment/Contracts/{paymentContractId} (asynchronously)
     * Delete payment contract
     * @param paymentContractId Payment contract id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call paymentContractsIdDeleteAsync(String paymentContractId, final ApiCallback<List<PaymentContractsProductModel>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = paymentContractsIdDeleteValidateBeforeCall(paymentContractId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<PaymentContractsProductModel>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for paymentContractsIdPaymentMethodsGet
     * @param paymentContractId Contract identifier (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call paymentContractsIdPaymentMethodsGetCall(String paymentContractId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Payment/Contracts/{paymentContractId}/paymentMethods"
            .replaceAll("\\{" + "paymentContractId" + "\\}", apiClient.escapeString(paymentContractId.toString()));

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
    private com.squareup.okhttp.Call paymentContractsIdPaymentMethodsGetValidateBeforeCall(String paymentContractId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'paymentContractId' is set
        if (paymentContractId == null) {
            throw new ApiException("Missing the required parameter 'paymentContractId' when calling paymentContractsIdPaymentMethodsGet(Async)");
        }
        
        com.squareup.okhttp.Call call = paymentContractsIdPaymentMethodsGetCall(paymentContractId, progressListener, progressRequestListener);
        return call;
    }

    /**
     * GET Payment/Contracts/{paymentContractId}/paymentMethods
     * Get available payment methods for given contract
     * @param paymentContractId Contract identifier (required)
     * @return StringList
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public StringList paymentContractsIdPaymentMethodsGet(String paymentContractId) throws ApiException {
        ApiResponse<StringList> resp = paymentContractsIdPaymentMethodsGetWithHttpInfo(paymentContractId);
        return resp.getData();
    }

    /**
     * GET Payment/Contracts/{paymentContractId}/paymentMethods
     * Get available payment methods for given contract
     * @param paymentContractId Contract identifier (required)
     * @return ApiResponse&lt;StringList&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<StringList> paymentContractsIdPaymentMethodsGetWithHttpInfo(String paymentContractId) throws ApiException {
        com.squareup.okhttp.Call call = paymentContractsIdPaymentMethodsGetValidateBeforeCall(paymentContractId, null, null);
        Type localVarReturnType = new TypeToken<StringList>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * GET Payment/Contracts/{paymentContractId}/paymentMethods (asynchronously)
     * Get available payment methods for given contract
     * @param paymentContractId Contract identifier (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call paymentContractsIdPaymentMethodsGetAsync(String paymentContractId, final ApiCallback<StringList> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = paymentContractsIdPaymentMethodsGetValidateBeforeCall(paymentContractId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<StringList>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for paymentContractsIdPut
     * @param paymentContractId Payment contract id (required)
     * @param body Payment contracts properties
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call paymentContractsIdPutCall(String paymentContractId, PaymentContractsDTO body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/Payment/Contracts/{paymentContractId}"
            .replaceAll("\\{" + "paymentContractId" + "\\}", apiClient.escapeString(paymentContractId.toString()));

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
    private com.squareup.okhttp.Call paymentContractsIdPutValidateBeforeCall(String paymentContractId, PaymentContractsDTO body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'paymentContractId' is set
        if (paymentContractId == null) {
            throw new ApiException("Missing the required parameter 'paymentContractId' when calling paymentContractsIdPut(Async)");
        }
        
        com.squareup.okhttp.Call call = paymentContractsIdPutCall(paymentContractId, body, progressListener, progressRequestListener);
        return call;
    }

    /**
     * PUT Payment/Contracts/{paymentContractId}
     * Update payment contract
     * @param paymentContractId Payment contract id (required)
     * @param body Payment contracts properties
     * @return PaymentContractsProductModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PaymentContractsProductModel paymentContractsIdPut(String paymentContractId, PaymentContractsDTO body) throws ApiException {
        ApiResponse<PaymentContractsProductModel> resp = paymentContractsIdPutWithHttpInfo(paymentContractId, body);
        return resp.getData();
    }

    /**
     * PUT Payment/Contracts/{paymentContractId}
     * Update payment contract
     * @param paymentContractId Payment contract id (required)
     * @param body Payment contracts properties
     * @return ApiResponse&lt;PaymentContractsProductModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PaymentContractsProductModel> paymentContractsIdPutWithHttpInfo(String paymentContractId, PaymentContractsDTO body) throws ApiException {
        com.squareup.okhttp.Call call = paymentContractsIdPutValidateBeforeCall(paymentContractId, body, null, null);
        Type localVarReturnType = new TypeToken<PaymentContractsProductModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * PUT Payment/Contracts/{paymentContractId} (asynchronously)
     * Update payment contract
     * @param paymentContractId Payment contract id (required)
     * @param body Payment contracts properties
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call paymentContractsIdPutAsync(String paymentContractId, PaymentContractsDTO body, final ApiCallback<PaymentContractsProductModel> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = paymentContractsIdPutValidateBeforeCall(paymentContractId, body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<PaymentContractsProductModel>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for paymentContractsPost
     * @param body Payment contracts properties
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call paymentContractsPostCall(PaymentContractsDTO body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/Payment/Contracts";

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
    private com.squareup.okhttp.Call paymentContractsPostValidateBeforeCall(PaymentContractsDTO body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = paymentContractsPostCall(body, progressListener, progressRequestListener);
        return call;
    }

    /**
     * POST Payment/Contracts
     * Add new contract
     * @param body Payment contracts properties
     * @return PaymentContractsProductModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PaymentContractsProductModel paymentContractsPost(PaymentContractsDTO body) throws ApiException {
        ApiResponse<PaymentContractsProductModel> resp = paymentContractsPostWithHttpInfo(body);
        return resp.getData();
    }

    /**
     * POST Payment/Contracts
     * Add new contract
     * @param body Payment contracts properties
     * @return ApiResponse&lt;PaymentContractsProductModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PaymentContractsProductModel> paymentContractsPostWithHttpInfo(PaymentContractsDTO body) throws ApiException {
        com.squareup.okhttp.Call call = paymentContractsPostValidateBeforeCall(body, null, null);
        Type localVarReturnType = new TypeToken<PaymentContractsProductModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * POST Payment/Contracts (asynchronously)
     * Add new contract
     * @param body Payment contracts properties
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call paymentContractsPostAsync(PaymentContractsDTO body, final ApiCallback<PaymentContractsProductModel> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = paymentContractsPostValidateBeforeCall(body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<PaymentContractsProductModel>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for requestId
     * @param paymentContractId Contract identifier of the parent (required)
     * @param body Payment contract request id properties
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call requestIdCall(String paymentContractId, PaymentContractsDTORequestId body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/Payment/Contracts/{paymentContractId}/requestId"
            .replaceAll("\\{" + "paymentContractId" + "\\}", apiClient.escapeString(paymentContractId.toString()));

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
    private com.squareup.okhttp.Call requestIdValidateBeforeCall(String paymentContractId, PaymentContractsDTORequestId body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'paymentContractId' is set
        if (paymentContractId == null) {
            throw new ApiException("Missing the required parameter 'paymentContractId' when calling requestId(Async)");
        }
        
        com.squareup.okhttp.Call call = requestIdCall(paymentContractId, body, progressListener, progressRequestListener);
        return call;
    }

    /**
     * POST Payment/Contracts/{paymentContractId}/requestId
     * This method clones your payment contract, so that you can use this to separate the merchants of your marketplace. (Needs to be activated))
     * @param paymentContractId Contract identifier of the parent (required)
     * @param body Payment contract request id properties
     * @return PaymentContractsRequestIdResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PaymentContractsRequestIdResult requestId(String paymentContractId, PaymentContractsDTORequestId body) throws ApiException {
        ApiResponse<PaymentContractsRequestIdResult> resp = requestIdWithHttpInfo(paymentContractId, body);
        return resp.getData();
    }

    /**
     * POST Payment/Contracts/{paymentContractId}/requestId
     * This method clones your payment contract, so that you can use this to separate the merchants of your marketplace. (Needs to be activated))
     * @param paymentContractId Contract identifier of the parent (required)
     * @param body Payment contract request id properties
     * @return ApiResponse&lt;PaymentContractsRequestIdResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PaymentContractsRequestIdResult> requestIdWithHttpInfo(String paymentContractId, PaymentContractsDTORequestId body) throws ApiException {
        com.squareup.okhttp.Call call = requestIdValidateBeforeCall(paymentContractId, body, null, null);
        Type localVarReturnType = new TypeToken<PaymentContractsRequestIdResult>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * POST Payment/Contracts/{paymentContractId}/requestId (asynchronously)
     * This method clones your payment contract, so that you can use this to separate the merchants of your marketplace. (Needs to be activated))
     * @param paymentContractId Contract identifier of the parent (required)
     * @param body Payment contract request id properties
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call requestIdAsync(String paymentContractId, PaymentContractsDTORequestId body, final ApiCallback<PaymentContractsRequestIdResult> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = requestIdValidateBeforeCall(paymentContractId, body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<PaymentContractsRequestIdResult>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}

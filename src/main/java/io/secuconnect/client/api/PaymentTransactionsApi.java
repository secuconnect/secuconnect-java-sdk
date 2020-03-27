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

import io.secuconnect.client.model.PaymentTransactionCancelDTO;
import io.secuconnect.client.model.PaymentTransactionsCancelList;
import io.secuconnect.client.model.PaymentTransactionsList;
import io.secuconnect.client.model.PaymentTransactionsProductModel;
import io.secuconnect.client.model.PaymentTransactionsShippingUrl;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PaymentTransactionsApi {
    private ApiClient apiClient;

    public PaymentTransactionsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public PaymentTransactionsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for paymentTransactionscancel
     * @param paymentTransactionId Payment transaction id (required)
     * @param body Cancel payment transaction input properties (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call paymentTransactionscancelCall(String paymentTransactionId, PaymentTransactionCancelDTO body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/Payment/Transactions/{paymentTransactionId}/cancel"
            .replaceAll("\\{" + "paymentTransactionId" + "\\}", apiClient.escapeString(paymentTransactionId.toString()));

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
    private com.squareup.okhttp.Call paymentTransactionscancelValidateBeforeCall(String paymentTransactionId, PaymentTransactionCancelDTO body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'paymentTransactionId' is set
        if (paymentTransactionId == null) {
            throw new ApiException("Missing the required parameter 'paymentTransactionId' when calling paymentTransactionscancel(Async)");
        }
        
        com.squareup.okhttp.Call call = paymentTransactionscancelCall(paymentTransactionId, body, progressListener, progressRequestListener);
        return call;
    }

    /**
     * POST Payment/Transactions/{paymentTransactionId}/cancel
     * Cancel a payment transaction
     * @param paymentTransactionId Payment transaction id (required)
     * @param body Cancel payment transaction input properties (optional)
     * @return PaymentTransactionsCancelList
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PaymentTransactionsCancelList paymentTransactionscancel(String paymentTransactionId, PaymentTransactionCancelDTO body) throws ApiException {
        ApiResponse<PaymentTransactionsCancelList> resp = paymentTransactionscancelWithHttpInfo(paymentTransactionId, body);
        return resp.getData();
    }

    /**
     * POST Payment/Transactions/{paymentTransactionId}/cancel
     * Cancel a payment transaction
     * @param paymentTransactionId Payment transaction id (required)
     * @param body Cancel payment transaction input properties (optional)
     * @return ApiResponse&lt;PaymentTransactionsCancelList&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PaymentTransactionsCancelList> paymentTransactionscancelWithHttpInfo(String paymentTransactionId, PaymentTransactionCancelDTO body) throws ApiException {
        com.squareup.okhttp.Call call = paymentTransactionscancelValidateBeforeCall(paymentTransactionId, body, null, null);
        Type localVarReturnType = new TypeToken<PaymentTransactionsCancelList>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * POST Payment/Transactions/{paymentTransactionId}/cancel (asynchronously)
     * Cancel a payment transaction
     * @param paymentTransactionId Payment transaction id (required)
     * @param body Cancel payment transaction input properties (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call paymentTransactionscancelAsync(String paymentTransactionId, PaymentTransactionCancelDTO body, final ApiCallback<PaymentTransactionsCancelList> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = paymentTransactionscancelValidateBeforeCall(paymentTransactionId, body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<PaymentTransactionsCancelList>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for paymentTransactionsgetAll
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
    public com.squareup.okhttp.Call paymentTransactionsgetAllCall(Integer count, Integer offset, String fields, String q, String sort, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Payment/Transactions";

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
    private com.squareup.okhttp.Call paymentTransactionsgetAllValidateBeforeCall(Integer count, Integer offset, String fields, String q, String sort, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = paymentTransactionsgetAllCall(count, offset, fields, q, sort, progressListener, progressRequestListener);
        return call;
    }

    /**
     * GET Payment/Transactions
     * Get a list of payment transactions
     * @param count The number of items to return. (optional)
     * @param offset The position within the whole result set to start returning items (First element is at 0). (optional)
     * @param fields List of fields to include in the result. Nested properties can be accessed with this notation: prop1.prop2  Example: prop3,prop1.prop2 (optional)
     * @param q A query string to restrict the returned items to given conditions. The query string must consist of any combination of single expressions in the form property:condition.  *                   A condition may contain:  *                       - wildcard \&quot;*\&quot; for any number of characters  *                       - wildcard \&quot;?\&quot; for one character  *                       - ranges in the form [value TO value]  *  *                   Single expressions may combined by &#x27;AND&#x27;, &#x27;OR&#x27;, &#x27;NOT&#x27; operators and parenthesis &#x27;(&#x27;, &#x27;)&#x27; for grouping.  *                   Property names can be nested like \&quot;prop1.prop2\&quot;.  *                   Example: (NOT customer.name:meier*) AND (customer.age:[30 TO 40] OR customer.age:[50 TO 60])  *                    (optional)
     * @param sort String with comma separated pairs of field:order (e.g. contact.surname:asc,contact.comapnyname:desc). Result set will be sorted by included fields, in ascending &#x27;asc&#x27;, or descending &#x27;dsc&#x27; order. (optional)
     * @return PaymentTransactionsList
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PaymentTransactionsList paymentTransactionsgetAll(Integer count, Integer offset, String fields, String q, String sort) throws ApiException {
        ApiResponse<PaymentTransactionsList> resp = paymentTransactionsgetAllWithHttpInfo(count, offset, fields, q, sort);
        return resp.getData();
    }

    /**
     * GET Payment/Transactions
     * Get a list of payment transactions
     * @param count The number of items to return. (optional)
     * @param offset The position within the whole result set to start returning items (First element is at 0). (optional)
     * @param fields List of fields to include in the result. Nested properties can be accessed with this notation: prop1.prop2  Example: prop3,prop1.prop2 (optional)
     * @param q A query string to restrict the returned items to given conditions. The query string must consist of any combination of single expressions in the form property:condition.  *                   A condition may contain:  *                       - wildcard \&quot;*\&quot; for any number of characters  *                       - wildcard \&quot;?\&quot; for one character  *                       - ranges in the form [value TO value]  *  *                   Single expressions may combined by &#x27;AND&#x27;, &#x27;OR&#x27;, &#x27;NOT&#x27; operators and parenthesis &#x27;(&#x27;, &#x27;)&#x27; for grouping.  *                   Property names can be nested like \&quot;prop1.prop2\&quot;.  *                   Example: (NOT customer.name:meier*) AND (customer.age:[30 TO 40] OR customer.age:[50 TO 60])  *                    (optional)
     * @param sort String with comma separated pairs of field:order (e.g. contact.surname:asc,contact.comapnyname:desc). Result set will be sorted by included fields, in ascending &#x27;asc&#x27;, or descending &#x27;dsc&#x27; order. (optional)
     * @return ApiResponse&lt;PaymentTransactionsList&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PaymentTransactionsList> paymentTransactionsgetAllWithHttpInfo(Integer count, Integer offset, String fields, String q, String sort) throws ApiException {
        com.squareup.okhttp.Call call = paymentTransactionsgetAllValidateBeforeCall(count, offset, fields, q, sort, null, null);
        Type localVarReturnType = new TypeToken<PaymentTransactionsList>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * GET Payment/Transactions (asynchronously)
     * Get a list of payment transactions
     * @param count The number of items to return. (optional)
     * @param offset The position within the whole result set to start returning items (First element is at 0). (optional)
     * @param fields List of fields to include in the result. Nested properties can be accessed with this notation: prop1.prop2  Example: prop3,prop1.prop2 (optional)
     * @param q A query string to restrict the returned items to given conditions. The query string must consist of any combination of single expressions in the form property:condition.  *                   A condition may contain:  *                       - wildcard \&quot;*\&quot; for any number of characters  *                       - wildcard \&quot;?\&quot; for one character  *                       - ranges in the form [value TO value]  *  *                   Single expressions may combined by &#x27;AND&#x27;, &#x27;OR&#x27;, &#x27;NOT&#x27; operators and parenthesis &#x27;(&#x27;, &#x27;)&#x27; for grouping.  *                   Property names can be nested like \&quot;prop1.prop2\&quot;.  *                   Example: (NOT customer.name:meier*) AND (customer.age:[30 TO 40] OR customer.age:[50 TO 60])  *                    (optional)
     * @param sort String with comma separated pairs of field:order (e.g. contact.surname:asc,contact.comapnyname:desc). Result set will be sorted by included fields, in ascending &#x27;asc&#x27;, or descending &#x27;dsc&#x27; order. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call paymentTransactionsgetAllAsync(Integer count, Integer offset, String fields, String q, String sort, final ApiCallback<PaymentTransactionsList> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = paymentTransactionsgetAllValidateBeforeCall(count, offset, fields, q, sort, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<PaymentTransactionsList>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for paymentTransactionsgetOne
     * @param paymentTransactionId Payment transaction id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call paymentTransactionsgetOneCall(String paymentTransactionId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Payment/Transactions/{paymentTransactionId}"
            .replaceAll("\\{" + "paymentTransactionId" + "\\}", apiClient.escapeString(paymentTransactionId.toString()));

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
    private com.squareup.okhttp.Call paymentTransactionsgetOneValidateBeforeCall(String paymentTransactionId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'paymentTransactionId' is set
        if (paymentTransactionId == null) {
            throw new ApiException("Missing the required parameter 'paymentTransactionId' when calling paymentTransactionsgetOne(Async)");
        }
        
        com.squareup.okhttp.Call call = paymentTransactionsgetOneCall(paymentTransactionId, progressListener, progressRequestListener);
        return call;
    }

    /**
     * GET Payment/Transactions/{paymentTransactionId}
     * Get all payment transactions
     * @param paymentTransactionId Payment transaction id (required)
     * @return PaymentTransactionsProductModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PaymentTransactionsProductModel paymentTransactionsgetOne(String paymentTransactionId) throws ApiException {
        ApiResponse<PaymentTransactionsProductModel> resp = paymentTransactionsgetOneWithHttpInfo(paymentTransactionId);
        return resp.getData();
    }

    /**
     * GET Payment/Transactions/{paymentTransactionId}
     * Get all payment transactions
     * @param paymentTransactionId Payment transaction id (required)
     * @return ApiResponse&lt;PaymentTransactionsProductModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PaymentTransactionsProductModel> paymentTransactionsgetOneWithHttpInfo(String paymentTransactionId) throws ApiException {
        com.squareup.okhttp.Call call = paymentTransactionsgetOneValidateBeforeCall(paymentTransactionId, null, null);
        Type localVarReturnType = new TypeToken<PaymentTransactionsProductModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * GET Payment/Transactions/{paymentTransactionId} (asynchronously)
     * Get all payment transactions
     * @param paymentTransactionId Payment transaction id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call paymentTransactionsgetOneAsync(String paymentTransactionId, final ApiCallback<PaymentTransactionsProductModel> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = paymentTransactionsgetOneValidateBeforeCall(paymentTransactionId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<PaymentTransactionsProductModel>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for paymentTransactionsgetShippingUrl
     * @param paymentTransactionId Payment transaction id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call paymentTransactionsgetShippingUrlCall(String paymentTransactionId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Payment/Transactions/{paymentTransactionId}/shippingUrl"
            .replaceAll("\\{" + "paymentTransactionId" + "\\}", apiClient.escapeString(paymentTransactionId.toString()));

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
    private com.squareup.okhttp.Call paymentTransactionsgetShippingUrlValidateBeforeCall(String paymentTransactionId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'paymentTransactionId' is set
        if (paymentTransactionId == null) {
            throw new ApiException("Missing the required parameter 'paymentTransactionId' when calling paymentTransactionsgetShippingUrl(Async)");
        }
        
        com.squareup.okhttp.Call call = paymentTransactionsgetShippingUrlCall(paymentTransactionId, progressListener, progressRequestListener);
        return call;
    }

    /**
     * GET Payment/Transactions/{paymentTransactionId}/shippingUrl
     * Get the url where you can fill the shipping information
     * @param paymentTransactionId Payment transaction id (required)
     * @return PaymentTransactionsShippingUrl
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PaymentTransactionsShippingUrl paymentTransactionsgetShippingUrl(String paymentTransactionId) throws ApiException {
        ApiResponse<PaymentTransactionsShippingUrl> resp = paymentTransactionsgetShippingUrlWithHttpInfo(paymentTransactionId);
        return resp.getData();
    }

    /**
     * GET Payment/Transactions/{paymentTransactionId}/shippingUrl
     * Get the url where you can fill the shipping information
     * @param paymentTransactionId Payment transaction id (required)
     * @return ApiResponse&lt;PaymentTransactionsShippingUrl&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PaymentTransactionsShippingUrl> paymentTransactionsgetShippingUrlWithHttpInfo(String paymentTransactionId) throws ApiException {
        com.squareup.okhttp.Call call = paymentTransactionsgetShippingUrlValidateBeforeCall(paymentTransactionId, null, null);
        Type localVarReturnType = new TypeToken<PaymentTransactionsShippingUrl>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * GET Payment/Transactions/{paymentTransactionId}/shippingUrl (asynchronously)
     * Get the url where you can fill the shipping information
     * @param paymentTransactionId Payment transaction id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call paymentTransactionsgetShippingUrlAsync(String paymentTransactionId, final ApiCallback<PaymentTransactionsShippingUrl> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = paymentTransactionsgetShippingUrlValidateBeforeCall(paymentTransactionId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<PaymentTransactionsShippingUrl>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for paymentTransactionsrevokeAccrual
     * @param paymentTransactionId Payment transaction id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call paymentTransactionsrevokeAccrualCall(String paymentTransactionId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Payment/Transactions/{paymentTransactionId}/revokeAccrual"
            .replaceAll("\\{" + "paymentTransactionId" + "\\}", apiClient.escapeString(paymentTransactionId.toString()));

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
    private com.squareup.okhttp.Call paymentTransactionsrevokeAccrualValidateBeforeCall(String paymentTransactionId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'paymentTransactionId' is set
        if (paymentTransactionId == null) {
            throw new ApiException("Missing the required parameter 'paymentTransactionId' when calling paymentTransactionsrevokeAccrual(Async)");
        }
        
        com.squareup.okhttp.Call call = paymentTransactionsrevokeAccrualCall(paymentTransactionId, progressListener, progressRequestListener);
        return call;
    }

    /**
     * POST Payment/Transactions/{paymentTransactionId}/revokeAccrual
     * Revoke the accrual flag of a payment transaction
     * @param paymentTransactionId Payment transaction id (required)
     * @return PaymentTransactionsProductModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PaymentTransactionsProductModel paymentTransactionsrevokeAccrual(String paymentTransactionId) throws ApiException {
        ApiResponse<PaymentTransactionsProductModel> resp = paymentTransactionsrevokeAccrualWithHttpInfo(paymentTransactionId);
        return resp.getData();
    }

    /**
     * POST Payment/Transactions/{paymentTransactionId}/revokeAccrual
     * Revoke the accrual flag of a payment transaction
     * @param paymentTransactionId Payment transaction id (required)
     * @return ApiResponse&lt;PaymentTransactionsProductModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PaymentTransactionsProductModel> paymentTransactionsrevokeAccrualWithHttpInfo(String paymentTransactionId) throws ApiException {
        com.squareup.okhttp.Call call = paymentTransactionsrevokeAccrualValidateBeforeCall(paymentTransactionId, null, null);
        Type localVarReturnType = new TypeToken<PaymentTransactionsProductModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * POST Payment/Transactions/{paymentTransactionId}/revokeAccrual (asynchronously)
     * Revoke the accrual flag of a payment transaction
     * @param paymentTransactionId Payment transaction id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call paymentTransactionsrevokeAccrualAsync(String paymentTransactionId, final ApiCallback<PaymentTransactionsProductModel> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = paymentTransactionsrevokeAccrualValidateBeforeCall(paymentTransactionId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<PaymentTransactionsProductModel>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
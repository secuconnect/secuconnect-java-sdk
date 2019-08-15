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
import io.secuconnect.client.model.SmartTransactionsDTO;
import io.secuconnect.client.model.SmartTransactionsList;
import io.secuconnect.client.model.SmartTransactionsPreTransactionModel;
import io.secuconnect.client.model.SmartTransactionsPrepare;
import io.secuconnect.client.model.SmartTransactionsProductModel;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SmartTransactionsApi {
    private ApiClient apiClient;

    public SmartTransactionsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public SmartTransactionsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for addTransaction
     * @param smartTransactionProperties Smart transaction properties (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call addTransactionCall(SmartTransactionsDTO smartTransactionProperties, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = smartTransactionProperties;
        
        // create path and map variables
        String localVarPath = "/Smart/Transactions";

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
    private com.squareup.okhttp.Call addTransactionValidateBeforeCall(SmartTransactionsDTO smartTransactionProperties, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'smartTransactionProperties' is set
        if (smartTransactionProperties == null) {
            throw new ApiException("Missing the required parameter 'smartTransactionProperties' when calling addTransaction(Async)");
        }
        
        
        com.squareup.okhttp.Call call = addTransactionCall(smartTransactionProperties, progressListener, progressRequestListener);
        return call;
    }

    /**
     * POST Smart/Transactions
     * Create new smart transaction
     * @param smartTransactionProperties Smart transaction properties (required)
     * @return SmartTransactionsProductModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SmartTransactionsProductModel addTransaction(SmartTransactionsDTO smartTransactionProperties) throws ApiException {
        ApiResponse<SmartTransactionsProductModel> resp = addTransactionWithHttpInfo(smartTransactionProperties);
        return resp.getData();
    }

    /**
     * POST Smart/Transactions
     * Create new smart transaction
     * @param smartTransactionProperties Smart transaction properties (required)
     * @return ApiResponse&lt;SmartTransactionsProductModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SmartTransactionsProductModel> addTransactionWithHttpInfo(SmartTransactionsDTO smartTransactionProperties) throws ApiException {
        com.squareup.okhttp.Call call = addTransactionValidateBeforeCall(smartTransactionProperties, null, null);
        Type localVarReturnType = new TypeToken<SmartTransactionsProductModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * POST Smart/Transactions (asynchronously)
     * Create new smart transaction
     * @param smartTransactionProperties Smart transaction properties (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call addTransactionAsync(SmartTransactionsDTO smartTransactionProperties, final ApiCallback<SmartTransactionsProductModel> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = addTransactionValidateBeforeCall(smartTransactionProperties, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<SmartTransactionsProductModel>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for cancelTransaction
     * @param smartTransactionId Smart transaction id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call cancelTransactionCall(String smartTransactionId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Smart/Transactions/{smartTransactionId}/cancel"
            .replaceAll("\\{" + "smartTransactionId" + "\\}", apiClient.escapeString(smartTransactionId.toString()));

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
    private com.squareup.okhttp.Call cancelTransactionValidateBeforeCall(String smartTransactionId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'smartTransactionId' is set
        if (smartTransactionId == null) {
            throw new ApiException("Missing the required parameter 'smartTransactionId' when calling cancelTransaction(Async)");
        }
        
        
        com.squareup.okhttp.Call call = cancelTransactionCall(smartTransactionId, progressListener, progressRequestListener);
        return call;
    }

    /**
     * POST Smart/Transactions/{smartTransactionId}/cancel
     * Method to cancel the transaction with given idn
     * @param smartTransactionId Smart transaction id (required)
     * @return SmartTransactionsProductModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SmartTransactionsProductModel cancelTransaction(String smartTransactionId) throws ApiException {
        ApiResponse<SmartTransactionsProductModel> resp = cancelTransactionWithHttpInfo(smartTransactionId);
        return resp.getData();
    }

    /**
     * POST Smart/Transactions/{smartTransactionId}/cancel
     * Method to cancel the transaction with given idn
     * @param smartTransactionId Smart transaction id (required)
     * @return ApiResponse&lt;SmartTransactionsProductModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SmartTransactionsProductModel> cancelTransactionWithHttpInfo(String smartTransactionId) throws ApiException {
        com.squareup.okhttp.Call call = cancelTransactionValidateBeforeCall(smartTransactionId, null, null);
        Type localVarReturnType = new TypeToken<SmartTransactionsProductModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * POST Smart/Transactions/{smartTransactionId}/cancel (asynchronously)
     * Method to cancel the transaction with given idn
     * @param smartTransactionId Smart transaction id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call cancelTransactionAsync(String smartTransactionId, final ApiCallback<SmartTransactionsProductModel> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = cancelTransactionValidateBeforeCall(smartTransactionId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<SmartTransactionsProductModel>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for cancelTrx
     * @param smartTransactionId Smart transaction id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call cancelTrxCall(String smartTransactionId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Smart/Transactions/{smartTransactionId}/canceltrx"
            .replaceAll("\\{" + "smartTransactionId" + "\\}", apiClient.escapeString(smartTransactionId.toString()));

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
    private com.squareup.okhttp.Call cancelTrxValidateBeforeCall(String smartTransactionId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'smartTransactionId' is set
        if (smartTransactionId == null) {
            throw new ApiException("Missing the required parameter 'smartTransactionId' when calling cancelTrx(Async)");
        }
        
        
        com.squareup.okhttp.Call call = cancelTrxCall(smartTransactionId, progressListener, progressRequestListener);
        return call;
    }

    /**
     * POST Smart/Transactions/{smartTransactionId}/canceltrx
     * Starts Cancel &#39;Cash&#39; transaction on Terminal with &#39;receipt_number&#39; (&#39;Beleg-Nr.&#39;)
     * @param smartTransactionId Smart transaction id (required)
     * @return SmartTransactionsProductModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SmartTransactionsProductModel cancelTrx(String smartTransactionId) throws ApiException {
        ApiResponse<SmartTransactionsProductModel> resp = cancelTrxWithHttpInfo(smartTransactionId);
        return resp.getData();
    }

    /**
     * POST Smart/Transactions/{smartTransactionId}/canceltrx
     * Starts Cancel &#39;Cash&#39; transaction on Terminal with &#39;receipt_number&#39; (&#39;Beleg-Nr.&#39;)
     * @param smartTransactionId Smart transaction id (required)
     * @return ApiResponse&lt;SmartTransactionsProductModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SmartTransactionsProductModel> cancelTrxWithHttpInfo(String smartTransactionId) throws ApiException {
        com.squareup.okhttp.Call call = cancelTrxValidateBeforeCall(smartTransactionId, null, null);
        Type localVarReturnType = new TypeToken<SmartTransactionsProductModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * POST Smart/Transactions/{smartTransactionId}/canceltrx (asynchronously)
     * Starts Cancel &#39;Cash&#39; transaction on Terminal with &#39;receipt_number&#39; (&#39;Beleg-Nr.&#39;)
     * @param smartTransactionId Smart transaction id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call cancelTrxAsync(String smartTransactionId, final ApiCallback<SmartTransactionsProductModel> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = cancelTrxValidateBeforeCall(smartTransactionId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<SmartTransactionsProductModel>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for diagnose
     * @param smartDeviceId Smart device id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call diagnoseCall(String smartDeviceId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Smart/Transactions/{smartDeviceId}/diagnosis"
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
    private com.squareup.okhttp.Call diagnoseValidateBeforeCall(String smartDeviceId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'smartDeviceId' is set
        if (smartDeviceId == null) {
            throw new ApiException("Missing the required parameter 'smartDeviceId' when calling diagnose(Async)");
        }
        
        
        com.squareup.okhttp.Call call = diagnoseCall(smartDeviceId, progressListener, progressRequestListener);
        return call;
    }

    /**
     * POST Smart/Transactions/{smartDeviceId}/diagnosis
     * Starts extended Diagnose on Terminal, this method is normally called by SDK&#39;s from cash register
     * @param smartDeviceId Smart device id (required)
     * @return SmartTransactionsProductModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SmartTransactionsProductModel diagnose(String smartDeviceId) throws ApiException {
        ApiResponse<SmartTransactionsProductModel> resp = diagnoseWithHttpInfo(smartDeviceId);
        return resp.getData();
    }

    /**
     * POST Smart/Transactions/{smartDeviceId}/diagnosis
     * Starts extended Diagnose on Terminal, this method is normally called by SDK&#39;s from cash register
     * @param smartDeviceId Smart device id (required)
     * @return ApiResponse&lt;SmartTransactionsProductModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SmartTransactionsProductModel> diagnoseWithHttpInfo(String smartDeviceId) throws ApiException {
        com.squareup.okhttp.Call call = diagnoseValidateBeforeCall(smartDeviceId, null, null);
        Type localVarReturnType = new TypeToken<SmartTransactionsProductModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * POST Smart/Transactions/{smartDeviceId}/diagnosis (asynchronously)
     * Starts extended Diagnose on Terminal, this method is normally called by SDK&#39;s from cash register
     * @param smartDeviceId Smart device id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call diagnoseAsync(String smartDeviceId, final ApiCallback<SmartTransactionsProductModel> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = diagnoseValidateBeforeCall(smartDeviceId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<SmartTransactionsProductModel>(){}.getType();
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
        String localVarPath = "/Smart/Transactions";

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
    private com.squareup.okhttp.Call getAllValidateBeforeCall(Integer count, Integer offset, String fields, String q, String sort, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        
        com.squareup.okhttp.Call call = getAllCall(count, offset, fields, q, sort, progressListener, progressRequestListener);
        return call;
    }

    /**
     * GET Smart/Transactions
     * Get a list of smart transactions
     * @param count The number of items to return.
     * @param offset The position within the whole result set to start returning items (First element is at 0).
     * @param fields List of fields to include in the result. Nested properties can be accessed with this notation: prop1.prop2  Example: prop3,prop1.prop2
     * @param q A query string to restrict the returned items to given conditions. The query string must consist of any combination of single expressions in the form property:condition.  *                  A condition may contain:  *                      - wildcard \&quot;*\&quot; for any number of characters  *                      - wildcard \&quot;?\&quot; for one character  *                      - ranges in the form [value TO value]  *  *                  Single expressions may combined by &#39;AND&#39;, &#39;OR&#39;, &#39;NOT&#39; operators and parenthesis &#39;(&#39;, &#39;)&#39; for grouping.  *                  Property names can be nested like \&quot;prop1.prop2\&quot;.  *                  Example: (NOT customer.name:meier*) AND (customer.age:[30 TO 40] OR customer.age:[50 TO 60])  *                  
     * @param sort String with comma separated pairs of field:order (e.g. contact.surname:asc,contact.comapnyname:desc). Result set will be sorted by included fields, in ascending &#39;asc&#39;, or descending &#39;dsc&#39; order.
     * @return SmartTransactionsList
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SmartTransactionsList getAll(Integer count, Integer offset, String fields, String q, String sort) throws ApiException {
        ApiResponse<SmartTransactionsList> resp = getAllWithHttpInfo(count, offset, fields, q, sort);
        return resp.getData();
    }

    /**
     * GET Smart/Transactions
     * Get a list of smart transactions
     * @param count The number of items to return.
     * @param offset The position within the whole result set to start returning items (First element is at 0).
     * @param fields List of fields to include in the result. Nested properties can be accessed with this notation: prop1.prop2  Example: prop3,prop1.prop2
     * @param q A query string to restrict the returned items to given conditions. The query string must consist of any combination of single expressions in the form property:condition.  *                  A condition may contain:  *                      - wildcard \&quot;*\&quot; for any number of characters  *                      - wildcard \&quot;?\&quot; for one character  *                      - ranges in the form [value TO value]  *  *                  Single expressions may combined by &#39;AND&#39;, &#39;OR&#39;, &#39;NOT&#39; operators and parenthesis &#39;(&#39;, &#39;)&#39; for grouping.  *                  Property names can be nested like \&quot;prop1.prop2\&quot;.  *                  Example: (NOT customer.name:meier*) AND (customer.age:[30 TO 40] OR customer.age:[50 TO 60])  *                  
     * @param sort String with comma separated pairs of field:order (e.g. contact.surname:asc,contact.comapnyname:desc). Result set will be sorted by included fields, in ascending &#39;asc&#39;, or descending &#39;dsc&#39; order.
     * @return ApiResponse&lt;SmartTransactionsList&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SmartTransactionsList> getAllWithHttpInfo(Integer count, Integer offset, String fields, String q, String sort) throws ApiException {
        com.squareup.okhttp.Call call = getAllValidateBeforeCall(count, offset, fields, q, sort, null, null);
        Type localVarReturnType = new TypeToken<SmartTransactionsList>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * GET Smart/Transactions (asynchronously)
     * Get a list of smart transactions
     * @param count The number of items to return.
     * @param offset The position within the whole result set to start returning items (First element is at 0).
     * @param fields List of fields to include in the result. Nested properties can be accessed with this notation: prop1.prop2  Example: prop3,prop1.prop2
     * @param q A query string to restrict the returned items to given conditions. The query string must consist of any combination of single expressions in the form property:condition.  *                  A condition may contain:  *                      - wildcard \&quot;*\&quot; for any number of characters  *                      - wildcard \&quot;?\&quot; for one character  *                      - ranges in the form [value TO value]  *  *                  Single expressions may combined by &#39;AND&#39;, &#39;OR&#39;, &#39;NOT&#39; operators and parenthesis &#39;(&#39;, &#39;)&#39; for grouping.  *                  Property names can be nested like \&quot;prop1.prop2\&quot;.  *                  Example: (NOT customer.name:meier*) AND (customer.age:[30 TO 40] OR customer.age:[50 TO 60])  *                  
     * @param sort String with comma separated pairs of field:order (e.g. contact.surname:asc,contact.comapnyname:desc). Result set will be sorted by included fields, in ascending &#39;asc&#39;, or descending &#39;dsc&#39; order.
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getAllAsync(Integer count, Integer offset, String fields, String q, String sort, final ApiCallback<SmartTransactionsList> callback) throws ApiException {

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
        Type localVarReturnType = new TypeToken<SmartTransactionsList>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getOne
     * @param smartTransactionId Smart transaction id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getOneCall(String smartTransactionId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Smart/Transactions/{smartTransactionId}"
            .replaceAll("\\{" + "smartTransactionId" + "\\}", apiClient.escapeString(smartTransactionId.toString()));

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
    private com.squareup.okhttp.Call getOneValidateBeforeCall(String smartTransactionId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'smartTransactionId' is set
        if (smartTransactionId == null) {
            throw new ApiException("Missing the required parameter 'smartTransactionId' when calling getOne(Async)");
        }
        
        
        com.squareup.okhttp.Call call = getOneCall(smartTransactionId, progressListener, progressRequestListener);
        return call;
    }

    /**
     * GET Smart/Transactions/{smartTransactionId}
     * Get one smart transaction for a specific id
     * @param smartTransactionId Smart transaction id (required)
     * @return SmartTransactionsProductModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SmartTransactionsProductModel getOne(String smartTransactionId) throws ApiException {
        ApiResponse<SmartTransactionsProductModel> resp = getOneWithHttpInfo(smartTransactionId);
        return resp.getData();
    }

    /**
     * GET Smart/Transactions/{smartTransactionId}
     * Get one smart transaction for a specific id
     * @param smartTransactionId Smart transaction id (required)
     * @return ApiResponse&lt;SmartTransactionsProductModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SmartTransactionsProductModel> getOneWithHttpInfo(String smartTransactionId) throws ApiException {
        com.squareup.okhttp.Call call = getOneValidateBeforeCall(smartTransactionId, null, null);
        Type localVarReturnType = new TypeToken<SmartTransactionsProductModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * GET Smart/Transactions/{smartTransactionId} (asynchronously)
     * Get one smart transaction for a specific id
     * @param smartTransactionId Smart transaction id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getOneAsync(String smartTransactionId, final ApiCallback<SmartTransactionsProductModel> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getOneValidateBeforeCall(smartTransactionId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<SmartTransactionsProductModel>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for preTransaction
     * @param smartTransactionId Smart transaction id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call preTransactionCall(String smartTransactionId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Smart/Transactions/{smartTransactionId}/preTransaction"
            .replaceAll("\\{" + "smartTransactionId" + "\\}", apiClient.escapeString(smartTransactionId.toString()));

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
    private com.squareup.okhttp.Call preTransactionValidateBeforeCall(String smartTransactionId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'smartTransactionId' is set
        if (smartTransactionId == null) {
            throw new ApiException("Missing the required parameter 'smartTransactionId' when calling preTransaction(Async)");
        }
        
        
        com.squareup.okhttp.Call call = preTransactionCall(smartTransactionId, progressListener, progressRequestListener);
        return call;
    }

    /**
     * POST Smart/Transactions/{smartTransactionId}/preTransaction
     * Function that checks balance of merchantcard from ident and if possible creates bonus product items for basket
     * @param smartTransactionId Smart transaction id (required)
     * @return SmartTransactionsPreTransactionModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SmartTransactionsPreTransactionModel preTransaction(String smartTransactionId) throws ApiException {
        ApiResponse<SmartTransactionsPreTransactionModel> resp = preTransactionWithHttpInfo(smartTransactionId);
        return resp.getData();
    }

    /**
     * POST Smart/Transactions/{smartTransactionId}/preTransaction
     * Function that checks balance of merchantcard from ident and if possible creates bonus product items for basket
     * @param smartTransactionId Smart transaction id (required)
     * @return ApiResponse&lt;SmartTransactionsPreTransactionModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SmartTransactionsPreTransactionModel> preTransactionWithHttpInfo(String smartTransactionId) throws ApiException {
        com.squareup.okhttp.Call call = preTransactionValidateBeforeCall(smartTransactionId, null, null);
        Type localVarReturnType = new TypeToken<SmartTransactionsPreTransactionModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * POST Smart/Transactions/{smartTransactionId}/preTransaction (asynchronously)
     * Function that checks balance of merchantcard from ident and if possible creates bonus product items for basket
     * @param smartTransactionId Smart transaction id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call preTransactionAsync(String smartTransactionId, final ApiCallback<SmartTransactionsPreTransactionModel> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = preTransactionValidateBeforeCall(smartTransactionId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<SmartTransactionsPreTransactionModel>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for prepare
     * @param smartTransactionId Smart transaction id (required)
     * @param body Information which customer and container will be used to this operation (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call prepareCall(String smartTransactionId, SmartTransactionsPrepare body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/Smart/Transactions/{smartTransactionId}/prepare"
            .replaceAll("\\{" + "smartTransactionId" + "\\}", apiClient.escapeString(smartTransactionId.toString()));

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
    private com.squareup.okhttp.Call prepareValidateBeforeCall(String smartTransactionId, SmartTransactionsPrepare body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'smartTransactionId' is set
        if (smartTransactionId == null) {
            throw new ApiException("Missing the required parameter 'smartTransactionId' when calling prepare(Async)");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling prepare(Async)");
        }
        
        
        com.squareup.okhttp.Call call = prepareCall(smartTransactionId, body, progressListener, progressRequestListener);
        return call;
    }

    /**
     * POST Smart/Transactions/stx_xxx/prepare
     * Create and score payment transaction assigned to given smart transaction
     * @param smartTransactionId Smart transaction id (required)
     * @param body Information which customer and container will be used to this operation (required)
     * @return SmartTransactionsProductModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SmartTransactionsProductModel prepare(String smartTransactionId, SmartTransactionsPrepare body) throws ApiException {
        ApiResponse<SmartTransactionsProductModel> resp = prepareWithHttpInfo(smartTransactionId, body);
        return resp.getData();
    }

    /**
     * POST Smart/Transactions/stx_xxx/prepare
     * Create and score payment transaction assigned to given smart transaction
     * @param smartTransactionId Smart transaction id (required)
     * @param body Information which customer and container will be used to this operation (required)
     * @return ApiResponse&lt;SmartTransactionsProductModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SmartTransactionsProductModel> prepareWithHttpInfo(String smartTransactionId, SmartTransactionsPrepare body) throws ApiException {
        com.squareup.okhttp.Call call = prepareValidateBeforeCall(smartTransactionId, body, null, null);
        Type localVarReturnType = new TypeToken<SmartTransactionsProductModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * POST Smart/Transactions/stx_xxx/prepare (asynchronously)
     * Create and score payment transaction assigned to given smart transaction
     * @param smartTransactionId Smart transaction id (required)
     * @param body Information which customer and container will be used to this operation (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call prepareAsync(String smartTransactionId, SmartTransactionsPrepare body, final ApiCallback<SmartTransactionsProductModel> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = prepareValidateBeforeCall(smartTransactionId, body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<SmartTransactionsProductModel>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for startEndOfDayReport
     * @param smartDeviceId Smart device id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call startEndOfDayReportCall(String smartDeviceId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Smart/Transactions/{smartDeviceId}/endOfDay"
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
    private com.squareup.okhttp.Call startEndOfDayReportValidateBeforeCall(String smartDeviceId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'smartDeviceId' is set
        if (smartDeviceId == null) {
            throw new ApiException("Missing the required parameter 'smartDeviceId' when calling startEndOfDayReport(Async)");
        }
        
        
        com.squareup.okhttp.Call call = startEndOfDayReportCall(smartDeviceId, progressListener, progressRequestListener);
        return call;
    }

    /**
     * POST Smart/Transactions/{smartDeviceId}/endOfDay
     * Starts End of Day Report on Terminal, this method is normally called by SDK&#39;s from cash register
     * @param smartDeviceId Smart device id (required)
     * @return SmartTransactionsProductModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SmartTransactionsProductModel startEndOfDayReport(String smartDeviceId) throws ApiException {
        ApiResponse<SmartTransactionsProductModel> resp = startEndOfDayReportWithHttpInfo(smartDeviceId);
        return resp.getData();
    }

    /**
     * POST Smart/Transactions/{smartDeviceId}/endOfDay
     * Starts End of Day Report on Terminal, this method is normally called by SDK&#39;s from cash register
     * @param smartDeviceId Smart device id (required)
     * @return ApiResponse&lt;SmartTransactionsProductModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SmartTransactionsProductModel> startEndOfDayReportWithHttpInfo(String smartDeviceId) throws ApiException {
        com.squareup.okhttp.Call call = startEndOfDayReportValidateBeforeCall(smartDeviceId, null, null);
        Type localVarReturnType = new TypeToken<SmartTransactionsProductModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * POST Smart/Transactions/{smartDeviceId}/endOfDay (asynchronously)
     * Starts End of Day Report on Terminal, this method is normally called by SDK&#39;s from cash register
     * @param smartDeviceId Smart device id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call startEndOfDayReportAsync(String smartDeviceId, final ApiCallback<SmartTransactionsProductModel> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = startEndOfDayReportValidateBeforeCall(smartDeviceId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<SmartTransactionsProductModel>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for startTransaction
     * @param smartTransactionId Smart transaction id (required)
     * @param paymentMethod Payment method (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call startTransactionCall(String smartTransactionId, String paymentMethod, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Smart/Transactions/{smartTransactionId}/start/{paymentMethod}"
            .replaceAll("\\{" + "smartTransactionId" + "\\}", apiClient.escapeString(smartTransactionId.toString()))
            .replaceAll("\\{" + "paymentMethod" + "\\}", apiClient.escapeString(paymentMethod.toString()));

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
    private com.squareup.okhttp.Call startTransactionValidateBeforeCall(String smartTransactionId, String paymentMethod, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'smartTransactionId' is set
        if (smartTransactionId == null) {
            throw new ApiException("Missing the required parameter 'smartTransactionId' when calling startTransaction(Async)");
        }
        
        // verify the required parameter 'paymentMethod' is set
        if (paymentMethod == null) {
            throw new ApiException("Missing the required parameter 'paymentMethod' when calling startTransaction(Async)");
        }
        
        
        com.squareup.okhttp.Call call = startTransactionCall(smartTransactionId, paymentMethod, progressListener, progressRequestListener);
        return call;
    }

    /**
     * POST Smart/Transactions/{smartTransactionId}/start/{paymentMethod}
     * Start smart transaction with given payment method
     * @param smartTransactionId Smart transaction id (required)
     * @param paymentMethod Payment method (required)
     * @return SmartTransactionsProductModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SmartTransactionsProductModel startTransaction(String smartTransactionId, String paymentMethod) throws ApiException {
        ApiResponse<SmartTransactionsProductModel> resp = startTransactionWithHttpInfo(smartTransactionId, paymentMethod);
        return resp.getData();
    }

    /**
     * POST Smart/Transactions/{smartTransactionId}/start/{paymentMethod}
     * Start smart transaction with given payment method
     * @param smartTransactionId Smart transaction id (required)
     * @param paymentMethod Payment method (required)
     * @return ApiResponse&lt;SmartTransactionsProductModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SmartTransactionsProductModel> startTransactionWithHttpInfo(String smartTransactionId, String paymentMethod) throws ApiException {
        com.squareup.okhttp.Call call = startTransactionValidateBeforeCall(smartTransactionId, paymentMethod, null, null);
        Type localVarReturnType = new TypeToken<SmartTransactionsProductModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * POST Smart/Transactions/{smartTransactionId}/start/{paymentMethod} (asynchronously)
     * Start smart transaction with given payment method
     * @param smartTransactionId Smart transaction id (required)
     * @param paymentMethod Payment method (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call startTransactionAsync(String smartTransactionId, String paymentMethod, final ApiCallback<SmartTransactionsProductModel> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = startTransactionValidateBeforeCall(smartTransactionId, paymentMethod, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<SmartTransactionsProductModel>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for updateTransaction
     * @param smartTransactionId Smart transaction id (required)
     * @param smartTransactionProperties Smart transaction properties (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call updateTransactionCall(String smartTransactionId, SmartTransactionsDTO smartTransactionProperties, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = smartTransactionProperties;
        
        // create path and map variables
        String localVarPath = "/Smart/Transactions/{smartTransactionId}"
            .replaceAll("\\{" + "smartTransactionId" + "\\}", apiClient.escapeString(smartTransactionId.toString()));

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
    private com.squareup.okhttp.Call updateTransactionValidateBeforeCall(String smartTransactionId, SmartTransactionsDTO smartTransactionProperties, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'smartTransactionId' is set
        if (smartTransactionId == null) {
            throw new ApiException("Missing the required parameter 'smartTransactionId' when calling updateTransaction(Async)");
        }
        
        // verify the required parameter 'smartTransactionProperties' is set
        if (smartTransactionProperties == null) {
            throw new ApiException("Missing the required parameter 'smartTransactionProperties' when calling updateTransaction(Async)");
        }
        
        
        com.squareup.okhttp.Call call = updateTransactionCall(smartTransactionId, smartTransactionProperties, progressListener, progressRequestListener);
        return call;
    }

    /**
     * PUT Smart/Transactions/{smartTransactionId}
     * Update smart transaction
     * @param smartTransactionId Smart transaction id (required)
     * @param smartTransactionProperties Smart transaction properties (required)
     * @return SmartTransactionsProductModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SmartTransactionsProductModel updateTransaction(String smartTransactionId, SmartTransactionsDTO smartTransactionProperties) throws ApiException {
        ApiResponse<SmartTransactionsProductModel> resp = updateTransactionWithHttpInfo(smartTransactionId, smartTransactionProperties);
        return resp.getData();
    }

    /**
     * PUT Smart/Transactions/{smartTransactionId}
     * Update smart transaction
     * @param smartTransactionId Smart transaction id (required)
     * @param smartTransactionProperties Smart transaction properties (required)
     * @return ApiResponse&lt;SmartTransactionsProductModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SmartTransactionsProductModel> updateTransactionWithHttpInfo(String smartTransactionId, SmartTransactionsDTO smartTransactionProperties) throws ApiException {
        com.squareup.okhttp.Call call = updateTransactionValidateBeforeCall(smartTransactionId, smartTransactionProperties, null, null);
        Type localVarReturnType = new TypeToken<SmartTransactionsProductModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * PUT Smart/Transactions/{smartTransactionId} (asynchronously)
     * Update smart transaction
     * @param smartTransactionId Smart transaction id (required)
     * @param smartTransactionProperties Smart transaction properties (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call updateTransactionAsync(String smartTransactionId, SmartTransactionsDTO smartTransactionProperties, final ApiCallback<SmartTransactionsProductModel> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = updateTransactionValidateBeforeCall(smartTransactionId, smartTransactionProperties, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<SmartTransactionsProductModel>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}

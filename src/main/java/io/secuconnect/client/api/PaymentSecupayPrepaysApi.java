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
import io.secuconnect.client.model.SecupayTransactionDTOExternalInvoicePdf;
import io.secuconnect.client.model.SecupayTransactionExternalInvoicePdf;
import io.secuconnect.client.model.SecupayTransactionProductDTO;
import io.secuconnect.client.model.SecupayTransactionProductModel;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PaymentSecupayPrepaysApi {
    private ApiClient apiClient;

    public PaymentSecupayPrepaysApi() {
        this(Configuration.getDefaultApiClient());
    }

    public PaymentSecupayPrepaysApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for assignExternalInvoicePdf
     * @param paymentMethod Payment method (debit, prepay, ...) (required)
     * @param paymentId Payment id (required)
     * @param documentId Document id (required)
     * @param body Request body for assigning external invoice pdf (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call assignExternalInvoicePdfCall(String paymentMethod, String paymentId, String documentId, SecupayTransactionDTOExternalInvoicePdf body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/Payment/{paymentMethod}/{paymentId}/assignExternalInvoicePdf/{documentId}"
            .replaceAll("\\{" + "paymentMethod" + "\\}", apiClient.escapeString(paymentMethod.toString()))
            .replaceAll("\\{" + "paymentId" + "\\}", apiClient.escapeString(paymentId.toString()))
            .replaceAll("\\{" + "documentId" + "\\}", apiClient.escapeString(documentId.toString()));

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
    private com.squareup.okhttp.Call assignExternalInvoicePdfValidateBeforeCall(String paymentMethod, String paymentId, String documentId, SecupayTransactionDTOExternalInvoicePdf body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'paymentMethod' is set
        if (paymentMethod == null) {
            throw new ApiException("Missing the required parameter 'paymentMethod' when calling assignExternalInvoicePdf(Async)");
        }
        
        // verify the required parameter 'paymentId' is set
        if (paymentId == null) {
            throw new ApiException("Missing the required parameter 'paymentId' when calling assignExternalInvoicePdf(Async)");
        }
        
        // verify the required parameter 'documentId' is set
        if (documentId == null) {
            throw new ApiException("Missing the required parameter 'documentId' when calling assignExternalInvoicePdf(Async)");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling assignExternalInvoicePdf(Async)");
        }
        
        
        com.squareup.okhttp.Call call = assignExternalInvoicePdfCall(paymentMethod, paymentId, documentId, body, progressListener, progressRequestListener);
        return call;
    }

    /**
     * POST Payment/{paymentMethod}/{paymentId}/assignExternalInvoicePdf/{documentId}
     * Assign external invoice pdf
     * @param paymentMethod Payment method (debit, prepay, ...) (required)
     * @param paymentId Payment id (required)
     * @param documentId Document id (required)
     * @param body Request body for assigning external invoice pdf (required)
     * @return SecupayTransactionExternalInvoicePdf
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SecupayTransactionExternalInvoicePdf assignExternalInvoicePdf(String paymentMethod, String paymentId, String documentId, SecupayTransactionDTOExternalInvoicePdf body) throws ApiException {
        ApiResponse<SecupayTransactionExternalInvoicePdf> resp = assignExternalInvoicePdfWithHttpInfo(paymentMethod, paymentId, documentId, body);
        return resp.getData();
    }

    /**
     * POST Payment/{paymentMethod}/{paymentId}/assignExternalInvoicePdf/{documentId}
     * Assign external invoice pdf
     * @param paymentMethod Payment method (debit, prepay, ...) (required)
     * @param paymentId Payment id (required)
     * @param documentId Document id (required)
     * @param body Request body for assigning external invoice pdf (required)
     * @return ApiResponse&lt;SecupayTransactionExternalInvoicePdf&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SecupayTransactionExternalInvoicePdf> assignExternalInvoicePdfWithHttpInfo(String paymentMethod, String paymentId, String documentId, SecupayTransactionDTOExternalInvoicePdf body) throws ApiException {
        com.squareup.okhttp.Call call = assignExternalInvoicePdfValidateBeforeCall(paymentMethod, paymentId, documentId, body, null, null);
        Type localVarReturnType = new TypeToken<SecupayTransactionExternalInvoicePdf>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * POST Payment/{paymentMethod}/{paymentId}/assignExternalInvoicePdf/{documentId} (asynchronously)
     * Assign external invoice pdf
     * @param paymentMethod Payment method (debit, prepay, ...) (required)
     * @param paymentId Payment id (required)
     * @param documentId Document id (required)
     * @param body Request body for assigning external invoice pdf (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call assignExternalInvoicePdfAsync(String paymentMethod, String paymentId, String documentId, SecupayTransactionDTOExternalInvoicePdf body, final ApiCallback<SecupayTransactionExternalInvoicePdf> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = assignExternalInvoicePdfValidateBeforeCall(paymentMethod, paymentId, documentId, body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<SecupayTransactionExternalInvoicePdf>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for paymentSecupayPrepaysCancelById
     * @param paymentPrepayId Payment prepay id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call paymentSecupayPrepaysCancelByIdCall(String paymentPrepayId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Payment/Secupayprepays/{paymentPrepayId}/cancel"
            .replaceAll("\\{" + "paymentPrepayId" + "\\}", apiClient.escapeString(paymentPrepayId.toString()));

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
    private com.squareup.okhttp.Call paymentSecupayPrepaysCancelByIdValidateBeforeCall(String paymentPrepayId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'paymentPrepayId' is set
        if (paymentPrepayId == null) {
            throw new ApiException("Missing the required parameter 'paymentPrepayId' when calling paymentSecupayPrepaysCancelById(Async)");
        }
        
        
        com.squareup.okhttp.Call call = paymentSecupayPrepaysCancelByIdCall(paymentPrepayId, progressListener, progressRequestListener);
        return call;
    }

    /**
     * POST Payment/Secupayprepays/{paymentPrepayId}/cancel
     * Function to cancel the transaction
     * @param paymentPrepayId Payment prepay id (required)
     * @return Object
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Object paymentSecupayPrepaysCancelById(String paymentPrepayId) throws ApiException {
        ApiResponse<Object> resp = paymentSecupayPrepaysCancelByIdWithHttpInfo(paymentPrepayId);
        return resp.getData();
    }

    /**
     * POST Payment/Secupayprepays/{paymentPrepayId}/cancel
     * Function to cancel the transaction
     * @param paymentPrepayId Payment prepay id (required)
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Object> paymentSecupayPrepaysCancelByIdWithHttpInfo(String paymentPrepayId) throws ApiException {
        com.squareup.okhttp.Call call = paymentSecupayPrepaysCancelByIdValidateBeforeCall(paymentPrepayId, null, null);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * POST Payment/Secupayprepays/{paymentPrepayId}/cancel (asynchronously)
     * Function to cancel the transaction
     * @param paymentPrepayId Payment prepay id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call paymentSecupayPrepaysCancelByIdAsync(String paymentPrepayId, final ApiCallback<Object> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = paymentSecupayPrepaysCancelByIdValidateBeforeCall(paymentPrepayId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for paymentSecupayPrepaysGetById
     * @param paymentPrepayId Payment prepay id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call paymentSecupayPrepaysGetByIdCall(String paymentPrepayId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Payment/Secupayprepays/{paymentPrepayId}"
            .replaceAll("\\{" + "paymentPrepayId" + "\\}", apiClient.escapeString(paymentPrepayId.toString()));

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
    private com.squareup.okhttp.Call paymentSecupayPrepaysGetByIdValidateBeforeCall(String paymentPrepayId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'paymentPrepayId' is set
        if (paymentPrepayId == null) {
            throw new ApiException("Missing the required parameter 'paymentPrepayId' when calling paymentSecupayPrepaysGetById(Async)");
        }
        
        
        com.squareup.okhttp.Call call = paymentSecupayPrepaysGetByIdCall(paymentPrepayId, progressListener, progressRequestListener);
        return call;
    }

    /**
     * GET Payment/Secupayprepays/{paymentPrepayId}
     * Get the details of a payment transaction
     * @param paymentPrepayId Payment prepay id (required)
     * @return SecupayTransactionProductModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SecupayTransactionProductModel paymentSecupayPrepaysGetById(String paymentPrepayId) throws ApiException {
        ApiResponse<SecupayTransactionProductModel> resp = paymentSecupayPrepaysGetByIdWithHttpInfo(paymentPrepayId);
        return resp.getData();
    }

    /**
     * GET Payment/Secupayprepays/{paymentPrepayId}
     * Get the details of a payment transaction
     * @param paymentPrepayId Payment prepay id (required)
     * @return ApiResponse&lt;SecupayTransactionProductModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SecupayTransactionProductModel> paymentSecupayPrepaysGetByIdWithHttpInfo(String paymentPrepayId) throws ApiException {
        com.squareup.okhttp.Call call = paymentSecupayPrepaysGetByIdValidateBeforeCall(paymentPrepayId, null, null);
        Type localVarReturnType = new TypeToken<SecupayTransactionProductModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * GET Payment/Secupayprepays/{paymentPrepayId} (asynchronously)
     * Get the details of a payment transaction
     * @param paymentPrepayId Payment prepay id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call paymentSecupayPrepaysGetByIdAsync(String paymentPrepayId, final ApiCallback<SecupayTransactionProductModel> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = paymentSecupayPrepaysGetByIdValidateBeforeCall(paymentPrepayId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<SecupayTransactionProductModel>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for paymentSecupayprepaysPost
     * @param body Prepay payment transaction input properties
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call paymentSecupayprepaysPostCall(SecupayTransactionProductDTO body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/Payment/Secupayprepays";

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
    private com.squareup.okhttp.Call paymentSecupayprepaysPostValidateBeforeCall(SecupayTransactionProductDTO body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        
        com.squareup.okhttp.Call call = paymentSecupayprepaysPostCall(body, progressListener, progressRequestListener);
        return call;
    }

    /**
     * POST Payment/Secupayprepays
     * Start a prepay payment transaction
     * @param body Prepay payment transaction input properties
     * @return SecupayTransactionProductModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SecupayTransactionProductModel paymentSecupayprepaysPost(SecupayTransactionProductDTO body) throws ApiException {
        ApiResponse<SecupayTransactionProductModel> resp = paymentSecupayprepaysPostWithHttpInfo(body);
        return resp.getData();
    }

    /**
     * POST Payment/Secupayprepays
     * Start a prepay payment transaction
     * @param body Prepay payment transaction input properties
     * @return ApiResponse&lt;SecupayTransactionProductModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SecupayTransactionProductModel> paymentSecupayprepaysPostWithHttpInfo(SecupayTransactionProductDTO body) throws ApiException {
        com.squareup.okhttp.Call call = paymentSecupayprepaysPostValidateBeforeCall(body, null, null);
        Type localVarReturnType = new TypeToken<SecupayTransactionProductModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * POST Payment/Secupayprepays (asynchronously)
     * Start a prepay payment transaction
     * @param body Prepay payment transaction input properties
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call paymentSecupayprepaysPostAsync(SecupayTransactionProductDTO body, final ApiCallback<SecupayTransactionProductModel> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = paymentSecupayprepaysPostValidateBeforeCall(body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<SecupayTransactionProductModel>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}

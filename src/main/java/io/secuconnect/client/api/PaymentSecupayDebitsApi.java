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
import io.secuconnect.client.model.PaymentCancelResult;
import io.secuconnect.client.model.ProductExceptionPayload;
import io.secuconnect.client.model.SecupayTransactionCancelDTO;
import io.secuconnect.client.model.SecupayTransactionCaptureDTO;
import io.secuconnect.client.model.SecupayTransactionDTOExternalInvoicePdf;
import io.secuconnect.client.model.SecupayTransactionExternalInvoicePdf;
import io.secuconnect.client.model.SecupayTransactionProductDTO;
import io.secuconnect.client.model.SecupayTransactionProductModel;
import io.secuconnect.client.model.SecupayTransactionReverseAccrualDTO;
import io.secuconnect.client.model.SecupayTransactionSetShippingInformationDTO;
import io.secuconnect.client.model.SecupayTransactionUpdateBasketDTO;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PaymentSecupayDebitsApi {
    private ApiClient apiClient;

    public PaymentSecupayDebitsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public PaymentSecupayDebitsApi(ApiClient apiClient) {
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
     * @param paymentMethod Payment method (secupaydebits, secupayprepays, secupayinvoices, ...) (required)
     * @param paymentId Payment id (required)
     * @param documentId Document id (required)
     * @param body Request body for assigning external invoice pdf
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
        
        com.squareup.okhttp.Call call = assignExternalInvoicePdfCall(paymentMethod, paymentId, documentId, body, progressListener, progressRequestListener);
        return call;
    }

    /**
     * POST Payment/{paymentMethod}/{paymentId}/assignExternalInvoicePdf/{documentId}
     * Assign external invoice pdf
     * @param paymentMethod Payment method (secupaydebits, secupayprepays, secupayinvoices, ...) (required)
     * @param paymentId Payment id (required)
     * @param documentId Document id (required)
     * @param body Request body for assigning external invoice pdf
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
     * @param paymentMethod Payment method (secupaydebits, secupayprepays, secupayinvoices, ...) (required)
     * @param paymentId Payment id (required)
     * @param documentId Document id (required)
     * @param body Request body for assigning external invoice pdf
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
     * @param paymentMethod Payment method (secupaydebits, secupayprepays, secupayinvoices, ...) (required)
     * @param paymentId Payment id (required)
     * @param documentId Document id (required)
     * @param body Request body for assigning external invoice pdf
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
     * Build call for cancelPaymentTransactionById
     * @param paymentMethod Payment method (secupaydebits, secupayprepays, secupayinvoices, ...) (required)
     * @param paymentId Payment id (required)
     * @param body Cancel payment transaction input properties
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call cancelPaymentTransactionByIdCall(String paymentMethod, String paymentId, SecupayTransactionCancelDTO body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/Payment/{paymentMethod}/{paymentId}/cancel"
            .replaceAll("\\{" + "paymentMethod" + "\\}", apiClient.escapeString(paymentMethod.toString()))
            .replaceAll("\\{" + "paymentId" + "\\}", apiClient.escapeString(paymentId.toString()));

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
    private com.squareup.okhttp.Call cancelPaymentTransactionByIdValidateBeforeCall(String paymentMethod, String paymentId, SecupayTransactionCancelDTO body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'paymentMethod' is set
        if (paymentMethod == null) {
            throw new ApiException("Missing the required parameter 'paymentMethod' when calling cancelPaymentTransactionById(Async)");
        }
        // verify the required parameter 'paymentId' is set
        if (paymentId == null) {
            throw new ApiException("Missing the required parameter 'paymentId' when calling cancelPaymentTransactionById(Async)");
        }
        
        com.squareup.okhttp.Call call = cancelPaymentTransactionByIdCall(paymentMethod, paymentId, body, progressListener, progressRequestListener);
        return call;
    }

    /**
     * POST Payment/{paymentMethod}/{paymentId}/cancel
     * Function to cancel the payment transaction
     * @param paymentMethod Payment method (secupaydebits, secupayprepays, secupayinvoices, ...) (required)
     * @param paymentId Payment id (required)
     * @param body Cancel payment transaction input properties
     * @return PaymentCancelResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PaymentCancelResult cancelPaymentTransactionById(String paymentMethod, String paymentId, SecupayTransactionCancelDTO body) throws ApiException {
        ApiResponse<PaymentCancelResult> resp = cancelPaymentTransactionByIdWithHttpInfo(paymentMethod, paymentId, body);
        return resp.getData();
    }

    /**
     * POST Payment/{paymentMethod}/{paymentId}/cancel
     * Function to cancel the payment transaction
     * @param paymentMethod Payment method (secupaydebits, secupayprepays, secupayinvoices, ...) (required)
     * @param paymentId Payment id (required)
     * @param body Cancel payment transaction input properties
     * @return ApiResponse&lt;PaymentCancelResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PaymentCancelResult> cancelPaymentTransactionByIdWithHttpInfo(String paymentMethod, String paymentId, SecupayTransactionCancelDTO body) throws ApiException {
        com.squareup.okhttp.Call call = cancelPaymentTransactionByIdValidateBeforeCall(paymentMethod, paymentId, body, null, null);
        Type localVarReturnType = new TypeToken<PaymentCancelResult>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * POST Payment/{paymentMethod}/{paymentId}/cancel (asynchronously)
     * Function to cancel the payment transaction
     * @param paymentMethod Payment method (secupaydebits, secupayprepays, secupayinvoices, ...) (required)
     * @param paymentId Payment id (required)
     * @param body Cancel payment transaction input properties
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call cancelPaymentTransactionByIdAsync(String paymentMethod, String paymentId, SecupayTransactionCancelDTO body, final ApiCallback<PaymentCancelResult> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = cancelPaymentTransactionByIdValidateBeforeCall(paymentMethod, paymentId, body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<PaymentCancelResult>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for capturePaymentTransactionById
     * @param paymentMethod Payment method (secupaydebits, secupayprepays, secupayinvoices, ...) (required)
     * @param paymentId Payment id (required)
     * @param body Capture payment transaction input properties
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call capturePaymentTransactionByIdCall(String paymentMethod, String paymentId, SecupayTransactionCaptureDTO body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/Payment/{paymentMethod}/{paymentId}/capture"
            .replaceAll("\\{" + "paymentMethod" + "\\}", apiClient.escapeString(paymentMethod.toString()))
            .replaceAll("\\{" + "paymentId" + "\\}", apiClient.escapeString(paymentId.toString()));

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
    private com.squareup.okhttp.Call capturePaymentTransactionByIdValidateBeforeCall(String paymentMethod, String paymentId, SecupayTransactionCaptureDTO body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'paymentMethod' is set
        if (paymentMethod == null) {
            throw new ApiException("Missing the required parameter 'paymentMethod' when calling capturePaymentTransactionById(Async)");
        }
        // verify the required parameter 'paymentId' is set
        if (paymentId == null) {
            throw new ApiException("Missing the required parameter 'paymentId' when calling capturePaymentTransactionById(Async)");
        }
        
        com.squareup.okhttp.Call call = capturePaymentTransactionByIdCall(paymentMethod, paymentId, body, progressListener, progressRequestListener);
        return call;
    }

    /**
     * POST Payment/{paymentMethod}/{paymentId}/capture
     * Function to cancel the payment transaction
     * @param paymentMethod Payment method (secupaydebits, secupayprepays, secupayinvoices, ...) (required)
     * @param paymentId Payment id (required)
     * @param body Capture payment transaction input properties
     * @return SecupayTransactionProductModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SecupayTransactionProductModel capturePaymentTransactionById(String paymentMethod, String paymentId, SecupayTransactionCaptureDTO body) throws ApiException {
        ApiResponse<SecupayTransactionProductModel> resp = capturePaymentTransactionByIdWithHttpInfo(paymentMethod, paymentId, body);
        return resp.getData();
    }

    /**
     * POST Payment/{paymentMethod}/{paymentId}/capture
     * Function to cancel the payment transaction
     * @param paymentMethod Payment method (secupaydebits, secupayprepays, secupayinvoices, ...) (required)
     * @param paymentId Payment id (required)
     * @param body Capture payment transaction input properties
     * @return ApiResponse&lt;SecupayTransactionProductModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SecupayTransactionProductModel> capturePaymentTransactionByIdWithHttpInfo(String paymentMethod, String paymentId, SecupayTransactionCaptureDTO body) throws ApiException {
        com.squareup.okhttp.Call call = capturePaymentTransactionByIdValidateBeforeCall(paymentMethod, paymentId, body, null, null);
        Type localVarReturnType = new TypeToken<SecupayTransactionProductModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * POST Payment/{paymentMethod}/{paymentId}/capture (asynchronously)
     * Function to cancel the payment transaction
     * @param paymentMethod Payment method (secupaydebits, secupayprepays, secupayinvoices, ...) (required)
     * @param paymentId Payment id (required)
     * @param body Capture payment transaction input properties
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call capturePaymentTransactionByIdAsync(String paymentMethod, String paymentId, SecupayTransactionCaptureDTO body, final ApiCallback<SecupayTransactionProductModel> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = capturePaymentTransactionByIdValidateBeforeCall(paymentMethod, paymentId, body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<SecupayTransactionProductModel>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for paymentSecupayDebitsGetById
     * @param paymentDebitId Payment debit id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call paymentSecupayDebitsGetByIdCall(String paymentDebitId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Payment/Secupaydebits/{paymentDebitId}"
            .replaceAll("\\{" + "paymentDebitId" + "\\}", apiClient.escapeString(paymentDebitId.toString()));

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
    private com.squareup.okhttp.Call paymentSecupayDebitsGetByIdValidateBeforeCall(String paymentDebitId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'paymentDebitId' is set
        if (paymentDebitId == null) {
            throw new ApiException("Missing the required parameter 'paymentDebitId' when calling paymentSecupayDebitsGetById(Async)");
        }
        
        com.squareup.okhttp.Call call = paymentSecupayDebitsGetByIdCall(paymentDebitId, progressListener, progressRequestListener);
        return call;
    }

    /**
     * GET Payment/Secupaydebits/{paymentDebitId}
     * Get the details of a payment transaction
     * @param paymentDebitId Payment debit id (required)
     * @return SecupayTransactionProductModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SecupayTransactionProductModel paymentSecupayDebitsGetById(String paymentDebitId) throws ApiException {
        ApiResponse<SecupayTransactionProductModel> resp = paymentSecupayDebitsGetByIdWithHttpInfo(paymentDebitId);
        return resp.getData();
    }

    /**
     * GET Payment/Secupaydebits/{paymentDebitId}
     * Get the details of a payment transaction
     * @param paymentDebitId Payment debit id (required)
     * @return ApiResponse&lt;SecupayTransactionProductModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SecupayTransactionProductModel> paymentSecupayDebitsGetByIdWithHttpInfo(String paymentDebitId) throws ApiException {
        com.squareup.okhttp.Call call = paymentSecupayDebitsGetByIdValidateBeforeCall(paymentDebitId, null, null);
        Type localVarReturnType = new TypeToken<SecupayTransactionProductModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * GET Payment/Secupaydebits/{paymentDebitId} (asynchronously)
     * Get the details of a payment transaction
     * @param paymentDebitId Payment debit id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call paymentSecupayDebitsGetByIdAsync(String paymentDebitId, final ApiCallback<SecupayTransactionProductModel> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = paymentSecupayDebitsGetByIdValidateBeforeCall(paymentDebitId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<SecupayTransactionProductModel>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for paymentSecupaydebitsPost
     * @param body Debit payment transaction input properties
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call paymentSecupaydebitsPostCall(SecupayTransactionProductDTO body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/Payment/Secupaydebits";

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
    private com.squareup.okhttp.Call paymentSecupaydebitsPostValidateBeforeCall(SecupayTransactionProductDTO body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = paymentSecupaydebitsPostCall(body, progressListener, progressRequestListener);
        return call;
    }

    /**
     * POST Payment/Secupaydebits
     * Start a debit payment transaction
     * @param body Debit payment transaction input properties
     * @return SecupayTransactionProductModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SecupayTransactionProductModel paymentSecupaydebitsPost(SecupayTransactionProductDTO body) throws ApiException {
        ApiResponse<SecupayTransactionProductModel> resp = paymentSecupaydebitsPostWithHttpInfo(body);
        return resp.getData();
    }

    /**
     * POST Payment/Secupaydebits
     * Start a debit payment transaction
     * @param body Debit payment transaction input properties
     * @return ApiResponse&lt;SecupayTransactionProductModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SecupayTransactionProductModel> paymentSecupaydebitsPostWithHttpInfo(SecupayTransactionProductDTO body) throws ApiException {
        com.squareup.okhttp.Call call = paymentSecupaydebitsPostValidateBeforeCall(body, null, null);
        Type localVarReturnType = new TypeToken<SecupayTransactionProductModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * POST Payment/Secupaydebits (asynchronously)
     * Start a debit payment transaction
     * @param body Debit payment transaction input properties
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call paymentSecupaydebitsPostAsync(SecupayTransactionProductDTO body, final ApiCallback<SecupayTransactionProductModel> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = paymentSecupaydebitsPostValidateBeforeCall(body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<SecupayTransactionProductModel>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for reverseAccrualByPaymentId
     * @param paymentMethod Payment method (secupaydebits, secupayprepays, secupayinvoices, ...) (required)
     * @param paymentId Payment id (required)
     * @param body Reverse accrual input properties
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call reverseAccrualByPaymentIdCall(String paymentMethod, String paymentId, SecupayTransactionReverseAccrualDTO body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/Payment/{paymentMethod}/{paymentId}/accrual"
            .replaceAll("\\{" + "paymentMethod" + "\\}", apiClient.escapeString(paymentMethod.toString()))
            .replaceAll("\\{" + "paymentId" + "\\}", apiClient.escapeString(paymentId.toString()));

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
    private com.squareup.okhttp.Call reverseAccrualByPaymentIdValidateBeforeCall(String paymentMethod, String paymentId, SecupayTransactionReverseAccrualDTO body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'paymentMethod' is set
        if (paymentMethod == null) {
            throw new ApiException("Missing the required parameter 'paymentMethod' when calling reverseAccrualByPaymentId(Async)");
        }
        // verify the required parameter 'paymentId' is set
        if (paymentId == null) {
            throw new ApiException("Missing the required parameter 'paymentId' when calling reverseAccrualByPaymentId(Async)");
        }
        
        com.squareup.okhttp.Call call = reverseAccrualByPaymentIdCall(paymentMethod, paymentId, body, progressListener, progressRequestListener);
        return call;
    }

    /**
     * PUT Payment/{paymentMethod}/{paymentId}/accrual
     * Update the accrual flag of an existing payment transaction
     * @param paymentMethod Payment method (secupaydebits, secupayprepays, secupayinvoices, ...) (required)
     * @param paymentId Payment id (required)
     * @param body Reverse accrual input properties
     * @return SecupayTransactionProductModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SecupayTransactionProductModel reverseAccrualByPaymentId(String paymentMethod, String paymentId, SecupayTransactionReverseAccrualDTO body) throws ApiException {
        ApiResponse<SecupayTransactionProductModel> resp = reverseAccrualByPaymentIdWithHttpInfo(paymentMethod, paymentId, body);
        return resp.getData();
    }

    /**
     * PUT Payment/{paymentMethod}/{paymentId}/accrual
     * Update the accrual flag of an existing payment transaction
     * @param paymentMethod Payment method (secupaydebits, secupayprepays, secupayinvoices, ...) (required)
     * @param paymentId Payment id (required)
     * @param body Reverse accrual input properties
     * @return ApiResponse&lt;SecupayTransactionProductModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SecupayTransactionProductModel> reverseAccrualByPaymentIdWithHttpInfo(String paymentMethod, String paymentId, SecupayTransactionReverseAccrualDTO body) throws ApiException {
        com.squareup.okhttp.Call call = reverseAccrualByPaymentIdValidateBeforeCall(paymentMethod, paymentId, body, null, null);
        Type localVarReturnType = new TypeToken<SecupayTransactionProductModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * PUT Payment/{paymentMethod}/{paymentId}/accrual (asynchronously)
     * Update the accrual flag of an existing payment transaction
     * @param paymentMethod Payment method (secupaydebits, secupayprepays, secupayinvoices, ...) (required)
     * @param paymentId Payment id (required)
     * @param body Reverse accrual input properties
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call reverseAccrualByPaymentIdAsync(String paymentMethod, String paymentId, SecupayTransactionReverseAccrualDTO body, final ApiCallback<SecupayTransactionProductModel> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = reverseAccrualByPaymentIdValidateBeforeCall(paymentMethod, paymentId, body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<SecupayTransactionProductModel>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for setShippingInformationByPaymentId
     * @param paymentMethod Payment method (secupaydebits, secupayprepays, secupayinvoices, ...) (required)
     * @param paymentId Payment id (required)
     * @param body Shipping information propertie
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call setShippingInformationByPaymentIdCall(String paymentMethod, String paymentId, SecupayTransactionSetShippingInformationDTO body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/Payment/{paymentMethod}/{paymentId}/shippingInformation"
            .replaceAll("\\{" + "paymentMethod" + "\\}", apiClient.escapeString(paymentMethod.toString()))
            .replaceAll("\\{" + "paymentId" + "\\}", apiClient.escapeString(paymentId.toString()));

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
    private com.squareup.okhttp.Call setShippingInformationByPaymentIdValidateBeforeCall(String paymentMethod, String paymentId, SecupayTransactionSetShippingInformationDTO body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'paymentMethod' is set
        if (paymentMethod == null) {
            throw new ApiException("Missing the required parameter 'paymentMethod' when calling setShippingInformationByPaymentId(Async)");
        }
        // verify the required parameter 'paymentId' is set
        if (paymentId == null) {
            throw new ApiException("Missing the required parameter 'paymentId' when calling setShippingInformationByPaymentId(Async)");
        }
        
        com.squareup.okhttp.Call call = setShippingInformationByPaymentIdCall(paymentMethod, paymentId, body, progressListener, progressRequestListener);
        return call;
    }

    /**
     * PUT Payment/{paymentMethod}/{paymentId}/shippingInformation
     * Update the accrual flag of an existing payment transaction
     * @param paymentMethod Payment method (secupaydebits, secupayprepays, secupayinvoices, ...) (required)
     * @param paymentId Payment id (required)
     * @param body Shipping information propertie
     * @return SecupayTransactionProductModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SecupayTransactionProductModel setShippingInformationByPaymentId(String paymentMethod, String paymentId, SecupayTransactionSetShippingInformationDTO body) throws ApiException {
        ApiResponse<SecupayTransactionProductModel> resp = setShippingInformationByPaymentIdWithHttpInfo(paymentMethod, paymentId, body);
        return resp.getData();
    }

    /**
     * PUT Payment/{paymentMethod}/{paymentId}/shippingInformation
     * Update the accrual flag of an existing payment transaction
     * @param paymentMethod Payment method (secupaydebits, secupayprepays, secupayinvoices, ...) (required)
     * @param paymentId Payment id (required)
     * @param body Shipping information propertie
     * @return ApiResponse&lt;SecupayTransactionProductModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SecupayTransactionProductModel> setShippingInformationByPaymentIdWithHttpInfo(String paymentMethod, String paymentId, SecupayTransactionSetShippingInformationDTO body) throws ApiException {
        com.squareup.okhttp.Call call = setShippingInformationByPaymentIdValidateBeforeCall(paymentMethod, paymentId, body, null, null);
        Type localVarReturnType = new TypeToken<SecupayTransactionProductModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * PUT Payment/{paymentMethod}/{paymentId}/shippingInformation (asynchronously)
     * Update the accrual flag of an existing payment transaction
     * @param paymentMethod Payment method (secupaydebits, secupayprepays, secupayinvoices, ...) (required)
     * @param paymentId Payment id (required)
     * @param body Shipping information propertie
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call setShippingInformationByPaymentIdAsync(String paymentMethod, String paymentId, SecupayTransactionSetShippingInformationDTO body, final ApiCallback<SecupayTransactionProductModel> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = setShippingInformationByPaymentIdValidateBeforeCall(paymentMethod, paymentId, body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<SecupayTransactionProductModel>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for updateBasketByPaymentId
     * @param paymentMethod Payment method (secupaydebits, secupayprepays, secupayinvoices, ...) (required)
     * @param paymentId Payment id (required)
     * @param body Update basket input properties
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call updateBasketByPaymentIdCall(String paymentMethod, String paymentId, SecupayTransactionUpdateBasketDTO body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/Payment/{paymentMethod}/{paymentId}/basket"
            .replaceAll("\\{" + "paymentMethod" + "\\}", apiClient.escapeString(paymentMethod.toString()))
            .replaceAll("\\{" + "paymentId" + "\\}", apiClient.escapeString(paymentId.toString()));

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
    private com.squareup.okhttp.Call updateBasketByPaymentIdValidateBeforeCall(String paymentMethod, String paymentId, SecupayTransactionUpdateBasketDTO body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'paymentMethod' is set
        if (paymentMethod == null) {
            throw new ApiException("Missing the required parameter 'paymentMethod' when calling updateBasketByPaymentId(Async)");
        }
        // verify the required parameter 'paymentId' is set
        if (paymentId == null) {
            throw new ApiException("Missing the required parameter 'paymentId' when calling updateBasketByPaymentId(Async)");
        }
        
        com.squareup.okhttp.Call call = updateBasketByPaymentIdCall(paymentMethod, paymentId, body, progressListener, progressRequestListener);
        return call;
    }

    /**
     * PUT Payment/{paymentMethod}/{paymentId}/basket
     * Update a basket of an existing payment transaction
     * @param paymentMethod Payment method (secupaydebits, secupayprepays, secupayinvoices, ...) (required)
     * @param paymentId Payment id (required)
     * @param body Update basket input properties
     * @return SecupayTransactionProductModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SecupayTransactionProductModel updateBasketByPaymentId(String paymentMethod, String paymentId, SecupayTransactionUpdateBasketDTO body) throws ApiException {
        ApiResponse<SecupayTransactionProductModel> resp = updateBasketByPaymentIdWithHttpInfo(paymentMethod, paymentId, body);
        return resp.getData();
    }

    /**
     * PUT Payment/{paymentMethod}/{paymentId}/basket
     * Update a basket of an existing payment transaction
     * @param paymentMethod Payment method (secupaydebits, secupayprepays, secupayinvoices, ...) (required)
     * @param paymentId Payment id (required)
     * @param body Update basket input properties
     * @return ApiResponse&lt;SecupayTransactionProductModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SecupayTransactionProductModel> updateBasketByPaymentIdWithHttpInfo(String paymentMethod, String paymentId, SecupayTransactionUpdateBasketDTO body) throws ApiException {
        com.squareup.okhttp.Call call = updateBasketByPaymentIdValidateBeforeCall(paymentMethod, paymentId, body, null, null);
        Type localVarReturnType = new TypeToken<SecupayTransactionProductModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * PUT Payment/{paymentMethod}/{paymentId}/basket (asynchronously)
     * Update a basket of an existing payment transaction
     * @param paymentMethod Payment method (secupaydebits, secupayprepays, secupayinvoices, ...) (required)
     * @param paymentId Payment id (required)
     * @param body Update basket input properties
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call updateBasketByPaymentIdAsync(String paymentMethod, String paymentId, SecupayTransactionUpdateBasketDTO body, final ApiCallback<SecupayTransactionProductModel> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = updateBasketByPaymentIdValidateBeforeCall(paymentMethod, paymentId, body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<SecupayTransactionProductModel>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
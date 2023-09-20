package com.secuconnect.client.api;

import com.google.gson.reflect.TypeToken;
import com.secuconnect.client.*;
import com.secuconnect.client.model.PaymentCancelResult;
import com.secuconnect.client.model.ProductExceptionPayload;
import com.secuconnect.client.model.SecupayTransactionCancelDTO;
import com.secuconnect.client.model.SecupayTransactionCaptureDTO;
import com.secuconnect.client.model.SecupayTransactionDTOExternalInvoicePdf;
import com.secuconnect.client.model.SecupayTransactionExternalInvoicePdf;
import com.secuconnect.client.model.SecupayTransactionProductDTO;
import com.secuconnect.client.model.SecupayTransactionProductModel;
import com.secuconnect.client.model.SecupayTransactionReverseAccrualDTO;
import com.secuconnect.client.model.SecupayTransactionSetShippingInformationDTO;
import com.secuconnect.client.model.SecupayTransactionUpdateBasketDTO;
import okhttp3.Call;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PaymentSecupayDebitsApi {
    private ApiClient apiClient;

    public PaymentSecupayDebitsApi() {
        this(Environment.getGlobalEnv().getApiClient());
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
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public Call assignExternalInvoicePdfCall(String paymentMethod, String paymentId, String documentId, SecupayTransactionDTOExternalInvoicePdf body) throws ApiException {
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

        String[] localVarAuthNames = new String[] { "oauth_token" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames);
    }

    @SuppressWarnings("rawtypes")
    private Call assignExternalInvoicePdfValidateBeforeCall(String paymentMethod, String paymentId, String documentId, SecupayTransactionDTOExternalInvoicePdf body) throws ApiException {
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

        return assignExternalInvoicePdfCall(paymentMethod, paymentId, documentId, body);
    }

    /**
     * Assign external invoice PDF
     * Assign external invoice PDF
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
     * Assign external invoice PDF
     * Assign external invoice PDF
     * @param paymentMethod Payment method (secupaydebits, secupayprepays, secupayinvoices, ...) (required)
     * @param paymentId Payment id (required)
     * @param documentId Document id (required)
     * @param body Request body for assigning external invoice pdf
     * @return ApiResponse&lt;SecupayTransactionExternalInvoicePdf&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SecupayTransactionExternalInvoicePdf> assignExternalInvoicePdfWithHttpInfo(String paymentMethod, String paymentId, String documentId, SecupayTransactionDTOExternalInvoicePdf body) throws ApiException {
        Call call = assignExternalInvoicePdfValidateBeforeCall(paymentMethod, paymentId, documentId, body);
        Type localVarReturnType = new TypeToken<SecupayTransactionExternalInvoicePdf>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Assign external invoice PDF (asynchronously)
     * Assign external invoice PDF
     * @param paymentMethod Payment method (secupaydebits, secupayprepays, secupayinvoices, ...) (required)
     * @param paymentId Payment id (required)
     * @param documentId Document id (required)
     * @param body Request body for assigning external invoice pdf
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call assignExternalInvoicePdfAsync(String paymentMethod, String paymentId, String documentId, SecupayTransactionDTOExternalInvoicePdf body, final ApiCallback<SecupayTransactionExternalInvoicePdf> callback) throws ApiException {
        Call call = assignExternalInvoicePdfValidateBeforeCall(paymentMethod, paymentId, documentId, body);
        Type localVarReturnType = new TypeToken<SecupayTransactionExternalInvoicePdf>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for cancelPaymentTransactionById
     * @param paymentMethod Payment method (secupaydebits, secupayprepays, secupayinvoices, ...) (required)
     * @param paymentId Payment id (required)
     * @param body Cancel payment transaction input properties
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public Call cancelPaymentTransactionByIdCall(String paymentMethod, String paymentId, SecupayTransactionCancelDTO body) throws ApiException {
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

        String[] localVarAuthNames = new String[] { "oauth_token" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames);
    }

    @SuppressWarnings("rawtypes")
    private Call cancelPaymentTransactionByIdValidateBeforeCall(String paymentMethod, String paymentId, SecupayTransactionCancelDTO body) throws ApiException {
        // verify the required parameter 'paymentMethod' is set
        if (paymentMethod == null) {
            throw new ApiException("Missing the required parameter 'paymentMethod' when calling cancelPaymentTransactionById(Async)");
        }
        // verify the required parameter 'paymentId' is set
        if (paymentId == null) {
            throw new ApiException("Missing the required parameter 'paymentId' when calling cancelPaymentTransactionById(Async)");
        }

        return cancelPaymentTransactionByIdCall(paymentMethod, paymentId, body);
    }

    /**
     * Cancel or refund payment
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
     * Cancel or refund payment
     * Function to cancel the payment transaction
     * @param paymentMethod Payment method (secupaydebits, secupayprepays, secupayinvoices, ...) (required)
     * @param paymentId Payment id (required)
     * @param body Cancel payment transaction input properties
     * @return ApiResponse&lt;PaymentCancelResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PaymentCancelResult> cancelPaymentTransactionByIdWithHttpInfo(String paymentMethod, String paymentId, SecupayTransactionCancelDTO body) throws ApiException {
        Call call = cancelPaymentTransactionByIdValidateBeforeCall(paymentMethod, paymentId, body);
        Type localVarReturnType = new TypeToken<PaymentCancelResult>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Cancel or refund payment (asynchronously)
     * Function to cancel the payment transaction
     * @param paymentMethod Payment method (secupaydebits, secupayprepays, secupayinvoices, ...) (required)
     * @param paymentId Payment id (required)
     * @param body Cancel payment transaction input properties
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call cancelPaymentTransactionByIdAsync(String paymentMethod, String paymentId, SecupayTransactionCancelDTO body, final ApiCallback<PaymentCancelResult> callback) throws ApiException {
        Call call = cancelPaymentTransactionByIdValidateBeforeCall(paymentMethod, paymentId, body);
        Type localVarReturnType = new TypeToken<PaymentCancelResult>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for capturePaymentTransactionById
     * @param paymentMethod Payment method (secupaydebits, secupayprepays, secupayinvoices, ...) (required)
     * @param paymentId Payment id (required)
     * @param body Capture payment transaction input properties
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public Call capturePaymentTransactionByIdCall(String paymentMethod, String paymentId, SecupayTransactionCaptureDTO body) throws ApiException {
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

        String[] localVarAuthNames = new String[] { "oauth_token" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames);
    }

    @SuppressWarnings("rawtypes")
    private Call capturePaymentTransactionByIdValidateBeforeCall(String paymentMethod, String paymentId, SecupayTransactionCaptureDTO body) throws ApiException {
        // verify the required parameter 'paymentMethod' is set
        if (paymentMethod == null) {
            throw new ApiException("Missing the required parameter 'paymentMethod' when calling capturePaymentTransactionById(Async)");
        }
        // verify the required parameter 'paymentId' is set
        if (paymentId == null) {
            throw new ApiException("Missing the required parameter 'paymentId' when calling capturePaymentTransactionById(Async)");
        }

        return capturePaymentTransactionByIdCall(paymentMethod, paymentId, body);
    }

    /**
     * Capture payment
     * Function to capture the payment transaction
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
     * Capture payment
     * Function to capture the payment transaction
     * @param paymentMethod Payment method (secupaydebits, secupayprepays, secupayinvoices, ...) (required)
     * @param paymentId Payment id (required)
     * @param body Capture payment transaction input properties
     * @return ApiResponse&lt;SecupayTransactionProductModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SecupayTransactionProductModel> capturePaymentTransactionByIdWithHttpInfo(String paymentMethod, String paymentId, SecupayTransactionCaptureDTO body) throws ApiException {
        Call call = capturePaymentTransactionByIdValidateBeforeCall(paymentMethod, paymentId, body);
        Type localVarReturnType = new TypeToken<SecupayTransactionProductModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Capture payment (asynchronously)
     * Function to capture the payment transaction
     * @param paymentMethod Payment method (secupaydebits, secupayprepays, secupayinvoices, ...) (required)
     * @param paymentId Payment id (required)
     * @param body Capture payment transaction input properties
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call capturePaymentTransactionByIdAsync(String paymentMethod, String paymentId, SecupayTransactionCaptureDTO body, final ApiCallback<SecupayTransactionProductModel> callback) throws ApiException {
        Call call = capturePaymentTransactionByIdValidateBeforeCall(paymentMethod, paymentId, body);
        Type localVarReturnType = new TypeToken<SecupayTransactionProductModel>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for paymentSecupayDebitsGetById
     * @param paymentDebitId Payment debit id (required)
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public Call paymentSecupayDebitsGetByIdCall(String paymentDebitId) throws ApiException {
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

        String[] localVarAuthNames = new String[] { "oauth_token" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames);
    }

    @SuppressWarnings("rawtypes")
    private Call paymentSecupayDebitsGetByIdValidateBeforeCall(String paymentDebitId) throws ApiException {
        // verify the required parameter 'paymentDebitId' is set
        if (paymentDebitId == null) {
            throw new ApiException("Missing the required parameter 'paymentDebitId' when calling paymentSecupayDebitsGetById(Async)");
        }

        return paymentSecupayDebitsGetByIdCall(paymentDebitId);
    }

    /**
     * Read Payment Secupaydebit
     * Returns the specified Payment Secupaydebit.
     * @param paymentDebitId Payment debit id (required)
     * @return SecupayTransactionProductModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SecupayTransactionProductModel paymentSecupayDebitsGetById(String paymentDebitId) throws ApiException {
        ApiResponse<SecupayTransactionProductModel> resp = paymentSecupayDebitsGetByIdWithHttpInfo(paymentDebitId);
        return resp.getData();
    }

    /**
     * Read Payment Secupaydebit
     * Returns the specified Payment Secupaydebit.
     * @param paymentDebitId Payment debit id (required)
     * @return ApiResponse&lt;SecupayTransactionProductModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SecupayTransactionProductModel> paymentSecupayDebitsGetByIdWithHttpInfo(String paymentDebitId) throws ApiException {
        Call call = paymentSecupayDebitsGetByIdValidateBeforeCall(paymentDebitId);
        Type localVarReturnType = new TypeToken<SecupayTransactionProductModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Read Payment Secupaydebit (asynchronously)
     * Returns the specified Payment Secupaydebit.
     * @param paymentDebitId Payment debit id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call paymentSecupayDebitsGetByIdAsync(String paymentDebitId, final ApiCallback<SecupayTransactionProductModel> callback) throws ApiException {
        Call call = paymentSecupayDebitsGetByIdValidateBeforeCall(paymentDebitId);
        Type localVarReturnType = new TypeToken<SecupayTransactionProductModel>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for paymentSecupaydebitsPost
     * @param body Debit payment transaction input properties
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public Call paymentSecupaydebitsPostCall(SecupayTransactionProductDTO body) throws ApiException {
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

        String[] localVarAuthNames = new String[] { "oauth_token" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames);
    }

    @SuppressWarnings("rawtypes")
    private Call paymentSecupaydebitsPostValidateBeforeCall(SecupayTransactionProductDTO body) throws ApiException {

        return paymentSecupaydebitsPostCall(body);
    }

    /**
     * Create Payment Secupaydebits
     * Creates a new Payment Secupaydebits from the given data. It can be used to start a debit payment transaction.
     * @param body Debit payment transaction input properties
     * @return SecupayTransactionProductModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SecupayTransactionProductModel paymentSecupaydebitsPost(SecupayTransactionProductDTO body) throws ApiException {
        ApiResponse<SecupayTransactionProductModel> resp = paymentSecupaydebitsPostWithHttpInfo(body);
        return resp.getData();
    }

    /**
     * Create Payment Secupaydebits
     * Creates a new Payment Secupaydebits from the given data. It can be used to start a debit payment transaction.
     * @param body Debit payment transaction input properties
     * @return ApiResponse&lt;SecupayTransactionProductModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SecupayTransactionProductModel> paymentSecupaydebitsPostWithHttpInfo(SecupayTransactionProductDTO body) throws ApiException {
        Call call = paymentSecupaydebitsPostValidateBeforeCall(body);
        Type localVarReturnType = new TypeToken<SecupayTransactionProductModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Create Payment Secupaydebits (asynchronously)
     * Creates a new Payment Secupaydebits from the given data. It can be used to start a debit payment transaction.
     * @param body Debit payment transaction input properties
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call paymentSecupaydebitsPostAsync(SecupayTransactionProductDTO body, final ApiCallback<SecupayTransactionProductModel> callback) throws ApiException {
        Call call = paymentSecupaydebitsPostValidateBeforeCall(body);
        Type localVarReturnType = new TypeToken<SecupayTransactionProductModel>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for reverseAccrualByPaymentId
     * @param paymentMethod Payment method (secupaydebits, secupayprepays, secupayinvoices, ...) (required)
     * @param paymentId Payment id (required)
     * @param body Reverse accrual input properties
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public Call reverseAccrualByPaymentIdCall(String paymentMethod, String paymentId, SecupayTransactionReverseAccrualDTO body) throws ApiException {
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

        String[] localVarAuthNames = new String[] { "oauth_token" };
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames);
    }

    @SuppressWarnings("rawtypes")
    private Call reverseAccrualByPaymentIdValidateBeforeCall(String paymentMethod, String paymentId, SecupayTransactionReverseAccrualDTO body) throws ApiException {
        // verify the required parameter 'paymentMethod' is set
        if (paymentMethod == null) {
            throw new ApiException("Missing the required parameter 'paymentMethod' when calling reverseAccrualByPaymentId(Async)");
        }
        // verify the required parameter 'paymentId' is set
        if (paymentId == null) {
            throw new ApiException("Missing the required parameter 'paymentId' when calling reverseAccrualByPaymentId(Async)");
        }

        return reverseAccrualByPaymentIdCall(paymentMethod, paymentId, body);
    }

    /**
     * Change accrual flag
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
     * Change accrual flag
     * Update the accrual flag of an existing payment transaction
     * @param paymentMethod Payment method (secupaydebits, secupayprepays, secupayinvoices, ...) (required)
     * @param paymentId Payment id (required)
     * @param body Reverse accrual input properties
     * @return ApiResponse&lt;SecupayTransactionProductModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SecupayTransactionProductModel> reverseAccrualByPaymentIdWithHttpInfo(String paymentMethod, String paymentId, SecupayTransactionReverseAccrualDTO body) throws ApiException {
        Call call = reverseAccrualByPaymentIdValidateBeforeCall(paymentMethod, paymentId, body);
        Type localVarReturnType = new TypeToken<SecupayTransactionProductModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Change accrual flag (asynchronously)
     * Update the accrual flag of an existing payment transaction
     * @param paymentMethod Payment method (secupaydebits, secupayprepays, secupayinvoices, ...) (required)
     * @param paymentId Payment id (required)
     * @param body Reverse accrual input properties
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call reverseAccrualByPaymentIdAsync(String paymentMethod, String paymentId, SecupayTransactionReverseAccrualDTO body, final ApiCallback<SecupayTransactionProductModel> callback) throws ApiException {
        Call call = reverseAccrualByPaymentIdValidateBeforeCall(paymentMethod, paymentId, body);
        Type localVarReturnType = new TypeToken<SecupayTransactionProductModel>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for setShippingInformationByPaymentId
     * @param paymentMethod Payment method (secupaydebits, secupayprepays, secupayinvoices, ...) (required)
     * @param paymentId Payment id (required)
     * @param body Shipping information properties
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public Call setShippingInformationByPaymentIdCall(String paymentMethod, String paymentId, SecupayTransactionSetShippingInformationDTO body) throws ApiException {
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

        String[] localVarAuthNames = new String[] { "oauth_token" };
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames);
    }

    @SuppressWarnings("rawtypes")
    private Call setShippingInformationByPaymentIdValidateBeforeCall(String paymentMethod, String paymentId, SecupayTransactionSetShippingInformationDTO body) throws ApiException {
        // verify the required parameter 'paymentMethod' is set
        if (paymentMethod == null) {
            throw new ApiException("Missing the required parameter 'paymentMethod' when calling setShippingInformationByPaymentId(Async)");
        }
        // verify the required parameter 'paymentId' is set
        if (paymentId == null) {
            throw new ApiException("Missing the required parameter 'paymentId' when calling setShippingInformationByPaymentId(Async)");
        }

        return setShippingInformationByPaymentIdCall(paymentMethod, paymentId, body);
    }

    /**
     * Set shipping information
     * Update the shipping information of an existing payment transaction
     * @param paymentMethod Payment method (secupaydebits, secupayprepays, secupayinvoices, ...) (required)
     * @param paymentId Payment id (required)
     * @param body Shipping information properties
     * @return SecupayTransactionProductModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SecupayTransactionProductModel setShippingInformationByPaymentId(String paymentMethod, String paymentId, SecupayTransactionSetShippingInformationDTO body) throws ApiException {
        ApiResponse<SecupayTransactionProductModel> resp = setShippingInformationByPaymentIdWithHttpInfo(paymentMethod, paymentId, body);
        return resp.getData();
    }

    /**
     * Set shipping information
     * Update the shipping information of an existing payment transaction
     * @param paymentMethod Payment method (secupaydebits, secupayprepays, secupayinvoices, ...) (required)
     * @param paymentId Payment id (required)
     * @param body Shipping information properties
     * @return ApiResponse&lt;SecupayTransactionProductModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SecupayTransactionProductModel> setShippingInformationByPaymentIdWithHttpInfo(String paymentMethod, String paymentId, SecupayTransactionSetShippingInformationDTO body) throws ApiException {
        Call call = setShippingInformationByPaymentIdValidateBeforeCall(paymentMethod, paymentId, body);
        Type localVarReturnType = new TypeToken<SecupayTransactionProductModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Set shipping information (asynchronously)
     * Update the shipping information of an existing payment transaction
     * @param paymentMethod Payment method (secupaydebits, secupayprepays, secupayinvoices, ...) (required)
     * @param paymentId Payment id (required)
     * @param body Shipping information properties
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call setShippingInformationByPaymentIdAsync(String paymentMethod, String paymentId, SecupayTransactionSetShippingInformationDTO body, final ApiCallback<SecupayTransactionProductModel> callback) throws ApiException {
        Call call = setShippingInformationByPaymentIdValidateBeforeCall(paymentMethod, paymentId, body);
        Type localVarReturnType = new TypeToken<SecupayTransactionProductModel>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for updateBasketByPaymentId
     * @param paymentMethod Payment method (secupaydebits, secupayprepays, secupayinvoices, ...) (required)
     * @param paymentId Payment id (required)
     * @param body Update basket input properties
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public Call updateBasketByPaymentIdCall(String paymentMethod, String paymentId, SecupayTransactionUpdateBasketDTO body) throws ApiException {
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

        String[] localVarAuthNames = new String[] { "oauth_token" };
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames);
    }

    @SuppressWarnings("rawtypes")
    private Call updateBasketByPaymentIdValidateBeforeCall(String paymentMethod, String paymentId, SecupayTransactionUpdateBasketDTO body) throws ApiException {
        // verify the required parameter 'paymentMethod' is set
        if (paymentMethod == null) {
            throw new ApiException("Missing the required parameter 'paymentMethod' when calling updateBasketByPaymentId(Async)");
        }
        // verify the required parameter 'paymentId' is set
        if (paymentId == null) {
            throw new ApiException("Missing the required parameter 'paymentId' when calling updateBasketByPaymentId(Async)");
        }

        return updateBasketByPaymentIdCall(paymentMethod, paymentId, body);
    }

    /**
     * Update basket
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
     * Update basket
     * Update a basket of an existing payment transaction
     * @param paymentMethod Payment method (secupaydebits, secupayprepays, secupayinvoices, ...) (required)
     * @param paymentId Payment id (required)
     * @param body Update basket input properties
     * @return ApiResponse&lt;SecupayTransactionProductModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SecupayTransactionProductModel> updateBasketByPaymentIdWithHttpInfo(String paymentMethod, String paymentId, SecupayTransactionUpdateBasketDTO body) throws ApiException {
        Call call = updateBasketByPaymentIdValidateBeforeCall(paymentMethod, paymentId, body);
        Type localVarReturnType = new TypeToken<SecupayTransactionProductModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Update basket (asynchronously)
     * Update a basket of an existing payment transaction
     * @param paymentMethod Payment method (secupaydebits, secupayprepays, secupayinvoices, ...) (required)
     * @param paymentId Payment id (required)
     * @param body Update basket input properties
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call updateBasketByPaymentIdAsync(String paymentMethod, String paymentId, SecupayTransactionUpdateBasketDTO body, final ApiCallback<SecupayTransactionProductModel> callback) throws ApiException {
        Call call = updateBasketByPaymentIdValidateBeforeCall(paymentMethod, paymentId, body);
        Type localVarReturnType = new TypeToken<SecupayTransactionProductModel>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}

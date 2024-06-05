package com.secuconnect.client.api;

import com.google.gson.reflect.TypeToken;
import com.secuconnect.client.*;
import com.secuconnect.client.model.Aggregate;
import java.math.BigDecimal;
import com.secuconnect.client.model.PaymentCrowdFundingData;
import com.secuconnect.client.model.PaymentTransactionCancelDTO;
import com.secuconnect.client.model.PaymentTransactionsCaptureDTO;
import com.secuconnect.client.model.PaymentTransactionsCheckStatus;
import com.secuconnect.client.model.PaymentTransactionsIncreaseAmountDTO;
import com.secuconnect.client.model.PaymentTransactionsInstructionsModel;
import com.secuconnect.client.model.PaymentTransactionsList;
import com.secuconnect.client.model.PaymentTransactionsProductModel;
import com.secuconnect.client.model.ProductExceptionPayload;
import com.secuconnect.client.model.ResultBoolean;
import com.secuconnect.client.model.SecupayTransactionProductDTO;
import com.secuconnect.client.model.SecupayTransactionProductModel;
import com.secuconnect.client.model.SecupayTransactionSetShippingInformationDTO;
import okhttp3.Call;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PaymentTransactionsApi {
    private ApiClient apiClient;

    public PaymentTransactionsApi() {
        this(Environment.getGlobalEnv().getApiClient());
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
     * Build call for addTransaction
     * @param body Transaction details
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public Call addTransactionCall(SecupayTransactionProductDTO body) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/Payment/Transactions";

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
    private Call addTransactionValidateBeforeCall(SecupayTransactionProductDTO body) throws ApiException {

        return addTransactionCall(body);
    }

    /**
     * Create TWINT Payment
     * Creates a new Payment Transaction from the given data for TWINT.
     * @param body Transaction details
     * @return SecupayTransactionProductModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SecupayTransactionProductModel addTransaction(SecupayTransactionProductDTO body) throws ApiException {
        ApiResponse<SecupayTransactionProductModel> resp = addTransactionWithHttpInfo(body);
        return resp.getData();
    }

    /**
     * Create TWINT Payment
     * Creates a new Payment Transaction from the given data for TWINT.
     * @param body Transaction details
     * @return ApiResponse&lt;SecupayTransactionProductModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SecupayTransactionProductModel> addTransactionWithHttpInfo(SecupayTransactionProductDTO body) throws ApiException {
        Call call = addTransactionValidateBeforeCall(body);
        Type localVarReturnType = new TypeToken<SecupayTransactionProductModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Create TWINT Payment (asynchronously)
     * Creates a new Payment Transaction from the given data for TWINT.
     * @param body Transaction details
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call addTransactionAsync(SecupayTransactionProductDTO body, final ApiCallback<SecupayTransactionProductModel> callback) throws ApiException {
        Call call = addTransactionValidateBeforeCall(body);
        Type localVarReturnType = new TypeToken<SecupayTransactionProductModel>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for assignTransferBalance
     * @param paymentTransactionId Payment Transaction ID (required)
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public Call assignTransferBalanceCall(String paymentTransactionId) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/Payment/Transactions/{paymentTransactionId}/assignTransferBalance"
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

        String[] localVarAuthNames = new String[] { "oauth_token" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames);
    }

    @SuppressWarnings("rawtypes")
    private Call assignTransferBalanceValidateBeforeCall(String paymentTransactionId) throws ApiException {
        // verify the required parameter 'paymentTransactionId' is set
        if (paymentTransactionId == null) {
            throw new ApiException("Missing the required parameter 'paymentTransactionId' when calling assignTransferBalance(Async)");
        }

        return assignTransferBalanceCall(paymentTransactionId);
    }

    /**
     * Assign transferred balance
     * Assigns balance to a Payment Transaction for payout. The merchant must have sent the balance by bank transfer, before it can be assigned and paid out.
     * @param paymentTransactionId Payment Transaction ID (required)
     * @return PaymentTransactionsProductModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PaymentTransactionsProductModel assignTransferBalance(String paymentTransactionId) throws ApiException {
        ApiResponse<PaymentTransactionsProductModel> resp = assignTransferBalanceWithHttpInfo(paymentTransactionId);
        return resp.getData();
    }

    /**
     * Assign transferred balance
     * Assigns balance to a Payment Transaction for payout. The merchant must have sent the balance by bank transfer, before it can be assigned and paid out.
     * @param paymentTransactionId Payment Transaction ID (required)
     * @return ApiResponse&lt;PaymentTransactionsProductModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PaymentTransactionsProductModel> assignTransferBalanceWithHttpInfo(String paymentTransactionId) throws ApiException {
        Call call = assignTransferBalanceValidateBeforeCall(paymentTransactionId);
        Type localVarReturnType = new TypeToken<PaymentTransactionsProductModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Assign transferred balance (asynchronously)
     * Assigns balance to a Payment Transaction for payout. The merchant must have sent the balance by bank transfer, before it can be assigned and paid out.
     * @param paymentTransactionId Payment Transaction ID (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call assignTransferBalanceAsync(String paymentTransactionId, final ApiCallback<PaymentTransactionsProductModel> callback) throws ApiException {
        Call call = assignTransferBalanceValidateBeforeCall(paymentTransactionId);
        Type localVarReturnType = new TypeToken<PaymentTransactionsProductModel>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for cancel
     * @param paymentTransactionId Payment Transaction ID (required)
     * @param body Amount and reason
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public Call cancelCall(String paymentTransactionId, PaymentTransactionCancelDTO body) throws ApiException {
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

        String[] localVarAuthNames = new String[] { "oauth_token" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames);
    }

    @SuppressWarnings("rawtypes")
    private Call cancelValidateBeforeCall(String paymentTransactionId, PaymentTransactionCancelDTO body) throws ApiException {
        // verify the required parameter 'paymentTransactionId' is set
        if (paymentTransactionId == null) {
            throw new ApiException("Missing the required parameter 'paymentTransactionId' when calling cancel(Async)");
        }

        return cancelCall(paymentTransactionId, body);
    }

    /**
     * Cancel or refund
     * Cancels or refunds the payment in full or in part.  _Note: It is not possible to exceed the original amount._  If the payer has already made the payment, it creates a new Payment Transaction for the refund, and links it to the original one. The amount of the original Payment Transaction then remains unchanged.  If the payment was not made yet, the amount is reduced (partial cancellation) or the status is set to cancelled (full cancellation). There will be no additional Payment Transaction.  The amount still in effect can be read with &#x60;GET /Payment/Transactions/{id}/checkStatus&#x60;.
     * @param paymentTransactionId Payment Transaction ID (required)
     * @param body Amount and reason
     * @return List&lt;PaymentTransactionsProductModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<PaymentTransactionsProductModel> cancel(String paymentTransactionId, PaymentTransactionCancelDTO body) throws ApiException {
        ApiResponse<List<PaymentTransactionsProductModel>> resp = cancelWithHttpInfo(paymentTransactionId, body);
        return resp.getData();
    }

    /**
     * Cancel or refund
     * Cancels or refunds the payment in full or in part.  _Note: It is not possible to exceed the original amount._  If the payer has already made the payment, it creates a new Payment Transaction for the refund, and links it to the original one. The amount of the original Payment Transaction then remains unchanged.  If the payment was not made yet, the amount is reduced (partial cancellation) or the status is set to cancelled (full cancellation). There will be no additional Payment Transaction.  The amount still in effect can be read with &#x60;GET /Payment/Transactions/{id}/checkStatus&#x60;.
     * @param paymentTransactionId Payment Transaction ID (required)
     * @param body Amount and reason
     * @return ApiResponse&lt;List&lt;PaymentTransactionsProductModel&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<PaymentTransactionsProductModel>> cancelWithHttpInfo(String paymentTransactionId, PaymentTransactionCancelDTO body) throws ApiException {
        Call call = cancelValidateBeforeCall(paymentTransactionId, body);
        Type localVarReturnType = new TypeToken<List<PaymentTransactionsProductModel>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Cancel or refund (asynchronously)
     * Cancels or refunds the payment in full or in part.  _Note: It is not possible to exceed the original amount._  If the payer has already made the payment, it creates a new Payment Transaction for the refund, and links it to the original one. The amount of the original Payment Transaction then remains unchanged.  If the payment was not made yet, the amount is reduced (partial cancellation) or the status is set to cancelled (full cancellation). There will be no additional Payment Transaction.  The amount still in effect can be read with &#x60;GET /Payment/Transactions/{id}/checkStatus&#x60;.
     * @param paymentTransactionId Payment Transaction ID (required)
     * @param body Amount and reason
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call cancelAsync(String paymentTransactionId, PaymentTransactionCancelDTO body, final ApiCallback<List<PaymentTransactionsProductModel>> callback) throws ApiException {
        Call call = cancelValidateBeforeCall(paymentTransactionId, body);
        Type localVarReturnType = new TypeToken<List<PaymentTransactionsProductModel>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for capture
     * @param paymentTransactionId Payment Transaction ID (required)
     * @param body 
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public Call captureCall(String paymentTransactionId, PaymentTransactionsCaptureDTO body) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/Payment/Transactions/{paymentTransactionId}/capture"
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

        String[] localVarAuthNames = new String[] { "oauth_token" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames);
    }

    @SuppressWarnings("rawtypes")
    private Call captureValidateBeforeCall(String paymentTransactionId, PaymentTransactionsCaptureDTO body) throws ApiException {
        // verify the required parameter 'paymentTransactionId' is set
        if (paymentTransactionId == null) {
            throw new ApiException("Missing the required parameter 'paymentTransactionId' when calling capture(Async)");
        }

        return captureCall(paymentTransactionId, body);
    }

    /**
     * Capture
     * Capture an open Payment Transaction
     * @param paymentTransactionId Payment Transaction ID (required)
     * @param body 
     * @return PaymentTransactionsProductModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PaymentTransactionsProductModel capture(String paymentTransactionId, PaymentTransactionsCaptureDTO body) throws ApiException {
        ApiResponse<PaymentTransactionsProductModel> resp = captureWithHttpInfo(paymentTransactionId, body);
        return resp.getData();
    }

    /**
     * Capture
     * Capture an open Payment Transaction
     * @param paymentTransactionId Payment Transaction ID (required)
     * @param body 
     * @return ApiResponse&lt;PaymentTransactionsProductModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PaymentTransactionsProductModel> captureWithHttpInfo(String paymentTransactionId, PaymentTransactionsCaptureDTO body) throws ApiException {
        Call call = captureValidateBeforeCall(paymentTransactionId, body);
        Type localVarReturnType = new TypeToken<PaymentTransactionsProductModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Capture (asynchronously)
     * Capture an open Payment Transaction
     * @param paymentTransactionId Payment Transaction ID (required)
     * @param body 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call captureAsync(String paymentTransactionId, PaymentTransactionsCaptureDTO body, final ApiCallback<PaymentTransactionsProductModel> callback) throws ApiException {
        Call call = captureValidateBeforeCall(paymentTransactionId, body);
        Type localVarReturnType = new TypeToken<PaymentTransactionsProductModel>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for checkStatus
     * @param paymentTransactionId Payment Transaction ID (required)
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public Call checkStatusCall(String paymentTransactionId) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/Payment/Transactions/{paymentTransactionId}/checkStatus"
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

        String[] localVarAuthNames = new String[] { "oauth_token" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames);
    }

    @SuppressWarnings("rawtypes")
    private Call checkStatusValidateBeforeCall(String paymentTransactionId) throws ApiException {
        // verify the required parameter 'paymentTransactionId' is set
        if (paymentTransactionId == null) {
            throw new ApiException("Missing the required parameter 'paymentTransactionId' when calling checkStatus(Async)");
        }

        return checkStatusCall(paymentTransactionId);
    }

    /**
     * Check payment status
     * Returns the current status and amount still in effect. The amount considers open and completed refunds. The amount is zero if the transaction was fully cancelled.
     * @param paymentTransactionId Payment Transaction ID (required)
     * @return PaymentTransactionsCheckStatus
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PaymentTransactionsCheckStatus checkStatus(String paymentTransactionId) throws ApiException {
        ApiResponse<PaymentTransactionsCheckStatus> resp = checkStatusWithHttpInfo(paymentTransactionId);
        return resp.getData();
    }

    /**
     * Check payment status
     * Returns the current status and amount still in effect. The amount considers open and completed refunds. The amount is zero if the transaction was fully cancelled.
     * @param paymentTransactionId Payment Transaction ID (required)
     * @return ApiResponse&lt;PaymentTransactionsCheckStatus&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PaymentTransactionsCheckStatus> checkStatusWithHttpInfo(String paymentTransactionId) throws ApiException {
        Call call = checkStatusValidateBeforeCall(paymentTransactionId);
        Type localVarReturnType = new TypeToken<PaymentTransactionsCheckStatus>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Check payment status (asynchronously)
     * Returns the current status and amount still in effect. The amount considers open and completed refunds. The amount is zero if the transaction was fully cancelled.
     * @param paymentTransactionId Payment Transaction ID (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call checkStatusAsync(String paymentTransactionId, final ApiCallback<PaymentTransactionsCheckStatus> callback) throws ApiException {
        Call call = checkStatusValidateBeforeCall(paymentTransactionId);
        Type localVarReturnType = new TypeToken<PaymentTransactionsCheckStatus>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for getAll
     * @param count The maximum number of items to return
     * @param offset The position within the whole result set to start returning items (zero-based)
     * @param fields List of fields to include in the result, all others will be filtered out. Nested properties can be accessed with this notation: &#x60;prop1.prop2&#x60;.
     * @param q A query string to restrict the returned items to given conditions. The query string must consist of any combination of single expressions in the form &#x60;property:condition&#x60;. Property names can be nested like &#x60;property.property&#x60;.  Example: &#x60;customer.name:Meier&#x60;  A condition may contain:  * &#x60;?&#x60; as wildcard for one character;  * &#x60;*&#x60; as wildcard for any number of characters.  You can also use value ranges in the form &#x60;[min TO max]&#x60;.  Example: &#x60;customer.age:[30 TO 40]&#x60;  You can combine expressions logically by &#x60;expr AND expr&#x60; and &#x60;{expr} OR {expr}&#x60;. You can also negate an expression using &#x60;NOT {expr}&#x60;. Parenthesis &#x60;(...)&#x60; can be used to control precedence.  Example: &#x60;(NOT customer.name:meier*) AND (customer.age:[30 TO 40] OR customer.age:[50 TO 60])&#x60;
     * @param sort String with comma separated pairs of &#x60;field:order&#x60;.  Options for order:  * &#x60;asc&#x60; ascending;  * &#x60;desc&#x60; descending.
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public Call getAllCall(Integer count, Integer offset, String fields, String q, String sort) throws ApiException {
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

        String[] localVarAuthNames = new String[] { "oauth_token" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames);
    }

    @SuppressWarnings("rawtypes")
    private Call getAllValidateBeforeCall(Integer count, Integer offset, String fields, String q, String sort) throws ApiException {

        return getAllCall(count, offset, fields, q, sort);
    }

    /**
     * Find Payment Transactions
     * Returns the Payment Transactions matching the given criteria.
     * @param count The maximum number of items to return
     * @param offset The position within the whole result set to start returning items (zero-based)
     * @param fields List of fields to include in the result, all others will be filtered out. Nested properties can be accessed with this notation: &#x60;prop1.prop2&#x60;.
     * @param q A query string to restrict the returned items to given conditions. The query string must consist of any combination of single expressions in the form &#x60;property:condition&#x60;. Property names can be nested like &#x60;property.property&#x60;.  Example: &#x60;customer.name:Meier&#x60;  A condition may contain:  * &#x60;?&#x60; as wildcard for one character;  * &#x60;*&#x60; as wildcard for any number of characters.  You can also use value ranges in the form &#x60;[min TO max]&#x60;.  Example: &#x60;customer.age:[30 TO 40]&#x60;  You can combine expressions logically by &#x60;expr AND expr&#x60; and &#x60;{expr} OR {expr}&#x60;. You can also negate an expression using &#x60;NOT {expr}&#x60;. Parenthesis &#x60;(...)&#x60; can be used to control precedence.  Example: &#x60;(NOT customer.name:meier*) AND (customer.age:[30 TO 40] OR customer.age:[50 TO 60])&#x60;
     * @param sort String with comma separated pairs of &#x60;field:order&#x60;.  Options for order:  * &#x60;asc&#x60; ascending;  * &#x60;desc&#x60; descending.
     * @return PaymentTransactionsList
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PaymentTransactionsList getAll(Integer count, Integer offset, String fields, String q, String sort) throws ApiException {
        ApiResponse<PaymentTransactionsList> resp = getAllWithHttpInfo(count, offset, fields, q, sort);
        return resp.getData();
    }

    /**
     * Find Payment Transactions
     * Returns the Payment Transactions matching the given criteria.
     * @param count The maximum number of items to return
     * @param offset The position within the whole result set to start returning items (zero-based)
     * @param fields List of fields to include in the result, all others will be filtered out. Nested properties can be accessed with this notation: &#x60;prop1.prop2&#x60;.
     * @param q A query string to restrict the returned items to given conditions. The query string must consist of any combination of single expressions in the form &#x60;property:condition&#x60;. Property names can be nested like &#x60;property.property&#x60;.  Example: &#x60;customer.name:Meier&#x60;  A condition may contain:  * &#x60;?&#x60; as wildcard for one character;  * &#x60;*&#x60; as wildcard for any number of characters.  You can also use value ranges in the form &#x60;[min TO max]&#x60;.  Example: &#x60;customer.age:[30 TO 40]&#x60;  You can combine expressions logically by &#x60;expr AND expr&#x60; and &#x60;{expr} OR {expr}&#x60;. You can also negate an expression using &#x60;NOT {expr}&#x60;. Parenthesis &#x60;(...)&#x60; can be used to control precedence.  Example: &#x60;(NOT customer.name:meier*) AND (customer.age:[30 TO 40] OR customer.age:[50 TO 60])&#x60;
     * @param sort String with comma separated pairs of &#x60;field:order&#x60;.  Options for order:  * &#x60;asc&#x60; ascending;  * &#x60;desc&#x60; descending.
     * @return ApiResponse&lt;PaymentTransactionsList&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PaymentTransactionsList> getAllWithHttpInfo(Integer count, Integer offset, String fields, String q, String sort) throws ApiException {
        Call call = getAllValidateBeforeCall(count, offset, fields, q, sort);
        Type localVarReturnType = new TypeToken<PaymentTransactionsList>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Find Payment Transactions (asynchronously)
     * Returns the Payment Transactions matching the given criteria.
     * @param count The maximum number of items to return
     * @param offset The position within the whole result set to start returning items (zero-based)
     * @param fields List of fields to include in the result, all others will be filtered out. Nested properties can be accessed with this notation: &#x60;prop1.prop2&#x60;.
     * @param q A query string to restrict the returned items to given conditions. The query string must consist of any combination of single expressions in the form &#x60;property:condition&#x60;. Property names can be nested like &#x60;property.property&#x60;.  Example: &#x60;customer.name:Meier&#x60;  A condition may contain:  * &#x60;?&#x60; as wildcard for one character;  * &#x60;*&#x60; as wildcard for any number of characters.  You can also use value ranges in the form &#x60;[min TO max]&#x60;.  Example: &#x60;customer.age:[30 TO 40]&#x60;  You can combine expressions logically by &#x60;expr AND expr&#x60; and &#x60;{expr} OR {expr}&#x60;. You can also negate an expression using &#x60;NOT {expr}&#x60;. Parenthesis &#x60;(...)&#x60; can be used to control precedence.  Example: &#x60;(NOT customer.name:meier*) AND (customer.age:[30 TO 40] OR customer.age:[50 TO 60])&#x60;
     * @param sort String with comma separated pairs of &#x60;field:order&#x60;.  Options for order:  * &#x60;asc&#x60; ascending;  * &#x60;desc&#x60; descending.
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call getAllAsync(Integer count, Integer offset, String fields, String q, String sort, final ApiCallback<PaymentTransactionsList> callback) throws ApiException {
        Call call = getAllValidateBeforeCall(count, offset, fields, q, sort);
        Type localVarReturnType = new TypeToken<PaymentTransactionsList>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for getCrowdFundingData
     * @param generalMerchantId General Merchant ID (MRC_...) (required)
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public Call getCrowdFundingDataCall(String generalMerchantId) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/Payment/Transactions/me/CrowdFundingData/{generalMerchantId}"
            .replaceAll("\\{" + "generalMerchantId" + "\\}", apiClient.escapeString(generalMerchantId.toString()));

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
    private Call getCrowdFundingDataValidateBeforeCall(String generalMerchantId) throws ApiException {
        // verify the required parameter 'generalMerchantId' is set
        if (generalMerchantId == null) {
            throw new ApiException("Missing the required parameter 'generalMerchantId' when calling getCrowdFundingData(Async)");
        }

        return getCrowdFundingDataCall(generalMerchantId);
    }

    /**
     * Crowd funding data
     * Returns a crowd funding summary for the given merchant. It contains the transaction amounts, counts and payout data for each payment method (\&quot;product\&quot;).
     * @param generalMerchantId General Merchant ID (MRC_...) (required)
     * @return PaymentCrowdFundingData
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PaymentCrowdFundingData getCrowdFundingData(String generalMerchantId) throws ApiException {
        ApiResponse<PaymentCrowdFundingData> resp = getCrowdFundingDataWithHttpInfo(generalMerchantId);
        return resp.getData();
    }

    /**
     * Crowd funding data
     * Returns a crowd funding summary for the given merchant. It contains the transaction amounts, counts and payout data for each payment method (\&quot;product\&quot;).
     * @param generalMerchantId General Merchant ID (MRC_...) (required)
     * @return ApiResponse&lt;PaymentCrowdFundingData&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PaymentCrowdFundingData> getCrowdFundingDataWithHttpInfo(String generalMerchantId) throws ApiException {
        Call call = getCrowdFundingDataValidateBeforeCall(generalMerchantId);
        Type localVarReturnType = new TypeToken<PaymentCrowdFundingData>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Crowd funding data (asynchronously)
     * Returns a crowd funding summary for the given merchant. It contains the transaction amounts, counts and payout data for each payment method (\&quot;product\&quot;).
     * @param generalMerchantId General Merchant ID (MRC_...) (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call getCrowdFundingDataAsync(String generalMerchantId, final ApiCallback<PaymentCrowdFundingData> callback) throws ApiException {
        Call call = getCrowdFundingDataValidateBeforeCall(generalMerchantId);
        Type localVarReturnType = new TypeToken<PaymentCrowdFundingData>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for getOne
     * @param paymentTransactionId Payment Transaction ID (required)
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public Call getOneCall(String paymentTransactionId) throws ApiException {
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

        String[] localVarAuthNames = new String[] { "oauth_token" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames);
    }

    @SuppressWarnings("rawtypes")
    private Call getOneValidateBeforeCall(String paymentTransactionId) throws ApiException {
        // verify the required parameter 'paymentTransactionId' is set
        if (paymentTransactionId == null) {
            throw new ApiException("Missing the required parameter 'paymentTransactionId' when calling getOne(Async)");
        }

        return getOneCall(paymentTransactionId);
    }

    /**
     * Read Payment Transaction
     * Returns the specified Payment Transaction.
     * @param paymentTransactionId Payment Transaction ID (required)
     * @return PaymentTransactionsProductModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PaymentTransactionsProductModel getOne(String paymentTransactionId) throws ApiException {
        ApiResponse<PaymentTransactionsProductModel> resp = getOneWithHttpInfo(paymentTransactionId);
        return resp.getData();
    }

    /**
     * Read Payment Transaction
     * Returns the specified Payment Transaction.
     * @param paymentTransactionId Payment Transaction ID (required)
     * @return ApiResponse&lt;PaymentTransactionsProductModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PaymentTransactionsProductModel> getOneWithHttpInfo(String paymentTransactionId) throws ApiException {
        Call call = getOneValidateBeforeCall(paymentTransactionId);
        Type localVarReturnType = new TypeToken<PaymentTransactionsProductModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Read Payment Transaction (asynchronously)
     * Returns the specified Payment Transaction.
     * @param paymentTransactionId Payment Transaction ID (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call getOneAsync(String paymentTransactionId, final ApiCallback<PaymentTransactionsProductModel> callback) throws ApiException {
        Call call = getOneValidateBeforeCall(paymentTransactionId);
        Type localVarReturnType = new TypeToken<PaymentTransactionsProductModel>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for getPaymentInstructionsForPaymentTransaction
     * @param paymentTransactionId Payment Transaction ID (required)
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public Call getPaymentInstructionsForPaymentTransactionCall(String paymentTransactionId) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/Payment/Transactions/{paymentTransactionId}/getPaymentInstructions"
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

        String[] localVarAuthNames = new String[] { "oauth_token" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames);
    }

    @SuppressWarnings("rawtypes")
    private Call getPaymentInstructionsForPaymentTransactionValidateBeforeCall(String paymentTransactionId) throws ApiException {
        // verify the required parameter 'paymentTransactionId' is set
        if (paymentTransactionId == null) {
            throw new ApiException("Missing the required parameter 'paymentTransactionId' when calling getPaymentInstructionsForPaymentTransaction(Async)");
        }

        return getPaymentInstructionsForPaymentTransactionCall(paymentTransactionId);
    }

    /**
     * Get payment instructions for Payment Transaction
     * &#x60;POST Payment/Transactions/{paymentTransactionId}/getPaymentInstructions&#x60;
     * @param paymentTransactionId Payment Transaction ID (required)
     * @return PaymentTransactionsInstructionsModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PaymentTransactionsInstructionsModel getPaymentInstructionsForPaymentTransaction(String paymentTransactionId) throws ApiException {
        ApiResponse<PaymentTransactionsInstructionsModel> resp = getPaymentInstructionsForPaymentTransactionWithHttpInfo(paymentTransactionId);
        return resp.getData();
    }

    /**
     * Get payment instructions for Payment Transaction
     * &#x60;POST Payment/Transactions/{paymentTransactionId}/getPaymentInstructions&#x60;
     * @param paymentTransactionId Payment Transaction ID (required)
     * @return ApiResponse&lt;PaymentTransactionsInstructionsModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PaymentTransactionsInstructionsModel> getPaymentInstructionsForPaymentTransactionWithHttpInfo(String paymentTransactionId) throws ApiException {
        Call call = getPaymentInstructionsForPaymentTransactionValidateBeforeCall(paymentTransactionId);
        Type localVarReturnType = new TypeToken<PaymentTransactionsInstructionsModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get payment instructions for Payment Transaction (asynchronously)
     * &#x60;POST Payment/Transactions/{paymentTransactionId}/getPaymentInstructions&#x60;
     * @param paymentTransactionId Payment Transaction ID (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call getPaymentInstructionsForPaymentTransactionAsync(String paymentTransactionId, final ApiCallback<PaymentTransactionsInstructionsModel> callback) throws ApiException {
        Call call = getPaymentInstructionsForPaymentTransactionValidateBeforeCall(paymentTransactionId);
        Type localVarReturnType = new TypeToken<PaymentTransactionsInstructionsModel>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for getPaymentInstructionsForSmartTransaction
     * @param smartTransactionId Smart Transaction ID (required)
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public Call getPaymentInstructionsForSmartTransactionCall(String smartTransactionId) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/Payment/Transactions/me/getPaymentInstructions/{smartTransactionId}"
            .replaceAll("\\{" + "smartTransactionId" + "\\}", apiClient.escapeString(smartTransactionId.toString()));

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
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames);
    }

    @SuppressWarnings("rawtypes")
    private Call getPaymentInstructionsForSmartTransactionValidateBeforeCall(String smartTransactionId) throws ApiException {
        // verify the required parameter 'smartTransactionId' is set
        if (smartTransactionId == null) {
            throw new ApiException("Missing the required parameter 'smartTransactionId' when calling getPaymentInstructionsForSmartTransaction(Async)");
        }

        return getPaymentInstructionsForSmartTransactionCall(smartTransactionId);
    }

    /**
     * Get payment instructions for Smart Transaction
     * &#x60;POST Payment/Transactions/me/getPaymentInstructions/{smartTransactionId}&#x60;
     * @param smartTransactionId Smart Transaction ID (required)
     * @return PaymentTransactionsInstructionsModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PaymentTransactionsInstructionsModel getPaymentInstructionsForSmartTransaction(String smartTransactionId) throws ApiException {
        ApiResponse<PaymentTransactionsInstructionsModel> resp = getPaymentInstructionsForSmartTransactionWithHttpInfo(smartTransactionId);
        return resp.getData();
    }

    /**
     * Get payment instructions for Smart Transaction
     * &#x60;POST Payment/Transactions/me/getPaymentInstructions/{smartTransactionId}&#x60;
     * @param smartTransactionId Smart Transaction ID (required)
     * @return ApiResponse&lt;PaymentTransactionsInstructionsModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PaymentTransactionsInstructionsModel> getPaymentInstructionsForSmartTransactionWithHttpInfo(String smartTransactionId) throws ApiException {
        Call call = getPaymentInstructionsForSmartTransactionValidateBeforeCall(smartTransactionId);
        Type localVarReturnType = new TypeToken<PaymentTransactionsInstructionsModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get payment instructions for Smart Transaction (asynchronously)
     * &#x60;POST Payment/Transactions/me/getPaymentInstructions/{smartTransactionId}&#x60;
     * @param smartTransactionId Smart Transaction ID (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call getPaymentInstructionsForSmartTransactionAsync(String smartTransactionId, final ApiCallback<PaymentTransactionsInstructionsModel> callback) throws ApiException {
        Call call = getPaymentInstructionsForSmartTransactionValidateBeforeCall(smartTransactionId);
        Type localVarReturnType = new TypeToken<PaymentTransactionsInstructionsModel>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for getPaymentTransactionsOldFormat
     * @param paymentTransactionId Payment Transaction ID (PCI_...) or Flex.API transaction hash (required)
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public Call getPaymentTransactionsOldFormatCall(String paymentTransactionId) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/Payment/Transactions/{paymentTransactionId}/OldFormat"
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

        String[] localVarAuthNames = new String[] { "oauth_token" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames);
    }

    @SuppressWarnings("rawtypes")
    private Call getPaymentTransactionsOldFormatValidateBeforeCall(String paymentTransactionId) throws ApiException {
        // verify the required parameter 'paymentTransactionId' is set
        if (paymentTransactionId == null) {
            throw new ApiException("Missing the required parameter 'paymentTransactionId' when calling getPaymentTransactionsOldFormat(Async)");
        }

        return getPaymentTransactionsOldFormatCall(paymentTransactionId);
    }

    /**
     * Read in old format
     * Returns the specified Payment Transaction in old format.
     * @param paymentTransactionId Payment Transaction ID (PCI_...) or Flex.API transaction hash (required)
     * @return SecupayTransactionProductModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SecupayTransactionProductModel getPaymentTransactionsOldFormat(String paymentTransactionId) throws ApiException {
        ApiResponse<SecupayTransactionProductModel> resp = getPaymentTransactionsOldFormatWithHttpInfo(paymentTransactionId);
        return resp.getData();
    }

    /**
     * Read in old format
     * Returns the specified Payment Transaction in old format.
     * @param paymentTransactionId Payment Transaction ID (PCI_...) or Flex.API transaction hash (required)
     * @return ApiResponse&lt;SecupayTransactionProductModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SecupayTransactionProductModel> getPaymentTransactionsOldFormatWithHttpInfo(String paymentTransactionId) throws ApiException {
        Call call = getPaymentTransactionsOldFormatValidateBeforeCall(paymentTransactionId);
        Type localVarReturnType = new TypeToken<SecupayTransactionProductModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Read in old format (asynchronously)
     * Returns the specified Payment Transaction in old format.
     * @param paymentTransactionId Payment Transaction ID (PCI_...) or Flex.API transaction hash (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call getPaymentTransactionsOldFormatAsync(String paymentTransactionId, final ApiCallback<SecupayTransactionProductModel> callback) throws ApiException {
        Call call = getPaymentTransactionsOldFormatValidateBeforeCall(paymentTransactionId);
        Type localVarReturnType = new TypeToken<SecupayTransactionProductModel>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for increaseAmount
     * @param paymentTransactionId Payment Transaction ID (required)
     * @param body increase amount input params
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public Call increaseAmountCall(String paymentTransactionId, PaymentTransactionsIncreaseAmountDTO body) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/Payment/Transactions/{paymentTransactionId}/IncreaseAmount"
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

        String[] localVarAuthNames = new String[] { "oauth_token" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames);
    }

    @SuppressWarnings("rawtypes")
    private Call increaseAmountValidateBeforeCall(String paymentTransactionId, PaymentTransactionsIncreaseAmountDTO body) throws ApiException {
        // verify the required parameter 'paymentTransactionId' is set
        if (paymentTransactionId == null) {
            throw new ApiException("Missing the required parameter 'paymentTransactionId' when calling increaseAmount(Async)");
        }

        return increaseAmountCall(paymentTransactionId, body);
    }

    /**
     * Increase amount
     * Increases the amount of the given Payment Transaction. Currently, this only works for prepayment, and only before the payment has been received by secupay.
     * @param paymentTransactionId Payment Transaction ID (required)
     * @param body increase amount input params
     * @return PaymentTransactionsProductModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PaymentTransactionsProductModel increaseAmount(String paymentTransactionId, PaymentTransactionsIncreaseAmountDTO body) throws ApiException {
        ApiResponse<PaymentTransactionsProductModel> resp = increaseAmountWithHttpInfo(paymentTransactionId, body);
        return resp.getData();
    }

    /**
     * Increase amount
     * Increases the amount of the given Payment Transaction. Currently, this only works for prepayment, and only before the payment has been received by secupay.
     * @param paymentTransactionId Payment Transaction ID (required)
     * @param body increase amount input params
     * @return ApiResponse&lt;PaymentTransactionsProductModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PaymentTransactionsProductModel> increaseAmountWithHttpInfo(String paymentTransactionId, PaymentTransactionsIncreaseAmountDTO body) throws ApiException {
        Call call = increaseAmountValidateBeforeCall(paymentTransactionId, body);
        Type localVarReturnType = new TypeToken<PaymentTransactionsProductModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Increase amount (asynchronously)
     * Increases the amount of the given Payment Transaction. Currently, this only works for prepayment, and only before the payment has been received by secupay.
     * @param paymentTransactionId Payment Transaction ID (required)
     * @param body increase amount input params
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call increaseAmountAsync(String paymentTransactionId, PaymentTransactionsIncreaseAmountDTO body, final ApiCallback<PaymentTransactionsProductModel> callback) throws ApiException {
        Call call = increaseAmountValidateBeforeCall(paymentTransactionId, body);
        Type localVarReturnType = new TypeToken<PaymentTransactionsProductModel>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for revokeAccrual
     * @param paymentTransactionId Payment Transaction ID (required)
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public Call revokeAccrualCall(String paymentTransactionId) throws ApiException {
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

        String[] localVarAuthNames = new String[] { "oauth_token" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames);
    }

    @SuppressWarnings("rawtypes")
    private Call revokeAccrualValidateBeforeCall(String paymentTransactionId) throws ApiException {
        // verify the required parameter 'paymentTransactionId' is set
        if (paymentTransactionId == null) {
            throw new ApiException("Missing the required parameter 'paymentTransactionId' when calling revokeAccrual(Async)");
        }

        return revokeAccrualCall(paymentTransactionId);
    }

    /**
     * Revoke accrual
     * Revokes the accrual flag of a Payment Transaction. This flag withholds the actual execution of the payment. The payment will now be made if it has not already been made.
     * @param paymentTransactionId Payment Transaction ID (required)
     * @return PaymentTransactionsProductModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PaymentTransactionsProductModel revokeAccrual(String paymentTransactionId) throws ApiException {
        ApiResponse<PaymentTransactionsProductModel> resp = revokeAccrualWithHttpInfo(paymentTransactionId);
        return resp.getData();
    }

    /**
     * Revoke accrual
     * Revokes the accrual flag of a Payment Transaction. This flag withholds the actual execution of the payment. The payment will now be made if it has not already been made.
     * @param paymentTransactionId Payment Transaction ID (required)
     * @return ApiResponse&lt;PaymentTransactionsProductModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PaymentTransactionsProductModel> revokeAccrualWithHttpInfo(String paymentTransactionId) throws ApiException {
        Call call = revokeAccrualValidateBeforeCall(paymentTransactionId);
        Type localVarReturnType = new TypeToken<PaymentTransactionsProductModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Revoke accrual (asynchronously)
     * Revokes the accrual flag of a Payment Transaction. This flag withholds the actual execution of the payment. The payment will now be made if it has not already been made.
     * @param paymentTransactionId Payment Transaction ID (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call revokeAccrualAsync(String paymentTransactionId, final ApiCallback<PaymentTransactionsProductModel> callback) throws ApiException {
        Call call = revokeAccrualValidateBeforeCall(paymentTransactionId);
        Type localVarReturnType = new TypeToken<PaymentTransactionsProductModel>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for updateShippingInformation
     * @param paymentTransactionId Payment Transaction ID (PCI_...) or Flex.API transaction hash (required)
     * @param body Shipping information
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public Call updateShippingInformationCall(String paymentTransactionId, SecupayTransactionSetShippingInformationDTO body) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/Payment/Transactions/{paymentTransactionId}/ShippingInformation"
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

        String[] localVarAuthNames = new String[] { "oauth_token" };
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames);
    }

    @SuppressWarnings("rawtypes")
    private Call updateShippingInformationValidateBeforeCall(String paymentTransactionId, SecupayTransactionSetShippingInformationDTO body) throws ApiException {
        // verify the required parameter 'paymentTransactionId' is set
        if (paymentTransactionId == null) {
            throw new ApiException("Missing the required parameter 'paymentTransactionId' when calling updateShippingInformation(Async)");
        }

        return updateShippingInformationCall(paymentTransactionId, body);
    }

    /**
     * Add shipping information
     * Adds shipping information, and marks the Payment Transaction as shipped when called the first time.  **Note: This is obligatory for purchase on account, because otherwise it is not known that and when the invoice is due.**
     * @param paymentTransactionId Payment Transaction ID (PCI_...) or Flex.API transaction hash (required)
     * @param body Shipping information
     * @return ResultBoolean
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ResultBoolean updateShippingInformation(String paymentTransactionId, SecupayTransactionSetShippingInformationDTO body) throws ApiException {
        ApiResponse<ResultBoolean> resp = updateShippingInformationWithHttpInfo(paymentTransactionId, body);
        return resp.getData();
    }

    /**
     * Add shipping information
     * Adds shipping information, and marks the Payment Transaction as shipped when called the first time.  **Note: This is obligatory for purchase on account, because otherwise it is not known that and when the invoice is due.**
     * @param paymentTransactionId Payment Transaction ID (PCI_...) or Flex.API transaction hash (required)
     * @param body Shipping information
     * @return ApiResponse&lt;ResultBoolean&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ResultBoolean> updateShippingInformationWithHttpInfo(String paymentTransactionId, SecupayTransactionSetShippingInformationDTO body) throws ApiException {
        Call call = updateShippingInformationValidateBeforeCall(paymentTransactionId, body);
        Type localVarReturnType = new TypeToken<ResultBoolean>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Add shipping information (asynchronously)
     * Adds shipping information, and marks the Payment Transaction as shipped when called the first time.  **Note: This is obligatory for purchase on account, because otherwise it is not known that and when the invoice is due.**
     * @param paymentTransactionId Payment Transaction ID (PCI_...) or Flex.API transaction hash (required)
     * @param body Shipping information
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call updateShippingInformationAsync(String paymentTransactionId, SecupayTransactionSetShippingInformationDTO body, final ApiCallback<ResultBoolean> callback) throws ApiException {
        Call call = updateShippingInformationValidateBeforeCall(paymentTransactionId, body);
        Type localVarReturnType = new TypeToken<ResultBoolean>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}

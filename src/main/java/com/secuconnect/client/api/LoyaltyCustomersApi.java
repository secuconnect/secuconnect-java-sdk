package com.secuconnect.client.api;

import com.secuconnect.client.ApiCallback;
import com.secuconnect.client.ApiClient;
import com.secuconnect.client.ApiException;
import com.secuconnect.client.ApiResponse;
import com.secuconnect.client.Configuration;
import com.secuconnect.client.Pair;
import com.secuconnect.client.ProgressRequestBody;
import com.secuconnect.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;

import com.secuconnect.client.model.CustomersWithoutMerchantcardAndDuplicatedCustomers;
import com.secuconnect.client.model.LoyaltyCustomersDTO;
import com.secuconnect.client.model.LoyaltyCustomersList;
import com.secuconnect.client.model.LoyaltyCustomersProductModel;
import com.secuconnect.client.model.LoyaltyCustomersRemoved;
import com.secuconnect.client.model.ProductExceptionPayload;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LoyaltyCustomersApi {
    private ApiClient apiClient;

    public LoyaltyCustomersApi() {
        this(Configuration.getDefaultApiClient());
    }

    public LoyaltyCustomersApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for loyaltyCustomersaddCustomer
     * @param body loyalty Customer container properties (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call loyaltyCustomersaddCustomerCall(LoyaltyCustomersDTO body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/Loyalty/Customers";

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
    private com.squareup.okhttp.Call loyaltyCustomersaddCustomerValidateBeforeCall(LoyaltyCustomersDTO body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = loyaltyCustomersaddCustomerCall(body, progressListener, progressRequestListener);
        return call;
    }

    /**
     * POST Loyalty/Customers
     * Add loyalty customer
     * @param body loyalty Customer container properties (optional)
     * @return LoyaltyCustomersProductModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public LoyaltyCustomersProductModel loyaltyCustomersaddCustomer(LoyaltyCustomersDTO body) throws ApiException {
        ApiResponse<LoyaltyCustomersProductModel> resp = loyaltyCustomersaddCustomerWithHttpInfo(body);
        return resp.getData();
    }

    /**
     * POST Loyalty/Customers
     * Add loyalty customer
     * @param body loyalty Customer container properties (optional)
     * @return ApiResponse&lt;LoyaltyCustomersProductModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<LoyaltyCustomersProductModel> loyaltyCustomersaddCustomerWithHttpInfo(LoyaltyCustomersDTO body) throws ApiException {
        com.squareup.okhttp.Call call = loyaltyCustomersaddCustomerValidateBeforeCall(body, null, null);
        Type localVarReturnType = new TypeToken<LoyaltyCustomersProductModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * POST Loyalty/Customers (asynchronously)
     * Add loyalty customer
     * @param body loyalty Customer container properties (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call loyaltyCustomersaddCustomerAsync(LoyaltyCustomersDTO body, final ApiCallback<LoyaltyCustomersProductModel> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = loyaltyCustomersaddCustomerValidateBeforeCall(body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<LoyaltyCustomersProductModel>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for loyaltyCustomersassignPaymentContainer
     * @param loyaltyCustomerId Loyalty customer id (required)
     * @param loyaltyPaymentContainerId LoyaltyPaymentContainer id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call loyaltyCustomersassignPaymentContainerCall(String loyaltyCustomerId, String loyaltyPaymentContainerId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Loyalty/Customers/{loyaltyCustomerId}/assignPaymentContainer/{loyaltyPaymentContainerId}"
            .replaceAll("\\{" + "loyaltyCustomerId" + "\\}", apiClient.escapeString(loyaltyCustomerId.toString()))
            .replaceAll("\\{" + "loyaltyPaymentContainerId" + "\\}", apiClient.escapeString(loyaltyPaymentContainerId.toString()));

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
    private com.squareup.okhttp.Call loyaltyCustomersassignPaymentContainerValidateBeforeCall(String loyaltyCustomerId, String loyaltyPaymentContainerId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'loyaltyCustomerId' is set
        if (loyaltyCustomerId == null) {
            throw new ApiException("Missing the required parameter 'loyaltyCustomerId' when calling loyaltyCustomersassignPaymentContainer(Async)");
        }
        // verify the required parameter 'loyaltyPaymentContainerId' is set
        if (loyaltyPaymentContainerId == null) {
            throw new ApiException("Missing the required parameter 'loyaltyPaymentContainerId' when calling loyaltyCustomersassignPaymentContainer(Async)");
        }
        
        com.squareup.okhttp.Call call = loyaltyCustomersassignPaymentContainerCall(loyaltyCustomerId, loyaltyPaymentContainerId, progressListener, progressRequestListener);
        return call;
    }

    /**
     * POST Loyalty/Customers/{loyaltyCustomerId}/assignPaymentContainer/{loyaltyPaymentContainerId}
     * Assigns LoyaltyPaymentContainer to customer
     * @param loyaltyCustomerId Loyalty customer id (required)
     * @param loyaltyPaymentContainerId LoyaltyPaymentContainer id (required)
     * @return LoyaltyCustomersProductModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public LoyaltyCustomersProductModel loyaltyCustomersassignPaymentContainer(String loyaltyCustomerId, String loyaltyPaymentContainerId) throws ApiException {
        ApiResponse<LoyaltyCustomersProductModel> resp = loyaltyCustomersassignPaymentContainerWithHttpInfo(loyaltyCustomerId, loyaltyPaymentContainerId);
        return resp.getData();
    }

    /**
     * POST Loyalty/Customers/{loyaltyCustomerId}/assignPaymentContainer/{loyaltyPaymentContainerId}
     * Assigns LoyaltyPaymentContainer to customer
     * @param loyaltyCustomerId Loyalty customer id (required)
     * @param loyaltyPaymentContainerId LoyaltyPaymentContainer id (required)
     * @return ApiResponse&lt;LoyaltyCustomersProductModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<LoyaltyCustomersProductModel> loyaltyCustomersassignPaymentContainerWithHttpInfo(String loyaltyCustomerId, String loyaltyPaymentContainerId) throws ApiException {
        com.squareup.okhttp.Call call = loyaltyCustomersassignPaymentContainerValidateBeforeCall(loyaltyCustomerId, loyaltyPaymentContainerId, null, null);
        Type localVarReturnType = new TypeToken<LoyaltyCustomersProductModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * POST Loyalty/Customers/{loyaltyCustomerId}/assignPaymentContainer/{loyaltyPaymentContainerId} (asynchronously)
     * Assigns LoyaltyPaymentContainer to customer
     * @param loyaltyCustomerId Loyalty customer id (required)
     * @param loyaltyPaymentContainerId LoyaltyPaymentContainer id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call loyaltyCustomersassignPaymentContainerAsync(String loyaltyCustomerId, String loyaltyPaymentContainerId, final ApiCallback<LoyaltyCustomersProductModel> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = loyaltyCustomersassignPaymentContainerValidateBeforeCall(loyaltyCustomerId, loyaltyPaymentContainerId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<LoyaltyCustomersProductModel>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for loyaltyCustomerscheckForDuplicates
     * @param loyaltyCustomerId Loyalty customer id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call loyaltyCustomerscheckForDuplicatesCall(String loyaltyCustomerId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Loyalty/Customers/{loyaltyCustomerId}/checkDuplicated/"
            .replaceAll("\\{" + "loyaltyCustomerId" + "\\}", apiClient.escapeString(loyaltyCustomerId.toString()));

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
    private com.squareup.okhttp.Call loyaltyCustomerscheckForDuplicatesValidateBeforeCall(String loyaltyCustomerId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'loyaltyCustomerId' is set
        if (loyaltyCustomerId == null) {
            throw new ApiException("Missing the required parameter 'loyaltyCustomerId' when calling loyaltyCustomerscheckForDuplicates(Async)");
        }
        
        com.squareup.okhttp.Call call = loyaltyCustomerscheckForDuplicatesCall(loyaltyCustomerId, progressListener, progressRequestListener);
        return call;
    }

    /**
     * POST Loyalty/Customers/{loyaltyCustomerId}/checkDuplicated/
     * check if there are duplicated customers for a given merchant
     * @param loyaltyCustomerId Loyalty customer id (required)
     * @return CustomersWithoutMerchantcardAndDuplicatedCustomers
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CustomersWithoutMerchantcardAndDuplicatedCustomers loyaltyCustomerscheckForDuplicates(String loyaltyCustomerId) throws ApiException {
        ApiResponse<CustomersWithoutMerchantcardAndDuplicatedCustomers> resp = loyaltyCustomerscheckForDuplicatesWithHttpInfo(loyaltyCustomerId);
        return resp.getData();
    }

    /**
     * POST Loyalty/Customers/{loyaltyCustomerId}/checkDuplicated/
     * check if there are duplicated customers for a given merchant
     * @param loyaltyCustomerId Loyalty customer id (required)
     * @return ApiResponse&lt;CustomersWithoutMerchantcardAndDuplicatedCustomers&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CustomersWithoutMerchantcardAndDuplicatedCustomers> loyaltyCustomerscheckForDuplicatesWithHttpInfo(String loyaltyCustomerId) throws ApiException {
        com.squareup.okhttp.Call call = loyaltyCustomerscheckForDuplicatesValidateBeforeCall(loyaltyCustomerId, null, null);
        Type localVarReturnType = new TypeToken<CustomersWithoutMerchantcardAndDuplicatedCustomers>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * POST Loyalty/Customers/{loyaltyCustomerId}/checkDuplicated/ (asynchronously)
     * check if there are duplicated customers for a given merchant
     * @param loyaltyCustomerId Loyalty customer id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call loyaltyCustomerscheckForDuplicatesAsync(String loyaltyCustomerId, final ApiCallback<CustomersWithoutMerchantcardAndDuplicatedCustomers> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = loyaltyCustomerscheckForDuplicatesValidateBeforeCall(loyaltyCustomerId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CustomersWithoutMerchantcardAndDuplicatedCustomers>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for loyaltyCustomersgetAll
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
    public com.squareup.okhttp.Call loyaltyCustomersgetAllCall(Integer count, Integer offset, String fields, String q, String sort, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Loyalty/Customers";

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
    private com.squareup.okhttp.Call loyaltyCustomersgetAllValidateBeforeCall(Integer count, Integer offset, String fields, String q, String sort, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = loyaltyCustomersgetAllCall(count, offset, fields, q, sort, progressListener, progressRequestListener);
        return call;
    }

    /**
     * GET Loyalty/Customers
     * Get a list of loyalty customers
     * @param count The number of items to return. (optional)
     * @param offset The position within the whole result set to start returning items (First element is at 0). (optional)
     * @param fields List of fields to include in the result. Nested properties can be accessed with this notation: prop1.prop2  Example: prop3,prop1.prop2 (optional)
     * @param q A query string to restrict the returned items to given conditions. The query string must consist of any combination of single expressions in the form property:condition.  *                   A condition may contain:  *                       - wildcard \&quot;*\&quot; for any number of characters  *                       - wildcard \&quot;?\&quot; for one character  *                       - ranges in the form [value TO value]  *  *                   Single expressions may combined by &#x27;AND&#x27;, &#x27;OR&#x27;, &#x27;NOT&#x27; operators and parenthesis &#x27;(&#x27;, &#x27;)&#x27; for grouping.  *                   Property names can be nested like \&quot;prop1.prop2\&quot;.  *                   Example: (NOT customer.name:meier*) AND (customer.age:[30 TO 40] OR customer.age:[50 TO 60])  *                    (optional)
     * @param sort String with comma separated pairs of field:order (e.g. contact.surname:asc,contact.comapnyname:desc). Result set will be sorted by included fields, in ascending &#x27;asc&#x27;, or descending &#x27;dsc&#x27; order. (optional)
     * @return LoyaltyCustomersList
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public LoyaltyCustomersList loyaltyCustomersgetAll(Integer count, Integer offset, String fields, String q, String sort) throws ApiException {
        ApiResponse<LoyaltyCustomersList> resp = loyaltyCustomersgetAllWithHttpInfo(count, offset, fields, q, sort);
        return resp.getData();
    }

    /**
     * GET Loyalty/Customers
     * Get a list of loyalty customers
     * @param count The number of items to return. (optional)
     * @param offset The position within the whole result set to start returning items (First element is at 0). (optional)
     * @param fields List of fields to include in the result. Nested properties can be accessed with this notation: prop1.prop2  Example: prop3,prop1.prop2 (optional)
     * @param q A query string to restrict the returned items to given conditions. The query string must consist of any combination of single expressions in the form property:condition.  *                   A condition may contain:  *                       - wildcard \&quot;*\&quot; for any number of characters  *                       - wildcard \&quot;?\&quot; for one character  *                       - ranges in the form [value TO value]  *  *                   Single expressions may combined by &#x27;AND&#x27;, &#x27;OR&#x27;, &#x27;NOT&#x27; operators and parenthesis &#x27;(&#x27;, &#x27;)&#x27; for grouping.  *                   Property names can be nested like \&quot;prop1.prop2\&quot;.  *                   Example: (NOT customer.name:meier*) AND (customer.age:[30 TO 40] OR customer.age:[50 TO 60])  *                    (optional)
     * @param sort String with comma separated pairs of field:order (e.g. contact.surname:asc,contact.comapnyname:desc). Result set will be sorted by included fields, in ascending &#x27;asc&#x27;, or descending &#x27;dsc&#x27; order. (optional)
     * @return ApiResponse&lt;LoyaltyCustomersList&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<LoyaltyCustomersList> loyaltyCustomersgetAllWithHttpInfo(Integer count, Integer offset, String fields, String q, String sort) throws ApiException {
        com.squareup.okhttp.Call call = loyaltyCustomersgetAllValidateBeforeCall(count, offset, fields, q, sort, null, null);
        Type localVarReturnType = new TypeToken<LoyaltyCustomersList>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * GET Loyalty/Customers (asynchronously)
     * Get a list of loyalty customers
     * @param count The number of items to return. (optional)
     * @param offset The position within the whole result set to start returning items (First element is at 0). (optional)
     * @param fields List of fields to include in the result. Nested properties can be accessed with this notation: prop1.prop2  Example: prop3,prop1.prop2 (optional)
     * @param q A query string to restrict the returned items to given conditions. The query string must consist of any combination of single expressions in the form property:condition.  *                   A condition may contain:  *                       - wildcard \&quot;*\&quot; for any number of characters  *                       - wildcard \&quot;?\&quot; for one character  *                       - ranges in the form [value TO value]  *  *                   Single expressions may combined by &#x27;AND&#x27;, &#x27;OR&#x27;, &#x27;NOT&#x27; operators and parenthesis &#x27;(&#x27;, &#x27;)&#x27; for grouping.  *                   Property names can be nested like \&quot;prop1.prop2\&quot;.  *                   Example: (NOT customer.name:meier*) AND (customer.age:[30 TO 40] OR customer.age:[50 TO 60])  *                    (optional)
     * @param sort String with comma separated pairs of field:order (e.g. contact.surname:asc,contact.comapnyname:desc). Result set will be sorted by included fields, in ascending &#x27;asc&#x27;, or descending &#x27;dsc&#x27; order. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call loyaltyCustomersgetAllAsync(Integer count, Integer offset, String fields, String q, String sort, final ApiCallback<LoyaltyCustomersList> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = loyaltyCustomersgetAllValidateBeforeCall(count, offset, fields, q, sort, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<LoyaltyCustomersList>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for loyaltyCustomersgetOne
     * @param loyaltyCustomerId Search one loyalty customer by provided id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call loyaltyCustomersgetOneCall(String loyaltyCustomerId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Loyalty/Customers/{loyaltyCustomerId}"
            .replaceAll("\\{" + "loyaltyCustomerId" + "\\}", apiClient.escapeString(loyaltyCustomerId.toString()));

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
    private com.squareup.okhttp.Call loyaltyCustomersgetOneValidateBeforeCall(String loyaltyCustomerId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'loyaltyCustomerId' is set
        if (loyaltyCustomerId == null) {
            throw new ApiException("Missing the required parameter 'loyaltyCustomerId' when calling loyaltyCustomersgetOne(Async)");
        }
        
        com.squareup.okhttp.Call call = loyaltyCustomersgetOneCall(loyaltyCustomerId, progressListener, progressRequestListener);
        return call;
    }

    /**
     * GET Loyalty/Customers/{loyaltyCustomerId}
     * Get loyalty customer for a specific id
     * @param loyaltyCustomerId Search one loyalty customer by provided id (required)
     * @return LoyaltyCustomersProductModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public LoyaltyCustomersProductModel loyaltyCustomersgetOne(String loyaltyCustomerId) throws ApiException {
        ApiResponse<LoyaltyCustomersProductModel> resp = loyaltyCustomersgetOneWithHttpInfo(loyaltyCustomerId);
        return resp.getData();
    }

    /**
     * GET Loyalty/Customers/{loyaltyCustomerId}
     * Get loyalty customer for a specific id
     * @param loyaltyCustomerId Search one loyalty customer by provided id (required)
     * @return ApiResponse&lt;LoyaltyCustomersProductModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<LoyaltyCustomersProductModel> loyaltyCustomersgetOneWithHttpInfo(String loyaltyCustomerId) throws ApiException {
        com.squareup.okhttp.Call call = loyaltyCustomersgetOneValidateBeforeCall(loyaltyCustomerId, null, null);
        Type localVarReturnType = new TypeToken<LoyaltyCustomersProductModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * GET Loyalty/Customers/{loyaltyCustomerId} (asynchronously)
     * Get loyalty customer for a specific id
     * @param loyaltyCustomerId Search one loyalty customer by provided id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call loyaltyCustomersgetOneAsync(String loyaltyCustomerId, final ApiCallback<LoyaltyCustomersProductModel> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = loyaltyCustomersgetOneValidateBeforeCall(loyaltyCustomerId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<LoyaltyCustomersProductModel>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for loyaltyCustomersremoveAssignedPaymentContainer
     * @param loyaltyCustomerId Loyalty customer id (required)
     * @param loyaltyPaymentContainerId LoyaltyPaymentContainer id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call loyaltyCustomersremoveAssignedPaymentContainerCall(String loyaltyCustomerId, String loyaltyPaymentContainerId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Loyalty/Customers/{loyaltyCustomerId}/assignPaymentContainer/{loyaltyPaymentContainerId}"
            .replaceAll("\\{" + "loyaltyCustomerId" + "\\}", apiClient.escapeString(loyaltyCustomerId.toString()))
            .replaceAll("\\{" + "loyaltyPaymentContainerId" + "\\}", apiClient.escapeString(loyaltyPaymentContainerId.toString()));

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
    private com.squareup.okhttp.Call loyaltyCustomersremoveAssignedPaymentContainerValidateBeforeCall(String loyaltyCustomerId, String loyaltyPaymentContainerId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'loyaltyCustomerId' is set
        if (loyaltyCustomerId == null) {
            throw new ApiException("Missing the required parameter 'loyaltyCustomerId' when calling loyaltyCustomersremoveAssignedPaymentContainer(Async)");
        }
        // verify the required parameter 'loyaltyPaymentContainerId' is set
        if (loyaltyPaymentContainerId == null) {
            throw new ApiException("Missing the required parameter 'loyaltyPaymentContainerId' when calling loyaltyCustomersremoveAssignedPaymentContainer(Async)");
        }
        
        com.squareup.okhttp.Call call = loyaltyCustomersremoveAssignedPaymentContainerCall(loyaltyCustomerId, loyaltyPaymentContainerId, progressListener, progressRequestListener);
        return call;
    }

    /**
     * DELETE Loyalty/Customers/{loyaltyCustomerId}/assignPaymentContainer/{loyaltyPaymentContainerId}
     * Removes an assigned LoyaltyPaymentContainer from customer
     * @param loyaltyCustomerId Loyalty customer id (required)
     * @param loyaltyPaymentContainerId LoyaltyPaymentContainer id (required)
     * @return LoyaltyCustomersProductModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public LoyaltyCustomersProductModel loyaltyCustomersremoveAssignedPaymentContainer(String loyaltyCustomerId, String loyaltyPaymentContainerId) throws ApiException {
        ApiResponse<LoyaltyCustomersProductModel> resp = loyaltyCustomersremoveAssignedPaymentContainerWithHttpInfo(loyaltyCustomerId, loyaltyPaymentContainerId);
        return resp.getData();
    }

    /**
     * DELETE Loyalty/Customers/{loyaltyCustomerId}/assignPaymentContainer/{loyaltyPaymentContainerId}
     * Removes an assigned LoyaltyPaymentContainer from customer
     * @param loyaltyCustomerId Loyalty customer id (required)
     * @param loyaltyPaymentContainerId LoyaltyPaymentContainer id (required)
     * @return ApiResponse&lt;LoyaltyCustomersProductModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<LoyaltyCustomersProductModel> loyaltyCustomersremoveAssignedPaymentContainerWithHttpInfo(String loyaltyCustomerId, String loyaltyPaymentContainerId) throws ApiException {
        com.squareup.okhttp.Call call = loyaltyCustomersremoveAssignedPaymentContainerValidateBeforeCall(loyaltyCustomerId, loyaltyPaymentContainerId, null, null);
        Type localVarReturnType = new TypeToken<LoyaltyCustomersProductModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * DELETE Loyalty/Customers/{loyaltyCustomerId}/assignPaymentContainer/{loyaltyPaymentContainerId} (asynchronously)
     * Removes an assigned LoyaltyPaymentContainer from customer
     * @param loyaltyCustomerId Loyalty customer id (required)
     * @param loyaltyPaymentContainerId LoyaltyPaymentContainer id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call loyaltyCustomersremoveAssignedPaymentContainerAsync(String loyaltyCustomerId, String loyaltyPaymentContainerId, final ApiCallback<LoyaltyCustomersProductModel> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = loyaltyCustomersremoveAssignedPaymentContainerValidateBeforeCall(loyaltyCustomerId, loyaltyPaymentContainerId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<LoyaltyCustomersProductModel>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for loyaltyCustomersremoveCustomer
     * @param loyaltyCustomerId Loyalty customer id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call loyaltyCustomersremoveCustomerCall(String loyaltyCustomerId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Loyalty/Customers/{loyaltyCustomerId}"
            .replaceAll("\\{" + "loyaltyCustomerId" + "\\}", apiClient.escapeString(loyaltyCustomerId.toString()));

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
    private com.squareup.okhttp.Call loyaltyCustomersremoveCustomerValidateBeforeCall(String loyaltyCustomerId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'loyaltyCustomerId' is set
        if (loyaltyCustomerId == null) {
            throw new ApiException("Missing the required parameter 'loyaltyCustomerId' when calling loyaltyCustomersremoveCustomer(Async)");
        }
        
        com.squareup.okhttp.Call call = loyaltyCustomersremoveCustomerCall(loyaltyCustomerId, progressListener, progressRequestListener);
        return call;
    }

    /**
     * DELETE Loyalty/Customers/{loyaltyCustomerId}
     * Remove assigned loyalty customer
     * @param loyaltyCustomerId Loyalty customer id (required)
     * @return LoyaltyCustomersRemoved
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public LoyaltyCustomersRemoved loyaltyCustomersremoveCustomer(String loyaltyCustomerId) throws ApiException {
        ApiResponse<LoyaltyCustomersRemoved> resp = loyaltyCustomersremoveCustomerWithHttpInfo(loyaltyCustomerId);
        return resp.getData();
    }

    /**
     * DELETE Loyalty/Customers/{loyaltyCustomerId}
     * Remove assigned loyalty customer
     * @param loyaltyCustomerId Loyalty customer id (required)
     * @return ApiResponse&lt;LoyaltyCustomersRemoved&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<LoyaltyCustomersRemoved> loyaltyCustomersremoveCustomerWithHttpInfo(String loyaltyCustomerId) throws ApiException {
        com.squareup.okhttp.Call call = loyaltyCustomersremoveCustomerValidateBeforeCall(loyaltyCustomerId, null, null);
        Type localVarReturnType = new TypeToken<LoyaltyCustomersRemoved>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * DELETE Loyalty/Customers/{loyaltyCustomerId} (asynchronously)
     * Remove assigned loyalty customer
     * @param loyaltyCustomerId Loyalty customer id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call loyaltyCustomersremoveCustomerAsync(String loyaltyCustomerId, final ApiCallback<LoyaltyCustomersRemoved> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = loyaltyCustomersremoveCustomerValidateBeforeCall(loyaltyCustomerId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<LoyaltyCustomersRemoved>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for loyaltyCustomersupdateCustomer
     * @param loyaltyCustomerId loyalty Customer Id CUS_XXX (required)
     * @param body loyalty Customer container properties (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call loyaltyCustomersupdateCustomerCall(String loyaltyCustomerId, LoyaltyCustomersDTO body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/Loyalty/Customers/{loyaltyCustomerId}"
            .replaceAll("\\{" + "loyaltyCustomerId" + "\\}", apiClient.escapeString(loyaltyCustomerId.toString()));

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
    private com.squareup.okhttp.Call loyaltyCustomersupdateCustomerValidateBeforeCall(String loyaltyCustomerId, LoyaltyCustomersDTO body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'loyaltyCustomerId' is set
        if (loyaltyCustomerId == null) {
            throw new ApiException("Missing the required parameter 'loyaltyCustomerId' when calling loyaltyCustomersupdateCustomer(Async)");
        }
        
        com.squareup.okhttp.Call call = loyaltyCustomersupdateCustomerCall(loyaltyCustomerId, body, progressListener, progressRequestListener);
        return call;
    }

    /**
     * PUT Loyalty/Customers/{loyaltyCustomerId}
     * Function to update customer&#x27;s data
     * @param loyaltyCustomerId loyalty Customer Id CUS_XXX (required)
     * @param body loyalty Customer container properties (optional)
     * @return LoyaltyCustomersProductModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public LoyaltyCustomersProductModel loyaltyCustomersupdateCustomer(String loyaltyCustomerId, LoyaltyCustomersDTO body) throws ApiException {
        ApiResponse<LoyaltyCustomersProductModel> resp = loyaltyCustomersupdateCustomerWithHttpInfo(loyaltyCustomerId, body);
        return resp.getData();
    }

    /**
     * PUT Loyalty/Customers/{loyaltyCustomerId}
     * Function to update customer&#x27;s data
     * @param loyaltyCustomerId loyalty Customer Id CUS_XXX (required)
     * @param body loyalty Customer container properties (optional)
     * @return ApiResponse&lt;LoyaltyCustomersProductModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<LoyaltyCustomersProductModel> loyaltyCustomersupdateCustomerWithHttpInfo(String loyaltyCustomerId, LoyaltyCustomersDTO body) throws ApiException {
        com.squareup.okhttp.Call call = loyaltyCustomersupdateCustomerValidateBeforeCall(loyaltyCustomerId, body, null, null);
        Type localVarReturnType = new TypeToken<LoyaltyCustomersProductModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * PUT Loyalty/Customers/{loyaltyCustomerId} (asynchronously)
     * Function to update customer&#x27;s data
     * @param loyaltyCustomerId loyalty Customer Id CUS_XXX (required)
     * @param body loyalty Customer container properties (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call loyaltyCustomersupdateCustomerAsync(String loyaltyCustomerId, LoyaltyCustomersDTO body, final ApiCallback<LoyaltyCustomersProductModel> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = loyaltyCustomersupdateCustomerValidateBeforeCall(loyaltyCustomerId, body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<LoyaltyCustomersProductModel>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}

/*
 * SecuConnect API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 2.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.secuconnect.client.api;

import io.secuconnect.client.ApiException;
import io.secuconnect.client.model.PaymentContainersDTO;
import io.secuconnect.client.model.PaymentContainersList;
import io.secuconnect.client.model.PaymentContainersProductModel;
import org.junit.Test;
import org.junit.Ignore;

import java.util.List;

/**
 * API tests for PaymentContainersApi
 */
@Ignore
public class PaymentContainersApiTest {

    private final PaymentContainersApi api = new PaymentContainersApi();

    
    /**
     * 
     *
     * Get a list of payment containers
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void paymentContainersGetTest() throws ApiException {
        Integer count = null;
        Integer offset = null;
        String fields = null;
        String q = null;
        String sort = null;
        PaymentContainersList response = api.paymentContainersGet(count, offset, fields, q, sort);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Get all payment containers
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void paymentContainersGetByIdTest() throws ApiException {
        String id = null;
        PaymentContainersProductModel response = api.paymentContainersGetById(id);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Removes an existing payment container assignment
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void paymentContainersIdAssignSecondaryIdDeleteTest() throws ApiException {
        String id = null;
        String secondaryId = null;
        List<PaymentContainersProductModel> response = api.paymentContainersIdAssignSecondaryIdDelete(id, secondaryId);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Assign an existing payment container to ...
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void paymentContainersIdAssignSecondaryIdPostTest() throws ApiException {
        String id = null;
        String secondaryId = null;
        PaymentContainersProductModel response = api.paymentContainersIdAssignSecondaryIdPost(id, secondaryId);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Delete payment container
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void paymentContainersIdDeleteTest() throws ApiException {
        String id = null;
        List<PaymentContainersProductModel> response = api.paymentContainersIdDelete(id);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Update payment container
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void paymentContainersIdPutTest() throws ApiException {
        String id = null;
        PaymentContainersDTO body = null;
        PaymentContainersProductModel response = api.paymentContainersIdPut(id, body);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Add new containers
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void paymentContainersPostTest() throws ApiException {
        PaymentContainersDTO body = null;
        PaymentContainersProductModel response = api.paymentContainersPost(body);

        // TODO: test validations
    }
    
}

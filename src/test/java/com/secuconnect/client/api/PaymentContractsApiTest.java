package com.secuconnect.client.api;

import com.secuconnect.client.ApiException;
import com.secuconnect.client.Environment;
import com.secuconnect.client.Globals;
import com.secuconnect.client.model.PaymentContractsDTOClone;
import com.secuconnect.client.model.PaymentContractsDTORequestId;
import com.secuconnect.client.model.PaymentContractsProductModel;
import com.secuconnect.client.model.PaymentContractsRequestIdResult;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static com.secuconnect.client.CommonObjectsProvider.prepareDataFoRequestId;
import static com.secuconnect.client.CommonObjectsProvider.prepareDataForClone;
import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.*;

/**
 * API tests for PaymentContractsApi
 */
public class PaymentContractsApiTest {
    private static final String PAYMENT_CONTRACTS = "payment.contracts";
    private static PaymentContractsApi contractsApi;
    private static PaymentContractsDTOClone paymentContractsDTOClone;
    private static PaymentContractsDTORequestId paymentContractsDTORequestId;
    private static String contractId;

    @BeforeClass
    public static void setUp() {
        try {
            Environment
                .getGlobalEnv()
                .setCredentials(Globals.O_AUTH_CLIENT_CREDENTIALS)
                .authenticate();
            contractsApi = new PaymentContractsApi();

            paymentContractsDTOClone = prepareDataForClone();
            paymentContractsDTORequestId = prepareDataFoRequestId();
            contractId = "me";
        } catch (ApiException ex) {
            ex.printStackTrace();
            fail(ex.getResponseBody());
        }
    }

    @AfterClass
    public static void tearDown() {
        contractsApi = null;
        paymentContractsDTOClone = null;
        paymentContractsDTORequestId = null;
        contractId = null;
    }

    /**
     * Test case for cloning payment contract.
     */
    @Test
    public void cloneTest() {
        PaymentContractsProductModel paymentContract = null;

        try {
            paymentContract = contractsApi.clone(contractId, paymentContractsDTOClone);
        } catch (ApiException e) {
            System.out.println(e.getResponseBody());
            e.printStackTrace();
        }

        assertNotNull(paymentContract);
        assertEquals(PAYMENT_CONTRACTS, paymentContract.getObject());
        assertNotNull(paymentContract.getId());
        assertNotNull(paymentContract.getParent());
        assertEquals(PAYMENT_CONTRACTS, paymentContract.getParent().getObject());
        assertNotNull(paymentContract.getParent().getId());
        assertNotNull(paymentContract.getCreated());
    }

    /**
     * Test case for requesting id.
     */
    @Test
    public void requestIdTest() {
        PaymentContractsRequestIdResult requestIdResult = null;

        try {
            requestIdResult = contractsApi.requestId(contractId, paymentContractsDTORequestId);
        } catch (ApiException e) {
            System.out.println(e.getResponseBody());
            e.printStackTrace();
        }

        assertNotNull(requestIdResult);
        assertEquals(PAYMENT_CONTRACTS, requestIdResult.getContract().getObject());
        assertNotNull(requestIdResult.getContract().getId());
        assertNotNull(requestIdResult.getApikey());
        assertNull(requestIdResult.getPayinAccount());
    }
}

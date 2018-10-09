package io.secuconnect.client.api;

import io.secuconnect.client.ApiClient;
import io.secuconnect.client.ApiException;
import io.secuconnect.client.auth.Authenticator;
import io.secuconnect.client.auth.tokens.OAuthClientToken;
import io.secuconnect.client.model.*;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static io.secuconnect.client.CommonObjectsProvider.prepareDataFoRequestId;
import static io.secuconnect.client.CommonObjectsProvider.prepareDataForClone;
import static io.secuconnect.client.Globals.O_AUTH_CLIENT_CREDENTIALS_FOR_PAYMENT_CONTRACTS;
import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.*;

/**
 * API tests for PaymentContractsApi
 */
public class PaymentContractsApiTest {
    private static final String PAYMENT_CONTRACTS = "payment.contracts";
    private static Authenticator authenticator;
    private static PaymentContractsApi contractsApi;
    private static PaymentContractsDTOClone paymentContractsDTOClone;
    private static PaymentContractsDTORequestId paymentContractsDTORequestId;
    private static String contractId;

    @BeforeClass
    public static void setUp() {
        authenticator = new Authenticator(O_AUTH_CLIENT_CREDENTIALS_FOR_PAYMENT_CONTRACTS);
        String accessToken = null;

        try {
            OAuthClientToken token = (OAuthClientToken) authenticator.getToken();
            accessToken = token.getAccessToken();
        } catch (ApiException e) {
            e.printStackTrace();
        }

        contractsApi = new PaymentContractsApi();
        ApiClient paymentContractsApiClient = contractsApi.getApiClient();
        paymentContractsApiClient.setAccessToken(accessToken);

        paymentContractsDTOClone = prepareDataForClone();
        paymentContractsDTORequestId = prepareDataFoRequestId();
        contractId = "me";
    }

    @AfterClass
    public static void tearDown() {
        authenticator = null;
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
        assertTrue(paymentContract.getDemo());
        assertFalse(paymentContract.getAllowCloning());
        assertEquals("never", paymentContract.getSepaMandateInform());
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
        assertNotNull(requestIdResult.getContract().getParent());
        assertEquals(PAYMENT_CONTRACTS, requestIdResult.getContract().getParent().getObject());
        assertNotNull(requestIdResult.getContract().getParent().getId());
        assertTrue(requestIdResult.getContract().getDemo());
        assertFalse(requestIdResult.getContract().getAllowCloning());
        assertEquals("never", requestIdResult.getContract().getSepaMandateInform());
        assertNotNull(requestIdResult.getContract().getCreated());
        assertNotNull(requestIdResult.getApikey());
        assertNull(requestIdResult.getPayingAccount());
    }
}

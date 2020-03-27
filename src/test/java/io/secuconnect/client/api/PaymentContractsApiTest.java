package io.secuconnect.client.api;

import io.secuconnect.client.ApiClient;
import io.secuconnect.client.ApiException;
import io.secuconnect.client.Globals;
import io.secuconnect.client.auth.Authenticator;
import io.secuconnect.client.auth.tokens.OAuthClientToken;
import io.secuconnect.client.model.PaymentContractsDTOClone;
import io.secuconnect.client.model.PaymentContractsDTORequestId;
import io.secuconnect.client.model.PaymentContractsProductModel;
import io.secuconnect.client.model.PaymentContractsRequestIdResult;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static io.secuconnect.client.CommonObjectsProvider.prepareDataFoRequestId;
import static io.secuconnect.client.CommonObjectsProvider.prepareDataForClone;
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
        authenticator = new Authenticator(Globals.O_AUTH_CLIENT_CREDENTIALS);
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

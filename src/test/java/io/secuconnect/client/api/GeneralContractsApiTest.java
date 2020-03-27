package com.secuconnect.client.api;

import com.secuconnect.client.ApiClient;
import com.secuconnect.client.ApiException;
import com.secuconnect.client.Globals;
import com.secuconnect.client.auth.Authenticator;
import com.secuconnect.client.auth.tokens.OAuthClientToken;
import com.secuconnect.client.model.*;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.*;
import static org.junit.Assert.assertTrue;

/**
 * API tests for GeneralContractsApi
 */
public class GeneralContractsApiTest {
    private static final String GENERAL_CONTRACTS = "general.contracts";
    private static Authenticator authenticator;
    private static GeneralContractsApi contractsApi;
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

        contractsApi = new GeneralContractsApi();
        ApiClient GeneralContractsApiClient = contractsApi.getApiClient();
        GeneralContractsApiClient.setAccessToken(accessToken);

        contractId = "me";
    }

    @AfterClass
    public static void tearDown() {
        authenticator = null;
        contractsApi = null;
        contractId = null;
    }
    /**
     *
     *
     * Get a list of payment customers
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getListTest() throws ApiException {
        Integer count = null;
        Integer offset = null;
        String fields = null;
        String q = null;
        String sort = null;
        GeneralContractsList response = contractsApi.getAll(count, offset, fields, q, sort);

        assertNotNull(response);
        assertTrue(response.getCount() > 0);

        GeneralContractsProductModel contract = response.getData().get(0);
        assertNotNull(contract);
        assertEquals("general.contracts", contract.getObject());
    }

    /**
     *
     *
     * Get all payment customers
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getOneTest() throws ApiException {
        String id = null;
        GeneralContractsProductModel response = contractsApi.getOne("GCR_DSWAK2WF0BRE3CK4KHY6TWNKH4H8P7");

        assertNotNull(response);
        assertEquals("general.contracts", response.getObject());
    }


}

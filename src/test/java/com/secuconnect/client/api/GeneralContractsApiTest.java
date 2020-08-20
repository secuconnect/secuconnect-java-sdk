package com.secuconnect.client.api;

import com.secuconnect.client.ApiException;
import com.secuconnect.client.Environment;
import com.secuconnect.client.Globals;
import com.secuconnect.client.model.GeneralContractsList;
import com.secuconnect.client.model.GeneralContractsProductModel;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.*;

/**
 * API tests for GeneralContractsApi
 */
public class GeneralContractsApiTest {
    private static GeneralContractsApi contractsApi;

    @BeforeClass
    public static void setUp() {
        try {
            Environment
                .getGlobalEnv()
                .setCredentials(Globals.O_AUTH_CLIENT_CREDENTIALS)
                .authenticate();

            contractsApi = new GeneralContractsApi();
        } catch (ApiException ex) {
            ex.printStackTrace();
            fail(ex.getResponseBody());
        }
    }

    @AfterClass
    public static void tearDown() {
        contractsApi = null;
    }

    /**
     * Get a list of payment customers
     *
     * @ if the Api call fails
     */
    @Test
    public void getListTest() {
        try {
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
        } catch (ApiException ex) {
            ex.printStackTrace();
            fail(ex.getResponseBody());
        }
    }

    /**
     * Get all payment customers
     *
     * @ if the Api call fails
     */
    @Test
    public void getOneTest() {
        try {
            String id = null;
            GeneralContractsProductModel response = contractsApi.getOne("GCR_DSWAK2WF0BRE3CK4KHY6TWNKH4H8P7");

            assertNotNull(response);
            assertEquals("general.contracts", response.getObject());
        } catch (ApiException ex) {
            ex.printStackTrace();
            fail(ex.getResponseBody());
        }
    }
}

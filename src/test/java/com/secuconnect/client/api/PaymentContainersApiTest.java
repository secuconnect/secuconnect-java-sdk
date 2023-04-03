package com.secuconnect.client.api;

import com.secuconnect.client.ApiException;
import com.secuconnect.client.Environment;
import com.secuconnect.client.Globals;
import com.secuconnect.client.model.*;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

/**
 * API tests for PaymentContainersApi
 */
public class PaymentContainersApiTest {

    private static PaymentContainersApi api = null;

    @BeforeClass
    public static void setUp() {
        try {
            Environment
                .getGlobalEnv()
                .setCredentials(Globals.O_AUTH_CLIENT_CREDENTIALS)
                .authenticate();
            api = new PaymentContainersApi();
        } catch (ApiException ex) {
            ex.printStackTrace();
            fail(ex.getResponseBody());
        }
    }

    /**
     * Add new containers
     *
     * @ if the Api call fails
     */
    @Test
    public void paymentContainersPostBankAccountTest() {
        try {
            PaymentContainersDTO containerDTO = new PaymentContainersDTO();
            containerDTO.setType("bank_account");
            BankAccountDescriptor privateInfo = new BankAccountDescriptor();
            privateInfo.setBic("FTSBDEFAXXX");
            privateInfo.setIban("DE37503240001000000524");
            privateInfo.setOwner("John Doe");
            containerDTO.setPrivate(privateInfo);

            PaymentContainersDTOCustomer paymentContainerDTOCustomer = new PaymentContainersDTOCustomer();
            containerDTO.setCustomer(paymentContainerDTOCustomer);

            PaymentContainersProductModel container = api.paymentContainersPost(containerDTO);
            String containerId = container.getId();
            BankAccountDescriptor privateDataDTO = (BankAccountDescriptor) containerDTO.getPrivate();
            BankAccountDescriptor privateData = (BankAccountDescriptor) container.getPrivate();
            BankAccountDescriptor publicData = (BankAccountDescriptor) container.getPublic();

            assertNotNull(containerId);
            assertEquals(privateDataDTO.getBic(), privateData.getBic());
            assertEquals(privateDataDTO.getIban(), privateData.getIban());
            assertEquals(privateDataDTO.getOwner(), privateData.getOwner());
            assertNotNull(privateData.getBankname());
            assertEquals(privateData.getBic(), publicData.getBic());
            assertEquals(privateData.getIban(), publicData.getIban());
            assertEquals(privateData.getOwner(), publicData.getOwner());
            assertNotNull(publicData.getBankname());
        } catch (ApiException ex) {
            ex.printStackTrace();
            fail(ex.getResponseBody());
        }
    }

    /**
     * Add new containers
     *
     * @ if the Api call fails
     */
    @Test
    public void paymentContainersPostCreditCardTest() {
        try {
            PaymentContainersDTO containerDTO = new PaymentContainersDTO();
            containerDTO.setType("credit_card");
            CreditCardDescriptor privateInfo = new CreditCardDescriptor();
            privateInfo.setOwner("John Doe");
            privateInfo.setPan("454617XXXXXX7022");
            privateInfo.setExpirationDate("2025-01-31T00:00:00+00:00");
            privateInfo.setIssuer("VISA");
            privateInfo.setTransactContainer("z6xFnPCx55prhQ9j1KrML2ql2qTnNfofMHkgaCCJ69hnVo0GyPacZgzEhuo4jyWZIgFZ25/1WewFC941kk8hjISRU2M5kP2QVtGUICo2FAY=");
            privateInfo.setTransactSkeyPubkey("XwxfXlQSh1DBqe0J44Txx5qm7lc3cfXJ9UkUORBdEOggv1L+MAdbHLLidIZZwl01LAAXDRjsElNH6BbNQqhCvFeN5H/+/c6WE3A+ynbrKojZMm99t5iQW/ksMiXjxoVF9nzgZN/2p+mbr7QzQ5tRfMUOROwvI4rLH2t66dCAgXpkbO3jMJhjjspBs3foyFgAfBZ6zhZXj7yMn7MZ0CgxB+R31EODJhmXvNgcNCTFu0o5WxCZPNe6YOucjDSBSztgvXDxc70y3zHrlUPvtCOT4FGSQDYeRrCSYL7ewLv9S5v8CbQxVaakgsIrv5zEZCpXG12hdKv189eDzeuZHrHJRw==");
            privateInfo.setTransactSkeyKeyname("weberpublic");
            privateInfo.setTransactHash("31b40080b9999af7bc72ef2d863283057733d9089beca289600f7b3b16a735002c4563ce5846c7411f0db9fa0b0fee3087d3570152ae2ef44c877b27c290e2af");
            containerDTO.setPrivate(privateInfo);

            PaymentContainersDTOCustomer paymentContainerDTOCustomer = new PaymentContainersDTOCustomer();
            containerDTO.setCustomer(paymentContainerDTOCustomer);

            PaymentContainersProductModel container = api.paymentContainersPost(containerDTO);
            String containerId = container.getId();
            CreditCardDescriptor privateDataDTO = (CreditCardDescriptor) containerDTO.getPrivate();
            CreditCardDescriptor privateData = (CreditCardDescriptor) container.getPrivate();
            CreditCardDescriptor publicData = (CreditCardDescriptor) container.getPublic();

            assertNotNull(containerId);
            assertEquals(privateDataDTO.getOwner(), privateData.getOwner());
            assertEquals(privateDataDTO.getPan(), privateData.getPan());
            assertEquals(privateData.getOwner(), publicData.getOwner());
            assertEquals(privateData.getPan(), publicData.getPan());
        } catch (ApiException ex) {
            ex.printStackTrace();
            fail(ex.getResponseBody());
        }
    }

    /**
     * Add new containers
     *
     * @ if the Api call fails
     */
    @Test
    public void paymentContainersPostApplePayTest() {
        try {
            PaymentContainersDTO containerDTO = new PaymentContainersDTO();
            containerDTO.setType("applepay");
            ApplePayDescriptor privateInfo = new ApplePayDescriptor();
            privateInfo.setVersion("EC_v1");
            privateInfo.setData("FOaw2iQpyo6gPM3ZXsUX/yTfZCgk/DDm4yMRwpwEZcRQWtMJv0mbqQRKVjC5j9Pb/zO/fH1jKSIxS+NfSo+0FiWK5y/EXldnwmbdc0wjNJMkW7LQuu4Zc+/6m+XIePkSKN7Fck0pR48udMWl/T+DiM5+J9SC+takDiYcR5R3W7Jv8u32nmdImByZY1UHHx+50DlbAdZv9+RmhCt+VG5nI4ddZqfrbPcmG8LOxtJjZYLufK6LMGs2xvIcuZn6ACLXPFclBKeMlK6KTmwlafSXy19LRmfs8lQcFN8nmpCXFktwqbuQnarK4ccQAQtMo6ywJ6LB1v9W8CMIEGMpZDz80ThzJuWnRmjse3Aok6EUXMppWd+wcFYmTrHnscN81gNbpiIrDK7fKC6");
            privateInfo.setSignature("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");
            ApplePayDescriptorHeader header = new ApplePayDescriptorHeader();
            header.setEphemeralPublicKey("MFkwEwYHKoZIzj0CAQYIKoZIzj0DAQcDQgAEQApAlKRS1gbnwPrZ73QGl7aH8nIqAYLtwvNxn20aUXdp0qmA/as39SExySCRqBdmAgId7hR7fpw9CQLg9bGkaA==");
            header.setPublicKeyHash("s0kz9blgxv4vsOXzFVHBvPDij9L8QliA1x42gtP/K3Y=");
            header.setTransactionId("ad87fd21f5ae4b9ed4fd80b01acf579e29a417c90eac71b8770d9b1dae244c9d");
            privateInfo.setHeader(header);
            containerDTO.setPrivate(privateInfo);

            PaymentContainersDTOCustomer paymentContainerDTOCustomer = new PaymentContainersDTOCustomer();
            containerDTO.setCustomer(paymentContainerDTOCustomer);

            PaymentContainersProductModel container = api.paymentContainersPost(containerDTO);
            String containerId = container.getId();

            assertNotNull(containerId);
        } catch (ApiException ex) {
            ex.printStackTrace();
            fail(ex.getResponseBody());
        }
    }

    /**
     * Add new containers
     *
     * @ if the Api call fails
     */
    @Test
    public void paymentContainersPostGooglePayTest() {
        try {
            PaymentContainersDTO containerDTO = new PaymentContainersDTO();
            containerDTO.setType("googlepay");
            GooglePayDescriptor privateInfo = new GooglePayDescriptor();
            privateInfo.setSignature("MEYCIQCIhMUpMpRZM/NSg2XGkCHWxAzNHL24UNh44M2zS2SSowIhANR6NgjYFpU5W12HNczDSuaJx3R2Q/hFTJzt1kqNZ8w4");
            privateInfo.setProtocolVersion("ECv1");
            privateInfo.setSignedMessage("{\\\"encryptedMessage\\\":\\\"6QrdO9Rm5wUO76YrgOFu4k/d42mAgYVtMMvpEybDQoFL5Wj...\\\",\\\"ephemeralPublicKey\\\":\\\"BEz07ptykA21w7ZhwDjB3Kn2558wR3xnM6y/iZUn5mfFMljm6ZHtBANF+L4yObcq1CfCnvRPR90Gid2+Myht5WA\\\\u003d\\\",\\\"tag\\\":\\\"9l5vnWtmGctNQvifh4qZggLR9gvzURj2EgobsR0oUDE\\\\u003d\\\"}");
            containerDTO.setPrivate(privateInfo);

            PaymentContainersDTOCustomer paymentContainerDTOCustomer = new PaymentContainersDTOCustomer();
            containerDTO.setCustomer(paymentContainerDTOCustomer);

            PaymentContainersProductModel container = api.paymentContainersPost(containerDTO);
            String containerId = container.getId();

            assertNotNull(containerId);
        } catch (ApiException ex) {
            ex.printStackTrace();
            fail(ex.getResponseBody());
        }
    }

    /**
     * Add new containers
     *
     * @ if the Api call fails
     */
    @Test
    public void paymentContainersPostPayPalTest() {
        try {
            PaymentContainersDTO containerDTO = new PaymentContainersDTO();
            containerDTO.setType("paypal");
            PayPalDescriptor privateInfo = new PayPalDescriptor();
            privateInfo.setEmail("customer@example.com");
            privateInfo.setPayerId("2J6QB8YJQSJRJ");
            containerDTO.setPrivate(privateInfo);

            PaymentContainersDTOCustomer paymentContainerDTOCustomer = new PaymentContainersDTOCustomer();
            containerDTO.setCustomer(paymentContainerDTOCustomer);

            PaymentContainersProductModel container = api.paymentContainersPost(containerDTO);
            String containerId = container.getId();
            PayPalDescriptor privateDataDTO = (PayPalDescriptor) containerDTO.getPrivate();
            PayPalDescriptor privateData = (PayPalDescriptor) container.getPrivate();
            PayPalDescriptor publicData = (PayPalDescriptor) container.getPublic();

            assertNotNull(containerId);
            assertEquals(privateDataDTO.getEmail(), privateData.getEmail());
            assertEquals(privateDataDTO.getPayerId(), privateData.getPayerId());
            assertEquals(privateData.getEmail(), publicData.getEmail());
            assertEquals(privateData.getPayerId(), publicData.getPayerId());
        } catch (ApiException ex) {
            ex.printStackTrace();
            fail(ex.getResponseBody());
        }
    }
}

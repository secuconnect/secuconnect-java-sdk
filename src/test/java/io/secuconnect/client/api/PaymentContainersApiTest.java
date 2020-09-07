package io.secuconnect.client.api;

import io.secuconnect.client.ApiClient;
import io.secuconnect.client.ApiException;
import io.secuconnect.client.auth.Authenticator;
import io.secuconnect.client.auth.tokens.OAuthClientToken;
import io.secuconnect.client.model.*;
import org.junit.BeforeClass;
import org.junit.Test;

import static io.secuconnect.client.Globals.O_AUTH_CLIENT_CREDENTIALS;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * API tests for PaymentContainersApi
 */
public class PaymentContainersApiTest {

    private static PaymentContainersApi api = null;

    @BeforeClass
    public static void setUp() {
        Authenticator authenticator = new Authenticator(O_AUTH_CLIENT_CREDENTIALS);
        String accessToken = null;

        try {
            OAuthClientToken token = (OAuthClientToken) authenticator.getToken();
            accessToken = token.getAccessToken();
        } catch (ApiException e) {
            e.printStackTrace();
        }

        api = new PaymentContainersApi();
        ApiClient containerApiClient = api.getApiClient();
        containerApiClient.setAccessToken(accessToken);
    }

    /**
     * Add new containers
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void paymentContainersPostBankAccountTest() throws ApiException {
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
    }

    /**
     * Add new containers
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void paymentContainersPostCreditCardTest() throws ApiException {
        PaymentContainersDTO containerDTO = new PaymentContainersDTO();
        containerDTO.setType("credit_card");
        CreditCardDescriptor privateInfo = new CreditCardDescriptor();
        privateInfo.setOwner("John Doe");
        privateInfo.setPan("454617XXXXXX7022");
        privateInfo.setExpirationDate("2023-01-31T00:00:00+00:00");
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
    }

}

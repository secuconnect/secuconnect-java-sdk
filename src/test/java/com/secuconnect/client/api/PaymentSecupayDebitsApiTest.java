package com.secuconnect.client.api;

import com.secuconnect.client.ApiException;
import com.secuconnect.client.CommonObjectsProvider;
import com.secuconnect.client.Environment;
import com.secuconnect.client.Globals;
import com.secuconnect.client.model.*;
import org.junit.*;
import org.junit.runners.MethodSorters;

import java.util.List;

import static org.junit.Assert.*;


/**
 * API tests for PaymentSecupayDebitsApi
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class PaymentSecupayDebitsApiTest {
    private static PaymentCustomersApi customerApi;
    private static PaymentContainersApi containerApi;
    private static PaymentSecupayDebitsApi debitApi;
    private static PaymentCustomersDTO customerDTO;
    private static PaymentContainersDTO containerDTO;
    private static SecupayTransactionProductDTO debitsData;
    private static List<SecupayBasketItem> basket;
    private static SecupayTransactionProductModel debitTransactionData;

    @BeforeClass
    public static void setUp() {
        try {
            Environment
                .getGlobalEnv()
                .setCredentials(Globals.O_AUTH_CLIENT_CREDENTIALS)
                .authenticate();
            debitApi = new PaymentSecupayDebitsApi();
            customerApi = new PaymentCustomersApi();
            containerApi = new PaymentContainersApi();

            customerDTO = CommonObjectsProvider.prepareCustomer();
            containerDTO = prepareContainer();
            debitsData = prepareDebitsData();
        } catch (ApiException ex) {
            ex.printStackTrace();
            fail(ex.getResponseBody());
        }
    }

    private static PaymentContainersDTO prepareContainer() {
        PaymentContainersDTO containerDTO = new PaymentContainersDTO();
        BankAccountDescriptor privateInfo = new BankAccountDescriptor();
        privateInfo.setBic("INGDDEFFXXX");
        privateInfo.setIban("DE12500105170648489890");
        privateInfo.setOwner("John Doe");
        containerDTO.setPrivate(privateInfo);

        PaymentContainersDTOCustomer paymentContainerDTOCustomer = new PaymentContainersDTOCustomer();
        containerDTO.setCustomer(paymentContainerDTOCustomer);

        return containerDTO;
    }

    private static SecupayTransactionProductDTO prepareDebitsData() {
        SecupayTransactionProductDTO debitsData = new SecupayTransactionProductDTO();
        debitsData.setAmount(6200);
        debitsData.setCurrency("EUR");
        debitsData.setPurpose("for what text");
        debitsData.setOrderId("ZZZZZZ");

        basket = CommonObjectsProvider.prepareBasket();
        debitsData.setBasket(basket);

        SecupayRedirectUrl redirectUrl = new SecupayRedirectUrl();
        redirectUrl.setUrlSuccess("http://shop.example.com?success=true");
        redirectUrl.setUrlFailure("http://shop.example.com?success=false");
        redirectUrl.setUrlPush("https://requestb.in/14f6a1j1");
        debitsData.setRedirectUrl(redirectUrl);

        return debitsData;
    }

    @AfterClass
    public static void tearDown() {
        debitApi = null;
        customerApi = null;
        debitsData = null;
        customerDTO = null;
        basket = null;
        debitTransactionData = null;
    }

    /**
     * Create new payment customer
     *
     * @ if the Api call fails
     */
    @Test
    public void a_paymentCustomerPostTest() {
        try {
            PaymentCustomersProductModel customer = customerApi.paymentCustomersPost(customerDTO);
            assertNotNull(customer.getId());
            debitsData.setCustomer(customer);

            assertEquals("John", customer.getContact().getForename());
            assertEquals("Doe", customer.getContact().getSurname());
            assertEquals("Example Inc.", customer.getContact().getCompanyname());
        } catch (ApiException ex) {
            ex.printStackTrace();
            fail(ex.getResponseBody());
        }
    }

    /**
     * Create new payment container
     *
     * @ if the Api call fails
     */
    @Test
    public void b_paymentContainerPostTest() {
        try {
            PaymentContainersProductModel container = containerApi.paymentContainersPost(containerDTO);
            assertNotNull(container.getId());
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

            debitsData.setContainer(containerId);
        } catch (ApiException ex) {
            ex.printStackTrace();
            fail(ex.getResponseBody());
        }
    }

    /**
     * Start a debit payment transaction
     *
     * @ if the Api call fails
     */
    @Test
    public void c_paymentSecupayDebitsPostTest() {
        assertNotNull(debitsData.getCustomer().getId());
        assertNotNull(debitsData.getContainer());
        try {
            debitTransactionData = debitApi.paymentSecupaydebitsPost(debitsData);

            assertEquals("payment.secupaydebits", debitTransactionData.getObject());
            assertNotNull(debitTransactionData.getId());
            assertNotNull(debitTransactionData.getTransId());
            assertNotNull(debitTransactionData.getStatus());
            assertEquals(debitsData.getAmount(), debitTransactionData.getAmount());
            assertEquals(debitsData.getCurrency(), debitTransactionData.getCurrency());
            assertEquals(debitsData.getPurpose(), debitTransactionData.getPurpose());
            assertEquals(debitsData.getOrderId(), debitTransactionData.getOrderId());
            assertEquals(3, debitTransactionData.getBasket().size());
            assertEquals(debitsData.getBasket().get(0).getItemType(), debitTransactionData.getBasket().get(0).getItemType());
            assertEquals(debitsData.getBasket().get(0).getName(), debitTransactionData.getBasket().get(0).getName());
            assertEquals(debitsData.getBasket().get(0).getTotal(), debitTransactionData.getBasket().get(0).getTotal());

            for (int i = 1; i <= 2; i++) {
                assertEquals(debitsData.getBasket().get(i).getItemType(), debitTransactionData.getBasket().get(i).getItemType());
                assertEquals(debitsData.getBasket().get(i).getArticleNumber(), debitTransactionData.getBasket().get(i).getArticleNumber());
                assertEquals(debitsData.getBasket().get(i).getQuantity(), debitTransactionData.getBasket().get(i).getQuantity());
                assertEquals(debitsData.getBasket().get(i).getName(), debitTransactionData.getBasket().get(i).getName());
                assertEquals(debitsData.getBasket().get(i).getEan(), debitTransactionData.getBasket().get(i).getEan());
                assertEquals(debitsData.getBasket().get(i).getTax(), debitTransactionData.getBasket().get(i).getTax());
                assertEquals(debitsData.getBasket().get(i).getTotal(), debitTransactionData.getBasket().get(i).getTotal());
                assertEquals(debitsData.getBasket().get(i).getPrice(), debitTransactionData.getBasket().get(i).getPrice());
            }

            assertNotNull(debitTransactionData.getTransactionStatus());
            assertEquals("sale", debitTransactionData.getPaymentAction());
            assertNotNull(debitTransactionData.getPurpose());
            assertEquals("payment.customers", debitTransactionData.getCustomer().getObject());
            assertNotNull(debitTransactionData.getCustomer().getId());
            assertEquals(debitsData.getCustomer().getContact().getForename(), debitTransactionData.getCustomer().getContact().getForename());
            assertEquals(debitsData.getCustomer().getContact().getSurname(), debitTransactionData.getCustomer().getContact().getSurname());
            assertEquals(debitsData.getCustomer().getContact().getCompanyname(), debitTransactionData.getCustomer().getContact().getCompanyname());
            assertNotNull(debitTransactionData.getRedirectUrl().getIframeUrl());
            assertEquals(debitsData.getRedirectUrl().getUrlSuccess(), debitTransactionData.getRedirectUrl().getUrlSuccess());
            assertEquals(debitsData.getRedirectUrl().getUrlFailure(), debitTransactionData.getRedirectUrl().getUrlFailure());
        } catch (ApiException ex) {
            ex.printStackTrace();
            fail(ex.getResponseBody());
        }
    }

    /**
     * Get the details of a payment transaction
     *
     * @ if the Api call fails
     */
    @Test
    public void d_paymentSecupayDebitsGetByIdTest() {
        try {
            SecupayTransactionProductModel debitTransactionDataFetchedUsingGet = debitApi.paymentSecupayDebitsGetById(debitTransactionData.getId());

            assertEquals(debitTransactionData.getObject(), debitTransactionDataFetchedUsingGet.getObject());
            assertEquals(debitTransactionData.getId(), debitTransactionDataFetchedUsingGet.getId());
            assertEquals(debitTransactionData.getTransId(), debitTransactionDataFetchedUsingGet.getTransId());
            assertEquals(debitTransactionData.getStatus(), debitTransactionDataFetchedUsingGet.getStatus());
            assertEquals(debitTransactionData.getAmount(), debitTransactionDataFetchedUsingGet.getAmount());
            assertEquals(debitTransactionData.getCurrency(), debitTransactionDataFetchedUsingGet.getCurrency());
            assertEquals(debitTransactionData.getPurpose(), debitTransactionDataFetchedUsingGet.getPurpose());
            assertEquals(debitTransactionData.getOrderId(), debitTransactionDataFetchedUsingGet.getOrderId());
            assertEquals(debitTransactionData.getBasket().size(), debitTransactionDataFetchedUsingGet.getBasket().size());
            assertEquals(debitTransactionData.getBasket().get(0).getItemType(), debitTransactionDataFetchedUsingGet.getBasket().get(0).getItemType());
            assertEquals(debitTransactionData.getBasket().get(0).getName(), debitTransactionDataFetchedUsingGet.getBasket().get(0).getName());
            assertEquals(debitTransactionData.getBasket().get(0).getTotal(), debitTransactionDataFetchedUsingGet.getBasket().get(0).getTotal());

            for (int i = 1; i <= 2; i++) {
                assertEquals(debitTransactionData.getBasket().get(i).getItemType(), debitTransactionDataFetchedUsingGet.getBasket().get(i).getItemType());
                assertEquals(debitTransactionData.getBasket().get(i).getArticleNumber(), debitTransactionDataFetchedUsingGet.getBasket().get(i).getArticleNumber());
                assertEquals(debitTransactionData.getBasket().get(i).getQuantity(), debitTransactionDataFetchedUsingGet.getBasket().get(i).getQuantity());
                assertEquals(debitTransactionData.getBasket().get(i).getName(), debitTransactionDataFetchedUsingGet.getBasket().get(i).getName());
                assertEquals(debitTransactionData.getBasket().get(i).getEan(), debitTransactionDataFetchedUsingGet.getBasket().get(i).getEan());
                assertEquals(debitTransactionData.getBasket().get(i).getTax(), debitTransactionDataFetchedUsingGet.getBasket().get(i).getTax());
                assertEquals(debitTransactionData.getBasket().get(i).getTotal(), debitTransactionDataFetchedUsingGet.getBasket().get(i).getTotal());
                assertEquals(debitTransactionData.getBasket().get(i).getPrice(), debitTransactionDataFetchedUsingGet.getBasket().get(i).getPrice());
            }

            assertEquals(debitTransactionData.getTransactionStatus(), debitTransactionDataFetchedUsingGet.getTransactionStatus());
            assertEquals(debitTransactionData.getPaymentAction(), debitTransactionDataFetchedUsingGet.getPaymentAction());
            assertEquals(debitTransactionData.getPurpose(), debitTransactionDataFetchedUsingGet.getPurpose());
            assertEquals(debitTransactionData.getCustomer().getObject(), debitTransactionDataFetchedUsingGet.getCustomer().getObject());
            assertEquals(debitTransactionData.getCustomer().getId(), debitTransactionDataFetchedUsingGet.getCustomer().getId());
            assertEquals(debitTransactionData.getCustomer().getContact().getForename(), debitTransactionDataFetchedUsingGet.getCustomer().getContact().getForename());
            assertEquals(debitTransactionData.getCustomer().getContact().getSurname(), debitTransactionDataFetchedUsingGet.getCustomer().getContact().getSurname());
            assertEquals(debitTransactionData.getCustomer().getContact().getCompanyname(), debitTransactionDataFetchedUsingGet.getCustomer().getContact().getCompanyname());
            assertEquals(debitTransactionData.getRedirectUrl().getIframeUrl(), debitTransactionDataFetchedUsingGet.getRedirectUrl().getIframeUrl());
            assertEquals(debitTransactionData.getRedirectUrl().getUrlSuccess(), debitTransactionDataFetchedUsingGet.getRedirectUrl().getUrlSuccess());
            assertEquals(debitTransactionData.getRedirectUrl().getUrlFailure(), debitTransactionDataFetchedUsingGet.getRedirectUrl().getUrlFailure());
        } catch (ApiException ex) {
            ex.printStackTrace();
            fail(ex.getResponseBody());
        }
    }

    /**
     * Function to cancel the transaction
     *
     * @ if the Api call fails
     */
    @Test
    public void e_paymentSecupayDebitsCancelByIdTest() {
        try {
            PaymentCancelResult response = debitApi.cancelPaymentTransactionById("secupaydebits", debitTransactionData.getId(), null);
            assertNotNull(response);
            assertTrue(response.getDemo());
        } catch (ApiException ex) {
            ex.printStackTrace();
            fail(ex.getResponseBody());
        }
    }

    /**
     * Delete payment container
     *
     * @ if the Api call fails
     */
    @Test
    public void f_paymentContainerDeleteTest() {
        try {
            String containerId = debitsData.getContainer();
            PaymentContainersProductModel deletedContainer = containerApi.paymentContainersIdDelete(containerId).get(0);

            String deletedContainerId = deletedContainer.getId();
            BankAccountDescriptor privateDataDTO = (BankAccountDescriptor) containerDTO.getPrivate();
            BankAccountDescriptor privateData = (BankAccountDescriptor) deletedContainer.getPrivate();
            BankAccountDescriptor publicData = (BankAccountDescriptor) deletedContainer.getPublic();

            assertEquals(containerId, deletedContainerId);
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
     * Delete payment customer
     *
     * @ if the Api call fails
     */
    @Test
    public void g_paymentCustomerDeleteTest() {
        try {
            List<PaymentCustomersProductModel> deletedCustomerList = customerApi.paymentCustomersIdDelete(debitsData.getCustomer().getId());
            PaymentCustomersProductModel deletedCustomer = deletedCustomerList.get(0);

            assertEquals(debitsData.getCustomer().getContact().getForename(), deletedCustomer.getContact().getForename());
            assertEquals(debitsData.getCustomer().getContact().getSurname(), deletedCustomer.getContact().getSurname());
            assertEquals(debitsData.getCustomer().getContact().getCompanyname(), deletedCustomer.getContact().getCompanyname());
        } catch (ApiException ex) {
            ex.printStackTrace();
            fail(ex.getResponseBody());
        }
    }
}

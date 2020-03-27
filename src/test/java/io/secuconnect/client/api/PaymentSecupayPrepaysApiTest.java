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

import io.secuconnect.client.ApiClient;
import io.secuconnect.client.ApiException;
import io.secuconnect.client.api.PaymentSecupayPrepaysApi;
import io.secuconnect.client.auth.Authenticator;
import io.secuconnect.client.auth.tokens.OAuthClientToken;
import io.secuconnect.client.model.*;
import org.junit.*;
import org.junit.runners.MethodSorters;

import java.util.List;

import static io.secuconnect.client.CommonObjectsProvider.prepareBasket;
import static io.secuconnect.client.CommonObjectsProvider.prepareCustomer;
import static io.secuconnect.client.CommonObjectsProvider.prepareTransactionData;
import static io.secuconnect.client.Globals.O_AUTH_CLIENT_CREDENTIALS;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Ignore;

/**
 * API tests for PaymentSecupayPrepaysApi
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class PaymentSecupayPrepaysApiTest {
    private static Authenticator authenticator;
    private static PaymentSecupayPrepaysApi prepayApi;
    private static PaymentCustomersApi customerApi;
    private static SecupayTransactionProductDTO prepaysData;
    private static PaymentCustomersDTO customerDTO;
    private static List<SecupayBasketItem> basket;
    private static SecupayTransactionProductModel prepayTransactionData;

    @BeforeClass
    public static void setUp() {
        authenticator = new Authenticator(O_AUTH_CLIENT_CREDENTIALS);
        String accessToken = null;

        try {
            OAuthClientToken token = (OAuthClientToken) authenticator.getToken();
            accessToken = token.getAccessToken();
        } catch (ApiException e) {
            e.printStackTrace();
        }

        prepayApi = new PaymentSecupayPrepaysApi();
        ApiClient prepayApiClient = prepayApi.getApiClient();
        prepayApiClient.setAccessToken(accessToken);

        customerApi = new PaymentCustomersApi();
        ApiClient customerApiClient = customerApi.getApiClient();
        customerApiClient.setAccessToken(accessToken);

        customerDTO = prepareCustomer();
        prepaysData = prepareTransactionData();
        basket = prepareBasket();

        prepaysData.setBasket(basket);
    }

    @AfterClass
    public static void tearDown() {
        authenticator = null;
        prepayApi = null;
        customerApi = null;
        prepaysData = null;
        customerDTO = null;
        basket = null;
        prepayTransactionData = null;
    }

    /**
     *
     * Create new payment customer
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void a_paymentCustomerPostTest() throws ApiException {
        PaymentCustomersProductModel customer = customerApi.paymentCustomersPost(customerDTO);
        prepaysData.setCustomer(customer);

        assertEquals(customerDTO.getContact().getForename(), customer.getContact().getForename());
        assertEquals(customerDTO.getContact().getSurname(), customer.getContact().getSurname());
        assertEquals(customerDTO.getContact().getCompanyname(), customer.getContact().getCompanyname());
    }

    /**
     *
     * Start a payment prepay transaction
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void b_paymentSecupayprepaysPostTest() throws ApiException {
        prepayTransactionData = prepayApi.paymentSecupayprepaysPost(prepaysData);

        assertEquals("payment.secupayprepays", prepayTransactionData.getObject());
        assertNotNull(prepayTransactionData.getId());
        assertNotNull(prepayTransactionData.getTransId());
        assertNotNull(prepayTransactionData.getStatus());
        assertEquals(prepaysData.getAmount(), prepayTransactionData.getAmount());
        assertEquals(prepaysData.getCurrency(), prepayTransactionData.getCurrency());
        assertEquals(prepaysData.getPurpose(), prepayTransactionData.getPurpose());
        assertEquals(prepaysData.getOrderId(), prepayTransactionData.getOrderId());
        assertEquals(3, prepayTransactionData.getBasket().size());
        assertEquals(prepaysData.getBasket().get(0).getItemType(), prepayTransactionData.getBasket().get(0).getItemType());
        assertEquals(prepaysData.getBasket().get(0).getName(), prepayTransactionData.getBasket().get(0).getName());
        assertEquals(prepaysData.getBasket().get(0).getTotal(), prepayTransactionData.getBasket().get(0).getTotal());

        for (int i = 1; i <= 2; i++) {
            assertEquals(prepaysData.getBasket().get(i).getItemType(), prepayTransactionData.getBasket().get(i).getItemType());
            assertEquals(prepaysData.getBasket().get(i).getArticleNumber(), prepayTransactionData.getBasket().get(i).getArticleNumber());
            assertEquals(prepaysData.getBasket().get(i).getQuantity(), prepayTransactionData.getBasket().get(i).getQuantity());
            assertEquals(prepaysData.getBasket().get(i).getName(), prepayTransactionData.getBasket().get(i).getName());
            assertEquals(prepaysData.getBasket().get(i).getEan(), prepayTransactionData.getBasket().get(i).getEan());
            assertEquals(prepaysData.getBasket().get(i).getTax(), prepayTransactionData.getBasket().get(i).getTax());
            assertEquals(prepaysData.getBasket().get(i).getTotal(), prepayTransactionData.getBasket().get(i).getTotal());
            assertEquals(prepaysData.getBasket().get(i).getPrice(), prepayTransactionData.getBasket().get(i).getPrice());
        }

        assertNotNull(prepayTransactionData.getTransactionStatus());
        assertEquals("sale", prepayTransactionData.getPaymentAction());
        assertNotNull(prepayTransactionData.getPurpose());
        assertNotNull(prepayTransactionData.getTransferAccount().getIban());
        assertNotNull(prepayTransactionData.getTransferAccount().getBic());
        //assertNotNull(prepayTransactionData.getTransferAccount().getAccountnumber());
        //assertNotNull(prepayTransactionData.getTransferAccount().getBankcode());
        //assertNotNull(prepayTransactionData.getTransferAccount().getAccountOwner());
        //assertEquals("payment.customers", prepayTransactionData.getCustomer().getObject());
        assertNotNull(prepayTransactionData.getCustomer().getId());
        assertEquals("payment.contracts", prepayTransactionData.getCustomer().getContract().getObject());
        assertNotNull(prepayTransactionData.getCustomer().getContract().getId());
        assertEquals(prepaysData.getCustomer().getContact().getForename(), prepayTransactionData.getCustomer().getContact().getForename());
        assertEquals(prepaysData.getCustomer().getContact().getSurname(), prepayTransactionData.getCustomer().getContact().getSurname());
        assertEquals(prepaysData.getCustomer().getContact().getCompanyname(), prepayTransactionData.getCustomer().getContact().getCompanyname());
        assertNotNull(prepayTransactionData.getRedirectUrl().getIframeUrl());
        assertEquals(prepaysData.getRedirectUrl().getUrlSuccess(), prepayTransactionData.getRedirectUrl().getUrlSuccess());
        assertEquals(prepaysData.getRedirectUrl().getUrlFailure(), prepayTransactionData.getRedirectUrl().getUrlFailure());
    }

    /**
     *
     * Get the details of a payment prepay transaction
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void c_paymentSecupayPrepaysGetByIdTest() throws ApiException {
        SecupayTransactionProductModel prepayTransactionDataFetchedUsingGet = prepayApi.paymentSecupayPrepaysGetById(prepayTransactionData.getId());

        assertEquals(prepayTransactionData.getObject(), prepayTransactionDataFetchedUsingGet.getObject());
        assertEquals(prepayTransactionData.getId(), prepayTransactionDataFetchedUsingGet.getId());
        assertEquals(prepayTransactionData.getTransId(), prepayTransactionDataFetchedUsingGet.getTransId());
        assertEquals(prepayTransactionData.getStatus(), prepayTransactionDataFetchedUsingGet.getStatus());
        assertEquals(prepayTransactionData.getAmount(), prepayTransactionDataFetchedUsingGet.getAmount());
        assertEquals(prepayTransactionData.getCurrency(), prepayTransactionDataFetchedUsingGet.getCurrency());
        assertEquals(prepayTransactionData.getPurpose(), prepayTransactionDataFetchedUsingGet.getPurpose());
        assertEquals(prepayTransactionData.getOrderId(), prepayTransactionDataFetchedUsingGet.getOrderId());
        assertEquals(prepayTransactionData.getBasket().size(), prepayTransactionDataFetchedUsingGet.getBasket().size());
        assertEquals(prepayTransactionData.getBasket().get(0).getItemType(), prepayTransactionDataFetchedUsingGet.getBasket().get(0).getItemType());
        assertEquals(prepayTransactionData.getBasket().get(0).getName(), prepayTransactionDataFetchedUsingGet.getBasket().get(0).getName());
        assertEquals(prepayTransactionData.getBasket().get(0).getTotal(), prepayTransactionDataFetchedUsingGet.getBasket().get(0).getTotal());

        for (int i = 1; i <= 2; i++) {
            assertEquals(prepayTransactionData.getBasket().get(i).getItemType(), prepayTransactionDataFetchedUsingGet.getBasket().get(i).getItemType());
            assertEquals(prepayTransactionData.getBasket().get(i).getArticleNumber(), prepayTransactionDataFetchedUsingGet.getBasket().get(i).getArticleNumber());
            assertEquals(prepayTransactionData.getBasket().get(i).getQuantity(), prepayTransactionDataFetchedUsingGet.getBasket().get(i).getQuantity());
            assertEquals(prepayTransactionData.getBasket().get(i).getName(), prepayTransactionDataFetchedUsingGet.getBasket().get(i).getName());
            assertEquals(prepayTransactionData.getBasket().get(i).getEan(), prepayTransactionDataFetchedUsingGet.getBasket().get(i).getEan());
            assertEquals(prepayTransactionData.getBasket().get(i).getTax(), prepayTransactionDataFetchedUsingGet.getBasket().get(i).getTax());
            assertEquals(prepayTransactionData.getBasket().get(i).getTotal(), prepayTransactionDataFetchedUsingGet.getBasket().get(i).getTotal());
            assertEquals(prepayTransactionData.getBasket().get(i).getPrice(), prepayTransactionDataFetchedUsingGet.getBasket().get(i).getPrice());
        }

        assertEquals(prepayTransactionData.getTransactionStatus(), prepayTransactionDataFetchedUsingGet.getTransactionStatus());
        assertEquals(prepayTransactionData.getPaymentAction(), prepayTransactionDataFetchedUsingGet.getPaymentAction());
        assertEquals(prepayTransactionData.getPurpose(), prepayTransactionDataFetchedUsingGet.getPurpose());
        assertEquals(prepayTransactionData.getTransferAccount().getIban(), prepayTransactionDataFetchedUsingGet.getTransferAccount().getIban());
        assertEquals(prepayTransactionData.getTransferAccount().getBic(), prepayTransactionDataFetchedUsingGet.getTransferAccount().getBic());
        assertEquals(prepayTransactionData.getCustomer().getObject(), prepayTransactionDataFetchedUsingGet.getCustomer().getObject());
        assertEquals(prepayTransactionData.getCustomer().getId(), prepayTransactionDataFetchedUsingGet.getCustomer().getId());
        assertEquals(prepayTransactionData.getCustomer().getContract().getObject(), prepayTransactionDataFetchedUsingGet.getCustomer().getContract().getObject());
        assertEquals(prepayTransactionData.getCustomer().getContract().getId(), prepayTransactionDataFetchedUsingGet.getCustomer().getContract().getId());
        assertEquals(prepayTransactionData.getCustomer().getContact().getForename(), prepayTransactionDataFetchedUsingGet.getCustomer().getContact().getForename());
        assertEquals(prepayTransactionData.getCustomer().getContact().getSurname(), prepayTransactionDataFetchedUsingGet.getCustomer().getContact().getSurname());
        assertEquals(prepayTransactionData.getCustomer().getContact().getCompanyname(), prepayTransactionDataFetchedUsingGet.getCustomer().getContact().getCompanyname());
        assertEquals(prepayTransactionData.getRedirectUrl().getIframeUrl(), prepayTransactionDataFetchedUsingGet.getRedirectUrl().getIframeUrl());
        assertEquals(prepayTransactionData.getRedirectUrl().getUrlSuccess(), prepayTransactionDataFetchedUsingGet.getRedirectUrl().getUrlSuccess());
        assertEquals(prepayTransactionData.getRedirectUrl().getUrlFailure(), prepayTransactionDataFetchedUsingGet.getRedirectUrl().getUrlFailure());
    }

    /**
     *
     * Cancel the payment prepay transaction
     *
     * @throws ApiException
     *          if the Api call fails
     */
	@Ignore
    @Test
    public void d_paymentSecupayPrepaysCancelByIdTest() throws ApiException {
        Object response = prepayApi.cancelPaymentTransactionById("secupayprepays", prepayTransactionData.getId(), null);

        assertEquals("{result=true, demo=true}", response.toString());
    }

    /**
     *
     * Delete payment customer
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void e_paymentCustomerDeleteTest() throws ApiException {
        List<PaymentCustomersProductModel> deletedCustomerList = customerApi.paymentCustomersIdDelete(prepaysData.getCustomer().getId());
        PaymentCustomersProductModel deletedCustomer = deletedCustomerList.get(0);

        assertEquals(prepaysData.getCustomer().getContact().getForename(), deletedCustomer.getContact().getForename());
        assertEquals(prepaysData.getCustomer().getContact().getSurname(), deletedCustomer.getContact().getSurname());
        assertEquals(prepaysData.getCustomer().getContact().getCompanyname(), deletedCustomer.getContact().getCompanyname());
    }
}
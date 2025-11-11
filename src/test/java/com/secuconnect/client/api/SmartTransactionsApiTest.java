package com.secuconnect.client.api;

import com.secuconnect.client.ApiException;
import com.secuconnect.client.Environment;
import com.secuconnect.client.Globals;
import com.secuconnect.client.model.*;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import static org.junit.Assert.*;

/**
 * API tests for Smart/Transactions
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SmartTransactionsApiTest {

    private static final SmartTransactionsApi smartTransactionsApi = new SmartTransactionsApi();
    private static SmartTransactionsProductModel transactionProductModel;

    @BeforeClass
    public static void setUp() {
        try {
            Environment
                    .getGlobalEnv()
                    .setCredentials(Globals.O_AUTH_CLIENT_CREDENTIALS)
                    .authenticate();
        } catch (ApiException ex) {
            ex.printStackTrace();
            fail(ex.getResponseBody());
        }
    }

    @AfterClass
    public static void tearDown() {
        transactionProductModel = null;
    }

    private SmartTransactionsBasket prepareBasket() {
        SmartTransactionsBasket basket = new SmartTransactionsBasket();

        List<SmartTransactionsBasketProduct> basketItems = new ArrayList<>();
        basket.products(basketItems);

        SmartTransactionsBasketProduct basketItem1 = new SmartTransactionsBasketProduct();
        SmartTransactionsBasketProduct basketItem2 = new SmartTransactionsBasketProduct();
        SmartTransactionsBasketProduct basketItem3 = new SmartTransactionsBasketProduct();

        basketItem1.id(1);
        basketItem1.itemType("shipping");
        basketItem1.desc("standard delivery");
        basketItem1.tax(19);
        basketItem1.quantity(1);
        basketItem1.priceOne(200);
        basketItem1.sum(200);
        basket.getProducts().add(basketItem1);

        basketItem2.id(2);
        basketItem2.itemType("article");
        basketItem2.articleNumber("3211");
        basketItem2.quantity(2);
        basketItem2.desc("Product 3211");
        basketItem2.ean("4123412341243");
        basketItem2.tax(19);
        basketItem2.sum(2000);
        basketItem2.priceOne(1000);
        basket.getProducts().add(basketItem2);

        basketItem3.id(3);
        basketItem3.itemType("article");
        basketItem3.articleNumber("48875");
        basketItem3.quantity(2);
        basketItem3.desc("Product 48875");
        basketItem3.ean("4123412341236");
        basketItem3.tax(19);
        basketItem3.sum(4000);
        basketItem3.priceOne(2000);
        basket.getProducts().add(basketItem3);

        return basket;
    }

    /**
     * Create a smart transaction
     */
    @Test
    public void testCreatingSmartTransaction() {
        SmartTransactionsDTO payload = new SmartTransactionsDTO();
        payload.intent("sale");
        payload.isDemo(true);
        payload.contract(new ProductInstanceID()
                .id("GCR_2H69XY35227V2VKP9WRA3SJ0W95RP0")
        );
        payload.basket(this.prepareBasket());
        payload.basketInfo(new SmartTransactionsBasketInfo().sum(6200).currency("EUR"));
        payload.transactionRef("");
        payload.merchantRef("50001234");
        payload.applicationContext(new SmartTransactionsApplicationContext()
                .checkoutTemplate("COT_WD0DE66HN2XWJHW8JM88003YG0NEA2")
                .returnUrls(new SmartTransactionsApplicationContextReturnUrls()
                        .urlSuccess("https://example.org/SUCCESS")
                        .urlError("https://example.org/ERROR")
                        .urlAbort("https://example.org/ABORT")
                )
        );
        payload.paymentContext(new PaymentContext()
                .autoCapture(true)
        );

        try {
            transactionProductModel = smartTransactionsApi.addTransaction(payload);

            assertEquals("smart.transactions", transactionProductModel.getObject());
            assertNotNull(transactionProductModel.getId());
            assertNotNull(transactionProductModel.getMerchant());
            assertEquals("general.merchants", transactionProductModel.getMerchant().getObject());
            assertEquals("MRC_WVHJQFQ4JNVYNG5B55TYK748ZCHQP8", transactionProductModel.getMerchant().getId());
            assertEquals("Secupay Test-Shop", transactionProductModel.getMerchant().getCompanyname());
            assertNotNull(transactionProductModel.getContract());
            assertEquals("general.contracts", transactionProductModel.getContract().getObject());
            assertEquals("GCR_2H69XY35227V2VKP9WRA3SJ0W95RP0", transactionProductModel.getContract().getId());
            assertNotNull(transactionProductModel.getCreated());
            assertEquals("created", transactionProductModel.getStatus());
            assertNull(transactionProductModel.getTransactionRef());
            assertEquals("50001234", transactionProductModel.getMerchantRef());
            assertEquals("sale", transactionProductModel.getIntent());

            assertNotNull(transactionProductModel.getBasket());
            assertNotNull(transactionProductModel.getBasket().getProducts());
            assertEquals(3, transactionProductModel.getBasket().getProducts().size());
            assertEquals("default", transactionProductModel.getBasket().getType());

            assertNotNull(transactionProductModel.getBasketInfo());
            assertEquals((Integer)6200, transactionProductModel.getBasketInfo().getSum());

            assertEquals(true, transactionProductModel.getIsDemo());

            assertNotNull(transactionProductModel.getApplicationContext());
            assertEquals("de", transactionProductModel.getApplicationContext().getLanguage());
            assertEquals("COT_WD0DE66HN2XWJHW8JM88003YG0NEA2", transactionProductModel.getApplicationContext().getCheckoutTemplate());
            assertNotNull(transactionProductModel.getApplicationContext().getReturnUrls());
            assertEquals("https://example.org/SUCCESS", transactionProductModel.getApplicationContext().getReturnUrls().getUrlSuccess());
            assertEquals("https://example.org/ERROR", transactionProductModel.getApplicationContext().getReturnUrls().getUrlError());
            assertEquals("https://example.org/ABORT", transactionProductModel.getApplicationContext().getReturnUrls().getUrlAbort());

            assertNotNull(transactionProductModel.getPaymentContext());
            assertEquals(true, transactionProductModel.getPaymentContext().getAutoCapture());

            assertNotNull(transactionProductModel.getPaymentLinks());
            assertNotNull(transactionProductModel.getPaymentLinks().getGeneral());
            assertNotNull(transactionProductModel.getPaymentLinks().getCreditcard());
            assertNotNull(transactionProductModel.getPaymentLinks().getDebit());
            assertNotNull(transactionProductModel.getPaymentLinks().getPrepaid());
            assertNotNull(transactionProductModel.getPaymentLinks().getInvoice());
            assertNotNull(transactionProductModel.getPaymentLinks().getPaypal());
        } catch (ApiException ex) {
            ex.printStackTrace();
            fail(ex.getResponseBody());
        }
    }

    /**
     * Update a smart transaction and start the payment process for "prepaid"
     */
    @Test
    public void testPrepareSmartTransaction() {
        assertNotNull(transactionProductModel.getId());
        assertEquals("created", transactionProductModel.getStatus());

        SmartTransactionsPrepare payload = new SmartTransactionsPrepare();
        payload.customer(new SmartTransactionPaymentCustomerDTO()
                .contact(new Contact()
                        .forename("John")
                        .surname("Doe")
                        .companyname("Example Inc.")
                        .email("mail@example.com")
                )
        );

        try {
            transactionProductModel = smartTransactionsApi.prepare(
                    transactionProductModel.getId(),
                    "prepaid",
                    payload
            );

            assertNotNull(transactionProductModel.getId());
            assertEquals("smart.transactions", transactionProductModel.getObject());
            assertEquals("pending", transactionProductModel.getStatus());
            assertEquals("prepaid", transactionProductModel.getPaymentMethod());

            assertNotNull(transactionProductModel.getTransactions());
            assertEquals(1, transactionProductModel.getTransactions().size());
            assertEquals("payment.transactions", transactionProductModel.getTransactions().get(0).getObject());

            assertNotNull(transactionProductModel.getPaymentInstructions());
            assertEquals("secupay AG", transactionProductModel.getPaymentInstructions().getOwner());
            assertEquals("DE81850400611005523759", transactionProductModel.getPaymentInstructions().getIban());
            assertEquals("COBADEFFXXX", transactionProductModel.getPaymentInstructions().getBic());
            assertEquals("Commerzbank CC", transactionProductModel.getPaymentInstructions().getBankname());
            assertNotNull(transactionProductModel.getPaymentInstructions().getPurpose());
            assertNotNull(transactionProductModel.getPaymentInstructions().getGirocodeUrl());
        } catch (ApiException ex) {
            ex.printStackTrace();
            fail(ex.getResponseBody());
        }
    }
}

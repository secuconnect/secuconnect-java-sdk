package com.secuconnect.client.stomp.api;

import com.secuconnect.client.auth.Authenticator;
import com.secuconnect.client.model.*;
import com.secuconnect.client.stomp.api.modelsForStompApiTest.SmartTransactionsProductModelForTests;
import com.secuconnect.client.stomp.communication.StompCommunicationManager;
import com.secuconnect.client.stomp.communication.frame.StompFrame;
import com.secuconnect.client.stomp.listeners.def.impl.ConnectedFrameListener;
import com.secuconnect.client.stomp.listeners.def.impl.ErrorFrameListener;
import com.secuconnect.client.stomp.listeners.def.impl.MessageFrameListener;
import com.secuconnect.client.stomp.listeners.def.impl.ReceiptFrameListener;
import com.secuconnect.client.stomp.api.modelsForStompApiTest.StompResponseWithSmartTransactionsProductModel;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;

import static com.secuconnect.client.Globals.O_AUTH_DEVICE_CREDENTIALS;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Ignore;

@Ignore
public class StompSmartTransactionsApiTest {
    static final String SMART_TRANSACTIONS = "smart.transactions";
    static final String SMART_TRANSACTION_STATUS_AFTER_CREATE = "created";
    static final String SMART_TRANSACTION_STATUS_AFTER_START = "ok";

    private static StompSmartTransactionsApi smartTransactionsApi;
    private static Authenticator authenticator;
    private static SmartTransactionsDTO smartTransactionsDTO;
    private static SmartTransactionsIdent ident;
    private static SmartTransactionsBasketProduct item;
    private static SmartTransactionsBasketInfo basketInfo;
    private static SmartTransactionsBasket basket;

    @BeforeClass
    public static void setUp() {
        authenticator = new Authenticator(O_AUTH_DEVICE_CREDENTIALS);

        ident = new SmartTransactionsIdent();
        ident.setType("card");
        ident.setValue("9991234567890");
        ident.setValid(false);

        ArrayList<SmartTransactionsIdent> idents = new ArrayList<>();
        idents.add(ident);

        item = new SmartTransactionsBasketProduct();
        item.setId(1);
        item.setQuantity(1);
        item.setPriceOne(209);
        item.setDesc("Schokolade Milka");
        item.setTax(7);

        ArrayList<SmartTransactionsBasketProduct> items = new ArrayList<>();
        items.add(item);

        basketInfo = new SmartTransactionsBasketInfo();
        basketInfo.setSum(209);
        basketInfo.setCurrency("EUR");

        basket = new SmartTransactionsBasket();
        basket.setProducts(items);

        smartTransactionsDTO = new SmartTransactionsDTO();
        smartTransactionsDTO.setIdents(idents);
        smartTransactionsDTO.setBasket(basket);
        smartTransactionsDTO.setBasketInfo(basketInfo);
        smartTransactionsDTO.setMerchantRef("Kunde12345");
        smartTransactionsDTO.setTransactionRef("Beleg12345");
    }

    @AfterClass
    public static void tearDown() {
        smartTransactionsApi = null;
        authenticator = null;
        smartTransactionsDTO = null;
        ident = null;
        item = null;
        basketInfo = null;
        basket = null;
    }
	
    @Test
    public void stompSmartTransactionsApiTest() {
        String accessToken = authenticator.getDeviceAccessToken(O_AUTH_DEVICE_CREDENTIALS.getClientId(), O_AUTH_DEVICE_CREDENTIALS.getClientSecret(), O_AUTH_DEVICE_CREDENTIALS.getUuid());
        smartTransactionsApi = new StompSmartTransactionsApi(accessToken);
        StompCommunicationManager stompCommunicationManager = smartTransactionsApi.getStompCommunicationManager();

        stompCommunicationManager.addFrameListener(new ConnectedFrameListener());
        stompCommunicationManager.addFrameListener(new MessageFrameListener() {
            int state = 0;
            SmartTransactionsProductModelForTests createdSmartTransactionObj;
            SmartTransactionsProductModelForTests updatedSmartTransactionObj;
            SmartTransactionsProductModelForTests smartTransactionAfterStartObj;

            @Override
            public void onMessage(StompFrame frame) {
                if (!frame.toString().contains("{\"status\":\"ok\",\"data\":{\"result\":true}}")) {
                    String receivedBody = frame.getBody();
                    StompResponseWithSmartTransactionsProductModel response = StompResponseWithSmartTransactionsProductModel.getStompResponseFromJson(receivedBody);
                    SmartTransactionsProductModelForTests smartTransactionsProductModel = response.getData();

                    if (state == 0) {
                        createdSmartTransactionObj = smartTransactionsProductModel;

                        assertEquals(createdSmartTransactionObj.getObject(), SMART_TRANSACTIONS);
                        assertEquals(createdSmartTransactionObj.getIdents(), smartTransactionsDTO.getIdents());
                        assertEquals(createdSmartTransactionObj.getBasket(), smartTransactionsDTO.getBasket());
                        assertEquals(createdSmartTransactionObj.getMerchantRef(), smartTransactionsDTO.getMerchantRef());
                        assertEquals(createdSmartTransactionObj.getTransactionRef(), smartTransactionsDTO.getTransactionRef());
                        assertEquals(createdSmartTransactionObj.getStatus(), SMART_TRANSACTION_STATUS_AFTER_CREATE);
                        assertNotNull(createdSmartTransactionObj.getMerchant());

                        smartTransactionsDTO.getBasket().getProducts().get(0).setQuantity(3);
                        smartTransactionsDTO.getBasket().getProducts().get(0).setPriceOne(200);
                        smartTransactionsDTO.getBasket().getProducts().get(0).setDesc("Bonbons");
                        smartTransactionsDTO.getBasket().getProducts().get(0).setTax(7);

                        smartTransactionsDTO.getBasketInfo().setSum(600);

                        smartTransactionsDTO.setBasket(basket);
                        smartTransactionsDTO.setBasketInfo(basketInfo);
                        smartTransactionsDTO.setMerchantRef("Kunde54321");
                        smartTransactionsDTO.setTransactionRef("Beleg54321");

                        smartTransactionsApi.updateTransaction(createdSmartTransactionObj.getId(), smartTransactionsDTO);

                        state++;
                    } else if (state == 1) {
                        updatedSmartTransactionObj = smartTransactionsProductModel;

                        assertEquals(updatedSmartTransactionObj.getObject(), SMART_TRANSACTIONS);
                        assertEquals(updatedSmartTransactionObj.getBasket(), smartTransactionsDTO.getBasket());
                        assertEquals(updatedSmartTransactionObj.getMerchantRef(), smartTransactionsDTO.getMerchantRef());
                        assertEquals(updatedSmartTransactionObj.getTransactionRef(), smartTransactionsDTO.getTransactionRef());

                        smartTransactionsApi.startTransaction(createdSmartTransactionObj.getId(), "demo");
                        state++;
                    } else if (state == 2) {
                        smartTransactionAfterStartObj = smartTransactionsProductModel;

                        assertEquals(smartTransactionAfterStartObj.getObject(), SMART_TRANSACTIONS);
                        assertEquals(smartTransactionAfterStartObj.getStatus(), SMART_TRANSACTION_STATUS_AFTER_START);
                        assertNotNull(smartTransactionAfterStartObj.getDeviceSource());
                    }
                }
            }
        });
        stompCommunicationManager.addFrameListener(new ReceiptFrameListener());
        stompCommunicationManager.addFrameListener(new ErrorFrameListener());

        smartTransactionsApi.addTransaction(smartTransactionsDTO);

        try {
            Thread.sleep(120000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

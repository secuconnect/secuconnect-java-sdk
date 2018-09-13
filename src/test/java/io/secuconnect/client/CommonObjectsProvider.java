package io.secuconnect.client;

import io.secuconnect.client.model.*;

import java.util.ArrayList;
import java.util.List;

public class CommonObjectsProvider {
    public static PaymentCustomersDTO prepareCustomer() {
        Contact contact = new Contact();
        contact.setForename("John");
        contact.setSurname("Doe");
        contact.setCompanyname("Example Inc.");

        PaymentCustomersDTO customerDTO = new PaymentCustomersDTO();
        customerDTO.setContact(contact);

        return customerDTO;
    }

    public static List<SecupayBasketItem> prepareBasket() {
        List<SecupayBasketItem> basket = new ArrayList<>();

        SecupayBasketItem basketItem1 = new SecupayBasketItem();
        SecupayBasketItem basketItem2 = new SecupayBasketItem();
        SecupayBasketItem basketItem3 = new SecupayBasketItem();

        basketItem1.setItemType("shipping");
        basketItem1.setName("standard delivery");
        basketItem1.setTax("19");
        basketItem1.setTotal(200);
        basket.add(basketItem1);

        basketItem2.setItemType("article");
        basketItem2.setArticleNumber("3211");
        basketItem2.setQuantity(2);
        basketItem2.setName("Product 3211");
        basketItem2.setEan("4123412341243");
        basketItem2.setTax("19");
        basketItem2.setTotal(2000);
        basketItem2.setPrice(1000);
        basket.add(basketItem2);

        basketItem3.setItemType("article");
        basketItem3.setArticleNumber("48875");
        basketItem3.setQuantity(2);
        basketItem3.setName("Product 48875");
        basketItem3.setEan("4123412341236");
        basketItem3.setTax("19");
        basketItem3.setTotal(4000);
        basketItem3.setPrice(2000);
        basket.add(basketItem3);

        return basket;
    }

    public static SecupayTransactionProductDTO prepareTransactionData() {
        SecupayTransactionProductDTO transactionData = new SecupayTransactionProductDTO();
        transactionData.setAmount(100);
        transactionData.setCurrency("EUR");
        transactionData.setPurpose("for what text");
        transactionData.setOrderId("ZZZZZZ");

        SecupayTransactionProductDTORedirectUrl redirectUrl = new SecupayTransactionProductDTORedirectUrl();
        redirectUrl.setUrlSuccess("http://shop.example.com?success=true");
        redirectUrl.setUrlFailure("http://shop.example.com?success=false");
        redirectUrl.setUrlPush("https://requestb.in/14f6a1j1");
        transactionData.setRedirectUrl(redirectUrl);

        return transactionData;
    }
}

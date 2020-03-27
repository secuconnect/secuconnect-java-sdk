package com.secuconnect.client;

import com.secuconnect.client.model.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CommonObjectsProvider {
    public static PaymentCustomersDTO prepareCustomer() {
        Contact contact = new Contact();
        contact.setForename("John");
        contact.setSurname("Doe");
        contact.setCompanyname("Example Inc.");
        contact.setEmail("mail@example.com");

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
        transactionData.setAmount(6200);
        transactionData.setCurrency("EUR");
        transactionData.setPurpose("for what text");
        transactionData.setOrderId("ZZZZZZ");

        SecupayRedirectUrl redirectUrl = new SecupayRedirectUrl();
        redirectUrl.setUrlSuccess("http://shop.example.com?success=true");
        redirectUrl.setUrlFailure("http://shop.example.com?success=false");
        redirectUrl.setUrlPush("https://requestb.in/14f6a1j1");
        transactionData.setRedirectUrl(redirectUrl);

        return transactionData;
    }

    public static PaymentContractsDTOClone prepareDataForClone() {
        int  number = getRandomNumber();

        PaymentContractsDTOClone cloneData = new PaymentContractsDTOClone();
        cloneData.setProject("project_name 2017-05-15 #" + number);
        cloneData.setPayinAccount(false);

        return cloneData;
    }

    public static PaymentContractsDTORequestId prepareDataFoRequestId() {
        Address address = new Address();
        address.setType("invoice");
        address.setStreet("Hainweg");
        address.setStreetNumber("7");
        address.setPostalCode("01324");
        address.setCity("Dresden");
        address.setCountry("Germany");

        Contact contact = new Contact();
        contact.setSalutation("Mr.");
        contact.setForename("Tony");
        contact.setSurname("Stark");
        contact.setCompanyname("Stark Industries");
        contact.setGender("m");
        contact.setDob("1987-06-16");
        contact.setUrlWebsite("https://en.wikipedia.org/wiki/Stark_Industries");
        contact.setBirthplace("New York");
        contact.setNationality("german");
        contact.setAddress(address);
        contact.setEmail("testing@secupay.ag");
        contact.setPhone("0049-173-456789");

        PaymentInformation paymentInformation = new PaymentInformation();
        paymentInformation.setIban("DE89370400440532013000");
        paymentInformation.setOwner("Test #1");

        PaymentContractsDTOIFrameOpts iFrameOpts = new PaymentContractsDTOIFrameOpts();
        iFrameOpts.setShowBasket(true);
        iFrameOpts.setBasketTitle("Projext XY unterstützen");
        iFrameOpts.setSubmitButtonTitle("Zahlungspflichtig unterstützen");

        int number = getRandomNumber();

        PaymentContractsDTORequestId requestIdData = new PaymentContractsDTORequestId();
        requestIdData.setContact(contact);
        requestIdData.setProject("project_name 2017-05-15 #" + number);
        requestIdData.setPayoutAccount(paymentInformation);
        requestIdData.setIframeOpts(iFrameOpts);
        requestIdData.setPayinAccount(false);

        return requestIdData;
    }

    public static int getRandomNumber() {
        Random random = new Random();
        int  number = random.nextInt(999999999) + 1;

        return number;
    }
}

package com.secuconnect.client.api;

import com.secuconnect.client.ApiException;
import com.secuconnect.client.Environment;
import com.secuconnect.client.Globals;
import com.secuconnect.client.model.*;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * API tests for PaymentCustomersApi
 */
public class PaymentCustomersApiTest {

    private static PaymentCustomersApi api = null;

    @BeforeClass
    public static void setUp() {
        try {
            Environment
                .getGlobalEnv()
                .setCredentials(Globals.O_AUTH_CLIENT_CREDENTIALS)
                .authenticate();
            api = new PaymentCustomersApi();
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
    public void paymentCustomersPostTest() {
        try {
            Contact contactDTO = new Contact();
            contactDTO.setBirthplace("City2");
            contactDTO.setCompanyname("Example Inc.");
            contactDTO.setDob("2000-01-01");
            contactDTO.setEmail("mail@example.com");
            contactDTO.setForename("John");
            contactDTO.setGender("m");
            contactDTO.setPhone("+49987654321");
            contactDTO.setMobile("+4915123456789");
            contactDTO.setNationality("DE");
            contactDTO.setSalutation("Mr.");
            contactDTO.setSurname("Doe");
            contactDTO.setTitle("Dr.");
            contactDTO.setUrlWebsite("https://secuconnect.com");

            Address addressDTO = new Address();
            addressDTO.setAdditionalAddressData("Test");
            addressDTO.setCity("cCity");
            addressDTO.setCountry("DE");
            addressDTO.setPostalCode("01234");
            addressDTO.setStreet("Street");
            addressDTO.setStreetNumber("2a");
            contactDTO.setAddress(addressDTO);

            PaymentCustomersDTO customerDTO = new PaymentCustomersDTO();
            customerDTO.setContact(contactDTO);

            PaymentCustomersProductModel customer = api.paymentCustomersPost(customerDTO);

            assertNotNull(customer.getId());
            assertNotNull(customer.getObject());

            Contact contact = customer.getContact();
            assertEquals(contact.getBirthplace(), contactDTO.getBirthplace());
            assertEquals(contact.getCompanyname(), contactDTO.getCompanyname());
            assertEquals(contact.getDob(), contactDTO.getDob() + "T00:00:00+01:00");
            assertEquals(contact.getEmail(), contactDTO.getEmail());
            assertEquals(contact.getForename(), contactDTO.getForename());
            assertEquals(contact.getGender(), contactDTO.getGender());
            assertEquals(contact.getPhone(), contactDTO.getPhone());
            assertEquals(contact.getMobile(), contactDTO.getMobile());
            assertEquals(contact.getNationality(), contactDTO.getNationality());
            assertEquals(contact.getSalutation(), contactDTO.getSalutation());
            assertEquals(contact.getSurname(), contactDTO.getSurname());
            assertEquals(contact.getTitle(), contactDTO.getTitle());
            assertEquals(contact.getUrlWebsite(), contactDTO.getUrlWebsite());

            Address address = contact.getAddress();
            assertEquals(address.getAdditionalAddressData(), addressDTO.getAdditionalAddressData());
            assertEquals(address.getCity(), addressDTO.getCity());
            assertEquals(address.getCountry(), addressDTO.getCountry());
            assertEquals(address.getPostalCode(), addressDTO.getPostalCode());
            assertEquals(address.getStreet(), addressDTO.getStreet());
            assertEquals(address.getStreetNumber(), addressDTO.getStreetNumber());
        } catch (ApiException ex) {
            ex.printStackTrace();
            fail(ex.getResponseBody());
        }
    }
}

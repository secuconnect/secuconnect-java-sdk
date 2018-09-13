# swagger-java-client

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>io.swagger</groupId>
    <artifactId>swagger-java-client</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.swagger:swagger-java-client:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/swagger-java-client-1.0.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import io.secuconnect.client.*;
import io.secuconnect.client.auth.*;
import io.secuconnect.client.model.*;
import io.secuconnect.client.api.PaymentContainersApi;

import java.io.File;
import java.util.*;

public class PaymentContainersApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure OAuth2 access token for authorization: oauth_token
        OAuth oauth_token = (OAuth) defaultClient.getAuthentication("oauth_token");
        oauth_token.setAccessToken("YOUR ACCESS TOKEN");

        PaymentContainersApi apiInstance = new PaymentContainersApi();
        Integer count = 56; // Integer | The number of items to return.
        Integer offset = 56; // Integer | The position within the whole result set to start returning items (First element is at 0).
        String fields = "fields_example"; // String | List of fields to include in the result. Nested properties can be accessed with this notation: prop1.prop2  Example: prop3,prop1.prop2
        String q = "q_example"; // String | A query string to restrict the returned items to given conditions. The query string must consist of any combination of single expressions in the form property:condition.  *                      A condition may contain:  *                          - wildcard \"*\" for any number of characters  *                          - wildcard \"?\" for one character  *                          - ranges in the form [value TO value]  *  *                     Single expressions may combined by 'AND', 'OR', 'NOT' operators and parenthesis '(', ')' for grouping.  *                     Property names can be nested like \"prop1.prop2\".  *                     Example: (NOT customer.name:meier*) AND (customer.age:[30 TO 40] OR customer.age:[50 TO 60])                           *                      
        String sort = "sort_example"; // String | String with comma separated pairs of field:order (e.g. contact.surname:asc,contact.comapnyname:desc). Result set will be sorted by included fields, in ascending 'asc', or descending 'dsc' order.
        try {
            InlineResponse200 result = apiInstance.paymentContainersGet(count, offset, fields, q, sort);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PaymentContainersApi#paymentContainersGet");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://connect-testing.secupay-ag.de/api/v2/*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*PaymentContainersApi* | [**paymentContainersGet**](docs/PaymentContainersApi.md#paymentContainersGet) | **GET** Payment/Containers | 
*PaymentContainersApi* | [**paymentContainersGetById**](docs/PaymentContainersApi.md#paymentContainersGetById) | **GET** Payment/Containers/{id} | 
*PaymentContainersApi* | [**paymentContainersIdAssignSecondaryIdDelete**](docs/PaymentContainersApi.md#paymentContainersIdAssignSecondaryIdDelete) | **DELETE** Payment/Containers/{id}/assign/{secondary-id} | 
*PaymentContainersApi* | [**paymentContainersIdAssignSecondaryIdPost**](docs/PaymentContainersApi.md#paymentContainersIdAssignSecondaryIdPost) | **POST** Payment/Containers/{id}/assign/{secondary-id} | 
*PaymentContainersApi* | [**paymentContainersIdDelete**](docs/PaymentContainersApi.md#paymentContainersIdDelete) | **DELETE** Payment/Containers/{id} | 
*PaymentContainersApi* | [**paymentContainersIdPut**](docs/PaymentContainersApi.md#paymentContainersIdPut) | **PUT** Payment/Containers/{id} | 
*PaymentContainersApi* | [**paymentContainersPost**](docs/PaymentContainersApi.md#paymentContainersPost) | **POST** Payment/Containers | 
*PaymentContractsApi* | [**paymentContractsGet**](docs/PaymentContractsApi.md#paymentContractsGet) | **GET** Payment/Contracts | 
*PaymentContractsApi* | [**paymentContractsGetById**](docs/PaymentContractsApi.md#paymentContractsGetById) | **GET** Payment/Contracts/{id} | 
*PaymentContractsApi* | [**paymentContractsIdClonePost**](docs/PaymentContractsApi.md#paymentContractsIdClonePost) | **POST** Payment/Contracts/{id}/clone | 
*PaymentContractsApi* | [**paymentContractsIdDelete**](docs/PaymentContractsApi.md#paymentContractsIdDelete) | **DELETE** Payment/Contracts/{id} | 
*PaymentContractsApi* | [**paymentContractsIdPaymentMethodsGet**](docs/PaymentContractsApi.md#paymentContractsIdPaymentMethodsGet) | **GET** Payment/Contracts/{id}/PaymentMethods | 
*PaymentContractsApi* | [**paymentContractsIdPut**](docs/PaymentContractsApi.md#paymentContractsIdPut) | **PUT** Payment/Contracts/{id} | 
*PaymentContractsApi* | [**paymentContractsIdRequestIdPost**](docs/PaymentContractsApi.md#paymentContractsIdRequestIdPost) | **POST** Payment/Contracts/{id}/RequestId | 
*PaymentContractsApi* | [**paymentContractsPost**](docs/PaymentContractsApi.md#paymentContractsPost) | **POST** Payment/Contracts | 
*PaymentCustomersApi* | [**paymentCustomersGet**](docs/PaymentCustomersApi.md#paymentCustomersGet) | **GET** Payment/Customers | 
*PaymentCustomersApi* | [**paymentCustomersGetById**](docs/PaymentCustomersApi.md#paymentCustomersGetById) | **GET** Payment/Customers/{id} | 
*PaymentCustomersApi* | [**paymentCustomersIdDelete**](docs/PaymentCustomersApi.md#paymentCustomersIdDelete) | **DELETE** Payment/Customers/{id} | 
*PaymentCustomersApi* | [**paymentCustomersIdPut**](docs/PaymentCustomersApi.md#paymentCustomersIdPut) | **PUT** Payment/Customers/{id} | 
*PaymentCustomersApi* | [**paymentCustomersPost**](docs/PaymentCustomersApi.md#paymentCustomersPost) | **POST** Payment/Customers | 
*PaymentSecupayCreditcardsApi* | [**paymentSecupayCreditcardsCancelById**](docs/PaymentSecupayCreditcardsApi.md#paymentSecupayCreditcardsCancelById) | **POST** Payment/Secupaycreditcards/{hash}/cancel | 
*PaymentSecupayCreditcardsApi* | [**paymentSecupayCreditcardsGetById**](docs/PaymentSecupayCreditcardsApi.md#paymentSecupayCreditcardsGetById) | **GET** Payment/Secupaycreditcards/{hash} | 
*PaymentSecupayCreditcardsApi* | [**paymentSecupaycreditcardsPost**](docs/PaymentSecupayCreditcardsApi.md#paymentSecupaycreditcardsPost) | **POST** Payment/Secupaycreditcards | 
*PaymentSecupayDebitsApi* | [**paymentSecupayDebitsCancelById**](docs/PaymentSecupayDebitsApi.md#paymentSecupayDebitsCancelById) | **POST** Payment/Secupaydebits/{hash}/cancel | 
*PaymentSecupayDebitsApi* | [**paymentSecupayDebitsGetById**](docs/PaymentSecupayDebitsApi.md#paymentSecupayDebitsGetById) | **GET** Payment/Secupaydebits/{hash} | 
*PaymentSecupayDebitsApi* | [**paymentSecupaydebitsPost**](docs/PaymentSecupayDebitsApi.md#paymentSecupaydebitsPost) | **POST** Payment/Secupaydebits | 
*PaymentSecupayInvoicesApi* | [**paymentSecupayInvoicesCancelById**](docs/PaymentSecupayInvoicesApi.md#paymentSecupayInvoicesCancelById) | **POST** Payment/Secupayinvoices/{hash}/cancel | 
*PaymentSecupayInvoicesApi* | [**paymentSecupayInvoicesGetById**](docs/PaymentSecupayInvoicesApi.md#paymentSecupayInvoicesGetById) | **GET** Payment/Secupayinvoices/{hash} | 
*PaymentSecupayInvoicesApi* | [**paymentSecupayinvoicesPost**](docs/PaymentSecupayInvoicesApi.md#paymentSecupayinvoicesPost) | **POST** Payment/Secupayinvoices | 
*PaymentSecupayPrepaysApi* | [**paymentSecupayPrepaysCancelById**](docs/PaymentSecupayPrepaysApi.md#paymentSecupayPrepaysCancelById) | **POST** Payment/Secupayprepays/{hash}/cancel | 
*PaymentSecupayPrepaysApi* | [**paymentSecupayPrepaysGetById**](docs/PaymentSecupayPrepaysApi.md#paymentSecupayPrepaysGetById) | **GET** Payment/Secupayprepays/{hash} | 
*PaymentSecupayPrepaysApi* | [**paymentSecupayprepaysPost**](docs/PaymentSecupayPrepaysApi.md#paymentSecupayprepaysPost) | **POST** Payment/Secupayprepays | 
*PaymentTransactionsApi* | [**paymentTransactionsGet**](docs/PaymentTransactionsApi.md#paymentTransactionsGet) | **GET** Payment/Transactions | 
*PaymentTransactionsApi* | [**paymentTransactionsGetById**](docs/PaymentTransactionsApi.md#paymentTransactionsGetById) | **GET** Payment/Transactions/{id} | 
*PaymentTransactionsApi* | [**paymentTransactionsIdCancelPost**](docs/PaymentTransactionsApi.md#paymentTransactionsIdCancelPost) | **POST** Payment/Transactions/{id}/cancel | 
*PaymentTransactionsApi* | [**paymentTransactionsIdShippingUrlGet**](docs/PaymentTransactionsApi.md#paymentTransactionsIdShippingUrlGet) | **GET** Payment/Transactions/{id}/shippingUrl | 


## Documentation for Models

 - [Address](docs/Address.md)
 - [BankAccountDescriptor](docs/BankAccountDescriptor.md)
 - [InlineResponse200](docs/InlineResponse200.md)
 - [InlineResponse2001](docs/InlineResponse2001.md)
 - [InlineResponse2002](docs/InlineResponse2002.md)
 - [InlineResponse2002PayingAccount](docs/InlineResponse2002PayingAccount.md)
 - [InlineResponse2003](docs/InlineResponse2003.md)
 - [InlineResponse2004](docs/InlineResponse2004.md)
 - [InlineResponse2005](docs/InlineResponse2005.md)
 - [InlineResponse2006](docs/InlineResponse2006.md)
 - [PaymentContainerMandate](docs/PaymentContainerMandate.md)
 - [PaymentContainersDTO](docs/PaymentContainersDTO.md)
 - [PaymentContainersDTOCustomer](docs/PaymentContainersDTOCustomer.md)
 - [PaymentContainersDTOPrivate](docs/PaymentContainersDTOPrivate.md)
 - [PaymentContainersProductModel](docs/PaymentContainersProductModel.md)
 - [PaymentContractsDTO](docs/PaymentContractsDTO.md)
 - [PaymentContractsProductModel](docs/PaymentContractsProductModel.md)
 - [PaymentCustomersDTO](docs/PaymentCustomersDTO.md)
 - [PaymentCustomersDTOContact](docs/PaymentCustomersDTOContact.md)
 - [PaymentCustomersProductModel](docs/PaymentCustomersProductModel.md)
 - [PaymentTransactionsProductModel](docs/PaymentTransactionsProductModel.md)
 - [PaymentTransactionsProductModelCustomer](docs/PaymentTransactionsProductModelCustomer.md)
 - [PaymentTransactionsProductModelDetails](docs/PaymentTransactionsProductModelDetails.md)
 - [PaymentTransactionsProductModelMerchant](docs/PaymentTransactionsProductModelMerchant.md)
 - [ProductExceptionPayload](docs/ProductExceptionPayload.md)
 - [ProductInstanceUID](docs/ProductInstanceUID.md)
 - [SecupayBasketItem](docs/SecupayBasketItem.md)
 - [SecupayTransactionProductDTO](docs/SecupayTransactionProductDTO.md)
 - [SecupayTransactionProductDTOApiData](docs/SecupayTransactionProductDTOApiData.md)
 - [SecupayTransactionProductDTOExperience](docs/SecupayTransactionProductDTOExperience.md)
 - [SecupayTransactionProductDTOOptData](docs/SecupayTransactionProductDTOOptData.md)
 - [SecupayTransactionProductDTORedirectUrl](docs/SecupayTransactionProductDTORedirectUrl.md)
 - [SecupayTransactionProductDTOSubscription](docs/SecupayTransactionProductDTOSubscription.md)
 - [SecupayTransactionProductModel](docs/SecupayTransactionProductModel.md)
 - [SecupayTransactionProductModelRedirectUrl](docs/SecupayTransactionProductModelRedirectUrl.md)
 - [SecupayTransactionProductModelTransferAccount](docs/SecupayTransactionProductModelTransferAccount.md)
 - [SecupayTransactionProductModelUsedPaymentInstrument](docs/SecupayTransactionProductModelUsedPaymentInstrument.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### oauth_token

- **Type**: OAuth
- **Flow**: application
- **Authorization URL**: https://connect-testing.secupay-ag.de/oauth/token
- **Scopes**: N/A


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author




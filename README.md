# secuconnect-java-sdk

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

To use this projects artifacts with Maven add the following dependency and repository to your POM:

``` xml
    <dependency>
      <groupId>io.secuconnect</groupId>
      <artifactId>secuconnect-java-sdk</artifactId>
      <version>LATEST</version>
    </dependency>
    .
    .
    .
    <repository>
        <id>secuconnect-java-sdk-mvn</id>
        <url>https://raw.github.com/secuconnect/secuconnect-java-sdk/mvn-repo/</url>
    </repository>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.secuconnect:secuconnect-java-sdk:1.6.1"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/secuconnect-java-sdk-1.6.1.jar
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

All URIs are relative to *https://connect-testing.secupay-ag.de/api/v2*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*DocumentUploadsApi* | [**documentUploadsPost**](docs/DocumentUploadsApi.md#documentUploadsPost) | **POST** /Document/Uploads | POST Document/Uploads
*DocumentUploadsApi* | [**documentUploadsmultipartPost**](docs/DocumentUploadsApi.md#documentUploadsmultipartPost) | **POST** /Document/Uploads?multipart | POST Document/Uploads
*GeneralMerchantsApi* | [**getAll**](docs/GeneralMerchantsApi.md#getAll) | **GET** /General/Merchants | GET General/Merchants
*GeneralMerchantsApi* | [**getOne**](docs/GeneralMerchantsApi.md#getOne) | **GET** /General/Merchants/{generalMerchantId} | GET General/Merchants/{generalMerchantId}
*GeneralMerchantsApi* | [**updateMerchant**](docs/GeneralMerchantsApi.md#updateMerchant) | **PUT** /General/Merchants/{generalMerchantId} | PUT General/Merchants/{generalMerchantId}
*GeneralStoresApi* | [**addStore**](docs/GeneralStoresApi.md#addStore) | **POST** /General/Stores | POST General/Stores
*GeneralStoresApi* | [**assignGoogleKey**](docs/GeneralStoresApi.md#assignGoogleKey) | **POST** /General/Stores/{generalStoreId}/assign/{googleKey} | POST General/Stores/{generalStoreId}/assign/{googleKey}
*GeneralStoresApi* | [**checkIn**](docs/GeneralStoresApi.md#checkIn) | **POST** /General/Stores/{generalStoreId}/checkin | POST General/Stores/{generalStoreId}/checkin
*GeneralStoresApi* | [**getAll**](docs/GeneralStoresApi.md#getAll) | **GET** /General/Stores | GET General/Stores
*GeneralStoresApi* | [**getOne**](docs/GeneralStoresApi.md#getOne) | **GET** /General/Stores/{generalStoreId} | GET General/Stores/{generalStoreId}
*GeneralStoresApi* | [**setDefault**](docs/GeneralStoresApi.md#setDefault) | **POST** /General/Stores/{generalStoreId}/setDefault | POST General/Stores/{generalStoreId}/setDefault
*GeneralStoresApi* | [**updateStore**](docs/GeneralStoresApi.md#updateStore) | **PUT** /General/Stores/{generalStoreId} | PUT General/Stores/{generalStoreId}
*LoyaltyCardgroupsApi* | [**addCardGroup**](docs/LoyaltyCardgroupsApi.md#addCardGroup) | **POST** /Loyalty/Cardgroups | POST Loyalty/Cardgroups
*LoyaltyCardgroupsApi* | [**checkPassCodeEnabled**](docs/LoyaltyCardgroupsApi.md#checkPassCodeEnabled) | **POST** /Loyalty/Cardgroups/{loyaltyCardGroupId}/checkPasscodeEnabled | POST Loyalty/Cardgroups/{loyaltyCardGroupId}/checkPasscodeEnabled
*LoyaltyCardgroupsApi* | [**getAll**](docs/LoyaltyCardgroupsApi.md#getAll) | **GET** /Loyalty/Cardgroups | GET Loyalty/Cardgroups
*LoyaltyCardgroupsApi* | [**getOne**](docs/LoyaltyCardgroupsApi.md#getOne) | **GET** /Loyalty/Cardgroups/{loyaltyCardGroupId} | GET Loyalty/Cardgroups/{loyaltyCardGroupId}
*LoyaltyCardgroupsApi* | [**updateCardGroup**](docs/LoyaltyCardgroupsApi.md#updateCardGroup) | **PUT** /Loyalty/Cardgroups/{loyaltyCardGroupId} | PUT Loyalty/Cardgroups/{loyaltyCardGroupId}
*LoyaltyCardsApi* | [**assignUser**](docs/LoyaltyCardsApi.md#assignUser) | **POST** /Loyalty/Cards/{loyaltyCardId}/assignUser/{generalAccountId} | POST Loyalty/Cards/{loyaltyCardId}/assignUser/{generalAccountId}
*LoyaltyCardsApi* | [**getAll**](docs/LoyaltyCardsApi.md#getAll) | **GET** /Loyalty/Cards | GET Loyalty/Cards
*LoyaltyCardsApi* | [**getOne**](docs/LoyaltyCardsApi.md#getOne) | **GET** /Loyalty/Cards/{loyaltyCardId} | GET Loyalty/Cards/{loyaltyCardId}
*LoyaltyCardsApi* | [**removeAssignedUser**](docs/LoyaltyCardsApi.md#removeAssignedUser) | **DELETE** /Loyalty/Cards/{loyaltyCardId}/assignUser/{generalAccountId} | DELETE Loyalty/Cards/{loyaltyCardId}/assignUser/{generalAccountId}
*LoyaltyCustomersApi* | [**addCustomer**](docs/LoyaltyCustomersApi.md#addCustomer) | **POST** /Loyalty/Customers | POST Loyalty/Customers
*LoyaltyCustomersApi* | [**assignPaymentContainer**](docs/LoyaltyCustomersApi.md#assignPaymentContainer) | **POST** /Loyalty/Customers/{loyaltyCustomerId}/assignPaymentContainer/{loyaltyPaymentContainerId} | POST Loyalty/Customers/{loyaltyCustomerId}/assignPaymentContainer/{loyaltyPaymentContainerId}
*LoyaltyCustomersApi* | [**checkForDuplicates**](docs/LoyaltyCustomersApi.md#checkForDuplicates) | **POST** /Loyalty/Customers/{loyaltyCustomerId}/checkDuplicated/ | POST Loyalty/Customers/{loyaltyCustomerId}/checkDuplicated/
*LoyaltyCustomersApi* | [**getAll**](docs/LoyaltyCustomersApi.md#getAll) | **GET** /Loyalty/Customers | GET Loyalty/Customers
*LoyaltyCustomersApi* | [**getOne**](docs/LoyaltyCustomersApi.md#getOne) | **GET** /Loyalty/Customers/{loyaltyCustomerId} | GET Loyalty/Customers/{loyaltyCustomerId}
*LoyaltyCustomersApi* | [**removeAssignedPaymentContainer**](docs/LoyaltyCustomersApi.md#removeAssignedPaymentContainer) | **DELETE** /Loyalty/Customers/{loyaltyCustomerId}/assignPaymentContainer/{loyaltyPaymentContainerId} | DELETE Loyalty/Customers/{loyaltyCustomerId}/assignPaymentContainer/{loyaltyPaymentContainerId}
*LoyaltyCustomersApi* | [**removeCustomer**](docs/LoyaltyCustomersApi.md#removeCustomer) | **DELETE** /Loyalty/Customers/{loyaltyCustomerId} | DELETE Loyalty/Customers/{loyaltyCustomerId}
*LoyaltyCustomersApi* | [**updateCustomer**](docs/LoyaltyCustomersApi.md#updateCustomer) | **PUT** /Loyalty/Customers/{loyaltyCustomerId} | PUT Loyalty/Customers/{loyaltyCustomerId}
*LoyaltyMerchantcardsApi* | [**addMerchantCard**](docs/LoyaltyMerchantcardsApi.md#addMerchantCard) | **POST** /Loyalty/MerchantCards | POST Loyalty/MerchantCards
*LoyaltyMerchantcardsApi* | [**checkCsc**](docs/LoyaltyMerchantcardsApi.md#checkCsc) | **POST** /Loyalty/MerchantCards/{loyaltyMerchantCardId}/checkCsc | POST Loyalty/MerchantCards/{loyaltyMerchantCardId}/checkCsc
*LoyaltyMerchantcardsApi* | [**checkPassCode**](docs/LoyaltyMerchantcardsApi.md#checkPassCode) | **POST** /Loyalty/MerchantCards/{loyaltyMerchantCardId}/checkPasscode | POST Loyalty/MerchantCards/{loyaltyMerchantCardId}/checkPasscode
*LoyaltyMerchantcardsApi* | [**createMerchantcards**](docs/LoyaltyMerchantcardsApi.md#createMerchantcards) | **POST** /Loyalty/MerchantCards/{generalMerchantId}/createMerchantcards/{loyaltyCardgroupId} | POST Loyalty/MerchantCards/{generalMerchantId}/createMerchantcards/{loyaltyCardgroupId}
*LoyaltyMerchantcardsApi* | [**executeTransaction**](docs/LoyaltyMerchantcardsApi.md#executeTransaction) | **POST** /Loyalty/MerchantCards/{loyaltyMerchantCardId}/transaction | POST Loyalty/MerchantCards/{loyaltyMerchantCardId}/transaction
*LoyaltyMerchantcardsApi* | [**getAll**](docs/LoyaltyMerchantcardsApi.md#getAll) | **GET** /Loyalty/MerchantCards | GET Loyalty/MerchantCards
*LoyaltyMerchantcardsApi* | [**getLock**](docs/LoyaltyMerchantcardsApi.md#getLock) | **GET** /Loyalty/MerchantCards/{loyaltyMerchantCardId}/lock | GET Loyalty/MerchantCards/{loyaltyMerchantCardId}/lock
*LoyaltyMerchantcardsApi* | [**getOne**](docs/LoyaltyMerchantcardsApi.md#getOne) | **GET** /Loyalty/MerchantCards/{loyaltyMerchantCardId} | GET Loyalty/MerchantCards/{loyaltyMerchantCardId}
*LoyaltyMerchantcardsApi* | [**getRawMerchantCardId**](docs/LoyaltyMerchantcardsApi.md#getRawMerchantCardId) | **GET** /Loyalty/MerchantCards/{generalMerchantId}/merchantcard/{loyaltyCardId} | GET Loyalty/MerchantCards/{generalMerchantId}/merchantcard/{loyaltyCardId}
*LoyaltyMerchantcardsApi* | [**getVirtualTerminalData**](docs/LoyaltyMerchantcardsApi.md#getVirtualTerminalData) | **GET** /Loyalty/MerchantCards/{loyaltyMerchantCardId}/virtualTerminalData/{loyaltyMerchantId} | GET Loyalty/MerchantCards/{loyaltyMerchantCardId}/virtualTerminalData/{loyaltyMerchantId}
*LoyaltyMerchantcardsApi* | [**lock**](docs/LoyaltyMerchantcardsApi.md#lock) | **POST** /Loyalty/MerchantCards/{loyaltyMerchantCardId}/lock | POST Loyalty/MerchantCards/{loyaltyMerchantCardId}/lock
*LoyaltyMerchantcardsApi* | [**newPassCode**](docs/LoyaltyMerchantcardsApi.md#newPassCode) | **POST** /Loyalty/MerchantCards/{loyaltyMerchantCardId}/newPasscode | POST Loyalty/MerchantCards/{loyaltyMerchantCardId}/newPasscode
*LoyaltyMerchantcardsApi* | [**registerCustomer**](docs/LoyaltyMerchantcardsApi.md#registerCustomer) | **POST** /Loyalty/MerchantCards/{loyaltyMerchantCardId}/registerCustomer | POST Loyalty/MerchantCards/{loyaltyMerchantCardId}/registerCustomer
*LoyaltyMerchantcardsApi* | [**removeMerchantCard**](docs/LoyaltyMerchantcardsApi.md#removeMerchantCard) | **DELETE** /Loyalty/MerchantCards/{loyaltyMerchantCardId} | DELETE Loyalty/MerchantCards/{loyaltyMerchantCardId}
*LoyaltyMerchantcardsApi* | [**resetPassCode**](docs/LoyaltyMerchantcardsApi.md#resetPassCode) | **POST** /Loyalty/MerchantCards/{loyaltyMerchantCardId}/resetPasscode | POST Loyalty/MerchantCards/{loyaltyMerchantCardId}/resetPasscode
*LoyaltyMerchantcardsApi* | [**setCustomer**](docs/LoyaltyMerchantcardsApi.md#setCustomer) | **POST** /Loyalty/MerchantCards/{loyaltyMerchantCardId}/setCustomer/{loyaltyCustomerId} | POST Loyalty/MerchantCards/{loyaltyMerchantCardId}/setCustomer/{loyaltyCustomerId}
*LoyaltyMerchantcardsApi* | [**unlock**](docs/LoyaltyMerchantcardsApi.md#unlock) | **POST** /Loyalty/MerchantCards/{loyaltyMerchantCardId}/unlock | POST Loyalty/MerchantCards/{loyaltyMerchantCardId}/unlock
*LoyaltyMerchantcardsApi* | [**updateCardGroupOfMerchantCard**](docs/LoyaltyMerchantcardsApi.md#updateCardGroupOfMerchantCard) | **PUT** /Loyalty/MerchantCards/{loyaltyMerchantCardId}/cardgroup/{loyaltyCardGroupId} | PUT Loyalty/MerchantCards/{loyaltyMerchantCardId}/cardgroup/{loyaltyCardGroupId}
*LoyaltyMerchantcardsApi* | [**updateMerchantCard**](docs/LoyaltyMerchantcardsApi.md#updateMerchantCard) | **PUT** /Loyalty/MerchantCards/{loyaltyMerchantCardId} | PUT Loyalty/MerchantCards/{loyaltyMerchantCardId}
*LoyaltyMerchantcardsApi* | [**validateMerchantCard**](docs/LoyaltyMerchantcardsApi.md#validateMerchantCard) | **POST** /Loyalty/MerchantCards/{loyaltyMerchantCardId}/validateMerchantcard | POST Loyalty/MerchantCards/{loyaltyMerchantCardId}/validateMerchantcard
*LoyaltySalesApi* | [**getCardgroupsByMerchantId**](docs/LoyaltySalesApi.md#getCardgroupsByMerchantId) | **GET** /Loyalty/Sales/{generalMerchantId}/CardGroupsByMerchantID | GET Loyalty/Sales/{generalMerchantId}/CardGroupsByMerchantID
*LoyaltySalesApi* | [**getVirtualTerminalIdByStoreId**](docs/LoyaltySalesApi.md#getVirtualTerminalIdByStoreId) | **GET** /Loyalty/Sales/{generalStoresId}/VirtualTerminalIdForStore | GET Loyalty/Sales/{generalStoresId}/VirtualTerminalIdForStore
*LoyaltyStoregroupsApi* | [**addStoreGroup**](docs/LoyaltyStoregroupsApi.md#addStoreGroup) | **POST** /Loyalty/Storegroups | POST Loyalty/Storegroups
*LoyaltyStoregroupsApi* | [**getAll**](docs/LoyaltyStoregroupsApi.md#getAll) | **GET** /Loyalty/StoreGroups | GET Loyalty/StoreGroups
*LoyaltyStoregroupsApi* | [**getOne**](docs/LoyaltyStoregroupsApi.md#getOne) | **GET** /Loyalty/StoreGroups/{loyaltyStoreGroupId} | GET Loyalty/StoreGroups/{loyaltyStoreGroupId}
*LoyaltyStoregroupsApi* | [**removeStoreGroup**](docs/LoyaltyStoregroupsApi.md#removeStoreGroup) | **DELETE** /Loyalty/StoreGroups/{loyaltyStoreGroupId} | DELETE Loyalty/StoreGroups/{loyaltyStoreGroupId}
*LoyaltyStoregroupsApi* | [**updateStoreGroup**](docs/LoyaltyStoregroupsApi.md#updateStoreGroup) | **PUT** /Loyalty/StoreGroups/{loyaltyStoreGroupId} | PUT Loyalty/StoreGroups/{loyaltyStoreGroupId}
*PaymentContainersApi* | [**paymentContainersGet**](docs/PaymentContainersApi.md#paymentContainersGet) | **GET** /Payment/Containers | GET Payment/Containers
*PaymentContainersApi* | [**paymentContainersGetById**](docs/PaymentContainersApi.md#paymentContainersGetById) | **GET** /Payment/Containers/{paymentContainerId} | GET Payment/Containers/{paymentContainerId}
*PaymentContainersApi* | [**paymentContainersIdAssignSecondaryIdDelete**](docs/PaymentContainersApi.md#paymentContainersIdAssignSecondaryIdDelete) | **DELETE** /Payment/Containers/{paymentContainerId}/assign/{secondaryPaymentContainerId} | DELETE Payment/Containers/{paymentContainerId}/assign/{secondaryPaymentContainerId}
*PaymentContainersApi* | [**paymentContainersIdAssignSecondaryIdPost**](docs/PaymentContainersApi.md#paymentContainersIdAssignSecondaryIdPost) | **POST** /Payment/Containers/{paymentContainerId}/assign/{secondaryPaymentContainerId} | POST Payment/Containers/{paymentContainerId}/assign/{secondaryPaymentContainerId}
*PaymentContainersApi* | [**paymentContainersIdDelete**](docs/PaymentContainersApi.md#paymentContainersIdDelete) | **DELETE** /Payment/Containers/{paymentContainerId} | DELETE Payment/Containers/{paymentContainerId}
*PaymentContainersApi* | [**paymentContainersIdPut**](docs/PaymentContainersApi.md#paymentContainersIdPut) | **PUT** /Payment/Containers/{paymentContainerId} | PUT Payment/Containers/{paymentContainerId}
*PaymentContainersApi* | [**paymentContainersPost**](docs/PaymentContainersApi.md#paymentContainersPost) | **POST** /Payment/Containers | POST Payment/Containers
*PaymentContractsApi* | [**clone**](docs/PaymentContractsApi.md#clone) | **POST** /Payment/Contracts/{paymentContractId}/clone | POST Payment/Contracts/{paymentContractId}/clone
*PaymentContractsApi* | [**paymentContractsGet**](docs/PaymentContractsApi.md#paymentContractsGet) | **GET** /Payment/Contracts | GET Payment/Contracts
*PaymentContractsApi* | [**paymentContractsGetById**](docs/PaymentContractsApi.md#paymentContractsGetById) | **GET** /Payment/Contracts/{paymentContractId} | GET Payment/Contracts/{paymentContractId}
*PaymentContractsApi* | [**paymentContractsIdDelete**](docs/PaymentContractsApi.md#paymentContractsIdDelete) | **DELETE** /Payment/Contracts/{paymentContractId} | DELETE Payment/Contracts/{paymentContractId}
*PaymentContractsApi* | [**paymentContractsIdPaymentMethodsGet**](docs/PaymentContractsApi.md#paymentContractsIdPaymentMethodsGet) | **GET** /Payment/Contracts/{paymentContractId}/PaymentMethods | GET Payment/Contracts/{paymentContractId}/PaymentMethods
*PaymentContractsApi* | [**paymentContractsIdPut**](docs/PaymentContractsApi.md#paymentContractsIdPut) | **PUT** /Payment/Contracts/{paymentContractId} | PUT Payment/Contracts/{paymentContractId}
*PaymentContractsApi* | [**paymentContractsPost**](docs/PaymentContractsApi.md#paymentContractsPost) | **POST** /Payment/Contracts | POST Payment/Contracts
*PaymentContractsApi* | [**requestId**](docs/PaymentContractsApi.md#requestId) | **POST** /Payment/Contracts/{paymentContractId}/requestId | POST Payment/Contracts/{paymentContractId}/requestId
*PaymentCustomersApi* | [**paymentCustomersGet**](docs/PaymentCustomersApi.md#paymentCustomersGet) | **GET** /Payment/Customers | GET Payment/Customers
*PaymentCustomersApi* | [**paymentCustomersGetById**](docs/PaymentCustomersApi.md#paymentCustomersGetById) | **GET** /Payment/Customers/{paymentCustomerId} | GET Payment/Customers/{paymentCustomerId}
*PaymentCustomersApi* | [**paymentCustomersIdDelete**](docs/PaymentCustomersApi.md#paymentCustomersIdDelete) | **DELETE** /Payment/Customers/{paymentCustomerId} | DELETE Payment/Customers/{paymentCustomerId}
*PaymentCustomersApi* | [**paymentCustomersIdPut**](docs/PaymentCustomersApi.md#paymentCustomersIdPut) | **PUT** /Payment/Customers/{paymentCustomerId} | PUT Payment/Customers/{paymentCustomerId}
*PaymentCustomersApi* | [**paymentCustomersPost**](docs/PaymentCustomersApi.md#paymentCustomersPost) | **POST** /Payment/Customers | POST Payment/Customers
*PaymentSecupayCreditcardsApi* | [**assignExternalInvoicePdf**](docs/PaymentSecupayCreditcardsApi.md#assignExternalInvoicePdf) | **POST** /Payment/{paymentMethod}/{paymentId}/assignExternalInvoicePdf/{documentId} | POST Payment/{paymentMethod}/{paymentId}/assignExternalInvoicePdf/{documentId}
*PaymentSecupayCreditcardsApi* | [**cancelPaymentTransactionById**](docs/PaymentSecupayCreditcardsApi.md#cancelPaymentTransactionById) | **POST** /Payment/{paymentMethod}/{paymentId}/cancel | POST Payment/{paymentMethod}/{paymentId}/cancel
*PaymentSecupayCreditcardsApi* | [**capturePaymentTransactionById**](docs/PaymentSecupayCreditcardsApi.md#capturePaymentTransactionById) | **POST** /Payment/{paymentMethod}/{paymentId}/capture | POST Payment/{paymentMethod}/{paymentId}/capture
*PaymentSecupayCreditcardsApi* | [**paymentSecupayCreditcardsCancelById**](docs/PaymentSecupayCreditcardsApi.md#paymentSecupayCreditcardsCancelById) | **POST** /Payment/Secupaycreditcards/{paymentCreditCardsId}/cancel | POST Payment/Secupaycreditcards/{paymentCreditCardsId}/cancel
*PaymentSecupayCreditcardsApi* | [**paymentSecupayCreditcardsGetById**](docs/PaymentSecupayCreditcardsApi.md#paymentSecupayCreditcardsGetById) | **GET** /Payment/Secupaycreditcards/{paymentCreditCardsId} | GET Payment/Secupaycreditcards/{paymentCreditCardsId}
*PaymentSecupayCreditcardsApi* | [**paymentSecupaycreditcardsPost**](docs/PaymentSecupayCreditcardsApi.md#paymentSecupaycreditcardsPost) | **POST** /Payment/Secupaycreditcards | POST Payment/Secupaycreditcards
*PaymentSecupayCreditcardsApi* | [**reverseAccrualByPaymentId**](docs/PaymentSecupayCreditcardsApi.md#reverseAccrualByPaymentId) | **PUT** /Payment/{paymentMethod}/{paymentId}/accrual | PUT Payment/{paymentMethod}/{paymentId}/accrual
*PaymentSecupayCreditcardsApi* | [**setShippingInformationByPaymentId**](docs/PaymentSecupayCreditcardsApi.md#setShippingInformationByPaymentId) | **PUT** /Payment/{paymentMethod}/{paymentId}/shippingInformation | PUT Payment/{paymentMethod}/{paymentId}/shippingInformation
*PaymentSecupayCreditcardsApi* | [**updateBasketByPaymentId**](docs/PaymentSecupayCreditcardsApi.md#updateBasketByPaymentId) | **PUT** /Payment/{paymentMethod}/{paymentId}/basket | PUT Payment/{paymentMethod}/{paymentId}/basket
*PaymentSecupayDebitsApi* | [**assignExternalInvoicePdf**](docs/PaymentSecupayDebitsApi.md#assignExternalInvoicePdf) | **POST** /Payment/{paymentMethod}/{paymentId}/assignExternalInvoicePdf/{documentId} | POST Payment/{paymentMethod}/{paymentId}/assignExternalInvoicePdf/{documentId}
*PaymentSecupayDebitsApi* | [**cancelPaymentTransactionById**](docs/PaymentSecupayDebitsApi.md#cancelPaymentTransactionById) | **POST** /Payment/{paymentMethod}/{paymentId}/cancel | POST Payment/{paymentMethod}/{paymentId}/cancel
*PaymentSecupayDebitsApi* | [**capturePaymentTransactionById**](docs/PaymentSecupayDebitsApi.md#capturePaymentTransactionById) | **POST** /Payment/{paymentMethod}/{paymentId}/capture | POST Payment/{paymentMethod}/{paymentId}/capture
*PaymentSecupayDebitsApi* | [**paymentSecupayDebitsCancelById**](docs/PaymentSecupayDebitsApi.md#paymentSecupayDebitsCancelById) | **POST** /Payment/Secupaydebits/{paymentDebitId}/cancel | POST Payment/Secupaydebits/{paymentDebitId}/cancel
*PaymentSecupayDebitsApi* | [**paymentSecupayDebitsGetById**](docs/PaymentSecupayDebitsApi.md#paymentSecupayDebitsGetById) | **GET** /Payment/Secupaydebits/{paymentDebitId} | GET Payment/Secupaydebits/{paymentDebitId}
*PaymentSecupayDebitsApi* | [**paymentSecupaydebitsPost**](docs/PaymentSecupayDebitsApi.md#paymentSecupaydebitsPost) | **POST** /Payment/Secupaydebits | POST Payment/Secupaydebits
*PaymentSecupayDebitsApi* | [**reverseAccrualByPaymentId**](docs/PaymentSecupayDebitsApi.md#reverseAccrualByPaymentId) | **PUT** /Payment/{paymentMethod}/{paymentId}/accrual | PUT Payment/{paymentMethod}/{paymentId}/accrual
*PaymentSecupayDebitsApi* | [**setShippingInformationByPaymentId**](docs/PaymentSecupayDebitsApi.md#setShippingInformationByPaymentId) | **PUT** /Payment/{paymentMethod}/{paymentId}/shippingInformation | PUT Payment/{paymentMethod}/{paymentId}/shippingInformation
*PaymentSecupayDebitsApi* | [**updateBasketByPaymentId**](docs/PaymentSecupayDebitsApi.md#updateBasketByPaymentId) | **PUT** /Payment/{paymentMethod}/{paymentId}/basket | PUT Payment/{paymentMethod}/{paymentId}/basket
*PaymentSecupayInvoicesApi* | [**assignExternalInvoicePdf**](docs/PaymentSecupayInvoicesApi.md#assignExternalInvoicePdf) | **POST** /Payment/{paymentMethod}/{paymentId}/assignExternalInvoicePdf/{documentId} | POST Payment/{paymentMethod}/{paymentId}/assignExternalInvoicePdf/{documentId}
*PaymentSecupayInvoicesApi* | [**cancelPaymentTransactionById**](docs/PaymentSecupayInvoicesApi.md#cancelPaymentTransactionById) | **POST** /Payment/{paymentMethod}/{paymentId}/cancel | POST Payment/{paymentMethod}/{paymentId}/cancel
*PaymentSecupayInvoicesApi* | [**capturePaymentTransactionById**](docs/PaymentSecupayInvoicesApi.md#capturePaymentTransactionById) | **POST** /Payment/{paymentMethod}/{paymentId}/capture | POST Payment/{paymentMethod}/{paymentId}/capture
*PaymentSecupayInvoicesApi* | [**paymentSecupayInvoicesCancelById**](docs/PaymentSecupayInvoicesApi.md#paymentSecupayInvoicesCancelById) | **POST** /Payment/Secupayinvoices/{paymentInvoiceId}/cancel | POST Payment/Secupayinvoices/{paymentInvoiceId}/cancel
*PaymentSecupayInvoicesApi* | [**paymentSecupayInvoicesGetById**](docs/PaymentSecupayInvoicesApi.md#paymentSecupayInvoicesGetById) | **GET** /Payment/Secupayinvoices/{paymentInvoiceId} | GET Payment/Secupayinvoices/{paymentInvoiceId}
*PaymentSecupayInvoicesApi* | [**paymentSecupayinvoicesPost**](docs/PaymentSecupayInvoicesApi.md#paymentSecupayinvoicesPost) | **POST** /Payment/Secupayinvoices | POST Payment/Secupayinvoices
*PaymentSecupayInvoicesApi* | [**reverseAccrualByPaymentId**](docs/PaymentSecupayInvoicesApi.md#reverseAccrualByPaymentId) | **PUT** /Payment/{paymentMethod}/{paymentId}/accrual | PUT Payment/{paymentMethod}/{paymentId}/accrual
*PaymentSecupayInvoicesApi* | [**setShippingInformationByPaymentId**](docs/PaymentSecupayInvoicesApi.md#setShippingInformationByPaymentId) | **PUT** /Payment/{paymentMethod}/{paymentId}/shippingInformation | PUT Payment/{paymentMethod}/{paymentId}/shippingInformation
*PaymentSecupayInvoicesApi* | [**updateBasketByPaymentId**](docs/PaymentSecupayInvoicesApi.md#updateBasketByPaymentId) | **PUT** /Payment/{paymentMethod}/{paymentId}/basket | PUT Payment/{paymentMethod}/{paymentId}/basket
*PaymentSecupayPrepaysApi* | [**assignExternalInvoicePdf**](docs/PaymentSecupayPrepaysApi.md#assignExternalInvoicePdf) | **POST** /Payment/{paymentMethod}/{paymentId}/assignExternalInvoicePdf/{documentId} | POST Payment/{paymentMethod}/{paymentId}/assignExternalInvoicePdf/{documentId}
*PaymentSecupayPrepaysApi* | [**cancelPaymentTransactionById**](docs/PaymentSecupayPrepaysApi.md#cancelPaymentTransactionById) | **POST** /Payment/{paymentMethod}/{paymentId}/cancel | POST Payment/{paymentMethod}/{paymentId}/cancel
*PaymentSecupayPrepaysApi* | [**capturePaymentTransactionById**](docs/PaymentSecupayPrepaysApi.md#capturePaymentTransactionById) | **POST** /Payment/{paymentMethod}/{paymentId}/capture | POST Payment/{paymentMethod}/{paymentId}/capture
*PaymentSecupayPrepaysApi* | [**paymentSecupayPrepaysCancelById**](docs/PaymentSecupayPrepaysApi.md#paymentSecupayPrepaysCancelById) | **POST** /Payment/Secupayprepays/{paymentPrepayId}/cancel | POST Payment/Secupayprepays/{paymentPrepayId}/cancel
*PaymentSecupayPrepaysApi* | [**paymentSecupayPrepaysGetById**](docs/PaymentSecupayPrepaysApi.md#paymentSecupayPrepaysGetById) | **GET** /Payment/Secupayprepays/{paymentPrepayId} | GET Payment/Secupayprepays/{paymentPrepayId}
*PaymentSecupayPrepaysApi* | [**paymentSecupayprepaysPost**](docs/PaymentSecupayPrepaysApi.md#paymentSecupayprepaysPost) | **POST** /Payment/Secupayprepays | POST Payment/Secupayprepays
*PaymentSecupayPrepaysApi* | [**reverseAccrualByPaymentId**](docs/PaymentSecupayPrepaysApi.md#reverseAccrualByPaymentId) | **PUT** /Payment/{paymentMethod}/{paymentId}/accrual | PUT Payment/{paymentMethod}/{paymentId}/accrual
*PaymentSecupayPrepaysApi* | [**setShippingInformationByPaymentId**](docs/PaymentSecupayPrepaysApi.md#setShippingInformationByPaymentId) | **PUT** /Payment/{paymentMethod}/{paymentId}/shippingInformation | PUT Payment/{paymentMethod}/{paymentId}/shippingInformation
*PaymentSecupayPrepaysApi* | [**updateBasketByPaymentId**](docs/PaymentSecupayPrepaysApi.md#updateBasketByPaymentId) | **PUT** /Payment/{paymentMethod}/{paymentId}/basket | PUT Payment/{paymentMethod}/{paymentId}/basket
*PaymentTransactionsApi* | [**paymentTransactionsGet**](docs/PaymentTransactionsApi.md#paymentTransactionsGet) | **GET** /Payment/Transactions | GET Payment/Transactions
*PaymentTransactionsApi* | [**paymentTransactionsGetById**](docs/PaymentTransactionsApi.md#paymentTransactionsGetById) | **GET** /Payment/Transactions/{paymentTransactionId} | GET Payment/Transactions/{paymentTransactionId}
*PaymentTransactionsApi* | [**paymentTransactionsIdCancelPost**](docs/PaymentTransactionsApi.md#paymentTransactionsIdCancelPost) | **POST** /Payment/Transactions/{paymentTransactionId}/cancel | POST Payment/Transactions/{paymentTransactionId}/cancel
*PaymentTransactionsApi* | [**paymentTransactionsIdShippingUrlGet**](docs/PaymentTransactionsApi.md#paymentTransactionsIdShippingUrlGet) | **GET** /Payment/Transactions/{paymentTransactionId}/ShippingUrl | GET Payment/Transactions/{paymentTransactionId}/ShippingUrl
*PrepaidItemsApi* | [**getAll**](docs/PrepaidItemsApi.md#getAll) | **GET** /Prepaid/Items | GET Prepaid/Items
*PrepaidItemsApi* | [**getOne**](docs/PrepaidItemsApi.md#getOne) | **GET** /Prepaid/Items/{prepaidItemId} | GET Prepaid/Items/{prepaidItemId}
*SmartDevicesApi* | [**addDevice**](docs/SmartDevicesApi.md#addDevice) | **POST** /Smart/Devices | POST Smart/Devices
*SmartDevicesApi* | [**createPrepaidTid**](docs/SmartDevicesApi.md#createPrepaidTid) | **POST** /Smart/Devices/{smartDeviceId}/CreatePrepaidTid | POST Smart/Devices/{smartDeviceId}/CreatePrepaidTid
*SmartDevicesApi* | [**createVirtualDevice**](docs/SmartDevicesApi.md#createVirtualDevice) | **POST** /Smart/Devices/{smartDeviceId}/CreateVirtualDevice | POST Smart/Devices/{smartDeviceId}/CreateVirtualDevice
*SmartDevicesApi* | [**getAll**](docs/SmartDevicesApi.md#getAll) | **GET** /Smart/Devices | GET Smart/Devices
*SmartDevicesApi* | [**getOne**](docs/SmartDevicesApi.md#getOne) | **GET** /Smart/Devices/{smartDeviceId} | GET Smart/Devices/{smartDeviceId}
*SmartDevicesApi* | [**getRouting**](docs/SmartDevicesApi.md#getRouting) | **GET** /Smart/Devices/{smartDeviceId}/routing/type/{type} | GET Smart/Devices/{smartDeviceId}/routing/type/{type}
*SmartDevicesApi* | [**getSecubaseConfig**](docs/SmartDevicesApi.md#getSecubaseConfig) | **POST** /Smart/Devices/{smartDeviceId}/GetSecubaseConfig | POST Smart/Devices/{smartDeviceId}/GetSecubaseConfig
*SmartDevicesApi* | [**updateDevice**](docs/SmartDevicesApi.md#updateDevice) | **PUT** /Smart/Devices/{smartDeviceId} | PUT Smart/Devices/{smartDeviceId}
*SmartTransactionsApi* | [**addTransaction**](docs/SmartTransactionsApi.md#addTransaction) | **POST** /Smart/Transactions | POST Smart/Transactions
*SmartTransactionsApi* | [**cancelTransaction**](docs/SmartTransactionsApi.md#cancelTransaction) | **POST** /Smart/Transactions/{smartTransactionId}/cancel | POST Smart/Transactions/{smartTransactionId}/cancel
*SmartTransactionsApi* | [**cancelTrx**](docs/SmartTransactionsApi.md#cancelTrx) | **POST** /Smart/Transactions/{smartTransactionId}/canceltrx | POST Smart/Transactions/{smartTransactionId}/canceltrx
*SmartTransactionsApi* | [**diagnose**](docs/SmartTransactionsApi.md#diagnose) | **POST** /Smart/Transactions/{smartDeviceId}/diagnosis | POST Smart/Transactions/{smartDeviceId}/diagnosis
*SmartTransactionsApi* | [**getAll**](docs/SmartTransactionsApi.md#getAll) | **GET** /Smart/Transactions | GET Smart/Transactions
*SmartTransactionsApi* | [**getOne**](docs/SmartTransactionsApi.md#getOne) | **GET** /Smart/Transactions/{smartTransactionId} | GET Smart/Transactions/{smartTransactionId}
*SmartTransactionsApi* | [**preTransaction**](docs/SmartTransactionsApi.md#preTransaction) | **POST** /Smart/Transactions/{smartTransactionId}/PreTransaction | POST Smart/Transactions/{smartTransactionId}/PreTransaction
*SmartTransactionsApi* | [**startEndOfDayReport**](docs/SmartTransactionsApi.md#startEndOfDayReport) | **POST** /Smart/Transactions/{smartDeviceId}/endOfDay | POST Smart/Transactions/{smartDeviceId}/endOfDay
*SmartTransactionsApi* | [**startTransaction**](docs/SmartTransactionsApi.md#startTransaction) | **POST** /Smart/Transactions/{smartTransactionId}/start/{paymentMethod} | POST Smart/Transactions/{smartTransactionId}/start/{paymentMethod}
*SmartTransactionsApi* | [**updateTransaction**](docs/SmartTransactionsApi.md#updateTransaction) | **PUT** /Smart/Transactions/{smartTransactionId} | PUT Smart/Transactions/{smartTransactionId}


## Documentation for Models

 - [Address](docs/Address.md)
 - [AddressComponents](docs/AddressComponents.md)
 - [AssignedBy](docs/AssignedBy.md)
 - [BankAccountDescriptor](docs/BankAccountDescriptor.md)
 - [Contact](docs/Contact.md)
 - [DayTime](docs/DayTime.md)
 - [DocumentUploadsBaseProductModel](docs/DocumentUploadsBaseProductModel.md)
 - [DocumentUploadsDTOContent](docs/DocumentUploadsDTOContent.md)
 - [GeneralMerchantsCheckoutOptions](docs/GeneralMerchantsCheckoutOptions.md)
 - [GeneralMerchantsCheckoutOptionsCollection](docs/GeneralMerchantsCheckoutOptionsCollection.md)
 - [GeneralMerchantsCheckoutOptionsCollectionSmartDevices](docs/GeneralMerchantsCheckoutOptionsCollectionSmartDevices.md)
 - [GeneralMerchantsCheckoutOptionsShipping](docs/GeneralMerchantsCheckoutOptionsShipping.md)
 - [GeneralMerchantsDTO](docs/GeneralMerchantsDTO.md)
 - [GeneralMerchantsLegalDetails](docs/GeneralMerchantsLegalDetails.md)
 - [GeneralMerchantsList](docs/GeneralMerchantsList.md)
 - [GeneralMerchantsProductModel](docs/GeneralMerchantsProductModel.md)
 - [GeneralMerchantsUrls](docs/GeneralMerchantsUrls.md)
 - [GeneralMerchantsUser](docs/GeneralMerchantsUser.md)
 - [GeneralStoresDTO](docs/GeneralStoresDTO.md)
 - [GeneralStoresDTOReason](docs/GeneralStoresDTOReason.md)
 - [GeneralStoresDTOType](docs/GeneralStoresDTOType.md)
 - [GeneralStoresList](docs/GeneralStoresList.md)
 - [GeneralStoresProductModel](docs/GeneralStoresProductModel.md)
 - [GeoAddress](docs/GeoAddress.md)
 - [GeoAddressGeometry](docs/GeoAddressGeometry.md)
 - [InvitedBy](docs/InvitedBy.md)
 - [ItemGroup](docs/ItemGroup.md)
 - [LoyaltyCardgroupsDTO](docs/LoyaltyCardgroupsDTO.md)
 - [LoyaltyCardgroupsDTOCheckPasscodeEnabled](docs/LoyaltyCardgroupsDTOCheckPasscodeEnabled.md)
 - [LoyaltyCardgroupsDTOMerchant](docs/LoyaltyCardgroupsDTOMerchant.md)
 - [LoyaltyCardgroupsList](docs/LoyaltyCardgroupsList.md)
 - [LoyaltyCardgroupsProductModel](docs/LoyaltyCardgroupsProductModel.md)
 - [LoyaltyCardsDTOAccount](docs/LoyaltyCardsDTOAccount.md)
 - [LoyaltyCardsList](docs/LoyaltyCardsList.md)
 - [LoyaltyCardsProductModel](docs/LoyaltyCardsProductModel.md)
 - [LoyaltyCustomersContactDTO](docs/LoyaltyCustomersContactDTO.md)
 - [LoyaltyCustomersDTO](docs/LoyaltyCustomersDTO.md)
 - [LoyaltyCustomersList](docs/LoyaltyCustomersList.md)
 - [LoyaltyCustomersPaymentContainerModel](docs/LoyaltyCustomersPaymentContainerModel.md)
 - [LoyaltyCustomersProductModel](docs/LoyaltyCustomersProductModel.md)
 - [LoyaltyCustomersRemoved](docs/LoyaltyCustomersRemoved.md)
 - [LoyaltyDTOMerchant](docs/LoyaltyDTOMerchant.md)
 - [LoyaltyDTOStore](docs/LoyaltyDTOStore.md)
 - [LoyaltyMerchantcardsDTO](docs/LoyaltyMerchantcardsDTO.md)
 - [LoyaltyMerchantcardsDTOCardsAmount](docs/LoyaltyMerchantcardsDTOCardsAmount.md)
 - [LoyaltyMerchantcardsDTOCheckPasscode](docs/LoyaltyMerchantcardsDTOCheckPasscode.md)
 - [LoyaltyMerchantcardsDTOCsc](docs/LoyaltyMerchantcardsDTOCsc.md)
 - [LoyaltyMerchantcardsDTOLock](docs/LoyaltyMerchantcardsDTOLock.md)
 - [LoyaltyMerchantcardsDTOPaymentContainer](docs/LoyaltyMerchantcardsDTOPaymentContainer.md)
 - [LoyaltyMerchantcardsDTOResetPasscode](docs/LoyaltyMerchantcardsDTOResetPasscode.md)
 - [LoyaltyMerchantcardsDTOTransaction](docs/LoyaltyMerchantcardsDTOTransaction.md)
 - [LoyaltyMerchantcardsDTOValidateMerchantCard](docs/LoyaltyMerchantcardsDTOValidateMerchantCard.md)
 - [LoyaltyMerchantcardsList](docs/LoyaltyMerchantcardsList.md)
 - [LoyaltyMerchantcardsProductModel](docs/LoyaltyMerchantcardsProductModel.md)
 - [LoyaltyMerchantcardsValidateMerchantCard](docs/LoyaltyMerchantcardsValidateMerchantCard.md)
 - [LoyaltyStoregroupsDTO](docs/LoyaltyStoregroupsDTO.md)
 - [LoyaltyStoregroupsDTOStoresAddressComponents](docs/LoyaltyStoregroupsDTOStoresAddressComponents.md)
 - [LoyaltyStoregroupsList](docs/LoyaltyStoregroupsList.md)
 - [LoyaltyStoregroupsProductModel](docs/LoyaltyStoregroupsProductModel.md)
 - [OpenHours](docs/OpenHours.md)
 - [ParentModel](docs/ParentModel.md)
 - [PaymentContainerMandate](docs/PaymentContainerMandate.md)
 - [PaymentContainersDTO](docs/PaymentContainersDTO.md)
 - [PaymentContainersDTOCustomer](docs/PaymentContainersDTOCustomer.md)
 - [PaymentContainersDTOPrivate](docs/PaymentContainersDTOPrivate.md)
 - [PaymentContainersList](docs/PaymentContainersList.md)
 - [PaymentContainersProductModel](docs/PaymentContainersProductModel.md)
 - [PaymentContractsDTO](docs/PaymentContractsDTO.md)
 - [PaymentContractsDTOClone](docs/PaymentContractsDTOClone.md)
 - [PaymentContractsDTOIFrameOpts](docs/PaymentContractsDTOIFrameOpts.md)
 - [PaymentContractsDTORequestId](docs/PaymentContractsDTORequestId.md)
 - [PaymentContractsList](docs/PaymentContractsList.md)
 - [PaymentContractsProductModel](docs/PaymentContractsProductModel.md)
 - [PaymentContractsRequestIdResult](docs/PaymentContractsRequestIdResult.md)
 - [PaymentCustomersDTO](docs/PaymentCustomersDTO.md)
 - [PaymentCustomersList](docs/PaymentCustomersList.md)
 - [PaymentCustomersProductModel](docs/PaymentCustomersProductModel.md)
 - [PaymentInformation](docs/PaymentInformation.md)
 - [PaymentTransactionsCancelList](docs/PaymentTransactionsCancelList.md)
 - [PaymentTransactionsList](docs/PaymentTransactionsList.md)
 - [PaymentTransactionsProductModel](docs/PaymentTransactionsProductModel.md)
 - [PaymentTransactionsProductModelCustomer](docs/PaymentTransactionsProductModelCustomer.md)
 - [PaymentTransactionsProductModelDetails](docs/PaymentTransactionsProductModelDetails.md)
 - [PaymentTransactionsProductModelMerchant](docs/PaymentTransactionsProductModelMerchant.md)
 - [PaymentTransactionsShippingUrl](docs/PaymentTransactionsShippingUrl.md)
 - [PrepaidItemsList](docs/PrepaidItemsList.md)
 - [PrepaidItemsProductModel](docs/PrepaidItemsProductModel.md)
 - [PrepaidSalesItem](docs/PrepaidSalesItem.md)
 - [PrepaidSalesProductModel](docs/PrepaidSalesProductModel.md)
 - [PrepaidSalesSmartDevice](docs/PrepaidSalesSmartDevice.md)
 - [ProductExceptionPayload](docs/ProductExceptionPayload.md)
 - [ProductInstanceID](docs/ProductInstanceID.md)
 - [ProductInstanceUID](docs/ProductInstanceUID.md)
 - [ReceiptType](docs/ReceiptType.md)
 - [ReceiptValue](docs/ReceiptValue.md)
 - [SecupayBasketItem](docs/SecupayBasketItem.md)
 - [SecupaySubTransactionProductModel](docs/SecupaySubTransactionProductModel.md)
 - [SecupayTransactionCancelDTO](docs/SecupayTransactionCancelDTO.md)
 - [SecupayTransactionCaptureDTO](docs/SecupayTransactionCaptureDTO.md)
 - [SecupayTransactionDTOExternalInvoicePdf](docs/SecupayTransactionDTOExternalInvoicePdf.md)
 - [SecupayTransactionExternalInvoicePdf](docs/SecupayTransactionExternalInvoicePdf.md)
 - [SecupayTransactionExternalInvoicePdfDocument](docs/SecupayTransactionExternalInvoicePdfDocument.md)
 - [SecupayTransactionProductDTO](docs/SecupayTransactionProductDTO.md)
 - [SecupayTransactionProductDTOExperience](docs/SecupayTransactionProductDTOExperience.md)
 - [SecupayTransactionProductDTOOptData](docs/SecupayTransactionProductDTOOptData.md)
 - [SecupayTransactionProductDTORedirectUrl](docs/SecupayTransactionProductDTORedirectUrl.md)
 - [SecupayTransactionProductDTOSubscription](docs/SecupayTransactionProductDTOSubscription.md)
 - [SecupayTransactionProductModel](docs/SecupayTransactionProductModel.md)
 - [SecupayTransactionProductModelRedirectUrl](docs/SecupayTransactionProductModelRedirectUrl.md)
 - [SecupayTransactionProductModelTransferAccount](docs/SecupayTransactionProductModelTransferAccount.md)
 - [SecupayTransactionProductModelUsedPaymentInstrument](docs/SecupayTransactionProductModelUsedPaymentInstrument.md)
 - [SecupayTransactionReverseAccrualDTO](docs/SecupayTransactionReverseAccrualDTO.md)
 - [SecupayTransactionSetShippingInformationDTO](docs/SecupayTransactionSetShippingInformationDTO.md)
 - [SecupayTransactionUpdateBasketDTO](docs/SecupayTransactionUpdateBasketDTO.md)
 - [SmartDeviceProductsEnabled](docs/SmartDeviceProductsEnabled.md)
 - [SmartDeviceProductsPrepaid](docs/SmartDeviceProductsPrepaid.md)
 - [SmartDevicesDTO](docs/SmartDevicesDTO.md)
 - [SmartDevicesDTOPrepaidTid](docs/SmartDevicesDTOPrepaidTid.md)
 - [SmartDevicesDTOSecubaseConfig](docs/SmartDevicesDTOSecubaseConfig.md)
 - [SmartDevicesDevice](docs/SmartDevicesDevice.md)
 - [SmartDevicesList](docs/SmartDevicesList.md)
 - [SmartDevicesList1](docs/SmartDevicesList1.md)
 - [SmartDevicesProductModel](docs/SmartDevicesProductModel.md)
 - [SmartDevicesProducts](docs/SmartDevicesProducts.md)
 - [SmartDevicesSecubaseConfig](docs/SmartDevicesSecubaseConfig.md)
 - [SmartDevicesSecubaseConfigLogging](docs/SmartDevicesSecubaseConfigLogging.md)
 - [SmartDevicesSecubaseConfigLoggingFileNet](docs/SmartDevicesSecubaseConfigLoggingFileNet.md)
 - [SmartTransactionsBasket](docs/SmartTransactionsBasket.md)
 - [SmartTransactionsBasketInfo](docs/SmartTransactionsBasketInfo.md)
 - [SmartTransactionsBasketProduct](docs/SmartTransactionsBasketProduct.md)
 - [SmartTransactionsBasketProductGroup](docs/SmartTransactionsBasketProductGroup.md)
 - [SmartTransactionsBasketText](docs/SmartTransactionsBasketText.md)
 - [SmartTransactionsBonusProducts](docs/SmartTransactionsBonusProducts.md)
 - [SmartTransactionsCheckin](docs/SmartTransactionsCheckin.md)
 - [SmartTransactionsDTO](docs/SmartTransactionsDTO.md)
 - [SmartTransactionsIdent](docs/SmartTransactionsIdent.md)
 - [SmartTransactionsList](docs/SmartTransactionsList.md)
 - [SmartTransactionsPickupOptions](docs/SmartTransactionsPickupOptions.md)
 - [SmartTransactionsPreTransactionModel](docs/SmartTransactionsPreTransactionModel.md)
 - [SmartTransactionsProductModel](docs/SmartTransactionsProductModel.md)
 - [SmartTransactionsReceipt](docs/SmartTransactionsReceipt.md)
 - [SmartTransactionsReceiptValue](docs/SmartTransactionsReceiptValue.md)
 - [Store](docs/Store.md)
 - [VirtualTerminalData](docs/VirtualTerminalData.md)
 - [DocumentUploadsProductModel](docs/DocumentUploadsProductModel.md)
 - [LoyaltyMerchantcardsDTONewPasscode](docs/LoyaltyMerchantcardsDTONewPasscode.md)
 - [LoyaltyMerchantcardsProductWithReceiptModel](docs/LoyaltyMerchantcardsProductWithReceiptModel.md)
 - [ReceiptTypeValue](docs/ReceiptTypeValue.md)
 - [SmartTransactionsMerchant](docs/SmartTransactionsMerchant.md)


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




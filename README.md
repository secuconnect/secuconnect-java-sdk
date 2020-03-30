# secuconnect-java-sdk

## Documentation

https://developer.secuconnect.com/

## Requirements

Building the API client library requires:
1. Java 1.7+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

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
compile "io.secuconnect:secuconnect-java-sdk:2.0.0"
```

### Others

At first generate the JAR by executing:

```shell
mvn package
```

Then manually install the following JARs:

* `target/secuconnect-java-sdk-2.0.0.jar`
* `target/lib/*.jar`

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

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

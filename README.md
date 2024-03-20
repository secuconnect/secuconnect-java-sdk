# secuconnect-java-sdk

## Documentation

[https://developer.secuconnect.com/](https://developer.secuconnect.com/)

## Requirements

Building the API client library requires:
1. Java 1.8+
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
        <groupId>com.secuconnect</groupId>
        <artifactId>secuconnect-java-sdk</artifactId>
        <version>3.29.0</version>
    </dependency>
    .
    .
    .
    <repository>
        <id>secuconnect-java-sdk-mvn</id>
        <url>https://raw.github.com/secuconnect/secuconnect-java-sdk/mvn-repo/</url>
    </repository>
```

### Others

Download and use the generated JAR-Files from [https://github.com/secuconnect/secuconnect-java-sdk/releases](https://github.com/secuconnect/secuconnect-java-sdk/releases).


## Getting Started

Please take a look at our demo code: [https://github.com/secuconnect/secuconnect-java-sdk-demo](https://github.com/secuconnect/secuconnect-java-sdk-demo)


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreading environment to avoid any potential issues.

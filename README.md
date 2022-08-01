# Spring Contract Test

## Introduction
This project aims to show a simple example of how it works Spring Cloud Contract. This lib allow to develop contract tests, defining a stub where the **consumer** can verify if a contract between applications are violeted.

## Technologies
- Spring Cloud Contract
- Rest API
- RestAssured
- Feign Client
- JUnit 5
- Groovy

## How it works

There are two applications: **the producer** is in charge of receiving a request from an API Rest and make their own request to another endpoint -**the consumer**-, in order to return some information. In the producer application is where we define the files containing what expect from the consumer. After compiling, Spring Cloud Contract lib will generate a stub jar file that might be sent to verify the contract in the consumer. This can be done for example with nexus; the stub jar file can be distributed there so the **consumer** can use it.

## Dependencies used

```
<dependency>
	<groupId>org.springframework.cloud</groupId>
	<artifactId>spring-cloud-starter-contract-stub-runner</artifactId>
	<version>3.1.3</version>
	<scope>test</scope>
</dependency>

<dependency>
	<groupId>org.springframework.cloud</groupId>
	<artifactId>spring-cloud-starter-contract-verifier</artifactId>
	<version>3.1.3</version>
	<scope>test</scope>
</dependency>
```

## Generateing the mock files

```
<plugin>
	<groupId>org.springframework.cloud</groupId>
	<artifactId>spring-cloud-contract-maven-plugin</artifactId>
	<version>3.1.3</version>
	<extensions>true</extensions>
	<configuration>
		<baseClassForTests>
			com.contract.drivenproducer.BaseTestClass
		</baseClassForTests>
	</configuration>
</plugin>
```

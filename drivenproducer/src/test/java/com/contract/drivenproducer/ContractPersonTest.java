package com.contract.drivenproducer;

import io.restassured.module.mockmvc.specification.MockMvcRequestSpecification;
import io.restassured.response.ResponseOptions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static io.restassured.module.mockmvc.RestAssuredMockMvc.given;
import static io.restassured.module.mockmvc.RestAssuredMockMvc.request;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(classes = DrivenproducerApplication.class)
public class ContractPersonTest extends BaseTestClass {

    private static final String BASIC_RESPONSE_11 = "{\"id\":11,\"name\":\"Martin\"}";

    @Test
    public void personTest() {

        MockMvcRequestSpecification request = given();

        var response = given().spec(request)
                .get("/api/v1/person/11");

        assertThat(response.statusCode()).isEqualTo(200);
        assertThat(response.getBody().print()).isEqualTo(BASIC_RESPONSE_11);

    }


}

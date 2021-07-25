package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;


public class PostmanEchoTest {
    @Test
    void shouldSendData() {
        // Given - When - Then
        given()
                .baseUri("https://postman-echo.com")
                .body("some test data")
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("data", equalTo("some value"));
    }
}
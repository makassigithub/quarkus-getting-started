package com.makassi;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
class GreetingResourceTest {
    @Test
    void testBooksEndpoint() {
        given()
                .when().get("/api/books")
                .then()
                .statusCode(200)
                .body(is("Hello books"));
    }

}
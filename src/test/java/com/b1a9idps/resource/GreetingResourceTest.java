package com.b1a9idps.resource;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
class GreetingResourceTest {

    @Test
    void hello() {
        given()
                .when().get("/hello")
                .then()
                .statusCode(200)
                .body(is("Hello RESTEasy"));
    }

    @Test
    void greeting() {
        given()
                .pathParam("name", "uchitate")
                .when().get("/hello/greeting/{name}")
                .then()
                .statusCode(200)
                .body(is("hello uchitate"));
    }

}

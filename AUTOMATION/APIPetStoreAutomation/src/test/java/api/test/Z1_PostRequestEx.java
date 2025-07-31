package api.test;

import static io.restassured.RestAssured.given;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Z1_PostRequestEx {
	private static String requestBody = "{\n" +
            "  \"title\": \"foo\",\n" +
            "  \"body\": \"bar\",\n" +
            "  \"userId\": \"2\" \n}";

    @BeforeTest
    public static void setup() {
        RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
    }

    @Test
    public void postRequest() {
        Response response = given()
                .header("Content-type", "application/json")
                .and()
                .body(requestBody)
                .when()
                .post("/posts")
                .then()
                .extract().response();

        Assert.assertEquals(201, response.statusCode());
        Assert.assertEquals("foo", response.jsonPath().getString("title"));
        Assert.assertEquals("bar", response.jsonPath().getString("body"));
        Assert.assertEquals("2", response.jsonPath().getString("userId"));
        Assert.assertEquals("101", response.jsonPath().getString("id"));
    }
    
}

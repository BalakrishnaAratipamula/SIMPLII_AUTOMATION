package E03_PathAndQueryParameters;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.Map;

import org.testng.annotations.Test;

import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;

public class E03c_HeadersDemo {

	//@Test(priority=1)
	void testHeaders() {
		
		given()
		
		.when()
			.get("https://www.google.com/")
		.then() // most of the times Header info is constant
			.header("Content-Type", "text/html; charset=ISO-8859-1")
			.and() //not necessary
			.header("Content-Encoding", "gzip")
			.header("Server", "gws")
			.log().all();
	}
	
	//@Test(priority=2)
	void getSingleHeader() {
		
		Response res = given()
		
		.when()
			.get("https://www.google.com/");
		
		String headerValue = res.getHeader("Content-Type");
		System.out.println("The value of 'Content-Type' header is   "+headerValue);
	}
	
	@Test(priority=3)
	void getAllHeaders() { //If we want to print headers individually we have use this approach (1)
		
		Response res = given()
		
		.when()
			.get("https://www.google.com/");
		
		Headers headers = res.getHeaders();
		for(Header header: headers) {
			System.out.println(header.getName() +"   -----   "+header.getValue());
		}
		
		//instead of this log().all() is best approach (2)
	}
}

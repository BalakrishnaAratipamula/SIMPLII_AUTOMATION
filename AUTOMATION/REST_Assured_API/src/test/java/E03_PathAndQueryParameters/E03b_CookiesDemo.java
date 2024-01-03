package E03_PathAndQueryParameters;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.Map;

import org.testng.annotations.Test;

import io.restassured.response.Response;

public class E03b_CookiesDemo {
	//@Test(priority=1)
	void getSingleCookie() {
		
		given()
		
		.when()
			.get("https://www.google.com/")
		.then() // Cookies are always not constant in-case if our our execution is fail means our test is pass 
			.cookie("AEC","Ackid1SIZ0UnoAwqHqSgilsqpR7msQjU_dWfkLhnzHzBgKkIqYyGhTWcKRA")
			.log().all();
	}
	
	
	//@Test(priority=2)
	void testCookiesInformation() {
		Response res;
		
		res = given()
		
		.when()
			.get("https://www.google.com/");
		
		String cookie_value = res.getCookie("AEC"); //one of the cookie name
		System.out.println("Value of Cookie 'AEC' ---->   " +cookie_value);
	}
	
	@Test(priority=3)
	void getAllCookies() {
		
		Response res = given()
		
		.when()
			.get("https://www.google.com/");
			
		Map<String, String> all_cookies = res.cookies();
		System.out.println(all_cookies.keySet()); //return all keys
		//System.out.println(all_cookies.entrySet()); //return all keys and values
		for(String cookie_name : all_cookies.keySet()) {
			String cookie_value = res.getCookie(cookie_name);
			System.out.println(cookie_name+ "     ---    " +cookie_value);
		}
		
	}
}

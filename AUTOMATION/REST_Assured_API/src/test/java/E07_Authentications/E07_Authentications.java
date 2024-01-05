package E07_Authentications;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

	/*Authentication - will check whether the user is valid or not (i.e. basically providing user name & password is valid or not)
	Authorization - user is valid but will check the access permissions (N: only valid users can Authorized)

	Types of Authentication:
	Basic
	Digest
	Preemptive
	Bearer token
	auth 2.0
	API key
	
	Some URLs supports some of the above Authentication methods not all
	*/

public class E07_Authentications {

	//Basic
	//@Test(priority=1)
	void testBasicAuthentication() {
		given()
			.auth().basic("postman", "password")  //(userNAme, Pass)
		.when()
			.get("http://postman-echo.com/basic-auth")
		.then()
			.statusCode(200)
			.body("authenticated", equalTo(true))	//Response body
			.log().all();
		
	}
	
	//Digest
	//@Test(priority=2)
	void testDigestAuthentication() {
		given()
			.auth().digest("postman", "password")  //(userNAme, Pass)
		.when()
			.get("http://postman-echo.com/basic-auth")
		.then()
			.statusCode(200)
			.body("authenticated", equalTo(true))	//Response body
			.log().all();
		
	}
	
	//Preemptive
	//@Test(priority=3)
	void testPreemptiveAuthentication() {
		given()
			.auth().preemptive().basic("postman", "password")  //(userNAme, Pass)digest("postman", "password")
		.when()
			.get("http://postman-echo.com/basic-auth")
		.then()
			.statusCode(200)
			.body("authenticated", equalTo(true))	//Response body
			.log().all();
		
	}
	
	//Bearer token
	//@Test(priority=3)
	void testBearerAuthentication() {
		
		String token = "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";	//token generated from GitHub - Expires in 30days	//Developer will give us
		given()
			.header("Authorization", "Bearer "+token)	//Bcz it requires authorization (paste below URL in browser it will 'Requires authentication')
		.when()
			.get("https://api.github.com/user/repos")
		.then()
			.statusCode(200)
			.log().all();
		
	}
	
	//OAuth1	--- test URL not available to execute
	//@Test(priority=4)
	void testOAuth1Authentication() {
		
		given()
			.auth().oauth("consumerKey", "cunsumerSecrat", "accessToken", "tokenSecrate") //OAuth 1 requires more parameters - get from developer
		.when()
			.get("url")
		.then()
			.statusCode(200)
			.log().all();
		
	}
	
	//OAuth2
	//@Test(priority=5)
	void testOAuth2Authentication() {
		
		String token = "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";	//token generated from GitHub - Expires in 30days	//Developer will give us 
		
		given()
			.auth().oauth2(token) //OAuth 2 requires less parameters - get from developer
		.when()
			.get("https://api.github.com/user/repos")
		.then()
			.statusCode(200)
			.log().all();
		
	}
	
	//API Key
	@Test(priority=5)
	void testAPIKeyAuthentication() {
		
		//Approach 1 - standard using approach
		/*given()
			//.pathParam("mypath", DEFAULT_AUTH)
			.queryParam("appid", "48a1c2c30bc6a2815c5e60c3ef6f1024") //(Key Name, API Key) key name will ask at the time of generating API Key in https://home.openweathermap.org/api_keys
			// to generate API Key https://home.openweathermap.org --> 16 Day / Daily whether forecast --> Built-in API request by city name --> Singn in/ create acc --> Generate API Key/token
			
			.when()
//			.get("https://api.openweathermap.org/data/2.5/weather?q={city name}&appid={API key}")  //get this URL from 16 Day / Daily whether forecast --> Built-in API request by city name --> sample URL will available in this page
			.get("https://api.openweathermap.org/data/2.5/weather?q=Delhi&")	//modified above URL
		.then()
			.statusCode(200)
			.log().all(); */
		
		
		//Approach 2 - standard using approach
		given()
			.pathParam("mypath", "data/2.5/weather")
			.queryParam("q", "Delhi")
			.queryParam("appid", "48a1c2c30bc6a2815c5e60c3ef6f1024") //(Key Name, API Key) - key name will ask at the time of generating API Key in https://home.openweathermap.org/api_keys
			// to generate API Key https://home.openweathermap.org --> 16 Day / Daily whether forecast --> Built-in API request by city name --> Singn in/ create acc --> Generate API Key/token
		
		.when()
//			.get("https://api.openweathermap.org/data/2.5/weather?q={city name}&appid={API key}")  //get this URL from 16 Day / Daily whether forecast --> Built-in API request by city name --> sample URL will available in this page
			.get("https://api.openweathermap.org/{mypath}")	//get this URL from 16 Day / Daily whether forecast --> Built-in API request by city name --> sample URL will available in this page
		.then()
			.statusCode(200)
			.log().all();
	
	}
	
}

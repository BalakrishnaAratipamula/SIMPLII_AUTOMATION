package E03_PathAndQueryParameters;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class E03d_LoggingTypes {

	@Test(priority=1)
	void testHeaders() {
		
		given()
		
		.when()
			.get("https://reqres.in/api/users?page=2")
		.then() 
			//.log().all() //print everything from the response
			//.log().body() //print only body from the response
			//.log().cookies() //print only cookies from the response
			.log().headers(); //print only headers from the response
			
	}
	
}

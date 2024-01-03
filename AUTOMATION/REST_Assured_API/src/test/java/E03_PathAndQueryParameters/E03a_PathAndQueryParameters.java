package E03_PathAndQueryParameters;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

public class E03a_PathAndQueryParameters {
	
	// https://reqres.in/api/users?page=2&id=5
		// https://reqres.in - Request
		// api/users	- path
		// page=2&id=5	- Query
	@Test(priority=1)
	void testPathAndQueryParameters() {
		
		given()
			.pathParam("myPath1", "users")
			.queryParam("page", "2")
			.queryParam("id", "5")
		.when()
			.get("https://reqres.in/api/{myPath1}")
		.then()
			.statusCode(200)
			.log().all();
	}
}

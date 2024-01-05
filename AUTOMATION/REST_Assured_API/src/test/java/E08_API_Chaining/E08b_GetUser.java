package E08_API_Chaining;

import static io.restassured.RestAssured.given;

import org.testng.ITestContext;
import org.testng.annotations.Test;

public class E08b_GetUser {

	@Test
	void getUser(ITestContext context) {	//ITestContext - to get and use id value in all classes
		
		//Approach 1 - get variable in <test> level
		//int id = (int) context.getAttribute("user_id");	//this comes from createUser()	//casting int due to return type is obj type so we are converting obj type to int type
		//Approach 2 - get variable in <suite> level
		int id = (int) context.getSuite().getAttribute("user_id");	//this comes from createUser()	//casting int due to return type is obj type so we are converting obj type to int type
		
		String bearerToken = "9295a53d63fdd668f059d691f7b8334354ecd3e6c12216c547a6c116dcad9091";	//generate token in 'https://gorest.co.in/' --> get your access token

		given()
			.header("Authorization", "Bearer "+bearerToken)
			.pathParam("id", id)			//when not passing this content as part of the Header that time we specify - application/json
		.when()
			.get("https://gorest.co.in/public/v2/users/{id}")
		.then()
			.statusCode(200)
			.log().all();
			
		
		
	}
}

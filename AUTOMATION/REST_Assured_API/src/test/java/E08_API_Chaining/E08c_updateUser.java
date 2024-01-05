package E08_API_Chaining;

import static io.restassured.RestAssured.given;

import org.json.JSONObject;
import org.testng.ITestContext;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

public class E08c_updateUser {
	
	@Test
	void createUser(ITestContext context) {		//ITestContext - to get and use id value in all classes
		
		Faker faker = new Faker();
		
		JSONObject jsonobj = new JSONObject();
		jsonobj.put("name", faker.name().fullName());
		jsonobj.put("gender", "male");	//Error msg - For input string: "[null, null]" ----> ("Gender", "female") - Capital letter will not consider
		jsonobj.put("email", faker.internet().emailAddress());
		jsonobj.put("status", "inactive");
		
		String bearerToken = "9295a53d63fdd668f059d691f7b8334354ecd3e6c12216c547a6c116dcad9091";	//generate token in 'https://gorest.co.in/' --> get your access token

		//Approach 1 - get variable in <test> level
		//int id = (int) context.getAttribute("user_id");	//this comes from createUser()	//casting int due to return type is obj type so we are converting obj type to int type
		//Approach 2 - get variable in <suite> level
		int id = (int) context.getSuite().getAttribute("user_id");	//this comes from createUser()	//casting int due to return type is obj type so we are converting obj type to int type
				
		given()
			.header("Authorization", "Bearer "+bearerToken)
			.contentType("application/json")	//when passing this content type as part of the Header that time we specify - application.json  
			.pathParam("id", id)
			.body(jsonobj.toString())			//when not passing this content as part of the Header that time we specify - application/json
		.when()
			.put("https://gorest.co.in/public/v2/users/{id}")	// passing 'pathParam' 
		.then()
			.statusCode(200)
			.log().all();
		
	}
}

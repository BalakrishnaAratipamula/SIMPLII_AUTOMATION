package E08_API_Chaining;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;

import org.json.JSONObject;
import org.testng.ITestContext;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

public class E08a_CreateUser {
	
	@Test
	void createUser(ITestContext context) {	//ITestContext - to get and use id value in all classes
		
		Faker faker = new Faker();
		
		JSONObject jsonobj = new JSONObject();
		jsonobj.put("name", faker.name().fullName());
		jsonobj.put("gender", "female");	//Error msg - For input string: "[null, null]" ----> ("Gender", "female") - Capital letter will not consider
		jsonobj.put("email", faker.internet().emailAddress());
		jsonobj.put("status", "active");
		
		String bearerToken = "9295a53d63fdd668f059d691f7b8334354ecd3e6c12216c547a6c116dcad9091";	//generate token in 'https://gorest.co.in/' --> get your access token

		int id =	//int bcz here we are returning the id here id is int type
		given()
			.header("Authorization", "Bearer "+bearerToken)
			.contentType("application/json")	//when passing this content type as part of the Header that time we specify - application.json  
			.body(jsonobj.toString())			//when not passing this content as part of the Header that time we specify - application/json
		.when()
			.post("https://gorest.co.in/public/v2/users")	// https://gorest.co.in/ --> URL will get under resources 
			.jsonPath().getInt("id");
		
		System.out.println("Generated ID is :     "+ id);
			
		//Approach 1 - //this will return id value to all classes	//make availability in <test> //this case execute testng.xml
		//context.setAttribute("user_id", id);
		//Approach 2 - //this will return id value to all classes	//make availability in <suite> //this case execute testng2.xml
		context.getSuite().setAttribute("user_id", id);	
		
	}
}

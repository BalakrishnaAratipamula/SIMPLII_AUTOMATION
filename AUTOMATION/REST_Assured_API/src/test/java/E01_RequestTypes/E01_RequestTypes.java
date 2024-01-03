package E01_RequestTypes;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* given() - all pre-requisites - like content type, set cookies, add auth, add param, set headers info, etc....
 * when() - Get - to get the data
 *			Post - to insert the data  
 *			Put - to update the data 
 *			Delete - to delete the data
 * then() - all Validations - like status code, headers, cookies, response body, response......
 * */
public class E01_RequestTypes {	// https://reqres.in/
	
	int id;	//to capture id from response
	
	//@Test(priority=1)
	void getListOfUsers() {	// get
		
		given()
			
		.when()
			.get("https://reqres.in/api/users?page=2")
		.then()	
			.statusCode(200)
			.body("page", equalTo(2))
			.log().all();
			
	}
	
	@Test(priority=2) //create user
	void createUser() {	//create - post
			
		String[] strArr = new String[] {"C", "C++"};
		
		HashMap hm = new HashMap();
		hm.put("id", "1");
		hm.put("name", "Bala");
		hm.put("location", "India");
		hm.put("phone", "123456789");
		hm.put("courses", strArr);
		
		given()
			.contentType("application/json")
			.body(hm)
		.when()
			.post("https://reqres.in/api/users")
		.then()	
			.statusCode(201)
			.log().all();
				
		}
	
	//@Test(priority=2) //create user and return id from response
	void createUserAndReturnId() {	//create - post
			
		HashMap hm = new HashMap();
		hm.put("name", "Bala");
		hm.put("job", "Tester");
		
		id = given()
			.contentType("application/json")
			.body(hm)
		.when()
			.post("https://reqres.in/api/users")
			.jsonPath().getInt("id"); //getString()  to get id from response 
//		.then()	
//			.statusCode(201)
//			.log().all();
				
		}
		
	//@Test(priority=3, dependsOnMethods= {"createUserAndReturnId"})
	void updateUser() {	//update - put
			
		HashMap hm = new HashMap();
		hm.put("name", "Bala222");
		hm.put("job", "Tester222");
		
		given()
			.contentType("application/json")
			.body(hm)
		.when()
			.put("https://reqres.in/api/users/"+id)
			
		.then()	
			.statusCode(200)
			.log().all();
				
		}
	
	//@Test(priority=4)
	void deleteUser() {	// delete
		
		given()
			
		.when()
			.delete("https://reqres.in/api/users/"+id)
		.then()	
			.statusCode(204)
			.log().all();
			
	}
	
}

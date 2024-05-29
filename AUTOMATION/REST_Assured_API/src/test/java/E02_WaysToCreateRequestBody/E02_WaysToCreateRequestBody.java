package E02_WaysToCreateRequestBody;

import org.json.JSONObject;
import org.json.JSONTokener;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* Different ways to create Post Request Body
 * 1) Using HashMap
 * 2) Using org.JSON
 * 3) Using POJO Class
 * 4) Using External JSON File data
 * */
public class E02_WaysToCreateRequestBody { 

	//--------------------- Create Post request body Using HashMap
	//@Test(priority=1)
	void testPostUsingHashMap() {
		 
		 HashMap data = new HashMap();
		 
		 data.put("name", "Simon");
		 data.put("location", "Canada");
		 data.put("phone", "987654321");
		 
		 String[] courseArray = {"C","C++"};
		 data.put("courses", courseArray);
		 
		 given()
		 	.contentType("application/json")
		 	.body(data)
		 .when()
		 	.post("http://localhost:3000/students")		/////// F:\JSON Files
		 .then()
		 	.statusCode(201) //some APIs it would be 200
		 	.body("name", equalTo("Simon"))
		 	.body("phone", equalTo("987654321"))
		 	.body("courses[0]", equalTo("C"))
		 	.body("courses[1]", equalTo("C++"))
		 	.header("Content-Type", "application/json; charset=utf-8")
		 	
		 	.log().all();
	 }
	
	
	//------------------------ Create Post request body Using org.json
		//@Test(priority=2)
		void testPostUsingOrgJSON() {
			 
			 JSONObject data = new JSONObject();
			 
			 data.put("name", "Ramesh");
			 data.put("location", "Finland");
			 data.put("phone", "98761234");
			 
			 String[] courseArray = {"java","C++"};
			 data.put("courses", courseArray);
			 
			 given()
			 	.contentType("application/json")
			 	.body(data.toString())	//if we don't use toString() it will consider by default HashMap data
			 .when()
			 	.post("http://localhost:3000/students")
			 .then()
			 	.statusCode(201) //some APIs it would be 200
			 	.body("name", equalTo("Ramesh"))
			 	.body("phone", equalTo("98761234"))
			 	.body("courses[0]", equalTo("java"))
			 	.body("courses[1]", equalTo("C++"))
			 	.header("Content-Type", "application/json; charset=utf-8")
			 	
			 	.log().all();
		 }
		
		//------------------------ Create Post request body Using POJO Class
		//@Test(priority=3)
		void testPostUsingPOJO() {
					 
			POJO_PostRequest data = new POJO_PostRequest(); 
					 
			data.setName("Varsha");
		    data.setLocation("China");
		    data.setPhone("111111234");
					 
			String[] courseArray = {"Ruby","Python"};
			data.setCourses(courseArray);
					 
			given()
				.contentType("application/json")
				.body(data)	
			.when()
				.post("http://localhost:3000/students")
			.then()
				.statusCode(201) //some APIs it would be 200
				.body("name", equalTo("Varsha"))
				.body("phone", equalTo("111111234"))
				.body("courses[0]", equalTo("Ruby"))
				.body("courses[1]", equalTo("Python"))
				.header("Content-Type", "application/json; charset=utf-8")
					 	
				.log().all();
		}
		
		//------------------------ Create Post request body Using External JSON File
				@Test(priority=4)
				void testPostUsingExternalJSONFile() throws FileNotFoundException, IOException {
							 
					File f = new File(".\\body.json");	//project level JSON file path
					FileReader fr = new FileReader(f);
					JSONTokener jt = new JSONTokener(fr);
					JSONObject data = new JSONObject(jt); 
							 
					given()
						.contentType("application/json")
						.body(data.toString()) //Bcz data is available in the JSON Object format (JSONObject data = new JSONObject(jt);)	
					.when()
						.post("http://localhost:3000/students")
					.then()
						.statusCode(201) //some APIs it would be 200
						.body("name", equalTo("Rojalin"))
						.body("phone", equalTo("343434343"))
						.body("courses[0]", equalTo("C#"))
						.body("courses[1]", equalTo("javaScript"))
						.header("Content-Type", "application/json; charset=utf-8")
							 	
						.log().all();
				}
				
	//@Test(priority=5)
	void testDelete() {
		
		given()
			
		.when()
			.delete("http://localhost:3000/students/_S7--NK")	//id
		.then()
			.log().all();
			
	}
		

}









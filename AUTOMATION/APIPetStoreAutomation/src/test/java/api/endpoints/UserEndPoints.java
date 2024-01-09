package api.endpoints;

import static io.restassured.RestAssured.given;

import api.payload.User;
import io.restassured.http.ContentType;
import io.restassured.response.Response;


public class UserEndPoints {

	//Create UserEndPoins.java ---> This class contain CRUD methods (is also called CRUD operations) implementations
	//CRUD operations - perform Create, Read, Update, Delete operations on user (one of the module) API
	
	//Create User
	public static Response createUser(User payload){	//need to pass payload (nothing but request body - it has to pass with req - check requirements specified in url) //api.payload/User
		
		Response response=given()	//Note: "-H" represents header
			.contentType(ContentType.JSON)	//specified in Requirements
			.accept(ContentType.JSON)	//specified in Requirements
			.body(payload) 	//body implementation was in payload class
		.when()
			.post(Routes.post_url);	//Routes class
		
		return response;
	}
	
	//Get User
	public static Response readUser(String userName){	//need to pass userName bcz based upon userName only we need to get data
		
		Response response=
		given()
			.pathParam("username", userName)
		.when()
			.get(Routes.get_url);	//Routes class //get_url - base_url+"/user/{username}"
		
		return response;
	}
	
	//Update User
	public static Response updateUser(String userName, User payload){	//need to pass userName, payload bcz based upon userName only we need to update data
		
		Response response=
		given()
			.contentType(ContentType.JSON)	//specified in Requirements
			.accept(ContentType.JSON)	//specified in Requirements
			.pathParam("username", userName)
			.body(payload) 	//body implementation was in payload class
		.when()
			.put(Routes.update_url);	//Routes class
		
		return response;
	}
	
	//Delete User
	public static Response deleteUser(String userName){	//need to pass payload (nothing but request body - it has to pass with req - check requirements specified in url)
		
		Response response=
		given()
			.pathParam("username", userName)
		.when()
			.delete(Routes.delete_url);	//Routes class
		
		return response;
	}
	
}

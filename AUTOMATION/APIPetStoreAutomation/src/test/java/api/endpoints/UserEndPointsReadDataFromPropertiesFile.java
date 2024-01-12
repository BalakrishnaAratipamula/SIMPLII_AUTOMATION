package api.endpoints;

import static io.restassured.RestAssured.given;

import java.util.ResourceBundle;

import api.payload.User;
import io.restassured.http.ContentType;
import io.restassured.response.Response;


public class UserEndPointsReadDataFromPropertiesFile {	/////properties file path  --- src\test\resources\routes.properties

	//Create UserEndPoins.java ---> This class contain CRUD methods (is also called CRUD operations) implementations
	//CRUD operations - perform Create, Read, Update, Delete operations on user (one of the module) API
	
	//to Load / Read / Get data from Properties file
	public static ResourceBundle getUrlfromPropertiesFile() {		//Static is due to we can access this method from all other methods in this class
		
		ResourceBundle routes2 = ResourceBundle.getBundle("routes"); /////properties file name  --- src\test\resources\routes.properties
		
		return routes2;
	}
	
	
	//Create User
	public static Response createUser(User payload){	//need to pass payload (nothing but request body - it has to pass with req - check requirements specified in url) //api.payload/User
		
		String post_url = getUrlfromPropertiesFile().getString("post_url");	//key - post_url - from properties file //properties file related
				
		Response response=given()	//Note: "-H" represents header
			.contentType(ContentType.JSON)	//specified in Requirements
			.accept(ContentType.JSON)	//specified in Requirements
			.body(payload) 	//body implementation was in payload class
		.when()
			.post(post_url);	//Routes class
		
		return response;
	}
	
	//Get User
	public static Response readUser(String userName){	//need to pass userName bcz based upon userName only we need to get data
		
		String get_url = getUrlfromPropertiesFile().getString("get_url");	//key - post_url - from properties file //properties file related
		
		Response response=
		given()
			.pathParam("username", userName)
		.when()
			.get(get_url);	//Routes class //get_url - base_url+"/user/{username}"
		
		return response;
	}
	
	//Update User
	public static Response updateUser(String userName, User payload){	//need to pass userName, payload bcz based upon userName only we need to update data
		
		String update_url = getUrlfromPropertiesFile().getString("update_url");	//key - post_url - from properties file //properties file related
		
		Response response=
		given()
			.contentType(ContentType.JSON)	//specified in Requirements
			.accept(ContentType.JSON)	//specified in Requirements
			.pathParam("username", userName)
			.body(payload) 	//body implementation was in payload class
		.when()
			.put(update_url);	//Routes class
		
		return response;
	}
	
	//Delete User
	public static Response deleteUser(String userName){	//need to pass payload (nothing but request body - it has to pass with req - check requirements specified in url)
		
		String delete_url = getUrlfromPropertiesFile().getString("delete_url");	//key - post_url - from properties file //properties file related
		
		Response response=
		given()
			.pathParam("username", userName)
		.when()
			.delete(delete_url);	//Routes class
		
		return response;
	}
	
}

package api.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import api.payload.User;
import api.utilities.DataProviders;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import api.endpoints.UserEndPoints;
import api.payload.User;
import io.restassured.response.Response;


public class DDTests {
	
	Faker faker;
	User userPayload;
	
	//SetUp		//this is only for 'Update data'
	//@BeforeClass
	public void setup()	{
		faker=new Faker();
		userPayload=new User();
			
		userPayload.setId(faker.idNumber().hashCode());
		userPayload.setUsername(faker.name().username());
		userPayload.setFirstName(faker.name().firstName());
		userPayload.setLastName(faker.name().lastName());
		userPayload.setEmail(faker.internet().safeEmailAddress());
		userPayload.setPassword(faker.internet().password(5, 10));
		userPayload.setPhone(faker.phoneNumber().cellPhone());
			
			
	}
	
	//Create User
	@Test(priority=1, dataProvider="Data", dataProviderClass=DataProviders.class)	//(priority, 'Data' specified as Dataprovider name in DataProviders class, DataProvider class name) 
	public void testPostUser(String UserID, String UserName, String FirstName, 
			String LastName, String Email, String Pwd, String Ph){	// excel sheet order	//in POJO class 'Ph' by default taken as String  not int
		
		userPayload = new User();	//POJO class
		
		userPayload.setId(Integer.parseInt(UserID));
		userPayload.setUsername(UserName);
		userPayload.setFirstName(FirstName);
		userPayload.setLastName(LastName);
		userPayload.setEmail(Email);
		userPayload.setPassword(Pwd);
		userPayload.setPhone(Ph);
		
		
		Response response = UserEndPoints.createUser(userPayload);
		
		Assert.assertEquals(response.getStatusCode(),200);
		
	}
	
	
	//Get User by userName - as given in requirements
	@Test(priority=2, dataProvider="UserNames", dataProviderClass=DataProviders.class)  //(priority, 'UserNames' specified as Dataprovider name in DataProviders class, DataProvider class name)
	public void testGetUser(String UserName) {
		
		Response response = UserEndPoints.readUser(UserName);    
		response.then().log().all();												   
		
		Assert.assertEquals(response.getStatusCode(), 200);
		
	}
	
	//Update User by userName - as given in requirements
	//@Test(priority=3, dataProvider="Data", dataProviderClass=DataProviders.class)  //(priority, 'UserNames' specified as Dataprovider name in DataProviders class, DataProvider class name)
	public void testUpdateUser(String UserName) {
		
//		faker = new Faker();
//		userPayload = new User();

		//Update user using payload
//		userPayload.setId(Integer.parseInt(UserID));
//		userPayload.setUsername(UserName);
		userPayload.setFirstName(faker.name().firstName());	//faker.name().firstName()
		userPayload.setLastName(faker.name().lastName());
		userPayload.setEmail(faker.internet().safeEmailAddress());
//		userPayload.setPassword(Pwd);
//		userPayload.setPhone(Ph);
		
		//Validation 1 - checking data before update
		Response response = UserEndPoints.updateUser(UserName, userPayload);
		System.out.println(UserName);
		Response responseBeforeUpdate = UserEndPoints.readUser(UserName); //updated (latest) details by userName
		responseBeforeUpdate.then().log().all();
		
		Assert.assertEquals(response.getStatusCode(), 200);
		
		//Validation 2 - checking data after update
		Response responseAfterUpdate = UserEndPoints.readUser(UserName); //updated (latest) details by userName

		Assert.assertEquals(responseAfterUpdate.getStatusCode(), 200);
				
	}
	
	
	//Delete User by userName - as given in requirements
	@Test(priority=4, dataProvider="UserNames", dataProviderClass=DataProviders.class)
	public void testDeleteUserByName(String UserName) {	  //(priority, 'UserNames' specified as Dataprovider name in DataProviders class, DataProvider class name)
		
		Response response = UserEndPoints.deleteUser(UserName);
		
		Assert.assertEquals(response.getStatusCode(), 200);
		
		
	}
}

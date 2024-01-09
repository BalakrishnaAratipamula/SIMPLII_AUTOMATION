package api.test;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import api.endpoints.UserEndPoints;
import api.payload.User;
import io.restassured.response.Response;


public class UserTests {

	Faker faker;
	User userPayload;
	
	@BeforeClass
	public void setup()
	{
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
	
	//Create user
	@Test(priority=1)
	public void testPostUser(){
		Response response=UserEndPoints.createUser(userPayload);
		response.then().log().all();
		
		Assert.assertEquals(response.getStatusCode(),200);
		
			
	}
	
	//Get User by userName
	@Test(priority=2)
	public void getUserByName(){
		
		Response response = UserEndPoints.readUser(this.userPayload.getUsername());    //'userName' will get from 'userPayload' obj that is avl in current (this) class based upon 'userName' we have to get data as requirement specified
		response.then().log().all();												   // this - can be used to call (get) the current class obj
		
		Assert.assertEquals(response.getStatusCode(), 200);
		
	}
	
	//Update User by userName
	@Test(priority=3)
	public void testUpadateUserByName() {
		
		//Update user using payload
		userPayload.setFirstName(faker.name().firstName());
		userPayload.setLastName(faker.name().lastName());
		userPayload.setEmail(faker.internet().safeEmailAddress());
		
		//Validation 1 - checking data before update
		Response response = UserEndPoints.updateUser(this.userPayload.getUsername(), userPayload); //parameters - (getting userName - bcz we have to update user as per username as requirements, update (latest) user details)
		response.then().log().body();
		
		Assert.assertEquals(response.getStatusCode(), 200);
		
		//Validation 2 - checking data after update
		Response responseAfterUpdate = UserEndPoints.readUser(this.userPayload.getUsername()); //updated (latest) userName 

		Assert.assertEquals(responseAfterUpdate.getStatusCode(), 200);
		
	}
	
	@Test(priority=4)
	public void testDeleteUserByName(){
		
		Response response = UserEndPoints.deleteUser(this.userPayload.getUsername());
		
		Assert.assertEquals(response.getStatusCode(), 200);
		
	}
	
}

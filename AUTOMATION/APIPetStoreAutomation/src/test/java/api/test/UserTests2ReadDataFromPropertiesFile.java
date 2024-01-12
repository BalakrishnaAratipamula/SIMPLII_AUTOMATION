package api.test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.github.javafaker.Faker;

import api.endpoints.UserEndPointsReadDataFromPropertiesFile;
import api.payload.User;
import io.restassured.response.Response;


public class UserTests2ReadDataFromPropertiesFile {

	Faker faker;
	User userPayload;
	
	public Logger logger;
	public ExtentReports extentreports = new ExtentReports();
	
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
		
		//logs
		logger = LogManager.getLogger(this.getClass());    //this.getClass() - returns current class 
		
		ExtentSparkReporter spartreporter = new ExtentSparkReporter("report.html");   //////check report in this path
		extentreports.attachReporter(spartreporter);
	}
	
	//Create user
	@Test(priority=1)
	public void testPostUser(){
		ExtentTest test1 = extentreports.createTest("testPostUser()"); 
		logger.info("**************Creating the User****************");
		
		Response response=UserEndPointsReadDataFromPropertiesFile.createUser(userPayload);
		response.then().log().body();	//.all() unnecessary stuff will print
		
		Assert.assertEquals(response.getStatusCode(),200);
		
		logger.info("**************User is Created****************");
		test1.pass("**************User is Created****************");   //////check report in report.html path
		
			
	}
	
	//Get User by userName
	@Test(priority=2)
	public void getUserByName(){
		ExtentTest test2 = extentreports.createTest("getUserByName()"); 
		logger.info("**************Reading user info****************");
		Response response = UserEndPointsReadDataFromPropertiesFile.readUser(this.userPayload.getUsername());    //'userName' will get from 'userPayload' obj that is avl in current (this) class based upon 'userName' we have to get data as requirement specified
		response.then().log().all();												   // this - can be used to call (get) the current class obj
		
		Assert.assertEquals(response.getStatusCode(), 200);
		logger.info("**************User info displayed****************");
		
		test2.pass("**************User info displayed****************");
		
	}
	
	//Update User by userName
	@Test(priority=3)
	public void testUpadateUserByName() {
		ExtentTest test3 = extentreports.createTest("testUpadateUserByName()"); 
		//Update user using payload
		logger.info("**************Updating user info****************");
		
		userPayload.setFirstName(faker.name().firstName());
		userPayload.setLastName(faker.name().lastName());
		userPayload.setEmail(faker.internet().safeEmailAddress());
		
		//Validation 1 - checking data before update
		Response response = UserEndPointsReadDataFromPropertiesFile.updateUser(this.userPayload.getUsername(), userPayload); //parameters - (getting userName - bcz we have to update user as per username as requirements, update (latest) user details)
		Response responseBeforeUpdate = UserEndPointsReadDataFromPropertiesFile.readUser(this.userPayload.getUsername()); //updated (latest) details by userName
		responseBeforeUpdate.then().log().body();
		
		Assert.assertEquals(response.getStatusCode(), 200);
		logger.info("**************User info Updated****************");
		
		//Validation 2 - checking data after update
		Response responseAfterUpdate = UserEndPointsReadDataFromPropertiesFile.readUser(this.userPayload.getUsername()); //updated (latest) details by userName 
		
		Assert.assertEquals(responseAfterUpdate.getStatusCode(), 200);
		
		logger.info("**************Validated Updated info****************");
		test3.pass("**************Validated Updated info****************");
		
	}
	
	@Test(priority=4)
	public void testDeleteUserByName(){
		ExtentTest test4 = extentreports.createTest("testDeleteUserByName()"); 
		logger.info("**************User info deleting****************");
		Response response = UserEndPointsReadDataFromPropertiesFile.deleteUser(this.userPayload.getUsername());
		
		Assert.assertEquals(response.getStatusCode(), 200);
		logger.info("**************User info deleted****************");
		test4.pass("**************User info deleted****************");
		
		extentreports.flush();	
	}
	
}

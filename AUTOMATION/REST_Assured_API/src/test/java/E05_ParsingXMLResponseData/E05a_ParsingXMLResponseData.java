package E05_ParsingXMLResponseData;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.io.File;
import java.util.List;

import org.testng.annotations.Test;

import io.restassured.path.xml.XmlPath;
import io.restassured.response.Response;
import junit.framework.Assert;

public class E05a_ParsingXMLResponseData {
	
	// http://restapi.adequateshop.com/api/Traveler?page=1
	// http://restapi.adequateshop.com/swagger/ui/index    // if not work try this: https://petstore3.swagger.io/ // https://petstore.swagger.io/
	
	//toString() - Convert Data into String format
	//asSString - Convert entire Response into String format
			
	boolean status = false;
	
	//Approach1
	//@Test
	void testXmlResponse_Approach1() {
		
		given()
			
		.when()
			.get("http://restapi.adequateshop.com/api/Traveler?page=1")
		.then()
			.statusCode(200)
			.header("Content-Type", "application/xml; charset=utf-8")
			.body("TravelerinformationResponse.page", equalTo("1"))	//xml path
			.body("TravelerinformationResponse.travelers.Travelerinformation[2].name", equalTo("vano"));	//index will start from '0'
//			.log().all();
	}
	
	//Approach2
	//@Test
	void testXmlResponse_Approach2() {
		
		Response res =
		given()
		
		.when()
			.get("http://restapi.adequateshop.com/api/Traveler?page=1");
		
		Assert.assertEquals(res.getStatusCode(), 200);
		Assert.assertEquals(res.header("Content-Type"),"application/xml; charset=utf-8");
		
		String  idValue = res.xmlPath().get("TravelerinformationResponse.travelers.Travelerinformation[2].id").toString();	//Return type is String
		Assert.assertEquals(idValue, "11135");	//Return type is String
//		Assert.assertEquals(idValue, String.valueOf(11135)); //Return type is String
		///// Assert.assertEquals(idValue, 11135);	//Fails due to 	//Return type is Int
		
		String  emailValue = res.xmlPath().get("TravelerinformationResponse.travelers.Travelerinformation[1].email").toString();	//Return type is String
		Assert.assertEquals(emailValue, "qweqw@mail.ru");	//Return type is String
	}
	
	@Test
	void testXmlResponse_Approach3() {
		
		Response res =
		given()
		
		.when()
			.get("http://restapi.adequateshop.com/api/Traveler?page=1");
		
		XmlPath xmlObj = new XmlPath(res.asString());	//toString() - Convert Data into String format //asSString - Convert entire Response into String format
		List<String>  travellersInfo = xmlObj.getList("TravelerinformationResponse.travelers.Travelerinformation");
		
		Assert.assertEquals(travellersInfo.size(), 10);
		
		//Verify traveller name present in the response
		List<String> travellerNames = xmlObj.getList("TravelerinformationResponse.travelers.Travelerinformation.name");
		for(String travellerName: travellerNames) {
			if(travellerName.equals("Developer12345")) {
				status = true;
				break;
			}
		}
		Assert.assertEquals(status, true);
		
	}
	

}

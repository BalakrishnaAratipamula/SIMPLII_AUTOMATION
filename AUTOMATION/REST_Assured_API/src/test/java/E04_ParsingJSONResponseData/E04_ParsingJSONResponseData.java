package E04_ParsingJSONResponseData;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.json.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import junit.framework.Assert;

import org.testng.annotations.Test;

public class E04_ParsingJSONResponseData {
	
	// @Test
	void parsingJsonResponseApproach1() {
		
		//Approach 1
		given()
			.contentType(ContentType.JSON)
		.when()
			.get("http://localhost:3000/store")
		.then()
			.statusCode(200)
		.body("book[3].title", equalTo("Danny Of The Century")) // https://jsonpathfinder.com/ - to get path from JSON code
		.body("book[5].price", equalTo(130.5F)) //F - FLot value // https://jsonpathfinder.com/ - to get path from JSON code
		.body("book[4].phone", equalTo("104356789")); //F - FLot value // https://jsonpathfinder.com/ - to get path from JSON code
			
	}
	
	//@Test
	void parsingJsonResponseApproach2() {
		
		//Approach 2	//most following approach
		Response res = given()
			.contentType(ContentType.JSON)
		.when()
			.get("http://localhost:3000/store");
		
		Assert.assertEquals(res.getStatusCode(), 200);	
		Assert.assertEquals(res.header("Content-Type"), "application/json; charset=utf-8");
		
		String bookTitle = res.jsonPath().get("book[3].title").toString();
		Assert.assertEquals(bookTitle, "Danny Of The Century");
	}
	
	//print all 'title' from response &&&&&&& validate 'title' value &&&&&&& find total price
	@Test
	void testJsonResponseBodyData() {
		
		boolean status = false;
		
		Response res = given()
			.contentType(ContentType.JSON)
		.when()
			.get("http://localhost:3000/store");	//F:\JSON Files
		
		// print all 'title' from response &&&&&&& validate 'title' value 
		JSONObject jo = new JSONObject(res.asString());	//entire 'res' content is convert into JSON Object & res.toString() means converting JSON Object into String type
		//In case 'res.asString()' we will get error msg as - org.json.JSONException - A JSONObject text must begin with '{' at 1 [character 2 line 1]
		for(int i=0; i<jo.getJSONArray("book").length(); i++) {
			String allTitleFields = jo.getJSONArray("book").getJSONObject(i).get("title").toString(); //JSONArray inside JSONObject(elements) are there
			//System.out.println(allTitleFields); //print all 'title' from response
			if(allTitleFields.equals("Giving Of The Century")) { //validate 'title' value
				status = true;
				System.out.println("------------Title present");
				break;
			}
		}
		Assert.assertEquals(status, true);
		
		
		// find total price
		double totalPrice = 0;
		for(int i=0; i<jo.getJSONArray("book").length(); i++) {
			 String price = jo.getJSONArray("book").getJSONObject(i).get("price").toString(); //JSONArray inside JSONObject(elements) are there
			 totalPrice = totalPrice+Double.parseDouble(price);	//Double.parseDouble(price) - converting String to Double
		}
		System.out.println("Total price:   "+totalPrice);
		Assert.assertEquals(totalPrice, 812.8);
		
	}
		
	
	
	
	
	////@Test
	void Dummy() {
		
		//Approach 1
		given()
			.contentType("ContentType.JSON")
		.when()
			.get("http://localhost:3000/store")
		.then()
			.log().all();
	}
}
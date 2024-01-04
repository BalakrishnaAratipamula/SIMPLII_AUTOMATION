package E06_JSONandXMLSchemaValidation;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.matcher.RestAssuredMatchers;
import io.restassured.module.jsv.JsonSchemaValidator;

public class E06b_XMLSchemaValidation {
	
	// postman supports only JSON Schema Validation but not supports XML Schema validation
	// SoapUI supports XML Schema validation
	
	// JSON Response in (.json) format - JSON Schema in (.json) format
	// XML Response in (.xml) format - XML Schema in (.xsd) format
	
	// to convert XML to xsd - https://www.convertsimple.com/convert-xml-to-xsd-xml-schema/ - or use some other
	
	@Test
	void xmlSchemaValidation() {
		// pre-requisites - convert JSON to JSON Schema - https://jsonformatter.org/json-to-jsonschema - sore in any folder (F:\JSON Files\JsonSchema.json)
		// pre-requisites run - jsonForSchema.json (F:\JSON Files\jsonForSchema.json) through cmd
		// maintain (F:\JSON Files\JsonSchema.json) file in Resources folder
		
		given()
		
		.when()
			.get("http://restapi.adequateshop.com/api/Traveler")	//F:\JSON Files\jsonForSchema.json
		.then()
			.assertThat().body(RestAssuredMatchers.matchesXsdInClasspath("traveler.xsd"));	//JsonSchema file name
	}
}

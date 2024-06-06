package E06_JSONandXMLSchemaValidation;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

import io.restassured.module.jsv.JsonSchemaValidator;

public class E06a_JSONSchemaValidation2 {

	//Response validation - validating the data in the response
	//Schema Validation - focus on type of data we are getting - is nothing but whether data type is given prorply or not (like name is string, id is integer......)

	//to convert JSON to JSON Schema - https://jsonformatter.org/json-to-jsonschema
	
	@Test
	void jsonSchemaValidation() {
		// pre-requisites - convert JSON to JSON Schema - https://jsonformatter.org/json-to-jsonschema - store in any folder (F:\JSON Files\JsonSchema.json)
		// pre-requisites run - jsonForSchema3.json (F:\JSON Files\jsonForSchema.json) through cmd
		// maintain (F:\JSON Files\JsonSchema.json) file in Resources folder
		// N: json file must be in { "store":{ "book":[{},{},{}...]}} hierarchy and after converting json-jsonschema remove store part

		given()
		
		.when()
			.get("http://localhost:3000/store")	//F:\JSON Files\jsonForSchema.json
		.then()
			.assertThat().body(JsonSchemaValidator.matchesJsonSchemaInClasspath("studentsJsonSchema.json"));	//JsonSchema file name
	}
}

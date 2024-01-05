package E06_JSONandXMLSchemaValidation;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import E02_WaysToCreateRequestBody.POJO_PostRequest;

public class E06c_SerializationDeserialization {	//not that much Imp - Its internal approach

	// Serialization ----> convert Object (POJO) to JSON
	// De-Searialization ----> convert JSON to Object (POJO)
	
	// Body(JSON format) ----> Request ----> Response(JSON format)
	
	
	// Serialization ----> convert Object (POJO) to JSON
	//@Test
	void convertPojo2Json() throws JsonProcessingException {
		 
		POJO_PostRequest data = new POJO_PostRequest(); 
				 
		data.setName("Varsha");
	    data.setLocation("China");
	    data.setPhone("111111234");
				 
		String[] courseArray = {"Ruby","Python"};
		data.setCourses(courseArray);
		
		//Serialization - Convert java object (POJO) ---> json object 
		ObjectMapper ObjectMapper = new ObjectMapper();	//comes from JACKSON library
		String jsonData = ObjectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(data);
		
		System.out.println(jsonData);
		
		
		
	}
	
	// De-Searialization ----> convert JSON to Object (POJO)
	@Test
	void convertJson2Pojo() throws JsonProcessingException {
		 
		String jsonData = "{\r\n"		//// copied data from console after executing above mathod 'convertPojo2Json()'
				+ "  \"name\" : \"Varsha\",\r\n"
				+ "  \"location\" : \"China\",\r\n"
				+ "  \"phone\" : \"111111234\",\r\n"
				+ "  \"courses\" : [ \"Ruby\", \"Python\" ]\r\n"
				+ "}";		
		
		//De-Serialization - Convert json data ---> java object (POJO) 
		ObjectMapper ObjectMapper = new ObjectMapper();	//comes from JACKSON library
		POJO_PostRequest pojoPostReq = ObjectMapper.readValue(jsonData, POJO_PostRequest.class); // POJO_PostRequest - class in same package
		
		System.out.println(pojoPostReq.getName());
		System.out.println(pojoPostReq.getPhone());
		System.out.println(pojoPostReq.getCourses()[0]);
		System.out.println(pojoPostReq.getCourses()[1]);
		
		
		
	}

}

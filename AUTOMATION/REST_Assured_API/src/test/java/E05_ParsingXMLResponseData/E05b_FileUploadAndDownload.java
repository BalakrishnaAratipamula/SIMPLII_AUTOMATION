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

public class E05b_FileUploadAndDownload {
	//Single File Upload
	//@Test
	void singleFileUpload() {
		
		//https://youtu.be/_NRgpI48ogQ?si=9fc8TC-i7rMg1k76
		
		File myfile = new File("F:\\API FileUpload\\SampleFile1.txt");
		
//		Response res =
		given()
			.multiPart("file", myfile)	//(key, value)
			.contentType("multipart/form-data")	//always content type is ("multipart/form-data")
		.when()
			.post("https://the-internet.herokuapp.com/upload")
		.then()
			.statusCode(200)
			.header("Content-Type", "text/html;charset=utf-8")
			.body("html.html.body.div[1].div.div.h3", equalTo("File Uploaded!"))
			.log().all();
		
	}
	
	//Multiple Files Upload
	//@Test
	void MultipleFilesUpload() {
		
		File myfile1 = new File("F:\\API FileUpload\\SampleFile1.txt");	//file 1
		File myfile2 = new File("F:\\API FileUpload\\SampleFile2.txt");	//file 2
		
		//File[] myfile = {myfile1, myfile2};	//It may not work for some responses
		
//		Response res =
		given()
			//.multiPart("file", myfile)	//It may not work for some responses
			.multiPart("file", myfile1)	//(key, value)
			.multiPart("file", myfile2)
			.contentType("multipart/form-data")	//always content type is ("multipart/form-data")
		.when()
			.post("https://the-internet.herokuapp.com/upload")
		.then()
			.statusCode(200)
			.header("Content-Type", "text/html;charset=utf-8")
			.body("html.html.body.div[1].div.div.h3", equalTo("File Uploaded!"))	//file 1 validation
			//perform file 2 validation												//file 1 validation
			.log().all();
		
	}
	
	
	//Download File
	@Test
	void fileDownload() {
		
		given()
		
		.when()
			.get("https://the-internet.herokuapp.com/download/demo.txt")	//SampleFile.txt
		.then()
			.statusCode(200)
			.log().body();
		
	}
}

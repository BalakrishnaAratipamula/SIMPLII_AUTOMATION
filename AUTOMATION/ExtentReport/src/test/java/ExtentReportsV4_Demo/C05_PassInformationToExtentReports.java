package ExtentReportsV4_Demo;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.CodeLanguage;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class C05_PassInformationToExtentReports {
	public static void main(String Args[]) throws IOException {
		ExtentReports extentreports = new ExtentReports(); // Reporter Engine
		File file = new File("report.html");
		ExtentSparkReporter spartreporter = new ExtentSparkReporter(file); 
		extentreports.attachReporter(spartreporter);

		/////@@@ Text Based Information
		extentreports.createTest("TC1 - Test Based Test")
		.log(Status.INFO, "This log is INFO")
		.log(Status.INFO, "<b>This log is INFO - Bold</b>") //to bold //HTML text formatting - https://www.w3schools.com/html/html_formatting.asp
		.log(Status.INFO, "<i>This log is INFO - Italic</i>") //to
		.log(Status.INFO, "<b><i>This log is INFO - Bold&Italic</b></i>");
		
		/////@@@ Passing XML & JSON data into reports
		String xmlData = "<menu id=\"file\" value=\"File\">\r\n"
				+ "  <popup>\r\n"
				+ "    <menuitem value=\"New\" onclick=\"CreateNewDoc()\" />\r\n"
				+ "    <menuitem value=\"Open\" onclick=\"OpenDoc()\" />\r\n"
				+ "    <menuitem value=\"Close\" onclick=\"CloseDoc()\" />\r\n"
				+ "  </popup>\r\n"
				+ "</menu>";
		
		String jsonData = "{\"menu\": {\r\n"
				+ "  \"id\": \"file\",\r\n"
				+ "  \"value\": \"File\",\r\n"
				+ "  \"popup\": {\r\n"
				+ "    \"menuitem\": [\r\n"
				+ "      {\"value\": \"New\", \"onclick\": \"CreateNewDoc()\"},\r\n"
				+ "      {\"value\": \"Open\", \"onclick\": \"OpenDoc()\"},\r\n"
				+ "      {\"value\": \"Close\", \"onclick\": \"CloseDoc()\"}\r\n"
				+ "    ]\r\n"
				+ "  }\r\n"
				+ "}}";
		
		extentreports.createTest("TC2 - XML Based Test - Improper XML format")		//It can see after inspecting on this
		.log(Status.INFO, xmlData+ "\n\n This log is XML");
		extentreports.createTest("TC3 -XML Based Test - Proper XML format")
		.info(MarkupHelper.createCodeBlock(xmlData, CodeLanguage.XML));		//Formatting XML Data

		extentreports.createTest("TC3 - JSON Based Test - Improper JSON format")	
		.log(Status.INFO, jsonData+ "\n\n This log is JSON");
		extentreports.createTest("TC4 - XML Based Test - Proper JSON format")
		.log(Status.INFO, MarkupHelper.createCodeBlock(jsonData, CodeLanguage.JSON));	 //Formatting JSON Data

		
		//@@@@@ FOrmatting Collection Data - List, Map, Set
		List<String> listData = new ArrayList<>();
		listData.add("XXXXXLIST");
		listData.add("YYYYYLIST");
		listData.add("ZZZZZLIST");
		
		Map<Integer, String> mapData = new HashMap<>();
		mapData.put(101, "XXXXXMAP");
		mapData.put(102, "YYYYYMAP");
		mapData.put(103, "ZZZZZMAP");
		
		Set<Integer> setData = mapData.keySet();
		
		
		extentreports.createTest("TC5 - List Based Test")
		.info(MarkupHelper.createOrderedList(listData))		//elements will print in numbering format
		.info(MarkupHelper.createUnorderedList(listData));	//elements will print in bullet format
		
		extentreports.createTest("TC6 - MAP Based Test")
		.info(MarkupHelper.createOrderedList(mapData))		//elements will print in numbering format
		.info(MarkupHelper.createUnorderedList(mapData));	//elements will print in bullet format
		
		extentreports.createTest("TC7 - SET Based Test")
		.info(MarkupHelper.createOrderedList(setData))		//elements will print in numbering format
		.info(MarkupHelper.createUnorderedList(setData));	//elements will print in bullet format
		
		//@@@@ Highlight log message
		extentreports.createTest("TC8 - Highlight log message")
		.info("This is not highlighted log message")
		.info(MarkupHelper.createLabel("This is highlighted log message", ExtentColor.PINK)); //RED, GREEN, BLUE
		
		//@@@@ Log Exception details to report
		try {
			int i = 5/0;
		}catch (Exception e){
			extentreports.createTest("TC8 - Highlight log message - 1")		//System generated Exception message
			.info(e); //Here Throwable type is 'e'
		}
		
		Throwable t = new RuntimeException("This is a custom Exception");	//Customized Exception message
		extentreports.createTest("TC9 - Highlight log message - 2")
		.info(t);
		extentreports.createTest("TC9A - Highlight log message - 3")
		.fail(t);
		
		
		extentreports.flush();

		Desktop.getDesktop().browse(new File("report.html").toURI()); // To open Reports file Automatically from java
	}

}

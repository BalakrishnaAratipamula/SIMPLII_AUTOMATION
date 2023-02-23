package com.OHRM.TestScripts;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import com.OHRM.lib.LoginKeywords;

public class LoginTest {
	@Test
	public void login() throws IOException {
		//create object for class
		LoginKeywords keys= new LoginKeywords();
		//to specify Keywords file location
		FileInputStream fi= new FileInputStream("F:\\ActionsKeywords.xlsx");//‪‪F:\ActionsKeywords.xlsx
		XSSFWorkbook wb= new XSSFWorkbook(fi);
		XSSFSheet ws=wb.getSheet("Sheet1");
		
		//to find number of rows
		int rowCount=ws.getLastRowNum();
		for(int i=1; i<= rowCount; i++) {
			XSSFRow row=ws.getRow(i);
			//to read Run mode 
			String runMode=row.getCell(4).getStringCellValue();
			System.out.println(runMode);
			if (runMode.equals("Y")) {
			
			//to read Step DEscription
			String keyWord=row.getCell(2).getStringCellValue();
			System.out.println(keyWord);
			switch (keyWord) {
			case "Launch Browser":
				keys.launchBrowser();
				break;
			case "Navigate to Url":
				keys.navigateURL();
				break;
			case "Enter the Username":
				keys.enterUsername();
				break;
			case "Enter the Password":
				keys.enterPassword();
				break;
			case "Click on Login button":
				keys.clickLogin();
				break;		
				}
		}
		}

}
}
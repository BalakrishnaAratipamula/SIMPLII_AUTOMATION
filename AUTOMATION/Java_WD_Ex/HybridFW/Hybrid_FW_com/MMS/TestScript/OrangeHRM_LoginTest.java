package Hybrid_FW_com.MMS.TestScript;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import com.MMS.lib.LoginKeywords;

import Hybrid_FW_com.MMS.lib.OrangeHRM_LoginKeywords;

public class OrangeHRM_LoginTest {
	@Test
	public void login() throws IOException, InterruptedException {
		//create object for class
		OrangeHRM_LoginKeywords keys= new OrangeHRM_LoginKeywords();
		//to specify Keywords file location
		FileInputStream fi = new FileInputStream("F:\\Hybrid_FW_ActionsKeywords.xlsx");    //F://mydata4.xlsx
		XSSFWorkbook wb = new XSSFWorkbook(fi);
		XSSFSheet ws = wb.getSheet("Sheet1");
		
		//to find number of rows
		int rowCount = ws.getLastRowNum();
		for(int i=1; i<= rowCount; i++) {
			XSSFRow row = ws.getRow(i);
			//to read Run Mode info:
			String runMode = row.getCell(4).toString();
			System.out.println(runMode);
			if (runMode.equalsIgnoreCase("Y")) {
				//to read Step Description
				String keyWord = row.getCell(2).getStringCellValue(); //(or) toString 
				System.out.println(keyWord);
			switch (keyWord) { //keyword - class reff obj
			case "Launch Browser": /////// "Launch Browser" ---- from ExcelSheet (col: Test Step Action Keywords)
				keys.launchBrowser();
				break;
			case "Navigate to Url":
				keys.navigateURL();
				break; //if break is not mntion will check next content and so on........
			case "Enter the Username":
				keys.enterUsername(); 
				break;
			case "Enter the Password":
				keys.enterPassword();
				break;
			case "Click on Login button":
				keys.clickLogin();
				break;	
			case "Close browser":
				keys.closeBrowser();
				break;			
				}
		}
		}
	}
	
}

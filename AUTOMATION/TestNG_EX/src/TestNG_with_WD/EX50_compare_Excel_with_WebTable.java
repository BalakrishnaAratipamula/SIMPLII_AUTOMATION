package TestNG_with_WD;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class EX50_compare_Excel_with_WebTable {
	WebDriver driver;
	@Test(dataProvider = "DP1")
	public void csb(String Type, String BranchName, String Address, String 
	PhoneandEmail) throws InterruptedException {
	    String title = driver.getTitle();
	    Thread.sleep(5000);
	    Select options = new Select(
	    driver.findElement(By.xpath(".//*[@id='node-129']/div/div/div/div/form/div[1]/select")));
	    options.selectByValue("Tamil_Nadu");
	    int size = options.getOptions().size();
	    System.out.println(size);
	    List<WebElement> row = driver
	            .findElements(By.xpath(".//*[@id='node-129']/div/div/div/div/form/div[2]/div/table/tbody/tr"));
	    List<WebElement> column = driver
	            .findElements(By.xpath(".//*[@id='node-129']/div/div/div/div/form/div[2]/div/table/thead/tr/th"));
	    rowCount = row.size();
	    columnCount = 4;
	    ArrayList<String> Data = new ArrayList<String>();
	    Data.add(Type);
	    Data.add(BranchName);
	    Data.add(Address);
	    Data.add(PhoneandEmail);
	    System.out.println(Data);
	    System.out.println("Row :" + rowCount + " Clounm :" + columnCount);
	    tableVal = new String[rowCount][columnCount];
	    for (int i = 1; i <= rowCount; i++) {
	        for (int j = 1; j <= columnCount; j++) {
	            // get table data values
	            tableVal[i - 1][j - 1] = driver.findElement(By.xpath(".//table/tbody/tr[" + i + "]/td[" + j + "]"))
	                    .getText();
	            String Values = driver.findElement(By.xpath(".//table/tbody/tr[" + i + "]/td[" + j + "]")).getText();
	            Datauser.add(Values);
	        }
	    }
	    System.out.println(titel);
	    System.out.println("Values are" + Datauser);
	    Assert.assertEquals(Data, Datauser);
	}

	@DataProvider(name = "DP1")
	public Object[][] createData1() throws Exception {
	    Object[][] retObjArr = getTableArray("data.xls", "Sheet1", "dp1");
	    return (retObjArr);
	}

	@AfterTest
	public void close() {
	     driver.close(); 
	}
}

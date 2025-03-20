package TestNG_with_WD;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class EX6_TestNG_dataProvider {
	public static WebDriver driver; 
	@BeforeClass
	public void launchBrowser() {
		//to disable notifications
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--disable-notifications");
		
//		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver(ops);
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().maximize();
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0, 200)");
		
	}
	
	//Approach 1
	@DataProvider(name="TestData")	//give any name
	public Object[][] getData(){ //return value by sub method
		Object[][] data = new Object[4][2];
		
		data[0][0] = "user1";
		data[0][1] = "pass1";
		
		data[1][0] = "user2"; 
		data[1][1] = "pass2";
		
		data[2][0] = "user3";
		data[2][1] = "pass3";
		
		data[3][0] = "student";
		data[3][1] = "Password123";
		
		return data;
	}
	
	//Approach 2
	@DataProvider(name="TestData2")	//give any name
	public Object[][] getData2(){ //return value by sub method
		return new Object[][] {
			{"user1", "pwd1"},
			{"user2", "pwd2"},
			{"user3", "pwd3"},
			{"student", "Password123"}
		};
		
	}
	
	@Test(dataProvider="TestData2")	//dataProvider name same as above
	public void login(String un, String pass) throws Exception {
		driver.findElement(By.name("username")).clear();
		driver.findElement(By.name("username")).sendKeys(un);
		Thread.sleep(800);
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys(pass);
		Thread.sleep(600);
		driver.findElement(By.xpath("//button[@id='submit']")).click();
		Thread.sleep(3000);
		
		String pgTitle = driver.getTitle();
		System.out.println(pgTitle);
		
		/*/ this part is for Facebook ----- Refer for Knowledge
		if(pgTitle.equals("Facebook")||pgTitle.contains(") Facebook")) {//without notifications & with notifications
			File myFile= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileHandler.copy(myFile,new File("F:\\Passed screenshot2222 - "+ getTimeStamp()+".png"));
		}
		else {//wrong data
			File myFile= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileHandler.copy(myFile,new File("F:\\  screenshot2222 - "+ getTimeStamp()+".png"));
			
			Thread.sleep(500);
			driver.navigate().back();
		} //*/
		
		if(pgTitle.equals("Logged In Successfully | Practice Test Automation")) {
			File myFile= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileHandler.copy(myFile,new File("./Screenshots\\screenshot2222 - "+ getTimeStamp()+".png"));
			
			Thread.sleep(5000);
			driver.quit();
		}
		else {//wrong data
			File myFile= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileHandler.copy(myFile,new File("./Screenshots\\screenshot2222 - "+ getTimeStamp()+".png")); //./Screenshots
			
			Thread.sleep(500);
//			driver.navigate().back();
		} //*/
	} 
	
	
	public String getTimeStamp() {
		//to get Date stamping with file
		Date date = new Date();	//it will return system date
		SimpleDateFormat dateAndTimestampFormatter = new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss");
		String df1= dateAndTimestampFormatter.format(date); //to convert into required format
		System.out.println(df1);
		return df1;
	}
}

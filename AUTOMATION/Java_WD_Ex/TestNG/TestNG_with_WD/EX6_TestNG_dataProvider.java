package TestNG_with_WD;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
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
		
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver(ops);
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
	}
	
	@DataProvider(name="TestData")
	public Object[][] getData(){ //return value by submethod
		Object[][] data = new Object[4][2];
		
		data[0][0] = "user1";
		data[0][1] = "pass1";
		
		data[1][0] = "user2"; 
		data[1][1] = "pass2";
		
		data[2][0] = "user3";
		data[2][1] = "pass3";
		
		data[3][0] = "bhanu10205@gmail.com";
		data[3][1] = "sr786bhanu786";
		
		return data;
	}
	
	@Test(dataProvider="TestData")
	public void login(String un, String pass) throws Exception {
		driver.findElement(By.name("email")).clear();
		driver.findElement(By.name("email")).sendKeys(un);
		Thread.sleep(800);
		driver.findElement(By.name("pass")).clear();
		driver.findElement(By.name("pass")).sendKeys(pass);
		Thread.sleep(600);
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/button[1]")).click();
		Thread.sleep(1000);
		
		String pgTitle = driver.getTitle();
		System.out.println(pgTitle);
		if(pgTitle.equals("Facebook")||pgTitle.contains(") Facebook")) {//without notifications & with notifications
			File myFile= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileHandler.copy(myFile,new File("F:\\Passed screenshot2222 - "+ getTimeStamp()+".png"));
		}
		else {//wrong data
			File myFile= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileHandler.copy(myFile,new File("F:\\Failed screenshot2222 - "+ getTimeStamp()+".png"));
			
			Thread.sleep(500);
			driver.navigate().back(); 
		}
	}
	public String getTimeStamp() {
		
		//to get Date stamping with file
		Date dt= new Date();	//it will return system date
		String df1= new SimpleDateFormat("dd_MM_yyyy_HH_MM_ss").format(dt); //to convert into required format
		return df1;
	}
	
}

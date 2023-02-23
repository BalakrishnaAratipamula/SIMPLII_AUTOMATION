package WebDriverProg;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PropertiesFileEx {
public static void main(String[] args) throws Exception {
		//to specify File path
		FileInputStream fi=new FileInputStream("./FProperties//inputdata.properties");
	  //FileInputStream fi=new FileInputStream("./PropertiesF\\inputdata.properties");
		//create object for 'Properties Class'-----dynamic class
		Properties propObj= new Properties();
		//to load properties file
		propObj.load(fi);
		
		//to read data from properties file
		String key1=propObj.getProperty("key");
		String value1=propObj.getProperty("value");
		String applnUrl=propObj.getProperty("baseUrl");
		String uid=propObj.getProperty("userId");
		String pass= propObj.getProperty("passWd");
		
		//To Initialize Browser
		System.setProperty(key1, value1);
		WebDriver driver= new ChromeDriver();
		driver.navigate().to(applnUrl);
		driver.manage().window().maximize();
		
		//to perform login operation
		driver.findElement(By.id("txtUsername")).sendKeys(uid);
		driver.findElement(By.id("txtPassword")).sendKeys(pass);
		driver.findElement(By.id("btnLogin")).click();		
}
}

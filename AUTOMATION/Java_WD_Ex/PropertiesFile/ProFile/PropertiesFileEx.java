package ProFile;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PropertiesFileEx {
	public static void main(String[] args) throws Exception {
		// to specify file path
		FileInputStream fi = new FileInputStream("./PropertiesFile\\inputdata.properties");
		// create object for properties class
		Properties proObj = new Properties();
		// to load properties file
		proObj.load(fi);

		// to read data from properties file
		String key1 = proObj.getProperty("key"); // Key from properties file
		String value1 = proObj.getProperty("value");
		String applnUrl = proObj.getProperty("baseUrl");
		String uid = proObj.getProperty("userId");
		String pass = proObj.getProperty("passWd");
		String loginBtn = proObj.getProperty("loginBtn");

		// To Initialize Browser
//		System.setProperty(key1, value1);
		WebDriver driver = new ChromeDriver();
		driver.navigate().to(applnUrl);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// to perform login operation
		driver.findElement(By.name("username")).sendKeys(uid);
		driver.findElement(By.name("password")).sendKeys(pass);
		Thread.sleep(3000);
		driver.findElement(By.xpath(loginBtn)).click();
		Thread.sleep(3000);
		System.out.println("*****DONE****");

		driver.quit();
	}
}

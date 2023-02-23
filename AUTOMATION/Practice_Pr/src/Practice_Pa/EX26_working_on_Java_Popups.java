package Practice_Pa;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Alert;

public class EX26_working_on_Java_Popups {
public static void main(String[] args) throws Exception {
	//open Chrome browser
	System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://secure.aponline.gov.in/CitizenPortal/UserInterface/Citizen/LoginForm.aspx");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	//enter user id
	driver.findElement(By.id("userId")).sendKeys("Bala");
	//click on Enter
	driver.findElement(By.name("ImageButton1")).click();
	Thread.sleep(5000);
	
	//To handling HTML popups we have to use Alert class
	Alert alt = driver.switchTo().alert();
	String str = alt.getText();
	System.out.println("Error msg from popup window is:   " +str);
	alt.accept();
	//to enter pwd
	driver.findElement(By.id("password")).sendKeys("Mercury");
}
}

package Practice_Pa;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EX28_AuotoIT {
public static void main(String[] args) throws Exception {
	//To Initialize browser
	System.setProperty("webdriver.gecko.driver", "E:\\Drivers\\geckodriver.exe");
	WebDriver driver= new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://www.filemail.com/");
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	//to enter Email
	driver.findElement(By.xpath("//input[contains(@class,'ui-widget-content ui-autocomplete-input')]")).sendKeys("aratipamula.balakrishna@gmail.com");
	//to click on AddFile button
	driver.findElement(By.id("addBtn")).click();
	Thread.sleep(1000);
	
	Runtime.getRuntime().exec("F:\\AutoIT\\file3.exe");//‪F:\AutoIT\file3.exe
}
}

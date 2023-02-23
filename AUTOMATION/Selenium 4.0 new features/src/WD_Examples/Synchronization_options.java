package WD_Examples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Synchronization_options {

@SuppressWarnings("deprecation")
public static void main(String[] args) {
	//to Initialize browser
	System.setProperty("webdriver.chrome.driver","E:\\Drivers\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().timeouts().pageLoadTimeout(0, TimeUnit.SECONDS);
	driver.navigate().to("https://www.apsrtconline.in/oprs-web/");
	driver.manage().window().maximize();
	
	
	
	
}

}

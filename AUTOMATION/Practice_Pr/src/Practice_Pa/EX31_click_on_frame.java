package Practice_Pa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EX31_click_on_frame {
public static void main(String[] args) {
	//to initialize browser
	System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://seleniumhq.github.io/selenium/docs/api/java/index.html");
	driver.manage().window().maximize();
	
	//Switch to frame
	driver.switchTo().frame("classFrame");//While working with frames to navigate which frame u have to enter 
	//to click on org.openqa.selenium
	driver.findElement(By.linkText("org.openqa.selenium")).click();
	
}
}

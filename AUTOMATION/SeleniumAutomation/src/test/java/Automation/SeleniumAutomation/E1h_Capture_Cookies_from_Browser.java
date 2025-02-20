package Automation.SeleniumAutomation;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class E1h_Capture_Cookies_from_Browser {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver(); // --RTP Concept
		driver.get("https://google.co.in/");
		driver.manage().window().maximize();
		
		Set<Cookie> cookies = driver.manage().getCookies();
		for(Cookie cookie: cookies) { //enhanced for loop
			System.out.println(cookie);
		}
		
		//cookie validation
		Cookie cookie = driver.manage().getCookieNamed("OGPC");
		String val = cookie.getValue();
		System.out.println(val);
		Assert.assertEquals(val, "19046228-1:"); //(cookie_name, cookie_value)
		
		Thread.sleep(3000);
		System.out.println("\nExecution Done");
		//close browser window
		driver.quit();
	}
}

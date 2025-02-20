package Automation.SeleniumAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class E1g_CookieValidation_nd_AddingCookies {
	public static void main(String[] args) throws InterruptedException {
		// Initialize the WebDriver with Browser driver
		WebDriver driver = new ChromeDriver(); // --RTP Concept

		// Launching URL
		driver.get("https://example.cypress.io/commands/cookies");
		// to maximize the browser window
		driver.manage().window().maximize();
		
		
		/*/Adding cookie into the browser
		Cookie cookie = new Cookie("cookieKey123", "cookieValue123"); //Cookie(key, value)
		driver.manage().addCookie(cookie); //adding cookie into the browser
		System.out.println(driver.manage().getCookieNamed("cookieKey123")); //*/
		
		
		
		//Cookie Validation
		//Click on 'Set Cookie' button ------- (Actual class  = "set-a-cookie btn btn-success")
		WebElement ele = driver.findElement(By.cssSelector(".set-a-cookie")); //.Partial_A_V
//OR	WebElement ele = driver.findElement(By.cssSelector(".btn-success")); //.Partial_A_V
//OR	WebElement ele = driver.findElement(By.cssSelector(".set-a-cookie.btn.btn-success")); //.A_V //'spaces' is filled with '.'
//OR	WebElement ele = driver.findElement(By.cssSelector("button.set-a-cookie.btn.btn-success")); //tagName.A_V //'spaces' is filled with '.'
		ele.click();
		
		//getting cookie by name
		Cookie var = driver.manage().getCookieNamed("token");
		
		//getting cookie value
		String val = var.getValue();
		
		//Validating cookie
		Assert.assertEquals("---@@@@---Error Message---@@@@---", val, "123ABC"); //Error message will print when assertion statement is get fails
		
		Thread.sleep(3000);
		System.out.println("Execution Done");
		//close browser window
		driver.quit();
	}
}

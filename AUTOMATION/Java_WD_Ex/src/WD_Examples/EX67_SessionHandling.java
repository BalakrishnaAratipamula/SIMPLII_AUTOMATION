package WD_Examples;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.SessionId;

public class EX67_SessionHandling {
	//Maintaining Session Using Cookies
	public static void main(String[] args) throws InterruptedException {
		// Step 1: Start a session and log in
		WebDriver driver1 = new ChromeDriver();
		driver1.get("https://practice.expandtesting.com/login"); //https://practicetestautomation.com/practice-test-login/
		SessionId sessionId1 = ((RemoteWebDriver) driver1).getSessionId();
		System.out.println("Session ID1: " + sessionId1);
		
		// ...perform login steps
		driver1.findElement(By.id("username")).sendKeys("practice");
		driver1.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
		Thread.sleep(1000);
		JavascriptExecutor js = ((JavascriptExecutor)driver1);
		js.executeScript("window.scrollBy(0,250)");
		
		driver1.findElement(By.xpath("//*[@id='login']/button")).click();
		
		Thread.sleep(3000);
		Cookie loginCookie = new Cookie("sessionToken123", "yourSessionTokenValue#123");
		driver1.manage().addCookie(loginCookie);
		
		// Store cookies after login
		Set<Cookie> cookies = driver1.manage().getCookies();
		
		for(Cookie cookie: cookies) {
			System.out.println(cookie.getName()+"   "+cookie.getValue());
		}
		
		driver1.quit();  // End the first session
		
		// Step 2: Start a new session and add the saved cookies
		WebDriver driver2 = new ChromeDriver();
		driver2.get("https://practice.expandtesting.com/login");  // Visit site before adding cookies
		SessionId sessionId2 = ((RemoteWebDriver) driver2).getSessionId();
		System.out.println("Session ID2: " + sessionId2);
		
		// Add each cookie to the new session
		for (Cookie cookie : cookies) {
		    driver2.manage().addCookie(cookie);
		}

		// Refresh to apply cookies
		driver2.navigate().refresh();  // Should now be logged in using the saved session

		Thread.sleep(3000);
		// get cookies 
		Set<Cookie> cookies_ = driver2.manage().getCookies();
				
		for(Cookie cookie_: cookies_) {
			System.out.println(cookie_.getName()+"   "+cookie_.getValue());
		}
		
		Thread.sleep(5000);
		driver2.quit(); //*/
	}
}

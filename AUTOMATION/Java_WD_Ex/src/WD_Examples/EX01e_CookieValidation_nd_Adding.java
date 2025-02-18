package WD_Examples;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class EX01e_CookieValidation_nd_Adding {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://example.cypress.io/commands/cookies");
		driver.manage().window().maximize();
		
		//1 - Cookie Validation
		//actuval class  = "set-a-cookie btn btn-success"
		WebElement ele = driver.findElement(By.cssSelector(".set-a-cookie")); 
//OR		WebElement ele = driver.findElement(By.cssSelector(".btn-success"));
//OR		WebElement ele = driver.findElement(By.cssSelector(".set-a-cookie.btn.btn-success"));
//OR		WebElement ele = driver.findElement(By.cssSelector("button.set-a-cookie.btn.btn-success"));
		ele.click();
		
		Cookie var = driver.manage().getCookieNamed("token");
		
		Assert.assertEquals(var.getValue(), "123ABC"); //*/
		
		
		//2 - Cookie Adding
		Cookie cookie = new Cookie("cookieKey123", "cookieValue123");
		driver.manage().addCookie(cookie);
		System.out.println(driver.manage().getCookieNamed("cookieKey123"));
		
		driver.quit();
	}
}

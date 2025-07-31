package WD_Examples;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class EX01e_CookieValidation_nd_Adding {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://example.cypress.io/commands/cookies");
		driver.manage().window().maximize();
		
		//1 - Cookie Validation
		//Click on 'Set Cookie' button ------- (Actual class  = "set-a-cookie btn btn-success")
		WebElement ele = driver.findElement(By.cssSelector(".set-a-cookie")); //.Partial_A_V
//OR		WebElement ele = driver.findElement(By.cssSelector(".btn-success")); //.Partial_A_V
//OR		WebElement ele = driver.findElement(By.cssSelector(".set-a-cookie.btn.btn-success")); //.A_V //'spaces' is filled with '.'
//OR		WebElement ele = driver.findElement(By.cssSelector("button.set-a-cookie.btn.btn-success")); //tagName.A_V //'spaces' is filled with '.'
		ele.click();
		
		Thread.sleep(3000);
		Cookie var = driver.manage().getCookieNamed("token"); //getting cookie by name
		String val = var.getValue(); //getting cookie value
		Assert.assertEquals(val, "123ABC"); //Error message will print when assertion statement is get fails
		
		//2 - Cookie Adding
		Cookie cookie = new Cookie("cookieKey123", "cookieValue123");
		driver.manage().addCookie(cookie);
		System.out.println(driver.manage().getCookieNamed("cookieKey123"));
		
		driver.quit();
	}
}

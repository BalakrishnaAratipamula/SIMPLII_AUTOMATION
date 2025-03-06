package WD_Examples;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class EX26e_JS_AlertHandling_SendingText_iframe {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.switchTo().frame("iframeResult");
	    //Find "Try it" button
	    WebElement promptButton = driver.findElement(By.cssSelector("html>body>button"));
	    //Actual Message
	    WebElement actualPromptMessage = driver.findElement(By.cssSelector("#demo"));
	    //Click confirm button ("Try it" button)
	    promptButton.click();
	    //Send "SW Test Academy" to Alert's text box
	    driver.switchTo().alert().sendKeys("Selenium WebDriver");
	    Thread.sleep(5000);
//	    Accept the alert (Click Ok button)
	    driver.switchTo().alert().accept();
	    //Assertion
	    Assert.assertEquals("Hello Selenium WebDriver! How are you today?", actualPromptMessage.getText());

		driver.quit();
	}
}

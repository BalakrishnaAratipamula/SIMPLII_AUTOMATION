package WD_Examples;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EX63_ShadowDOM {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("chrome://settings/appearance");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		/*/Exec - 1
		WebElement eleShadowHost = driver.findElement(By.xpath("//settings-ui")).getShadowRoot()	//tagName
								.findElement(By.cssSelector("settings-main#main")).getShadowRoot()
								.findElement(By.cssSelector("settings-basic-page.cr-centered-card-container")).getShadowRoot()
								.findElement(By.cssSelector("settings-section[section='appearance']"))
								.findElement(By.tagName("settings-appearance-page")).getShadowRoot()
								.findElement(By.cssSelector("settings-animated-pages#pages"))
								.findElement(By.cssSelector("settings-toggle-button[label='Show bookmarks bar']")).getShadowRoot()
								.findElement(By.cssSelector("cr-toggle#control"))
								;
		Thread.sleep(2000);
		eleShadowHost.click();
		Thread.sleep(2000);
		eleShadowHost.click();
		Thread.sleep(2000);
		//*/
		
		
		/*/Exec - 2
		WebElement eleShadowHost = driver.findElement(By.xpath("//settings-ui")).getShadowRoot()	//tagName
								.findElement(By.cssSelector("cr-toolbar#toolbar")).getShadowRoot()
								.findElement(By.cssSelector("cr-toolbar-search-field#search")).getShadowRoot()
								.findElement(By.cssSelector("input"))
								; 
		Thread.sleep(2000);
		eleShadowHost.sendKeys("Selenium-WebDriver");
		Thread.sleep(2000); */
		
		
		//Exec - 3
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement ele = (WebElement) js.executeScript("return document.querySelector(\"body > settings-ui\").shadowRoot.querySelector(\"#toolbar\").shadowRoot.querySelector(\"#search\").shadowRoot.querySelector(\"#searchInput\")");
		
		String str = "arguments[0].setAttribute('value', 'Selenium-WebDriver')";
		
		Thread.sleep(2000);
		js.executeScript(str, ele);
		Thread.sleep(2000); 
		
		driver.quit(); 
	}
}

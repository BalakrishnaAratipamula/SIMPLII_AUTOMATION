package ShadowDOM_Demo;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class E1_ShadowDOM {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("chrome://settings/appearance");
		driver.manage().window().maximize();
		
		/*/Exec 1
		//Show bookmarks bar
		WebElement eleShadowHost = driver.findElement(By.xpath("//settings-ui")).getShadowRoot()
								.findElement(By.cssSelector("settings-main#main")).getShadowRoot()
								.findElement(By.cssSelector("settings-basic-page.cr-centered-card-container")).getShadowRoot()
								.findElement(By.cssSelector("settings-section[section='appearance']"))
								.findElement(By.tagName("settings-appearance-page")).getShadowRoot()
								.findElement(By.cssSelector("settings-animated-pages#pages"))
								.findElement(By.cssSelector("settings-toggle-button[label='Show bookmarks bar']")).getShadowRoot()
								.findElement(By.cssSelector("cr-toggle#control"))
								;
		
		System.out.println("Element identified:  "+eleShadowHost.isDisplayed());
		
		Thread.sleep(3000);
		eleShadowHost.click();
		Thread.sleep(4000);
		eleShadowHost.click(); //*/
		
		
		/*/Exec 2
		WebElement eleShadowHost = driver.findElement(By.xpath("//settings-ui")).getShadowRoot()
								.findElement(By.cssSelector("cr-toolbar#toolbar")).getShadowRoot()
								.findElement(By.cssSelector("cr-toolbar-search-field#search")).getShadowRoot()
								.findElement(By.cssSelector("input"))
								;
		
		System.out.println("Element identified:  "+eleShadowHost.isDisplayed());
		
		Thread.sleep(3000);
		eleShadowHost.sendKeys("Selenium-WebDriver"); //*/
		
		
		//Exec 3
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		WebElement eleShadowHost = (WebElement) jse.executeScript("return document.querySelector('body > settings-ui').shadowRoot"
				+ ".querySelector('#toolbar').shadowRoot.querySelector('#search').shadowRoot.querySelector('#searchInput')");
		
		Thread.sleep(3000);
		eleShadowHost.sendKeys("Selenium-WebDriver"); //*/
		
		
		Thread.sleep(3000);
		driver.quit();
	}
	
}

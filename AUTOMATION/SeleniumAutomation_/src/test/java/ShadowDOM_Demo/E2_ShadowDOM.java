package ShadowDOM_Demo;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class E2_ShadowDOM {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://selectorshub.com/shadow-dom-in-iframe/");
		driver.manage().window().maximize();
		
		//switch inside the frame
		driver.switchTo().frame("pact"); //id
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		//'Do you love tea' edit box
		WebElement ele1 = (WebElement) jse.executeScript("return document.querySelector('#snacktime').shadowRoot.querySelector('#tea')");
		//'What would you like to have in lunch?' edit box
		WebElement ele2 = (WebElement) jse.executeScript("return document.querySelector('#snacktime').shadowRoot.querySelector('#app2').shadowRoot.querySelector('#pizza')");
	
		String str1 = "arguments[0].setAttribute('value', 'Greaan Tea')";
		String str2 = "arguments[0].setAttribute('value', 'Chiken Biriyani')";
		
		Thread.sleep(3000);
		jse.executeScript(str1, ele1);
		Thread.sleep(1000);
		jse.executeScript(str2, ele2);
		
		Thread.sleep(3000);
		driver.quit();
	}
}

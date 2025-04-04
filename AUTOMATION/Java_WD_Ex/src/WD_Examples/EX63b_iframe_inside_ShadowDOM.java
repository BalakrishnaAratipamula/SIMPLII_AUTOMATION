package WD_Examples;

import java.time.Duration;

import org.bouncycastle.math.ec.custom.sec.SecT113R1Curve;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class EX63b_iframe_inside_ShadowDOM {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://selectorshub.com/shadow-dom-in-iframe/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.switchTo().frame("pact");

		JavascriptExecutor js = (JavascriptExecutor) driver;
		//'Do you love tea' edit box
		WebElement ele1 = (WebElement) js.executeScript("return document.querySelector('#snacktime').shadowRoot.querySelector('#tea')");
		//'What would you like to have in lunch?' edit box
		WebElement ele2 = (WebElement) js.executeScript("return document.querySelector('#snacktime').shadowRoot.querySelector('#app2').shadowRoot.querySelector('input')");
		
		String str1 = "arguments[0].setAttribute('value', 'Green Tea')";
		String str2 = "arguments[0].setAttribute('value', 'Chiken Biriyani')";
		
		Thread.sleep(2000);
		js.executeScript(str1, ele1);
		Thread.sleep(500);
		js.executeScript(str2, ele2);
		Thread.sleep(3000);

		driver.quit();
	}
}

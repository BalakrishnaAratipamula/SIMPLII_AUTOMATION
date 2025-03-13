package WD_Examples;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EX41_JsE_EnterDataInEditbox_nd_click_nd_DiffWayOfAssertOperation {
	public static void main(String[] args) throws InterruptedException  {
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();

		//creating JavascriptExecutor interface object by TypeCasting ---- (JavascriptExecutor)driver)
		//TypeCasting -----> we need to convert variable from one data type to another 
		//TypeCasting -----> by type TypeCasting then only we can able to access the both WD & Js methods
		JavascriptExecutor js = ((JavascriptExecutor)driver);

		//to open url
		js.executeScript("window.location='http://login.salesforce.com'");
		Thread.sleep(5000);
		//to enter text in edit box
		js.executeScript("window.document.getElementById('username').value='aaaaaaaaaaaaa'");//shortcut will get correct
		Thread.sleep(1500);
		//to click on [Login] - For practice i  just want to use Explicit wait to find element
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement loginBtnEle = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("Login")));
		//For practice i just want to perform Assert operation
		assert loginBtnEle.isDisplayed();
		
		js.executeScript("arguments[0].click();", loginBtnEle); //js.executeScript("arguments[0].click()", ele);
	
		Thread.sleep(5000);
		driver.quit();
	
	}
}

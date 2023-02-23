package WD_Examples;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EX41a_JsE_getPageTitle_nd_close {

	public static void main(String[] args) throws InterruptedException {
		//to initialize browser
		System.setProperty("webdriver.chrome.driver", "E://Drivers//chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();

		//creating JavascriptExecutor interface object by TypeCasting ---- (JavascriptExecutor)driver)
		//TypeCasting -----> by type TypeCasting then only we can able to access the both WD & Js methods
		JavascriptExecutor js = (JavascriptExecutor)driver;

		//to open url
		js.executeScript("window.location='http://login.salesforce.com'");
		//to getPageTitle
		String title = (String)js.executeScript("return document.title");
		System.out.println(title);

		Thread.sleep(3000);
		js.executeScript("window.close");



	}

}

package WD_Examples;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

//@. in a web page, how will you ensure that the page has been loaded completely?
public class EX71_Ensure_PageLoadedCompletely {
	static WebDriver driver;

	/*/M1 
	public static boolean waitForPageLoad(WebDriver driver, Duration timeout) {
		ExpectedCondition<Boolean> pageLoadCondition = new ExpectedCondition<Boolean>() {
			public Boolean apply(WebDriver driver) {
				return ((JavascriptExecutor) driver).executeScript("return document.readyState").equals("complete");
			}
		};
		
		Wait<WebDriver> wait = new WebDriverWait(driver, timeout);
		boolean flag = wait.until(pageLoadCondition);
		return flag;
	}

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.espncricinfo.com/");
		System.out.println("PageLoad Test: " + waitForPageLoad(driver, Duration.ofSeconds(40)));

		driver.quit();
	} //*/
	
	
	//M2
	public static void main(String[] args) {

		driver = new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(webDriver -> js.executeScript("return document.readyState").equals("complete"));
	}
}

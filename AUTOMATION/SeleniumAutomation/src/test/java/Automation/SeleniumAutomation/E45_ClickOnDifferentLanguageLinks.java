package Automation.SeleniumAutomation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class E45_ClickOnDifferentLanguageLinks {
	static WebDriver driver;
	
	//Setup method
	public void setUp() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	//to click on language links
	public void lanClick(String myLink) throws InterruptedException {
		driver.findElement(By.linkText(myLink)).click();
		Thread.sleep(2000);
	}
	
	//tear down
	public void tearDown() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}
	
	//main method
	public static void main(String[] args) throws InterruptedException {
		E45_ClickOnDifferentLanguageLinks obj = new E45_ClickOnDifferentLanguageLinks();
		obj.setUp();
		obj.lanClick("हिन्दी");
		obj.lanClick("తెలుగు");
		obj.lanClick("ಕನ್ನಡ");
		obj.lanClick("മലയാളം");
		obj.tearDown();
	}
}

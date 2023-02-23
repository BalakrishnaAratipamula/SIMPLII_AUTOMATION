package Practice_Pa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EX45_Oops_Diff_Langlinks_selection {
	WebDriver driver;    //take before the sub method because need to use 'driver' object in multiple sub methods
	public void setUp() {
		System.setProperty("webdriver.chrome.driver","E:\\Drivers\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("http://google.co.in");
		driver.manage().window().maximize();
	}
	//to click on language links
	public void langClick(String myLang) throws Exception {
		driver.findElement(By.linkText(myLang)).click();
		Thread.sleep(3000);
	}
	//to close application
	public void tearDown() {
		driver.close();
	}
	public static void main(String[] args) throws Exception {
		EX45_Oops_Diff_Langlinks_selection obj = new EX45_Oops_Diff_Langlinks_selection();
		obj.setUp();
		obj.langClick("తెలుగు");
		obj.langClick("हिन्दी");
		obj.langClick("ಕನ್ನಡ");
		obj.langClick("English");
		obj.tearDown();
	}

}

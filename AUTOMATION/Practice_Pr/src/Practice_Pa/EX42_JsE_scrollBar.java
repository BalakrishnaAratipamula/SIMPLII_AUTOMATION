package Practice_Pa;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EX42_JsE_scrollBar {
public static void main(String[] args) throws Exception {
	//to initialize browser
	System.setProperty("webdriver.gecko.driver", "E://Drivers//geckodriver.exe");
	WebDriver driver= new FirefoxDriver();
	driver.get("http://www.rediff.com/");
	driver.manage().window().maximize();
	
	//to create JavascriptExecutor interface object by TypeCasting
	JavascriptExecutor js = ((JavascriptExecutor)driver);
	
	//to scrollDown
	js.executeScript("window.scrollBy(0,2800)");
	Thread.sleep(3000);
	System.out.println("scrollDown performed");
	//to scrollUp
	js.executeScript("window.scrollBy(0,-1200)");
	System.out.println("scrollup performed");

}
}

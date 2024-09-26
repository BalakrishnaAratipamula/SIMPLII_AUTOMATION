package WD_Examples;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class EX42_JsE_scrollBar {
public static void main(String[] args) throws Exception {
	//to initialize browser
//	System.setProperty("webdriver.gecko.driver", "E://Drivers//geckodriver.exe");
	WebDriver driver= new FirefoxDriver();
	driver.get("http://www.rediff.com/");
	driver.manage().window().maximize();
	Thread.sleep(2500);
	
	//to create javascriptExecutor interface object by TypeCasting
	JavascriptExecutor js = ((JavascriptExecutor)driver);
	
	//ScrollUp and scrollDown using JsE command 
//	js.executeScript("window.scrollBy(0,2500)"); //to scrolldown 
/*OR*/	js.executeScript("window.scrollTo(0, document.body.scrollHeight)"); //scrollDown to End 
	Thread.sleep(3000);
	js.executeScript("window.scrollBy(0,-2500)"); //to scrollup
/*OR*/	js.executeScript("window.scrollTo(0, -document.body.scrollHeight)"); //scrollUp to Home
	Thread.sleep(3000);
	
	
	/*/ScrollUp and scrollDown using Actions class
	Actions a=new Actions(driver);
	a.keyDown(Keys.CONTROL).sendKeys(Keys.END).build().perform(); //To scroll down 
	Thread.sleep(3000);
	a.keyDown(Keys.CONTROL).sendKeys(Keys.HOME).build().perform(); //To scroll up
	*/
	
	driver.quit();
}
}

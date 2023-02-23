package WD_Examples;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EX43_JsE_HandlinghiddenElements { 
	public static void main(String[] args) throws Exception { /////--------------https://youtu.be/2O5tnsJaHrY

		///////while handling hidden elements we will get ElementNotVisible & ElementNotInteractable Exceptions & sometimes will not get error

		/*/ to initialize browser
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://courses.letskodeit.com/practice");
		driver.manage().window().maximize();

		//1. at this time given text will not enter in text box (it can see by click [show] after executing the script)
		driver.findElement(By.id("hide-textbox")).click(); //Hide button is clicked
		driver.findElement(By.id("hide-textbox")).sendKeys("ddddd");
		System.out.println("done"); 

		//2. at this time given text will enter in text box (it can see by click [show] after executing the script)
		driver.findElement(By.id("hide-textbox")).click(); //Hide button is clicked 
		//creating JavascriptExecutor interface object by TypeCasting
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.document.getElementById('displayed-text').value='AAAAAA'"); 
		System.out.println("done"); 
		
		driver.quit(); */
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

		//how to find hidden elements --------- https://youtu.be/2eEr0jtmpwE
		// to initialize browser
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-automate-radio-button-in.html?m=1");
		driver.manage().window().maximize();

		//if result get 0 0 bcz element is not currently visible
		int x = driver.findElement(By.id("male")).getLocation().getX();
		int y = driver.findElement(By.id("male")).getLocation().getY();
		System.out.println("X cord  "+x);
		System.out.println("X cord  "+x); 

		List<WebElement> radio = driver.findElements(By.id("male"));
		int count = radio.size();
		System.out.println("total radio buttons  "+radio.size());
		for(int i=0; i<count; i++) {
			WebElement ele = radio.get(i);
			int X = ele.getLocation().getX();
			if(X!=0) { //x!=0 means that particular webElement is exist 
				ele.click();
				break;
			}
		} 



	}
}
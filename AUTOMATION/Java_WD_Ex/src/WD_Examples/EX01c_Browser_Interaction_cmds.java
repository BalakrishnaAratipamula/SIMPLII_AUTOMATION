package WD_Examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EX01c_Browser_Interaction_cmds {
	public static void main(String args[]) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https:en-gb.facebook.com/"); //doent maintain browserbrowser history, cookies 
//		driver.navigate().to("https:en-gb.facebook.com/");
		driver.manage().window().maximize();

		/*/getPageSource()
		Thread.sleep(1000);
		String pgsrc = driver.getPageSource(); //To write data in console 1st store the read data in any variable here variable is 'pgsrc' & datatype is 'String'
		System.out.println("Page Source is:*********************" +pgsrc);
		//System.out.println(pgsrc); //To print or write in console data
		System.out.println();

		//getCurrentUrl();
		Thread.sleep(1000);
		String curUrl = driver.getCurrentUrl();
		System.out.println("Page CurrentUrl is:**************** " +curUrl);
		System.out.println();

		//getTitle();
		Thread.sleep(1000);
		String gturl = driver.getTitle();
		System.out.println("Page title is:***************** " +gturl); */

		//Html code of WebElement
		WebElement ele = driver.findElement(By.cssSelector("#email"));
		String str = ele.getAttribute("outerHTML");
		System.out.println(str);
		driver.quit();

	}
}

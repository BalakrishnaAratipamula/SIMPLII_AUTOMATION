package WD_Examples;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

import java.util.Iterator;
import java.util.Set;

public class EX33_Handling_Multiplewindows_M1 {
	public static void main(String[] args) throws Exception{
		// To initialize browser
		System.setProperty("webdriver.gecko.driver", "E:\\Drivers\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("http:\\gmail.com");
		driver.manage().window().maximize();

		//to read page Title
		String pgTitle = driver.getTitle();
		System.out.println("1st Page Title is:  "+pgTitle);

		//to click on "Help" link
		driver.findElement(By.linkText("Help")).click();
		Thread.sleep(5000);

		//to read window handles   ////// this method return type is 'Set<String>'
		Set<String> pgHandles = driver.getWindowHandles(); //it will return id's of all opened windows into "set<String> variable" here return type is string
		Iterator<String> winHandles = pgHandles.iterator(); //'Iterator' read each window id from "Set<String> variable" 
		//Store each 'window handle value' into "String variable" by using Iterator class	
		String w1 = winHandles.next();
		String w2 = winHandles.next();
		System.out.println("************* "+w1+" ***************"); //window id
		System.out.println("************* "+w2+" ***************");	//window id

		//to work on 2nd window
		driver.switchTo().window(w2);
		String pgTitle2 = driver.getTitle();
		System.out.println("2nd window Page Title is:  "+pgTitle2);
		Thread.sleep(3000);

		//to work on 1st window
		driver.switchTo().window(w1);
		String pgTitle1=driver.getTitle();
		System.out.println("1st window Page Title is:  "+pgTitle1);
		Thread.sleep(3000);

		//to navigate 2nd window
		driver.switchTo().window(w2);
		System.out.println("----navigated to 2nd window----");
		Thread.sleep(3000);
		
		driver.quit();
	}
}

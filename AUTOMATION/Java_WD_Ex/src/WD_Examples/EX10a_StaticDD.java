package WD_Examples;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EX10a_StaticDD {
	public static void main(String[] args) throws Exception {
		//to initialize browser
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://demo.guru99.com/test/newtours/");
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("REGISTER")).click();
		Thread.sleep(800);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0, 250)");    //horizantal, vertical
		Thread.sleep(800); 
		
		driver.findElement(By.name("country")).click();
		Thread.sleep(800);

		Select sc = new Select(driver.findElement(By.name("country")));

		//to select 'ARMENIA' by using selectByVisibleText()
		sc.selectByVisibleText("ARMENIA");
		System.out.println("ARMENIA selected");
		Thread.sleep(5000);

		//to select 1st option
		sc.selectByIndex(01);   ///index strats from 'zero'
		System.out.println("ALBANIA selected");
		Thread.sleep(5000);

		//to select 'BELARUS' by using selectbyValue (by inspect text box will get value="241"
		sc.selectByValue("DENMARK");
		System.out.println("DENMARK selected");
		Thread.sleep(5000);
		
		driver.quit();
	}
}
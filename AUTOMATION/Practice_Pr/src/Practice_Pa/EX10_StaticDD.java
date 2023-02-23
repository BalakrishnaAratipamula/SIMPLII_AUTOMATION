
package Practice_Pa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EX10_StaticDD {
public static void main(String[] args) throws Exception {
	//to initialize browser
	System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.navigate().to("http://newtours.demoaut.com");
	driver.manage().window().maximize();
	
	driver.findElement(By.linkText("REGISTER")).click();
	Thread.sleep(800);
	driver.findElement(By.name("country")).click();
	Thread.sleep(800);
	
	Select a = new Select(driver.findElement(By.name("country")));
	
	//to select 'ARMENIA' by using selectByVisibleText()
	a.selectByVisibleText("ARMENIA");
	System.out.println("ARMENIA selected");
	Thread.sleep(5000);
			
	//to select 1st option
	a.selectByIndex(01);
	System.out.println("ALBANIA selected");
	Thread.sleep(5000);
			
	//to select 'BELARUS' by using selectbyValue (by inspect text box will get value="241"
	a.selectByValue("241");
	System.out.println("BELARUS selected");
	Thread.sleep(5000);
}
}

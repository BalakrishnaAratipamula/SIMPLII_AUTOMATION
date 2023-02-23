package Practice_Pa;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EX08_dropdownEx_addbtns {
public static void main(String[] args) throws Exception {
	//to initialize the browser
	System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.navigate().to("https://www.spicejet.com");
	driver.manage().window().maximize();
	
	driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
	Thread.sleep(3000);
	driver.findElement(By.linkText( "Goa (GOI)")).click();
	Thread.sleep(3000);
	
	driver.findElement(By.linkText("Mumbai (BOM)")).click();/*While pasting attribute value if pre-spaces or post spaces can available need to remove 
	if space is there not take*/
	Thread.sleep(3000);

	driver.findElement(By.linkText("25")).click();
	Thread.sleep(5000);

	driver.findElement(By.xpath("//div[@id='Div1']//button[@class='ui-datepicker-trigger']")).click();
		Thread.sleep(4000);
		driver.findElement(By.linkText("30")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(3000);
		List<WebElement> refobj = driver.findElements(By.xpath("//span[@class='pax-add pax-enabled']"));//class is common to all [add]
		System.out.println("number of Add buttons is: "+refobj.size());
		for (int i = 1; i<=3; i++) {
			if(i<=2) {
			driver.findElement(By.xpath("//span[@class='pax-add pax-enabled'][@id='hrefIncAdt']")).click();
			Thread.sleep(800);
			}
			driver.findElement(By.xpath("//span[@class='pax-add pax-enabled'][@id='hrefIncChd']")).click();
			Thread.sleep(800);
			driver.findElement(By.xpath("//span[@class='pax-add pax-enabled'][@id='hrefIncInf']")).click();
			Thread.sleep(800);
		 	}
		driver.findElement(By.xpath("//input[@class='buttonN'][@id='btnclosepaxoption']")).click();
		driver.findElement(By.name("ctl00$mainContent$DropDownListCurrency")).click();
		//to create reference obj for 'currency' dropdown
		WebElement refobjddn = driver.findElement(By.name("ctl00$mainContent$DropDownListCurrency"));//textbox inspect
		refobjddn.sendKeys(Keys.ARROW_DOWN);
		refobjddn.sendKeys(Keys.ARROW_DOWN);
		refobjddn.sendKeys(Keys.ENTER);
		Thread.sleep(2000);	
		driver.close();
	}	
}


//write script to select "Goa" in "From" dropdown in Spicejet home page
package WD_Examples;

import java.util.List;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class EX08_dropdownEx_addbtns {
	public static void main(String[] args) throws Exception {

		//to disable notifications
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications-");

		//to initialize the browser
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(options);
		driver.navigate().to("https://book.spicejet.com/");
		driver.manage().window().maximize();
		Thread.sleep(800);
		
		driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchVieworiginStation1_CTXT")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Goa (GOI)")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Mumbai (BOM)")).click(); //by passing attribute value remove pre-spaces or post-spaces
		Thread.sleep(1000);
		driver.findElement(By.linkText("28")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[16]/form[1]/div[2]/div[1]/div[2]/div[3]/div[1]/div[2]/div[1]/div[3]/input[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("29")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);
		List<WebElement> refobj = driver.findElements(By.xpath("//select[@style='opacity: 1;']"));//class is common to all [add]
		System.out.println("number of Add buttons is: "+refobj.size());
		/*------------below script for old i.e, audlt, child, inflant having + buttons i.e. '[+]' now application eas  updated
	for(int i=1; i<=3; i++) {
		if(i<=2){
			driver.findElement(By.xpath("//span[@class='pax-add pax-enabled'][@id='hrefIncAdt']")).click();
			Thread.sleep(800);
		}
		driver.findElement(By.xpath("//span[@class='pax-add pax-enabled'][@id='hrefIncChd']")).click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//span[@class='pax-add pax-enabled'][@id='hrefIncInf']")).click();
		Thread.sleep(800);
	} */

		driver.findElement(By.xpath("//select[@id='ctl00_mainContent_ddl_Adult'][@name='ctl00$mainContent$ddl_Adult']")).click();
		Select sc = new Select(driver.findElement(By.xpath("//select[@id='ctl00_mainContent_ddl_Adult'][@name='ctl00$mainContent$ddl_Adult']")));
		sc.selectByIndex(3);
		//sc.selectByValue("Dummy"); //Attribute value
		//sc.selectByVisibleText("Dummy"); //Text

		driver.findElement(By.xpath("//select[@name='ctl00$mainContent$DropDownListCurrency'][@id='ctl00_mainContent_DropDownListCurrency']")).click();
		//to create reference obj for 'currency' dropdown
		WebElement refobjddn = driver.findElement(By.name("ctl00$mainContent$DropDownListCurrency"));//textbox inspect
		refobjddn.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1000);
		refobjddn.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1000);
		refobjddn.sendKeys(Keys.ENTER);
		Thread.sleep(1000); 
		driver.close(); 
	}
}

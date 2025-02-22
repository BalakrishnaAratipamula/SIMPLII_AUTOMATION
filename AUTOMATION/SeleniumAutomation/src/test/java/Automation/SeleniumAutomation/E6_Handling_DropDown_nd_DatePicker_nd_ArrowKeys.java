package Automation.SeleniumAutomation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class E6_Handling_DropDown_nd_DatePicker_nd_ArrowKeys {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver(); // --RTP Concept
		driver.get("https://book.spicejet.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); //conditional wait - 'Implicit Wait'
		
		//departure city
		driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchVieworiginStation1_CTXT")).click();
		Thread.sleep(1000);
		//Goa(GOI)
		driver.findElement(By.linkText("Goa (GOI)")).click();
		Thread.sleep(1000);
		//Mumbai (BOM)
		driver.findElement(By.linkText("Mumbai (BOM)")).click();
		Thread.sleep(1000);
		//24
		driver.findElement(By.linkText("24")).click();
		Thread.sleep(1000);
		//Return date
		driver.findElement(By.xpath("//div[@class='left']/parent::div[@class='home-date-div datehome']/following::input[@id='custom_date_picker_id_2']")).click(); //(or) //input[@id='custom_date_picker_id_2']
		Thread.sleep(1000);
		//26
		driver.findElement(By.linkText("26")).click();
		Thread.sleep(1000);
		
		//Passengers
		WebElement PassengersCount = driver.findElement(By.xpath("//div[@id='divpaxinfo' and @class='paxinfo']"));
		PassengersCount.click();
		Thread.sleep(1000);
		
		//child
		WebElement ele = driver.findElement(By.cssSelector("select#ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListPassengerType_CHD"));
		ele.click();
		Thread.sleep(1000);
		
		//select '2' child by using Arrows
		ele.sendKeys(Keys.ARROW_DOWN); //1
		ele.sendKeys(Keys.ARROW_DOWN); //2
		ele.sendKeys(Keys.ENTER);
		
		//print passengers list
		System.out.println("Passengers List:  "+PassengersCount.getText());
		Thread.sleep(1000);
		
		//currency
		driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListCurrency")).click();
		Thread.sleep(1000); 
		
		//EUR
		Select select = new Select(driver.findElement(By.name("ControlGroupSearchView$AvailabilitySearchInputSearchView$DropDownListCurrency")));
		
		select.selectByVisibleText("EUR");
		
		//Search button
		driver.findElement(By.xpath("(//*[@type='submit'])[1]")).click();
		
		//get the page title
		String pageTitle = driver.getTitle();
		System.out.println("Page Title:  "+pageTitle);
		
		Thread.sleep(3000); //unconditional wait
		driver.quit();
	}
}

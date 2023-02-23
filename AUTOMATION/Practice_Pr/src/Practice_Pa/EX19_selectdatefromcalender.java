package Practice_Pa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EX19_selectdatefromcalender {
public static void main(String[] args) throws Exception {
	//To initialize browser
	System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.justdial.com/Travel/Train-Booking");
	driver.manage().window().maximize();
	
	//to click on Date field
	driver.findElement(By.id("departDate")).click();
	Thread.sleep(4000);
	//to click on 28th
	driver.findElement(By.xpath("//div[@id='ui-datepicker-div']/div/table/tbody/tr[5]/td[4]/a")).click();
}
}

package Practice_Pa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EX20futuredateselectoncalender {
public static void main(String[] args) throws Exception {
	//To initialize browser
	System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.justdial.com/Travel/Train-Booking");
	driver.manage().window().maximize();
	
	//to click on Date field
	driver.findElement(By.id("departDate")).click();
	Thread.sleep(4000);
	
	String firstMonth=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
	System.out.println("First month is: "+firstMonth);
	 if(firstMonth.equalsIgnoreCase("December")) {
		 driver.findElement(By.linkText("15")).click();
	 }
	 else {
		 do {
			 String secondMonth=driver.findElement(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-last']/div/div/span[1]")).getText();
			 System.out.println("Second month is: "+secondMonth);
			 if(secondMonth.equalsIgnoreCase("December")) {
				driver.findElement(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-last']/table/tbody/tr[3]/td[1]/a")).click();
				break;
			 }
			 else {
				 driver.findElement(By.xpath("//span[text()='Next']")).click();
				 Thread.sleep(4000);
			 }
		 }while(true);
	 }

}
}
package Practice_Pa;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EX25_working_on_HTML_Popups {
public static void main(String[] args) throws Exception {
	// initialize browser and open gmail
		System.setProperty("webdriver.gecko.driver", "E:\\Drivers\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		//to Select "MultiCity" option
		driver.findElement(By.xpath("//div[@id='travelOptions']/table/tbody/tr/td[3]/label")).click();

		Thread.sleep(5000);
		
		//to click on "OK" in popup
		driver.findElement(By.linkText("Ok")).click();
}
}

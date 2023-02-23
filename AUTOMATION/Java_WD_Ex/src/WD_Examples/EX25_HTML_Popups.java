//write ATS to click on "OK" in html popup at www.spicejet.com application when we select "multicity" option
package WD_Examples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class EX25_HTML_Popups {
	public static void main(String[] args) throws Exception {
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--disable -notification");
		// initialize browser and open gmail
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver(ops);
		driver.get("https://book.spicejet.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		//to Select "MultiCity" option
		driver.findElement(By.xpath("//div[@id='travelOptions']/table/tbody/tr/td[3]/label")).click();
		Thread.sleep(5000);

		//to click on "OK" in popup
		driver.findElement(By.linkText("Ok")).click();
		
		driver.quit();
	}
}

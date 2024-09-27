package WD_Examples;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EX10_BootstrapDD {
	public static void main(String[] args) throws Exception {
		//to initialize browser
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.automationtestinginsider.com/2019/12/bootstrap-dropdown-example_12.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0, 950)");
		Thread.sleep(8000);

		driver.findElement(By.xpath("//button[@id='bootstrapmenu']")).click();
		Thread.sleep(1000);
		
		List<WebElement> ddOptions = driver.findElements(By.xpath("//ul[@class='dropdown-menu']//li/a"));//ul - is the parent of dd ele's
		for(WebElement ddOption : ddOptions) { //for-each 					for(int i=0; i<=3; i++){}
			String str = ddOption.getText();
			System.out.println(str);
			if(str.equals("HOME")) {
				ddOption.click();
				break; 
			}
		}
		
		driver.quit();
	}
}

package WD_Examples;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class EX10_BootstrapDD {
	public static void main(String[] args) throws Exception {
		//to initialize browser
		ChromeOptions ops = new ChromeOptions();
        ops.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(ops);
		driver.navigate().to("https://www.automationtestinginsider.com/2019/12/bootstrap-dropdown-example_12.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		/*/
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0, 950)"); //*/
		Thread.sleep(5000); 
		
		WebElement ele = driver.findElement(By.xpath("//button[@id='bootstrapmenu']"));
		new Actions(driver).moveToElement(ele).perform();
		Thread.sleep(5000);
		ele.click();
		Thread.sleep(3000);
		
		List<WebElement> ddOptions = driver.findElements(By.xpath("//ul[@class='dropdown-menu']//li/a"));//ul - is the parent of dd ele's
		for(WebElement ddOption : ddOptions) { //for-each 					for(int i=0; i<=3; i++){}
			String str = ddOption.getText();
			System.out.println(str);
			if(str.equals("CONTACT US")) {
				ddOption.click();
				System.out.println(driver.getTitle());
				break; 
			}
		}
		
		Thread.sleep(5000);
//		driver.quit();
	}
}

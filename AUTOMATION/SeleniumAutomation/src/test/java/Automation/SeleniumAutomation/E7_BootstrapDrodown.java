package Automation.SeleniumAutomation;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class E7_BootstrapDrodown {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver(); // --RTP Concept
		driver.get("https://www.automationtestinginsider.com/2019/12/bootstrap-dropdown-example_12.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); //conditional wait - 'Implicit Wait'
		Thread.sleep(2000);
		
		//perform scroll-down on page
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0, 1600)"); //(Horizontal, Vertical)
		Thread.sleep(5000);
		
		//Bootstrap menu
		driver.findElement(By.cssSelector("#bootstrapmenu")).click();
		
		//get Bootstrap dd options count
		List<WebElement> options = driver.findElements(By.xpath("//*[@class='dropdown-menu']/li/a")); //XPath common for all options
		System.out.println("BSDD Options count:  "+options.size());
		
		//printing options text
		for(WebElement option: options) {
			String optionText = option.getText();
			System.out.println(optionText);
			if(optionText.equals("CONTACT US")) {
				option.click();
				System.out.println("Option "+optionText+" is clicked");
				break; //once it reached the desired value the loop has to terminate
			}
		}
		
		Thread.sleep(3000); //unconditional wait
		driver.quit();
	}
}

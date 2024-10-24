package WD_Examples;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EX39b_Read_Tooltip_SVG_eles_Headless{
	public static void main(String[] args) throws InterruptedException {
		//Headless mode
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless");	//--headless=new //--headless=chrome
		//(OR) options.addArguments("--headless", "--disable-gpu", "--window-size=1920,1200", "--ignore-certificate-errors");
		WebDriver driver= new ChromeDriver(options);
		//*/
		//WebDriverManager.chromedriver().setup();
//		WebDriver driver= new ChromeDriver();
		driver.navigate().to("https://emicalculator.net/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0, 900)", "");
		
		String barsXPath = "//*[local-name()='svg']//*[name()='g' and @class='highcharts-series-group']//*[name()='g']//*[name()='rect']"; 
		String tooltip = "//*[local-name()='svg']//*[name()='g' and @class='highcharts-label highcharts-tooltip highcharts-color-undefined']//*[name()='text']";
		
		Thread.sleep(2000);
		
		List<WebElement> bars = driver.findElements(By.xpath(barsXPath));
		
		System.out.println("Total Bars:  "+bars.size());
		
		Actions act = new Actions(driver);
		
		for(WebElement ele: bars) {
			act.moveToElement(ele).perform();
			Thread.sleep(500);
			WebElement tooltiplist = driver.findElement(By.xpath(tooltip));
			String tooltipMsg = tooltiplist.getText();
			System.out.println(tooltipMsg);
		}
		
		driver.quit();
	}
}

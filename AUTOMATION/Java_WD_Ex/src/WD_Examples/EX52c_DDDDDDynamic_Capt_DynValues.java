package WD_Examples;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EX52c_DDDDDDynamic_Capt_DynValues {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.navigate().to("https://www.worldometers.info/world-population/");
		driver.manage().window().maximize();

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 400)", "");

		String currentWorldPopulationXPath = "//*[@class='maincounter-number']/*[@class='rts-counter']";
		String today_PopulationXPath = "//div[text()='Today']/parent::div//span[@class='rts-counter']"; 
		String thisYear_PopulationXPath = "//*[text()='This year']/parent::div//span[@class='rts-counter']"; 
		String todayAndthisYear_PopulationXPath = "//div[text()='Today' or text()='This year']/parent::div//span[@class='rts-counter']"; //(OR)"//div[contains(@class,'sec-box')]/div[2]";  
		
		int count = 1;
		while (true) {
			if (count == 21)  break; 
			System.out.println("at " + count + " sec");
			System.out.println("-----Current World Population Count-----");
			printPopulationDate(currentWorldPopulationXPath);
			System.out.println("-----Today and This Year Population Count-----");
			printPopulationDate(todayAndthisYear_PopulationXPath); //today_PopulationXPath //thisYear_PopulationXPath
			System.out.println("=============================================");
			count++;
		}
		
		driver.quit();
	}

	public static void printPopulationDate(String populationXPath) throws InterruptedException {
		List<WebElement> populationList = driver.findElements(By.xpath(populationXPath));

		for (WebElement _poulation : populationList) {
			System.out.println(_poulation.getText());
			Thread.sleep(200);
		}
	}
}

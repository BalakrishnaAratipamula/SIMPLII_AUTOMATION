package WD_Examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class EX36_Drag_And_Drop {
	public static void main(String[] args) throws Exception {
		// To initialize browser
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();

		//create reference object for WebElements
		driver.switchTo().frame(0); //by index

		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));
		Thread.sleep(2500);

		//create object for action class
		Actions act = new Actions(driver);

		//to perform Drag & Drop
		act.dragAndDrop(source, target).build().perform(); //WebElement source (ele1), WebElement target(ele1)

		Thread.sleep(2500);
		driver.quit();
	}
}

package WD_Examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class EX36b_ClickAndHold {
	public static void main(String[] args) throws Exception {
		// To initialize browser
		WebDriver driver = new ChromeDriver();
		driver.get("https://testkru.com/Interactions/DragAndDrop");
		driver.manage().window().maximize();

		WebElement ele = driver.findElement(By.id("box1"));
		System.out.println("Element Text before holding: "+ele.getText());
		
		Actions actions = new Actions(driver);
		actions.clickAndHold(ele).pause(800).build().perform();

		Thread.sleep(2500);
		System.out.println("Element Text after holding: "+ele.getText());
		
		Thread.sleep(2500);
		driver.quit();
	}
}

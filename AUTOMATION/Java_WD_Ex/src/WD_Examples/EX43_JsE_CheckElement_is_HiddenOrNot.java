package WD_Examples;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EX43_JsE_CheckElement_is_HiddenOrNot {
	// how to find hidden elements --------- https://youtu.be/2eEr0jtmpwE
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://www.letskodeit.com/practice");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Getting 'Edit Box' coordinates Before click on [Hide]
		GenericMethodToGetElementCoordinatesAndPrintInConsole("Before");
		driver.findElement(By.id("hide-textbox")).click(); //clck on [Hide]
		//Getting 'Edit Box' coordinates After click on [Hide]
		GenericMethodToGetElementCoordinatesAndPrintInConsole("After");
		
		/*/getting Hidden Elements (Approach 1)-- It is lengthy approach
		List<WebElement> elements = driver.findElements(By.cssSelector("[name='show-hide']")); // 'Edit Box'
		int count = elements.size();
		System.out.println("total Hidden elemnts  " + count);
		for (int i = 0; i < count; i++) {
			WebElement ele = elements.get(i);
			int X = ele.getLocation().getX();
			int Y = ele.getLocation().getY();
			System.out.println("At the time of iteration:  " + " X value = " + X + " Y value = " + Y);
			if (X != 0 && Y != 0) { // x!=0 means that particular webElement is displaying on page
				ele.click();
				break;
			} else {
				System.out.println("Element not displaying on web page!");
			}
		} //*/
		
		//getting Hidden Elements (Approach 2) -- It is simple approach
		try {
			WebElement ele = driver.findElement(By.cssSelector("[name='show-hide']"));
			ele.click();
			System.out.println("Element is displaying on Web Page and clicked on element:  ");
		} catch (ElementNotInteractableException e) {
			System.out.println("Element is not displaying on Web Page:  " + e.getMessage());
		}
		
		Thread.sleep(5000);
		driver.quit();
	}
	
	public static void GenericMethodToGetElementCoordinatesAndPrintInConsole(String activityBeforeOrAfterHideBtnClick) {
		// 'Edit Box'
		// if result get 0 0 bcz element is not currently visible
		WebElement editBox = driver.findElement(By.cssSelector("[name='show-hide']"));
		int x = editBox.getLocation().getX();
		int y = editBox.getLocation().getY();
		System.out.println("X cord "+activityBeforeOrAfterHideBtnClick+" click on [Hide]:  " + x);
		System.out.println("Y cord "+activityBeforeOrAfterHideBtnClick+" click on [Hide]:  " + y);
	}
}

package Automation.SeleniumAutomation;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class E42_CheckElement_is_HiddenOrNot {
	static WebDriver driver;
	public static void main(String[] args) throws IOException, InterruptedException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.letskodeit.com/practice");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Getting 'Edit Box' coordinates Before click on [Hide]
		genericMethodToGetElementCoordinatesAndPrintInConsole("Before");
		//click on [Hide]
		driver.findElement(By.cssSelector("#hide-textbox")).click();
		//Getting 'Edit Box' coordinates After click on [Hide]
		genericMethodToGetElementCoordinatesAndPrintInConsole("After");
		
		/*/getting Hidden Elements (Approach 1)-- It is lengthy approach
		List<WebElement> elements = driver.findElements(By.cssSelector("[name='show-hide']"));
		int count = elements.size();
		System.out.println("Total Hidden Elements:  "+count);
		for(int i=0; i<count; i++) {
			WebElement ele = elements.get(i);
			int X = ele.getLocation().getX();
			int Y = ele.getLocation().getY();
			System.out.println("X cord:  "+X+" <==> Y cord:  "+Y);
			if(X!=0 && Y!=0) { //'X=0 && Y=0' means Element is not displaying on Web Page
				ele.click();
				break;
			} else {
				System.out.println("Element is not displaying on Web Page");
			}
		} //*/
		
		//getting Hidden Elements (Approach 2) -- It is simple approach
		try {
			WebElement ele = driver.findElement(By.cssSelector("[name='show-hide']"));
			ele.click();
			System.out.println("Element is displaying on Web Page and clicked on element:  ");
		} catch(ElementNotInteractableException e) {
			System.out.println("Element is not displaying on Web Page:  "+e.getMessage());
		}
		
		Thread.sleep(5000);
		driver.quit();
	}

	//GenericMethodToGetElementCoordinatesAndPrintInEclipseConsole
	public static void genericMethodToGetElementCoordinatesAndPrintInConsole(String activityBeforeOrAfterHideButtonClick) {
		//Edit Box
		//If result is 0 0 then element is not visible/displaying in the web page
		WebElement editBox = driver.findElement(By.cssSelector("[name='show-hide']"));
		int X = editBox.getLocation().getX();
		int Y = editBox.getLocation().getY();
		
		System.out.println("X cord "+activityBeforeOrAfterHideButtonClick+" click on [Hide]:  "+X);
		System.out.println("Y cord "+activityBeforeOrAfterHideButtonClick+" click on [Hide]:  "+Y);
	}
}

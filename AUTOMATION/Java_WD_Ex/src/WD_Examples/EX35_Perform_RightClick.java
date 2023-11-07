package WD_Examples;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EX35_Perform_RightClick {
	public static void main(String[] args) throws Exception {
		// To initialize browser
		System.setProperty("webdriver.gecko.driver", "E:\\Drivers\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().window().maximize();
		
		
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	//Deprecated in Selenium 3
		
		// Explicit wait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));  //Bcz of Deprecation we use this cmd
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='right click me']")));
		
		

		//create reference object for Button
		WebElement button = driver.findElement(By.xpath("//span[text()='right click me']")); /////span[contains(text(),'right click me')]

		//create object for actions class
		Actions act = new Actions(driver);

		act.moveToElement(button).contextClick().build().perform(); //moveToElement(reff obj) & contextClick()-for right click
		Thread.sleep(5500);

		//to click on "Paste"
		driver.findElement(By.xpath("//span[text()='Paste']")).click();
		Thread.sleep(1000);
        
		//to read msg from alert window
		String msg = driver.switchTo().alert().getText();
		System.out.println("Alert window msg is:     "+msg);
		//to close alert window
		driver.switchTo().alert().accept();

		// Selenium 4 new features
        WebElement clickable = driver.findElement(By.id("clickable"));
        new Actions(driver)
                .moveToElement(clickable)
                .pause(Duration.ofSeconds(1))
                .clickAndHold()
                .pause(Duration.ofSeconds(1))
                .sendKeys("abc")
                .perform();

     // Find an element above the reference element
     WebElement referenceElement = driver.findElement(By.id("referenceElement"));
     WebElement elementAbove = driver.findElement(withTagName("input").above(referenceElement));

     // Find an element to the right of the reference element
     WebElement elementToRight = driver.findElement(withTagName("button").toRightOf(referenceElement));

		
	}
}

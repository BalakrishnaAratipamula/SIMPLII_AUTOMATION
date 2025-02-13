//Write script to click on "org.openqa.selenium" link which is exist in a Frame
package WD_Examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EX31_frame_click {
	public static void main(String[] args) throws Exception {
		//to initialize browser
		WebDriver driver= new ChromeDriver();
		driver.get("https://seleniumhq.github.io/selenium/docs/api/java/index.html");
		driver.manage().window().maximize();

		//to click on frames Tab in application
		driver.findElement(By.xpath("//header/nav[1]/div[1]/div[2]/ul[1]/li[1]/a[1]")).click();
		Thread.sleep(2000);
		//switch to frame
		driver.switchTo().frame(2); //While working with frames to navigate which frame u have to enter 
		//to click on org.openqa.selenium
		driver.findElement(By.linkText("org.openqa.selenium")).click();

		driver.quit();

	}
}
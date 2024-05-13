package WD_Examples;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;

public class EX01d_BrowserCmds_setPosition_setSize {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		
		driver.manage().deleteAllCookies();
		
		Dimension dim = new Dimension(500, 500);
		driver.manage().window().setSize(dim);
		Thread.sleep(2000);
		
		Point pt = new Point(250, 250);
		driver.manage().window().setPosition(pt);
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		
	}
}

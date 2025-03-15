package Automation.SeleniumAutomation;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class E39_CapturingFullPageScreenshot_using_Ashot {
	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://github.com/pazone/ashot");
		driver.manage().window().maximize();
		
		try {
			Screenshot s=new AShot()
					.shootingStrategy(ShootingStrategies.viewportPasting(100))
					.takeScreenshot(driver);
	        ImageIO.write(s.getImage(),"PNG",new File("./fullPageScreenshot.png"));
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		Thread.sleep(5000);
		driver.quit();
	}
}

package WD_Examples;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class EX40b_FullPageScreenshot_Using_AShot {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://github.com/pazone/ashot"); // AShot dependency path
		driver.manage().window().maximize();
		Thread.sleep(2000);

		// Take_FullPage_Screenshot ######################
		Screenshot screenshot = new AShot()
				.shootingStrategy(ShootingStrategies.viewportPasting(100)) // scrollTimeot -
				.takeScreenshot(driver);
		try {
			ImageIO.write(screenshot.getImage(), "jpg", new File("./fullImage.jpg")); // (gettingImage, formatName,
		} catch (IOException e) {
			e.printStackTrace();
		}

		driver.quit();
	}

}

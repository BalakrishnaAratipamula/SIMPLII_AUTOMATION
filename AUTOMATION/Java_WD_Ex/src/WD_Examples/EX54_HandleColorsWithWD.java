package WD_Examples;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class EX54_HandleColorsWithWD {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://blazedemo.com");
		driver.manage().window().maximize();

		WebElement ele = driver.findElement(By.xpath("//body/div[3]/form[1]/div[1]/input[1]"));
		String backcolor = ele.getCssValue("background-color"); //inpecting window--> Styles--> scrool down for 'background-color' bec i want bg colour
		System.out.println(backcolor);

		String hexBackColor = Color.fromString(backcolor).asHex();
		System.out.println(hexBackColor);

		if(hexBackColor.equals("#006dcc")) {
			System.out.println("BLUE");
		}
		else {
			System.out.println("other colour displayed");
		}
		Thread.sleep(1000);
		
		driver.quit();
	}

}

package WD_Examples;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;
///Best practice for 'Tooltip'
// @How to automate charts using xpath? Need to extract the value from pie chart with appropriate legend and compare with backend?
public class EX74_Automate_Charts_Using_XPath_TooltipMsgRead {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://yuilibrary.com/yui/docs/charts/charts-pie.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
		// Locate pie chart elements based on different colors.
		WebElement VioleteColor = driver.findElement(By.xpath("//*[contains(@class,'yui3-svgSvgPieSlice')][@fill='#66007f']"));
		WebElement GreenColor = driver.findElement(By.xpath("//*[contains(@class,'yui3-svgSvgPieSlice')][@fill='#295454']"));
		WebElement GreyColor = driver.findElement(By.xpath("//*[contains(@class,'yui3-svgSvgPieSlice')][@fill='#e8cdb7']"));
		WebElement LightVioleteColor = driver.findElement(By.xpath("//*[contains(@class,'yui3-svgSvgPieSlice')][@fill='#996ab2']"));
		WebElement BrownColor = driver.findElement(By.xpath("//*[contains(@class,'yui3-svgSvgPieSlice')][@fill='#a86f41']"));

		// locate tooltip pie chart.
		WebElement ToolTip = driver.findElement(By.xpath("//div[contains(@id,'_tooltip')]"));

		Actions act = new Actions(driver);
		
		// Click on pie chart parts and get tooltip values.
		System.out.println("-X-X-X-X-X-X-X-X- Violete Part -X-X-X-X-X-X-X-X-");
		act.moveToElement(VioleteColor).click(VioleteColor).perform();
		System.out.println(ToolTip.getText());
		System.out.println();

		System.out.println("-X-X-X-X-X-X-X-X- Grey Part -X-X-X-X-X-X-X-X-");
		act.moveToElement(GreyColor).click(GreyColor).perform();
		System.out.println(ToolTip.getText());
		System.out.println();
		
		System.out.println("-X-X-X-X-X-X-X-X- Light Violete Part -X-X-X-X-X-X-X-X-");
		act.moveToElement(LightVioleteColor).click(LightVioleteColor).perform();
		System.out.println(ToolTip.getText());
		System.out.println();

		System.out.println("-X-X-X-X-X-X-X-X- Green Part -X-X-X-X-X-X-X-X-");
		act.moveToElement(GreenColor).click(GreenColor).perform();
		GreenColor.click();
		System.out.println(ToolTip.getText());
		System.out.println();

		System.out.println("-X-X-X-X-X-X-X-X- Brown Part -X-X-X-X-X-X-X-X-");
		act.moveToElement(BrownColor).click(BrownColor).perform();
		System.out.println(ToolTip.getText());

		Thread.sleep(3000);
		driver.quit();
	}
}

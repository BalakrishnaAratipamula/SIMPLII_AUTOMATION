package SVG_ElementsHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class E1_HandlingSVG_Elements {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		//URL 1 - https://www.w3docs.com/tools/editor/4472
		driver.findElement(By.xpath("//*[name()='svg']//*[name()='rect']"));
		driver.findElement(By.xpath("//*[local-name()='svg']//*[local-name()='rect']"));
		driver.findElement(By.xpath("//*[name()='svg']//*[name()='circle']"));
		driver.findElement(By.xpath("//*[name()='svg']//*[name()='polygon']"));
		
		//URL 1 - file:///F:/Svg.html
		driver.findElement(By.xpath("//*[name()='rect' and @id='rec_001']"));
		driver.findElement(By.xpath("//*[name()='rect' and @name='rec_name']"));
		driver.findElement(By.xpath("//*[name()='rect' and @class='rec_class']"));
	}
}

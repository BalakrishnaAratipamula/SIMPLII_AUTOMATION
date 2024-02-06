package WD_Examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EX57_XPathAxes {	
///// https://youtu.be/BYIit7MV6cs?si=yzvSoYQqD_4Zq0yf	 ////SimpleWay//// https://youtu.be/aAWvwGFkySI?si=CHi2WlTaslzwQkky
	public static void main(String args[]) {

		System.setProperty("webdriver.gecko.driver", "E:\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///F:/XAxes.html");
		driver.manage().window().maximize();

		// AND 
		driver.findElement(By.xpath("//*[@id='twotabsearchtextbox' and @type='text']"));
		
		// OR 
		driver.findElement(By.xpath("//*[@id='twotabsearchtextbox' or @type='text']"));
		driver.findElement(By.xpath("//*[@id='twotabsearchtextbox'] | //*[@type='text']"));
		
		// parent - Navigate Child to Parent element
		driver.findElement(By.xpath("//div[@class='Crustacean']/.."));	///parent will navigate
		driver.findElement(By.xpath("//div[@class='Crustacean']/../.."));	///parent-of-parent will navigate
		driver.findElement(By.xpath("//div[@class='Crustacean']/../../.."));	///parent-of-parent-of-parent will navigate
		
		driver.findElement(By.xpath("//div[@class='Crustacean']/parent::div"));	/// (child_ele_XPath)/parent::parent_TagName)
		driver.findElement(By.xpath("//h3[text()='Invertebrate']/parent::div")); /// SAA
		driver.findElement(By.xpath("//h3[text()='Invertebrate']/parent::*")); /// SAA
		
		// child - Navigate Parent to Child element
		driver.findElement(By.xpath("//div[@class='Mammal']/child::h4"));	/// (parent_ele_XPath)/child::child_TagName)
		driver.findElement(By.xpath("//div[@class='Mammal']/child::*"));	/// SAA
		
		// Single slash ( / ) 
		driver.findElement(By.xpath("//div[@class='Mammal']/div"));		/// navigate all 'div' child tags of that parent (don't consider child-of-child tags)
		
		// Double slash ( // )
		driver.findElement(By.xpath("//div[@class='Carnivore']//h6"));	/// navigate all 'h6' child tags and child-of-child 'h6' tags of that parent (consider child-of-child tags also)(Manual count: will be after expanding all child tags)
		driver.findElement(By.xpath("//div[@class='Animal']//h4"));
		
		/////////////// XPath Axes \\\\\\\\\\\\\\\\
		// Following-sibling
		driver.findElement(By.xpath("//h3[text()='Vertebrate']/following-sibling::div"));	// following - next	(don't consider sibling-child tags)
		driver.findElement(By.xpath("//div[@class='Fish']/following-sibling::div[2]"));
		
		// Preceding-sibling
		driver.findElement(By.xpath("//div[@class='Other']/preceding-sibling::div[1]"));	// preceding - previous (don't consider sibling-child tags)
		driver.findElement(By.xpath("//div[@class='Other']/preceding-sibling::h3"));
		
		// Ancestor
		driver.findElement(By.xpath("//h4[text()='Mammal']/ancestor::div"));  // assume: 7 // parent, parent-of-parent, parent-of-parent, etc for 'div' tags upto root node (html)
		driver.findElement(By.xpath("//div[@class='Mammal']/ancestor::div"));
		driver.findElement(By.xpath("//div[@class='Mammal']/ancestor::*"));		// parent, parent-of-parent, parent-of-parent, etc for 'all' tags upto root node (html)
		
		//Descendent
		driver.findElement(By.xpath("//div[@class='Vertebrate']/descendant::div"));	 // assume:7 // all child, child-of-child, etc
		driver.findElement(By.xpath("//div[@class='Invertebrate']/descendant::div"));  // assume:2
		driver.findElement(By.xpath("//div[@class='Carnivore']/descendant::div"));
		driver.findElement(By.xpath("//div[@class='Mammal']/ancestor::*"));
		
		// Following
		driver.findElement(By.xpath("//div[@class='Animal']/following::div"));	//This indicates all the nodes (parent, child, child-of-child, etc) that appear after the context node (also include same level nodes (p, c, coc, etc))
		driver.findElement(By.xpath("//div[@class='Fish']/following::div"));
		driver.findElement(By.xpath("//h5[text()='Carnivore']/following::div"));
		driver.findElement(By.xpath("//h3[text()='Invertebrate']/following::div"));
		driver.findElement(By.xpath("//h3[text()='Invertebrate']/following::*"));
		driver.findElement(By.xpath("//div[@class='Other']/following::div"));
		
		// Preceding 
		driver.findElement(By.xpath("//div[@class='Crustacean']/preceding::div"));	// preceding - previous (consider siblings of this child tag, child-of-child tags, ignore this parent only & include this parent sibling tags, sibling child tags)
		driver.findElement(By.xpath("//div[@class='Invertebrate']/preceding::div"));
		driver.findElement(By.xpath("//h3[text()='Invertebrate']/preceding::div"));
		driver.findElement(By.xpath("//h4[text()='Other']/preceding::div"));
		driver.findElement(By.xpath("//div[@class='Crustacean']/preceding::div"));
		driver.findElement(By.xpath("//div[@class='Carnivore']/preceding::div"));
		
		// Ancestor-or-self
		driver.findElement(By.xpath("//div[@class='Lion']/ancestor-or-self::div"));  // self, parent, parent-of-parent, parent-of-parent, etc for 'div' tags upto root node (html)
		driver.findElement(By.xpath("//h4[text()='Mammal']/ancestor-or-self::div"));  // assume: 7	
		
		// Descendent-or-self
		driver.findElement(By.xpath("//div[@class='Vertebrate']/descendant-or-self::div"));	 // assume:8 // self, all child, child-of-child, etc
		driver.findElement(By.xpath("//div[@class='Invertebrate']/descendant-or-self::div"));  // assume:3
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}
}

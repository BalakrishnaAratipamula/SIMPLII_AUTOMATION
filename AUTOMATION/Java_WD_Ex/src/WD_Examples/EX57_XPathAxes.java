package WD_Examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EX57_XPathAxes {	
///// https://youtu.be/BYIit7MV6cs?si=yzvSoYQqD_4Zq0yf	 ////SimpleWay//// https://youtu.be/aAWvwGFkySI?si=CHi2WlTaslzwQkky
	public static void main(String args[]) {

		WebDriver driver = new FirefoxDriver();
		driver.get("file:///F:/XAxes.html");
		driver.manage().window().maximize();

		// AND 
		driver.findElement(By.xpath("//*[@class='Animal' and @align='center']"));
		
		// OR 
		driver.findElement(By.xpath("//*[@class='Animal' or @align='center']"));
		driver.findElement(By.xpath("//self::h6"));	//All 'h6' tags will return
		
		// Single slash ( / ) --- //if we want to navigate to child we will use '/'
		driver.findElement(By.xpath("//div[@class='Mammal']/div"));  ///navigate all 'div' child tags of that parent (don't consider c-o-c tags)
				
		// Double slash ( // ) --- ///if we want to navigate child and direct c-o-c we will use '//'
		driver.findElement(By.xpath("//div[@class='Carnivore']//h6"));  ///navigate all 'h6- child tags' and 'c-o-c -h6' tags of that parent (consider child-of-child tags also)(Manual count: will be after expanding all child tags)
		driver.findElement(By.xpath("//div[@class='Animal']//h4"));  ///navigate direct c-o-c
				
		/////////////// XPath Axes \\\\\\\\\\\\\\\\
		
		//self - return self tag
		driver.findElement(By.xpath("//*[@class='Fish']/self::div"));
		driver.findElement(By.xpath("//*[@class='Fish']/self::div"));
		
		// parent - Navigate Child to Parent element
		driver.findElement(By.xpath("//div[@class='Crustacean']/.."));  ///Parent will navigate
		driver.findElement(By.xpath("//div[@class='Crustacean']/../.."));  ///Grand parent (p-o-p) will navigate
		driver.findElement(By.xpath("//div[@class='Crustacean']/../../.."));  ///Great grand parent (p-o-p-o-p) will navigate
		
		driver.findElement(By.xpath("//div[@class='Crustacean']/parent::div"));  ///(child_ele_XPath)/parent::parent_TagName)
		driver.findElement(By.xpath("//div[@class='Crustacean']/parent::*"));  ///* - will return parent of the child
		
		// child - Navigate Parent to Child element
		driver.findElement(By.xpath("//div[@class='Mammal']/child::h4"));  ///(parent_ele_XPath)/child::child_TagName)
		driver.findElement(By.xpath("//div[@class='Mammal']/child::*"));  ///* - will return all child tags of the parent
		
		// Following-sibling
		driver.findElement(By.xpath("//h3[text()='Vertebrate']/following-sibling::div"));  //following - next (below ele) (don't consider sibling-child tags)
		driver.findElement(By.xpath("//div[@class='Fish']/following-sibling::div[2]"));
		
		// Preceding-sibling
		driver.findElement(By.xpath("//div[@class='Other']/preceding-sibling::div[1]"));  //preceding - previous (above ele) (don't consider sibling-child tags)
		driver.findElement(By.xpath("//div[@class='Other']/preceding-sibling::h3"));
		
		// Ancestor
		driver.findElement(By.xpath("//h6[text()='Tiger']/ancestor::div"));  //All ancestor nodes: parent, grand parent's (p-o-p's), etc of 'div' tags till root node (html)
		driver.findElement(By.xpath("//h6[text()='Tiger']/ancestor::*"));  //All ancestor nodes: parent, grand parent's (p-o-p's), etc of 'all' tags till root node (html)
		
		// Ancestor-or-self
		driver.findElement(By.xpath("//div[@class='Lion']/ancestor-or-self::div"));  // self, parent, parent-of-parent, parent-of-parent, etc for 'div' tags upto root node (html)
		driver.findElement(By.xpath("//h4[text()='Mammal']/ancestor-or-self::div"));  
		
		// Descendent
		driver.findElement(By.xpath("//div[@class='Vertebrate']/descendant::div"));  //All descendant nodes: child, grand child(c-o-c's), etc for 'div' tags
		driver.findElement(By.xpath("//div[@class='Invertebrate']/descendant::div"));  
		driver.findElement(By.xpath("//div[@class='Carnivore']/descendant::div"));
		driver.findElement(By.xpath("//div[@class='Carnivore']/descendant::*")); //All descendant nodes: child, grand child(c-o-c's), etc for 'all' tags
		
		// Descendent-or-self
		driver.findElement(By.xpath("//div[@class='Vertebrate']/descendant-or-self::div"));	 // self, all child, child-of-child, etc
		driver.findElement(By.xpath("//div[@class='Invertebrate']/descendant-or-self::div"));  
				
		// Following
		driver.findElement(By.xpath("//div[@class='Fish']/following::div")); //following- next (below ele) -This indicates all the nodes (parent, child, c-o-c, etc) that appear after the context node (also include same level nodes (p, c, coc, etc))
		driver.findElement(By.xpath("//h5[text()='Carnivore']/following::div"));
		driver.findElement(By.xpath("//h3[text()='Invertebrate']/following::div"));
		driver.findElement(By.xpath("//h3[text()='Invertebrate']/following::*"));
		driver.findElement(By.xpath("//div[@class='Other']/following::div"));
		
		// Preceding 
		driver.findElement(By.xpath("//div[@class='Crustacean']/preceding::div"));  // preceding - previous (above ele) (consider siblings of this child tag, child-of-child tags, ignore this parent only & include this parent sibling tags, sibling child tags)
		driver.findElement(By.xpath("//div[@class='Invertebrate']/preceding::div"));
		driver.findElement(By.xpath("//h3[text()='Invertebrate']/preceding::div"));
		driver.findElement(By.xpath("//h4[text()='Other']/preceding::div"));
		driver.findElement(By.xpath("//div[@class='Crustacean']/preceding::div"));
		driver.findElement(By.xpath("//div[@class='Carnivore']/preceding::div"));
		
		
		

	}
}

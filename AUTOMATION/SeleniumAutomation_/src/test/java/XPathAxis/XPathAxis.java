package XPathAxis;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathAxis {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		//And
		driver.findElement(By.xpath("//div[@class='Vertebrate' and @align='left']"));
		
		//OR
		driver.findElement(By.xpath("//div[@class='Vertebrate' or @align='left']"));
		driver.findElement(By.xpath("//div[@class='Vertebrate'] | //div[@align='left']"));
		
		//Single slash (/) //if we want to navigate to child tag we have to use '/'
		driver.findElement(By.xpath("//div[@class='Mammal']/div"));
		
		//Double slash (//) //if we want to navigate to child and child-of-child tags we have to use '//'
		driver.findElement(By.xpath("//div[@class='Mammal']/div"));
				
		//XPath Axis
		
		//self
		driver.findElement(By.xpath("//*[@class='Fish']/self::div"));
		driver.findElement(By.xpath("//self::h6"));
		
		//parent - Navigate parent element from child element
		driver.findElement(By.xpath("//div[@class='Crustacean']/..")); //Parent will return
		driver.findElement(By.xpath("//div[@class='Crustacean']/../..")); //Grandparent will return
		driver.findElement(By.xpath("//div[@class='Crustacean']/../../..")); //Great grandparent will return
		
		driver.findElement(By.xpath("//div[@class='Crustacean']/parent::div")); //(child_ele_XPaath)/parent::tagName
		driver.findElement(By.xpath("//div[@class='Crustacean']/parent::*")); //* - will return parent of the child
		
		//child - Navigate child element from parent element
		driver.findElement(By.xpath("//div[@class='Invertebrate']/child::h3")); //(parent_ele_XPaath)/child::tagName
		driver.findElement(By.xpath("//div[@class='Invertebrate']/child::*")); //* - will return all child's of the parent
		
		//following-sibling
		driver.findElement(By.xpath("//h3[text()='Vertebrate']/following-sibling::div")); //Following - next (below element)
		driver.findElement(By.xpath("//div[@class='Fish']/following-sibling::div[2]"));
		
		//preceding-sibling
		driver.findElement(By.xpath("//div[@class='Other']/preceding-sibling::div[1]")); //Preceding - previous (above element)
		driver.findElement(By.xpath("//div[@class='Fish']/following-sibling::div[2]"));
		
		//Ancestor
		driver.findElement(By.xpath("//h6[text()='Tiger']/ancestor::div")); //Capture all the Ancestor nodes: Parent, grandparent's (p-o-p's), etc of 'div' tags till root node 
		driver.findElement(By.xpath("//h6[text()='Tiger']/ancestor::*")); //Capture all the Ancestor nodes: Parent, grandparents (p-o-p's), etc of 'all' tags till root node 
		
		//Ancestor-or-self
		driver.findElement(By.xpath("//h6[text()='Lion']/ancestor-or-self::div")); //self, parent, grandparent's (p-o-p's)
		driver.findElement(By.xpath("//h4[text()='Mammal']/ancestor-or-self::div"));
		driver.findElement(By.xpath("//h6[text()='Lion']/ancestor-or-self::*"));
		
		//Descendant
		driver.findElement(By.xpath("//div[@class='Vertebrate']/descendant::div")); //Capture all the Descendant nodes: child, grandchild's (c-o-c's), etc of 'div' tags till root node
		driver.findElement(By.xpath("//div[@class='Invertebrate']/descendant::div")); 
		driver.findElement(By.xpath("//div[@class='Carnivore']/descendant::div")); 
		driver.findElement(By.xpath("//div[@class='Carnivore']/descendant::*"));
		
		//Descendant-or-self
		driver.findElement(By.xpath("//div[@class='Vertebrate']/descendant-or-self::div")); //self, child, grandchild's (c-o-c's)
		driver.findElement(By.xpath("//div[@class='Invertebrate']/descendant-or-self::div"));
		
		//following
		driver.findElement(By.xpath("//div[@class='Fish']/following::div")); //sibling relationship is not mentioned so it will navigate to all tags till 'end' tag
		driver.findElement(By.xpath("//h5[text()='Carnivore']/following::div"));
		driver.findElement(By.xpath("//h3[text()='Invertebrate']/following::div"));
		driver.findElement(By.xpath("//h3[text()='Invertebrate']/following::*"));
		
		//preceding
		driver.findElement(By.xpath("//div[@class='Crustacean']/preceding::div")); //sibling relationship is not mentioned so it will navigate to all tags till 'root' tag. It will ignore parent tag for the specifyong eleemnt
		driver.findElement(By.xpath("//div[@class='Invertebrate']/preceding::div"));
		driver.findElement(By.xpath("//div[@class='Invertebrate']/preceding::div"));
		driver.findElement(By.xpath("//div[@class='Carnivore']/preceding::div"));
		
		
		
		
		
		
		
		
		
		
	}
}

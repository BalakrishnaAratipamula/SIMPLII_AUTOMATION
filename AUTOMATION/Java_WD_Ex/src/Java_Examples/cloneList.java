// Program to clone a List in Java
package Java_Examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class cloneList {
	public static void main(String[] args) { 
		// Create a list 
		List<String> original = Arrays.asList("GeeksForGeeks", "A Computer Science", "Portal"); 
		// Clone the list 
		List<String> cloned_list = new ArrayList<String>(original); 

		System.out.println(original); 
	} 
}
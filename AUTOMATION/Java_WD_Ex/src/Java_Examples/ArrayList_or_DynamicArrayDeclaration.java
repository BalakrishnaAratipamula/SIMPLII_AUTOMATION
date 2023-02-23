package Java_Examples;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList_or_DynamicArrayDeclaration {
	public static void main(String args[]){  ///////-------------------------indexOf(3)
		
		ArrayList<String> list = new ArrayList<String>(Arrays.asList("Ravi","Vijay","Mani","Ajay","Lakshmi"));
		//(or)
		/*/add()----->to assign values
		ArrayList<String> list = new ArrayList<String>();//Creating ArrayList    
		list.add("Ravi");//Adding object in ArrayList    
		list.add("Vijay");    
		list.add("Mani");    
		list.add("Ajay");
		list.add("Lakshmi");
		//to print ArrayList values 
		System.out.print(list);
		System.out.println("\n");

		//size()----->To find number of values in Array list
		System.out.println(list.size());
		System.out.println("\n");

		//get(index)----->get value by index
		System.out.print(list.get(1));
		System.out.println("\n");
		
		//indexOf("String")----->get index by value
		System.out.print(list.indexOf("Mani"));
		System.out.println("\n");

		//add()----->to assign value
		list.add("Raviiiiiiiiii");
		System.out.print(list);
		System.out.println("\n");	
		
		//set(index,new value);-----> To change or overwrite value
		System.out.print(list);
		System.out.println();	
		//To replace index1 to vijayyyyyyy
		list.set(1, "vijayyyyyyy");
		System.out.print(list);
		System.out.println("\n");	

		//remove(index)--------->Remove the element or value
		System.out.print(list);
		System.out.println();
		list.remove(1); ///(or) remove(element)
		System.out.print(list);
		System.out.println("\n"); 

		//clear()--------->clear all the elements or values
		System.out.print(list);
		System.out.println();
		list.clear();
		System.out.print(list);	*/
	}   
}  





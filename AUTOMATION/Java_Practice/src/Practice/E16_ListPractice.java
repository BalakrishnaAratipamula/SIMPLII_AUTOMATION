package Practice;

import java.util.ArrayList;
import java.util.List;

public class E16_ListPractice {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();

		list.add("Apple");
		list.add("Mango");
		list.add("Grape");
		list.add("Banana");

		//printing the List
		System.out.println("List of fruits: "+list);
		
		//accessing element by index
		System.out.println("Accessing element by index: "+list.get(2));
		
		//Modifying list element
		list.set(1, "Watemellon");
		System.out.println("List of fruits after modify value in list: "+list);
		
		//Remove element from the List
		list.remove("Grape");
		System.out.println("List of fruits after remove elemnt from list: "+list);
		
		//checking whether specifying element is present
		boolean containApple = list.contains("Apple");
		System.out.println("checking whether specifying elemnt is present: "+containApple);
		
		//iterating through list
		for(String fruit: list) {
			System.out.println(fruit);
		}
	}
}

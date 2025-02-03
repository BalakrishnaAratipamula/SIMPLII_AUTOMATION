package Practice;

import java.util.ArrayList;

public class E15_ArrayListPractice {
	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<>();
		
		//Add elements into ArrayList
		names.add("Bala");   //index-0
		names.add("Ramesh"); //1
		names.add("Danny");  //2
		names.add("Varsha"); //3
		
		//printing ArrayList
		System.out.println("ArrayList: "+names);
		
		//Get element at specific index
		System.out.println("ArrayList Element based required index: "+names.get(1)); //index start from 'zero'
		
		//Remove element from ArrayList
		names.remove("Danny");
		System.out.println("ArrayList after remove elemnt from ArrayList: "+names);
		
		//check elemnt is present in ArrayList
		System.out.println(names.contains("Bala1234"));
		
		//Get size
		System.out.println("ArrayList size: "+names.size());
		
		//adding element into ArrayList
		names.add("Siri");
		System.out.println("ArrayList: "+names);
		
		//iterating ArrayList
		for(String name: names) {
			System.out.println(name);
		}
	}
}

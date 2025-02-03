package Practice;

import java.util.HashSet;
import java.util.Set;

public class E17_SetPractice {
	public static void main(String[] args) {
		Set<Integer> numbers = new HashSet<>();
		numbers.add(20);
		numbers.add(30);
		numbers.add(50);
		numbers.add(70);

		// printing Set elements
		System.out.println("Set Elements are: " + numbers);

		// checking whether specifying element is present
		System.out.println("checking whether specifying elemnt is present: " + numbers.contains(30));

		//remove elemnt from set
		numbers.remove(50);
		System.out.println("Resultent Set fter removing one elemnt: "+numbers);
		
		//printing size
		System.out.println("Size of Set: "+numbers.size());
		
		//clear all the elements from set
		numbers.clear();
		System.out.println("Resultent Set after claar all the elements: "+numbers);
	}
}

package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class E20_CollectionsEx {
	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>(Arrays.asList(5, 3, 6, 4, 9, 7));
		
		//Sorting list 
		System.out.println("Before sorting List:  "+numbers);
		Collections.sort(numbers);
		System.out.println("After sorting List:  "+numbers);
		
		//print min and max value
		System.out.println("Minimum value:  "+Collections.min(numbers));
		System.out.println("Maximum value:  "+Collections.max(numbers));
		
		//Reversing the List
		System.out.println("List before Reverse:  "+numbers);
		Collections.reverse(numbers);
		System.out.println("List after Reverse:  "+numbers);
		
	}
}

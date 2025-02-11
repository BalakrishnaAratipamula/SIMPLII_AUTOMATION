package Collections_Collection_Collector;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class E2aCollectionsEx {
	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>(Arrays.asList(5, 3, 8, 1, 9));

		// Sorting the list
		Collections.sort(numbers);
		System.out.println("Sorted List: " + numbers);

		// Reversing the list
		Collections.reverse(numbers);
		System.out.println("Reversed List: " + numbers);

		// Finding the max element
		int max = Collections.max(numbers);
		System.out.println("Max Element: " + max);
	}
}

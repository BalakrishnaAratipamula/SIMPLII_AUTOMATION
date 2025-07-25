package Java_Examples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortList_Alphabetically {
	public static void main(String[] args) {
		// Create a list of strings
		List<String> names = new ArrayList<>();
		names.add("Banana");
		names.add("Apple");
		names.add("Mango");
		names.add("Grapes");
		names.add("Cherry");

		System.out.println("Before sorting: " + names);

		// Sort the list alphabetically (natural order)
		Collections.sort(names);

		System.out.println("After sorting (A–Z): " + names);

		// If you want reverse order (Z–A):
		Collections.sort(names, Collections.reverseOrder());
		System.out.println("After sorting (Z–A): " + names);
	}
}

package Java_Examples;

import java.util.Arrays;
import java.util.List;

public class Convert_List_to_Array {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("A", "B", "C");

		// Convert List to Array
		String[] array = list.toArray(new String[0]);

		System.out.println("Array elements:");
		for (String s : array) {
			System.out.println(s);
		}
	}
}

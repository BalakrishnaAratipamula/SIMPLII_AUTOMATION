package Java_Examples;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList_to_Array_conv {
	public static void main(String[] args) {

		ArrayList<String> color_list = new ArrayList<String>(Arrays.asList("White", "Black", "7", "White", "Yellow"));

		System.out.println("Size of the color_list: " + color_list.size());
		System.out.println("\nArrayList elements before convertion");
		System.out.print(color_list);

		// Create an array from the ArrayList
		String[] color_list2 = new String[color_list.size()];
		color_list2 = color_list.toArray(color_list2);
		// Print the colors individually from Array
		System.out.println("\n\nArray elements after convertion");
		for (String color : color_list2) {
			System.out.println(color); // System.out.println(color_list2); --> this will not work bcz list is array
		} 
	}
}
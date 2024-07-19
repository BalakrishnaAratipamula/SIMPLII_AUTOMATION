package Java_Examples;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList_to_Array_conv {
	/*/
	public static void main(String[] args) {

		ArrayList<String> color_list = new ArrayList<String>(Arrays.asList("White", "Black", "7", "White", "Yellow"));

		System.out.println("Size of the ArrayList is: " +color_list.size());
		System.out.println("ArrayList elements before convertion");
		System.out.print(color_list);

		// Create an array from the ArrayList
		String[] color_list2 = new String[color_list.size()];
		color_list2 = color_list.toArray(color_list2);
		
		System.out.println("\n\nSize of the Array is: " +color_list2.length);
		// Print the colors individually from Array
		System.out.println("Array elements after convertion");
		for (String color : color_list2) {
			System.out.print(color+" "); // System.out.println(color_list2); --> this will not work bcz list is array
		}
	} //*/
	
	
	//
	public static void main(String[] args) {
		// create object of ArrayList
		ArrayList<Integer> al = new ArrayList<Integer>();

		// Add elements
		al.add(32);
		al.add(67);
		al.add(98);
		al.add(100);

		// print ArrayList
		System.out.println("ArrayList: " + al);

		// Get the array of the elements of the ArrayList using toArray() method
		Object[] array = al.toArray(); 

		System.out.println("Array " + Arrays.toString(array));
		
		for(int i=0; i<=array.length-1; i++) {
			System.out.print(array[i]+" ");
		}
	} //*/
	
	
	/*/
	public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>();

        list.add("One");
        list.add("Two");
        list.add("Three");
        list.add("Four");

        System.out.println("Print elements inside ArrayList: " + list.toString());

        // Convert to array
        Object[] array = list.toArray();
        System.out.println("Print elements inside Array: " + Arrays.toString(array));
        
        // Iterate through one by one and convert them into string
        for (Object obj : array) {
              String str = (String) obj;
              System.out.println(str);
        }
	} //*/
}
package Java_Examples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseArrayList {
	public static void main(String[] args) {
		// Creating an ArrayList object
		List<String> arrlist = new ArrayList<String>();

		arrlist.add("Nokia");
		arrlist.add("Samsung");
		arrlist.add("iPhone");
		arrlist.add("One+");

		System.out.print("Before Reverse ArrayList:  ");
		System.out.println(arrlist);

		//Reversing the list using Collections.reverse() method
		Collections.reverse(arrlist);

		System.out.print("After Reverse ArrayList:  ");
		System.out.println(arrlist);
	}

}

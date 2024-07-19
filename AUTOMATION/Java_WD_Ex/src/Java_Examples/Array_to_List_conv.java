package Java_Examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Array_to_List_conv {
	public static void main(String[] args) {

        String[] strArray = { "One", "Two", "Three", "Four" };

        System.out.println("Array: " + Arrays.toString(strArray));

        // Convert array to List
        ArrayList<String> al = new ArrayList<String>();
        Collections.addAll(al, strArray);
        
        System.out.println("ArrayList: " + al);

  }
}

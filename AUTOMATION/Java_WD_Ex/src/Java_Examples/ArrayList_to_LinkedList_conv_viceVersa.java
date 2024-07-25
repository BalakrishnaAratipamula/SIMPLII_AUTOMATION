package Java_Examples;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayList_to_LinkedList_conv_viceVersa {
	public static void main(String[] args) {
		LinkedList<String> linkedlist = new LinkedList<String>();
		linkedlist.add("Mango");
		linkedlist.add("Banana");
		linkedlist.add("Pear");
		linkedlist.add("Apple");
		linkedlist.add("Orange");
		
		// Converting LinkedList to ArrayList
		ArrayList<String> list = new ArrayList<String>(linkedlist);
		System.out.println("ArrayList:  "+ list);

		// Converting ArrayList to LinkedList
		LinkedList<String> list1 = new LinkedList<String>(list);
		System.out.println("LinkedList:  "+ list);
	}
}

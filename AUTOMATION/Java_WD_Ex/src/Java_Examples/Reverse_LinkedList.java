package Java_Examples;

import java.util.Collections;
import java.util.LinkedList;

public class Reverse_LinkedList {
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();

		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);

		System.out.println("Original LinkedList: " + list);

		// Reverse using Collections
		Collections.reverse(list);

		System.out.println("Reversed LinkedList: " + list);
	}
}

package LinkedListEx;

import java.util.LinkedList;

public class Reverse_LinkedList {
	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<String>();
		ll.add(new String("Physics"));
		ll.add(new String("Maths"));
		ll.add("Java"); // or
		ll.add(new String("English"));
		ll.add(new String("Chemistry"));

		System.out.println("The elements of the linked list before reversing: " + ll);
		// Calling user defined function for reversing
		ll = reverseLinkedList(ll);
		System.out.println("The elements of the linked list after reversing: " + ll);
	}

	// Takes a linkedlist as a parameter and returns a reversed linked list
	public static LinkedList<String> reverseLinkedList(LinkedList<String> ll) {
		for (int i = 0; i < ll.size() / 2; i++) {
			String temp = ll.get(i);
			ll.set(i, ll.get(ll.size() - i - 1));
			ll.set(ll.size() - i - 1, temp);
		}
		// Return the reversed arraylist
		return ll;
	}
}

package Java_Examples;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayList_LinkedList_Diff {
	public static void main(String[] args) {
		List<Integer> arrayList = new ArrayList<>();
		List<Integer> linkedList = new LinkedList<>();

		// Number of elements
		int n = 10000;

		// Timing insertion at the end
		long start = System.nanoTime();
		for (int i = 0; i < n; i++) {
			arrayList.add(i);
		}
		long end = System.nanoTime();
		System.out.println("ArrayList insertion at end: " + (end - start) + " ns");

		start = System.nanoTime();
		for (int i = 0; i < n; i++) {
			linkedList.add(i);
		}
		end = System.nanoTime();
		System.out.println("LinkedList insertion at end: " + (end - start) + " ns");

		// Timing insertion at beginning
		arrayList.clear();
		linkedList.clear();

		start = System.nanoTime();
		for (int i = 0; i < n; i++) {
			arrayList.add(0, i);
		}
		end = System.nanoTime();
		System.out.println("ArrayList insertion at beginning: " + (end - start) + " ns");

		start = System.nanoTime();
		for (int i = 0; i < n; i++) {
			linkedList.add(0, i);
		}
		end = System.nanoTime();
		System.out.println("LinkedList insertion at beginning: " + (end - start) + " ns");

		// Fill both lists again
		for (int i = 0; i < n; i++) {
			arrayList.add(i);
			linkedList.add(i);
		}
		
		// Timing retrieval
		start = System.nanoTime();
		for (int i = 0; i < n; i++) {
			arrayList.get(i);
		}
		end = System.nanoTime();
		System.out.println("ArrayList retrieval: " + (end - start) + " ns");

		start = System.nanoTime();
		for (int i = 0; i < n; i++) {
			linkedList.get(i);
		}
		end = System.nanoTime();
		System.out.println("LinkedList retrieval: " + (end - start) + " ns");
	}
}

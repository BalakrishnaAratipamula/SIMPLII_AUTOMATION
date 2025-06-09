package Java_Examples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.testng.annotations.Test;

// @How do you verify that the given list of numbers on a web page is sorted in ascending order?
public class sort_mtd3 {
	//M1
	@Test
	public void approach1() {
		List<Integer> integers = new ArrayList<>();
		integers.add(5);
		integers.add(10);
		integers.add(0);
		integers.add(-1);

		System.out.println("Original list: " + integers);
		Collections.sort(integers);
		System.out.println("Sorted list: " + integers);
	}

	//M2
	@Test
	public void approach2() {
		Set<Integer> set = new TreeSet<Integer>();
		set.add(5);
		set.add(10);
		set.add(0);
		set.add(-1);
		
		System.out.println("Original list: " + set);
		System.out.println("Sorted list: " + set);
	}
}

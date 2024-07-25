package Java_Examples;

import java.util.Collections;
import java.util.LinkedList;

import org.bouncycastle.util.Arrays;

public class Max_Min_num_in_List {
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(44);
		list.add(11);
		list.add(22);
		list.add(33);
		
		// Sort the collection and get the first and last element
		Collections.sort(list);
		
		System.out.println(list.get(0));
		// Use min() method of COllections class
		System.out.println(Collections.min(list));
		
		System.out.println(list.get((list.size() - 1)));
		// Use max() method of COllections class
		System.out.println(Collections.max(list));

	}
}

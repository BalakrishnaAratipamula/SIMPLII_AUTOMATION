package Java_Examples;

import java.util.ArrayList;

public class Replace_Elements_in_AL {
	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();
		list.add("Test1");
		list.add("Test1");
		list.add("Test2");
		list.add("Test3");
		list.add("Test4");

		System.out.println("ArrayList before Replace");
		System.out.println(list);

		int index = list.indexOf("Test2");
		list.set(index, "ReplacedTest");

		System.out.println("\nArrayList after Replace");
		System.out.println(list);
	}
}

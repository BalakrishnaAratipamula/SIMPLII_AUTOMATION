package Static_Keywords;

import java.util.LinkedList;
import java.util.List;

public class Static_Block {
	public static List<String> fruits = new LinkedList<>();

	static {
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Kiwi");
	}

	public static void main(String args[]) {

		System.out.println(Static_Block.fruits.get(0));

	}
}

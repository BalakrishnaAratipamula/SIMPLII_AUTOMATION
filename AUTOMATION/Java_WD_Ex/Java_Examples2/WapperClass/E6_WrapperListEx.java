package WapperClass;

import java.util.ArrayList;

public class E6_WrapperListEx {
	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<>();

		// Auto-boxing: Adding primitive int as an object
		numbers.add(10);

		// Un-boxing: Retrieving the Integer object as int
		int num = numbers.get(0);

		System.out.println("Stored Integer Object: " + numbers.get(0));
		System.out.println("Retrieved Primitive int: " + num);
	}
}

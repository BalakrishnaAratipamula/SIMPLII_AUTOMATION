package GenericsEx;

import java.util.ArrayList;

public class Ex_WithGenerics {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Java");
		// list.add(100); // Compile-time error

		String str = list.get(0); // No type casting required
	}
}

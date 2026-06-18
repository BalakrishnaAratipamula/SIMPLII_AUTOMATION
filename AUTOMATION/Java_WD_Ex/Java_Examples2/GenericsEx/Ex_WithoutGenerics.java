package GenericsEx;

import java.util.ArrayList;

public class Ex_WithoutGenerics {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("Java");
		list.add(100);

		String str = (String) list.get(1); // ClassCastException at runtime
	}
}

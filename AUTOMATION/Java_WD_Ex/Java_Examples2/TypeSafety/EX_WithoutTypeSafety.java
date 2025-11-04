package TypeSafety;

import java.util.ArrayList;
import java.util.List;

public class EX_WithoutTypeSafety {
	public static void main(String[] args) {
		List list = new ArrayList();   // raw type (no type safety)
		list.add("Hello");
		list.add(123);  // allowed!

		for (Object obj : list) {
		    String s = (String) obj;   // ClassCastException at runtime
		    System.out.println(s);
		}
	}
}

/* Problem: The code compiles fine but fails at runtime.
⚠️ Not type-safe because compiler can’t ensure type consistency. */
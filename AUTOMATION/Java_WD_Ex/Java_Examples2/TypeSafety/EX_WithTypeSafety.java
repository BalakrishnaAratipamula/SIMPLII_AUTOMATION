package TypeSafety;

import java.util.ArrayList;
import java.util.List;

public class EX_WithTypeSafety {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Hello");
		// list.add(123); // ❌ Compile-time error!

		for (String s : list) {
		    System.out.println(s); // No cast needed
		}
	}
}

/* Benefits:
Errors caught at compile-time, not runtime.
No need for explicit casting.
More readable and reliable code. */

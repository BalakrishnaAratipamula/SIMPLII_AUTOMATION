package Java_Examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class RedOnly_Collection {
	public static void main(String[] args) {

		{
			List<String> stuff = Arrays.asList(new String[] { "a", "b", "c" });

			List<String> list = new ArrayList<>(stuff);
			list = Collections.unmodifiableList(list);
			
			Set<String> set = new HashSet<>(stuff);
			set = Collections.unmodifiableSet(set);

			Map<String, String> map = new HashMap<>();
			map = Collections.unmodifiableMap(map);

			System.out.println("Collections are read-only now.");
		}

	}
}

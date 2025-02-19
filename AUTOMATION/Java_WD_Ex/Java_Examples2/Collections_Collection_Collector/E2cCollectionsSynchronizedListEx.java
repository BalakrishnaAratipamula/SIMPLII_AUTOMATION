package Collections_Collection_Collector;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class E2cCollectionsSynchronizedListEx {
	public static void main(String[] args) {
		List<String> list = Collections.synchronizedList(new ArrayList<>());
		list.add("Hello");
		
		System.out.println(list);
	}
}

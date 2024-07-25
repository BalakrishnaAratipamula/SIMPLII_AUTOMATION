package Java_Examples;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Check_element_is_part_of_Collection {
	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("Rahul");
		list.add("Rohan");
		list.add("Megha");

		// Verify if list contains a specific element or not
		System.out.println(list.contains("Suraj")); //false
		System.out.println(list.contains("Megha")); //true

		Map<Integer, String> hashmap = new HashMap<>();
		hashmap.put(1, "Arsenal");
		hashmap.put(2, "ManU");
		hashmap.put(3, "ManCity");
		// Verify if map contains a specific key/value or not
		System.out.println(hashmap.containsKey(4)); //false
		System.out.println(hashmap.containsKey(1)); //true
		System.out.println(hashmap.containsValue("Real Madrid")); //false
		System.out.println(hashmap.containsValue("Arsenal")); //true

	}

}

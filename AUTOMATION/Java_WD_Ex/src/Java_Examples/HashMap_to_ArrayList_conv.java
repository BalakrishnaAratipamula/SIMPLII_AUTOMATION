package Java_Examples;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class HashMap_to_ArrayList_conv {
	public static void main(String[] args) {

		HashMap<String, String> hash_map = new HashMap<>();

		hash_map.put("India", "New Delhi");
		hash_map.put("France", "Paris");
		hash_map.put("Germany", "Berlin");
		hash_map.put("Australia", "Canberra");

		// convert HashMap keys to ArrayList
		List<String> hmKeys = new ArrayList<>(hash_map.keySet()); //.keySet() - Return all keys in map
		System.out.println("HashMap keys :: ");
		for (String s : hmKeys) {
			System.out.println(s);
		}

		System.out.println("************************");

		// convert HashMap values to ArrayList
		List<String> hmValues = new ArrayList<String>(hash_map.values());
		System.out.println("HashMap values :: ");
		for (String s : hmValues) {
			System.out.println(s);
		}

	}

}

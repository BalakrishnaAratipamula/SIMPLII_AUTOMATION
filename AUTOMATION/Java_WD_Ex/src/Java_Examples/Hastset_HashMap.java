package Java_Examples;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Hastset_HashMap { // HashSet stores data as objects && HashMap stores the data as key-value pairs
	public static void main(String[] args) {
		// creating HashSet
		Set<String> set = new HashSet<>();
		set.add("One");
		set.add("Two");
		set.add("Three");
		System.out.println("HashSet:  " + set);

		// creating HashMap
		Map<String, String> map = new HashMap<>();
		map.put("Name", "Ravi");
		map.put("State", "KA");
		map.put("Phone", "+91 7588454544");
		System.out.println("HashMap:  " + map);

	}
}

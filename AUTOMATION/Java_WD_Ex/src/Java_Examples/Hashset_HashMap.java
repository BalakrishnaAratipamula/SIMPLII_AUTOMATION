package Java_Examples;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Hashset_HashMap { // HashSet stores data as objects && HashMap stores the data as key-value pairs
	public static void main(String[] args) {
		// creating HashSet
		Set<String> set = new HashSet<>();
		set.add("One");
		set.add("Two");
		set.add("Two");		//HashSet doesn't allow null elements
		set.add("Three");
		set.add("");		//HashSet allow only one null element
		set.add("");
		System.out.println("HashSet:  " + set);

		// creating HashMap
		Map<String, String> map = new HashMap<>();
		map.put("Name", "Avanish");
		map.put("State", "KA");	//HashMap doesn't allow duplicate Keys but allow duplicate Values
		map.put("State", "TN");
		map.put("Stttt", "TN");	//HashMap doesn't allow duplicate Keys but allow duplicate Values
		map.put("", "");		//HashMap allow one <null key, null value>
		map.put("", "");
		map.put("aaa", "");	 	//HashMap allow multiple null values	
		map.put("bbb", "");
		map.put("Phone", "+91 7588454544");
		System.out.println("HashMap:  " + map);

	}
}

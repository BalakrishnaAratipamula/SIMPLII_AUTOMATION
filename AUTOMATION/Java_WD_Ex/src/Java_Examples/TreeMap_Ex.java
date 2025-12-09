package Java_Examples;

import java.util.Map;
import java.util.TreeMap;

public class TreeMap_Ex {
	public static void main(String[] args) {
		Map<Integer, String> map = new TreeMap<>();
		map.put(2, "A");
		map.put(3, "B");
		System.out.println(map.get(2)); //get(key)
		System.out.println(map);
	}
}

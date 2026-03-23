package PairClass;

import java.util.AbstractMap;

public class AlternativeWayOfUsing_PairClassMethods {
	public static void main(String[] args) {
        AbstractMap.SimpleEntry<Integer, String> pair1 = new AbstractMap.SimpleEntry<>(1, "Apple");
        AbstractMap.SimpleEntry<Integer, String> pair2 = new AbstractMap.SimpleEntry<>(1, "Apple");
        
        System.out.println(pair1.getKey());      // 1
        System.out.println(pair1.getValue());    // Apple
        System.out.println(pair1.toString());    // 1=Apple
        System.out.println(pair1.equals(pair2)); // true
    }
}

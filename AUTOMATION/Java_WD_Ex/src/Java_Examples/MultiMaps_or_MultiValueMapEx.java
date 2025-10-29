package Java_Examples;

import org.apache.commons.collections4.MultiValuedMap;
import org.apache.commons.collections4.multimap.ArrayListValuedHashMap;

public class MultiMaps_or_MultiValueMapEx {
	public static void main(String[] args) {
        // Create a MultiValuedMap
        MultiValuedMap<String, String> fruitMap = new ArrayListValuedHashMap<>();
        
        // Add multiple values for the same key
        fruitMap.put("fruit", "apple");
        fruitMap.put("fruit", "mango");
        fruitMap.put("fruit", "banana");
        
        // Add another key with multiple values
        fruitMap.put("vegetable", "carrot");
        fruitMap.put("vegetable", "beans");
        
        // Print all entries
        System.out.println("MultiValuedMap: " + fruitMap);
        
        // Print values for a specific key
        System.out.println("Fruits: " + fruitMap.get("fruit"));
        System.out.println("Vegetables: " + fruitMap.get("vegetable"));
        
        // Remove a specific value
        fruitMap.removeMapping("fruit", "apple");
        System.out.println("After removing 'apple': " + fruitMap.get("fruit"));
    }
}

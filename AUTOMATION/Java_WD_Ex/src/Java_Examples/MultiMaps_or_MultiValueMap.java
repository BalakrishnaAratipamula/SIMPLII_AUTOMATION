package Java_Examples;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//@. key=fruit, value=""apple""; key=fruit, value=""mango"" using any collection how to print the values
public class MultiMaps_or_MultiValueMap {
	public static void main(String[] args) {
        // Create a Map where each key maps to a List of values
        Map<String, List<String>> fruitsMap = new HashMap<>();
        
        // Add values
        fruitsMap.computeIfAbsent("fruit", k -> new ArrayList<>()).add("apple");
        fruitsMap.computeIfAbsent("fruit", k -> new ArrayList<>()).add("mango");
        
        // Print all values for key "fruit"
        System.out.println(fruitsMap.get("fruit"));
        
        // Or print them one by one
        for (String value : fruitsMap.get("fruit")) 
            System.out.println(value); 
    }
}
package Java_Examples;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Convert_HashMap_to_List {
	public static void main(String[] args) {
        // Create a sample HashMap
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Cherry");
        map.put(4, "Mango");

        // ✅ Convert keys to List
        List<Integer> keyList = new ArrayList<>(map.keySet());
        System.out.println("Keys List: " + keyList);

        // ✅ Convert values to List
        List<String> valueList = new ArrayList<>(map.values());
        System.out.println("Values List: " + valueList);

        // ✅ Convert entries to List
        List<Map.Entry<Integer, String>> entryList = new ArrayList<>(map.entrySet());
        System.out.println("Entries List: " + entryList);

        // Optional: Loop through entries list
        System.out.println("\nEntries in List form:");
        for (Map.Entry<Integer, String> entry : entryList) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}

package Java_Examples;

import java.util.HashMap;
import java.util.Map;

public class LambdaExpressionInForeachLoop {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "Apple");
		map.put(2, "Banana");
		map.put(3, "Cherry");

		/*/ Iterating using forEach() with lambda expression
		map.forEach((key, value) -> System.out.println("Key: " +key + ", Value: " + value)); //*/
		
		// Iterating using entrySet()
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue()); 
        } //*/
	}
}

package Java_Examples;

import java.util.HashMap;
import java.util.Map;

public class ReturnMultipleTypeOfValuesFromMethod {
	public static void main(String[] args) {
		Map<String, Object> result = getNumberAndText();
		System.out.println("Number: " + result.get("number"));
		System.out.println("Text: " + result.get("text"));
	}

	public static Map<String, Object> getNumberAndText() {
		Map<String, Object> map = new HashMap<>();
		map.put("number", 42);
		map.put("text", "Hello, world!");
		return map;
	}
}

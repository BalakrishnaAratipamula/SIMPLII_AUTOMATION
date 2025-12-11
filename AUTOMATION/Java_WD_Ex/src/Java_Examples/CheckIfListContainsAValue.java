package Java_Examples;

import java.util.Arrays;
import java.util.List;

public class CheckIfListContainsAValue {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("A", "B", "C");
		
		Boolean result = list.contains("A");
		
		System.out.println(result);
	}
}

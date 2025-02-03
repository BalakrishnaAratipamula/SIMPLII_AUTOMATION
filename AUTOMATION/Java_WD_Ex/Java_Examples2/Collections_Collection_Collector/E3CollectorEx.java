package Collections_Collection_Collector;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class E3CollectorEx {
	// Using Collector with Streams
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Amar", "Boby", "Charlie", "David", "Amith");
		
		// Collect names into a List
		List<String> nameList = names.stream().filter(name -> name.startsWith("A")).collect(Collectors.toList());
		
		System.out.println("Names starting with A: " + nameList);

		// Collect names into a String
		String nameString = names.stream().collect(Collectors.joining(", "));

		System.out.println("All names: " + nameString);
	}
}

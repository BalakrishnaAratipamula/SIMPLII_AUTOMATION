package Practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class E21_CollectorEx {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Amar", "Bala", "David", "Amith");
		
		//Collect names into List
		List<String> nameList = names.stream().filter(name -> name.startsWith("A")).collect(Collectors.toList());
		System.out.println("Names starting with 'A':  "+nameList);
		
		//Collect names into String
		String nameString =  names.stream().collect(Collectors.joining());
		System.out.println("All Names:  "+nameString);
	}

}

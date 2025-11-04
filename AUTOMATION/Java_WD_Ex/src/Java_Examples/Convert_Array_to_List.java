package Java_Examples;

import java.util.*;
import java.util.stream.Collectors;

public class Convert_Array_to_List {
	
	/*/1. Using Arrays.asList()
	public static void main(String[] args) {
        String[] fruits = {"Apple", "Banana", "Cherry"};

        // Convert array to list
        List<String> fruitList = Arrays.asList(fruits);

        System.out.println("List: " + fruitList);
    } //*/
	
	
	/*/2. Using new ArrayList<>(Arrays.asList())
	public static void main(String[] args) {
		String[] fruits = {"Apple", "Banana", "Cherry"};
		
		List<String> fruitList = new ArrayList<>(Arrays.asList(fruits));
		fruitList.add("Mango"); // Works fine
		System.out.println(fruitList);
	} //*/
	
	
	/*/3. Using Java 8 Streams
	public static void main(String[] args) {
        String[] fruits = {"Apple", "Banana", "Cherry"};

        List<String> fruitList = Arrays.stream(fruits).collect(Collectors.toList());

        System.out.println("List: " + fruitList);
    } //*/
	
	
	//4. For Primitive Arrays
	public static void main(String[] args) {
		int[] numbers = {1, 2, 3, 4, 5};

		List<Integer> numberList = Arrays.stream(numbers)   // IntStream
		                                 .boxed()           // Convert int → Integer
		                                 .collect(Collectors.toList());

		System.out.println("List: " + numberList);
	}
}

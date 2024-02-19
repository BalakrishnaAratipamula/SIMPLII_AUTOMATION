package Java_Examples;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecondLargestNumber {
	public static void main(String[] args) {
		List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 75, 31, 89);
		
		Integer result = listOfIntegers.stream() //Stream() enables to perform operations like filtering, mapping,reducing and sorting on collections of objects.
				.sorted(Comparator.reverseOrder())	//Comparator is an interface it is used to order(sort) the ele’s in the collection in our own way.
				.skip(1)	//our requirement is 2nd largest num so we want to skip 1st one
				.findFirst() //already skipped first
				.get();
		
		System.out.println(result);
	}
}

package Java_Examples;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

public class RemoveDuplicates_from_List {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("A");
		list.add("C");
		list.add("A");
		list.add("B");
		list.add("D");
		list.add("C");
		
		//HashSet does not preserve the insertion order of elements
		List<String> uniqueByUsingHS = new ArrayList<>(new HashSet<>(list));
		
		//LinkedHashSet is used to remove duplicates while maintaining the original order
		List<String> uniqueByUsingLHS = new ArrayList<>(new LinkedHashSet<>(list));
		
		System.out.println(list);
		System.out.println(uniqueByUsingHS);
		System.out.println(uniqueByUsingLHS);
	}
}

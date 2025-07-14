package Java_Examples;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class RemoveDuplicates_from_List {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Ram");
		list.add("Syam");
		list.add("Arka");
		list.add("Ajith");
		list.add("Arka");
		List<String> unique = new ArrayList<>(new HashSet<>(list));
		
		System.out.println(list);
		System.out.println(unique);
	}
}

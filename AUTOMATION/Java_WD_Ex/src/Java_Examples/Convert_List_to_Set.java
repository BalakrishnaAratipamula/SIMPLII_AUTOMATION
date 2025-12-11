package Java_Examples;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Convert_List_to_Set {
	public static void main(String[] args) {

        List<String> list = Arrays.asList("A", "B", "C", "A", "D");

        Set<String> set = new HashSet<>(list);

        System.out.println("List: " + list);
        System.out.println("Set (duplicates removed): " + set);
    }
}

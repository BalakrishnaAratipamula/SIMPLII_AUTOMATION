package Java_Examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class removeAll_nd_retainAll {
	/*/removeALl() is used to compare both lists and remove all common elements.
	public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(3, 4, 5));

        list1.removeAll(list2);

        System.out.println("Remaining elements from 'list1':  "+list1);
    } //*/
	
	
	/*/retainAll() is used to compare both lists and remove all non-common elements.
	public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(3, 4, 5));

        list1.retainAll(list2);
	
        System.out.println("Remaining elements from 'list1':  "+list1);
    } //*/
	
	
	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
		List<Integer> list2 = new ArrayList<>(Arrays.asList(3, 4, 5, 6));

		list1.removeAll(list2);
		System.out.println(list1); // [1, 2]

		list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
		list1.retainAll(list2);
		System.out.println(list1); // [3, 4]
	}
}

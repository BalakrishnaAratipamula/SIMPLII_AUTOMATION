package Java_Examples;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates_from_Array {
	
	//Java int coding qns : #9 Remove Duplicates from Array
	public static void main(String[] args) {
		int[] arr = {1, 2, 2, 3, 4, 4};
			
		Set<Integer> hs = new HashSet();
		for(int num: arr) {
			hs.add(num);
		}
		System.out.println(hs);
	}
		
		
	/*/ #2
	static int[] removeDuplicates(int[] arr) {
		Set<Integer> set = new HashSet<>();
		
		for(int num: arr) {
			set.add(num);
		}
		
		int[] result = new int[set.size()];
		int i=0;
		for(int num : set) {
			result[i++]=num;
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		int[] arr = {5, 2, 9, 1, 6, 2, 5};
		int[] uniqueArr = removeDuplicates(arr);	
		
		System.out.print("Array with Duplicates removed:  ");
		for(int num : uniqueArr) {
			System.out.print(num+" ");
		}
	} //*/
	
}

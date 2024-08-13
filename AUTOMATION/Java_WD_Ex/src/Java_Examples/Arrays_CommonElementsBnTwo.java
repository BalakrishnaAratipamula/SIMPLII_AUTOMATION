package Java_Examples;

import java.util.HashSet;
import java.util.Set;

public class Arrays_CommonElementsBnTwo {
	
	public static Set<Integer> findCommonElements(int[] arr1, int[] arr2){
		Set<Integer> set1 = new HashSet<>();
		Set<Integer> commonSet1 = new HashSet<>();
		
		//add elements of the first Array to Set
		for(int num: arr1) {
			set1.add(num);
		}
		
		//check for common elements in second Array
		for(int num: arr2) {
			if(set1.contains(num)) {
				commonSet1.add(num);
			}
		}
		return commonSet1;
	}
	
	public static void main(String[] args) {
		int[] arr1 = {1, 2, 3, 4, 5},
			  arr2 = {4, 5, 6, 7, 8};
		
		Set<Integer> commonEle = findCommonElements(arr1, arr2);
		
		System.out.println("Common Elements: "+commonEle);	
	}
	
}

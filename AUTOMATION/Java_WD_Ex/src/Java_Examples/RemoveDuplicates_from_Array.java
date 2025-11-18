package Java_Examples;

import java.util.HashMap;
import java.util.Map;

public class RemoveDuplicates_from_Array {
	
	/*/Java int coding qns : #9 Remove Duplicates from Array Using HashSet
	public static void main(String[] args) {
		int[] arr = {1, 2, 2, 3, 4, 4};
			
		Set<Integer> hs = new HashSet();
		for(int num: arr) {
			hs.add(num);
		}
		System.out.println(hs);
	} //*/
		
		
	/*/ #2 -Using HashSet
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
	
	
	/*/ #3 -Using HashMap
	public static void main(String[] args) {
		int[] arr = {10, 20, 20, 30, 40, 10};

        Map<Integer, Boolean> map = new HashMap<>();

        for (int num : arr) {
            map.put(num, true);  // duplicate keys will be ignored
        }

        System.out.println("Array without duplicates:");
        for (int key : map.keySet()) {
            System.out.print(key + " ");
        }
	} //*/
	
	
	// #4 -without using HashMap
	public static void main(String[] args) {
		
        int[] arr = {10, 20, 20, 30, 40, 10};
        int n = arr.length;
        
        int[] temp = new int[n];
        int index = 0;
        
        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;
            
            // check if element already added to temp
            for (int j = 0; j < index; j++) {
                if (arr[i] == temp[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            
            if (!isDuplicate) {
                temp[index++] = arr[i];
            }
        }
        
        System.out.println("Array without duplicates:");
        for (int i = 0; i < index; i++) {
            System.out.print(temp[i] + " ");
        }
    } //*/
	
}

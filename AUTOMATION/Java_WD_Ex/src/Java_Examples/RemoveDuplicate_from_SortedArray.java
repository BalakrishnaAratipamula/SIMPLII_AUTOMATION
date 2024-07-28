package Java_Examples;

import java.util.Arrays;

public class RemoveDuplicate_from_SortedArray {
	
	/*Input array: 1 2 3 2 2 3 4
	 *Sorted array: 1 2 2 2 3 3 4 (all 2’s and 3’s are grouped together). 
	 */
	
	
	/*/ program to get total Duplicates count
	static int removeDupElements(int[] arr) {
		Arrays.sort(arr);
		if (arr.length == 0)
			return 0;
		int j = 0;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] != arr[j]) {
				j++;
				arr[j] = arr[i];
			}
		}

		return j + 1;
	}

	public static void main(String[] args) {

		int[] array = { 3, 2, 1, 1, 2, 2, 3, 2, 1, 3 };
		System.out.println(removeDupElements(array));
	} //*/
	
	
	
	// Remove Duplicates
	public static int removeDuplicateElements(int arr[], int n){  
        if (n==0 || n==1){  
            return n;  
        }  
        
        int[] temp = new int[n];  
        int j = 0;  
        for (int i=0; i<n-1; i++){  
            if (arr[i] != arr[i+1]){  
                temp[j++] = arr[i];  
            }  
         }  
        temp[j++] = arr[n-1];     
        // Changing original array  
        for (int i=0; i<j; i++){  
            arr[i] = temp[i];  
        }  
        return j;  
    }  
       
    public static void main (String[] args) {  
        int arr[] = {10,20,20,30,30,40,50,50};  
        int length = arr.length;  
        length = removeDuplicateElements(arr, length);  
        //printing array elements  
        for (int i=0; i<length; i++)  
           System.out.print(arr[i]+" ");  
    } //*/ 	
}

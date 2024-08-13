package Java_Examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;

public class RemoveDuplicates_from_ArrayList {
	// Function to remove duplicates from an ArrayList 
	public static <T> ArrayList<T> removeDuplicates(ArrayList<T> list) { /////  <T> is type parameter (use any letter/word like variable)
		// Create a new ArrayList 								 /////  ArrayList<T> in method sig is bcz method return type is ArrayList
		ArrayList<T> newList2 = new ArrayList<T>(); 
		// Traverse through the first list 
		for (T element : list) { ///// T from subMethod argument 
			// If this element is not present in newList then add it 
			if (!newList2.contains(element)) { 
				newList2.add(element); 
			} 
		} 
		// return the new list 
		return newList2;
	} 

	//Driver function 
	public static void main(String args[]) { 
		// Get the ArrayList with duplicate values 
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 10, 1, 2, 2, 3, 3, 10, 3, 4, 5, 5, 4, 1, 4)); 
		System.out.println("ArrayList with duplicates: "+ list);   
		// Remove duplicates 
		ArrayList<Integer> newList1 = removeDuplicates(list); 
		// Print the ArrayList with duplicates removed 
		System.out.println("ArrayList by duplicates removed: " + newList1);  
	} 




	/*/Remove only 'SEQVENCE of elemnts' in array
	public static int removeduplicates(int a[], int n){
		if(n==0 || n==1) { //length
			return n;
		}
		// creating another array for only storing the unique elements
		int j = 0;
		for (int i=0; i<n-1; i++) {
			if(a[i]!=a[i+1]) {
				a[j++] = a[i]; 
			}
		}
		a[j++] = a[n-1]; 

		return j;
	}
	public static void main(String[] args){
		int[] a = { 1, 2, 1 };
		int n = a.length; 
		//System.out.println(n);
		int nw;

		nw = removeduplicates(a, n); //Resultant array 'length' 

		// Printing The array elements
		for(int i=0; i<nw; i++)
			System.out.print(a[i]+ " ");
	} */





	/*/ Function to remove duplicate from array using LinkedHashSet
public static void removeDuplicates(int[] list){
        LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();

        // adding elements to LinkedHashSet because LinkedHashSet doesn't allow duplicates
        for (int i=0; i<list.length; i++) {
            set.add(list[i]);
        }
        // Print the elements of LinkedHashSet
        System.out.println("List without Duplicate elements:  "+set);
    }

    // Driver code
public static void main(String[] args){
        int[] list = {1,1,2,5,2,6,8,6,7,5,2,8,1,1,2};

        // Function call
        removeDuplicates(list);
} */



	/*public static void main(String[] args) { ///// The java.lang.Math.max(int a, int b) returns the greater of two int values 
	      // get two integer numbers
	      int x = 60984;
	      int y = 1000;

	      // print the larger number between x and y
	      System.out.println("Math.max(" + x + "," + y + ")=  " + Math.max(x, y));
	   } */



	/*/Remove duplicate elements from array and Resultant array will be in INCREMENT ORDER
public static void main(String[] args){
       // int a[] = { 5, 2, 6, 5, 6, 7, 5, 2, 8, 2, 8, 9, 8, 9, 8, 8, 9, 9, 1 };
		int[] a = {1, 1, 1, 9, 9};

        // m will have the maximum element in the array.
        int m=0;
        for(int i=0; i<a.length; i++){
            m = Math.max(m, a[i]);
        }

        // creating the Frequency Array 
        int[] f = new int[m+1]; //////Frequency Array will store frequencies of element. ///// initialize any size [20]

        // initializing the f[] with 0
        for (int i=0; i<m+1; i++){
            f[i]=0;
        }

        // incrementing the value at a[i]th index in the Frequency Array
        for (int i=0; i<a.length; i++){
            f[a[i]]++;
        } 

        for (int i=0; i<m+1; i++){ 
            // if the frequency of the particular element is greater than 0, then print it once
            if(f[i]>0) {
                System.out.print(i+ " ");
            }
        }
} */



	/*/ Function to remove duplicate from array using HashMap
	static void removeDups(int[] arr, int n) {

		// HashMap which will store the elements which has appeared previously.
		HashMap<Integer, Boolean> hmap = new HashMap<>();

		for (int i=0; i<n; ++i){
			// Print the element if it is not there in the HashMap
			if (hmap.get(arr[i]) == null) { ///// get(Object key): This method is used to return the value for the specified key
				System.out.print(arr[i]+ " ");
			}
			// Insert the element in the HashMap
			hmap.put(arr[i], true); //// (or) false
		}
	}

	// Driver Code
	public static void main(String[] args){
		int[] arr = { 1, 2, 5, 1, 1, 1, 7, 2, 4, 2, 7, 1, 2, 3 };
		int n = arr.length;
		removeDups(arr, n); 
	} */
}
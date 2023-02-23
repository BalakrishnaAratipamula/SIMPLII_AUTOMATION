package Java_Examples;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Frequent_ele_in_Array { ////except last
	/*public static void main(String[] args) {  
		int[] arr = new int[] {1, 1, 1, 7};  
		//1. Array fr will store frequencies of element  
		int[] fr = new int[arr.length];  
		int visited = -1;  ////Assign any value (dummy value) but except frequency array index values //its just for representing visited or not visited 
		for(int i=0; i<arr.length; i++){ 
			int count = 1;  
			for(int j=i+1; j<arr.length; j++){  
				if(arr[i] == arr[j]){  
					count++;  
					//To avoid counting same element again  
					fr[j] = visited; //1st f[1], f[2]......
				}  
			}  
			if(fr[i] != visited){ 
				fr[i] = count; 
			}
		}  

		//Displays the frequency of each element present in array  
		System.out.println("---------------------");  
		System.out.println(" Element | Frequency ");  
		System.out.println("---------------------");  
		for(int i=0; i<fr.length; i++){ 
			if(fr[i] != visited){  
				System.out.println("    "+arr[i]+"    |    "+fr[i]);  
			}
		}  
		System.out.println("---------------------");  
	} */




	public static void main(String[] args){
		int[] arr = {2, 2, 1, 8, 3, 2, 2, 4, 2};

		// To fill complete array with a particular value
		Arrays.fill(arr, 10);   ///// method is used to fill the array with a given static value. The value can be used to fill the entire array or it can be used to fill a part of the array
		System.out.println("Array completely filled with 10\n" + Arrays.toString(arr));
	} 





	/*public static void findFrequency(int[] arr){
		// create a count array of size `n` to store the count of all array elements
		int[] freq = new int[arr.length];

		// update frequency of each element
		for(int e: arr){
			freq[e]++;
		}

		// iterate through the array to print frequencies
		for(int i=0; i<freq.length; i++){
			if(freq[i] > 0){
				System.out.printf("%d appears %d times\n", i, freq[i]);
				//System.out.println(i+ " appears " +freq[i]+ " times" );
			}
		}
	}

	public static void main(String[] args){
		int[] arr = { 1, 1, 2, 1 };

		findFrequency(arr);
	} */







	/*static void countFreq(int[] arr, int n){
        // Creating a HashMap containing integer as a key and occurrences as a value
		Map<Integer,Integer> mp = new HashMap<>();

		// Traverse through array elements and count frequencies
        for(int i=0; i<n; i++){
            // If number is present in freqMap, incrementing it's count by 1
        	//System.out.println(mp.containsKey(arr[i])); //1st value is not contains so false, 2nd value is contains so true, .......
            if(mp.containsKey(arr[i])){  /////obj.containsKey(Object key): This method is used to search the specified key (repeated key) from map ////if repeat go inside
                //System.out.println("    "+mp.containsKey(arr[i]));
            	mp.put(arr[i] , mp.get(arr[i])+1);  /////obj.put(Object key, Object value): This method is used to insert an entry in this map.
            }									   /////obj.get(Object key): This method is used to return the value for the specified key (repeated key)
            else{
                // If integer is not present in freqMap, putting this integer to freqMap with 1 as it's value
                mp.put(arr[i] , 1);
            } 
        }
        //System.out.println("          "+mp.entrySet());
        // Traverse through map and print frequencies			   /////Map.Entry interface enables to work with a map entry
        for(Map.Entry<Integer,Integer> entry : mp.entrySet()){    /////entrySet(): This method is used to return the Set view containing all the keys and values
            System.out.println(entry.getKey() + " - " + entry.getValue());   /////getKey() : It returns key for the pair.
        }                                                                    /////getValue() : It returns value for the pair.

    }

	// Driver code
    public static void main(String args[]){
        int arr[] = {10, 10, 20};  ///////array elements are comes under 'keys' & return values (freq) are comes under 'value'
        int n = arr.length;
        countFreq(arr, n);
    } */


}

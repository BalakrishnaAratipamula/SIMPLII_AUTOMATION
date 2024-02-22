package Java_Examples;

import static org.testng.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Max_Min_num_in_Array {

	/*public static void main(String[] args) {
		//find maximum number
		int[] arr = {5, 6, 2, 4, 9, 18};
		for(int i=0; i<arr.length; i++) {
			if(arr[0]<arr[i]) {
				arr[0]=arr[i];
			}
		}
		System.out.println("maximum number in array is: "+arr[0]); 
		
		
		//find minimum number
		int[] arr = {5, 6, 7, 4, 6, 8, 10};
		for(int i=0; i<arr.length; i++) {
			if(arr[0]>arr[i]) {
				arr[0]=arr[i];
			}
		}
		System.out.println("minimum number in array is: "+arr[0]);
	} */

	
	
	
	/*public static void main(String[] args) {
        int[] num = {10, 5, 8, 3, 56};
        Arrays.sort(num);
        int min = num[0];
        int max = num[num.length - 1];
        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);
    } */
	
	
	
	
	
	/*public static void main(String args[]) { 
        double a = 12.123; 
        double b = 12.456; 
  
        // prints the maximum of two numbers 
        System.out.println(Math.max(a, b)); 
    } */
	
	
	
	
	public static void main(String[] args) {
		List<Integer> listOfIntegers = Arrays.asList(11, 13, 9, 20, 7, 3, 30);
		Integer expectedMinValue = 3;

		Integer minValue = Collections.min(listOfIntegers);
		Integer maxValue = Collections.max(listOfIntegers);
		Integer minIndex = listOfIntegers.indexOf(minValue);
		Integer maxIndex = listOfIntegers.indexOf(maxValue);

		assertEquals(minValue, expectedMinValue);
		
		System.out.println("min value is: "+minValue+"  Index Of Min Value is: "+minIndex);
		System.out.println("max value is: "+maxValue+"  Index Of Max Value is: "+maxIndex);
	}
	
}
package Java_Examples;

//Java int coding qns : #10 Largest Element In Array
public class Largest_nd_Smallest_Element_In_Array {
	public static void main(String[] args) {
		int[] arr1 = {1, 3, 7, 4, 9, 0};
		
		int largest = arr1[0], smallest = arr1[0];
		
		//to find largest number
		for(int num: arr1) {
			if(num>largest) {
				largest = num;
			}
		}
		System.out.println("Largest number:  "+largest);
		
		//to find smallest number
		for(int num: arr1) {
			if(num<smallest) {
				smallest = num;
			}
		}
		System.out.println("Smallest number:  "+smallest);
	}
}

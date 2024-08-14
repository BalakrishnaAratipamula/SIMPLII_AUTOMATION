package Java_Examples;

public class Search_Element_in_Array {
	static int linearSearch(int[] arr, int target) {
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==target)
				return i; //this is for 'if'
		}
		return -1; //this is for 'else'
	}
	
	public static void main(String[] args) {
		int[] arr = {2, 5, 7, 6, 8, 9, 1};
		int target = 4;
		
		int index = linearSearch(arr, target);
		
		if(index!=-1)
			System.out.println("Element '"+target+"' found at index: "+index);
		else
			System.out.println("Element '"+target+"' not found in Array.");
	}
}

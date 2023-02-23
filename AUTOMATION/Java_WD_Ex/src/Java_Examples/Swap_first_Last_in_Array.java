package Java_Examples;

import java.util.Arrays;

public class Swap_first_Last_in_Array {
public static void main(String[] args) {
	int[] a = {1,2,3,4,5};
	System.out.println(Arrays.toString(a));
	int temp = a[0];
	a[0] = a[a.length-1]; // '-1' because index will start from '0'
	a[a.length-1] = temp;
	System.out.println(Arrays.toString(a));
}
}

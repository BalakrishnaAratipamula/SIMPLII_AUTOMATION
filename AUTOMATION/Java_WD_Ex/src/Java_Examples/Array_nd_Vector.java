package Java_Examples;

import java.util.Vector;

public class Array_nd_Vector {
	/*/Array
	public static void main(String[] args) {
		int[] numbers = new int[3];
		numbers[0] = 10;
		numbers[1] = 20;
		numbers[2] = 30;

		for (int n : numbers) {
		    System.out.println(n);
		}
	} //*/
	
	
	//Vector
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<>();
        v.add(10);
        v.add(20);
        v.add(30);
        v.add(40);

        System.out.println("Vector elements: " + v);
	}
}

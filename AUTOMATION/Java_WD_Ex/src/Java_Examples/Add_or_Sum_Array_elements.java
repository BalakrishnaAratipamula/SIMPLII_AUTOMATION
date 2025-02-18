package Java_Examples;

//Java int coding qns : #30 Java program to Add or Sum Array Elements
public class Add_or_Sum_Array_elements {
	public static void main(String[] args) {
		int[] in = { 1, 2, 3, 4, 5, 10, 20 };
		int sum = 0;
		for (int add : in) {
			sum = sum + add;
		}
		System.out.println(sum);
	}
}

package Java_Examples;

import java.util.Stack;

public class ReverseNumberUsingStack {
	static Stack<Integer> st = new Stack<>();

	static void push_digits(int num) {
		while (num != 0) {
			st.push(num % 10);
			num = num / 10;
		}
	}

	static int reverse_number(int num) {
		push_digits(num);
		int reverse = 0;
		int i = 1;

		while (!st.isEmpty()) {
			reverse = reverse + (st.peek() * i);
			st.pop();
			i = i * 10;
		}
		return reverse;
	}

	public static void main(String[] args) {
		int number = 3997;
		System.out.println(reverse_number(number));
	}

}

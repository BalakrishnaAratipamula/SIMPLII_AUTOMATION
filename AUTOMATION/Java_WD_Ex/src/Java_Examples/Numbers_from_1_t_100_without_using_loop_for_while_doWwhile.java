package Java_Examples;

public class Numbers_from_1_t_100_without_using_loop_for_while_doWwhile {
	public static void main(String[] args) {
		printnum(1);
	}

	public static void printnum(int num) {
		if (num <= 100) {
			System.out.print(num+" ");
			num++;
			printnum(num);
		}

	}

}

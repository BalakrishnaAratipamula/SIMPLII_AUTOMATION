package Java_Examples;
import java.util.Scanner;

public class Loops_While_do_while {
	public static void main(String[] args) {
		/*/while
		int n=1;
		while(n<=5) {
			System.out.println(n);
			n++;
		} /*/


		//do-while
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n value: ");
		int n = sc.nextInt();
		//same as while loop but it will allow to execute at least one time inside the block of statement irrespective of condition true / false
		do {
			System.out.println(n);
			++n;
		}while(n<=5);

	} //
}

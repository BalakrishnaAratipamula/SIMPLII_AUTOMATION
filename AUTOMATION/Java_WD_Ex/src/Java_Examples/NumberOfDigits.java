package Java_Examples;

public class NumberOfDigits {
	public static void main(String[] args) {
		int num = 250, a = 0;
		
		if (num<0)
			num = num*-1;
		else if (num==0)
			num = 1;
		while (num>0) {
			num = num/10;
			a++;
		}
		System.out.println("Number of digits in given Number is: " + a);
	}
}

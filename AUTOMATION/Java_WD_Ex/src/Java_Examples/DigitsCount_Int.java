package Java_Examples;

public class DigitsCount_Int {
	public static void main(String[] args) {
		int num = 298453156;
		int count = 0, num2 = 298453156;
		// method 1
		while(num != 0) {
			num = num/10;
			count++;
		}
		System.out.println("Num of Digits: "+count);
		
		// method 2
		String str = Integer.toString(num2);
		System.out.println("Num of Digits: "+str.length());
	}
}

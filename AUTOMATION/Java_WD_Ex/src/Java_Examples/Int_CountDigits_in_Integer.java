package Java_Examples;
//Java int coding qns : #15 Count DIgits in Integer
public class Int_CountDigits_in_Integer {
	public static void main(String[] args) {
		// #1
		int num1 = 298453156, count = 0, num2 = 298453156, num3 = 298453156;
		// method 1
		while(num1 != 0) {
			num1 = num1/10;
			count++;
		}
		System.out.println("Num of Digits: "+count);
		
		
		// #2
		String str = Integer.toString(num2);
		System.out.println("Num of Digits: "+str.length());
		
		
		// #3
		int count2 = String.valueOf(num3).length();
		System.out.println("Num of Digits: "+count2);
	}
}

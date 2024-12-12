package Java_Examples;
//Java int coding qns : #15b Some Of DIgits in Integer
public class Int_SumOfDigits_in_Integer {
	public static void main(String[] args) {
		int n = 987, sum = 0;
		while(n!=0) {
			sum = sum+n%10;
			n=n/10;
		}
		System.out.println(sum);
	}
}

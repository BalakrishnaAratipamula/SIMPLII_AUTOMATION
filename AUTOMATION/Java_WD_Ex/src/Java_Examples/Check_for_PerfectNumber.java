package Java_Examples;
//Java int coding qns : #22 Check for Perfect Number
public class Check_for_PerfectNumber {
	// For ex, 6 is a perfect number because its divisors are 1, 2, and 3, and their sum is 6
	public static void main(String[] args) {
		int num = 28, sum = 0; //6, 28
		for(int i=1; i<=num/2; i++) {
			if(num%i == 0) {
				sum+=i;
			}
		}
		System.out.println(num == sum);
	}
}

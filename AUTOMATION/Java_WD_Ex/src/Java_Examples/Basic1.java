package Java_Examples;

public class Basic1 {
	public static void main(String[] args) {
		int a=4, b=6, sum=0;
		
		if(a%2==0) {
			sum=a*b;
		} else {
			sum=a+b;
		}
		
		for(int i=1; i<=3; i++) {
			if(sum%2 == 0) {
				System.out.println("sum is even: "+sum);
			} else {
				System.out.println("sum is odd: "+sum);
			}
			
			sum--;
		}
		
	}
}

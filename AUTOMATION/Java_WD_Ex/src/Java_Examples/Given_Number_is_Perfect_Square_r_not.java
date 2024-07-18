package Java_Examples;

public class Given_Number_is_Perfect_Square_r_not {
	static boolean isPerfectSquare(int x) {
		if(x>=0) {
			int sqrt = (int) Math.sqrt(x);
			System.out.println(sqrt);
			if ((sqrt * sqrt) == x); //((sqrt * sqrt) == x) --> true
		}
		return false;
	}
    
	public static void main(String[] args) {
		int x = 49;
		
		if (isPerfectSquare(x))
			System.out.print("Given Number is - Perfect Square");
		else
			System.out.print("Given Number is - Not Perfect Square");
	}
}

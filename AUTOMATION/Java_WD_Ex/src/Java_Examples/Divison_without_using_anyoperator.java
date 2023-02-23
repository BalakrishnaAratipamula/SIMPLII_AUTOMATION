package Java_Examples;

public class Divison_without_using_anyoperator {
	// Function to perform division (x / y) of two numbers x and y without using division operator in the code
	public static int divide(int x, int y){
		//1.handle divisibility by 0
		if(y==0){
			System.out.printf("Error!! Divisible by 0");
		}
		//2.store sign of the result
		int sign = 1;
		if(x*y<0) {
			sign = -1;
		}
		//3.convert both dividend and divisor to positive
		x = Math.abs(x);
		y = Math.abs(y);
		// initialize quotient by 0
		int quotient = 0;
		while(x>=y) {		// loop till dividend x is more than the divisor y //loop will continue upto satisfy condition
			x = x - y;		// perform reduction on dividend
			quotient++;		
		}

		System.out.println("Remainder is " +x);
		
		return sign * quotient;
	}

	// main function to perform division of two numbers
	public static void main(String[] args){
		int dividend = 22; //x
		int divisor = -7; //y

		System.out.println("Quotient is " +divide(dividend, divisor));
	}

}

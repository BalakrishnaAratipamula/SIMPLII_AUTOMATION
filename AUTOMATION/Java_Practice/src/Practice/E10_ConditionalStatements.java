package Practice;

public class E10_ConditionalStatements {
	public static void main(String[] args) {
		//1. if statement
		/*/
		int num = -10;
		if(num < 0) {
			System.out.println("Given number is not 'Zero'");
		} //*/
		
		/*/
		if(true) {
			System.out.println("Condition is true");
		} //*/
		
		
		/*/2. if-else statement
		int n = 5;
		if(n > 0) {
			System.out.println("Given number is positive");
		} else {
			System.out.println("Given number is negetive");
		} //*/
		
		/*/
		if(false) {
			System.out.println("Cond is true");
		} else {
			System.out.println("cond is false");
		} //*/
		
		
		/*/3. if-else if-else stmt
		int n = 2;
		if(n>0) {
			System.out.println("Positive num");
		}else if (n<0){
			System.out.println("Negetive num");
		} else {
			System.out.println("Zero");
		} //*/
		
		
		
		/*/4. nested if stmt
		int i = 10; 
		if(i > 0) {
			if(i%2 == 0) {
				System.out.println("Positive num");
			} 
		} //*/
		
		
		//5. Switch case statement
		int day = 10;
		switch(day) {
			case 1: System.out.println("Monday"); break;
			case 2: System.out.println("Tuesday"); break;
			case 3: System.out.println("Wedday"); break;
			case 4: System.out.println("Thursday"); break;
			
			default: System.out.println("Invalid day");
			
		}
		
	}
}




















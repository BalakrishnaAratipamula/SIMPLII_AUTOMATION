package Java_Examples;

public class ForStatementCanLoopIndefinitly {
	public static void main(String[] args) {
		/*/1: Infinite Loop with an Empty Condition
		for(;;) {
			System.out.println("for loop executing indefinitely");
		} //*/
		
		/*/2: Infinite Loop with Explicit true Condition
		for (; true ;) {
		    System.out.println("This will also run forever!");
		} //*/
		
		//3: Infinite Loop with No Exit Condition
		for (int i = 0; i >= 0; i++) {
		    System.out.println("i = " + i);
		}
		
	}
}

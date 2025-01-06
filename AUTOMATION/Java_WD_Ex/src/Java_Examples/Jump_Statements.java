package Java_Examples;

public class Jump_Statements {
	
	//Jump statements: continue, break, return
	
	/*/ @@@@@@@@@@@@@ use of 'continue' keyword in java
	public static void main(String[] args) {
		int i = 0;
		while (i < 10) {
			if (i == 4) { //loop will continue with remaining value by i++ increment  
				i++;
				continue;
			}
			System.out.println(i);
			i++;
		}
	} //*/
	
	/*/ Continue
	public static void main(String[] args) {
		for(int i=1; i<=10; i++) {
			if(i%2==0) {
				continue; //skip the current iteration of a loop and move directly to the next one
			}
			System.out.println(i);
		}
	} //*/
	
	
	/*/@@@@@@@@@@@@@ use of 'break' keyword in java
	public static void main(String[] args) {
		for(int i=0; i<=10; i++) {
			if(i==2) {
				break;
			}
			System.out.println(i);
		}
	} //*/
	
	/*/Break
	public static void main(String[] args) {
		for(int i=1; i<=10; i++) {
			if(i==5) {
				break;
			}
			System.out.println(i);
		}
	} //*/
	
	//Break
	public static void main(String[] args) {
		int i=0;
		for(i=1; i<10; i++) {
				break;
			}
			System.out.println(i);
	} //*/
	
	/*/ @@@@@@@@@@@@@ 'return' statement
	public static int value() {
		int n = 5;
		return n;
	}
	public static void main(String[] args) {
		System.out.println("value of 'n' is:  "+value());
	} //*/
}

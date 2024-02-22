package Java_Examples;

public class break_continue_kw {
	/*/use of 'continue' keyword in java
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
	} */
	
	//use of 'break' keyword in java
	public static void main(String[] args) {
		for(int i=0; i<=10; i++) {
			if(i==2) {
				break;
			}
			System.out.println(i);
		}
	}
}

package Java_Examples;

public class Ternary_Operator3 {
	/*/
	public static void main(String[] args) { //condition ? expression1 : expression2; (If condition is true, expression1 is executed or If condition is false, expression2 is executed. 
		int count = 1;
		while(count<=15) { //Turnary cond in java (?) Is used to check the condition If is used to replace if else statement
			System.out.println(count%2 == 1 ? "****" : "####"); 
			++count;	//(count%2 == 1 ? if "cond is TRUE print this" : if "cond is FALSE print this") 
		}
	} //*/
	
	
	public static void main(String[] args) {
		int num = -10;
		String result = (num > 0) ? "Positive" : (num < 0) ? "Negative" : "Zero";
		System.out.println(result);
	}
}

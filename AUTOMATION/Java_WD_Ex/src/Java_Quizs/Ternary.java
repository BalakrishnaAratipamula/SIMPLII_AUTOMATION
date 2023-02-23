package Java_Quizs;

public class Ternary {
	public static void main(String[] args) {
		int count = 1;
		while(count<=15) { //Turnary cond in java (?) Is used to check the condition If is used to replace if else statement
			System.out.println(count%2 == 1 ? "****" : "####"); 
			++count;	//(count%2 == 1 if "cond is TRUE print this" : "cond is FALSE print this") 
		}
	}
}

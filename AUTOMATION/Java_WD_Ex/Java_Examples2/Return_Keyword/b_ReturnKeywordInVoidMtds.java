package Return_Keyword;

public class b_ReturnKeywordInVoidMtds {
	static void checkNumber(int num) {
		if(num<0) {
			System.out.println("negetive number");
			return; //exit method if number is negative
		}
		System.out.println("positive number");
	}
	
	public static void main(String[] args) {
		checkNumber(-5);
		checkNumber(10);
	}
}

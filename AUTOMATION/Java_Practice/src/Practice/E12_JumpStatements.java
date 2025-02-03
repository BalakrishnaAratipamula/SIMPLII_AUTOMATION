package Practice;

public class E12_JumpStatements {
	/*/Jump stmts: Loop control statements(continue, break) and return
	public static void main(String[] args) {
		// continue
		int i = 0;
		while(i<10) {
			if(i==5) {
				i++; 
				continue; //ignore the current iteration and continue with next iteration
			}
			System.out.println(i); //while
			i++;
		} //*/
		
		/*/
		for(int i=1; i<=8; i++) {
			if(i==3) {
				System.out.println("iteration "+ i +" is skipped and continuing with next iteration");
				continue;
			}
			System.out.println(i);
		} //*/
		
		
		
		
		/*/Break
		for(int i=1; i<=9; i++) {
			if(i==4) {
				break; //terminates the loop
			}
			System.out.println(i);
		} //*/
		
		/*/
		for(int i=10; i>=0; i--) {
			if(i==5) {
				break;
			}
			System.out.println(i);
		} //*/
		
	
	/*/return statement
	private static String subMethod() {
		String str = "Selenium WebDriver";
		
		return str;
	}
	
	public static void main(String[] args) {
		//non-static
//		E12_JumpStatements obj = new E12_JumpStatements();
//		System.out.println(obj.subMethod());
		
		//static
		System.out.println("The value of String is: "+subMethod());
	} //*/
	
} 	
		


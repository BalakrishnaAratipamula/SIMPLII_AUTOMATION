package Practice;

public class E24_ReturnType {

	//sub method
	public String m1() {
		return "Selenium-java";
	}
	
	//sub method
	public int m2() {
		return 12345;
	}
	
	public static void main(String[] args) {
		Character ch = 'D';
		System.out.println(ch);
		
		E24_ReturnType obj = new E24_ReturnType();
		//to get 'sub method' returning 'str' value 
		String str = obj.m1();
		System.out.println(str);
		
		//to get 'sub method' returning 'int' value 
		int i = obj.m2();
		System.out.println(i);
	}
}

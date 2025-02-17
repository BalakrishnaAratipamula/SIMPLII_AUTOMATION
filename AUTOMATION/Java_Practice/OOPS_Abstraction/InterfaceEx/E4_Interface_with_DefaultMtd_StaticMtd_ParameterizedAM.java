package InterfaceEx;

//interface 
interface E4_Interface1 {
	// Parameterized Abstract Method
	void m1(String str);

	// Parameterized Default Method
	default void log(String str) {
		System.out.println("E4_Interface1 log(): " + str);
	}

}

//interface 
interface E4_Interface2 {
	// Parameterized Abstract Method
	void m2(String str);

	// Parameterized Default Method
	static void log(String str) {
		System.out.println("E4_Interface2 log(): " + str);
	}

}

//main class
public class E4_Interface_with_DefaultMtd_StaticMtd_ParameterizedAM implements E4_Interface1, E4_Interface2 {

	@Override
	public void m1(String str) {
		System.out.println("implemented m1() is calling");
	}

	@Override
	public void m2(String str) {
		System.out.println("implemented m2() is calling");
	}

	public void log(String str) {
		System.out.println("log() is calling from E4_Interface_with_DefaultMtd_StaticMtd_ParameterizedAM class:  "+str);
		E4_Interface1.super.log("abc"); //to call default method
		E4_Interface2.log("xyz"); //to call static method
		
	}
	
	//main method
	public static void main(String[] args) {
		E4_Interface_with_DefaultMtd_StaticMtd_ParameterizedAM obj = new E4_Interface_with_DefaultMtd_StaticMtd_ParameterizedAM();
		obj.log("123");
	}
}


























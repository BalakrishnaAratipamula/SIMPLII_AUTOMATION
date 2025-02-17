package Interface_DefaultMtd_StaticMtd_1;

public class E1_TestClass implements E1_Interface1, E1_Interface2{

	@Override
	public void method1(String str) {
	}

	@Override
	public void method2(String str) {
	}

	@Override
	public void log(String str) {
		System.out.println("TestClass logging:  "+str);
		E1_Interface1.super.log("abc");
		E1_Interface2.super.log("xyz");
	}
	
	
	public static void main(String[] args) {
		E1_TestClass tc = new E1_TestClass();
		tc.log("123");
	}
}

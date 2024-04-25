package Interface_DefaultMtd_StaticMtd_1;

public class TestClass implements Interface1, Interface2{

	@Override
	public void method1(String str) {
	}

	@Override
	public void method2(String str) {
	}

	@Override
	public void log(String str) {
		System.out.println("TestClass logging:  "+str);
		Interface1.super.log("abc");
		Interface2.super.log("xyz");
	}
	
	
	public static void main(String[] args) {
		TestClass tc = new TestClass();
		tc.log("123");
	}
}

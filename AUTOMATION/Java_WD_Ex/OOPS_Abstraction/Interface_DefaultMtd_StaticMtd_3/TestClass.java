package Interface_DefaultMtd_StaticMtd_3;

public class TestClass implements Animal {

	public void dog() {
		System.out.println("dog() from TestClass");
	}
	
	public String cat(String str){
		System.out.println("cat() executed from TestClass");
		return str;
	}
	
	public boolean fox(){
		System.out.println("fox() executed from TestClass");
		return false;
	}
	
	public static void main(String[] args) {
		TestClass tc = new TestClass();
		tc.dog();
		tc.cat("PQR");
		tc.fox();	//we can't able to call 'static' methods from this class
	}
}

package Interface_DefaultMtd_StaticMtd_2;

public class TestClass implements Interface1{

	public boolean isNull(String str) {
		System.out.println("isNull() from TestClass class");
		
		System.out.println(str==null ? true:false);
		return str==null ? true:false;
	}
	
	public static void main(String[] args) {
		TestClass tc = new TestClass();
//		tc.print("");	//check:   if(!isNull(str))
		tc.isNull("abc");	//null, "" both are different in this case of comparision
	}
}

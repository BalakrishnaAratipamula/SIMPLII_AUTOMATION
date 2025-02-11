package Types_Of_Inheritance;

public class E6_SIngle_Inheritance_2_Test extends E6_SIngle_Inheritance_1{
	public void userLoigin() {
		System.out.println("userLoigin() method is calling");
	}
	
	//main method
	public static void main(String[] args) {
		E6_SIngle_Inheritance_2_Test obj = new E6_SIngle_Inheritance_2_Test();
		obj.setUp();
		obj.userLoigin();
		obj.tearDown();
	}
	
}

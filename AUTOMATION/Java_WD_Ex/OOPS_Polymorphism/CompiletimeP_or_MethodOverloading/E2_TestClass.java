package CompiletimeP_or_MethodOverloading;

public class E2_TestClass {
	public static void main(String[] args) {

		E1_ClassA obj = new E1_ClassA(); //When type of object is determined at compiled time is known as static polymorphism.
		obj.add(2,3);
		obj.add(2,3,4);
		obj.add(2.8,2,3);
		obj.add("Bala",2);
		E1_ClassA.add2("Bala",2); 
	}
}
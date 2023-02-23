package CompiletimeP_or_MethodOverloading;

public class TestClass {
	public static void main(String[] args) {

		classA obj = new classA(); //When type of object is determined at compiled time is known as static polymorphism.
		obj.add(2,3);
		obj.add(2,3,4);
		obj.add(2.8,2,3);
		obj.add("Bala",2);
		//add2("Bala",2); ////if we want to call this method extend parent class
	}
}
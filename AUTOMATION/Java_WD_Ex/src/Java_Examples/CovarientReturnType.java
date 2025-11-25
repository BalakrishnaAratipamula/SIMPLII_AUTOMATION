package Java_Examples;

//When overriding a method, the return type can be a subclass of the original return type. 

class A{ A get() { System.out.println("Class A get() is called"); return this;}} // A get() - A is the return type
class B extends A{ B get() { System.out.println("Class B get() is called"); return this;}} // B get() - B is the return type

public class CovarientReturnType {
	public static void main(String[] args) {
		//When overriding a method, the return type can be a subclass of the original return type. 
		B b = new B();
		b.get();
		
		//Just for practice...
		A ab = new B();
		ab.get();
		A a = new A();
		a.get();
	}
}

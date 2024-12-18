package AbstractClass;

abstract class Animal2{
	private String name;
	
	public Animal2() { 
		System.out.println("Animal2() -no argument constructor is calling");
	}
	
	public Animal2(String name) {
		this.name=name;
		System.out.println(name);
		System.out.println("Animal2() -single argument constructor is calling");
	}
	
	protected abstract void makeSound2();
}

class Dog2 extends Animal2{
	private String bread;
	
	Dog2(String name, String bread){
		super(name);
		
		this.bread=bread;
		System.out.println(bread);
	} //*/
	
	@Override
	protected void makeSound2() {
		System.out.println("woof!!!!");
	}
}

public class XAbstractClass_allow_Constructors {
	public static void main(String[] args) {
		Animal2 a1 = new Dog2("Puppy", "Hybrid");
		a1.makeSound2();
	}
}

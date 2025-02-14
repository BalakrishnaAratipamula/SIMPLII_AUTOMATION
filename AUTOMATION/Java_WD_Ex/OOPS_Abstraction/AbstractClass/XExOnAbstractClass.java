package AbstractClass;

abstract class Animal{	//Abstract class must be declared with abstract keyword
	public abstract void makeSound1(); //Abstract method must be declared with abstract keyword
	protected abstract void makeSound2();
//	private abstract void makeSound3();   //AM not declared as private
//	final abstract void makeSound4();   //Am not declared as final
}

class Dog extends Animal{
	@Override
	public void makeSound1() {
		System.out.println("Dog class makeSound1() is calling");
	}
	@Override
	public void makeSound2() {
		System.out.println("Dog class makeSound2() is calling");
	}
}

class Cat extends Animal{
	@Override
	public void makeSound1() {
		System.out.println("Cat class makeSound1() is calling");
	}
	@Override
	public void makeSound2() {
		System.out.println("Cat class makeSound1() is calling");
	}
}
public class XExOnAbstractClass {
	public static void main(String[] args) {
		Animal a1 = new Dog();	//abstract_class = concrete_class
		Animal a2 = new Cat(); 	//abstract_class = concrete_class
		a1.makeSound1();
		a1.makeSound2();
		a2.makeSound1();
		a2.makeSound2();
	}
}

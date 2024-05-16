package AbstractClass;

import Java_Examples.AAA_EOT;

abstract class Animal{	//Abstract class must be declared with abstract keyword
	public abstract void makeSound(); //Abstract method must be declared with abstract keyword
	protected abstract void makeSound2();
//	private abstract void makeSound3();   //AM not declared as private
//	final abstract void makeSound4();   //Am not declared as final
}

class Dog extends Animal{
	@Override
	public void makeSound() {
		System.out.println("Woof!");
	}
	@Override
	public void makeSound2() {
		System.out.println("Woof!2");
	}
}

class Cat extends Animal{
	@Override
	public void makeSound() {
		System.out.println("Meow!");
	}
	@Override
	public void makeSound2() {
		System.out.println("Meow!2");
	}
}
public class XExOnAbstractClass {
	public static void main(String[] args) {
		Animal a1 = new Dog();	//abstract_class = concrete_class
		Animal a2 = new Cat(); 	//abstract_class = concrete_class
		a1.makeSound();
		a2.makeSound();
		a1.makeSound2();
		a2.makeSound2();
	}
}

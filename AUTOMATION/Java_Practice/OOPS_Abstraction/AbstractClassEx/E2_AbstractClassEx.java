package AbstractClassEx;

//abstract class
abstract class Animal{ //not allowing as a public bcz for this package main class is present
	public abstract void makeSound1();
	protected abstract void makeSound2();
}

//concrete class
class Dog extends Animal{

	@Override
	public void makeSound1() {
		System.out.println("makeSound1() method is calling from 'Dog' class");
	}

	@Override
	protected void makeSound2() {
		System.out.println("makeSound2() method is calling from 'Dog' class");
	}
	
}

//concrete class
class Cat extends Animal {

	@Override
	public void makeSound1() {
		System.out.println("makeSound1() method is calling from 'Cat' class");
	}

	@Override
	protected void makeSound2() {
		System.out.println("makeSound1() method is calling from 'Cat' class");
	}
	
}

//main class
public class E2_AbstractClassEx {
	public static void main(String[] args) {
		Animal a1 = new Dog();
		Animal a2 = new Cat();
		
		a1.makeSound1(); //Dog
		a1.makeSound2(); //Dog
		a2.makeSound1(); //Cat
		a2.makeSound2(); //Cat
	}
}











package Types_Of_Inheritance;

class Animal2{
	void eat() {
		System.out.println("the Animal2 is eating");
	}
}

class Dog2 extends Animal2{
	void eat() {
		System.out.println("Dog2 is eating");
	}
}

class Pig extends Dog2{
	void eat() {
		System.out.println("Pig is eating");
	}
}

public class E2_Multilevel_Inheritance {
	public static void main(String[] args) {
		Animal2 mi1 = new Dog2();
		Animal2 mi2 = new Pig();
		mi1.eat();
		mi2.eat();
	}
}

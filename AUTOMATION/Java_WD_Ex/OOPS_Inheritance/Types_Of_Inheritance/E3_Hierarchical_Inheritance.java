package Types_Of_Inheritance;

class Animal3{
	void eat() {
		System.out.println("the Animal3 is eating");
	}
}

class Dog3 extends Animal3{
	void eat() {
		System.out.println("Dog3 is eating");
	}
}

class Cat extends Animal3{
	void eat() {
		System.out.println("Cat is eating");
	}
}

public class E3_Hierarchical_Inheritance {
	public static void main(String[] args) {
		Animal3 hi1 = new Dog3();
		Animal3 hi2 = new Cat();
		hi1.eat();
		hi2.eat();
	}
	
}

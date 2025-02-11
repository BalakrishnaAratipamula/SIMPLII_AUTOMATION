package Types_Of_Inheritance;

class Animal{
	void eat() {
		System.out.println("the Animal is eating");
	}
}

class Dog extends Animal{
	void eat() {
		System.out.println("Dog is eating");
	}
}

public class E1_Single_Inheritance {
	public static void main(String[] args) {
		Animal si = new Dog();
		si.eat();
		
		new Animal().eat();
	}
}

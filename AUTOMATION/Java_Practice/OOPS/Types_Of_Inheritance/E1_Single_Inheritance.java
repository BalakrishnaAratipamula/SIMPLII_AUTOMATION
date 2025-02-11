package Types_Of_Inheritance;

//class
class Animal{
	void eat() {
		System.out.println("The Animal is eating");
	}
}

//class
class Dog extends Animal{ //extends keyword is used to establishing the relationship between two classes
	void eat() {
		System.out.println("The Dog is eating");
	}
}


//Main class
public class E1_Single_Inheritance {
	public static void main(String[] args) {
		Animal si1 = new Dog();
		si1.eat(); //The Dog is eating
		
		/*
		Animal si2 = new Animal();
		si2.eat(); */
		//////OR//////
		
		new Animal().eat(); //The Animal is eating 
	}
}

package Types_Of_Inheritance;

//interface
interface Animal4{
	public void eat(); //method declaration only - Abstract Method
}

//interface
interface Pet{
	public void eat(); //method declaration only - Abstract Method
	void play();	//method declaration only - Abstract Method
}

class Dog4 implements Animal4, Pet{
	@Override
	public void eat() {
		System.out.println("The Dog4 is eating");
	}
	
	@Override
	public void play() {
		System.out.println("The Dog4 is playing");
	}
}

//main
public class E4_Multiple_Inheritance {
	public static void main(String[] args) {
		Animal4 mi1 = new Dog4();
		Pet mi2 = new Dog4();
		
		mi1.eat();
		mi2.eat();
		mi2.play();
	}
}

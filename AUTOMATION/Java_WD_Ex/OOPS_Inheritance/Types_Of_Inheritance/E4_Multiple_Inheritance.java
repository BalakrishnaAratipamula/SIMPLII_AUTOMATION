package Types_Of_Inheritance;

interface Animal4{
	public void eat();
}

interface Pet{
	public void eat();
	void play();
}

class Dog4 implements Animal4, Pet{
	@Override
	public void eat() {
		System.out.println("Dog4 is eating");
	}
	@Override
	public void play() {
		System.out.println("Dog4 is playing");
	}
}

public class E4_Multiple_Inheritance{
	public static void main(String[] args) {
		Animal4 Mi1 = new Dog4();
		Pet Mi2 = new Dog4();
		Mi1.eat();
		Mi2.eat();
		Mi2.play();
	}
}
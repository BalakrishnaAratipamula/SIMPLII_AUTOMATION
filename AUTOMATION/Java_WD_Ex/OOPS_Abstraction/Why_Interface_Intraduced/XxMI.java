package Why_Interface_Intraduced;

interface Animal{
	void eat();
	void sleep();
}

interface Flyer{
	void eat();
	void fly();
}

class Bird implements Animal, Flyer{
	
	@Override
	public void fly() {
		System.out.println("Bird is flying");
	}
	@Override
	public void eat() {
		System.out.println("\nBird is eating");
	}
	@Override
	public void sleep() {
		System.out.println("Bird is sleeping");
	}
	
}

public class XxMI {
	public static void main(String[] args) {
		Animal a1 = new Bird();
		a1.eat();
		a1.sleep();
		
		Flyer f1 = new Bird();
		f1.eat();
		f1.fly();
	}
}

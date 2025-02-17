package AbstractClassEx;

//Abstract class
abstract class Animal2 {
	private String name;

	public Animal2() { //not-parameterized constructor for Abstract class
		System.out.println("Animal2() not-parameterized constructor is calling");
	}

	public Animal2(String name) { //parameterized constructor for Abstract class
		this.name=name; //to initialize method level var's with class level var's
		System.out.println(name); //1
		System.out.println("Animal2() parameterized constructor is calling"); //2
	}
	
	//Abstract method
	protected abstract void makeSound2();
}

//concrete class
class Dog2 extends Animal2{
	private String bread;
	
	Dog2(String name, String bread){
		super(name); //pass 'name' to single parameter constructor in Parent class
		
		this.bread=bread;
		System.out.println(bread); //3
		
	}
	
	@Override
	protected void makeSound2() {
		System.out.println("Implemented makeSound2() abstrcat method in 'Dog' class"); //4
	}
	
}

//main class
public class E3_AbstractClass_allow_Constructor {
	public static void main(String[] args) {
		Animal2 a1 = new Dog2("Puppy", "Hybrid"); //call two parameter constructor will call
		a1.makeSound2();
	}
}

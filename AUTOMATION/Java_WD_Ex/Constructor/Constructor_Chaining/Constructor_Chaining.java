package Constructor_Chaining;

class employee{
	private String name;
	private int age;
	
	employee(){
		this("\nJohn t", 32);
	}

	employee(String n, int a) {
		this.name=n;
		this.age=a;
		System.out.println(n);
		System.out.println(a);
	}
}

public class Constructor_Chaining extends employee{ //main class
	private String company;
	public Constructor_Chaining() {
		super("john s", 42);
		this.company="Google";
		System.out.println(company);
	}
	
	public static void main(String[] args) {
		Constructor_Chaining cc = new Constructor_Chaining();
		employee em = new employee();
		
	}
	
}

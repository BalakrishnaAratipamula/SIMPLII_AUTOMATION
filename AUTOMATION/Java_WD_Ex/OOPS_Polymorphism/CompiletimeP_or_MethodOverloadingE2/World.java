package CompiletimeP_or_MethodOverloadingE2;

class Hello{	//nested class
	void add() {
		System.out.println("One");
	}
}

public class World extends Hello{	//main class
	void add() {
		System.out.println("Two");
	}
	
	public static void main(String[] args) {
		World obj = new World();
		obj.add();
	}
}

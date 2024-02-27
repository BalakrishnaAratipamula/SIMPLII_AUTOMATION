package RuntimeP_or_MethodOverridingE3;

class Hello{	//nested class
	void add() {
		System.out.println("HelloClass");
	}
}

public class World extends Hello{	//main class
	void add() {
		System.out.println("WorldClass");
	}
	
	public static void main(String[] args) {
		World obj = new World();
		obj.add();
	}
}

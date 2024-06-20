package AccessModifier;

class DefaultClassEx {
	void display() {
		System.out.println("Try to access outer default class");
	}

	public static void main(String[] args) {
		DefaultClassEx p = new DefaultClassEx();
		p.display();

	}
}

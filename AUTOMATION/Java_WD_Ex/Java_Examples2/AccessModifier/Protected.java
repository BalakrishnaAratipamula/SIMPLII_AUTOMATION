package AccessModifier;

class Animal {
	// protected method
	protected void displsy() {
		System.out.println("msg from display method");
	}
}

class Protected extends Animal{
	public static void main(String[] args) {
		Protected obj = new Protected();
		//accessing protected method
		obj.displsy();	
	}
}

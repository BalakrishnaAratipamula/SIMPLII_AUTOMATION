package AccessModifier;

class Animal {    // dafault
	// protected method
	protected void displsy() {
		System.out.println("msg from display method");
	}
}

class Protected extends Animal{   //class can't be create as protected //top level class allows only public, default
	public static void main(String[] args) {
		Protected obj = new Protected();
		//accessing protected method
		obj.displsy();	
	}
}

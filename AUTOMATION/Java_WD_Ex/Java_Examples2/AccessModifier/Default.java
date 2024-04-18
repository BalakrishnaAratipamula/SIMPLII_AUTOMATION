package AccessModifier;

class Default {
	
	void msg() {
		System.out.println("msg");
	}
	
	public static void main(String[] args) {
		Default obj = new Default();
		obj.msg();
	}
}

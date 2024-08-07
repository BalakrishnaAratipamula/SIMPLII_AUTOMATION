package InitializerBlocks;

public class static_InitializerBlock {
	static int a = 5;
	
	static { //static block
		System.out.println("Executing static block");
	}
	
	{ //non-static block
		System.out.println("Executing non-static block");
	}

	static_InitializerBlock() { //just constructor
		System.out.println("Executing Constrcutor");
	}

	public static void main(String arg[]) {
		System.out.println("Executing Main method");
	}
}

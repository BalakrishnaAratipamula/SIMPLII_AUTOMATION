package InitializerBlocks;

public class nonstatic_InitializerBlock {
	
	static { //static block
		System.out.println("Executing static block");
	}
	
	{ //non-static block
		System.out.println("Executing non-static block");
	}

	nonstatic_InitializerBlock() { //just constructor
		System.out.println("Executing Constructor");
	}

	public static void main(String arg[]) {
		nonstatic_InitializerBlock obj = new nonstatic_InitializerBlock();
		System.out.println("Executing Main method");
	}
}

package Interface_DefaultMtd_StaticMtd_3;

public interface Animal {

	void dog();			//Method1 - Abstract method
	
	default String cat(String str){ //Method2 - Non-Abstract method	//Non-Abstract method allows only static & default modifiers
		System.out.println("cat() executed from Interface Animal");
		return str;
	}
	
	static boolean fox(){ //Method3 - Non-Abstract method	//Non-Abstract method allows only static & default modifiers
		System.out.println("fox() executed from Interface Animal");
		return false;
	}
	
//	private void lion() {	//private methods will allow from java 9 onwards currently we have java 8 in my machine
//		System.out.println();
//	}
}

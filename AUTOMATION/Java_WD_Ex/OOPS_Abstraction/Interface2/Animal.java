package Interface2;

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
}

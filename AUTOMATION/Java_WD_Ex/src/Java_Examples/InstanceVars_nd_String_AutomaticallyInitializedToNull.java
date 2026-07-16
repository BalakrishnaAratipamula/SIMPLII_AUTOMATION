package Java_Examples;

public class InstanceVars_nd_String_AutomaticallyInitializedToNull {
	//1. Instance Variables
	String name;  // String / Instance Variables automatically initialized
    
    void print() {
        System.out.println(name);  // prints: null
    }
    
    //2. Local Variables
	void method() {
	    String localName;  // not initialized
	    int x;
//	    System.out.println(localName);  // ❌ Compile-time error
//	    System.out.println(x);	// ❌ Compile-time error
	    
	}
}

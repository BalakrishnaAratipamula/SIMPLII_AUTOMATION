package Interface;

public interface AMs_nd_Vars_specifyingInside_Interface {
	
	int MAX_SPEED = 120;   // implicitly public static final
    public static final String TYPE = "Car"; // explicitly written
    
	void method1();      // implicitly public and abstract
    public void method2();  // explicitly public
    abstract void method3(); // explicitly abstract
}

package Interface_DefaultMtd_StaticMtd_1;

public interface E1_Interface1 {

	void method1(String str); //Abstract method
	
	default void log(String str) {
		System.out.println("I1 log():  "+str);
	}
}

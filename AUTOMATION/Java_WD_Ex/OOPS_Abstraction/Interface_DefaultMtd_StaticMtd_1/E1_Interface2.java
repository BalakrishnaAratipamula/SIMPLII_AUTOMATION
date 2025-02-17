package Interface_DefaultMtd_StaticMtd_1;

public interface E1_Interface2 {
	
	void method2(String str); //Abstract method

	default void log(String str) {
		System.out.println("I1 log():  " + str);
	}
}

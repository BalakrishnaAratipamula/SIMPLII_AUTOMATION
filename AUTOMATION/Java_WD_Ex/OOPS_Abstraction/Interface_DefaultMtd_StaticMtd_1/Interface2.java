package Interface_DefaultMtd_StaticMtd_1;

public interface Interface2 {
	
	void method2(String str);

	default void log(String str) {
		System.out.println("I1 log():  " + str);
	}
}

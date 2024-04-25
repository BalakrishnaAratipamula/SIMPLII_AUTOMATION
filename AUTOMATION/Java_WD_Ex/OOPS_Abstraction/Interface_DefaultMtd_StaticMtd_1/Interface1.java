package Interface_DefaultMtd_StaticMtd_1;

public interface Interface1 {

	void method1(String str);
	
	default void log(String str) {
		System.out.println("I1 log():  "+str);
	}
}

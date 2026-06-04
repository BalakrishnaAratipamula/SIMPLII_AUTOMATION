package Interface_DefaultMtd;

/////If two interfaces contain the same default method and a class implements both interfaces, then a compilation error occurs. This is called the Diamond Problem in Java. To resolve this ambiguity, the implementing class must override the default method. 

interface A {
	default void show() {
		System.out.println("Interface A");
	}
}

interface B {
	default void show() {
		System.out.println("Interface B");
	}
}

public class Two_Interfaces_have_same_default_mtds_then_get_compilationError implements A, B {
	public void show() {
		System.out.println("Overridden Method");
	}

	public static void main(String[] args) {
		Two_Interfaces_have_same_default_mtds_then_get_compilationError d = new Two_Interfaces_have_same_default_mtds_then_get_compilationError();
		d.show();
	}
}

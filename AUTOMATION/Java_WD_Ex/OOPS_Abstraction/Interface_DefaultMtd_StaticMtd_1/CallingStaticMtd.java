package Interface_DefaultMtd_StaticMtd_1;

interface Test {
	static void show() {
		System.out.println("Static method in interface");
	}
}

public class CallingStaticMtd {
	public static void main(String[] args) {
		Test.show();
	}
}

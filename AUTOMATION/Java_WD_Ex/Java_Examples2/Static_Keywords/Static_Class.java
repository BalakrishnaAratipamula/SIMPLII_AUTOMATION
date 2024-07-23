package Static_Keywords;

public class Static_Class {
	// static class declared here

	static class SampleStaticClass {
		int a = 10;
	}

	public static void main(String args[]) {

		Static_Class.SampleStaticClass staticClass = new Static_Class.SampleStaticClass();
		System.out.println(staticClass.a);

	}
}

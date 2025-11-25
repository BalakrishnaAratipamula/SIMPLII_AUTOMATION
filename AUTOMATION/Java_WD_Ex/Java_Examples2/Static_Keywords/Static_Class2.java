package Static_Keywords;

public class Static_Class2 {
	// static class declared here

	static class SampleStaticClass {
		int a = 10;
	}

	public static void main(String args[]) {

		Static_Class2.SampleStaticClass staticClass = new Static_Class2.SampleStaticClass();
		System.out.println(staticClass.a);

	}
}

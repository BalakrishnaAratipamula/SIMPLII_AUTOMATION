package CompiletimeP_or_MethodOverloading;

public class classA {
	
	public void add(int a, int b) {
		int c=a+b;
		System.out.println(c);
	}
	
	public void add(int a, int b, int c) {
		int d=a+b+c;
		System.out.println(d);
	}
	
	public void add(double a, int b, int c) {
		double d=a+b+c;
		System.out.println(d);
	}
	
	public void add(String str, int a) {
		System.out.println(str+" , "+a);
	}
	
	public static void add2(String str, int a) {
		System.out.println(str+" , "+a);
	}
}

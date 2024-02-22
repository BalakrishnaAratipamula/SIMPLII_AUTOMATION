package Java_Quizs;

public class PrimitiveDataTypesOrder {
	//while execution JVM will follow this order: int, long, Integer, int...
	void print(Integer i) {
		System.out.println("Integer");
	}
	
	void print(long i) {
		System.out.println("long");
	}
	void print(int i) {
		System.out.println("int");
	}
	void print(int... i) {
		System.out.println("int...");
	}
	public static void main(String[] args) {
		new PrimitiveDataTypesOrder().print(10);
	}
	
}

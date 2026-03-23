package PairClass;

public class Methods_ProvidedFrom_PairClass {
	public static void main(String[] args) {
		Pair<Integer, String> p1 = new Pair<>(1, "Apple");

		System.out.println("getKey(): " + p1.getKey());
		System.out.println("getValue(): " + p1.getValue());
		System.out.println("toString(): " + p1.toString());

		Pair<Integer, String> p2 = new Pair<>(1, "Apple");
		System.out.println("equals(): " + p1.equals(p2));
	}
}

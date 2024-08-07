package GerericClass;

//create a Generics class
class Generics_Class2<T> {

	// variable of T type
	private T data;

	public Generics_Class2(T data) {
		this.data = data;
	}

	// method that return T type variable
	public T getData() {
		return this.data;
	}
}

public class GerericClassEx2 {
	public static void main(String[] args) {

		// initialize generic class with Integer data
		Generics_Class2<Integer> intObj = new Generics_Class2<>(5);
		System.out.println("Generic Class returns: " + intObj.getData());

		// initialize generic class with String data
		Generics_Class2<String> stringObj = new Generics_Class2<>("Java Programming");
		System.out.println("Generic Class returns: " + stringObj.getData());
	}
}
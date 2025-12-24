package MethodReference_vs_Lambda;

import java.util.Random;
import java.util.function.Supplier;

public class AA_SupplierExample {
	
	//Exec 1 
	public static void main(String[] args) {
		Random random = new Random();
		System.out.println(random.nextInt(100));
	}
	
	/*/Exec 2
	public static void main(String[] args) {

		// Supplier that supplies a random integer
		Supplier<Integer> randomNumberSupplier = () -> {
			Random random = new Random();
			return random.nextInt(100); // 0 to 99
		};

		// Get value from Supplier
		Integer number = randomNumberSupplier.get(); //(or) we can take 'int'
		System.out.println("Random number: " + number);
	} //*/
}

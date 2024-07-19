package GarbageCollectorEx;

public class force_Garbage_Collection {
	public void finalize() {
		System.out.println("Object is Garbage Collected  " + this);
	}

	public static void main(String args[]) {

		force_Garbage_Collection m1 = new force_Garbage_Collection();
		force_Garbage_Collection m2 = new force_Garbage_Collection();

		m1 = null;
		System.gc();

		m2 = null;
		Runtime.getRuntime().gc();

	}
}

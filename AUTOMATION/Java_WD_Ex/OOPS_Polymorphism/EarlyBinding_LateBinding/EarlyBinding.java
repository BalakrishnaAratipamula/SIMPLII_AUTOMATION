package EarlyBinding_LateBinding;

public class EarlyBinding {
	void show() {
        System.out.println("Early / Static Binding Example");
    }

    public static void main(String[] args) {
    	EarlyBinding obj = new EarlyBinding();
        obj.show(); // Resolved at compile-time (early binding)
    }
}

package CompiletimeP_or_MethodOverloading;

public class AMs_doNotMatterFor_Overloading {
	public void display(int a) {
        System.out.println("Public: " + a);
    }

    private void display(double a) {  // different parameter type, private access
        System.out.println("Private: " + a);
    }

    void display(int a, int b) {      // different number of parameters, default access
        System.out.println("Default: " + (a + b));
    }
}

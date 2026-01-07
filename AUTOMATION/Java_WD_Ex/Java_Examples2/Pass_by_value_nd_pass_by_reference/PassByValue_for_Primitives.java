package Pass_by_value_nd_pass_by_reference;

public class PassByValue_for_Primitives {
	static void change(int x) {
        x = 10;
    }

    public static void main(String[] args) {
        int a = 5;
        change(a); //x receives a copy of a
        System.out.println(a); //hanging x does not affect a
    }
}

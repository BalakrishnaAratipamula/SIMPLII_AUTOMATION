package Java_Examples;

public class Static_block_cnt_throw_checked_exceptions_directly {
	static int x;

    static {
        x = 10/ 0; //ArithmeticException
    }

    public static void main(String[] args) {
        System.out.println(x);
    }
}

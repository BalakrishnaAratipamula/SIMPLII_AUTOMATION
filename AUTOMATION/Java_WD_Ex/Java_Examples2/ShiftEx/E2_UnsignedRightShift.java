package ShiftEx;

public class E2_UnsignedRightShift {
	public static void main(String[] args) {
        int x = 8;    // 0000 1000
        int y = -8;   // 1111 1000 (two’s complement)

        System.out.println(x >>> 2);  // 8 / 4 = 2
        System.out.println(y >>> 2);  // large positive number
    }
}

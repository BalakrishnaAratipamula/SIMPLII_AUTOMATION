package ShiftEx;

public class E1_SignedRightShift {
	public static void main(String[] args) {
        int x = 8;    // binary: 0000 1000
        int y = -8;   // binary: 1111 1000 (two's complement)

        System.out.println(x >> 2);  // 8 / 2^2 = 2
        System.out.println(y >> 2);  // -8 / 2^2 = -2
	}
}

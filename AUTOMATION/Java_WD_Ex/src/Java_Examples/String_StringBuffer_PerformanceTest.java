package Java_Examples;

public class String_StringBuffer_PerformanceTest {
	public static String concatWithString() {
		String str = "Java";
		for (int i=0; i<10000; i++) {
			str = str + "Content";
		}
		return str;
	}

	public static String concatWithStringBuffer() {
		StringBuffer sb = new StringBuffer("Java");
		for (int i=0; i<10000; i++) {
			sb.append("Content");
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		System.out.println(concatWithString());
		System.out.println("Time taken by Concating with String: " + (System.currentTimeMillis() - startTime) + "ms");
		startTime = System.currentTimeMillis();
		System.out.println("\n"+concatWithStringBuffer());
		System.out.println("Time taken by Concating with  StringBuffer: " + (System.currentTimeMillis() - startTime) + "ms");
	}
}

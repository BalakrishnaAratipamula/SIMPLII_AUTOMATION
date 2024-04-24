package Java_Examples;

public class StringBuffer_StringBulder {
	/*/
	public static void main(String[] args) {
		StringBuffer str = new StringBuffer("Hello");
	    System.out.println(str.toString());
	    str.append(" World!");
	    str.append("------> buffer");
	    System.out.println(str.toString());
	    
	    StringBuilder str2 = new StringBuilder("Hello");
	    System.out.println(str2.toString());
	    str2.append(" World!");
	    str2.append("------> builder");
	    System.out.println(str2.toString());
	} //*/
	
	
	
	/*/
	public static void main(String[] args) {
		StringBuffer buffer = new StringBuffer("****hello");
		buffer.append("java****");
		buffer.append("buffer");
		System.out.println(buffer);

		StringBuilder builder = new StringBuilder("******hello");
		builder.append("java******");
		builder.append("builder");
		System.out.println(builder);
	} //*/

	
	
	// Diff b/n String and StringBuilder
	public static String concatWithString() {
		String t = "Java";
		for (int i=0; i<10000; i++) {
			t = t+"Tpoint";
		}
		return t;
	}

	public static String concatWithStringBuffer() {
		StringBuffer sb = new StringBuffer("Java");
		for (int i=0; i<10000; i++) {
			sb.append("Tpoint");
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		concatWithString();
		System.out.println("Time taken by Concating with String: " + (System.currentTimeMillis() - startTime) + "ms");
		startTime = System.currentTimeMillis();
		concatWithStringBuffer();
		System.out.println(
				"Time taken by Concating with  StringBuffer: " + (System.currentTimeMillis() - startTime) + "ms");
	} //*/
}
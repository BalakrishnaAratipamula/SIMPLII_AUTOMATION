package Java_Examples;

public class a2b3c4_aabbbcccc {
	public static void main(String[] args) {
		/*/a2b3c4d2 --> aabbbccccdd
		String str = "a2b3c4d2";
		for (int i=0; i<str.length(); i++) {
			if (Character.isAlphabetic(str.charAt(i))) {
				System.out.print(str.charAt(i));
			} else {
				int a = Character.getNumericValue(str.charAt(i));
				for (int j=1; j<a; j++) {
					System.out.print(str.charAt(i-1));
				}
			}
		} //*/
		
		
		//aabbbccccdd --> a2b3c4d2
		String str = "aabbbccccdd";
		int count = 1;
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<str.length(); i++) {
			if(i+1 < str.length() && str.charAt(i) == str.charAt(i+1))
				count++;
			else {
				sb.append(str.charAt(i)).append(count);
				count = 1;
			}
		}
		
		System.out.println(sb);
		
	}
}
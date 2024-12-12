package Java_Examples;
//Java int coding qns : #28 Split an Alpha Numeric digit without using split method
public class SplitAn_AlphaNumericDigit_wo_using_split_mtd {
	public static void main(String[] args) {
		String str = "Welcome123459toJava Programming@#$!!";
		StringBuffer num = new StringBuffer(),
					 alpha = new StringBuffer(),
					 specialChars = new StringBuffer();
		for(int i=0; i<str.length(); i++) {
			if(Character.isDigit(str.charAt(i)))
				num.append(str.charAt(i));
			else if(Character.isAlphabetic(str.charAt(i)))
				alpha.append(str.charAt(i));
			else
				specialChars.append(str.charAt(i));
		}
		
		System.out.println(num);
		System.out.println(alpha);
		System.out.println(specialChars);
		
	}
}

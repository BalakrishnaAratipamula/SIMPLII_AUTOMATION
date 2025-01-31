package Java_Examples;

public class Int_to_String_conv_nd_checkResultIsStringOrNot {
	public static void main(String[] args) {
		int i = 1234;

		String str = String.valueOf(i);
		System.out.println(str);
		
		//Checking whether 'str' is String or not
		boolean result = true;
		for(int a=0; a<str.length(); a++) {
			if(a==0 && str.charAt(a)=='-')
				continue;
			if(!Character.isDigit(str.charAt(a)))
				result = false;
		}
		if(result) { 
			System.out.println("str value "+ str +" containing Digits are in string format");
		}
	}
}

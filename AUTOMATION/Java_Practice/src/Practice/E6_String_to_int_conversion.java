package Practice;

public class E6_String_to_int_conversion {
	public static void main(String[] args) {
		String str = "12345"; //String representation
		int i = Integer.parseInt(str); //String to int conversion
		
		System.out.println(i);
		
		//Checking whether 'i' is integer or not
		String input = String.valueOf(i);
		boolean result = true;
		for(int a=0; a<input.length(); a++) {
			if(a==0 && input.charAt(a)=='-')
				continue;
			if(!Character.isDigit(input.charAt(a))) 
				result=false;
		} 
		if(result) { 
			System.out.println("i value "+ i +" is valid integer");
		}
	}
}

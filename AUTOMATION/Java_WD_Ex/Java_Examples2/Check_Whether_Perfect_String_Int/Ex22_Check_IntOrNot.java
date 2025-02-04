package Check_Whether_Perfect_String_Int;

public class Ex22_Check_IntOrNot {
	public static void main(String[] args) {
		int i = 12345; /////input is Integer type
		
		Object[] var = {i};
		
		//to convert 'int' to 'String'
		String str = String.valueOf(i);
		
		//Checking whether 'str' is String or not
		boolean result = true;
		for(int a=0; a<str.length(); a++) {
			if(!Character.isDigit(str.charAt(a))) {
				result = false;
			}
		}
		if(result) {
			System.out.println("Given input '"+i+"' and it's data type '"+var[0].getClass().getSimpleName()+"' containing all digits so it is in Integer format");
		}
	}
}

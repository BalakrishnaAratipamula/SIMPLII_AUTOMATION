package Practice;

public class Ex23_Check_StringOrNot {
	public static void main(String[] args) {
		String str = "Selenium "; ///// input is String type

		boolean result = true;
		for (int a=0; a < str.length(); a++) {
			if(str.charAt(a)==' ') { //for 'space'
				continue; //skip the current iteration and go with next iteration
			}
			
			if (!Character.isAlphabetic(str.charAt(a))) {
				result = false;
			}
		}
		if (result) {
			System.out.println("Given input '" + str + "' and it's data type '"+str.getClass().getSimpleName()+"' is in String format");
		} else {
			System.out.println("String content may be having digits or special characters");
		}
	}
}

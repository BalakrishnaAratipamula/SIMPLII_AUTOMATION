package Java_Examples;

//Java int coding qns : #6 Count Vowels And Constants
public class Count_VowelsAndConstants {
	
	public static void main(String[] args) {
		//#1
        String str_ = "AutomatIon"; 
        String str = str_.toLowerCase();

        int vowelCount = 0, consonantCount = 0;

        for (int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);

            // Check if the character is a letter
            if (Character.isLetter(ch)) {
                // Check if it's a vowel
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowelCount++;
                } else {
                    consonantCount++;
                }
            }
        }
        System.out.println("VOwels: " + vowelCount + "\t COnstants: " + consonantCount);
    }
	
	
	
	/*/#2
	public static void main(String[] args) {
		String str = "Automation";
		int vowels = 0, constants = 0;
		for (char c : str.toCharArray()) {
			if ("aeiouAEIOU".indexOf(c) != -1) {
				vowels++;
			} 
			else if (Character.isLetter(c)) {
				constants++;
			}
		}
		System.out.println("VOwels: " + vowels + "\t COnstants: " + constants);
	} //*/
}

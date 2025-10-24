package Java_Examples;

public class String_ILoveJava_to_avaJevoLI {
	/*/ M1 - I/P: Love Java - O/P: avaJ evoL I
	public static void main(String[] args) {
        String a = "I Love Java";
        
        // Convert string to char array and reverse it
        String reversed = new StringBuilder(a).reverse().toString();
        
        System.out.println("Input: " + a);
        System.out.println("Output: " + reversed);
    } //*/
	
	
	/*/ M2 - I/P: Love Java - O/P: avaJ evoL I
	public static void main(String[] args) {
        String input = "I Love Java";
        String[] words = input.split(" ");
        StringBuilder reversed = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            String word = words[i];
            String reversedWord = new StringBuilder(word).reverse().toString();
            reversed.append(reversedWord);

            if (i != 0) {
                reversed.append(" ");
            }
        }

        System.out.println("Input: " + input);
        System.out.println("Output: " + reversed.toString());
    } //*/
	
}

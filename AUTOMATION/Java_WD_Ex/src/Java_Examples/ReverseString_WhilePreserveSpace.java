package Java_Examples;

public class ReverseString_WhilePreserveSpace {
	public static void main(String[] args) {
        String input = "I Love Java";
        char[] inputArr = input.toCharArray();
        char[] result = new char[inputArr.length];

        // Step 1: Mark spaces in result array
        for (int i = 0; i < inputArr.length; i++) {
            if (inputArr[i] == ' ') {
                result[i] = ' ';
            }
        }
        
        // Step 2: Reverse characters ignoring spaces
        int j = inputArr.length - 1;
        for (int i = 0; i < inputArr.length; i++) {
            if (inputArr[i] != ' ') {
                while (j >= 0 && inputArr[j] == ' ') {
                    j--;
                }
                result[i] = inputArr[j];
                j--;
            }
        }
        
        // Step 3: Print result
        System.out.println("Original : " + input);
        System.out.println("Reversed : " + new String(result));
    }
}

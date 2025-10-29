package Java_Examples;

public class String_ImmutableObjsUsedToStoreSeqOfChars {
	public static void main(String[] args) {
        String s1 = "Hello";
        s1.concat(" World");   // This creates a new String but doesn't change s1
        System.out.println(s1);  // Output: Hello ///s1 remains "Hello" because strings are immutable.
        
        String s2 = s1.concat(" World");
        System.out.println(s2);  // Output: Hello World ///s2 is a new String object containing "Hello World"
        
        //(Or)
        String s3 = "Hello";
        s3.concat(" World");   // This creates a new String but doesn't change s1
        System.out.println(s3.concat(" Selenium"));  // Output: Hello Selenium
    }
}

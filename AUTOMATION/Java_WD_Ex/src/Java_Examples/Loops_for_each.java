package Java_Examples;

public class Loops_for_each {
public static void main(String[] args) {
	/*/to iterate through elements of an array using standard for loop
	char[] vowels = {'a', 'e', 'i', 'o', 'u'};
	System.out.println("Length of vowels is: "+vowels.length);
    for (int i=0; i<vowels.length; ++i) {
       System.out.print(vowels[i]+"\t");
    } */
    
	
	/*/to iterate through elements of an array using for-each
    char[] vowels = {'a', 'e', 'i', 'o', 'u'};
    for (char item: vowels) {
       System.out.print(item+"\t"); //\t for tab space
    } */
    
    
    /*/calculates the sum of all elements of an integer array.
    int[] num = {3, 4, 5, -5, 0, 12};
    int sum = 0;
    for (int numbers: num) {
        sum = sum+numbers;  //// (or)  sum += number;
     }
     System.out.println("Sum = " + sum); */
}
}
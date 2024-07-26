package Java_Examples;

/* An Armstrong Number is a number in which the sum of the cubes of each digit is equal to the number itself. For ex:
 * 371 = 3*3*3 + 7*7*7 + 1*1*1 = 371 
 */

public class Armstrong_number_r_not {
	/*/pre-req program
	public static void main(String args[]){
        double a = 4;
        double b = 4;
        //The Math.pow() is used to calculate a number raise to the power of some other number.
        System.out.println(Math.pow(a, b)); //'a' power 'b'
 
        a = 2.5;
        b = 6.9;
        System.out.println(Math.pow(a, b)); //'a' power 'b'
    } //*/
	
	
	// Armstrong_number_or_not
	public static void main(String[] args) {

		int num = 371;	//153, 371
		int actNum = num;
		double result = 0;

		while (actNum != 0) {
			int n = actNum % 10;			  	
			result = result + Math.pow(n, 3); //'n' power '3' //The Math.pow() is used to calculate a number raise to the power of some other number.
			actNum = actNum / 10;
		}

		if (result == num) {
			System.out.println(num + " is an Armstrong number");
		} else {
			System.out.println(num + " is not an Armstrong number");
		}
	} //*/
}

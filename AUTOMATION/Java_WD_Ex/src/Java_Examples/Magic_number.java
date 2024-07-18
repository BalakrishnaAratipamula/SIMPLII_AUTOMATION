package Java_Examples;

public class Magic_number {
	
	/*/pre-req program
	public static void main(String[] args) {
		int n = 50;
		System.out.println(n/=10);
	} //*/
	
	/*/pre-req program
	public static void main(String[] args) {
		System.out.println(1%10);
	} //*/
	
	
	//Magic_number
	public static void main(String[] args) {
		int sum = 0;
		int num = 100;	//1081 - magic num
		int n = num; //above

		while(n>0 || sum>9) {
			if(n==0) {
				n=sum;
				sum=0;
			}
			sum += n%10; //(or) sum = sum + n%10;   //1%10 is 1
			n/=10; //(or) n = n/10					//1/10 is 1
		}

		if(sum == 1) {
			System.out.println(num+ " is a Magic Number");
		} else {
			System.out.println(num+ " is not a Magic Number");
		}
	} //*/
}

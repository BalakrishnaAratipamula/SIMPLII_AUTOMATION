package Java_Examples;

public class Array_Consists_Int_nd_SpecialChar_SumOnlyInt {
	
	static int sumOfIntegers(String[] arr) {
		int sum = 0;
		for(String ele: arr) {
			try {
				//converting String to Int
				int num  =Integer.parseInt(ele);
				sum+=num;
			}
			catch(NumberFormatException e){
			}
		}
		return sum;
	}
	
	public static void main(String[] args) {
		String[] arr = {"1", "$", "2", "3", "#"};
		
		int sum = sumOfIntegers(arr);
		
		System.out.println(sum);
	}
	
}

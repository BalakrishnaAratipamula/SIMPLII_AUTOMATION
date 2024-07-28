package Java_Examples;

public class Array_FirstAndLastPositionOfTargetValue {
	public static void main(String[] args) {

		int[] array = { 5, 7, 7, 8, 8, 10 };
		//int[] array = { 5, 7, 7, 8, 7, 8, 10 };
		
		int firstIndex = -1;
		int lastIndex = -1;

		int target = 8;

		for (int i=0; i<array.length; i++) {
			if (array[i]==target && firstIndex==-1) {
				firstIndex = i;
			}

			if (array[i]==target && firstIndex!=-1) {
				lastIndex = i;
			}
		}

		System.out.println("First Index is: " + firstIndex);
		System.out.println("Last Index is: " + lastIndex);

	}
}

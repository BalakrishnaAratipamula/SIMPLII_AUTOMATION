package Java_Quizs;

public class Continue_Break {
	public static void main(String[] args) {
		for(int loop=0; loop<5; loop++) {
			if(loop>2) {
				continue; //when we reach 'continue' from here jump into for loop and iterations will continue
			} 
			if(loop>4) {
				break; 
			}
			System.out.println(loop);
		}
	}
}

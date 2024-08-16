package Java_Examples;

import java.util.Scanner;

public class Wave_Print_a_Matrix {
	// Function to print wave Form for a given matrix
	public static void WavePrint(int r, int c, int[][] mat) {

		for (int j=0; j<c; j++) {

			// If the current column is even indexed, print it in forward order
			if (j%2 == 0) {
				for (int i=0; i<r; i++) {
					System.out.print(mat[i][j] + " ");
				}
			}

			// If the current column is odd indexed, print it in reverse order
			else {
				for (int i=r-1; i>=0; i--) {
					System.out.print(mat[i][j] + " ");
				}
			}
		}
	}

	public static void main(String[] args) {
		int R = 5;
		int C = 4;

		int[][] arr = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}, {17, 18, 19, 20}};

		WavePrint(R, C, arr);
	}

}

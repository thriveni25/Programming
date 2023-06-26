package Array2D;

import java.util.Scanner;

public class Diagonal_Sum {

	public static void main(String[] args) {
		int[][] a = new int[3][3];
		Scanner scn = new Scanner(System.in);
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.println("Enter element for " + i + "," + j + " index");
				a[i][j] = scn.nextInt();
			}
		}
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}

		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (i == j) {
					sum += a[i][j];
				} else if (i + j == a.length - 1) {
					sum += a[i][j];
				}
			}
		}
		System.out.println(sum);

	}

}

package Array2D;

import java.util.Arrays;
import java.util.Collections;

public class SortEachRowDecOrder {

	public static void main(String[] args) {
		int[][] a = { { 10, 20, 30 }, { 40, 50, 60 }, { 70, 80, 90 } };
		for (int i = 0; i < a.length; i++) {
			//Arrays.sort(a[i]);
			sortDec(a[i]);
		}
		//display(a);
		
	}

	public static void sortDec(int[] a) {
		
		for (int i = 0; i <= a.length - 1; i++) {
			for (int j = 0; j < a.length - 1; j++) {
				if (a[j] < a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;

				}
			}
		}
		System.out.println(Arrays.toString(a));

		
		
	}
	/*public static void display(int [][] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}*/

}

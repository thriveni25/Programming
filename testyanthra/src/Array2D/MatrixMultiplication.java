package Array2D;

import java.util.Arrays;
import java.util.Iterator;

public class MatrixMultiplication {

	public static void main(String[] args) {
	int [][] a= {{1,2},{3,4}};
	int [][] b= {{5,6},{7,8}};
	int [][] c=new int [a[0].length][b.length];
	
	
	for (int r1 = 0; r1 < c.length; r1++) {
		for (int c2 = 0; c2 < b[r1].length; c2++) {
			for (int c1 = 0; c1 < a[r1].length; c1++) {
				c[r1][c2]+=a[r1][c1]*b[c1][c2];
			}
		}
	}
	System.out.println(Arrays.deepToString(c));
	}

}

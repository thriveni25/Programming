package Array2D;

import java.util.Arrays;
import java.util.Collections;

public class Demo {

	public static void main(String[] args) {
		int[][] a = { { 10, 20, 30 }, { 40, 50, 60 }, { 70, 80, 90 } };
		
		Arrays.sort(a,Collections.reverseOrder());
		
		Arrays.deepToString(a);

	}

}

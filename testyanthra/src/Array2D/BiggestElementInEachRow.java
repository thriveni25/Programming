package Array2D;

public class BiggestElementInEachRow {

	public static void main(String[] args) {
		int[][] a= {{10,20,30},{40,50,60},{70,80,90}};
		for(int i=0;i<a.length;i++) {
			System.out.println(maxElement(a[i]));
		}
	}
	public static int maxElement(int[] a) {
		int max=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) max=a[i];
		}
		return max;
	}

}

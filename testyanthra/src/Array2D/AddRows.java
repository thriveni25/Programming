package Array2D;

public class AddRows {

	public static void main(String[] args) {

		int[][] a1 = { { 10,10,10 }, { 40, 40 ,60}, { 70, 80 ,90} };
		
		for (int i = 0; i < a1.length; i++) {

			int max=a1[i][0];
			for (int j = 0; j < a1[i].length; j++) {

				if(a1[i][j]>max)
				{
					max=a1[i][j];
				}
			}
			System.out.println(max);

		}
		

	}

}

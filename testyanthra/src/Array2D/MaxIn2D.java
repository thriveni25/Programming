package Array2D;

public class MaxIn2D {

	public static void main(String[] args) {
		
		int[][] a1= {{10,20,30},{40,50,60},{70,80,90}};
		int max = a1[0][0];
		
				for (int i = 0; i < a1.length; i++) {
					for (int j = 0; j < a1[i].length; j++) {
						
						if (a1[i][j] > max) {
							max = a1[i][j];
						}
					}
				}
				
				System.out.println( max);
			}
		}

	



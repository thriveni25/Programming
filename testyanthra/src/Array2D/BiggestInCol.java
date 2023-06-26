package Array2D;

public class BiggestInCol {

	public static void main(String[] args) {
		int[][] a= {{10,0,200},{40,500,4},{7000,80,800}};
        
        for(int j = 0; j < a[0].length; j++) {
        int max = a[0][j];
            
            for(int i = 0; i < a.length; i++) {
                if(a[i][j] > max) {
                    max = a[i][j];
                }
            }
            System.out.println( max);
        }

	}

}

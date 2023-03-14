package Array2D;

public class BiggestInCol {

	public static void main(String[] args) {
		int[][] a= {{10,0,30},{40,500,60},{70,80,90}};
        
        for(int i = 0; i < a.length; i++) {
        int max = a[i][0];
            
            for(int j = 0; j < a[i].length; j++) {
                if(a[j][i] > max) {
                    max = a[j][i];
                }
            }
            System.out.println( max);
        }

	}

}

package Array2D;

public class BiggestInRow {

	public static void main(String[] args) {
		int[][] a= {{10,20,30},{40,50,60},{70,80,90}};
		   
		        
		        for(int i = 0; i < a.length; i++) {
		        	int max = 0;    
		            for(int j = 0; j < a[0].length; j++) {
		                if(a[i][j] > max) {
		                    max = a[i][j];
		                }
		              
		            }
		            System.out.println( max);
		        }
		
		       
}

}

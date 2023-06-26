package Array2D;

public class AddCol {

	public static void main(String[] args) {
		int[][] a1= {{10,20,30},{40,50,60},{70,30,90}};
		
		  for(int i=0;i<a1.length;i++)
	       {
			  int sum=0; 
	    	   for(int j=0;j<a1[i].length;j++)
	    	   {
	    		   sum+=a1[j][i];
	    	   }
	    	   System.out.println(sum+" ");
	       }
		 
	}

}



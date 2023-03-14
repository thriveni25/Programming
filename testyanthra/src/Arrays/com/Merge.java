package Arrays.com;

public class Merge {

	public static void main(String[] args) {
		   int[] a= {10,20,30,40};
	       int[] b= {50,60,70,80};
	       int[] c=new int[8];
	       int j=0;
	         for(int i=0;i<c.length;i++) {
	        	 if(i<a.length) c[i]=a[i];
	        	 else c[i]=b[j++];
	        	
	    	    
	         }
	         for(int i=0;i<c.length;i++) {
	        	 System.out.println(c[i]);
	         }
	         
			

	}

}

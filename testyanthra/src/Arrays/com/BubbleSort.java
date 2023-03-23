package Arrays.com;

public class BubbleSort {
	
	
	 public static void sort(int[] a) {
	    	for(int i=0;i<=a.length-1;i++) {
	        	for(int j=i+1;j<=a.length-1;j++) {
	        	 if(a[i]>a[j]) {
        		  int temp=a[i];
        		    a[i]=a[j];
	        		 a[j]=temp;
	        		 System.out.println(temp);
	        		 
	        	 }
	        	}
	    	}
	 }
	    	public static void main(String[] args) {
	    		int [] a= {2,4,6,8,9,7,5,1,3};
	    		sort(a);
	    		for(int n:a) System.out.print(n+" ");
	    		
	    	}
	 }


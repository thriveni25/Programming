package Arrays.com;

public class BubbleSort {
	
	
	 public static void sort(int[] a) {
//	    	for(int i=0;i<=a.length-1;i++) {
//	        	for(int j=i+1;j<=a.length-1;j++) {
//	        	 if(a[i]>a[j]) {
//        		  int temp=a[i];
//        		    a[i]=a[j];
//	        		 a[j]=temp;
	        		//  System.out.print(temp+" ");
		 for(int i=0;i<=a.length-1;i++) {
	        	for(int j=0;j<a.length-1;j++) {
	        	 if(a[j]>a[j+1]) {
     		  int temp=a[j];
     		    a[j]=a[j+1];
	        		 a[j+1]=temp;
	        		 
	        		 
	        	 }
	        	}
	    	}
	 }
	    	public static void main(String[] args) {
	    		int [] a= {9,5,8,3,4,6,7,0,8};
	    		sort(a);
	    		for(int n:a) 
	    			
	    			System.out.print(n+" ");
	    		
	    	}
	 }


package Arrays.com;



public class SecondMin {

		 public static void sort(int[] a) {
		    	for(int i=0;i<a.length-1;i++) {
		        	for(int j=0;j<a.length-1-i;j++) {
		        	 if(a[j]<a[j+1]) {
		        		 int temp=a[j];
		        		 a[j]=a[j+1];
		        		 a[j+1]=temp;
		        		 
		        	 }
		        	 
		        	}
		        	
		    	}
		    	
		        }
		      public static void main(String[] args) {
		      int [] a= { 7, 10, 4 ,3 ,20, 15};
		      for(int i=0;i<a.length-1;i++) {
		          	for(int j=i+1;j<a.length;j++) {
		          		if(a[i]==a[j]) a[i]=100;
		          		
		          	}
		          	
		    	  }
		          sort(a);
		          for(int n:a) System.out.print(n+" ");
		          System.out.println("****************");
		         
		    	  System.out.println(a[a.length-3]);

	}

}

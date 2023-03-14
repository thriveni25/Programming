package Arrays.com;

public class SecondMax {
    public static void sort(int[] a) {
    	for(int i=0;i<a.length-1;i++) {
        	for(int j=0;j<a.length-1-i;j++) {
        	 if(a[j]>a[j+1]) {
        		 int temp=a[j];
        		 a[j]=a[j+1];
        		 a[j+1]=temp;
        	 }
        	}
    	}
        }
      public static void main(String[] args) {
      int [] a= {29,47,19,29,34,38,34};
    	  for(int i=0;i<a.length-1;i++) {
          	for(int j=i+1;j<a.length;j++) {
          		if(a[i]==a[j]) a[j]=0;
          	}
    	  }
          sort(a);
          for(int n:a) System.out.print(n+" ");
          System.out.println("****************");
    	  System.out.println(a[a.length-3]);
}
}

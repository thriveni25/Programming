package NumberProgramms;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		  System.out.println("Enter a num:");
	      Scanner sc = new Scanner(System.in);
	      int n = sc.nextInt();
	      int num=n;
	      int count=0;
	      
	      while(num>0) {
	    	  count++;
	    	  num/=10;
	      }
	      
	      num=n;
	      int sum=0;  
	      while(num>0) {
	    	  int d=num%10;
	    	  int prod=1;
	    	  for(int i=1;i<=count;i++) {
	    		  prod*=d;
	    	  }
	         sum+=prod;
	    	  num/=10;
	      }
	      //System.out.println(sum);
         if(sum==n) {
        	 System.out.println("Armstrong");
         }
         else {
         System.out.println("Not Armstrong");
        	 
         }
	}

}

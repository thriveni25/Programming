package NumberProgramms;

import java.util.Scanner;

public class GCD {

	public static void main(String[] args) {
		System.out.println("Enter a num:");
	      Scanner sc = new Scanner(System.in);
	      int a = sc.nextInt();
	      int b = sc.nextInt();
	      
//	      int n=a>b?a:b;
//	      while(true) {
//	    	  if(a%n==0 && b%n==0)   break;
//	    		n--;  
//	      }
//	      System.out.println("GCD OF "+a+" and "+b+"="+n);
	      
	      int gcd=1;
	      for(int i=1;i<=a&&i<=b;i++) {
	    	  if(a%i==0 && b%i==0) {
	    		  gcd=i;
	    	  }
	      }
	      System.out.println("GCD: "+gcd);

	}

}

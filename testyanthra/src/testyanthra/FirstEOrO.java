package testyanthra;

import java.util.Scanner;

public class FirstEOrO {

	public static void main(String[] args) {
		  System.out.println("Enter a num:");
	      Scanner sc = new Scanner(System.in);
	      int n = sc.nextInt();
	      
	      while(n>9) {
	    	  n=n/10;
	      }  
	     
	      if(n%2==0) {
				System.out.println("Start with even");
			}
			else {
				System.out.println("Start with odd");
			}
	}

}

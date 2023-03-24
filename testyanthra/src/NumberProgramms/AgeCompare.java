package testyanthra;

import java.util.Scanner;

public class AgeCompare {

	public static void main(String[] args) {
		  System.out.println("Enter age : ");
	      Scanner sc = new Scanner(System.in);
	      int  n1 = sc.nextInt();
	      
	      System.out.println("Enter age : ");
	      int  n2 = sc.nextInt();
	      
	      System.out.println("Enter age : ");
	      int  n3= sc.nextInt();
	      
	      if(n1>n2 && n1>n3) {
	    	  System.out.println("oldest than"+n2+" "+n3);
	      }
	      else if(n2>n1 && n2>n3) {
	    	  System.out.println("oldest than"+n1+" "+n3);
	      }
	      else {
	    	  System.out.println("oldest than"+n1+" "+n2);
	      }
	      
	}

}

package testyanthra;

import java.util.Scanner;

public class CharLowerOrUpper {

	public static void main(String[] args) {
		 System.out.println("Enter a char : ");
	      Scanner sc = new Scanner(System.in);
	      char  c = sc.next().charAt(0);
	      
	      if(c>='A'&&c<='Z') {
	    	  System.out.println(c+" Upper case");
	      }
	      else if(c>='a'&&c<='z') {
	    	  System.out.println(c+ " Lower case");
	      }
	      else {
	    	  System.out.println(c+ " Not a charcter");
	      }
	}

}
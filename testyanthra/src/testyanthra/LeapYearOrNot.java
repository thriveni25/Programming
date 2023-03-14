package testyanthra;

import java.util.Scanner;

public class LeapYearOrNot {

	public static void main(String[] args) {
		  System.out.println("Enter year : ");
	      Scanner sc = new Scanner(System.in);
	      int n=sc.nextInt();
	      
	      if((n%400==0)||(n%4==0)&&(n%100!=0)){
	    	  System.out.println(n+" is leap year");
	      }
	      else {
	    	  System.out.println(n+" is not leap year");
	      }

	}

}

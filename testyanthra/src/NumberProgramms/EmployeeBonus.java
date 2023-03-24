package NumberProgramms;

import java.util.Scanner;

public class EmployeeBonus {

	public static void main(String[] args) {
		System.out.println("Enter years of experience: ");
	      Scanner sc = new Scanner(System.in);
	      int  n = sc.nextInt();
	      int sal=10000;
	      float bonus=(float)(sal*0.05);
	      float bon=sal+bonus;
	      if(n>5) {
	    	  System.out.println("you got bonus "+bon);
	      }
	      else {
	    	  System.out.println("keep working....");
	      }
	}

}

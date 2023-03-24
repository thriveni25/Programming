package testyanthra;

import java.util.Scanner;

public class EmployeeWorking {

	public static void main(String[] args) {
		 System.out.println("Enter age : ");
	      Scanner sc = new Scanner(System.in);
	      int n=sc.nextInt();
	      
	      System.out.println("Enter sex : ");
	      char  c1 = sc.next().charAt(0);
	      
	      System.out.println("Enter marital status : ");
	      char  c2 = sc.next().charAt(0);
	      
	      if(c1=='f') {
	    	  System.out.println("You will work only in urban areas");
	      }
	      else if((c1=='m')&&(n>20&&n<40)){
	    	  System.out.println("You will work ant where");
	      }
	      else if((c1=='m')&&(n>40&&n<60)) {
	    	  System.out.println("You will work in urban areas only");
	      }
	      else {
	    	  System.out.println("ERROR");
	      }
	      
	}

}

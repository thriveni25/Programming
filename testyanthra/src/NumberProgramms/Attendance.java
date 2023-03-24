package NumberProgramms;

import java.util.Scanner;

public class Attendance {

	public static void main(String[] args) {
		 System.out.println("Enter num of classes held : ");
	      Scanner sc = new Scanner(System.in);
	      int  n1 = sc.nextInt();

	      System.out.println("Enter num of classes attended: ");
	      int  n2 = sc.nextInt();
	      
	      int per=((n2*100)/n1);
	      System.out.println(per+"%");
	      
	      if(per<75) {
	    	  System.out.println("Not allow to write exam");
	      }
	      else {
	    	  System.out.println("All the best");
	      }
	}

}

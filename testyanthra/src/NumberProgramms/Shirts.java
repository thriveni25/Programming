package testyanthra;

import java.util.Scanner;

public class Shirts {

	public static void main(String[] args) {
		System.out.println("Enter quantity of T-shirts: ");
	      Scanner sc = new Scanner(System.in);
	      int  n = sc.nextInt();
		   
	      int cost=n*200;
	      float amt=(float) (cost*0.1);
	      float amount=cost-amt;
	      
	      if(cost>=1000) {
	    	 
	    	  System.out.println("cost of t-shirts with discount:"+amount);
	      }
	      else {
	    	  System.out.println("cost of t-shirts:"+cost);
	      }

	}

}

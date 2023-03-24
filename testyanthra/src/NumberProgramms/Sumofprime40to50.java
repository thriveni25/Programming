 package testyanthra;

import java.util.Scanner;

public class Sumofprime40to50 {
	 
    public static void main(String args[]) {
    	Scanner scn=new Scanner(System.in);
		System.out.println("Enter range:");
		int n=scn.nextInt();
		
        int sum = 0;
        for(int i=40;i<=50;i++) {
			//if(n<=1) continue;
			boolean flag=true;
			for(int j=2;j<=i/2;j++) {
				if(i%j==0) {
					flag=false;
					break;
				}
			}
			if(flag) {
				System.out.println(i+" ");
				sum+=i;
			}
		}
		
        System.out.println("Sum of prime numbers between 40 and 50 is: " + sum);
    }
 
   
}
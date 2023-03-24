package testyanthra;

import java.util.Scanner;

public class NumStartEvenOrNOT {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter num:");
		int n=scn.nextInt();
		int m=0;
		while(n>0) {
			m=(m*10)+(n%10);
			n/=10;
		}
		
		int last=m%10;
		if(last%2==0) {
			System.out.println("Start with even");
		}
		else {
			System.out.println("Start with odd");
		}

	}

}

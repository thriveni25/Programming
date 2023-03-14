package patterns.testyantra.com;

import java.util.Scanner;

public class T22 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter num: ");
		int n=sc.nextInt();
		for(int i=n;i>=1;i--) {
			for(int j=n;j>i;j--) {
				System.out.print(" ");
			     }
				for(int j=1;j<=i;j++) {
					System.out.print("*");	
				}
				
				System.out.println();
			}
			

	}

}

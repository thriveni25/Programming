package patterns.testyantra.com;

import java.util.Scanner;

public class LeftTriangle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter num: ");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			     }
				for(int k=1;k<=i;k++) {
					System.out.print("*");	
				}
				
				System.out.println();
		}
				for(int i1=n-1;i1>=1;i1--) {
					for(int j=n;j>i1;j--) {
						System.out.print(" ");
					     }
						for(int j=1;j<=i1;j++) {
							System.out.print("*");	
						}
						
						System.out.println();
					}
			}
		

	}



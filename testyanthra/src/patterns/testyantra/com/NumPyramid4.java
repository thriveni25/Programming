package patterns.testyantra.com;

import java.util.Scanner;

public class NumPyramid4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter num: ");
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			char c='a';
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=2*i-1;k++) {
				
				System.out.print(c);
				c++;
				
			}
			
			System.out.println();
		}

	}

}

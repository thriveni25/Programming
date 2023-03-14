package patterns.testyantra.com;

import java.util.Scanner;

public class NumPyramid {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter num: ");
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=2*i-1;k++) {
				if(i%2==1)
				System.out.print("1");
				else
					System.out.print("0");
			}
			
			System.out.println();
		}

	}

}

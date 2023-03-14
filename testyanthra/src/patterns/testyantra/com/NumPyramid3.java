package patterns.testyantra.com;

import java.util.Scanner;

public class NumPyramid3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter num: ");
		int n=sc.nextInt();
		int c=0;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=2*i-1;k++) {
				if(c%2==1) {
				System.out.print("0");
				
				}
				else
					System.out.print("1");
				c++;
			}
			
			System.out.println();
		}


	}

}

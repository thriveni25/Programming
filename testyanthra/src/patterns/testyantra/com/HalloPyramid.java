package patterns.testyantra.com;

import java.util.Scanner;

public class HalloPyramid {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter num: ");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n+i-1;j++) {
				char val=(i==n||j==n+i-1||j==n-i+1)?'*':' ';
						
				System.out.print(val);
			     }
			System.out.println();
		}

	}

}

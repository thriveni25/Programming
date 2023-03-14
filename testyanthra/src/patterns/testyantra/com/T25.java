package patterns.testyantra.com;

import java.util.Scanner;

public class T25 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter num: ");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=i;j<=n;j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
		


	}

}

package patterns.testyantra.com;

import java.util.Scanner;

public class T37 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter num: ");
		int n=sc.nextInt();
		
		char c='A';
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i==j) {
					System.out.print(c+" ");
					c++;
				}
				
				else {
					System.out.print(i+j+" ");
				}
				
				
			}
			System.out.println();
		}


	}

}

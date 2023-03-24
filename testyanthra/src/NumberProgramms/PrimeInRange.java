package NumberProgramms;

import java.util.Scanner;

public class PrimeInRange {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter range:");
		int n=scn.nextInt();
		
		for(int i=1;i<=n;i++) {
			boolean flag=true;
			if(i<=1) {
				continue;
			}
			
			for(int j=2;j<=i/2;j++) {
				if(i%j==0) {
					flag=false;
					break;
				}
			}
			if(flag==true) {
				System.out.println(i+" prime");
			}
			else {
				System.out.println(i+"not prime ");
			}
		}
		
	}

}

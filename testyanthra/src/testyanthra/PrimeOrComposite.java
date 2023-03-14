package testyanthra;

import java.util.Scanner;

public class PrimeOrComposite {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter range:");
		int n=scn.nextInt();
		
		if(n<=1) {
			System.out.println("Not a prime");
			return;
		}
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				System.out.println("composite number");
				return;
			}
		}
		System.out.println("prime number");

	}

}

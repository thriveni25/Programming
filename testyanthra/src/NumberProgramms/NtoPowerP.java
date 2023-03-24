package testyanthra;

import java.util.Scanner;

public class NtoPowerP {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter base:");
		int n=scn.nextInt();
		
		System.out.println("Enter power:");
		int p=scn.nextInt();
		int temp=1;
			
		for(int i=1;i<=p;i++) {
			 temp=temp*n;
		}
		
		System.out.println(temp);
	}
}

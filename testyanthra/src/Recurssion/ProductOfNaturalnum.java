package Recurssion;

import java.util.Scanner;

public class ProductOfNaturalnum {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter num: ");
		int n=s.nextInt();
		System.out.println(prod(n));

	}
	private static int prod(int n) {
		if(n<=1) {
			return n;
		}
		else return(n*prod(n-1));
	}
}

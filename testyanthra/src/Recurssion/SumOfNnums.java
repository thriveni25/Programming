package Recurssion;

import java.util.Scanner;

public class SumOfNnums {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter num: ");
		int n=s.nextInt();
		System.out.println(sum(n));

	}
	private static int sum(int n) {
		if(n<=1) {
			return n;
		}
		else return(n+sum(n-1));
	}


}

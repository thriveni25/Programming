package Recurssion;

import java.util.Scanner;

public class FactorialOfNum {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter num: ");
		int n=s.nextInt();
		System.out.println(fact(n));

	}
	public static int fact (int n) {
		if(n<=1) {
			return n;
		}
		else {
			return n*fact(n-1);
		}
		
	}

	

}

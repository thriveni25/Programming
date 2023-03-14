package Strings;

import java.util.Scanner;

public class SameSTRINGorNot {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String s1=sc.next().toLowerCase();
		
		System.out.println("Enter String");
		String s2=sc.next().toLowerCase();
		
		if(s1.equals(s2)) {
			System.out.println("True");
		}
		else
			System.out.println("False");

	}

}

package Strings;

import java.util.Scanner;

public class PrintString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The String");
		String s1=sc.next();
		int l=s1.length();
		for(int i=0;i<l;i++) {
			System.out.println(s1);
		}

	}

}

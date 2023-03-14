package Strings;

import java.util.Scanner;

public class FandLChar {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String s=sc.next();
		
		System.out.println(s.charAt(0));
		System.out.println(s.charAt(s.length()-1));
		System.out.println("*********");
		System.out.println(s.substring(0, 1));
		System.out.println(s.substring(s.length()-1));
		

	}

}

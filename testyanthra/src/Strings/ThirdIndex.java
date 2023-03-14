package Strings;

import java.util.Scanner;

public class ThirdIndex {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String s=sc.next();
		
		System.out.println(s.charAt(3));
		
		System.out.println(s.charAt(0)+","+s.charAt(s.length()-1));
	}

}

package Strings;

import java.util.Scanner;

public class Substring {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String s1=sc.next();
		System.out.println(s1.substring(s1.length()-4));

	}

}

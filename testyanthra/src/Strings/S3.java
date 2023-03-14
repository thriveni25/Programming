package Strings;

import java.util.Scanner;

public class S3 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String one");
		String s1=sc.next();
		
		System.out.println("Enter String two");
		String s2=sc.next();
		
		System.out.println(s1==s2);
		System.out.println("--------------------------");
		
		System.out.println(s1.compareTo(s2));
		System.out.println("--------------------------");
		
		System.out.println(s1.equals(s2));
		System.out.println("--------------------------");
		
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println("--------------------------");
	}

}

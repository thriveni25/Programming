package Strings;

import java.util.Scanner;

public class StringToChar {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The String");
		String s=sc.next();
		System.out.println("Length = "+s.length());
		char[] ch=s.toCharArray();
		for(int i=0;i<s.length();i++) {
			if(i%2==0 ) {
				System.out.print(i+",");
			}
		}
		
	}
	
}

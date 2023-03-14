package Strings;

import java.util.Scanner;

public class charCount {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s=scn.nextLine();
		char[] ch=s.toCharArray();
		int count=0;
		for(int i=0;i<ch.length;i++) {
			count++;
		}
		System.out.println(count);

	}

}

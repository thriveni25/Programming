package Strings;

import java.util.Scanner;

public class OccuranceOfParticularChar {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a String");
		String s=scn.next();
		System.out.println("Enter a Char");
		char c=scn.next().charAt(0);
		char ch[]=s.toCharArray();
		int count=0;
		for(int i=0;i<s.length();i++) {
			if(ch[i]==c) {
				count++;
			}
		}
		System.out.println(c+" = "+count);

	}

}

package Strings;

import java.util.Scanner;

public class UpperHalfLower {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String s=sc.next().toLowerCase();
		String s2="";
		int mid=s.length()/2;
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(i<mid)
				s2+=(char)(ch-32);
				else
					s2+=ch;
			
		}
		
		System.out.println(s2);
	}

}

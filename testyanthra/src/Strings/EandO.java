package Strings;

import java.util.Scanner;

public class EandO {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String s=sc.next();
		String s1="";
		s1=s.toUpperCase();
		String temp="";
		
		for(int i=0;i<s.length();i++) {
			if(i%2!=0 && s1.charAt(i)!=' ') {
				temp+=(char)(s1.charAt(i)+32);
			}
			else {
				temp+=s1.charAt(i);
			}
		}
		System.out.println(temp);
	}

}

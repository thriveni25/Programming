package Strings;

import java.util.Scanner;

public class EvenAscii {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String s=sc.next();
		int count=0;
		
		
		for(int i=0;i<s.length();i++) {
			int ch=s.charAt(i);
			if(s.charAt(i)%2==0) {
			count++;
			System.out.println("Ascii with even index ="+ch);
			}
		}
		System.out.println("count="+count);
		
		

	}


}

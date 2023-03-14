package Strings;

import java.util.Scanner;

public class CountUPL {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String s=sc.nextLine();
		int countu=0;
		int countl=0;
		int counts=0;
		
		
		
		for(int i = 0; i < s.length(); i++) {
			char ch=s.charAt(i);
			if(s.charAt(i)>='A' && s.charAt(i)<'Z') countu++;
			else if(s.charAt(i)>='a' && s.charAt(i)<'z') countl++;
			else counts++;
		}
		System.out.println("upper = "+countu);
		System.out.println("lower = "+countl);
		System.out.println("special = "+counts);
	}

}

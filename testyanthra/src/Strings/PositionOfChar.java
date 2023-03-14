package Strings;

import java.util.Scanner;

public class PositionOfChar {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String s=sc.next();
		
		//System.out.println(s.indexOf('a'));
		for(int i = 0; i < s.length(); i++) {
        	char ch=s.charAt(i);
        	 if(ch == 'a') 
               System.out.print(i+" "); 
		}

	}

}

package Strings;

import java.util.Scanner;

public class StringPalindrome {
	
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter The String");
			String s1=sc.next();
			String rev="";
			
			for(int i=s1.length()-1;i>=0;i--)
			{
				rev=rev+s1.charAt(i);
			}
			
			if(rev.equals(s1))
			{
				System.out.println("palindrome");
			}else
			{
				System.out.println("Not palindrome");
			}
			
			
	}

}

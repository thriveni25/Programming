package Strings;

import java.util.Scanner;

public class uppercase {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String s1=sc.nextLine();
		String s2=" ";
		int count = 0;
		char[] a=s1.toCharArray();
		
		for(char c:a) {
			count++;
		}
		
		for(int i=0;i<count;i++)
		{
			if(s1.charAt(i)>='a' && s1.charAt(i)<='z')
			{
				s2+=(char)(s1.charAt(i)-32);
			}
			else {
				s2+=s1.charAt(i);
			}
		}
        System.out.println(s2);

	}

}

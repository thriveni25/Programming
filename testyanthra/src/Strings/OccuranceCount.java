package Strings;

import java.util.Scanner;

public class OccuranceCount 
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a String");
		String s=scn.next();
		String s2=" ";
		for(int i=0;i<s.length();i++)
		{
			int count=1;
			char ch=s.charAt(i);												
			if(s2.indexOf(ch)==-1)
			{
				for(int j=i+1;j<s.length();j++)
				{
					if(s.charAt(i)==s.charAt(j))
					{
						count++;

					}

				}
				System.out.print( ch+""+count);	
				s2+=ch;
			}

		}
	}		

	}

	            

	
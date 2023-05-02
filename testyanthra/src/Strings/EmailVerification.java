package Strings;

import java.util.Arrays;
import java.util.Scanner;

public class EmailVerification {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a String");
		String s=scn.nextLine();
		
		/*if(s.length()>=1 && s.length()<=20) {
			for(int i=0;i<s.length();i++) {
				if((s.charAt(i)>'a' && s.charAt(i)>'z') ||(s.charAt(i)=='.' )) {
					
				}
				if( s.charAt(i)=='@' && s.charAt(i)=='.') {
					
				}
				else {
					
				}
				
				
			}
			System.out.println("valid");
		}
		
		else {
			System.out.println("invalid");
		}*/
		
		
			boolean flag=false;
			
			if(s.contains("@"))
			{
				String[] s2=s.split("@");
				String user=s2[0];
				String domain=s2[1];
			if(user.charAt(0) >= 'a' && user.charAt(0) <= 'z')
			{
				System.out.println(user);
				System.out.println(domain);	
				if( domain.contains("..") || domain.startsWith(".") || domain.endsWith(".")) 
					flag=false;
				
				 if((domain.endsWith(".com")&& domain.endsWith(".in") && domain!=null))
					
						//System.out.println("Valid email id");
						flag=true;
				
				else {
					//System.out.println("Invalid email id");
					flag=false;
				}
			}
			
			else
			{
				//System.out.println("Invalid email id");
				flag=false;
				
			}
			/*System.out.println("----------------------");
			for(int i=0;i<s2.length;i++) {
				System.out.println(s2[i]);
			}*/
		}
			else {
				//System.out.println("Invalid email id");
				flag=false;
			}
			if(flag==true) System.out.println("valid");
			else System.out.println("Invalid email id");
			
	}

}
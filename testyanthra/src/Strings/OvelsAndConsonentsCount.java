package Strings;

import java.util.Scanner;

public class OvelsAndConsonentsCount {

	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter String");
			String s=sc.next();
						
			int count1= 0;
			int count2= 0;
	        for(int i = 0; i < s.length(); i++) {
	     	char ch=s.charAt(i);
	     	 if(ch == 'a' || ch == 'e' ||ch == 'i'|| ch == 'o' || ch == 'u' ) 
	                count1++;
	        	 else
					 count2++;
	        }
		  System.out.println("Num of ovels  " + count1);
	      System.out.println("Num of cosonents " + count2);
		}
}



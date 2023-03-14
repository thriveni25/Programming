package Strings;

import java.util.Scanner;

public class MobileNum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String s=sc.next();
		
		if(s.length()<=10) {
			System.out.println(s.substring(0,4).concat("******"));
			//System.out.println(s.substring(0,4)+"******");
			
		}
		else {
			System.out.println("Enter 10 nums only");
		}

	}

}

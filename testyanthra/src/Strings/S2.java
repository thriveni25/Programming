package Strings;

import java.util.Scanner;

public class S2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String s1=sc.next();
		System.out.println(s1.toUpperCase());
		System.out.println("--------------------------");
		
		String s2="java program";
		System.out.println(s2.toUpperCase());
		System.out.println("--------------------------");
		
		System.out.println("Enter String");
		String s3=sc.next();
		System.out.println(s3.toLowerCase());
		System.out.println("--------------------------");
		
		String s4="TEST YANTRA";
		System.out.println(s4.toLowerCase());
		System.out.println("--------------------------");
		
		System.out.println("Enter String");
		String s5=sc.next();
		System.out.println(s5.indexOf('u'));
		System.out.println("--------------------------");
		
		String s6="TEST YANTRA";
		System.out.println(s6.indexOf('Y'));
		System.out.println("--------------------------");
		
		System.out.println("Enter String");
		String s7=sc.next();
		System.out.println(s7.length());
		System.out.println("--------------------------");
		
		String s8="Programs";
		System.out.println(s8.length());
		System.out.println("--------------------------");
		
		System.out.println("Enter String");
		String s9=sc.next();
		System.out.println(s9.substring(2));
		System.out.println("--------------------------");
		
		String s10="YANTRA";
		System.out.println(s10.substring(1));
		System.out.println("--------------------------");
		
		System.out.println("Enter String 1");
		String s11=sc.next();
		System.out.println("Enter String 2");
		String s12=sc.next();
		System.out.println(s11.compareTo(s12));
		System.out.println("--------------------------");
		
		System.out.println("Enter String 1");
		String s13=sc.next();
		System.out.println("Enter String 2");
		String s14=sc.next();
		System.out.println(s13.compareToIgnoreCase(s14));
		System.out.println("--------------------------");
		
		System.out.println("Enter String 1");
		String s15=sc.next();
		System.out.println("Enter String 2");
		String s16=sc.next();
		System.out.println(s15.concat(s16));
		System.out.println("--------------------------");
		
		String s17="Bangalore";
		System.out.println(s17.contains("gal"));
		System.out.println("--------------------------");
		
		String s18="Java Programs";
		System.out.println(s18.endsWith("Programs"));
		System.out.println("--------------------------");
		
		System.out.println("Enter String 1");
		String s19=sc.next();
		System.out.println("Enter String 2");
		String s20=sc.next();
		System.out.println(s19.equals(s20));
		System.out.println("--------------------------");
		
		String s21="Harison";
		System.out.println(s21.isEmpty());
		
	}

}

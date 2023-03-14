package Recurssion;

import java.util.Scanner;

public class HappyBirthday {
	public static void print (int n1){
		
	
		if(n1<1) {
			return;
		}
		else {
			System.out.println("Happy Birthday");
		   print(n1-1);
		}
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter num:");
		int n=s.nextInt();
		print(n);
	}

}

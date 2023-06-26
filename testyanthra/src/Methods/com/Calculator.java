package Methods.com;

import java.util.Scanner;

public class Calculator {
	static void add() {
		int a=10;
		int b=12;
		int c=a+b;
		System.out.println("ADDITION :"+c);
	}
	static void sub() {
		int a=10;
		int b=12;
		int c=a-b;
		System.out.println("SUB :"+c);
	}
	static void pro() {
		int a=10;
		int b=12;
		int c=a*b;
		System.out.println("PRODUCT :"+c);
	}
	static void div() {
		int a=10;
		int b=12;
		int c=a/b;
		System.out.println("DIVISION :"+c);
	}
	static void reminder() {
		int a=10;
		int b=12;
		int c=a%b;
		System.out.println("REMINDER :"+c);
	}
	static void discount() {
		int a=1000;
		int b=10;
		int c=(a*b)/100;
		int d=a-c;
		System.out.println("DISCOUNT :"+d);
	}

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter num: ");
		int n=scn.nextInt();
		switch(n) {
		case 1:{
			add();
			break;
		}
		case 2:{
			sub();
			break;
		}
		case 3:{
			div();
			break;
		}
		case 4:{
			reminder();
			break;
		}
		case 5:{
			discount();
			break;
		}
		default:
			System.out.println("Invalid Number");
		}

	}

}

package NumberProgramms;

import java.util.Scanner;

public class Tables11to20 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter start range:");
		int a=scn.nextInt();
		
		System.out.println("Enter end range:");
		int b=scn.nextInt();
		
		for(int i=a;i<=b;i++) {
		for(int j=1;j<=10;j++) {
			System.out.println(i+"*"+j+"="+i*j);
		}
		System.out.println("___________________");
		}
	}}



package NumberProgramms;

import java.util.Scanner;

public class SunnyNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter num: ");
		int n=sc.nextInt();
		int n1=n+1;
		
		boolean flag=false;
		int prod=1;
		for(int i=1;i<=n1/2;i++) {
			prod=i*i;
			if(prod==n1) {
				flag=true;
				break;
			}
			
		}
		if(flag==true) {
			System.out.println("Sunny number");
		}
		else
		{
		System.out.println("Not sunny number");	
		}
		

	}

}

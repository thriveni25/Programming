package NumberProgramms;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter num: ");
		int n=sc.nextInt();
		int a=0,b=1,c;
		for(int i=1;i<=n;i++) {
			
			//if(i==n) {
			System.out.print(a+" ");
			//}
			c=a+b;
			a=b;
			b=c;
			
		}

	}

}

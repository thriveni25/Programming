package testyanthra;

import java.util.Scanner;

public class TechNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter num: ");
		int n=sc.nextInt();
		int count=0;
		int num=n;
		while(n>0) {
			n/=10;
			count++;
		}
		
		if(count%2==0) {
			int div=count/2;
			int d1=num%(int)Math.pow(10, div);
			int d2=num/(int)Math.pow(10, div);
			
			int sum=d1+d2;
			int sqr1=sum*sum;
			if(sqr1==num) {
				System.out.println("Tech num");
			}
			else {
			System.out.println("Not Tech...");
			}
			
		}
		else {
			System.out.println("Not Tech num");
		}

	}

}

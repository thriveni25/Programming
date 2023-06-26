package NumberProgramms;

import java.util.Scanner;

public class Disarium_Number {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a number...");
		int n=scn.nextInt();
		
		boolean check=isDisariumNumber(n);
		if(check)
			System.out.println("Disarium Number");
		else
			System.out.println("Not Disarium Number");
		
	}
	static boolean isDisariumNumber(int num) {
		int temp=num;
//		int m=0;
//		while(num>0) {
//			m=m*10+(num%10);
//			num=num/10;
//		}
//		int pow=1;
//		int sum=0;
//		while(m>0) {
//			int d=m%10;
//			int res=1;
//			for(int i=1;i<=pow;i++) {
//				 res*=d;
//			}
//			pow++;
//			sum+=res;
//			m=m/10;
//		}
		int count=0;
		while(num>0) {
			num/=10;
			count++;
		}
		num=temp;
		int sum=0;
		while(num>0) {
			int d=num%10;
			int res=1;
			for(int i=1;i<=count;i++) {
				res*=d;
			}
			sum+=res;
			count--;
			num/=10;
		}
		
		return sum==temp;
	}
}

  package NumberProgramms;

import java.util.Scanner;

public class XylemOrPhloem {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter num: ");
		int n=sc.nextInt();
		int sumfl=n%10;
		n/=10;
		int rest=0;
		while(n>9) {
			rest+=n%10;
			n/=10;
		}
		sumfl+=n;
		//System.out.println(sumfl);
		//System.out.println(rest);
		
		if(sumfl==rest) {
			System.out.println("Xylem number");
		}
		else System.out.println("Phloem number");

	}

}

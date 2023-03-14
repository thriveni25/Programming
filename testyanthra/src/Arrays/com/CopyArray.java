package Arrays.com;

import java.util.Scanner;

public class CopyArray {

	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
		int []a=new int [5];
		int []b=a;
		System.out.println("enter the elements");

		for(int i=0;i<b.length;i++)
		 {
			 a[i]=Sc.nextInt();
		 }
		for(int i=0;i<b.length;i++)
		{	
			
			System.out.println(b[i]);
		}

	}

}

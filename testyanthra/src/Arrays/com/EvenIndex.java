package Arrays.com;

import java.util.Scanner;

public class EvenIndex {

	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
		int []a=new int [5];
		System.out.println("enter the elements");

		for(int i=0;i<a.length;i++)
		 {
			 a[i]=Sc.nextInt();
		 }
		for(int i=0;i<a.length;i++)
		{	
			if(i%2==0)
			System.out.println(a[i]);
		}
		
	}

}

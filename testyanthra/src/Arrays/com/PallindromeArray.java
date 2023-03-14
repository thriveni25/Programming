package Arrays.com;

import java.util.Scanner;

public class PallindromeArray {

	public static void main(String[] args) {
		
			Scanner Sc=new Scanner(System.in);
			int []a=new int [3];
			System.out.println("enter the elements");

			for(int i=0;i<a.length;i++)
			 {
				 a[i]=Sc.nextInt();
			 }
			for(int i=0;i<a.length;i++)
			 {
			  int n=a[i];
			  int temp=n;
			  int m=0;
			  while(n>0) {
				  m=(m*10)+(n%10);
				  n/=10;
			   }
				if(temp==m) System.out.println(m+" Palindrome");
				else System.out.println(m+" Not Palindrome");
			}
			 


	}

}

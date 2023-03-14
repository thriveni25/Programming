package Arrays.com;


import java.util.Scanner;

public class LinearSearch {  
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=scn.nextInt();
		int[] a= {10,20,30,40,50};
		boolean flag=true;
		for(int i=0;i<=a.length-1;i++)
		{
			if(a[i]==n)
			{
				System.out.println(n+" It is matched in array");
				flag=false;
				break;
			}		     	
		}
		if(flag==true) {
			System.out.println(n+"It is not matched in array");
		}
	}
}
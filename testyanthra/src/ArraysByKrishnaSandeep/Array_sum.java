package ArraysByKrishnaSandeep;

import java.util.Scanner;

public class Array_sum 
{
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the size");
	int n=sc.nextInt();
	int []a=new int [n];
	int sum=0;
	System.out.println("enter the elements");
	for(int i=0;i<a.length;i++)
	{
	a[i]=sc.nextInt();
	}
	for(int i:a)
	{
		sum=sum+i;
	}
	System.out.println(sum);
	
}
}

package ArraysByKrishnaSandeep;

import java.util.Scanner;

public class Array_bytaking_console 
{
public static void main(String[] args) 
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the size");
	int size=sc.nextInt();
	int []a=new int[size];
	for(int i=0;i<size;i++)
	{
		System.out.println("enter the elements");
		a[i]=sc.nextInt();
	}
	for(int i=0;i<a.length;i++)
	{
		System.out.println(a[i]);
	}
}
}

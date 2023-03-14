package Arrays.com;

import java.util.Scanner;

public class IdentityArray {

	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
		int []a=new int [3];
		System.out.println("enter the elements");

		for(int i=0;i<a.length;i++)
		 {
			 a[i]=Sc.nextInt();
		 }
		int []b=new int [3];
		System.out.println("enter the elements");

		for(int i=0;i<b.length;i++)
		 {
			 b[i]=Sc.nextInt();
		 } 
		       
		boolean flag = true; 
		  
		   if (a.length == b.length) { 
		            for (int i = 0; i < a.length; i++) { 
		  
		                if (a[i] != b[i]) { 
		                    flag = false; 
		                    break; 
		                } 
		            } 
		        } 
		       
		  
		        if (flag==false) 
		            System.out.println("Two arrays are not identical"); 
		        else
		            System.out.println("Two arrays are identical"); 
		    } 
		
	}



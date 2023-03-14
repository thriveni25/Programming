package Array2D;

import java.util.Scanner;

public class Multiplication {

	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
		int [][]a=new int [3][3];
		System.out.println("enter the row&col 1st matrix");

		for(int i=0;i<a.length;i++)
		 {
			for(int j=0;j<a.length ;j++) {
			 a[i][j]=Sc.nextInt();
		      }
		 }
		int [][]b=new int [3][3];
		System.out.println("enter the row&col 2st matrix");

		for(int i=0;i<b.length;i++)
		 {
			for(int j=0;j<b.length ;j++) {
			 b[i][j]=Sc.nextInt();
		     }
		 }
		  int[][] mul=new int[3][3];
	       for(int i=0;i<mul.length;i++)
	       {
	    	   for(int j=0;j<mul.length;j++)
	    	   {
	    		   mul[i][j]=a[i][j]*b[i][j];
	    		   System.out.print(mul[i][j]+" ");
	    	   }
	    	  System.out.println();
	       }
	}
}




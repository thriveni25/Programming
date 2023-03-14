package Array2D;

import java.util.Scanner;

public class UpperTriangleMatrix {

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
		/* for(int i=0;i<a.length;i++) {
	        	
				for(int j=0;j<a[i].length ;j++) {
					
				
					System.out.print(a[i][j]+" ");
				}
				System.out.println();
		}*/
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				if(i>j)
				{
					System.out.print("0"+" ");
				}
				else
				{
					System.out.print(a[i][j]+" ");
				}
			}
			System.out.println();
		}


	}
}

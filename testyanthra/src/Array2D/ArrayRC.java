package Array2D;

import java.util.Scanner;

public class ArrayRC {

	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
		System.out.println("enter no. of rows");
		int row=Sc.nextInt();
		System.out.println("enter no. of cols");
		int col=Sc.nextInt();
		int a[] []=new int [row][col];

		
		for(int i=0;i<row;i++) {
			System.out.println("Enter data for row num "+(i+1));
			
			for(int j=0;j<col;j++) {
				
				a[i][j]=Sc.nextInt();
				
			}
		}
		for(int i=0;i<a.length;i++) {
			
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j]+" ");
				
			}
			System.out.println();
	}

	}
}

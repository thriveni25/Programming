package Array2D;

import java.util.Scanner;

public class Even_0dd {

	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
		System.out.println("enter size of row");
		int row=Sc.nextInt();
		System.out.println("enter size of col");
		int col=Sc.nextInt();
		int [][]a=new int [row][col];
		System.out.println("enter");

		for(int i=0;i<row;i++)
		 {
			for(int j=0;j<col ;j++) {
			 a[i][j]=Sc.nextInt();
		 }
		 }
		int evencount=0;
		int oddcount=0;
		for(int i=0;i<a.length;i++)
		 {
			for(int j=0;j<a[i].length ;j++) {
		       if(a[i][j]%2==0) evencount++;
		       else oddcount++;
			}
			
		 }
		System.out.println("odd count"+oddcount);
		System.out.println("even count"+evencount);

	}

}

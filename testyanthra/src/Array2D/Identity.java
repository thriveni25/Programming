package Array2D;

import java.util.Scanner;

public class Identity {

	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
		int [][]a=new int [3][3];
		System.out.println("enter the row&col 1st matrix");

		for(int i=0;i<a.length;i++)
		 {
			for(int j=0;j<a.length ;j++) {
			 a[i][j]=Sc.nextInt();
		      }		 }
		boolean flag = true;
        for (int i = 0; i < a.length; i++) { 
            for (int j = 0; j < a[i].length; j++) {
                if (i == j && a[i][j] == 1) { 
                    flag = true;
                   
                }
                else if(a[i][j] != 0)
                {
                	flag=false;
                	break;
                }
            }
        }
        if (flag==true)
            System.out.println("Given matrix is an identity matrix");
        else
            System.out.println("Given matrix is NOT an identity matrix");
    }
}

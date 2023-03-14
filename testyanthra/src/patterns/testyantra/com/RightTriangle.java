package patterns.testyantra.com;

import java.util.Scanner;

public class RightTriangle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter num: ");
		int n=sc.nextInt();
		for(int i=1;i<=2*n-1;i++) 
		{
			int cond=(i<=n)?i:2*n-i;
           for(int j=1;j<=cond;j++)
           {
        	  System.out.print("*");
				}
        	   
                 System.out.println();
			}
			
		}

	}



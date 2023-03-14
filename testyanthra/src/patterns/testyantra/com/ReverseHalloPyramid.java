package patterns.testyantra.com;
import java.util.Scanner;  
public class ReverseHalloPyramid  
{  
public static void main(String[] args)  
{  
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter num: ");
	int n=sc.nextInt();
         
          for (int i=n; i>=1 ; i--)  
          {  
              for (int j = i; j<n ; j++)   
                {  
                System.out.print(" ");  
                }     
               for (int k = 1; k <= (2*i -1) ;k++)   
               {  
               if( k==1 || i == n || k==(2*i-1))   
                  {  
               System.out.print("*");  
                  }  
               else   
               {  
               System.out.print(" ");  
                 }  
               }  
             System.out.println();  
                }  
            }  
           }
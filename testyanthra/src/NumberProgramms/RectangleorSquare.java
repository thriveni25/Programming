package NumberProgramms;

import java.util.Scanner;

public class RectangleorSquare
{
   public static void main(String args[])
   {
      System.out.println("Enter the Length of Rectangle:");
      Scanner sc = new Scanner(System.in);
      int  length = sc.nextInt();
	   
      System.out.println("Enter the Breadth of Rectangle:");
      int  breadth = sc.nextInt();
	   
      if(length == breadth)
      {
         System.out.println("The Rectangle is a Square ");
      }
      else
      {
         System.out.println("The Rectangle is not a Square ");
      }
   }
}
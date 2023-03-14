package patterns.testyantra.com;

import java.util.Scanner;
public class NamePattern
{
    public static void main(String[] args)
    {
      int row;
      // create scanner class to take user input
      Scanner sc= new Scanner(System.in);
      System.out.print("Enter num = ");
      row=sc.nextInt();
      int c, r;
      int x = 1;
      // store row*2-1 value in y
      int y = row * 2 - 1;
        
      // loop to iterate through rows
      for (r = 1; r <= row; r++)
      {
        // iterate inner loop from 1 till row*2
        for (c = 1; c <= row * 2; c++)
        {
          // if c= x or y print the symbol, else space 
          if (c == x || c == y)
          {
            System.out.print("*");
          }
          else
          {
            System.out.print(" ");
          }
        }
        // increment x
        x++;
        // decrement y
        y--;
        System.out.println("");
      }        
    }
}
package leetcode.testyantra.com;

import java.util.Arrays;
import java.util.Scanner;

public class Demo2 {
   public static int[] remove(int n[],int num) {
	Arrays.sort(n);
    int[] s=new int[n.length];
    int count=0;
   for(int i=0;i<n.length;i++) {
 	  
 	  for(int j=i+1;j<n.length;j++)
 	  {
 		  if(n[i]==n[j] && n[j]!=-1)
 		  {
 			  n[j]=-1;
 			  count++;
 		  }
 	   }
   }
   int [] b = new int[n.length-count];
   int temp=0;
   for(int k=0;k<n.length;k++)
   {
 	  if(n[k]!=-1)
 	  {
 		 b[temp++]=n[k]; 
 	  }
   }
   
   for(int f=0;f<b.length;f++)
   {
	   if(f<num)
	   {
		   s[f]=b[f];
	   }
	   else
	   {
		   s[f]=0;
	   }
   }
   
   return s;
  }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     System.out.println("enter the size");
     int size=sc.nextInt();
     System.out.println("enter the ele");
     int[] ss=new int[size];
     for(int i=0;i<size;i++)
     {
    	 ss[i]=sc.nextInt();
    	 
     }
     System.out.println("enter ind");
     int c=sc.nextInt();
     int[]  m=remove(ss,c);
     for(int i=0;i<m.length;i++)
     {
    	 System.out.println(m[i]);
     }
     
	}

}

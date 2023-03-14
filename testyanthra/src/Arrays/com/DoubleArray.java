package Arrays.com;
import java.util.Scanner;
public class DoubleArray 
{
public static void main(String[] args)
{
	Scanner Sc=new Scanner(System.in);
	double []d=new double [5];
	System.out.println("enter the elements");

	for(int i=0;i<d.length;i++)
	 {
		 d[i]=Sc.nextDouble();
	 }
	for(int i=0;i<d.length;i++)
	{	
		System.out.println(d[i]);
	}
}
}
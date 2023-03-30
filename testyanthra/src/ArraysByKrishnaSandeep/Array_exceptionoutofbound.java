package ArraysByKrishnaSandeep;

public class Array_exceptionoutofbound 
{
public static void main(String[] args) 
{
	int a[]= {2,4,6,8,10,12};
	
	System.out.println(a[0]);
	System.out.println(a[1]);
	System.out.println(a[2]);
	System.out.println(a[3]);
	System.out.println(a[5]);
//	System.out.println(a[6]);
	
//	System.out.println(a[-1]);
	for(int i=0;i<=a.length-1;i++)
	{
		System.out.println(a[i]);
	}
	
}
}

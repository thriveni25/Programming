package ArraysByKrishnaSandeep;

public class Negative_start_positive_end
{
public static void main(String[] args)
{
	int []a= {2,3,4,-2,-4,6,-8};
	int[]a1=new int[a.length];
	rearrange(a,a1);
	print(a,a1);
	
}

private static void print(int[] a, int[] a1)
{
	for(int i:a1)
	{
		System.out.print(i);
		System.out.print(" ");
		
	}
	
}

private static void rearrange(int[] a, int[] a1)
{
	int j=0;
	for(int i=0;i<a.length;i++)
	{
		if(a[i]<0)
		{
			a1[j]=a[i];
			j++;
		}
	}
	
	for(int i=0;i<a.length;i++)
	{
		if(a[i]>0)
		{
			a1[j]=a[i];
			j++;
		}
	}
	
}
}

package ArraysByKrishnaSandeep;

public class next_greatest_element 
{
public static void main(String[] args)
{
	int []a= {11,21,13,14};
	printgreatsetelement(a);
}

private static void printgreatsetelement(int[] a) 
{
	
	int next,i,j;
	for( i=0;i<a.length;i++)
	{
		next=-1;
		for(j=i+1;j<a.length;j++)
			
		{
			if(a[i]<a[j])
			{
				next=a[j];
				break;
			}
		}
	System.out.println(a[i]+","+next);
	}
	
}
}

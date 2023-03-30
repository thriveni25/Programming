package ArraysByKrishnaSandeep;

public class copy_arrays 
{
	public static void main(String[] args)
	{
		int []a= {1,2,3,4,5};
		int [] a1=new int[a.length];
		for(int i=0;i<a.length;i++)
		{
			a1[i]=a[i];
			
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a1[i]);
		}
	}

}

package ArraysByKrishnaSandeep;

public class leftrotation
{
public static void main(String[] args)
{
	int []a= {1,2,3,4,5};
	int x=0;
	int n=2;
	int []a1=new int[a.length];
	for(int i=2;i<a.length;i++)
	{
		a1[x]=a[i];
	x++;
	}
	
	for(int i=0;i<n;i++)	
	{
		a1[x]=a[i];
		x++;
		
	}
	
}
}

package ArraysByKrishnaSandeep;

public class Array_first_duplicate
{
public static void main(String[] args) 
{
	int []x= {1,2,3,4,5,1,5,7,8,6,8};
	for(int i=0;i<x.length;i++)
	{
		for(int j=i+1;j<x.length;j++)
		{
			if(x[i]==x[j])
			{
				System.out.println(x[i]);
			}
		}
	}
}
}

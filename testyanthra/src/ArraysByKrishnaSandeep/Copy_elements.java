 package ArraysByKrishnaSandeep;

import java.util.Arrays;

public class Copy_elements
{
public static void main(String[] args) 
{
	int []a= {1,2,3,4};
	int []a1=Arrays.copyOf(a,a.length);
	for(int i=0;i<a1.length;i++)
	{
		System.out.println(a1[i]);
	}
	
}
}

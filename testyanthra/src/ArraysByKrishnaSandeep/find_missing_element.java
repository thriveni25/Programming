package ArraysByKrishnaSandeep;

import java.util.Arrays;

public class find_missing_element 
{
	public static void main(String[] args) 
	{
		int []a= {1,2,3,5};
	
		int missingNumber=getMissingNumber(a,5);
		System.out.printf("Missing Numberin Arrays %s %d %n",Arrays.toString(a),missingNumber);
		
	}

	private static int getMissingNumber(int[] a, int  n) 
	{
		int actualsum=0;
		int exceptedsum=(n*(n+1)/2);
		for(int i:a)
		{
		actualsum=actualsum+i;	
		}
		return exceptedsum-actualsum;
	}
	
	

}

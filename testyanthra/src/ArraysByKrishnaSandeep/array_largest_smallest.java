package ArraysByKrishnaSandeep;

public class array_largest_smallest
{
public static void main(String[] args)
{
	int []a=new int[] {2,10,33,88,99,6};
	int largest=Integer.MIN_VALUE;
	int smallest=Integer.MAX_VALUE;
	 
	for(int i:a)
	{
		if(i>largest)
		{
			largest=i;
		}
		
	}
	System.out.println("largest element in array is " + largest);

	for(int i:a)
	{
		if(i<smallest)
		{
			smallest=i;
		}
		
	}
	System.out.println("smallest element in array is " + smallest);

	

}
}

package ArraysByKrishnaSandeep;

import java.util.Arrays;
import java.util.stream.IntStream;

public class delete_element_using_stream
{
	public static void main(String[] args)
	{
		int []n= {1,2,3,4,5,6};
		System.out.println("original arrays="+Arrays.toString(n));
		int index=3;
		
		int [] newArray=IntStream.range(0, n.length).filter( i->i!=index).map(i->n[i]).toArray();
		System.out.println(" NewArray after delection="+Arrays.toString(newArray));
 
	}

}

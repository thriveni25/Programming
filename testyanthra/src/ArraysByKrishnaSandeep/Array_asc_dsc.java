package ArraysByKrishnaSandeep;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

public class Array_asc_dsc
{
	public static void main(String[] args)
	{
		String[]s= {"one","two","three","four"};
		System.out.println("before sorting");
		for(String string:s)
		{
			System.out.println(string);
		}
		
	
		Arrays.sort(s);
	
		System.out.println("after sorting");
		for(String string:s)
		{
			System.out.println(string);
		}
	Arrays.sort(s,Collections.reverseOrder());
	System.out.println("sorting elements in desending order");
	for(String string:s)
	{
		System.out.println(string);
	}
	}

}

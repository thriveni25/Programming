package ArraysByKrishnaSandeep;

import java.util.Arrays;

public class print_elements 
{
public static void main(String[] args)
{
	String[]s= {"sky","moon","sun","star"};
	int []n= {2,4,5};
	int [][] twod=new int[][] {{1,2,3},{4,5,6}};
//	using for loop
	for(int i=0;i<s.length;i++)
	{
		System.out.println(s[i]);
	}
//		using enhanced for loop
	for(String string:s)
	{
		System.out.println(string);
	}
	System.out.println("===========");
	System.out.println(Arrays.asList(s));
	System.out.println(Arrays.asList(n));
	
	System.out.println(Arrays.toString(s));
	System.out.println(Arrays.toString(n));
	System.out.println("==================");
	System.out.println(Arrays.deepToString(s));
	System.out.println(Arrays.deepToString(twod));
}
}

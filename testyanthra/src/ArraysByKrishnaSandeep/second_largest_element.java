package ArraysByKrishnaSandeep;

import java.util.Arrays;

public class second_largest_element 
{
public static void main(String[] args) 
{
	int []a= {1,7,8,6,5};
	Arrays.sort(a);
	System.out.println("second largest element is "+ a[a.length-2]);
}
}

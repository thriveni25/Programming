package ArraysByKrishnaSandeep;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Element_present_intwo_arrays
{
public static void main(String[] args) 
{
	Integer []a1= {1,2,3,4,5};
	Integer []a2= {1,2,6,7,5};
	Integer []a3= {9,5,6,4,5};
	
	HashSet<Integer> h=new  HashSet<>();
	List <Integer> l1=Arrays.asList(a1);
	List <Integer> l2=Arrays.asList(a2);
	List <Integer> l3=Arrays.asList(a3);
	
	h.addAll(l1);
	h.addAll(l2);
	h.addAll(l3);
	
	List<Integer> finalList=new ArrayList<Integer>();
	for(Integer number:h)
		if(l1.contains(number)&& l2.contains(number)||l2.contains(number)&& l3.contains(number)||l3.contains(number)&& l1.contains(number))
	{
		finalList.add(number);
	}
	System.out.println(finalList);
}
}

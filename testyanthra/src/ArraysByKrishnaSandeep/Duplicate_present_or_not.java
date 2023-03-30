package ArraysByKrishnaSandeep;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Duplicate_present_or_not 
{
public static void main(String[] args)
{
	int [] duplicate=new int[] {1,2,3,4};
	   List duplicateList=Arrays.asList(duplicate);
	   Set duplicateSet=new HashSet<>(duplicateList);
	   if(duplicateList.size()!=duplicateSet.size())
	   {
		  System.out.println("duplicate contains"); 
	   }
	   else
	   {
		   System.out.println("duplicate not contains");
	   }
}
}

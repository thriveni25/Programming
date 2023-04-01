package ArraysByKrishnaSandeep;

import java.util.HashSet;
import java.util.Set;

public class Duplicate_element
{
public static void main(String[] args)
{
	String[]duplicates=new String[] {"sql","java","sql","web","sql","sql","sql"};
	
	Set nonDuplicateSet=new HashSet<>();
	Set DuplicateSet=new HashSet<>();
	for(String string:duplicates)
	{
		if(!nonDuplicateSet.contains(string))
		{
			nonDuplicateSet.add(string);
		}
		else
		{
			DuplicateSet.add(string);
		}
	}
	System.out.println(DuplicateSet);
	
}
}

package Collections.com.testyantra;

import java.util.Comparator;

public class SortAccordingToPrice implements Comparator 
{

	@Override
	public int compare(Object o1, Object o2) 
	{
		SortItems s1 =((SortItems)o1);
		SortItems s2 =((SortItems)o2);
		
		return s1.price-s2.price;
		
		
	}

	

}

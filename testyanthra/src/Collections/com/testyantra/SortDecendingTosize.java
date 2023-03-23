package Collections.com.testyantra;

import java.util.Comparator;

public class SortDecendingTosize implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Pizza s1 =((Pizza)o1);
		Pizza s2 =((Pizza)o2);
		
		return s2.size-s1.size;
	}

	
}

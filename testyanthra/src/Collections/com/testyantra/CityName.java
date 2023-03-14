package Collections.com.testyantra;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class CityName {

	public static void main(String[] args) {
		LinkedHashSet lhs=new LinkedHashSet();
		lhs.add("chennai");
		lhs.add("kadapa");
		lhs.add("bng");
		lhs.add("hyd");
		lhs.add("rct");
		
		Iterator itr=lhs.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}

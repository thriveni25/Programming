package Collections.com.testyantra;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetProduct {

	public static void main(String[] args) {
		HashSet hs=new HashSet();
		hs.add(1);
		hs.add(2);
		hs.add(3);
		hs.add(4);
		hs.add(5);
		
		int prod=1;
	
		Iterator itr=hs.iterator();
		while(itr.hasNext()) {
			int n=(int)itr.next();
			prod=prod*n;	
		}
		System.out.println(prod);

	}

}

package Collections.com.testyantra;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class DecendingIterator {

	public static void main(String[] args) {
		LinkedList s=new LinkedList();
		s.add(1);
		s.add(2);
		s.add(3);
		s.add(4);
		s.add(5);

		
		Iterator itr=s.descendingIterator();
		while(itr.hasNext()) {
			System.out.print(itr.next());
		}
		
	}

}

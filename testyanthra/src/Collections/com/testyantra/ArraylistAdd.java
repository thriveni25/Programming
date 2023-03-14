package Collections.com.testyantra;

import java.util.ArrayList;
import java.util.Iterator;

public class ArraylistAdd {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		
		ArrayList al1=new ArrayList();
		al1.add(al);
		
		

		Iterator itr=al1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}


	}

}

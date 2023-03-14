package Collections.com.testyantra;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Set {

	public static void main(String[] args) {
		LinkedHashSet lhs=new LinkedHashSet();

		lhs.add(25);
		lhs.add("venky");
		lhs.add(23);
		lhs.add("veni");
		lhs.add(22);
		lhs.add("thriveni");
		lhs.add(21);
		lhs.add("rami");
		lhs.add(20);
		lhs.add("reddy");
		
		
		
			Iterator itr=lhs.iterator();
			while(itr.hasNext()) {
			int age=(int) itr.next();
			String name=(String) itr.next();
			if(age%2==0) {
				System.out.println(name+" "+age);
			}
			}
		
		
	}

}

package Collections.com.testyantra;

import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.DelayQueue;
import java.util.*;

public class Book implements Comparable {
	int price;
	
	public Book(int price) {
		super();
		this.price = price;
		
	}
	@Override
	public String toString() {
		return "[price=" + price + "]";
	}

	public static void main(String[] args) {
		ArrayList <Book>ts=new ArrayList();
		ts.add(new Book(100));
		ts.add(new Book(10));
		ts.add(new Book(900));
		
		Collections.sort(ts);
		
		for(Object o1 : ts) {
			System.out.println(o1);
		
		}

	}


	@Override
	public int compareTo(Object o2) {
		Book b=(Book)o2;
		
		return  this.price-b.price;
	}
}



	


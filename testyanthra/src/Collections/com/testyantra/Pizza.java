package Collections.com.testyantra;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.Objects;

public class Pizza {
	int size;
	int price;
	
	Pizza(int price,int size){
		this.price=price;
		this.size=size;
	}

	
	
	@Override
	public String toString() {
		return "Pizza [size=" + size + ", price=" + price + "]";
	}
	public static void main(String[] args) 
	{
		
		ArrayList s=new ArrayList();
		s.add(new Pizza(1,200));
		s.add(new Pizza(4,20));
		s.add(new Pizza(92,7390));
		s.add(new Pizza(28,202020));
		s.add(new Pizza(2,290));
		
		Collections.sort(s,new SortDecendingTosize());
		
		
		Iterator itr=s.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}



}

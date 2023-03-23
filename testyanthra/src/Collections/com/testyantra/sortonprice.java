package Collections.com.testyantra;

import java.util.Comparator;

public class sortonprice implements Comparator <Laptop>{

	@Override
	public int compare(Laptop o1, Laptop o2) {
		// TODO Auto-generated method stub
		return o1.price-o2.price;
	}

	
	
}
 class sortonram implements Comparator <Laptop>{

	@Override
	public int compare(Laptop o1, Laptop o2) {
		// TODO Auto-generated method stub
		return o1.ram-o2.ram;
	}
	 
 }
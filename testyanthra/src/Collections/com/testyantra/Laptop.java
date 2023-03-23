package Collections.com.testyantra;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Laptop {
	int price;
	int ram;
	Laptop(int price,int ram){
		this.price=price;
		this.ram=ram;
	}
	
	public static void main(String[] args) {
		ArrayList <Laptop>ai=new ArrayList() ;
		
		ai.add(new Laptop(10000,3));
		ai.add(new Laptop(50000,4));
		ai.add(new Laptop(3000,1));
		ai.add(new Laptop(80000,5));
		ai.add(new Laptop(1000,6));
	
		Collections.sort(ai,new sortonprice());
		Collections.sort(ai,new sortonram());

		for(Laptop l : ai) {
			System.out.println(l);
		
		}
		System.out.println("------------------------");
		
		for(Laptop l1 : ai) {
			System.out.println(l1);
		
		}
		

	}

	@Override
	public String toString() {
		return "Laptop [price=" + price + ", ram=" + ram + "]";
	}

}

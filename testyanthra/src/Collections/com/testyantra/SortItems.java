package Collections.com.testyantra;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

public class SortItems {
	int price;
	String dishes;
	
	SortItems(int price,String dishes){
		this.dishes=dishes;
		this.price=price;
		}
	
	
	@Override
	public String toString() {
		return "[price=" + price + ", dishes=" + dishes + "]";
	}

	public static void main(String[] args) 
	{
		
		SortItems s1=new SortItems(100,"roti");
		SortItems s2=new SortItems(40,"idly");
		SortItems s3=new SortItems(30,"masala dosa");
		SortItems s4=new SortItems(10,"tea");
		SortItems s5=new SortItems(90,"gobi");
		
		SortItems s[] = {s1,s2,s3,s4,s5};
		
		Arrays.sort(s,new SortAccordingToPrice());
		
		
		for(SortItems i : s) {
			System.out.println(i);
		
		}
		
	}

	
	
	
}

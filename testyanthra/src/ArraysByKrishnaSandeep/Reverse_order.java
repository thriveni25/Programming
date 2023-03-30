package ArraysByKrishnaSandeep;

import java.util.ArrayList;
import java.util.Collections;

public class Reverse_order 
{
	public static void main(String[] args) 
	{
		ArrayList l=new ArrayList();
		l.add("hi");
		l.add('d');
		l.add(6);
		l.add(99);
		l.add(99);
		System.out.println("before the reverse"+l);
		Collections.reverse(l);
		System.out.println("after reverse"+l);
	}

}

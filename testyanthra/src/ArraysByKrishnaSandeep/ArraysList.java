package ArraysByKrishnaSandeep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArraysList
{
public static void main(String[] args) 
{
	String [] col= {"red","blue","black","white"};
//	List l=Arrays.asList(col);
//	System.out.println(l);
	List<String>l1=new ArrayList<>();
//	Collections.addAll(l1, col);
//	{
//		System.out.println(l1);
//	}
	for(String s:col)
	{
		l1.add(s);
	}
	System.out.println(l1);
}
}

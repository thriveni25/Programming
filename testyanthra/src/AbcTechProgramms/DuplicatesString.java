package AbcTechProgramms;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicatesString {

	public static void main(String[] args) {
		 String x="sillyspiders";
	     char[] y=x.toCharArray();
	     int size=y.length;
	     Map<Character,Integer>map=new HashMap<>();
	     int i=0;
	     while(i!=size)
	     {
	    	 if(map.containsKey(y[i])==false)
	    	 {
	    		 map.put(y[i],1);
	    	 }
	    	 else
	    	 {
	    		 int oldv=map.get(y[i]);
	    		 int newval=oldv+1;
	    		 map.put(y[i],newval);
	    	 }
	    	 ++i;
	     }
	     Set<Map.Entry<Character,Integer>> hmap=map.entrySet();
	     for(Map.Entry<Character,Integer> data:hmap)
	     {
	    	 if(data.getValue()>1)
	    	 {
	    		 
	    	 System.out.print(data.getKey());
	    	 System.out.println(data.getValue());
	     }
		}

	}
	}



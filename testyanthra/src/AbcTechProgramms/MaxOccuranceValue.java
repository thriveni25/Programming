package AbcTechProgramms;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MaxOccuranceValue {

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
	     char maxkey=' ';
	     int maxvalue=0;
	     for(Map.Entry<Character,Integer> data:hmap)  //DATA TYPE OF MY DATA
	     {
	    	 if(data.getValue()>maxvalue)
	    	 {
	    		 maxvalue=data.getValue();
	    		 maxkey=data.getKey();
	    		 
	     }
		}
	     System.out.print(maxkey);
	     System.out.println(maxvalue);

	}

	}



package AbcTechProgramms;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class AsscingTheMapString {

	private static final String Set = null;

	public static void main(String[] args) {
     String s1="hello";
     char[] s2=s1.toCharArray();
     int size=s2.length;
     Map<Character,Integer> map=new HashMap<>();
     int i=0;
     while(i!=size)
     {
    	 if(map.containsKey(s2[i])==false)
    	 {
    		 map.put(s2[i],1);
    	 }
    	 else
    	 {
    		int oldval=map.get(s2[i]);
    		int newval=oldval+1;
    		map.put(s2[i],newval);
    	 }
    	 ++i;
     }
     Set<Map.Entry<Character,Integer>> hmap=map.entrySet();
     for(Map.Entry<Character,Integer> data:hmap)
     {
    	 System.out.print(data.getKey());
    	 System.out.println(data.getValue());
     }
     
	}

}

package Strings;

import java.util.Arrays;

public class SplitMethod {

	public static void main(String[] args) {
		String s1="hello hi good mrng";
		
		String[] s2=s1.split(" ");
	
		System.out.println(Arrays.toString(s2));
		
	/*	for(String s:s2) {
			System.out.println(s);
		}*/
		
		for(int i=0;i<s2.length;i++) {
			System.out.println(s2[i]);
		}
		

	}

}

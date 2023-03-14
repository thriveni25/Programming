package Strings;

public class ReverseString {

	public static void main(String[] args) {
	
		String s1="zoo";
		String s2="";
		/*for(int i=s1.length()-1;i>=0;i--)
		{  
		s2=s2+s1.charAt(i);  
		
		}  */
	
		for(int i=s1.length()-1;i>=0;i--)
		{  
		s2=s2+(char)(s1.charAt(i)+1);  
		
		}  
		System.out.println(s2);
		
	
}}

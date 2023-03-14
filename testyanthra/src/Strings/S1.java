package Strings;

public class S1 {

	public static void main(String[] args) {
		String s=new String("Good days are coming soon");
		String s2=new String(" Be happy");
		String s3=new String(" be happy");
		
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
		System.out.println("*********************");
	
		System.out.println(s.startsWith("Go"));
		System.out.println(s.endsWith("on"));
		System.out.println("*********************");
		
		System.out.println(s.contains("Go"));
		System.out.println(s.concat(" Be happy"));
		System.out.println("*********************");
		
		System.out.println(s.charAt(1));
		System.out.println(s.indexOf('o'));
		System.out.println("*********************");
		
		System.out.println(s.equals(s2));
		System.out.println(s.equalsIgnoreCase(s3));
		System.out.println("*********************");
		
		System.out.println(s.substring(2));
		System.out.println(s.substring(2,9));
		System.out.println("*********************");
		
	}

}

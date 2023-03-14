package Strings;

public class CountElementsInanArray {

	public static void main(String[] args) {
		String s1="hello hi good mrng";
		
		String[] s2=s1.split(" ");
		
		for(int i=0;i<s2.length;i++) {
			System.out.println(s2[i]); 
		}
		System.out.println("Length  = "+s2.length);

	}

}

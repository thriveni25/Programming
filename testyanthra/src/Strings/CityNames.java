package Strings;

public class CityNames {

	public static void main(String[] args) {
		String[] s1={"KADAPA", "chennai", "Pune"};
        
		
		for(int i=0;i<s1.length;i++) {
			String s2=s1[i].substring(0);
			System.out.println(s2);
		}
		

	}

}
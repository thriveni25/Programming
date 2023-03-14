package Strings;

public class SubstringsFrequency {

	public static void main(String[] args) {
		String s1="hello hi good mrng hi";
		
		String[] s2=s1.split(" ");
		int count=1;
		String visited="";
		for(int i=0;i<s2.length;i++) {
			
			for(int j=i+1;j<s2.length;j++) {
			if(s2[i]==s2[j]) {
				count++;
				s2[j]=visited;
			}
			
			
			}
			System.out.println(s2[i]+" "+count);
			
		}
		
		
	}

}

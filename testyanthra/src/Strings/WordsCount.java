package Strings;

public class WordsCount {

	public static void main(String[] args) {
		
			 String s=" hi hello world  ";
			 int count=1;
			 if(s.charAt(0)==' ') count=0;
			 
			 for(int i=0;i<s.length()-1;i++) {
				
				if((s.charAt(i)==' ')&&(s.charAt(i+1)!=' ')){
	        	count++;
	        	  }
				
				}
			 System.out.println("number of words in string:"+count);
			/* String[] s2=s.split(" ");
			 for(int i=0;i<s2.length;i++) {
				 System.out.println(s2[i]); 
			 }
			 System.out.println(s2.length);*/
	}

}

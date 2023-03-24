package AbcTechProgramms;

public class LengthOfString {

	public static void main(String[] args) {
     String s="Venkata Hemanth";
     s=s.concat("\0");
     char[] ch=s.toCharArray();
     
     int count=0;
     int i=0;
     while(ch[i]!='\0')
    	 
     {
    	 ++count;
    	 ++i;
     }
     System.out.println(count);
	}

}

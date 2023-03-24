package AbcTechProgramms;

public class StringIntegerOrNot {

	public static void main(String[] args) {
     String s1="9676224781";
     int size=s1.length();
     int i=0;
     while(i!=size)
     {
    	 if(s1.charAt(i)>='0' && s1.charAt(i)<='9')
    	 {
    		 ++i;
    	 }
    	 else
    	 {
    		 System.out.println("Not Integer String");
    		 System.exit(0);
    	 }
     }
     System.out.println("Integer String");
	}

}

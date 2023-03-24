package AbcTechProgramms;

public class ConvertLowerCase {

	public static void main(String[] args) {
         String s="BANGALORE";
         char[] s1=s.toCharArray();
         int size=s1.length;
         int i=0;
         while(i!=size)
         {
        	 s1[i]=(char)(s1[i]+32);
        	 ++i;
         }
         System.out.println(s);
         System.out.println(s1);//convert to lower case
	}

}

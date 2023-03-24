package AbcTechProgramms;

public class CovertUpperOrLowerWithSpaces {

	public static void main(String[] args) {
    String s="bangalore is very big city";
    char[] s1=s.toCharArray();
    int size=s1.length;
    int i=0;
    while(i!=size)
    {
    	if(s1[i]!=' ')
    	{
    		s1[i]=(char)(s1[i]-32);
    		
    	}
    	++i;
    }
    System.out.println(s);
    System.out.println(s1);
    
    		
	}

}

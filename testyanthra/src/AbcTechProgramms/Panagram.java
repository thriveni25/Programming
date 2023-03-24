package AbcTechProgramms;

public class Panagram {

	public static void main(String[] args) {
    String s="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    s=s.replace(" ","");
    char[] s1=s.toCharArray();
    int size=s1.length;
    int[] a= {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
    int i=0;
    while(i!=size)
    {
    	int index=s1[i]-65;
    	a[index]=1;
    	++i;
    	
    }
    i=0;
    while(i!=26)
    {
    	if(a[i]==1)
    	{
    		++i;
    	}
    	else
    	{
    		System.out.println("Not Panagram");
    		System.exit(0);
    		
    	}
    }
    System.out.println("Pangram");
	}

}

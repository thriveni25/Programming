package AbcTechProgramms;

public class DeleteOccurance {

	public static void main(String[] args) {
      String s1="sillyspiders";
      char[] s2=s1.toCharArray();
      int size=s2.length;
      char key='s';
      
      int i=0;
      String res="";
      while(i!=size)
      {
    	  if(s2[i]!=key)
    	  {
    		  res=res+s2[i];
    	  }
    	  ++i;
      }
      System.out.println(res);
	}

}
